#!/system/bin/sh
# $1=cmd — 인스턴스 truncate는 웨지 유발(§139 실증): reset=재생성
B=/sys/kernel/tracing/instances
T=$B/s139
case "$1" in
  reset)
    echo 0 > $T/events/raw_syscalls/sys_enter/enable 2>/dev/null
    echo 0 > $T/events/raw_syscalls/sys_exit/enable 2>/dev/null
    rmdir $T 2>/dev/null
    mkdir $T
    echo 8192 > $T/buffer_size_kb
    echo 1 > $T/tracing_on
    echo 1 > /sys/kernel/tracing/tracing_on
    ;;
  armall)
    echo 1 > $T/events/raw_syscalls/sys_enter/enable
    echo 1 > $T/events/raw_syscalls/sys_exit/enable
    echo "E=$(cat $T/events/raw_syscalls/sys_enter/enable) P=$(ls $T/per_cpu/cpu0/ | wc -l)"
    ;;
  stop)
    echo 0 > $T/events/raw_syscalls/sys_enter/enable
    echo 0 > $T/events/raw_syscalls/sys_exit/enable
    ;;
  verify)
    echo "E=$(cat $T/events/raw_syscalls/sys_enter/enable) P=$(ls $T/per_cpu/cpu0/ | wc -l)"
    ;;
esac
