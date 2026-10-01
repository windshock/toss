#!/usr/bin/env python3
"""§109 probeS109_width: capture the decoder's (word, offset, width, field) tuples.

Track A milestone 2. The decoder block (layout-relative …8f00-8f70, S103 disasm):
    8f0c lsr x12,x14,#6        byte index = bitpos>>6
    8f14 and x15,x14,#0x3f     bit offset
    8f18 and x16,(-x14),#0x3f  remaining = (64-off)&63
    8f1c add x12,x9,x12,lsl#3  row = words_array + idx*8
    8f38 ldr x17,[x12,w17,uxtw#3]   width/token from parallel array
    8f3c ldr x12,[x12]              stream word
    8f40 lsr x12,x12,x15
    8f44 lsl x15,x17,x16
    8f48 orr w12,w15,w12            decoded field
Plan: discovery via Z2(slotA) + 8f70-sig (proven pattern); then Z1 at
STORE-0x34 (=8f3c). On each hit: dance + 4-step micro-trace capturing
pre-regs, the row window [x12-0x10,+0x40], and the ORR result. Ride to
afed8(4) same-run. Offline: reconstruct the width table + field sequence."""
import json, signal, subprocess, sys, time
sys.path.insert(0, "/Users/1004276/Downloads/toss/toss-rasp/analysis-lab/scripts")
from hvf_hwbreak_toy import RSP

ADB = "/Users/1004276/Library/Android/sdk/platform-tools/adb"
DEV = "localhost:5555"
AFED8 = 0xafed8
SLOT_A = -0x3e0
S102 = "/Users/1004276/Downloads/toss/toss-rasp/analysis-lab/artifacts/android/toss_s102_probeG2k_final4.json"
ART = "/Users/1004276/Downloads/toss/toss-rasp/analysis-lab/artifacts/android/toss_s109_width.json"
_g2k = json.load(open(S102))
_sig = None
try:
    _wc = _g2k["final4_windows"]["writer_code"]
    _stur = int(_g2k["final4_writer"]["pc"], 16)
    _off = (_stur - 0x10) - (_stur - 0x100)
    _sig = _wc[_off * 2:(_off + 0x40) * 2]
except Exception:
    pass
MAX_ROWS = 400


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
    out = {"probe": "S109 decoder tuple capture", "rows": [], "errors": []}

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
    L("linker: %#x  sig=%s" % (LB, "ok" if _sig else "MISSING"))
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
        decoder_store = None
        tuple_bp = None
        af4 = None
        timeouts = 0
        t1 = time.time()
        deadline = t1 + 800
        while time.time() < deadline and af4 is None:
            stop = r.cmd("c", 20)
            if not stop or not stop.startswith("T"):
                timeouts += 1
                if timeouts >= 3:
                    out["verdict_note"] = "timeout"
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
                    af4 = {"t": round(time.time() - t1, 2), "call_no": n_ids,
                           "rows": len(out["rows"])}
                    L("*** afed8(4) call#%d rows=%d ***" % (n_ids, len(out["rows"])))
                    dele(ent)
                    break
                if sp46 is None and n_ids >= 46:
                    sp46 = sp
                    wA[0] = sp46 + SLOT_A
                    L("call#46 sp46=%s Z2=%s" % (hex(sp46), r.cmd("Z2,%x,8" % wA[0], 3)))
                dele(ent)
                o = regs()
                r.cmd("s", 5)
                n2 = regs()
                if not (n2 and o and n2.get("pc") != o.get("pc")):
                    out["errors"].append({"kind": "Z1_NO_ADVANCE"})
                add(ent)
                continue
            if tuple_bp and pc == tuple_bp and tuple_bp in active:
                # ---- decoder tuple row: dance + 4-step micro-trace ----
                dele(tuple_bp)
                pre = regs()
                row_base = pre.get("x12", 0)
                rec = {"pc": hex(pc),
                       "x9": hex(pre.get("x9", 0)),
                       "x11": hex(pre.get("x11", 0)),
                       "x14_bitpos": hex(pre.get("x14", 0)),
                       "w17_sel": hex(pre.get("x17", 0) & 0xFFFFFFFF),
                       "row_base": hex(row_base),
                       "row_win": m(max(0, row_base - 0x10), 0x40) if 0x1000 < row_base < 0xFFFFFFFFFFFF else None}
                states = [rec]
                gcur = pre
                ok = True
                for k in range(4):          # 8f3c ldr x12,[x12]; 8f40 lsr; 8f44 lsl; 8f48 orr
                    r.cmd("s", 6)
                    gcur = regs()
                    if not gcur or gcur.get("pc", 0) == pre.get("pc", 0):
                        out["errors"].append({"kind": "TUPLE_STEP_NO_ADVANCE"})
                        ok = False
                        break
                    states.append({"pc": hex(gcur.get("pc", 0)),
                                   "x12": hex(gcur.get("x12", 0)),
                                   "x15": hex(gcur.get("x15", 0)),
                                   "x16": hex(gcur.get("x16", 0)),
                                   "x17": hex(gcur.get("x17", 0))})
                if ok and len(states) == 5:
                    word = int(states[1]["x12"], 16)       # after ldr x12,[x12]
                    x17w = int(states[1]["x17"], 16) if states[1]["x17"] else None
                    # x17 loaded at 8f38 - BEFORE our first step: use pre x17
                    x17w = pre.get("x17", 0)
                    off = pre.get("x15", 0) & 0x3F if pre.get("x15") else None
                    width_tok = x17w
                    field = int(states[4]["x12"], 16) & 0xFFFFFFFF
                    rec.update({"stream_word": hex(word),
                                "bit_off": off,
                                "width_token": hex(width_tok),
                                "decoded_field": hex(field)})
                    out["rows"].append(rec)
                    if len(out["rows"]) <= 6 or len(out["rows"]) % 50 == 0:
                        L("row#%d word=%s off=%s tok=%s field=%s" %
                          (len(out["rows"]), rec["stream_word"], rec.get("bit_off"),
                           rec["width_token"], rec["decoded_field"]))
                if len(out["rows"]) < MAX_ROWS:
                    add(tuple_bp)
                continue
            # Z2 events (danced) - discovery + bookkeeping
            if wA[0]:
                r.cmd("z2,%x,8" % wA[0], 3)
                before = u64(wA[0])
                old = regs()
                r.cmd("s", 5)
                new = regs()
                after = u64(wA[0])
                r.cmd("Z2,%x,8" % wA[0], 3)
                if not (old and new and new.get("pc") != old.get("pc")):
                    out["errors"].append({"kind": "W_NO_ADVANCE", "pc": hex(pc)})
                    continue
                if (decoder_store is None and _sig and (pc & 0xffff) == 0x8f70
                        and m(pc - 0x10, 0x40) == _sig):
                    decoder_store = pc
                    tuple_bp = pc - 0x34        # 8f3c
                    L("decoder store %#x -> tuple bp %#x (%s)" %
                      (pc, tuple_bp, add(tuple_bp)))
                continue
            L("unexpected pc=%s" % hex(pc))
        out.update({"n_ids": n_ids, "afed8_4": af4, "decoder_store":
                    hex(decoder_store) if decoder_store else None,
                    "verdict": ("TUPLES_%d" % len(out["rows"])) if out["rows"]
                    else ("AF4_NO_TUPLES" if af4 else "NO_AF4")})
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
