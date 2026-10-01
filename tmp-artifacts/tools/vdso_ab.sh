#!/bin/bash
# vdso_ab.sh — §161 E5: vdso 스푸핑 A/B (OFF×N vs ON×N) — 사멸 시간 + 판정 라벨
# 사용: vdso_ab.sh <off|on> <N>   (on: vdso_mult 자동 = 현재값*5/4 = 19.2MHz 에뮬)
set -u
export ANDROID_SERIAL=emulator-5554
ADB=~/Library/Android/sdk/platform-tools/adb
ARM=$1; N=${2:-3}
P=/sys/module/hide_kmod/parameters

CUR_MULT=$($ADB shell "su 0 cat $P/vdso_mult" | tr -d '\r')
if [ "$ARM" = on ]; then
  # 현재 hres mult를 dmesg에서 회독(resolve 시 출력) — 없으면 2796203(24MHz shift27 전형값) 대신 실패
  BASE=$($ADB shell "su 0 dmesg" | grep -ao "hres mult=[0-9]*" | tail -1 | grep -ao "[0-9]*")
  [ -z "$BASE" ] && { echo "NO_BASE_MULT(dmesg)"; exit 1; }
  SPOOF=$(( BASE * 5 / 4 ))
  echo "spoof mult: $BASE → $SPOOF (19.2MHz 에뮬)"
  $ADB shell "su 0 sh -c 'echo $SPOOF > $P/vdso_mult; echo 1 > $P/vdso_spoof'"
  sleep 1
  H=$($ADB shell "su 0 cat $P/vdso_hits" | tr -d '\r'); echo "vdso_hits(1s)=$H — 갱신 되는지"
else
  $ADB shell "su 0 sh -c 'echo 0 > $P/vdso_spoof'"
fi
echo "=== ARM=$ARM 시작 ==="
for RUN in $(seq 1 $N); do
  $ADB shell am force-stop viva.republica.toss >/dev/null 2>&1; sleep 1
  T0=$(python3 -c 'import time;print(int(time.time()*1000))')
  $ADB shell am start -n viva.republica.toss/.splash.SplashActivity >/dev/null 2>&1
  PID=""; for i in $(seq 1 50); do PID=$($ADB shell pidof viva.republica.toss | tr -d '\r'); [ -n "$PID" ] && break; sleep 0.1; done
  DT="ALIVE>30s"
  for i in $(seq 1 60); do
    P2=$($ADB shell pidof viva.republica.toss | tr -d '\r')
    if [ -z "$P2" ]; then DT="T+$(( $(python3 -c 'import time;print(int(time.time()*1000))') - T0 ))ms"; break; fi
    sleep 0.5
  done
  L=$($ADB shell "su 0 sh -c 'cat \$(ls -t /data/data/viva.republica.toss/files/logstore/logitems/*.json 2>/dev/null | head -1)'" 2>/dev/null | tr -d '\r' | tr '{' '\n' | grep -aoE '"(exitPlan|caller|value)":"[^"]*"' | tr '\n' ' ')
  echo "$ARM$RUN pid=${PID:-none} $DT [$L]"
done
$ADB shell "su 0 sh -c 'echo 0 > $P/vdso_spoof'"
echo "=== ARM=$ARM 완료 (spoof off 복원) ==="
