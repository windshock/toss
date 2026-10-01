#!/usr/bin/env python3
"""§100 supervisor v2: afed8-anchored auto classifier + deep probe.

Run A (classify): soinfo hook -> libea56 load -> arm afed8 bp -> record every
entry id. x0==4 => NATIVE_POISON confirmed; capture LR (bridge1 = lr-4) and
full context. If the app dies without afed8(4) -> classify via logcat.

Run B (deep): same phase, next libea56 load -> arm afed8 + bridge-1 (address
revealed in run A) -> on bridge-1 hit with [x0+8]==0xe7b (R) -> Z2 write-watch
on scratch[0]=sp-0x14e0 -> capture the exact writer of 4 (+full regs, frames)
-> confirm afed8(4) in the SAME run. Observation only."""
import json, signal, subprocess, sys, time
sys.path.insert(0, "/Users/1004276/Downloads/toss/toss-rasp/analysis-lab/scripts")
from hvf_hwbreak_toy import RSP

ADB = "/Users/1004276/Library/Android/sdk/platform-tools/adb"
DEV = "localhost:5555"
AFED8 = 0xafed8
R_IDX = 0xe7b
ART = "/Users/1004276/Downloads/toss/toss-rasp/analysis-lab/artifacts/android/toss_s100_sup2.json"


def adb_sh(cmd, t=15):
    q = cmd.replace("'", "'\\''")
    return subprocess.run([ADB, "-s", DEV, "shell", "su 0 sh -c '%s'" % q],
                          capture_output=True, text=True, timeout=t).stdout.strip()


def linker_base():
    # Match the file-backed linker64 mapping robustly.  The previous
    # linker64\\$ pattern is fragile through adb -> su -> sh quoting and can
    # miss the valid line, causing a false "NO LINKER BASE" before tracing.
    out = adb_sh("grep -m1 'r--p 00000000.*linker64' /proc/$(pidof com.android.systemui)/maps")
    try:
        return int(out.split("-")[0], 16)
    except Exception:
        return None


class Session:
    def __init__(self):
        self.r = None
        self.active = set()
        self.wslot = None

    def connect(self):
        self.r = RSP(1234)
        self.r.interrupt()

    def cleanup(self):
        if not self.r:
            return
        try:
            for bp in list(self.active):
                self.r.cmd("z1,%x,4" % bp, 2)
            if self.wslot:
                self.r.cmd("z2,%x,8" % self.wslot, 2)
            self.r.cmd("D", 4)
            self.r.close()
        except Exception:
            pass
        self.r = None
        self.active = set()

    def m(self, va, n, t=5):
        return self.r.cmd("m%x,%x" % (va, n), t)

    def u64(self, va):
        s = self.m(va, 8)
        try:
            return int.from_bytes(bytes.fromhex(s[:16]), "little") if len(s) >= 16 else None
        except Exception:
            return None

    def u32(self, va):
        s = self.m(va, 4)
        try:
            return int.from_bytes(bytes.fromhex(s[:8]), "little") if len(s) >= 8 else None
        except Exception:
            return None

    def cstr(self, va, n=120):
        if not va:
            return ""
        s = self.m(va, n)
        try:
            b = bytes.fromhex(s)
            z = b.find(0)
            return b[:z if z >= 0 else len(b)].decode("latin1", "replace")
        except Exception:
            return ""

    def regs(self):
        g = self.r.cmd("g", 5)
        if not g or len(g) < 528:
            return {}
        def q(i):
            return int.from_bytes(bytes.fromhex(g[i * 16:i * 16 + 16]), "little")
        d = {("x%d" % i): q(i) for i in range(31)}
        d["sp"] = q(31)
        d["pc"] = q(32)
        return d

    def add(self, va):
        res = self.r.cmd("Z1,%x,4" % va, 3)
        if res == "OK":
            self.active.add(va)
        return res

    def dele(self, va):
        try:
            self.r.cmd("z1,%x,4" % va, 3)
        finally:
            self.active.discard(va)

    def wait_libea56(self, soinfo, timeout=300):
        """loader hook: return libea56 base (stopped in the guard process)."""
        self.add(soinfo)
        t0 = time.time()
        while time.time() - t0 < timeout:
            s = self.r.cmd("c", 20)
            if not s or not s.startswith("T"):
                continue
            gr = self.regs()
            si = gr.get("x0", 0)
            tag = self.u64(si + 0x1a0)
            nm = ""
            if tag:
                nm = self.cstr(self.u64(si + 0x1a0 + 0x10) & 0x00FFFFFFFFFFFFFF) if (tag & 1) else self.cstr(si + 0x1a1)
            if "ea56" in nm:
                base = self.u64(si + 0x100)
                self.dele(soinfo)
                return base
            self.dele(soinfo)
            self.r.cmd("s", 3)
            self.add(soinfo)
        self.dele(soinfo)
        return None


