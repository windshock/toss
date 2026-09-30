#!/bin/bash
# 24차: 30분 장기 관찰 — Timer-0 패닉 재현(panic_on_oops=0 생존 검증) + 런당 caller_lr 수집
export PATH="$HOME/Library/Android/sdk/platform-tools:$PATH"
LOG=long_watch24.log
LAST_U=0
for R in $(seq 1 10); do
  U=$(adb shell "cut -d. -f1 /proc/uptime" 2>/dev/null | tr -dc '0-9')
  if [ -n "$U" ] && [ -n "$LAST_U" ] && [ "$U" -lt "$LAST_U" ]; then
    echo "!! REBOOT DETECTED at round $R (uptime reset $LAST_U -> $U) $(date +%H:%M:%S)" >> $LOG
  fi
  LAST_U=$U
  adb shell am start -n viva.republica.toss/.splash.SplashActivity >/dev/null 2>&1
  sleep 25
  P=$(adb shell "pidof viva.republica.toss" | tr -d '\r')
  DM=$(adb shell "dmesg | grep -E 'caller_lr|faultdump' | tail -2" | tr -d '\r')
  echo "[round $R] $(date +%H:%M:%S) uptime=$U pid=${P:-DEAD}" >> $LOG
  echo "$DM" >> $LOG
  sleep 150
done
echo "[관찰 종료] $(date +%H:%M:%S)" >> $LOG
