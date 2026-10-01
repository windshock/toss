#!/usr/bin/env python3
"""patch_bind_egl_literals.py — .vl64 egl _adreno 사본 3종의 'emulation' 리터럴 제거

배경(19차 실측): hide_kmod v4.6+가 target uid의 'emulation' 포함 경로를 deny/열거은닉
하므로, 앱의 EGL 로더는 libEGL_adreno.so를 선택하고, 그 사본 내부 dlopen 키
(libGLESv1_CM_emulation 등)는 deny되어 EGL_NOT_INITIALIZED → hwui SIGABRT 즉사.
이 패치는 사본 3종 내부의 모든 b"emulation"을 b"adreno\\x00\\x00\\x00"로 치환해
dlopen 키와 SONAME을 adreno 세트로 수렴시킨다(soname dedup으로 해결, 검색경로 불필요).

사용: patch_bind_egl_literals.py <device-egl-dir>
  예: patch_bind_egl_literals.py /data/local/tmp/.vl64/egl
동작: 원본을 .bak_<name>_orig로 보존 후 치환본을 push, sync. 멱등(이미 0이면 skip).
"""
import re, subprocess, sys, tempfile, os

DIR = sys.argv[1] if len(sys.argv) > 1 else "/data/local/tmp/.vl64/egl"
FILES = ["libEGL_adreno.so", "libGLESv1_CM_adreno.so", "libGLESv2_adreno.so"]
ADB = os.path.expanduser("~/Library/Android/sdk/platform-tools/adb")

def adb(*a, **kw):
    return subprocess.run([ADB, "shell", *a], capture_output=True, text=True, **kw)

for f in FILES:
    src = f"{DIR}/{f}"
    n = adb(f"strings {src} | grep -c emulation").stdout.strip()
    if n == "0":
        print(f"[skip] {f}: already clean")
        continue
    data = subprocess.run([ADB, "shell", f"cat {src}"], capture_output=True).stdout
    patched = data.replace(b"emulation", b"adreno\x00\x00\x00")
    assert patched.count(b"emulation") == 0
    adb(f"cp {src} {DIR}/.bak_{f}_orig")
    with tempfile.NamedTemporaryFile(delete=False, suffix=".so") as t:
        t.write(patched); tmp = t.name
    subprocess.run([ADB, "push", tmp, src], capture_output=True)
    os.unlink(tmp)
    print(f"[patched] {f}: {n} literals ({len(data)}B)")
subprocess.run([ADB, "shell", "sync"])
print("[done] 검증: adb shell 'strings /vendor/lib64/egl/libEGL_adreno.so | grep -c emulation' → 0")
