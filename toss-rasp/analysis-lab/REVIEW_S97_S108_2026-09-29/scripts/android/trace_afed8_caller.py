#!/usr/bin/env python3
"""§98 probe1: who calls afed8(x0=4)? Trace afed8 ENTRY + b02ac together.

At each afed8 entry hit (before prologue): record x0 (dispatch id), x1, x2,
x19, x29, sp, x30 (lr) -> caller = lr-4, caller_off = (lr-4)-base, plus the
code bytes at the callsite (bl vs blr classification) and a snapshot of the
caller's stack locals at [sp, sp+0xc0]. b02ac stays armed to correlate each
entry with its dispatch state (w8) within the same invocation (same sp arena
continuity). The x0==4 entry is the poison invocation: its caller chain is
the upstream target. Observation only. SIGTERM always detaches.
"""
import json, signal, subprocess, sys, time
sys.path.insert(0, "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/analysis-lab/scripts")
from hvf_hwbreak_toy import RSP

ADB = "/Users/1004276/Library/Android/sdk/platform-tools/adb"
DEV = "localhost:5555"
LINKER_BASE = 0xebc8ffebf000
SOINFO_NOTIFY = LINKER_BASE + 0x68bb4
AFED8 = 0xafed8
B02AC = 0xb02ac
ART = "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/analysis-lab/artifacts/android/toss_afed8_caller.json"


def adb(*a):
    return subprocess.run([ADB, "-s", DEV] + list(a), capture_output=True, text=True)


