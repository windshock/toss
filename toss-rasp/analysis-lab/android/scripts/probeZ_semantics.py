#!/usr/bin/env python3
"""§102 probeZ_semantics: verify Z1/Z2 instrumentation BEFORE trusting counts.

User directive (S102): the G2-series huge hit counts (G2d 116k, G2e 440k+,
G2j 520k with CONSTANT x22) are CONFOUNDED - their stop handlers continued
with the breakpoint/watchpoint still armed at the current PC, so each stop
may be an immediate RE-TRAP of the same un-executed instruction, not a new
execution event. Before any architecture claims:

  Z1 dance (afed8 entry, every hit):
      z1-del -> g(old regs) -> s -> g(new regs) -> assert pc_new != pc_old
      -> z1-add -> continue
  Z2 dance (slot A = sp46-0x3e0, armed at call#46, every stop):
      z2-del -> before=u64(slot) -> g(old) -> s -> g(new) -> assert pc_new
      != pc_old -> after=u64(slot) -> z2-add -> continue
      each event classified REAL WRITE (before!=after, pc advanced) vs
      SAME-VALUE EXECUTION (before==after, pc advanced) vs
      INSTRUMENTATION_ERROR (pc did not advance).

Also delivers the CLEAN measurement: number of REAL writes to slot A
between afed8 call#46 and afed8(4), and slot A's value at afed8(4).
All register reads use full g-packets (no pN register-number ambiguity -
G2j's "p22" was hex 34 = v0's low bits, invalid for x22)."""
import json, signal, subprocess, sys, time
sys.path.insert(0, "/Users/1004276/Downloads/toss/toss-rasp/analysis-lab/scripts")
from hvf_hwbreak_toy import RSP

