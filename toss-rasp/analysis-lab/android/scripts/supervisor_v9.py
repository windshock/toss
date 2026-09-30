#!/usr/bin/env python3
"""§100 supervisor: auto-classify Toss runs; on a native-path run (libea56
loaded) immediately deep-probe: bridge-1 R-dispatch (idx==0xe7b) anchor ->
Z2 write-watch on scratch[0] -> capture the exact writer of outgoing x0=4
(+ full registers/frame dumps), then confirm afed8(4) in the SAME run.

Classifier (adb-only, no gdbstub): per app incarnation record pid, libea56
load, death mechanism (System.exit vs other). JAVA_EXIT -> next run.
Observation only. SIGTERM detaches gdbstub cleanly."""
import json, signal, subprocess, sys, time
sys.path.insert(0, "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/analysis-lab/scripts")
from hvf_hwbreak_toy import RSP

ADB = "/Users/1004276/Library/Android/sdk/platform-tools/adb"
DEV = "localhost:5555"
LINKER_BASE = None            # re-read at start
AFED8 = 0xafed8
BRIDGE1_OFF = 0x186c70
SIG = "ff8303d11083bcb0"
R_IDX = 0xe7b
MAX_RUNS = 40
ART = "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/analysis-lab/artifacts/android/toss_s100_supervisor.json"


def adb(*a, t=12):
    return subprocess.run([ADB, "-s", DEV] + list(a), capture_output=True, text=True, timeout=t)


def adb_sh(cmd, t=12):
    q = cmd.replace("'", "'\\''")
    return adb("shell", "su 0 sh -c '%s'" % q, t=t).stdout.strip()


def read_linker_base():
    out = adb_sh("grep -m1 'r--p 00000000.*linker64' /proc/$(pidof com.android.systemui)/maps")
    try:
        return int(out.split("-")[0], 16)
    except Exception:
        return None


