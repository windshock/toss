#!/bin/bash
# neuter_rebuild.sh — RASP(AppSuit) 무력화 앱을 원본에서 리빌드·재서명·설치 (분석용)
#
# 원리: split의 libAppSuit.so에서 pthread_create/detach를 무해 심볼로 재지향 →
#       AppSuit 탐지 워커 스레드가 안 생겨 RASP가 안 돈다. (monimo·하나 검증)
#
# 사용: neuter_rebuild.sh <pkg> [redirect_sym] [workspace]
#   redirect_sym: 대상 libAppSuit dynsym 임포트에 있는 무해 심볼. 기본 getpid.
#                 하나원큐(com.hanabank.oqf)는 getpid 없음 → prctl 지정 필수.
#                 (금지: sleep/getenv/gettimeofday/pthread_mutex_init/fork)
# 예:  neuter_rebuild.sh com.hanabank.oqf prctl
#      neuter_rebuild.sh net.ib.android.smcard getpid
#
# 주의: 재서명=로컬 분석 전용(서버 인증/거래는 서명·FDS로 거부=경계 밖).
set -e
PKG="${1:?usage: neuter_rebuild.sh <pkg> [redirect_sym] [workspace]}"
REDIR="${2:-getpid}"
WS="${3:-$HOME/Downloads/AppSuit}"
SKILL_DIR="$(cd "$(dirname "$0")/.." && pwd)"
KS="$HOME/.android/debug.keystore"
BT="$(ls -d "$HOME/Library/Android/sdk/build-tools/"* | tail -1)"
WORK="/tmp/neuter_${PKG}"
export PATH="$HOME/Library/Android/sdk/platform-tools:$BT:$PATH"

rm -rf "$WORK"; mkdir -p "$WORK/ex/lib/arm64-v8a"; cd "$WORK"
echo "[*] 원본 splits pull: $PKG"
SPLITS=()
for p in $(adb shell pm path "$PKG" | tr -d '\r' | sed 's/package://'); do
  n=$(basename "$p"); adb pull "$p" "$n" >/dev/null 2>&1 && SPLITS+=("$n") && echo "    $n"
done
[ ${#SPLITS[@]} -eq 0 ] && { echo "설치 안 됨: $PKG"; exit 1; }

# libAppSuit.so 든 split 찾기
ARM64=""
for s in "${SPLITS[@]}"; do
  if unzip -l "$s" 2>/dev/null | grep -q 'lib/arm64-v8a/libAppSuit.so'; then ARM64="$s"; break; fi
done
[ -z "$ARM64" ] && { echo "libAppSuit.so 없음(이 앱은 AppSuit 아님?)"; exit 1; }
echo "[*] libAppSuit.so in: $ARM64 → 스레드 neuter (redirect→$REDIR)"
unzip -o -j "$ARM64" lib/arm64-v8a/libAppSuit.so -d ex/lib/arm64-v8a >/dev/null
python3 "$SKILL_DIR/scripts/patch_libappsuit_threads.py" \
        ex/lib/arm64-v8a/libAppSuit.so ex/lib/arm64-v8a/libAppSuit.so "$REDIR"
cp "$ARM64" "$ARM64.mod"
( cd ex && zip -0 -X "../$ARM64.mod" lib/arm64-v8a/libAppSuit.so >/dev/null )

echo "[*] 전 split zipalign + debug키 재서명"
SIGNED=()
for s in "${SPLITS[@]}"; do
  IN="$s"; [ "$s" = "$ARM64" ] && IN="$s.mod"
  zipalign -f -p 4 "$IN" "al_$s" >/dev/null
  apksigner sign --ks "$KS" --ks-pass pass:android --out "signed_$s" "al_$s" >/dev/null 2>&1
  SIGNED+=("signed_$s")
done

echo "[*] 원본 제거 + neutered install-multiple"
adb uninstall "$PKG" >/dev/null 2>&1 || true
adb install-multiple "${SIGNED[@]}" && echo "[완료] neutered $PKG 설치됨. uid: $(adb shell dumpsys package $PKG | grep -m1 userId= | tr -d '\r')"
echo "  실행: adb shell monkey -p $PKG -c android.intent.category.LAUNCHER 1"
echo "  산출물: $WORK/signed_*.apk (debug키)"
