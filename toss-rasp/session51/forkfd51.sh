#!/system/bin/sh
OUT=/sdcard/forkfd51
rm -rf $OUT; mkdir -p $OUT
MAIN=""
while [ -z "$MAIN" ]; do
  MAIN=$(ps -A -o UID,PID,NAME 2>/dev/null | awk '$1==10176 && $3=="viva.republica.toss"{print $2; exit}')
  [ -z "$MAIN" ] && sleep 0.02
done
# 자식 탄생 감시 → 즉시 부모+자식 fd 테이블 캡처
CH=""; N=0
while [ $N -lt 300 ]; do
  N=$((N+1))
  CH=$(ps -A -o UID,PID,NAME 2>/dev/null | awk -v m=$MAIN '$1==10176 && $2!=m {print $2; exit}')
  [ -n "$CH" ] && break
  sleep 0.02
done
for WHO in $MAIN $CH; do
  [ -d /proc/$WHO/fd ] || continue
  ls /proc/$WHO/fd 2>/dev/null | while read F; do
    echo "$F -> $(readlink /proc/$WHO/fd/$F 2>/dev/null)"
  done > $OUT/fd_$WHO.txt
done
echo "main=$MAIN child=$CH" > $OUT/log
cat $OUT/log
