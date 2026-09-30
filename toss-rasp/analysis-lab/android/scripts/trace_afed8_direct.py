#!/usr/bin/env python3
"""Directly instrument afed8 (NOT via 0x13a4bc, which is a libc poll() call, not
the dispatcher). Catch libea56 via the linker soinfo wrapper, arm a HW bp at
afed8=base+0xafed8, capture entry state, then trace afed8's internal indirect
br/blr to the selected handler and judge the +0xa8f70 hypothesis. Observation only.
"""
import json, signal, struct, subprocess, sys, time
sys.path.insert(0, "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/analysis-lab/scripts")
from hvf_hwbreak_toy import RSP

LINKER_BASE = 0xebc8ffebf000
SOINFO_NOTIFY = LINKER_BASE + 0x68bb4
AFED8_OFF = 0xafed8
AFED8_END = 0xb0900
CAND_A8F70 = 0xa8f70
DEV = "localhost:5555"
LIB = "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/libea56.so"
ART = "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/analysis-lab/artifacts/android/toss_afed8_flow.json"


def adb(*a): return subprocess.run(["adb", "-s", DEV] + list(a), capture_output=True, text=True)
def iword(h):
    try:
        b = bytes.fromhex(h[:8]); return int.from_bytes(b, "little") if len(b) == 4 else None
    except Exception: return None
def ikind(w):
    if w is None: return None
    if (w & 0xfffffc1f) == 0xd61f0000: return {"op": "br", "reg": (w >> 5) & 31}
    if (w & 0xfffffc1f) == 0xd63f0000: return {"op": "blr", "reg": (w >> 5) & 31}
    return None
def scan_sites():
    data = open(LIB, "rb").read(); out = []
    for off in range(AFED8_OFF, min(AFED8_END, len(data) - 4), 4):
        k = ikind(struct.unpack_from("<I", data, off)[0])
        if k: out.append({"off": off, **k})
    return out


