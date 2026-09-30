#!/system/bin/sh
OUT=/sdcard/libdump46k
rm -rf $OUT; mkdir -p $OUT
PID=""
while [ -z "$PID" ]; do
  PID=$(ps -A -o UID,PID,NAME 2>/dev/null | awk '$1==10176 && $3=="viva.republica.toss"{print $2; exit}')
  [ -z "$PID" ] && sleep 0.05
done
sleep 5
cp /proc/$PID/maps $OUT/maps.txt 2>/dev/null || { echo "nomaps" > $OUT/log; exit; }
echo "pid $PID" > $OUT/log
FW=$(grep " rw.*libea56.so$" $OUT/maps.txt | head -1 | cut -d' ' -f1)
[ -z "$FW" ] && { echo "noFW" >> $OUT/log; exit; }
FWA=$(echo $FW | cut -d- -f1)
FWP=$((0x${FWA%???}))
B0=$((FWP - 0x174)); B1=$((B0 + 0x1a0))
echo "FWP=$FWP B0=$B0" >> $OUT/log
grep -E '^[0-9a-f]+-[0-9a-f]+ rw' $OUT/maps.txt | while IFS= read -r line; do
  R2=$(echo $line | cut -d' ' -f1)
  A2=$(echo $R2 | cut -d- -f1); B2=$(echo $R2 | cut -d- -f2)
  P2=$((0x${A2%???})); Q2=$((0x${B2%???}))
  [ $P2 -lt $B0 ] && continue
  [ $P2 -ge $B1 ] && continue
  NP=$((Q2 - P2))
  [ $NP -lt 1 ] && continue
  dd if=/proc/$PID/mem bs=4096 skip=$P2 count=$NP of=$OUT/m_$P2.bin 2>/dev/null
  echo "p=$P2 n=$NP sz=$(ls -la $OUT/m_$P2.bin 2>/dev/null | awk '{print $5}')" >> $OUT/log
done
echo done >> $OUT/log
