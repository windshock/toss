#!/bin/bash
# 24차 v3: 폴링마다 root 자동 재취득(관측 복병: adb root 주기 탈락) + 숫자 파싱 강화
export PATH="$HOME/Library/Android/sdk/platform-tools:$PATH"
OUT=${1:-/tmp/caller24}; mkdir -p "$OUT"
ensure_root() {
  local U=$(adb shell id -u 2>/dev/null | tr -dc '0-9')
  [ "$U" = "0" ] && return 0
  adb root >/dev/null 2>&1; sleep 2
  U=$(adb shell id -u 2>/dev/null | tr -dc '0-9'); [ "$U" = "0" ]
}
ensure_root || { echo "[!] root 실패"; exit 1; }
adb shell am start -n viva.republica.toss/.splash.SplashActivity >/dev/null 2>&1
sleep 1
P0=$(adb shell "pidof viva.republica.toss" | tr -d '\r' | awk '{print $1}')
[ -n "$P0" ] || { echo "[!] 시작 실패"; exit 1; }
echo "[*] pid=$P0 fault 대기"
BASE=$(adb shell "dmesg | grep -c faultdump" | tr -dc '0-9'); echo "base=$BASE"
for i in $(seq 1 400); do
  C=$(adb shell "dmesg | grep -c faultdump" 2>/dev/null | tr -dc '0-9')
  if [ -n "$C" ] && [ "$C" -gt "$BASE" ] 2>/dev/null; then
    PID=$(adb shell "pidof viva.republica.toss" | tr -d '\r' | awk '{print $1}')
    PID=${PID:-$P0}
    echo "[*] faultdump(poll $i) pid=$PID"
    adb shell "cat /proc/$PID/maps" > "$OUT/maps.txt" 2>/dev/null
    DM=$(adb shell "dmesg | grep 'SFI11' | grep republica | tail -1")
    echo "$DM" > "$OUT/dmesg.txt"
    FS=$(echo "$DM" | grep -oE "sp=0x[0-9a-f]+" | head -1 | cut -d= -f2)
    echo "[*] fault_sp=$FS"
    if [ -n "$FS" ]; then
      PG=$(( (FS & ~0xFFF) / 4096 ))
      adb shell "dd if=/proc/$PID/mem bs=4096 skip=$PG count=1 2>/dev/null" > "$OUT/page.bin"
      echo "$FS" > "$OUT/sp.txt"
    fi
    break
  fi
  [ $((i % 40)) -eq 0 ] && ensure_root
  sleep 0.2
done
ls -la "$OUT/page.bin" 2>/dev/null | awk '{print "page:", $5}'
