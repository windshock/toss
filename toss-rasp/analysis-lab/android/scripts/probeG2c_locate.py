#!/usr/bin/env python3
"""§101 probeG2c: locate the scratch slot for the CURRENT layout (light).

G2 evidence recap: bridge-1 (0xe14bc0d86d00) is a SHARED OLLVM blr-stub
(112k hits between afed8 call#46 and #47 -> starvation under gdb). The invobj
rides in x1 (NOT x0 - G2's anchor filter bug). New plan: NO bridge bp at all.
Arm Z2 at afed8 stop#46 on the slot, if we know its offset from sp.

This run measures everything needed:
  per-stop (x0, sp) for all afed8 entries  -> is sp_46 == sp_47 (same frame)?
  at afed8(4): x1 invobj field dump (u32@+8 == 0xe7b? settles filter Q3),
               stack dump [sp-0x1600, sp+0x100] -> every 8-aligned u64==4 offset,
               plus u64 @ sp-0x14e0 and @ sp+/-0x60 for continuity with S99/S100.
Observation only."""
import json, signal, subprocess, sys, time
sys.path.insert(0, "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/analysis-lab/scripts")
from hvf_hwbreak_toy import RSP

ADB = "/Users/1004276/Library/Android/sdk/platform-tools/adb"
DEV = "localhost:5555"
AFED8 = 0xafed8
ART = "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/analysis-lab/artifacts/android/toss_s101_probeG2c.json"


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
    out = {"probe": "G2c locate scratch slot (light, afed8-only)"}

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

    def cleanup():
        try:
            try:
                r.interrupt()
            except Exception:
                pass
            for bp in list(active):
                r.cmd("z1,%x,4" % bp, 2)
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

    def u32(va):
        s = m(va, 4)
        try:
            return int.from_bytes(bytes.fromhex(s[:8]), "little") if len(s) >= 8 else None
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

    def stack_dump(sp, lo, hi):
        """dump [sp+lo, sp+hi) as {offset: u64}; page-align reads for reliability"""
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
        d = {}
        for off in range(lo, hi - 7, 8):
            va = sp + off
            i = va - base
            if 0 <= i <= len(blob) - 8:
                d[off] = int.from_bytes(blob[i:i + 8], "little")
        return d

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

        stops = []           # (x0, sp) per afed8 entry
        af4 = None
        timeouts = 0
        t1 = time.time()
        deadline = t1 + 240
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
            if pc != ent:
                L("unexpected pc=%s lr=%s" % (hex(pc), hex(gr.get("x30", 0))))
                continue
            x0 = gr.get("x0", 0)
            stops.append((x0, gr.get("sp", 0)))
            if x0 == 4:
                sp = gr.get("sp", 0)
                inv = gr.get("x1", 0) & 0x00FFFFFFFFFFFFFF
                af4 = {"t": round(time.time() - t1, 2),
                       "call_no": len(stops),
                       "lr": hex(gr.get("x30", 0)),
                       "x1": hex(gr.get("x1", 0)),
                       "x2": hex(gr.get("x2", 0)),
                       "x3": hex(gr.get("x3", 0)),
                       "sp": hex(sp)}
                # invobj field verification (settles open question #3)
                fld = {}
                for off in range(0, 0x40, 8):
                    v = u64(inv + off)
                    fld["+%#x" % off] = hex(v) if v is not None else None
                af4["invobj_dump"] = fld
                af4["invobj_u32_8"] = (lambda v: hex(v) if v is not None else None)(u32(inv + 8))
                # stack sweep for value 4
                dump = stack_dump(sp, -0x1600, 0x100)
                fours = [off for off, v in dump.items() if v == 4]
                af4["stack_fours"] = [hex(o) for o in fours]
                af4["sp_minus_14e0"] = (lambda v: hex(v) if v is not None else None)(dump.get(-0x14e0))
                # keep a compact window dump around each 4-slot for provenance
                win = {}
                for o in fours:
                    win[hex(o)] = [hex(dump.get(o + d)) for d in range(-0x18, 0x20, 8)]
                af4["four_neighborhoods"] = win
                L("*** afed8(4) call#%d sp=%s inv=%s inv+8=%s stack4s=%s (sp-0x14e0=%s) ***"
                  % (af4["call_no"], af4["sp"], hex(inv), af4["invobj_u32_8"],
                     af4["stack_fours"], af4["sp_minus_14e0"]))
                break
            dele(ent)
            r.cmd("s", 3)
            add(ent)
        out["stops"] = [{"i": i + 1, "x0": hex(x), "sp": hex(s)} for i, (x, s) in enumerate(stops)]
        sp46 = stops[-2][1] if len(stops) >= 2 else None
        sp47 = stops[-1][1] if stops else None
        out["sp_penultimate"] = hex(sp46) if sp46 else None
        out["sp_last"] = hex(sp47) if sp47 else None
        out["same_frame_46_47"] = (sp46 == sp47) if (sp46 and sp47) else None
        out["afed8_4"] = af4
        out["verdict"] = "AF4_SEEN" if af4 else "NO_AF4"
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
