#!/bin/bash
# boot_recover.sh — 부팅 후 카모 스택 전체 복구를 한 번에 (21차 정정판)
#
# 사용: boot_recover.sh [uids] [ws경로]
#   uids 기본 10179,10181,10175 (dumpsys package <pkg> | grep userId로 확인)
# 순서(틀리면 누수/크래시): 부팅대기/root → setenforce 0 → bind mount(검증 재시도)
#   → insmod(미적재시만) → egl/vulkan resetprop → props → wm → writer → chan19 → 검증
# 주의: adb shell 호출은 전부 dsh 함수 사용(호스트 sh 명령과 충돌 방지).
set -u
UIDS="${1:-10179,10181,10175}"
WS="${2:-$HOME/Downloads/toss}"
SKILL_DIR="$(cd "$(dirname "$0")/.." && pwd)"
export PATH="$HOME/Library/Android/sdk/platform-tools:$PATH"

dsh() { adb shell "$@"; }

echo "[1] 부팅 완료 대기 + adb root"
for i in $(seq 1 90); do
  B=$(dsh getprop sys.boot_completed 2>/dev/null | tr -d '\r')
  [ "$B" = "1" ] && break; sleep 3
done
[ "${B:-}" = "1" ] || { echo "부팅 실패 — cd \$ANDROID_SDK_ROOT/emulator && ./emulator -avd camo33 -no-snapshot"; exit 1; }
sleep 10   # vendor 서비스 안정화 (콜드부트 직후 bind 실패 방지)
adb root >/dev/null 2>&1; sleep 2

echo "[2] setenforce 0"
dsh "setenforce 0"
echo "[2b] panic_on_oops=0 (23차: 가드 Timer-0 커널 패닉이 재부팅 루프의 원인 — 패닉 시 재부팅 대신 시스템 생존)"
dsh "echo 0 > /proc/sys/kernel/panic_on_oops; echo 0 > /proc/sys/kernel/panic"

echo "[2c] props-apply EARLY + GL 셀렉터 (S114: zygote는 fork 시점의 prop으로 Build.*를 캐시한다 — props가 stop;start보다 먼저여야 앱의 Java Build 정체성이 Samsung으로 나옴. 실측: 순서 미준수 시 앱 logstore에 manufacturer=Google/model=sdk_gphone64_arm64 누출)"
adb push "$SKILL_DIR/scripts/props-apply.sh" /data/local/tmp/.props-apply.sh >/dev/null
dsh "sh /data/local/tmp/.props-apply.sh" 2>&1 | tail -1
dsh "/data/local/tmp/magisk resetprop ro.hardware.egl adreno" >/dev/null 2>&1
dsh "/data/local/tmp/magisk resetprop ro.hardware.vulkan default" >/dev/null 2>&1

echo "[3] vendor bind mount (+검증 재시도)"
for AT in 1 2 3; do
  bash "$SKILL_DIR/scripts/vendor_bind_setup.sh" mount 2>&1 | tail -1
  Q=$(dsh "ls /vendor/lib64/hw/ 2>/dev/null | grep -c impl-qti" | tr -d '\r')
  [ "$Q" = "1" ] && break
  echo "  bind 미가시(attempt $AT) — 8s 후 재시도"; sleep 8
done

echo "[4] hide_kmod insmod (uids=$UIDS)"
adb push "$WS/avd-camouflage/lkm/hide_kmod.built.ko" /data/local/tmp/hide_kmod.ko >/dev/null
dsh sync
if ! dsh "lsmod | grep -q hide_kmod"; then
  dsh "insmod /data/local/tmp/hide_kmod.ko target_uids=$UIDS" && \
  dsh "dmesg | tail -3 | grep -q hide_kmod" || echo "  [!] insmod 확인 실패"
else
  echo "  이미 적재됨 — 생략"
fi

