#!/usr/bin/env python3
"""§99 probeF: boot-robust capture of the scratch[0]=4 writer.

Addresses drift per boot/incarnation, so everything is discovered at runtime:
 1. loader hook (NEW linker base read from guest maps) -> libea56 base(s)
 2. at the first afed8 id0 stop: scan libea56 RW + stack + ctx-heap for a
    pointer P whose [P+0x186c70] == bridge-1 code signature -> module base
 3. bp bridge-1 (base+0x186c70); filter invocation idx [x0+8]==0xe7b (R)
 4. Z2 write-watch scratch0 = sp-0x14e0 during the killing dispatch;
    record every write PC/regs; end at afed8(x0==4)."""
import json, signal, subprocess, sys, time
sys.path.insert(0, "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/analysis-lab/scripts")
from hvf_hwbreak_toy import RSP

ADB = "/Users/1004276/Library/Android/sdk/platform-tools/adb"
DEV = "localhost:5555"
# NEW boot linker base (read 2026-09-28 after reboot):
LINKER_BASE = 0xe685932b7000
SOINFO_NOTIFY = LINKER_BASE + 0x68bb4
AFED8 = 0xafed8
BRIDGE1_OFF = 0x186c70           # within the interpreter module (fixed content)
SIG = "ff8303d11083bcb0"         # sub sp,#0xe0; stp d0,d1,[sp,#0x10] @ bridge-1
R_IDX = 0xe7b
ART = "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/analysis-lab/artifacts/android/toss_v9_probeF.json"


def adb(*a):
    return subprocess.run([ADB, "-s", DEV] + list(a), capture_output=True, text=True)


