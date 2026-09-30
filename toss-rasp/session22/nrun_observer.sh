#!/bin/bash
# 22차: 토스 N런 자동 관찰 — 런별 fault/SFI/SFO/reboot 이벤트를 dmesg에서 분류
export PATH="$HOME/Library/Android/sdk/platform-tools:$PATH"
N=${1:-5}
LOG=$2
for i in $(seq 1 $N); do
  echo "===== RUN $i $(date +%H:%M:%S) =====" | tee -a $LOG
  adb shell "dmesg | grep -cE 'faultdump'" | tr -d '\r' | xargs -I{} echo "faultdump_before={}" | tee -a $LOG
  adb shell am start -n viva.republica.toss/.splash.SplashActivity >/dev/null 2>&1
  # 최대 90s 생존 관찰 (3s 폴)
  for t in $(seq 1 30); do
    sleep 3
    P=$(adb shell "pidof viva.republica.toss" | tr -d '\r')
    [ -z "$P" ] && break
  done
  echo "survived=${t}x3s pid_end=${P:-DEAD}" | tee -a $LOG
  adb shell "dmesg | tail -400 | grep -E 'faultdump|SFI11|SFO:|kill9|reboot (BLOCKED|ISSUED)'" | tail -20 | tee -a $LOG
  sleep 2
done
