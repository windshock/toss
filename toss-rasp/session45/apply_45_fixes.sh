#!/bin/bash
# 45차 — virtio 저장소 채널 (44차 체인 이후)
export PATH=$PATH:~/Library/Android/sdk/platform-tools
CAMO=/data/local/tmp/camo
adb shell "su 0 mount --bind $CAMO/sysblock_fake /sys/block" || true
adb shell "su 0 mount --bind $CAMO/partitions_fake /proc/partitions" || true
adb shell "su 0 mount --bind $CAMO/diskstats_fake /proc/diskstats" || true
echo "검증(전부 0):"
adb shell "su 10176 sh -c 'echo sb=\$(ls /sys/block | grep -c vd); pp=\$(grep -c vd /proc/partitions); ds=\$(grep -c vd /proc/diskstats)'"
