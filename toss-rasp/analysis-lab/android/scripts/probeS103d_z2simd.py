#!/usr/bin/env python3
"""§103 probeS103d_z2simd: G2k Z2 dance + per-4-write SIMD capture.

S103 lesson: the FINAL 4-writer varies between incarnations (run: STUR hit
once, non-4; the final 4 came from another writer). Only the in-run Z2
stream sees the true winner. This probe = G2k_final4 + target.xml regmap +
v0..v4 128-bit capture on every STORE_CHANGED(after==4) and on afed8(4).

probeZ_semantics (this boot, dance-verified) established:
  - 20,931 verified slot-A store events between afed8 call#46 and afed8(4);
    zero no-advance errors; afed8(4) reached with slotA==0x4 same-run.
  - the FINAL 4-writer is 0xe14bc1318f70 (anon cluster) - NOT libea56+0xda2d4
    (that one writes x22 spills, confirmed, but not the final 4).
  - "4" appears mid-pipeline too (e.g. 0xe14e674a20b4: 0x30->4) - 4 is not a
    unique marker; only the LAST 4-write before afed8(4) matters.

This run (user-directed design - NO worker breakpoint):
  - Z2 dance on slot A from call#46 (same as probeZ), terminology per S102:
      STORE_CHANGED / STORE_SAME_VALUE / NO_ADVANCE_ERROR / UNATTRIBUTED_STOP
    (stops without watch:slotA in the raw packet are UNATTRIBUTED_STOP and
    are NOT counted as slot stores unless the step changes the value).
  - every STORE_CHANGED with after==4 -> record FULL regs (already read by
    the dance) + raw stop. (4 is common; expect a handful.)
  - at afed8(4) (process still alive at the stop): capture code windows for
    the LAST 4-writer pc (m(pc-0x100,0x200)), its caller window
    (m(lr-0x140,0x180)), and the runner-up writers; plus full writer-pc
    histogram -> quantifies "many writers" and P1/P2 dominance.
Observation only."""
import json, signal, subprocess, sys, time
sys.path.insert(0, "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/analysis-lab/scripts")
from hvf_hwbreak_toy import RSP

ADB = "/Users/1004276/Library/Android/sdk/platform-tools/adb"
DEV = "localhost:5555"
AFED8 = 0xafed8
SLOT_A = -0x3e0
ART = "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/analysis-lab/artifacts/android/toss_s103d_z2simd.json"


def adb_sh(cmd, t=15):
    q = cmd.replace("'", "'\\''")
    try:
        return subprocess.run([ADB, "-s", DEV, "shell", "su 0 sh -c '%s'" % q],
                              capture_output=True, text=True, timeout=t).stdout.strip()
    except Exception:
        return ""


def linker_base():
    out = adb_sh("grep -m1 'r--p 00000000.*linker64' /proc/$(pidof com.android.systemui)/maps")
    try:
        return int(out.split("-")[0], 16)
    except Exception:
        return None


def fetch_xml(r, annex):
    chunks = []
    off = 0
    for _ in range(64):
        rep = r.cmd("qXfer:features:read:%s:%x,%x" % (annex, off, 0x400), 6)
        if not rep or (rep[0] not in "ml"):
            return None
        chunks.append(rep[1:])
        if rep[0] == "l":
            return "".join(chunks)
        off += len(rep) - 1
    return None


def build_regmap(r):
    import re as _re
    target = fetch_xml(r, "target.xml")
    if not target:
        return None
    xmls = {"target.xml": target}
    for href in _re.findall(r'xi:include href="([^"]+)"', target):
        sub = fetch_xml(r, href)
        if sub:
            xmls[href] = sub

    def parse(xml):
        out = []
        for rm in _re.finditer(r'<reg\s+([^>]*)/>', xml):
            a = rm.group(1)
            nm = _re.search(r'name="([^"]+)"', a)
            bs = _re.search(r'bitsize="(\d+)"', a)
            rn = _re.search(r'regnum="(\d+)"', a)
            if nm and bs:
                out.append((nm.group(1), int(bs.group(1)),
                            int(rn.group(1)) if rn else None))
        return out

    ordered = []
    for tm in _re.finditer(r'(<reg\s[^>]*/>|<xi:include href="[^"]+"\s*/>)', target):
        tok = tm.group(1)
        if tok.startswith("<xi:include"):
            href = _re.search(r'href="([^"]+)"', tok).group(1)
            ordered += parse(xmls.get(href, ""))
        else:
            a = tok[5:-2]
            nm = _re.search(r'name="([^"]+)"', a)
            bs = _re.search(r'bitsize="(\d+)"', a)
            rn = _re.search(r'regnum="(\d+)"', a)
            if nm and bs:
                ordered.append((nm.group(1), int(bs.group(1)),
                                int(rn.group(1)) if rn else None))
    offb = 0
    rmap = {}
    num = 0
    for nm, bits, rn in ordered:
        num = rn if rn is not None else num + 1
        rmap[nm] = (offb, bits, num)
        offb += bits // 8
    if rmap.get("x5", (-1,))[0] != 40 or rmap.get("pc", (-1,))[0] != 256 or "v0" not in rmap:
        return None
    return rmap


