#!/usr/bin/env python3
# scan_adrp_add.py — ARM64 바이너리에서 adrp+add 쌍이 계산하는 전역 주소 참조 전수 스캔
# 용도: OLLVM lib의 구조체 필드/전역변수 접근 지도 작성 (토스 libea56 판정 상태머신 해독에 사용).
# 사용: scan_adrp_add.py <lib.so> <target_addr_hex> [target2_hex ...]
#   예: scan_adrp_add.py libea56.so 185758 19e5e8 1821a0
# 출력: 각 타깃 주소를 참조하는 (adrp주소, add주소) 쌍 — 주변 디스어셈블로 접근 의미 분석.
# 주의: 레지스터별 마지막 adrp만 추적하는 근사 — 최고빈도 패턴엔 정확, 드문 패턴은
#       누락 가능. 토스 libea56 .text는 VA==파일오프셋.
import struct, sys

def main():
    path = sys.argv[1]
    targets = set(int(t, 16) for t in sys.argv[2:])
    d = open(path, 'rb').read()
    n = len(d) // 4
    adrp_last = {}
    found = {}
    for k in range(n):
        w = struct.unpack_from('<I', d, k * 4)[0]
        addr = k * 4
        if (w & 0x9F000000) == 0x90000000:
            rd = w & 0x1F
            immlo = (w >> 29) & 3
            immhi = (w >> 5) & 0x7FFFF
            imm = ((immhi << 2) | immlo) << 12
            if imm & (1 << 32): imm -= 1 << 33
            adrp_last[rd] = (((addr) & ~0xFFF) + imm, addr)
        elif (w & 0xFFC00000) == 0x91000000:
            imm12 = (w >> 10) & 0xFFF
            rn = (w >> 5) & 0x1F
            if rn in adrp_last:
                tgt = adrp_last[rn][0] + imm12
                if tgt in targets:
                    found.setdefault(tgt, []).append((adrp_last[rn][1], addr))
    for t in sorted(found):
        print(hex(t), "->", [(hex(a), hex(b)) for a, b in found[t]])
    for t in sorted(targets - set(found)):
        print(hex(t), "-> (no adrp+add ref found)")

if __name__ == '__main__':
    main()
