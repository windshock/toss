#!/system/bin/sh
P=$1
i=0
while [ $i -lt 400 ]; do
  if [ ! -d /proc/$P/task ]; then echo "=== GONE i=$i ===" >> /data/local/tmp/fdpoll.log; break; fi
  echo "=== SNAP $i $(date +%s.%N) ===" >> /data/local/tmp/fdpoll.log
  for f in /proc/$P/fd/*; do
    t=$(readlink "$f" 2>/dev/null)
    [ -n "$t" ] && echo "$f -> $t" >> /data/local/tmp/fdpoll.log
  done
  i=$((i+1))
  sleep 0.02
done
