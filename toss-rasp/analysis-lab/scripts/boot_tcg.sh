#!/bin/bash
# ANALYSIS MODE: upstream QEMU + TCG. Optional plugin + gdbstub.
# Usage: boot_tcg.sh <kernel.elf> [plugin_args] [gdbport]
set -u
QEMU=/opt/homebrew/bin/qemu-system-aarch64
ELF="${1:?kernel elf}"
PLUGIN="${2:-}"
PORT="${3:-}"
ARGS=(-M virt -cpu max -accel tcg -kernel "$ELF" -nographic -no-reboot)
[ -n "$PLUGIN" ] && ARGS+=(-plugin "$PLUGIN")
[ -n "$PORT" ] && ARGS+=(-gdb "tcp::$PORT" -S)
exec "$QEMU" "${ARGS[@]}"
