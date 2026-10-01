#!/usr/bin/env python3
"""§97 probe: afed8 dispatch-state time-series at 0xb02ac (br x10).

Arms BOTH HW bps simultaneously in the traced libea56 incarnation:
  base+0xb02ac  br x10   OLLVM flattening dispatch; state w8(=w0) -> u16 tbl
                       @0x2c9c6 -> x10 = 0xb019c + 4*tbl[w8]
  base+0xb02c4  blr x8   handler call (mov x0,x19; mov w1,w4; mov w2,w5 before it)

Per hit we record: seq, rsp thread id, host time, pc, x19(context), w8 state,
x10 target(+off), w4/w5, x0/x1/x2, sp; and validate the process incarnation at
EVERY hit (ELF magic at libea56 base + exact code bytes at PC) so the causal
chain is one process/thread/context, never stitched across samples.
Context memory (x19, tag-masked) is snapshotted per hit for the pre-poison diff.

Observation only. SIGTERM/SIGINT always detach (else guest freezes).
"""
import json, signal, subprocess, sys, time
sys.path.insert(0, "/Users/1004276/Downloads/toss/toss-rasp/analysis-lab/scripts")
from hvf_hwbreak_toy import RSP

ADB = "/Users/1004276/Library/Android/sdk/platform-tools/adb"
DEV = "localhost:5555"
LINKER_BASE = 0xebc8ffebf000
SOINFO_NOTIFY = LINKER_BASE + 0x68bb4
B02AC = 0xb02ac
B02C4 = 0xb02c4
POISON = 0x95224
BR_X10 = "4001 1fd6".replace(" ", "")   # d61f0140 le -> "40011fd6"
BLR_X8 = "0001 3fd6".replace(" ", "")   # d63f0100 le -> "00013fd6"
MAX_HITS = 600
ART = "/Users/1004276/Downloads/toss/toss-rasp/analysis-lab/artifacts/android/toss_b02ac_states.json"
TXT = "/Users/1004276/Downloads/toss/toss-rasp/analysis-lab/artifacts/android/toss_b02ac_states.txt"


def adb(*a):
    return subprocess.run([ADB, "-s", DEV] + list(a), capture_output=True, text=True)


