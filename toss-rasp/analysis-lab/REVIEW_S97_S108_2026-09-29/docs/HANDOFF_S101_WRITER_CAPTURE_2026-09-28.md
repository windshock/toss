# HANDOFF — §101 (2026-09-28 late night): ready-to-run writer capture + executor-bifurcation evidence

For the next session. Supersedes `HANDOFF_S100_EXECUTOR_BIFURCATION_2026-09-28.md`. Read
`FINDINGS.md` §90–§100 + that S100 handoff first. Observation only — no RASP bypass/patch,
no server-side analysis, no environment rebuild.

## 0. TL;DR — what changed since the S100 handoff

Two sessions ran since. Combined result: **the native path is now reproducible on demand,
the killing bridge address is known and stable, and a ready-to-run script
(`probeG2.py`) captures the scratch[0]=4 writer with minimal intrusion. RUN IT FIRST.**

## 1. §100 final results (supervisor2, artifact `toss_s100_sup2.json`)

- **afed8-only bp (LIGHT) ⇒ native path 3/3 runs**: exactly **46 id0 calls → afed8(4)**
  at t=1.2–2.05 s after arming. This is the reliable reproduction recipe.
- **bridge-1 = 0xe14bc0d86d00** (from afed8(4) LR−4), IDENTICAL across 3 incarnations.
  SIG check at that address: `ff8303d11083bcb0` (bridge-1 first insns).
