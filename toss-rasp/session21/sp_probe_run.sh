#!/system/bin/sh
T=/sys/kernel/tracing
I=$T/instances/chan19
echo 0 > $I/tracing_on
grep -q t20_sp $T/kprobe_events || echo 'p:t20_sp do_mem_abort far=%x0:x64 esr=%x1:x64 pc=+256(%x2):x64 lr=+240(%x2):x64 sp=+248(%x2):x64' >> $T/kprobe_events
echo 1 > $I/events/kprobes/enable
am force-stop viva.republica.toss; sleep 1
am start -n viva.republica.toss/.splash.SplashActivity >/dev/null 2>&1
P=""; i=0; while [ $i -lt 40 ]; do P=$(pidof viva.republica.toss | tr ' ' '\n' | head -1); [ -n "$P" ] && break; sleep 0.1; i=$((i+1)); done
echo "MAIN=$P"
TP=""; for t in $(ls /proc/$P/task 2>/dev/null); do TP="$TP $t"; done
echo "$TP" > $I/set_event_pid
cat /proc/$P/maps > /data/local/tmp/.t20.maps.sp 2>/dev/null
echo > $I/trace
echo 1 > $I/tracing_on
W=0
while [ $W -lt 200 ]; do
  [ -d /proc/$P ] || { echo "DEATH t=$(cut -d' ' -f1 /proc/uptime)"; break; }
  sleep 3; W=$((W+3))
done
echo 0 > $I/tracing_on
cat $I/trace > /data/local/tmp/.t20.trace.sp
echo "=== faults with far=0 or low far ==="
grep "t20_sp" /data/local/tmp/.t20.trace.sp | awk -v p=$P '$0 ~ "-"p" "' | grep -E "far=0x([0-9a-f]{1,5})\b" | head -5
echo DONE lines=$(wc -l < /data/local/tmp/.t20.trace.sp)
