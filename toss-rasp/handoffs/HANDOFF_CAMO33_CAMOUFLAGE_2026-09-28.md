# HANDOFF — camo33 AVD emulator-camouflage (Toss/monimo/hana RASP), and how to improve it with the completed upstream-QEMU runtime analysis

Date: 2026-09-28. Audience: next LLM. Purpose: consolidate everything done on the **camo33** Google
Android Emulator AVD (the emulator-detection camouflage effort, FINDINGS §1–§89), and lay out how the
**now-completed** upstream-QEMU/Redroid runtime analysis (§90–§97) lets us finally improve it.

**Scope (unchanged, hard boundary):** local/static RASP reverse engineering + **emulator-detection
neutralization** for local dynamic analysis = in-bounds (OWASP MASTG-TECH-0144). **OUT OF SCOPE:**
server-side FDS bypass, server auth/authz, live anti-fraud (`isBadMph`). Re-signing/neuter = local
analysis only (server rejects it). See `memory/appsuit-monimo-authorization.md`.

---

## 1. What camo33 is

- AVD **`camo33`** (`emulator-5554`), arm64, **Android 13 / API 33**, GKI kernel
  `5.15.119-android13-8-…-ab10871489`. Runs on the Google Android Emulator (its core is a **QEMU-2.12
  fork**) under HVF on Apple Silicon M1. Location: `/Users/1004276/Downloads/AppSuit/avd-camouflage`.
- State: `adb root` + **SELinux Permissive** + `/system/xbin/su`.
- Purpose: make vendor-signed Korean banking/security apps (Toss `viva.republica.toss`, monimo, Hana
  `com.hanabank.oqf`, …) run far enough on the emulator to do **local** RASP dynamic analysis, by
  neutralizing their **local** emulator/root/tamper detection.

---

## 2. Toolkit built on camo33 (reuse — do not rebuild)

- **LKM `avd-camouflage/lkm/hide_kmod.c`** (latest ~v4.22/4.23). Built via `build-in-docker.sh` (ACK
  android13-5.15 tree, Docker) → `hide_kmod.built.ko`, insmod on stock kernel (no-sig taint, no reboot of
  kernel). eBPF hiding is dead on this kernel (`CONFIG_BPF_KPROBE_OVERRIDE`/`BPF_LSM` unset); LKM is the
  path (`CONFIG_MODULES=y`, `MODULE_SIG_FORCE` unset, KPROBES+KRETPROBES=y).
  - **arm64 caveat:** can't rewrite `regs->pc` in a kprobe pre-handler (forced single-step) → use
    **kretprobe return override** (`do_faccessat`/`vfs_statx` → -ENOENT) and **seq_file rewind** for
    `/proc` content hiding.
  - Capabilities added over sessions: `getname_flags` path redirect, `dirent` hide (getdents), `/proc`
    (maps/modules/fs/ioports) content redirects, `show_map_vma` maps-content filter, `emu_lib_block`,
    `do_emulate_mrs` MIDR/ID_AA64 spoof, ioctl log, uid-gated (`target_uids`, e.g. toss=10176), fake
    nodes for midr/cpuinfo/version/enforce, per-tgid `xpark` self-destruct parking, `force_sig_fault`/
    `exit_group` kprobes. Params: `maps_filter, emu_lib_block, ioctl_log, mrs_spoof, segv_recover,
    target_uids, …`. **hw-breakpoint via perf_event is DEAD in the HVF guest (§83b).**
  - **Hard lessons (don't repeat):** never hide `*.ranchu.so`/`goldfish_pipe` (app's own GL breaks →
    RenderThread SIGABRT); `.so` under `/vendor|/system|/apex` must be filter-exempt; egl=emulation +
    vulkan=ranchu must stay (dual-use driver selectors); a `/proc/self/maps` fake without a real `[stack]`
    → ART `InitStackHwm` abort.