class DeepProbe:
    """Attach gdbstub and capture the scratch[0]=4 writer + chain confirmation."""

    def __init__(self, libea56_base, anon_regions, run_meta):
        self.lib = libea56_base
        self.regions = anon_regions        # [(start,end), ...]
        self.meta = run_meta
        self.r = None
        self.active = set()
        self.slot = None

    def cleanup(self):
        if not self.r:
            return
        try:
            for bp in list(self.active):
                self.r.cmd("z1,%x,4" % bp, 2)
            if self.slot:
                self.r.cmd("z2,%x,8" % self.slot, 2)
            self.r.cmd("D", 4)
            self.r.close()
        except Exception:
            pass

    def m(self, va, n, t=6):
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

    def find_bridge1(self):
        # 1) direct: region_start + BRIDGE1_OFF
        for (s, e) in self.regions:
            if s + BRIDGE1_OFF + 8 <= e:
                if self.m(s + BRIDGE1_OFF, 8) == SIG:
                    return s + BRIDGE1_OFF
        # 2) chunk-scan regions >= 0x100000 for the signature
        for (s, e) in self.regions:
            if e - s < 0x100000:
                continue
            for off in range(0, min(e - s, 0x400000), 0x1000):
                w = self.m(s + off, 0x1000)
                if not w or w.startswith("E") or len(w) < 0x2000:
                    continue
                i = w.find(SIG)
                if i >= 0:
                    return s + off + i // 2
        return None

    def run(self):
        out = {"meta": self.meta, "libea56_base": hex(self.lib)}
        r = RSP(1234)
        self.r = r
        r.interrupt()
        # sanity: ELF magic at libea56 base
        if self.m(self.lib, 4) != "7f454c46":
            out["verdict"] = "LIBEA56_MAGIC_FAIL"
            self.cleanup()
            return out
        b1 = self.find_bridge1()
        out["bridge1"] = hex(b1) if b1 else None
        if not b1:
            out["verdict"] = "BRIDGE1_NOT_FOUND"
            self.cleanup()
            return out
        ent = self.lib + AFED8
        ra, rb = self.add(ent), self.add(b1)
        out["arm"] = {"afed8": ra, "bridge1": rb}
        writes = []
        anchored = False
        writer4 = None
        afed8_4 = None
        n_b1 = 0
        timeouts = 0
        t0 = time.time()
        deadline = t0 + 240
        try:
            while time.time() < deadline:
                stop = r.cmd("c", 20)
                if not stop or not stop.startswith("T"):
                    timeouts += 1
                    if timeouts >= 3:
                        break
                    continue
                timeouts = 0
                gr = self.regs()
                pc = gr.get("pc", 0)
                if pc == b1 and not anchored:
                    n_b1 += 1
                    inv = gr.get("x0", 0) & 0x00FFFFFFFFFFFFFF
                    idx = self.u32(inv + 8) if inv else None
                    if idx == R_IDX:
                        anchored = True
                        sp = gr.get("sp", 0)
                        self.slot = sp - 0x14e0
                        out["anchor"] = {"t": round(time.time() - t0, 2), "sp": hex(sp),
                                         "inv": hex(inv), "scratch0": hex(self.slot),
                                         "b1_hits_before": n_b1}
                        wz = r.cmd("Z2,%x,8" % self.slot, 3)
                        out["watch_armed"] = (wz == "OK")
                        self.dele(b1)  # stop bridge noise; keep afed8
                    self.dele(ent)
                    self.dele(b1)
                    r.cmd("s", 5)
                    self.add(ent)
                    if not anchored:
                        self.add(b1)
                    continue
                if pc == ent:
                    x0 = gr.get("x0", 0)
                    if x0 == 4:
                        afed8_4 = {"t": round(time.time() - t0, 2), "sp": hex(gr.get("sp", 0)),
                                   "x1": hex(gr.get("x1", 0)), "x2": hex(gr.get("x2", 0))}
                        break
                    self.dele(ent)
                    r.cmd("s", 5)
                    self.add(ent)
                    continue
                # watchpoint stop
                before = self.u64(self.slot)
                rec = {"t": round(time.time() - t0, 2), "pc": hex(pc),
                       "lr": hex(gr.get("x30", 0)), "sp": hex(gr.get("sp", 0)),
                       "slot_before": hex(before) if before is not None else None}
                for i in range(31):
                    rec["x%d" % i] = hex(gr.get("x%d" % i, 0))
                writes.append(rec)
                if before == 4:
                    writer4 = rec
                    # deep capture: code window + frames + scratch neighborhood
                    cap = {"writer_pc": hex(pc)}
                    cap["code_window"] = self.m(max(0, pc - 0x60), 0xc0)
                    cap["scratch_window"] = self.m(self.slot - 0x40, 0x100)
                    for regname in ("x19", "x20", "x21", "x22", "x23", "x24", "x28"):
                        v = gr.get(regname, 0) & 0x00FFFFFFFFFFFFFF
                        if 0x1000 < v < 0xFFFFFFFFFFFF:
                            cap["frame_%s_win" % regname] = self.m(v & ~7, 0x60)
                    out["writer_capture"] = cap
                    break
                self.dele(ent)
                r.cmd("s", 5)
                self.add(ent)
        finally:
            self.cleanup()
        out["writes"] = writes
        out["writer_of_4"] = writer4
        out["afed8_4_same_run"] = afed8_4
        out["n_bridge1_hits"] = n_b1
        if writer4:
            out["verdict"] = "WRITER4_CAPTURED"
        elif anchored and afed8_4:
            out["verdict"] = "ANCHORED_AFED8_4_NO_WATCH"
        elif anchored:
            out["verdict"] = "ANCHORED_NO_4"
        elif afed8_4:
            out["verdict"] = "AFED8_4_ONLY"
        else:
            out["verdict"] = "NO_ANCHOR"
        return out


def watch_state():
    """read last watcher lines -> {pid: (libea56_base|None, [anon exec regions])}"""
    out = adb_sh("tail -40 /data/local/tmp/runwatch.log")
    st = {}
    for ln in out.splitlines():
        parts = ln.split()
        if len(parts) >= 3 and parts[2].startswith("libea56="):
            pid = parts[1]
            ea = parts[2].split("=", 1)[1]
            regions = []
            if len(parts) >= 4:
                for seg in parts[3].split("anon=", 1)[-1].strip().split(","):
                    if "-" in seg:
                        try:
                            s, e = seg.split("-")
                            regions.append((int(s, 16), int(e, 16)))
                        except Exception:
                            pass
            st[pid] = (ea if ea != "no" else None, regions)
    return st


