#!/usr/bin/env python3
"""dexstr_census.py — FULL string-decryption census of the toss hidden DEX.

Scans the jadx sources for both DexGuard decoder call forms, evaluates the
constant-soup arguments (guest-harvested Android API constants), decrypts
every site, and writes:
  artifacts/android/hidden_strings.json   (site -> plaintext mapping)
  artifacts/android/hidden_strings.txt    (readable census)
Forms:
  TABLE: onWarmupCompleted(<int>, <int>, (char)<expr>, objArr)
  TEA:   onNavigationEvent("<lit>", <int>, objArr)
"""
import json
import os
import re
import sys

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
import dexstr

SRC = "/tmp/jadx_hidden/sources"
OUT = ("/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/"
       "analysis-lab/artifacts/android/hidden_strings")

# guest-harvested API constants (this build, API level)
API = {
    "ImageFormat.getBitsPerPixel(0)": -1,
    "ViewConfiguration.getKeyRepeatDelay()": 50,
    "ViewConfiguration.getDoubleTapTimeout()": 300,
    "ExpandableListView.getPackedPositionForGroup(0)": 0,
    "KeyEvent.getModifierMetaStateMask()": 487679,
    "KeyEvent.getMaxKeyCode()": 337,
    "AudioTrack.getMinVolume()": 0,
    "TypedValue.complexToFloat(0)": 0,
    "TextUtils.indexOf(\"\", \"\")": 0,
    "TextUtils.getOffsetBefore(\"\", 0)": -1,
    "ViewConfiguration.getKeyRepeatTimeout()": 400,
    "Drawable.resolveOpacity(0, 0)": 0,
    "View.resolveSizeAndState(0, 0, 0)": 0,
    "ViewConfiguration.getMaximumDrawingCacheSize()": 1536000,
    "ViewConfiguration.getScrollBarFadeDuration()": 250,
    "ViewConfiguration.getZoomControlsTimeout()": 3000,
    "ViewConfiguration.getTouchSlop()": 8,
    "ViewConfiguration.getWindowTouchSlop()": 16,
    "ViewConfiguration.getTapTimeout()": 100,
    "ViewConfiguration.getScrollBarSize()": 4,
    "ViewConfiguration.getLongPressTimeout()": 400,
    "ViewConfiguration.getEdgeSlop()": 12,
    "ViewConfiguration.getFadingEdgeLength()": 12,
    "ViewConfiguration.getScrollFriction()": 0.015,
    "ViewConfiguration.getJumpTapTimeout()": 500,
    "ViewConfiguration.getGlobalActionKeyTimeout()": 500,
    "ViewConfiguration.getPressedStateDuration()": 64,
    "ViewConfiguration.getMaximumFlingVelocity()": 8000,
    "ViewConfiguration.getMinimumFlingVelocity()": 50,
    "KeyEvent.getDeadChar(0, 0)": 0,
    "KeyEvent.normalizeMetaState(0)": 0,
    "Process.getElapsedCpuTime()": 815,
    "AndroidCharacter.getMirror('0')": 48,
    "View.getDefaultSize(0, 0)": 0,
    "View.resolveSize(0, 0)": 0,
    "Color.green(0)": 0,
    "Color.red(0)": 0,
    "Color.blue(0)": 0,
    "Color.alpha(0)": 0,
    "Color.argb(0, 0, 0, 0)": 0,
    "Color.rgb(0, 0, 0)": -16777216,
    "PointF.length(0.0f, 0.0f)": 0,
    "SystemClock.uptimeMillis()": 1,
    "SystemClock.elapsedRealtime()": 1,
    "SystemClock.elapsedRealtimeNanos()": 1,
    "SystemClock.currentThreadTimeMillis()": 1,
    "Process.myPid()": 100000,
    "Process.myTid()": 100000,
    "Process.myUid()": 1000,
    "Process.getGidForName(\"\")": -1,
    "Process.getUidForName(\"\")": -1,
    "AudioTrack.getMaxVolume()": 1,
    "ExpandableListView.getPackedPositionGroup(0L)": -1,
    "ExpandableListView.getPackedPositionForChild(0, 0)": -9223372036854776000,
    "ExpandableListView.getPackedPositionChild(0L)": -1,
    "TypedValue.complexToFraction(0, 0.0f, 0.0f)": 0,
    "MeasureSpec.getMode(0)": 0,
    "MeasureSpec.getSize(0)": 0,
    "MeasureSpec.makeMeasureSpec(0, 0)": 0,
    "View.MeasureSpec.getMode(0)": 0,
    "View.MeasureSpec.getSize(0)": 0,
    "View.MeasureSpec.makeMeasureSpec(0, 0)": 0,
}

