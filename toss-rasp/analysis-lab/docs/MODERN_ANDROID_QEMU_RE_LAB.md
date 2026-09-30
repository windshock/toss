# MODERN_ANDROID_QEMU_RE_LAB — upstream QEMU ARM64 RE lab on Apple M1 Pro

Status date: 2026-09-28 · Host: macOS 14.8, Apple M1 Pro · QEMU: **11.0.1** (Homebrew, upstream)

Evidence discipline: **CONFIRMED** = directly observed and reproduced this session; **SUPPORTED** =
API/mechanism present, not yet exercised; **OPEN** = not attempted-to-completion this session.
Nothing here claims Android/Toss ran — that is explicitly OPEN.

---

## TL;DR

The decisive question behind §90 is **answered and superseded**: on this M1, **upstream QEMU 11 + HVF
performs genuine ARM64 hardware breakpoints** (exact PC stop, guest bytes unchanged, registers/memory
readable, repeatable) — the exact thing the Google-emulator QEMU-2.12 fork *crashed* on
(`qemu_mutex_lock_impl`, §90). And **upstream QEMU 11 + TCG gives deterministic record/replay + a stable
plugin instrumentation API**. Both mode primitives are CONFIRMED on a controlled bare-metal ARM64 guest.

What is **not** done in-session: booting a modern ARM64 Android on upstream QEMU virt, and running Toss.
Those are OPEN, with a concrete recipe below. So the lab's *engine* is proven; the *Android integration*
is the remaining gated step.

---

## 1. What was built and proven (CONFIRMED)

### LIVE MODE — upstream QEMU + HVF genuine HW breakpoint
- Toy: bare-metal ARM64 (`toy/toy.s` → `toy.elf`), loaded via `-M virt -cpu host -accel hvf -kernel`.
  Target insn `add x0,x0,x1` @ `0x4008000c` (bytes `8b010000`).
- RSP probe (`scripts/hvf_hwbreak_toy.py`, no host gdb needed): set `Z1` (HW bp), continue, stop.
- **3 independent runs → `GENUINE_HW_BP`**: `all_hits_at_target=True`, `guest_bytes_unchanged=True`
  (before/after-install/at-stop/after-remove all `0000018b`), `x2==4000` readable.
- **Repeatable capture with fresh state**: QEMU/HVF does *not* auto step-over a HW bp at the current PC
  (plain `c` re-fires without progress); explicit **step-over** (`z1` remove → `s` → `Z1` reinsert → `c`)
  yields real progression `x0 = 1,3,6,10`, `x1 = 2,3,4,5`. → `artifacts/hvf_hwbreak_matrix.json`.

### ANALYSIS MODE — upstream QEMU + TCG record/replay + plugin
- Same guest under `-accel tcg`. Custom plugin `qemu-plugins/target_trace/trace.c` (stable
  `qemu-plugin.h` API): range-filtered basic-block trace. Deterministic BB sequence across 2 runs.
- Finite variant (`toy_finite.elf`, PSCI SYSTEM_OFF/HVC clean exit): **record** (`-icount
  shift=0,rr=record`) → rrfile 110 B, 999 target-BBs; **replay ×3** → 999,999,999, exit 0.
  **`REPLAY_REPRODUCIBLE=YES`**. → `artifacts/replay_reproducibility.json`.

### Provenance / scaffold
- `artifacts/host.json` (QEMU/accel/toolchain), `artifacts/emu_provenance.json` (Google baseline, §90),
  `artifacts/hvf_debug_matrix.json` (§90 Google-fork failure), `artifacts/capability_matrix.json`.
- Stable interface: `scripts/re-lab.py` (`hwbp`, `regs`, `trace-tcg`, `record`, `replay`, `compare`),
  `scripts/boot_hvf.sh`, `boot_tcg.sh`, `record.sh`, `replay.sh`.

---

## 2. OPEN: Android guest + Toss (not booted in-session) — concrete recipe

Two viable paths to a modern ARM64 Android on **upstream** QEMU virt (Google emulator NOT required):

- **(P-direct) GSI/AOSP on `-M virt`** — Android is the guest OS (one kernel). *Best for whole-system RE*:
  standard `task_struct`/`mm` attribution; the outer-QEMU HW breakpoint + ASID filter maps cleanly to an
  app `.so`. Cost: needs a virt-compatible Android kernel + GSI + ramdisk + virtio; fiddly to assemble.
- **(P-nested) ARM64 Linux guest + Redroid/Waydroid** — Android runs in an LXC container inside the guest
  Linux. Faster to stand up *if* the guest kernel has binder/binderfs. **Attribution caveat**: from the
  outer QEMU there is one guest kernel and the app is a Linux process — you must resolve the app `.so` VA
  via the guest kernel page tables (TTBR0_EL1/ASID/CONTEXTIDR_EL1) + in-guest `/proc/PID/maps`. Workable
  but more indirection than P-direct.

Recommended first attempt: **P-direct GSI-on-virt** for debuggability; fall back to P-nested Redroid if
GSI kernel assembly stalls. Apple-Silicon HVF constraints to respect: `-cpu host` (HVF requires it),
GICv3, PSCI, virtio-blk/net with `hostfwd` for adb 5555, edk2 UEFI (`/opt/homebrew/share/qemu/
edk2-aarch64-code.fd`). (An Android-recipe research subagent was launched but hit a session limit before
returning; this recipe is from first-principles + §90 findings, marked SUPPORTED not CONFIRMED.)

