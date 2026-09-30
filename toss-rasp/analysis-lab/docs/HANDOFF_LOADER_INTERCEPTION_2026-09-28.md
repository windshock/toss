# HANDOFF — Toss libea56 anchor capture via loader-event interception (2026-09-28)

**2026-09-28 update: GOAL ACHIEVED.** This handoff is now historical context. The working path is
`android/scripts/catch_libea56.py` using linker64 `notify_gdb_of_loadP6soinfo` wrapper
`+0x68bb4`, not the global `_r_debug` walk. Final evidence:
`artifacts/android/toss_anchor_capture.json`, raw logs under `artifacts/android/logs/`, and
`FINDINGS.md` §95.

For the next LLM. Goal: capture `libea56+0x13a4bc` guard register state (PC/SP/X0/X1/X2/X19)
**once**, synchronously (no /proc polling), before Toss self-destructs, on the upstream-QEMU
Redroid lab. **No RASP/root/emulator detection bypass** — observation only.

Read first: `FINDINGS.md` §90–§95, `docs/MODERN_ANDROID_QEMU_RE_LAB.md`,
`docs/ANDROID_GUEST_AND_TOSS.md`, `artifacts/android/*.json`. Do NOT re-run already-CONFIRMED
experiments.

---

## 0. CONFIRMED baseline (do not redo)

- upstream QEMU **11.0.1** (brew) + HVF on M1: genuine ARM64 HW breakpoint (exact PC, guest
  bytes unchanged, reg/mem capture) — §91. TCG deterministic record/replay + plugin — §91.
- Full Linux (6.6) boots on HVF — §91. Linux **EL0 userspace** HW bp 3/3 — §92.
- **Redroid Android 15 (SDK35, arm64)** boots in an Ubuntu-24.04-arm64 guest under QEMU virt+HVF;
  `adb localhost:5555`, `boot_completed=1` — §93.
- **Android native EL0 HW bp 3/3 CONFIRMED** (toy `toy_android` @0x101145c): exact PC, in-context
  bytes `2800008b` unmodified, x1 +1/hit — §93. `artifacts/android/android_hvf_hwbreak.json`.
- **Toss on Redroid**: installs (build hash `c454eb40…6203b89` == analyzed build → 0x13a4bc valid),
  launches, **libea56.so loads** (`nativeloader: Load … libea56.so using isolated ns clns-8
  (Anonymous-DexFile): ok`) + `libbugsnag-root-detection.so`; Play Integrity fails (no Phonesky);
  goes to `OverseasOnboardingActivity`; **self-destructs ~4.5 s after libea56 load** (`Process … has
  died: fg TOP`, AMS restart loop). — §93. `artifacts/android/toss_compatibility.json`.

## 1. Resolved goal

Arm a HW breakpoint at libea56+0x13a4bc **before** the guard executes it, capture registers once,
validate the static model:
```
anchor insn @0x13a4bc: add x0,sp,#0x1a8 ; mov w2,#4000 ; blr x9   (bytes 20013fd6)
runtime VA = libea56_load_bias + 0x13a4bc   (R-E PT_LOAD has p_vaddr==p_offset → no fixups)
validate at hit: x0 == sp+0x1a8 ; x2 == 4000 ; *(u16)(x0+4)==1 ; *(u16)(x0+6)==0
```
Result: captured in one wrapper-hook run. `pc==anchor`, bytes `20013fd6`,
`x0==sp+0x1a8`, `x2==4000`, `ctx+4==1`, `ctx+6==0`.

## 2. Environment / how to drive it

- Guest QEMU is a normal `qemu-system-aarch64` process; **gdbstub on host `::1:1234` (IPv6!)**.
  adb device = `localhost:5555`. **ASLR is OFF in guest** (`randomize_va_space=0`, set via
  `adb shell su 0 sh -c 'echo 0 > /proc/sys/kernel/randomize_va_space'`).
