#!/usr/bin/env python3
"""§98 probe1 REPRO (2026-09-29): dynamic-linker-base variant of trace_afed8_caller.py.

The Sep-28 boot died with the QEMU restart (18:37); §98-era scripts hardcode
LINKER_BASE=0xebc8ffebf000 and now return NO_LIBEA56. Per the S108 charter the
current layout (stable since S103) resolves the linker dynamically from
/proc/<systemui>/maps — same method as probeS106_x27.py::linker_base().

Also records, after capture, the guest maps of the *next* app incarnation
(randomize_va_space=0 => deterministic layout) so the afed8(x0=4) caller can be
classified by mapping + offset instead of absolute address: §98 reference values
are anon-exec-mapping + 0x186d00, kind=blr x16, ids {0:46, 4:1},
id0 caller_offs {0xf8a98: 45, 0x1438b0: 1}. Observation only. SIGTERM detaches.
"""
import json, re, signal, subprocess, sys, time
sys.path.insert(0, "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/analysis-lab/scripts")
from hvf_hwbreak_toy import RSP

ADB = "/Users/1004276/Library/Android/sdk/platform-tools/adb"
DEV = "localhost:5555"
AFED8 = 0xafed8
B02AC = 0xb02ac
ART = "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/analysis-lab/artifacts/android/toss_afed8_caller_repro.json"


def adb(*a):
    return subprocess.run([ADB, "-s", DEV] + list(a), capture_output=True, text=True)


def adb_sh(cmd, timeout=15):
    r = adb("shell", cmd)
    return (r.stdout or "") + (r.stderr or "")


def linker_base():
    # shell user gets EACCES on /proc/<pid>/maps (hideprocfs); root works
    out = adb_sh("su 0 grep -m1 'r--p 00000000.*linker64' /proc/$(pidof com.android.systemui)/maps")
    try:
        return int(out.split("-")[0], 16)
    except Exception:
        return None


def guest_maps():
    """maps of the (next) toss incarnation: list of (start, end, perms, path)."""
    out = adb_sh("su 0 cat /proc/$(pidof viva.republica.toss | tr ' ' '\\n' | head -1)/maps")
    rows = []
    for ln in out.splitlines():
        mm = re.match(r"([0-9a-f]+)-([0-9a-f]+) (\S{4}) \S+ \S+ \S+\s*(.*)", ln)
        if mm:
            rows.append((int(mm.group(1), 16), int(mm.group(2), 16), mm.group(3), mm.group(4)))
    return rows


