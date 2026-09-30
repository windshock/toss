#!/usr/bin/env python3
"""§90 host-side GDB Remote Serial Protocol (RSP) probe for the Android Emulator
QEMU gdbstub. Records RAW packet-level responses so we can state, with evidence,
*how the QEMU stub handled each request* (OK / empty=unsupported / Enn=error) —
not merely "the GDB UI failed".

It does NOT depend on host gdb; it speaks RSP directly. Two ways to reach the stub:
  1. runtime, non-disruptive: open it via the emulator console HMP
     (`qemu monitor` -> `gdbserver tcp::PORT`) on the already-running AVD.
  2. controlled: launch emulator with `-qemu -s -S` (halted at reset) yourself.

Usage:
  gdb_hwbreak_test.py open [PORT]        # open gdbserver on running AVD via console
  gdb_hwbreak_test.py probe [PORT]       # connect, stop, dump caps/regs, matrix
  gdb_hwbreak_test.py cont-monitor       # resume VM via console monitor (cleanup)

Evidence is printed as JSON. RSP semantics: empty reply "" to a Zn packet means
the stub does NOT implement that breakpoint kind; "OK" means accepted; "Enn" error.
"""
import socket, sys, time, json, os

CONSOLE = ("127.0.0.1", 5554)
TOKEN = os.path.expanduser("~/.emulator_console_auth_token")


def console_cmd(cmds, settle=0.5):
    tok = open(TOKEN).read().strip()
    s = socket.create_connection(CONSOLE, timeout=6)
    def rd(t=settle):
        s.settimeout(t); out = b""
        try:
            while True:
                d = s.recv(4096)
                if not d: break
                out += d
        except Exception: pass
        return out.decode(errors="replace")
    rd(0.6)
    s.sendall(("auth %s\n" % tok).encode()); rd(0.5)
    log = []
    for c in cmds:
        s.sendall((c + "\n").encode()); log.append((c, rd()))
    s.close()
    return log


# ---------------- RSP client ----------------
class RSP:
    def __init__(self, port):
        self.s = None
        for host in ("::1", "127.0.0.1", "localhost"):
            try:
                self.s = socket.create_connection((host, port), timeout=8)
                break
            except Exception:
                continue
        if self.s is None:
            raise RuntimeError("cannot connect to gdbstub on port %d" % port)
        self.s.settimeout(4)
        self.noack = False

    def _cksum(self, data):
        return sum(data.encode()) & 0xff

    def _read_byte(self, t=4):
        self.s.settimeout(t)
        try:
            return self.s.recv(1)
        except Exception:
            return b""

    def _read_packet(self, t=4):
        """Read one complete $...#xx frame (skipping stray acks). Returns body."""
        self.s.settimeout(t)
        # find '$'
        buf = b""
        # skip leading acks / noise until '$'
        while b"$" not in buf:
            b = self._read_byte(t)
            if not b:
                return None
            buf += b
        buf = buf[buf.index(b"$"):]
        # read until '#' + 2 checksum digits
        while True:
            if b"#" in buf:
                idx = buf.index(b"#")
                if len(buf) >= idx + 3:
                    break
            b = self._read_byte(t)
            if not b:
                break
            buf += b
        try:
            body = buf[1:buf.index(b"#")].decode(errors="replace")
        except Exception:
            body = buf.decode(errors="replace")
        if not self.noack:
            try: self.s.sendall(b"+")
            except Exception: pass
        return body

    def send(self, data, t=4):
        pkt = "$%s#%02x" % (data, self._cksum(data))
        self.s.sendall(pkt.encode())
        if not self.noack:
            ack = self._read_byte(t)   # consume +/- ; retransmit once on nack
            if ack == b"-":
                self.s.sendall(pkt.encode()); self._read_byte(t)
        r = self._read_packet(t)
        return r if r is not None else ""

    def send_raw(self, b):
        self.s.sendall(b)

    def close(self):
        try: self.s.close()
        except Exception: pass


def _pc_from_g(g):
    """aarch64 'g': x0..x30 (31*8), sp (8), pc (8), cpsr(4). pc hex at char 512."""
    if not g or len(g) < 528:
        return None
    try:
        return int.from_bytes(bytes.fromhex(g[512:528]), "little")
    except Exception:
        return None