def main():
    out = {"provenance": "runtime", "mode": "afed8_direct",
           "afed8_window": {"start": hex(AFED8_OFF), "end": hex(AFED8_END)},
           "static_indirect_sites": [{"off": hex(s["off"]), "op": s["op"], "reg": "x%d" % s["reg"]} for s in scan_sites()]}
    active = set(); r = None; st = {}

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
        r0 = []; rp = libcxx(si + 0x1a0)
        if rp: r0.append(rp)
        lm = cstr(u64(si + 0xd8) or 0)
        if lm and lm not in r0: r0.append(lm)
        return r0
    def regs():
        g = r.cmd("g", 5)
        if not g or len(g) < 528: return {}
        def q(i): return int.from_bytes(bytes.fromhex(g[i*16:i*16+16]), "little")
        d = {("x%d" % i): q(i) for i in range(31)}; d["sp"] = q(31); d["pc"] = q(32); return d
    def sub(rr): return {k: hex(rr[k]) for k in ("pc","sp","x0","x1","x2","x3","x8","x9","x10","x19","x30") if k in rr}
    def memd(va, n=128):
        if not va: return {"addr": hex(va), "hex": ""}
        return {"addr": hex(va), "hex": m(va, n)}
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
        print("relaunch loop + connect...", flush=True)
        adb("shell", "am force-stop viva.republica.toss")
        adb("shell", "nohup sh -c 'for i in $(seq 1 80); do am start -n viva.republica.toss/.splash.SplashActivity; sleep 2; done' >/dev/null 2>&1 &")
        time.sleep(1.5)
        r = RSP(1234); r.interrupt()
        print("catch libea56 via soinfo wrapper...", flush=True)
        add(SOINFO_NOTIFY); hit = r.cmd("c", 20); found = None; ev = 0
        while hit and hit.startswith("T") and ev < 200:
            ev += 1; gr = regs(); si = gr.get("x0", 0); nm = " | ".join(names(si))
            if "ea56" in nm: found = {"si": si, "base": u64(si + 0x100), "name": nm}; break
            dele(SOINFO_NOTIFY); r.cmd("s", 5); add(SOINFO_NOTIFY); hit = r.cmd("c", 20)
        if not found or not found["base"]:
            out["verdict"] = "NO_LIBEA56"; return
        base = found["base"]; afed8 = base + AFED8_OFF
        out["libea56"] = {"base": hex(base), "afed8": hex(afed8), "name": found["name"]}
        print("libea56 base=%#x afed8=%#x" % (base, afed8), flush=True)
        dele(SOINFO_NOTIFY)

        # Arm afed8 entry DIRECTLY
        print("arming afed8 @ %#x ..." % afed8, flush=True)
        add(afed8)
        ah = r.cmd("c", 60); out["afed8_stop"] = ah
        if not ah or not ah.startswith("T"):
            out["verdict"] = "NO_AFED8_HIT"; return
        entry = regs()
        out["afed8_entry"] = {"regs": sub(entry), "thread": ah,
                              "x0_mem": memd(entry.get("x0", 0)), "x19_mem": memd(entry.get("x19", 0))}
        print("afed8 HIT thread=%s pc=%#x x0=%#x x2=%#x x19=%#x" %
              (ah, entry.get("pc", 0), entry.get("x0", 0), entry.get("x2", 0), entry.get("x19", 0)), flush=True)
        dele(afed8)

        # Trace internal indirect branches to the selected handler
        sites = [base + s["off"] for s in scan_sites()]
        ins = {hex(bp): add(bp) for bp in sites}
        out["branch_bp_insert"] = {k: v for k, v in ins.items() if v != "OK"} or "all OK"
        branches = []; selected = None
        print("tracing %d afed8 indirect sites..." % len(sites), flush=True)
        for _ in range(200):
            bh = r.cmd("c", 30)
            if not bh or not bh.startswith("T"): out["branch_stop"] = bh; break
            pr = regs(); pc = pr.get("pc", 0); poff = offof(pc, base); bh_hex = m(pc, 4)
            k = ikind(iword(bh_hex))
            if poff is None or k is None:
                branches.append({"stop": bh, "pc": hex(pc), "poff": hex(poff) if poff is not None else None, "bytes": bh_hex, "note": "unexpected"}); break
            reg = "x%d" % k["reg"]; tgt = pr.get(reg, 0); toff = offof(tgt, base)
            e = {"site": hex(poff), "op": k["op"], "reg": reg, "target": hex(tgt),
                 "target_off": hex(toff) if toff is not None else None, "pre": sub(pr)}
            dele(pc); e["step"] = r.cmd("s", 5); po = regs()
            e["post_pc_off"] = hex(offof(po.get("pc", 0), base)) if offof(po.get("pc", 0), base) is not None else None
            branches.append(e)
            print("  site=%s %s %s -> %s (post_off=%s)" % (e["site"], e["op"], reg, e["target_off"] or e["target"], e["post_pc_off"]), flush=True)
            internal = toff is not None and AFED8_OFF <= toff < AFED8_END
            if not internal: selected = e; break
            add(pc)
        out["branches"] = branches
        if not selected:
            out["verdict"] = "NO_SELECTED_HANDLER"; return

        h = regs(); hpc = h.get("pc", 0); hoff = offof(hpc, base)
        out["selected_handler"] = {"entry_pc": hex(hpc), "entry_off": hex(hoff) if hoff is not None else None,
                                   "from_site": selected["site"], "op": selected["op"], "reg": selected["reg"],
                                   "target_off": selected["target_off"],
                                   "is_a8f70": hoff == CAND_A8F70,
                                   "regs": sub(h), "x0_mem": memd(h.get("x0", 0)), "x19_mem": memd(h.get("x19", 0))}
        out["a8f70_verdict"] = "CONFIRMED" if hoff == CAND_A8F70 else ("REFUTED handler=%s" % (hex(hoff) if hoff is not None else "extern"))
        print("SELECTED handler off=%s  a8f70? %s" % (out["selected_handler"]["entry_off"], hoff == CAND_A8F70), flush=True)
        out["verdict"] = "FLOW_CAPTURED"
    finally:
        cleanup()
        try: open(ART, "w").write(json.dumps(out, indent=2))
        except Exception: pass
        print("VERDICT:", out.get("verdict", "UNKNOWN"), flush=True)


if __name__ == "__main__":
    main()