- **resetprop** (standalone Magisk `libmagisk.so` @ `/data/local/tmp/magisk`) for `ro.*` prop spoofing
  (userspace `__system_property`, outside LKM reach). `setprop ro.*` is init-refused; `/` is ro ext4.
- **Analysis harness** `avd-camouflage/analysis/toss-rasp/harness/` — `trace_run.sh` / `parse_run.py` /
  `hns.py`. Deterministic observe→compare→hypothesize loop with verdict states + capture-quality. Baked-in
  reliability rules: (1) never use pid-alive/force-stop-survival/CertifyGuest-reached as success (AMS
  auto-restarts toss + zombies survive `pkill -9`); (2) AMS restart clears logstore → capture verdict LIVE
  per-poll; (3) `pgrep -f` (pidof fails, wrap argv0=app_process64). **Reuse it; don't rebuild.**

---

## 3. The camo33 wall (what blocked emulator camouflage) — CONFIRMED

The Toss guard = DexGuard Java `im.toss.core.guard.AbsAppGuard` + native **`libea56.so`** + **`libtg.so`**
(section-headers stripped = anti-RE packed). The app's own logstore exposes the verdict:
`raspEmulatorCallback debugInfo = 0x8_000000BE`, `emulator result = 191 (0xBF)`, `detected='emulator'`,
`attendingDetectorSet = debugger, emulator, root, hook, cert, virtual_environment`, `guardLevel LOW` →
`postRaspResult` → `handleExitPlan EXIT` → `System.exit(0)` at ~5 s (online reaches `CertifyGuestActivity`
then exits on foreground).

**The emulator verdict is a CONSTANT, data-driven, multi-channel result — invariant to every userland/LKM
lever tried (65+ sessions):**
- values/props (ro.kernel.qemu, hardware, board, build tags, fingerprint), SELinux mode (perm↔enforce),
  GL renderer string, `/proc/modules`, `/proc/cmdline`, MIDR via sysfs, **MIDR via `mrs`** (guard doesn't
  read MIDR by mrs; mrs_midr_hits=0), **ID_AA64PFR0/PFR1/ISAR0/ISAR1 via mrs** (turned out to be React
  Native/Hermes per-lib ifunc init, not the guard — §79 red herring), network, **`dl_iterate_phdr` emu-lib
  enumeration** (real channel the guard polls ~2 Hz, filtering 7 emu libs did NOT clear the verdict — §74),
  **`/proc/self/maps` content** (kernel content-filter, §76), `/sys/module`, `/proc/filesystems`,
  `/proc/ioports`, emu-lib file existence, mounts, qemu_pipe existence. **Every single-surface fix failed;
  emu_result stays 0xBF whether LKM redirects are ON or OFF** → LKM/resetprop touch ZERO emulator bits.
- **LD_PRELOAD injection BACKFIRES**: the guard's `raspHookCallback` catches the injected `.so` → detected
  adds `hook`, `guardLevel MAX`, earlier death (§74). And `dl_iterate_phdr` can only be filtered in-process
  → structurally blocked.
- **frida** blocked (attach: TracerPid; spawn: lands but external `Force stopping` + watchdog SIGKILL, zero
  hooks fire). **neuter/re-sign** trips `cert`; prctl-redirect trips `debugger`; Toss spawns detection via
  raw `syscall(clone)` not pthread_create.
- **HVF hw-breakpoint is DEAD** on the Google emulator's QEMU-2.12 fork (§83b/§90) → **we could not
  synchronously capture the detector's decision point on camo33** — the core reason attribution stalled.

**Self-destruct mechanism (CONFIRMED):** targeted saved-LR poison store — libea56 handler **`0x95224`**,
poison block **`0xacca4`** (`str x10(=0xc),[saved_LR]` → `ret 0xc`). Dispatched by **`afed8`** (the OLLVM
control-flow-flattened dispatcher) as one of several param-selected handlers. Provenance (§82): DexGuard
Java (AbsAppGuard RxJava lambda, reflection) → JNI (`o.ReusableBufferedOutputStream.R`) → libea56 `afed8`
(0xb02c4) → handler → RASP callback.

