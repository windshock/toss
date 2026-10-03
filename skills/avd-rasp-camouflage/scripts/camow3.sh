#!/system/bin/sh
# camow3.sh v4.0
# v4.0 (2026-09-20): ① smaps 별도 파일(형식 일치 — 토스가 smaps 직접 판독 실측)
#   ② 타 프로세스 cmdline은 실제값 노출(빈파일 위장이 tamper 신호화 — 실측)
#   ③ 실행 경로를 /data/local/tmp/.system_profile로 (cmdline 스윕 노출 완화) — 위장 파일 유지 루프
# v3.9 (2026-09-20): 위장 파일명을 단문(.m/.s/...)에서 난수명으로 전면 교체.
#   토스 가드(libea56)가 fork 자식으로 /dev/.m .s .k .u .t .c .v .n .e .mi 를
#   이름 그대로 브루트포스 open해 존재만으로 판정하는 채널 실측 (ftrace
#   297.811 — 크래시 20ms 직전). 열거는 LKM filldir가 은닉 + 이름은 비추측성.
# v3.8: goldfish GL 디바이스 클론 노드(fd readlink 세탁) + cpuinfo 8코어화.
FEAT='fp asimd evtstrm aes pmull sha1 sha2 crc32 atomics fphp asimdhp cpuid asimdrdm jscvt fcma lrcpc dcpop sha3 asimddp sha512 asimdfhm dit uscat ilrcpc flagm ssbs sb paca pacg dcpodp flagm2 frint'
# v3.9 이름표 (LKM hide_kmod.c의 redirect/dirent_hidden과 동기 유지 필수)
F_MAPS=.q7zm4h; F_STAT=.w2nvk9; F_MNT=.jt38xs; F_UNIX=.ra965d; F_TCP=.vy42mq
F_CPUC=.zc7h4u; F_VER=.kb913x;  F_COMM=.ns582t; F_MISC=.ew471v; F_E=.oq306f
F_ONLN=.pl728v; F_GFP=.wq517h;  F_GAS=.tr482w;  F_GSY=.un394z
F_SMAPS=.pk832d

# 구 단문명 정리 — 가드 브루트포스 리스트에 걸리는 이름은 절대 남기지 않는다
rm -f /dev/.m /dev/.s /dev/.k /dev/.u /dev/.t /dev/.c /dev/.v /dev/.n /dev/.e /dev/.mi /dev/.c2 /dev/.gfp /dev/.gas /dev/.gsy

gen_cpuinfo() {
  : > /dev/$F_CPUC
  for i in 0 1 2 3 4 5 6 7; do
    case $i in
      0) PART=0xd4e; VAR=0x1 ;;   # Cortex-X3
      [1-4]) PART=0xd4d; VAR=0x1 ;; # Cortex-A715
      *) PART=0xd46; VAR=0x1 ;;   # Cortex-A510
    esac
    printf 'processor\t: %d\nBogoMIPS\t: 38.40\nFeatures\t: %s\nCPU implementer\t: 0x41\nCPU architecture: 8\nCPU variant\t: 0x%x\nCPU part\t: 0x%03x\nCPU revision\t: 0\n\n' "$i" "$FEAT" "$VAR" "$PART" >> /dev/$F_CPUC
  done
  printf 'Hardware\t: Qualcomm Technologies, Inc SM8550\n' >> /dev/$F_CPUC
}
gen_cpuinfo

mkdir -p /data/local/tmp/.camo
[ -s /dev/$F_MAPS ] || cp /data/local/tmp/.camo/maps  /dev/$F_MAPS 2>/dev/null
[ -s /dev/$F_STAT ] || cp /data/local/tmp/.camo/status /dev/$F_STAT 2>/dev/null
[ -s /dev/$F_MNT ]  || cp /data/local/tmp/.camo/mounts /dev/$F_MNT 2>/dev/null
[ -s /dev/$F_UNIX ] || cp /data/local/tmp/.camo/net_unix /dev/$F_UNIX 2>/dev/null
[ -s /dev/$F_TCP ]  || cp /data/local/tmp/.camo/net_tcp /dev/$F_TCP 2>/dev/null
grep -vE 'goldfish|vbox' /proc/misc > /dev/$F_MISC 2>/dev/null
# v4.4: LKM이 uname(2)을 삼성 형식으로 위장(v4.4 kretprobe)하므로 /proc/version 가짜도
# 동일 문자열이어야 정합(가드의 version vs uname 교차비교 대응). 릴리스/버전은
# hide_kmod.c의 UTS_RELEASE_SPOOF/UTS_VERSION_SPOOF와 동기 유지.
echo 'Linux version 5.15.94-android13-8-30358670-abS916NKSU1AWC2 (build@21D1S012) (Android (8508608, based on r450784e) clang version 14.0.7 (https://android.googlesource.com/toolchain/llvm-project 4c603efb0cca074e9238af8b4106c30add4418f6), LLD 14.0.7) #1 SMP PREEMPT Thu Jun 8 18:11:35 KST 2023' > /dev/$F_VER