# generic API-call pattern -> value resolver
API_RE = re.compile(
    r"(ViewConfiguration|View\.MeasureSpec|MeasureSpec|KeyEvent|TextUtils|"
    r"ImageFormat|Drawable|PointF|TypedValue|View|Process|SystemClock|Color|AndroidCharacter|"
    r"ExpandableListView|AudioTrack)\."
    r"(get\w+|indexOf|lastIndexOf|resolveOpacity|makeMeasureSpec|resolveSize|"
    r"resolveSizeAndState|length|complexToFraction|complexToFloat|"
    r"myPid|myTid|myUid|getGidForName|getUidForName|elapsedRealtimeNanos|elapsedRealtime|"
    r"uptimeMillis|currentThreadTimeMillis|getMinVolume|getMaxVolume|"
    r"getPackedPosition\w+|getCapsMode|getTrimmedLength)"
    r"\(([^()]*)\)")


def resolve_api(m):
    cls, meth, args = m.group(1), m.group(2), m.group(3)
    args = ",".join(a.strip() for a in args.split(","))
    for key, val in API.items():
        kcls, kmeth, kargs = key.split("(")[0].split(".")[-2], key.split("(")[0].split(".")[-1], key.split("(")[1].split(")")[0]
        ccls = cls[5:] if cls.startswith("View.") else cls
        if (ccls == kcls or (ccls == "MeasureSpec" and kcls == "MeasureSpec")) and meth == kmeth:
            ka = ",".join(a.strip() for a in kargs.split(","))
            if args == ka:
                return str(val)
    # unknown combo: fail loudly per-expression (caller catches)
    raise ValueError("api? %s.%s(%s)" % (cls, meth, args))


