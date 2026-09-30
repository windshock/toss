#!/system/bin/sh
# =============================================================================
# camouflage.sh — Android 13 (SDK 33) AVD -> 실기기 위장 (시스템 레이어)
#
# 기본 타깃: Galaxy S23+ SM-S916N / SKT (Android 13 출시 기종 = SDK 33과 일관)
#
# 사용:
#   adb root && adb remount
#   adb push camouflage.sh /data/local/tmp/
#   adb shell sh /data/local/tmp/camouflage.sh            # 적용
#   adb shell sh /data/local/tmp/camouflage.sh --revert   # 복구
# 적용 후: adb reboot  (에뮬레이터 콜드부팅 권장: emulator -no-snapshot @<avd>)
#
# resetprop(Magisk) 이 있으면 자동으로 그 경로를 사용(cmdline 유래 ro.boot.* 도
# 정화 가능). 없으면 build.prop 직접 편집으로 처리 — 이 경우 ro.boot.qemu.* /
# ro.kernel.qemu / ro.hardware 는 커널 cmdline 유래라 남으므로 guard.js 훅이 담당.
# =============================================================================

REVERT=0
[ "$1" = "--revert" ] && REVERT=1

# ---- 위장 타깃 값 (실기기 getprop 덤프 확보 시 이 블록만 교체) --------------
MODEL=SM-S916N
BRAND=samsung
MANUF=samsung
PNAME=dm2qksx                       # ro.product.name (국내판 접미 ksx)
DEV=dm2q                            # ro.product.device
BOARD=dm2q
FP="samsung/dm2qksx/dm2q:13/TP1A.220624.014/S916NKSU1AWC2:user/release-keys"
INC=S916NKSU1AWC2
DESC="dm2qksx-user 13 TP1A.220624.014 S916NKSU1AWC2 release-keys"
PATCH=2023-08-01
SALES=KOO                           # ro.csc.sales_code: SKT=KOO, KT=KTO, LGU+=LUC
SERIAL=RZ8T30A1B2C
BDATE="Mon Jul 24 14:22:31 KST 2023"
BUTC=1690178551
AID=8f3c21a9d47b6e05                # 새 ANDROID_ID (16 hex, 재부팅 후 적용)
# -----------------------------------------------------------------------------

msg() { echo "[*] $1"; }

# ----------------------------- 복구 모드 -------------------------------------
if [ "$REVERT" = "1" ]; then
  for f in $(find /system /vendor /product /system_ext /odm -maxdepth 4 -name '*.camobak' 2>/dev/null); do
    mv "$f" "${f%.camobak}" && msg "restored ${f%.camobak}"
  done
  for b in $(find /system /vendor /sbin /data/local -maxdepth 4 -name '*.subak' 2>/dev/null); do
    mv "$b" "${b%.subak}" && msg "restored ${b%.subak}"
  done
  echo "[*] revert 완료 — adb reboot 하세요"
  exit 0
fi

# ------------------- su / busybox / Superuser 흔적 은닉 -----------------------
# 관측된 AhnLab 발화점: access("/system/xbin/su") (+ /system/bin/su, Superuser.apk)
hide() {
  p="$1"
  if [ -e "$p" ] && [ ! -e "$p.subak" ]; then
    mv "$p" "$p.subak" && echo "[+] hidden: $p"
  fi
}
for p in \
  /system/xbin/su /system/bin/su /system/sbin/su /sbin/su /su/bin/su \
  /vendor/bin/su /vendor/xbin/su /data/local/xbin/su /data/local/bin/su \
  /system/xbin/busybox /system/bin/busybox \
  /system/xbin/magisk /system/bin/magisk \
  /system/app/Superuser.apk /system/app/SuperUser.apk /system/app/Superuser
do
  hide "$p"
done

# --------------------------- 프롭 위장 적용 -----------------------------------
if command -v resetprop >/dev/null 2>&1; then
  msg "resetprop 경로 (cmdline 유래 프롭까지 정화, 재부팅 불필요한 값 포함)"
  rp() { resetprop "$1" "$2" >/dev/null 2>&1; }
  rp ro.product.model "$MODEL"
  rp ro.product.brand "$BRAND"
  rp ro.product.manufacturer "$MANUF"
  rp ro.product.name "$PNAME"
  rp ro.product.device "$DEV"
  rp ro.product.board "$BOARD"
  rp ro.build.product "$DEV"
  rp ro.build.fingerprint "$FP"
  rp ro.build.tags release-keys
  rp ro.build.type user
  rp ro.build.version.incremental "$INC"
  rp ro.build.description "$DESC"
  rp ro.build.version.security_patch "$PATCH"
  rp ro.build.date "$BDATE"
  rp ro.build.date.utc "$BUTC"
  rp ro.build.display.id "$INC"
  rp ro.serialno "$SERIAL"
  rp ro.boot.serialno "$SERIAL"
  rp ro.bootloader "$INC"
  rp ro.boot.bootloader "$INC"
  rp ro.csc.sales_code "$SALES"
  # QEMU / 루트 상태 시그니처
  rp ro.boot.qemu.gltransport.draw ""
  rp ro.boot.qemu.gltransport.name ""
  rp ro.kernel.qemu 0
  rp ro.boot.hardware qcom
  rp ro.hardware qcom
  rp ro.boot.verifiedbootstate green
  rp ro.boot.flash.locked 1
  rp ro.boot.veritymode enforcing
  rp ro.boot.vbmeta.device_state locked
  rp ro.boot.warranty_bit 0
  rp ro.warranty_bit 0
