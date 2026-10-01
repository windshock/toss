#!/system/bin/sh
# props-apply.sh — RASP 무화용 resetprop 신원 세트 일괄 적용 (디바이스에서 실행)
# 재부팅마다 재실행 필요. 인자: 없음
M="/data/local/tmp/magisk resetprop"

# ── 삼성 디바이스 신원 ─────────────────────────────────────────────────────
$M ro.hardware qcom              2>/dev/null
$M ro.boot.hardware qcom         2>/dev/null
$M ro.product.board dm2q         2>/dev/null
$M ro.board.platform kalama      2>/dev/null
$M ro.soc.model SM8550           2>/dev/null
$M ro.soc.manufacturer QTI       2>/dev/null
$M ro.product.model SM-S916N     2>/dev/null
$M ro.product.manufacturer samsung 2>/dev/null
$M ro.product.brand samsung      2>/dev/null
$M ro.product.device dm2q        2>/dev/null
$M ro.product.name dm2qksx       2>/dev/null
$M ro.build.product dm2q         2>/dev/null
$M ro.build.tags release-keys    2>/dev/null
$M ro.build.type user            2>/dev/null
$M ro.build.characteristics nosdcard 2>/dev/null
$M ro.build.flavor dm2qksx-user  2>/dev/null
$M ro.build.fingerprint "samsung/dm2qksx/dm2q:13/TP1A.220624.014/S916NKSU1AWC2:user/release-keys" 2>/dev/null

# ── 에뮬레이터 텔테일 제거 ─────────────────────────────────────────────────
$M --delete ro.kernel.qemu       2>/dev/null
$M --delete ro.boot.qemu         2>/dev/null
$M ro.serialno RZ8T30A1B2C       2>/dev/null
$M ro.boot.serialno RZ8T30A1B2C  2>/dev/null
$M ro.bootloader S916NKSU1AWC2   2>/dev/null
$M ro.boot.bootloader S916NKSU1AWC2 2>/dev/null
$M ro.debuggable 0               2>/dev/null
$M dalvik.vm.isa.arm64.variant cortex-a76 2>/dev/null
$M persist.adb.wifi.guid adb-RZ8T30A1B2C-2umREV 2>/dev/null

# ⚠️ 19차 갱신(2026-09-22): vendor bind + 리터럴 패치 세계에서는 egl=adreno가 필수.
#   ro.hardware.egl은 부트마다 스톡 "emulation"으로 리셋되고, Android 13 EGL 로더는 readdir
#   없이 고정명(emulation/kalama/generic)만 시도하므로 egl=emulation이면 (hide_kmod v4.6+의
#   emulation 경로 deny와 결합) "couldn't find an OpenGL ES implementation" fatal.
#   사전조건: scripts/patch_bind_egl_literals.py 실행(사본 내부 dlopen 키/SONAME이 adreno 세트).
#   vulkan은 ranchu(qemu 누수) 대신 default로 되돌린다.
# $M ro.hardware.egl adreno        2>/dev/null   ← deploy 절차에서 resetprop 직접 실행
# $M ro.hardware.vulkan default    2>/dev/null   ← 〃

# init.svc goldfish/ranchu/qemu 서비스 프롭 삭제 (실기기엔 없는 프롭)
for p in \
  init.svc.android-hardware-media-c2-goldfish-hal-1-0 \
  init.svc.goldfish-logcat \
  init.svc.qemu-adb-keys \
  init.svc.qemu-adb-setup \
  init.svc.qemu-device-state \
  init.svc.qemu-props \
  init.svc.ranchu-net \
  init.svc.ranchu-setup \
  init.svc_debug_pid.android-hardware-media-c2-goldfish-hal-1-0 \
  init.svc_debug_pid.goldfish-logcat \
  init.svc_debug_pid.qemu-adb-keys \
  init.svc_debug_pid.qemu-adb-setup \
  init.svc_debug_pid.qemu-device-state \
  init.svc_debug_pid.qemu-props \
  init.svc_debug_pid.ranchu-net \
  init.svc_debug_pid.ranchu-setup; do
  $M --delete $p >/dev/null 2>&1
done

