#!/usr/bin/env python3
"""§118b — variant-6 (native-xor) COMPLETE class sweep, v2.

Decoder: out[k] = (T[i+k] ^ 0xEDD4) ^ ((k*W)&0xFFFF) ^ c, W = rotl64(R,6)&0xFFFF
Family = every class containing b(getPageByNodeId.c(FIELD[...]), k, KEY, c).
Table sources handled: (a) asCharBuffer ISO-8859-1 literal, (b) inline char[]{}
literal, (c) runtime-populated -> flagged dynamic-needed.
Wrapper method located by span-containing-the-b-call; sites scoped to its name.
"""
import importlib.util, json, os, re, sys
sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import dexstr_census as dc

SRC = "/tmp/jadx_hidden/sources"
XK = 0xEDD4
RT = {}
try:
    _rt = json.load(open("/tmp/runtime_tables.json"))
    for _cls, _flds in _rt.items():
        for _f in _flds:
            if "hex" in _f:
                h = _f["hex"]
                RT[(_cls, _f["f"])] = [int(h[q:q+4], 16) for q in range(0, len(h), 4)]
except Exception:
    pass

def rotl64(x, n):
    x &= (1 << 64) - 1
    return ((x << n) | (x >> (64 - n))) & ((1 << 64) - 1)

def split_args(flat, start):
    args, depth, cur, i = [], 1, [], start
    inq = esc = False
    while i < len(flat):
        ch = flat[i]
        if inq:
            cur.append(ch)
            if esc: esc = False
            elif ch == "\\": esc = True
            elif ch == '"': inq = False
        else:
            if ch == '"': inq = True; cur.append(ch)
            elif ch in "([{": depth += 1; cur.append(ch)
            elif ch in ")]}":
                depth -= 1
                if depth == 0 and ch == ")":
                    args.append("".join(cur)); return args, i
                cur.append(ch)
            elif ch == "," and depth == 1:
                args.append("".join(cur)); cur = []
            else: cur.append(ch)
        i += 1
    return args, i

METHOD_RE = re.compile(
    r"^[ \t]*(?:(?:public|private|protected|static|final|synchronized|abstract|native|default)\s+)*"
    r"[\w.\[\]<>?, ]*?\b(?!if\s*\(|for\s*\(|while\s*\(|switch\s*\(|catch\s*\(|return\s*\(|do\s*\{|try\s*\{|else\s*\{|new\s)(\w+)\s*\([^)]*\)\s*(?:throws [\w.,\s]+)?\s*\{", re.M)

def parse_class(path):
    txt = open(path, encoding="utf-8").read()
    mb = re.search(r"\.b\(getPageByNodeId\.c\((\w+)\[", txt)
    mk = re.search(r"\.b\(getPageByNodeId\.c\(\w+\[[^\]]*\]\),\s*\w+,\s*(\w+),", txt)
    mc = re.search(r"\.b\(getPageByNodeId\.c\(\w+\[[^\]]*\]\),\s*\w+,\s*\w+,\s*(\w+)\)", txt)
    if not mb or not mk or not mc:
        return None
    tfield, kfield, cparam = mb.group(1), mk.group(1), mc.group(1)
    # wrapper method def: last before the b-call (capture full sig for params)
    pos = mb.start()
    name = None; params = None
    for m in METHOD_RE.finditer(txt):
        if m.start() > pos: break
        name = m.group(1)
        pm = re.search(re.escape(name) + r"\s*\(([^)]*)\)", txt[m.start():m.start()+400])
        params = pm.group(1) if pm else None
    # index base param: TABLE[<X> + loop] or TABLE[<X>]
    mi = re.search(r"\.b\(getPageByNodeId\.c\(" + re.escape(tfield) + r"\[(\w+)(?:\s*\+\s*\w+)?\]", txt)
    iparam = mi.group(1) if mi else None
    # length param: new long[<Y>] nearest BEFORE the b-call
    ml2 = None
    for m in re.finditer(r"new long\[(\w+)\]", txt[:pos]):
        ml2 = m
    nparam = ml2.group(1) if ml2 else None
    # map param names -> positions in the signature
    roles = {}
    if params:
        pnames = [q.strip().split()[-1] for q in params.split(",") if q.strip()]
        for role, pn in (("i", iparam), ("n", nparam), ("c", cparam)):
            if pn and pn in pnames:
                roles[role] = pnames.index(pn)
    # table extraction
    T = None; src = None
    ml = re.search(r'ByteBuffer\.wrap\("((?:[^"\\]|\\.)*)"\.getBytes\("ISO-8859-1"\)\)\.asCharBuffer\(\)\.get\(cArr, 0, (\d+)\)', txt)
    if ml:
        n = int(ml.group(2))
        lit = dc.unjava(ml.group(1))
        raw = lit.encode("latin-1", "replace")
        if len(raw) >= 2 * n:
            T = [int.from_bytes(raw[2 * i:2 * i + 2], "big") for i in range(n)]
            src = "literal"
    if T is None:
        mi = re.search(r"\b" + re.escape(tfield) + r"\s*=\s*(?:new char\[\]\s*)?\{([0-9,\s]+)\}", txt)
        if mi:
            T = [int(x) for x in mi.group(1).split(",") if x.strip()]
            src = "inline"
    if T is None:
        return {"tfield": tfield, "kfield": kfield, "name": name, "roles": roles, "dynamic": True}
    # key candidates
    Rcands = []
    for mm in re.finditer(r"\b" + re.escape(kfield) + r"\s*=\s*(-?\d{4,20})L?\s*;", txt):
        v = int(mm.group(1))
        if v not in Rcands: Rcands.append(v)
    return {"tfield": tfield, "kfield": kfield, "name": name, "roles": roles, "T": T, "R": Rcands, "src": src, "txt": txt}