def main():
    out = {"provenance": "runtime", "probe": "afed8 entry caller trace — repro 2026-09-29"}
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
        adb("shell", "for p in $(ps -A -o PID,ARGS | grep '[s]eq 1' | grep '[v]iva' | awk '{print $1}'); do kill $p; done")
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

    def classify(code_u32):
        if code_u32 is None:
            return None
        if (code_u32 >> 24) == 0x94:
            return "bl"
        if (code_u32 & 0xfffffc1f) == 0xd63f0000:
            return "blr x%d" % ((code_u32 >> 5) & 31)
        if (code_u32 & 0xfffffc1f) == 0xd61f0000:
            return "br x%d" % ((code_u32 >> 5) & 31)
        return "other"

    t0 = time.time()
    try:
        LB = None
        for _ in range(6):
            LB = linker_base()
            if LB:
                break
            for c in (["disconnect", DEV], ["connect", DEV]):
                try:
                    subprocess.run([ADB, "-s", DEV] + c, capture_output=True, timeout=8)
                except Exception:
                    pass
            time.sleep(2)
        if not LB:
            out["verdict"] = "NO_LINKER_BASE"
            return
        SOINFO_NOTIFY = LB + 0x68bb4
        log("linker base=%#x soinfo_notify=%#x" % (LB, SOINFO_NOTIFY))

        # kill stale launch loops, then fresh start
        adb_sh("for p in $(ps -A -o PID,ARGS | grep '[s]eq 1' | grep '[v]iva' | awk '{print $1}'); do kill $p; done")
        adb("shell", "am force-stop viva.republica.toss")
        adb("shell", "nohup sh -c 'for i in $(seq 1 200); do am start -n viva.republica.toss/.splash.SplashActivity; sleep 2; done' >/dev/null 2>&1 &")
        time.sleep(1.5)
        r = RSP(1234)
        r.interrupt()
        log("catching libea56 load...")
        add(SOINFO_NOTIFY)
        found = None
        t_catch = time.time()
        while time.time() - t_catch < 240 and not found:
            hit = r.cmd("c", 20)
            if not hit or not hit.startswith("T"):
                continue  # probeS-style: keep waiting across timeouts
            gr = regs()
            si = gr.get("x0", 0)
            if "ea56" in " | ".join(names(si)):
                found = {"soinfo": si, "base": u64(si + 0x100)}
                break
            dele(SOINFO_NOTIFY)
            r.cmd("s", 5)
            add(SOINFO_NOTIFY)
        if not found or not found["base"]:
            out["verdict"] = "NO_LIBEA56"
            return
        base = found["base"]
        ent, ac = base + AFED8, base + B02AC
        out.update({"libea56_base": hex(base), "afed8_va": hex(ent), "b02ac_va": hex(ac)})
        log("libea56 base=%#x afed8=%#x b02ac=%#x" % (base, ent, ac))
        dele(SOINFO_NOTIFY)

        re_, ra = add(ent), add(ac)
        log("Z1 afed8 -> %s ; Z1 b02ac -> %s" % (re_, ra))

        entries = []
        poison_entry = None
        timeouts = 0
        deadline = time.time() + 240
        while time.time() < deadline:
            stop = r.cmd("c", 25)
            if not stop or not stop.startswith("T"):
                timeouts += 1
                if poison_entry or timeouts >= 3:
                    log("end: stop=%r timeouts=%d" % (stop, timeouts))
                    break
                continue
            timeouts = 0
            gr = regs()
            pc = gr.get("pc", 0)
            if pc == ent:
                x0, x30 = gr.get("x0", 0), gr.get("x30", 0)
                caller = x30 - 4
                inlib = base <= caller < base + 0x300000
                cw = m(caller, 8)
                cw_u32 = int.from_bytes(bytes.fromhex(cw[:8]), "little") if len(cw) >= 8 and not cw.startswith("E") else None
                rec = {"t": round(time.time() - t0, 2), "site": "afed8_entry",
                       "id": x0 & 0xffffffff,
                       "x1": hex(gr.get("x1", 0)), "x2": hex(gr.get("x2", 0)),
                       "x19": hex(gr.get("x19", 0)),
                       "sp": hex(gr.get("sp", 0)),
                       "caller": hex(caller),
                       "caller_off": hex(caller - base) if inlib else None,
                       "call_kind": classify(cw_u32)}
                if x0 == 4:
                    poison_entry = rec
                    log("*** POISON ENTRY: afed8(x0=4) caller=%s (off %s) kind=%s ***" %
                        (rec["caller"], rec["caller_off"], rec["call_kind"]))
                entries.append(rec)
                log("entry#%d id=%d caller_off=%s kind=%s x1=%s" %
                    (len(entries), rec["id"], rec["caller_off"], rec["call_kind"], rec["x1"]))
            elif pc == ac:
                w8 = gr.get("x8", 0) & 0xffffffff
                if w8 == 4:
                    log("*** b02ac state4 (post-poison dispatch) ***")
            else:
                continue
            if poison_entry:
                break
            dele(ent)
            dele(ac)
            r.cmd("s", 5)
            add(ent)
            add(ac)

        out["n_entries"] = len(entries)
        out["poison_entry"] = poison_entry
        from collections import Counter
        out["id_histogram"] = dict(Counter(e["id"] for e in entries))
        out["caller_off_histogram"] = dict(Counter(e["caller_off"] for e in entries))
        out["verdict"] = "POISON_ENTRY_CAPTURED" if poison_entry else ("ENTRIES_NO_ID4" if entries else "NO_HITS")
        log("ids: %s" % out["id_histogram"])
        log("callers: %s" % out["caller_off_histogram"])
    finally:
        cleanup()
        # classify the poison caller against the NEXT incarnation's maps
        # (randomize_va_space=0 => deterministic layout per boot)
        try:
            time.sleep(6)
            maps = guest_maps()
            out["maps_anon_exec"] = [
                {"start": hex(s), "end": hex(e), "perms": p, "path": pa or "[anon]"}
                for s, e, p, pa in maps if "x" in p and not pa]
            if poison_entry:
                c = int(poison_entry["caller"], 16)
                for s, e, p, pa in maps:
                    if s <= c < e:
                        poison_entry["caller_map"] = {"start": hex(s), "end": hex(e),
                                                      "perms": p, "path": pa or "[anon]",
                                                      "off_in_map": hex(c - s)}
                        log("caller map: %s-%s %s %s off=%s" %
                            (hex(s), hex(e), p, pa or "[anon]", hex(c - s)))
                        break
        except Exception as ex:
            out["maps_error"] = repr(ex)
        # end guest launch loop, leave guest clean
        adb("shell", "for p in $(ps -A -o PID,ARGS | grep '[s]eq 1' | grep '[v]iva' | awk '{print $1}'); do kill $p; done")
        adb("shell", "am force-stop viva.republica.toss")
        try:
            open(ART, "w").write(json.dumps(out, indent=2))
        except Exception:
            pass
        open(ART.replace(".json", ".txt"), "w").write("\n".join(lines) + "\n")
        print("VERDICT:", out.get("verdict"), flush=True)


if __name__ == "__main__":
    main()
