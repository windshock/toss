#!/bin/bash
# toss_launch_stats.sh — 토스 N런 기동→결과 자동 분류 (레이스 판정 통계용, 17차)
# 사용: toss_launch_stats.sh [런수=6] [감시초/런=120]
# 분류: dead<Xs / dialog@Xs(스크린샷 15.2KB 휴리스틱) / ALIVE<Xs+
# 각 런: force-stop → am start → 3s 간격 pidof+스크린샷 크기 판정
# 주의: 탭 테스트는 ANR 다이얼로그 해제 아티팩트가 있으므로 자동 탭 금지(15차).
#       백그라운드 생존은 프리저 아티팩트 — topResumed 병행 확인(8차 교정).
export PATH="$PATH:$HOME/Library/Android/sdk/platform-tools:$PATH"
N=${1:-6}
WATCH=${2:-120}
PKG=viva.republica.toss
ACT=.splash.SplashActivity
declare -A TALLY
for RUN in $(seq 1 $N); do
  adb shell "am force-stop $PKG; sleep 1; am start -n $PKG/$ACT" >/dev/null
  OUT="dead<30s"; TAPPED=""
  for i in $(seq 1 $(( WATCH / 3 ))); do
    sleep 3
    P=$(adb shell pidof $PKG | tr -d '\r')
    if [ -z "$P" ]; then break; fi
    adb exec-out screencap -p > /tmp/ls_p.png 2>/dev/null
    SZ=$(stat -f%z /tmp/ls_p.png 2>/dev/null || echo 0)
    EL=$(( i * 3 ))
    if [ "$SZ" -gt 13500 ] && [ "$SZ" -lt 17000 ]; then OUT="dialog@${EL}s"; break; fi
    if [ $EL -ge $WATCH ]; then OUT="ALIVE${WATCH}s+"; break; fi
  done
  TALLY[$OUT]=$(( ${TALLY[$OUT]:-0} + 1 ))
  echo "run#$RUN: $OUT"
done
echo "=== 분포 ==="
for k in "${!TALLY[@]}"; do echo "  $k: ${TALLY[$k]}"; done
