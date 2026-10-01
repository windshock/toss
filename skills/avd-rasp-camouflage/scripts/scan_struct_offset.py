#!/usr/bin/env python3
# scan_struct_offset.py — 네이티브 lib에서 특정 구조체 오프셋 접근 명령 전수 스캔
# 용도: 토스 libea56 판정 누적기(ctx+0x1c8)처럼 "어느 필드에 누가 접근하는지" 지도 작성.
# 사용: scan_struct_offset.py <lib.so> <offset_hex> [--str]
#   예: scan_struct_offset.py libea56.so 1c8          # str/ldr x?,[x?,#0x1c8] 전부
# 출력: STR/LDR 주소 목록 — 각 주소 주변을 objdump/capstone으로 읽고 델타 소스를 추적.
# (7차 실측: 쓰기 4곳/읽기 45곳 → 체크 사이트 지도 = 판정 구조 복원의 첫 걸음)
import struct, sys

def main():
    path, off = sys.argv[1], int(sys.argv[2], 16)
    d = open(path, 'rb').read()
    strs, ldrs = [], []
    for k in range(len(d) // 4):
        w = struct.unpack_from('<I', d, k * 4)[0]
        top = w & 0xFFC00000
        imm = (w >> 10) & 0xFFF
        if imm * 8 != off and imm != off:  # 64-bit는 imm*8
            continue
        if top == 0xF9000000 and imm * 8 == off: strs.append(k * 4)
        elif top == 0xF9400000 and imm * 8 == off: ldrs.append(k * 4)
    print(f"STR [_,#{off:#x}]: {len(strs)} -> {[hex(x) for x in strs]}")
    print(f"LDR [_,#{off:#x}]: {len(ldrs)} -> {[hex(x) for x in ldrs]}")

if __name__ == '__main__':
    main()