def main():
    out = {"provenance": "runtime", "probe": "boot-robust scratch0 writer"}
    active = set()
    r = None
    lines = []
    SLOT = [None]

    def log(s):
        lines.append(s)
        print(s, flush=True)

    def cleanup():
        if not r:
            return
        try:
            for bp in list(active):
                r.cmd("z1,%x,4" % bp, 2)
            if SLOT[0]:
                r.cmd("z2,%x,8" % SLOT[0], 2)
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
        return r.cmd("m%x,%x" % (va, n), 8)

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

    def mbytes(va, n):
        s = m(va, n)
        if s and not s.startswith("E") and len(s) >= n * 2:
            return bytes.fromhex(s[:n * 2])
        return None

    def discover_module(lib_base, gr):
        """scan libea56 RW + stack + ctx heap for the interpreter module base."""
        regions = []
        regions.append((lib_base + 0x174000, 0x210))       # tail RW-ish
        regions.append((lib_base + 0x17c000, 0x400))       # RW data sample
        sp = gr.get("sp", 0)
        regions.append((sp - 0x400, 0x600))                # stack window
        x19 = gr.get("x19", 0) & 0x00FFFFFFFFFFFFFF
        if x19:
            regions.append((x19 - 0x200, 0x400))           # ctx heap window
        cands = set()
        for base_va, ln in regions:
            b = mbytes(base_va, ln)
            if not b:
                continue
            for i in range(0, len(b) - 8, 8):
                q = int.from_bytes(b[i:i + 8], "little")
                if 0xE00000000000 <= q < 0xF00000000000:
                    cands.add(q & ~0xFFF)
        log("discovery: %d page candidates" % len(cands))
        for c in sorted(cands):
            s = m(c + BRIDGE1_OFF, 8)
            if s == SIG:
                log("*** interpreter module base = %#x (sig match) ***" % c)
                return c
        return None

    t0 = time.time()
    try:
        adb("shell", "am force-stop viva.republica.toss")
        adb("shell", "nohup sh -c 'for i in $(seq 1 120); do am start -n viva.republica.toss/.splash.SplashActivity; sleep 2; done' >/dev/null 2>&1 &")
        time.sleep(1.5)
        r = RSP(1234)
        r.interrupt()
        add(SOINFO_NOTIFY)
        hit = r.cmd("c", 20)
        bases = []
        ev = 0
        while hit and hit.startswith("T") and ev < 900 and time.time() - t0 < 90:
            ev += 1
            gr = regs()
            si = gr.get("x0", 0)
            if "ea56" in " | ".join(names(si)):
                nb = u64(si + 0x100)
                if nb and nb not in bases and len(bases) < 4:
                    bases.append(nb)
                    log("libea56 base #%d = %#x" % (len(bases), nb))
            dele(SOINFO_NOTIFY)
            r.cmd("s", 5)
            add(SOINFO_NOTIFY)
            hit = r.cmd("c", 20)
        if not bases:
            out["verdict"] = "NO_LIBEA56"
            return
        ents = set()
        for b in bases:
            e = b + AFED8
            if add(e) == "OK":
                ents.add(e)
        rs = add(SOINFO_NOTIFY)
        log("afed8 armed x%d ; soinfo=%s" % (len(ents), rs))

        module_base = None
        bridge1 = None
        anchored = False
        writes = []
        n_id0 = 0
        timeouts = 0
        deadline = time.time() + 420
        while time.time() < deadline:
            stop = r.cmd("c", 25)
            if not stop or not stop.startswith("T"):
                timeouts += 1
                if anchored or timeouts >= 3:
                    break
                continue
            timeouts = 0
            gr = regs()
            pc = gr.get("pc", 0)
            th = stop.split("thread:")[1].split(";")[0] if "thread:" in stop else "?"
            if pc == SOINFO_NOTIFY:
                si = gr.get("x0", 0)
                if "ea56" in " | ".join(names(si)):
                    nb = u64(si + 0x100)
                    if nb and (nb + AFED8) not in ents and len(ents) < 4:
                        if add(nb + AFED8) == "OK":
                            ents.add(nb + AFED8)
                            log("extra libea56 base %#x (total %d)" % (nb, len(ents)))
                dele(SOINFO_NOTIFY)
                r.cmd("s", 5)
                add(SOINFO_NOTIFY)
                continue
            if bridge1 and pc == bridge1 and not anchored:
                inv = gr.get("x0", 0) & 0x00FFFFFFFFFFFFFF
                idx = u32(inv + 8) if inv else None
                if idx == R_IDX:
                    anchored = True
                    sp = gr.get("sp", 0)
                    scratch0 = sp - 0x14e0
                    SLOT[0] = scratch0
                    out["anchor"] = {"t": round(time.time() - t0, 3), "sp": hex(sp),
                                     "invobj": hex(inv), "scratch0": hex(scratch0)}
                    log("*** R DISPATCH: sp=%s inv=%s scratch0=%s ***" %
                        (hex(sp), hex(inv), hex(scratch0)))
                    wz = r.cmd("Z2,%x,8" % scratch0, 3)
                    out["watch_armed"] = (wz == "OK")
                    log("Z2 -> %s" % wz)
                    dele(bridge1)
                for e in ents:
                    dele(e)
                r.cmd("s", 5)
                for e in ents:
                    add(e)
                continue
            if pc in ents:
                if gr.get("x0", 0) == 4:
                    out["afed8_4"] = {"t": round(time.time() - t0, 3)}
                    log("*** afed8(4) reached after %d writes ***" % len(writes))
                    break
                n_id0 += 1
                if module_base is None and n_id0 >= 1:
                    # first id0 stop: discover the interpreter module
                    module_base = discover_module(bases[0], gr)
                    if module_base:
                        bridge1 = module_base + BRIDGE1_OFF
                        log("bridge1 = %#x -> %s" % (bridge1, add(bridge1)))
                    else:
                        log("module discovery failed at id0#%d (will retry next id0)" % n_id0)
                        module_base = None  # retry at next id0
                for e in ents:
                    dele(e)
                r.cmd("s", 5)
                for e in ents:
                    add(e)
                continue
            if anchored:
                # watchpoint stop
                slotval = u64(SLOT[0]) if SLOT[0] else None
                rec = {"t": round(time.time() - t0, 3), "pc": hex(pc), "th": th,
                       "slot_after": hex(slotval) if slotval is not None else None,
                       "x0": hex(gr.get("x0", 0)), "x1": hex(gr.get("x1", 0)),
                       "x2": hex(gr.get("x2", 0)), "x3": hex(gr.get("x3", 0)),
                       "x4": hex(gr.get("x4", 0)), "x8": hex(gr.get("x8", 0)),
                       "x9": hex(gr.get("x9", 0)), "x19": hex(gr.get("x19", 0)),
                       "x20": hex(gr.get("x20", 0)), "x21": hex(gr.get("x21", 0)),
                       "x22": hex(gr.get("x22", 0)), "sp": hex(gr.get("sp", 0))}
                writes.append(rec)
                log("W#%d pc=%s slot=%s x0=%s x2=%s x9=%s x20=%s" %
                    (len(writes), rec["pc"], rec["slot_after"], rec["x0"], rec["x2"], rec["x9"], rec["x20"]))
                for e in ents:
                    dele(e)
                r.cmd("s", 5)
                for e in ents:
                    add(e)
            else:
                log("unexpected pc=%#x" % pc)
                continue

        out["n_id0"] = n_id0
        out["module_base"] = hex(module_base) if module_base else None
        out["writes"] = writes
        out["verdict"] = ("WATCH4" if any(w.get("slot_after") == hex(4) for w in writes)
                          else ("WATCH" if writes else
                          ("ANCHORED_NO_AFED8" if anchored else
                          ("MODULE_NOT_FOUND" if bridge1 is None else "NO_R_DISPATCH"))))
    finally:
        cleanup()
        try:
            open(ART, "w").write(json.dumps(out, indent=2))
        except Exception:
            pass
        open(ART.replace(".json", ".txt"), "w").write("\n".join(lines) + "\n")
        print("VERDICT:", out.get("verdict"), "id0:", out.get("n_id0"),
              "module:", out.get("module_base"), "writes:", len(out.get("writes", [])), flush=True)


if __name__ == "__main__":
    main()
