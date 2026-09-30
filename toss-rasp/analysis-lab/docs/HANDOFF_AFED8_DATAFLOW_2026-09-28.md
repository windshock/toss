# HANDOFF — Toss libea56 runtime data-flow on upstream-QEMU Redroid lab (as of §99, 2026-09-28)

For the next LLM. This supersedes `HANDOFF_LOADER_INTERCEPTION_2026-09-28.md` (that one ended at
the anchor capture, §95). Read `FINDINGS.md` §90–§99 first. **Do NOT re-run CONFIRMED experiments.**
Scope is observation only: **no RASP/root/emulator-detection bypass, no patching, no server side.**

## §99 UPDATE (2026-09-28, evening) — v9 provenance state + reboot-durable lab

- **Executor-path variance (KEY)**: on a freshly-booted clean Android the guard kills via Java
  `System.exit(0)` and **never loads libea56**; the afed8(4)/R(4,0) native chain (§97–98) runs only
  under the long-churned environment those sessions had. Before any afed8-anchored probe, VERIFY
  the executor path: `adb logcat -d | grep "System.exit"` + check libea56 in the live app's maps.
- **Z2 write-watchpoints WORK** on this QEMU/HVF (proven, 9.7k triggers, no crash) — use them for
  writer capture. Z2 does not work with SW bp semantics; arm on exact 8-byte slots.
- **bridge-2 (thunk 0x…586b30 → marshaller-2 0x…4586c4) fully decoded**; its outgoing x0 = args
  slot[0] rewritten by marshaller-2; epilogue store `str x20,[x19]` NEVER holds 4 (64k samples).
  The KILLING dispatch is bridge-1 (`0x…586c70` + marshaller-1 `0x…594940`): outgoing x0=4 is
  written by marshaller-1 into **scratch[0] = (bridge-1 entry sp) − 0x14e0**.
- **Ready-to-run probe (probe F3)**: loader hook → at the libea56-load stop, scan libea56 RW
  (+stack/heap) for the interpreter-module signature (`[cand+0x186c70] == ff8303d11083bcb0`) →
  bp bridge-1, filter `[x0+8]==0xe7b` (R) → Z2 on scratch[0] → record write PCs until slot==4.
  Discovery failed on the clean boot only because the module/libea56 never loaded there.
