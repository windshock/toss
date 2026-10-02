#!/bin/bash
# s185_verify.sh — §185 라이브 [EMULATOR] 라벨 검증 자율 오케스트레이터
# 이중 블로커 대응: (A) 서버 에스컬레이션 → 무런 대기+디에스컬 프로브 (B) 호스트 QEMU 스톨
# → 렌더 건강검진+필요시 재부팅 + 렌더안전 카모(GL/디스플레이 제외, §180 GL 비결정).
# 흐름: 초기 조용대기(디에스컬 유도) → [프로브: 렌더준비→카모→1런] 디에스컬(≥9s) 감지 →
#        5런 시리즈(라벨 집계). 각 프로브는 보고 1건이므로 최소화(간격 길게).
set -u
export TMPDIR=/tmp ANDROID_SERIAL=emulator-5554
export PATH="$HOME/Library/Android/sdk/platform-tools:$PATH"
export ANDROID_SDK_ROOT="$HOME/Library/Android/sdk"
ADB=adb
WS=/Users/1004276/Downloads/toss
SK=$WS/skills/avd-rasp-camouflage/scripts
LOG=$WS/toss-rasp/session185/s185_verify.log
PKG=viva.republica.toss
log(){ echo "[$(date '+%m-%d %H:%M:%S')] $*" >> "$LOG"; }

log "=== orchestrator start (pid $$) ==="

push_assets(){
  $ADB root >/dev/null 2>&1; sleep 2
  $ADB push "$WS/avd-camouflage/lkm/hide_kmod.built.ko" /data/local/tmp/hide_kmod.ko >/dev/null 2>&1
  $ADB push "$SK/props-apply.sh"      /data/local/tmp/.props-apply.sh >/dev/null 2>&1
  $ADB push "$SK/prop_area_scrub.sh"  /data/local/tmp/.prop_scrub.sh  >/dev/null 2>&1
  $ADB push "$SK/camow3.sh"           /data/local/tmp/.system_profile >/dev/null 2>&1
}