def eval_expr(expr):
    """evaluate a java constant-soup expression to an int (raises if unknown)"""
    e = expr.strip()
    # strip ALL casts upfront (simple regex, no wrapper needed since we only need ints)
    for _ in range(10):
        e2 = re.sub(r"\((?:char|byte|int|long|float|double|CharSequence)\)\s*", "", e)
        if e2 == e:
            break
        e = e2
    def wrap_casts(e):
        out = []
        i = 0
        while i < len(e):
            m = re.match(r"\((byte|char)\) ?", e[i:])
            if m:
                j = i + m.end()
                while j < len(e) and e[j] == " ":
                    j += 1
                if j < len(e) and e[j] == "(":
                    depth = 0
                    k = j
                    while k < len(e):
                        if e[k] == "(":
                            depth += 1
                        elif e[k] == ")":
                            depth -= 1
                            if depth == 0:
                                break
                        k += 1
                    fn = "int8" if m.group(1) == "byte" else "int16"
                    out.append(fn + e[j:k + 1])
                    i = k + 1
                    continue
                m2 = re.match(r"[\w.]+\(\)|-?\d+", e[j:])
                if m2:
                    fn = "int8" if m.group(1) == "byte" else "int16"
                    out.append(fn + "(" + e[j:j + m2.end()] + ")")
                    i = j + m2.end()
                    continue
            out.append(e[i])
            i += 1
        return "".join(out)

    for _ in range(6):
        e2 = wrap_casts(e)
        if e2 == e:
            break
        e = e2
    e = re.sub(r"\(int\)\s*", "", e)
    e = re.sub(r"\(long\)\s*", "", e)
    e = re.sub(r"\(float\)\s*", "", e)
    e = re.sub(r"\(double\)\s*", "", e)
    e = re.sub(r"\(CharSequence\)\s*", "", e)
    e = re.sub(r"\bCharSequence\b", '""', e)
    # char literals 'x' -> int
    e = re.sub(r"'([^'\\]|\\.)'", lambda m: str(ord(m.group(1)[-1])) if not m.group(1).startswith("\\") else str(ord({"n":10,"r":13,"t":9,"0":0,"f":12,"b":8}.get(m.group(1)[1], m.group(1)[1]))), e)
    # compound constants (longest first)
    COMPOUND = {
        "Process.myPid() >> 22": "0",
        "Process.myTid() >> 22": "0",
        "SystemClock.elapsedRealtimeNanos()": "1",
        "ViewConfiguration.getScrollFriction()": "0.05",
        "PointF.length(0.0f, 0.0f)": "0.0",
        "TypedValue.complexToFraction(0, 0.0f, 0.0f)": "0.0",
        "TypedValue.complexToFloat(0)": "0.0",
        "View.resolveSize(0, 0)": "0",
        "ViewConfiguration.getFadingEdgeLength()": "12",
        "ViewConfiguration.getEdgeSlop()": "12",
        "TextUtils.indexOf(\"\", 48, 0, 0)": "-1",
        "TextUtils.indexOf(\"\", 48, 0)": "-1",
        "TextUtils.indexOf(\"\", 0, 0)": "0",
    }
    # pre-resolve Color.* and AndroidCharacter.* directly (regex class matching unreliable)
    for pat, val in [("Color.green(0)", "0"),
                     ("KeyEvent.keyCodeFromString(\"\")", "-1"),
                     ("CdmaCellLocation.convertQuartSecToDecDegrees(0)", "-1"),
                     ("CdmaCellLocation.convertQuartSecToDecDegrees(0.0d)", "-1"), ("Color.red(0)", "0"), ("Color.blue(0)", "0"),
                     ("Color.rgb(0, 0, 0)", "-16777216"),
                     ("KeyEvent.keyCodeFromString(\"\")", "-1"),
                     ("CdmaCellLocation.convertQuartSecToDecDegrees(0)", "-1"),
                     ("CdmaCellLocation.convertQuartSecToDecDegrees(0.0d)", "-1"),
                     ("TextUtils.indexOf(\"\", \"\")", "0"),
                     ("TextUtils.indexOf(\"\", \"\", 0)", "0"),
                     ("TextUtils.indexOf(\"\", \"\", 0, 0)", "0"),
                     ("View.combineMeasuredStates(0, 0)", "0"),
                     ("Gravity.getAbsoluteGravity(0, 0)", "0"),
                     ("MotionEvent.axisFromString(\"\")", "-1"),
                     ("CdmaCellLocation.convertQuartSecToDecDegrees(0)", "-1"),
                     ("CdmaCellLocation.convertQuartSecToDecDegrees(0.0d)", "-1"),
                     ("Color.alpha(0)", "0"), ("Color.argb(0, 0, 0, 0)", "0"),
                     ("AndroidCharacter.getMirror('0')", "48"),
                     ("AndroidCharacter.getMirror(48)", "48"),
                     ("TextUtils.lastIndexOf(\"\", '0', 0, 0)", "-1"),
                     ("TextUtils.lastIndexOf(\"\", '0', 0)", "-1"),
                     ("TextUtils.lastIndexOf(\"\", '0')", "-1"),
                     ("TextUtils.indexOf(\"\", '0')", "-1"),
                     ("TextUtils.indexOf(\"\", '0', 0)", "-1"),
                     ("TextUtils.indexOf(\"\", '0', 0, 0)", "-1"),
                     ("TextUtils.getCapsMode(\"\", 0, 0)", "0"),
                     ("TextUtils.getTrimmedLength(\"\")", "0"),
                     ("TextUtils.getOffsetAfter(\"\", 0)", "-1"),
                     ("TextUtils.getOffsetBefore(\"\", 0)", "-1"),
                     ("ExpandableListView.getPackedPositionType(0L)", "0"),
                     ("ViewConfiguration.getScrollDefaultDelay()", "250"),
                     ("KeyEvent.normalizeMetaState(0)", "0"),
                     ("KeyEvent.keyCodeFromString(\"\")", "-1"),
                     ("KeyEvent.normalizeMetaState(0)", "0"),
                     ("Process.getElapsedCpuTime()", "815")]:
        e = e.replace(pat, val)
    for k in sorted(COMPOUND, key=len, reverse=True):
        e = e.replace(k, COMPOUND[k])
    # resolve remaining API calls
    for _ in range(10):
        m = API_RE.search(e)
        if not m:
            break
        e = e[:m.start()] + resolve_api(m) + e[m.end():]
    # special: > (-1L) is always true (positive runtime values) -> 1
    e = re.sub(r"> \(-1L\) \? 1 : \([^)]+\? 0 : -1\)\)", ") ", e)
    # sign idiom: (E > 0.0f ? 1 : (E == 0.0f ? 0 : -1)) with E repeated
    SIGN = re.compile(r"\((?P<e>[^()]+) > (?:0(?:\.0f|\.0d|L)?|\(-1L\)) \? 1 : \((?P=e) == (?:0(?:\.0f|\.0d|L)?|\(-1L\)) \? 0 : -1\)\)")
    def sign_sub(m):
        inner = m.group("e")
        ee = re.sub(r"(\d+(?:\.\d+)?)f", r"\1", inner).replace("L", "")
        try:
            v = eval(ee, {"int8": lambda x: int(x) & 0xFF, "int16": lambda x: int(x) & 0xFFFF})
            return "1" if v > 0 else ("0" if v == 0 else "-1")
        except Exception:
            raise ValueError("sign? %r" % expr)
    for _ in range(12):
        m2 = SIGN.search(e)
        if not m2:
            break
        try:
            e = e[:m2.start()] + sign_sub(m2) + e[m2.end():]
        except ValueError:
            break  # can't resolve, leave for later
    # leftover simple ternaries of form (E > 0L ? 1 : 0)-ish after resolution
    e2 = re.sub(r"\b(\d+)L\b", r"\1", e)
    e = e2
    py = e
    py = re.sub(r"(\d+(?:\.\d+)?)f", r"\1", py)
    py = re.sub(r"\b0x([0-9a-fA-F]+)\b", lambda m: str(int(m.group(1), 16)), py)
    if not re.fullmatch(r"[\d\s+\-*/%<>&|^~().A-Za-z_]*", py) or not re.fullmatch(r"(?:int8|int16|[\d\s+\-*/%<>&|^~().(),\w]*)", py):
        raise ValueError("unresolvable: %r" % expr)
    def int8(v):
        v = int(v) & 0xFF
        return v - 256 if v > 127 else v

    def int16(v):
        v = int(v) & 0xFFFF
        return v - 65536 if v > 32767 else v

    val = eval(py, {'int8': int8, 'int16': int16})
    return int(val)


