#!/usr/bin/env python3
"""§98 probe2: deep capture at the afed8(x0=4) entry stop.

Extends trace_afed8_caller.py: on the x0==4 entry hit (guest frozen, in the
target process context):
  - callsite code window [caller-0x140, caller+0x20] for host disasm
  - page-walk down from the callsite to the caller module's ELF base
  - x29 frame-chain walk (caller's caller, 12 levels) with per-frame module
    classification (libea56 / caller-module / other)
  - dump of x1 target (stable 0xebc5400bxxxx object) and x2 monitor ctx
Also captures a comparison x29-walk on the first id=0 entry. Observation only.
"""
import json, signal, subprocess, sys, time
sys.path.insert(0, "/Users/1004276/Downloads/toss/toss-rasp/analysis-lab/scripts")
from hvf_hwbreak_toy import RSP

ADB = "/Users/1004276/Library/Android/sdk/platform-tools/adb"
DEV = "localhost:5555"
LINKER_BASE = 0xebc8ffebf000
SOINFO_NOTIFY = LINKER_BASE + 0x68bb4
AFED8 = 0xafed8
ART = "/Users/1004276/Downloads/toss/toss-rasp/analysis-lab/artifacts/android/toss_afed8_caller2.json"


def adb(*a):
    return subprocess.run([ADB, "-s", DEV] + list(a), capture_output=True, text=True)


def main():
    out = {"provenance": "runtime", "probe": "afed8 x0=4 deep caller capture"}
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
        return r.cmd("m%x,%x" % (va, n), 4)

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

    def dump(va, n):
        if not va:
            return None
        s = m(va, n)
        if s and not s.startswith("E") and len(s) >= n * 2:
            return s[:n * 2]
        return None

    def x29_walk(x29, base, mod_lo=None, mod_hi=None, levels=12):
        """Walk the FP chain: [fp]=next_fp, [fp+8]=lr. Classify each lr."""
        frames = []
        fp = x29
        seen = set()
        for _ in range(levels):
            if not fp or fp in seen or not (0x1000 < fp < 0xffffffffffff):
                break
            seen.add(fp)
            nfp = u64(fp)
            lr = u64(fp + 8)
            if lr is None:
                break
            if base <= lr < base + 0x300000:
                where, off = "libea56", hex(lr - base)
            elif mod_lo and mod_lo <= lr < mod_hi:
                where, off = "caller_module", hex(lr - mod_lo)
            else:
                where, off = "other", None
            frames.append({"fp": hex(fp), "lr": hex(lr), "where": where, "lr_off": off})
            if nfp is None or nfp <= fp:
                break
            fp = nfp
        return frames

    def elf_walk(caller, max_pages=8192):
        page = caller & ~0xFFF
        for i in range(1, max_pages + 1):
            va = page - i * 0x1000
            w = m(va, 4)
            if w == "7f454c46":
                return {"module_base": hex(va), "pages_below": i,
                        "span_to_callsite": hex(caller - va)}
            if w is None or w.startswith("E") or len(w) < 8:
                # unmapped page: cannot walk past a hole downwards safely
                return {"module_base": None, "stopped_at": hex(va), "reason": "unmapped"}
        return {"module_base": None, "reason": "max_pages"}

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
        ent = base + AFED8
        out["libea56_base"] = hex(base)
        log("libea56 base=%#x afed8=%#x" % (base, ent))
        dele(SOINFO_NOTIFY)
        log("Z1 afed8 -> %s" % add(ent))

        entries = []
        poison = None
        id0_walk_done = False
        timeouts = 0
        deadline = time.time() + 150
        while time.time() < deadline:
            stop = r.cmd("c", 25)
            if not stop or not stop.startswith("T"):
                timeouts += 1
                if poison or timeouts >= 3:
                    break
                continue
            timeouts = 0
            gr = regs()
            pc = gr.get("pc", 0)
            th = stop.split("thread:")[1].split(";")[0] if "thread:" in stop else "?"
            if pc != ent:
                log("unexpected pc=%#x" % pc)
                continue
            x0 = gr.get("x0", 0)
            rec = {"t": round(time.time() - t0, 2), "thread": th, "id": x0 & 0xffffffff,
                   "x0": hex(x0), "x1": hex(gr.get("x1", 0)), "x2": hex(gr.get("x2", 0)),
                   "x29": hex(gr.get("x29", 0)), "sp": hex(gr.get("sp", 0)),
                   "lr": hex(gr.get("x30", 0))}
            entries.append(rec)
            if x0 == 4:
                caller = gr.get("x30", 0) - 4
                rec["caller"] = hex(caller)
                log("*** POISON ENTRY: afed8(x0=4) caller=%#x th=%s sp=%s ***" % (caller, th, rec["sp"]))
                log("deep capture: code window...")
                rec["code_window"] = {"va": hex(caller - 0x140), "len": 0x160,
                                      "hex": dump(caller - 0x140, 0x160)}
                log("deep capture: ELF page-walk...")
                ew = elf_walk(caller)
                rec["elf_walk"] = ew
                log("  %s" % ew)
                mb = int(ew["module_base"], 16) if ew.get("module_base") else None
                log("deep capture: x29 chain walk...")
                rec["frames"] = x29_walk(gr.get("x29", 0), base,
                                         mb, (mb + 0x400000) if mb else None)
                for fr in rec["frames"]:
                    log("  fp=%s lr=%s %s+%s" % (fr["fp"], fr["lr"], fr["where"], fr["lr_off"]))
                log("deep capture: x1/x2 dumps...")
                rec["x1_dump"] = {"va": gr.get("x1", 0), "hex": dump(gr.get("x1", 0), 0x80)}
                x2 = gr.get("x2", 0)
                for cand in (x2 & 0x00FFFFFFFFFFFFFF, x2):
                    d = dump(cand, 0x100)
                    if d:
                        rec["x2_dump"] = {"va": hex(cand), "hex": d}
                        break
                poison = rec
                break  # captured; done
            else:
                if not id0_walk_done and len(entries) >= 1:
                    # comparison backtrace on the first id=0 entry (the 0xf8a98 wrapper)
                    rec["frames"] = x29_walk(gr.get("x29", 0), base)
                    id0_walk_done = True
                    for fr in rec["frames"]:
                        log("  id0 fp=%s lr=%s %s+%s" % (fr["fp"], fr["lr"], fr["where"], fr["lr_off"]))
            dele(ent)
            r.cmd("s", 5)
            add(ent)

        out["entries"] = entries
        out["poison"] = poison
        out["verdict"] = "POISON_DEEP_CAPTURED" if poison else "NO_ID4"
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
