#!/usr/bin/env python3
"""§101 probeG2h: iterative stage-skipper -> final-slot writer capture.

Established (G2d..g): afed8 call#46 -> afed8(4) contains a MULTI-STAGE
pipeline; EVERY stage reuses slot A (sp46-0x3e0 == sp47-0xd10) as scratch:
  stage1 0xe14e7e365240 (interp cluster) >440k iters, writes 0
  stage2 libea56+0xada2d4 >=58k iters, writes a stack ptr
  stage3 0xe14bc0cfbba4 (stub cluster) >=21k iters ...
final stage (calm) writes 4 into A, then dispatch -> afed8(4).
Watching A through any hot stage starves; B (sp46+0x558) is also stage-hot.

State machine per stage:
  probing   : Z2 armed on A (small unchanged-budget BUD=40).
              storm (unchanged>=BUD) -> skip mode: z1@storm_pc
  skip_entry: first hit at storm_pc -> grab LR, z1@LR, drop storm z1
  skip_ret  : LR hit = stage(s) returned -> re-arm Z2 on A (fresh budget)
Converges on the final calm marshalling: vA becomes 4 -> FULL CAPTURE,
then afed8(4) in the same run closes the chain."""
import json, signal, subprocess, sys, time
sys.path.insert(0, "/Users/1004276/Downloads/toss/toss-rasp/analysis-lab/scripts")
from hvf_hwbreak_toy import RSP

ADB = "/Users/1004276/Library/Android/sdk/platform-tools/adb"
DEV = "localhost:5555"
AFED8 = 0xafed8
ARM_AT = 46
SLOT_A = -0x3e0
BUD = 40
MAX_STAGES = 24
ART = "/Users/1004276/Downloads/toss/toss-rasp/analysis-lab/artifacts/android/toss_s101_probeG2h.json"


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
    out = {"probe": "G2h iterative stage-skipper writer capture"}

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
    wA = [None]

    def cleanup():
        try:
            try:
                r.interrupt()
            except Exception:
                pass
            for bp in list(active):
                r.cmd("z1,%x,4" % bp, 2)
            if wA[0]:
                r.cmd("z2,%x,8" % wA[0], 2)
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

    def arm_z2():
        res = r.cmd("Z2,%x,8" % wA[0], 3)
        return res

    def disarm_z2():
        if wA[0]:
            r.cmd("z2,%x,8" % wA[0], 2)

    def full_capture(gr, pc, slot):
        cap = {"pc": hex(pc), "slot": hex(slot),
               "sp": hex(gr.get("sp", 0)), "lr": hex(gr.get("x30", 0))}
        wpc = pc - 4
        cap["code_window"] = m(max(0, wpc - 0x80), 0x180)
        cap["slot_window"] = m(slot - 0x40, 0x100)
        for rn in ("x19", "x20", "x21", "x22", "x23", "x24", "x28", "x29"):
            v = gr.get(rn, 0) & 0x00FFFFFFFFFFFFFF
            if 0x100000 < v < 0xFFFFFFFFFFFF:
                cap["win_%s" % rn] = m(v & ~0xF, 0x40)
        full = {}
        for i in range(31):
            full["x%d" % i] = hex(gr.get("x%d" % i, 0))
        full["sp"] = hex(gr.get("sp", 0))
        cap["regs"] = full
        return cap

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
        sp46 = None
        phase = "count"
        prev = None
        unchanged = 0
        storm_pc = None
        ret_z1 = None
        stages = []
        z2_events = []
        writer4 = None
        af4 = None
        timeouts = 0
        t1 = time.time()
        deadline = t1 + 600
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
                           "x1": hex(gr.get("x1", 0)), "phase": phase,
                           "stages": len(stages)}
                    L("*** afed8(4) call#%d sp=%s lr=%s phase=%s writer4=%s ***"
                      % (n_ids, af4["sp"], af4["lr"], phase, bool(writer4)))
                    af4["posthoc_fours"] = [hex(o) for o in stack_fours(sp)]
                    L("posthoc fours rel sp47: %s" % af4["posthoc_fours"])
                    break
                if sp46 is None and n_ids >= ARM_AT:
                    sp46 = sp
                    wA[0] = sp46 + SLOT_A
                    rz = arm_z2()
                    prev = u64(wA[0])
                    unchanged = 0
                    phase = "probing"
                    out["arm"] = {"at_call": n_ids, "sp46": hex(sp46),
                                  "slotA": hex(wA[0]), "z2": rz,
                                  "snap": hex(prev) if prev is not None else None}
                    L("armed Z2 A=%s snap=%s -> %s" % (hex(wA[0]), out["arm"]["snap"], rz))
                dele(ent)
                r.cmd("s", 3)
                add(ent)
                continue
            # ---- non-afed8 stop ----
            if phase == "probing" and wA[0]:
                vA = u64(wA[0])
                if vA == 4 and prev != 4:
                    writer4 = {"pc": hex(pc), "slot": hex(wA[0]), "raw": stop[:80]}
                    out["writer_capture"] = full_capture(gr, pc, wA[0])
                    L("*** WRITER OF 4: pc=%s sp=%s lr=%s raw=%s ***"
                      % (hex(pc), hex(sp), hex(gr.get("x30", 0)), stop[:80]))
                    prev = vA
                    phase = "captured"
                    continue
                if vA == prev:
                    unchanged += 1
                else:
                    unchanged = 0
                if len(z2_events) < 200:
                    z2_events.append({"pc": hex(pc), "vA": hex(vA) if vA is not None else None,
                                      "n": unchanged})
                if unchanged >= BUD:
                    storm_pc = pc
                    disarm_z2()
                    res = add(storm_pc)
                    phase = "skip_entry"
                    stages.append({"storm_pc": hex(storm_pc), "sp": hex(sp)})
                    L("stage#%d storm at %s (vA=%s) -> z1 (%s)"
                      % (len(stages), hex(storm_pc), hex(vA) if vA is not None else None, res))
                prev = vA if vA is not None else prev
                continue
            if phase == "skip_entry" and pc == storm_pc:
                lr = gr.get("x30", 0)
                dele(storm_pc)
                ret_z1 = lr
                res = add(ret_z1)
                phase = "skip_ret"
                stages[-1]["lr"] = hex(lr)
                stages[-1]["z1_lr"] = res
                L("stage#%d entry sp=%s lr=%s -> z1@lr (%s)" % (len(stages), hex(sp), hex(lr), res))
                continue
            if phase == "skip_ret" and ret_z1 and pc == ret_z1:
                stages[-1]["ret_t"] = round(time.time() - t1, 2)
                dele(ret_z1)
                ret_z1 = None
                rz = arm_z2()
                prev = u64(wA[0])
                unchanged = 0
                phase = "probing" if len(stages) < MAX_STAGES else "wait_af4"
                if len(stages) >= MAX_STAGES:
                    disarm_z2()
                    L("max stages reached - waiting for afed8(4)")
                else:
                    L("stage#%d returned -> re-arm Z2 A (snap=%s, %s)"
                      % (len(stages), hex(prev) if prev is not None else None, rz))
                continue
            if phase == "captured":
                # after capture: just ride to afed8(4)
                vA = u64(wA[0]) if wA[0] else None
                prev = vA if vA is not None else prev
                continue
            L("unexpected pc=%s sp=%s phase=%s raw=%s" % (hex(pc), hex(sp), phase, stop[:80]))
        out.update({"n_ids": n_ids, "phase_end": phase, "stages": stages,
                    "z2_events_head": z2_events[:60],
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
