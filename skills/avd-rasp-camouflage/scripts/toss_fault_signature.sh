#!/system/bin/sh
# toss_fault_signature.sh — N런 (pc,far,x16,x29,x30,sp) 불변성 측정 (21차)
#
# 용도: 조용한 exit(SIGSEGV→컬렉터→System.exit(0))의 fault 시그니처가 런 간
# 불변인지 측정 — 불변=고정 코드경로(환경/구조 원인), 변동=오염/레이스.
# 사용(호스트): adb shell "sh /data/local/tmp/.toss_fault_signature.sh [N]"
# 전제: boot_recover.sh로 chan19 인스턴스 재구성 후. 산출물은 각 런
# /data/local/tmp/.t21.gpr.$R + .t21.maps.$R — toss_addr_resolve.py로 매핑.
# 런 판정 시 주의: am_proc_start reason + wm_on_create 이후 시간으로 생존 계산
# (백그라운드 서비스 수명과 혼동 금지 — 20차 18408 사례).
# t21gpr.sh — 21차: fault 시 핵심 GPR(x16,x29,x30) 포함 캡처, N런 불변성 측정
T=/sys/kernel/tracing
I=$T/instances/chan19
echo 0 > $I/tracing_on
grep -q t21_gpr $T/kprobe_events || echo 'p:t21_gpr do_mem_abort far=%x0:x64 esr=%x1:x64 x16=+128(%x2):x64 x29=+232(%x2):x64 x30=+240(%x2):x64 sp=+248(%x2):x64 pc=+256(%x2):x64' >> $T/kprobe_events
echo 1 > $I/events/kprobes/enable
echo 1 > $I/events/signal/signal_deliver/enable
RUNS=${1:-3}
for R in $(seq 1 $RUNS); do
  am force-stop viva.republica.toss; sleep 1
  am start -n viva.republica.toss/.splash.SplashActivity >/dev/null 2>&1
  P=""; i=0; while [ $i -lt 40 ]; do P=$(pidof viva.republica.toss | tr ' ' '\n' | head -1); [ -n "$P" ] && break; sleep 0.1; i=$((i+1)); done
  [ -n "$P" ] || { echo "run$R NOPID"; continue; }
  TP=""; for t in $(ls /proc/$P/task 2>/dev/null); do TP="$TP $t"; done
  echo "$TP" > $I/set_event_pid
  cat /proc/$P/maps > /data/local/tmp/.t21.maps.$R 2>/dev/null
  START=$(cut -d' ' -f1 /proc/uptime)
  echo > $I/trace
  echo 1 > $I/tracing_on
  W=0; DIED=""
  while [ $W -lt 300 ]; do
    [ -d /proc/$P ] || { DIED=$(cut -d' ' -f1 /proc/uptime); break; }
    sleep 2; W=$((W+2))
  done
  echo 0 > $I/tracing_on
  cat $I/trace > /data/local/tmp/.t21.gpr.$R
  EXITED=${DIED:-alive@${W}s}
  # 이 런의 SIGSEGV 전달 횟수와 최초 fault
  N11=$(grep -c "signal_deliver: sig=11" /data/local/tmp/.t21.gpr.$R)
  FIRST=$(grep "t21_gpr" /data/local/tmp/.t21.gpr.$R | grep -m1 "esr=0x92000006")
  echo "run$R main=$P start=$START end=$EXITED sig11=$N11"
  echo "  first_fault: $FIRST"
done
echo COMPLETE