def classify_and_loop():
    runs = []
    log = []
    def L(s):
        log.append(s)
        print(s, flush=True)
    # start the in-guest relaunch loop
    adb("shell", "am force-stop viva.republica.toss")
    adb("shell", "nohup sh -c 'for i in $(seq 1 400); do am start -n viva.republica.toss/.splash.SplashActivity >/dev/null 2>&1; sleep 2; done' >/dev/null 2>&1 &")
    time.sleep(1)
    cur_pid = None
    run_start = None
    saw_lib = False
    saw_exit = False
    result = None
    t0 = time.time()
    while len(runs) < MAX_RUNS and time.time() - t0 < 1500:
        time.sleep(1.0)
        st = watch_state()
        pids = sorted(st.keys())
        # death detection: current pid gone
        if cur_pid is not None and cur_pid not in pids:
            lc = adb("shell", "logcat", "-d", "-t", "300").stdout
            saw_exit = "System.exit called" in lc
            cls = ("JAVA_EXIT" if saw_exit and not saw_lib else
                   "NATIVE_CANDIDATE" if saw_lib else
                   "JAVA_EXIT" if saw_exit else "OTHER")
            rec = {"run": len(runs) + 1, "pid": cur_pid,
                   "lifetime_s": round(time.time() - run_start, 1) if run_start else None,
                   "libea56": saw_lib, "system_exit": saw_exit, "class": cls}
            runs.append(rec)
            L("run#%d pid=%s life=%ss libea56=%s sysexit=%s -> %s" %
              (rec["run"], cur_pid, rec["lifetime_s"], saw_lib, saw_exit, cls))
            cur_pid = None
            saw_lib = False
            saw_exit = False
            adb("shell", "logcat", "-c")
            continue
        # live pid tracking
        if cur_pid is None and pids:
            cur_pid = pids[-1]
            run_start = time.time()
            adb("shell", "logcat", "-c")
        if cur_pid in st:
            ea, regions = st[cur_pid]
            if ea and not saw_lib:
                saw_lib = True
                L("*** run#%d pid=%s: libea56=%s — NATIVE conditions, deep probe NOW ***" %
                  (len(runs) + 1, cur_pid, ea))
                meta = {"run": len(runs) + 1, "pid": int(cur_pid), "t": round(time.time() - t0, 1)}
                dp = DeepProbe(int(ea, 16), regions, meta)
                try:
                    result = dp.run()
                finally:
                    dp.cleanup()
                L("deep probe verdict: %s (writes=%d)" %
                  (result.get("verdict"), len(result.get("writes", []))))
                break
    return runs, result, log


def main():
    out = {"provenance": "runtime", "probe": "s100 supervisor"}
    signal.signal(signal.SIGTERM, lambda *a: sys.exit(1))
    signal.signal(signal.SIGINT, lambda *a: sys.exit(1))
    global LINKER_BASE
    LINKER_BASE = read_linker_base()
    out["linker_base"] = hex(LINKER_BASE) if LINKER_BASE else None
    print("linker base:", out["linker_base"], flush=True)
    runs, result, log = classify_and_loop()
    out["runs"] = runs
    out["run_count"] = len(runs)
    out["deep"] = result
    from collections import Counter
    out["class_histogram"] = dict(Counter(r["class"] for r in runs))
    try:
        open(ART, "w").write(json.dumps(out, indent=2))
    except Exception:
        pass
    open(ART.replace(".json", ".txt"), "w").write("\n".join(log) + "\n")
    print("VERDICT:", (result or {}).get("verdict", "NO_NATIVE_RUN"),
          "runs:", len(runs), "classes:", out["class_histogram"], flush=True)


if __name__ == "__main__":
    main()
