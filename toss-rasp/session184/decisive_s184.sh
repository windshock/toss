#!/bin/bash
# 결정 실험 자율 오케스트레이터 — 자정(디에스컬 예상) 이후 프로브 → 5런 스크럽 계열
export ANDROID_SERIAL=emulator-5554
export PATH="$HOME/Library/Android/sdk/platform-tools:$PATH"
ADB=adb
LOG=/tmp/decisive_s184.log
echo "=== orchestrator start $(date) ===" >> $LOG
# 자정까지 대기 (최대 70분)
while [ $(date +%H%M) -lt 5 ]; do sleep 60; done
echo "=== midnight passed, probing era $(date) ===" >> $LOG
ATTEMPT=0
while [ $ATTEMPT -lt 4 ]; do
  ATTEMPT=$((ATTEMPT+1))
  R=$($ADB shell "su 0 sh /data/local/tmp/run_measure.sh" 2>/dev/null | tr -d '\r')
  echo "probe$ATTEMPT: $R ($(date +%H:%M:%S))" >> $LOG
  S=$(echo "$R" | grep -oE 'SURVIVED_S=[0-9]+' | cut -d= -f2)
  if [ "${S:-0}" -ge 9 ]; then
    echo "=== DEESCALATED ($S s) — 5런 스크럽 계열 개시 ===" >> $LOG
    for i in 1 2 3 4 5; do
      echo "--- SCRUB RUN $i ($(date +%H:%M:%S)) ---" >> $LOG
      bash /Users/1004276/Downloads/toss/tmp-artifacts/tools/gl_dynstr_scrub.sh >> $LOG 2>&1
      sleep 5
    done
    echo "=== SERIES DONE $(date) ===" >> $LOG
    exit 0
  fi
  echo "still escalated (or short), waiting 20min..." >> $LOG
  sleep 1200
done
echo "=== 4 probes exhausted, still escalated — 종료 ===" >> $LOG
