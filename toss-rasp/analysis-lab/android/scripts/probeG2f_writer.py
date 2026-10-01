#!/usr/bin/env python3
"""§101 probeG2f: writer capture via loop-entry -> return -> late Z2 (no storm).

Established: between afed8 call#46 and afed8(4) the SAME thread drops into a
function at 0xe14e7e365240 (deterministic anon cluster, same across
incarnations; frame sp46-0x3a0) that loops >440k iterations writing 0 to its
local [sp-0x40] == slot A (== sp47-0xd10, the S99 scratch[0]). The value 4
is written by the OUTER frame AFTER the loop function returns (afed8(4)'s sp
is sp46+0x930, i.e. the loop frame is dead by then). Watching A through the
loop starves (G2d/G2e: 116k/440k unchanged traps, no end reached).

Plan (O(1) stops):
  call#46 -> Z1 at LOOP_PC; first hit with sp==sp46-0x3a0 -> grab LR,
             drop LOOP_PC bp, Z1 at LR (the loop fn's return point);
  LR hit   -> loop returned; NOW arm Z2 on slot A = sp46-0x3e0;
  Z2 hits  -> read A; when it becomes 4 -> FULL WRITER CAPTURE
             (pc-4 window, regs, slot window, frame windows, raw stop);
  afed8(4) -> same-run chain confirmation."""
import json, signal, subprocess, sys, time
sys.path.insert(0, "/Users/1004276/Downloads/toss/toss-rasp/analysis-lab/scripts")
from hvf_hwbreak_toy import RSP

ADB = "/Users/1004276/Library/Android/sdk/platform-tools/adb"
DEV = "localhost:5555"
AFED8 = 0xafed8
ARM_AT = 46
LOOP_PC = 0xe14e7e365240          # deterministic (G2d + G2e, 2 incarnations)
LOOP_SP_DELTA = -0x3a0            # loop frame sp - sp46 (stable, 2 runs)
SLOT_A = -0x3e0                   # sp46-relative
ART = "/Users/1004276/Downloads/toss/toss-rasp/analysis-lab/artifacts/android/toss_s101_probeG2f.json"


def adb_sh(cmd, t=15):
    q = cmd.replace("'", "'\\''")
    try:
        return subprocess.run([ADB, "-s", DEV, "shell", "su 0 sh -c '%s'" % q],
                              capture_output=True, text=True, timeout=t).stdout.strip()
    except Exception:
        return ""


def linker_base():
    out = adb_sh("grep -m1 'r--p 00000000.*linker64' /proc/$(pidof com.android.systemui)/maps")
    try:
        return int(out.split("-")[0], 16)
    except Exception:
        return None


