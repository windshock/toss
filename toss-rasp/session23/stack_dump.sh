#!/bin/bash
# 23차: fault 창에 스택(sp 주변)을 덤프해 "복원 pc가 스택 유래인지" 판별
export PATH="$HOME/Library/Android/sdk/platform-tools:$PATH"
OUT=${1:-/tmp/stack23}; mkdir -p "$OUT"
adb shell am start -n viva.republica.toss/.splash.SplashActivity >/dev/null 2>&1
BASE=$(adb shell "dmesg | grep -c faultdump" | tr -d '\r')
for i in $(seq 1 360); do
  C=$(adb shell "dmesg | grep -c faultdump" | tr -d '\r')
  if [ "$C" -gt "$BASE" ]; then
    PID=$(adb shell "pidof viva.republica.toss" | tr -d '\r' | awk '{print $1}')
    # 최신 faultdump/SFI/SFO에서 sp와 복원 pc 추출
    DM=$(adb shell "dmesg | grep -E 'faultdump|SFI11|SFO:' | tail -5")
    echo "$DM" > "$OUT/dmesg.txt"
    SP=$(echo "$DM" | grep -oE "sp=0x[0-9a-f]+" | head -1 | cut -d= -f2)
    PC=$(echo "$DM" | grep "SFO" | grep -oE "pc=0x[0-9a-f]+" | head -1 | cut -d= -f2)
    echo "[*] pid=$PID sp=$SP restored_pc=$PC"
    adb shell "cat /proc/$PID/maps" > "$OUT/maps.txt" 2>/dev/null
    # sp-0x800 ~ sp+0x800 덤프 (페이지 정렬 주의 — sp-0x1000~sp+0x1000)
    SPDEC=$((SP))
    adb shell "dd if=/proc/$PID/mem bs=1 skip=$((SPDEC-4096)) count=8192 2>/dev/null" > "$OUT/stack.bin"
    echo "$PC" > "$OUT/restored_pc.txt"
    ls -la "$OUT/stack.bin" | awk '{print "  stack dumped:", $5}'
    break
  fi
  sleep 0.25
done
