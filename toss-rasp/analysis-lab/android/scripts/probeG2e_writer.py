#!/usr/bin/env python3
"""§101 probeG2e: slot-A-only Z2 with cheap trap handling - writer capture.

G2d lesson: dual Z2 trapped 116,708x unchanged in the #46->#47 marshalling
window (hot loop, same thread, deeper frame; sp trap 0x3a0 below sp46; slot A
== the loop's local at [sp-0x40]). Handling cost ~3ms/trap starved the run.
G2c lesson: slot A (sp47-0xd10 == bridge_sp-0x14e0 == the original S99
scratch[0]) held 4 at afed8(4); slot B was the hot hash buffer.

Design: arm Z2 on A ONLY at call#46. Non-4 traps = ONE m-packet (read A),
no regs. At the trap where A becomes 4: full capture (regs, raw stop packet,
code window around pc-4, slot window, frame windows). Then afed8(4) in the
SAME run closes the chain. First trap also snapshotted (loop id)."""
import json, signal, subprocess, sys, time
sys.path.insert(0, "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/analysis-lab/scripts")
from hvf_hwbreak_toy import RSP

ADB = "/Users/1004276/Library/Android/sdk/platform-tools/adb"
DEV = "localhost:5555"
AFED8 = 0xafed8
ARM_AT = 46
SLOT_A = -0x3e0           # sp46-relative (= sp47-0xd10 = bridge_sp-0x14e0)
ART = "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/analysis-lab/artifacts/android/toss_s101_probeG2e.json"


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
    out = {"probe": "G2e slot-A-only Z2, cheap traps, writer capture"}

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
        prev = None
        n_trap = 0
        n_unchanged = 0
        first_trap = None
        writer4 = None
        af4 = None
        raw_samples = {}
        timeouts = 0
        t1 = time.time()
        deadline = t1 + 900
        while time.time() < deadline:
            stop = r.cmd("c", 20)
            if not stop or not stop.startswith("T"):
                timeouts += 1
                if timeouts >= 3:
                    break
                continue
            timeouts = 0
            # cheap path: read the slot first, only pay regs() when needed
            vA = u64(wslot[0]) if wslot[0] else None
            if vA == 4 and prev != 4:
                gr = regs()
                pc = gr.get("pc", 0)
                if pc == ent:
                    # the 4-write was missed (Z2 gone); this stop is afed8(4)
                    # itself, NOT the writer - fall through to the afed8 path
                    out["missed_write_note"] = "slot became 4 before afed8 stop; Z2 not active at write time"
                else:
                    n_trap += 1
                    writer4 = {"trap_no": n_trap, "pc": hex(pc), "raw_stop": stop[:80],
                               "sp": hex(gr.get("sp", 0)), "lr": hex(gr.get("x30", 0))}
                    cap = dict(writer4)
                    wpc = pc - 4
                    cap["code_window"] = m(max(0, wpc - 0x80), 0x180)
                    cap["slot_window"] = m(wslot[0] - 0x40, 0x100)
                    cap["loop_code"] = m(first_trap["pc"] - 0x40, 0x180) if first_trap else None
                    for rn in ("x19", "x20", "x21", "x22", "x23", "x24", "x28", "x29"):
                        v = gr.get(rn, 0) & 0x00FFFFFFFFFFFFFF
                        if 0x100000 < v < 0xFFFFFFFFFFFF:
                            cap["win_%s" % rn] = m(v & ~0xF, 0x40)
                    full = {}
                    for i in range(31):
                        full["x%d" % i] = hex(gr.get("x%d" % i, 0))
                    full["sp"] = hex(gr.get("sp", 0))
                    cap["regs"] = full
                    out["writer_capture"] = cap
                    L("*** WRITER OF 4: trap#%d pc=%s raw=%s (unchanged-traps before: %d) ***"
                      % (n_trap, writer4["pc"], writer4["raw_stop"], n_unchanged))
                    prev = vA
                    continue   # keep going for afed8(4) chain confirmation
            # not the 4-write: decide what kind of stop this was
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
                    wslot[0] = sp46 + SLOT_A
                    rz = r.cmd("Z2,%x,8" % wslot[0], 3)
                    prev = u64(wslot[0])
                    armed = (rz == "OK")
                    out["arm"] = {"at_call": n_ids, "sp46": hex(sp46),
                                  "slotA": hex(wslot[0]), "z2": rz,
                                  "snap": hex(prev) if prev is not None else None}
                    L("armed Z2 slotA=%s (sp46 %s, snap %s) -> %s"
                      % (hex(wslot[0]), hex(sp46), out["arm"]["snap"], rz))
                dele(ent)
                r.cmd("s", 3)
                add(ent)
                continue
            # non-afed8, non-4 stop: count as unchanged watch trap
            n_trap += 1
            if vA == prev:
                n_unchanged += 1
            if first_trap is None:
                first_trap = {"pc": hex(pc), "lr": hex(gr.get("x30", 0)),
                              "sp": hex(gr.get("sp", 0)), "raw_stop": stop[:80],
                              "code": None}
                first_trap["code"] = m(max(0, pc - 0x40), 0x180)
                L("first trap: pc=%s sp=%s raw=%s" % (first_trap["pc"], first_trap["sp"], first_trap["raw_stop"]))
            if n_trap in (1, 2, 3, 1000, 20000, 60000, 100000, 116708):
                raw_samples[n_trap] = stop[:80]
            if n_trap % 20000 == 0:
                L("trap #%d unchanged=%d pc=%s vA=%s" % (n_trap, n_unchanged, hex(pc), hex(vA) if vA is not None else None))
            if n_unchanged > 500000:
                r.cmd("z2,%x,8" % wslot[0], 2)
                wslot[0] = None
                L("bail-out: removed Z2 after %d unchanged traps" % n_unchanged)
            prev = vA if vA is not None else prev
        out.update({"n_ids": n_ids, "n_traps": n_trap, "n_unchanged": n_unchanged,
                    "first_trap": first_trap, "raw_stop_samples": raw_samples,
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
