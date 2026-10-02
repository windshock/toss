#!/usr/bin/env python3
# decode_static.py — libea56 rw 레코드 정적 디코더 (§172 알고리즘 구현)
# 라운드(디스어셈 검증): v_new = ct_word - [ (v<<2)^(K1>>5) + (K1<<4)^(v>>3) + (v^K2) ]
#   K1 = rw 0x1747ba + idx*4 워드(제자리 자기참조), K2 = x19 표[(idx&~3)^x10] 워드(런타임 버퍼)
# 사용: decode_static.py <so파일> <k2덤프> [레코드오프셋] [길이]
#   k2덤프: 0x93aa0 문맥의 x8 표 256B (LKM copy_from_user 또는 frida-free 캡처 필요 — §172-추가6)
import struct, sys

M = 0xffffffff
def rol(v, n): return ((v << n) | (v >> (32 - n))) & M
def sxt32(v): return v

def round_fn(v, K1, K2):
    return (((rol(v, 2) ^ (K1 >> 5)) + ((rol(K1, 4)) ^ (v >> 3)) + (v ^ K2)) & M)

def decode_record(ct_bytes, k2_table, idx0, w10, v0, w9):
    """레코드 제자리 복호 재현 (역방향 체인, 4바이트 워드 단위).
    idx0: 시작 인덱스(0x1747ba 기준 워드 인덱스), v0: 시작 v, K2 표: 32비트 워드 리스트"""
    out = bytearray()
    idx = idx0
    v = v0 & M
    for i in range(len(ct_bytes) // 4):
        K1 = int.from_bytes(ct_bytes[idx*4:idx*4+4], 'little')  # 제자리: 암호문 워드가 키
        sel = ((idx & ~3) ^ w10) % (len(k2_table)//4) if k2_table else 0
        K2 = struct.unpack_from('<I', k2_table, sel*4)[0] if k2_table else 0
        R = round_fn(v, K1, K2)
        pt_word = (int.from_bytes(ct_bytes[idx*4:idx*4+4], 'little') - R) & M
        # 라이브 관측 순서: 높은 idx부터 저장 — 여기서는 순방향 인덱스로 출력
        out += pt_word.to_bytes(4, 'little')
        v = pt_word  # CBC 진행
        idx += 1
    return bytes(out)

if __name__ == '__main__':
    so = open(sys.argv[1], 'rb').read() if len(sys.argv) > 1 else b''
    k2 = open(sys.argv[2], 'rb').read() if len(sys.argv) > 2 else b''
    off = int(sys.argv[3], 0) if len(sys.argv) > 3 else 0x1747ba
    ln = int(sys.argv[4], 0) if len(sys.argv) > 4 else 22
    idx0 = (off - 0x1747ba) // 4
    rec = so[off:off+ln]
    # 4바이트 정렬 안내
    print(f"record @{off:#x} len={ln} — idx0={idx0}")
    pt = decode_record(rec + b'\x00'*(4-len(rec)%4), k2, idx0, 3, 0x020c222f, 0xa708a81e)
    print("decoded:", pt[:ln])
    print("ascii  :", ''.join(chr(b) if 32 <= b < 127 else '.' for b in pt[:ln]))
