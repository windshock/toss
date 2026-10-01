#!/bin/sh
# Boot the RE lab with a QEMU monitor socket (for savevm/-loadvm fast restore).
# Usage: boot_lab.sh [loadvm-tag]
cd /Users/1004276/Downloads/toss/toss-rasp/analysis-lab/android
LOAD=""
[ -n "$1" ] && LOAD="-loadvm $1"
exec qemu-system-aarch64 -M virt -cpu host -accel hvf -smp 4 -m 4096 \
  -drive if=pflash,format=raw,readonly=on,file=/opt/homebrew/share/qemu/edk2-aarch64-code.fd \
  -drive if=pflash,format=raw,readonly=on,file=images/redroid-vars.fd \
  -drive if=virtio,format=qcow2,file=images/redroid-disk.qcow2 \
  -drive if=virtio,format=raw,readonly=on,file=seed.iso \
  -device virtio-net-pci,netdev=n0 \
  -netdev user,id=n0,hostfwd=tcp::2222-:22,hostfwd=tcp::5555-:5555 \
  -monitor unix:/tmp/qemu-mon.sock,server,nowait \
  -nographic -gdb tcp::1234 $LOAD
