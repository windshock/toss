# Toss RASP evidence harness

Reproducible observe→compare→hypothesize loop for the Toss/DexGuard local RASP
(emulator/anti-tamper) analysis. Goal is **detector attribution / data-flow
reconstruction**, NOT bypass. Scope: local/static RASP only (no server-side FDS).

## Reliability rules
- **Never** use "pid alive" / force-stop-survival / CertifyGuest-reached as a success
  metric. AMS auto-restarts toss and zombies survive `pkill -9` (FINDINGS §78).
- AMS restart can **clear logstore**. Each poll saves a separate live snapshot;
  `logstore_raw.txt` is only a first-verdict convenience copy (§84).
- The first AMS `Start proc` PID is the launch PID. `pgrep -f` candidates are
  filtered by package UID and paired with `/proc/PID/stat` starttime ticks.
  Missing observations or a disguised argv0 yield INCONCLUSIVE, not success.
- `debuggerd -j` does not patch app code, but can perturb timing. Use a no-stack
  control before claiming that stack sampling leaves verdicts unchanged.
  Requests are serialized because tombstoned rejects overlapping intercepts;
  `stack_samples_requested`, `stack_samples_launched`, and
  `stack_samples_completed` are distinct counts. A partial series cannot prove
  that five stack captures had no effect.
- `verdict.json` holds selected original-session evidence *and* a separate
  `capture_quality` assessment. Raw evidence remains in the snapshot files.

## Run an experiment
```
harness/trace_run.sh [--reboot] [--label NAME] [--win POLLS] [--stacks N]
                     [--fresh] [--params "k=v k=v"]
```
- `--reboot`  requests reboot + boot_recover; omitting it means same-boot runs,
  **not** reboot-clean repeats.
- `--win` is a poll count, not elapsed seconds; adb work adds time between polls.
  Use `meta.duration_s` and process `first_seen_s`/`last_seen_s` for actual timing.
- `--params`  LKM param overrides, e.g. `--params "maps_filter=1 mrs_spoof=0"`.
Produces `runs/<TS>-<label>/`:
```
meta.json verdict.json lkm_params.txt timeline.txt launch.txt
logcat.txt dmesg.txt maps.txt maps_identity.tsv
process_observations.tsv snapshot_status.tsv
logstore_snapshots/*.txt logstore_raw.txt stacks/*.txt
```

`trace_run.sh` force-stops Toss, deletes its current logstore JSON, and clears
device-wide logcat/dmesg before launch. Preserve anything needed before running.
It leaves the app stopped. Do not run it just to test the parser/CLI; use
`python3 -B harness/test_harness.py` instead.
Raw `logstore_snapshots/` may contain device/install identifiers; redact them
before sharing a run outside this workspace.

### Verdict semantics

- `DETECTED`: positive emulator callback/FDS evidence tied to the first AMS
  process and its observed PID+starttime incarnation.
- `NOT_DETECTED`: a complete **sampled** window with an explicit non-emulator
  detector result, no positive evidence, and no process exit/restart. This is
  only a claim about that window, not a five-minute/UI success claim.
- `INCONCLUSIVE`: missing/partial logstore, missing incarnation, or no explicit
  result. Absence of a callback is **not** a negative verdict.
- `CONTAMINATED`: AMS restart, another process' logstore, maps/stack identity
  mismatch, or requested LKM parameter readback mismatch.

`emulator_detected` is `true`, `false`, or `null` respectively. For a
contaminated run, `emulator_observed` may still retain a positive raw event,
but it is excluded from hypothesis statistics. `capture_quality` records the
reasoning inputs. Pre-upgrade runs remain intact and display as
`INCONCLUSIVE(legacy)` until re-collected with process starttime data.
`meta.model` is a post-run `adb getprop` value; `meta.app_reported_model` is
from that session's `process_created` log. A mismatch is a provenance clue,
not by itself proof of a detector input.

## Query / compare
```
harness/hns.py index          rebuild runs/index.json + table
harness/hns.py list
harness/hns.py show <id|latest>
harness/hns.py compare A B     verdict diffs between two runs
harness/hns.py frames          libea56 stack offsets vs emulator_detected (differential)
harness/hns.py hypotheses      param-set -> BASELINE/SUPPORTED/REFUTED/MIXED/INCONCLUSIVE/CONFOUNDED
```
IDs accept substrings (e.g. `163914`).
`hypotheses` reports status; it does **not** block a rerun. `frames` only
compares valid positive and negative runs and warns when one side is absent.
`compare` distinguishes declared `--params` changes from undeclared LKM or
environment drift; comparisons involving legacy/inconclusive runs are descriptive.

## Current attribution state (FINDINGS §82–§86)
Provenance of `raspEmulatorCallback`:
```
DexGuard Java (AbsAppGuard lambda, RxJava, reflection)
  -> JNI (native method o.ReusableBufferedOutputStream.R)
  -> libea56 afed8 dispatcher (0xb02c4)  [computed-goto, ~48 handlers]
  -> sampled libea56 frames (0xa8f70 / 0xaa6a4 / ...)
```
verdict `0x8_000000BE` is data-driven (NOT a code literal — don't grep constants).
In the 2026-09-27 stacks, `0xaa6a4` and `0xb02c4` are adjacent **within one
thread**, but `0x13a4bc` is on another thread. Do not present those three as
one observed call stack or attribute a sampled frame to the callback without
param/state evidence.

Live AVD A/B runs in §86 confirmed original-session positive evidence with and
without one completed debuggerd stack, but repeated `debuggerd -j` requests
timed out after the first capture. `--stacks 5` is a request cap, not a promise
of five usable samples. Check the three stack counts before interpreting a run.

## Open (next tools)
- afed8 param↔handler dynamic attribution: hw-breakpoint dead in HVF guest (§83b);
  stack sampling catches handlers statistically but not the param register.
- Not yet built: context memory diff (#3), unidbg isolated-handler replay (#4),
  static export (functions.json/xrefs.json/*.asm).
- Before replay, acquire a trustworthy handler-entry state (registers,
  context pointer, relevant pages). A stack PC alone is insufficient.

## Handler runtime-state capture (P1 prototype — capture_state.py)
```
capture_state.py <tombstone.txt> [launch_pid] [launch_starttime_ticks]
```
Code-safe register capture: parses a `debuggerd <pid>` tombstone (NOT `-j`) into
per-thread registers (x0=context candidate, x1/x2=args, x19) + libea56 frames,
attributed to a process incarnation. `in_handler` is true only when the top
native frame is a known afed8/handler offset (an entry-ish capture).

**Validated:** extracts libea56 guard-thread registers.
**Limitation (§87):** catching a handler *entry* (top frame = handler) is
low-yield with point-in-time tombstones — handlers run sub-ms (~0.2% of wall
time). A synchronous trap is needed for reliable entry state; hw-breakpoint is
dead in the HVF guest (§83b) and uprobe patches code (detectable). So the
unidbg-replay entry state is not yet capturable code-safely in this environment.
Next: denser sampling (still statistical), a real device (hw-bp works), or a
context-pointer route that does not depend on top-frame timing.
