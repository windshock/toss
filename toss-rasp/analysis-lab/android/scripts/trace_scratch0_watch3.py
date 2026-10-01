#!/usr/bin/env python3
"""§99 probeD: catch the writer of scratch[0]=4 (outgoing x0) in marshaller-1.

Anchor: bp at bridge-1 entry (0xebc639586c70). The killing dispatch enters
with x0 = R's invocation object (0xebc5400b3a90, stable across runs). At that
stop arm Z2 (8B) on scratch slot0 = sp-0x14e0 (bridge-1 subs 0xe0 then 0x1400)
and record every write (PC + regs). Ends at afed8(x0==4). Observation only."""
import json, signal, subprocess, sys, time
sys.path.insert(0, "/Users/1004276/Downloads/toss/toss-rasp/analysis-lab/scripts")
from hvf_hwbreak_toy import RSP

ADB = "/Users/1004276/Library/Android/sdk/platform-tools/adb"
DEV = "localhost:5555"
LINKER_BASE = 0xebc8ffebf000
SOINFO_NOTIFY = LINKER_BASE + 0x68bb4
AFED8 = 0xafed8
BRIDGE1 = 0xebc639586c70
R_INVOBJ = 0xebc5400b3a90
ART = "/Users/1004276/Downloads/toss/toss-rasp/analysis-lab/artifacts/android/toss_scratch0_watch3.json"


def adb(*a):
    return subprocess.run([ADB, "-s", DEV] + list(a), capture_output=True, text=True)


def main():
    out = {"provenance": "runtime", "probe": "scratch0 writer watch"}
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
        ra, rb = add(ent), add(BRIDGE1)
        log("libea56 base=%#x ; Z1 afed8=%s ; Z1 bridge1=%s ; code=%s" %
            (base, ra, rb, m(BRIDGE1, 4)))

        anchored = False
        writes = []
        b1_hits = 0
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
            if pc == BRIDGE1 and not anchored:
                b1_hits += 1
                if b1_hits <= 3 or b1_hits % 500 == 0:
                    log("b1#%d x0=%s" % (b1_hits, hex(gr.get("x0", 0))))
                if (gr.get("x0", 0) & 0x00FFFFFFFFFFFFFF) == R_INVOBJ:
                    anchored = True
                    sp = gr.get("sp", 0)
                    scratch0 = sp - 0x14e0
                    SLOT[0] = scratch0
                    out["anchor"] = {"t": round(time.time() - t0, 3), "b1_hit": b1_hits,
                                     "sp": hex(sp), "scratch0": hex(scratch0),
                                     "x19bridge": hex(gr.get("x19", 0)),
                                     "x1": hex(gr.get("x1", 0)), "x2": hex(gr.get("x2", 0))}
                    log("*** KILLING BRIDGE-1 ENTRY (hit#%d): sp=%s scratch0=%s x19=%s x1=%s x2=%s ***" %
                        (b1_hits, hex(sp), hex(scratch0), anchor_x19 := hex(gr.get("x19", 0)),
                         hex(gr.get("x1", 0)), hex(gr.get("x2", 0))))
                    wz = r.cmd("Z2,%x,8" % scratch0, 3)
                    log("Z2 scratch0 -> %s" % wz)
                    out["watch_armed"] = (wz == "OK")
                    dele(BRIDGE1)  # don't need more bridge hits
                dele(ent)
                r.cmd("s", 5)
                add(ent)
                continue
            if pc == ent:
                if gr.get("x0", 0) == 4:
                    out["afed8_4"] = {"t": round(time.time() - t0, 3), "sp": hex(gr.get("sp", 0))}
                    log("*** afed8(4) reached after %d writes ***" % len(writes))
                    break
                dele(ent)
                r.cmd("s", 5)
                add(ent)
                continue
            # watchpoint stop
            slotval = u64(SLOT[0]) if SLOT[0] else None
            rec = {"t": round(time.time() - t0, 3), "pc": hex(pc), "th": th,
                   "slot_after": hex(slotval) if slotval is not None else None,
                   "x0": hex(gr.get("x0", 0)), "x1": hex(gr.get("x1", 0)),
                   "x2": hex(gr.get("x2", 0)), "x3": hex(gr.get("x3", 0)),
                   "x4": hex(gr.get("x4", 0)), "x5": hex(gr.get("x5", 0)),
                   "x8": hex(gr.get("x8", 0)), "x9": hex(gr.get("x9", 0)),
                   "x10": hex(gr.get("x10", 0)), "x19": hex(gr.get("x19", 0)),
                   "x20": hex(gr.get("x20", 0)), "x21": hex(gr.get("x21", 0)),
                   "x22": hex(gr.get("x22", 0)), "x23": hex(gr.get("x23", 0)),
                   "sp": hex(gr.get("sp", 0))}
            writes.append(rec)
            log("W#%d pc=%s slot=%s x0=%s x2=%s x9=%s x20=%s x21=%s" %
                (len(writes), rec["pc"], rec["slot_after"], rec["x0"], rec["x2"], rec["x9"], rec["x20"], rec["x21"]))
            dele(ent)
            r.cmd("s", 5)
            add(ent)

        out["b1_hits"] = b1_hits
        out["writes"] = writes
        out["verdict"] = ("WATCH4_CAPTURED" if any(w.get("slot_after") == hex(4) for w in writes)
                          else ("WATCH_CAPTURED" if writes and out.get("afed8_4") else
                          ("ANCHORED_NO_AFED8" if anchored else "NO_ANCHOR")))
    finally:
        cleanup()
        try:
            open(ART, "w").write(json.dumps(out, indent=2))
        except Exception:
            pass
        open(ART.replace(".json", ".txt"), "w").write("\n".join(lines) + "\n")
        print("VERDICT:", out.get("verdict"), "b1_hits:", out.get("b1_hits"),
              "writes:", len(out.get("writes", [])), flush=True)


if __name__ == "__main__":
    main()