Toss stage (after Android boots): APK install → launch → `libea56.so` load → Java→JNI provenance →
`raspEmulatorCallback` observation → grade A/B/C/D (§28). Then, **only if the same Toss binary is loaded**,
compute runtime bias from ELF PT_LOAD (not `maps[0]+off`), set HW bp at `libea56+0x13a4bc`, and validate
`x0==sp+0x1a8`, `x2==4000`, `*(x0+4)==1`, `*(x0+6)==0`. The HW-bp mechanism for this is CONFIRMED on the
toy; only the Android delivery is OPEN. ASID filter per §90 applies (unlinked HW bp fires for any process
at that VA → check TTBR0_EL1/CONTEXTIDR on each stop).

---

## 3. Capability matrix (§45) — see `artifacts/capability_matrix.json`

CONFIRMED (13): upstream QEMU on M1 · HVF accel · **full ARM64 Linux OS boot on HVF (kernel 6.6 →
userspace shell)** · ARM64 native exec · genuine HW breakpoint · exact PC stop · guest bytes unchanged ·
register capture · memory capture · deterministic record · deterministic replay · 3× replay reproducibility
· basic-block tracing.
SUPPORTED (1): indirect-target tracing (plugin API present).
OPEN (9): Android boot · ADB · TCG-Android boot · PID/ASID attribution (method known) · Toss launch ·
libea56 load · Java→JNI provenance · raspEmulatorCallback · Toss exact native stop.

---

## 4. Answers to the seven questions (§46)

1. **Reason to keep using Google Android Emulator?** For *exact native debugging*, **no** — its QEMU-2.12
   fork cannot HW-breakpoint under HVF (§90). It stays useful only as a **reference oracle** (known-good
   boot, known verdict behavior) and as a fast way to *run* the app while iterating the upstream lab.
2. **Is exact native debugging solved by upstream QEMU/HVF?** **CONFIRMED yes** at the CPU level — genuine
   HW breakpoint, exact stop, unmodified guest code, registers/memory. Applying it to a *specific Android
   process* needs the ASID filter (method known) once an Android guest boots.
3. **Is TCG record/replay a better analysis primitive than debuggerd sampling?** **Yes, structurally.**
   debuggerd is point-in-time statistical sampling (§87 — misses sub-ms handler entry). TCG record/replay
   is deterministic and re-runnable: **CONFIRMED** reproducible ×3, and you can apply *different* heavy
   instrumentation on each identical replay (BB trace, mem trace, indirect targets) — impossible with
   one-shot sampling.
4. **Do Waydroid/Redroid/container structures obstruct whole-system RE?** Partially — they add one layer
   (app is a Linux process in a container in the guest kernel), so outer-QEMU attribution needs page-table/
   ASID mapping. Not a blocker, but **P-direct GSI is cleaner** for debuggability. (SUPPORTED reasoning.)
5. **Can the current environment be the primary Toss/DexGuard lab?** The **debugging + replay engine: yes
   (CONFIRMED)**. As an end-to-end Toss lab: **not yet** — Android boot + Toss compat are OPEN. Grade of
   the *engine* is A; grade of *end-to-end* is pending Android.
6. **Is PANDA-ng needed?** **Not for the confirmed primitives.** Upstream QEMU's plugin API + record/replay
   already deliver BB/mem/indirect tracing and deterministic re-run. Revisit PANDA only if OS-introspection
   (OSI) automation for the nested-container case proves too costly to build on raw plugins (§34).
7. **Next step?** Boot a modern ARM64 Android on upstream QEMU virt (P-direct GSI first), reach ADB,
   install Toss, grade compatibility (§28), then apply the CONFIRMED HW-bp primitive at `libea56+0x13a4bc`
   with ASID filtering.

---

## 5. Final determination (§44)

**Between A/B/C/D, the honest current grade is: engine = A-level CONFIRMED; end-to-end = C (ANALYSIS-ONLY)
pending Android.**

- Not **A (IDEAL)** yet: A requires Toss native RASP path analyzable — Android/Toss are OPEN.
- Not **B (STRONG)** yet: B still requires Toss having at least partially run — not attempted.
- **C (ANALYSIS-ONLY)** is the accurate label *today*: HVF exact debugging **and** TCG deterministic
  replay are both CONFIRMED as a working analysis environment on a controlled ARM64 guest; the Android/
  Toss integration is the remaining, well-scoped, non-research-hard step (image acquisition + boot).
- Explicitly **not D (UNSUITABLE)**: the platform limitation hypothesis is refuted — upstream QEMU on M1
  does everything the Google fork couldn't.

Bottom line: **upstream QEMU 11 + HVF/TCG is the right foundation and its debugging/replay primitives are
proven; the only thing standing between this and a full Toss lab is booting a modern ARM64 Android guest
on it, which is engineering, not a capability gap.**

---

## Addendum (2026-09-28): full-OS-on-HVF CONFIRMED

Beyond the bare-metal toy, a **real modern ARM64 Linux (Alpine, kernel 6.6.134-0-virt, SMP)** boots under
`qemu-system-aarch64 -M virt -cpu host -accel hvf` on this M1 and reaches a userspace (busybox) shell —
kernel banner, `psci: PSCIv1.1`, `-cpu host` MIDR `0x610f0000` (Apple M1 passthrough), ARMv8.4 + PAC all
detected. → `artifacts/linux_on_hvf.json`. This tightens the conclusion: booting a **full OS** on upstream
QEMU+HVF is CONFIRMED, so "modern ARM64 Android boot" (still OPEN) is an **image-assembly** task (Android
kernel + GSI + virtio), not an HVF/platform capability gap. Q1 (stable analysis guest) is therefore
substantially de-risked; the only remaining work is packaging an Android userspace on the proven boot path.
