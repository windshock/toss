#!/bin/bash
# LIVE MODE: upstream QEMU + HVF, bare-metal toy, gdbstub halted-at-reset.
# Usage: boot_hvf.sh [toy.elf] [gdbport]
set -u
QEMU=/opt/homebrew/bin/qemu-system-aarch64
ELF="${1:-$(dirname "$0")/../toy/toy.elf}"
PORT="${2:-1234}"
exec "$QEMU" -M virt -cpu host -accel hvf -kernel "$ELF" \
    -nographic -no-reboot -gdb "tcp::$PORT" -S
