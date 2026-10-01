#!/usr/bin/env python3
# patch_dylib_glesmax_skip.py — 확장 리스트에서 gles_max 토큰 emit만 스킵 (v4, 2026-09-21 5차 세션)
#
# 근거: 앱 가시 GL_EXTENSIONS에 남은 마지막 ANDROID_EMU 문자열 =
#   ANDROID_EMU_gles_max_version_3_0 (dumpsys 실측). 가드가 GL 확장을 806회 dlopen
#   루프로 읽는 것이 실측 — 확장 기반 판정을 전부 통과시키기 위해 제거.
#
# 3차 세션 v3b(문자열 rename)는 부팅 hang — gles_max 문자열이 호스트 내부 기능키로도
# 쓰이기 때문. 본 패치는 **문자열을 보존한 채 emit만 스킵**: rcGetGLString의
# gles_max append 블록(0x3ea50..0x3ea8f, 16슬롯)을 NOP.
#   0x3ea50-0x3ea74: adrp/add ×3 + cmp/csel ×2 (_2/_3_0/_3_1 선택)
#   0x3ea78-0x3ea8c: append(token) + append(구분자) 2콜
# 이전 블록(0x3ea4c bl)에서 0x3ea90(mov w8,#0x1f02)으로 흐름 연결.
#
# 부작용: 게스트 libEGL이 gles_max 토큰 파싱 실패 → 게스트 GLES3 비활성(ES2 폴백).
# GL_VERSION 표기는 호스트 buildStrings 산출이라 "3.0" 유지.
# ⚠️ identity + version v2 + version32 + tokens 패치 적용본 위에서만 동작. 멱등.
import struct, subprocess, sys

NOP = struct.pack("<I", 0xD503201F)
BLOCK_OFF = 0x3EA50
BLOCK_LEN = 0x40  # 16 instructions

def main(src, out):
    data = bytearray(open(src, "rb").read())
    cur = bytes(data[BLOCK_OFF:BLOCK_OFF + BLOCK_LEN])
    if cur == NOP * 16:
        print("[*] 이미 패치된 파일 — 멱등 통과")
    else:
        # 원본 블록 검증: 첫 명령 adrp x8(0x8a3000), add #0x2dc, adrp x9, add #0x2fb
        w = struct.unpack_from("<4I", data, BLOCK_OFF)
        if (w[0] & 0x9F000000) != 0x90000000 or (w[1] & 0xFFC00000) != 0x91000000 \
           or ((w[1] >> 10) & 0xFFF) != 0x2DC:
            sys.exit(f"0x{BLOCK_OFF:x} 시그니처 불일치: {[hex(x) for x in w]} — 버전 재확인")
        for i in range(16):
            data[BLOCK_OFF + i * 4: BLOCK_OFF + i * 4 + 4] = NOP

    open(out, "wb").write(data)
    subprocess.run(["codesign", "--force", "--sign", "-", out], check=True,
                   capture_output=True)
    print(f"[완료] {out} — GL_EXTENSIONS에서 gles_max 토큰 소멸 예상. 배치 후 재기동.")

if __name__ == "__main__":
    if len(sys.argv) != 3:
        sys.exit(__doc__)
    main(sys.argv[1], sys.argv[2])
