#!/bin/bash
# =============================================================================
# trace-openat.sh — AppSuit/AhnLab 파일 프로브 비침투 캡처 (ftrace kprobe)
#
# Frida/ptrace 없이 커널 ftrace로 앱의 openat 전수를 관찰한다.
# - TracerPid 변화 없음 → 안티디버그 미유발
# - SIGBUS 자기파괴(§2.18) 미유발 → 원본 앱의 "죽기 직전 프로브 버스트"도 기록 가능
#
# 사용: ./trace-openat.sh [패키지] [초] [액티비티]
#       ./trace-openat.sh net.ib.android.smcard 15
# =============================================================================
PKG=${1:-net.ib.android.smcard}
DUR=${2:-15}
ACT=${3:-com.monimo.intro.presentation.intro.views.IntroActivity}
DEV=${ADB_S:-emulator-5554}
ADB_BIN=$(command -v adb || echo "$HOME/Library/Android/sdk/platform-tools/adb")
export PATH="$HOME/Library/Android/sdk/platform-tools:$PATH"

adb() { "$ADB_BIN" -s "$DEV" "$@"; }

# 1) SELinux 임시 permissive (tracefs 쓰기용 — 끝나고 복구)
echo "[*] setenforce 0"
adb shell setenforce 0

# 2) kprobe 등록 + 활성 (이미 등록돼 있으면 재사용)
adb shell 'cd /sys/kernel/tracing
echo 0 > tracing_on
if ! ls events/kprobes/mo_open/enable >/dev/null 2>&1; then
  echo "p:mo_open do_sys_openat2 dfd=%x0 fname=+0(%x1):string" > kprobe_events
fi
echo 1 > events/kprobes/mo_open/enable
echo 1 > tracing_on'

# 3) 앱 재시작 (콜드 시작 프로브 버스트를 확실히 캡처)
echo "[*] 앱 재시작: $PKG (${DUR}초 관찰)"
adb shell "am force-stop $PKG"
adb shell "am start -n $PKG/$ACT" >/dev/null 2>&1 || \
  adb shell "monkey -p $PKG -c android.intent.category.LAUNCHER 1" >/dev/null 2>&1

sleep "$DUR"

# 4) 수집 + 정리
echo "[*] === 프로브 통계 (파일경로별) ==="
adb shell 'cd /sys/kernel/tracing
echo 0 > tracing_on
grep -oE "fname=\"/[^F]*\"" trace | sort | uniq -c | sort -rn | head -40
echo "=== /proc 스캔 (프로세스/스레드/TracerPid 스윕) ==="
grep -oE "fname=\"/proc/[^F]*\"" trace | sort | uniq -c | sort -rn | head -15
echo 0 > events/kprobes/mo_open/enable'
adb shell setenforce 1
echo "[*] 완료 (SELinux 복구)"
