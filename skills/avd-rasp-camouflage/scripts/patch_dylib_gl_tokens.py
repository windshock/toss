#!/usr/bin/env python3
# patch_dylib_gl_tokens.py — libgfxstream_backend.dylib ANDROID_EMU_* 프로토콜 토큰 리네임
#
# rcGetGLString(GL_EXTENSIONS)이 앱에 보내는 확장 리스트의 ANDROID_EMU_* 토큰을
# 동일 길이의 "QCOM_ADRENO_*"로 교체한다. 토큰 문자열은 호스트 dylib에만 존재하고
# (게스트 lib/qemu 바이너리 0건 실측, 2026-09-21) 게스트는 이름 매칭 파싱을 하지
# 않으므로 기능 무영향. 단, 게스트가 리터럴로 파싱하는 것은 양측 동시 리네임 필요:
#   - libOpenglCodecCommon.so: ANDROID_EMU_CHECKSUM_HELPER_v1 / _v  (guest 대비)
#   - libGLESv2_enc.so:        ANDROID_EMU_dma_v2                   (guest 대비)
#   - libEGL_emulation.so:     ANDROID_EMU_gles_max_version_3_0     → 리네임하지 않음(버전 협상)
#
# ENV 설정명(ANDROID_EMU_RENDERER/HEADLESS/RENDERDOC/VK_DISABLE_*/VK_ICD)과
# gles_max_version_* 3종은 제외한다.
import re, struct, subprocess, sys

KEEP_EXACT = {
    "ANDROID_EMU_HEADLESS", "ANDROID_EMU_RENDERER",
    "ANDROID_EMU_RENDERDOC", "ANDROID_EMU_RENDERDOC_CAPTURE_PATH_TEMPLATE",
    "ANDROID_EMU_VK_DISABLE_DEFERRED_COMMANDS",
    "ANDROID_EMU_VK_DISABLE_USE_CREATE_RESOURCES_WITH_REQUIREMENTS",
    "ANDROID_EMU_VK_ICD",
    "ANDROID_EMU_gles_max_version_2", "ANDROID_EMU_gles_max_version_3_0",
    "ANDROID_EMU_gles_max_version_3_1",
}
OLD_PREFIX = b"ANDROID_EMU_"
NEW_PREFIX = b"QCOM_ADRENO_"

def patch_bytes(data: bytearray) -> int:
    n = 0
    for m in re.finditer(re.escape(OLD_PREFIX) + rb"[A-Za-z0-9_]+", bytes(data)):
        o = m.start()
        name = m.group()
        if name.decode() in KEEP_EXACT:
            continue
        data[o:o + 12] = NEW_PREFIX
        n += 1
    return n

def main(src, out):
    data = bytearray(open(src, "rb").read())
    if data.find(NEW_PREFIX + b"native_sync_v4") >= 0:
        print("[*] 이미 패치된 파일 — 멱등 통과")
    else:
        n = patch_bytes(data)
        print(f"[*] 토큰 {n}곳 리네임")
    open(out, "wb").write(data)
    subprocess.run(["codesign", "--force", "--sign", "-", out], check=True,
                   capture_output=True)
    print(f"[완료] {out}")

if __name__ == "__main__":
    if len(sys.argv) != 3:
        sys.exit(__doc__)
    main(sys.argv[1], sys.argv[2])