- If the guest is not running, relaunch (from `analysis-lab/android/`):
  ```
  qemu-system-aarch64 -M virt -cpu host -accel hvf -smp 4 -m 4096 \
    -drive if=pflash,format=raw,readonly=on,file=/opt/homebrew/share/qemu/edk2-aarch64-code.fd \
    -drive if=pflash,format=raw,file=images/redroid-vars.fd \
    -drive if=virtio,format=qcow2,file=images/redroid-disk.qcow2 \
    -drive if=virtio,format=raw,file=seed.iso \
    -device virtio-net-pci,netdev=n0 \
    -netdev user,id=n0,hostfwd=tcp::2222-:22,hostfwd=tcp::5555-:5555 \
    -nographic -gdb tcp::1234
  ```
  cloud-init (seed.iso) auto-installs docker+binder and `docker run redroid/redroid:15.0.0_64only`.
  After boot: `adb connect localhost:5555`. Re-disable ASLR after any reboot.
- RSP client: `scripts/hvf_hwbreak_toy.py` (`RSP`, `regs`). Reuse it. Tool: `android/scripts/catch_libea56.py`.

## 3. Loader-interception design (implemented in catch_libea56.py)

Android linker64 = `/apex/com.android.runtime/bin/linker64` (pulled to `android/linker64`).
Offsets (readelf, verified):
```
rtld_db_dlactivity          @ 0x4d6a8   (solib notification / r_brk; global _r_debug route)
__dl__r_debug               @ 0x180bd8  (r_version@0, r_map@8, r_brk@16, r_state@24, r_ldbase@32)
notify_gdb_of_loadP6soinfo  @ 0x68bb4   (x0=soinfo*; winning hook)
__dl_notify_gdb_of_load     @ 0x4d634   (x0=soinfo+0xd0 embedded link_map, not soinfo*)
r_state values: 0=RT_CONSISTENT, 1=RT_ADD, 2=RT_DELETE
link_map ABI: l_addr@0 (=load bias), l_name@8 (char*), l_ld@16, l_next@24, l_prev@32
```
**CRITICAL — linker base is per-executable even with ASLR off:**
- app_process64 / zygote-forked apps (Toss): linker64 base = **0xebc8ffebf000**
- adb `sh` shell: linker64 base = 0xfffff7e6c000  ← do NOT use this for apps
Confirmed identical across zygote children (systemui). So for Toss:
```
NOTIFY VA = 0xebc8ffebf000 + 0x4d6a8  = 0xebc8fff0c6a8
RDEBUG VA = 0xebc8ffebf000 + 0x180bd8 = 0xebc90003fbd8
```
(If the guest reboots, re-read the app linker base via root: `adb shell su 0 sh -c 'grep -m1
"r--p 00000000.*linker64" /proc/$(pidof com.android.systemui)/maps'` and recompute.)

Flow: HW-bp NOTIFY → on each stop, if `r_state==RT_CONSISTENT` walk `r_map` link_map list
matching `l_name` for "ea56" → `l_addr` is the bias → remove NOTIFY bp, HW-bp anchor
(`l_addr+0x13a4bc`), continue → capture at guard hit → validate. Timing is favorable:
rtld_db_dlactivity fires at RT_CONSISTENT **before** the .so's constructors/guard run.

Update: the above `_r_debug` flow did not expose libea56. The successful flow is HW-bp
`BASE+0x68bb4`, read `soinfo+0x1a0` as libc++ string realpath and `soinfo+0x100` as load bias,
then arm `bias+0x13a4bc`.

## 4. Final status of the interception attempt

H1/H2 resolved. Relaunch-loop `_r_debug` test saw 848 loader events, Toss/bugsnag-visible
events=396, and libea56=0, so H1 was refuted and H2 became the working answer. The wrapper hook
at +0x68bb4 then caught libea56 at event 7 and captured the anchor state:
`soinfo=0xebc8fedb99c8`, `load_bias=0xebc592836000`, `anchor=0xebc5929704bc`.

