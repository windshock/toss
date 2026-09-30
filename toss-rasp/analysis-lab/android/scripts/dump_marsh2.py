#!/usr/bin/env python3
"""§99 probeA: dump the SECOND marshaller/thunk bridge code (0x4586c4, 0x6b30)
at the first afed8 id0 stop (anon module is mapped in-context), then confirm
the anchor by continuing to afed8(x0==4). Observation only. SIGTERM detaches."""
import json, signal, subprocess, sys, time
sys.path.insert(0, "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/analysis-lab/scripts")
from hvf_hwbreak_toy import RSP

ADB = "/Users/1004276/Library/Android/sdk/platform-tools/adb"
DEV = "localhost:5555"
LINKER_BASE = 0xebc8ffebf000
SOINFO_NOTIFY = LINKER_BASE + 0x68bb4
AFED8 = 0xafed8
MARSH2 = 0xebc6394586c4
THUNK = 0xebc639586b30
SLOT = 0xebc639e0d348
ART = "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/analysis-lab/artifacts/android/toss_marsh2_code.json"


def adb(*a):
    return subprocess.run([ADB, "-s", DEV] + list(a), capture_output=True, text=True)


def main():
    out = {"provenance": "runtime", "probe": "second marshaller code dump"}
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
        dumped = False
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
            x0 = gr.get("x0", 0)
            if not dumped:
                # first afed8 stop: anon module mapped in-context -> dump bridge2/marsh2
                out["marsh2_code"] = {"va": hex(MARSH2), "hex": dump(MARSH2, 0x2000)}
                out["thunk_code"] = {"va": hex(THUNK), "hex": dump(THUNK, 0x200)}
                t = u64(SLOT)
                out["slot_chain"] = {"slot": hex(SLOT), "t": hex(t) if t else None,
                                     "t_deref0": hex(u64(t)) if t and u64(t) else None,
                                     "t_deref10": hex(u64(t + 0x10)) if t and u64(t + 0x10) else None}
                log("dumped marsh2/thunk: %s / %s bytes ; slot chain %s" %
                    (len(out["marsh2_code"]["hex"]) // 2 if out["marsh2_code"]["hex"] else 0,
                     len(out["thunk_code"]["hex"]) // 2 if out["thunk_code"]["hex"] else 0,
                     out["slot_chain"]))
                dumped = True
            if x0 == 4:
                x19b = gr.get("x19", 0) & 0x00FFFFFFFFFFFFFF
                out["poison_anchor"] = {"t": round(time.time() - t0, 2), "x19bridge": hex(x19b),
                                        "sp": hex(gr.get("sp", 0))}
                log("*** afed8(4) anchor confirmed (bridge=%s sp=%s) ***" %
                    (out["poison_anchor"]["x19bridge"], out["poison_anchor"]["sp"]))
                out["verdict"] = "MARSH2_CODE_DUMPED_ANCHOR_CONFIRMED"
                break
            dele(ent)
            r.cmd("s", 5)
            add(ent)
        if "verdict" not in out:
            out["verdict"] = "DUMPED_NO_ANCHOR" if dumped else "NO_HITS"
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