def unjava(s):
    return dexstr._unesc(s)



def s64w(x):
    x &= (1 << 64) - 1
    return x - (1 << 64) if x >> 63 else x


def v3_keys(path):
    """extract per-class keys for the (String,byte,int,Object[]) variant."""
    txt = open(path, encoding="utf-8").read()
    mb = re.search(r"static void onWarmupCompleted\(String str, byte b[^)]*\)", txt)
    if not mb:
        return None
    body = txt[mb.end():mb.end() + 6000]
    m = re.search(r"char\[\] cArr2 = (\w+);", body)
    if not m:
        return None
    subf = m.group(1)
    m2 = re.search(r"char c = \(char\) \((\d{15,})L \^ (\w+)\);", body)
    if not m2:
        return None
    xor_l = int(m2.group(1))
    radixf = m2.group(2)
    mfx = re.search(r"cArr4\[i20\] = \(char\) \(cArr4\[i20\] \^ (\d+)\);", body)
    fin = int(mfx.group(1)) if mfx else 13722
    mt = re.search(subf + r" = new char\[\]\{([\d, ]+)\}", txt)
    if not mt:
        return None
    table = [int(x) for x in mt.group(1).split(",")]
    mr = re.search(radixf + r" = \(char\) (\d+);", txt)
    if not mr:
        return None
    seed = int(mr.group(1))
    return {"table": table, "xor_l": xor_l, "seed": seed, "fin": fin}