def main():
    log = []
    def L(s):
        log.append(s)
        print(s, flush=True)
    out = {"probe": "G2f loop-return-anchored writer capture"}

    LB = None
    for _ in range(6):
        LB = linker_base()
        if LB:
            break
        for c in (["disconnect", DEV], ["connect", DEV]):
            try:
                subprocess.run([ADB] + c, capture_output=True, timeout=8)
            except Exception:
                pass
        time.sleep(2)
    if not LB:
        print("NO LINKER BASE")
        return
    SOINFO = LB + 0x68bb4
    L("linker: %#x" % LB)
    adb_sh("for p in $(ps -A -o PID,ARGS | grep '[s]eq 1' | grep '[v]iva.republica.toss/.splash.SplashActivity' | awk '{print $1}'); do kill $p; done")
    adb_sh("am force-stop viva.republica.toss")
    subprocess.run([ADB, "-s", DEV, "shell",
                    "nohup sh -c 'for i in $(seq 1 300); do am start -n viva.republica.toss/.splash.SplashActivity >/dev/null 2>&1; sleep 2; done' >/dev/null 2>&1 &"],
                   capture_output=True, text=True, timeout=10)
    time.sleep(1.5)

    r = RSP(1234)
    active = set()
    wslot = [None]

    def cleanup():
        try:
            try:
                r.interrupt()
            except Exception:
                pass
            for bp in list(active):
                r.cmd("z1,%x,4" % bp, 2)
            if wslot[0]:
                r.cmd("z2,%x,8" % wslot[0], 2)
            r.cmd("D", 4)
            r.close()
        except Exception:
            pass

    signal.signal(signal.SIGTERM, lambda *a: sys.exit(1))
    signal.signal(signal.SIGINT, lambda *a: sys.exit(1))

    def m(va, n, t=6):
        return r.cmd("m%x,%x" % (va, n), t)

    def u64(va):
        s = m(va, 8)
        try:
            return int.from_bytes(bytes.fromhex(s[:16]), "little") if len(s) >= 16 else None
        except Exception:
            return None

    def cstr(va, n=120):
        if not va:
            return ""
        s = m(va, n)
        try:
            b = bytes.fromhex(s)
            z = b.find(0)
            return b[:z if z >= 0 else len(b)].decode("latin1", "replace")
        except Exception:
            return ""

    def regs():
        g = r.cmd("g", 5)
        if not g or len(g) < 528:
            return {}
        def q(i):
            return int.from_bytes(bytes.fromhex(g[i * 16:i * 16 + 16]), "little")
        d = {("x%d" % i): q(i) for i in range(31)}
        d["sp"] = q(31)
        d["pc"] = q(32)
        return d

    def add(va):
        res = r.cmd("Z1,%x,4" % va, 3)
        if res == "OK":
            active.add(va)
        return res

    def dele(va):
        try:
            r.cmd("z1,%x,4" % va, 3)
        finally:
            active.discard(va)

    try:
        r.interrupt()
        add(SOINFO)
        lib = None
        t0 = time.time()
        while time.time() - t0 < 240 and lib is None:
            s = r.cmd("c", 20)
            if not s or not s.startswith("T"):
                continue
            gr = regs()
            si = gr.get("x0", 0)
            tag = u64(si + 0x1a0)
            nm = ""
            if tag:
                nm = cstr(u64(si + 0x1a0 + 0x10) & 0x00FFFFFFFFFFFFFF) if (tag & 1) else cstr(si + 0x1a1)
            if "ea56" in nm:
                lib = u64(si + 0x100)
            dele(SOINFO)
            r.cmd("s", 3)
            add(SOINFO)
        dele(SOINFO)
        if not lib:
            out["verdict"] = "NO_LIBEA56"
            return
        L("libea56=%#x" % lib)
        ent = lib + AFED8
        L("Z1 afed8 -> %s" % add(ent))

        n_ids = 0
        sp46 = None
        phase = "count"          # count -> loop_wait -> ret_wait -> watching
        loop_lr = None
        false_entries = 0
        ret_hits = 0
        prev = None
        z2_events = []
        writer4 = None
        af4 = None
        timeouts = 0
        t1 = time.time()
        deadline = t1 + 420
        while time.time() < deadline:
            stop = r.cmd("c", 20)
            if not stop or not stop.startswith("T"):
                timeouts += 1
                if timeouts >= 3:
                    break
                continue
            timeouts = 0
            gr = regs()
            pc = gr.get("pc", 0)
            sp = gr.get("sp", 0)
            if pc == ent:
                x0 = gr.get("x0", 0)
                n_ids += 1
                if x0 == 4:
                    af4 = {"t": round(time.time() - t1, 2), "call_no": n_ids,
                           "sp": hex(sp), "lr": hex(gr.get("x30", 0)),
                           "x1": hex(gr.get("x1", 0)), "x2": hex(gr.get("x2", 0)),
                           "phase": phase, "ret_hits": ret_hits}
                    L("*** afed8(4) call#%d sp=%s lr=%s phase=%s writer4=%s ***"
                      % (n_ids, af4["sp"], af4["lr"], phase, bool(writer4)))
                    break
                if phase == "count" and n_ids >= ARM_AT:
                    sp46 = sp
                    out["arm"] = {"at_call": n_ids, "sp46": hex(sp46),
                                  "loop_pc": hex(LOOP_PC)}
                    res = add(LOOP_PC)
                    phase = "loop_wait"
                    L("call#%d sp46=%s -> Z1 loop_pc=%s (%s)" % (n_ids, hex(sp46), hex(LOOP_PC), res))
                dele(ent)
                r.cmd("s", 3)
                add(ent)
                continue
            if phase == "loop_wait" and pc == LOOP_PC:
                if sp == sp46 + LOOP_SP_DELTA:
                    loop_lr = gr.get("x30", 0)
                    dele(LOOP_PC)
                    res = add(loop_lr)
                    phase = "ret_wait"
                    out["loop_entry"] = {"sp": hex(sp), "lr": hex(loop_lr),
                                         "z1_lr": res, "raw_stop": stop[:80]}
                    L("loop entered: sp=%s lr=%s -> Z1 at lr (%s) raw=%s"
                      % (hex(sp), hex(loop_lr), res, stop[:80]))
                else:
                    false_entries += 1
                    out.setdefault("false_entries", []).append(
                        {"sp": hex(sp), "n": false_entries})
                    if false_entries > 60:
                        dele(LOOP_PC)
                        phase = "count"   # give up anchoring; just await afed8(4)
                        L("too many false loop entries - falling back to afed8(4) wait")
                    else:
                        dele(LOOP_PC)
                        r.cmd("s", 3)
                        add(LOOP_PC)
                continue
            if phase == "ret_wait" and pc == loop_lr:
                ret_hits += 1
                if ret_hits == 1:
                    wslot[0] = sp46 + SLOT_A
                    rz = r.cmd("Z2,%x,8" % wslot[0], 3)
                    prev = u64(wslot[0])
                    phase = "watching"
                    out["loop_return"] = {"t": round(time.time() - t1, 2),
                                          "sp": hex(sp), "lr": hex(gr.get("x30", 0)),
                                          "slotA": hex(wslot[0]), "z2": rz,
                                          "snap": hex(prev) if prev is not None else None}
                    L("loop returned (#1): sp=%s -> Z2 slotA=%s (%s) snap=%s"
                      % (hex(sp), hex(wslot[0]), rz, out["loop_return"]["snap"]))
                else:
                    L("loop returned again (#%d) - Z2 already armed" % ret_hits)
                dele(loop_lr)
                r.cmd("s", 3)
                add(loop_lr)
                continue
            if phase == "watching" and wslot[0]:
                vA = u64(wslot[0])
                ev = {"t": round(time.time() - t1, 2), "pc": hex(pc),
                      "lr": hex(gr.get("x30", 0)), "sp": hex(sp),
                      "vA": hex(vA) if vA is not None else None,
                      "prev": hex(prev) if prev is not None else None,
                      "raw_stop": stop[:80]}
                z2_events.append(ev)
                L("Z2#%d pc=%s sp=%s vA=%s (was %s) raw=%s"
                  % (len(z2_events), ev["pc"], ev["sp"], ev["vA"], ev["prev"], ev["raw_stop"]))
                if vA == 4 and prev != 4:
                    writer4 = {"pc": hex(pc), "raw_stop": stop[:80], "slot": hex(wslot[0])}
                    cap = dict(writer4)
                    wpc = pc - 4
                    cap["code_window"] = m(max(0, wpc - 0x80), 0x180)
                    cap["slot_window"] = m(wslot[0] - 0x40, 0x100)
                    cap["loop_entry_code"] = m(LOOP_PC - 0x40, 0x100)
                    for rn in ("x19", "x20", "x21", "x22", "x23", "x24", "x28", "x29"):
                        v = gr.get(rn, 0) & 0x00FFFFFFFFFFFFFF
                        if 0x100000 < v < 0xFFFFFFFFFFFF:
                            cap["win_%s" % rn] = m(v & ~0xF, 0x40)
                    full = {}
                    for i in range(31):
                        full["x%d" % i] = hex(gr.get("x%d" % i, 0))
                    full["sp"] = hex(sp)
                    cap["regs"] = full
                    out["writer_capture"] = cap
                    L("*** WRITER OF 4: pc=%s raw=%s ***" % (writer4["pc"], writer4["raw_stop"]))
                prev = vA if vA is not None else prev
                continue
            L("unexpected stop pc=%s sp=%s lr=%s phase=%s raw=%s"
              % (hex(pc), hex(sp), hex(gr.get("x30", 0)), phase, stop[:80]))
        out.update({"n_ids": n_ids, "phase_end": phase, "false_entries": len(out.get("false_entries", [])),
                    "ret_hits": ret_hits, "z2_events": z2_events,
                    "writer_of_4": writer4, "afed8_4": af4,
                    "verdict": ("WRITER4_CAPTURED" if writer4 else
                                "AFED8_4_ONLY" if af4 else "NO_NATIVE")})
    finally:
        cleanup()
        try:
            open(ART, "w").write(json.dumps(out, indent=2))
        except Exception:
            pass
        open(ART.replace(".json", ".txt"), "w").write("\n".join(log) + "\n")
        print("VERDICT:", out.get("verdict"), flush=True)


if __name__ == "__main__":
    main()
