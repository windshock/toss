# analysis-lab — upstream QEMU ARM64 RE lab (Apple M1 Pro)

Free reverse-engineering lab built on **upstream QEMU 11** (Homebrew), NOT the Google Android Emulator.
Two modes, both with CONFIRMED primitives (see `docs/MODERN_ANDROID_QEMU_RE_LAB.md`):

- **LIVE (HVF)** — genuine ARM64 hardware breakpoints: exact PC stop, guest bytes unchanged, reg/mem
  capture, repeatable. This is what the Google-fork QEMU-2.12 could NOT do (§90).
- **ANALYSIS (TCG)** — deterministic record/replay + stable plugin instrumentation (basic-block trace).

## Quick start
```bash
# build the bare-metal toys + plugin
zig cc -target aarch64-freestanding-none -nostdlib -Wl,-T,toy/link.ld toy/toy.s -o toy/toy.elf
clang -shared -fPIC -I/opt/homebrew/include $(pkg-config --cflags glib-2.0) \
  qemu-plugins/target_trace/trace.c -o qemu-plugins/target_trace/libtrace.so -Wl,-undefined,dynamic_lookup

# LIVE: HVF HW breakpoint on the toy
scripts/boot_hvf.sh toy/toy.elf 1234 &        # halted-at-reset, gdbstub :1234
scripts/re-lab.py hwbp 1234 0x4008000c 5      # set Z1, step-over capture regs

# ANALYSIS: TCG BB-trace + record/replay
scripts/re-lab.py trace-tcg toy/toy.elf 0x40080000 0x40080020
scripts/record.sh toy/toy_finite.elf /tmp/rr.bin
scripts/replay.sh toy/toy_finite.elf /tmp/rr.bin
```

## Key operational note (LIVE mode)
QEMU/HVF does **not** auto step-over a HW breakpoint at the current PC — plain `continue` re-fires without
progress. Use explicit step-over: `z1` remove → `s` single-step → `Z1` reinsert → `c`. `re-lab.py hwbp`
does this. The gdbstub binds IPv6 `*:PORT`; connect via `::1`.

## Layout
- `toy/` bare-metal ARM64 targets (`toy.s` infinite loop; `toy_finite.s` PSCI-exit for record/replay)
- `scripts/` boot_hvf.sh, boot_tcg.sh, record.sh, replay.sh, hvf_hwbreak_toy.py, re-lab.py
- `qemu-plugins/target_trace/` range-filtered BB-trace TCG plugin
- `artifacts/` host.json, hvf_hwbreak_matrix.json, replay_reproducibility.json, capability_matrix.json,
  emu_provenance.json, hvf_debug_matrix.json (§90 baseline), runs/
- `config/targets/toss.json` — Toss target descriptor (Android+Toss stage is OPEN)
- `docs/MODERN_ANDROID_QEMU_RE_LAB.md` — full report, matrix, 7-question answers, determination

## Status
Engine (LIVE+ANALYSIS primitives): **CONFIRMED**. Android guest boot, Android native EL0 HW breakpoints,
Toss libea56 load, and `libea56+0x13a4bc` anchor register capture: **CONFIRMED** (`FINDINGS.md` §91-§95).
Scope: local RASP RE / observability only — no server-side / fraud / verdict-patching.