def v3_decrypt(keys, lit, b, n):
    c = (keys["xor_l"] ^ keys["seed"]) & 0xFFFF
    tbl = [t ^ (keys["xor_l"] & 0xFFFF) for t in keys["table"]]
    ca = [ord(ch) & 0xFFFF for ch in lit]
    out = [0] * n
    for p in range(0, n, 2):
        a = ca[p] if p < len(ca) else 0
        z = ca[p + 1] if p + 1 < len(ca) else 0
        if a != z:
            q1, r1 = a // c, a % c
            q2, r2 = z // c, z % c
            if r1 == r2:
                q1 = (q1 + c - 1) % c
                q2 = (q2 + c - 1) % c
                out[p] = tbl[q1 * c + r1]
                out[p + 1] = tbl[q2 * c + r2]
            elif q1 != q2:
                out[p] = tbl[q1 * c + r2]
                out[p + 1] = tbl[q2 * c + r1]
            else:
                r1 = (r1 + c - 1) % c
                r2 = (r2 + c - 1) % c
                out[p] = tbl[q1 * c + r1]
                out[p + 1] = tbl[q2 * c + r2]
        else:
            out[p] = (a - b) & 0xFFFF
            out[p + 1] = (z - b) & 0xFFFF
    for k in range(n):
        out[k] ^= keys["fin"]
    return "".join(chr(x & 0xFFFF) for x in out)




def tea_keys_for(path):
    """extract the 4 TEA key chars for this class's decoder."""
    txt = open(path, encoding="utf-8").read()
    mb = re.search(r"static void onNavigationEvent\(String str, int[^)]*\)", txt)
    if not mb:
        return None
    body = txt[mb.end():mb.end() + 2500]
    fields = re.findall(r"\(char\) \((\w+) - 3974139103868117988L\)", body)
    if len(fields) < 4:
        return None
    keys = []
    for f in fields[:4]:
        m = re.search(f + r" = \(char\) (\d+)", txt)
        if m:
            keys.append(int(m.group(1)))
        else:
            return None
    return keys


def tea_decrypt_per_class(lit, n, keys):
    kw, ko, ke, ki = [(k - 3974139103868117988) & 0xFFFF for k in keys]
    ca = [ord(x) & 0xFFFF for x in lit]
    out = [0] * len(ca)
    p = 0
    while p < len(ca):
        c0 = ca[p]
        c1 = ca[p + 1] if p + 1 < len(ca) else 0
        delta = 58224
        for _ in range(16):
            c1 = (c1 - ((((c0 + delta) & 0xFFFF) ^ ((c0 << 4) + kw) & 0xFFFF) ^ (((c0 >> 5) + ko) & 0xFFFF))) & 0xFFFF
            c0 = (c0 - (((((c1 >> 5) + ke)) & 0xFFFF) ^ (((c1 + delta) & 0xFFFF) ^ ((c1 << 4) + ki) & 0xFFFF))) & 0xFFFF
            delta = (delta - 40503) & 0xFFFF
        out[p] = c0
        if p + 1 < len(ca):
            out[p + 1] = c1
        p += 2
    return "".join(chr(x) for x in out[:n])




