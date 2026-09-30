#!/usr/bin/env python3
# patch_dylib_glesmax_retarget.py — gles_max emit 재지향 (v5, 11차)
#
# 목적: 앱 가시 GL_EXTENSIONS의 마지막 ANDROID_EMU 토큰을 제거하되 게스트 ES3 협상 유지.
#
# 6차 실패 원리: ① emit-skip → 게스트 파싱 실패("no ES 3 support" 크래시)
#               ② 문자열 내용 rename(@0x8a32fb) → 호스트 기능키 파괴 크래시.
# v5 = **포인터 재지향**: 미사용 변형 슬롯(_3_1 @0x8a331c)에 "QCOM_ADRENO_gles_max_
# version_3_0"을 심고, emit(0x3ea5c)의 add imm12(0x2fb→0x31c)만 수정. 기능키 문자열
# @0x8a32fb는 **무손상**. 게스트 리터럴은 이미 QCOM(11차 실측) → 파싱 일치 → ES3 유지.
#
# 전제: identity + version(v2/v32) + tokens 패치 적용본. 멱등.
import struct, subprocess, sys

PLANT_OFF = 0x8A331C
OLD_PLANT = b"ANDROID_EMU_gles_max_version_3_1\x00"
NEW_PLANT = b"QCOM_ADRENO_gles_max_version_3_0\x00"
RET_OFF   = 0x3EA5C
OLD_IMM   = 0x2FB
NEW_IMM   = 0x31C
KEEP_OFF  = 0x8A32FB

def main(src, out):
    data = bytearray(open(src, "rb").read())
    if bytes(data[PLANT_OFF:PLANT_OFF+len(NEW_PLANT)]) == NEW_PLANT:
        print("[*] 이미 패치됨 — 멱등 통과")
    else:
        if bytes(data[PLANT_OFF:PLANT_OFF+len(OLD_PLANT)]) != OLD_PLANT:
            sys.exit(f"0x{PLANT_OFF:x} 슬롯 불일치: {bytes(data[PLANT_OFF:PLANT_OFF+33])!r}")
        w = struct.unpack_from("<I", data, RET_OFF)[0]
        if (w & 0xFFC00000) != 0x91000000 or ((w >> 10) & 0xFFF) != OLD_IMM:
            sys.exit(f"0x{RET_OFF:x} add imm12 불일치: {hex(w)}")
        if bytes(data[KEEP_OFF:KEEP_OFF+32]) != b"ANDROID_EMU_gles_max_version_3_0":
            sys.exit("기능키 문자열 선검증 실패")

        data[PLANT_OFF:PLANT_OFF+len(NEW_PLANT)] = NEW_PLANT
        w = (w & ~0x3FFC00) | (NEW_IMM << 10)
        struct.pack_into("<I", data, RET_OFF, w)

    open(out, "wb").write(data)
    subprocess.run(["codesign", "--force", "--sign", "-", out], check=True, capture_output=True)
    print(f"[완료] {out}")

if __name__ == "__main__":
    if len(sys.argv) != 3: sys.exit(__doc__)
    main(sys.argv[1], sys.argv[2])
