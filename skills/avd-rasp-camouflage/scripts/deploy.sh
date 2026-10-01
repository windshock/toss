#!/bin/bash
# deploy.sh — 부팅 후 AVD RASP 무화 환경을 한 번에 복구 (호스트에서 실행)
#
# 사용법: deploy.sh <uid[,uid,...]> [워크스페이스 경로=~/Downloads/toss]
#   uid: 쉼표 목록 — 앱마다 다르다. 확인: adb shell dumpsys package <pkg> | grep userId
#   예:  deploy.sh 10179,10181
set -e
UIDS="${1:?usage: deploy.sh <uid[,uid,...]> [workspace]}"
WS="${2:-$HOME/Downloads/toss}"
SKILL_DIR="$(cd "$(dirname "$0")/.." && pwd)"
LKM="$WS/avd-camouflage/lkm/hide_kmod.built.ko"

[ -f "$LKM" ] || { echo "LKM 없음: $LKM (build-in-docker.sh로 빌드)"; exit 1; }

echo "[*] LKM push + insmod (uids=$UIDS)"
# 순서 중요: 부팅 직후 Enforcing 복귀라 setenforce 0가 insmod보다 먼저여야 한다.
# rmmod(구동 중 모듈 언로드)는 패닉 위험이 있어 "미적재시에만" insmod한다(교체=재부팅).
adb shell "setenforce 0"
adb push "$LKM" /data/local/tmp/hide_kmod.ko >/dev/null
adb shell "sync"
# 19차 수정: 이미 적재돼 있으면 insmod 자체를 건너뛰고(dmesg 체크 조기종료 결함 제거),
# 새로 적재할 때만 성공을 검증한다.
if ! adb shell "lsmod | grep -q hide_kmod"; then
  adb shell "insmod /data/local/tmp/hide_kmod.ko target_uids=$UIDS"
  adb shell "dmesg | tail -3 | grep -q hide_kmod || { echo 'insmod 실패'; exit 1; }"
else
  echo "[*] hide_kmod 이미 적재됨 — insmod 생략"
fi

echo "[*] 위장 파일 writer 기동"
# v4.0: 실행 경로를 .system_profile로 — 토스 가드가 /proc/N/cmdline 전수 스윕해
# "/data/local/tmp/.camow3.sh" 같은 인자가 노출되는 것을 완화 (2026-09-20 실측).
adb push "$SKILL_DIR/scripts/camow3.sh" /data/local/tmp/.system_profile >/dev/null
adb shell "sync"
adb shell "pkill -f system_profile 2>/dev/null; pkill -f camow3 2>/dev/null; true"
adb shell 'sh -c "nohup sh /data/local/tmp/.system_profile >/dev/null 2>&1 &"' || true
# 주의: eglflip(시차 위장)은 사용 금지 — 런타임에 ro.hardware.egl을 adreno로 뒤집으면
# 이후 GL 초기화하는 앱이 전부 abort한다(실측). egl은 기본값 emulation 유지.

# ⚠️ egl_alias 폐기(2026-09-19) — /vendor/lib64/egl tmpfs 오버레이가 SELinux 라벨
# (appdomain_tmpfs)로 GL lib open을 거부 → 시스템 전역 GL abort("couldn't find an
# OpenGL ES implementation", nexuslauncher/gms/앱 동반 사망). props-apply에서 egl을
# adreno로 안 바꾸므로(emulation 유지) 별칭 자체가 불필요.
# adb push "$SKILL_DIR/scripts/egl_alias.sh" /data/local/tmp/.egl_alias.sh >/dev/null
# adb shell "sh /data/local/tmp/.egl_alias.sh"


echo "[*] resetprop 신원 적용"
adb push "$SKILL_DIR/scripts/props-apply.sh" /data/local/tmp/.props-apply.sh >/dev/null
adb shell "sh /data/local/tmp/.props-apply.sh"

echo "[*] GL 셀렉터 프로퍼티 (19차 — 부트마다 리셋되므로 매번)"
# ro.hardware.egl은 부트마다 "emulation"으로 리셋된다. Android 13 EGL 로더는 readdir 없이
# 고정명만 시도하므로, vendor bind(_adreno 사본)+리터럴 패치 세계에서는 adreno가 필수.
# 사전조건: patch_bind_egl_literals.py가 .vl64에 적용되어 있을 것.
adb shell "/data/local/tmp/magisk resetprop ro.hardware.egl adreno"
adb shell "/data/local/tmp/magisk resetprop ro.hardware.vulkan default"

echo "[*] 화면 상시 켜짐 (스크린 타임아웃 해제)"
adb shell input keyevent KEYCODE_WAKEUP
adb shell "svc power stayon true; settings put system screen_off_timeout 2147483647"
adb shell input keyevent 82   # keyguard 스와이프 해제

echo "[*] 확인"
adb shell "lsmod | grep hide_kmod; getprop ro.serialno; getprop ro.debuggable"
echo "[완료] 앱 실행: adb shell am start -n <pkg>/<activity>"
echo "  - 프리다 없이 60초+ 생존하면 환경 위장 성공"
echo "  - 프리다 분석(neutered 빌드): frida_spawn.py <script.js>"
