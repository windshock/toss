#!/usr/bin/env python3
"""§98 probe3: dump the invoke-bridge/marshaller that produced afed8(4, table, ctx).

At the afed8(x0=4) entry stop (same process context), dump:
  - fresh callsite code window (derive marshaller = the `bl` before the ldp/blr,
    via in-process capstone disasm)
  - marshaller code 0x1000 @ its entry
  - bridge x19 object 0x100 (fields +0x20 flags, +0x98 exc, +0xa8 args)
  - x1 table 0x200 (idx->code ptrs; entry idx4 = the poison row)
  - code at the idx4 ptr1 target and at the constant ptr2 thunk
  - monitor ctx 0x400 (covers the high-entropy descriptor blob)
Observation only. SIGTERM always detaches.
"""
import json, signal, subprocess, sys, time
sys.path.insert(0, "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/analysis-lab/scripts")
from hvf_hwbreak_toy import RSP
from capstone import Cs, CS_ARCH_ARM64, CS_MODE_LITTLE_ENDIAN

ADB = "/Users/1004276/Library/Android/sdk/platform-tools/adb"
DEV = "localhost:5555"
LINKER_BASE = 0xebc8ffebf000
SOINFO_NOTIFY = LINKER_BASE + 0x68bb4
AFED8 = 0xafed8
ART = "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/analysis-lab/artifacts/android/toss_marshaller_dump.json"


def adb(*a):
    return subprocess.run([ADB, "-s", DEV] + list(a), capture_output=True, text=True)


def main():
    out = {"provenance": "runtime", "probe": "invoke-bridge marshaller dump"}
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

    def dump(va, n):
        if not va:
            return None
        s = m(va, n)
        if s and not s.startswith("E") and len(s) >= n * 2:
            return s[:n * 2]
        return None

    md = Cs(CS_ARCH_ARM64, CS_MODE_LITTLE_ENDIAN)

    def find_bl_targets(code_hex, base_va, back=0x100):
        """disasm and return [(va, target)] for bl instructions in the window."""
        b = bytes.fromhex(code_hex)
        outl = []
        for insn in md.disasm(b, base_va):
            if insn.mnemonic == "bl":
                try:
                    tgt = int(insn.op_str.strip().replace("#", ""), 16)
                    outl.append((insn.address, tgt))
                except Exception:
                    pass
        return outl

    t0 = time.time()
    try:
        adb("shell", "am force-stop viva.republica.toss")
        adb("shell", "nohup sh -c 'for i in $(seq 1 120); do am start -n viva.republica.toss/.splash.SplashActivity; sleep 2; done' >/dev/null 2>&1 &")
        time.sleep(1.5)
        r = RSP(1234)
        r.interrupt()
        log("catching libea56 load...")
        add(SOINFO_NOTIFY)
        hit = r.cmd("c", 20)
        found = None
        ev = 0
        while hit and hit.startswith("T") and ev < 300:
            ev += 1
            gr = regs()
            si = gr.get("x0", 0)
            if "ea56" in " | ".join(names(si)):
                found = {"soinfo": si, "base": u64(si + 0x100)}
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
        out["libea56_base"] = hex(base)
        dele(SOINFO_NOTIFY)
        log("libea56 base=%#x" % base)
        log("Z1 afed8 -> %s" % add(ent))

        deadline = time.time() + 150
        timeouts = 0
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
            if gr.get("x0") != 4:
                dele(ent)
                r.cmd("s", 5)
                add(ent)
                continue
            caller = gr.get("x30", 0) - 4
            log("*** POISON ENTRY: caller=%#x x1=%s x2=%s x19bridge=%s sp=%s ***" %
                (caller, hex(gr.get("x1", 0)), hex(gr.get("x2", 0)), hex(gr.get("x19", 0)), hex(gr.get("sp", 0))))
            cap = {"caller": hex(caller), "x0": hex(gr.get("x0", 0)),
                   "x1": hex(gr.get("x1", 0)), "x2": hex(gr.get("x2", 0)),
                   "x19_bridge": hex(gr.get("x19", 0)), "sp": hex(gr.get("sp", 0))}
            # 1. fresh code window + derive marshaller via bl right before the blr block
            cw = dump(caller - 0xa0, 0xc0)
            cap["code_window"] = {"va": hex(caller - 0xa0), "hex": cw}
            bls = find_bl_targets(cw, caller - 0xa0)
            log("bl targets in window: %s" % [(hex(a), hex(t)) for a, t in bls])
            marsh = None
            for a, t in bls:
                if a < caller - 0x40 and a > caller - 0xa0:
                    marsh = t  # the prepare bl before the ldp/blr sequence
            if marsh is None and bls:
                marsh = bls[-1][1]
            cap["marshaller"] = hex(marsh) if marsh else None
            log("marshaller = %s" % cap["marshaller"])
            # 2. dumps
            if marsh:
                cap["marshaller_code"] = {"va": hex(marsh), "hex": dump(marsh, 0x1000)}
            x19b = gr.get("x19", 0)
            cap["bridge_obj"] = {"va": hex(x19b), "hex": dump(x19b, 0x100)}
            x1v = gr.get("x1", 0)
            tbl_hex = dump(x1v, 0x200)
            cap["x1_table"] = {"va": hex(x1v), "hex": tbl_hex}
            # parse rows: stride 0x20: qword1=idx/flags, qword2=ptr1, qword3=ptr2
            rows = []
            if tbl_hex:
                bb = bytes.fromhex(tbl_hex)
                for i in range(0, len(bb) - 0x20 + 1, 0x20):
                    q1 = int.from_bytes(bb[i + 8:i + 16], "little")
                    p1 = int.from_bytes(bb[i + 16:i + 24], "little")
                    p2 = int.from_bytes(bb[i + 24:i + 32], "little")
                    rows.append({"off": hex(i), "idx_field": hex(q1), "ptr1": hex(p1), "ptr2": hex(p2)})
                cap["x1_rows"] = rows
                for row in rows:
                    log("  row %s: idx=%s p1=%s p2=%s" % (row["off"], row["idx_field"], row["ptr1"], row["ptr2"]))
            # 3. code at idx4 row ptr1 + constant ptr2
            r4 = next((row for row in rows if (int(row["idx_field"], 16) >> 32) == 4), None) if rows else None
            if r4:
                p1 = int(r4["ptr1"], 16)
                cap["idx4_ptr1_code"] = {"va": r4["ptr1"], "hex": dump(p1, 0x100)}
            if rows:
                p2 = int(rows[0]["ptr2"], 16)
                cap["ptr2_code"] = {"va": rows[0]["ptr2"], "hex": dump(p2, 0x80)}
            # 4. monitor ctx wide
            x2 = gr.get("x2", 0)
            for cand in (x2 & 0x00FFFFFFFFFFFFFF, x2):
                dd = dump(cand, 0x400)
                if dd:
                    cap["monitor_ctx"] = {"va": hex(cand), "hex": dd}
                    break
            # 5. bridge scratch frame: the 0x1400 buffer the marshaller filled is gone (sp restored),
            #    but the saved-args area at old sp (x28) = sp_at_bridge; dump around current sp too.
            cap["caller_stack"] = {"va": hex(gr.get("sp", 0)), "hex": dump(gr.get("sp", 0) - 0x40, 0x140)}
            out["capture"] = cap
            out["verdict"] = "MARSHALLER_CONTEXT_CAPTURED"
            break
        else:
            out["verdict"] = "NO_ID4"
        if "verdict" not in out:
            out["verdict"] = "NO_ID4"
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
