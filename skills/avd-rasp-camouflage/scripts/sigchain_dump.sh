#!/bin/bash
# sigchain_dump.sh — 23차: fault 창에 libsigchain rw(전역 SignalChain 배열)를 덤프하고
# 실행매핑 포인터를 분류한다. 가드의 Claim된 special_handler = ucontext 라이터 후보.
export PATH="$HOME/Library/Android/sdk/platform-tools:$PATH"
OUT=${1:-/tmp/sigchain23}
mkdir -p "$OUT"
adb shell am start -n viva.republica.toss/.splash.SplashActivity >/dev/null 2>&1
BASE=$(adb shell "dmesg | grep -c faultdump" | tr -d '\r')
for i in $(seq 1 360); do
  C=$(adb shell "dmesg | grep -c faultdump" | tr -d '\r')
  if [ "$C" -gt "$BASE" ]; then
    PID=$(adb shell "pidof viva.republica.toss" | tr -d '\r' | awk '{print $1}')
    TS=$(date +%H%M%S)
    echo "[*] faultdump pid=$PID — sigchain rw + 전체 maps 캡처"
    adb shell "cat /proc/$PID/maps" > "$OUT/maps.txt" 2>/dev/null
    # libsigchain rw 매핑 찾아 덤프
    RWLINE=$(grep "libsigchain.so" "$OUT/maps.txt" | grep "rw-p" | head -1)
    RWSTART=$(echo "$RWLINE" | cut -d- -f1)
    RWEND=$(echo "$RWLINE" | awk -F'[ -]' '{print $2}')
    echo "  sigchain rw: $RWSTART-$RWEND"
    adb shell "dd if=/proc/$PID/mem bs=4096 skip=$((16#$RWSTART/4096)) count=$(( (16#$RWEND-16#$RWSTART+4095)/4096 )) 2>/dev/null" > "$OUT/sigchain_rw_${TS}.bin"
    ls -la "$OUT/sigchain_rw_${TS}.bin" | awk '{print "  dumped:", $5}'
    break
  fi
  sleep 0.25
done
echo "$OUT"