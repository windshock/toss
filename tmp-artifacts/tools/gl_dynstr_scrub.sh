#!/bin/bash
# gl_dynstr_scrub.sh — §183: 앱 매핑 GL 라이브러리의 dynstr 페이지를 런타임에 스크럽
# (§180 핀 검사 통과 후 시점에 /proc/pid/mem FOLL_FORCE COW 쓰기 — LKM 불필요 실증됨)
#
# 원리: 가드는 매핑 GL lib의 dynstr 심볼명을 핀(§180). 파일 수술은 핀에 걸려 사망.
# 이 도구는 (a) 앱 기동 (b) GL 웹 매핑 대기 (c) 각 lib의 dynstr 페이지 [strtab, strtab+strsz)
# 를 memread→토큰 치환→memwrite. 페이지캐시 무오염(프로세스 사본만).
#
# 사용: gl_dynstr_scrub.sh [wait_for_all_libs=1] — ANDROID_SERIAL 필수
# 산출: /tmp/scrub_stats.txt (lib별 치환 카운트), 콘솔 리포트
set -u
export PATH="$HOME/Library/Android/sdk/platform-tools:$PATH"
ADB="adb"
PKG=viva.republica.toss
D="su 0 sh -c"

# 앱 매핑 GL 웹(§180 T+4s 실측) — .vl64 뷰 내 파일만 (enc 4종은 zygote 프리마운트 상속 — 뷰 밖)
LIBS="egl/libEGL_adreno.so egl/libGLESv1_CM_adreno.so egl/libGLESv2_adreno \
libGfxPerfCollector.so libOpenglCodecCommon.so libglcommon.so \
libglesv1qti.so libglesv2qti.so libqti_adreno.so libvulkanqti.so"

# dynstr 범위: 정본 ELF에서 계산 (파일: /tmp/vl64_all 기준 — dynstr은 rodata 수술과 무변)
python3 - "$@" <<'PYEOF' > /tmp/dynstr_ranges.txt
import struct, sys, os
def v2o(d, phoff, phentsize, phnum, v):
    for i in range(phnum):
        o = phoff+i*phentsize
        t, = struct.unpack_from('<I', d, o)
        if t == 1:
            off, va, pa, fsz, msz, al = struct.unpack_from('<QQQQQQ', d, o+8)
            if va <= v < va+fsz: return off+(v-va)
