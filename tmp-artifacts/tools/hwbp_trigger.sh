#!/bin/bash
# hwbp_trigger.sh — [O]-2 실행: Rx 자식 ctx(sp+0x21b0+0x250) 쓰기 워치포인트 동적 무장
# SFI11(RxCachedThreadS) 감지 → 즉시 hwbp 세팅 → CTXW 궤적 수집
set -u
export ANDROID_SERIAL=emulator-5554
ADB=~/Library/Android/sdk/platform-tools/adb
dsh() { $ADB shell "$1"; }

dsh "dmesg -C" >/dev/null 2>&1
dsh "am force-stop viva.republica.toss" >/dev/null 2>&1; sleep 1
dsh "am start -n viva.republica.toss/.splash.SplashActivity" >/dev/null 2>&1
echo "[+] launched — SFI11(Rx 자식) 대기"

ARMED=0
for i in $(seq 1 40); do
  L=$(dsh "dmesg | grep 'SFI11.*RxCachedThreadS' | tail -1" 2>/dev/null | tr -d '\r')
  if [ -n "$L" ]; then
    PID=$(echo "$L" | sed -n 's/.*pid=\([0-9]*\).*/\1/p')
    SP=$(echo "$L" | sed -n 's/.*sp=0x\([0-9a-f]*\).*/\1/p')
    if [ -n "$PID" ] && [ -n "$SP" ]; then
      ADDR=$(printf '0x%x' $(( 0x$SP + 0x21b0 + 0x250 )))
      echo "[+] Rx 자식 pid=$PID sp=0x$SP → watch $ADDR (T+~$(($i/2))s)"
      dsh "echo $PID > /sys/module/hide_kmod/parameters/hwbp_pid"
      dsh "echo $ADDR > /sys/module/hide_kmod/parameters/hwbp_addr"
      dsh "echo 1 > /sys/module/hide_kmod/parameters/hwbp_type"
      dsh "echo 4 > /sys/module/hide_kmod/parameters/hwbp_len"
      dsh "echo 1 > /sys/module/hide_kmod/parameters/hwbp_go"
      ARMED=1
      break
    fi
  fi
  # 자식이 아직 fault 전이면 대기 — 최대 20s
  P=$(dsh "pidof viva.republica.toss" | tr -d '\r')
  [ -z "$P" ] && { echo "[!] 앱 조기 사멸(fault 미발생)"; break; }
  sleep 0.5
done

if [ "$ARMED" = "1" ]; then
  echo "[+] 무장 완료 — 사망까지 대기"
  for i in $(seq 1 25); do sleep 1; P=$(dsh "pidof viva.republica.toss" | tr -d '\r'); [ -z "$P" ] && break; done
  echo "hits=$(dsh "cat /sys/module/hide_kmod/parameters/hwbp_hits" | tr -d '\r')"
  dsh "dmesg | grep CTXW" > /tmp/ctxw_trace.txt 2>/dev/null
  wc -l /tmp/ctxw_trace.txt
  head -12 /tmp/ctxw_trace.txt
else
  dsh "dmesg | grep SFI11 | tail -3"
fi
dsh "echo 0 > /sys/module/hide_kmod/parameters/hwbp_pid; echo 0 > /sys/module/hide_kmod/parameters/hwbp_addr; echo 1 > /sys/module/hide_kmod/parameters/hwbp_go" >/dev/null 2>&1
