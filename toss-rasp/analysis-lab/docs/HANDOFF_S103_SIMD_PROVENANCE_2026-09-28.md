# HANDOFF — §103 (2026-09-28 5th session): SIMD provenance of the final 4 closed offline

Supersedes `HANDOFF_S102_INSTRUMENTATION_VERIFIED_2026-09-28.md`. Read FINDINGS §102 + §103
first. Observation only — no RASP bypass/patch, no server-side analysis.

## 0. TL;DR — the runtime-verified value chain (all from captured registers/bytes only)

```
hidden stream word x17 = 0x84247500451c8000   (captured at the final decoder step)
  -> bit window (x17 >> 16) & 0xffffffff = packed record 0x7500451c
  -> dup v2.4s (earlier OLLVM dispatcher state)
  -> ushl v0, v2, shifts[4,8,12,16] ; and v0, v3(0xf)     @ decoder+0x8f60/8f68
  -> q0 lanes [1,5,4,0]  (lane2 = record bits[12:15] = 4)
  -> stur q0,[sp,#0x28]                                    @ decoder+0x8f70 (layout: 0xfffd35518f70)
  -> slot A (sp47-0xd10) = lane2|lane3<<32 = 4
  -> bridge (…6d04 blr) -> afed8(x0=4, x1=invobj …b3a90)   [one event later, same run]
parallel scalar carrier: x5 = 4 at the store (3rd consecutive run)
```

Offline reproduction is EXACT: computed lanes == stored 16 bytes byte-for-byte; the §5
edge (q0.high64==4 pre-store AND *(u64*)(sp+0x30)==4 post-store) is verified; the 8f44
shift is cross-checked (`x15 == (x17&0xffff)<<0x30` — captured values).

"w12=4 at the ORR" (§102's supported hypothesis) is REFUTED at detail: this visit's ORR
leftover x12=0x564 is NOT consumed by the final store; the store consumes v2=0x7500451c
from an earlier dispatcher state.

## 1. Instrumentation laws added this session (extend the S102 invariant list)

1. Single-stepping FROM a breakpointed PC re-traps the bp WITHOUT executing (183,428-step
   deadlock reproduced). Generalized dance: remove the bp at the current PC before `s`.
2. QEMU aarch64 `g` ends at 268 bytes (33×8B core + 4B cpsr) — v0-v31 are NOT in g.
   Read vectors via `pN` with N from `qXfer:features:read:target.xml` (+includes);
   verify XML offsets against the known core layout (self-check) before trusting.
3. The anon decoder/stub cluster RELOCATES on userspace restarts (systemui respawn moved
   everything; low offsets preserved — …18f70 stable). Never hardcode absolute cluster
   addresses across sessions: derive per-boot via a G2k Z2 run, load from its artifact.
4. OLLVM flattening: linear disassembly blocks are entered fragment-wise via dispatcher
   jumps (main thread ran only 8f60..8f70; 8f38..8f5c skipped; other threads run other
   fragments). Trap the STORE itself, not a guessed "block entry".
5. The FINAL 4-writer varies between incarnations (one run: STUR non-4 final; two runs:
   STUR final). Only the in-run Z2 stream (probeG2k/S103d design) sees the true winner.

## 2. Reference implementations

- `probeS103d_z2simd.py` — THE canonical probe now: G2k Z2 dance + target.xml regmap +
  pN vector reads + per-4-write full capture (x0-x30, v0-v4 raw128/low64/high64/lanes,
  sp+0x28 16B, raw stop) + live-process bitstream/table dumps at afed8(4).
- Artifacts: `toss_s103d_z2simd.json` (final chain evidence), `toss_s103_simd.json`
  (instrumentation-law evidence), plus per-layout `toss_s102_probeG2k_final4.json`
  (NOTE: overwritten by each layout's re-derivation — the current copy is the NEW layout).

## 3. OPEN for next session (ordered)

1. A++ / DEX v9 mapping: the packed record 0x7500451c's bytes do NOT occur verbatim in
   `toss_hidden_dex.bin` — the stream is runtime-transformed (encrypted/whitened) or in
   another buffer. Next probe: capture the stream SOURCE buffer (x8's deref chain —
   [x8] held a stack pointer) + the transform inputs; then map record fields
   (nibbles 1,5,4,0 / upper 0x7500) to R(idx 0xe7b=3707)'s encoded argument record.
   This is a self-contained VM-format RE work item (termination case B).
2. x5=4's writer instruction (set before the decoder block; scalar carrier of the id).
3. runwatch.sh still logs nothing (0-byte log) — fix or retire.
4. Executor-bifurcation opens (freeze-timing A/B, ro.debuggable flip) unchanged from §101.

## 4. Environment

Same VM/boot as S101/102 (uptime continues), but userspace RE-MAPPED after a systemui
respawn: linker base now 0xfffff7e6c000, libea56 per-incarnation (0xfffc8…), decoder
cluster 0xfffd35518f70 (offset …18f70 stable). ASLR 0, SELinux Disabled, Android 15.
Guest left clean: launch loops killed, app force-stopped, runwatch running (log empty),
VM running (no gdb client attached).
