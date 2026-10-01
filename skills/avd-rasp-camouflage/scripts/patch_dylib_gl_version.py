#!/usr/bin/env python3
# patch_dylib_gl_version.py — libgfxstream_backend.dylib GL_VERSION 정적화 패치 (v2, 올바른 설계)
#
# GLEScontext::buildStrings(0x28d014)의 version 블록: version = arg4 + " (" + arg5 + ")"
#   arg4 = "OpenGL ES 3.0" (정상) — 유지
#   arg5 = 호스트 네이티브 컨텍스트 버전 "4.1 Metal - 88.1" (런타임 조립 — ANGLE Metal 유래)
#
# 1차 시도(2026-09-20)가 크래시한 원인: 0x28d1e4의 reserve 계산 블록(add x8,x22,x23 /
# add x1,x8,#3 / bl reserve)을 NOP → std::string 용량 산정 붕괴 → append 힙 붕괴.
#
# v2 설계 (2026-09-21): reserve 블록은 그대로 두고,
#   - " (" append 블록(28d204~)의 대상을 0x8b4c54(" (")에서 0x8b4c59("NVIDIA (Vendor
#     0x10de)" — macOS 호스트에서 미참조 Linux GPU 탐지 문자열)로 돌리고 길이를
#     2→15로 늘려 " (4.1 V@0615.47"을 출력. 문자열 본체는 같은 오프셋에 기록.
#     총 append(13+15+1=29) ≤ reserve(13+16+3=32) — 재할당 없음.
#   - arg5 append 블록(28d218~28d224, mov x1/x2 포함 4슬롯)을 NOP — 동적 Metal 유입 차단.
#   결과: GL_VERSION = "OpenGL ES 3.0 (4.1 V@0615.47)" — Adreno 드라이버 서식, Apple 흔적 0.
#
# ⚠️ 이전 단계: patch_dylib_gl_identity.py 적용본(vendor/renderer 패치 완료) 위에서만 동작.
#    원본 바이트 검증 후 패치, 멱등, codesign --force --sign - 자동.
import struct, subprocess, sys

NOP = struct.pack("<I", 0xD503201F)

ADD_IMM_OFF   = 0x28d208   # add x1, x1, #0xc54  → #0xc59 (c54→c59, imm12 += 5)
MOV_W2_OFF    = 0x28d210   # mov w2, #2          → mov w2, #15
ARG5_NOP_OFF  = 0x28d218   # mov x0/x1/x2 + bl append 4슬롯 → NOP
ARG5_NOP_LEN  = 4
STR_OFF       = 0x8b4c59   # "NVIDIA (Vendor 0x10de)\0" (23B) → " (4.1 V@0615.47\0" + NUL 패딩
NEW_STR       = b" (4.1 V@0615.47"
OLD_STR       = b"NVIDIA (Vendor 0x10de"

def main(src, out):
    data = bytearray(open(src, "rb").read())

    if data.find(NEW_STR + b"\0") == STR_OFF:
        print("[*] 이미 패치된 파일 — 멱등 통과")
    else:
        # 1) 원본 바이트 검증
        w_add = struct.unpack_from("<I", data, ADD_IMM_OFF)[0]
        # add x1,x1,#imm12: 0x91000000 | imm12<<10 | rn<<5 | rd — imm12 차분만 적용하는지 확인
        imm12 = (w_add >> 10) & 0xFFF
        if imm12 != 0xC54:
            sys.exit(f"0x{ADD_IMM_OFF:x} imm12=0x{imm12:x} (예상 0xc54) — 버전 재확인 필요")
        w_mov = struct.unpack_from("<I", data, MOV_W2_OFF)[0]
        if w_mov != 0x52800042:  # mov w2, #2
            sys.exit(f"0x{MOV_W2_OFF:x} = 0x{w_mov:08x} (예상 mov w2,#2) — 버전 재확인 필요")
        cur = data[STR_OFF:STR_OFF + len(OLD_STR)]
        if cur != OLD_STR:
            sys.exit(f"0x{STR_OFF:x} 문자열 불일치: {cur!r}")

        # 2) 패치
        struct.pack_into("<I", data, ADD_IMM_OFF, w_add + (5 << 10))       # imm12 += 5
        struct.pack_into("<I", data, MOV_W2_OFF, 0x52800000 | (15 << 5) | 2)
        for i in range(ARG5_NOP_LEN):
            data[ARG5_NOP_OFF + i*4 : ARG5_NOP_OFF + i*4 + 4] = NOP
        data[STR_OFF : STR_OFF + 23] = NEW_STR + b"\0" * (23 - len(NEW_STR))

    open(out, "wb").write(data)
    subprocess.run(["codesign", "--force", "--sign", "-", out], check=True,
                   capture_output=True)
    print(f"[완료] {out} — 배치 후 부팅, dumpsys SurfaceFlinger | grep GLES 검증")

if __name__ == "__main__":
    if len(sys.argv) != 3:
        sys.exit(__doc__)
    main(sys.argv[1], sys.argv[2])
