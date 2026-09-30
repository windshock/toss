#!/usr/bin/env python3
"""P1 prototype: extract libea56 handler-thread runtime state from a debuggerd tombstone.

Code-safe (debuggerd, no code patch; hw-bp is dead in the HVF guest, §83b).
Registers first; context memory is a dependency-driven follow-up (goal #7), not
a blind full dump. A tombstone is a point-in-time snapshot, so catching a thread
*inside* a handler is statistical — this reports whatever libea56-thread state a
sample happened to catch, attributed to a process incarnation.

  capture_state.py <tombstone.txt> [launch_pid] [launch_starttime_ticks]

Output JSON: per libea56-carrying thread -> {tid, top_libea56_offset, in_handler,
registers, libea56_frames}. `in_handler` is true only when the *top* native frame
is a known afed8/handler offset — i.e. an entry-ish capture, not a deep frame.
"""
import json
import re
import sys
from pathlib import Path

HANDLER_OFFSETS = {"afed8", "b02c4", "a8f70", "aa6a4", "95224"}  # known afed8/dispatch/handlers
REG_RE = re.compile(r"\b(x\d+|lr|sp|pc|pst)\s+([0-9a-f]{4,16})")
TID_RE = re.compile(r"\btid:\s*(\d+),\s*name:\s*([^\s]+)")
FRAME_RE = re.compile(r"#(\d+)\s+pc\s+([0-9a-f]+)\s+(\S+)")


def parse_threads(text):
    threads, cur = [], None
    for line in text.splitlines():
        th = TID_RE.search(line)
        if th:
            if cur:
                threads.append(cur)
            cur = {"tid": th.group(1), "name": th.group(2), "registers": {}, "frames": []}
            continue
        if cur is None:
            continue
        for reg, val in REG_RE.findall(line):
            cur["registers"].setdefault(reg, val)
        fr = FRAME_RE.search(line)
        if fr:
            cur["frames"].append({"n": int(fr.group(1)), "off": fr.group(2).lstrip("0") or "0", "obj": fr.group(3)})
    if cur:
        threads.append(cur)
    return threads


def libea56_state(tombstone, launch_pid=None, launch_ticks=None):
    text = Path(tombstone).read_text(errors="replace")
    out = []
    for th in parse_threads(text):
        ea = [f for f in th["frames"] if "libea56.so" in f["obj"]]
        if not ea:
            continue
        ea_top = min(ea, key=lambda f: f["n"])           # nearest-to-leaf libea56 frame
        top_native = min(th["frames"], key=lambda f: f["n"]) if th["frames"] else None
        top_is_ea = top_native is not None and top_native is ea_top
        in_handler = top_is_ea and ea_top["off"] in HANDLER_OFFSETS
        regs = th["registers"]
        out.append({
            "tid": th["tid"],
            "name": th["name"],
            "top_libea56_offset": "0x" + ea_top["off"],
            "top_native_frame": f"{top_native['obj'].split('/')[-1]}+0x{top_native['off']}" if top_native else None,
            "in_handler": in_handler,             # top frame is a known handler -> entry-ish
            "registers": {k: regs.get(k) for k in ("x0", "x1", "x2", "x3", "x19", "x29", "lr", "pc") if regs.get(k)},
            "libea56_frames": ["0x" + f["off"] for f in ea],
        })
    return {
        "source_tombstone": Path(tombstone).name,
        "launch_pid": launch_pid,
        "launch_starttime_ticks": launch_ticks,
        "libea56_threads": out,
        "handler_entry_captures": [t for t in out if t["in_handler"]],
    }


if __name__ == "__main__":
    if len(sys.argv) < 2:
        raise SystemExit(__doc__)
    result = libea56_state(sys.argv[1], *(sys.argv[2:4]))
    print(json.dumps(result, indent=2, ensure_ascii=False))
