#!/bin/bash
# hwbp_global.sh — libea56 디스패처 상태글로벌(베이스+0x181758) 쓰기 감시
# 메인 pid의 libea56 베이스를 조기 취득 → 워치포인트 무장 → CTXW 궤적 수집
set -u
export ANDROID_SERIAL=emulator-5554
ADB=~/Library/Android/sdk/platform-tools/adb
dsh() { $ADB shell "$1"; }

dsh "dmesg -C" >/dev/null 2>&1
dsh "am force-stop viva.republica.toss" >/dev/null 2>&1; sleep 1
dsh "am start -n viva.republica.toss/.splash.SplashActivity" >/dev/null 2>&1
PID=""
for i in $(seq 1 50); do PID=$(dsh "pidof viva.republica.toss" | tr -d '\r'); [ -n "$PID" ] && break; sleep 0.1; done
[ -z "$PID" ] && { echo NO_PID; exit 1; }
echo "pid=$PID"

# libea56 rw 매핑(va 0x174000) 기준 — 매핑 갭 보정
RWSTART=""; for i in $(seq 1 30); do
  RWSTART=$(dsh "grep libea56 /proc/$PID/maps | grep rw-p | head -1" | tr -d "\r" | cut -d- -f1)
  [ -n "$RWSTART" ] && break; sleep 0.2
done
[ -z "$RWSTART" ] && { echo NO_BASE; exit 1; }
BASE=$RWSTART
ADDR=$(printf "0x%x" $(( 0x$RWSTART + 0x181758 - 0x174000 )))
echo "libea56 base=0x$BASE → global $ADDR — 무장"

# 가드 스레드 tid 탐색(perf_event는 스레드 단위) — 없으면 메인 pid
TID=$(dsh "for t in /proc/$PID/task/*; do c=\$(cat \$t/comm 2>/dev/null); case \$c in RxCached*|Thread-*|Jit*) echo \${t##*/}; break;; esac; done" | tr -d '\r' | head -1)
TID=${TID:-$PID}
echo "target tid=$TID"
dsh "echo $TID > /sys/module/hide_kmod/parameters/hwbp_pid"
dsh "echo $ADDR > /sys/module/hide_kmod/parameters/hwbp_addr"
dsh "echo 1 > /sys/module/hide_kmod/parameters/hwbp_type"
dsh "echo 4 > /sys/module/hide_kmod/parameters/hwbp_len"
dsh "echo 1 > /sys/module/hide_kmod/parameters/hwbp_go"

for i in $(seq 1 25); do sleep 1; P=$(dsh "pidof viva.republica.toss" | tr -d '\r'); [ -z "$P" ] && { echo "died T+~$((i+2))s"; break; }; done
echo "hits=$(dsh "cat /sys/module/hide_kmod/parameters/hwbp_hits" | tr -d '\r')"
dsh "dmesg | grep CTXW" > /tmp/ctxw_global.txt 2>/dev/null
echo "lines=$(wc -l < /tmp/ctxw_global.txt)"
echo "== pc 분포 =="
sed 's/.*pc=0x\([0-9a-f]*\).*/\1/' /tmp/ctxw_global.txt | sort | uniq -c | sort -rn | head -12
dsh "echo 0 > /sys/module/hide_kmod/parameters/hwbp_pid; echo 0 > /sys/module/hide_kmod/parameters/hwbp_addr; echo 1 > /sys/module/hide_kmod/parameters/hwbp_go" >/dev/null 2>&1
