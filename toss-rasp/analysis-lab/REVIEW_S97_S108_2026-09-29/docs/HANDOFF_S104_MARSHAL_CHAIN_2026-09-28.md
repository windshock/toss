# HANDOFF — §104 (2026-09-28 6th session): slotA=4 → afed8(4) marshal chain closed

Supersedes `HANDOFF_S103_SIMD_PROVENANCE_2026-09-28.md`. Read FINDINGS §102-§104.
Observation only — no RASP bypass/patch, no server-side analysis.

## 0. TL;DR — the fully-executed, same-run chain (S104 run 8, 16,252 steps)

```
stur q0,[sp,#0x28] @0xfffd22718f70            slotA = lane2|lane3<<32 = 4
  → (+68 steps) ldrh w15,[sp,#0x30] @…8f98    slotA READER (halfword 4)
  → strh packing [x0+0xb4..0xb8]               record re-packing
  → ~8.4k steps VM marshalling:
      ldr w0,[x29, w3, uxtw #2] @0xfffd2259ca04   x0=4 from VM register bank (3 visits)
  → and w8,w9,w8 ; add w8,w10,w8,lsl#1  @libea56+0x110cf0..f4
  → mov w0, w8                              @libea56+0x110cfc   FINAL x0=4 stager
  → mov x2,x0 ; mov x3,x1 ; br x6           @libea56+0x110d04   register tail-jump
  → afed8(x0=4)  (step 16251; this path bypasses the …6d04 blr bridge)
```

Also re-verified at the executed `dup v2.4s,w12` (20+ hits, run 1): pre-w12=0x7500451c,
x17=0x84247500451c8000, arithmetic (x17>>16)&0xffffffff==0x7500451c — the x17→v2 edge.

## 1. Method notes (what worked, what to reuse)

- `probeS104_marshal.py` is the canonical campaign probe: Z2(slotA) dance → at the final
  4-write DISARM EVERYTHING in `active` (a stale dup Z1 left armed caused runs 5-6 to
  abort by stepping onto it — S103 deadlock law) → single-step to afed8, lean records
  (g per step + slotA sampled every 32; insn bytes bulk-read at success).
- The store→afed8 gap is ~16k instructions — budget 25,000. The consumed-guard
  (slotA leaves 4) at >8000 steps separates mid-writes from the final write.
- Decoder-store discovery is runtime: Z2 event with (pc & 0xffff)==0x8f70 + §103 writer
  signature match. Cluster base drifts across userspace restarts (0xfffd355… →
  0xfffd227…), offset …18f70 stable within a layout.
- The final writer varies per incarnation (decoder store in runs 2,3,6,8; others in 4,5)
  and the bridge form varies too (…6d04 blr vs lib+0x110d04 `br x6`). Only in-run Z2
  anchoring is reliable.
- KEEP PER-RUN ARTIFACT PATHS (run-1's dup-producer artifact was lost to overwrite).

## 2. OPEN for next session

1. A++ DEX v9 mapping (unchanged recipe from S103 handoff §3: capture the stream source
   buffer + transform inputs; map record 0x7500451c fields to R idx 3707's encoded arg).
2. Upstream of w8/w10 at lib+0x110cf0..f4 (the VM-bank value's scalar prehistory) —
   needs a fuller-register campaign variant (record full g is already there; only x0/x5
   were kept lean — extend to x6/x8-x10/x29 if pursued).
3. runwatch.sh still logs nothing.

## 3. Environment

Guest clean (app force-stopped, launch loops killed, runwatch running, VM running, no
gdb client). Linker base 0xfffff7e6c000 (current userspace layout), ASLR 0, Android 15.
Artifacts: `toss_s104_marshal8.json` (the chain), `toss_s104_marshal3/5/6.json`
(diagnostic runs). FINDINGS §104 written.
