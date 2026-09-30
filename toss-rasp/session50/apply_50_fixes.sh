#!/bin/bash
# 50차 — 커널로그 차단 (체인 37→…→47 이후)
export PATH="$HOME/Library/Android/sdk/platform-tools:$PATH"
adb shell "su 0 sh -c 'echo 1 > /proc/sys/kernel/dmesg_restrict; dmesg -C 2>/dev/null'"
echo "검증: $(adb shell su 0 cat /proc/sys/kernel/dmesg_restrict)"
