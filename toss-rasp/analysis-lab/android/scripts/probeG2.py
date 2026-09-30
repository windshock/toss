#!/usr/bin/env python3
"""§101 probeG2: light late-bridge capture of the scratch[0]=4 writer.

Prior evidence: afed8-only bp preserves the native path (3/3 runs afed8(4)
after exactly 46 id0s); a heavy bridge-1 bp (76k stops) kills it. So:
 count afed8 entries; at the 46th id0 arm bridge-1 (stable 0xe14bc0d86d00
 this phase) -> only the last few dispatches stop -> filter the R dispatch
 (x0&mask == 0xe14ac00b3a90 or [x0+8]==0xe7b) -> Z2 write-watch on
 scratch[0]=sp-0x14e0 -> capture the exact writer of 4 (+full regs, frames,
 code window) -> confirm afed8(4) in the SAME run. Observation only."""
import json, signal, subprocess, sys, time
sys.path.insert(0, "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/analysis-lab/scripts")
from hvf_hwbreak_toy import RSP

ADB = "/Users/1004276/Library/Android/sdk/platform-tools/adb"
DEV = "localhost:5555"
AFED8 = 0xafed8
BRIDGE1 = 0xe14bc0d86d00          # stable across incarnations (this phase)
R_INVOBJ = 0xe14ac00b3a90         # from classify-run x1 (stable low bits)
R_IDX = 0xe7b
ARM_BRIDGE_AT = 46
ART = "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/analysis-lab/artifacts/android/toss_s101_probeG2.json"


def adb_sh(cmd, t=15):
    q = cmd.replace("'", "'\\''")
    try:
        return subprocess.run([ADB, "-s", DEV, "shell", "su 0 sh -c '%s'" % q],
                              capture_output=True, text=True, timeout=t).stdout.strip()
    except Exception:
        return ""  # timeout/hang -> let the caller's disconnect/reconnect retry loop engage


def linker_base():
    out = adb_sh('grep linker64 /proc/$(pidof com.android.systemui)/maps | grep "r--p 00000000" | head -1')
    try:
        return int(out.split("-")[0], 16)
    except Exception:
        return None