**Per-app outcomes:**
- **Toss**: local emulator verdict unbeaten with the camo33 toolkit (structural GL/QEMU signal, unspoofable
  without breaking the UI the analysis needs).
- **monimo**: local emu-gate (SIGBUS `0x41022` poison) **beaten by LKM v3.6.6** (crash-avoidance,
  in-bounds) — but the real functional block is **server-side FDS `!isBadMph()`** (IPInside native network
  fingerprint sent to server) = out of scope. "Original app fully working on emulator" is not achievable by
  local means.
- **hana** (`com.hanabank.oqf`): local **AppSuit security-stack** (detection threads), NOT server FDS and
  NOT hardware TEE (MAPClient is in-process software). **neuter-repackage worked** (`patch_libappsuit_
  threads.py` neuters pthread_create/detach; hana needs `prctl` redirect target) → hana runs interactively
  on the emulator for local analysis.

Full detail: `FINDINGS.md` §1–§89; `memory/appsuit-toss-rasp.md`, `memory/appsuit-monimo-avd-camouflage.md`.

---

## 4. Why camo33 stalled, and what the completed analysis now provides

**Root of the stall:** on camo33 we could observe the *verdict* (logstore) but never the *decision* — the
verdict is a constant code (0xBF/0x8_000000BE) that no userland/LKM lever moves, and **HVF hw-breakpoints
were dead**, so we couldn't stop at the detector's branch and read what it actually decided on. Static RE
was blocked by OLLVM CFG-flattening + libtg packing + byte-composed string hiding.

**What changed (§90–§97, on a NEW lab, done elsewhere):** we built a free **upstream QEMU 11 + HVF**
lab on the same M1 with **working guest ARM64 hardware breakpoints**, booted **Redroid Android 15 (arm64)**,
installed the **same Toss build** (`libea56.so` sha256 `c454eb40…6203b89`, so all static offsets match
camo33), and did the synchronous runtime attribution camo33 could not:

- **§95** captured `libea56+0x13a4bc` (turned out to be libc `poll()`, not a dispatcher — the old §82
  "0x13a4bc→afed8" was a debuggerd-sample conflation).
- **§96** captured the real dispatch: `afed8` handler-call site `0xb02c4 blr x8` selects handler
  **`0x95224` = the §14 self-destruct/poison handler**; the old `0xa8f70` "emulator handler" is REFUTED
  (not even a function entry).
- **§97 (dispatch-state time-series, deterministic across 2 runs):** `afed8` runs a per-property **check
  loop** — **82× state `w8=0`** (normal) + exactly **1× state `w8=4` → poison** (seq 48 of 84). The
  state-4 dispatch is a **fresh afed8 invocation entering with `w0=4`, decided by afed8's CALLER** (afed8
  itself is the enforcement call, not the decision). **The id-0 check-operand objects carry, at +0x00, the
  property NAMES the guard scans — read out at runtime:** `ro.kernel.qemu`, `qemu.sf.fake_camera`,
  `init.svc.qemu-props`, `ro.boot.redroid_net_dns*`, build fingerprints, `persist.sys.bd.debug.*`, … The
  poison context is a different object with a stable `\x10monitor` tag @+0x78.
  - **Next probe (already specified):** arm `afed8` entry `0xafed8` + `0xb02ac`; at the entry hit with
    `x0==4`, read **x30 (lr)** → the CALLER that decided id-4 = the **detection→verdict decision site**.

This is exactly the attribution camo33 needed: the guard's actual **property-scan list** and the
**id-0 (check) vs id-4 (enforce) mechanism**, obtained by reading the CPU at the branch — impossible on
camo33 (dead hw-bp).

---

## 5. Concrete plan to IMPROVE camo33 camouflage using §90–§97

Order of work (each step is observation/spoofing only, no server side):

