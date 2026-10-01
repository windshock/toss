#!/bin/bash
# fresh_identity.sh — 토스 테스트 런마다 "깨끗한 기기 신원"을 부여한다 (테스트 정합성).
#
# 목적: FDS 우회가 아니라, 반복 테스트로 축적되는 기기지문 이력(서버측/로컬)의 오염을
#   제거해 각 런을 독립적으로 관측하기 위함. 로컬 EMULATOR 판정 자체는 이걸로 안 풀린다
#   (FINDINGS §63 — 종료 원인은 로컬 누적 텔, 기기ID 아님). 매 테스트 런 "직전"에 실행.
#
# 로테이트하는 기계 값(56차 getname 실측 기준, FINDINGS §63-2):
#   1) MediaDRM/Widevine L3 프로비저닝  /data/vendor/mediadrm/IDM1013  (pm clear로도 안 지워지는 지속 ID)
#   2) ro.serialno / ro.boot.serialno   (resetprop, 삼성 포맷 R+10)
#   3) boot_id                          (/proc/sys/kernel/random/boot_id bind-mount)
#   4) ANDROID_ID(ssaid)                (엔트리 제거 — 완전 반영은 재부팅/프레임워크 재시작 후)
#   5) 앱 상태                          (pm clear)
#
# 사용: fresh_identity.sh            # 로테이트
#       fresh_identity.sh --show     # 현재 신원만 출력
set -u
PKG="${PKG:-viva.republica.toss}"
RESETPROP=/data/local/tmp/magisk
export PATH="$HOME/Library/Android/sdk/platform-tools:$PATH"
dsh(){ adb shell "$@"; }

show_identity(){
  echo "  serialno   = $(dsh getprop ro.serialno | tr -d '\r')"
  echo "  bootserial = $(dsh getprop ro.boot.serialno | tr -d '\r')"
  echo "  boot_id    = $(dsh cat /proc/sys/kernel/random/boot_id | tr -d '\r')"
  echo "  android_id = $(dsh settings get secure android_id | tr -d '\r')  (앱 per-pkg ssaid는 별도)"
  echo "  mediadrm   = $(dsh "ls /data/vendor/mediadrm/IDM1013/L3/ 2>/dev/null | wc -l | tr -d '\r'") files in IDM1013/L3"
}

adb root >/dev/null 2>&1; sleep 1

if [ "${1:-}" = "--show" ]; then
  echo "[*] 현재 기기 신원:"; show_identity; exit 0
fi

echo "[*] BEFORE:"; show_identity

echo "[1] $PKG force-stop"
dsh "am force-stop $PKG"

echo "[2] MediaDRM/Widevine 프로비저닝 초기화 (지속 기기ID)"
# media 프로세스가 재프로비저닝하도록 삭제만. 다음 DRM 사용(앱 기동) 시 새 ID 생성.
dsh "rm -rf /data/vendor/mediadrm/IDM1013 2>/dev/null; rm -rf /data/mediadrm/IDM* 2>/dev/null; true"

echo "[3] ro.serialno / ro.boot.serialno 랜덤화"
SER="R$(LC_ALL=C tr -dc 'A-Z0-9' </dev/urandom | head -c 10)"
dsh "$RESETPROP resetprop ro.serialno $SER"       >/dev/null 2>&1
dsh "$RESETPROP resetprop ro.boot.serialno $SER"  >/dev/null 2>&1

echo "[4] boot_id 랜덤화 (bind-mount 새 UUID)"
dsh "U=\$(cat /proc/sys/kernel/random/uuid); printf '%s\n' \"\$U\" > /data/local/tmp/.bootid; chmod 644 /data/local/tmp/.bootid
     mountpoint -q /proc/sys/kernel/random/boot_id 2>/dev/null && umount /proc/sys/kernel/random/boot_id 2>/dev/null
     mount -o bind /data/local/tmp/.bootid /proc/sys/kernel/random/boot_id 2>/dev/null; true"

echo "[5] ANDROID_ID(ssaid) 엔트리 제거 (완전 반영은 재부팅/stop;start 후)"
dsh "sed -i '/name=\"$PKG\"/d' /data/system/users/0/settings_ssaid.xml 2>/dev/null; true"

echo "[6] 앱 상태 초기화 (pm clear)"
dsh "pm clear $PKG" | tail -1

echo "[*] AFTER:"; show_identity
echo "[*] 완료. serial=$SER. (ANDROID_ID 완전 로테이션은 재부팅 후 반영 — 필요시 boot_recover와 함께)"
