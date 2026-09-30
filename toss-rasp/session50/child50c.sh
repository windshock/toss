#!/system/bin/sh
I=/sys/kernel/tracing/instances/child50c
rm -rf $I 2>/dev/null
mkdir /sys/kernel/tracing/instances/child50c 2>/dev/null || exit 1
MAIN=""
while [ -z "$MAIN" ]; do
  MAIN=$(ps -A -o UID,PID,NAME 2>/dev/null | awk '$1==10176 && $3=="viva.republica.toss"{print $2; exit}')
  [ -z "$MAIN" ] && sleep 0.03
done
echo 1 > $I/events/raw_syscalls/sys_enter/enable
echo 32768 > $I/buffer_size_kb
CH=""; N=0
while [ $N -lt 240 ]; do
  N=$((N+1))
  CH=$(ps -A -o UID,PID,NAME 2>/dev/null | awk -v m=$MAIN '$1==10176 && $2!=m {print $2; exit}')
  [ -n "$CH" ] && break
  sleep 0.03
done
[ -z "$CH" ] && { echo nochild; exit 1; }
# 자식 스레드 전부
ls /proc/$CH/task 2>/dev/null > $I/set_event_pid
echo 1 > $I/tracing_on
echo "child=$CH main=$MAIN"
sleep 9
echo 0 > $I/tracing_on
echo "lines=$(wc -l < $I/trace)"