def decode(T, R, i, n, c):
    W = rotl64(R, 6) & 0xFFFF
    if not isinstance(i, int) or not isinstance(n, int): return None
    if i < 0 or n <= 0 or i + n > len(T): return None
    try:
        return "".join(chr(((T[i + k] ^ XK) ^ ((k * W) & 0xFFFF) ^ c) & 0xFFFF) for k in range(n))
    except Exception:
        return None

def ar(s):
    return sum(1 for ch in s if 32 <= ord(ch) < 127) / max(1, len(s))

def parse_configs(txt, cls_name=None):
    """every b-call -> a decoder config (wrapper name, roles, table, keys)."""
    configs = []
    for mb in re.finditer(r"\.b\(getPageByNodeId\.c\((\w+)\[", txt):
        tfield = mb.group(1)
        mk = re.search(r"\.b\(getPageByNodeId\.c\(" + re.escape(tfield) + r"\[[^\]]*\]\),\s*\w+,\s*(\w+),", txt[mb.start():mb.start()+260])
        mc = re.search(r"\.b\(getPageByNodeId\.c\(" + re.escape(tfield) + r"\[[^\]]*\]\),\s*\w+,\s*\w+,\s*(\w+)\)", txt[mb.start():mb.start()+260])
        if not mk or not mc:
            continue
        kfield, cparam = mk.group(1), mc.group(1)
        pos = mb.start()
        name = params = wstart = None
        for m in METHOD_RE.finditer(txt):
            if m.start() > pos: break
            name = m.group(1); wstart = m.start()
            pm = re.search(re.escape(name) + r"\s*\(([^)]*)\)", txt[m.start():m.start()+400])
            params = pm.group(1) if pm else None
        if not name:
            continue
        wend = txt.find("\n    }", pos)  # rough method end
        span = txt[wstart: pos + 400]
        mi = re.search(r"\.b\(getPageByNodeId\.c\(" + re.escape(tfield) + r"\[(\w+)(?:\s*\+\s*\w+)?\]", txt)
        iparam = mi.group(1) if mi else None
        ml2 = None
        for m in re.finditer(r"new long\[(\w+)\]", txt[wstart:pos]):
            ml2 = m
        nparam = ml2.group(1) if ml2 else None
        roles = {}
        if params:
            pnames = [q.strip().split()[-1] for q in params.split(",") if q.strip()]
            for role, pn in (("i", iparam), ("n", nparam), ("c", cparam)):
                if pn and pn in pnames:
                    roles[role] = pnames.index(pn)
        if len(roles) != 3:
            roles = {"i": 0, "n": 1, "c": 2}
        # table for tfield
        T = None; src_kind = None
        ml = re.search(r'ByteBuffer\.wrap\("((?:[^"\\]|\\.)*)"\.getBytes\("ISO-8859-1"\)\)\.asCharBuffer\(\)\.get\(cArr, 0, (\d+)\)', txt)
        if ml:
            n = int(ml.group(2))
            lit = dc.unjava(ml.group(1))
            raw = lit.encode("latin-1", "replace")
            if len(raw) >= 2 * n:
                T = [int.from_bytes(raw[2 * i2:2 * i2 + 2], "big") for i2 in range(n)]
                src_kind = "literal"
        if T is None:
            mi2 = re.search(r"\b" + re.escape(tfield) + r"\s*=\s*(?:new char\[\]\s*)?\{([0-9,\s]+)\}", txt)
            if mi2:
                T = [int(x) for x in mi2.group(1).split(",") if x.strip()]
                src_kind = "inline"
        Rcands = []
        if T is not None:
            for mm in re.finditer(r"\b" + re.escape(kfield) + r"\s*=\s*(-?\d{4,20})L?\s*;", txt):
                v = int(mm.group(1))
                if v not in Rcands: Rcands.append(v)
        if T is None and (cls_name, tfield) in RT:
            T = RT[(cls_name, tfield)]
            src_kind = "runtime"
        configs.append({"name": name, "roles": roles, "tfield": tfield, "kfield": kfield,
                        "T": T, "R": Rcands, "src": src_kind})
    return configs


