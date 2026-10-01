#!/system/bin/sh
# sweep660.sh <pid> <addr> — 우선순위 tid 스윕으로 0x183660 작성자 특정 (§166)
PID=$1; ADDR=$2
P=/sys/module/hide_kmod/parameters
LOG=/data/local/tmp/sweep660.log
: > $LOG
PRIO=""
for t in /proc/$PID/task/*; do
  c=$(cat $t/comm 2>/dev/null)
  case "$c" in
    dword|internal) PRIO="$PRIO ${t##*/}" ;;
  esac
done
for t in /proc/$PID/task/*; do
  c=$(cat $t/comm 2>/dev/null)
  case "$c" in Thread-*|npth_*|NPTH-*) PRIO="$PRIO ${t##*/}" ;; esac
done
for t in /proc/$PID/task/*; do
  c=$(cat $t/comm 2>/dev/null)
  case "$c" in RxCached*) PRIO="$PRIO ${t##*/}" ;; esac
done
echo "PRIO=$PRIO" >> $LOG
WINNER=""
for T in $PRIO; do
  [ -d /proc/$PID/task/$T ] || continue
  H0=$(cat $P/hwbp_hits)
  echo $T > $P/hwbp_pid
  echo $ADDR > $P/hwbp_addr
  echo 1 > $P/hwbp_type
  echo 8 > $P/hwbp_len
  echo 1 > $P/hwbp_go
  sleep 0.4
  H1=$(cat $P/hwbp_hits)
  D=$((H1 - H0))
  echo "SWEEP tid=$T comm=$(cat /proc/$PID/task/$T/comm 2>/dev/null) delta=$D" >> $LOG
  if [ $D -gt 500 ]; then WINNER=$T; break; fi
  [ -d /proc/$PID ] || { echo "APP_DIED" >> $LOG; break; }
done
if [ -n "$WINNER" ]; then
  echo "WINNER=$WINNER — 사멸까지 유지" >> $LOG
  N=0
  while [ -d /proc/$PID ] && [ $N -lt 60 ]; do sleep 0.5; N=$((N+1)); done
fi
echo 0 > $P/hwbp_pid
echo 0 > $P/hwbp_addr
echo 1 > $P/hwbp_go
echo "FINAL_HITS=$(cat $P/hwbp_hits)" >> $LOG
echo "SWEEP_DONE" >> $LOG
