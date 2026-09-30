#!/bin/bash
# 23차: fault 창 libbugsnag rw(data/bss) 덤프 — 원본과 diff + 실행매핑 포인터 스캔
export PATH="$HOME/Library/Android/sdk/platform-tools:$PATH"
OUT=${1:-/tmp/bnrw}; mkdir -p "$OUT"
adb shell am start -n viva.republica.toss/.splash.SplashActivity >/dev/null 2>&1
BASE=$(adb shell "dmesg | grep -c faultdump" | tr -d '\r')
for i in $(seq 1 360); do
  C=$(adb shell "dmesg | grep -c faultdump" | tr -d '\r')
  if [ "$C" -gt "$BASE" ]; then
    PID=$(adb shell "pidof viva.republica.toss" | tr -d '\r' | awk '{print $1}')
    adb shell "cat /proc/$PID/maps" > "$OUT/maps.txt" 2>/dev/null
    RW=$(grep "libbugsnag-ndk.so" "$OUT/maps.txt" | grep "rw-p" | head -1)
    S=$(echo "$RW" | cut -d- -f1); E=$(echo "$RW" | awk -F'[ -]' '{print $2}')
    echo "[*] pid=$PID rw=$S-$E"
    PG=$((16#$S / 4096)); CNT=$(( (16#$E - 16#$S) / 4096 + 1 ))
    adb shell "dd if=/proc/$PID/mem bs=4096 skip=$PG count=$CNT 2>/dev/null" > "$OUT/rw.bin"
    echo "$S" > "$OUT/s.txt"
    ls -la "$OUT/rw.bin" | awk '{print "  rw dumped:", $5}'
    break
  fi
  sleep 0.25
done