ADB = "/Users/1004276/Library/Android/sdk/platform-tools/adb"
DEV = "localhost:5555"
AFED8 = 0xafed8
SLOT_A = -0x3e0
ART = "/Users/1004276/Downloads/toss/toss-rasp/analysis-lab/artifacts/android/toss_s102_probeZ.json"


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
    out = {"probe": "Z1/Z2 step-over semantics verification",
           "z1_events": [], "z2_events": [], "instrumentation_errors": []}

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

    def brief(gr):
        if not gr:
            return {}
        return {k: hex(v) for k, v in gr.items()
                if k in ("pc", "sp", "x0", "x1", "x22", "x21", "x30")}

    z1_ok = 0
    z1_fail = 0
    z2_real_writes = 0
    z2_same_value = 0
    z2_fail = 0

    def z1_dance(ent, tag):
        """remove bp, record old regs, step, verify advancement, re-arm."""
        nonlocal z1_ok, z1_fail
        dele(ent)
        old = regs()
        sr = r.cmd("s", 5)
        new = regs()
        if old and new and new.get("pc") != old.get("pc"):
            z1_ok += 1
            return old, new, sr, True
        z1_fail += 1
        out["instrumentation_errors"].append(
            {"kind": "Z1_NO_ADVANCE", "tag": tag, "old_pc": hex(old.get("pc", 0)) if old else None,
             "new_pc": hex(new.get("pc", 0)) if new else None, "step_reply": sr})
        return old, new, sr, False

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
        timeouts = 0
        t1 = time.time()
        deadline = t1 + 480
        while time.time() < deadline:
            stop = r.cmd("c", 20)
            if not stop or not stop.startswith("T"):
                timeouts += 1
                if timeouts >= 3:
                    out["verdict_note"] = "timeout after 3x20s no-stop"
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
                    slotA_val = u64(wA[0]) if wA[0] else None
                    af4 = {"t": round(time.time() - t1, 2), "call_no": n_ids,
                           "sp": hex(sp), "lr": hex(gr.get("x30", 0)),
                           "x1": hex(gr.get("x1", 0)),
                           "slotA": hex(wA[0]) if wA[0] else None,
                           "slotA_val_at_afed8_4": hex(slotA_val) if slotA_val is not None else None,
                           "z2_real_writes_so_far": z2_real_writes,
                           "z2_same_value_so_far": z2_same_value}
                    L("*** afed8(4) call#%d slotA=%s (val=%s) realwrites=%d sameval=%d ***"
                      % (n_ids, af4["slotA"], af4["slotA_val_at_afed8_4"],
                         z2_real_writes, z2_same_value))
                    # dance out of this stop too, then break
                    z1_dance(ent, "afed8_4")
                    break
                if sp46 is None and n_ids >= 46:
                    sp46 = sp
                    wA[0] = sp46 + SLOT_A
                    rz = r.cmd("Z2,%x,8" % wA[0], 3)
                    out["arm_z2"] = {"at_call": n_ids, "sp46": hex(sp46),
                                     "slotA": hex(wA[0]), "z2": rz,
                                     "snap": hex(u64(wA[0]) or 0)}
                    L("call#%d sp46=%s -> Z2 slotA=%s snap=%s (%s)"
                      % (n_ids, hex(sp46), hex(wA[0]), out["arm_z2"]["snap"], rz))
                old, new, sr, adv = z1_dance(ent, "afed8_%d" % n_ids)
                if len(out["z1_events"]) < 10:
                    out["z1_events"].append(
                        {"hit": n_ids, "x0": hex(x0), "advanced": adv,
                         "old": brief(old), "new": brief(new),
                         "raw_stop": stop[:60]})
                add(ent)
                continue
            # non-afed8 stop: Z2 event with full dance
            if wA[0]:
                dele_z2 = r.cmd("z2,%x,8" % wA[0], 3)
                before = u64(wA[0])
                old = regs()
                sr = r.cmd("s", 5)
                new = regs()
                after = u64(wA[0])
                rz = r.cmd("Z2,%x,8" % wA[0], 3)
                advanced = bool(old and new and new.get("pc") != old.get("pc"))
                wrote = (before != after)
                cls = ("REAL_WRITE" if (advanced and wrote) else
                       "SAME_VALUE_EXEC" if advanced else "INSTRUMENTATION_ERROR")
                if cls == "REAL_WRITE":
                    z2_real_writes += 1
                elif cls == "SAME_VALUE_EXEC":
                    z2_same_value += 1
                else:
                    z2_fail += 1
                    out["instrumentation_errors"].append(
                        {"kind": "Z2_NO_ADVANCE", "old_pc": hex(old.get("pc", 0)) if old else None,
                         "new_pc": hex(new.get("pc", 0)) if new else None, "step_reply": sr})
                ev = {"n": z2_real_writes + z2_same_value + z2_fail, "class": cls,
                      "advanced": advanced,
                      "old_pc": hex(old.get("pc", 0)) if old else None,
                      "new_pc": hex(new.get("pc", 0)) if new else None,
                      "before": hex(before) if before is not None else None,
                      "after": hex(after) if after is not None else None,
                      "sp": hex(old.get("sp", 0)) if old else None,
                      "lr": hex(old.get("x30", 0)) if old else None,
                      "x22": hex(old.get("x22", 0)) if old else None,
                      "raw_stop": stop[:70]}
                if len(out["z2_events"]) < 120:
                    out["z2_events"].append(ev)
                if ev["n"] <= 8 or ev["n"] % 10 == 0 or cls == "REAL_WRITE":
                    L("Z2#%d %s pc=%s->%s before=%s after=%s x22=%s raw=%s"
                      % (ev["n"], cls, ev["old_pc"], ev["new_pc"],
                         ev["before"], ev["after"], ev["x22"], ev["raw_stop"]))
                continue
            L("unexpected pc=%s sp=%s raw=%s" % (hex(pc), hex(sp), stop[:70]))
        out.update({"n_ids": n_ids, "afed8_4": af4,
                    "z1_advanced_ok": z1_ok, "z1_no_advance": z1_fail,
                    "z2_real_writes": z2_real_writes, "z2_same_value_exec": z2_same_value,
                    "z2_no_advance": z2_fail,
                    "verdict": ("SEMANTICS_OK_" + ("AF4" if af4 else "NOAF4")) if (z1_fail == 0 and z2_fail == 0)
                    else "INSTRUMENTATION_ERROR"})
    finally:
        cleanup()
        try:
            open(ART, "w").write(json.dumps(out, indent=2))
        except Exception:
            pass
        open(ART.replace(".json", ".txt"), "w").write("\n".join(log) + "\n")
        print("VERDICT:", out.get("verdict"),
              "z1_ok=%s z1_fail=%s z2_real=%s z2_same=%s z2_fail=%s" %
              (z1_ok, z1_fail, z2_real_writes, z2_same_value, z2_fail), flush=True)


if __name__ == "__main__":
    main()
