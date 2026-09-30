#!/bin/bash
# Record a deterministic TCG session to an rrfile. Usage:
#   record.sh <kernel.elf> <rrfile> [plugin_args]
set -u
QEMU=/opt/homebrew/bin/qemu-system-aarch64
ELF="${1:?kernel elf}"; RR="${2:?rrfile}"; PLUGIN="${3:-}"
ARGS=(-M virt -cpu max -accel tcg -kernel "$ELF" -nographic -no-reboot
      -icount "shift=0,rr=record,rrfile=$RR")
[ -n "$PLUGIN" ] && ARGS+=(-plugin "$PLUGIN")
exec "$QEMU" "${ARGS[@]}"
