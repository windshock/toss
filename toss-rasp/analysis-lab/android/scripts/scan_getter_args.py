#!/usr/bin/env python3
"""§113: exact arg1-writer census for onWarmupCompleted call sites (the R(4,0) source).

§102 classified the 148 onWarmupCompleted(OWC) call sites' arg1 writers as
105 move-result (framework-getter idiom) / 43 const·binop·sget / 4 none, but
did not resolve site -> getter. This scan resolves, per site: enclosing method,
arg1 register, writer provenance (chase up to depth 4: move-result -> source
invoke method_id; move -> source; binop -> operands), the getter's method_id +
name + shorty + its own constant argument registers (for arg-dependent getters
like TypedValue.complexToFloat / ImageFormat.getBitsPerPixel). Output feeds the
on-device getter value survey that closes "which getter returns 4 here".
Static only; parses artifacts toss_hidden_dex.bin (canonical §98 dump).
"""
import json, struct

DEX = "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/analysis-lab/artifacts/android/toss_hidden_dex.bin"
OUT = "/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/analysis-lab/artifacts/android/toss_getter_census.json"

data = open(DEX, "rb").read()
u32 = lambda o: struct.unpack_from("<I", data, o)[0]
u16 = lambda o: struct.unpack_from("<H", data, o)[0]


def uleb(o):
    r = s = 0
    while True:
        b = data[o]; o += 1
        r |= (b & 0x7F) << s; s += 7
        if not b & 0x80:
            return r, o


F = {}
for i, n in enumerate("string_ids_size string_ids_off type_ids_size type_ids_off "
                      "proto_ids_size proto_ids_off field_ids_size field_ids_off "
                      "method_ids_size method_ids_off class_defs_size class_defs_off "
                      "data_size data_off".split()):
    F[n] = u32(0x38 + i * 4)


def get_str(idx):
    if idx >= F["string_ids_size"]:
        return "<oob%d>" % idx
    off = u32(F["string_ids_off"] + idx * 4)
    ln, p = uleb(off)
    return data[p:p + ln].decode("utf-8", "replace")


def tname(tidx):
    o = u32(F["type_ids_off"] + tidx * 4) if tidx < F["type_ids_size"] else 0
    return get_str(o) if o and o < len(data) else "<bad>"


def minfo(midx):
    if midx is None or midx >= F["method_ids_size"]:
        return None
    c, pr, n = struct.unpack_from("<HHI", data, F["method_ids_off"] + midx * 8)
    shorty = get_str(u32(F["proto_ids_off"] + pr * 12)) if pr < F["proto_ids_size"] else "?"
    return {"midx": midx, "cls": tname(c), "name": get_str(n), "shorty": shorty}


def fname(fidx):
    c, t, n = struct.unpack_from("<HHI", data, F["field_ids_off"] + fidx * 8)
    return "%s.%s" % (tname(c), get_str(n))


OWC = IATC = None
for m in range(F["method_ids_size"]):
    info = minfo(m)
    if info["name"] == "onWarmupCompleted" and info["cls"] == "Lo/ContentDataSourceContentDataSourceException;":
        if OWC is None:
            OWC = m          # first match = §102's decode helper (midx 2441); later ones are name-colliding overloads
    if info["name"] == "IAuthTabCallback" and info["cls"] == "Lo/ContentDataSourceContentDataSourceException;":
        if IATC is None:
            IATC = m
assert OWC is not None and IATC is not None, (OWC, IATC)

SZ = {}
for op in list(range(0x00, 0x0e)) + [0x0e, 0x0f, 0x10, 0x11, 0x12, 0x1d, 0x1e, 0x21, 0x27, 0x28]:
    SZ[op] = 1
SZ[0x03] = SZ[0x06] = SZ[0x09] = 3   # move/16 family (22x)
SZ.update({0x13: 2,  0x15: 2,  0x16: 3,  0x17: 5,  0x18: 2,  0x19: 2,  0x1a: 2,  0x1b: 3,  0x1c: 2, 
           0x1f: 2, 0x20: 2, 0x22: 2, 0x23: 2, 0x24: 3, 0x25: 3, 0x26: 3, 0x29: 2, 0x2a: 3, 0x2b: 3, 0x2c: 3})
for op in range(0x2d, 0x3e):
    SZ[op] = 2
for op in range(0x44, 0x6e):
    SZ[op] = 2
for op in range(0x6e, 0x79):
    SZ[op] = 3
for op in range(0x7b, 0x90):
    SZ[op] = 1
for op in range(0x90, 0xb0):
    SZ[op] = 2
for op in range(0xb0, 0xd0):
    SZ[op] = 1
