#!/bin/bash
# child_forensics.sh — 동결 시점 toss-uid 전 프로세스(자식 포함) 힙 덤프 + 페이로드 검색
set -u
export ANDROID_SERIAL=emulator-5554
ADB=~/Library/Android/sdk/platform-tools/adb
OUT=/tmp/child_forensics
rm -rf $OUT; mkdir -p $OUT
dsh() { $ADB shell "$1" </dev/null; }

dsh "echo 1 > /sys/module/hide_kmod/parameters/exit_block"
dsh "dmesg -C" >/dev/null 2>&1
dsh "am force-stop viva.republica.toss" >/dev/null 2>&1; sleep 1
dsh "am start -n viva.republica.toss/.splash.SplashActivity" >/dev/null 2>&1

# EXITSTOP(메인) 대기
FROZE=0
for i in $(seq 1 60); do
  if dsh "dmesg | grep EXITSTOP | grep -q '.republica.toss'" </dev/null; then FROZE=1; break; fi
  sleep 0.5
done
echo "[+] 메인 동결: $FROZE (반복 $i)"
ALIVE=$(dsh "pidof viva.republica.toss" </dev/null | tr -d '\r')
echo "[+] 메인 alive: ${ALIVE:-DEAD}"

# toss-uid 전 프로세스 열거 (uid 10179)
PIDS=""
for try in 1 2 3 4 5; do
  RAW=$(dsh "ps -A -o UID,PID,NAME 2>/dev/null" | tr -d '\r' | grep '^[ 	]*10179[ 	]')
  echo "$RAW" > $OUT/ps_raw_try$try.txt
  PIDS=$(echo "$RAW" | awk '{print $2}' | grep -E '^[0-9]+$' | tr '\n' ' ')
  [ -n "$PIDS" ] && break
  echo "[!] 열거 재시도 $try"; sleep 1
done
echo "[+] toss-uid pids: $PIDS"

for PID in $PIDS; do
  COMM=$(dsh "cat /proc/$PID/comm 2>/dev/null" | tr -d '\r\n')
  ST=$(dsh "grep -m1 State /proc/$PID/status 2>/dev/null" | awk '{print $2}' | tr -d '\r')
  echo "== pid=$PID comm=$COMM state=$ST"
  [ -z "$ST" ] && { echo "   (소멸)"; continue; }
  dsh "cat /proc/$PID/maps" > $OUT/maps_$PID.txt 2>/dev/null
  # rw-p 리전 전수(캡 12MB/리전) — dalvik-large는 스킵
  dsh "grep ' rw-p ' /proc/$PID/maps" | tr -d '\r' | while read -r line; do
    RANGE=$(echo "$line" | awk '{print $1}')
    S=$((16#$(echo $RANGE | cut -d- -f1))); E=$((16#$(echo $RANGE | cut -d- -f2)))
    SZ=$(( (E-S)/1048576 )); [ $SZ -gt 12 ] && SZ=12; [ $SZ -eq 0 ] && SZ=1
    # 이름 있고 dalvik-main이면 스킵(메인은 별도 확보됨)
    echo "$line" | grep -q "dalvik-main" && continue
    dsh "dd if=/proc/$PID/mem bs=4096 skip=$((S/4096)) count=$((SZ*256)) 2>/dev/null" > "$OUT/p${PID}_$(printf %x $S).bin" 2>/dev/null
    echo "   dumped $(printf %x $S) ${SZ}MB ($(echo $line | awk '{print $6}'))"
  done
done
dsh "echo 0 > /sys/module/hide_kmod/parameters/exit_block"
dsh "am force-stop viva.republica.toss" >/dev/null 2>&1
echo "[+] 총: $(ls $OUT/*.bin 2>/dev/null | wc -l)개 덤프, $(du -sh $OUT | awk '{print $1}')"
