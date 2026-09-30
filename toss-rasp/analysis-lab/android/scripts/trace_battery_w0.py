#!/usr/bin/env python3
"""§139 — gdbstub single-step w0 capture through the afed8(4) battery.

Uses the validated RSP client (hvf_hwbreak_toy.py) to:
1. Catch libea56 load via soinfo notify bp
2. Set hw-bp at afed8 entry
3. On afed8(4): step through every instruction
4. At each BLR/BR: record target fn + x0 (return after)
5. At BL: record target
Output: JSON list of {pc, target, ret_w0} for API call analysis.
Budget: ~5k steps (first 5k of the 16k loop covers initial checks).
"""
import json, signal, subprocess, sys, time
sys.path.insert(0, "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/analysis-lab/scripts")
from hvf_hwbreak_toy import RSP

ADB = "/Users/1004276/Library/Android/sdk/platform-tools/adb"
DEV = "localhost:5556"
LINKER_BASE = None
SOINFO_NOTIFY_OFF = 0x68bb4
AFED8 = 0xafed8
BUDGET = 8000
ART = "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/analysis-lab/artifacts/android/toss_battery_w0.json"

def adb(*a):
    return subprocess.run([ADB, "-s", DEV] + list(a), capture_output=True, text=True)

def main():
    out = {"provenance": "gdbstub", "probe": "battery w0 single-step"}
    r = None
    lines = []

    def log(s):
        lines.append(s)
        print(s, flush=True)

    def cleanup():
        if not r:
            return
        try:
            r.cmd("D", 4)
            r.close()
        except Exception:
            pass

    signal.signal(signal.SIGTERM, lambda *a: (cleanup(), sys.exit(1)))
    signal.signal(signal.SIGINT, lambda *a: (cleanup(), sys.exit(1)))

    def m(va, n):
        return r.cmd("m%x,%x" % (va, n), 8)

    def u64(va):
        s = m(va, 8)
        try:
            return int.from_bytes(bytes.fromhex(s[:16]), "little")
        except Exception:
            return None

    def u32(va):
        s = m(va, 4)
        try:
            return int.from_bytes(bytes.fromhex(s[:8]), "little") & 0xffffffff
        except Exception:
            return None

    def cstr(va, n=160):
        if not va:
            return ""
        s = m(va, n)
        try:
            b = bytes.fromhex(s)
            z = b.find(0)
            return b[:z if z >= 0 else len(b)].decode("latin1", "replace")
        except Exception:
            return ""

    def libcxx(va):
        t = u32(va)
        if t is None:
            return ""
        return cstr(u64(va + 0x10) or 0) if (t & 1) else cstr(va + 1)

    def names(si):
        o = []
        rp = libcxx(si + 0x1a0)
        if rp:
            o.append(rp)
        lm = cstr(u64(si + 0xd8) or 0)
        if lm and lm not in o:
            o.append(lm)
        return o

    def regs():
        g = r.cmd("g", 5)
        if not g or len(g) < 528:
            return {}
        def q(i):
            return int.from_bytes(bytes.fromhex(g[i * 16:i * 16 + 16]), "little")
        return {("x%d" % i): q(i) for i in range(31)} | {"sp": q(31), "pc": q(32)}

    t0 = time.time()
    try:
        adb("shell", "am force-stop", "viva.republica.toss")
        time.sleep(1)
        # Start app in background
        subprocess.Popen([ADB, "-s", DEV, "shell",
            "nohup sh -c 'for i in $(seq 1 60); do am start -n viva.republica.toss/.splash.SplashActivity >/dev/null 2>&1; sleep 2; done' >/dev/null 2>&1 &"],
            stdout=subprocess.DEVNULL, stderr=subprocess.DEVNULL)
        time.sleep(1.5)
        r = RSP(1234)
        r.interrupt()
        log("catching libea56...")

        # Get linker base dynamically
        # Method: step until we find soinfo notify for libea56
        # Simpler: scan /proc/<pid>/maps via adb after app starts
        time.sleep(5)  # wait for app to start and load libea56
        pid_out = adb("shell", "pidof viva.republica.toss").stdout.strip()
        if not pid_out:
            log("ERROR: app not running")
            out["verdict"] = "APP_NOT_RUNNING"
            return
        maps_out = adb("shell", "su 0 cat /proc/%s/maps" % pid_out).stdout
        base = None
        for ln in maps_out.splitlines():
            if "libea56.so" in ln and "r-xp" in ln:
                base = int(ln.split("-")[0], 16)
                # Adjust: libea56 text starts at file offset 0x34000
                # maps shows the r-xp segment start
                break
        if not base:
            # Try r--p (first segment)
            for ln in maps_out.splitlines():
                if "libea56.so" in ln:
                    base = int(ln.split("-")[0], 16)
                    break
        if not base:
            log("ERROR: libea56 not found in maps")
            out["verdict"] = "NO_LIBEA56"
            return

        # Compute text base: r-xp segment file offset is typically 0x34000
        # We need the load base (start of first PT_LOAD)
        # From §97: libea56 base was found via soinfo
        # Simpler: use the first r--p mapping as base
        for ln in maps_out.splitlines():
            if "libea56.so" in ln and "r--p" in ln:
                base = int(ln.split("-")[0], 16)
                break

        log("libea56 base=%#x (pid=%s)" % (base, pid_out))
        out["libea56_base"] = hex(base)

        ent = base + AFED8
        r.interrupt()

        # Set hw-bp at afed8
        bp_res = r.cmd("Z1,%x,4" % ent, 3)
        log("Z1 afed8(%#x) -> %s" % (ent, bp_res))

        # Continue and wait for hit
        stop = r.cmd("c", 30)
        n_id0 = 0
        battery_started = False
        timeout_count = 0

        while stop and stop.startswith("T"):
            gr = regs()
            pc = gr.get("pc", 0)
            x0 = gr.get("x0", 0)

            if pc == ent:
                if x0 == 4:
                    log("*** afed8(4) HIT! Starting battery step... ***")
                    battery_started = True
                    break
                else:
                    n_id0 += 1
                    if n_id0 % 10 == 0:
                        log("  afed8(%d) x0=%d" % (n_id0, x0))
                    r.cmd("z1,%x,4" % ent, 3)
                    r.cmd("s", 5)
                    r.cmd("Z1,%x,4" % ent, 3)
                    stop = r.cmd("c", 30)
            else:
                stop = r.cmd("c", 30)

            if not stop or not stop.startswith("T"):
                timeout_count += 1
                if timeout_count > 3:
                    log("TIMEOUT")
                    break
                stop = r.cmd("c", 30)

        if not battery_started:
            log("Battery not reached (n_id0=%d)" % n_id0)
            out["verdict"] = "BATTERY_NOT_REACHED"
            out["n_id0"] = n_id0
            return

        # Remove bp
        r.cmd("z1,%x,4" % ent, 3)

        # Single-step through battery
        calls = []
        step = 0
        prev_pc = 0
        prev_x8 = 0
        prev_x9 = 0

        while step < BUDGET:
            r.cmd("s", 3)
            gr = regs()
            pc = gr.get("pc", 0)

            # Detect BLR/BR (indirect branch): pc jumped to x8/x9/etc
            # After a BLR, pc = old x8/x9 target
            if prev_pc and pc != prev_pc + 4:
                # Not sequential — could be branch result
                # Check if this is a return from a call (pc in libea56 + offset)
                if base <= pc < base + 0x300000:
                    off = pc - base
                    # Check x0 (return value)
                    w0 = gr.get("x0", 0) & 0xffffffff
                    calls.append({
                        "step": step,
                        "ret_pc": hex(off),
                        "w0": w0,
                        "x8_prev": hex(prev_x8 - base) if base <= prev_x8 < base + 0x300000 else hex(prev_x8),
                    })
                    if len(calls) <= 30 or w0 != 0:
                        log("  step=%d ret@libea56+%#x w0=%d x8_prev=%s" % (
                            step, off, w0,
                            hex(prev_x8 - base) if base <= prev_x8 < base + 0x300000 else "?"))

            prev_pc = pc
            prev_x8 = gr.get("x8", 0)
            prev_x9 = gr.get("x9", 0)
            step += 1

            if step % 1000 == 0:
                log("  ... step %d/%d (%d calls)" % (step, BUDGET, len(calls)))

        out["n_steps"] = step
        out["calls"] = calls
        out["n_calls"] = len(calls)
        nonzero = [c for c in calls if c["w0"] != 0]
        out["n_nonzero_w0"] = len(nonzero)
        out["verdict"] = "W0_CAPTURED"

        log("\n=== RESULT: %d steps, %d calls, %d nonzero w0 ===" % (step, len(calls), len(nonzero)))
        for c in nonzero[:20]:
            log("  ★ step=%d w0=%d from x8=%s" % (c["step"], c["w0"], c["x8_prev"]))

    finally:
        cleanup()
        try:
            open(ART, "w").write(json.dumps(out, indent=2))
        except Exception:
            pass
        open(ART.replace(".json", ".txt"), "w").write("\n".join(lines) + "\n")
        print("VERDICT:", out.get("verdict"), flush=True)

if __name__ == "__main__":
    main()