def main():
    log = []
    def L(s):
        log.append(s)
        print(s, flush=True)
    out = {"provenance": "runtime", "probe": "G2 light late-bridge writer capture"}

    LB = None
    for _ in range(6):
        LB = linker_base()
        if LB:
            break
        subprocess.run([ADB, "disconnect", DEV], capture_output=True, timeout=8)
        time.sleep(2)
        subprocess.run([ADB, "connect", DEV], capture_output=True, timeout=8)
    if not LB:
        print("NO LINKER BASE")
        return
    SOINFO = LB + 0x68bb4
    L("linker: %#x ; bridge1=%#x ; R_invobj=%#x" % (LB, BRIDGE1, R_INVOBJ))
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
            # drain any pending stop reply (a mid-c deadline exit leaves one;
            # without draining, z1/D answers desync and the VM stays paused(debug))
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

    def m(va, n, t=5):
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
        if m(BRIDGE1, 8) != "ff8303d11083bcb0":
            L("WARN: bridge1 SIG mismatch: %s" % m(BRIDGE1, 8))

        n_ids = 0
        n_b1 = 0
        ids = []
        writes = []
        writer4 = None
        af4 = None
        anchored = False
        bridge_armed = False
        timeouts = 0
        t1 = time.time()
        deadline = t1 + 300
        while time.time() < deadline:
            stop = r.cmd("c", 20)
            if not stop or not stop.startswith("T"):
                timeouts += 1
                if anchored or timeouts >= 3:
                    break
                continue
            timeouts = 0
            gr = regs()
            pc = gr.get("pc", 0)
            if pc == ent:
                x0 = gr.get("x0", 0)
                n_ids += 1
                ids.append(x0)
                if x0 == 4:
                    af4 = {"t": round(time.time() - t1, 2), "sp": gr.get("sp", 0),
                           "x1": gr.get("x1", 0), "x2": gr.get("x2", 0), "lr": gr.get("x30", 0)}
                    L("*** afed8(4) at call#%d sp=%s (anchored=%s) ***" %
                      (n_ids, hex(gr.get("sp", 0)), anchored))
                    # even if not anchored: post-hoc scratch check
                    if not anchored:
                        sc = gr.get("sp", 0) - 0x14e0
                        v = u64(sc)
                        L("post-hoc scratch0=%s val=%s" % (hex(sc), hex(v) if v is not None else None))
                        out["posthoc_scratch"] = {"addr": hex(sc), "val": hex(v) if v is not None else None}
                    break
                if not bridge_armed and n_ids >= ARM_BRIDGE_AT:
                    res = add(BRIDGE1)
                    bridge_armed = (res == "OK")
                    L("armed bridge-1 late (at afed8 call#%d) -> %s" % (n_ids, res))
                dele(ent)
                if bridge_armed:
                    dele(BRIDGE1)
                r.cmd("s", 3)
                add(ent)
                if bridge_armed:
                    add(BRIDGE1)
                continue
            if pc == BRIDGE1 and not anchored:
                n_b1 += 1
                inv = gr.get("x0", 0) & 0x00FFFFFFFFFFFFFF
                idx = u32(inv + 8) if inv else None
                if inv == R_INVOBJ or idx == R_IDX:
                    anchored = True
                    sp = gr.get("sp", 0)
                    wslot[0] = sp - 0x14e0
                    out["anchor"] = {"t": round(time.time() - t1, 2), "sp": hex(sp),
                                     "inv": hex(inv), "idx": hex(idx) if idx is not None else None,
                                     "scratch0": hex(wslot[0]), "b1_hits": n_b1,
                                     "afed8_calls_so_far": n_ids}
                    wz = r.cmd("Z2,%x,8" % wslot[0], 3)
                    out["watch_armed"] = (wz == "OK")
                    L("*** R DISPATCH anchored: sp=%s inv=%s idx=%s scratch0=%s (b1#%d, afed8#%d) Z2=%s ***" %
                      (hex(sp), hex(inv), hex(idx) if idx is not None else None,
                       hex(wslot[0]), n_b1, n_ids, wz))
                    dele(BRIDGE1)
                dele(ent)
                r.cmd("s", 3)
                add(ent)
                continue
            if anchored and wslot[0]:
                # watchpoint stop
                before = u64(wslot[0])
                rec = {"t": round(time.time() - t1, 2), "pc": hex(pc), "lr": hex(gr.get("x30", 0)),
                       "sp": hex(gr.get("sp", 0)),
                       "slot_before": hex(before) if before is not None else None}
                for i in range(31):
                    rec["x%d" % i] = hex(gr.get("x%d" % i, 0))
                writes.append(rec)
                L("W#%d pc=%s slot_before=%s x2=%s x9=%s" %
                  (len(writes), rec["pc"], rec["slot_before"], rec["x2"], rec["x9"]))
                if before == 4:
                    writer4 = rec
                    cap = {"writer_pc": hex(pc)}
                    cap["code_window"] = m(max(0, pc - 0x80), 0x100)
                    cap["scratch_window"] = m(wslot[0] - 0x40, 0x100)
                    for rn in ("x19", "x20", "x21", "x22", "x23", "x24", "x28", "x29"):
                        v = gr.get(rn, 0) & 0x00FFFFFFFFFFFFFF
                        if 0x100000 < v < 0xFFFFFFFFFFFF:
                            cap["win_%s" % rn] = m(v & ~0xF, 0x40)
                    out["writer_capture"] = cap
                    L("*** WRITER OF 4: pc=%s ***" % rec["pc"])
                    break
                dele(ent)
                r.cmd("s", 3)
                add(ent)
                continue
            # unexpected stop (e.g. race) — just continue
            L("unexpected pc=%s lr=%s" % (hex(pc), hex(gr.get("x30", 0))))
        out.update({"ids": ids, "n_ids": n_ids, "n_bridge1_late_hits": n_b1,
                    "writes": writes, "writer_of_4": writer4, "afed8_4": af4,
                    "anchored": anchored})
        if af4 and isinstance(af4.get("sp"), int):
            out["afed8_4"]["sp"] = hex(af4["sp"])
            out["afed8_4"]["x1"] = hex(af4["x1"])
            out["afed8_4"]["x2"] = hex(af4["x2"])
            out["afed8_4"]["lr"] = hex(af4["lr"])
        out["verdict"] = ("WRITER4_CAPTURED" if writer4 else
                          "ANCHORED_NO_WRITER" if anchored else
                          "AFED8_4_ONLY" if af4 else "NO_NATIVE")
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
