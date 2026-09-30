#!/bin/bash
# 23차 말: fault 창에 sp 주변 1페이지 덤프 → sp+0x28(caller LR) resolve
export PATH="$HOME/Library/Android/sdk/platform-tools:$PATH"
OUT=${1:-/tmp/caller23}; mkdir -p "$OUT"
adb shell am start -n viva.republica.toss/.splash.SplashActivity >/dev/null 2>&1
BASE=$(adb shell "dmesg | grep -c faultdump" | tr -d '\r')
for i in $(seq 1 360); do
  C=$(adb shell "dmesg | grep -c faultdump" | tr -d '\r')
  if [ "$C" -gt "$BASE" ]; then
    PID=$(adb shell "pidof viva.republica.toss" | tr -d '\r' | awk '{print $1}')
    sleep 0.3
    DM=$(adb shell "dmesg | grep -E 'faultdump|SFI11' | tail -4")
    echo "$DM" > "$OUT/dmesg.txt"
    FS=$(echo "$DM" | grep "SFI11" | grep republica | grep -oE "sp=0x[0-9a-f]+" | head -1 | cut -d= -f2)
    PC=$(echo "$DM" | grep "SFI11" | grep republica | grep -oE "pc=0x[0-9a-f]+" | head -1 | cut -d= -f2)
    echo "[*] pid=$PID fault_sp=$FS fault_pc=$PC"
    adb shell "cat /proc/$PID/maps" > "$OUT/maps.txt" 2>/dev/null
    PG=$(( (FS & ~0xFFF) / 4096 ))
    adb shell "dd if=/proc/$PID/mem bs=4096 skip=$PG count=1 2>/dev/null" > "$OUT/page.bin"
    echo "$FS" > "$OUT/sp.txt"; ls -la "$OUT/page.bin" | awk '{print "  page:", $5}'
    break
  fi
  sleep 0.25
done
