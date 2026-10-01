#!/system/bin/sh
# toss_child_scan.sh — 토스 fork 자식 스캔 전수 + 조용한 exit 트리거 캡처 (19차)
#
# 사용(호스트): adb shell "sh /data/local/tmp/.toss_child_scan.sh" [백그라운드 권장]
# 사전조건: chan19 ftrace instance + kprobe 등록(재부팅마다 1회):
#   T=/sys/kernel/tracing; I=$T/instances/chan19; mkdir -p $I
#   grep -q p19_gn $T/kprobe_events || echo 'p:p19_gn getname_flags path=+0(%x0):ustring' >> $T/kprobe_events
#   grep -q p19_eg  $T/kprobe_events || echo 'p:p19_eg __arm64_sys_exit_group' >> $T/kprobe_events
#   echo 1 > $I/events/kprobes/enable
#   echo 1 > $I/events/sched/sched_process_fork/enable
#   echo 1 > $I/events/sched/sched_process_exit/enable
#   echo 1 > $I/events/signal/signal_generate/enable
#   echo 1 > $I/options/event-fork; echo 16384 > $I/buffer_size_kb; echo mono > $I/trace_clock
# 주의: kprobe_events는 append만(전역 공유 — clear 금지). instance는 재부팅마다 소멸.
# 원리: 메인 tid 선기록 + event-fork로 자식 자동추가. 모니터 루프에서 새 toss pid는
# append-only로 추가(재기록하면 자식이 축출됨). 60초마다 스냅샷(스톰 시 버퍼 랩 방지).
# t19cap4.sh — 경량 프로브 + 부하 모니터 + 60s 주기 스냅샷
T=/sys/kernel/tracing
I=$T/instances/chan19
echo 0 > $I/tracing_on
# 경량화: do_filp_open 이중프로브 비활성(인스턴스 한정)
echo 0 > $I/events/kprobes/p19_fo/enable 2>/dev/null
echo 0 > $I/events/kprobes/r19_for/enable 2>/dev/null
am force-stop viva.republica.toss
sleep 1
am start -n viva.republica.toss/.splash.SplashActivity >/dev/null 2>&1
P=""; i=0
while [ $i -lt 40 ]; do P=$(pidof viva.republica.toss | tr ' ' '\n' | head -1); [ -n "$P" ] && break; sleep 0.1; i=$((i+1)); done
[ -n "$P" ] || { echo "NOPID"; exit 1; }
echo "$P" > /data/local/tmp/.t19.main
TP=""; for t in $(ls /proc/$P/task 2>/dev/null); do TP="$TP $t"; done
echo "$TP" > $I/set_event_pid
echo > $I/trace
echo 1 > $I/tracing_on
echo "MAIN=$P"
S=/data/local/tmp/.t19.status; : > $S
SEEN="$P"; W=0; N=0
while [ $W -lt 900 ]; do
  NOW=$(cut -d' ' -f1 /proc/uptime)
  LOAD=$(cut -d' ' -f1 /proc/loadavg)
  ALIVE=dead; [ -d /proc/$P ] && ALIVE=alive
  for K in $(pidof viva.republica.toss); do
    case " $SEEN " in *" $K "*) ;; *) SEEN="$SEEN $K"
      KT=$(ls /proc/$K/task 2>/dev/null | tr '\n' ' ')
      CUR=$(cat $I/set_event_pid 2>/dev/null)
      echo "$CUR $KT" > $I/set_event_pid 2>/dev/null ;;
    esac
  done
  KIDS=$(ps -A -o PID,PPID,NAME | grep viva.republica.toss | awk -v m=$P '$1!=m {print $1":"$2}' | tr '\n' ',')
  TOP=$(dumpsys activity activities 2>/dev/null | grep -m1 topResumedActivity | sed 's/.*u0 \([a-z.]*\)\/.*/\1/')
  echo "t=$NOW load=$LOAD main=$ALIVE top=$TOP kids=$KIDS" >> $S
  [ "$ALIVE" = "dead" ] && { echo "DEATH t=$NOW"; break; }
  # 60초마다 스냅샷 보존 (버퍼 랩 방지)
  N=$((N+1)); [ $((N % 20)) -eq 0 ] && cat $I/trace > /data/local/tmp/.t19.snap.$W
  sleep 3; W=$((W+3))
done
echo 0 > $I/tracing_on
cat $I/trace > /data/local/tmp/.t19.trace
echo "=== CLASSIFY ==="
grep -E "signal_generate|p19_eg" /data/local/tmp/.t19.trace | tail -8
logcat -d -b events -v time 2>/dev/null | grep -E "am_kill|am_proc_died|am_anr" | grep -i toss | tail -3
echo "DONE lines=$(wc -l < /data/local/tmp/.t19.trace)"
