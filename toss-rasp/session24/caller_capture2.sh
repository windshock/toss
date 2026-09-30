#!/bin/bash
# 24차: isRestricted caller LR 캡처 보강판 — [sp+0x28]=caller LR(Art quick 프롤로그
# stp x23,x30,[sp,#0x20]가 저장). fault 창 /proc/mem(비-ptrace)로 읽는다.
export PATH="$HOME/Library/Android/sdk/platform-tools:$PATH"
OUT=${1:-/tmp/caller24}; mkdir -p "$OUT"
# 0) root 선검증
[ "$(adb shell id -u | tr -d '\r')" = "0" ] || { adb root >/dev/null 2>&1; sleep 3; }
[ "$(adb shell id -u | tr -d '\r')" = "0" ] || { echo "[!] root 실패"; exit 1; }
# 1) 런 시작 + 생존 확인
adb shell am start -n viva.republica.toss/.splash.SplashActivity >/dev/null 2>&1
sleep 1
P0=$(adb shell "pidof viva.republica.toss" | tr -d '\r' | awk '{print $1}')
[ -n "$P0" ] || { echo "[!] 시작 실패"; exit 1; }
echo "[*] toss pid=$P0 — fault 대기"
BASE=$(adb shell "dmesg | grep -c faultdump" | tr -d '\r')
# 2) faultdump 감지
for i in $(seq 1 240); do
  C=$(adb shell "dmesg | grep -c faultdump" 2>/dev/null | tr -d '\r')
  if [ -n "$C" ] && [ "$C" -gt "$BASE" ] 2>/dev/null; then
    PID=$(adb shell "pidof viva.republica.toss" | tr -d '\r' | awk '{print $1}')
    echo "[*] faultdump at poll $i (pid=$PID base_pid=$P0)"
    adb shell "cat /proc/${PID:-$P0}/maps" > "$OUT/maps.txt" 2>/dev/null
    DM=$(adb shell "dmesg | grep 'SFI11' | grep republica | tail -1")
    echo "$DM" > "$OUT/dmesg.txt"
    FS=$(echo "$DM" | grep -oE "sp=0x[0-9a-f]+" | head -1 | cut -d= -f2)
    echo "[*] SFI11: $DM" | head -c 200; echo
    if [ -n "$FS" ] && [ -n "$PID" ]; then
      PG=$(( (FS & ~0xFFF) / 4096 ))
      adb shell "dd if=/proc/$PID/mem bs=4096 skip=$PG count=1 2>/dev/null" > "$OUT/page.bin"
      echo "$FS" > "$OUT/sp.txt"; echo "captured"
    else
      echo "[!] sp 미추출(SFI11 없음?) — dmesg tail 저장"
      adb shell "dmesg | tail -30" > "$OUT/dmesg_tail.txt"
    fi
    break
  fi
  sleep 0.25
done
ls -la "$OUT/page.bin" 2>/dev/null | awk '{print "page:", $5}'