echo "[5] GL 셀렉터 resetprop (매 부트 필수)"
dsh "/data/local/tmp/magisk resetprop ro.hardware.egl adreno" >/dev/null 2>&1
dsh "/data/local/tmp/magisk resetprop ro.hardware.vulkan default" >/dev/null 2>&1
echo "  egl=$(dsh getprop ro.hardware.egl) vulkan=$(dsh getprop ro.hardware.vulkan)"

echo "[6] props-apply"
adb push "$SKILL_DIR/scripts/props-apply.sh" /data/local/tmp/.props-apply.sh >/dev/null
dsh "sh /data/local/tmp/.props-apply.sh" 2>&1 | tail -1

echo "[6b] 프로퍼티 원시 영역 잔존 토큰 스크럽 (§141: --delete 후에도 qemu/goldfish/ranchu 이름 바이트가 컨텍스트 파일에 잔존 — 직접 mmap 스캔 채널 폐쇄)"
adb push "$SKILL_DIR/scripts/prop_area_scrub.sh" /data/local/tmp/.prop_scrub.sh >/dev/null
dsh "su 0 sh /data/local/tmp/.prop_scrub.sh"

echo "[6b2] 부활 에뮬 프로퍼티 재삭제 (§163: init이 부트 후반에 svc/boottime 재기입 — 1회 스크럽 무력화. E6-1 실측: 이 4건 삭제는 fail-closed 유발 안함)"
dsh "su 0 sh -c '/data/local/tmp/magisk resetprop --delete init.svc.ranchu-setup; /data/local/tmp/magisk resetprop --delete init.svc_debug_pid.ranchu-setup; /data/local/tmp/magisk resetprop --delete ro.boottime.ranchu-setup; /data/local/tmp/magisk resetprop --delete vendor.qemu.dev.bootcomplete; echo resurrected=\$(getprop | grep -ciE "qemu|ranchu")'"

echo "[6c] 에뮬 전용 패키지 은닉 (§147: 패키지 레지스트리의 goldfish/EmulationPixel/EmulatorTalkBack — 실기기 부재 = 즉시 폭로)"
dsh 'for p in $(pm list packages | sed s/package:// | grep -iE "emulation|goldfish|talkbackoverlay"); do pm hide $p >/dev/null 2>&1; done; echo hidden=$(pm list packages | grep -ciE "emulation|goldfish|talkbackoverlay")'

echo "[6d] qemu 프로퍼티 컨텍스트 파일 삭제 (§148: resetprop --delete 후에도 /dev/__properties__/u:object_r:qemu* 파일 잔존)"
dsh "su 0 sh -c 'rm -f /dev/__properties__/u:object_r:qemu*.s0 /dev/__properties__/u:object_r:vendor_qemu*.s0 2>/dev/null; echo qemu_files=\$(ls /dev/__properties__/ 2>/dev/null | grep -c qemu)'"

echo "[6e] qemu 프로퍼티 컨텍스트 파일 삭제 (§148: --delete 후에도 파일 잔존 → 직접 rm)"
dsh "su 0 sh -c 'rm -f /dev/__properties__/u:object_r:qemu*.s0 /dev/__properties__/u:object_r:vendor_qemu*.s0 2>/dev/null; echo qemu_files=\$(ls /dev/__properties__/ 2>/dev/null | grep -c qemu)'"

echo "[7] 화면 프로필"
dsh "wm density 450"; dsh "wm size 1080x2340"
dsh "svc power stayon true; settings put system screen_off_timeout 2147483647" >/dev/null
dsh input keyevent KEYCODE_WAKEUP; dsh input keyevent 82

echo "[8] 위장 파일 writer"
adb push "$SKILL_DIR/scripts/camow3.sh" /data/local/tmp/.system_profile >/dev/null
dsh "pkill -f system_profile 2>/dev/null; pkill -f camow3 2>/dev/null; true"
dsh '( nohup sh /data/local/tmp/.system_profile </dev/null >/dev/null 2>&1 & )' || true
sleep 3
echo "  writer=$(dsh "ps -A -o ARGS | grep -c '[.]system_profile'") fake=$(dsh "ls -a /dev/ | grep -c '^\.'" )"

