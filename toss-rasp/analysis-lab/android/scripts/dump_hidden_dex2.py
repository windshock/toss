#!/usr/bin/env python3
"""§98 probe6: dump the hidden DEX image (module B) at the afed8(x0=4) stop.

The anon-module marshaller resolves method #3707 via standard DEX tables
(method_ids idx*8 / proto_ids 12B / string offsets) relative to a base pointer
(x8b) reached through: invobj[0] -> +0x10 -> [+0x10]. Dump [x8b, +0x200000)
chunk-wise so the whole hidden DEX lands on the host for offline parsing of
method 3707 (the afed8(4,..) invoker). Observation only. SIGTERM detaches.
"""
import json, signal, subprocess, sys, time
sys.path.insert(0, "/Users/1004276/Downloads/toss/toss-rasp/analysis-lab/scripts")
from hvf_hwbreak_toy import RSP

ADB = "/Users/1004276/Library/Android/sdk/platform-tools/adb"
DEV = "localhost:5555"
LINKER_BASE = 0xebc8ffebf000
SOINFO_NOTIFY = LINKER_BASE + 0x68bb4
AFED8 = 0xafed8
ART = "/Users/1004276/Downloads/toss/toss-rasp/analysis-lab/artifacts/android/toss_hidden_dex.json"
BIN = "/Users/1004276/Downloads/toss/toss-rasp/analysis-lab/artifacts/android/toss_hidden_dex.bin"
DEX_SIZE = 0x200000
CHUNK = 0x1000


def adb(*a):
    return subprocess.run([ADB, "-s", DEV] + list(a), capture_output=True, text=True)


def main():
    out = {"provenance": "runtime", "probe": "hidden DEX image dump"}
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

    t0 = time.time()
    try:
        adb("shell", "am force-stop viva.republica.toss")
        adb("shell", "nohup sh -c 'for i in $(seq 1 120); do am start -n viva.republica.toss/.splash.SplashActivity; sleep 2; done' >/dev/null 2>&1 &")
        time.sleep(1.5)
        r = RSP(1234)
        r.interrupt()
        add(SOINFO_NOTIFY)
        hit = r.cmd("c", 20)
        found = None
        ev = 0
        while hit and hit.startswith("T") and ev < 300:
            ev += 1
            gr = regs()
            si = gr.get("x0", 0)
            if "ea56" in " | ".join(names(si)):
                found = {"base": u64(si + 0x100)}
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
        dele(SOINFO_NOTIFY)
        log("libea56 base=%#x ; Z1 afed8 -> %s" % (base, add(ent)))

        deadline = time.time() + 240
        timeouts = 0
        while time.time() < deadline:
            stop = r.cmd("c", 25)
            if not stop or not stop.startswith("T"):
                timeouts += 1
                if timeouts >= 3:
                    break
                continue
            timeouts = 0
            gr = regs()
            if gr.get("pc") != ent:
                log("unexpected pc=%#x" % gr.get("pc", 0))
                continue
            if gr.get("x0") != 4:
                dele(ent)
                r.cmd("s", 5)
                add(ent)
                continue
            x19b = gr.get("x19", 0) & 0x00FFFFFFFFFFFFFF
            log("raw x19=%#x ; dump bridge:" % gr.get("x19", 0))
            bd = m(x19b, 0x100)
            log("  bridge[0:0x100]=%s" % (bd[:64] + "..." if bd else None))
            if bd:
                bb = bytes.fromhex(bd)
                for o in (0x98, 0xa0, 0xa8, 0xb0, 0xc0, 0xc8):
                    log("  +%#x: %016x" % (o, int.from_bytes(bb[o:o+8], 'little')))
            args_ptr = u64(x19b + 0xa8)
            if args_ptr:
                log("args_ptr raw=%#x masked=%#x" % (args_ptr, args_ptr & 0x00FFFFFFFFFFFFFF & ~1))
            args_ptr = (args_ptr or 0) & 0x00FFFFFFFFFFFFFF & ~1
            invobj = u64(args_ptr) if args_ptr else None
            if invobj:
                log("invobj raw=%#x masked=%#x" % (invobj, invobj & 0x00FFFFFFFFFFFFFF & ~1))
                invobj = invobj & 0x00FFFFFFFFFFFFFF & ~1
            hdr = u32(invobj) if invobj else None
            a = u32(hdr + 0x10) if hdr else None
            x8b = u64(a + 0x10) if a else None
            idx = u32(invobj + 8) if invobj else None
            log("*** afed8(4): invobj=%s idx=%s dex_base=%s ***" %
                (hex(invobj) if invobj else None, idx, hex(x8b) if x8b else None))
            if not x8b:
                out["verdict"] = "NO_DEX_BASE"
                break
            out.update({"libea56_base": hex(base), "invobj": hex(invobj),
                        "method_idx": idx, "dex_base": hex(x8b)})
            # chunk dump the DEX image
            t_start = time.time()
            fh = open(BIN, "wb")
            bad = 0
            for off in range(0, DEX_SIZE, CHUNK):
                va = x8b + off
                s = m(va, CHUNK)
                if s and not s.startswith("E") and len(s) >= CHUNK * 2:
                    fh.write(bytes.fromhex(s[:CHUNK * 2]))
                else:
                    fh.write(b"\x00" * CHUNK)  # unmapped tail: pad
                    bad += 1
            fh.close()
            log("dumped %#x bytes in %.1fs (bad chunks: %d)" % (DEX_SIZE, time.time() - t_start, bad))
            out["dex_dump"] = {"bin": BIN, "size": DEX_SIZE, "bad_chunks": bad,
                               "dump_seconds": round(time.time() - t_start, 1)}
            # header probe
            out["dex_header_hex"] = m(x8b, 0x70)
            out["verdict"] = "HIDDEN_DEX_DUMPED"
            break
        if "verdict" not in out:
            out["verdict"] = "NO_ID4"
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
