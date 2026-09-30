#!/bin/bash
# 23차: 백그라운드 생존 정밀 측정 — 스플래시만 띄우고 홈으로 밀아둔 뒤 pidof 관찰
export PATH="$HOME/Library/Android/sdk/platform-tools:$PATH"
LOG=bg_survival.log
adb shell am start -n viva.republica.toss/.splash.SplashActivity >/dev/null 2>&1
sleep 3
adb shell input keyevent KEYCODE_HOME
echo "start $(date +%H:%M:%S) — 홈으로 밀림" >> $LOG
for i in $(seq 1 100); do
  sleep 3
  P=$(adb shell "pidof viva.republica.toss" | tr -d '\r')
  [ -z "$P" ] && { echo "DEAD at t+$((i*3))s $(date +%H:%M:%S)" >> $LOG; exit; }
  [ $((i % 10)) -eq 0 ] && echo "alive t+$((i*3))s pid=$P top=$(adb shell dumpsys activity activities | grep topResumed | grep -o '[a-z]*toss[^ }]*' | head -1)" >> $LOG
done
echo "SURVIVED 300s $(date +%H:%M:%S)" >> $LOG