def main():
    fam = []
    for dp, _, fs in os.walk(SRC):
        for f in fs:
            if not f.endswith(".java"): continue
            p = os.path.join(dp, f)
            try: t = open(p, encoding="utf-8").read()
            except Exception: continue
            if ".b(getPageByNodeId.c(" in t: fam.append((p, t))
    results = []
    ok = garbage = fail = dyn = 0
    for path, txt in sorted(fam):
        cls = os.path.relpath(path, SRC)[:-5].replace("/", ".")
        cls_name = os.path.relpath(path, SRC)[:-5].replace("/", ".")
        configs = parse_configs(txt, cls_name)
        live = [c for c in configs if c["T"] and c["R"]]
        if not live:
            dyn += 1
            results.append({"cls": cls, "note": "runtime-populated table or missing key"})
            print("[D] %-64s" % cls[:64], file=sys.stderr)
            continue
        names = sorted(set(c["name"] for c in live))
        sites = []
        for nm in names:
            for m in re.finditer(r"(?<![.\w])" + re.escape(nm) + r"\(", txt):
                args, _ = split_args(txt, m.end())
                if len(args) == 4 and all(not a.strip().startswith("new ") for a in args[:3]):
                    sites.append((txt.count("\n", 0, m.start()) + 1, [a.strip() for a in args]))
        s_ok = 0
        for (ln, args) in sites:
            try:
                vals = [dc.eval_expr(args[0]), dc.eval_expr(args[1]), dc.eval_expr(args[2]) & 0xFFFF]
            except Exception:
                fail += 1
                results.append({"cls": cls, "line": ln, "err": "eval"})
                continue
            best = None
            for c in live:
                i, n, ch = vals[c["roles"]["i"]], vals[c["roles"]["n"]], vals[c["roles"]["c"]]
                for R in c["R"]:
                    s = decode(c["T"], R, i, n, ch)
                    if s is None: continue
                    r = ar(s)
                    if best is None or r > best[0]:
                        best = (r, s, i, n, ch, c["tfield"], R)
            if best and best[0] >= 0.7:
                ok += 1; s_ok += 1
                results.append({"cls": cls, "line": ln, "i": best[2], "n": best[3], "c": best[4],
                                "tfield": best[5], "R": best[6], "ratio": round(best[0], 2), "str": best[1]})
            elif best:
                garbage += 1
                results.append({"cls": cls, "line": ln, "i": best[2], "n": best[3], "c": best[4],
                                "ratio": round(best[0], 2), "str": best[1]})
            else:
                fail += 1
                results.append({"cls": cls, "line": ln, "err": "no-config"})
        print("[+] %-60s cfgs=%d sites=%d ok=%d" % (cls[:60], len(live), len(sites), s_ok), file=sys.stderr)
    print("[total] classes=%d ok=%d garbage=%d eval-fail=%d dynamic=%d" % (len(fam), ok, garbage, fail, dyn), file=sys.stderr)
    def san(s):
        return "".join(ch if 32 <= ord(ch) < 0x10000 and not (0xD800 <= ord(ch) < 0xE000) else "?" for ch in s)
    for r in results:
        if "str" in r: r["str"] = san(r["str"])
    json.dump(results, open("/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/analysis-lab/artifacts/android/sweep6_results.json", "w"), indent=1, ensure_ascii=False)


if __name__ == "__main__":
    main()
