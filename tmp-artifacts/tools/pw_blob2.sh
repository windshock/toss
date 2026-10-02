#!/system/bin/sh
P=/sys/module/hide_kmod/parameters
am force-stop viva.republica.toss >/dev/null 2>&1
sleep 0.5
am start -n viva.republica.toss/.splash.SplashActivity >/dev/null 2>&1
PID=""
i=0
while [ $i -lt 100 ]; do PID=$(pidof viva.republica.toss 2>/dev/null | awk '{print $1}'); [ -n "$PID" ] && break; i=$((i+1)); sleep 0.02; done
[ -z "$PID" ] && { echo NOPID; exit 1; }
RW=""
i=0
while [ $i -lt 200 ]; do RW=$(grep libea56 /proc/$PID/maps 2>/dev/null | grep 'rw-p' | tail -1 | cut -d- -f1); [ -n "$RW" ] && break; i=$((i+1)); sleep 0.005; done
[ -z "$RW" ] && { echo NOBASE; exit 1; }
# RW = libea56+0x174000(마지막 rw 라인). blob page = RW + 0x10000. RW는 10자리 헥스: [0:2]+[2:]
PL=$(( ((0x${RW:2} + 0x10000) / 4096) * 4096 ))
PG="${RW:0:2}$(awk -v d=$PL 'BEGIN{printf "%08x", d}')"
echo $PID > $P/pagewatch_pid
echo 0x$PG > $P/pagewatch_addr
echo 1 > $P/pagewatch_go
echo "ARMED pid=$PID RW=0x$RW blob_page=0x$PG"
N=0
while [ -d /proc/$PID ] && [ $N -lt 80 ]; do sleep 0.25; N=$((N+1)); done
echo 0 > $P/pagewatch_pid
echo 0 > $P/pagewatch_addr
echo 1 > $P/pagewatch_go
echo "DIED n=$N hits=$(cat $P/pagewatch_hits)"
