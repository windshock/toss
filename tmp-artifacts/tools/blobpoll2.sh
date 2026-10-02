#!/system/bin/sh
PKG=viva.republica.toss
am force-stop $PKG >/dev/null 2>&1; sleep 0.3
am start -n $PKG/.splash.SplashActivity >/dev/null 2>&1
PID=""
i=0
while [ $i -lt 300 ]; do PID=$(pidof $PKG 2>/dev/null | awk '{print $1}'); [ -n "$PID" ] && break; i=$((i+1)); sleep 0.005; done
[ -z "$PID" ] && { echo NOPID; exit 1; }
i=0
while [ $i -lt 600 ]; do
  RW=$(grep libea56 /proc/$PID/maps 2>/dev/null | grep 'rw-p' | tail -1 | cut -d- -f1)
  [ -n "$RW" ] && break; i=$((i+1))
done
[ -z "$RW" ] && { echo NOBASE; exit 1; }
PL=$(( ((0x${RW:2} + 0x10000) / 4096) * 4096 ))
PAGE="${RW:0:2}$(awk -v d=$PL 'BEGIN{printf "%08x", d}')"
echo "PID=$PID RW=0x$RW PAGE=$PAGE"
D=/data/local/tmp/bp; rm -f $D/*.bin $D/idx.txt
n=0
while [ $n -lt 400 ] && [ -d /proc/$PID ]; do
  /data/local/tmp/memread $PID $PAGE 2000 $D/s$n.bin >/dev/null 2>&1
  echo $n $(cut -d' ' -f1 /proc/uptime) >> $D/idx.txt
  n=$((n+1))
done
echo "DONE n=$n"
