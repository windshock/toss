#!/bin/bash
# 40차 — /proc 4채널 위장 (37→38 이후 실행; bind mount 휘발)
export PATH=$PATH:~/Library/Android/sdk/platform-tools
CAMO=/data/local/tmp/camo
adb shell "su 0 mount --bind $CAMO/interrupts /proc/interrupts" || true
adb shell "su 0 mount --bind $CAMO/asound_cards_fake /proc/asound/cards" || true
adb shell "su 0 mount --bind $CAMO/pci_devices_fake /proc/bus/pci/devices" || true
adb shell "su 0 mount --bind $CAMO/misc_fake /proc/misc" || true
echo "검증(전부 0이어야):"
adb shell "su 10176 sh -c 'echo it=\$(grep -ciE goldfish\|virtio /proc/interrupts); snd=\$(grep -c virtio /proc/asound/cards); pci=\$(wc -l < /proc/bus/pci/devices); misc=\$(grep -c goldfish /proc/misc)'"
