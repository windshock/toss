#!/usr/bin/env python3
"""§101 probeG2d: DIRECT dual-Z2 writer capture - no bridge bp (anti-starvation).

G2c facts: 46 id0 calls (dominant frame, sp low12 0x7c0) -> afed8(4) at call#47
from a frame 0x930 shallower (sp low12 0x0f0); at that stop the stack holds
4 at sp47-0xd10 and sp47-0x3d8. Relative to stop#46's sp those slots are
  slotA = sp46 - 0x3e0   (= sp47 - 0xd10)
  slotB = sp46 + 0x558   (= sp47 - 0x3d8)
Both are mapped at stop#46 -> arm Z2 on BOTH there, catch the write of 4,
capture the writer (pc-4 window, full regs, frames), then confirm afed8(4)
in the SAME run. Light: only ~47 Z1 stops + a handful of Z2 stops.

Fallbacks: if the Z2s never fire but afed8(4) does (delta drift), the posthoc
dump at afed8(4) re-locates the 4s and reports corrected deltas."""
import json, signal, subprocess, sys, time
sys.path.insert(0, "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/analysis-lab/scripts")
from hvf_hwbreak_toy import RSP

ADB = "/Users/1004276/Library/Android/sdk/platform-tools/adb"
DEV = "localhost:5555"
AFED8 = 0xafed8
ARM_AT = 46           # arm Z2s at the 46th afed8 entry (empirically the last id0)
D4 = 0x930            # sp47 - sp46 (this phase; low12s 0x0f0 vs 0x7c0)
SLOT_A = -0x3e0       # sp46-relative
SLOT_B = 0x558        # sp46-relative
ART = "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/analysis-lab/artifacts/android/toss_s101_probeG2d.json"


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
    out = {"probe": "G2d dual-Z2 direct writer capture (no bridge)"}

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
                    "nohup sh -c 'for i in $(seq 1 200); do am start -n viva.republica.toss/.splash.SplashActivity >/dev/null 2>&1; sleep 2; done' >/dev/null 2>&1 &"],
                   capture_output=True, text=True, timeout=10)
    time.sleep(1.5)

    r = RSP(1234)
    active = set()
    wslots = [None, None]

    def cleanup():
        try:
            try:
                r.interrupt()
            except Exception:
                pass
            for bp in list(active):
                r.cmd("z1,%x,4" % bp, 2)
            for w in wslots:
                if w:
                    r.cmd("z2,%x,8" % w, 2)
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

    def stack_fours(sp, lo=-0x1600, hi=0x100):
        base = (sp + lo) & ~0xF
        blob = b""
        a = base
        end = sp + hi
        while a < end:
            n = min(0x400, end - a)
            s = m(a, n)
            try:
                blob += bytes.fromhex(s)
            except Exception:
                blob += b"\x00" * n
            a += n
        res = []
        for off in range(lo, hi - 7, 8):
            i = sp + off - base
            if 0 <= i <= len(blob) - 8 and blob[i:i + 8] == b"\x04\x00\x00\x00\x00\x00\x00\x00":
                res.append(off)
        return res

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
        armed = False
        snapshot = [None, None]
        z2_events = []
        writer4 = None
        af4 = None
        timeouts = 0
        t1 = time.time()
        deadline = t1 + 300
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
            if pc == ent:
                x0 = gr.get("x0", 0)
                n_ids += 1
                if x0 == 4:
                    sp = gr.get("sp", 0)
                    af4 = {"t": round(time.time() - t1, 2), "call_no": n_ids,
                           "sp": hex(sp), "lr": hex(gr.get("x30", 0)),
                           "x1": hex(gr.get("x1", 0)), "x2": hex(gr.get("x2", 0))}
                    L("*** afed8(4) call#%d sp=%s lr=%s (writer4=%s) ***"
                      % (n_ids, af4["sp"], af4["lr"], bool(writer4)))
                    if not writer4:
                        af4["posthoc_fours"] = [hex(o) for o in stack_fours(sp)]
                        L("posthoc fours rel sp47: %s" % af4["posthoc_fours"])
                    break
                if not armed and n_ids >= ARM_AT:
                    sp46 = gr.get("sp", 0)
                    wslots[0] = sp46 + SLOT_A
                    wslots[1] = sp46 + SLOT_B
                    r1 = r.cmd("Z2,%x,8" % wslots[0], 3)
                    r2 = r.cmd("Z2,%x,8" % wslots[1], 3)
                    snapshot[0] = u64(wslots[0])
                    snapshot[1] = u64(wslots[1])
                    armed = (r1 == "OK" or r2 == "OK")
                    out["arm"] = {"at_call": n_ids, "sp46": hex(sp46),
                                  "slotA": hex(wslots[0]), "slotB": hex(wslots[1]),
                                  "z2a": r1, "z2b": r2,
                                  "snapA": hex(snapshot[0]) if snapshot[0] is not None else None,
                                  "snapB": hex(snapshot[1]) if snapshot[1] is not None else None}
                    L("armed dual Z2 at call#%d sp46=%s A=%s(%s) B=%s(%s) z2=[%s,%s] snap=[%s,%s]"
                      % (n_ids, hex(sp46), hex(wslots[0]), hex(SLOT_A), hex(wslots[1]), hex(SLOT_B),
                         r1, r2, out["arm"]["snapA"], out["arm"]["snapB"]))
                dele(ent)
                r.cmd("s", 3)
                add(ent)
                continue
            # non-afed8 stop == Z2 watchpoint (only ent Z1 is armed)
            va = gr.get("sp", 0)
            vA = u64(wslots[0]) if wslots[0] else None
            vB = u64(wslots[1]) if wslots[1] else None
            ev = {"t": round(time.time() - t1, 2), "pc": hex(pc),
                  "lr": hex(gr.get("x30", 0)), "sp": hex(gr.get("sp", 0)),
                  "vA": hex(vA) if vA is not None else None,
                  "vB": hex(vB) if vB is not None else None,
                  "prevA": hex(snapshot[0]) if snapshot[0] is not None else None,
                  "prevB": hex(snapshot[1]) if snapshot[1] is not None else None}
            for i in range(31):
                ev["x%d" % i] = hex(gr.get("x%d" % i, 0))
            z2_events.append(ev)
            L("Z2#%d pc=%s sp=%s vA=%s vB=%s (was A=%s B=%s)"
              % (len(z2_events), ev["pc"], ev["sp"], ev["vA"], ev["vB"], ev["prevA"], ev["prevB"]))
            became4 = None
            if vA == 4 and snapshot[0] != 4:
                became4 = wslots[0]
            if vB == 4 and snapshot[1] != 4:
                became4 = wslots[1]
            if became4 is not None and writer4 is None:
                writer4 = {"pc": ev["pc"], "slot": hex(became4)}
                cap = {"writer_pc": ev["pc"], "slot": hex(became4)}
                wpc = pc - 4
                cap["code_window"] = m(max(0, wpc - 0x80), 0x180)
                cap["slot_window"] = m(became4 - 0x40, 0x100)
                for rn in ("x19", "x20", "x21", "x22", "x23", "x24", "x28", "x29"):
                    v = gr.get(rn, 0) & 0x00FFFFFFFFFFFFFF
                    if 0x100000 < v < 0xFFFFFFFFFFFF:
                        cap["win_%s" % rn] = m(v & ~0xF, 0x40)
                cap["regs"] = {k: ev[k] for k in ev if k.startswith("x") or k in ("sp", "lr")}
                out["writer_capture"] = cap
                L("*** WRITER OF 4: pc=%s slot=%s (regs dumped) ***" % (ev["pc"], hex(became4)))
            snapshot[0], snapshot[1] = vA, vB
            # watchpoint: no step-over needed; just continue
        out.update({"n_ids": n_ids, "z2_events": z2_events,
                    "writer_of_4": writer4, "afed8_4": af4, "armed": armed,
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
