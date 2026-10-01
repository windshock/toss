#!/usr/bin/env python3
"""Loader-event interception: capture Toss libea56+0x13a4bc guard state on Redroid
synchronously (no /proc polling), before the process self-destructs.

ASLR is off in the guest => app (zygote) linker VA is deterministic:
  linker64 base (app_process64) = 0xebc8ffebf000
  rtld_db_dlactivity                 @ +0x4d6a8   (solib notification / r_brk)
  __dl__r_debug                      @ +0x180bd8  (global r_debug)
  notify_gdb_of_load(soinfo*) wrapper @ +0x68bb4   (x0 = soinfo*)

Flow: HW-bp the linker-internal notify_gdb_of_load(soinfo*) wrapper, read the
soinfo name/load_bias directly, then anchor = load_bias+0x13a4bc (R-E PT_LOAD
p_vaddr==p_offset) -> remove notify bp, HW-bp the anchor (no code mutation) ->
capture at guard hit.

Why not rtld_db_dlactivity/_r_debug? 2026-09-28 H2 check saw Toss/bugsnag
link_map entries 396 times but never libea56, so isolated-ns libea56 does not
surface in the global _r_debug list. The wrapper entry still sees the soinfo*
before the wrapper filters/links it.

SAFETY: a SIGTERM/exception ALWAYS detaches (else the guest freezes). No RASP bypass.
"""
import sys, time, subprocess, struct, json, signal
sys.path.insert(0, "/Users/1004276/Downloads/toss/toss-rasp/analysis-lab/scripts")
from hvf_hwbreak_toy import RSP

BASE = 0xebc8ffebf000
NOTIFY = BASE + 0x4d6a8
RDEBUG = BASE + 0x180bd8
SOINFO_NOTIFY = BASE + 0x68bb4
ANCHOR_OFF = 0x13a4bc
DEV = "localhost:5555"
ART = "/Users/1004276/Downloads/toss/toss-rasp/analysis-lab/artifacts/android/toss_anchor_capture.json"


def adb(*a):
    return subprocess.run(["adb", "-s", DEV] + list(a), capture_output=True, text=True)


