#!/bin/bash
# s186_verify.sh — §186 라이브 [EMULATOR] 라벨 검증 자율 오케스트레이터 (v2)
# S185 v1 결함 수리 (§184 "백그라운드 자율 실험 전 재열람" 법칙의 산출):
#   [F1] measure()가 shell uid로 실행 — §182 "측정은 root로" 위반(type-3 거짓실패) → su 0로 수정
#   [F2] bind-less 부분카모는 렌더 사망 — LKM path_blocked("emulation")이 앱 uid의
#        libEGL_emulation.so open을 ENOENT(§186 uid-10179 open 실증). → prep_world를
#        boot_recover 표준 세계(bind+egl=adreno) 기반으로 교체
#   [F3] 런별 라벨 미수집(사후 cat은 업로드로 소실) — run_measure 출력의 LABEL을 런별 로그
#   [F4] prop_scrub을 재부팅 없이 실행 가능 — §163 부트경계 법칙 위험 → boot_recover 경로로만 실행
#   [F5] logcat 포렌식 추가 — 렌더사망 vs 판정사망 구분(am_crash/ENOSPC/SIGABRT 감별)
# 흐름: 초기 무런 대기(디에스컬 유도) → [프로브: 렌더/세계 감사→1런] 디에스컬(≥9s) 감지 →
#        5런 시리즈(라벨 집계). 프로브 = 보고 1건이므로 간격을 길게.
set -u
export TMPDIR=/tmp ANDROID_SERIAL=emulator-5554
export PATH="$HOME/Library/Android/sdk/platform-tools:$PATH"
export ANDROID_SDK_ROOT="$HOME/Library/Android/sdk"
ADB=adb
WS=/Users/1004276/Downloads/toss
SK=$WS/skills/avd-rasp-camouflage/scripts
LOG=$WS/toss-rasp/session186/s186_verify.log
PKG=viva.republica.toss
mkdir -p "$(dirname "$LOG")"
log(){ echo "[$(date '+%m-%d %H:%M:%S')] $*" >> "$LOG"; }

log "=== orchestrator v2 start (pid $$) ==="

