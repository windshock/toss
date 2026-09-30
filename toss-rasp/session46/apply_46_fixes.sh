#!/bin/bash
# 46차 — native.bridge 삭제 + /sys/devices/virtual 필터 (체인 37→38→40→41→45 이후)
export PATH=$PATH:~/Library/Android/sdk/platform-tools
adb shell "su 0 /data/local/tmp/magisk resetprop -d ro.dalvik.vm.native.bridge" || true
adb shell "su 0 mount --bind /data/local/tmp/camo/devvirt_fake /sys/devices/virtual" || true
echo "검증:"; adb shell "su 10176 sh -c 'echo nb=\$(getprop ro.dalvik.vm.native.bridge | wc -c); echo dv=\$(ls /sys/devices/virtual | grep -cE hwsim\|android_usb)'"