def main():
    out = {"provenance": "runtime", "probe": "b02ac dispatch-state time-series",
           "sites": {"b02ac": hex(B02AC), "b02c4": hex(B02C4), "poison_handler": hex(POISON)}}
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

    def ctx_snap(x19, n=256):
        if not x19:
            return None
        for va in (x19 & 0x00FFFFFFFFFFFFFF, x19):
            s = m(va, n)
            if s and not s.startswith("E") and len(s) >= n * 2:
                return {"va": hex(va), "hex": s[:n * 2]}
        return None

    t0 = time.time()
    try:
        adb("shell", "am force-stop viva.republica.toss")
        adb("shell", "nohup sh -c 'for i in $(seq 1 90); do am start -n viva.republica.toss/.splash.SplashActivity; sleep 2; done' >/dev/null 2>&1 &")
        time.sleep(1.5)
        r = RSP(1234)
        r.interrupt()
        log("catching libea56 load via soinfo notify...")
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
        ac, cc = base + B02AC, base + B02C4
        out.update({"libea56_base": hex(base), "libea56_soinfo": hex(found["soinfo"]),
                    "b02ac_va": hex(ac), "b02c4_va": hex(cc), "load_t": round(time.time() - t0, 2)})
        log("libea56 base=%#x  b02ac=%#x  b02c4=%#x" % (base, ac, cc))
        dele(SOINFO_NOTIFY)

        ra, rc = add(ac), add(cc)
        log("Z1 b02ac -> %s ; Z1 b02c4 -> %s" % (ra, rc))
        if ra != "OK":
            out["verdict"] = "BP_ARM_FAIL"
            return

        seq = 0
        poison = None
        timeouts = 0
        hits = []
        trace = []
        last_ctx_hex = None
        deadline = time.time() + 150

        while seq < MAX_HITS and time.time() < deadline:
            stop = r.cmd("c", 25)
            if not stop or not stop.startswith("T"):
                timeouts += 1
                if poison or timeouts >= 3:
                    log("stop=%r (timeouts=%d) -> ending trace" % (stop, timeouts))
                    break
                continue
            timeouts = 0
            gr = regs()
            pc = gr.get("pc", 0)
            th = stop.split("thread:")[1].split(";")[0] if "thread:" in stop else "?"
            if pc not in (ac, cc):
                log("stop at unexpected pc=%#x (off %s) thread=%s" %
                    (pc, hex(pc - base) if base <= pc < base + 0x300000 else "n/a", th))
                continue  # not our site (e.g. stale VA in a new incarnation); bps untouched
            # incarnation + code validation at every hit
            magic = m(base, 4)
            code = m(pc, 4)
            ok_elf = magic == "7f454c46"
            ok_code = code == (BR_X10 if pc == ac else BLR_X8)
            seq += 1
            rec = {"seq": seq, "t": round(time.time() - t0, 2), "thread": th,
                   "site": "b02ac" if pc == ac else "b02c4",
                   "pc": hex(pc),
                   "x19": hex(gr.get("x19", 0)),
                   "x8": hex(gr.get("x8", 0)), "w8": hex(gr.get("x8", 0) & 0xffffffff),
                   "x10": hex(gr.get("x10", 0)), "x10_off": hex(gr.get("x10", 0) - base),
                   "x0": hex(gr.get("x0", 0)), "w0": hex(gr.get("x0", 0) & 0xffffffff),
                   "x1": hex(gr.get("x1", 0)), "w1": hex(gr.get("x1", 0) & 0xffffffff),
                   "x2": hex(gr.get("x2", 0)), "w2": hex(gr.get("x2", 0) & 0xffffffff),
                   "x4": hex(gr.get("x4", 0)), "w4": hex(gr.get("x4", 0) & 0xffffffff),
                   "x5": hex(gr.get("x5", 0)), "w5": hex(gr.get("x5", 0) & 0xffffffff),
                   "x9": hex(gr.get("x9", 0)), "x12": hex(gr.get("x12", 0)),
                   "sp": hex(gr.get("sp", 0)),
                   "valid": {"elf": ok_elf, "code": ok_code}}
            if pc == ac:
                snap = ctx_snap(gr.get("x19", 0))
                if snap:
                    rec["ctx"] = snap
            else:
                x8 = gr.get("x8", 0)
                rec["handler_off"] = hex(x8 - base) if base <= x8 < base + 0x300000 else None
                rec["wiring"] = {"x0_eq_x19": gr.get("x0") == gr.get("x19"),
                                 "w1_eq_w4": (gr.get("x1", 0) & 0xffffffff) == (gr.get("x4", 0) & 0xffffffff),
                                 "w2_eq_w5": (gr.get("x2", 0) & 0xffffffff) == (gr.get("x5", 0) & 0xffffffff)}
                rec["ctx"] = ctx_snap(gr.get("x19", 0), 512)
                if x8 - base == POISON:
                    poison = rec
                    log("*** POISON SELECTION at seq=%d: x8=base+0x95224, wiring=%s ***" %
                        (seq, rec["wiring"]))
            hits.append(rec)
            trace.append("#%d t=%.1f th=%s %s w8=%s x10_off=%s x19=%s w4=%s w5=%s elf=%d code=%d" %
                         (seq, rec["t"], th, rec["site"], rec["w8"], rec.get("x10_off"),
                          rec["x19"], rec["w4"], rec["w5"], ok_elf, ok_code))
            # step over the bp insn with both bps removed, then re-arm
            dele(ac)
            dele(cc)
            sp1 = r.cmd("s", 5)
            post = regs()
            if pc == cc and poison is rec:
                log("post-step pc=%#x (handler entry off %s) x0=%s w1=%s w2=%s stop=%r" %
                    (post.get("pc", 0),
                     hex(post.get("pc", 0) - base) if base <= post.get("pc", 0) < base + 0x300000 else "?",
                     hex(post.get("x0", 0)), hex(post.get("x1", 0) & 0xffffffff),
                     hex(post.get("x2", 0) & 0xffffffff), sp1))
                poison["handler_entry"] = {"pc": hex(post.get("pc", 0)),
                                           "pc_off": hex(post.get("pc", 0) - base) if base <= post.get("pc", 0) < base + 0x300000 else None,
                                           "x0": hex(post.get("x0", 0)),
                                           "w1": hex(post.get("x1", 0) & 0xffffffff),
                                           "w2": hex(post.get("x2", 0) & 0xffffffff)}
            add(ac)
            add(cc)

        out["hits"] = hits
        out["n_hits"] = len(hits)
        out["trace"] = trace
        out["poison_seq"] = poison["seq"] if poison else None
        out["poison_rec"] = poison
        out["verdict"] = ("POISON_CHAIN_CAPTURED" if poison else
                          ("TRACE_NO_POISON" if hits else "NO_HITS"))
        for ln in trace:
            log(ln)
    finally:
        cleanup()
        try:
            open(ART, "w").write(json.dumps(out, indent=2))
            open(TXT, "w").write("\n".join(lines) + "\n")
        except Exception:
            pass
        print("VERDICT:", out.get("verdict"), "hits:", out.get("n_hits"),
              "poison_seq:", out.get("poison_seq"), flush=True)


if __name__ == "__main__":
    main()
