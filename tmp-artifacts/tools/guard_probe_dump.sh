#!/bin/bash
# guard_probe_dump.sh v2 — [O]-1b: pvm 프로빙 주소 콘텐츠 캡처
# 타이밍: 프로빙 T+2~3s 1회 발생 → T+3s에 전체 trace grep 1회 → 여유 ~8s 내 dd
set -u
export ANDROID_SERIAL=emulator-5554
ADB=~/Library/Android/sdk/platform-tools/adb
PKG=viva.republica.toss
OUT=/tmp/guard_probe
mkdir -p $OUT; rm -f $OUT/*
dsh() { $ADB shell "$1"; }

dsh "T=/sys/kernel/tracing; G=\$T/instances/guard2; mkdir -p \$G
cd \$T
grep -q p_pvm2 kprobe_events 2>/dev/null || echo 'p:p_pvm2 __arm64_sys_process_vm_readv pid=+0(%x0):x64 rbase=+0(+0x18(%x0)):x64 rlen=+0x8(+0x18(%x0)):x64' >> kprobe_events
echo 1 > \$G/options/event-fork; echo mono > \$G/trace_clock
echo 65536 > \$G/buffer_size_kb
echo 0 > \$G/tracing_on; echo > \$G/trace; echo 1 > \$G/tracing_on
echo 0 > \$G/set_event_pid; echo SETUP_OK" >/dev/null

dsh "am force-stop $PKG" >/dev/null 2>&1; sleep 1
dsh "am start -n $PKG/.splash.SplashActivity" >/dev/null 2>&1
PID=""
for i in $(seq 1 50); do PID=$(dsh "pidof $PKG" | tr -d '\r'); [ -n "$PID" ] && break; sleep 0.1; done
[ -z "$PID" ] && { echo NO_PID; exit 1; }
dsh "echo $PID > /sys/kernel/tracing/instances/guard2/set_event_pid"
echo "pid=$PID — 프로빙 대기(T+3s)…"; sleep 3

echo "== 전체 trace에서 rlen=0x4 주소 추출 =="
ADDRS=$(dsh "grep p_pvm2 /sys/kernel/tracing/instances/guard2/trace | grep 'rlen=0x4' | sed -n 's/.*rbase=0x\([0-9a-f]*\).*/\1/p'" 2>/dev/null | tr -d '\r' | sort -u)
echo "$ADDRS" | head -10
[ -z "$ADDRS" ] && { echo NO_ADDRS; dsh "echo 0 > /sys/kernel/tracing/instances/guard2/set_event_pid"; exit 1; }

echo "== 페이지 덤프 (앱 생존 중) =="
for A in $ADDRS; do
  P=$(( 0x$A / 4096 ))
  dsh "dd if=/proc/$PID/mem bs=4096 count=1 skip=$P 2>/dev/null" > $OUT/page_$A.bin 2>/dev/null
  SZ=$(stat -f%z $OUT/page_$A.bin 2>/dev/null || echo 0)
  echo "0x$A (page $P) → $SZ bytes"
done
dsh "cat /proc/$PID/maps" > $OUT/maps_final.txt 2>/dev/null
dsh "echo 0 > /sys/kernel/tracing/instances/guard2/set_event_pid"
ls -la $OUT/ | head -10
