#!/system/bin/sh
# snipe660.sh <pid> <addr> — 단기생 가드 스레드(dword/internal/Thread-*/npth) 등장 즉시 무장·0.3s 관측 (§166)
PID=$1; ADDR=$2
P=/sys/module/hide_kmod/parameters
LOG=/data/local/tmp/snipe660.log
: > $LOG
N=0
while [ -d /proc/$PID ] && [ $N -lt 400 ]; do
  N=$((N+1))
  for t in /proc/$PID/task/*; do
    c=$(cat $t/comm 2>/dev/null)
    case "$c" in
      dword|internal|Thread-[0-9]*|npth_*|NPTH-*|RxCachedThreadS*|RxCachedWorkerP*|Jit*)
        T=${t##*/}
        H0=$(cat $P/hwbp_hits)
        echo $T > $P/hwbp_pid
        echo $ADDR > $P/hwbp_addr
        echo 1 > $P/hwbp_type
        echo 8 > $P/hwbp_len
        echo 1 > $P/hwbp_go
        echo "SNIPE comm=$c tid=$T h0=$H0" >> $LOG
        sleep 0.3
        H1=$(cat $P/hwbp_hits)
        echo "  -> delta=$((H1-H0)) alive=$([ -d /proc/$PID/task/$T ] && echo yes || echo no)" >> $LOG
        echo 0 > $P/hwbp_pid
        echo 0 > $P/hwbp_addr
        echo 1 > $P/hwbp_go
        ;;
    esac
  done
  sleep 0.05
done
echo "SNIPE_DONE final_hits=$(cat $P/hwbp_hits)" >> $LOG
