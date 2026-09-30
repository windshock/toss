#!/bin/bash
# 38차 추가 위장 (37차 apply_37_fixes.sh 이후 실행. stop;start/재부팅 후마다 재적용)
# ① gsm.* 텔레포뮬 (rild가 stop;start 시 되돌림 — 재적용 필수)
# ② 센서 HAL Goldfish→Samsung 패치 bind mount (프레임워크 재시작으로 반영)
# ③ /proc/bus/input/devices 위장 (virtio_input → sec_*)
set -e
export PATH=$PATH:~/Library/Android/sdk/platform-tools
MAG="su 0 /data/local/tmp/magisk resetprop"
CAMO=/data/local/tmp/camo

# ① gsm (operator=SKT/45005/kr, baseband=빌드 정합, RIL=삼성)
adb shell "$MAG gsm.operator.alpha SKT"
adb shell "$MAG gsm.operator.iso-country kr"
adb shell "$MAG gsm.operator.numeric 45005"
adb shell "$MAG gsm.sim.operator.alpha SKT"
adb shell "$MAG gsm.sim.operator.numeric 45005"
adb shell "$MAG gsm.version.baseband S916NKSU1AWC2"
adb shell "$MAG 'gsm.version.ril-impl' 'Samsung RIL(v1.0)'"
adb shell "$MAG gsm.network.type NR"

# ② 센서 HAL (패치본 = /data/local/tmp/camo/sensorhal_patched.so, Goldfish→"Samsung ")
adb shell "su 0 mount --bind $CAMO/sensorhal_patched.so /vendor/lib64/hw/android.hardware.sensors@2.1-impl.ranchu.so" || true

# ③ input devices
adb shell "su 0 mount --bind $CAMO/input_devices_fake /proc/bus/input/devices" || true

# 검증
echo "--- gsm/sensor/input 확인:"
adb shell "getprop gsm.operator.alpha; getprop gsm.version.ril-impl"
adb shell "dumpsys sensorservice | grep -ioE 'Goldfish' | head -1" && echo "SENSOR-LEAK!" || echo "sensor OK"
adb shell "su 0 cat /proc/bus/input/devices | grep -c virtio" || echo "input OK"
