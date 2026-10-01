#!/bin/bash
# restricted_run.sh v2 — 제한 모드(dword 만료+차단) + 지연무장 exit_block
#  v1 교훈: 처음부터 exit_block=1이면 T+1.2s의 가드 자식(which/cmd)이 동결 →
#           fail-closed 조기 사멸(T+2.5s). 다이얼로그 확인 후 무장해야 메인만 동결.
# 사용: restricted_run.sh <runid> <auto|tap> <full|mini>
set -u
export ANDROID_SERIAL=emulator-5554
ADB=~/Library/Android/sdk/platform-tools/adb
RID=$1; MODE=$2; SET=${3:-full}
OUT=/Users/1004276/Downloads/toss/toss-rasp/session156/run$RID
DDIR=/data/local/tmp/rf_$RID
rm -rf $OUT; mkdir -p $OUT
TL=$OUT/timeline.txt
PKG=viva.republica.toss
now_ms() { python3 -c 'import time; print(int(time.time()*1000))'; }
log() { echo "[$(($(now_ms)-T0))ms] $*" | tee -a $TL; }
dsh() { $ADB shell "$@"; }

cleanup() {
  dsh "su 0 sh -c 'echo 0 > /sys/module/hide_kmod/parameters/exit_block'" 2>/dev/null
  kill ${POLLER:-0} 2>/dev/null
}
trap cleanup EXIT

dsh "su 0 sh -c 'echo 0 > /sys/module/hide_kmod/parameters/exit_block'"
HITS0=$(dsh "su 0 cat /sys/module/hide_kmod/parameters/exit_block_hits" | tr -d '\r')
dsh "su 0 dmesg -C" >/dev/null 2>&1
dsh "am force-stop $PKG" >/dev/null 2>&1; sleep 1

T0=$(now_ms)
dsh "am start -n $PKG/.splash.SplashActivity" >/dev/null 2>&1
PID=""
for i in $(seq 1 50); do PID=$(dsh "pidof $PKG" | tr -d '\r'); [ -n "$PID" ] && break; sleep 0.1; done
[ -z "$PID" ] && { echo "NO_PID" | tee -a $TL; exit 1; }
log "START pid=$PID mode=$MODE set=$SET"

# logstore 폴러 (300ms, 변화시만)
( LAST=""; while :; do
    CUR=$(dsh "su 0 sh -c 'cat /data/data/$PKG/files/logstore/logitems/*.json 2>/dev/null'" | grep -aE 'dword_debug|fds_|exitPlan|RASP|message_present|acquire|prepareSecret' | md5)
    if [ "$CUR" != "$LAST" ] && [ -n "$CUR" ]; then
      echo "[$(($(now_ms)-T0))ms] LOGSTORE:" >> $TL
      dsh "su 0 sh -c 'cat /data/data/$PKG/files/logstore/logitems/*.json 2>/dev/null'" | grep -aE 'dword_debug|fds_|exitPlan|RASP|message_present|acquire|prepareSecret' | tail -6 | sed 's/^/    /' >> $TL
      LAST=$CUR
    fi
    p=$(dsh "pidof $PKG" | tr -d '\r'); [ -z "$p" ] && { echo "[$(($(now_ms)-T0))ms] LOGSTORE-POLLER: process gone" >> $TL; break; }
  done ) &
POLLER=$!