echo "[8b] tracefs trace_marker perm 666 (§151 교정: 600이면 webview_zygote forkApp의 FileDescriptorInfo::ReopenOrDetach가 EACCES로 아브로트 → SandboxedProcessService 스폰 실패 → Chromium in-app fork 폴백 → 가드 Thread가 binder-after-fork SIGABRT. 앱 write는 LKM v4.24 path_blocked(/sys/kernel/tracing→/Z)가 ENOENT 차단하므로 666 부작위 없음)"
dsh "chmod 666 /sys/kernel/tracing/trace_marker 2>/dev/null; ls -la /sys/kernel/tracing/trace_marker 2>/dev/null | awk '{print \"  trace_marker=\"\$1}'"

echo "[9] ftrace chan19 인스턴스 재구성"
dsh "T=/sys/kernel/tracing; I=\$T/instances/chan19; mkdir -p \$I
grep -q p19_gn \$T/kprobe_events || echo 'p:p19_gn getname_flags path=+0(%x0):ustring' >> \$T/kprobe_events
grep -q p19_eg  \$T/kprobe_events || echo 'p:p19_eg __arm64_sys_exit_group' >> \$T/kprobe_events
echo 1 > \$I/events/kprobes/enable
echo 1 > \$I/events/sched/sched_process_fork/enable
echo 1 > \$I/events/sched/sched_process_exit/enable
echo 1 > \$I/events/signal/signal_generate/enable
echo 1 > \$I/events/signal/signal_deliver/enable
echo 1 > \$I/events/raw_syscalls/sys_enter/enable 2>/dev/null
echo '(id==139)||(id==94)' > \$I/events/raw_syscalls/sys_enter/filter 2>/dev/null
echo 1 > \$I/options/event-fork
echo 16384 > \$I/buffer_size_kb 2>/dev/null
echo mono > \$I/trace_clock
echo INSTANCE_OK"

echo "[10] 검증 체크리스트"
dsh sync
printf "  model=%s egl=%s qemu누수=%s density=%s enforce=%s LKM=%s bind(qti)=%s lit패치=%s\n" \
  "$(dsh getprop ro.product.model)" \
  "$(dsh getprop ro.hardware.egl)" \
  "$(dsh "getprop | grep -ciE 'qemu|goldfish|ranchu'")" \
  "$(dsh wm density | grep -o 'Override density: [0-9]*' || dsh wm density)" \
  "$(dsh getenforce)" \
  "$(dsh "lsmod | grep -c hide_kmod")" \
  "$(dsh "ls /vendor/lib64/hw/ 2>/dev/null | grep -c impl-qti")" \
  "$(dsh "strings /vendor/lib64/egl/libEGL_adreno.so 2>/dev/null | grep -c emulation")"
echo "[완료] 기대값: model=SM-S916N egl=adreno qemu누수=0 450 Permissive LKM=1 bind=1 lit=0"

echo "[11] zygote 리프레시 (§151: 부팅직후 zygote가 Google/sdk_gphone64_arm64로 Build.*를 동결 — [2c] 조기 props가 끝났어도 bind의 stop;start 타이밍에 따라 재동결 가능. 모든 props/bind 완료 후 프레임워크 재시작으로 Build 갱신 + GL 셀렉터 재적용)"
dsh "stop; start"
for i in $(seq 1 40); do sleep 3; B=$(dsh getprop sys.boot_completed 2>/dev/null | tr -d '\r'); [ "$B" = "1" ] && break; done
sleep 5
dsh "/data/local/tmp/magisk resetprop ro.hardware.egl adreno" >/dev/null 2>&1
dsh "/data/local/tmp/magisk resetprop ro.hardware.vulkan default" >/dev/null 2>&1
dsh "wm density 450; wm size 1080x2340" >/dev/null 2>&1
echo "  post-zygote: model=$(dsh getprop ro.product.model) egl=$(dsh getprop ro.hardware.egl) boot=$B"