## 5. If continuing from here

Do not redo loader attribution. The next useful step is downstream data-flow: capture/step from
`0x13a4bc` into `afed8` and the `0xa8f70` handler, or use the captured register/context state as
the seed for replay-style reconstruction. Keep the same observation-only boundary.

## 6. OPERATIONAL GOTCHAS (these cost hours — obey them)

1. **Connecting the gdbstub STOPS the guest** → adb freezes. **Launch Toss via adb BEFORE
   connecting** the RSP client. (catch_libea56.py already does this.)
2. **A killed/crashed client that holds the stub freezes the guest** (stays stopped). NEVER
   `pkill -9` your capture — use `pkill -TERM` (the script installs a SIGTERM/SIGINT handler that
   detaches). If frozen anyway, recover:
   ```python
   from hvf_hwbreak_toy import RSP
   r=RSP(1234); r.cmd("z1,%x,4"%(0xebc8ffebf000+0x4d6a8)); print(r.cmd("D",4)); r.close()  # -> OK, resumes
   ```
   Then confirm `adb -s localhost:5555 shell echo ok` responds.
3. Detach packet is `$D#44` (checksum of 'D'=0x44). Do NOT hardcode wrong checksums — use
   `r.cmd("D")` which computes it. (A `-`/NACK reply means bad checksum.)
4. **QEMU/HVF does NOT auto step-over a HW bp at the current PC** — plain `c` re-fires. Use manual
   step-over `z1 / s / Z1 / c` (see `stepover()`), proven in §92. For the ANCHOR use **HW (Z1)** —
   no code mutation (a SW brk in libea56 could be detected/alter behavior). For the linker NOTIFY,
   SW (Z0) would auto-step but mutates linker code (acceptable, not libea56) — currently using Z1+manual.
5. RSP class in `hvf_hwbreak_toy.py` has **no `send_raw`**; continue = `r.cmd("c", timeout)`.
   (`gdb_hwbreak_test.py` has a different RSP with `send_raw` — don't mix them.)
6. RSP round-trip latency ≈ **0.1 ms/read** — the link_map walk is cheap; slowness = frozen guest, not reads.
7. Python buffers stdout when piped: run `python3 -u script > file 2>&1 &` and read the file; avoid `| tail`.
8. zsh does NOT word-split unquoted vars (`A="adb -s localhost:5555"; $A shell` fails) — write full inline.
9. Reading a userspace VA over the gdbstub is **context-sensitive**: valid only when the CPU is in
   that process (e.g. at the bp stop). Out-of-context reads return `E14`. (Demonstrated §93.)
10. Reading other apps' `/proc/PID/maps` needs root: `adb shell su 0 sh -c '…'` (Redroid is rooted).

## 7. Success evidence

Achieved. Final structured capture is `artifacts/android/toss_anchor_capture.json`. Raw run logs:
`artifacts/android/logs/catch_libea56_linkmap_h2_20260928.log` and
`artifacts/android/logs/catch_libea56_soinfo_success_20260928.log`. Narrative record:
`FINDINGS.md` §95.

## 8. Key files
- `android/scripts/catch_libea56.py` — loader-interception capture (current; run/iterate this)
- `scripts/hvf_hwbreak_toy.py` — RSP client (`RSP`, `regs`)
- `android/toy_user/{toy_android.c,toy_android}` — Android native HW-bp toy (§93 proof)
- `android/{configs,images,seed.iso}` — Redroid guest (Ubuntu+cloud-init+redroid)
- `android/linker64` — pulled Android linker64 (symbol source)
- `artifacts/android/{android_hvf_hwbreak,toss_compatibility,android_capability_matrix}.json`
- Toss APK (analyzed build): `../apk_backup/{base.apk,split_config.arm64_v8a.apk}`; libea56 on disk:
  `../libea56.so` (sha256 c454eb40…6203b89)
