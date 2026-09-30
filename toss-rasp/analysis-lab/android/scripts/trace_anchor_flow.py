#!/usr/bin/env python3
"""Trace the runtime flow libea56+0x13a4bc -> afed8 -> selected handler.

Observation only. Reuses the already-confirmed linker soinfo wrapper hook to
catch libea56 load, arms a HW breakpoint at the anchor, then reads the CPU's
actual indirect branch targets from registers.
"""
import json
import signal
import struct
import subprocess
import sys
import time

sys.path.insert(0, "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/analysis-lab/scripts")
from hvf_hwbreak_toy import RSP

LINKER_BASE = 0xebc8ffebf000
SOINFO_NOTIFY = LINKER_BASE + 0x68bb4
ANCHOR_OFF = 0x13a4bc
AFED8_OFF = 0xafed8
AFED8_END = 0xb0900
DEV = "localhost:5555"
LIB = "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/libea56.so"
ART = "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/analysis-lab/artifacts/android/toss_anchor_flow.json"


def adb(*a):
    return subprocess.run(["adb", "-s", DEV] + list(a), capture_output=True, text=True)


def insn_word(hex_bytes):
    try:
        b = bytes.fromhex(hex_bytes[:8])
        if len(b) != 4:
            return None
        return int.from_bytes(b, "little")
    except Exception:
        return None


def indirect_kind(word):
    if word is None:
        return None
    if (word & 0xfffffc1f) == 0xd61f0000:
        return {"op": "br", "reg": (word >> 5) & 31}
    if (word & 0xfffffc1f) == 0xd63f0000:
        return {"op": "blr", "reg": (word >> 5) & 31}
    return None


def scan_indirect_sites():
    sites = []
    with open(LIB, "rb") as f:
        data = f.read()
    for off in range(AFED8_OFF, min(AFED8_END, len(data) - 4), 4):
        word = struct.unpack_from("<I", data, off)[0]
        k = indirect_kind(word)
        if k:
            sites.append({"off": off, "word": word, **k})
    return sites