# ── 토스 가드(libea56) 대응: __system_property_foreach 전수 스캔 채널 (2026-09-20) ──
# 키 이름에 qemu/goldfish/ranchu가 들어가면 foreach 패턴스캔에 걸린다 → 삭제.
# (ro.boot.qemu.gltransport.name 등은 goldfish-opengl이 default "pipe"로 폴백하므로
#  런타임 삭제해도 GL 초기화 무영향. egl/vulkan 셀렉터만 절대 건드리지 말 것.)
for p in \
  qemu.hw.mainkeys \
  qemu.sf.lcd_density \
  ro.boot.qemu.avd_name \
  ro.boot.qemu.camera_hq_edge_processing \
  ro.boot.qemu.camera_protocol_ver \
  ro.boot.qemu.cpuvulkan.version \
  ro.boot.qemu.gltransport.drawFlushInterval \
  ro.boot.qemu.gltransport.name \
  ro.boot.qemu.hwcodec.avcdec \
  ro.boot.qemu.hwcodec.hevcdec \
  ro.boot.qemu.hwcodec.vpxdec \
  ro.boot.qemu.settings.system.screen_off_timeout \
  ro.boot.qemu.skin \
  ro.boot.qemu.virtiowifi \
  ro.boot.qemu.vsync \
  ro.boottime.android-hardware-media-c2-goldfish-hal-1-0 \
  ro.boottime.goldfish-logcat \
  ro.boottime.qemu-adb-keys \
  ro.boottime.qemu-adb-setup \
  ro.boottime.qemu-device-state \
  ro.boottime.qemu-props \
  ro.boottime.ranchu-net \
  ro.boottime.ranchu-setup \
  vendor.qemu.dev.bootcomplete \
  vendor.qemu.sf.fake_camera \
  vendor.qemu.timezone \
  vendor.qemu.vport.bluetooth \
  vendor.qemu.vport.modem; do
  $M --delete $p >/dev/null 2>&1
done
$M vendor.rild.libpath /vendor/lib64/libsec-ril.so 2>/dev/null

# 파티션별 fingerprint/product 잔여(emu64a/sdk_gphone64) → 삼성 dm2q 통일
FP="samsung/dm2qksx/dm2q:13/TP1A.220624.014/S916NKSU1AWC2:user/release-keys"
for part in bootimage odm product system system_dlkm system_ext vendor vendor_dlkm; do
  $M ro.$part.build.fingerprint "$FP"          2>/dev/null
  $M ro.product.$part.device dm2q              2>/dev/null
  $M ro.product.$part.model SM-S916N           2>/dev/null
  $M ro.product.$part.name dm2qksx             2>/dev/null
done
$M ro.build.description "dm2qksx-user 13 TP1A.220624.014 S916NKSU1AWC2 release-keys" 2>/dev/null
$M ro.build.display.id "TP1A.220624.014.S916NKSU1AWC2" 2>/dev/null
$M ro.bionic.cpu_variant cortex-a76       2>/dev/null
$M ro.bionic.2nd_cpu_variant cortex-a76   2>/dev/null
$M ro.hardware.audio.primary kalama       2>/dev/null
$M ro.hardware.power kalama               2>/dev/null

# 잔여 검증: 아래 grep이 비어야 한다 (egl/vulkan 셀렉터는 의도적 잔여)
RES=$(getprop | grep -iE "qemu|goldfish|ranchu|emu64a|gphone|emulator|generic" \
      | grep -vE "ro\.hardware\.(egl|vulkan)|ro\.boot\.hardware\.vulkan")
[ -n "$RES" ] && echo "[props-apply][warn] 잔여 에뮬 프롭:" && echo "$RES"

echo "[props-apply] applied"

# §155: ro.dalvik.vm.native.bridge — 실기기(삼성)=빈 값. AVD 이미지 기본 "0"은 매 부트 복원되므로 매번 삭제.
# (가드가 런타임에 이 프롭을 읽어 %lld;%s;... 포맷 페이로드에 조입 — §155 문자열 테이블 실측. 단 A/B상 판정 비인과)
$M -d ro.dalvik.vm.native.bridge 2>/dev/null
echo "[props-apply] native.bridge deleted (empty=real-device fidelity)"
