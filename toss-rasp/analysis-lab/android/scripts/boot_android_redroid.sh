#!/bin/bash
# RECOMMENDED Android path on upstream QEMU + HVF (M1): Redroid inside an ARM64
# Linux guest. SCAFFOLD — not yet run end-to-end this session (see docs).
#
# Chain:  M1 -> qemu-system-aarch64 -M virt -accel hvf -> ARM64 Linux (binder+docker)
#            -> docker run redroid/redroid:arm64 -> Android -> adb connect
#
# Prereqs to prepare (setup step, one-time):
#   1. ARM64 Linux guest disk with a kernel that has CONFIG_ANDROID_BINDER_IPC +
#      binderfs (Ubuntu/Debian arm64: `apt install linux-modules-extra-$(uname -r)`;
#      then `modprobe binder_linux`), plus Docker.
#   2. edk2 UEFI firmware: /opt/homebrew/share/qemu/edk2-aarch64-code.fd
#
# This script boots that prepared Linux guest with adb port-forwarded, then the
# in-guest steps (commented) start Redroid.
set -u
QEMU=/opt/homebrew/bin/qemu-system-aarch64
DISK="${1:?path to prepared ARM64 Linux guest qcow2}"
FW=/opt/homebrew/share/qemu/edk2-aarch64-code.fd
VARS="${DISK%.qcow2}-vars.fd"
[ -f "$VARS" ] || cp /opt/homebrew/share/qemu/edk2-arm-vars.fd "$VARS" 2>/dev/null

exec "$QEMU" -M virt -cpu host -accel hvf -smp 4 -m 4096 \
  -drive if=pflash,format=raw,readonly=on,file="$FW" \
  -drive if=pflash,format=raw,file="$VARS" \
  -drive if=virtio,format=qcow2,file="$DISK" \
  -device virtio-net-pci,netdev=n0 \
  -netdev user,id=n0,hostfwd=tcp::5555-:5555,hostfwd=tcp::2222-:22 \
  -nographic
# In-guest (once booted), then from macOS `adb connect localhost:5555`:
#   sudo modprobe binder_linux devices="binder,hwbinder,vndbinder"
#   docker run -itd --rm --privileged --name redroid \
#     -v ~/redroid-data:/data -p 5555:5555 \
#     redroid/redroid:13.0.0_64only-latest androidboot.redroid_gpu_mode=guest
