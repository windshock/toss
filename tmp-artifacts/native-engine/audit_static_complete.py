#!/usr/bin/env python3
# audit_static_complete.py — §186 정적 해독 완결성 감사
# 목적: "정적 난독화 해제 누락 지점이 더 있는가?"를 독립적으로 검증.
#  1) rw 세그먼트 전체에서 [06][len][ct] 레코드 후보 전수 스윕 → §178 알고리즘으로 복호 시도
#     → 인쇄가능 평문으로 성공하는 레코드 = 미계정 레코드 후보 (전부 이미 계정되어야 함:
#     0x1747b8 /proc/self/cmdline 1건 + JNI blob 내 위양성)
#  2) rw 세그먼트 엔트로피 지도 → 고엔트로피 영역이 전부 계정 영역(레코드풀/JNI blob/키/리로크)
#     에 귀속되는지 확인 — 잔여 고엔트로피 = 미해독 암호데이터 후보
import struct, sys, json, math

SO = sys.argv[1] if len(sys.argv) > 1 else 'libea56_live.so'
so = open(SO, 'rb').read()

M = 0xFFFFFFFF
DELTA = 0x61C88647
X9_0 = 0xA708A81E
K2_TABLE = (0xD80C2121, 0, 0, 0)
NPASS = 14

def decrypt_words(words):
    w = list(words); n = len(w); x9 = X9_0
    for _ in range(NPASS):
        x10 = (x9 >> 2) & 3
        v = w[0]
        for idx in range(n - 1, 0, -1):
            K1 = w[idx-1]; K2 = K2_TABLE[(idx & 3) ^ x10]
            S1 = ((((v << 2) & M) ^ (K1 >> 5)) + (((K1 << 4) & M) ^ (v >> 3))) & M
            S2 = ((v ^ x9) + (K1 ^ K2)) & M
            v = (w[idx] - (S1 ^ S2)) & M
            w[idx] = v
        K1 = w[n-1]; K2 = K2_TABLE[x10]
        S1 = ((((v << 2) & M) ^ (K1 >> 5)) + (((K1 << 4) & M) ^ (v >> 3))) & M
        S2 = ((v ^ x9) + (K1 ^ K2)) & M
        w[0] = (w[0] - (S1 ^ S2)) & M
        x9 = (x9 + DELTA) & M
    assert x9 == 0
    return b''.join(x.to_bytes(4, 'little') for x in w)

def printable_ratio(b):
    if not b: return 0
    ok = sum(1 for c in b if 0x20 <= c < 0x7f or c in (9, 10, 13))
    return ok / len(b)

# ── ELF 세그먼트 ──
e_phoff = struct.unpack_from('<Q', so, 0x20)[0]
e_phentsize = struct.unpack_from('<H', so, 0x36)[0]
e_phnum = struct.unpack_from('<H', so, 0x38)[0]
segs = []
for i in range(e_phnum):
    o = e_phoff + i * e_phentsize
    p_type, p_flags, p_off, p_vaddr, _, p_filesz, p_memsz, _ = struct.unpack_from('<IIQQQQQQ', so, o)
    if p_type == 1:
        segs.append((p_off, p_vaddr, p_filesz, p_flags))
rw = [s for s in segs if s[3] & 2 and s[2] > 0x1000]
print("RW segments:", [(hex(a), hex(b), hex(c)) for a, b, c, _ in rw])

# ── 1) [06] 레코드 전수 스윕 ──
print("\n=== [06] record sweep (rw filesz 영역) ===")
found = []
for base, vaddr, filesz, _ in rw:
    for off in range(base, base + filesz - 3):
        if so[off] != 6: continue
        ln = so[off + 1]
        if ln < 4 or ln > 220: continue
        pad = (-ln) % 4
        blob = so[off + 2: off + 2 + ln + pad]
        if len(blob) < 4 or len(blob) % 4: continue
        words = [int.from_bytes(blob[i:i+4], 'little') for i in range(0, len(blob), 4)]
        try:
            pt = decrypt_words(words)[:ln]
        except AssertionError:
            continue
        r = printable_ratio(pt)
        if r >= 0.9:
            found.append((off, ln, r, pt))
print(f"인쇄가능 복호 성공 레코드: {len(found)}건")
for off, ln, r, pt in found:
    print(f"  @{off:#x} len={ln} pr={r:.2f} pt={pt[:80]!r}")

# ── 2) 엔트로피 지도 ──
print("\n=== entropy map (rw, 256B 창, >5.2 비트/바이트만 표시) ===")
def H(b):
    if not b: return 0
    cnt = [0]*256
    for c in b: cnt[c] += 1
    n = len(b)
    return -sum((c/n)*math.log2(c/n) for c in cnt if c)

# 계정 영역 (vaddr): 레코드풀 0x1747a0-0x174a00, JNI blob 0x184110-0x185770, 키/글로벌 0x1747b0±,
# 2D 디스패치 0x17c1e0..0x17c1e0+0x960*rows (reloc 포인터 — 파일에선 0)
ACCT = [(0x174700, 0x174a80), (0x17c1e0, 0x185770)]
# (0x17c1e0~0x185770 통짜로 잡음 — 디스패치 테이블+rw데이터+JNI blob 연속대)
def accounted(va):
    return any(a <= va < b for a, b in ACCT)

for base, vaddr, filesz, _ in rw:
    step = 256
    regions = []
    cur = None
    for p in range(0, filesz - step, step):
        h = H(so[base+p: base+p+step])
        if h > 5.2:
            va = vaddr + p
            if cur is None: cur = [va, va+step]
            else: cur[1] = va + step
        else:
            if cur: regions.append(tuple(cur)); cur = None
    if cur: regions.append(tuple(cur))
    for a, b in regions:
        tag = "ACCOUNTED" if accounted(a) or accounted(b-1) else "*** UNACCOUNTED ***"
        print(f"  vaddr {a:#x}-{b:#x} ({b-a:#x}B) {tag}")

# ── 3) 알려진 레코드 검증 (0x1747b8 /proc/self/cmdline) ──
print("\n=== known record check @0x1747b8 ===")
off = 0x1747b8
ln = so[off+1]
blob = so[off+2: off+2+ln+(((-ln)%4))]
words = [int.from_bytes(blob[i:i+4], 'little') for i in range(0, len(blob), 4)]
pt = decrypt_words(words)[:ln]
print(f"  len={ln} pt={pt!r} printable={printable_ratio(pt):.2f}")
