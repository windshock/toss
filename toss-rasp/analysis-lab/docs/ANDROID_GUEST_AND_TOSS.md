# ANDROID_GUEST_AND_TOSS — Android on the upstream-QEMU engine + Toss reach

Status date: 2026-09-28 · Continues `MODERN_ANDROID_QEMU_RE_LAB.md` (engine PoC, §91).
Evidence labels: CONFIRMED / SUPPORTED / OPEN / REFUTED (as in §34).

## TL;DR

The engine and the **critical technical bridge are CONFIRMED**; the actual modern-Android *userspace boot*
is **OPEN** with a clear, evidence-based path (Redroid/Waydroid in an ARM64 Linux guest). Direct standalone
GSI-on-`virt` was assessed and **ruled out by the §27 STOP RULE** (needs a self-built Android board).

The single genuinely-uncertain question from the last plan — *does an outer-QEMU HVF hardware breakpoint
actually land on a specific EL0 userspace process's code inside a full-MMU OS?* — is now **CONFIRMED** on a
real Linux guest. Android app native code (e.g. `libea56.so`) is the same EL0-userspace class, so the
mechanism carries over; only the Android userspace packaging remains.

## 1. What was proven this round (CONFIRMED)

### Userspace HW-breakpoint bridge (§15/§16) — the key de-risk
- Static non-PIE ARM64 Linux binary (`android/toy_user/toy_user.c`) as `/init` in a minimal initramfs,
  booted on the Alpine **kernel 6.6.134** under `-M virt -cpu host -accel hvf`.
- Console showed `Run /init` + `TOYUSER target_function=0x10101f4` (runtime VA == objdump; non-PIE fixed).
- Outer QEMU RSP set `Z1` at the **userspace VA `0x10101f8`** (`add x8,x1,x0`): **3/3 runs** → hits at
  exact PC, code bytes `2800008b` **unchanged**, register `x1` increments by exactly 1 per hit (the loop
  counter). → `artifacts/android/userspace_bridge_linux.json`.
- **Meaning**: whole-system HVF HW breakpoint on a specific EL0 userspace process's instruction, in a full
  OS with MMU/paging — exact stop, no code mutation, real registers, repeatable (via step-over).

## 2. Android userspace boot — OPEN (assessed, path chosen)

### Direct GSI on `virt` — NOT COST-EFFECTIVE (§27 STOP RULE)
- AOSP arm64 GSI **is** downloadable (`aosp_arm64-exp-CP41…zip`, dl.google.com), but a GSI is only
  `system.img`. Booting it standalone on plain `virt` needs a self-built Android board
  (kernel+ramdisk+vendor+DTB+fstab+AVB) — the exact "s.t. build an AOSP device tree from scratch"
  STOP condition. → `artifacts/android/boot_stage.json`. REFUTED as the fast path.
- Independently confirmed by the reference toolkit `github.com/Ccccccccvvm/qemu-android-arm64`: on Apple
  Silicon + upstream QEMU the practical Android is *Waydroid/Redroid inside an ARM64 Linux guest*;
  Cuttlefish-on-macOS-QEMU hangs (no host services); Google emulator images need `ranchu`.

### Recommended path — Redroid/Waydroid in an ARM64 Linux guest (SUPPORTED)
- Chain: `M1 → qemu-system-aarch64 -M virt -accel hvf → ARM64 Linux (binder+docker) → docker run
  redroid/redroid:arm64 → Android → adb connect localhost:5555`.
- Prereq: guest kernel with `CONFIG_ANDROID_BINDER_IPC` + binderfs (Ubuntu/Debian arm64 ship it in
  `linux-modules-extra`) + Docker. Scaffold: `android/scripts/boot_android_redroid.sh`.
- **Not failure** (§29): this reaches the goal (Android userspace + adb on the proven engine). It was not
  run end-to-end here only because it needs a multi-GB guest+image build that exceeds this session; the
  steps are concrete and the engine underneath is CONFIRMED.
- Attribution for the nested case: the Android app is an EL0 Linux process in the guest → resolve its
  `.so` VA via in-guest `/proc/PID/maps` (PIE bias) and disambiguate with TTBR0_EL1/CONTEXTIDR ASID
  (§90). The §92 bridge already proves the outer HW bp lands on such EL0 code.

## 3. Toss reach — OPEN (gated on Android userspace; mechanism proven)
Once Android userspace runs: install APK → `libea56.so` load → Java→JNI provenance → grade A/B/C/D (§24).
Then, **only if the same Toss build is loaded**, runtime VA = `load_base(/proc/PID/maps) + PT_LOAD offset`
of `libea56+0x13a4bc`; HW bp (step-over) → validate `x0==sp+0x1a8`, `x2==4000`, `*(x0+4)==1`,`*(x0+6)==0`.
The HW-bp capture primitive is CONFIRMED on the userspace proxy; only Android delivery is OPEN.

## 4. Capability matrix (§35) — `artifacts/android/android_capability_matrix.json`
CONFIRMED: exact native PC · guest bytes unchanged · register/memory capture (all via the EL0 userspace
bridge, §92). SUPPORTED: Android kernel boot (Linux 6.6 boots on HVF) · Android native HVF Z1 · native
record/replay · libea56 exact HW breakpoint (mechanism proven on proxy). OPEN: Android init/servicemanager/
zygote/adb/boot_completed · arm64-v8a APK · JNI exec · Android TCG boot · Toss install/process/libea56 load/
Java→JNI path/raspEmulatorCallback.

## 5. The four final questions (§36)

1. **Can direct ARM64 Android/GSI be practically booted on upstream QEMU 11?** **No, not standalone** —
   a GSI needs a self-built virt Android board (STOP RULE). The practical route is Redroid/Waydroid in an
   ARM64 Linux guest (SUPPORTED, confirmed by the reference toolkit). *(Not attempted end-to-end here.)*
2. **Does HVF genuine HW breakpoint work on Android native app code?** **CONFIRMED for the equivalent case**
   — EL0 userspace code in a full-MMU Linux guest (exact stop, bytes unchanged, real regs, 3/3). Android
   app native `.so` is the same class; extending it needs PIE bias + ASID filter (method known).
3. **Does Toss's libea56 protection path run sufficiently in this environment?** **OPEN** — not reachable
   until an Android userspace boots; the capture primitive it requires is already CONFIRMED.
4. **Can the Toss primary environment move from Google Emulator to the upstream QEMU lab?** **Yes for the
   debugging/replay engine (CONFIRMED); pending for end-to-end** until Redroid/Waydroid Android is stood
   up. The blocker is Android packaging, not any capability of upstream QEMU/HVF — which now demonstrably
   does exact userspace HW debugging that the Google fork cannot (§90).

## 6. Determination (§24-style, honest)

**Engine + bridge: A-level CONFIRMED. Android userspace + Toss: OPEN, path = Redroid/Waydroid-in-Linux-guest
(direct GSI ruled out).** No platform-limit blocker; the remaining work is standing up an Android userspace
(multi-GB guest build) on an already-proven exact-debug + record/replay foundation. Per §31/§37 this
environment is already more valuable for RE than a high-fidelity-but-un-breakpointable device: the exact
native HW breakpoint that Toss analysis needs is CONFIRMED here and impossible on the Google fork.