else
  msg "build.prop 직접 편집 경로 (adb remount 선행)"
  mount -o rw,remount /system 2>/dev/null || mount -o rw,remount / 2>/dev/null
  FILES=$(find /system /vendor /product /system_ext /odm -maxdepth 4 \
          \( -name 'build.prop' -o -name 'prop.default' \) 2>/dev/null)
  for f in $FILES; do
    [ -f "$f" ] || continue
    [ -f "$f.camobak" ] || cp "$f" "$f.camobak"
    sed -i -E \
      -e "s|^(ro\.product(\.[a-z0-9]+)?\.model)=.*|\1=$MODEL|" \
      -e "s|^(ro\.product(\.[a-z0-9]+)?\.brand)=.*|\1=$BRAND|" \
      -e "s|^(ro\.product(\.[a-z0-9]+)?\.name)=.*|\1=$PNAME|" \
      -e "s|^(ro\.product(\.[a-z0-9]+)?\.device)=.*|\1=$DEV|" \
      -e "s|^(ro\.product(\.[a-z0-9]+)?\.manufacturer)=.*|\1=$MANUF|" \
      -e "s|^(ro\.product(\.[a-z0-9]+)?\.board)=.*|\1=$BOARD|" \
      -e "s|^(ro\.([a-z0-9]+\.)*build\.fingerprint)=.*|\1=$FP|" \
      -e "s|^(ro\.([a-z0-9]+\.)*build\.tags)=.*|\1=release-keys|" \
      -e "s|^(ro\.([a-z0-9]+\.)*build\.version\.incremental)=.*|\1=$INC|" \
      -e "s|^(ro\.([a-z0-9]+\.)*build\.description)=.*|\1=$DESC|" \
      -e "s|^(ro\.([a-z0-9]+\.)*build\.version\.security_patch)=.*|\1=$PATCH|" \
      -e "s|^(ro\.build\.product)=.*|\1=$DEV|" \
      -e "s|^(ro\.build\.type)=.*|\1=user|" \
      -e "s|^(ro\.build\.display\.id)=.*|\1=$INC|" \
      -e "s|^(ro\.build\.date)=.*|\1=$BDATE|" \
      -e "s|^(ro\.build\.date\.utc)=.*|\1=$BUTC|" \
      "$f"
  done
  # canonical 키 누락 대비 (system 파티션에만 1회)
  for f in /system/build.prop /system/etc/prop.default; do
    if [ -f "$f" ]; then
      grep -q '^ro\.product\.model=' "$f" || echo "ro.product.model=$MODEL" >> "$f"
      grep -q '^ro\.build\.fingerprint=' "$f" || echo "ro.build.fingerprint=$FP" >> "$f"
      grep -q '^ro\.csc\.sales_code=' "$f" || echo "ro.csc.sales_code=$SALES" >> "$f"
    fi
  done
  echo "[!] build.prop 경로 한계: ro.boot.qemu.* / ro.kernel.qemu / ro.hardware 는"
  echo "[!] 커널 cmdline 유래라 남음 -> guard.js 런타임 훅이 처리"
fi

# ------------------------- ANDROID_ID 교체 ------------------------------------
# 앱이 보는 값은 android_id+패키지+서명 키로 해시된 per-app 값이므로 원값 교체로 충분
settings put secure android_id "$AID" 2>/dev/null \
  && echo "[+] android_id 교체 (재부팅 적용)" \
  || echo "[!] android_id 교체 실패 — 수동: settings put secure android_id $AID"

# --------------------------- SELinux / 감사 -----------------------------------
SE=$(getenforce 2>/dev/null)
msg "SELinux: $SE"
if [ "$SE" = "Permissive" ]; then
  setenforce 1 2>/dev/null && echo "[+] setenforce 1" \
    || echo "[!] setenforce 실패 (부트 시점 확인 필요)"
fi

echo ""
echo "=== 잔여 시그니처 감사 (resetprop 미사용 시 qemu 라인이 남는 게 정상 — guard.js 담당) ==="
getprop 2>/dev/null | grep -iE 'qemu|goldfish|ranchu|sdk_gphone|generic|emu64a|test-keys|userdebug|dev-keys' \
  || echo "(clean)"
echo ""
echo "[*] 완료 — adb reboot 후 콜드부팅: emulator -no-snapshot @<avd>"