def main():
    # Launch Toss FIRST (guest must be running; connecting the gdbstub stops the VM,
    # which would freeze adb). Toss self-destructs+restarts in a loop, reloading
    # libea56 each incarnation, so the notification bp still catches a load.
    print("starting in-guest Toss relaunch loop (before gdbstub connect)...", flush=True)
    adb("shell", "am force-stop viva.republica.toss")
    adb("shell", "nohup sh -c 'for i in $(seq 1 60); do am start -n viva.republica.toss/.splash.SplashActivity; sleep 2; done' >/dev/null 2>&1 &")
    time.sleep(1.5)
    print("connecting gdbstub...", flush=True)
    r = RSP(1234)
    print("connected", flush=True)
    st = {"anchor": None}

    def cleanup():
        try:
            r.cmd("z1,%x,4" % NOTIFY)
            r.cmd("z1,%x,4" % SOINFO_NOTIFY)
            if st["anchor"]:
                r.cmd("z1,%x,4" % st["anchor"])
            r.cmd("D"); r.close()
        except Exception:
            pass

    def on_sig(*a):
        cleanup(); print("SIGNAL -> detached", flush=True); sys.exit(1)
    signal.signal(signal.SIGTERM, on_sig)
    signal.signal(signal.SIGINT, on_sig)

    def m(va, n): return r.cmd("m%x,%x" % (va, n))
    def u64(va):
        s = m(va, 8)
        try: return int.from_bytes(bytes.fromhex(s[:16]), "little") if len(s) >= 16 else None
        except Exception: return None
    def u32(va):
        s = m(va, 4)
        try: return int.from_bytes(bytes.fromhex(s[:8]), "little") if len(s) >= 8 else None
        except Exception: return None
    def cstr(va, n=160):
        if not va:
            return ""
        s = m(va, n)
        try:
            b = bytes.fromhex(s); z = b.find(0)
            return b[:z if z >= 0 else len(b)].decode("latin1", "replace")
        except Exception: return ""
    def libcxx_string(va):
        # Android linker64 in this image uses libc++'s compact string layout:
        # short string if bit0 clear, chars at +1; long string if bit0 set,
        # heap pointer at +0x10. This matches linker64+0x68bb4.
        tag = u32(va)
        if tag is None:
            return ""
        if tag & 1:
            return cstr(u64(va + 0x10) or 0)
        return cstr(va + 1)
    def soinfo_names(si):
        names = []
        rp = libcxx_string(si + 0x1a0)
        if rp:
            names.append(rp)
        lm_name = cstr(u64(si + 0xd8) or 0)
        if lm_name and lm_name not in names:
            names.append(lm_name)
        return names
    def gregs():
        gg = r.cmd("g")
        if len(gg) < 528: return {}
        def q(i): return int.from_bytes(bytes.fromhex(gg[i*16:i*16+16]), "little")
        return {"x0": q(0), "x1": q(1), "x2": q(2), "x19": q(19), "sp": q(31), "pc": q(32)}
    def cont(t=20): return r.cmd("c", t)
    def stepover(bp): r.cmd("z1,%x,4" % bp); r.cmd("s", 4); r.cmd("Z1,%x,4" % bp)

    out = {}
    try:
        r.interrupt()
        print("armed soinfo notification bp @ %#x; scanning..." % SOINFO_NOTIFY, flush=True)
        r.cmd("Z1,%x,4" % SOINFO_NOTIFY)
        hit = cont(20)
        found = None; events = 0; toss_evts = 0; deadline = time.time() + 150
        interesting = []
        while hit and hit.startswith("T") and time.time() < deadline:
            events += 1
            gr = gregs()
            si = gr.get("x0", 0)
            names = soinfo_names(si) if si else []
            joined = " | ".join(names)
            bias = u64(si + 0x100) if si else None
            flags = u32(si + 0x30) if si else None
            if ("toss" in joined) or ("bugsnag" in joined):
                toss_evts += 1
                if len(interesting) < 25:
                    interesting.append({"event": events, "soinfo": hex(si),
                                        "flags": hex(flags or 0),
                                        "bias": hex(bias or 0), "name": joined})
            if "ea56" in joined:
                found = {"soinfo": si, "base": bias, "flags": flags, "name": joined}
                break
            if events % 30 == 0:
                print("  ...%d events (toss-visible events=%d)" % (events, toss_evts), flush=True)
            stepover(SOINFO_NOTIFY); hit = cont(25)
        out["mode"] = "soinfo_notify"
        out["events_scanned"] = events
        out["toss_visible_events"] = toss_evts
        out["interesting_soinfos"] = interesting
        if not found:
            print("libea56 NOT caught via soinfo notify (events=%d)" % events, flush=True)
            out["HIT"] = False; out["reason"] = "libea56 not in soinfo notify scan"
            return
        if not found["base"]:
            print("libea56 seen but load_bias was unreadable/zero", flush=True)
            out.update({"HIT": False, "reason": "libea56 soinfo seen without load_bias",
                        "libea56_soinfo": hex(found["soinfo"]),
                        "libea56_name": found["name"],
                        "libea56_flags": hex(found["flags"] or 0)})
            return
        base = found["base"]; anchor = base + ANCHOR_OFF
        out.update({"libea56_soinfo": hex(found["soinfo"]),
                    "libea56_flags": hex(found["flags"] or 0),
                    "libea56_base": hex(base),
                    "libea56_name": found["name"], "anchor_va": hex(anchor)})
        print("FOUND libea56 soinfo=%#x base=%#x flags=%#x name=%s -> anchor=%#x" %
              (found["soinfo"], base, found["flags"] or 0, found["name"], anchor), flush=True)
        r.cmd("z1,%x,4" % SOINFO_NOTIFY)
        st["anchor"] = anchor
        print("Z1@anchor ->", r.cmd("Z1,%x,4" % anchor), flush=True)
        print("waiting for guard to execute 0x13a4bc ...", flush=True)
        ah = cont(45); out["anchor_stop"] = ah
        if ah and ah.startswith("T"):
            gr = gregs(); bt = m(anchor, 4); x0, sp = gr.get("x0", 0), gr.get("sp", 0)
            mem = m(x0, 8); v4 = v6 = None
            if len(mem) >= 16:
                b = bytes.fromhex(mem); v4 = struct.unpack_from("<H", b, 4)[0]; v6 = struct.unpack_from("<H", b, 6)[0]
            out.update({"HIT": True, "pc": hex(gr.get("pc", 0)), "sp": hex(sp), "x0": hex(x0),
                        "x1": hex(gr.get("x1", 0)), "x2": gr.get("x2"), "x19": hex(gr.get("x19", 0)),
                        "bytes_at_anchor": bt,
                        "validate": {"pc_is_anchor": gr.get("pc") == anchor, "bytes_blr_x9": bt == "20013fd6",
                                     "x0_eq_sp_plus_0x1a8": x0 == sp + 0x1a8, "x2_eq_4000": gr.get("x2") == 4000,
                                     "ctx_plus4": v4, "ctx_plus6": v6}})
            print(json.dumps(out["validate"], indent=2), flush=True)
            print("pc=%s sp=%s x0=%s x1=%s x2=%s x19=%s bytes=%s" %
                  (out["pc"], out["sp"], out["x0"], out["x1"], out["x2"], out["x19"], bt), flush=True)
        else:
            out["HIT"] = False; print("no anchor hit:", repr(ah)[:40], flush=True)
    finally:
        cleanup()
        try: open(ART, "w").write(json.dumps(out, indent=2))
        except Exception: pass
        print("VERDICT:", "TOSS_ANCHOR_CAPTURED" if out.get("HIT") else "OPEN", flush=True)


if __name__ == "__main__":
    main()
