#!/usr/bin/env python3
"""dexstr.py — OFFLINE DexGuard string decryptor for the toss hidden DEX.

Everything needed is STATIC (§110):
  - string table: the literal in o.ContentDataSourceContentDataSourceException
    .onExtraCallback(): "<3363-char literal>".getBytes("ISO-8859-1")
    .asCharBuffer()  (ByteBuffer default = BIG-ENDIAN char pairing)
  - readTypedObject = -5808991110529471058 (hardcoded)
  - TEA keys (hardcoded in IAuthTabCallback()):
      writeTypedObject=17098, onActivityResized=38243, extraCallback=2430,
      ICustomTabsCallback=27593
  - decoders (decompiled):
      tbl(i, n, c): out[k] = rotl16(T[i+k],13) ^ ((k * rotl64(R,45)) & 0xFFFF) ^ c
                    (Java: jArr[k] = (((i7<<13)|(i7>>>3)) ^ (i6*((j<<45)|(j>>>19)))) ^ c  — NOTE the i6* multiplies the FULL long then chars truncate)
      tea(s): 16-round char-pair cipher, delta 58224 decreasing 40503 per round,
              keys = (char)(K - 3974139103868117988L) per key char
Usage:
  python3 dexstr.py tbl <i> <n> <c>
  python3 dexstr.py tea <java-escaped-string> <n>
  python3 dexstr.py selftest      (validates on known call-site constants)
"""
import re
import sys
import codecs

SRC = ("/tmp/jadx_hidden/sources/o/"
       "ContentDataSourceContentDataSourceException.java")
R_LONG = -5808991110529471058
KEYS = dict(writeTypedObject=17098, onActivityResized=38243,
            extraCallback=2430, ICustomTabsCallback=27593)


def _unesc(s):
    out = []
    i = 0
    while i < len(s):
        if s[i] == "\\" and i + 1 < len(s):
            c = s[i + 1]
            if c == "u":
                out.append(chr(int(s[i + 2:i + 6], 16)))
                i += 6
                continue
            mp = {"n": "\n", "r": "\r", "t": "\t", "b": "\b", "f": "\f",
                  '"': '"', "'": "'", "\\": "\\", "0": "\0"}
            out.append(mp.get(c, c))
            i += 2
        else:
            out.append(s[i])
            i += 1
    return "".join(out)


def load_table():
    txt = open(SRC, encoding="utf-8").read()
    m = re.search(r'ByteBuffer\.wrap\("((?:[^"\\]|\\.)*)"\.getBytes\("ISO-8859-1"\)\)', txt)
    if not m:
        raise SystemExit("literal not found")
    lit = _unesc(m.group(1))
    raw = lit.encode("latin-1", "replace")          # chars <=0xFF per jadx output
    if len(raw) < 3363 * 2:
        raise SystemExit("literal too short: %d bytes" % len(raw))
    return [int.from_bytes(raw[2 * i:2 * i + 2], "big") for i in range(3363)]


def s64(x):
    x &= (1 << 64) - 1
    return x - (1 << 64) if x >> 63 else x


def rotl64(x, n):
    x &= (1 << 64) - 1
    return ((x << n) | (x >> (64 - n))) & ((1 << 64) - 1)


def tbl_decrypt(T, i, n, c):
    jrot = rotl64(s64(R_LONG) & ((1 << 64) - 1), 45)
    out = []
    for k in range(n):
        i7 = T[i + k] & 0xFFFF
        rot = ((i7 << 13) | (i7 >> 3)) & 0xFFFF
        v = s64((rot ^ s64(k * jrot)) & 0xFFFFFFFFFFFFFFFF) ^ c
        out.append(chr(v & 0xFFFF))
    return "".join(out)


def tea_decrypt(s, n):
    k = {name: KEYS[name] for name in KEYS}
    def ch(name):
        return (k[name] - 3974139103868117988) & 0xFFFF
    kw, ko, ke, ki = ch("writeTypedObject"), ch("onActivityResized"), ch("extraCallback"), ch("ICustomTabsCallback")
    ca = [ord(x) & 0xFFFF for x in s]
    out = [0] * len(ca)
    p = 0
    while p < len(ca):
        c0, c1 = ca[p], ca[p + 1] if p + 1 < len(ca) else 0
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


def main():
    T = load_table()
    print("[+] table loaded: %d chars" % len(T), file=sys.stderr)
    cmd = sys.argv[1] if len(sys.argv) > 1 else "selftest"
    if cmd == "tbl":
        i, n, c = int(sys.argv[2]), int(sys.argv[3]), int(sys.argv[4], 0)
        print(tbl_decrypt(T, i, n, c))
    elif cmd == "tea":
        print(tea_decrypt(sys.argv[2], int(sys.argv[3])))
    elif cmd == "selftest":
        # known call sites (constants resolved from Android APIs):
        #   (165 - getBitsPerPixel(0)=0, indexOf("","")+16 = 0+16, makeMeasureSpec(0,0)=0)
        #   (71 - (300>>16)=71, getMode(0)+5 = 5, (char)((byte)0xFFFF + 31138) = 31137)
        for (i, n, c) in [(165, 16, 0), (71, 5, 31137)]:
            print("tbl(%d,%d,%d) = %r" % (i, n, c, tbl_decrypt(T, i, n, c)))
        # cinit: onWarmupCompleted(165-0, 16, 0) fed Class.forName -> expect a class name
        # also sweep: print all plausible windows around known offsets
        for i in range(0, 120, 7):
            s = tbl_decrypt(T, i, 8, 0)
            printable = sum(1 for x in s if 32 <= ord(x) < 127)
            if printable >= 7:
                print("sweep i=%d: %r" % (i, tbl_decrypt(T, i, 12, 0)))


if __name__ == "__main__":
    main()
