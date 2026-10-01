#!/bin/bash
# launch_stats_bash3.sh — toss_launch_stats.sh의 bash3/macOS 호환 이식 (동일 분류 체계)
# 사용: launch_stats_bash3.sh [런수=3] [감시초/런=120]
# 분류: dead<Xs / dialog@Xs(스크린샷 15.2KB 휴리스틱) / ALIVE<Xs+
export PATH="$PATH:$HOME/Library/Android/sdk/platform-tools:$PATH"
N=${1:-3}
WATCH=${2:-120}
PKG=viva.republica.toss
ACT=.splash.SplashActivity
TALLY=""
for RUN in $(seq 1 $N); do
  adb shell "am force-stop $PKG; sleep 1; am start -n $PKG/$ACT" >/dev/null
  OUT="dead<30s"
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
  TALLY="$TALLY $OUT"
  echo "run#$RUN: $OUT"
done
echo "=== 분포 ==="
for k in $(echo $TALLY | tr ' ' '\n' | sort -u); do
  C=$(echo $TALLY | tr ' ' '\n' | grep -cx "$k")
  [ -n "$k" ] && echo "  $k: $C"
done