# 다이얼로그 대기: T+4.5s부터 uiautomator 폴링
DIALOG=0; ARMED=0; TAPPED=0; FROZE=0; FROZE_T=; SC2=0
while :; do
  EL=$(( $(now_ms) - T0 ))
  if [ $DIALOG -eq 0 ] && [ $EL -ge 4500 ]; then
    dsh "uiautomator dump /data/local/tmp/ui_$RID.xml" >/dev/null 2>&1
    if $ADB shell "cat /data/local/tmp/ui_$RID.xml" 2>/dev/null | tr -d '\r' | grep -q "해킹 위험성"; then
      DIALOG=1
      $ADB shell "cat /data/local/tmp/ui_$RID.xml" 2>/dev/null | tr -d '\r' > $OUT/ui_dialog.xml
      $ADB exec-out screencap -p > $OUT/dialog_t${EL}ms.png 2>/dev/null
      log "DIALOG confirmed @${EL}ms"
      # ★ 지연 무장: 메인의 다가올 exit만 동결
      dsh "su 0 sh -c 'echo 1 > /sys/module/hide_kmod/parameters/exit_block'"
      ARMED=1; log "ARMED exit_block=1"
      if [ "$MODE" = tap ]; then sleep 1.5
        B=$(grep -ao 'text="확인"[^>]*bounds="\[[0-9]*,[0-9]*\]\[[0-9]*,[0-9]*\]"' $OUT/ui_dialog.xml | head -1 | grep -ao '\[[0-9]*,[0-9]*\]\[[0-9]*,[0-9]*\]' | tr -d '[]' | awk -F, '{print int(($1+$3)/2), int(($2+$4)/2)}')
        if [ -n "$B" ]; then
          dsh "input tap $B"; TAPPED=1; log "TAP 확인 @($B)"
        else log "NO_BUTTON"; fi
      fi
    fi
  fi
  # 다이얼로그 없이 12s 도달 → 어쨌든 무장(자식은 이미 끝난 시점)
  if [ $ARMED -eq 0 ] && [ $EL -ge 1500 ]; then
    dsh "su 0 sh -c 'echo 1 > /sys/module/hide_kmod/parameters/exit_block'"; ARMED=1
    $ADB exec-out screencap -p > $OUT/screen_t${EL}ms.png 2>/dev/null
    log "ARMED(fallback 12s, dialog=$DIALOG)"
  fi
  if [ "$MODE" = auto ] && [ $DIALOG -eq 1 ] && [ $SC2 -eq 0 ] && [ $EL -ge 12000 ]; then
    $ADB exec-out screencap -p > $OUT/dialog2_t${EL}ms.png 2>/dev/null; SC2=1; log "SCREENCAP2"
  fi
  # 동결 감지 (무장 이후만)
  if [ $ARMED -eq 1 ] && [ $FROZE -eq 0 ]; then
    H=$(dsh "su 0 cat /sys/module/hide_kmod/parameters/exit_block_hits" | tr -d '\r')
    if [ "$H" != "$HITS0" ]; then
      FROZE=1; FROZE_T=$(now_ms)
      EX=$(dsh "su 0 dmesg" | grep EXITSTOP | tail -3 | tr '\n' ';')
      log "FROZE exitstop: $EX"
      dsh "su 0 sh -c 'cat /proc/$PID/maps'" 2>/dev/null | tr -d '\r' > $OUT/maps_at_freeze.txt
      # 동결 창 온디바이스 덤프
      dsh "su 0 sh -c 'rm -rf $DDIR; mkdir -p $DDIR'"
      cat > /tmp/rfdump_$RID.sh <<EOS
#!/system/bin/sh
PID=\$1; D=\$2; SET=\$3
dump_region() {
  pat=\$1; pre=\$2; cap=\$3
  grep "\$pat" /proc/\$PID/maps 2>/dev/null | grep 'rw' | while read -r line; do
    RANGE=\$(echo "\$line" | awk '{print \$1}')
    S=\$((0x\$(echo \$RANGE | cut -d- -f1))); E=\$((0x\$(echo \$RANGE | cut -d- -f2)))
    SZ=\$(( (E - S) / 1048576 )); [ \$SZ -gt \$cap ] && SZ=\$cap; [ \$SZ -eq 0 ] && SZ=1
    # toybox dd skip*bs 32비트 오버플로 → 정적 memread 헬퍼 (§156)
    /data/local/tmp/memread \$PID \$(printf %x \$S) \$(printf %x \$((SZ * 1048576))) \$D/\${pre}_\$(printf %x \$S).bin
  done
}
if [ "\$SET" = full ]; then
  dump_region "dalvik-main space" heap_main 48
  dump_region "linearalloc" heap_lin 16
  dump_region "libea56" libea56_rw 4
  dump_region "scudo" heap_scudo 24
  dump_region "large object space" heap_los 16
else
  dump_region "libea56" libea56_rw 4
  dump_region "linearalloc" heap_lin 16
fi
EOS
      $ADB push /tmp/rfdump_$RID.sh $DDIR/dump.sh >/dev/null 2>&1
      dsh "su 0 sh $DDIR/dump.sh $PID $DDIR $SET" >/dev/null 2>&1
      dsh "su 0 sh -c 'ls -la $DDIR'" | tr -d '\r' > $OUT/dumplist.txt
      log "DUMP done: $(grep -c '\.bin' $OUT/dumplist.txt) files"
    fi
  fi
  P=$(dsh "pidof $PKG" | tr -d '\r')
  if [ -z "$P" ]; then log "DEAD"; break; fi
  [ $EL -ge 100000 ] && { log "TIMEOUT_100s"; break; }
  sleep 0.3
done

kill $POLLER 2>/dev/null; wait $POLLER 2>/dev/null
dsh "su 0 sh -c 'echo 0 > /sys/module/hide_kmod/parameters/exit_block'"
dsh "am force-stop $PKG" >/dev/null 2>&1
$ADB pull $DDIR $OUT/dumps >/dev/null 2>&1
[ -d $OUT/dumps ] && log "PULL: $(ls $OUT/dumps | wc -l | tr -d ' ') files"
FD=""; [ -n "$FROZE_T" ] && FD=$(( $(now_ms) - FROZE_T ))
echo "=== SUMMARY run$RID mode=$MODE set=$SET dialog=$DIALOG armed=$ARMED tapped=$TAPPED froze=$FROZE freeze_dur=$FD ===" | tee -a $TL
exit 0
