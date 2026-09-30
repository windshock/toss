#!/usr/bin/env python3
"""re-lab — stable interface for the upstream-QEMU ARM64 RE lab so an LLM/agent
does not re-compose ad-hoc shell each time. Wraps the validated primitives:

  re-lab.py hwbp <port> <hex_addr> [hits]   # HVF: set HW bp, step-over capture regs
  re-lab.py regs <port>                      # dump GP regs from a stopped gdbstub
  re-lab.py trace-tcg <elf> <lo> <hi> [out]  # TCG BB-trace via plugin
  re-lab.py record <elf> <rrfile>            # TCG record
  re-lab.py replay <elf> <rrfile> [plugin]   # TCG replay
  re-lab.py compare <a.json> <b.json>        # diff two run artifacts

LIVE MODE bp capture uses explicit step-over (QEMU/HVF does not auto step-over a
HW bp at the current PC — see hvf_hwbreak_matrix.json).
"""
import sys, os, json, subprocess
HERE = os.path.dirname(os.path.abspath(__file__))
sys.path.insert(0, HERE)
from hvf_hwbreak_toy import RSP, regs  # reuse validated RSP client
QEMU = "/opt/homebrew/bin/qemu-system-aarch64"


def hwbp(port, addr, hits=5):
    r = RSP(port)
    r.cmd("Z1,%x,4" % addr)
    out = []
    for i in range(hits):
        g, _ = regs(r)
        out.append({"hit": i, "pc": hex(g.get("pc", 0)), "x0": g.get("x0"),
                    "x1": g.get("x1"), "x2": g.get("x2"), "x3": g.get("x3"),
                    "sp": hex(g.get("sp", 0))})
        # step-over: remove / single-step / reinsert / continue
        r.cmd("z1,%x,4" % addr); r.cmd("s", 5); r.cmd("Z1,%x,4" % addr); r.cmd("c", 6)
    r.cmd("z1,%x,4" % addr)
    r.close()
    print(json.dumps({"target": hex(addr), "captures": out}, indent=2))


def dump_regs(port):
    r = RSP(port); r.interrupt() if hasattr(r, "interrupt") else None
    g, _ = regs(r); r.close()
    print(json.dumps({k: (hex(v) if isinstance(v, int) else v) for k, v in g.items()}, indent=2))


def trace_tcg(elf, lo, hi, out="/tmp/bb.txt"):
    plug = "%s/../qemu-plugins/target_trace/libtrace.so,lo=%s,hi=%s,out=%s,max=100000" % (HERE, lo, hi, out)
    subprocess.run([QEMU, "-M", "virt", "-cpu", "max", "-accel", "tcg", "-kernel", elf,
                    "-nographic", "-no-reboot", "-plugin", plug], timeout=60)
    print(open(out).read())


def compare(a, b):
    da, db = json.load(open(a)), json.load(open(b))
    print(json.dumps({"a": a, "b": b, "equal": da == db}, indent=2))


if __name__ == "__main__":
    if len(sys.argv) < 2:
        print(__doc__); sys.exit(1)
    c = sys.argv[1]
    if c == "hwbp":
        hwbp(int(sys.argv[2]), int(sys.argv[3], 16), int(sys.argv[4]) if len(sys.argv) > 4 else 5)
    elif c == "regs":
        dump_regs(int(sys.argv[2]))
    elif c == "trace-tcg":
        trace_tcg(sys.argv[2], sys.argv[3], sys.argv[4], sys.argv[5] if len(sys.argv) > 5 else "/tmp/bb.txt")
    elif c == "record":
        subprocess.run([HERE + "/record.sh", sys.argv[2], sys.argv[3]])
    elif c == "replay":
        subprocess.run([HERE + "/replay.sh", sys.argv[2], sys.argv[3]] + sys.argv[4:])
    elif c == "compare":
        compare(sys.argv[2], sys.argv[3])
    else:
        print(__doc__)
