#!/system/bin/sh
OUT=/sdcard/dump47
rm -rf $OUT; mkdir -p $OUT
PID=""
while [ -z "$PID" ]; do
  PID=$(ps -A -o UID,PID,NAME 2>/dev/null | awk '$1==10176 && $3=="viva.republica.toss"{print $2; exit}')
  [ -z "$PID" ] && PID=$(ps -A 2>/dev/null | awk '$NF=="viva.republica.toss"{print $2; exit}')
  [ -z "$PID" ] && sleep 0.05
done
sleep 2
cp /proc/$PID/maps $OUT/maps.txt 2>/dev/null || exit 1
echo "pid $PID" > $OUT/log
FW=$(grep " rw.*libea56.so$" $OUT/maps.txt | head -1 | cut -d' ' -f1)
[ -z "$FW" ] && { echo "noFW" >> $OUT/log; exit 1; }
A1=$(echo $FW | cut -d- -f1); A2=$(echo $FW | cut -d- -f2)
P1=$((0x${A1%???})); P2=$((0x${A2%???}))
dd if=/proc/$PID/mem bs=4096 skip=$P1 count=$((P2-P1)) of=$OUT/data.bin 2>>$OUT/log
echo "data $((P2-P1))p" >> $OUT/log
# 다음 줄이 [anon:.bss]인지 확인 후 덤프
NX=$(grep -A1 "$FW" $OUT/maps.txt | sed -n 2p)
echo "next: $NX" >> $OUT/log
case "$NX" in
  *anon:.bss*)
    B1=$(echo $NX | cut -d' ' -f1 | cut -d- -f1)
    B2=$(echo $NX | cut -d' ' -f1 | cut -d- -f2)
    Q1=$((0x${B1%???})); Q2=$((0x${B2%???}))
    dd if=/proc/$PID/mem bs=4096 skip=$Q1 count=$((Q2-Q1)) of=$OUT/bss.bin 2>>$OUT/log
    echo "bss $((Q2-Q1))p" >> $OUT/log
    ;;
esac
echo done >> $OUT/log
