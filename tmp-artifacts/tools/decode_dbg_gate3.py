#!/usr/bin/env python3
"""v3: decode remaining file-gate paths with confirmed sub=0x8d and exact rot params."""
import re, string

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
KEY = [k ^ ((-2238453702121083934) & M32) for k in GID]
SUB = 0x8d

def rot_left(v, r):
    r %= len(v)
    return v[r:] + v[:r] if r else v

def dec_a(chars, i_add, i2_rot, n, z_rev, sub=SUB):
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

ok = set(string.printable[:95])
def score(s): return sum(1 for ch in s if ch in ok) / max(1, len(s))

def try_all(label, anchor, i_adds, i2s, ns, revs):
    lit = [l for l in lits_after(anchor) if len(l) > 30][0]
    c = parse_java_string(lit)
    cands = []
    for i_add in i_adds:
        for i2 in i2s:
            for n in ns:
                for rev in revs:
                    s = dec_a(c, i_add, i2, min(n, len(c)), rev)
                    cands.append((score(s), i_add, i2, n, rev, s))
    cands.sort(reverse=True)
    print(f"--- {label} (len={len(c)}) ---")
    for sc, i_add, i2, n, rev, s in cands[:3]:
        print(f"  i={i_add} rot={i2} n={n} rev={rev} score={sc:.2f} → {s!r}")

try_all("onNavigationEvent() path", "IAuthTabCallback(240 - TextUtils.getOffsetBefore",
        [240, 241, 242], [20, 21, 22], [40, 39, 41, 38], [False])
try_all("onExtraCallbackWithResult() path", "IAuthTabCallback(239 - (ViewConfiguration.getKeyRepeatDelay()",
        [239, 240, 238], [19, 20, 21], [36, 35, 37], [False])
try_all("onExtraCallback() path2", "IAuthTabCallback(239 - (ViewConfiguration.getMaximumFlingVelocity()",
        [239, 240, 238], [14, 15, 16], [36, 35, 37], [True, False])

print("\n=== asInterface() 8-int (decB) ===")
m = re.search(r"onExtraCallback\(new int\[\](\{[^}]+\})", src[src.index("getWindowTouchSlop"):src.index("getWindowTouchSlop")+400])
arr8 = parse_int_array(m.group(1))
for L in (13, 12, 14):
    print(f"  len={L}:", repr(dec_b(arr8, L)))
print("  1-char decA:", repr(dec_a(["\0"], 189, 0, 1, True)), repr(dec_a(["\0"], 190, 0, 1, True)))
