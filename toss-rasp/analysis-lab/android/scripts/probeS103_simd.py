#!/usr/bin/env python3
"""§103 probeS103_simd: SIMD data-flow provenance of the final value 4.

S102 established (dance-verified): final slotA=4 writer = stur q0,[sp,#0x28]
@ 0xe14bc1318f70; afed8(4) one event later, same run. OPEN (S103 directive):
which instruction actually first materializes 4, via which SIMD lanes.

Method (all stops dance-verified, register numbers from target.xml ONLY):
  A. qXfer:features:read:target.xml (+ xi:include chain) -> parse register
     order/bitsize -> exact g-packet offsets for x0-x30/sp/pc/v0-v31.
  B. launch -> libea56 -> Z1 afed8 (danced) -> at call#46 verify the writer
     code signature vs the S102 artifact, then arm ONE Z1 at the decoder
     block entry 0xe14bc1318f38.
  C. On each 8f38 hit: single-step-trace the whole executed block
     (up to leaving 0xe14bc1318fd0 or 80 steps), capturing per step:
       pc, sp, lr, x5, x12/x15/x16/x17 (pre+post), q0..q4 (128-bit,
       low64/high64/lanes via g-slices), slotA=u64(sp+0x30), [sp+0x24].
     A row at pc==8f70 with q0.high64==4 whose NEXT row shows slotA==4 marks
     a 4-PRODUCING invocation -> full row-set retained + bitstream refs.
  D. afed8(4) (same run): capture regs+q0, slotA; while the process is still
     alive at the stop, dump the FINAL 4-producing invocation's bitstream
     window [x8-0x20, x8+0x80] and width-table [x12tbl, +0x40].
  E. Offline (host): reproduce ldr/lsr/lsl/orr + dup/ushl/and from the
     captured raw bytes/registers -> expect q0.high64 lane2 == 4."""
import json, re, signal, subprocess, sys, time
sys.path.insert(0, "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/analysis-lab/scripts")
from hvf_hwbreak_toy import RSP

