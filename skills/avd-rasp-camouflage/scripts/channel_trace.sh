#!/bin/bash
# channel_trace.sh — RASP 탐지채널 실측 (ftrace, native 문자열 은닉과 무관)
#
# 신버전 AppSuit는 native 탐지 문자열을 런타임 바이트구성+dlsym으로 은닉(STL/평문 아님)
# → 정적으로 안 읽힘. 대신 원본 앱의 파일접근(getname)·프롭조회(__system_property_find)를
# ftrace로 캡처해 su-family/goldfish/cpuinfo/ro.boot.qemu 등 채널을 그대로 뽑는다.
#
# 사용: channel_trace.sh <pkg> <activity> [seconds=20]
#   반드시 원본(비-neutered) 앱에 대해 실행 — neutered는 탐지가 안 돌아 채널이 안 보인다.
# 예:  channel_trace.sh com.hanabank.oqf com.hanabank.oqf/.app.feature.splash.presentation.SplashActivity
set -e
PKG="${1:?usage: channel_trace.sh <pkg> <activity> [seconds]}"
ACT="${2:?activity component 필요}"
SEC="${3:-20}"
export PATH="$HOME/Library/Android/sdk/platform-tools:$PATH"
LIBC=/apex/com.android.runtime/lib64/bionic/libc.so
# __system_property_find 오프셋: 다른 이미지면 재계산 필요
POFF="${PROP_OFF:-0x6335c}"

DEV=/data/local/tmp/.chtrace.sh
cat > /tmp/.chtrace.sh <<EOF
#!/system/bin/sh
T=/sys/kernel/tracing
echo 0 > \$T/tracing_on; echo 0 > \$T/events/enable 2>/dev/null; echo > \$T/set_event_pid 2>/dev/null
echo nop > \$T/current_tracer 2>/dev/null; echo > \$T/kprobe_events 2>/dev/null; echo > \$T/uprobe_events 2>/dev/null
echo 65536 > \$T/buffer_size_kb 2>/dev/null
echo 'p:mo_path getname_flags path=+0(%x0):ustring' >> \$T/kprobe_events
echo 'p:mo_uname __arm64_sys_newuname' >> \$T/kprobe_events
echo 'p:mo_sinfo __arm64_sys_sysinfo' >> \$T/kprobe_events
echo "p:mo_prop ${LIBC}:${POFF} name=+0(%x0):string" >> \$T/uprobe_events
echo 1 > \$T/options/event-fork 2>/dev/null
am force-stop $PKG; sleep 1; am start -n "$ACT" >/dev/null 2>&1
P=""; while :; do P=\$(pidof $PKG | tr ' ' '\n' | head -1); [ -n "\$P" ] && break; done
TIDS=""; for p in \$(pidof $PKG); do for t in \$(ls /proc/\$p/task 2>/dev/null); do TIDS="\$TIDS \$t"; done; done
echo "\$TIDS" > \$T/set_event_pid 2>/dev/null
echo 1 > \$T/events/kprobes/enable; echo 1 > \$T/events/uprobes/enable; echo 1 > \$T/events/signal/signal_generate/enable
echo > \$T/trace; echo 1 > \$T/tracing_on
i=0; while [ \$i -lt $SEC ]; do pidof $PKG >/dev/null 2>&1 || break
  TIDS=""; for p in \$(pidof $PKG); do for t in \$(ls /proc/\$p/task 2>/dev/null); do TIDS="\$TIDS \$t"; done; done
  echo "\$TIDS" > \$T/set_event_pid 2>/dev/null; sleep 1; i=\$((i+1)); done
echo 0 > \$T/tracing_on; cat \$T/trace > /data/local/tmp/.chtrace.out
echo "PID=\$P END=\${i}s LINES=\$(wc -l < /data/local/tmp/.chtrace.out)"
EOF
adb push /tmp/.chtrace.sh "$DEV" >/dev/null
adb shell "su 0 sh $DEV"
adb shell 'cat /data/local/tmp/.chtrace.out' > /tmp/chtrace.out
paths(){ grep 'mo_path' /tmp/chtrace.out | grep -v 'path=(fault)' | grep -oE 'path="[^"]*"' | sed 's/path=//;s/"//g'; }
echo "── su/root (앱 자체 ahnlab 파일 제외) ──"
paths | grep -viE '/data/(data|user)|/apex|/system/fonts' | grep -iE '/su$|/su[0-9]|daemonsu|magisk|superuser|sugote|supolicy|/su/|tegrak' | sort -u | head -30
echo "── 에뮬레이터 ──"
paths | grep -iE 'goldfish|ranchu|qemu|cpuinfo|cpufreq|/proc/misc|bstk|nox|mumu|vbox|genymotion' | sort -u | head -20
echo "── 안티디버그/프리다 ──"
paths | grep -iE '/proc/self/(status|maps|mounts|cmdline)|/proc/net/(unix|tcp)|frida' | sort -u | head
echo "── 프롭 조회 ──"
grep 'mo_prop' /tmp/chtrace.out | grep -oE 'name="[^"]*"' | sed 's/name=//;s/"//g' | grep -iE 'qemu|goldfish|ranchu|ro\.(kernel|hardware|product|build|boot|secure|debuggable)|serialno' | sort | uniq -c | sort -rn | head
echo "── 사망 신호 ──"
grep 'signal_generate' /tmp/chtrace.out | grep -vE 'sig=17' | tail -3
