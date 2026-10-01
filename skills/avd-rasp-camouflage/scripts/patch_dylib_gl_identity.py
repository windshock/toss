#!/usr/bin/env python3
# patch_dylib_gl_identity.py — 호스트 libgfxstream_backend.dylib GL 신원 패치
#
# 에뮬레이터(arm64 macOS)가 앱에 보내는 GL 문자열을 사칭 SoC의 실제 값으로 교체한다.
# GLEScontext::buildStrings(0x28d014)가 "정적 prefix + 호스트 동적값(Apple/GPU명) + )"
# 를 조립하는 구조 → 동적 append 6곳을 NOP하고 정적 문자열을 동일 길이 교체.
#
#   GL_VENDOR   "Google (Apple)"                     → "Qualcomm"
#   GL_RENDERER "...Translator (Apple M1 Pro)"       → "Adreno (TM) 740"
#   GL_VERSION  유지 (version 조립부 제자리 패치는 gfxstream 초기화 크래시 — 실측 2회)
#
# 검증: SurfaceFlinger의 "GLES:" 라인. 부팅 정상 + 앱 GL 정상(모니모 120초+ 실측).
#
# ⚠️ 오프셋/명령어는 emulator 36.5.1 (arm64) 기준. 스크립트가 패치 전 원본 바이트를
#    검증하고 다르면 중단하니, 에뮬레이터 버전이 바뀌면 objdump로 재확인할 것.
# ⚠️ 패치 후 에뮬 최초 비정상 크래시 시 crash-report 다이얼로그가 이후 부팅을 막는다
#    → rm -rf /tmp/android-1004276/emu-crash-36.5.1.db + qemu/crashpad 프로세스 정리.
#
# 사용: python3 patch_dylib_gl_identity.py <src.dylib> <out.dylib>
#       src는 무결성 백업(원본 혹은 mali-g78 1차 패치본 모두 지원 — 멱등). out은
#       자동으로 codesign --force --sign - (ad-hoc) 처리된다.
import struct, subprocess, sys

NOP = struct.pack("<I", 0xD503201F)

# (오프셋, 명령 수, 검증용 첫 워드) — 패치 전 원본 명령어가 맞는지 확인용
VENDOR_NOPS  = [(0x28d0f8, 3, 0x91002741), (0x28d118, 4, 0xaa1903e0), (0x28d128, 5, 0xf0003121)]
RENDER_NOPS  = [(0x28d168, 3, 0x9100a301), (0x28d188, 4, 0xaa1703e0), (0x28d198, 5, 0xf0003121)]
VENDOR_STR   = b"Qualcomm"                                    # 8바이트 — "Google (" 자리
RENDERER_STR = b"Adreno (TM) 740"                             # 15바이트, 39바이트 버퍼에 NUL 패딩
RENDERER_OLD = [b"Android Emulator OpenGL ES Translator (",   # pristine
                b"Android Mali-G78 OpenGL ES Translator ("]   # 1차 패치본

def main(src, out):
    data = bytearray(open(src, "rb").read())

    # 1) renderer 정적 문자열 위치를 동적 탐색 (버전에 따라 오프셋 이동 대응)
    roff = None
    for old in RENDERER_OLD:
        i = data.find(old + b"\0")
        if i >= 0:
            roff = i
            break
    if roff is None:
        if data.find(RENDERER_STR + b"\0") >= 0:
            print("[*] 이미 패치된 파일 — 멱등 통과")
        else:
            sys.exit("renderer 정적 문자열을 못 찾음 — 미지원 에뮬레이터 버전")
    else:
        voff = data.find(b"Google (\0")
        if not (0 <= voff and 0 < roff - voff <= 16):
            sys.exit(f"vendor/renderer 문자열 배치가 예상과 다름: vendor=0x{voff:x} renderer=0x{roff:x}")

        # 2) NOP 사이트의 원본 명령어 검증 (다른 버전이면 여기서 중단)
        for site in VENDOR_NOPS + RENDER_NOPS:
            off, n, first = site
            w = struct.unpack_from("<I", data, off)[0]
            if w != first and w != 0xD503201F:  # 이미 NOP면 멱등 통과
                sys.exit(f"0x{off:x} 명령어 불일치: 0x{w:08x} (예상 0x{first:08x}) — 버전 재확인 필요")

        # 3) 패치
        for off, n, _ in VENDOR_NOPS + RENDER_NOPS:
            for i in range(n):
                data[off + i*4 : off + i*4 + 4] = NOP
        data[voff : voff + 8] = VENDOR_STR
        data[roff : roff + 39] = RENDERER_STR + b"\0" * (39 - len(RENDERER_STR))

    open(out, "wb").write(data)
    subprocess.run(["codesign", "--force", "--sign", "-", out], check=True,
                   capture_output=True)
    print(f"[완료] {out} — 배치 후 부팅해 dumpsys SurfaceFlinger | grep GLES 로 검증")

if __name__ == "__main__":
    if len(sys.argv) != 3:
        sys.exit(__doc__)
    main(sys.argv[1], sys.argv[2])