def main():
    out = {"provenance": "runtime", "probe": "afed8 entry caller trace"}
    active = set()
    r = None
    lines = []

    def log(s):
        lines.append(s)
        print(s, flush=True)

    def cleanup():
        if not r:
            return
        try:
            for bp in list(active):
                r.cmd("z1,%x,4" % bp, 2)
            r.cmd("D", 4)
            r.close()
        except Exception:
            pass

    def on_sig(*_):
        cleanup()
        print("SIGNAL -> detached", flush=True)
        sys.exit(1)

    signal.signal(signal.SIGTERM, on_sig)
    signal.signal(signal.SIGINT, on_sig)

    def m(va, n):
        return r.cmd("m%x,%x" % (va, n), 5)

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

    def ctx(va, n):
        if not va:
            return None
        for cand in (va & 0x00FFFFFFFFFFFFFF, va):
            s = m(cand, n)
            if s and not s.startswith("E") and len(s) >= n * 2:
                return {"va": hex(cand), "hex": s[:n * 2]}
        return None

    def classify(code_u32):
        if code_u32 is None:
            return None
        op = code_u32 >> 24
        if op == 0x94:
            imm = code_u32 & 0x3ffffff
            if imm & 0x2000000:
                imm -= 0x4000000
            return "bl"
        if (code_u32 & 0xfffffc1f) == 0xd63f0000:
            return "blr x%d" % ((code_u32 >> 5) & 31)
        if (code_u32 & 0xfffffc1f) == 0xd61f0000:
            return "br x%d" % ((code_u32 >> 5) & 31)
        return "other"

    t0 = time.time()
    try:
        adb("shell", "am force-stop viva.republica.toss")
        adb("shell", "nohup sh -c 'for i in $(seq 1 120); do am start -n viva.republica.toss/.splash.SplashActivity; sleep 2; done' >/dev/null 2>&1 &")
        time.sleep(1.5)
        r = RSP(1234)
        r.interrupt()
        log("catching libea56 load...")
        add(SOINFO_NOTIFY)
        hit = r.cmd("c", 20)
        found = None
        ev = 0
        while hit and hit.startswith("T") and ev < 300:
            ev += 1
            gr = regs()
            si = gr.get("x0", 0)
            if "ea56" in " | ".join(names(si)):
                found = {"soinfo": si, "base": u64(si + 0x100)}
                break
            dele(SOINFO_NOTIFY)
            r.cmd("s", 5)
            add(SOINFO_NOTIFY)
            hit = r.cmd("c", 20)
        if not found or not found["base"]:
            out["verdict"] = "NO_LIBEA56"
            return
        base = found["base"]
        ent, ac = base + AFED8, base + B02AC
        out.update({"libea56_base": hex(base), "afed8_va": hex(ent), "b02ac_va": hex(ac)})
        log("libea56 base=%#x afed8=%#x b02ac=%#x" % (base, ent, ac))
        dele(SOINFO_NOTIFY)

        re_, ra = add(ent), add(ac)
        log("Z1 afed8 -> %s ; Z1 b02ac -> %s" % (re_, ra))

        entries = []
        disp = []
        poison_entry = None
        timeouts = 0
        deadline = time.time() + 150
        seq = 0
        while time.time() < deadline:
            stop = r.cmd("c", 25)
            if not stop or not stop.startswith("T"):
                timeouts += 1
                if poison_entry or timeouts >= 3:
                    log("end: stop=%r timeouts=%d" % (stop, timeouts))
                    break
                continue
            timeouts = 0
            gr = regs()
            pc = gr.get("pc", 0)
            th = stop.split("thread:")[1].split(";")[0] if "thread:" in stop else "?"
            if pc == ent:
                x0, x30, sp = gr.get("x0", 0), gr.get("x30", 0), gr.get("sp", 0)
                caller = x30 - 4
                inlib = base <= caller < base + 0x300000
                cw = m(caller, 8)  # callsite word + next
                cw_u32 = int.from_bytes(bytes.fromhex(cw[:8]), "little") if len(cw) >= 8 and not cw.startswith("E") else None
                seq += 1
                rec = {"seq": seq, "t": round(time.time() - t0, 2), "thread": th, "site": "afed8_entry",
                       "x0": hex(x0), "id": x0 & 0xffffffff,
                       "x1": hex(gr.get("x1", 0)), "x2": hex(gr.get("x2", 0)),
                       "x19": hex(gr.get("x19", 0)), "x29": hex(gr.get("x29", 0)),
                       "sp": hex(sp), "lr": hex(x30),
                       "caller": hex(caller),
                       "caller_off": hex(caller - base) if inlib else None,
                       "callsite_word": cw, "call_kind": classify(cw_u32),
                       "caller_frame": ctx(sp, 0xc0)}
                if x0 == 4:
                    rec["ctx2"] = ctx(gr.get("x2", 0), 0x100)
                    poison_entry = rec
                    log("*** POISON ENTRY seq=%d: afed8(x0=4) caller=%s (off %s) kind=%s sp=%s ***" %
                        (seq, rec["caller"], rec["caller_off"], rec["call_kind"], rec["sp"]))
                entries.append(rec)
                log("entry#%d id=%d caller_off=%s kind=%s x1=%s x2=%s sp=%s" %
                    (seq, rec["id"], rec["caller_off"], rec["call_kind"],
                     rec["x1"], rec["x2"], rec["sp"]))
            elif pc == ac:
                w8 = gr.get("x8", 0) & 0xffffffff
                seq += 1
                rec = {"seq": seq, "t": round(time.time() - t0, 2), "thread": th, "site": "b02ac",
                       "w8": hex(w8), "x2": hex(gr.get("x2", 0)), "x19": hex(gr.get("x19", 0)),
                       "sp": hex(gr.get("sp", 0))}
                disp.append(rec)
                if w8 == 4:
                    log("*** b02ac state4 seq=%d sp=%s x19=%s ***" % (seq, rec["sp"], rec["x19"]))
            else:
                log("unexpected pc=%#x th=%s" % (pc, th))
                continue
            dele(ent)
            dele(ac)
            r.cmd("s", 5)
            add(ent)
            add(ac)

        out["entries"] = entries
        out["b02ac"] = disp
        out["poison_entry"] = poison_entry
        from collections import Counter
        out["id_histogram"] = dict(Counter(e["id"] for e in entries))
        out["caller_off_histogram"] = dict(Counter(e["caller_off"] for e in entries))
        out["verdict"] = "POISON_ENTRY_CAPTURED" if poison_entry else ("ENTRIES_NO_ID4" if entries else "NO_HITS")
        log("ids: %s" % out["id_histogram"])
        log("callers: %s" % out["caller_off_histogram"])
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
