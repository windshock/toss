#!/bin/bash
# 37차 신규 위장 재적용 (부팅/stop;start 후마다 — boot_recover.sh 이후에 실행)
# 구성: ① vold prop ② 파티션 변형 프롭 32개 ③ build.prop 3종 bind mount
#       ④ /vendor/overlay 필터 뷰 ⑤ goldfish 오버레이 pm disable ⑥ frida-server 정지(클린 런 시)
set -e
MAGISK="/data/local/tmp/magisk resetprop"
CAMO=/data/local/tmp/camo

adb shell "su 0 $MAGISK persist.sys.vold_app_data_isolation_enabled true"

# 파티션 변형 프롭 (google/Google/dev-keys/userdebug → samsung/release-keys/user)
for part in bootimage odm product system system_ext system_dlkm vendor vendor_dlkm; do
  case $part in
    bootimage|odm|product|system|system_ext|system_dlkm|vendor|vendor_dlkm) ;;
  esac
done
# (아래 python 생성 목록 — 누수 재스캔으로 결정됨)
adb shell "su 0 sh $CAMO/fix_partition_props.sh"

# build.prop 위장 bind mount
adb shell "su 0 mkdir -p $CAMO/propfix"
adb shell "su 0 mount --bind $CAMO/propfix/_system_build.prop /system/build.prop"
adb shell "su 0 mount --bind $CAMO/propfix/_vendor_build.prop /vendor/build.prop"
adb shell "su 0 mount --bind $CAMO/propfix/_odm_etc_build.prop /odm/etc/build.prop"

# /vendor/overlay 필터 (EmulatorTalkBackOverlay/goldfish apk 제외 뷰)
adb shell "su 0 mount --bind $CAMO/overlay_view /vendor/overlay"

# goldfish 오버레이 pm 차단 (멱등)
adb shell "su 0 pm disable-user --user 0 com.google.android.connectivity.resources.goldfish.overlay" || true

# 검증
echo "--- residual tells (0이어야 함):"
adb shell "getprop | grep -icE 'dev-keys|userdebug|\[Google\]|\[google\]|goldfish|ranchu|sdk_gphone'" || echo 0
adb shell "su 0 grep -hcE 'userdebug|dev-keys' /vendor/build.prop /system/build.prop"
