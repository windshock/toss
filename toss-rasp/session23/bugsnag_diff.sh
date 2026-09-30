#!/bin/bash
# 23차: fault 창에 libbugsnag-ndk rx를 덤프해 원본과 diff — 인라인 패치 여부
export PATH="$HOME/Library/Android/sdk/platform-tools:$PATH"
OUT=${1:-/tmp/bndiff}; mkdir -p "$OUT"
adb shell am start -n viva.republica.toss/.splash.SplashActivity >/dev/null 2>&1
BASE=$(adb shell "dmesg | grep -c faultdump" | tr -d '\r')
for i in $(seq 1 360); do
  C=$(adb shell "dmesg | grep -c faultdump" | tr -d '\r')
  if [ "$C" -gt "$BASE" ]; then
    PID=$(adb shell "pidof viva.republica.toss" | tr -d '\r' | awk '{print $1}')
    adb shell "cat /proc/$PID/maps" > "$OUT/maps.txt" 2>/dev/null
    RX=$(grep "libbugsnag-ndk.so" "$OUT/maps.txt" | grep "r-xp" | head -1)
    S=$(echo "$RX" | cut -d- -f1); E=$(echo "$RX" | awk -F'[ -]' '{print $2}')
    FO=$(echo "$RX" | awk '{print $3}')
    echo "[*] pid=$PID rx=$S-$E fileoff=$FO"
    PG=$((16#$S / 4096)); CNT=$(( (16#$E - 16#$S) / 4096 ))
    adb shell "dd if=/proc/$PID/mem bs=4096 skip=$PG count=$CNT 2>/dev/null" > "$OUT/rx.bin"
    echo "$FO" > "$OUT/fo.txt"; echo "$S" > "$OUT/s.txt"
    ls -la "$OUT/rx.bin" | awk '{print "  rx dumped:", $5}'
    break
  fi
  sleep 0.25
done
