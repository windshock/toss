# HANDOFF — §106 (2026-09-29): no common runtime selector — build-time triple encoding + invocation context

Supersedes `HANDOFF_S105_BANK_DEFUSE_2026-09-29.md`. Read FINDINGS §102–§106.
Observation only.

## 0. Verdict on the S106 question

"Does one runtime state/selector make the three materializations converge on id=4?"
**NO — REFUTED (common selector). The alternative success condition is proven:
each path has its own upstream source.** Consistency is guaranteed at BUILD TIME
(the DexGuard binder emitted the same id into three independent encodings); at
runtime, the shared substrate is the INVOCATION CONTEXT (two objects), which
selects WHICH binding fires — not the values.

```
BUILD-TIME BINDING (per protected method invocation):
  ├─ stream record (0x7500451c nibble3)          → decoder → slotA=4   [S103]
  ├─ scalar convention (callee-saved x27/x12)    → interpreter spill   [S105b/S106]
  └─ dispatch constants K=*(lib+0x1835f0), C=0x47c3fc75
        → index 0x28 + value 4 (offline-reproduced from FILE bytes)    [S106]

RUNTIME COMMON SUBSTRATE (identity, not values):
  (a) veneer-layer context x19 = 0xb400ffff04ed8dc0 (tagged Java-side;
      fields +0x20 state counter, +0x98, +0xa8 — every interpreter-invocation
      veneer reads/writes these)
  (b) native invocation block 0xfffc400b3a90 (carried as x19/x20 through 883
      of the final window's 16,249 steps, 115 field reads, → afed8's x1)
```

## 1. Key instruction-level facts (all runtime-verified or file-reproduced)

- Dispatch site (lib+0x110c88): w9=0x28 AND w8=4 both = f(K, C) — pure
  constants; jump-table entry *(lib+0x17c1e0+0x28*8) is 0 in the file (dynamic
  relocation injects &afed8 = lib+0xafed8).
- Entry INTO that site is a control-flow handoff, not a data selection: the
  preceding marshalling function does an atomic CAS retry loop, then
  `mov x16,x0; ldp x15,x17,[sp,#0x80]; mov sp,x17` (STACK SWITCH) `; blr x16`.
- The interpreter call layer is repeated ~0x60-byte veneers (0xfffd225a7510/
  570/5d0/630…) that SAVE x27 (callee-saved) without writing it — x27=4 comes
  from above the veneer layer. Interpreter args: x0=arg block, x1=struct,
  x2 = BITSTREAM POINTER (window contents = encoded stream words — same medium
  as the decoder path's source).

## 2. OPEN (bounded, next-session candidates)

1. The original writer of x27=4 above the veneer layer (one more edge; the
   marshalling web's scalar preparation).
2. A++ DEX-level binding (unchanged).
3. runwatch.sh still silent.

## 3. Environment & assets

Guest clean (app stopped, loops killed, runwatch running, VM running). Same
boot/layout as S103-S105 (linker 0xfffff7e6c000). Artifacts:
`toss_s106_x27.json` (bank-4 + caller code/args windows), plus all prior
(`toss_s105_bank.json` remains the full-register 16,249-step trace — the
offline reference for any future def-use question in that window).
Scripts: `probeS106_x27.py` (bank watch + caller-context capture pattern).
