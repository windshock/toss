#!/bin/bash
# vendor_bind_setup.sh — 토스 phdr/GL 채널 폐쇄용 /vendor/lib64 bind 사본 구성·적용
#
# 원리 (2026-09-21 실측, 상세는 references/detection-channels.md ★ 3차 세션):
#   /vendor/lib64를 /data/local/tmp/.vl64 사본으로 bind-mount하면 HIDL passthrough의
#   디렉터리 스캔·EGL 로더가 사본의 파일명을 그대로 본다 → 에뮬 텔레텔 라이브러리명
#   (mapper@*-impl-ranchu, libGoldfishProfiler, vulkan.ranchu)을 중립명으로 노출.
#   EGL 트리오는 이중 이름 세트(emulation+adreno) — ro.hardware.egl이 어느 값이든 로드.
#
# 사전 조건:
#   - LKM v4.2 이상 (dirent .so 은닉 포함), dylib 패치 3종(identity/version/tokens) 설치
#   - AVD: arm64 API33 google_apis. 다르면 파일명·라벨 재확인
#
# 사용:
#   vendor_bind_setup.sh build   # 1회: 사본 생성+리네임+바이트패치 (/data 재부팅 무관 유지)
#   vendor_bind_setup.sh mount   # 부팅마다: bind mount (사본이 이미 있으면)
#   vendor_bind_setup.sh props   # stop;start 후: root복구+permissive+prop 정합화+camow3
#   vendor_bind_setup.sh all     # mount → stop;start → props (부팅 후 원스톱; deploy.sh 선행 권장)
set -u
ADB=${ADB:-adb}
VDIR=/data/local/tmp/.vl64
MAGISK=/data/local/tmp/magisk
PAPPLY=/data/local/tmp/.props-apply.sh
CAMO=/data/local/tmp/.system_profile
TMP=$(mktemp -d)

say() { echo "[*] $*"; }
die() { echo "[!] $*" >&2; exit 1; }
sh_retry() { # 불안정 adb 방어: 실패 시 kill-server 후 재시도
  for i in 1 2 3; do $ADB shell "$1" 2>/dev/null && return 0; sleep 2
    $ADB kill-server >/dev/null 2>&1; $ADB start-server >/dev/null 2>&1; sleep 2; done
  die "adb 반복 실패: $1"
}

ensure_root() {
  $ADB root >/dev/null 2>&1; sleep 2
  [ "$($ADB shell id -u 2>/dev/null | tr -d '\r')" = "0" ] || die "adb root 실패"
  $ADB shell setenforce 0
}

do_build() {
  ensure_root
  # §180 가드: bind 마운트 활성 상태의 build 금지 — /proc/mounts grep은 LKM 은닉으로
  # 거짓음성 나므로 inode 동일성으로 판정 (마운트 중이면 /vendor/lib64 == $VDIR inode)
  VI=$($ADB shell "stat -c %d:%i $VDIR 2>/dev/null" | tr -d '\r')
  MI=$($ADB shell "stat -c %d:%i /vendor/lib64 2>/dev/null" | tr -d '\r')
  if [ -n "$VI" ] && [ "$VI" = "$MI" ]; then
    die "build 금지: bind 마운트 활성($VI) — §179 함정(자기복사 0바이트화). 클린 부트에서 실행"
  fi
  say "사본 생성 ($VDIR)"
  $ADB shell "rm -rf $VDIR; mkdir -p $VDIR; cp -R /vendor/lib64/. $VDIR/ 2>/dev/null"
  # 불완전 복사 방어 (Enforcing 상태 cp가 조용히 실패하는 함정 — 실측)
  N=$($ADB shell "ls $VDIR/*.so | wc -l" | tr -d '\r')
  [ "${N:-0}" -ge 150 ] || die "사본 .so가 ${N}개뿐 — cp 불완전(Permissive 확인)"
  # §180 가드: 0바이트 사본 방어 — 파일"수" 검사는 0바이트 트리를 통과시킴(이름만 세므로).
  # 대표 파일 바이트수로 무결성 확인 (2026-10-02 실측: 0바이트 트리 mount → 오디오HAL 크래시루프)
  S1=$($ADB shell "stat -c %s $VDIR/hw/audio.primary.default.so 2>/dev/null" | tr -d '\r')
  S2=$($ADB shell "stat -c %s $VDIR/egl/libEGL_emulation.so 2>/dev/null" | tr -d '\r')
  [ "${S1:-0}" -gt 10000 ] && [ "${S2:-0}" -gt 50000 ] || \
    die "사본이 0바이트(S1=${S1:-x} S2=${S2:-x}) — cp 실패. 마운트/SELinux 상태 재확인 후 재build"
  $ADB shell "cd $VDIR
    mv hw/android.hardware.graphics.mapper@3.0-impl-ranchu.so hw/android.hardware.graphics.mapper@3.0-impl-qti.so
    mv hw/vulkan.ranchu.so hw/vulkan.qcom.so
    mv libGoldfishProfiler.so libGfxPerfCollector.so"
  say "바이트 패치 (DT_NEEDED/게스트 파싱 리터럴)"
  patch_one() { # 파일, old, new, push경로
    $ADB pull "/vendor/lib64/$1" "$TMP/$2" >/dev/null
    python3 - "$TMP/$2" "$3" "$4" <<'PY'
import sys
p, old, new = sys.argv[1], sys.argv[2].encode(), sys.argv[3].encode()
assert len(old) == len(new), "동일 길이만 허용"
d = bytearray(open(p, 'rb').read())
n = d.count(old); d = d.replace(old, new)
open(p, 'wb').write(d); print(f"  {p}: {n} patches")
PY
    $ADB push "$TMP/$2" "$VDIR/$5" >/dev/null
  }
  patch_one egl/libEGL_emulation.so  egl.so "libGoldfishProfiler.so" "libGfxPerfCollector.so" egl/libEGL_emulation.so
  patch_one libOpenglCodecCommon.so  codec.so "ANDROID_EMU_CHECKSUM_HELPER" "QCOM_ADRENO_CHECKSUM_HELPER" libOpenglCodecCommon.so
  patch_one libGLESv2_enc.so         enc.so "ANDROID_EMU_dma_v2" "QCOM_ADRENO_dma_v2" libGLESv2_enc.so
  say "EGL 이중 이름 세트 (emulation+adreno 병존)"
  $ADB shell "cd $VDIR/egl
    cp libEGL_emulation.so libEGL_adreno.so
    cp libGLESv1_CM_emulation.so libGLESv1_CM_adreno.so
    cp libGLESv2_emulation.so libGLESv2_adreno.so"
  L=$($ADB shell "ls -Z /vendor/lib64/libvulkan_enc.so" | awk '{print $1}' | tr -d '\r')
  $ADB shell "chcon -R $L $VDIR; chcon $L $VDIR/egl/*.so"
  say "build 완료 — mount → stop;start → props 순으로 적용"
}

