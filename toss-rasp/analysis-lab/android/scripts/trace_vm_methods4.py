#!/usr/bin/env python3
"""§98 probe5: trace the hidden-VM (DexGuard interpreter in anon module).

Two HW bps:
  A) afed8 entry (libea56, per-run base via loader hook)
  B) marshaller 0xebc639594984 (anon module, STABLE base across runs) — right
     after x19=[x1] (invocation object); per hit record idx=[x19+8],
     flags=[x19+4]. This yields the hidden-method invocation trace.

At the afed8(x0==4) stop: follow bridge-obj +0xa8 -> args area -> invocation
object; re-derive the bytecode stream via the same table chain the marshaller
uses; dump the invocation object and the method bytecode. Observation only.
"""
import json, signal, subprocess, sys, time
sys.path.insert(0, "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/analysis-lab/scripts")
from hvf_hwbreak_toy import RSP

ADB = "/Users/1004276/Library/Android/sdk/platform-tools/adb"
DEV = "localhost:5555"
LINKER_BASE = 0xebc8ffebf000
SOINFO_NOTIFY = LINKER_BASE + 0x68bb4
AFED8 = 0xafed8
MARSH_IDX = 0xebc639594984          # tbnz w8,#0x12 — x19 already loaded
THUNK_SLOT = 0xebc639e0d348         # -> table -> +0x10 -> dex-like struct
ART = "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/analysis-lab/artifacts/android/toss_vm_trace4.json"


def adb(*a):
    return subprocess.run([ADB, "-s", DEV] + list(a), capture_output=True, text=True)


def main():
    out = {"provenance": "runtime", "probe": "hidden-VM method trace"}
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
        return r.cmd("m%x,%x" % (va, n), 6)

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

    def u16(va):
        s = m(va, 2)
        try:
            return int.from_bytes(bytes.fromhex(s[:4]), "little") if len(s) >= 4 else None
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

    def resolve_stream(idx, chain, dbg=None):
        """Replicate the marshaller's method->stream resolution exactly:
        x24 = *(0xebc639e0d348); w0 = u32(0xebc639e0d010); x8 = *(w0+0x10);
        x10,x11 = *(x8+0x68); w9 = u16(x10+idx*8+2); w9 = (w9*12)&0xffffffff;
        x10b = *(x8+0x50); x8b = *(x8+0x18); w9b = u32(x11+w9);
        x9 = *(x10b + w9b*4); stream = x8b + x9
        """
        steps = {}
        a = u32(0xebc639e0d010)
        steps["w0"] = hex(a) if a is not None else None
        b = u64(a + 0x10) if a else None
        steps["x8"] = hex(b) if b else None
        x10 = u64(b + 0x68) if b else None
        x11 = u64(b + 0x68 + 8) if b else None
        steps["x10"] = hex(x10) if x10 else None
        steps["x11"] = hex(x11) if x11 else None
        w9 = u16(x10 + idx * 8 + 2) if x10 else None
        steps["w9_raw"] = hex(w9) if w9 is not None else None
        w9 = (w9 * 12) & 0xffffffff if w9 is not None else None
        x10b = u64(b + 0x50) if b else None
        x8b = u64(b + 0x18) if b else None
        steps["x10b"] = hex(x10b) if x10b else None
        steps["x8b"] = hex(x8b) if x8b else None
        w9b = u32(x11 + w9) if (x11 and w9 is not None) else None
        steps["w9b"] = hex(w9b) if w9b is not None else None
        x9 = u64(x10b + w9b * 4) if (x10b and w9b is not None) else None
        steps["x9"] = hex(x9) if x9 else None
        if dbg is not None:
            dbg.update(steps)
        return (x8b + x9) if (x8b and x9) else None

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
        dele(SOINFO_NOTIFY)
        rb1 = add(ent)
        log("Z1 afed8=%s (VM-trace bp NOT armed: too hot)" % rb1)

        vm = []          # hidden-VM method invocations
        afed8_ids = []   # afed8 entry ids
        poison = None
        timeouts = 0
        deadline = time.time() + 240
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
            if pc == ent:
                afed8_ids.append(gr.get("x0", 0))
                if gr.get("x0", 0) == 4:
                    log("*** afed8(4) after %d vm-invocations, %d prior afed8 ids ***" % (len(vm), len(afed8_ids) - 1))
                    x19b = gr.get("x19", 0) & 0x00FFFFFFFFFFFFFF
                    args_ptr = u64(x19b + 0xa8) & ~1  # tagged? plain stack ptr
                    invobj = u64(args_ptr) if args_ptr else None
                    idx4 = u32(invobj + 8) if invobj else None
                    fl4 = u32(invobj + 4) if invobj else None
                    log("bridge=%#x args=%s invobj=%s idx=%s flags=%s" %
                        (x19b, hex(args_ptr) if args_ptr else None,
                         hex(invobj) if invobj else None, idx4, hex(fl4 or 0)))
                    chain = {"t": u64(THUNK_SLOT)}  # kept for provenance
                    poison = {"t": round(time.time() - t0, 2),
                              "bridge": hex(x19b),
                              "args": hex(args_ptr) if args_ptr else None,
                              "invobj": hex(invobj) if invobj else None,
                              "invobj_idx": idx4, "invobj_flags": hex(fl4 or 0),
                              "invobj_dump": dump(invobj, 0x100) if invobj else None,
                              "thunk_slot_val": hex(chain["t"]) if chain["t"] else None}
                    dbg = {}
                    if idx4 is not None:
                        stream = resolve_stream(idx4, chain, dbg)
                        log("chain steps: %s" % dbg)
                        log("poison method stream = %s" % (hex(stream) if stream else None))
                        if stream:
                            poison["stream"] = hex(stream)
                            poison["bytecode"] = dump(stream, 0x400)
                    # last few vm entries for context
                    poison["vm_tail"] = vm[-24:]
                    out["poison"] = poison
                    out["verdict"] = "VM_POISON_CAPTURED"
                    break
            else:
                log("unexpected pc=%#x" % pc)
                continue
            dele(ent)
            r.cmd("s", 5)
            add(ent)

        out["vm_count"] = len(vm)
        out["vm_seq"] = [(v["idx"], v["flags"]) for v in vm]
        out["afed8_ids"] = afed8_ids
        if "verdict" not in out:
            out["verdict"] = "NO_ID4"
        log("vm invocations: %d ; afed8 ids seen: %s" % (len(vm), afed8_ids[:60]))
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