def classify_run(s, lib_base, deadline_s=180):
    """trace afed8 entries; return dict with ids, afed8_4 record or death info."""
    ent = lib_base + AFED8
    s.add(ent)
    ids = []
    af4 = None
    timeouts = 0
    t0 = time.time()
    while time.time() - t0 < deadline_s:
        stop = s.r.cmd("c", 20)
        if not stop or not stop.startswith("T"):
            timeouts += 1
            if timeouts >= 3:
                break
            continue
        timeouts = 0
        gr = s.regs()
        pc = gr.get("pc", 0)
        if pc != ent:
            continue
        x0 = gr.get("x0", 0)
        ids.append(x0)
        if x0 == 4:
            af4 = {"t": round(time.time() - t0, 2), "lr": gr.get("x30", 0),
                   "bridge1": gr.get("x30", 0) - 4, "x1": gr.get("x1", 0),
                   "x2": gr.get("x2", 0), "sp": gr.get("sp", 0)}
            break
        s.dele(ent)
        s.r.cmd("s", 3)
        s.add(ent)
    s.dele(ent)
    return {"ids": ids[:80], "n_ids": len(ids), "afed8_4": af4}


def deep_run(s, lib_base, bridge1, deadline_s=240):
    """full capture: bridge-1 R anchor -> Z2 on scratch[0] -> writer of 4."""
    out = {"bridge1": hex(bridge1)}
    ent = lib_base + AFED8
    s.add(ent)
    s.add(bridge1)
    writes = []
    writer4 = None
    af4 = None
    n_b1 = 0
    b1_idx_hist = {}
    b1_samples = []
    afed8_ids = []
    unexpected = []
    anchored = False
    timeouts = 0
    t0 = time.time()
    while time.time() - t0 < deadline_s:
        stop = s.r.cmd("c", 20)
        if not stop or not stop.startswith("T"):
            timeouts += 1
            if anchored or timeouts >= 3:
                break
            continue
        timeouts = 0
        gr = s.regs()
        pc = gr.get("pc", 0)
        if pc == bridge1 and not anchored:
            n_b1 += 1
            inv = gr.get("x0", 0) & 0x00FFFFFFFFFFFFFF
            idx = s.u32(inv + 8) if inv else None
            key = "None" if idx is None else hex(idx)
            b1_idx_hist[key] = b1_idx_hist.get(key, 0) + 1
            if len(b1_samples) < 80:
                b1_samples.append({
                    "t": round(time.time() - t0, 2),
                    "idx": key,
                    "x0": hex(gr.get("x0", 0)),
                    "inv": hex(inv),
                    "lr": hex(gr.get("x30", 0)),
                    "sp": hex(gr.get("sp", 0)),
                })
            if idx == R_IDX:
                anchored = True
                sp = gr.get("sp", 0)
                s.wslot = sp - 0x14e0
                out["anchor"] = {"t": round(time.time() - t0, 2), "sp": hex(sp),
                                 "inv": hex(inv), "scratch0": hex(s.wslot),
                                 "b1_hits": n_b1}
                wz = s.r.cmd("Z2,%x,8" % s.wslot, 3)
                out["watch_armed"] = (wz == "OK")
                s.dele(bridge1)
            s.dele(ent)
            # Manual step-over is required for HW breakpoints.  Leaving the
            # bridge1 Z1 armed at the current PC can immediately re-trap the
            # same instruction and inflate n_bridge1_hits without progress.
            if bridge1 in s.active:
                s.dele(bridge1)
            s.r.cmd("s", 3)
            s.add(ent)
            if not anchored:
                s.add(bridge1)
            continue
        if pc == ent:
            x0 = gr.get("x0", 0)
            afed8_ids.append(x0)
            if x0 == 4:
                af4 = {"t": round(time.time() - t0, 2)}
                break
            s.dele(ent)
            s.r.cmd("s", 3)
            s.add(ent)
            continue
        # watchpoint stop.  Other stops can occur before Z2 is armed (for
        # example a single-step/trap side effect or another thread stop), so
        # do not assume s.wslot exists until the R anchor has actually fired.
        if s.wslot is None:
            if len(unexpected) < 80:
                unexpected.append({
                    "t": round(time.time() - t0, 2),
                    "pc": hex(pc),
                    "lr": hex(gr.get("x30", 0)),
                    "sp": hex(gr.get("sp", 0)),
                    "x0": hex(gr.get("x0", 0)),
                    "x1": hex(gr.get("x1", 0)),
                    "x2": hex(gr.get("x2", 0)),
                })
            continue
        before = s.u64(s.wslot)
        rec = {"t": round(time.time() - t0, 2), "pc": hex(pc), "lr": hex(gr.get("x30", 0)),
               "sp": hex(gr.get("sp", 0)),
               "slot_before": hex(before) if before is not None else None}
        for i in range(31):
            rec["x%d" % i] = hex(gr.get("x%d" % i, 0))
        writes.append(rec)
        if before == 4:
            writer4 = rec
            cap = {"writer_pc": hex(pc)}
            cap["code_window"] = s.m(max(0, pc - 0x80), 0x100)
            cap["scratch_window"] = s.m(s.wslot - 0x40, 0x100)
            for rn in ("x19", "x20", "x21", "x22", "x23", "x24", "x28", "x29"):
                v = gr.get(rn, 0) & 0x00FFFFFFFFFFFFFF
                if 0x100000 < v < 0xFFFFFFFFFFFF:
                    cap["win_%s" % rn] = s.m(v & ~0xF, 0x40)
            out["writer_capture"] = cap
            break
        s.dele(ent)
        s.r.cmd("s", 3)
        s.add(ent)
    s.dele(ent)
    if bridge1 in s.active:
        s.dele(bridge1)
    out.update({"writes": writes, "writer_of_4": writer4, "afed8_4_same_run": af4,
                "n_bridge1_hits": n_b1, "bridge_idx_hist": b1_idx_hist,
                "bridge_idx_samples": b1_samples, "afed8_ids": afed8_ids[:80],
                "n_afed8_ids": len(afed8_ids), "unexpected_stops": unexpected,
                "anchored": anchored})
    return out


