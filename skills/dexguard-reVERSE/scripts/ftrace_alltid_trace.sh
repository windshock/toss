#!/system/bin/sh
# toss 전체 tid syscall+경로 트레이스 (2차 관문)
T=/sys/kernel/tracing/instances/s139
B=/sys/kernel/tracing
rmdir $T 2>/dev/null; mkdir $T
echo 8192 > $T/buffer_size_kb
echo 1 > $T/tracing_on
# kprobe a2p 이미 존재(§62) — 그대로 사용
am force-stop viva.republica.toss
sleep 0.5
am start -n viva.republica.toss/.splash.SplashActivity >/dev/null 2>&1
P=""
i=0
while [ $i -lt 500 ]; do
  P=$(pidof viva.republica.toss)
  if [ -n "$P" ]; then
    case "$(cat /proc/$P/cmdline 2>/dev/null | tr '\0' ' ')" in
      *toss*) break ;;
      *) P="" ;;
    esac
  fi
  i=$((i+1)); sleep 0.02
done
echo "PID=$P t0=$(date +%s.%N)"
[ -z "$P" ] && { echo NOPID; exit 1; }
# tid 갱신 루프 (죽을 때까지 30ms)
(
  while [ -d /proc/$P/task ]; do
    TIDS=$(cd /proc/$P/task 2>/dev/null && ls | tr '\n' ' ')
    [ -n "$TIDS" ] && echo "$TIDS" > $T/set_event_pid 2>/dev/null
    sleep 0.03
  done
) &
REF=$!
echo 1 > $T/events/raw_syscalls/sys_enter/enable
echo 1 > $T/events/raw_syscalls/sys_exit/enable
echo 1 > $T/events/kprobes/a2p/enable
j=0
while [ $j -lt 1200 ]; do
  [ -d /proc/$P/task ] || break
  j=$((j+1)); sleep 0.1
done
kill $REF 2>/dev/null
echo 0 > $T/events/raw_syscalls/sys_enter/enable
echo 0 > $T/events/raw_syscalls/sys_exit/enable
echo 0 > $T/events/kprobes/a2p/enable
echo "DONE j=$j t1=$(date +%s.%N)"
