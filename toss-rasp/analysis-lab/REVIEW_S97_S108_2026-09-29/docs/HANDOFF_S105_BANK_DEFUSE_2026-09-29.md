# HANDOFF — §105 (2026-09-29): record↔VM-bank def-use does NOT exist — id=4 is triply encoded

Supersedes `HANDOFF_S104_MARSHAL_CHAIN_2026-09-28.md`. Read FINDINGS §102–§105.
Observation only.

## 0. TL;DR — the directive's two edges are REFUTED as dataflow; the real structure is CONFIRMED

The directive asked to close: (1) packed record → VM-bank slot, (2) bank value 4 →
final w8=4. Full-register campaign (S105, 16,249 steps, `toss_s105_bank.json`) +
bank-slot Z2 watch (S105b, 14,924 bank writes, `toss_s105b_bankwatch.json`) prove
neither edge exists. Instead, id=4 appears INDEPENDENTLY in three places:

```
(1) CALLER SCALAR: the interpreter (3-arg fn, entry 0xfffd22032f24) is called with
    x27=4 (x12=4 alongside) already live in the caller. Its prologue
    stp x28,x27,[sp,#0x50] @0xfffd22032f2c spills x27 into [sp+0x58] — the exact
    slot later read as the "VM bank v3" (ldr w0,[x29,w3,uxtw#2], idx=3, x0=4 ×2).
    Bank-4 write = event n=102, t=1.92s.
(2) DECODED STREAM: slotA=4 (35 writes, ALL at n≥19996 — 19,900 events AFTER the
    bank-4). The final write's value goes ldrh w15,[sp,#0x30] → strh packing
    [x0+0x12e]=4 → NEVER read again (dead halfword; stack reused at step 829).
(3) FINAL DISPATCH: w8=4 is ARITHMETIC over obfuscated constants —
    ldr x8,[x8,#0x5f0] (const table) + movk w10,#0x47c3,lsl#16 →
    add w9,w10,#4; neg w8,w8; eor w10,w9,w8; and w8,w9,w8; add w8,w10,w8,lsl#1 = 4
    → mov w0,w8 @libea56+0x110cfc → br x6 where x6 = jump-table entry &afed8.
```

§104's per-instruction facts all stand; the CAUSALITY between them is corrected:
they are parallel manifestations of the same encoded id, not a dataflow chain.

## 1. Reusable assets

- `toss_s105_bank.json` — the COMPLETE full-register execution trace of the final
  16,249-instruction window (x0–x30 per step + insn bytes for 7,602 pcs). Any
  future def-use question about this window is answerable OFFLINE from it.
- `probeS105b_bankwatch.py` — dual-Z2 (slotA + arbitrary bank EA = sp46+0x338)
  watch pattern; caught the x27-spill writer on the first run.
- `analyze_s105_defuse.py` — EA/value def-use analyzer (wN→xN aware).
- Per-run artifact naming now standard (no overwrites).

## 2. OPEN boundaries (do not chase without a new directive)

1. Upstream of the caller's x27=4 (the marshalling caller's scalar preparation
   just before the interpreter call at lr-site 0xfffd225a7600) — one more edge,
   beyond this session's scope; merges into the stream/DEX-encoding RE.
2. A++ DEX v9 ↔ encoded record mapping (unchanged; static byte match negative).
3. runwatch.sh still logs nothing.

## 3. Environment

Guest clean (app stopped, loops killed, runwatch running, VM running, no gdb
client). Linker 0xfffff7e6c000 (same userspace layout since S103). ASLR 0,
Android 15, same boot throughout.
