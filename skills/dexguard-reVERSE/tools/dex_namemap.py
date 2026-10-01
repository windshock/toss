#!/usr/bin/env python3
"""§123① — per-boot name mapping between two copies of the hidden DEX.

DexGuard re-randomizes o.* names (and opaque constants) per load, but:
  - fixed tables (ids/protos/class_defs) keep layout,
  - external references (main-dex Lim/toss/..., Landroid/... targets) and
    const-string literals are boot-stable.
Per class we decode the instruction stream and collect stable features
(external invoke targets + string literals); equal features => same class.
Usage: python3 dex_namemap.py <known.dex> <runtime.dex> [out.json]
"""
import struct, sys, json, collections

SZ = {}
for op in list(range(0x00, 0x0e)) + [0x0e, 0x0f, 0x10, 0x11, 0x12, 0x1d, 0x1e, 0x21, 0x27, 0x28]:
    SZ[op] = 1
SZ.update({0x13: 2, 0x15: 2, 0x16: 3, 0x17: 5, 0x18: 2, 0x19: 2, 0x1a: 2, 0x1b: 3, 0x1c: 2,
           0x1f: 2, 0x20: 2, 0x22: 2, 0x23: 2, 0x24: 3, 0x25: 3, 0x26: 3, 0x29: 2, 0x2a: 3,
           0x2b: 3, 0x2c: 3})
for op in range(0x2d, 0x3e): SZ[op] = 2
for op in range(0x44, 0x6e): SZ[op] = 2
for op in range(0x6e, 0x79): SZ[op] = 3
for op in range(0x7b, 0x90): SZ[op] = 1
for op in range(0x90, 0xb0): SZ[op] = 2
for op in range(0xb0, 0xd0): SZ[op] = 1
for op in range(0xd0, 0xe3): SZ[op] = 2

class Dex:
    def __init__(self, path):
        self.d = open(path, 'rb').read()
        u32 = lambda o: struct.unpack_from("<I", self.d, o)[0]
        self.u32 = u32
        self.u16 = lambda o: struct.unpack_from("<H", self.d, o)[0]
        F = {}
        for i, n in enumerate("string_ids_size string_ids_off type_ids_size type_ids_off "
                              "proto_ids_size proto_ids_off field_ids_size field_ids_off "
                              "method_ids_size method_ids_off class_defs_size class_defs_off "
                              "data_size data_off".split()):
            F[n] = u32(0x38 + i * 4)
        self.F = F
        self._strings = [None] * F["string_ids_size"]
        self._types = [None] * F["type_ids_size"]
        self._methods = [None] * F["method_ids_size"]

    def uleb(self, o):
        r = s = 0
        while o < len(self.d):
            b = self.d[o]; o += 1; r |= (b & 0x7f) << s; s += 7
            if not b & 0x80: return r, o
        raise IndexError

    def s(self, idx):
        if self._strings[idx] is None:
            off = self.u32(self.F["string_ids_off"] + idx * 4)
            ln, p = self.uleb(off)
            self._strings[idx] = self.d[p:p + ln].decode('utf-8', 'replace')
        return self._strings[idx]

    def t(self, idx):
        if self._types[idx] is None:
            self._types[idx] = self.s(self.u32(self.F["type_ids_off"] + idx * 4))
        return self._types[idx]

    def m(self, idx):
        if self._methods[idx] is None:
            c, pr, n = struct.unpack_from("<HHI", self.d, self.F["method_ids_off"] + idx * 8)
            self._methods[idx] = (self.t(c), self.s(n))
        return self._methods[idx]

    def classes(self):
        for ci in range(self.F["class_defs_size"]):
            o = self.F["class_defs_off"] + ci * 32
            cls = self.u32(o); acc = self.u32(o + 4); cdo = self.u32(o + 24)
            yield ci, cls, acc, cdo

    def stable_features(self, cdo):
        d = self.d
        feats = set()
        if not cdo or cdo >= len(d) - 8: return feats
        try:
            p = cdo
            sf, p = self.uleb(p); inf, p = self.uleb(p); dm, p = self.uleb(p); vm, p = self.uleb(p)
            for _ in range(sf + inf): _, p = self.uleb(p); _, p = self.uleb(p)
            for _ in range(dm + vm):
                _, p = self.uleb(p); _, p = self.uleb(p); coff, p = self.uleb(p)
                if not coff or coff + 16 >= len(d): continue
                ins = self.u32(coff + 12)
                if ins <= 0 or coff + 16 + ins * 2 > len(d): continue
                base = coff + 16
                j = 0
                while j < ins:
                    u = self.u16(base + j * 2); op = u & 0xff
                    if op == 0x1a:  # const-string
                        feats.add("S:" + self.s(self.u16(base + (j + 1) * 2))[:48])
                    elif op in (0x1b,):  # const-string-jumbo
                        feats.add("S:" + self.s(self.u32(base + (j + 1) * 2))[:48])
                    elif 0x6e <= op <= 0x78:  # invoke-family
                        tgt = self.u16(base + (j + 1) * 2)
                        cn, mn = self.m(tgt)
                        if not cn.startswith("Lo/"):
                            feats.add("M:%s->%s" % (cn[:60], mn))
                    j += SZ.get(op, 1)
        except Exception:
            pass
        return feats

def build(path):
    dx = Dex(path)
    out = []
    for ci, cls, acc, cdo in dx.classes():
        out.append((dx.t(cls), acc, frozenset(dx.stable_features(cdo))))
    return out

def main():
    known_p, runtime_p = sys.argv[1], sys.argv[2]
    outp = sys.argv[3] if len(sys.argv) > 3 else "/tmp/namemap.json"
    A = build(known_p); B = build(runtime_p)
    dictA = collections.defaultdict(list)
    for i, (nm, acc, f) in enumerate(A):
        if f: dictA[f].append(i)
    mapping = {}; amb = 0; miss = 0
    for j, (nm, acc, f) in enumerate(B):
        if not f or f not in dictA:
            miss += 1; continue
        if len(dictA[f]) == 1:
            mapping[j] = dictA[f][0]
        else:
            amb += 1
    print("known=%d runtime=%d unique=%d ambiguous=%d nofeat=%d" % (len(A), len(B), len(mapping), amb, miss))
    # anchors
    anchors = ["Lo/s3;", "Lo/createFromParcel;", "Lo/getBooleanFromAdObject;",
               "Lo/getBooleanFromFullResponse;", "Lo/ContentDataSourceContentDataSourceException;",
               "Lo/ReusableBufferedOutputStream;", "Lo/s5a$onExtraCallbackWithResult;", "Lo/getPageByNodeId;"]
    inv = {nm: i for i, (nm, acc, f) in enumerate(A)}
    rev = {v: k for k, v in mapping.items()}
    for a in anchors:
        i = inv.get(a)
        if i is None: continue
        j = rev.get(i)
        print("  %-52s → %s" % (a, B[j][0] if j is not None else "(unmapped)"))
    json.dump({"runtime_to_known": {B[j][0]: A[i][0] for j, i in mapping.items()},
               "known_to_runtime": {A[i][0]: B[j][0] for j, i in mapping.items()}},
              open(outp, "w"), indent=1, ensure_ascii=False)
    print("saved", outp)

if __name__ == "__main__":
    main()
