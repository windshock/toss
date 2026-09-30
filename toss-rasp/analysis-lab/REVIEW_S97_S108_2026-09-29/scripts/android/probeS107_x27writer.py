#!/usr/bin/env python3
"""§107 probeS107_x27writer: FIRST writer of x27=4 (the semantic-binding point).

S106: the interpreter-invocation veneer only SAVES x27 (callee-saved) - the
scalar 4 rides from above. The bank-4 spill happens ~1.9s after call#46, so
the writer is inside the post-call#46 marshalling. Plan: at call#46, disarm
everything and single-step, watching x27/x12 for the FIRST transition to 4.
The executed instruction at that transition IS the writer; capture full
pre/post regs + code window + (if a load) the base-struct window - the
earliest semantic-id assignment for the scalar path. Then re-arm ent+bank-Z2
and ride to afed8(4) for same-run chronology (writer -> bank spill -> ...).

S105 established: the FINAL x0=4 staging recomputes 4 from obfuscated
constants (neg/eor/and/add over table[0x5f0] + movk const, selected by the
jump-table index that also yields &afed8) - the bank->w8 direct def-use does
NOT exist. The remaining edge is record->bank: the bank v3 slot (EA =
sp46+0x338, low12 0xaf8 per S105) already held 4 before the final slotA
store. This probe watches BOTH slotA and the bank slot (two Z2s, danced)
from call#46:
  - every bank STORE event: pc + full regs + code window + before/after
  - chronology vs slotA 4-writes (which slotA write precedes the bank-4?)
  - ride to afed8(4) same-run.
Artifacts per-run, dance invariant everywhere."""
import json, signal, subprocess, sys, time
sys.path.insert(0, "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/analysis-lab/scripts")
from hvf_hwbreak_toy import RSP

