#!/system/bin/sh
# toss-uid 전 프로세스 사유 힙 원샷 덤퍼 (게스트 로컬 — adb 왕복 없음)
D=/data/local/tmp/lf
rm -rf $D; mkdir -p $D
ps -A -o UID,PID 2>/dev/null | awk '$1==10179{print $2}' | while read PID; do
  C=$(cat /proc/$PID/comm 2>/dev/null | tr -d '\r')
  echo "$PID $C" >> $D/procs.txt
  grep ' rw-p ' /proc/$PID/maps 2>/dev/null | while read PERM REST; do
    LINE="$PERM $REST"
    case "$LINE" in
      *boot.art*|*boot-*oat*|*dalvik-*|*/system/*|*/apex/*|*.oat|*memfd:jit*|*ashmem*|*linker64*) continue;;
    esac
    R=$(echo "$PERM" | awk '{print $1}')
    S=$(echo "$R" | cut -d- -f1)
    SZ=$(( (0x$(echo "$R" | cut -d- -f2) - 0x$S) / 1048576 ))
    [ $SZ -gt 16 ] && SZ=16; [ $SZ -eq 0 ] && SZ=1
    dd if=/proc/$PID/mem of=$D/p${PID}_$S.bin bs=4096 skip=$((0x$S/4096)) count=$((SZ*256)) 2>/dev/null
  done
done
echo DONE $(ls $D | wc -l)
