#!/bin/bash
# =============================================================================
# build-in-docker.sh — ACK 소스 준비 + hide_kmod 모듈 빌드 (arm64 Ubuntu 컨테이너)
#
# 사전조건: ACK 클론 완료 (../ack-kernel), Docker Desktop 실행 중
# 산출물:  lkm/hide_kmod.ko → 게스트에 push해 insmod
# =============================================================================
set -e
ACK=/Users/1004276/Downloads/AppSuit/ack-kernel
MOD=/Users/1004276/Downloads/AppSuit/avd-camouflage/lkm
UTS='5.15.119-android13-8-00034-gd34029c8258b-ab10871489'

echo "[*] arm64 Ubuntu 컨테이너에서 빌드 환경 구성 + 모듈 빌드"
docker run --rm -v "$ACK":/src -v "$MOD":/mod ubuntu:22.04 bash -c '
set -e
export DEBIAN_FRONTEND=noninteractive
apt-get update -qq
apt-get install -y -qq build-essential clang lld llvm flex bison libelf-dev bc rsync dwarves cpio libssl-dev

echo "[*] gki_defconfig 적용"
cd /src
make ARCH=arm64 LLVM=1 gki_defconfig O=out 2>&1 | tail -2

echo "[*] prepare + modules_prepare"
make ARCH=arm64 LLVM=1 O=out -j$(nproc) prepare modules_prepare 2>&1 | tail -40

echo "[*] vermagic을 러닝 커널과 일치시킴"
printf "#define UTS_RELEASE \042'"$UTS"'\042\n" > out/include/generated/utsrelease.h

echo "[*] 모듈 빌드"
make ARCH=arm64 LLVM=1 O=out M=/mod modules > /tmp/make_out.log 2>&1 || { tail -30 /tmp/make_out.log; exit 1; }

cp /mod/hide_kmod.ko /mod/hide_kmod.built.ko
echo "[*] 완료: /mod/hide_kmod.built.ko"
'

echo "[*] 산출물: $MOD/hide_kmod.built.ko"
ls -la "$MOD/hide_kmod.built.ko" 2>/dev/null | awk '{print $5, $9}'