def main():
    log = []
    def L(s):
        log.append(s)
        print(s, flush=True)
    out = {"probe": "G2k_final4 - last-4-writer capture via clean Z2",
           "events_tail": [], "four_writes": [], "errors": [],
           "pc_histogram": {}, "unattributed": 0}

    LB = None
    for _ in range(6):
        LB = linker_base()
        if LB:
            break
        for c in (["disconnect", DEV], ["connect", DEV]):
            try:
                subprocess.run([ADB] + c, capture_output=True, timeout=8)
            except Exception:
                pass
        time.sleep(2)
    if not LB:
        print("NO LINKER BASE")
        return
    SOINFO = LB + 0x68bb4
    L("linker: %#x" % LB)
    adb_sh("for p in $(ps -A -o PID,ARGS | grep '[s]eq 1' | grep '[v]iva.republica.toss/.splash.SplashActivity' | awk '{print $1}'); do kill $p; done")
    adb_sh("am force-stop viva.republica.toss")
    subprocess.run([ADB, "-s", DEV, "shell",
                    "nohup sh -c 'for i in $(seq 1 300); do am start -n viva.republica.toss/.splash.SplashActivity >/dev/null 2>&1; sleep 2; done' >/dev/null 2>&1 &"],
                   capture_output=True, text=True, timeout=10)
    time.sleep(1.5)

    r = RSP(1234)
    active = set()
    wA = [None]
    rmap = build_regmap(r)
    print("regmap:", "OK g=%dB v0@%dB" % (sum(v[1] for v in rmap.values()) // 8, rmap["v0"][0]) if rmap else "FAILED", flush=True)

    def cleanup():
        try:
            try:
                r.interrupt()
            except Exception:
                pass
            for bp in list(active):
                r.cmd("z1,%x,4" % bp, 2)
            if wA[0]:
                r.cmd("z2,%x,8" % wA[0], 2)
            r.cmd("D", 4)
            r.close()
        except Exception:
            pass

    signal.signal(signal.SIGTERM, lambda *a: sys.exit(1))
    signal.signal(signal.SIGINT, lambda *a: sys.exit(1))

    def m(va, n, t=8):
        return r.cmd("m%x,%x" % (va, n), t)

    def u64(va):
        s = m(va, 8)
        try:
            return int.from_bytes(bytes.fromhex(s[:16]), "little") if len(s) >= 16 else None
        except Exception:
            return None

    def cstr(va, n=120):
        if not va:
            return ""
        s = m(va, n)
        try:
            b = bytes.fromhex(s)
            z = b.find(0)
            return b[:z if z >= 0 else len(b)].decode("latin1", "replace")
        except Exception:
            return ""

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

    def full_regs_hex(gr):
        d = {("x%d" % i): hex(gr.get("x%d" % i, 0)) for i in range(31)}
        d["sp"] = hex(gr.get("sp", 0))
        d["pc"] = hex(gr.get("pc", 0))
        return d

    _gcache = {}

    def gfull():
        g = r.cmd("g", 8)
        _gcache["g"] = g
        return g

    def vec(g_unused, name):
        # QEMU aarch64: the g packet ends at cpsr (268B); v0-v31 must be read
        # individually via pN (regnum from target.xml). reg number is VERIFIED,
        # never guessed.
        if not rmap or name not in rmap:
            return None
        off, bits, num = rmap[name]
        rep = r.cmd("p%x" % num, 4)
        if not rep or not rep[0].isdigit() and not rep[0] in "abcdef":
            return None
        try:
            b = bytes.fromhex(rep[:bits // 4])
        except Exception:
            return None
        if len(b) < 16:
            return None
        lanes = [int.from_bytes(b[i * 4:i * 4 + 4], "little") for i in range(4)]
        return {"raw": b.hex(), "low64": hex(int.from_bytes(b[:8], "little")),
                "high64": hex(int.from_bytes(b[8:], "little")),
                "lanes": [hex(x) for x in lanes]}

    n_store_changed = 0
    n_store_same = 0
    n_no_advance = 0
    n_unattributed = 0
    four_writes = []          # every STORE_CHANGED with after==4 (full regs)
    tail = []                 # last 40 events (summary)
    hist = {}

    try:
        r.interrupt()
        add(SOINFO)
        lib = None
        t0 = time.time()
        while time.time() - t0 < 240 and lib is None:
            s = r.cmd("c", 20)
            if not s or not s.startswith("T"):
                continue
            gr = regs()
            si = gr.get("x0", 0)
            tag = u64(si + 0x1a0)
            nm = ""
            if tag:
                nm = cstr(u64(si + 0x1a0 + 0x10) & 0x00FFFFFFFFFFFFFF) if (tag & 1) else cstr(si + 0x1a1)
            if "ea56" in nm:
                lib = u64(si + 0x100)
            dele(SOINFO)
            r.cmd("s", 3)
            add(SOINFO)
        dele(SOINFO)
        if not lib:
            out["verdict"] = "NO_LIBEA56"
            return
        L("libea56=%#x" % lib)
        ent = lib + AFED8
        L("Z1 afed8 -> %s" % add(ent))

        n_ids = 0
        sp46 = None
        af4 = None
        timeouts = 0
        t1 = time.time()
        deadline = t1 + 480
        ev_n = 0
        while time.time() < deadline:
            stop = r.cmd("c", 20)
            if not stop or not stop.startswith("T"):
                timeouts += 1
                if timeouts >= 3:
                    out["verdict_note"] = "timeout after 3x20s no-stop"
                    break
                continue
            timeouts = 0
            gr = regs()
            pc = gr.get("pc", 0)
            sp = gr.get("sp", 0)
            if pc == ent:
                x0 = gr.get("x0", 0)
                n_ids += 1
                if x0 == 4:
                    slotA_val = u64(wA[0]) if wA[0] else None
                    af4 = {"t": round(time.time() - t1, 2), "call_no": n_ids,
                           "sp": hex(sp), "lr": hex(gr.get("x30", 0)),
                           "x1": hex(gr.get("x1", 0)),
                           "slotA": hex(wA[0]) if wA[0] else None,
                           "slotA_val": hex(slotA_val) if slotA_val is not None else None}
                    gstop = gfull()
                    af4["q0"] = vec(gstop, "v0")
                    if four_writes:
                        fw2 = four_writes[-1]
                        for key, ptr in (("bitstream_x8", int(fw2.get("x8", "0x0"), 16)),
                                         ("table_x9", int(fw2.get("x9", "0x0"), 16))):
                            if ptr > 0x1000:
                                out[key] = m(max(0, ptr - 0x20), 0xc0)
                    L("*** afed8(4) call#%d slotA=%s val=%s (four_writes=%d) q0=%s ***"
                      % (n_ids, af4["slotA"], af4["slotA_val"], len(four_writes),
                         af4["q0"]["lanes"] if af4["q0"] else None))
                    # ---- post-capture at a LIVE process stop ----
                    if four_writes:
                        fw = four_writes[-1]
                        wpc = int(fw["pc"], 16)
                        wlr = int(fw["regs"]["x30"], 16)
                        out["final4_writer"] = fw
                        out["final4_windows"] = {
                            "writer_code": m(max(0, wpc - 0x100), 0x200),
                            "caller_window": m(max(0, wlr - 0x140), 0x1c0) if wlr > 0x1000 else None,
                            "writer_sp_window": m((int(fw["regs"]["sp"], 16) & ~0xF) - 0x40, 0x100),
                        }
                        L("final 4-writer: pc=%s lr=%s (windows captured)"
                          % (fw["pc"], fw["regs"]["x30"]))
                    dele(ent)
                    break
                if sp46 is None and n_ids >= 46:
                    sp46 = sp
                    wA[0] = sp46 + SLOT_A
                    rz = r.cmd("Z2,%x,8" % wA[0], 3)
                    L("call#%d sp46=%s -> Z2 slotA=%s snap=%s (%s)"
                      % (n_ids, hex(sp46), hex(wA[0]),
                         hex(u64(wA[0]) or 0), rz))
                # Z1 dance (verified semantics from probeZ)
                dele(ent)
                old = regs()
                r.cmd("s", 5)
                new = regs()
                if not (old and new and new.get("pc") != old.get("pc")):
                    n_no_advance += 1
                    out["errors"].append({"kind": "Z1_NO_ADVANCE", "hit": n_ids})
                add(ent)
                continue
            # ---- non-afed8 stop: watchpoint handling with dance ----
            if wA[0]:
                has_watch_field = ("watch:%x" % wA[0]) in stop
                r.cmd("z2,%x,8" % wA[0], 3)
                before = u64(wA[0])
                old = regs()
                r.cmd("s", 5)
                new = regs()
                after = u64(wA[0])
                r.cmd("Z2,%x,8" % wA[0], 3)
                advanced = bool(old and new and new.get("pc") != old.get("pc"))
                ev_n += 1
                if not advanced:
                    n_no_advance += 1
                    out["errors"].append({"kind": "NO_ADVANCE", "pc": hex(pc)})
                    cls = "NO_ADVANCE_ERROR"
                elif before != after:
                    cls = "STORE_CHANGED"
                elif has_watch_field:
                    cls = "STORE_SAME_VALUE"
                else:
                    cls = "UNATTRIBUTED_STOP"
                hist[hex(pc)] = hist.get(hex(pc), 0) + 1
                tail.append({"n": ev_n, "class": cls,
                             "pc": hex(pc), "npc": hex(new.get("pc", 0)) if new else None,
                             "before": hex(before) if before is not None else None,
                             "after": hex(after) if after is not None else None,
                             "lr": hex(old.get("x30", 0)) if old else None,
                             "watch": has_watch_field})
                if len(tail) > 40:
                    tail.pop(0)
                if cls == "STORE_CHANGED":
                    n_store_changed += 1
                    if after == 4:
                        gstop = gfull()
                        four_writes.append(
                            {"n": ev_n, "pc": hex(pc),
                             "npc": hex(new.get("pc", 0)) if new else None,
                             "before": hex(before) if before is not None else None,
                             "after": "0x4", "t": round(time.time() - t1, 2),
                             "raw_stop": stop[:80],
                             "regs": full_regs_hex(old),
                             "vec": {qn: vec(gstop, qn) for qn in ("v0", "v1", "v2", "v3", "v4")},
                             "x8": hex(old.get("x8", 0)), "x9": hex(old.get("x9", 0)),
                             "sp28_16B": m(old.get("sp", 0) + 0x28, 16)})
                        L("4-WRITE#%d n=%d pc=%s before=%s lr=%s x22=%s x21=%s"
                          % (len(four_writes), ev_n, hex(pc),
                             hex(before) if before is not None else None,
                             hex(old.get("x30", 0)), hex(old.get("x22", 0)),
                             hex(old.get("x21", 0))))
                elif cls == "STORE_SAME_VALUE":
                    n_store_same += 1
                elif cls == "UNATTRIBUTED_STOP":
                    n_unattributed += 1
                continue
            L("unexpected pc=%s raw=%s" % (hex(pc), stop[:70]))
        out.update({"n_ids": n_ids, "afed8_4": af4,
                    "store_changed": n_store_changed, "store_same_value": n_store_same,
                    "no_advance_errors": n_no_advance, "unattributed_stops": n_unattributed,
                    "pc_histogram_top": sorted(hist.items(), key=lambda kv: -kv[1])[:25],
                    "distinct_writers": len(hist),
                    "events_tail": tail,
                    "four_writes_count": len(four_writes),
                    "verdict": ("AF4_" + ("FINAL4_CAPTURED" if four_writes else "NO_4WRITE_SEEN")
                                if af4 else "NO_AF4")})
    finally:
        cleanup()
        try:
            open(ART, "w").write(json.dumps(out, indent=2))
        except Exception:
            pass
        open(ART.replace(".json", ".txt"), "w").write("\n".join(log) + "\n")
        print("VERDICT:", out.get("verdict"),
              "changed=%s same=%s err=%s unattr=%s fours=%s writers=%s" %
              (n_store_changed, n_store_same, n_no_advance, n_unattributed,
               len(four_writes), len(hist)), flush=True)


if __name__ == "__main__":
    main()
