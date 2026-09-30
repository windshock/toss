#!/usr/bin/env python3
"""§106 probeS106_x27: upstream writer of the caller's x27=4 (scalar path).

S105b showed the interpreter is CALLED with x27=4 already live (prologue
spills it into the bank slot). This probe re-runs the bank-slot watch and at
the bank-4 event captures the CALLER's context: code window around lr (the
call site), the interpreter's arg structs (x0/x1/x2 targets), and the caller
frame - enough to identify the instruction that loaded/set x27=4 and its
source (constant vs invocation-block field).

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
ART = "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/analysis-lab/artifacts/android/toss_s106_x27.json"


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
        ev_n = 0
        bank4 = None
        timeouts = 0
        t1 = time.time()
        deadline = t1 + 700
        while time.time() < deadline and af4 is None:
            stop = r.cmd("c", 20)
            if not stop or not stop.startswith("T"):
                timeouts += 1
                if timeouts >= 3:
                    out["verdict_note"] = "timeout"
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
                           "slotA_val": hex(u64(watch[0])) if watch[0] else None,
                           "bank_val": hex(u32(watch[1])) if watch[1] else None,
                           "last_bank4_n": bank4.get("n") if bank4 else None}
                    L("*** afed8(4) call#%d slotA=%s bank=%s last_bank4=%s ***" %
                      (n_ids, af4["slotA_val"], af4["bank_val"], af4["last_bank4_n"]))
                    dele(ent)
                    break
                if sp46 is None and n_ids >= 46:
                    sp46 = sp
                    watch[0] = sp46 + SLOT_A
                    watch[1] = sp46 + BANK_OFF
                    r1 = r.cmd("Z2,%x,8" % watch[0], 3)
                    r2 = r.cmd("Z2,%x,8" % watch[1], 3)
                    L("call#46 sp46=%s Z2 slotA=%s(%s) Z2 bank=%s(%s, snap=%s)" %
                      (hex(sp46), hex(watch[0]), r1, hex(watch[1]), r2,
                       hex(u32(watch[1]) or 0)))
                dele(ent)
                o = regs()
                r.cmd("s", 5)
                n2 = regs()
                if not (n2 and o and n2.get("pc") != o.get("pc")):
                    out["errors"].append({"kind": "Z1_NO_ADVANCE", "hit": n_ids})
                add(ent)
                continue
            # watchpoint stop: remove BOTH watches, step, re-arm (dance)
            r.cmd("z2,%x,8" % watch[0], 2)
            r.cmd("z2,%x,8" % watch[1], 2)
            preA, preB = u64(watch[0]), u32(watch[1])
            old = regs()
            r.cmd("s", 6)
            new = regs()
            postA, postB = u64(watch[0]), u32(watch[1])
            r.cmd("Z2,%x,8" % watch[0], 3)
            r.cmd("Z2,%x,8" % watch[1], 3)
            advanced = bool(old and new and new.get("pc") != old.get("pc"))
            if not advanced:
                out["errors"].append({"kind": "W_NO_ADVANCE", "pc": hex(pc)})
                continue
            ev_n += 1
            if postB is not None and preB != postB:
                rec = {"n": ev_n, "t": round(time.time() - t1, 2), "pc": hex(pc),
                       "lr": hex(old.get("x30", 0)), "sp": hex(old.get("sp", 0)),
                       "bank_before": hex(preB), "bank_after": hex(postB),
                       "slotA_val": hex(postA) if postA is not None else None,
                       "code_win": m(max(0, pc - 0x20), 0x60),
                       "regs": {("x%d" % i): hex(old.get("x%d" % i, 0)) for i in range(31)}}
                rec["regs"]["sp"] = hex(old.get("sp", 0))
                out["bank_writes"].append(rec)
                if postB == 4 and bank4 is None:
                    bank4 = rec
                    # caller-context capture (live process at the stop)
                    lr = old.get("x30", 0)
                    cap = {"caller_code": m(max(0, lr - 0x100), 0x140) if lr > 0x1000 else None,
                           "x27_now": hex(old.get("x27", 0)),
                           "x12_now": hex(old.get("x12", 0))}
                    for argn in ("x0", "x1", "x2"):
                        p = old.get(argn, 0) & 0x00FFFFFFFFFFFFFF
                        if p > 0x10000:
                            cap["args_%s_win" % argn] = m(p & ~0xF, 0x40)
                    bank4["caller_ctx"] = cap
                    L("*** BANK v3 = 4 WRITER: n=%d pc=%s lr=%s x27=%s x12=%s (caller ctx captured) ***"
                      % (ev_n, rec["pc"], rec["lr"], cap["x27_now"], cap["x12_now"]))
                elif len(out["bank_writes"]) <= 8 or ev_n % 200 == 0:
                    L("bank write n=%d pc=%s %s->%s" % (ev_n, hex(pc), hex(preB), hex(postB)))
            if postA is not None and preA != postA and postA == 4:
                out["slotA_4writes"].append({"n": ev_n, "pc": hex(pc),
                                             "t": round(time.time() - t1, 2)})
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
