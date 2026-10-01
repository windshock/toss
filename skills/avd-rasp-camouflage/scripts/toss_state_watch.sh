#!/system/bin/sh
# .t12_watch.sh v2 — 상태 변수 폴링 (32bit 안전 페이지 산술 + trace_marker 상관)
OUT=/data/local/tmp/t12
rm -rf $OUT; mkdir -p $OUT
PKG=viva.republica.toss
LIBNAME=libea56.so
O1=$((0x1821a0)); O2=$((0x185758)); O3=$((0x19e5e8)); O4=$((0x19e3c8)); O5=$((0x19e808))
readval() { # P PG OFF
  dd if=/proc/$1/mem bs=4096 skip=$2 count=1 2>/dev/null | tail -c +$(( $3 + 1 )) | head -c 4 | od -An -tx1 | tr -d ' \n'
}
P=""
while true; do
  P=$(pidof $PKG | cut -d' ' -f1)
  [ -n "$P" ] && break
  sleep 0.02
done
echo "start $P" > $OUT/log
R=""
W=0
while [ -z "$R" ] && [ $W -lt 150 ]; do
  R=$(grep "$LIBNAME" /proc/$P/maps 2>/dev/null | head -1 | cut -d- -f1)
  W=$((W+1))
  sleep 0.02
done
if [ -z "$R" ]; then echo "lib not mapped" >> $OUT/log; exit 1; fi
L=${#R}
if [ $L -gt 8 ]; then HI=$((16#${R:0:$((L-8))})); LO=$((16#${R: -8})); else HI=0; LO=$((16#$R)); fi
echo "base_hex=$R HI=$HI LO=$LO" >> $OUT/log
i=0
while [ -d /proc/$P ]; do
  i=$((i+1))
  PG0=$(( (HI + 1) * 1048576 + LO / 4096 ))
  OFF0=$(( LO % 4096 ))
  P1=$(( PG0 + (OFF0 + O1) / 4096 )); F1=$(( (OFF0 + O1) % 4096 ))
  P2=$(( PG0 + (OFF0 + O2) / 4096 )); F2=$(( (OFF0 + O2) % 4096 ))
  P3=$(( PG0 + (OFF0 + O3) / 4096 )); F3=$(( (OFF0 + O3) % 4096 ))
  P4=$(( PG0 + (OFF0 + O4) / 4096 )); F4=$(( (OFF0 + O4) % 4096 ))
  P5=$(( PG0 + (OFF0 + O5) / 4096 )); F5=$(( (OFF0 + O5) % 4096 ))
  V1=$(readval $P $P1 $F1); V2=$(readval $P $P2 $F2); V3=$(readval $P $P3 $F3)
  V4=$(readval $P $P4 $F4); V5=$(readval $P $P5 $F5)
  echo "$i $V1 $V2 $V3 $V4 $V5" >> $OUT/state.log
  echo "$i" > /sys/kernel/tracing/trace_marker 2>/dev/null
  sleep 0.05
done
echo "death" >> $OUT/log