def main():
    log = []
    def L(s):
        log.append(s)
        print(s, flush=True)
    out = {"provenance": "runtime", "probe": "s100 supervisor v2"}
    LB = linker_base()
    if not LB:
        print("NO LINKER BASE")
        return
    SOINFO = LB + 0x68bb4
    L("linker base: %#x" % LB)
    # Clear before attaching.  Once the RSP client connects/stops the guest,
    # adb commands can hang until we detach.
    adb_sh("logcat -c")
    adb_sh("am force-stop viva.republica.toss")
    adb_sh("for p in $(ps -A -o PID,ARGS | grep '[s]eq 1 600' | grep '[v]iva.republica.toss/.splash.SplashActivity' | awk '{print $1}'); do kill $p; done")
    subprocess.run([ADB, "-s", DEV, "shell",
                    "nohup sh -c 'for i in $(seq 1 600); do am start -n viva.republica.toss/.splash.SplashActivity >/dev/null 2>&1; sleep 2; done' >/dev/null 2>&1 &"],
                   capture_output=True, text=True, timeout=10)
    time.sleep(1.5)

    s = Session()
    runs = []
    bridge1 = None
    deep = None
    try:
        for attempt in range(6):
            s.connect()
            base = s.wait_libea56(SOINFO, timeout=240)
            if not base:
                L("attempt %d: no libea56 load in window" % attempt)
                s.cleanup()
                continue
            L("attempt %d: libea56=%#x" % (attempt, base))
            if bridge1 is None:
                cls = classify_run(s, base)
                runs.append({"attempt": attempt, "lib": hex(base), **{k: v for k, v in cls.items() if k != "ids"},
                             "ids_head": cls["ids"][:10]})
                af4 = cls["afed8_4"]
                if af4:
                    bridge1 = af4["bridge1"]
                    runs[-1]["class"] = "NATIVE_POISON"
                    L("*** afed8(4) SEEN: bridge-1 revealed = %#x (lr=%#x) ***" % (bridge1, af4["lr"]))
                    s.cleanup()
                    continue  # next attempt = deep run
                s.cleanup()
                lc = subprocess.run([ADB, "-s", DEV, "shell", "logcat", "-d", "-t", "300"],
                                    capture_output=True, text=True, timeout=12).stdout
                sysexit = "System.exit called" in lc
                runs[-1]["system_exit"] = sysexit
                runs[-1]["class"] = ("MIXED_ID0_JAVAEXIT" if cls["n_ids"] else
                                     ("JAVA_EXIT" if sysexit else "OTHER"))
                L("attempt %d class=%s (afed8 calls=%d sysexit=%s)" %
                  (attempt, runs[-1]["class"], cls["n_ids"], sysexit))
            else:
                deep = deep_run(s, base, bridge1)
                deep["attempt"] = attempt
                deep["lib"] = hex(base)
                L("deep run verdict: anchored=%s writes=%d writer4=%s af4=%s" %
                  (deep.get("anchored"), len(deep.get("writes", [])),
                   bool(deep.get("writer_of_4")), bool(deep.get("afed8_4_same_run"))))
                s.cleanup()
                if deep.get("writer_of_4"):
                    break
                bridge1 = None  # re-reveal next time
    finally:
        s.cleanup()
        out["runs"] = runs
        out["deep"] = deep
        try:
            open(ART, "w").write(json.dumps(out, indent=2))
        except Exception:
            pass
        open(ART.replace(".json", ".txt"), "w").write("\n".join(log) + "\n")
    print("DONE. runs:", len(runs), "writer4:", bool(deep and deep.get("writer_of_4")), flush=True)


if __name__ == "__main__":
    main()