# v4.4: uid sysstats 존재 위장 (GKI 에뮬엔 없고 실기기엔 있는 3종 — 가드 dex 어휘)
gen_uidtis() { # FILENAME
  printf 'uid_name_index_is_active\ntotal: 8\n' > /dev/$1
  printf '0 root 0 1\n0: 0 0 0 0 0 0 0 0\n' >> /dev/$1
  printf '1000 system 0 1\n1000: 0 0 0 0 0 0 0 0\n' >> /dev/$1
  printf '1021 media 0 1\n1021: 0 0 0 0 0 0 0 0\n' >> /dev/$1
  printf '10175 u0_a175 0 1\n10175: 0 0 0 0 0 0 0 0\n' >> /dev/$1
}
# v4.5: MIDR_EL1(ARM SM8550 — 호스트 Apple 0x61 노출 차단) + selinux enforce=1 위장
printf '0x00000000411fd4e0\n' > /dev/.m8c4kd
printf '1\n' > /dev/.k3v9te
gen_uidtis .r5t8yo
printf 'uid_name_index_is_active\ntotal: 2\n0 root 0 1\n0: 0 0\n1000 system 0 1\n1000: 0 0\n10175 u0_a175 0 1\n10175: 0 0\n' > /dev/.s2w6za
cp /dev/.s2w6za /dev/.t7x3ub
echo '.android.smcard' > /dev/$F_COMM; echo 0-7 > /dev/$F_ONLN
: > /dev/$F_E

# v4.6 (2026-10-02 §185): /proc/{modules,filesystems,ioports} fake 생성.
#   LKM v4.22가 이 3종을 /dev/.fakemod/.fakefs/.fakeio로 redirect하지만 타깃 파일
#   생성기가 없어 ENOENT였다(반쪽 구현). 정적 해독(final_vocabulary) 결과 가드 바늘에
#   경로 /proc/modules·/proc/filesystems·/proc/ioports + 태그 "goldfish"가 있고,
#   실측 /proc/modules에 goldfish_sync·virtio_* 노출 → 미봉쇄 채널. 포괄 텔테일 필터로
#   fake 생성(디코드 바늘 0건 검증). 모듈/파일시스템/ioports는 부팅 후 정적이라 1회 생성.
#   주의: hide_kmod(우리 LKM) 라인도 반드시 제거(변조 텔테일).
PROC_TELL='goldfish|virtio|vbox|qemu|vmw_vsock|failover|nd_virtio|vexpress|pl111|virt_wifi|vcan|slcan|vhci|usbip|hide_kmod|sw_sync|rtc_test|pulse8|gs_usb|can_dev|9pnet|redroid|genyd|nox|memu|bluestacks|9p'
grep -viE "$PROC_TELL" /proc/modules     > /dev/.fakemod 2>/dev/null
grep -viE 'virtiofs|9p'  /proc/filesystems > /dev/.fakefs 2>/dev/null
grep -viE 'virtio'       /proc/ioports     > /dev/.fakeio 2>/dev/null
[ -s /dev/.fakemod ] || echo 'binder 258048 48 - Live 0x0000000000000000 (O)' > /dev/.fakemod
[ -s /dev/.fakefs ]  || printf 'nodev\tsysfs\nnodev\ttmpfs\n\text4\n\tf2fs\n' > /dev/.fakefs
[ -s /dev/.fakeio ]  || echo '00000000-0000ffff : PCI mem' > /dev/.fakeio
chmod 644 /dev/.fakemod /dev/.fakefs /dev/.fakeio 2>/dev/null
chcon u:object_r:qemu_device:s0 /dev/.fakemod /dev/.fakefs /dev/.fakeio 2>/dev/null