- The interpreter module is a true anon exec mapping (~1.6MB, unpacked by libea56) — NOT
  libviva-arm64-v8a-527600.so (that is Toss's own RN lib).
- **Address bases move EVERY REBOOT** — after any guest reboot re-read the app linker base
  (`grep -m1 "r--p 00000000.*linker64" /proc/$(pidof com.android.systemui)/maps`) and expect the
  interpreter/invocation-object addresses to shift too. Method idx (0xe7b) is address-independent.

### Lab operations (post-hardening)
- Kernel pinned to 6.8.0-139 via /etc/default/grub (142's binder breaks redroid init — RC3).
  Binder autoloads (/etc/modules-load.d + modprobe.d), redroid container auto-restarts
  (--restart unless-stopped), unattended-upgrades disabled, kernels apt-mark held.
- `scripts/boot_lab.sh [snap]` boots QEMU with a monitor socket at `/tmp/qemu-mon.sock`.
  qcow2 internal snapshots exist (`good-139-patched` disk-only; `booted-clean` 2.57GiB) — but
  **loadvm CRASHES (QEMU11/HVF ARM cpu_pre_load assertion): do not use; just reboot (~3 min)**.
- ASLR persistence via sysctl.d does NOT apply at boot — run
  `adb shell su 0 sh -c 'echo 0 > /proc/sys/kernel/randomize_va_space'` after every boot.
- Churn reset = `docker restart redroid` (via ssh -p 2222, pass `redroid`), NOT a VM reboot.

## §98 UPDATE (2026-09-28, later still) — afed8(4) upstream SOLVED to the hidden DEX

The id=4 call comes from a **DexGuard hidden-DEX interpreter in an anonymous executable mapping**
(stable base 0xebc639400000-region across runs; no ELF header). Full chain CONFIRMED:

- **Callers of afed8** (all entries traced): id0×46 from libea56-internal wrapper `0xf8a98`
  (blr x9, x1=0x5c000000 tag); id4×1 from `0xebc639586d00` (`blr x16`) — an ffi/JNI-style bridge:
  `marshaller(0xebc639594940)(bridge_obj, saved_args, scratch) -> target in x0 -> x16 -> restore
  outgoing args (x0=4, x1=invobj, x2=monitor) from scratch -> blr x16`.
- **The marshaller is a DEX interpreter**: invocation object x19=[args] (stable per-method
  singletons at 0xebc5400b3a90 = method-descriptor rows of `Lo/ReusableBufferedOutputStream;`),
  method idx = [x19+8], resolved via STANDARD dex tables (method_ids idx*8 → proto_ids×12 →
  strings) then an opcode fetch loop.
- **The hidden DEX was dumped in full** (2MB, `artifacts/android/toss_hidden_dex.bin`; only
  magic/checksum/signature scrubbed; ids intact; ALL STRINGS PLAINTEXT — contains
  DexguardWrapper/DexguardRasp/DetectType/TossApplicationGuard/AbsAppGuard lambdas etc.).
  Parse with `android/scripts/dex_tools.py`, disassemble code with `dexdis.py`.
- **idx 3707 = `Lo/ReusableBufferedOutputStream;.R`** — STATIC NATIVE, exactly the "R (Native
  method)" frame of the §82 debuggerd stack. Its ONLY in-image callsite:
  `Lo/ContentDataSourceContentDataSourceException;.IAuthTabCallback` insn#22:
  `const/4 v2,#0; if-eqz v1,+7` → normal path `run(v9)` (string decrypt) vs **poison path
  `R(v9=4, 0)`**. IAuthTabCallback is invoked from `onWarmupCompleted` (a 148-callsite string
  helper; no literal-4 callsite — the 4 arrives via interpreter register/frame state).
- **Remaining OPEN (single)**: where v9=4 originates in the killing invocation — it goes through
  the SECOND bridge/marshaller path (thunk `0xebc639586b30` → `0xebc6394586c4`, confirmed via
  saved-args x3=thunk), not the traced one. Next probe: idx-capture bp inside that second
  marshaller + arg-register capture at the killing invoke.
- Env notes: saved-args area pointers carry a LOW-BIT TAG (mask `& ~1`); DEX base = follow
  invobj[0]→+0x10→[+0x10]=parsed struct→**[parsed+0x18]** = dex base; late-window method tracing
  works by arming the marsh bp only after N afed8 id0 entries (see trace_vm_late2.py).

## §97 UPDATE (2026-09-28, later same day) — dispatch-state time-series SOLVED

`0xb02ac`+`0xb02c4` armed simultaneously (2 concurrent Z1 HW bps work), per-hit incarnation
validation (ELF magic @ base + code word @ PC). Two runs, fully deterministic reproduction:

- **State sequence**: 82× `w8=0 → x10=base+0xb02cc` (normal loop) + exactly 1× `w8=4 →
  base+0xb0354` (= the poison selection, seq 48 of 84 in both runs).
- **0→4 is NOT an intra-loop transition**: the state-4 dispatch is a FRESH afed8 invocation
  entering with `w0=w8=4`, `x2=x19=ctx` (verified at the b0294 block: `mov w8,w0`). The verdict
  is decided by afed8's CALLER; afed8(id=4) is the enforcement call.
- **state-4 route (static, table cross-checked vs runtime)**: u16 tbl `0x2c9c6`: tbl[0]=0x4c→pad
  `0xb02cc`, tbl[4]=0x6e→pad `0xb0354`; `0xb0354 b 0xaff08` → opaque arithmetic (magic
  0x4b28f45f/0x4b28f47a on `*(0x183660)`) → `madd x8,idx,0x960,0x17c1e0` 2-D table →
  `ldr x8,[x8]` (= base+0x95224, the §88 "statically undecodable" table resolved at runtime) →
  `br *(0x182ea0)` routing → `b02b8` (mov x0,x19; mov w1,w4; mov w2,w5) → `b02c4 blr x8` →
  0x95224 entry (x0=ctx, w1=w2=0; post-step PC confirmed at base+0x95224).
- **Identity**: #47(state4)→#48(b02c4) share x19, sp, vCPU, timestamp; ALL 84 hits on ONE stack
  arena = single guard worker thread (RSP `thread:n` = vCPU migration only — corrects §96's
  "thread:02/04" reading). Wiring x0==x19, w1==w4, w2==w5 all true.
- **Context**: #47→#48 diff = 0 qwords (selection doesn't mutate ctx). Poison ctx = different
  object type & heap arena (0xebc7bb…): sparse ptr header + **`\x10monitor` tag @+0x78 (stable
  across runs)** + per-run high-entropy tail. Normal (id-0) ctx = check-operand objects with the
  probed property name at +0x00 — the guard's property-scan list read out at runtime
  (ro.kernel.qemu, qemu.sf.fake_camera, init.svc.qemu-props, ro.boot.redroid_net_dns*, build
  fingerprints, persist.sys.bd.debug.*, …).
- Tool: `android/scripts/trace_b02ac_states.py`; artifacts
  `artifacts/android/toss_b02ac_states_run{1,2}.json` (+`.json/.txt` latest-run copies).
- **Next probe**: arm afed8 entry `0xafed8` + `0xb02ac`; at the entry hit with `x0==4`, read
  **x30 (lr)** → identifies the CALLER that decided id-4 (the detection→verdict decision site).


---

## 0. TL;DR — what is proven and what changed

We built a free upstream-QEMU-11 + HVF lab on M1, booted Redroid Android 15 (arm64), and get genuine
guest ARM64 hardware breakpoints on Toss's native code via a host GDB-RSP client on the guest QEMU
gdbstub. We captured `libea56+0x13a4bc` and then reconstructed the real runtime data-flow by reading
the register just before each indirect branch (no OLLVM CFG solving).

**Major correction (§96): the old §83 model "0x13a4bc → afed8 → 0xa8f70 → emulator callback" was three
unrelated things stitched from debuggerd sample artifacts. Runtime truth:**
- `libea56+0x13a4bc` is **libc `poll()`** in the guard poll-thread — NOT an afed8 caller.
- `afed8`'s dispatch selects handler **`0x95224`** = the §14 self-destruct (saved-LR poison) handler.
- `0xa8f70` is **not a handler entry at all** (an OLLVM mid-function block) → hypothesis REFUTED.

---

## 1. CONFIRMED baseline (§90–§96) — do not redo

- upstream **QEMU 11.0.1** (brew) + **HVF** on M1: genuine ARM64 HW breakpoint (exact PC, guest bytes
  unchanged, reg/mem capture); TCG deterministic record/replay + plugin (§91). Full Linux 6.6 boots on
  HVF (§91). Linux EL0 userspace HW bp 3/3 (§92).
- **Redroid Android 15 (SDK35, arm64)** in an Ubuntu-24.04-arm64 guest under `qemu-system-aarch64 -M
  virt -accel hvf`; `adb localhost:5555`, `boot_completed=1` (§93). Redroid = a *container*, not a nested
  VM → Android app is an ordinary EL0 process in the guest.
- **Android native EL0 HW bp 3/3** (toy) and **Toss libea56 loads + RASP path runs** but **self-destructs
  ~4.5 s after libea56 load** (guard detects redroid: root/container/no-GMS; §93).
- **libea56 anchor capture (§95)**: `libea56+0x13a4bc`, all static predictions validated at runtime
  (`x0==sp+0x1a8`, `x2==4000`, `*(u16)(x0+4)==1`, `*(u16)(x0+6)==0`).
- **Runtime data-flow (§96)**: the three findings in §0.

Toss build == analyzed build: `libea56.so` sha256 `c454eb40…6203b89` (apk_backup base+arm64 split).
Static offsets are therefore valid.

---

## 2. The §96 findings in detail (register-level, runtime)

Method: catch libea56 load → get its (per-run, non-deterministic) load bias → HW-bp an indirect-branch
site → read the branch register at the stop = the CPU's real target. Never assume; read the CPU.

1. **`0x13a4bc` X9 target = libc `poll`** (`/apex/com.android.runtime/lib64/bionic/libc.so`, RVA
   `0x69490`, disasm `<poll>`). The site is `add x0,sp,#0x1a8 ; mov w2,#0xfa0 ; blr x9` =
   `poll(&pollfd@sp+0x1a8, nfds=1, timeout=4000ms)`. The §88 "sanity values" are a `struct pollfd`:
   `x0+4`=events=1 (POLLIN), `x0+6`=revents=0. Runs vary libea56 base but x9 stayed constant
   (`0xebc8e7087490`) because libc is at a stable zygote-shared address. Thread:04 (poll thread).
2. **afed8 selected handler = `0x95224`.** Arm afed8 entry (`base+0xafed8`) → hits (thread with x0=0
   dispatch-state, x2 tagged ptr). Dispatch structure (static, confirmed):
   - `0xb02ac: br x10` = OLLVM flattening (u16 index table @ `0x2c9c6`, case-pad base @ `0xb019c`).
   - `0xb02c4: blr x8` = the actual handler call, preceded by `mov x0,x19 ; mov w1,w4 ; mov w2,w5`.
   Arming `base+0xb02c4` and reading x8 → **x8 = base+0x95224**, thread:02, `x0=x19=context=
   0xb400ebc7bb23a330` (tagged heap ptr), `w1=0, w2=0`. `0x95224` disasm = large frame
   (`sub sp,#0xa60`, saves all callee regs, `x23=x0`) = the §14 self-destruct/poison handler. On redroid
   the guard reaches this dispatch, so only ONE `0xb02c4` hit is observed before the process dies.
3. **`0xa8f70` REFUTED (twice):** not selected (0x95224 was), and not even a function entry — it begins
   `ldr x8,[x8]` + OLLVM opaque-predicate arithmetic (`movk` building `0x2e00d84656e407e0`), i.e. a
   mid-function block. The original 0xa8f70/0xaa6a4 were debuggerd-sampled frames, not dispatch targets.

Artifacts: `artifacts/android/{toss_anchor_capture,toss_afed8_flow,toss_dispatch}.json`.

---

## 3. Environment & how to drive it

- Guest QEMU exposes a gdbstub on host **`::1:1234` (IPv6!)**. adb device = `localhost:5555`.
  **ASLR is OFF in guest** (`adb shell su 0 sh -c 'echo 0 > /proc/sys/kernel/randomize_va_space'`);
  re-disable after any guest reboot.
- If the guest is down, relaunch from `analysis-lab/android/` (cloud-init auto-installs docker+binder and
  `docker run redroid/redroid:15.0.0_64only`):
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
  Then `adb connect localhost:5555`.
- RSP client: `scripts/hvf_hwbreak_toy.py` (`RSP`, `regs`). Reuse it.

### Loader hook to get libea56's per-run load bias (REQUIRED every run)
libea56 is dlopen'd in an **isolated namespace** so it does NOT appear in the global `_r_debug` link_map
(verified: 848 loader events, Toss/bugsnag seen 396×, libea56 0×). And its base is **non-deterministic
across runs** even with ASLR off. The working hook is the linker-internal wrapper:
```
linker64 (app_process64/zygote) base (ASLR off) = 0xebc8ffebf000   # NOT the shell's 0xfffff7e6c000
notify_gdb_of_loadP6soinfo wrapper   @ +0x68bb4   # HW-bp here; x0 = soinfo* (before filter/link)
   soinfo + 0x100 = load_bias
   soinfo + 0x1a0 = libc++ std::string realpath (short: chars@+1; long bit0 set: ptr@+0x10)
   soinfo + 0xd8  = link_map l_name (fallback)
(WRONG: +0x4d634 gets soinfo+0xd0 embedded link_map, not soinfo*. Global _r_debug/rtld_db_dlactivity
 @ +0x4d6a8 never shows isolated-ns libea56.)
```
If the guest reboots, re-read the app linker base via root:
`adb shell su 0 sh -c 'grep -m1 "r--p 00000000.*linker64" /proc/$(pidof com.android.systemui)/maps'`
and recompute `+0x68bb4`.

---

## 4. libea56 offset map (build sha256 c454eb40…6203b89)

```
0x13a4bc  blr x9  = libc poll() call (guard poll-thread). NOT afed8.
0xafed8   afed8 dispatcher entry (OLLVM control-flow-flattened)
0xb02ac   br x10  = flattening dispatch (state -> case-pad); u16 tbl @0x2c9c6, case-pad base @0xb019c
0xb02c4   blr x8  = handler call (mov x0,x19; mov w1,w4; mov w2,w5) -> x8 = selected handler
0x95224   self-destruct handler (large frame; §14 saved-LR poison). Runtime-selected on redroid.
0xacca4   §14 poison store block (accb0 str x10(=0xc),[saved_LR]) -> ret 0xc self-destruct
0xa8f70   NOT a handler entry (OLLVM mid-function block). Old hypothesis REFUTED.
afed8 window indirect sites (static): 0xaff7c,0xaffa0,0xafff0,0xb0020,0xb0070,0xb020c,0xb0290,
  0xb02ac,0xb02c4,0xb03c4,0xb041c,0xb04e4,0xb0520,0xb0528,0xb063c,0xb074c
runtime VA of any offset = libea56_load_bias + offset  (R-E PT_LOAD has p_vaddr==p_offset)
```

---

## 5. Working tools (in `analysis-lab/`)

- `scripts/hvf_hwbreak_toy.py` — RSP client. `RSP(1234)`, `r.cmd(pkt, timeout)`, `r.interrupt()`.
  Continue = `r.cmd("c", t)` (there is **no** `send_raw`). Memory read = `m<va>,<len>` (hex, LE).
- `android/scripts/catch_libea56.py` — loader hook → libea56 base → arm anchor → capture (§95 tool).
- `android/scripts/trace_afed8_direct.py` — arm afed8 entry, trace internal indirect branches.
- `android/scripts/trace_dispatch.py` — arm `0xb02c4` directly, capture x8 (handler) per dispatch. This
  is the cleanest handler-attribution tool; extend it (see §7).
- `android/linker64`, `android/libc.so` — pulled binaries for symbol offsets (readelf/objdump).
- Toss APK (analyzed build): `../apk_backup/{base.apk,split_config.arm64_v8a.apk}`; `../libea56.so`.

---

## 6. OPERATIONAL GOTCHAS (these cost hours — obey)

1. **Connecting the gdbstub STOPS the guest** → adb freezes. **Launch Toss via adb BEFORE connecting.**
   All tools start an in-guest relaunch loop first (Toss self-destructs+restarts, reloading libea56).
2. **A client that dies without detaching FREEZES the guest** (stays stopped). NEVER `pkill -9` a capture
   — use `pkill -TERM` (tools install a SIGTERM/SIGINT handler that detaches). Recover a frozen guest:
   ```python
   from hvf_hwbreak_toy import RSP
   r=RSP(1234); print(r.cmd("D",4)); r.close()   # -> OK, resumes; then `adb shell echo ok` must respond
   ```
   Detach packet must be `$D#44` (checksum of 'D'); a `-`/NACK means a bad hardcoded checksum — use `r.cmd("D")`.
3. **QEMU/HVF does NOT auto step-over a HW bp at the current PC** — plain `c` re-fires. Manual step-over:
   `z1 / s / Z1 / c`. Use **HW (Z1)** on libea56 code (no mutation; a SW brk could be integrity-detected).
   SW (Z0) is fine only on non-target code (e.g. linker), but tools use Z1 everywhere.
4. **Memory reads over the gdbstub are context-sensitive**: a userspace VA is valid only when the CPU is
   in that process (i.e. at your bp stop). Out-of-context reads return `E14`.
5. RSP latency ≈ 0.1 ms/read (walks are cheap; slowness ⇒ frozen guest or a blocked thread, not reads).
6. Run scripts as `python3 -u script > file 2>&1 &` and read the file; do NOT pipe to `tail` (buffers).
7. zsh does not word-split unquoted vars (`A="adb -s localhost:5555"; $A shell` fails) — write full inline.
8. Only one gdb client at a time — don't run two capture scripts against `:1234` concurrently.
9. libea56 base differs every run → always re-acquire via the loader hook; never hardcode a base.
10. The self-destruct fires shortly after the poison dispatch, so post-poison probes have a tiny window;
    arm what you need BEFORE continuing into the dispatch that selects 0x95224.

---

## 7. OPEN — highest-value next probes (observation only)

The redroid guard goes straight to the self-destruct dispatch (afed8→0x95224), so the *detection→verdict*
chain that PRECEDES it is the remaining unknown. Best next steps, in order:

1. **Recover the detection→verdict chain**: arm `0xb02ac` (flattening `br x10`) and log the sequence of
   case-indices (`w8` state, and the `x10` case-pad target) leading up to the 0x95224 selection. Extend
   `trace_dispatch.py`: on each `0xb02ac` hit record `w8` + `x10-base`; also capture x8 at each `blr x8`
   handler-call site (not only 0xb02c4). This yields the ordered list of handlers/states → which check
   flips the verdict. (§84 saw "47× id-0 then id-4→poison" on camo33; verify on redroid.)
2. **Dump the guard's accumulated verdict**: at `0x95224` entry, dump the context `x19`
   (`0xb400ebc7bb23a330`, a tagged heap ptr — mask off the top byte `0xb4` MTE-style tag before reading if
   a read fails) 256–512 B, and single-step to the §14 poison store `0xacca4` to see exactly what/where it
   corrupts at runtime.
3. **Optional replay/attribution**: feed the captured handler-entry state into the TCG record/replay lab
   (§91) for deterministic re-analysis of the selected handler, if a live re-hit is too flaky.

Do NOT: rebuild Redroid/QEMU, re-do loader attribution, retry `_r_debug`, bypass/patch RASP, or do full
OLLVM static deobfuscation. Read the branch register at each indirect site instead.

---

## 8. File index
- `FINDINGS.md` §90–§96 (authoritative narrative)
- `analysis-lab/docs/{MODERN_ANDROID_QEMU_RE_LAB,ANDROID_GUEST_AND_TOSS}.md` (lab + Android reports)
- `analysis-lab/artifacts/android/*.json` (all runtime evidence)
- tools + binaries as listed in §5
- memory: `~/.claude/projects/-Users-1004276-Downloads-AppSuit/memory/appsuit-toss-rasp.md`