for op in range(0xd0, 0xe3):
    SZ[op] = 2
SZ[0xfa] = 4; SZ[0xfb] = 4; SZ[0xfc] = 3; SZ[0xfd] = 3; SZ[0xfe] = 2

IGET = {0x52: "iget", 0x54: "iget-object"}
SGET = {0x60: "sget", 0x62: "sget-object", 0x63: "sget-boolean"}
BIN = {0x90: "add", 0x91: "sub", 0x92: "mul", 0x93: "div", 0x94: "rem", 0x95: "and",
       0x96: "or", 0x97: "xor", 0x98: "shl", 0x99: "shr", 0x9a: "ushr"}
BIN2A = {0xb0: "add", 0xb1: "sub", 0xb2: "mul", 0xb3: "div", 0xb4: "rem", 0xb5: "and",
         0xb6: "or", 0xb7: "xor", 0xb8: "shl", 0xb9: "shr", 0xba: "ushr"}
BINL16 = {0xd0: "add", 0xd1: "rsub", 0xd2: "mul", 0xd3: "div", 0xd4: "rem"}
BINL8 = {0xd8: "add", 0xd9: "rsub", 0xda: "mul", 0xdb: "div", 0xdc: "rem", 0xdd: "and",
         0xde: "or", 0xdf: "xor", 0xe0: "shl", 0xe1: "shr", 0xe2: "ushr"}

sext = lambda v, b: v - (1 << b) if v & (1 << (b - 1)) else v


def walk_insns(coff, insns):
    """yield (j, u, op, hi) skipping payload pseudo-ops correctly"""
    base = coff + 16
    j = 0
    while j < insns:
        u = u16(base + j * 2)
        op = u & 0xFF
        hi = u >> 8
        yield j, u, op, hi
        if u in (0x0100, 0x0200, 0x0300, 0x0400, 0x0500):
            elem = u16(base + (j + 1) * 2)
            size = u32(base + (j + 2) * 2)
            units = {0x0100: 1, 0x0200: 2, 0x0300: 0, 0x0400: 4, 0x0500: 8}[u]
            j += (size * units + 1) // 2 + 4 if u != 0x0300 else size * 4 + 4
            continue
        j += SZ.get(op, 1)


def invoke_info(code_base, insns, j, u, op, hi):
    """returns (midx, args) for invoke-family at j"""
    if op in (0x6e, 0x6f, 0x70, 0x71, 0x72):
        midx = u16(code_base + (j + 1) * 2)
        rw = u16(code_base + (j + 2) * 2)
        A = hi >> 4
        regs = [rw & 0xF, (rw >> 4) & 0xF, (rw >> 8) & 0xF, (rw >> 12) & 0xF][:max(A, 1)] if A else []
        return midx, regs
    if op in (0x74, 0x75, 0x76, 0x77, 0x78):
        midx = u16(code_base + (j + 1) * 2)
        first = u16(code_base + (j + 2) * 2)
        cnt = hi
        return midx, list(range(first, first + cnt))
    return None, None


def const_chase(reg, site, code_base, insns, depth=0, seen=None):
    """backwards scan for the last def of reg before insn site; returns provenance dict"""
    if depth > 4 or site < 0:
        return {"kind": "giveup"}
    seen = seen or set()
    if (reg, site) in seen:
        return {"kind": "loop"}
    seen.add((reg, site))
    for j, u, op, hi in walk_insns(code_base - 16 + 16, insns):
        pass  # placeholder; we do an indexed walk below instead
    return None


def build_insn_index(coff, insns):
    base = coff + 16
    idx = []
    j = 0
    while j < insns:
        u = u16(base + j * 2)
        op = u & 0xFF
        hi = u >> 8
        idx.append((j, u, op, hi))
        if u in (0x0100, 0x0200, 0x0300, 0x0400, 0x0500):
            elem = u16(base + (j + 1) * 2)
            size = u32(base + (j + 2) * 2)
            units = {0x0100: 1, 0x0200: 2, 0x0300: 0, 0x0400: 4, 0x0500: 8}[u]
            j += (size * units + 1) // 2 + 4 if u != 0x0300 else size * 4 + 4
            continue
        j += SZ.get(op, 1)
    return idx, base