- **R invocation object = 0xe14ac00b3a90** (x1 at afed8(4)), stable across runs
  (same `…b3a90` low bits as the old boot's 0xebc5400b3a90).
- afed8(4)-stop sp varies per run in high bits; **low 12 bits always 0x0f0**
  (R-dispatch frame depth deterministic; thread stack base random per incarnation).
- **Deep run failure diagnosis**: arming bridge-1 from the start = 76,500 stops →
  the native path DISAPPEARS (probe effect — heavy intrusion changes executor choice).
  Also the `[x0+8]==0xe7b` filter never matched at bridge-1 hits (unexpected-stop samples
  show x1-style args like 0xe14ac00b7fe0 / small ints — filter reliability unresolved;
  the address filter `x0&mask==0xe14ac00b3a90` is the trusted one).

## 2. Executor-bifurcation evidence (user hypothesis "server flagged this device" tested)

- Free-running online (no gdb): app dies ~10 s via **Java System.exit(0)**.
- Airplane-mode: ineffective (redroid uses eth0; don't `ip link set eth0 down` — kills adb).
- **Per-package network deny** — `cmd connectivity set-chain3-enabled true` +
  `cmd connectivity set-package-networking-enabled false viva.republica.toss` (undo with
  `true` + `set-chain3-enabled false`) — network WAS blocked (Network error in logcat) but
  **System.exit(0) still fired** → NOT a live-server response.
- logstore under network denial: `fds_detected result=[DEBUGGER]`,
  `postRaspResult detected=debugger`, `handleExitPlan caller=RASP exitPlan=EXIT`
  → **local RASP→FDS→handleExitPlan(EXIT) is the immediate cause**.
- **DEBUGGER source: `ro.debuggable=1`** (userdebug redroid image; also ro.secure=1,
  usb=adb). Consistent with §56-era knowledge. (Not yet A/B-tested by flipping it —
  `setprop`/`resetprop` availability untested.)
- Executor correlation so far: LIGHT gdb (afed8-only) → native poison (1.3 s);
  HEAVY gdb (76k bridge stops) → no id4; free-running → Java exit (~10 s).
  Working model (UNPROVEN): both executors armed; which one lands first depends on
  relative timing, and guest-freeze distortions shift the race. Do not treat as fact.

## 3. THE NEXT STEP — run `android/scripts/probeG2.py` (ready, fixed, unrun)

Design (single run, light): loader hook → libea56 load → arm afed8 ONLY → count entries;
at the **46th** afed8 call arm bridge-1 (0xe14bc0d86d00) too (only the last few dispatches
stop — preserves the native path) → at bridge-1 hit filter the R dispatch
(`x0&mask == 0xe14ac00b3a90` OR `[x0+8]==0xe7b`) → **Z2 write-watch on scratch[0] =
sp − 0x14e0** → record every write (PC/LR/full regs/slot-before) → on slot==4 capture the
**exact writer** (+ code window ±0x80, scratch window, interpreter-frame windows x19–x29)
→ continue to afed8(4) for same-run chain confirmation.

- Run: `cd analysis-lab/android/scripts && python3 -u probeG2.py > /tmp/g2.log 2>&1 &`
  (~2–4 min). Verdicts: WRITER4_CAPTURED / ANCHORED_NO_WRITER / AFED8_4_ONLY / NO_NATIVE.
- If `ANCHORED_NO_WRITER`: scratch layout differs this phase — at anchor, dump
  [sp−0x1600, sp] and find where 4 lands; adjust the slot offset.
- If `AFED8_4_ONLY` (bridge filter missed): use the posthoc_scratch check the script
  already logs (scratch0 = afed8(4) sp − 0x14e0, should read 4); then loosen the R filter
  (log x0 of every late bridge hit) and retry.
- If `NO_NATIVE`: the phase drifted again — re-run a plain classify pass
  (supervisor2_v9.py attempt loop or just afed8-only tracer) to confirm, then consult §2
  model; consider a timing A/B (e.g., deliberately freeze the guest ~50 ms per second
  WITHOUT breakpoints via gdbstub interrupt/resume cycles, vs free-running, and compare
  executor choice — this tests the freeze-timing hypothesis directly).
- **After writer capture (Phase 5–6)**: disassemble writer_capture.code_window (capstone);
  the writer's source register value is already in the regs dump; map the load operand to
  the interpreter frame (win_x19… dumps) = the Java vN slot; tie to hidden DEX
  (`toss_hidden_dex.bin`, `dex_tools.py`, `dexdis.py`) — §98 already knows the callee is
  `R(I,I)` invoked from `IAuthTabCallback` insn#22 with v9/v2.

## 4. Environment & ops (current state)

- QEMU up (boot script `analysis-lab/android/scripts/boot_lab.sh`, monitor
  `/tmp/qemu-mon.sock`; loadvm is BROKEN — QEMU11/HVF bug, don't use). Kernel pinned
  6.8.0-139; binder/docker/updates persistence all in place (see S100 handoff §"Lab ops").
- **Linker base this boot: 0xe14e83ea4000** (re-read after any reboot).
- ASLR: set to 0 (drifts per boot — always `adb shell su 0 sh -c 'echo 0 > /proc/sys/kernel/randomize_va_space'`).
- In-guest watcher `runwatch.sh` RUNNING → `/data/local/tmp/runwatch.log`
  (ts pid libea56=… anon=…). Relaunch loops are STOPPED (clean).
- App churn state at handoff: native-capable phase (libea56 loading, §100 evidence) —
  but phases drift; verify with one classify run before long probes.
- adb quoting (three known pitfalls, now baked into probeG2):
  * `adb shell su 0 sh -c '<cmd>'` must be ONE argv string.
  * inner single quotes break it — use double quotes inside.
  * `linker64\$`-style escapes silently return empty — the known-good form is
    `grep linker64 /proc/$(pidof com.android.systemui)/maps | grep "r--p 00000000" | head -1`.
  * First adb call after long idle can return empty — retry/disconnect-connect (probeG2 has a 6× retry).
- gdbstub gotchas: launch app BEFORE connect; Z1-only bps + manual step-over (z1/s/Z1/c);
  Z2 write-watch works; userspace reads are context-only (anchor first); a client that
  dies without `D` may freeze the guest (recover: `RSP(1234); r.cmd("D",4)`).

## 5. OPEN questions (ordered)

1. (§99 carry-over) exact writer instruction of scratch[0]=4 + its source register →
   interpreter virtual register → DEX v9 provenance. probeG2 closes the first half.
2. Executor selection mechanism (native vs Java) — freeze-timing hypothesis untested;
   ro.debuggable flip A/B untested (would also change the DEBUGGER verdict itself —
   separate the two questions carefully).
3. Whether the [x0+8]==0xe7b bridge filter is fundamentally wrong at bridge-1 entry
   (vs the address filter) — settle it with probeG2's dual logging.

## 6. Files

- scripts: `android/scripts/probeG2.py` (READY), `supervisor2_v9.py` (classify recipe),
  plus all §97–§100 tools.
- artifacts: `toss_s100_sup2.json` (bridge/R addresses + classify evidence),
  `toss_s101_probeG2.json` (created when G2 runs), `toss_hidden_dex.bin` + dex tools.
- FINDINGS §100 written; §101 partial recorded (this handoff is its companion).
