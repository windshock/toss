#!/bin/bash
# guard_capture.sh — [O]-1a: 사망창 시퀀스 캡처 (sys_enter 전체 + process_vm_readv 원격주소 + getname)
# 사용: guard_capture.sh <런번호>
# 산출: /tmp/guard_run<N>/trace.txt, maps_T0.txt, maps_T9.txt
set -u
export ANDROID_SERIAL=emulator-5554
ADB=~/Library/Android/sdk/platform-tools/adb
PKG=viva.republica.toss
N=${1:-1}
OUT=/tmp/guard_run$N
mkdir -p $OUT

dsh() { $ADB shell "$1"; }

# [1] 인스턴스 구성
dsh "T=/sys/kernel/tracing; G=\$T/instances/guard2; mkdir -p \$G
cd \$T
grep -q p_gn2 kprobe_events 2>/dev/null || echo 'p:p_gn2 getname_flags path=+0(%x0):ustring' >> kprobe_events
grep -q p_pvm2 kprobe_events 2>/dev/null || echo 'p:p_pvm2 __arm64_sys_process_vm_readv pid=+0(%x0):x64 rbase=+0(+0x18(%x0)):x64 rlen=+0x8(+0x18(%x0)):x64' >> kprobe_events
grep -q p_kil2 kprobe_events 2>/dev/null || echo 'p:p_kil2 __arm64_sys_kill sig=+0x8(%x0):x64' >> kprobe_events
echo 0 > \$G/tracing_on
echo 65536 > \$G/buffer_size_kb
echo > \$G/trace 2>/dev/null
echo 1 > \$G/tracing_on
echo 1 > \$G/events/kprobes/p_gn2/enable
echo 1 > \$G/events/kprobes/p_pvm2/enable
echo 1 > \$G/events/kprobes/p_kil2/enable
echo 1 > \$G/events/raw_syscalls/sys_enter/enable
echo CLEAN_OK"

# [2] 런 시작 — 조기 pid 포착 (0.2~0.5s)
dsh "am force-stop $PKG" >/dev/null 2>&1; sleep 1
dsh "am start -n $PKG/.splash.SplashActivity" >/dev/null 2>&1
PID=""
for i in $(seq 1 50); do
  PID=$(dsh "pidof $PKG" | tr -d '\r' | tr -d ' ')
  [ -n "$PID" ] && break
  sleep 0.1
done
[ -z "$PID" ] && { echo "PID_NOT_FOUND"; exit 1; }
T0=$(date +%s)
echo "run#$N pid=$PID T0=$T0"

# [3] pid 트리 등록 (event-fork로 자식 상속) + 즉시 maps
dsh "echo $PID > /sys/kernel/tracing/instances/guard2/set_event_pid"
dsh "cat /proc/$PID/maps" > $OUT/maps_T0.txt 2>/dev/null

# [4] T+9s maps (libea56 로드 후, 판정 직전)
sleep 8
dsh "cat /proc/$PID/maps" > $OUT/maps_T9.txt 2>/dev/null

# [5] 사망 대기 (최대 25s)
for i in $(seq 1 25); do
  P=$(dsh "pidof $PKG" | tr -d '\r')
  [ -z "$P" ] && break
  sleep 1
done
T1=$(date +%s)
echo "died: T+$((T1-T0))s"

# [6] trace 덤프
dsh "echo 0 > /sys/kernel/tracing/instances/guard2/tracing_on"
dsh "cat /sys/kernel/tracing/instances/guard2/trace" > $OUT/trace.txt 2>/dev/null
dsh "echo 0 > /sys/kernel/tracing/instances/guard2/set_event_pid"
wc -l $OUT/trace.txt
