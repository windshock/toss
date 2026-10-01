#!/usr/bin/env python3
"""§99 probeC: catch the exact writer of outgoing x0=4 via write-watchpoint.

At thunk entry (0x6b30) x0 = invocation object ([x0+8] = method idx). When
idx==0xe7b (R — invoked exactly once per run = the kill), arm Z2 write
watchpoint on args slot0 (= thunk-entry sp - 0xe0) and record every write:
PC, value written (source reg at stop), plus key registers. Ends at afed8
entry. Observation only. SIGTERM detaches."""
import json, signal, subprocess, sys, time
sys.path.insert(0, "/Users/1004276/Downloads/toss/toss-rasp/analysis-lab/scripts")
from hvf_hwbreak_toy import RSP

ADB = "/Users/1004276/Library/Android/sdk/platform-tools/adb"
DEV = "localhost:5555"
LINKER_BASE = 0xebc8ffebf000
SOINFO_NOTIFY = LINKER_BASE + 0x68bb4
AFED8 = 0xafed8
THUNK = 0xebc639586b30
R_IDX = 0xe7b
ART = "/Users/1004276/Downloads/toss/toss-rasp/analysis-lab/artifacts/android/toss_v9_watch.json"


def adb(*a):
    return subprocess.run([ADB, "-s", DEV] + list(a), capture_output=True, text=True)


def main():
    out = {"provenance": "runtime", "probe": "R-dispatch slot0 watchpoint"}
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
            r.cmd("z2,%x,8" % SLOT[0], 2) if SLOT[0] else None
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
    SLOT = [None]

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
        log("libea56 base=%#x" % base)
        ra, rb = add(ent), add(THUNK)
        log("Z1 afed8=%s ; Z1 thunk=%s ; thunk code=%s" % (ra, rb, m(THUNK, 4)))

        watch_armed = False
        writes = []
        thunk_hits = 0
        r_dispatch = None
        timeouts = 0
        deadline = time.time() + 300
        while time.time() < deadline:
            stop = r.cmd("c", 25)
            if not stop or not stop.startswith("T"):
                timeouts += 1
                if r_dispatch or timeouts >= 3:
                    break
                continue
            timeouts = 0
            gr = regs()
            pc = gr.get("pc", 0)
            th = stop.split("thread:")[1].split(";")[0] if "thread:" in stop else "?"
            if pc == THUNK:
                thunk_hits += 1
                inv = gr.get("x0", 0) & 0x00FFFFFFFFFFFFFF
                idx = u32(inv + 8) if inv else None
                if idx == R_IDX:
                    r_dispatch = {"t": round(time.time() - t0, 3), "thunk_sp": hex(gr.get("sp", 0)),
                                  "invobj": hex(inv), "x19bridge": hex(gr.get("x19", 0)),
                                  "x1": hex(gr.get("x1", 0)), "x2": hex(gr.get("x2", 0))}
                    log("*** R DISPATCH at thunk#%d: sp=%s inv=%s x19=%s x1=%s x2=%s ***" %
                        (thunk_hits, r_dispatch["thunk_sp"], r_dispatch["invobj"],
                         r_dispatch["x19bridge"], r_dispatch["x1"], r_dispatch["x2"]))
                    slot0 = gr.get("sp", 0) - 0xe0
                    SLOT[0] = slot0
                    wz = r.cmd("Z2,%x,8" % slot0, 3)
                    log("Z2 watch slot0=%#x -> %s" % (slot0, wz))
                    watch_armed = (wz == "OK")
                    out["watch_armed"] = watch_armed
                    if not watch_armed:
                        log("Z2 unsupported -> aborting trace (bailing cleanly)")
                        break
                # step over thunk entry (its own str x16,[sp] will trigger watch)
                dele(THUNK)
                dele(ent)
                r.cmd("s", 5)
                add(ent)
                if r_dispatch is None:
                    add(THUNK)
                continue
            if pc == ent:
                log("afed8 entry x0=%s" % gr.get("x0", 0))
                if gr.get("x0", 0) == 4:
                    out["afed8_4"] = {"t": round(time.time() - t0, 3), "sp": hex(gr.get("sp", 0))}
                    log("*** afed8(4) reached — writes captured: %d ***" % len(writes))
                    break
                dele(ent)
                r.cmd("s", 5)
                add(ent)
                continue
            # watchpoint stop (pc arbitrary)
            slotval = u64(SLOT[0])
            rec = {"t": round(time.time() - t0, 3), "pc": hex(pc), "th": th,
                   "slot0_after": hex(slotval) if slotval is not None else None,
                   "x0": hex(gr.get("x0", 0)), "x1": hex(gr.get("x1", 0)),
                   "x2": hex(gr.get("x2", 0)), "x3": hex(gr.get("x3", 0)),
                   "x4": hex(gr.get("x4", 0)), "x8": hex(gr.get("x8", 0)),
                   "x9": hex(gr.get("x9", 0)), "x19": hex(gr.get("x19", 0)),
                   "x20": hex(gr.get("x20", 0)), "x21": hex(gr.get("x21", 0)),
                   "x22": hex(gr.get("x22", 0)), "x23": hex(gr.get("x23", 0)),
                   "sp": hex(gr.get("sp", 0))}
            writes.append(rec)
            log("WATCH#%d pc=%s slot0=%s x0=%s x1=%s x8=%s x20=%s" %
                (len(writes), rec["pc"], rec["slot0_after"], rec["x0"], rec["x1"], rec["x8"], rec["x20"]))
            # step over the writing instruction
            dele(ent)
            r.cmd("s", 5)
            add(ent)

        out["thunk_hits"] = thunk_hits
        out["r_dispatch"] = r_dispatch
        out["writes"] = writes
        out["verdict"] = ("WATCH_CAPTURED" if writes and out.get("afed8_4") else
                          ("R_DISPATCH_SEEN" if r_dispatch else "NO_R_DISPATCH"))
    finally:
        cleanup()
        try:
            open(ART, "w").write(json.dumps(out, indent=2))
        except Exception:
            pass
        open(ART.replace(".json", ".txt"), "w").write("\n".join(lines) + "\n")
        print("VERDICT:", out.get("verdict"), "thunk_hits:", out.get("thunk_hits"),
              "writes:", len(out.get("writes", [])), flush=True)


if __name__ == "__main__":
    main()