reboot_fresh(){
  log "reboot_fresh: emu kill + relaunch"
  timeout 25 $ADB emu kill >/dev/null 2>&1; sleep 5
  pkill -TERM -f "qemu-system.*camo33" 2>/dev/null; sleep 4
  rm -f ~/.android/avd/camo33.avd/*.lock 2>/dev/null
  ( cd "$ANDROID_SDK_ROOT/emulator" && nohup ./emulator -avd camo33 -no-snapshot -no-boot-anim > /tmp/emu_verify.log 2>&1 & )
  local B=""
  for i in $(seq 1 60); do B=$(timeout 10 $ADB shell getprop sys.boot_completed 2>/dev/null|tr -d '\r'); [ "$B" = "1" ] && break; sleep 6; done
  sleep 12
  log "reboot_fresh: boot=$B stalls=$(grep -c 'hanging thread' /tmp/emu_verify.log 2>/dev/null)"
}

render_ok(){ # 0=healthy (SF 레벨)
  local sz=$(timeout 22 $ADB exec-out screencap -p 2>/dev/null | wc -c | tr -d ' ')
  [ "${sz:-0}" -gt 100000 ]
}

world_audit(){ # 표준 세계 감사 1줄 (§182 법칙) — OK면 0 리턴
  local M E LK Q FA
  M=$($ADB shell getprop ro.product.model 2>/dev/null|tr -d '\r')
  E=$($ADB shell getprop ro.hardware.egl 2>/dev/null|tr -d '\r')
  LK=$($ADB shell 'lsmod|grep -c hide_kmod' 2>/dev/null|tr -d '\r')
  Q=$($ADB shell 'ls /vendor/lib64/hw/ 2>/dev/null | grep -c impl-qti' 2>/dev/null|tr -d '\r')
  FA=$($ADB shell '[ -s /dev/.fakemod ] && [ -s /dev/.fakefs ] && [ -s /dev/.fakeio ] && echo OK || echo MISS' 2>/dev/null|tr -d '\r')
  log "world_audit: model=$M egl=$E LKM=$LK bind=$Q procfake=$FA"
  [ "$M" = "SM-S916N" ] && [ "$E" = "adreno" ] && [ "$LK" = "1" ] && [ "$Q" = "1" ] && [ "$FA" = "OK" ]
}

recover_world(){ # boot_recover 전체(표준 세계) — [11] zygote 리프레시 포함(SKIP_ZR 금지: Build.* 누수)
  log "recover_world: boot_recover 시작 (전체, [11] 포함)"
  bash "$SK/boot_recover.sh" 10179 >> "$LOG" 2>&1
  log "recover_world: boot_recover 종료"
}

prep_world(){
  for TRY in 1 2; do
    if ! render_ok; then log "render wedge → reboot+recover (시도 $TRY)"; reboot_fresh; recover_world; continue; fi
    if ! world_audit; then log "world audit FAIL → recover (시도 $TRY)"; recover_world; continue; fi
    render_ok && log "render OK — 세계 준비 완료" || { log "render wedge post-recover — 재시도"; reboot_fresh; recover_world; continue; }
    df_line=$($ADB shell "df -h /data | tail -1" 2>/dev/null|tr -d '\r')
    log "disk: $df_line"
    return 0
  done
  log "prep_world 2회 실패 — 렌더 웨지 지속. 이 프로브는 측정 소모 없이 스킵"
  return 1
}

measure(){ timeout 90 $ADB shell "su 0 sh /data/local/tmp/run_measure.sh" 2>/dev/null | tr -d '\r'; }

forensics(){ # 사망 원인 감별용 logcat 테일
  $ADB shell "logcat -d -t 300 2>/dev/null | grep -E 'am_crash|am_proc_died|RenderThread|SIGABRT|ENOSPC|Realm' | tail -12" 2>/dev/null | tr -d '\r' >> "$LOG"
  echo "  (logcat tail 기록)" >> "$LOG"
}

# ── 1. 초기 조용 대기 (디에스컬 유도 — 보고 0건) ──
INIT_WAIT=${INIT_WAIT:-43200}   # 12시간 (마지막 에스컬 보고 00:26 기준 ~+12h)
log "초기 무런 대기 ${INIT_WAIT}s (디에스컬 유도)"
sleep "$INIT_WAIT"

# ── 2. 디에스컬 프로브 루프 ──
ATT=0; MAXATT=${MAXATT:-6}; GAP=${GAP:-10800}
while [ $ATT -lt $MAXATT ]; do
  ATT=$((ATT+1))
  if ! prep_world; then
    log "probe$ATT 스킵(웨지) — ${GAP}s 대기 후 재시도 (보고 0건)"
    sleep "$GAP"; continue
  fi
  R=$(measure); log "probe$ATT: $R"
  forensics
  S=$(echo "$R"|grep -oE 'SURVIVED_S=[0-9]+'|cut -d= -f2)
  if [ "${S:-0}" -ge 9 ]; then
    log "=== DEESCALATED (${S}s) — 5런 시리즈 개시 ==="
    OKN=0
    for i in 1 2 3 4 5; do
      if ! prep_world; then log "  run$i 스킵(웨지)"; continue; fi
      R=$(measure); log "  run$i: $R"
      OKN=$((OKN+1))
      sleep 10
    done
    log "=== SERIES DONE ($OKN/5 런) — 런별 LABEL은 위 run1-5 로그 참조 ==="
    log "판정: 라벨 0/5=§185 채널폐쇄 인과 확정 / [EMULATOR] 잔존=GL/미지입력 재탐색"
    exit 0
  fi
  log "probe$ATT 여전히 에스컬(${S:-?}s) — ${GAP}s 대기 (보고 최소화)"
  sleep "$GAP"
done
log "=== ${MAXATT}회 프로브 소진 — 여전히 에스컬레이션. 더 긴 무런 대기 필요(§156). 재실행: bash $0 ==="
