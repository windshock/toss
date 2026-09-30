#!/usr/bin/env python3
"""LIVE MODE PoC: prove upstream QEMU 11 + HVF does a GENUINE ARM64 hardware
breakpoint on a bare-metal toy — exact PC stop, guest bytes UNCHANGED, registers
readable, repeatable — the capability the Google-fork QEMU 2.12 crashed on (§90).

Speaks GDB RSP directly (no host gdb needed). Connects to a gdbstub that is
halted-at-reset (`-S`). Sets Z1 (hardware breakpoint) at the toy's target insn,
continues, verifies the stop, reads registers, checks code bytes before/after.

  hvf_hwbreak_toy.py <port> [target_hex] [hits]
"""
import socket, sys, time, json

TARGET_DEFAULT = 0x4008000c   # `add x0,x0,x1` in toy.elf
TARGET_BYTES   = "0000018b"   # little-endian memory bytes of 0x8b010000


class RSP:
    def __init__(self, port):
        self.s = None
        for host in ("::1", "127.0.0.1"):
            try: self.s = socket.create_connection((host, port), timeout=8); break
            except Exception: continue
        if not self.s: raise RuntimeError("no gdbstub on %d" % port)
        self.s.settimeout(5)

    def _rb(self, t=5):
        self.s.settimeout(t)
        try: return self.s.recv(1)
        except Exception: return b""

    def _pkt(self, t=5):
        buf = b""
        while b"$" not in buf:
            b = self._rb(t)
            if not b: return None
            buf += b
        buf = buf[buf.index(b"$"):]
        while not (b"#" in buf and len(buf) >= buf.index(b"#") + 3):
            b = self._rb(t)
            if not b: break
            buf += b
        body = buf[1:buf.index(b"#")].decode(errors="replace")
        try: self.s.sendall(b"+")
        except Exception: pass
        return body

    def cmd(self, data, t=5):
        pkt = "$%s#%02x" % (data, sum(data.encode()) & 0xff)
        self.s.sendall(pkt.encode())
        ack = self._rb(t)
        if ack == b"-":
            self.s.sendall(pkt.encode()); self._rb(t)
        return self._pkt(t)

    def interrupt(self):
        self.s.sendall(b"\x03"); time.sleep(0.2); return self._pkt(3)

    def close(self):
        try: self.s.close()
        except Exception: pass


def regs(r):
    g = r.cmd("g")
    if not g or len(g) < 528: return {}, g
    def q(i): return int.from_bytes(bytes.fromhex(g[i*16:i*16+16]), "little")
    return {"x0": q(0), "x1": q(1), "x2": q(2), "x3": q(3),
            "sp": q(31), "pc": q(32)}, g


def run(port, target, hits):
    r = RSP(port)
    ev = {"target": hex(target), "steps": [], "hit_states": []}
    st = ev["steps"].append
    q0 = r.cmd("?"); st({"?": q0})
    r0, _ = regs(r); ev["reset_pc"] = hex(r0.get("pc", 0))
    st({"reset_pc": ev["reset_pc"], "expect": "0x40080000"})
    b_before = r.cmd("m%x,4" % target); st({"bytes_before": b_before})
    z1 = r.cmd("Z1,%x,4" % target); st({"Z1_insert": z1, "expect": "OK"})
    b_after = r.cmd("m%x,4" % target); st({"bytes_after_install": b_after})
    ev["code_mutation"] = {"before": b_before, "after_install": b_after,
                           "unchanged": (b_before == b_after == TARGET_BYTES)}
    # continue -> expect hardware-breakpoint stop at target, `hits` times
    stop_pcs = []
    for i in range(hits):
        stop = r.cmd("c", t=6)
        rg, _ = regs(r)
        stop_pcs.append(rg.get("pc"))
        ev["hit_states"].append({"hit": i, "stop_reply": stop,
                                 "pc": hex(rg.get("pc", 0)),
                                 "x0": rg.get("x0"), "x1": rg.get("x1"),
                                 "x2": rg.get("x2"), "sp": hex(rg.get("sp", 0))})
    ev["all_hits_at_target"] = all(p == target for p in stop_pcs)
    b_atstop = r.cmd("m%x,4" % target); st({"bytes_at_stop": b_atstop})
    r.cmd("z1,%x,4" % target)
    b_remove = r.cmd("m%x,4" % target); st({"bytes_after_remove": b_remove})
    ev["code_mutation"]["at_stop"] = b_atstop
    ev["code_mutation"]["after_remove"] = b_remove
    ev["code_mutation"]["unchanged_full"] = (b_before == b_after == b_atstop
                                             == b_remove == TARGET_BYTES)
    # x2 (=4000) readable, x0 must progress across hits (proves real mid-exec stop)
    x0s = [h["x0"] for h in ev["hit_states"]]
    ev["x0_progresses"] = len(x0s) > 1 and all(x0s[i] < x0s[i + 1] for i in range(len(x0s) - 1)) or (len(x0s) >= 2 and x0s[1] > x0s[0])
    ev["x2_is_4000"] = ev["hit_states"][0]["x2"] == 4000 if ev["hit_states"] else False
    ev["VERDICT"] = ("GENUINE_HW_BP" if (z1 == "OK" and ev["all_hits_at_target"]
                     and ev["code_mutation"]["unchanged_full"]) else "FAIL")
    r.close()
    return ev


if __name__ == "__main__":
    port = int(sys.argv[1]) if len(sys.argv) > 1 else 1234
    target = int(sys.argv[2], 16) if len(sys.argv) > 2 else TARGET_DEFAULT
    hits = int(sys.argv[3]) if len(sys.argv) > 3 else 5
    print(json.dumps(run(port, target, hits), indent=2))
