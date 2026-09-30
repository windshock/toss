#!/usr/bin/env python3
"""Hidden-DEX analysis helpers (§98): parse the dumped hidden DEX
(artifacts/android/toss_hidden_dex.bin), resolve method names, scan invoke
sites, extract code items. The in-memory image's magic/checksum/signature
(+0x00..0x38) are scrubbed (DexGuard) but ids at +0x38.. are intact.
Usage:
  python3 dex_tools.py m <midx>          # resolve method name
  python3 dex_tools.py code <midx>       # extract insns of a method to /tmp
See dexdis.py for a disassembler on extracted code."""
import struct, sys

DEX = "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/analysis-lab/artifacts/android/toss_hidden_dex.bin"


def uleb(dex, o):
    r = 0; s = 0
    while True:
        b = dex[o]; o += 1; r |= (b & 0x7f) << s; s += 7
        if not b & 0x80:
            break
    return r, o


class Dex:
    def __init__(self, path=DEX):
        self.data = open(path, 'rb').read()
        F = {}
        names = ["string_ids_size", "string_ids_off", "type_ids_size", "type_ids_off", "proto_ids_size", "proto_ids_off",
                 "field_ids_size", "field_ids_off", "method_ids_size", "method_ids_off", "class_defs_size", "class_defs_off", "data_size", "data_off"]
        for i, n in enumerate(names):
            F[n] = struct.unpack_from('<I', self.data, 0x38 + i * 4)[0]
        self.F = F

    def _u32(self, o):
        return struct.unpack_from('<I', self.data, o)[0]

    def str(self, idx):
        off = self._u32(self.F["string_ids_off"] + idx * 4)
        ln, p = uleb(self.data, off)
        return self.data[p:p + ln].decode('utf-8', 'replace')

    def type(self, tidx):
        o = self._u32(self.F["type_ids_off"] + tidx * 4)
        return self.str(o) if o < len(self.data) else "?"

    def method(self, midx):
        c, pr, n = struct.unpack_from('<HHI', self.data, self.F["method_ids_off"] + midx * 8)
        return (self.type(c), self.str(n))

    def mname(self, midx):
        c, n = self.method(midx)
        return "%s.%s" % (c.strip(';').split('/')[-1], n)

    def classes(self):
        F = self.F
        for ci in range(F["class_defs_size"]):
            yield self._u32(F["class_defs_off"] + ci * 32), self._u32(F["class_defs_off"] + ci * 32 + 24)

    def methods_of(self, cdo):
        d = self.data; o = cdo
        sf, o = uleb(d, o); inf, o = uleb(d, o); dm, o = uleb(d, o); vm, o = uleb(d, o)
        for _ in range(sf + inf):
            _, o = uleb(d, o); _, o = uleb(d, o)
        out = []
        for kind, cnt in (("direct", dm), ("virtual", vm)):
            midx = 0
            for i in range(cnt):
                diff, o = uleb(d, o); acc, o = uleb(d, o); coff, o = uleb(d, o)
                midx += diff
                out.append((kind, midx, acc, coff))
        return out

    def find_code(self, midx):
        """return (class_type, name, code_off) by scanning class_defs"""
        for cidx, cdo in self.classes():
            if not cdo:
                continue
            try:
                for kind, m, acc, coff in self.methods_of(cdo):
                    if m == midx:
                        return self.type(cidx), self.method(midx)[1], coff
            except Exception:
                continue
        return None


if __name__ == "__main__":
    dx = Dex()
    cmd = sys.argv[1] if len(sys.argv) > 1 else ""
    if cmd == "m":
        print(dx.mname(int(sys.argv[2], 0)))
    elif cmd == "code":
        r = dx.find_code(int(sys.argv[2], 0))
        print("class=%s name=%s code_off=%s" % r)
        if r and r[2]:
            coff = r[2]
            regs, ins, outs, tries = struct.unpack_from('<HHHH', dx.data, coff)
            insns = dx._u32(coff + 12)
            out = "/tmp/mcode_%s.bin" % sys.argv[2]
            open(out, 'wb').write(dx.data[coff + 16:coff + 16 + insns * 2])
            print("regs=%d ins=%d outs=%d insns=%d -> %s" % (regs, ins, outs, insns, out))
