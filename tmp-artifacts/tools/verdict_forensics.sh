#!/bin/bash
# verdict_forensics.sh — 동결 포렌식: 판정후(동결) + 판정전(T+3s) 힙 스냅샷
# 사용: verdict_forensics.sh post   (판정후: EXITSTOP 대기 후 덤프)
#       verdict_forensics.sh pre    (판정전: T+3s 덤프 — exit_block 무관)
set -u
export ANDROID_SERIAL=emulator-5554
ADB=~/Library/Android/sdk/platform-tools/adb
MODE=${1:-post}
OUT=/tmp/verdict_$MODE
mkdir -p $OUT; rm -f $OUT/*
dsh() { $ADB shell "$1"; }

if [ "$MODE" = post ]; then
  dsh "echo 1 > /sys/module/hide_kmod/parameters/exit_block"
  dsh "dmesg -C" >/dev/null 2>&1
fi
dsh "am force-stop viva.republica.toss" >/dev/null 2>&1; sleep 1
dsh "am start -n viva.republica.toss/.splash.SplashActivity" >/dev/null 2>&1
PID=""
for i in $(seq 1 50); do PID=$(dsh "pidof viva.republica.toss" | tr -d '\r'); [ -n "$PID" ] && break; sleep 0.1; done
[ -z "$PID" ] && { echo NO_PID; exit 1; }
echo "pid=$PID mode=$MODE"

if [ "$MODE" = post ]; then
  # EXITSTOP(메인 comm) 대기 — 최대 25s
  FROZE=0
  for i in $(seq 1 50); do
    if dsh "dmesg | grep 'EXITSTOP' | grep -q '.republica.toss'"; then FROZE=1; break; fi
    sleep 0.5
  done
  [ "$FROZE" = 1 ] && echo "동결 확인 (EXITSTOP)" || echo "경고: 동결 미확인 — 계속 진행"
else
  sleep 3
fi

# maps 확보
dsh "cat /proc/$PID/maps" > $OUT/maps.txt 2>/dev/null
# 대상 리전: dalvik-main(상한 96MB), LinearAlloc, libea56 rw, scudo, large object
dump_region() {  # 이름패턴 파일접두 상한MB
  local pat=$1 pre=$2 cap=$3
  dsh "grep '$pat' /proc/$PID/maps" | tr -d '\r' | while read -r line; do
    RANGE=$(echo "$line" | awk '{print $1}')
    S=$(printf '%d' $((16#$(echo $RANGE | cut -d- -f1))))
    E=$(printf '%d' $((16#$(echo $RANGE | cut -d- -f2))))
    SZ=$(( (E - S) / 1048576 ))
    [ $SZ -gt $cap ] && SZ=$cap; [ $SZ -eq 0 ] && SZ=1
    NAME=$(echo "$line" | awk '{print $6}' | tr '/' '_')
    dsh "dd if=/proc/$PID/mem bs=4096 skip=$((S/4096)) count=$((SZ*256)) 2>/dev/null" > "$OUT/${pre}_$(printf %x $S).bin" 2>/dev/null
    echo "  dumped ${pre} @$(printf %x $S) ${SZ}MB"
  done
}
echo "== 리전 덤프 =="
dump_region "dalvik-main space" heap_main 96
dump_region "LinearAlloc" heap_lin 16
dump_region "libea56.so" libea56_rw 4
dump_region "anon:scudo" heap_scudo 24
dump_region "large object space" heap_los 16
ls -la $OUT/ | tail -12
[ "$MODE" = post ] && dsh "echo 0 > /sys/module/hide_kmod/parameters/exit_block"
dsh "am force-stop viva.republica.toss" >/dev/null 2>&1
echo done