# goldfish GL 디바이스 클론 노드 (fd readlink 세탁) — minor는 /proc/misc에서 동적 판독
make_clone() { # NEWNAME MISCDEVNAME
  MN=$(grep -E " $2\$" /proc/misc | awk '{print $1}')
  [ -n "$MN" ] || return 0
  if [ ! -c "/dev/$1" ]; then
    mknod "/dev/$1" c 10 "$MN"; chmod 666 "/dev/$1"
    chcon u:object_r:qemu_device:s0 "/dev/$1" 2>/dev/null
  fi
}
make_clone $F_GFP goldfish_pipe
make_clone $F_GAS goldfish_address_space
make_clone $F_GSY goldfish_sync

ALL="$F_MAPS $F_STAT $F_MNT $F_UNIX $F_TCP $F_MISC $F_CPUC $F_VER $F_COMM $F_E $F_SMAPS"
chmod 644 $ALL 2>/dev/null
while true; do
  PID=
  for P in net.ib.android.smcard viva.republica.toss com.hanabank.oqf; do
    PID=$(pidof $P | cut -d' ' -f1)
    [ -n "$PID" ] && break
  done
  if [ -n "$PID" ]; then
    grep -vE 'frida|gum|\.rs9|linjector|goldfish|emulation|ranchu|qemu|_enc|OpenglSystem|GfxPerf|androidemu|vulkan_enc|xhook|CodecCommon' /proc/$PID/maps > /dev/$F_MAPS.tmp 2>/dev/null
    [ -s /dev/$F_MAPS.tmp ] && mv /dev/$F_MAPS.tmp /dev/$F_MAPS
    # v4.2: smaps는 블록 단위 필터 — 헤더만 지우면 Size:/VmFlags: 고아 블록이 남아
    # (실측: headers 3502 vs Size: 3510) 파서가 변형 스트림을 먹고 자폭 분기 진입.
    awk 'BEGIN{skip=0}
        /^[0-9a-f]+-[0-9a-f]+ /{ if ($0 ~ /frida|gum|\.rs9|linjector|goldfish|emulation|ranchu|qemu|_enc|OpenglSystem|GfxPerf|androidemu|vulkan_enc|xhook|CodecCommon/) skip=1; else { skip=0; print }; next }
        { if (!skip) print }' /proc/$PID/smaps > /dev/$F_SMAPS.tmp 2>/dev/null
    [ -s /dev/$F_SMAPS.tmp ] && mv /dev/$F_SMAPS.tmp /dev/$F_SMAPS
    sed 's/TracerPid:.*/TracerPid:\t0/' /proc/$PID/status > /dev/$F_STAT.tmp 2>/dev/null
    [ -s /dev/$F_STAT.tmp ] && mv /dev/$F_STAT.tmp /dev/$F_STAT
    grep -vE 'frida|\.rs9|gum' /proc/net/unix > /dev/$F_UNIX.tmp 2>/dev/null
    [ -s /dev/$F_UNIX.tmp ] && mv /dev/$F_UNIX.tmp /dev/$F_UNIX
    grep -vE 'frida|\.rs9|gum|:69A2|:BAA1' /proc/net/tcp > /dev/$F_TCP.tmp 2>/dev/null
    [ -s /dev/$F_TCP.tmp ] && mv /dev/$F_TCP.tmp /dev/$F_TCP
    sed -E 's/virtio_mmio/ufshc/g; s#/dev/block/vd#/dev/block/sd#g' /proc/$PID/mounts | grep -vE 'magisk|/data/adb|virtiofs|[[:space:]]9p[[:space:]]|goldfish|ranchu' > /dev/$F_MNT.tmp 2>/dev/null
    [ -s /dev/$F_MNT.tmp ] && mv /dev/$F_MNT.tmp /dev/$F_MNT
  fi
  grep -vE 'goldfish|vbox' /proc/misc > /dev/$F_MISC.tmp 2>/dev/null
  [ -s /dev/$F_MISC.tmp ] && mv /dev/$F_MISC.tmp /dev/$F_MISC
  chmod 644 $ALL 2>/dev/null
  # v4.1: 1s → 0.2s — 신규 기동 앱의 가드가 첫 maps/smaps 읽기를 하기 전에
  # 스테일(타앱) 내용을 받는 경합 제거. maps-자기프로세스 불일치는 판정 소재(실측).
  sleep 0.2
done
