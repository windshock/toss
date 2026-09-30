#!/usr/bin/env python3
"""Decode DEBUGGER-gate strings from DataSourceBitmapLoaderExternalSyntheticLambda2.
Replicates the two Java decoders exactly:
  A) IAuthTabCallback(int,String,int,int,boolean,Object[])  - add/sub + right-rotate + reverse
  B) onExtraCallback(int[],int,Object[])                     - T-table 16-round XOR cipher
  C) onExtraCallback(String,int,Object[])                    - per-index XOR (one-char cipher)
"""
import re, sys

SRC = "/tmp/jadx_dbg/sources/o/DataSourceBitmapLoaderExternalSyntheticLambda2.java"
TBL_SRC = "/tmp/jadx_hidden/sources/o/NetworkTypeObserverExternalSyntheticLambda0.java"
M32 = 0xFFFFFFFF

def parse_java_string(lit):
    """Parse a Java string literal body (without quotes) → list of chars."""
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

# ---------- load T-tables ----------
tbl_text = open(TBL_SRC, encoding="utf-8").read()
ctor = tbl_text[tbl_text.index("public NetworkTypeObserverExternalSyntheticLambda0()"):]
tables = [parse_int_array(m) for m in re.findall(r"new int\[\]\{([^}]+)\}", ctor)[:4]]
T0, T1, T2, T3 = tables
assert all(len(t) == 256 for t in tables), [len(t) for t in tables]

def T(v):
    return ((((T0[(v >> 24) & 255] + T1[(v >> 16) & 255]) & M32) ^ T2[(v >> 8) & 255]) + T3[v & 255]) & M32

def reverse(arr):
    return arr[::-1]

# ---------- static init constants ----------
src = open(SRC, encoding="utf-8").read()
GID = parse_int_array(re.search(r"getInterfaceDescriptor = new int\[\]\{([^}]+)\}", src).group(1))          # 18
IAD = int(re.search(r"IAuthTabCallbackDefault = (-?\d+)", src).group(1))                                    # -837138452
A0  = int(re.search(r"access000 = (-?\d+)", src).group(1))                                                  # long
KEY_XOR = (-2238453702121083934) & M32
KEY = [k ^ KEY_XOR for k in GID]   # unXORed key; rounds use reversed(KEY)

# ---------- decoder A ----------
def dec_a(chars, i_add, i2_rot, i3_len, z_rev):
    sub = ((IAD - 8081524258474968927) & M32)   # (int)(long) truncation
    out = [((ord(c) + i_add) & 0xFFFF) for c in chars[:i3_len]]
    out = [((v - sub) & 0xFFFF) for v in out]
    if i2_rot > 0:
        r = i2_rot % len(out)
        out = out[-r:] + out[:-r] if r else out   # right rotation (arraycopy pattern)
    if z_rev:
        out = out[::-1]
    return "".join(chr(v) for v in out)

# ---------- decoder B ----------
def dec_b(iarr, i_len):
    key = reverse(KEY)
    res = []
    for j in range(0, len(iarr), 2):
        c0 = (iarr[j] >> 16) & 0xFFFF; c1 = iarr[j] & 0xFFFF
        c2 = (iarr[j+1] >> 16) & 0xFFFF; c3 = iarr[j+1] & 0xFFFF
        v0, v1 = ((c0 << 16) + c1) & M32, ((c2 << 16) + c3) & M32
        for r in range(16):
            v0 ^= key[r]
            v1 = T(v0) ^ v1
            v0, v1 = v1, v0
        v0, v1 = v1, v0
        v1 ^= key[16]
        v0 ^= key[17]
        res += [chr((v0 >> 16) & 0xFFFF), chr(v0 & 0xFFFF), chr((v1 >> 16) & 0xFFFF), chr(v1 & 0xFFFF)]
    return "".join(res)[:i_len]

# ---------- decoder C ----------
def dec_c(chars, i_mul):
    base = (A0 + 916733648318839497) & M32   # (int)(access000 - (-916...L))
    return "".join(chr((((ord(c) ^ ((k * i_mul) & 0xFFFFFFFF)) & 0xFFFF) ^ base) & 0xFFFF) for k, c in enumerate(chars))

def find_lit(anchor):
    """Return the first Java string literal after the anchor text."""
    seg = src[src.index(anchor):]
    m = re.search(r'"((?:[^"\\]|\\.)*)"', seg)
    return m.group(1)

print("=== onNavigationEvent(int) — DEBUGGER check ===")
lit1 = find_lit("IAuthTabCallback(243 - View.MeasureSpec.getSize(0)")
s1 = dec_a(parse_java_string(lit1), 243, 8, 19, True)
print("method#1 (decA):", repr(s1))
arr2 = parse_int_array(re.search(r"onExtraCallback\(new int\[\]\{56591938, -1007102412[^}]+\}", src).group(0)[len("onExtraCallback(new int[]{"):-1])
for L in (18, 16, 20):
    print(f"method#2 (decB,len={L}):", repr(dec_b(arr2, L)))
lit_cls = find_lit('onExtraCallback("Ꭶ꿨次❶')
print("class   (decC):", repr(dec_c(parse_java_string(lit_cls), 48193)))

print("\n=== onNavigationEvent() — file line compare ===")
lit_p = find_lit("IAuthTabCallback(240 - TextUtils.getOffsetBefore")
s = parse_java_string(lit_p)
for rot in range(0, 3):
    for add in (240, 239, 241, 238, 242):
        r = dec_a(s, add, 41 - 1 + rot if False else 41 - 1, len(s), False)
        break
print("path (decA, add=240,rot40):", repr(dec_a(s, 240, 40, len(s), False)))
exp2 = [-1632868586, -1739692275]
print("expect (decB,len=3):", repr(dec_b(exp2, 3)))

print("\n=== onExtraCallbackWithResult() (no-arg) file gate ===")
lit_w = find_lit("IAuthTabCallback(239 - (ViewConfiguration.getKeyRepeatDelay()")
s = parse_java_string(lit_w)
print("path1 (add=239,rot21):", repr(dec_a(s, 239, 21, len(s), False)))

print("\n=== onExtraCallback() (no-arg) file gate ===")
lit_x = find_lit("IAuthTabCallback(239 - (ViewConfiguration.getMaximumFlingVelocity()")
s = parse_java_string(lit_x)
print("path2 (add=239,rot36):", repr(dec_a(s, 239, 36, len(s), True)))

print("\n=== asInterface() else-branch ===")
lit_y = find_lit("IAuthTabCallback(TextUtils.getCapsMode")
s = parse_java_string(lit_y)
print("1-char (decA add=190):", repr(dec_a(s, 190, -(-128), 1, True)))
arr8 = parse_int_array(re.search(r"onExtraCallback\(new int\[\]\{-1073338682[^}]+\}", src).group(0)[len("onExtraCallback(new int[]{"):-1])
print("8-int (decB,len=13):", repr(dec_b(arr8, 13)))