ADB = "/Users/1004276/Library/Android/sdk/platform-tools/adb"
DEV = "localhost:5555"
AFED8 = 0xafed8
# dynamic per-layout: the decoder cluster relocates across userspace restarts
# (S102: 0xe14bc1318f70 -> new layout 0xfffd35518f70, low bits preserved).
# STUR/BLK_ENT/signature all come from the LATEST probeG2k_final4 artifact.
SLOT_A = -0x3e0              # sp46-relative
ART = "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/analysis-lab/artifacts/android/toss_s103_simd.json"
S102 = "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/analysis-lab/artifacts/android/toss_s102_probeG2k_final4.json"
_g2k = json.load(open(S102))
STUR = int(_g2k["final4_writer"]["pc"], 16)
BLK_ENT = STUR - 0x38
BLK_END = STUR + 0x60


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
    out = {"probe": "S103 SIMD provenance of final 4"}

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

    # verify writer code signature against S102 artifact before trusting addresses
    try:
        s102 = json.load(open(S102))
        wc = s102["final4_windows"]["writer_code"]        # m(STUR-0x100, 0x200)
        off = (STUR - 0x10) - (STUR - 0x100)              # 0xf0
        sig = wc[off * 2:(off + 0x40) * 2]
        out["s102_writer_sig"] = sig
    except Exception as e:
        sig = None
        L("WARN: cannot load S102 signature: %s" % e)

    adb_sh("for p in $(ps -A -o PID,ARGS | grep '[s]eq 1' | grep '[v]iva.republica.toss/.splash.SplashActivity' | awk '{print $1}'); do kill $p; done")
    adb_sh("am force-stop viva.republica.toss")
    subprocess.run([ADB, "-s", DEV, "shell",
                    "nohup sh -c 'for i in $(seq 1 300); do am start -n viva.republica.toss/.splash.SplashActivity >/dev/null 2>&1; sleep 2; done' >/dev/null 2>&1 &"],
                   capture_output=True, text=True, timeout=10)
    time.sleep(1.5)

    r = RSP(1234)
    active = set()

    def cleanup():
        try:
            try:
                r.interrupt()
            except Exception:
                pass
            for bp in list(active):
                r.cmd("z1,%x,4" % bp, 2)
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

    # ---------- Phase A: target.xml register map ----------
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

    regmap = None
    try:
        target = fetch_xml("target.xml")
        if target:
            xmls = {"target.xml": target}
            for href in re.findall(r'xi:include href="([^"]+)"', target):
                sub = fetch_xml(href)
                if sub:
                    xmls[href] = sub
            out["target_xml"] = {k: v[:2000] for k, v in xmls.items()}
            def parse(xml):
                out = []
                for rm in re.finditer(r'<reg\s+([^>]*)/>', xml):
                    attrs = rm.group(1)
                    nm = re.search(r'name="([^"]+)"', attrs)
                    bs = re.search(r'bitsize="(\d+)"', attrs)
                    rn = re.search(r'regnum="(\d+)"', attrs)
                    if nm and bs:
                        out.append((nm.group(1), int(bs.group(1)),
                                    int(rn.group(1)) if rn else None))
                return out
            ordered = []
            for tm in re.finditer(r'(<reg\s[^>]*/>|<xi:include href="[^"]+"\s*/>)', target):
                tok = tm.group(1)
                if tok.startswith("<xi:include"):
                    href = re.search(r'href="([^"]+)"', tok).group(1)
                    ordered += parse(xmls.get(href, ""))
                else:
                    attrs = tok[5:-2]
                    nm = re.search(r'name="([^"]+)"', attrs)
                    bs = re.search(r'bitsize="(\d+)"', attrs)
                    rn = re.search(r'regnum="(\d+)"', attrs)
                    if nm and bs:
                        ordered.append((nm.group(1), int(bs.group(1)),
                                        int(rn.group(1)) if rn else None))
            if ordered:
                # g-packet offsets: cumulative by bitsize in XML order
                offb = 0
                rmap = {}
                num = 0
                for nm, bits, regnum in ordered:
                    rmap[nm] = (offb, bits)
                    offb += bits // 8
                    num = regnum if regnum is not None else num + 1
                # self-validation vs the battle-tested core layout (S101/S102)
                ok_core = (rmap.get("x5", (-1,))[0] == 40 and
                           rmap.get("pc", (-1,))[0] == 256 and
                           rmap.get("sp", (-1,))[0] == 248 and rmap.get("v0") is not None)
                out["regmap_selfcheck"] = bool(ok_core)
                regmap = rmap if ok_core else None
                out["regmap"] = {k: [v[0], v[1]] for k, v in rmap.items()
                                 if k in ("x0", "x5", "x12", "x15", "x16", "x17", "sp", "pc",
                                          "cpsr", "v0", "v1", "v2", "v3", "v4", "v31", "fpsr", "fpcr")}
                out["g_packet_bytes"] = offb
                L("regmap: g=%dB; v0@%dB, v4@%dB, cpsr@%dB, selfcheck=%s" %
                  (offb, rmap.get("v0", (0, 0))[0], rmap.get("v4", (0, 0))[0],
                   rmap.get("cpsr", (-1, 0))[0], ok_core))
    except Exception as e:
        L("XML fetch/parse error: %s" % e)
    if not regmap or "v0" not in regmap:
        out["verdict"] = "NO_REGMAP"
        L("FATAL: no reliable vector register map - refusing to guess (S103 rule)")
        cleanup()
        try:
            open(ART, "w").write(json.dumps(out, indent=2))
        except Exception:
            pass
        return

    def gfull():
        g = r.cmd("g", 8)
        return g if g and len(g) >= regmap["sp"][0] * 2 + 16 else None

    def slice_reg(g, name):
        off, bits = regmap[name]
        hx = g[off * 2:off * 2 + bits // 4]
        try:
            return bytes.fromhex(hx)
        except Exception:
            return None

    def ireg(g, name):
        b = slice_reg(g, name)
        if b is None:
            return None
        return int.from_bytes(b[:8], "little")

    def vec(g, name):
        b = slice_reg(g, name)
        if b is None or len(b) < 16:
            return None
        lanes = [int.from_bytes(b[i * 4:i * 4 + 4], "little") for i in range(4)]
        return {"raw": b.hex(), "low64": hex(int.from_bytes(b[:8], "little")),
                "high64": hex(int.from_bytes(b[8:], "little")),
                "lanes": [hex(x) for x in lanes]}

    def regs():
        g = gfull()
        if not g:
            return {}, g
        d = {("x%d" % i): ireg(g, "x%d" % i) for i in range(31)}
        d["sp"] = ireg(g, "sp")
        d["pc"] = ireg(g, "pc")
        return d, g

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

        # signature check of the decoder block
        live = m(STUR - 0x10, 0x40)
        out["live_writer_sig"] = live
        if sig is not None and live != sig:
            L("SIG MISMATCH: live=%s expected=%s (addresses stale - aborting per S103 rule)" % (live[:40], sig[:40]))
            out["verdict"] = "SIG_MISMATCH"
            return
        L("writer code signature matches S102 (32B@STUR-0x10 ok)")

        n_ids = 0
        sp46 = None
        blk_armed = False
        invocations = 0
        four_producers = []       # summary of every 4-producing invocation
        keep_rows = {}            # inv# -> rows (4-producing + last)
        last_rows = []
        af4 = None
        timeouts = 0
        t1 = time.time()
        deadline = t1 + 700

        def row(g, tag, sp):
            vq = {}
            for qn in ("v0", "v1", "v2", "v3", "v4"):
                v = vec(g, qn)
                if v:
                    vq[qn] = v
            return {"tag": tag,
                    "pc": hex(ireg(g, "pc")), "sp": hex(ireg(g, "sp")),
                    "lr": hex(ireg(g, "x30") or 0),
                    "x5": hex(ireg(g, "x5") or 0),
                    "x12": hex(ireg(g, "x12") or 0),
                    "x15": hex(ireg(g, "x15") or 0),
                    "x16": hex(ireg(g, "x16") or 0),
                    "x17": hex(ireg(g, "x17") or 0),
                    "slotA": (lambda v: hex(v) if v is not None else None)(u64(sp + 0x30)),
                    "sp24": (lambda v: hex(v) if v is not None else None)(u64(sp + 0x24)),
                    "vec": vq}

        while time.time() < deadline:
            stop = r.cmd("c", 20)
            if not stop or not stop.startswith("T"):
                timeouts += 1
                if timeouts >= 3:
                    out["verdict_note"] = "timeout"
                    break
                continue
            timeouts = 0
            gr, g0 = regs()
            pc = gr.get("pc", 0)
            sp = gr.get("sp", 0)
            if pc == ent:
                x0 = gr.get("x0", 0)
                n_ids += 1
                if x0 == 4:
                    slotA = u64(sp46 + SLOT_A) if sp46 else None
                    q0g = vec(g0, "v0") if g0 else None
                    af4 = {"t": round(time.time() - t1, 2), "call_no": n_ids,
                           "sp": hex(sp), "lr": hex(gr.get("x30", 0)),
                           "x0": hex(x0), "x1": hex(gr.get("x1", 0)),
                           "x5": hex(gr.get("x5", 0)),
                           "slotA": hex(slotA) if slotA is not None else None,
                           "q0": q0g}
                    L("*** afed8(4) call#%d slotA=%s x5=%s ***" % (n_ids, af4["slotA"], af4["x5"]))
                    # live-process dumps for the FINAL 4-producing invocation
                    if four_producers:
                        fp = four_producers[-1]
                        for key, ptr in (("bitstream_x8", fp.get("x8")),
                                         ("table_x9", fp.get("x9"))):
                            if ptr:
                                out[key] = m(max(0, ptr - 0x20), 0xc0)
                        L("dumped final bitstream x8=%s table x9=%s" %
                          (hex(fp.get("x8", 0)), hex(fp.get("x9", 0))))
                    dele(ent)
                    break
                if sp46 is None and n_ids >= 46:
                    sp46 = sp
                    L("call#46 sp46=%s -> Z1 STUR=%s" % (hex(sp46), add(STUR)))
                    blk_armed = True
                # afed8 dance
                dele(ent)
                o, _ = regs()
                r.cmd("s", 5)
                n, _ = regs()
                if not (n and o and n.get("pc") != o.get("pc")):
                    out.setdefault("errors", []).append({"kind": "Z1_NO_ADVANCE", "hit": n_ids})
                add(ent)
                continue
            if pc == STUR and blk_armed:
                # OLLVM control-flow flattening: block fragments are entered by
                # computed dispatcher jumps (run-4: 8f38 never hit on the main
                # thread while 8f60/8f68 executed). So trap THE STORE itself and
                # dance: pre-store SIMD state is fully readable from one g.
                dele(STUR)
                pre = {"pc": hex(pc), "sp": hex(sp), "lr": hex(gr.get("x30", 0))}
                for rn in ("x5", "x8", "x9", "x12", "x13", "x15", "x16", "x17", "x20", "x28"):
                    pre[rn] = hex(gr.get(rn, 0) or 0)
                pre["vec"] = {qn: vec(g0, qn) for qn in ("v0", "v1", "v2", "v3", "v4")}
                pre["slotA"] = (lambda v: hex(v) if v is not None else None)(u64(sp + 0x30))
                pre["sp28_16B"] = m(sp + 0x28, 16)
                r.cmd("s", 6)                       # executes stur q0,[sp,#0x28]
                g1 = gfull()
                post_pc = ireg(g1, "pc") if g1 else None
                slotA_after = u64(sp + 0x30)
                if post_pc is None or post_pc == pc:
                    out.setdefault("errors", []).append(
                        {"kind": "STUR_STEP_NO_ADVANCE", "pc": hex(pc)})
                    add(STUR)
                    continue
                rec = {"inv": len(four_producers) + 1, "t": round(time.time() - t1, 2), **pre,
                       "post_pc": hex(post_pc),
                       "slotA_after": (lambda v: hex(v) if v is not None else None)(slotA_after),
                       "sp28_16B_after": m(sp + 0x28, 16)}
                q0hi = pre["vec"]["v0"]["high64"] if pre["vec"].get("v0") else None
                if q0hi == "0x4" and rec["slotA_after"] == "0x4":
                    four_producers.append({k: rec[k] for k in
                                           ("inv", "t", "pc", "sp", "lr", "x8", "x9", "x12", "x13")})
                    keep_rows["hit%d" % rec["inv"]] = rec
                    L("4-PRODUCING STUR hit #%d: sp=%s lr=%s x8=%s x12=%s v2=%s" %
                      (rec["inv"], rec["sp"], rec["lr"], pre["x8"], pre["x12"],
                       pre["vec"].get("v2", {}).get("lanes")))
                else:
                    if len(keep_rows) < 12:
                        keep_rows["hit%d_non4" % rec["inv"]] = rec
                add(STUR)
                continue
            L("unexpected pc=%s sp=%s" % (hex(pc), hex(sp)))
        out.update({"n_ids": n_ids, "stur_hits": len(keep_rows),
                    "four_producers": [{k: (hex(v) if isinstance(v, int) else v)
                                        for k, v in fp.items()} for fp in four_producers],
                    "kept_rows": keep_rows,
                    "afed8_4": af4,
                    "verdict": ("AF4_" + ("FINAL4_ROWS" if four_producers else "NO_PRODUCER")
                                if af4 else "NO_AF4")})
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
