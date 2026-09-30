#!/bin/bash
# 47차 — cpufreq 8코어 위장 (체인 37→38→40→41→45→46 이후)
export PATH="$HOME/Library/Android/sdk/platform-tools:$PATH"
B=/data/local/tmp/camo/cpufreq
for C in 0 1 2 3 4 5 6 7; do
  adb shell "su 0 mount --bind $B/cpu$C /sys/devices/system/cpu/cpu$C/cpufreq" || echo "cpu$C FAIL"
done
echo "검증:"; adb shell "su 10176 sh -c 'cat /sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq'"
