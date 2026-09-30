#!/usr/bin/env python3
"""v2: fixed rot direction (LEFT), brute-force sub for decA, longest-literal pick."""
import re

SRC = "/tmp/jadx_dbg/sources/o/DataSourceBitmapLoaderExternalSyntheticLambda2.java"
TBL_SRC = "/tmp/jadx_hidden/sources/o/NetworkTypeObserverExternalSyntheticLambda0.java"
M32 = 0xFFFFFFFF

def parse_java_string(lit):
    out, i = [], 0
    while i < len(lit):
        c = lit[i]
        if c == "\\":
            n = lit[i+1]
            if n == "u":
                j = i + 2
                while lit[j] == "u": j += 1
                out.append(chr(int(lit[j:j+4], 16))); i = j + 4
            else:
                out.append({"n":"\n","r":"\r","b":"\b","t":"\t","f":"\f","'":"'",'"':'"',"\\":"\\","0":"\0"}[n]); i += 2
        else:
            out.append(c); i += 1
    return out

def parse_int_array(text):
    return [int(x.strip()) & M32 for x in re.split(r"[,\s]+", text.strip()) if re.fullmatch(r"-?\d+", x.strip())]

tbl_text = open(TBL_SRC, encoding="utf-8").read()
ctor = tbl_text[tbl_text.index("public NetworkTypeObserverExternalSyntheticLambda0()"):]
T0, T1, T2, T3 = [parse_int_array(m) for m in re.findall(r"new int\[\]\{([^}]+)\}", ctor)[:4]]
def T(v):
    return ((((T0[(v >> 24) & 255] + T1[(v >> 16) & 255]) & M32) ^ T2[(v >> 8) & 255]) + T3[v & 255]) & M32

src = open(SRC, encoding="utf-8").read()
GID = parse_int_array(re.search(r"getInterfaceDescriptor = new int\[\]\{([^}]+)\}", src).group(1))
IAD = int(re.search(r"IAuthTabCallbackDefault = (-?\d+)", src).group(1))
A0  = int(re.search(r"access000 = (-?\d+)", src).group(1))
KEY = [k ^ ((-2238453702121083934) & M32) for k in GID]

def rot_left(v, r):
    r %= len(v)
    return v[r:] + v[:r] if r else v

def dec_a(chars, i_add, sub, i2_rot, z_rev, n=None):
    n = n or len(chars)
    out = [((ord(c) + i_add - sub) & 0xFFFF) for c in chars[:n]]
    if i2_rot > 0: out = rot_left(out, i2_rot)
    if z_rev: out = out[::-1]
    return "".join(chr(v) for v in out)

def dec_b(iarr, i_len):
    key = KEY[::-1]
    res = []
    for j in range(0, len(iarr), 2):
        v0 = ((iarr[j] >> 16) << 16) + (iarr[j] & 0xFFFF)
        v1 = ((iarr[j+1] >> 16) << 16) + (iarr[j+1] & 0xFFFF)
        for r in range(16):
            v0 ^= key[r]; v1 = T(v0) ^ v1; v0, v1 = v1, v0
        v0, v1 = v1, v0
        v1 ^= key[16]; v0 ^= key[17]
        res += [chr((v0 >> 16) & 0xFFFF), chr(v0 & 0xFFFF), chr((v1 >> 16) & 0xFFFF), chr(v1 & 0xFFFF)]
    return "".join(res)[:i_len]

def lits_after(anchor, span=600):
    seg = src[src.index(anchor):src.index(anchor)+span]
    return re.findall(r'"((?:[^"\\]|\\.)*)"', seg)

print("=== method#1 brute force (expect isDebuggerConnected) ===")
lit1 = [l for l in lits_after("IAuthTabCallback(243 - View.MeasureSpec.getSize(0)") if len(l) > 30][0]
c1 = parse_java_string(lit1)
target = "isDebuggerConnected"
best = None
for rev in (True, False):
    for rot in range(0, 20):
        # out = rot_left(rev? reversed(in')...) — build expected out from target then solve sub
        exp = list(target)
        if rev: exp = exp[::-1]
        if rot: exp = rot_left(exp, rot)
        subs = {( (ord(c) + 243 - ord(e)) & 0xFFFF ) for c, e in zip(c1, exp)}
        if len(subs) == 1:
            print(f"  MATCH rev={rev} rot={rot} sub={hex(subs.pop())} → {target}")
            best = (rev, rot)
        elif len(subs) <= 4:
            from collections import Counter
            cnt = Counter(((ord(c) + 243 - ord(e)) & 0xFFFF) for c, e in zip(c1, exp))
            common, freq = cnt.most_common(1)[0]
            if freq >= 15:
                print(f"  ~match(≤3 corrupt) rev={rev} rot={rot} sub={hex(common)} mismatches={19-freq}")
