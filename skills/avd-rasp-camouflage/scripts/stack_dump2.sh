#!/bin/bash
# 23차 v2: fault 창 스택 덤프 — dd는 페이지 단위 seek(toybox 큰 skip 한계 회피)
export PATH="$HOME/Library/Android/sdk/platform-tools:$PATH"
OUT=${1:-/tmp/stack23b}; mkdir -p "$OUT"
adb shell am start -n viva.republica.toss/.splash.SplashActivity >/dev/null 2>&1
BASE=$(adb shell "dmesg | grep -c faultdump" | tr -d '\r')
for i in $(seq 1 360); do
  C=$(adb shell "dmesg | grep -c faultdump" | tr -d '\r')
  if [ "$C" -gt "$BASE" ]; then
    PID=$(adb shell "pidof viva.republica.toss" | tr -d '\r' | awk '{print $1}')
    sleep 0.4   # SFO가 찍힌 뒤
    DM=$(adb shell "dmesg | grep -E 'faultdump|SFI11|SFO:' | tail -8")
    echo "$DM" > "$OUT/dmesg.txt"
    # 메인 스레드(.republica.toss)의 SFO 복원 pc/sp
    MAINLINE=$(echo "$DM" | grep "SFO" | grep "republica" | tail -1)
    PC=$(echo "$MAINLINE" | grep -oE "pc=0x[0-9a-f]+" | head -1 | cut -d= -f2)
    SP=$(echo "$MAINLINE" | grep -oE "sp=0x[0-9a-f]+" | head -1 | cut -d= -f2)
    FS=$(echo "$DM" | grep "SFI11" | grep republica | grep -oE "sp=0x[0-9a-f]+" | head -1 | cut -d= -f2)
    echo "[*] pid=$PID sfo_pc=$PC sfo_sp=$SP fault_sp=$FS"
    adb shell "cat /proc/$PID/maps" > "$OUT/maps.txt" 2>/dev/null
    # fault_sp 주변 5페이지 덤프: 페이지 단위 seek
    PG=$(( (FS - 16384) / 4096 ))
    adb shell "dd if=/proc/$PID/mem bs=4096 skip=$PG count=5 2>/dev/null" > "$OUT/stack.bin"
    echo "$PC" > "$OUT/restored_pc.txt"; echo "$FS" > "$OUT/fault_sp.txt"
    ls -la "$OUT/stack.bin" | awk '{print "  stack dumped:", $5}'
    break
  fi
  sleep 0.25
done