1. **Finish the decision-site probe on the upstream-QEMU lab** (cheap, already scoped): read `x30` at
   `afed8` entry with `x0==4` → the libea56 offset of the caller that decides id-4. Then RE that single
   caller (small, targeted — not full OLLVM) to learn the **predicate**: is the verdict (a) an OR over a
   spoofable property list, or (b) gated on a **structural** signal (emu GL transport libs existence /
   QEMU CPU behavior / in-process `glGetString`) that camo33 §56–§77 already showed is GL-required and
   unspoofable? **This single fact decides whether camo33 camouflage is achievable at all.**
2. **Extract the full property/surface scan list** from the id-0 check-operand objects (dump each id-0
   ctx `+0x00` string across the 82 iterations). This is the definitive list of names the guard checks —
   which 65+ camo33 sessions were guessing at piecemeal.
3. **On camo33, spoof the ENTIRE list at once** (the stall was piecemeal single-surface fixes):
   - props via **resetprop** (all `ro.kernel.qemu`, `ro.boot.qemu.*`, `qemu.*`, `init.svc.qemu-props`,
     `persist.sys.bd.debug.*`, build fingerprint, `ro.hardware`/`board`/`characteristics`/`tags`, …);
   - files/nodes/dirents via **LKM** (the emu names the loop stats), keeping the `.so`/GL-driver exemptions.
   Then re-run the **harness** (`trace_run.sh --reboot`) and read `raspEmulatorCallback` from the
   fresh-run logstore (NOT pid-alive). If the decision (step 1) is property-OR, this should finally drop
   the emulator bit; if it's structural, it won't — and that's the honest ceiling (→ swiftshader software-
   GL to decouple the structural signal, or real device + Zygisk/Shamiko, or Corellium; §75 procurement
   wall for swiftshader still applies).
4. **Optionally reproduce the whole thing on the upstream-QEMU lab first** (it self-destructs there too,
   for redroid reasons) to validate a camouflage set with synchronous confirmation before porting to camo33.

Key reframing this analysis provides: the "constant multi-channel, no single surface trips it" appearance
on camo33 is consistent with **a property-scan loop whose verdict is decided upstream** — so the right
experiment is "spoof the complete measured list + identify the decision predicate," not "toggle one
surface and re-measure."

---

## 6. Do / Don't

**Do:** reuse the LKM, resetprop, and the harness; use the upstream-QEMU lab (working hw-bp) for
attribution and port results to camo33; keep camo33 as the reference oracle; measure only via fresh-run
logstore `raspEmulatorCallback`.

**Don't:** re-run the exhausted single-surface eliminations (§3 list) expecting a different result;
LD_PRELOAD-inject into Toss (hook-detected → MAX); re-sign/neuter Toss for "original" behavior; hide
ranchu `.so`/goldfish_pipe; treat pid-alive/CertifyGuest-reached as success; expand into server-side FDS.

---

## 7. File / evidence index
- `FINDINGS.md` §1–§89 (camo33 camouflage narrative), §90–§97 (upstream-QEMU/Redroid analysis)
- `avd-camouflage/lkm/hide_kmod.c` (+ `build-in-docker.sh`, `hide_kmod.built.ko`, `versions/`)
- `avd-camouflage/analysis/toss-rasp/harness/` (`trace_run.sh`, `parse_run.py`, `hns.py`)
- `avd-camouflage/analysis/toss-rasp/analysis-lab/` (the upstream-QEMU lab + docs + artifacts)
- `analysis-lab/docs/HANDOFF_AFED8_DATAFLOW_2026-09-28.md` (the runtime data-flow handoff / §97)
- memory: `appsuit-toss-rasp.md`, `appsuit-monimo-avd-camouflage.md`, `appsuit-monimo-authorization.md`,
  `appsuit-monimo-deobfuscation.md`
- Toss build (analyzed, offsets valid): `apk_backup/{base.apk,split_config.arm64_v8a.apk}`, `libea56.so`
  (sha256 `c454eb40…6203b89`)