reboot_fresh(){
  log "reboot_fresh: emu kill + relaunch"
  timeout 25 $ADB emu kill >/dev/null 2>&1; sleep 5
  pkill -TERM -f "qemu-system.*camo33" 2>/dev/null; sleep 4
  rm -f ~/.android/avd/camo33.avd/*.lock 2>/dev/null
  ( cd "$ANDROID_SDK_ROOT/emulator" && nohup ./emulator -avd camo33 -no-snapshot -no-boot-anim > /tmp/emu_verify.log 2>&1 & )
  local B=""
  for i in $(seq 1 45); do B=$(timeout 10 $ADB shell getprop sys.boot_completed 2>/dev/null|tr -d '\r'); [ "$B" = "1" ] && break; sleep 6; done
  sleep 12
  log "reboot_fresh: boot=$B stalls=$(grep -c 'hanging thread' /tmp/emu_verify.log 2>/dev/null)"
}

render_ok(){ # 0=healthy
  local sz=$(timeout 22 $ADB exec-out screencap -p 2>/dev/null | wc -c | tr -d ' ')
  [ "${sz:-0}" -gt 100000 ]
}

apply_camo(){ # 렌더안전 판정채널 카모 (GL/디스플레이/stop;start 제외)
  $ADB root >/dev/null 2>&1; sleep 1
  $ADB shell "setenforce 0; echo 0 > /proc/sys/kernel/panic_on_oops 2>/dev/null" >/dev/null 2>&1
  $ADB shell "lsmod | grep -q hide_kmod || insmod /data/local/tmp/hide_kmod.ko target_uids=10179" >/dev/null 2>&1
  $ADB shell "sh /data/local/tmp/.props-apply.sh >/dev/null 2>&1" >/dev/null 2>&1
  $ADB shell "sh /data/local/tmp/.prop_scrub.sh >/dev/null 2>&1"  >/dev/null 2>&1
  $ADB shell "/data/local/tmp/magisk resetprop --delete init.svc.ranchu-setup; /data/local/tmp/magisk resetprop --delete ro.boottime.ranchu-setup; /data/local/tmp/magisk resetprop --delete vendor.qemu.dev.bootcomplete" >/dev/null 2>&1
  $ADB shell "rmmod virtio_snd 2>/dev/null; ip route|grep -q default || ip route add default via 10.0.2.2 dev wlan0 2>/dev/null" >/dev/null 2>&1
  $ADB shell 'T="goldfish|virtio|vbox|qemu|vmw_vsock|failover|nd_virtio|vexpress|pl111|virt_wifi|vcan|slcan|vhci|usbip|hide_kmod|sw_sync|rtc_test|pulse8|gs_usb|can_dev|9pnet|redroid|genyd|nox|memu|bluestacks|9p"; grep -viE "$T" /proc/modules>/dev/.fakemod 2>/dev/null; grep -viE "virtiofs|9p" /proc/filesystems>/dev/.fakefs 2>/dev/null; grep -viE virtio /proc/ioports>/dev/.fakeio 2>/dev/null; [ -s /dev/.fakemod ]||echo "binder 1 0 - Live 0x0 (O)">/dev/.fakemod; chmod 644 /dev/.fakemod /dev/.fakefs /dev/.fakeio; chcon u:object_r:qemu_device:s0 /dev/.fakemod /dev/.fakefs /dev/.fakeio 2>/dev/null' >/dev/null 2>&1
  $ADB shell "pkill -f system_profile 2>/dev/null; ( nohup sh /data/local/tmp/.system_profile </dev/null >/dev/null 2>&1 & )" >/dev/null 2>&1
  sleep 4
  local M=$($ADB shell getprop ro.product.model 2>/dev/null|tr -d '\r')
  local GF=$($ADB shell 'grep -ciE "goldfish|virtio" /dev/.fakemod 2>/dev/null'|tr -d '\r')
  local LK=$($ADB shell 'lsmod|grep -c hide_kmod'|tr -d '\r')
  local PA=$($ADB shell 'cat /proc/asound/cards 2>/dev/null|head -1'|tr -d '\r')
  log "camo: model=$M LKM=$LK fakemod_goldfish=$GF asound=$PA"
}

measure(){ timeout 60 $ADB shell "sh /data/local/tmp/run_measure.sh" 2>/dev/null | tr -d '\r'; }

prep_world(){
  if ! render_ok; then log "render wedge → reboot"; reboot_fresh; push_assets; fi
  apply_camo
  render_ok && log "render OK post-camo" || log "WARN render wedge post-camo (측정 신뢰도 저하)"
}

# ── 1. 초기 조용 대기 (디에스컬 유도 — 보고 0건) ──
INIT_WAIT=${INIT_WAIT:-5400}   # 90분
log "초기 무런 대기 ${INIT_WAIT}s (디에스컬 유도)"
sleep "$INIT_WAIT"

# ── 2. 디에스컬 프로브 루프 ──
push_assets
ATT=0; MAXATT=${MAXATT:-6}; GAP=${GAP:-3600}
while [ $ATT -lt $MAXATT ]; do
  ATT=$((ATT+1))
  prep_world
  R=$(measure); log "probe$ATT: $R"
  S=$(echo "$R"|grep -oE 'SURVIVED_S=[0-9]+'|cut -d= -f2)
  if [ "${S:-0}" -ge 9 ]; then
    log "=== DEESCALATED (${S}s) — 5런 시리즈 개시 ==="
    for i in 1 2 3 4 5; do
      prep_world
      R=$(measure); log "  run$i: $R"
      sleep 10
    done
    log "라벨 집계(마지막 런 logstore):"
    $ADB shell "cat /data/data/$PKG/files/logstore/logitems/*.json 2>/dev/null" | grep -o '"result":"\[[A-Z_]*\]"' | sort | uniq -c >> "$LOG" 2>&1
    log "=== SERIES DONE — 판정: 라벨 無=§185 채널폐쇄 인과 확정 / [EMULATOR] 잔존=GL/미지입력 ==="
    exit 0
  fi
  log "probe$ATT 여전히 에스컬(${S:-?}s) — ${GAP}s 대기 (보고 최소화)"
  sleep "$GAP"
done
log "=== ${MAXATT}회 프로브 소진 — 여전히 에스컬레이션. 더 긴 무런 대기 필요(§156). 재실행: bash $0 ==="
