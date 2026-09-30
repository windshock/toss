#!/system/bin/sh
# =============================================================================
# camouflage.sh v2 — Magisk post-fs-data 부팅 스크립트
# /data/adb/post-fs-data.d/camouflage.sh (755)
#
# v2 변경:
#  - magiskd 소켓 준비 대기 루프 (카나리 프롭으로 성공 확인)
#  - 적용 완료 후 Magisk 오버레이 바이너리(/system/bin/{su,magisk,...}) umount
#    → 앱에서 루트 바이너리 관측 불가
# =============================================================================

RP=/system/bin/resetprop
[ -x "$RP" ] || RP=/data/adb/magisk/resetprop
[ -x "$RP" ] || exit 0

LOG=/data/local/tmp/camouflage.log
echo "[$(date)] camo start" > $LOG

# ---- 0. magiskd 소켓 대기 (post-fs-data 초기엔 데몬 미준비일 수 있음) ----
i=0
while [ $i -lt 120 ]; do
  "$RP" sys.camo.canary ok >/dev/null 2>&1
  [ "$("$RP" sys.camo.canary 2>/dev/null)" = "ok" ] && break
  sleep 0.5
  i=$((i+1))
done
echo "[$(date)] daemon ready after $i tries" >> $LOG

MODEL=SM-S916N
BRAND=samsung
MANUF=samsung
PNAME=dm2qksx
DEV=dm2q
BOARD=dm2q
FP="samsung/dm2qksx/dm2q:13/TP1A.220624.014/S916NKSU1AWC2:user/release-keys"
INC=S916NKSU1AWC2
DESC="dm2qksx-user 13 TP1A.220624.014 S916NKSU1AWC2 release-keys"
PATCH=2023-08-01
SALES=KOO
SERIAL=RZ8T30A1B2C
BDATE="Mon Jul 24 14:22:31 KST 2023"
BUTC=1690178551

# ---- 1. 루트 흔적: /system/xbin 마스킹 ----
mount -t tmpfs tmpfs /system/xbin 2>/dev/null

# ---- 2. QEMU 시그니처 (cmdline 유래) 제거 ----
for K in \
  ro.boot.qemu.avd_name \
  ro.boot.qemu.gltransport.draw \
  ro.boot.qemu.gltransport.name \
  ro.boot.qemu.camera_hq_edge_processing \
  ro.boot.qemu.camera_protocol_ver \
  ro.boot.qemu.hwcodec.avcdec \
  ro.boot.qemu.hwcodec.hevcdec \
  ro.boot.qemu.hwcodec.vpxdec \
  ro.boot.qemu.settings.system.screen_off_timeout \
  ro.boot.qemu.skin \
  ro.boot.qemu.virtiowifi \
  ro.boot.qemu.vsync \
  ro.boot.qemu.cpuvulkan.version
do
  "$RP" --delete "$K" >/dev/null 2>&1
done
"$RP" ro.boot.qemu 0
"$RP" ro.kernel.qemu 0

# ---- 3. 하드웨어/SoC ----
"$RP" ro.hardware qcom
"$RP" ro.boot.hardware qcom
"$RP" ro.hardware.audio.primary qcom
"$RP" ro.soc.model SM8550
"$RP" ro.soc.manufacturer QTI
"$RP" ro.board.platform taro

# ---- 4. 제품/빌드 (파티션 변형 일괄) ----
for P in "" .system .vendor .product .odm .system_ext .bootimage; do
  "$RP" "ro.product$P.model" "$MODEL"
  "$RP" "ro.product$P.brand" "$BRAND"
  "$RP" "ro.product$P.name" "$PNAME"
  "$RP" "ro.product$P.device" "$DEV"
  "$RP" "ro.product$P.manufacturer" "$MANUF"
  "$RP" "ro$P.build.fingerprint" "$FP"
  "$RP" "ro$P.build.tags" release-keys
  "$RP" "ro$P.build.type" user
  "$RP" "ro$P.build.version.incremental" "$INC"
done

"$RP" ro.build.product "$DEV"
"$RP" ro.build.description "$DESC"
"$RP" ro.build.display.id "$INC"
"$RP" ro.build.version.security_patch "$PATCH"
"$RP" ro.build.date "$BDATE"
"$RP" ro.build.date.utc "$BUTC"
"$RP" ro.product.board "$BOARD"
"$RP" ro.csc.sales_code "$SALES"

