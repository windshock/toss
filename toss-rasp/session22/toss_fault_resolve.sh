#!/bin/bash
# toss_fault_resolve.sh — 22차: fault 발생 즉시 살아있는 프로세스의 maps를 잡아
# SFO 복원 pc / RxCachedThreadS fault pc를 모듈로 resolve한다.
# 컬렉션 창(fault 후 ~12s) 안에 maps만 잡으면 주소 대조는 사후에 가능.
export PATH="$HOME/Library/Android/sdk/platform-tools:$PATH"
OUT=${1:-/tmp/resolve_run}
mkdir -p "$OUT"

echo "[*] toss launch"
adb shell am start -n viva.republica.toss/.splash.SplashActivity >/dev/null 2>&1

BASE=$(adb shell "dmesg | grep -c faultdump" | tr -d '\r')
echo "[*] baseline faultdump count = $BASE"

# faultdump 등장 폴링 (0.25s)
for i in $(seq 1 360); do
  C=$(adb shell "dmesg | grep -c faultdump" | tr -d '\r')
  if [ "$C" -gt "$BASE" ]; then
    PID=$(adb shell "pidof viva.republica.toss" | tr -d '\r' | awk '{print $1}')
    TS=$(date +%H%M%S)
    echo "[*] faultdump! (count=$C pid=$PID) — maps 즉시 캡처"
    adb shell "cat /proc/$PID/maps" > "$OUT/maps_${TS}_${PID}.txt" 2>/dev/null
    adb shell "cat /proc/$PID/task" > /dev/null 2>&1
    sleep 1.2   # SFI11/SFO가 다 찍힌 뒤
    adb shell "dmesg | tail -60" > "$OUT/dmesg_${TS}.txt"
    echo "[*] captured $OUT/{maps,dmesg}_${TS}*"
    break
  fi
  sleep 0.25
done

# SFO 복원 pc / SFI fault-ctx를 최신 dmesg에서 추출해 maps로 resolve
python3 - "$OUT" <<'EOF'
import sys, os, glob, re
out = sys.argv[1]
maps_files = sorted(glob.glob(out + "/maps_*.txt"))
if not maps_files:
    print("[!] maps 없음"); sys.exit(0)
maps = []
for ln in open(maps_files[-1]):
    m = re.match(r"([0-9a-f]+)-([0-9a-f]+) (\S+) (\S+) \S+ \S+\s*(.*)", ln)
    if m: maps.append((int(m.group(1),16), int(m.group(2),16), int(m.group(4),16), m.group(5).strip()))
def resolve(addr):
    # 23차 정정(codex 검토): ELF vaddr = (addr - map_start) + map_pgoff.
    # 매핑 상대 offset을 그대로 심볼 offset으로 쓰면 pgoff 있는 매핑(libart rx
    # pgoff=0x200000 등)에서 완전히 엉뚱한 심볼이 나온다(22차 실사고).
    for s,e,pgoff,name in maps:
        if s <= addr < e: return "%s ELFvaddr+0x%x" % (name or "anon", (addr - s) + pgoff)
    return None
dm = sorted(glob.glob(out + "/dmesg_*.txt"))[-1]
for ln in open(dm):
    if "SFO:" in ln or "restored pc=" in ln:
        m = re.search(r"restored pc=0x([0-9a-f]+)", ln)
        if m:
            a = int(m.group(1),16)
            print("SFO restored pc 0x%x -> %s   [%s]" % (a, resolve(a), ln.strip()[:60]))
    if "fault-ctx pc=" in ln:
        m = re.search(r"fault-ctx pc=0x([0-9a-f]+)", ln)
        if m:
            a = int(m.group(1),16)
            print("SFI fault-ctx 0x%x -> %s" % (a, resolve(a)))
EOF