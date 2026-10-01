#!/system/bin/sh
# gdt.sh W_cs — pid 인지 → +W 센티초 후 SIGSTOP → 사유 힙 덤프 (cs 정밀)
WCS=${1:-1075}
D=/data/local/tmp/lf
am force-stop viva.republica.toss; sleep 1
am start -n viva.republica.toss/.splash.SplashActivity >/dev/null 2>&1
T0=0
for i in $(seq 1 100); do
  P=$(pidof viva.republica.toss 2>/dev/null)
  [ -n "$P" ] && { T0=$(awk '{n=$1*100; printf "%d", n}' /proc/uptime); break; }
  sleep 0.05
done
[ -z "$T0" ] && { echo NOPID; exit 1; }
MAIN=$(echo $P | awk '{print $1}')
TGT=$((T0 + WCS))
# 정밀 대기 (cs 단위 busy-wait, 10s 전엔 느긋하게)
while :; do
  U=$(awk '{n=$1*100; printf "%d", n}' /proc/uptime)
  [ $U -ge $TGT ] && break
  [ $((TGT - U)) -gt 200 ] && sleep 0.1
done
kill -STOP $MAIN 2>/dev/null && echo "STOPPED t0=$T0 now=$U tgt=$TGT"
rm -rf $D; mkdir -p $D
ps -A -o UID,PID 2>/dev/null | awk '$1==10179{print $2}' | while read PID; do
  echo "$PID $(cat /proc/$PID/comm 2>/dev/null | tr -d '\r')" >> $D/procs.txt
  grep ' rw-p ' /proc/$PID/maps 2>/dev/null | while read PERM REST; do
    LINE="$PERM $REST"
    case "$LINE" in
      *boot.art*|*boot-*oat*|*/system/*|*/apex/*|*.oat|*memfd:jit*|*ashmem*|*linker64*) continue;;
    esac
    S=$(echo "$PERM" | cut -d- -f1)
    SZ=$(( (0x$(echo "$PERM" | cut -d- -f2) - 0x$S) / 1048576 ))
    if echo "$LINE" | grep -q "dalvik-main"; then SZ=48; else [ $SZ -gt 16 ] && SZ=16; fi
    [ $SZ -eq 0 ] && SZ=1
    dd if=/proc/$PID/mem of=$D/p${PID}_$S.bin bs=4096 skip=$((0x$S/4096)) count=$((SZ*256)) 2>/dev/null
  done
done
kill -CONT $MAIN 2>/dev/null
echo DONE $(ls $D | wc -l)
