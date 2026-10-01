#!/usr/bin/env python3
# patch_dylib_gl_version32.py — GL_VERSION을 실기기 Adreno 포맷으로 (v3, 2026-09-21 4차 세션)
#
# 현재(v2 적용 후): "OpenGL ES 3.0 (4.1 V@0615.47)"  ← "(4.1" 잔여 + ES 3.0 (에뮬 최대치)
# 목표:            "OpenGL ES 3.2 V@0615.47"         ← 실기기 SM8550 포맷 접두와 일치
#
# 근거: 토스 가드가 dlopen("libEGL.so")→glGetString을 수백 회 반복(806회 실측)하며
# GL 문자열을 비교 — "3.0"/"(4.1" 잔여가 판정 입력 후보 1순위.
#
# 변경 4곳 (buildStrings 0x28d014, 전부 동일 길이/단일 바이트 — reserve 32 불변):
#   1) 0xa2b32a: 버전 테이블 엔트리 "OpenGL ES 3.0" → "OpenGL ES 3.2" ('0'→'2')
#      (arg4는 이 엔트리를 가리키는 std::string — 0x28d050 csel로 선택됨)
#   2) 0x8b4c59: 리터럴 " (4.1 V@0615.47"(15B) → " V@0615.47"(10B)+NUL 패딩
#   3) 0x28d210: mov w2, #15 → #10  (리터럴 append 길이)
#   4) 0x28d234: mov w2, #1 → #0    (")" append를 append(ptr,0) no-op로 —
#      tail-call 구조(0x28d24c b append) 보존, epilogue 무손상)
#
# ⚠️ 이전 단계: identity + version v2 + tokens 패치가 모두 적용된 dylib 위에서만 동작.
#    원본 바이트 검증, 멱등, codesign 자동.
import struct, subprocess, sys

NOP = struct.pack("<I", 0xD503201F)

TBL_OFF   = 0xa2b32a   # "OpenGL ES 3.0" 마지막 '0'
LIT_OFF   = 0x8b4c59   # 리터럴 본체
LEN_OFF   = 0x28d210   # mov w2, #0xf
PAREN_OFF = 0x28d234   # mov w2, #1  (")" append 길이)
OLD_LIT   = b" (4.1 V@0615.47"
NEW_LIT   = b" V@0615.47"

def main(src, out):
    data = bytearray(open(src, "rb").read())
    if data[LIT_OFF:LIT_OFF+len(NEW_LIT)] == NEW_LIT:
        print("[*] 이미 패치된 파일 — 멱등 통과")
    else:
        # 검증
        ctx = data[TBL_OFF-12:TBL_OFF+1]
        if ctx != b"OpenGL ES 3.0":
            sys.exit(f"0x{TBL_OFF:x} 컨텍스트 불일치: {ctx!r}")
        if data[LIT_OFF:LIT_OFF+len(OLD_LIT)] != OLD_LIT:
            sys.exit(f"0x{LIT_OFF:x} 리터럴 불일치: {data[LIT_OFF:LIT_OFF+16]!r}")
        w_len = struct.unpack_from("<I", data, LEN_OFF)[0]
        if w_len != 0x52800000 | (15 << 5) | 2:
            sys.exit(f"0x{LEN_OFF:x} = 0x{w_len:08x} (예상 mov w2,#15)")
        w_p = struct.unpack_from("<I", data, PAREN_OFF)[0]
        if w_p != 0x52800000 | (1 << 5) | 2:
            sys.exit(f"0x{PAREN_OFF:x} = 0x{w_p:08x} (예상 mov w2,#1)")

        # 패치
        data[TBL_OFF] = ord('2')
        data[LIT_OFF:LIT_OFF+len(OLD_LIT)] = NEW_LIT + b"\0" * (len(OLD_LIT) - len(NEW_LIT))
        struct.pack_into("<I", data, LEN_OFF, 0x52800000 | (10 << 5) | 2)
        struct.pack_into("<I", data, PAREN_OFF, 0x52800000 | (0 << 5) | 2)

    open(out, "wb").write(data)
    subprocess.run(["codesign", "--force", "--sign", "-", out], check=True,
                   capture_output=True)
    print(f"[완료] {out} — GL_VERSION = 'OpenGL ES 3.2 V@0615.47' 예상. 배치 후 재기동.")

if __name__ == "__main__":
    if len(sys.argv) != 3:
        sys.exit(__doc__)
    main(sys.argv[1], sys.argv[2])
