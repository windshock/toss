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
while [ $i -lt 150 ]; do RW=$(grep libea56 /proc/$PID/maps 2>/dev/null | grep 'rw-p' | head -1 | cut -d- -f1); [ -n "$RW" ] && break; i=$((i+1)); sleep 0.02; done
[ -z "$RW" ] && { echo NOBASE; exit 1; }
# blob page: rw base(libea56+0x174000) + (0x184000-0x174000)=0x10000
PG=$(printf '0x%x' $((0x$RW + 0x10000)))
echo $PID > $P/pagewatch_pid
echo $PG > $P/pagewatch_addr
echo 1 > $P/pagewatch_go
echo "ARMED pid=$PID blob_page=$PG"
N=0
while [ -d /proc/$PID ] && [ $N -lt 80 ]; do sleep 0.25; N=$((N+1)); done
echo 0 > $P/pagewatch_pid
echo 0 > $P/pagewatch_addr
echo 1 > $P/pagewatch_go
echo "DIED n=$N hits=$(cat $P/pagewatch_hits)"
dmesg | grep -E '^PW ' > /data/local/tmp/pw_blob.txt
echo "PW_LINES=$(wc -l < /data/local/tmp/pw_blob.txt)"
