#!/usr/bin/env python3
"""§101 probeG2j: capture the FINAL worker call (x22==4) - writer provenance.

Static result: slot A (sp47-0xd10, the S99 scratch[0]) is written by
libea56+0xda2d4 `stp x22,x21,[sp,#0x30]` - the prologue spill of a WORKER
function (entry +0xda2c8) called 100k+ times in the afed8#46 -> afed8(4)
pipeline (DexGuard VM: interpreter-step <-> libea56 worker alternation).
The final value 4 in slot A = x22 at the LAST worker call.

This run: Z1 at worker ENTRY (+0xda2c8); per hit read ONLY x22 (p22).
On x22==4 -> capture the invocation context: full regs (x22, LR = the
interpreter caller's return address, sp), code window around the caller's
call site, frame windows -> identifies which interpreter instruction
sources the 4. Then keep afed8 Z1 armed for the same-run afed8(4) chain.
Observation only."""
import json, signal, subprocess, sys, time
sys.path.insert(0, "/Users/1004276/Downloads/toss/toss-rasp/analysis-lab/scripts")
from hvf_hwbreak_toy import RSP

ADB = "/Users/1004276/Library/Android/sdk/platform-tools/adb"
DEV = "localhost:5555"
AFED8 = 0xafed8
ARM_AT = 46
WORKER_ENT = 0xda2c8          # libea56-relative (stp x28,x27,[sp,#-0x60]!)
ART = "/Users/1004276/Downloads/toss/toss-rasp/analysis-lab/artifacts/android/toss_s101_probeG2j.json"


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
    out = {"probe": "G2j final-worker x22==4 capture"}

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
                    "nohup sh -c 'for i in $(seq 1 900); do am start -n viva.republica.toss/.splash.SplashActivity >/dev/null 2>&1; sleep 2; done' >/dev/null 2>&1 &"],
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

    def p22():
        s = r.cmd("p22", 3)
        try:
            return int.from_bytes(bytes.fromhex(s[:16]), "little")
        except Exception:
            return None

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
        went = lib + WORKER_ENT
        L("Z1 afed8 -> %s" % add(ent))

        n_ids = 0
        worker_armed = False
        hits = 0
        x22_samples = []
        capture = None
        af4 = None
        timeouts = 0
        t1 = time.time()
        deadline = t1 + 1500
        while time.time() < deadline:
            stop = r.cmd("c", 20)
            if not stop or not stop.startswith("T"):
                timeouts += 1
                if timeouts >= 3:
                    break
                continue
            timeouts = 0
            # cheap register probe first: x22 (valid regardless of stop kind)
            v22 = p22()
            if v22 == 4 and capture is None:
                gr = regs()
                pc = gr.get("pc", 0)
                if pc == went:
                    lr = gr.get("x30", 0)
                    capture = {"pc": hex(pc), "x22": hex(v22),
                               "lr": hex(lr), "sp": hex(gr.get("sp", 0)),
                               "t": round(time.time() - t1, 2), "hit_no": hits}
                    cap = dict(capture)
                    # caller's call-site context (interpreter side)
                    if lr > 0x1000:
                        cap["caller_window"] = m(max(0, lr - 0x140), 0x180)
                    cap["worker_window"] = m(went, 0x80)
                    for rn in ("x19", "x20", "x21", "x22", "x23", "x24", "x28", "x29"):
                        val = gr.get(rn, 0) & 0x00FFFFFFFFFFFFFF
                        if 0x100000 < val < 0xFFFFFFFFFFFF:
                            cap["win_%s" % rn] = m(val & ~0xF, 0x40)
                    full = {}
                    for i in range(31):
                        full["x%d" % i] = hex(gr.get("x%d" % i, 0))
                    full["sp"] = hex(gr.get("sp", 0))
                    cap["regs"] = full
                    out["final_worker_capture"] = cap
                    dele(went)          # stop storming; ride to afed8(4)
                    worker_armed = False
                    L("*** FINAL WORKER (x22==4): hit#%d lr=%s sp=%s - Z1 worker removed, awaiting afed8(4) ***"
                      % (hits, hex(lr), hex(gr.get("sp", 0))))
                    continue
                elif pc == ent:
                    pass   # afed8 stop with x0==4 happens below anyway
            gr = regs()
            pc = gr.get("pc", 0)
            if pc == ent:
                x0 = gr.get("x0", 0)
                n_ids += 1
                if x0 == 4:
                    af4 = {"t": round(time.time() - t1, 2), "call_no": n_ids,
                           "sp": hex(gr.get("sp", 0)), "lr": hex(gr.get("x30", 0)),
                           "x1": hex(gr.get("x1", 0)), "worker_hits": hits,
                           "captured": bool(capture)}
                    L("*** afed8(4) call#%d sp=%s lr=%s (capture=%s, worker_hits=%d) ***"
                      % (n_ids, af4["sp"], af4["lr"], bool(capture), hits))
                    break
                if not worker_armed and n_ids >= ARM_AT:
                    res = add(went)
                    worker_armed = (res == "OK")
                    L("call#%d -> Z1 worker-entry %s (%s)" % (n_ids, hex(went), res))
                dele(ent)
                r.cmd("s", 3)
                add(ent)
                continue
            if pc == went:
                hits += 1
                if hits % 20000 == 0 or hits <= 3:
                    x22_samples.append({"hit": hits, "x22": hex(v22) if v22 is not None else None,
                                        "t": round(time.time() - t1, 2)})
                    L("worker hit#%d x22=%s t=%.1f" % (hits, hex(v22) if v22 is not None else None,
                                                       time.time() - t1))
                continue
            L("unexpected pc=%s x22=%s" % (hex(pc), hex(v22) if v22 is not None else None))
        out.update({"n_ids": n_ids, "worker_hits": hits, "x22_samples": x22_samples,
                    "final_worker": bool(capture), "afed8_4": af4,
                    "verdict": ("FINAL_WORKER_CAPTURED" if capture else
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
