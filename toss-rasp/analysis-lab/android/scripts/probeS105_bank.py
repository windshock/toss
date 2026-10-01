#!/usr/bin/env python3
"""§105 probeS105_bank: full-register campaign for record->VM-bank->w8 def-use.

Run-8 of S104 closed slotA=4 -> afed8(4) but kept only pc/x0/x5/sp/lr per step
and its insn-byte bulk fetch dropped all libea56-range pcs (sorted-tail cut).
This probe re-runs the SAME proven campaign design (Z2 anchor, full disarm,
25k budget, guard 8000, discovery-based) with FULL x0-x30 per step and an
uncapped insn fetch, to compute offline:
  (1) packed-record store EAs/values (strh quad + [x0+0xb4..] region)
  (2) the first store of 4 into the VM-bank slot [x29+w3*4]
  (3) the bank read -> final and/add -> w8=4 -> mov w0,w8 def-use
Artifacts are per-run (never overwritten). Dance invariant everywhere.

(supersedes §104 probeS104_marshal: close the real CPU edges
  (A) slotA=4 -> load/marshal -> bridge x0=4 -> afed8(4)   [same run]
  (B) x17/stream -> w12 -> dup v2=0x7500451c               [stretch]

Design (S103 laws obeyed):
  Z2 mode: slotA watch (danced, S103d style) until a STORE_CHANGED(after==4).
  Campaign mode (at each 4-write): disarm ALL bps/watch, single-step with
    per-step FULL g + insn bytes at pc + slotA read; stop at pc==ent:
    x0==4 -> SUCCESS (real marshal chain captured); x0!=4 or budget expiry
    -> this was a mid-write: re-arm and continue Z2 mode.
  dup Z1 (armed with Z2 at call#46, danced): on each hit read post-v2 via
    pN; when lanes==0x7500451c record pre/post scalar state + table/stream
    dumps -> the executed x17->v2 edge. Bail after 3000 hits.
No bp is ever left armed at the PC we step from (S103 deadlock law)."""
import json, signal, subprocess, sys, time
sys.path.insert(0, "/Users/1004276/Downloads/toss/toss-rasp/analysis-lab/scripts")
from hvf_hwbreak_toy import RSP

ADB = "/Users/1004276/Library/Android/sdk/platform-tools/adb"
DEV = "localhost:5555"
AFED8 = 0xafed8
SLOT_A = -0x3e0
S102 = "/Users/1004276/Downloads/toss/toss-rasp/analysis-lab/artifacts/android/toss_s102_probeG2k_final4.json"
ART = "/Users/1004276/Downloads/toss/toss-rasp/analysis-lab/artifacts/android/toss_s105_bank.json"
_g2k = json.load(open(S102))
STUR = int(_g2k["final4_writer"]["pc"], 16)          # per-layout store pc
DUP = STUR - 0x24                                    # dup v2.4s, w12
CAMPAIGN_BUDGET = 25000
DUP_BAIL = 3000
KNOWN_DUP = 0xfffd22718f4c   # runs 2-3 cluster base (stable across those incarnations)


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


