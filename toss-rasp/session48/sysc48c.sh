#!/system/bin/sh
I=/sys/kernel/tracing/instances/sysc48c
rm -rf $I 2>/dev/null
mkdir /sys/kernel/tracing/instances/sysc48c 2>/dev/null || exit 1
PID=""
while [ -z "$PID" ]; do
  PID=$(ps -A -o UID,PID,NAME 2>/dev/null | awk '$1==10176 && $3=="viva.republica.toss"{print $2; exit}')
  [ -z "$PID" ] && sleep 0.03
done
echo 1 > $I/events/raw_syscalls/sys_enter/enable
echo 65536 > $I/buffer_size_kb
for W in 1 3 5 8; do
  sleep 1
  ls /proc/$PID/task 2>/dev/null > $I/set_event_pid
done
sleep 9
echo 0 > $I/tracing_on
echo "lines: $(wc -l < $I/trace)"