def is_lambda7(path):
    """check if this class uses the Lambda7 XOR decoder."""
    try:
        txt = open(path, encoding="utf-8").read()
        return "(-916733648318839497L)" in txt and "onNavigationEvent(String str, int" in txt
    except Exception:
        return False


def lambda7_xor_const(path):
    """extract the actual XOR constant: (onExtraCallback - (-916733648318839497L))"""
    txt = open(path, encoding="utf-8").read()
    m = re.search(r"onExtraCallback = (-?\d+)L", txt)
    if not m:
        return None
    oval = int(m.group(1))
    return oval + 916733648318839497


def lambda7_decrypt(lit, seed, xor_c):
    """Lambda7 XOR: out[k] = (char)(in[k] ^ (k*seed) ^ xor_const)"""
    # only low 16 bits matter for the char cast
    xl = xor_c & 0xFFFF
    out = []
    for k, ch in enumerate(lit):
        c = ord(ch) & 0xFFFF
        prod = (k * seed) & 0xFFFF
        out.append(chr((c ^ prod ^ xl) & 0xFFFF))
    return "".join(out)




def is_lambda23(path):
    try:
        txt = open(path, encoding="utf-8").read()
        # check the decoder body specifically uses RepeatModeUtil (not just the file)
        mb = re.search(r"static void onNavigationEvent\(String str, int[^)]*\)", txt)
        if not mb:
            return False
        body = txt[mb.end():mb.end() + 500]
        return "RepeatModeUtil.onExtraCallback" in body
    except Exception:
        return False


def lambda23_decrypt(lit, iparam):
    """Lambda23: bit-select reorder + XOR chain, output from index 4."""
    txt = open("/tmp/toss_hidden_jadx.ToEU7Z/sources/o/ExoPlayerBuilderExternalSyntheticLambda23.java").read()
    import re as _re
    m = _re.search(r"onExtraCallbackWithResult = (-?\d+)L", txt)
    if not m:
        return None
    oecr = int(m.group(1))
    key = oecr ^ 8686948009763778008
    # unsigned 64-bit
    key_u = key & ((1 << 64) - 1)
    ca = [ord(c) & 0xFFFF for c in lit]
    n = len(ca)
    arr = [0] * n
    # stage 1: bit-select reorder
    i2 = 0  # special (0-3)
    i3 = 4  # regular (4+)
    for i4 in range(n):
        bit = (key_u >> i4) & 1
        if ((bit != (iparam & 1)) or i2 >= 4) and i3 < n:
            arr[i3] = ca[i4]
            i3 += 1
        else:
            arr[i2] = ca[i4]
            i2 += 1
    # stage 2: XOR chain from index 4
    for k in range(4, n):
        prev = k - 4
        arr[k] = (arr[k] ^ arr[k % 4] ^ ((prev * key) & 0xFFFF)) & 0xFFFF
    return "".join(chr(x) for x in arr[4:])


