#!/bin/bash
export PATH="$HOME/Library/Android/sdk/platform-tools:$PATH"
OUT=${1:-/tmp/oatpatch}
mkdir -p "$OUT"
echo "[*] toss launch"
adb shell am start -n viva.republica.toss/.splash.SplashActivity >/dev/null 2>&1
BASE=$(adb shell "dmesg | grep -c faultdump" | tr -d '\r')
for i in $(seq 1 360); do
  C=$(adb shell "dmesg | grep -c faultdump" | tr -d '\r')
  if [ "$C" -gt "$BASE" ]; then
    PID=$(adb shell "pidof viva.republica.toss" | tr -d '\r' | awk '{print $1}')
    TS=$(date +%H%M%S)
    echo "[*] faultdump! pid=$PID — /proc/mem 즉시 덤프"
    # fault pc 주변: 0x715ba510~0x715ba560 (이 부트 고정 주소)
    adb shell "dd if=/proc/$PID/mem bs=1 skip=$((0x715ba510)) count=$((0x50)) 2>/dev/null | xxd" > "$OUT/mem_${TS}.txt" 2>/dev/null
    adb shell "dmesg | grep -E 'faultdump|SFI11' | tail -4" > "$OUT/dm_${TS}.txt"
    cat "$OUT/mem_${TS}.txt" | head -8
    echo "--- 원본 파일 (0x345510~0x345560) ---"
    xxd -s $((0x345510)) -l $((0x50)) /tmp/boot-framework22.oat | head -8
    break
  fi
  sleep 0.2
done
