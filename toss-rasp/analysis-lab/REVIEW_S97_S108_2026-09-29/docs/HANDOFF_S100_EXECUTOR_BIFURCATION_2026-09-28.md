# HANDOFF — §100 (2026-09-28 night, IN PROGRESS): execution-path bifurcation + v9=4 writer capture

For the next LLM, **assigned to investigate the root cause from a DIFFERENT angle than the
previous sessions**. Read `FINDINGS.md` §90–§99 + `HANDOFF_AFED8_DATAFLOW_2026-09-28.md` first.
This file assumes those and adds the §100 partial state. Observation only — no RASP
bypass/patch, no server side, no environment rebuild.

---

## 0. THE MYSTERY YOU ARE ASSIGNED (restate)

The Toss guard (libea56/DexGuard) kills the app through **two different enforcement paths
depending on boot/environment phase**, and we do NOT know what selects between them:

```text
PATH A (native):  hidden-DEX R(v9=4,0) → bridge-1 → marshaller-1 → afed8(4)
                  → state4 → handler 0x95224 → saved-LR poison → SIGSEGV
PATH B (java):    guard verdict → Java System.exit(0) at Splash
                  (libea56 sometimes never even loads)
```

- PATH A: reproduced DOZENS of times on 2026-09-28 afternoon/evening (the "old boot" — a
  long-churned Android inside the SAME QEMU process). All §97–§98 data comes from it.
- PATH B: on freshly-rebooted/clean Android phases, app dies every ~12 s via
  `System.exit called, status: 0`, often WITHOUT libea56 ever loading (logcat + soinfo-hook
  + /proc maps evidence).
- EVENING TWIST: after hours of churn, the CURRENT phase loads libea56 in most app
  incarnations again (watcher shows it), **but a 22-minute in-context blind scan found NO
  interpreter code blob and afed8(4) has not yet been re-observed** (the run that would
  confirm was cancelled mid-flight).

**Do NOT assume "churn causes the native path"** — that is a correlation we have not proven.
Candidate angles nobody has tried (you are encouraged to pick differently):
- app-internal state: logstore (`/data/data/viva.republica.toss/files/logstore/`) + bugsnag
  (`cache/bugsnag-exit-reasons`) DIFFER between path-A and path-B runs;
- Java-side orchestration state (the hidden DEX is dumped: `artifacts/android/toss_hidden_dex.bin`
  — `DexguardWrapper`, `DexguardRasp`, `TossApplicationGuard`, `AbsAppGuard` lambdas are all
  there in plaintext; a Java-level path-selection condition may be statically visible);
- timing: PATH A always appeared while the guest was SLOW (frozen repeatedly by breakpoints);
  pure free-running may favor PATH B. (Testable: slow the app without breakpoints? careful —
  observation only; e.g. attach gdbstub and single-step nothing, just freeze/resume cycles.)
- which PROCESS runs the guard: multiple toss pids exist; maybe PATH A needs a specific
  process/incarnation state (first-launch vs restart, warm vs cold).

## 1. Confirmed model (do NOT re-derive) — §97–§99

- Full PATH A chain end-to-end, incl. `R` = `Lo/ReusableBufferedOutputStream;.R` (hidden-DEX
  method idx 3707/0xe7b, STATIC|NATIVE), the bridge-1/marshaller-1 layout, scratch[0] outgoing
  x0, and the state-4 → 0x95224 dispatch. See HANDOFF_AFED8_DATAFLOW §98 UPDATE.
- bridge-2 (thunk `+0x186b30` → marshaller-2 `+0x4586c4`) decoded; its outgoing x0 = args[0]
  rewrite; epilogue `str x20,[x19]` never holds 4 (64k samples) → not the writer.
- **Z2 write-watchpoints work** on this QEMU/HVF (9.7k triggers, stable).
- The killing dispatch is bridge-1; outgoing `x0=4` is written by marshaller-1 into
  **scratch[0] = (bridge-1 entry sp) − 0x14e0**.
