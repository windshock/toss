#!/system/bin/sh
# .toss_heap2.sh — anon 힙 조기·반복 스냅샷 (문자열 DIFF로 활성 체크 특정)
OUT=/data/local/tmp/heap2
rm -rf $OUT; mkdir -p $OUT
PKG=viva.republica.toss
dump_anon() {
  T=$1; P=$2
  cp /proc/$P/maps $OUT/maps_$T.txt 2>/dev/null || return 1
  grep -E '^[0-9a-f]+-[0-9a-f]+ rw-p 00000000 00:00 0 ' /proc/$P/maps | while IFS= read -r line; do
    R=${line%% *}
    S=$((16#${R%-*})); E=$((16#${R#*-}))
    SZ=$((E-S))
    [ $SZ -gt $((16*1024*1024)) ] && continue
    [ $SZ -lt 65536 ] && continue
    dd if=/proc/$P/mem bs=4096 skip=$((S/4096)) count=$((SZ/4096)) of=$OUT/an_${T}_$((S/4096)).bin 2>/dev/null
  done
  return 0
}
P=""
while true; do
  P=$(pidof $PKG | cut -d' ' -f1)
  [ -n "$P" ] && break
  sleep 0.05
done
T0=$(date +%s)
echo "start $P $T0" > $OUT/log
for T in a b c d e f; do
  dump_anon $T $P && echo "snap $T $(date +%s)" >> $OUT/log
  sleep 3
  [ -d /proc/$P ] || { echo "death $(date +%s)" >> $OUT/log; break; }
done
echo end >> $OUT/log