def main():
    T = dexstr.load_table()
    files = []
    for root, _dirs, fs in os.walk(SRC):
        for f in fs:
            if f.endswith(".java"):
                files.append(os.path.join(root, f))
    print("[+] %d java files" % len(files), file=sys.stderr)

    def split_args(flat, start):
        """start points AFTER '(' — return top-level comma-split args."""
        args, depth, cur, i = [], 1, [], start
        inq = False
        esc = False
        while i < len(flat):
            ch = flat[i]
            if inq:
                cur.append(ch)
                if esc:
                    esc = False
                elif ch == "\\":
                    esc = True
                elif ch == '"':
                    inq = False
            else:
                if ch == '"':
                    inq = True
                    cur.append(ch)
                elif ch in "([{":
                    depth += 1
                    cur.append(ch)
                elif ch in ")]}":
                    depth -= 1
                    if depth == 0 and ch == ")":
                        args.append("".join(cur))
                        return args, i
                    cur.append(ch)
                elif ch == "," and depth == 1:
                    args.append("".join(cur))
                    cur = []
                else:
                    cur.append(ch)
            i += 1
        return args, i

    def iter_calls(flat, name):
        for m in re.finditer(re.escape(name) + "\\(", flat):
            args, end = split_args(flat, m.end())
            yield m.start(), args

    sites = []
    tea_ok = tbl_ok = v3_ok = fail = 0
    # ---- variant 3: onWarmupCompleted("lit", byte-expr, int-expr, objArr)
    v3files = set()
    for root, _d, fs in os.walk(SRC):
        for f in fs:
            if not f.endswith(".java"):
                continue
            path = os.path.join(root, f)
            try:
                txt = open(path, encoding="utf-8").read()
            except Exception:
                continue
            if "static void onWarmupCompleted(String" not in txt:
                continue
            keys = v3_keys(path)
            v3files.add(os.path.relpath(path, SRC))
            if not keys:
                continue
            flat = re.sub(r"\s+", " ", txt)
            for pos, args in iter_calls(flat, "onWarmupCompleted"):
                if len(args) != 4 or not args[0].strip().startswith('"'):
                    continue
                try:
                    lit = unjava(args[0].strip()[1:-1])
                    b = eval_expr(args[1])
                    n = eval_expr(args[2])
                    if not (0 <= n <= 4096 and -256 <= b <= 255):
                        raise ValueError("range")
                    sstr = v3_decrypt(keys, lit, b & 0xFF if b >= 0 else b, n)
                    sites.append({"file": os.path.relpath(path, SRC), "kind": "v3",
                                  "b": b, "n": n,
                                  "str": sstr.encode("utf-8", "replace").decode("utf-8")})
                    v3_ok += 1
                except Exception:
                    fail += 1
    print("[+] variant-3 classes: %d" % len(v3files), file=sys.stderr)
    for path in files:
        try:
            txt = open(path, encoding="utf-8").read()
        except Exception:
            continue
        flat = re.sub(r"\s+", " ", txt)
        for pos, args in iter_calls(flat, "onWarmupCompleted"):
            if len(args) != 4:
                continue
            a1, a2, a3, a4 = args
            if not re.match(r"^[A-Za-z_$]", a4.strip()):
                continue
            if re.match(r"^(String|int|char|byte|long|float|double|boolean|Object|void)\b", a1.strip()):
                continue  # method definition, not a call
            # skip if any of the 3 args is just a variable name (not a constant expr)
            if all(re.fullmatch(r"[A-Za-z_$][\w$.]*", a.strip() or "x") for a in [a1, a2, a3]):
                continue  # variable references, not decoder call
            # method definition: "TypeName variableName" pattern (two identifiers)
            if re.match(r"^@?\w+[.@]?\s+\w+$", a1.strip()) and not re.search(r"[()+\-*/&|^<>=]", a1):
                continue  # type+var = method definition
            # bare identifier that's not a number/API call = variable ref or class name
            if re.fullmatch(r"[a-z]\w*", a1.strip()) and not re.search(r"\(\)", a1):
                continue  # lowercase identifier = variable/method ref
            if a1.strip().startswith("@"):
                continue  # annotation
            try:
                i = eval_expr(a1)
                n = eval_expr(a2)
                c = eval_expr(a3)
                if not (0 <= i < 3363 and 1 <= n <= 256 and abs(c) < 0x110000):
                    raise ValueError("range")
                if not re.fullmatch(r"[A-Za-z_$][\w$]*", a4.strip()):
                    raise ValueError("arg4")
                sstr = dexstr.tbl_decrypt(T, i, n, c & 0xFFFF)
                # auto-correct off-by-one eval errors: if garbage, try i±1
                def _pr(st):
                    return sum(1 for ch in st if 32 <= ord(ch) < 127) / max(1, len(st))
                if _pr(sstr) < 0.5:
                    best_s, best_i = sstr, i
                    for di in (-2, -1, 1, 2):
                        ti = i + di
                        if 0 <= ti and ti + n <= len(T):
                            cand = dexstr.tbl_decrypt(T, ti, n, c & 0xFFFF)
                            if _pr(cand) > _pr(best_s):
                                best_s, best_i = cand, ti
                    if _pr(best_s) > 0.5:
                        sstr, i = best_s, best_i  # corrected
                sites.append({"file": os.path.relpath(path, SRC), "kind": "tbl",
                              "i": i, "n": n, "c": c & 0xFFFF,
                              "str": sstr.encode("utf-8", "replace").decode("utf-8")})
                tbl_ok += 1
            except Exception:
                fail += 1
        pkeys = tea_keys_for(path)
        is_l7 = is_lambda7(path)
        is_l23 = is_lambda23(path)
        for pos, args in iter_calls(flat, "onNavigationEvent"):
            if len(args) != 3 or not args[0].strip().startswith('"'):
                continue
            try:
                lit = unjava(args[0].strip()[1:-1])
                n = eval_expr(args[1])
                if is_l23:
                    sstr = lambda23_decrypt(lit, n) or ""
                elif is_l7:
                    l7c = lambda7_xor_const(path)
                    sstr = lambda7_decrypt(lit, n, l7c) if l7c is not None else dexstr.tea_decrypt(lit, n)
                elif pkeys:
                    sstr = tea_decrypt_per_class(lit, n, pkeys)
                else:
                    sstr = dexstr.tea_decrypt(lit, n)
                sites.append({"file": os.path.relpath(path, SRC), "kind": "tea",
                              "n": n,
                              "str": sstr.encode("utf-8", "replace").decode("utf-8")})
                tea_ok += 1
            except Exception:
                fail += 1

    # quality flag + dedup identical (file,kind,args) sites
    seen = set()
    uniq = []
    for st in sites:
        printable = sum(1 for ch in st["str"] if 32 <= ord(ch) < 127) / max(1, len(st["str"]))
        st["printable_ratio"] = round(printable, 2)
        key = (st["file"], st["kind"], st.get("i"), st.get("n"), st.get("c"), st.get("b"), st["str"])
        if key in seen:
            continue
        seen.add(key)
        uniq.append(st)
    sites[:] = uniq
    hi = [st for st in sites if st["printable_ratio"] >= 0.7 and len(st["str"]) >= 2]
    print("[+] tbl=%d tea=%d v3=%d failed=%d | unique=%d high-conf=%d" %
          (tbl_ok, tea_ok, v3_ok, fail, len(sites), len(hi)), file=sys.stderr)
    tbl_ok, tea_ok, v3_ok = (sum(1 for x in hi if x["kind"] == k) for k in ("tbl", "tea", "v3"))
    with open(OUT + ".json", "w") as f:
        json.dump({"api_consts": API, "tbl_ok": tbl_ok, "tea_ok": tea_ok,
                   "failed": fail, "sites": sites}, f, indent=1, ensure_ascii=False)
    with open(OUT + ".txt", "w") as f:
        for s in sorted(sites, key=lambda x: -x["printable_ratio"]):
            f.write("[%.2f] %-4s %-48s %r\n" % (s["printable_ratio"], s["kind"], s["file"][:48], s["str"]))
    print("[+] final (unique, high-conf first): see artifacts", file=sys.stderr)
    print("[+] artifacts: %s.json/.txt" % OUT, file=sys.stderr)


if __name__ == "__main__":
    main()