def probe(port):
    ev = {"port": port, "steps": []}
    r = RSP(port)
    def step(name, req, resp, note=""):
        ev["steps"].append({"step": name, "request": req, "response": resp, "note": note})
        sys.stderr.write("STEP %-26s req=%-16s -> %r  %s\n" % (name, req, resp, note))
        sys.stderr.flush()
    def alive(tag):
        """liveness check: a harmless '?' after a risky op; attributes async crashes."""
        try:
            rr = r.send("?", 2)
            ok = rr.startswith("T") or rr.startswith("S")
        except Exception:
            ok = False; rr = "CONNECTION_CLOSED"
        step("liveness-after:" + tag, "?", rr, "QEMU alive" if ok else "*** QEMU DIED after %s ***" % tag)
        return ok
    def S(req, t=4):
        """defensive send: never throws; records connection death as evidence."""
        try:
            return r.send(req, t)
        except Exception as e:
            ev["steps"].append({"step": "SOCKET_ERROR", "request": req,
                                "response": "CONNECTION_CLOSED: %s" % e,
                                "note": "QEMU dropped the connection on this request"})
            return "__DEAD__"
    r.S = S

    # interrupt (stop the vCPU) then query
    r.send_raw(b"\x03")
    time.sleep(0.4)
    halt = r._read_packet(3)
    step("interrupt(0x03)", "\\x03", halt, "T/S reply = stopped")
    sup = S("qSupported:hwbreak+;swbreak+")
    step("qSupported", "qSupported", sup, "advertises hwbreak+/swbreak+ ?")
    q = S("?")
    step("? halt-reason", "?", q)
    g = S("g")
    pc = _pc_from_g(g)
    ev["pc"] = hex(pc) if pc else None
    step("g (all regs)", "g", (g[:32] + "...(%dhex)" % len(g)) if g and g != "__DEAD__" else g, "pc=%s" % ev["pc"])

    tgt = pc
    if tgt:
        mem0 = S("m%x,4" % tgt)
        step("m pc,4 (orig bytes)", "m%x,4" % tgt, mem0)
        # --- SW breakpoint Z0 ---
        z0 = S("Z0,%x,4" % tgt)
        step("Z0 sw-bp insert", "Z0,%x,4" % tgt, z0, "OK=accepted, empty=unsupported")
        mem1 = S("m%x,4" % tgt)
        step("m pc,4 (after Z0)", "m%x,4" % tgt, mem1,
             "CHANGED vs orig => stub wrote a brk (guest code MUTATED)")
        S("z0,%x,4" % tgt)
        mem2 = S("m%x,4" % tgt)
        step("m pc,4 (after z0 remove)", "m%x,4" % tgt, mem2, "should equal orig")
        if not alive("Z0-sw-bp-cycle"): r.close(); return ev
        # --- HW breakpoint Z1 ---
        z1 = S("Z1,%x,4" % tgt)
        step("Z1 hw-bp insert", "Z1,%x,4" % tgt, z1, "OK=accepted, empty=unsupported, Enn=error")
        if not alive("Z1-insert"): r.close(); return ev
        mem3 = S("m%x,4" % tgt)
        step("m pc,4 (after Z1)", "m%x,4" % tgt, mem3, "hw-bp must NOT change bytes")
        S("z1,%x,4" % tgt)
        if not alive("Z1-remove"): r.close(); return ev
        # --- watchpoints ---
        for zt, nm in (("Z2", "write-wp"), ("Z3", "read-wp"), ("Z4", "access-wp")):
            zr = S("%s,%x,8" % (zt, tgt))
            step("%s %s" % (zt, nm), "%s,%x,8" % (zt, tgt), zr)
            S("%s,%x,8" % (zt.lower(), tgt))
        if not alive("watchpoints"): r.close(); return ev

    # --- single step ---
    vc = S("vCont?")
    step("vCont?", "vCont?", vc)
    ss = S("s")
    step("single-step 's'", "s", ss, "T05 => a stop after stepping")
    if not alive("single-step"): r.close(); return ev
    g2 = S("g")
    pc2 = _pc_from_g(g2)
    step("pc after single-step", "g", hex(pc2) if pc2 else None,
         "delta=%s (expect +4 if one insn executed)" % (hex(pc2 - pc) if (pc and pc2) else "?"))

    # --- HW breakpoint HIT test: set Z1 one insn ahead, continue, expect stop there ---
    if pc2:
        ahead = pc2 + 4
        zi = S("Z1,%x,4" % ahead)
        step("Z1 ahead insert", "Z1,%x,4" % ahead, zi)
        if zi == "OK":
            try:
                r.send_raw(b"$c#63")   # 'c' checksum = 0x63
                r._read_byte(2)
                hit = r._read_packet(4)
            except Exception as e:
                hit = "CONNECTION_CLOSED: %s" % e
            g3 = S("g") if hit and hit != "__DEAD__" else None
            pc3 = _pc_from_g(g3) if g3 and g3 != "__DEAD__" else None
            step("continue -> hw-bp hit?", "c", hit,
                 "stopped_pc=%s target=%s match=%s" % (hex(pc3) if pc3 else None, hex(ahead), pc3 == ahead))
        S("z1,%x,4" % ahead)

    S("D")
    step("detach 'D'", "D", "(detached, VM resumes)")
    r.close()
    return ev


if __name__ == "__main__":
    cmd = sys.argv[1] if len(sys.argv) > 1 else "probe"
    port = int(sys.argv[2]) if len(sys.argv) > 2 else 1234
    if cmd == "open":
        log = console_cmd(["qemu monitor", "gdbserver tcp::%d" % port, "\x04"], settle=0.8)
        for c, o in log:
            print("CMD %r -> %s" % (c, o.strip()[:300]))
    elif cmd == "cont-monitor":
        log = console_cmd(["qemu monitor", "cont", "\x04"], settle=0.6)
        for c, o in log:
            print("CMD %r -> %s" % (c, o.strip()[:200]))
    else:
        print(json.dumps(probe(port), indent=2, ensure_ascii=False))
