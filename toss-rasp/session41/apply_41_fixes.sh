#!/bin/bash
# 41차 — device-tree 위장 + qemu 프롭 삭제 + 배터리 정합 (37→38→40 이후)
export PATH=$PATH:~/Library/Android/sdk/platform-tools
# device-tree: /proc/device-tree → sysfs 실경로에 bind (골드피쉬/fw-cfg/pl011 제거본)
adb shell "su 0 mount --bind /data/local/tmp/camo/dt_fake /sys/firmware/devicetree/base" || true
# qemu 키 프롭 삭제 (멱등)
adb shell "su 0 /data/local/tmp/magisk resetprop -d vendor.qemu.dev.bootcomplete" || true
# 배터리 정합 (방전 중 87%)
adb shell "dumpsys battery unplug; dumpsys battery set status 3; dumpsys battery set level 87"
echo "검증:"; adb shell "su 10176 sh -c 'cat /proc/device-tree/compatible | tr \"\\0\" \" \"; echo; ls /proc/device-tree | grep -c goldfish'"
