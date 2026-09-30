#!/bin/bash
# 25차: 부팅 직후 첫 런 exit_trap — 위장 즉사 모드 리셋 직후 창을 노린다
export PATH="$HOME/Library/Android/sdk/platform-tools:$PATH"
cd /Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/session25/frida
adb shell am start -n viva.republica.toss/.splash.SplashActivity >/dev/null 2>&1 &
PID=""
for W in $(seq 1 15); do
  sleep 0.35
  PID=$(adb shell "ps -A -o UID,PID | awk '\$1==10175 {print \$2; exit}'" 2>/dev/null | tr -d '\r')
  [ -n "$PID" ] && break
done
echo "[*] pid=${PID:-FAIL} (t=$((W*35))00ms)"
if [ -n "$PID" ]; then
  timeout 320 ~/.pyenv/versions/3.11.4/bin/python3 /tmp/attach_run.py "$PID" exit_trap.js 300 2>&1 | tee run_exit_trap_boot1.txt | head -60
  echo "=== 5분 후 생존 (3점 검증 입력) ==="
  adb shell "ps -A -o UID,PID | awk '\$1==10175'" | tr -d '\r' | head -2
  adb shell "dumpsys activity activities | grep topResumed" | tr -d '\r' | head -1
  adb exec-out screencap -p > /tmp/toss25_alive.png 2>/dev/null; ls -la /tmp/toss25_alive.png | awk '{print "screencap:", $5}'
fi