def main():
    log = []
    def L(s):
        log.append(s)
        print(s, flush=True)
    out = {"probe": "S104 marshal chain", "campaigns": [], "dup_hits": [],
           "errors": [], "x0_transitions": [], "slotA_reads": []}

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
    L("linker: %#x  STUR=%#x DUP=%#x" % (LB, STUR, DUP))

    adb_sh("for p in $(ps -A -o PID,ARGS | grep '[s]eq 1' | grep '[v]iva.republica.toss/.splash.SplashActivity' | awk '{print $1}'); do kill $p; done")
    adb_sh("am force-stop viva.republica.toss")
    subprocess.run([ADB, "-s", DEV, "shell",
                    "nohup sh -c 'for i in $(seq 1 300); do am start -n viva.republica.toss/.splash.SplashActivity >/dev/null 2>&1; sleep 2; done' >/dev/null 2>&1 &"],
                   capture_output=True, text=True, timeout=10)
    time.sleep(1.5)

    r = RSP(1234)
    active = set()
    wA = [None]

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

    # ---------- regmap (verified, pN-only vectors) ----------
    def fetch_xml(annex):
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

    import re as _re
    target = fetch_xml("target.xml")
    xmls = {"target.xml": target} if target else {}
    if target:
        for href in _re.findall(r'xi:include href="([^"]+)"', target):
            sub = fetch_xml(href)
            if sub:
                xmls[href] = sub

    def parse(xml):
        o = []
        for rm in _re.finditer(r'<reg\s+([^>]*)/>', xml):
            a = rm.group(1)
            nm = _re.search(r'name="([^"]+)"', a)
            bs = _re.search(r'bitsize="(\d+)"', a)
            rn = _re.search(r'regnum="(\d+)"', a)
            if nm and bs:
                o.append((nm.group(1), int(bs.group(1)), int(rn.group(1)) if rn else None))
        return o

    ordered = []
    if target:
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
                    ordered.append((nm.group(1), int(bs.group(1)), int(rn.group(1)) if rn else None))
    offb = 0
    rmap = {}
    num = 0
    for nm, bits, rn in ordered:
        num = rn if rn is not None else num + 1
        rmap[nm] = (offb, bits, num)
        offb += bits // 8
    ok_map = rmap.get("x5", (-1,))[0] == 40 and rmap.get("pc", (-1,))[0] == 256 and "v2" in rmap
    L("regmap: %s" % ("OK v2 regnum=%#x" % rmap["v2"][2] if ok_map else "FAILED"))
    if not ok_map:
        out["verdict"] = "NO_REGMAP"
        cleanup()
        open(ART, "w").write(json.dumps(out, indent=2))
        return

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
        g = r.cmd("g", 8)
        if not g or len(g) < 536:
            return {}, g
        def q(i):
            return int.from_bytes(bytes.fromhex(g[i * 16:i * 16 + 16]), "little")
        d = {("x%d" % i): q(i) for i in range(31)}
        d["sp"] = q(31)
        d["pc"] = q(32)
        return d, g

    def vec_pn(name):
        off, bits, num = rmap[name]
        rep = r.cmd("p%x" % num, 4)
        try:
            b = bytes.fromhex(rep[:bits // 4])
        except Exception:
            return None
        if len(b) < 16:
            return None
        return [int.from_bytes(b[i * 4:i * 4 + 4], "little") for i in range(4)]

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

    # ---------- run ----------
    try:
        r.interrupt()
        add(SOINFO)
        lib = None
        t0 = time.time()
        while time.time() - t0 < 240 and lib is None:
            s = r.cmd("c", 20)
            if not s or not s.startswith("T"):
                continue
            gr, _ = regs()
            si = gr.get("x0", 0)
            tag = u64(si + 0x1a0)
            nm2 = ""
            if tag:
                nm2 = cstr(u64(si + 0x1a0 + 0x10) & 0x00FFFFFFFFFFFFFF) if (tag & 1) else cstr(si + 0x1a1)
            if "ea56" in nm2:
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
        success = None
        failed_writers = set()
        decoder_store = None
        dup_live = None
        last_4write_pc = None
        store_campaigns = 0
        sig_expect = None
        try:
            _wc = _g2k["final4_windows"]["writer_code"]
            _off = (STUR - 0x10) - (STUR - 0x100)
            sig_expect = _wc[_off * 2:(_off + 0x40) * 2]
        except Exception:
            sig_expect = None
        dup_hits = 0
        dup_records = []
        timeouts = 0
        t1 = time.time()
        deadline = t1 + 700
        while time.time() < deadline and af4 is None:
            stop = r.cmd("c", 20)
            if not stop or not stop.startswith("T"):
                timeouts += 1
                if timeouts >= 3:
                    out["verdict_note"] = "timeout"
                    break
                continue
            timeouts = 0
            gr, _ = regs()
            pc = gr.get("pc", 0)
            sp = gr.get("sp", 0)
            if pc == ent:
                x0 = gr.get("x0", 0)
                n_ids += 1
                if x0 == 4:
                    af4 = {"t": round(time.time() - t1, 2), "call_no": n_ids,
                           "sp": hex(sp), "lr": hex(gr.get("x30", 0)),
                           "x1": hex(gr.get("x1", 0)),
                           "slotA_val": hex(u64(wA[0])) if wA[0] else None,
                           "last_4write_pc": hex(last_4write_pc) if last_4write_pc else None,
                           "decoder_store": hex(decoder_store) if decoder_store else None}
                    L("*** afed8(4) call#%d slotA=%s ***" % (n_ids, af4["slotA_val"]))
                    dele(ent)
                    break
                if sp46 is None and n_ids >= 46:
                    sp46 = sp
                    wA[0] = sp46 + SLOT_A
                    rz = r.cmd("Z2,%x,8" % wA[0], 3)
                    L("call#46 sp46=%s Z2 slotA=%s(%s) (dup on discovery)"
                      % (hex(sp46), hex(wA[0]), rz))
                dele(ent)
                o, _ = regs()
                r.cmd("s", 5)
                n2, _ = regs()
                if not (n2 and o and n2.get("pc") != o.get("pc")):
                    out["errors"].append({"kind": "Z1_NO_ADVANCE", "hit": n_ids})
                add(ent)
                continue
            if dup_live and pc == dup_live and dup_live in active:
                dup_hits += 1
                dele(DUP)
                pre = regs()[0]
                r.cmd("s", 6)
                post = regs()[0]
                v2 = vec_pn("v2")
                if v2 and all(l == 0x7500451c for l in v2):
                    rec = {"hit": dup_hits, "t": round(time.time() - t1, 2),
                           "pc": hex(pc), "sp": hex(sp),
                           "pre": {k: hex(pre.get(k, 0)) for k in
                                   ("x5", "x9", "x12", "x13", "x15", "x16", "x17", "x20", "x28", "x30")},
                           "post_x12": hex(post.get("x12", 0)),
                           "post_x15": hex(post.get("x15", 0)),
                           "v2": [hex(x) for x in v2],
                           "x9_table": m(pre.get("x9", 0) & ~0xF, 0x40) if pre.get("x9", 0) > 0x1000 else None,
                           "x12_stream": m(pre.get("x12", 0) & ~0xF, 0x40) if 0x1000 < pre.get("x12", 0) < 0xFFFFFFFFFFFF else None}
                    dup_records.append(rec)
                    L("DUP producer hit#%d: pre x12=%s x17=%s -> v2=0x7500451c" %
                      (dup_hits, rec["pre"]["x12"], rec["pre"]["x17"]))
                if dup_hits > DUP_BAIL:
                    L("dup bail at %d hits" % dup_hits)
                else:
                    add(DUP)
                continue
            # Z2 event (danced)
            if wA[0]:
                r.cmd("z2,%x,8" % wA[0], 3)
                before = u64(wA[0])
                old, _ = regs()
                r.cmd("s", 5)
                new, _ = regs()
                after = u64(wA[0])
                r.cmd("Z2,%x,8" % wA[0], 3)
                advanced = bool(old and new and new.get("pc") != old.get("pc"))
                if not advanced:
                    out["errors"].append({"kind": "Z2_NO_ADVANCE", "pc": hex(pc)})
                    continue
                if before != after and after == 4:
                    last_4write_pc = pc
                if (decoder_store is None and sig_expect and (pc & 0xffff) == 0x8f70):
                    live_sig = m(pc - 0x10, 0x40)
                    if live_sig == sig_expect:
                        decoder_store = pc
                        if dup_live is None:
                            dup_live = pc - 0x24
                        if dup_hits <= DUP_BAIL and dup_live not in active:
                            L("decoder store discovered: %#x (sig ok) dup=%#x (%s)"
                              % (pc, dup_live, add(dup_live)))
                        else:
                            L("decoder store discovered: %#x (sig ok) dup=%#x (dup bailed, not armed)"
                              % (pc, dup_live))
                if (before != after and after == 4 and decoder_store is not None
                        and pc == decoder_store and store_campaigns < 4):
                    store_campaigns += 1
                    # ---- CAMPAIGN from the decoder's 4-write ----
                    dele(ent)
                    if dup_live and dup_live in active:
                        dele(dup_live)   # runs 5-6 bug: stale DUP constant left the LIVE dup armed -> campaign stepped onto 8f4c -> deadlock-law abort
                    r.cmd("z2,%x,8" % wA[0], 2)
                    steps = []
                    gcur, _ = regs()
                    reach = None
                    for i in range(CAMPAIGN_BUDGET):
                        pcv = gcur.get("pc", 0)
                        rec = {"i": i, "pc": hex(pcv)}
                        for _ri in range(31):
                            rec["x%d" % _ri] = hex(gcur.get("x%d" % _ri, 0))
                        rec["sp"] = hex(gcur.get("sp", 0))
                        if i % 32 == 0:
                            sva = u64(wA[0])
                            rec["slotA"] = (lambda v: hex(v) if v is not None else None)(sva)
                            if i > 8000 and sva is not None and sva != 4:
                                steps.append(rec)
                                break
                        steps.append(rec)
                        if pcv == ent:
                            reach = {"i": i, "x0": gcur.get("x0", 0),
                                     "call_context": n_ids,
                                     "regs": {("x%d" % _ri): hex(gcur.get("x%d" % _ri, 0))
                                              for _ri in range(31)}}
                            reach["regs"]["sp"] = hex(gcur.get("sp", 0))
                            break
                        r.cmd("s", 6)
                        gcur = regs()[0]
                        if not gcur or gcur.get("pc", 0) == pcv:
                            out["errors"].append({"kind": "CAMP_STEP_NO_ADVANCE", "pc": hex(pcv)})
                            break
                    camp = {"from_store_pc": hex(pc), "steps": len(steps),
                            "reach_afed8": bool(reach),
                            "x0_at_reach": hex(reach["x0"]) if reach else None}
                    if reach and reach["x0"] == 4:
                        # find x0 transition + slotA readers offline inputs
                        success = {"campaign_steps": len(steps),
                                   "store_pc": hex(pc),
                                   "afed8_at_step": reach["i"],
                                   "n_ids_at_46": n_ids}
                        out["success_steps"] = steps   # persist FIRST
                        prev_x0 = None
                        for st in steps:
                            cur = int(st["x0"], 16)
                            if prev_x0 is not None and prev_x0 != 4 and cur == 4:
                                out["x0_transitions"].append(
                                    {"at_step": st["i"], "pc": st["pc"],
                                     "prev_pc": steps[st["i"] - 1]["pc"]})
                            prev_x0 = cur
                        pcs = sorted({int(st["pc"], 16) for st in steps})
                        if len(pcs) > 8000:
                            pcs = pcs[:8000]
                        success["insn_bytes"] = {hex(a): m(a, 4) for a in pcs}
                        # keep the full step list for offline EA analysis
                        out["success_steps"] = steps
                        L("*** CAMPAIGN SUCCESS: store %s -> afed8(4) in %d steps (x0 transitions: %d) ***"
                          % (hex(pc), len(steps), len(out["x0_transitions"])))
                        af4 = af4 or {"campaign": True,
                                      "t": round(time.time() - t1, 2),
                                      "call_no": n_ids + 1}
                        break
                    out["campaigns"].append(camp)
                    failed_writers.add(pc)
                    L("campaign #%d from %s: %d steps, reach=%s x0=%s -> fallback"
                      % (len(out["campaigns"]), hex(pc), len(steps),
                         bool(reach), camp["x0_at_reach"]))
                    # fallback: re-arm Z1s + Z2 and continue
                    add(ent)
                    if dup_live and dup_hits <= DUP_BAIL:
                        add(dup_live)
                    r.cmd("Z2,%x,8" % wA[0], 3)
                continue
            L("unexpected pc=%s" % hex(pc))
        out.update({"n_ids": n_ids, "afed8_4": af4, "success": success,
                    "dup_hits": dup_hits, "dup_producers": dup_records,
                    "verdict": ("MARSHAL_CHAIN_CLOSED" if success else
                                "AF4_NO_CAMPAIGN" if af4 else "NO_AF4")})
    finally:
        cleanup()
        try:
            open(ART, "w").write(json.dumps(out, indent=2))
        except Exception:
            pass
        open(ART.replace(".json", ".txt"), "w").write("\n".join(log) + "\n")
        print("VERDICT:", out.get("verdict"), flush=True)


if __name__ == "__main__":
    main()
