#!/usr/bin/env python3
# decode_static2.py — libea56 rw 레코드 순수 정적 디코더 (§178 확정 알고리즘)
#
# ★ 완전 해독된 복호 알고리즘 (디스어셈 0x938d0 루프 + 0x90c30 에필로그 + once-함수 0x441a4 SWAR 전검증):
#   레코드 = [06][len][ct]  (ct = base+2, 워드 그리드 base+2+idx*4)
#   K2 표   = {0xd80c2121, 0, 0, 0}   (코드 상수: 0x9365c / 0x442d4 — 힙이 아니라 스택/지역에 매 레코드 재구축)
#   시드    : x9_0 = 0xa708a81e = -14*0x61c88647 (mod 2^32) → 정확히 14패스 후 x9=0으로 종료
#   패스 p (x9 = x9_0 + p*δ), x10 = (x9>>2)&3, v = W(0):
#     for idx = floor(len/4) .. 1:            # 역방향 워드 워크
#       K1 = W(idx-1)                          # 아직 암호문인 바로 아래 워드 (자기참조 키)
#       S1 = ((v<<2)^(K1>>5)) + ((K1<<4)^(v>>3))
#       S2 = (v ^ x9) + (K1 ^ tbl[(idx&3)^x10])
#       W(idx) = W(idx) - (S1 ^ S2);  v = W(idx)
#     에필로그(idx=0): K1 = W(n-1) (방금 복호된 마지막 워드 — 체인 순환), K2 = tbl[x10]
#       W(0) = W(0) - (S1 ^ S2)
#   14패스 후 결과 = 평문. (1패스 후 값 = §175 트리프와이어 캡처의 x11=0x020c222f — 당시 '불일치'의 정체)
#
# 사용: decode_static2.py <so파일> <레코드오프셋> [라이브rw.bin (검증용)]
#   레코드 오프셋 = [06] 헤더 위치 (libea56 vaddr == 파일 오프셋)
import struct, sys

M = 0xFFFFFFFF
DELTA = 0x61C88647
X9_0 = 0xA708A81E          # = (-14 * DELTA) mod 2^32 — 14패스 설계
K2_TABLE = (0xD80C2121, 0, 0, 0)
NPASS = 14

def _round(v, K1, K2, x9, ct):
    S1 = ((((v << 2) & M) ^ (K1 >> 5)) + (((K1 << 4) & M) ^ (v >> 3))) & M
    S2 = ((v ^ x9) + (K1 ^ K2)) & M
    return (ct - (S1 ^ S2)) & M

def decrypt_words(words):
    """레코드 ct 워드 리스트(마지막 부분워드는 파일 뒤 바이트로 패딩) → 평문 바이트"""
    w = list(words)
    n = len(w)
    x9 = X9_0
    for _ in range(NPASS):
        x10 = (x9 >> 2) & 3
        v = w[0]
        for idx in range(n - 1, 0, -1):
            v = _round(v, w[idx - 1], K2_TABLE[(idx & 3) ^ x10], x9, w[idx])
            w[idx] = v
        w[0] = _round(v, w[n - 1], K2_TABLE[x10], x9, w[0])
        x9 = (x9 + DELTA) & M
    assert x9 == 0, "seed/pass 불일치"
    return b''.join(x.to_bytes(4, 'little') for x in w)

def decode_record(so_bytes, off, live=None):
    """off = [06] 헤더. 반환 (plaintext[:len], match_ratio)"""
    assert so_bytes[off] == 6, f"not a type-06 record @ {off:#x}"
    ln = so_bytes[off + 1]
    pad = (-ln) % 4
    blob = so_bytes[off + 2: off + 2 + ln + pad]   # 마지막 부분워드 패딩 = 파일 뒤 바이트(디바이스와 동일)
    words = [int.from_bytes(blob[i:i+4], 'little') for i in range(0, len(blob), 4)]
    pt = decrypt_words(words)[:ln]
    ratio = None
    if live is not None:
        lpt = live[off + 2 - 0x174000: off + 2 + ln - 0x174000] if off >= 0x174000 else live[off+2:off+2+ln]
        ratio = sum(1 for a, b in zip(pt, lpt) if a == b) / ln
    return pt, ratio

if __name__ == '__main__':
    so = open(sys.argv[1], 'rb').read()
    off = int(sys.argv[2], 0)
    live = open(sys.argv[3], 'rb').read() if len(sys.argv) > 3 else None
    pt, ratio = decode_record(so, off, live)
    print(f"record @{off:#x} len={so[off+1]}")
    print("plaintext:", pt)
    if ratio is not None:
        print(f"live byte-match: {ratio*100:.1f}%")
        print("*** VERIFIED ***" if ratio == 1.0 else "(mismatch — 다른 패밀리 파라미터일 가능통)")
