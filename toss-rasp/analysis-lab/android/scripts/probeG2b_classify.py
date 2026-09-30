#!/usr/bin/env python3
"""§101 probeG2b: classify-only re-derivation of bridge-1 / R_invobj.

probeG2 run 1 verdict NO_NATIVE: bridge-1 SIG mismatch (stale layout) and
112k hits of a generic OLLVM blr-stub -> anchor filter never matched, run
starved. This light run re-derives, for the CURRENT phase:
  bridge1  = afed8(4).LR - 4        (caller insn)
  R_invobj = afed8(4).x1
plus: 16B SIG at bridge1, scratch[0] posthoc (sp-0x14e0, expect 4).
No bridge bp, no watchpoint - lightest possible (§100: afed8-only 3/3)."""
import json, signal, subprocess, sys, time
sys.path.insert(0, "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/analysis-lab/scripts")
from hvf_hwbreak_toy import RSP

ADB = "/Users/1004276/Library/Android/sdk/platform-tools/adb"
DEV = "localhost:5555"
AFED8 = 0xafed8
ART = "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/analysis-lab/artifacts/android/toss_s101_probeG2b.json"


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
    out = {"probe": "G2b classify-only bridge re-derivation"}

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
        try:
            subprocess.run([ADB, "kill-server"], capture_output=True, timeout=10)
            time.sleep(1)
            subprocess.run([ADB, "connect", DEV], capture_output=True, timeout=10)
        except Exception:
            pass
        LB = linker_base()
    if not LB:
        print("NO LINKER BASE")
        return
    SOINFO = LB + 0x68bb4
    L("linker: %#x" % LB)
    # kill ANY stale launch loops from earlier probes, then a clean one
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
            # drain any pending stop reply (a mid-c deadline exit leaves one;
            # without draining, z1/D answers desync and the VM stays paused(debug))
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

    def m(va, n, t=5):
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
        # loader hook -> libea56
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

        ids = []
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
            ids.append(x0)
            if x0 == 4:
                lr = gr.get("x30", 0)
                sp = gr.get("sp", 0)
                b1 = lr - 4
                af4 = {"t": round(time.time() - t1, 2), "lr": hex(lr),
                       "bridge1": hex(b1), "x1": hex(gr.get("x1", 0)),
                       "x2": hex(gr.get("x2", 0)), "sp": hex(sp)}
                af4["bridge_sig16"] = m(b1, 16)
                af4["bridge_pre16"] = m(b1 - 16, 16)
                sc = sp - 0x14e0
                af4["scratch0_addr"] = hex(sc)
                af4["scratch0_val"] = (lambda v: hex(v) if v is not None else None)(u64(sc))
                L("*** afed8(4) call#%d t=%.2f lr=%s bridge1=%s x1=%s sp=%s scratch0=%s ***"
                  % (len(ids), af4["t"], af4["lr"], af4["bridge1"], af4["x1"], af4["sp"], af4["scratch0_val"]))
                break
            dele(ent)
            r.cmd("s", 3)
            add(ent)
        out.update({"ids": ids, "n_ids": len(ids), "afed8_4": af4,
                    "verdict": "AF4_SEEN" if af4 else "NO_AF4"})
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
