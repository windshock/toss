#!/bin/bash
# gl_dynstr_scrub.sh v2 — §183: 앱 매핑 GL 라이브러리 dynstr 런타임 스크럽 (원커맨드)
# v1 교훈: while-read 안 heredoc가 stdin 삼킴 + 페이지별 adb 왕복은 너무 느림 →
# v2는 전 스크럽을 기기 내 dynscrub 바이너리 1회 호출로 (6,343토큰 281ms).
#
# 흐름: 기동 → GL 웹 매핑 대기 → dynscrub(리드백 내장) → 생존/라벨 관찰
# 사용: bash gl_dynstr_scrub.sh  — ANDROID_SERIAL 필수
set -u
export PATH="$HOME/Library/Android/sdk/platform-tools:$PATH"
ADB="adb"
PKG=viva.republica.toss

$ADB shell "su 0 sh -c 'am force-stop $PKG; rm -f /data/data/$PKG/files/logstore/logitems/*.json; am start -n $PKG/.splash.SplashActivity'" >/dev/null 2>&1
PID=""
for i in $(seq 1 60); do PID=$($ADB shell pidof $PKG | tr -d '\r'); [ -n "$PID" ] && break; sleep 0.05; done
echo "pid=$PID"
[ -z "$PID" ] && { echo NOPID; exit 1; }

# GL 웹(10종) 전부 매핑될 때까지 (최대 8s)
for i in $(seq 1 80); do
  N=$($ADB shell "su 0 sh -c 'grep -cE \"libEGL_adreno|GLESv1_CM_adreno|GLESv2_adreno|GfxPerfCollector|OpenglCodecCommon|libglcommon|glesv1qti|glesv2qti|qti_adreno|vulkanqti\" /proc/$PID/maps 2>/dev/null'" | tr -d '\r')
  [ "${N:-0}" -ge 10 ] && { echo "web_mapped poll=$i"; break; }
  $ADB shell "[ -d /proc/$PID ]" >/dev/null 2>&1 || { echo "DIED_BEFORE_WEB poll=$i"; exit 2; }
  sleep 0.1
done

# 스크럽 (기기 내 1프로세스 — 밀리초 단위)
$ADB shell "su 0 /data/local/tmp/dynscrub $PID /data/local/tmp/gl_ranges.txt readback" | tr -d '\r'

# 생존/라벨 관찰
LAST=""; N=0
while $ADB shell "[ -d /proc/$PID ]" >/dev/null 2>&1 && [ $N -lt 30 ]; do
  sleep 1; N=$((N+1))
  L=$($ADB shell "su 0 sh -c 'cat /data/data/$PKG/files/logstore/logitems/*.json 2>/dev/null'" | grep -o '"result":"\[[A-Z_]*\]"' | tail -1)
  [ -n "$L" ] && LAST="$L"
done
echo "RESULT: SURVIVED_S=$N LABEL=$LAST"
