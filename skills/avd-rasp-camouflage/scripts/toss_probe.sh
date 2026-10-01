#!/bin/bash
# toss_probe.sh — 토스 1런 관측: 기동→종료→앱 logstore 판정 추출.
#   차등 테스트(채널 토글)로 emulator result(0xBF 비트필드)의 어느 비트가 어느 채널에
#   대응하는지 경험적으로 매핑하기 위한 계측 러너. (FINDINGS §62-3 누적점수 모델)
# 추출: raspRoot/raspEmulator debugInfo, emulator result, detected, attendingDetectorSet,
#       handleExitPlan caller/exitPlan, 종료시각, top activity.
# 옵션: --fresh  (fresh_identity.sh로 기기신원 로테이션 후 실행 — 테스트 정합성)
#       --keep   (실행 후 앱 안 죽이고 유지)
set -u
PKG=viva.republica.toss
LS=/data/data/$PKG/files/logstore/logitems
export PATH="$HOME/Library/Android/sdk/platform-tools:$PATH"
SKILL_DIR="$(cd "$(dirname "$0")" && pwd)"
dsh(){ adb shell "$@"; }
adb root >/dev/null 2>&1

FRESH=0; KEEP=0
for a in "$@"; do [ "$a" = "--fresh" ] && FRESH=1; [ "$a" = "--keep" ] && KEEP=1; done
[ "$FRESH" = 1 ] && { echo "[fresh_identity]"; bash "$SKILL_DIR/fresh_identity.sh" >/dev/null 2>&1; }

dsh "am force-stop com.samsung.android.monimo 2>/dev/null; am force-stop net.ib.android.smcard 2>/dev/null; am force-stop $PKG; rm -f $LS/*.json 2>/dev/null; true"
dsh "logcat -c"
dsh "am start -n $PKG/.splash.SplashActivity >/dev/null 2>&1"
DEAD=""
for i in $(seq 1 20); do
  sleep 1
  P=$(dsh "pidof $PKG" | tr -d '\r')
  [ -z "$P" ] && { DEAD=$i; break; }
done
TOP=$(dsh "dumpsys activity activities 2>/dev/null | grep topResumedActivity | grep -oE '$PKG/[^ }]*' | head -1" | tr -d '\r')

V=$(dsh "grep -hE 'raspRootCallback|raspEmulatorCallback|emulator detected|postRaspResult|handleExitPlan' $LS/*.json 2>/dev/null")
g(){ printf '%s' "$V" | grep "$1"; }
num(){ grep -oE "$1"'":"[0-9]+"' | head -1 | grep -oE '[0-9]+'; }
str(){ grep -oE "$1"'":"[^"]*"' | head -1 | sed 's/.*":"//;s/"$//'; }
rootdbg=$(g raspRootCallback | num '"debugInfo')
emudbg=$(g raspEmulatorCallback | num '"debugInfo')
emures=$(g 'emulator detected' | num '"result')
detset=$(g postRaspResult | str '"attendingDetectorSet')
detected=$(g postRaspResult | str '"detected')
caller=$(g handleExitPlan | str '"caller')
exitplan=$(g handleExitPlan | str '"exitPlan')
hx(){ [ -n "${1:-}" ] && printf '0x%x' "$1" 2>/dev/null || printf '-'; }

echo "RESULT: dead@${DEAD:-ALIVE}s top=${TOP:-none}"
echo "  detected=${detected:-?}  emu_result=${emures:-?} ($(hx ${emures:-}))  emu_dbg=${emudbg:-?} ($(hx ${emudbg:-}))  root_dbg=${rootdbg:-?} ($(hx ${rootdbg:-}))"
echo "  exit=${exitplan:-?}/${caller:-?}  detectors=[${detset:-?}]"
[ "$KEEP" = 0 ] && dsh "am force-stop $PKG" >/dev/null 2>&1