for rel in ["egl/libEGL_adreno.so","egl/libGLESv1_CM_adreno.so","egl/libGLESv2_adreno.so",
            "libGfxPerfCollector.so","libOpenglCodecCommon.so","libglcommon.so",
            "libglesv1qti.so","libglesv2qti.so","libqti_adreno.so","libvulkanqti.so"]:
    d = open('/tmp/vl64_all/'+rel,'rb').read()
    phoff, = struct.unpack_from('<Q', d, 0x20)
    phentsize, phnum = struct.unpack_from('<HH', d, 0x36)
    dt = {}
    for i in range(phnum):
        o = phoff+i*phentsize
        t, = struct.unpack_from('<I', d, o)
        if t == 2:
            off, = struct.unpack_from('<Q', d, o+8); fsz, = struct.unpack_from('<Q', d, o+32)
            for j in range(fsz//16):
                tag, val = struct.unpack_from('<QQ', d, off+j*16)
                if tag == 0: break
                dt.setdefault(tag, val)
    stroff = v2o(d, phoff, phentsize, phnum, dt[5]); strsz = dt.get(10,0)
    print(f"{rel}\t{stroff:#x}\t{strsz:#x}")
PYEOF
cat /tmp/dynstr_ranges.txt

echo "=== 앱 기동 ==="
$ADB shell "$D 'am force-stop $PKG; rm -f /data/data/$PKG/files/logstore/logitems/*.json; am start -n $PKG/.splash.SplashActivity'" >/dev/null 2>&1
PID=""
for i in $(seq 1 60); do PID=$($ADB shell pidof $PKG | tr -d '\r'); [ -n "$PID" ] && break; sleep 0.05; done
echo "pid=$PID"
[ -z "$PID" ] && exit 1

# GL 웹 전체 매핑 대기 (최대 8s)
for i in $(seq 1 80); do
  N=$($ADB shell "$D 'cat /proc/$PID/maps 2>/dev/null | grep -cE \"libEGL_adreno|GLESv1_CM_adreno|GLESv2_adreno|GfxPerfCollector|OpenglCodecCommon|libglcommon|glesv1qti|glesv2qti|qti_adreno|vulkanqti\"'" | tr -d '\r')
  [ "${N:-0}" -ge 10 ] && { echo "web_mapped at poll $i (N=$N)"; break; }
  $ADB shell "[ -d /proc/$PID ]" >/dev/null 2>&1 || { echo "DIED at poll $i"; break; }
  sleep 0.1
done

: > /tmp/scrub_stats.txt
TOTAL=0
while IFS=$'\t' read -r REL OFF SIZE; do
  NAME=$(basename "$REL")
  BASE=$($ADB shell "$D 'grep \"$REL\" /proc/$PID/maps 2>/dev/null | head -1 | cut -d- -f1'" | tr -d '\r')
  if [ -z "$BASE" ]; then echo "$NAME: NOT_MAPPED" >> /tmp/scrub_stats.txt; continue; fi
  # 페이지 범위 (page align)
  PSTART=$(python3 -c "print(hex((int('$BASE',16)+int('$OFF',16)) & ~0xfff))")
  PEND=$(python3 -c "print(hex((int('$BASE',16)+int('$OFF',16)+int('$SIZE',16)+0xfff) & ~0xfff))")
  CNT=0
  for PG in $(python3 -c "
s=int('$PSTART',16); e=int('$PEND',16)
while s<e: print(hex(s)); s+=0x1000"); do
    $ADB shell "$D '/data/local/tmp/memread $PID $PG 1000 /data/local/tmp/pg.bin'" >/dev/null 2>&1
    $ADB pull /data/local/tmp/pg.bin /tmp/pg_s.bin >/dev/null 2>&1
    N=$(python3 - << 'PYE'
d = bytearray(open('/tmp/pg_s.bin','rb').read())
c = 0
for a,b in [(b'goldfish',b'g0ldf1sh'),(b'qemu',b'q3mu'),(b'Emulator',b'Emul4tor'),
            (b'ranchu',b'r4nchu'),(b'Goldfish',b'G0ldf1sh'),(b'QEMU',b'Q3MU'),(b'Ranchu',b'R4nchu')]:
    c += d.count(a); d = d.replace(a,b)
open('/tmp/pg_scrubbed.bin','wb').write(bytes(d))
print(c)
PYE
)
    if [ "${N:-0}" != "0" ]; then
      $ADB push /tmp/pg_scrubbed.bin /data/local/tmp/pg_scrubbed.bin >/dev/null 2>&1
      $ADB shell "$D '/data/local/tmp/memwrite $PID $PG /data/local/tmp/pg_scrubbed.bin'" >/dev/null 2>&1
      CNT=$((CNT+N))
    fi
  done
  echo "$NAME: $CNT tokens @ base=$BASE range=$PSTART..$PEND" >> /tmp/scrub_stats.txt
  TOTAL=$((TOTAL+CNT))
done < /tmp/dynstr_ranges.txt

echo "=== 스크럽 결과 (total=$TOTAL) ==="
cat /tmp/scrub_stats.txt
echo "=== 리드백 검증 ==="
while IFS=$'\t' read -r REL OFF SIZE; do
  NAME=$(basename "$REL")
  BASE=$($ADB shell "$D 'grep \"$REL\" /proc/$PID/maps 2>/dev/null | head -1 | cut -d- -f1'" | tr -d '\r')
  [ -z "$BASE" ] && continue
  PSTART=$(python3 -c "print(hex((int('$BASE',16)+int('$OFF',16)) & ~0xfff))")
  PEND=$(python3 -c "print(hex((int('$BASE',16)+int('$OFF',16)+int('$SIZE',16)+0xfff) & ~0xfff))")
  for PG in $(python3 -c "
s=int('$PSTART',16); e=int('$PEND',16)
while s<e: print(hex(s)); s+=0x1000"); do
    $ADB shell "$D '/data/local/tmp/memread $PID $PG 1000 /data/local/tmp/pg.bin'" >/dev/null 2>&1
    $ADB pull /data/local/tmp/pg.bin /tmp/pg_rb.bin >/dev/null 2>&1
    R=$(python3 -c "
d=open('/tmp/pg_rb.bin','rb').read()
q=sum(d.count(t) for t in [b'qemu',b'goldfish',b'ranchu',b'Emulator'])
g=sum(d.count(t) for t in [b'q3mu',b'g0ldf1sh',b'r4nchu',b'Emul4tor'])
print(f'{q} {g}')
")
    echo "$NAME $PG residual_tells=$R"
  done
done < /tmp/dynstr_ranges.txt
echo "=== 생존 관찰 ==="
LAST=""; N=0
while $ADB shell "[ -d /proc/$PID ]" >/dev/null 2>&1 && [ $N -lt 25 ]; do
  sleep 1; N=$((N+1))
  L=$($ADB shell "$D 'cat /data/data/$PKG/files/logstore/logitems/*.json 2>/dev/null'" | grep -o '"result":"\[[A-Z_]*\]"' | tail -1)
  [ -n "$L" ] && LAST="$L"
done
echo "SURVIVED_AFTER_SCRUB=${N}s LABEL=$LAST"