do_mount() {
  ensure_root
  if $ADB shell "grep -q '.vl64' /proc/mounts" 2>/dev/null; then say "이미 bind됨"; return 0; fi
  [ -d /tmp/x ] 2>/dev/null || true
  sh_retry "test -f $VDIR/egl/libEGL_adreno.so && test -f $VDIR/hw/vulkan.qcom.so" \
    || die "사본 없음 — 먼저 build"
  # §180 가드: 0바이트 트리 mount 금지 — vendor 뷰 전체 파탄(오디오HAL 크래시루프)의 증폭 방지
  SZ=$($ADB shell "stat -c %s $VDIR/hw/audio.primary.default.so 2>/dev/null" | tr -d '\r')
  [ "${SZ:-0}" -gt 10000 ] || die ".vl64 무결성 실패(0바이트 트리) — mount 중단, 클린부트에서 build 재실행"
  sh_retry "mount -o bind $VDIR /vendor/lib64 && echo BIND_OK"
}

do_props() {
  ensure_root
  say "props-apply + egl/vulkan prop + svc prop 정리"
  sh_retry "sh $PAPPLY" >/dev/null 2>&1 || true
  sh_retry "$MAGISK resetprop ro.hardware.egl adreno"
  sh_retry "$MAGISK resetprop ro.hardware.vulkan qcom"
  # stop;start가 재생성하는 init.svc.* 텔레텔 전수 삭제
  sh_retry "for p in \$(getprop | grep -iE 'qemu|goldfish|ranchu' | cut -d: -f1 | tr -d '[] '); do $MAGISK resetprop --delete \$p 2>/dev/null; done; getprop | grep -ciE 'qemu|goldfish|ranchu'"
  # camow3 writer 재기동 (생존 확인은 /dev/.ew471v mtime — .q7zm4h는 앱 생존 시에만 갱신)
  $ADB shell "nohup sh $CAMO >/dev/null 2>&1 &" >/dev/null 2>&1
  sleep 2
  T1=$($ADB shell 'stat -c %Y /dev/.ew471v 2>/dev/null' | tr -d '\r'); sleep 1.5
  T2=$($ADB shell 'stat -c %Y /dev/.ew471v 2>/dev/null' | tr -d '\r')
  [ -n "$T1" ] && [ "$T1" != "$T2" ] && say "camow3 writer 정상" || say "경고: writer 미확인 — deploy.sh 재실행"
}

case "${1:-}" in
  build) do_build ;;
  mount) do_mount ;;
  props) do_props ;;
  all)
    do_mount
    say "프레임워크 재시작 (zygote 상속 정화 — rename 후 필수)"
    $ADB shell "stop; start"
    for i in $(seq 1 24); do
      [ "$($ADB shell getprop sys.boot_completed 2>/dev/null | tr -d '\r')" = "1" ] && break; sleep 5
    done
    sleep 6
    do_props
    $ADB shell "dumpsys SurfaceFlinger 2>/dev/null | grep -E '^GLES:'"
    ;;
  *) die "用法: $0 build|mount|props|all" ;;
esac
rm -rf "$TMP"