def def_at(idx, base, k, reg):
    """does insn idx[k] define reg? returns provenance or None"""
    j, u, op, hi = idx[k]
    if u in (0x0100, 0x0200, 0x0300, 0x0400, 0x0500):
        return None
    if op in (0x0A, 0x0B, 0x0C, 0x0D) and hi == reg:
        return {"kind": "move-result"}
    if op in (0x01, 0x04, 0x07) and (hi & 0xF) == reg:
        return {"kind": "move", "src": hi >> 4}
    if op in (0x02, 0x05, 0x08) and hi == reg:
        return {"kind": "move16", "src": u16(base + (j + 1) * 2)}
    if op in (0x03, 0x06, 0x09) and hi == reg:
        return {"kind": "move16", "src": u16(base + (j + 1) * 2) | (u16(base + (j + 2) * 2) << 16)}
    if op == 0x12 and (hi & 0xF) == reg:
        return {"kind": "const", "val": sext(hi >> 4, 4)}
    if op == 0x13 and hi == reg:
        return {"kind": "const", "val": sext(u16(base + (j + 1) * 2), 16)}
    if op == 0x14 and hi == reg:
        return {"kind": "const", "val": sext(u16(base + (j + 1) * 2) | (u16(base + (j + 2) * 2) << 16), 32)}
    if op == 0x19 and hi == reg:
        return {"kind": "const", "val": u16(base + (j + 1) * 2) << 16}
    if op == 0x1A and hi == reg:
        return {"kind": "const-string", "s": get_str(u16(base + (j + 1) * 2))}
    if op == 0x1B and hi == reg:
        return {"kind": "const-string", "s": get_str(u16(base + (j + 1) * 2) | (u16(base + (j + 2) * 2) << 16))}
    if op in SGET and hi == reg:
        return {"kind": "sget", "field": fname(u16(base + (j + 1) * 2))}
    if op in IGET and (hi >> 4) == reg:
        return {"kind": "iget", "field": fname(u16(base + (j + 1) * 2))}
    if 0x44 <= op <= 0x4A and hi == reg:
        return {"kind": "aget"}
    if 0xB0 <= op <= 0xBF and (hi & 0xF) == reg:
        return {"kind": "binop2a", "op": BIN2A[op], "src": hi >> 4, "lhs_prior": True}
    if 0xD0 <= op <= 0xD7 and (hi >> 4) == reg:
        return {"kind": "binop16", "op": BINL16[op], "src": hi & 0xF, "lit": sext(u16(base + (j + 1) * 2), 16)}
    if 0xD8 <= op <= 0xE2 and hi == reg:
        w = u16(base + (j + 1) * 2)
        return {"kind": "binop8", "op": BINL8[op], "src": w & 0xFF, "lit": sext((w >> 8) & 0xFF, 8)}
    if 0x90 <= op <= 0x9A and hi == reg:
        w = u16(base + (j + 1) * 2)
        return {"kind": "binop", "op": BIN[op], "srcB": w & 0xFF, "srcC": (w >> 8) & 0xFF}
    return None


def chase(idx, base, insns, reg, k_site, depth=0):
    """find last def of reg before index position k_site; resolve provenance recursively"""
    if depth > 4 or k_site < 0:
        return {"kind": "none"}
    for k in range(k_site - 1, -1, -1):
        d = def_at(idx, base, k, reg)
        if d is None:
            continue
        if d["kind"] == "move-result":
            # nearest invoke before k
            for k2 in range(k - 1, -1, -1):
                j2, u2, op2, hi2 = idx[k2]
                if u2 in (0x0100, 0x0200, 0x0300, 0x0400, 0x0500):
                    continue
                if op2 in (0x6E, 0x6F, 0x70, 0x71, 0x72, 0x74, 0x75, 0x76, 0x77, 0x78):
                    gm, gargs = invoke_info(base, insns, idx[k2][0], u2, op2, hi2)
                    gi = minfo(gm)
                    rec = {"kind": "invoke-result", "getter": gi,
                           "getter_op": hex(op2), "dist": k - k2}
                    # getter's own constant args
                    consts = []
                    for ar in (gargs or []):
                        c = chase(idx, base, insns, ar, k2, depth + 1)
                        consts.append(c)
                    rec["getter_args"] = consts
                    return rec
            return {"kind": "move-result-no-src"}
        if d["kind"] in ("move", "move16"):
            src = chase(idx, base, insns, d["src"], k, depth + 1)
            return {"kind": d["kind"], "via_reg": d["src"], "src": src}
        if d["kind"] in ("binop2a", "binop16", "binop8", "binop"):
            rec = dict(d)
            for key in ("src", "srcB", "srcC"):
                if key in d:
                    rec[key + "_prov"] = chase(idx, base, insns, d[key], k, depth + 1)
            if d["kind"] == "binop2a":
                rec["lhs_prov"] = chase(idx, base, insns, reg, k, depth + 1)
            return rec
        return d
    return {"kind": "param", "reg": reg}


