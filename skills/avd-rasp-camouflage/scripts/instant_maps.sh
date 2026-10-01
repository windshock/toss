#!/bin/bash
export PATH="$HOME/Library/Android/sdk/platform-tools:$PATH"
OUT=${1:-/tmp/inst28}; mkdir -p "$OUT"
adb shell am start -n viva.republica.toss/.splash.SplashActivity >/dev/null 2>&1 &
B=$(adb shell "dmesg | grep -c SFI11" | tr -dc '0-9')
for i in $(seq 1 200); do
  C=$(adb shell "dmesg | grep -c SFI11" 2>/dev/null | tr -dc '0-9')
  if [ -n "$C" ] && [ "$C" -gt "$B" ] 2>/dev/null; then
    PID=$(adb shell "ps -A -o UID,PID | awk '\$1==10175 {print \$2; exit}'" | tr -d '\r')
    echo "[*] SFI11! pid=$PID"
    [ -n "$PID" ] && adb shell "cat /proc/$PID/maps" > "$OUT/maps.txt" 2>/dev/null
    adb shell "dmesg | grep SFI11 | tail -3" > "$OUT/sfi.txt"
    break
  fi
  sleep 0.15
done
