#!/usr/bin/env python3
"""§101 probeG2g: slot-B sensor -> late slot-A arm (two-slot endgame).

Pipeline established (G2d/e/f): between afed8 call#46 and afed8(4) the same
thread runs a MULTI-STAGE pipeline; every stage reuses slot A
(sp46-0x3e0) as scratch (stage1 0xe14e7e365240 >440k iters writes 0;
stage2 libea56+0xada2d4 >=58k iters writes a stack ptr; ...). Watching A
through any early point storms. G2c: at afed8(4) BOTH A (sp47-0xd10) and
B (sp47-0x3d8 == sp46+0x558) hold 4; B's neighborhood is the structured
marshalling area.

Hypothesis: B's 4-write happens at the END (final marshalling), in a calm
window. Test: arm Z2 on B ONLY at call#46.
  B becomes 4        -> CAPTURE B's writer, THEN arm Z2 on A -> capture A's
                        writer if it follows -> afed8(4) chain.
  B storms unchanged -> bail to afed8(4) + posthoc (B also loop-hot).
  B silent + af4     -> B's 4 predates #46; posthoc relocates."""
import json, signal, subprocess, sys, time
sys.path.insert(0, "/Users/1004276/Downloads/toss/toss-rasp/analysis-lab/scripts")
from hvf_hwbreak_toy import RSP

ADB = "/Users/1004276/Library/Android/sdk/platform-tools/adb"
DEV = "localhost:5555"
AFED8 = 0xafed8
ARM_AT = 46
SLOT_A = -0x3e0
SLOT_B = 0x558
ART = "/Users/1004276/Downloads/toss/toss-rasp/analysis-lab/artifacts/android/toss_s101_probeG2g.json"


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
    out = {"probe": "G2g slot-B sensor, late slot-A arm"}

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
    wB = [None]
    wA = [None]

    def cleanup():
        try:
            try:
                r.interrupt()
            except Exception:
                pass
            for bp in list(active):
                r.cmd("z1,%x,4" % bp, 2)
            for w in (wA[0], wB[0]):
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

    def full_capture(gr, pc, watch, slot, tag):
        cap = {"pc": hex(pc), "slot": hex(slot), "watch": watch,
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
        prevB = None
        prevA = None
        b_traps = 0
        b_unchanged = 0
        a_traps = 0
        b_writer = None
        a_writer = None
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
                           "x1": hex(gr.get("x1", 0)),
                           "b_traps": b_traps, "a_traps": a_traps}
                    L("*** afed8(4) call#%d sp=%s lr=%s (bW=%s aW=%s bTraps=%d aTraps=%d) ***"
                      % (n_ids, af4["sp"], af4["lr"], bool(b_writer), bool(a_writer), b_traps, a_traps))
                    af4["posthoc_fours"] = [hex(o) for o in stack_fours(sp)]
                    L("posthoc fours rel sp47: %s" % af4["posthoc_fours"])
                    break
                if sp46 is None and n_ids >= ARM_AT:
                    sp46 = sp
                    wB[0] = sp46 + SLOT_B
                    rz = r.cmd("Z2,%x,8" % wB[0], 3)
                    prevB = u64(wB[0])
                    out["arm"] = {"at_call": n_ids, "sp46": hex(sp46),
                                  "slotB": hex(wB[0]), "z2": rz,
                                  "snapB": hex(prevB) if prevB is not None else None}
                    L("armed Z2 slotB=%s snap=%s -> %s" % (hex(wB[0]), out["arm"]["snapB"], rz))
                dele(ent)
                r.cmd("s", 3)
                add(ent)
                continue
            # watch stop: which slot?
            vB = u64(wB[0]) if wB[0] else None
            vA = u64(wA[0]) if wA[0] else None
            fired_B = "watch:%x" % wB[0] in stop if wB[0] else False
            fired_A = "watch:%x" % wA[0] in stop if wA[0] else False
            if fired_B or (not fired_A and vB != prevB and prevB is not None and wA[0] is None):
                b_traps += 1
                if vB == prevB:
                    b_unchanged += 1
                if vB == 4 and prevB != 4:
                    b_writer = full_capture(gr, pc, "B", wB[0], "B")
                    out["b_writer_capture"] = b_writer
                    L("*** B WRITER OF 4: pc=%s sp=%s lr=%s ***" % (hex(pc), hex(sp), hex(gr.get("x30", 0))))
                    # endgame: arm A now
                    wA[0] = sp46 + SLOT_A
                    rzA = r.cmd("Z2,%x,8" % wA[0], 3)
                    prevA = u64(wA[0])
                    out["late_arm_A"] = {"slotA": hex(wA[0]), "z2": rzA,
                                         "snapA": hex(prevA) if prevA is not None else None}
                    L("late-armed Z2 slotA=%s snap=%s -> %s" % (hex(wA[0]), out["late_arm_A"]["snapA"], rzA))
                elif b_traps <= 40 or b_traps % 5000 == 0:
                    L("B#%d pc=%s sp=%s vB=%s (was %s)" % (b_traps, hex(pc), hex(sp),
                       hex(vB) if vB is not None else None,
                       hex(prevB) if prevB is not None else None))
                if b_unchanged > 300000:
                    r.cmd("z2,%x,8" % wB[0], 2)
                    wB[0] = None
                    L("B bail-out after %d unchanged" % b_unchanged)
                prevB = vB if vB is not None else prevB
                continue
            if fired_A or wA[0]:
                a_traps += 1
                L("A#%d pc=%s sp=%s vA=%s (was %s)" % (a_traps, hex(pc), hex(sp),
                   hex(vA) if vA is not None else None,
                   hex(prevA) if prevA is not None else None))
                if vA == 4 and prevA != 4:
                    a_writer = full_capture(gr, pc, "A", wA[0], "A")
                    out["a_writer_capture"] = a_writer
                    L("*** A WRITER OF 4: pc=%s sp=%s lr=%s ***" % (hex(pc), hex(sp), hex(gr.get("x30", 0))))
                prevA = vA if vA is not None else prevA
                continue
            L("unexpected pc=%s sp=%s raw=%s" % (hex(pc), hex(sp), stop[:80]))
        out.update({"n_ids": n_ids, "b_traps": b_traps, "b_unchanged": b_unchanged,
                    "a_traps": a_traps, "b_writer": bool(b_writer), "a_writer": bool(a_writer),
                    "afed8_4": af4,
                    "verdict": ("A_WRITER4_CAPTURED" if a_writer else
                                "B_WRITER4_CAPTURED" if b_writer else
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
