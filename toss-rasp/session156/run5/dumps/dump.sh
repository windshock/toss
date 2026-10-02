#!/system/bin/sh
PID=$1; D=$2; SET=$3
dump_region() {
  pat=$1; pre=$2; cap=$3
  grep "$pat" /proc/$PID/maps 2>/dev/null | grep 'rw' | while read -r line; do
    RANGE=$(echo "$line" | awk '{print $1}')
    S=$((0x$(echo $RANGE | cut -d- -f1))); E=$((0x$(echo $RANGE | cut -d- -f2)))
    SZ=$(( (E - S) / 1048576 )); [ $SZ -gt $cap ] && SZ=$cap; [ $SZ -eq 0 ] && SZ=1
    dd if=/proc/$PID/mem of=$D/${pre}_$(printf %x $S).bin bs=4096 skip=$((S/4096)) count=$((SZ*256)) 2>/dev/null
  done
}
if [ "$SET" = full ]; then
  dump_region "dalvik-main space" heap_main 48
  dump_region "LinearAlloc" heap_lin 16
  dump_region "libea56" libea56_rw 4
  dump_region "scudo" heap_scudo 24
  dump_region "large object space" heap_los 16
else
  dump_region "libea56" libea56_rw 4
  dump_region "LinearAlloc" heap_lin 16
fi