# ---- walk all classes/methods; find OWC & IATC call sites; resolve arg1 writer ----
sites = []
for ci in range(F["class_defs_size"]):
    cdo = u32(F["class_defs_off"] + ci * 32 + 24)
    if not cdo:
        continue
    try:
        o = cdo
        sf, o = uleb(o); inf, o = uleb(o); dm, o = uleb(o); vm, o = uleb(o)
        for _ in range(sf + inf):
            _, o = uleb(o); _, o = uleb(o)
        for kind, cnt in (("direct", dm), ("virtual", vm)):
            midx = 0
            for _ in range(cnt):
                diff, o = uleb(o); acc, o = uleb(o); coff, o = uleb(o)
                midx += diff
                if not coff:
                    continue
                try:
                    insns = u32(coff + 12)
                    if insns == 0 or coff + 16 + insns * 2 > len(data):
                        continue
                    idx, base = build_insn_index(coff, insns)
                    for k, (j, u, op, hi) in enumerate(idx):
                        if op not in (0x6E, 0x6F, 0x70, 0x71, 0x72, 0x74, 0x75, 0x76, 0x77, 0x78):
                            continue
                        midx2, args = invoke_info(base, insns, j, u, op, hi)
                        if midx2 not in (OWC, IATC):
                            continue
                        arg1 = args[1] if len(args) > 1 else None
                        rec = {"target": "OWC" if midx2 == OWC else "IATC",
                               "class_def": ci, "caller_midx": midx,
                               "caller": minfo(midx), "insn": j, "op": hex(op),
                               "args": args, "arg1": arg1}
                        if arg1 is not None:
                            rec["arg1_prov"] = chase(idx, base, insns, arg1, k)
                        sites.append(rec)
                except Exception as e:
                    sites.append({"class_def": ci, "caller_midx": midx, "parse_error": repr(e)})
    except Exception:
        continue

owc_sites = [s for s in sites if s.get("target") == "OWC"]
iatc_sites = [s for s in sites if s.get("target") == "IATC"]


def flatten_prov(p):
    """reduce a provenance tree to a compact signature + leaf getter info"""
    if not isinstance(p, dict):
        return str(p)
    k = p.get("kind")
    if k == "invoke-result":
        g = p.get("getter") or {}
        args = ",".join(_flatten_arg(a) for a in (p.get("getter_args") or []))
        return "GETTER %s->%s(%s) shorty=%s" % (g.get("cls", "?"), g.get("name", "?"), args, g.get("shorty", "?"))
    if k in ("move", "move16"):
        return flatten_prov(p.get("src"))
    if k in ("binop2a", "binop16", "binop8", "binop"):
        parts = []
        if "lhs_prov" in p:
            parts.append(flatten_prov(p["lhs_prov"]))
        for key in ("src_prov", "srcB_prov", "srcC_prov"):
            if key in p:
                parts.append(flatten_prov(p[key]))
        lit = p.get("lit", "")
        tail = ", #%s" % lit if lit != "" else ""
        return "%s(%s%s)" % (p.get("op", "?"), ", ".join(parts), tail)
    if k == "param":
        return "param_v%d" % p.get("reg", -1)
    if k == "const-string":
        return "str(%r)" % (p.get("s", "")[:40])
    if k == "const":
        return "const(%s)" % p.get("val")
    if k == "sget":
        return "sget(%s)" % p.get("field")
    if k == "iget":
        return "iget(%s)" % p.get("field")
    return k or "?"


def _flatten_arg(p):
    s = flatten_prov(p)
    return s


for s in owc_sites + iatc_sites:
    if "arg1_prov" in s:
        s["arg1_sig"] = flatten_prov(s["arg1_prov"])

out = {"OWC_midx": OWC, "IATC_midx": IATC,
       "n_owc_sites": len(owc_sites), "n_iatc_sites": len(iatc_sites),
       "owc_sites": owc_sites, "iatc_sites": iatc_sites}
json.dump(out, open(OUT, "w"), indent=1)

# console summary
from collections import Counter
sigs = Counter(s.get("arg1_sig", "<no arg1>") for s in owc_sites)
print("OWC(midx %d) call sites: %d" % (OWC, len(owc_sites)))
print("IATC(midx %d) call sites: %d" % (IATC, len(iatc_sites)))
print("\narg1 provenance histogram (OWC sites):")
for sig, c in sigs.most_common():
    print("  %3d x %s" % (c, sig[:130]))
print("\nIATC sites arg1:")
for s in iatc_sites:
    print("  caller=%s insn=%d arg1=%s sig=%s" % (
        (s.get("caller") or {}).get("name", "?"), s.get("insn"), s.get("arg1"), s.get("arg1_sig", "?")[:100]))
print("\nsaved:", OUT)