def main():
    out = {
        "provenance": "runtime-confirmed",
        "mode": "anchor_to_handler_flow",
        "afed8_window": {"start": hex(AFED8_OFF), "end": hex(AFED8_END)},
        "static_indirect_sites": [
            {"off": hex(s["off"]), "op": s["op"], "reg": "x%d" % s["reg"]}
            for s in scan_indirect_sites()
        ],
    }
    active_bps = set()
    r = None

    def cleanup():
        if not r:
            return
        try:
            for bp in list(active_bps):
                r.cmd("z1,%x,4" % bp, 2)
            r.cmd("z1,%x,4" % SOINFO_NOTIFY, 2)
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

    def libcxx_string(va):
        tag = u32(va)
        if tag is None:
            return ""
        if tag & 1:
            return cstr(u64(va + 0x10) or 0)
        return cstr(va + 1)

    def soinfo_names(si):
        names = []
        rp = libcxx_string(si + 0x1a0)
        if rp:
            names.append(rp)
        lm_name = cstr(u64(si + 0xd8) or 0)
        if lm_name and lm_name not in names:
            names.append(lm_name)
        return names

    def regs_all():
        gg = r.cmd("g", 5)
        if not gg or len(gg) < 528:
            return {}

        def q(i):
            return int.from_bytes(bytes.fromhex(gg[i * 16:i * 16 + 16]), "little")

        d = {("x%d" % i): q(i) for i in range(31)}
        d["sp"] = q(31)
        d["pc"] = q(32)
        return d

    def regs_subset(regs):
        keys = ["pc", "sp", "x0", "x1", "x2", "x3", "x8", "x9", "x10", "x19", "x30"]
        return {k: hex(regs[k]) for k in keys if k in regs}

    def dump_mem(va, n=128):
        if not va:
            return {"addr": hex(va), "hex": ""}
        s = m(va, n)
        return {"addr": hex(va), "hex": s if s and not s.startswith("E") else s}

    def in_lib(va, base):
        return base <= va < base + 0x300000

    def off_of(va, base):
        return va - base if in_lib(va, base) else None

    def add_bp(va):
        res = r.cmd("Z1,%x,4" % va, 3)
        if res == "OK":
            active_bps.add(va)
        return res

    def del_bp(va):
        try:
            r.cmd("z1,%x,4" % va, 3)
        finally:
            active_bps.discard(va)

    def step_once(t=5):
        return r.cmd("s", t)

    try:
        print("starting in-guest Toss relaunch loop (before gdbstub connect)...", flush=True)
        adb("shell", "am force-stop viva.republica.toss")
        adb("shell", "nohup sh -c 'for i in $(seq 1 60); do am start -n viva.republica.toss/.splash.SplashActivity; sleep 2; done' >/dev/null 2>&1 &")
        time.sleep(1.5)

        print("connecting gdbstub...", flush=True)
        r = RSP(1234)
        print("connected", flush=True)
        r.interrupt()

        print("catching libea56 via soinfo wrapper @ %#x..." % SOINFO_NOTIFY, flush=True)
        add_bp(SOINFO_NOTIFY)
        hit = r.cmd("c", 20)
        found = None
        events = 0
        while hit and hit.startswith("T") and events < 200:
            events += 1
            gr = regs_all()
            si = gr.get("x0", 0)
            name = " | ".join(soinfo_names(si))
            bias = u64(si + 0x100) if si else None
            if "ea56" in name:
                found = {"soinfo": si, "base": bias, "name": name}
                break
            del_bp(SOINFO_NOTIFY)
            step_once()
            add_bp(SOINFO_NOTIFY)
            hit = r.cmd("c", 20)

        out["loader_events_until_libea56"] = events
        if not found or not found["base"]:
            out["verdict"] = "NO_LIBEA56"
            out["reason"] = "libea56 was not caught via soinfo wrapper"
            return

        base = found["base"]
        anchor = base + ANCHOR_OFF
        afed8 = base + AFED8_OFF
        out["libea56"] = {
            "base": hex(base),
            "name": found["name"],
            "soinfo": hex(found["soinfo"]),
            "anchor": hex(anchor),
            "afed8": hex(afed8),
        }
        print("libea56 base=%#x anchor=%#x afed8=%#x" % (base, anchor, afed8), flush=True)

        del_bp(SOINFO_NOTIFY)
        print("arming anchor @ %#x..." % anchor, flush=True)
        add_bp(anchor)
        anchor_hits = []
        post = None
        for hit_index in range(16):
            hit = r.cmd("c", 45)
            if not hit or not hit.startswith("T"):
                out["anchor_stop"] = hit
                break
            out["anchor_stop"] = hit
            pre = regs_all()
            anchor_bytes = m(anchor, 4)
            anchor_target = pre.get("x9", 0)
            target_off = off_of(anchor_target, base)
            event = {
                "index": hit_index,
                "stop": hit,
                "regs": regs_subset(pre),
                "bytes": anchor_bytes,
                "x9_target": hex(anchor_target),
                "x9_target_off": hex(target_off) if target_off is not None else None,
                "lr_pre": hex(pre.get("x30", 0)),
            }
            print("anchor hit %d: x9=%#x off=%s lr=%#x" %
                  (hit_index, anchor_target, event["x9_target_off"], pre.get("x30", 0)), flush=True)

            del_bp(anchor)
            step_reply = step_once()
            post = regs_all()
            pc_after_anchor = post.get("pc", 0)
            event["step"] = {
                "reply": step_reply,
                "regs": regs_subset(post),
                "pc_off": hex(off_of(pc_after_anchor, base)) if off_of(pc_after_anchor, base) is not None else None,
                "lr_is_anchor_plus_4": post.get("x30") == anchor + 4,
                "callee_is_afed8": pc_after_anchor == afed8,
            }
            anchor_hits.append(event)
            print("  after blr: pc=%#x off=%s lr=%#x afed8=%s" %
                  (pc_after_anchor, event["step"]["pc_off"], post.get("x30", 0),
                   event["step"]["callee_is_afed8"]), flush=True)

            if pc_after_anchor == afed8:
                break

            # Manual call step-over: wait until the non-target call returns to anchor+4,
            # then re-arm anchor and continue looking for the afed8 dispatch call.
            ret_bp = anchor + 4
            add_bp(ret_bp)
            rh = r.cmd("c", 8)
            event["return_to_anchor_plus_4_stop"] = rh
            del_bp(ret_bp)
            if not rh or not rh.startswith("T"):
                break
            add_bp(anchor)

        out["anchor_hits"] = anchor_hits
        if not anchor_hits:
            out["verdict"] = "NO_ANCHOR_HIT"
            return
        out["anchor_pre"] = anchor_hits[-1]
        out["anchor_step"] = anchor_hits[-1].get("step", {})
        if not out["anchor_step"].get("callee_is_afed8"):
            out["verdict"] = "ANCHOR_CALLEE_NOT_AFED8"
            return

        branch_sites = [base + s["off"] for s in scan_indirect_sites()]
        insert_results = {hex(bp): add_bp(bp) for bp in branch_sites}
        out["branch_bp_insert_results"] = insert_results
        if any(v != "OK" for v in insert_results.values()):
            out["verdict"] = "BRANCH_BP_INSERT_FAILED"
            return

        branches = []
        selected = None
        print("tracing afed8 indirect branches (%d sites)..." % len(branch_sites), flush=True)
        for _ in range(128):
            bh = r.cmd("c", 20)
            if not bh or not bh.startswith("T"):
                out["branch_trace_stop"] = bh
                break
            br_pre = regs_all()
            pc = br_pre.get("pc", 0)
            pc_off = off_of(pc, base)
            bhex = m(pc, 4)
            kind = indirect_kind(insn_word(bhex))
            if pc_off is None or kind is None:
                branches.append({"stop": bh, "pc": hex(pc), "pc_off": None if pc_off is None else hex(pc_off),
                                 "bytes": bhex, "note": "unexpected stop"})
                break

            reg_name = "x%d" % kind["reg"]
            target = br_pre.get(reg_name, 0)
            target_off = off_of(target, base)
            event = {
                "site": hex(pc_off),
                "op": kind["op"],
                "reg": reg_name,
                "bytes": bhex,
                "target": hex(target),
                "target_off": hex(target_off) if target_off is not None else None,
                "pre_regs": regs_subset(br_pre),
            }
            del_bp(pc)
            event["step_reply"] = step_once()
            br_post = regs_all()
            event["post_regs"] = regs_subset(br_post)
            event["post_pc_off"] = hex(off_of(br_post.get("pc", 0), base)) if off_of(br_post.get("pc", 0), base) is not None else None
            branches.append(event)
            print("branch site=%s %s %s -> %s" %
                  (event["site"], event["op"], event["reg"], event["target_off"] or event["target"]), flush=True)

            internal_afed8 = target_off is not None and AFED8_OFF <= target_off < AFED8_END
            if not internal_afed8:
                selected = event
                break
            add_bp(pc)

        out["branches"] = branches
        if not selected:
            out["verdict"] = "NO_SELECTED_HANDLER"
            return

        entry_regs = regs_all()
        entry_pc = entry_regs.get("pc", 0)
        entry_off = off_of(entry_pc, base)
        out["selected_handler"] = {
            "entry_pc": hex(entry_pc),
            "entry_off": hex(entry_off) if entry_off is not None else None,
            "source_branch": selected["site"],
            "source_op": selected["op"],
            "source_reg": selected["reg"],
            "source_target": selected["target"],
            "source_target_off": selected["target_off"],
            "candidate_a8f70": entry_off == 0xa8f70,
            "entry_regs": regs_subset(entry_regs),
            "x0_mem_128": dump_mem(entry_regs.get("x0", 0), 128),
            "x19_mem_128": dump_mem(entry_regs.get("x19", 0), 128),
        }

        ret_addr = entry_regs.get("x30", 0)
        if selected["op"] == "blr" and in_lib(ret_addr, base) and ret_addr != entry_pc:
            out["handler_return_probe"] = {"return_addr": hex(ret_addr),
                                           "return_off": hex(ret_addr - base)}
            add_bp(ret_addr)
            rh = r.cmd("c", 20)
            out["handler_return_probe"]["stop"] = rh
            if rh and rh.startswith("T"):
                rr = regs_all()
                out["handler_return_probe"]["regs"] = regs_subset(rr)
                out["handler_return_probe"]["x0_mem_128"] = dump_mem(rr.get("x0", 0), 128)
                out["handler_return_probe"]["x19_mem_128"] = dump_mem(rr.get("x19", 0), 128)

        out["verdict"] = "FLOW_CAPTURED"
    finally:
        cleanup()
        try:
            with open(ART, "w") as f:
                json.dump(out, f, indent=2)
        except Exception:
            pass
        print("VERDICT:", out.get("verdict", "UNKNOWN"), flush=True)


if __name__ == "__main__":
    main()