ADB = "/Users/1004276/Library/Android/sdk/platform-tools/adb"
DEV = "localhost:5555"
AFED8 = 0xafed8
SLOT_A = -0x3e0
BANK_OFF = 0x338            # bank v3 slot EA - sp46 (S105 run measurement)
ART = "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/analysis-lab/artifacts/android/toss_s107b_x27writer.json"


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
    out = {"probe": "S105b bank-slot writer watch", "bank_writes": [],
           "slotA_4writes": [], "errors": []}

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
    watch = [None, None]     # [slotA, bank]

    def cleanup():
        try:
            try:
                r.interrupt()
            except Exception:
                pass
            for bp in list(active):
                r.cmd("z1,%x,4" % bp, 2)
            for w in watch:
                if w:
                    r.cmd("z2,%x,8" % w, 2)
            r.cmd("D", 4)
            r.close()
        except Exception:
            pass

    signal.signal(signal.SIGTERM, lambda *a: sys.exit(1))
    signal.signal(signal.SIGINT, lambda *a: sys.exit(1))

    def m(va, n, t=8):
        return r.cmd("m%x,%x" % (va, n), t)

    def u64(va):
        s = m(va, 8)
        try:
            return int.from_bytes(bytes.fromhex(s[:16]), "little") if len(s) >= 16 else None
        except Exception:
            return None

    def u32(va):
        s = m(va, 8)
        try:
            return int.from_bytes(bytes.fromhex(s[:16]), "little") & 0xFFFFFFFF if len(s) >= 16 else None
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
        g = r.cmd("g", 8)
        if not g or len(g) < 536:
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
        af4 = None
        writer = None
        x27_at_46 = None
        transitions = []
        ring = []
        timeouts = 0
        t1 = time.time()
        deadline = t1 + 3000
        STEP_CAP = 250000
        phase = "count"
        while time.time() < deadline and af4 is None:
            if phase == "count":
                stop = r.cmd("c", 20)
                if not stop or not stop.startswith("T"):
                    timeouts += 1
                    if timeouts >= 3:
                        out["verdict_note"] = "timeout-count"
                        break
                    continue
                timeouts = 0
                gr = regs()
                pc = gr.get("pc", 0)
                sp = gr.get("sp", 0)
                if pc != ent:
                    # bank watch event (dance) - only tracking the spill-4
                    if sp46:
                        r.cmd("z2,%x,8" % (sp46 + BANK_OFF), 2)
                        preB = u32(sp46 + BANK_OFF)
                        r.cmd("s", 6)
                        postB = u32(sp46 + BANK_OFF)
                        r.cmd("Z2,%x,8" % (sp46 + BANK_OFF), 3)
                        if postB == 4 and preB != 4 and "bank4_pc" not in out:
                            out["bank4_pc"] = hex(pc)
                            out["bank4_after_writer"] = bool(writer)
                            L("bank4 spill at pc=%s (writer captured: %s)" %
                              (hex(pc), bool(writer)))
                    continue
                x0 = gr.get("x0", 0)
                n_ids += 1
                if x0 == 4:
                    af4 = {"t": round(time.time() - t1, 2), "call_no": n_ids,
                           "sp": hex(sp), "lr": hex(gr.get("x30", 0)),
                           "x1": hex(gr.get("x1", 0)),
                           "slotA_val": hex(u64(sp46 + SLOT_A)) if sp46 else None,
                           "bank_val": hex(u32(sp46 + BANK_OFF)) if sp46 else None,
                           "writer_step": writer.get("step") if writer else None}
                    L("*** afed8(4) call#%d writer_step=%s bank=%s ***" %
                      (n_ids, af4["writer_step"], af4["bank_val"]))
                    dele(ent)
                    break
                if sp46 is None and n_ids >= 46:
                    sp46 = sp
                    x27_at_46 = gr.get("x27", 0)
                    out["x27_at_46"] = hex(x27_at_46)
                    out["x12_at_46"] = hex(gr.get("x12", 0))
                    if x27_at_46 == 4:
                        out["verdict_note"] = "x27 already 4 at call#46 - writer predates window"
                        L("x27 ALREADY 4 at call#46 - writer pre-window")
                        # keep watching bank for the spill anyway; continue below
                    # afed8 dance
                    dele(ent)
                    r.cmd("s", 5)
                    n2 = regs()
                    if not (n2 and n2.get("pc") != pc):
                        out["errors"] = out.get("errors", []) + [{"kind": "Z1_NO_ADVANCE"}]
                    add(ent)
                    if x27_at_46 == 4:
                        # cannot hunt the writer in this window; ride to afed8
                        continue
                    # ---- enter single-step hunt ----
                    dele(ent)
                    phase = "hunt"
                    gcur = regs()
                    prev27 = gcur.get("x27", 0)
                    prev12 = gcur.get("x12", 0)
                    L("hunt begins at call#46 pc=%s x27=%s x12=%s" %
                      (hex(gcur.get("pc", 0)), hex(prev27), hex(prev12)))
                    continue
                # normal afed8 stop (before 46): dance
                dele(ent)
                r.cmd("s", 5)
                n2 = regs()
                if not (n2 and n2.get("pc") != pc):
                    out["errors"] = out.get("errors", []) + [{"kind": "Z1_NO_ADVANCE", "hit": n_ids}]
                add(ent)
                continue
            if phase == "hunt":
                if len(ring) >= 48:
                    ring.pop(0)
                ring.append({("x%d" % i): hex(gcur.get("x%d" % i, 0)) for i in range(31)})
                ring[-1]["sp"] = hex(gcur.get("sp", 0))
                ring[-1]["pc"] = hex(gcur.get("pc", 0))
                pcv = gcur.get("pc", 0)
                r.cmd("s", 6)
                gcur = regs()
                if not gcur or gcur.get("pc", 0) == pcv:
                    out["errors"] = out.get("errors", []) + [{"kind": "HUNT_STEP_NO_ADVANCE", "pc": hex(pcv)}]
                    break
                cur27 = gcur.get("x27", 0)
                cur12 = gcur.get("x12", 0)
                if cur27 != prev27:
                    transitions.append({"step": len(transitions), "pc": hex(pcv),
                                        "x27": hex(cur27)})
                if cur27 == 4 and prev27 != 4:
                    writer = {"step": len(ring) - 1, "pc": hex(pcv),
                              "x27_pre": hex(prev27), "x27_post": "0x4"}
                    cap = {"code_win": m(max(0, pcv - 0x40), 0x100),
                           "pre": ring[-2] if len(ring) >= 2 else None,
                           "post": {("x%d" % i): hex(gcur.get("x%d" % i, 0)) for i in range(31)}}
                    cap["post"]["sp"] = hex(gcur.get("sp", 0))
                    cap["post"]["pc"] = hex(gcur.get("pc", 0))
                    writer["capture"] = cap
                    out["x27_writer"] = writer
                    L("*** X27=4 WRITER: pc=%s x27 %s -> 4 (pre-ctx captured) ***"
                      % (writer["pc"], writer["x27_pre"]))
                    # re-arm ent + bank watch and ride to afed8(4)
                    add(ent)
                    r.cmd("Z2,%x,8" % (sp46 + BANK_OFF), 3)
                    phase = "count"
                    prev27 = cur27
                    continue
                prev27 = cur27
                prev12 = cur12
                if len(transitions) > 4000 or sum(1 for _ in ring) > STEP_CAP:
                    out["verdict_note"] = "hunt budget exhausted"
                    L("hunt budget exhausted at pc=%s x27=%s" % (hex(pcv), hex(cur27)))
                    add(ent)
                    phase = "count"
                continue
        out.update({"n_ids": n_ids, "afed8_4": af4,
                    "verdict": ("BANK4_WRITER_CAPTURED" if bank4 else "NO_BANK4")
                    if af4 else "NO_AF4"})
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