- Interpreter = true anon exec blob (~1.6MB span on the OLD boot, 0xebc639400000-…595090+;
  data tables ≥26MB away at 0xebc639e0d348 — separate mappings). NOT libviva-*.so (that is
  Toss's RN lib) and the bridge code is NOT in libtg.so's FILE (checked; libtg is packed —
  runtime self-decryption unverified).

## 2. §100 partial results (this session, cancelled mid-run)

- **supervisor_v9.py** (v1): adb-only classifier (libea56/exit per run) + deep-probe trigger.
  Bug fixed: `adb shell su 0 sh -c '...'` must be ONE argv string (word-splitting broke it).
- **supervisor2_v9.py** (v2, READY, NEVER COMPLETED A RUN): afed8-anchored design —
  loader hook → libea56 load → arm afed8 bp → classify ids; on x0==4 capture LR
  (**bridge-1 = lr − 4, no signature search needed**), then NEXT run does the full deep
  capture (bridge-1 armed at the revealed address, filter `[x0+8]==0xe7b`, Z2 on scratch[0],
  writer-of-4 capture). Run it: `python3 -u supervisor2_v9.py`. It self-iterates ≤6 attempts.
- Negative results: (a) bridge-1 SIG `ff8303d11083bcb0` NOT in libtg.so file; (b) 22-min
  in-context blind scan of the e14e72/e14e76/e14e81 clusters (current boot) found NO SIG —
  the interpreter blob either is not mapped in the scanned process or lives elsewhere
  (libea56/libtg cluster ~0xe14b0…-0xe14b2… was NOT scanned; do that if you retry this route).
- Environment phase at handoff: libea56 loads in MOST incarnations (watcher evidence),
  relaunch loops STOPPED (clean), runwatch.sh RUNNING (see §4).

## 3. Current live environment (as of handoff)

- QEMU up with monitor socket `/tmp/qemu-mon.sock` (boot script
  `analysis-lab/android/scripts/boot_lab.sh [snapshot]`), gdbstub `::1:1234`, adb `localhost:5555`.
- Kernel pinned 6.8.0-139 (do NOT let it boot 142 — binder breaks redroid; grub is set).
- Android booted, toss installed, **ASLR runtime value drifts per boot — ALWAYS set**:
  `adb shell su 0 sh -c 'echo 0 > /proc/sys/kernel/randomize_va_space'`.
- **App linker base THIS BOOT: 0xe14e83ea4000** (re-read after ANY reboot:
  `su 0 sh -c 'grep -m1 linker64… /proc/$(pidof com.android.systemui)/maps | grep r--p'`).
  SOINFO hook bp = base+0x68bb4. Expect EVERYTHING else to shift per boot too.
- In-guest watcher RUNNING: `/data/local/tmp/runwatch.sh` → `/data/local/tmp/runwatch.log`
  (lines: `<unix-ts> <pid> libea56=<base|no> anon=<exec-ranges>`, poll ~0.3 s).
  Restart: `su 0 nohup sh /data/local/tmp/runwatch.sh >/dev/null 2>&1 &`.
- Helper scripts on guest: scan_maps.sh, fm4.sh (list ≥64K exec regions), gettg.sh.
- qcow2 snapshots: `good-139-patched` (disk), `booted-clean` (2.57GiB, **loadvm CRASHES —
  QEMU11/HVF ARM cpu_pre_load bug, do not use**).

## 4. Operational gotchas (all cost hours — obey)

1. Launch the app via adb BEFORE connecting gdbstub (connect freezes the guest → adb dead).
2. A gdbstub client that dies without `D` detach may freeze the guest. Always SIGTERM
   (handlers detach); recover: `RSP(1234); r.cmd("D",4)`.
3. HW bp = Z1 only (no code mutation). Step-over manually: z1/s/Z1/c. Z2 = write watchpoint
   (works; kind=2, 8 bytes fine).
4. Userspace VA reads via gdbstub are **context-valid only in the stopped process** — E14
   otherwise. Always anchor with an in-context bp FIRST (soinfo hook or afed8).
5. Unmapped-page m-probes are slow (~0.16 s each) — never blind-scan big ranges; 22-min scan
   = 8k probes. Prefer runtime-revealed addresses (afed8 LR trick).
6. libea56 base differs EVERY load (isolated-ns); anon/interp addresses differ per boot AND
   drift per incarnation under churn. Content-derived anchors (method idx 0xe7b, code SIGs)
   survive; addresses don't.
7. adb `su 0 sh -c` commands must be a single quoted argv string; inner single quotes break.
8. Only ONE gdbstub client at a time; don't run two tracers.

## 5. Recommended next steps (pick your own if better)

1. Run `supervisor2_v9.py` as-is (afed8-anchored). If afed8(4) fires → bridge-1 revealed →
   deep run captures the scratch[0]=4 writer (the §99 OPEN). If several attempts show id0s
   but no id4 and the app still dies → you have PATH-B-with-libea56 — a THIRD condition —
   record it (that classification itself is new evidence).
2. In parallel (cheap, no gdbstub): diff logstore + bugsnag-exit-reasons between a
   path-A-reminiscent run and path-B runs; grep the hidden DEX for the executor-selection
   logic (`dex_tools.py m <idx>` / `dexdis.py`; classes of interest in §0).
3. If you need the interpreter blob location on THIS boot: at an afed8 id0 stop (in-context),
   scan the libea56/libtg cluster (~0xe14b0…, few MB) for the SIG — the NOT-scanned area.

## 6. File index (§100 adds)

- scripts: `android/scripts/supervisor_v9.py`, `supervisor2_v9.py` (+ prior §97–§99 tools)
- artifacts: `artifacts/android/toss_s100_supervisor.json` (v1 partial),
  `toss_s100_sup2.json` (v2, may not exist — run was cancelled)
- this file; FINDINGS §99 (§100 not yet written — WRITE IT when you have results)
- guest-side: /data/local/tmp/{runwatch.sh,runwatch.log,scan_maps.sh,fm4.sh,gettg.sh}
