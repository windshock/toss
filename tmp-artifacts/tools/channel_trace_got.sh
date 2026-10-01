#!/bin/bash
set -e
export PATH="$HOME/Library/Android/sdk/platform-tools:$PATH"
export ANDROID_SERIAL=emulator-5554
PKG="viva.republica.toss"
ACT="viva.republica.toss/.splash.SplashActivity"
SEC=20

DEV=/data/local/tmp/.chtrace.sh
cat > /tmp/.chtrace.sh <<INNER_EOF
#!/system/bin/sh
PKG="viva.republica.toss"
ACT="viva.republica.toss/.splash.SplashActivity"
SEC=20
GLOBAL_T=/sys/kernel/tracing
T=/sys/kernel/tracing/instances/chan19

LIBA=\$(ls /data/app/*/viva.republica.toss-*/lib/arm64/libea56.so | head -n 1)
if [ -z "\$LIBA" ]; then
  echo "Error: libea56.so not found!"
  exit 1
fi
echo "Target libea56: \$LIBA"

echo 0 > \$T/tracing_on; echo 0 > \$T/events/enable 2>/dev/null; echo > \$T/set_event_pid 2>/dev/null
echo nop > \$T/current_tracer 2>/dev/null; echo > \$GLOBAL_T/kprobe_events 2>/dev/null; echo > \$GLOBAL_T/uprobe_events 2>/dev/null
echo 65536 > \$T/buffer_size_kb 2>/dev/null

echo "p:got_call \${LIBA}:0xaff98 target=%x8" >> \$GLOBAL_T/uprobe_events
echo "p:got_ret \${LIBA}:0xaffb8 ret_val=%x23" >> \$GLOBAL_T/uprobe_events
echo 1 > \$T/options/event-fork 2>/dev/null

am force-stop \$PKG; sleep 1; am start -n "\$ACT" >/dev/null 2>&1
P=""; while :; do P=\$(pidof \$PKG | tr ' ' '\n' | head -1); [ -n "\$P" ] && break; done

TIDS=""; for p in \$(pidof \$PKG); do for t in \$(ls /proc/\$p/task 2>/dev/null); do TIDS="\$TIDS \$t"; done; done
echo "\$TIDS" > \$T/set_event_pid 2>/dev/null
echo 1 > \$T/events/uprobes/enable
echo > \$T/trace; echo 1 > \$T/tracing_on

i=0; while [ \$i -lt \$SEC ]; do 
  pidof \$PKG >/dev/null 2>&1 || break
  TIDS=""; for p in \$(pidof \$PKG); do for t in \$(ls /proc/\$p/task 2>/dev/null); do TIDS="\$TIDS \$t"; done; done
  echo "\$TIDS" > \$T/set_event_pid 2>/dev/null; sleep 1; i=\$((i+1)); 
done

echo 0 > \$T/tracing_on; cat \$T/trace > /data/local/tmp/.chtrace.out
echo "PID=\$P END=\${i}s LINES=\$(wc -l < /data/local/tmp/.chtrace.out)"
INNER_EOF

adb push /tmp/.chtrace.sh "$DEV" >/dev/null
adb shell "su 0 sh $DEV"
adb shell 'cat /data/local/tmp/.chtrace.out' > /tmp/chtrace_got.out
echo "Done. Lines captured:"
wc -l /tmp/chtrace_got.out
tail -n 20 /tmp/chtrace_got.out