print("  decA result with found params:", repr(dec_a(c1, 243, (0x10000 + ord(c1[0]) + 243 - ord(target[0])) & 0xFFFF if not best else 0, 0, False)) if False else "")

print("\n=== class name (decC, base solved) ===")
lit_cls = [l for l in lits_after('onExtraCallback("Ꭶ꿨次❶') if len(l) > 20][0]
cc = parse_java_string(lit_cls)
base = ord(cc[0]) ^ ord("a")   # assume starts 'a' (android...)
res = "".join(chr(((ord(c) ^ ((k * 48193) & M32)) ^ base) & 0xFFFF) for k, c in enumerate(cc))
print(f"  base={hex(base)} →", repr(res))
base2 = ord(cc[0]) ^ ord("j")
res2 = "".join(chr(((ord(c) ^ ((k * 48193) & M32)) ^ base2) & 0xFFFF) for k, c in enumerate(cc))
print(f"  base2={hex(base2)} →", repr(res2))

print("\n=== onNavigationEvent() file gate ===")
lp = [l for l in lits_after("IAuthTabCallback(240 - TextUtils.getOffsetBefore") if len(l) > 30][0]
cp = parse_java_string(lp)
# solve sub/rot assuming readable path: brute rot & printable heuristic
for rot in range(0, len(cp)):
    for rev in (False, True):
        for sub in range(0x10000):
            pass  # too slow — use structural solve below
# structural: try sub candidates that make max printable ASCII
import string
ok = set(string.printable[:95])
bestc = (0, None)
for rot in range(len(cp)):
    for rev in (False, True):
        exp_ord = None
        # choose sub = c[0] + 240 - '/' (paths start with /) or 'a'..'z'
        for first in "/psdflmn":
            sub = (ord(cp[0]) + 240 - ord(first)) & 0xFFFF
            s = dec_a(cp, 240, sub, rot, rev)
            score = sum(1 for ch in s if ch in ok)
            if score > bestc[0]:
                bestc = (score, (rot, rev, hex(sub), s))
print("  best path guess:", bestc)
print("  expect(decB 2-int):", repr(dec_b([-1632868586, -1739692275], 3)))

print("\n=== onExtraCallbackWithResult() path (239) ===")
lw = [l for l in lits_after("IAuthTabCallback(239 - (ViewConfiguration.getKeyRepeatDelay()") if len(l) > 30][0]
cw = parse_java_string(lw)
bestc2 = (0, None)
for rot in range(len(cw)):
    for rev in (False, True):
        for first in "/psdflmn":
            sub = (ord(cw[0]) + 239 - ord(first)) & 0xFFFF
            s = dec_a(cw, 239, sub, rot, rev)
            score = sum(1 for ch in s if ch in ok)
            if score > bestc2[0]:
                bestc2 = (score, (rot, rev, hex(sub), s))
print("  best:", bestc2)

print("\n=== onExtraCallback() path2 (239, reverse=true) ===")
lx = [l for l in lits_after("IAuthTabCallback(239 - (ViewConfiguration.getMaximumFlingVelocity()") if len(l) > 30][0]
cx = parse_java_string(lx)
bestc3 = (0, None)
for rot in range(len(cx)):
    for rev in (False, True):
        for first in "/psdflmn":
            sub = (ord(cx[0]) + 239 - ord(first)) & 0xFFFF
            s = dec_a(cx, 239, sub, rot, rev)
            score = sum(1 for ch in s if ch in ok)
            if score > bestc3[0]:
                bestc3 = (score, (rot, rev, hex(sub), s))
print("  best:", bestc3)

print("\n=== asInterface() (API<=33 path) ===")
ly = [l for l in lits_after("IAuthTabCallback(TextUtils.getCapsMode") if len(l) < 5]
print("  1-char lit:", ly)
arr8 = parse_int_array(re.search(r"onExtraCallback\(new int\[\]\{-1073338682[^}]+\}", src).group(1))
for L in (13, 12, 14, 11):
    print(f"  8-int decB(len={L}):", repr(dec_b(arr8, L)))