# ---- 4b. AOSP 빌드 유저/호스트 (에뮬/AOSP 텔) ----
"$RP" ro.build.user dpi
"$RP" ro.build.host SWDG4311
"$RP" ro.wtldapatches ""

# ---- 4c. init.svc 스캔 대응: qemu/goldfish/ranchu 서비스 프롭 삭제 ----
# (AppSuit가 getprop 출력에서 init.svc.*stopped 패턴 스캔 — post-fs-data에서
#  지워도 init이 재기록하므로 service.d 스테이지에서 재실행될 때 최종 정리됨)
for S in \
  qemu-adb-keys qemu-adb-setup qemu-device-state qemu-props \
  ranchu-net ranchu-setup goldfish-logcat goldfish-setup \
  android-hardware-media-c2-goldfish-hal-1-0
do
  "$RP" --delete "init.svc.$S" >/dev/null 2>&1
  "$RP" --delete "init.svc_debug_pid.$S" >/dev/null 2>&1
done

# ---- 5. 시리얼/부트로더 ----
"$RP" ro.serialno "$SERIAL"
"$RP" ro.boot.serialno "$SERIAL"
"$RP" ro.bootloader "$INC"
"$RP" ro.boot.bootloader "$INC"

# ---- 6. 부트 상태 ----
"$RP" ro.boot.verifiedbootstate green
"$RP" ro.boot.flash.locked 1
"$RP" ro.boot.veritymode enforcing
"$RP" ro.boot.vbmeta.device_state locked
"$RP" ro.boot.warranty_bit 0
"$RP" ro.warranty_bit 0

# ---- 7. 카나리 정리 + Magisk/루트 오버레이 바이너리 제거 ----
# AppSuit 스캔 대응: su, magisk(-v), supolicy, sugote-mksh, daemonsu
# (파일이 스택 tmpfs 마운트인 경우 umount 수 회 + rm 필요)
"$RP" --delete sys.camo.canary >/dev/null 2>&1
for F in su magisk magiskpolicy resetprop magiskboot busybox magisk32 magisk64 \
         supolicy sugote-mksh daemonsu libmagisk.so; do
  for i in 1 2 3 4 5; do
    umount /system/bin/$F 2>/dev/null
    umount /system/xbin/$F 2>/dev/null
    umount /system/sbin/$F 2>/dev/null
  done
  rm -f /system/bin/$F /system/xbin/$F /system/sbin/$F 2>/dev/null
done

# ---- 8. 허니파일 제거 (AppSuit 루팅 테스트 트랩) ----
rm -f /sdcard/APPSUIT_ROOTING_TEST 2>/dev/null

# ---- 9. (service 단계에서만) 마운트 흔적 소각 ----
# /proc/mounts의 .magisk 항목 제거: /system/bin 파일 마운트를 실파일로 플래튼,
# mirror/pts 마운트는 umount. (post-fs-data에선 건너뛰고 boot-complete 후 실행)
if [ "$(getprop sys.boot_completed)" = "1" ] && grep -q "\.magisk" /proc/mounts 2>/dev/null; then
  echo "[$(date)] flatten start" >> $LOG
  mkdir -p /data/local/tmp/flat
  for M in $(grep "\.magisk" /proc/mounts | awk '$2 ~ /^\/system\/bin\// {print $2}'); do
    n=$(basename "$M")
    cp -f "$M" "/data/local/tmp/flat/$n" 2>/dev/null || continue
    for i in 1 2 3 4 5 6; do umount "$M" 2>/dev/null; done
    [ -f "/data/local/tmp/flat/$n" ] && cat "/data/local/tmp/flat/$n" > "$M" 2>/dev/null
    rm -f "/data/local/tmp/flat/$n"
  done
  for M in $(grep "\.magisk" /proc/mounts | awk '{print $2}' | sort -r); do
    [ -n "$M" ] && umount "$M" 2>/dev/null
  done
  rm -rf /data/local/tmp/flat
  echo "[$(date)] flatten done, remain=$(grep -c '\.magisk' /proc/mounts 2>/dev/null)" >> $LOG
fi

echo "[$(date)] camo done, model=$(getprop ro.product.model)" >> $LOG
exit 0
