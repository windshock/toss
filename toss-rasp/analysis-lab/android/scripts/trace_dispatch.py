#!/usr/bin/env python3
"""Capture afed8's selected handler directly at the dispatch call site
0xb02c4 (blr x8; preceded by mov x0,x19 / mov w1,w4 / mov w2,w5). x8 = the
selected handler. Judge the +0xa8f70 hypothesis from the real CPU x8 across
dispatches. Observation only.
"""
import json, signal, subprocess, sys, time
sys.path.insert(0, "/Users/1004276/Downloads/toss/toss-rasp/analysis-lab/scripts")
from hvf_hwbreak_toy import RSP

LINKER_BASE = 0xebc8ffebf000
SOINFO_NOTIFY = LINKER_BASE + 0x68bb4
DISPATCH_OFF = 0xb02c4          # blr x8 = handler call
CAND = 0xa8f70
DEV = "localhost:5555"
ART = "/Users/1004276/Downloads/toss/toss-rasp/analysis-lab/artifacts/android/toss_dispatch.json"


def adb(*a): return subprocess.run(["adb", "-s", DEV] + list(a), capture_output=True, text=True)


def main():
    out = {"provenance": "runtime", "dispatch_site": hex(DISPATCH_OFF), "candidate": hex(CAND)}
    active = set(); r = None

    def cleanup():
        if not r: return
        try:
            for bp in list(active): r.cmd("z1,%x,4" % bp, 2)
            r.cmd("z1,%x,4" % SOINFO_NOTIFY, 2); r.cmd("D", 4); r.close()
        except Exception: pass
    def on_sig(*_): cleanup(); print("SIGNAL -> detached", flush=True); sys.exit(1)
    signal.signal(signal.SIGTERM, on_sig); signal.signal(signal.SIGINT, on_sig)

    def m(va, n): return r.cmd("m%x,%x" % (va, n), 5)
    def u64(va):
        s = m(va, 8)
        try: return int.from_bytes(bytes.fromhex(s[:16]), "little") if len(s) >= 16 else None
        except Exception: return None
    def u32(va):
        s = m(va, 4)
        try: return int.from_bytes(bytes.fromhex(s[:8]), "little") if len(s) >= 8 else None
        except Exception: return None
    def cstr(va, n=160):
        if not va: return ""
        s = m(va, n)
        try:
            b = bytes.fromhex(s); z = b.find(0); return b[:z if z >= 0 else len(b)].decode("latin1", "replace")
        except Exception: return ""
    def libcxx(va):
        t = u32(va)
        if t is None: return ""
        return cstr(u64(va + 0x10) or 0) if (t & 1) else cstr(va + 1)
    def names(si):
        o = []; rp = libcxx(si + 0x1a0)
        if rp: o.append(rp)
        lm = cstr(u64(si + 0xd8) or 0)
        if lm and lm not in o: o.append(lm)
        return o
    def regs():
        g = r.cmd("g", 5)
        if not g or len(g) < 528: return {}
        def q(i): return int.from_bytes(bytes.fromhex(g[i*16:i*16+16]), "little")
        d = {("x%d" % i): q(i) for i in range(31)}; d["sp"] = q(31); d["pc"] = q(32); return d
    def inlib(va, b): return b <= va < b + 0x300000
    def offof(va, b): return va - b if inlib(va, b) else None
    def add(va):
        res = r.cmd("Z1,%x,4" % va, 3)
        if res == "OK": active.add(va)
        return res
    def dele(va):
        try: r.cmd("z1,%x,4" % va, 3)
        finally: active.discard(va)

    try:
        adb("shell", "am force-stop viva.republica.toss")
        adb("shell", "nohup sh -c 'for i in $(seq 1 90); do am start -n viva.republica.toss/.splash.SplashActivity; sleep 2; done' >/dev/null 2>&1 &")
        time.sleep(1.5)
        r = RSP(1234); r.interrupt()
        print("catch libea56...", flush=True)
        add(SOINFO_NOTIFY); hit = r.cmd("c", 20); found = None; ev = 0
        while hit and hit.startswith("T") and ev < 200:
            ev += 1; gr = regs(); si = gr.get("x0", 0)
            if "ea56" in " | ".join(names(si)): found = {"base": u64(si + 0x100)}; break
            dele(SOINFO_NOTIFY); r.cmd("s", 5); add(SOINFO_NOTIFY); hit = r.cmd("c", 20)
        if not found or not found["base"]:
            out["verdict"] = "NO_LIBEA56"; return
        base = found["base"]; disp = base + DISPATCH_OFF
        out["libea56_base"] = hex(base); out["dispatch_va"] = hex(disp)
        print("libea56 base=%#x dispatch@%#x" % (base, disp), flush=True)
        dele(SOINFO_NOTIFY)

        add(disp)
        handlers = []; seen = {}
        for i in range(24):
            h = r.cmd("c", 30)
            if not h or not h.startswith("T"):
                out["dispatch_stop"] = h; break
            rr = regs(); pc = rr.get("pc", 0)
            if pc != disp:
                out["unexpected_pc"] = {"pc": hex(pc), "off": hex(offof(pc, base)) if offof(pc, base) is not None else None, "stop": h}
                break
            x8 = rr.get("x8", 0); hoff = offof(x8, base)
            rec = {"i": i, "thread": h, "handler": hex(x8),
                   "handler_off": hex(hoff) if hoff is not None else None,
                   "x0_x19_context": hex(rr.get("x0", 0)), "x19": hex(rr.get("x19", 0)),
                   "w1": hex(rr.get("x1", 0) & 0xffffffff), "w2": hex(rr.get("x2", 0) & 0xffffffff),
                   "is_a8f70": hoff == CAND}
            handlers.append(rec)
            key = rec["handler_off"] or rec["handler"]; seen[key] = seen.get(key, 0) + 1
            print("dispatch %d thread=%s handler_off=%s a8f70=%s x0=%#x w1=%s w2=%s" %
                  (i, h, rec["handler_off"], rec["is_a8f70"], rr.get("x0", 0), rec["w1"], rec["w2"]), flush=True)
            dele(disp); r.cmd("s", 5); add(disp)
        out["handlers"] = handlers
        out["handler_histogram"] = seen
        out["a8f70_seen"] = any(x.get("is_a8f70") for x in handlers)
        out["verdict"] = "DISPATCH_CAPTURED" if handlers else "NO_DISPATCH_HIT"
    finally:
        cleanup()
        try: open(ART, "w").write(json.dumps(out, indent=2))
        except Exception: pass
        print("VERDICT:", out.get("verdict", "UNKNOWN"), "a8f70_seen:", out.get("a8f70_seen"), flush=True)


if __name__ == "__main__":
    main()
