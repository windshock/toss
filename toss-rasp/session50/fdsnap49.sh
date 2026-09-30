#!/system/bin/sh
OUT=/sdcard/fdsnap49
rm -rf $OUT; mkdir -p $OUT
PID=""
while [ -z "$PID" ]; do
  PID=$(ps -A -o UID,PID,NAME 2>/dev/null | awk '$1==10176 && $3=="viva.republica.toss"{print $2; exit}')
  [ -z "$PID" ] && sleep 0.03
done
for SNAP in 1 2 3 4; do
  sleep 1.5
  [ -d /proc/$PID/fd ] || break
  D=$OUT/s$SNAP; mkdir -p $D
  ls /proc/$PID/fd 2>/dev/null | while read F; do
    T=$(readlink /proc/$PID/fd/$F 2>/dev/null)
    echo "$F -> $T" >> $D/links.txt
  done
done
echo done > $OUT/log
