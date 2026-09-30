# HANDOFF — §102 (2026-09-28 4th session): instrumentation verified, final 4-writer re-established

Supersedes `HANDOFF_S101_WRITER_CAPTURE_2026-09-28.md`. Read FINDINGS §101 (G2 series, now
partly superseded) + §102 (this session) first. Observation only — no RASP bypass/patch,
no server-side analysis, no environment rebuild.

## 0. TL;DR

The S101 "RUN probeG2 FIRST" plan executed, then the user's instrumentation-suspicion
directive rewrote the conclusions: **the G2 huge hit counts were re-trap artifacts; with a
verified remove→step→assert-advance→re-arm dance the whole #46→afed8(4) window is only
~21,000 real store events by 192 distinct writer instructions; the FINAL writer of
slotA=4 is `stur q0,[sp,#0x28]` at 0xe14bc1318f70 — a bitstream-decoder SIMD store whose
value comes from `orr w12,w15,w12` (decoded bitfield) — and the same run closed the chain
…→slotA=4→afed8(4) (one event apart).** The §98 chain (hidden DEX → R → bridge → afed8(4)
→ state4 → 0x95224 → saved-LR poison) now has its native-arg provenance: the 4 is decoded
from the hidden bitstream, not staged from an interpreter register spill.

## 1. Instrumentation invariants (MANDATORY for all future probes)

- Every Z1 stop handler MUST: `z1-del → g(old) → s → g(new) → assert pc_new != pc_old →
  z1-add`. Every Z2 stop: same, plus before/after memory reads; classify
  STORE_CHANGED / STORE_SAME_VALUE / NO_ADVANCE_ERROR / UNATTRIBUTED_STOP (no `watch:`
  field in the raw stop ⇒ do NOT count as a slot store on faith).
- All register reads via full `g` packets (register-index ambiguity: G2j's `p22` read
  hex 34 = v0 low bits, not x22).
- Never bare-connect to gdbstub port 1234 (attach alone pauses the VM); recovery from
  paused(debug): attach → `c` (drain pending stop) → `\x03` → `D`. Baked into all
  probe cleanups now.
- Reference implementations: `probeZ_semantics.py`, `probeG2k_final4.py`.

## 2. Confirmed this session (all same-boot, dance-verified)

1. Z1: 47/47 afed8 stops advanced; Z2: 20,931 / 20,992 events (two runs, ±0.3%) advanced;
   zero NO_ADVANCE errors. Counts are now trustworthy.
2. G2-era counts REFUTED as execution counts: real event count is ~21k, each was
   re-trapped ~20-25× by the old handlers. "Worker called 100k+×", "440k-iteration
   mega-round", hit/sec→guest-time arithmetic: discarded.
3. slot A (= sp47−0xd10 = sp46−0x3e0) is a shared VM operand-stack cell: 192 distinct
   writer instructions across anon-interp cluster (0xe14e7e…, 0xe14e67…), stub cluster
   (0xe14bc0c-13…), and libea56. Top: 0xe14e7e3563f8×3980; trio
   0xe14bc0ca43a0/0xe14bc104bf18/0xe14bc0ca54d8×3253 each; the early-phase P1↔P2
   alternation (0xe14e7e365240 / libea56+0xda2d4) is real but a small prefix only.
4. `libea56+0xda2d4 stp x22,x21,[sp,#0x30]` is a genuine frequent writer and at that
   writer x22 == stored value (runtime-verified repeatedly) — but it does NOT write the
   final 4 (x22 spill values are pointers). "x22=4 → +0xda2d4 → slotA=4" hypothesis REFUTED.
5. 4 is a common value on the slot (35 four-writes in the window; 0xe14e674a20b4 wrote
   0x30→4 thirty-four times). Only the LAST four-write matters.
6. FINAL four-write (event #20992, t=121.44): `stur q0,[sp,#0x28]` @ 0xe14bc1318f70
   (before 0x400000004 → after 0x4). Decoded-value chain immediately upstream:
   `ldr x17,[x12,w17,uxtw#3]` (width table) → `lsr x12,x12,x15` → **`orr w12,w15,w12`
   (direct source, w12=4)** → `dup v2.4s,w12` → `ushl v0.4s` → q0. At the stop: x5=0x4
   (parallel decoded id), bitstream buffer x8/x20/x28=0xe14a47cf1a80, bit offset x16=0x30,
   next stream word x17=0x84247500451c8000. Then a 7-value validation loop and halfword
   packing into [x0+0xb4..] (x0=sp+0x70).
7. Convergence tail: 0x8200000134 →(0xe14bc1318d50) 0x400000004 →(0xe14bc1318f70) 0x4 →
   afed8(4) ONE event later (t=121.45, call#47, x1=invobj 0xe14ac00b3a90, slotA=0x4).
   Caller chain around the decoder: zero 0x150-byte stack buffer → `bl 0xe14bc138ebd0`
   → read decoded fields [sp+0x14]/[sp+0xe8] → copy to hidden struct [x19+0..0xb8].

## 3. The remaining OPEN question (next session candidate)

Precisely map the decoder bit-layout to the DEX layer: bitstream buffer contents ↔
`toss_hidden_dex.bin` ↔ §98's `IAuthTabCallback insn#22 R(I,I) v9/v2`. Expected shape:
the constant 4 is encoded in the hidden stream as R's argument (v9), the decoder
(0xe14bc1318xxx) extracts it (w12/x5), the marshaller stages it as afed8's x0.
Suggested probe: dance-Z2 on slot A + at the final four-write ALSO dump
[x8 .. x8+0x40] (bitstream window) with bit offset — then correlate offline with the
hidden DEX artifacts (dex_tools.py, dexdis.py). This is a bounded, single-run addition to
`probeG2k_final4.py`.

Secondary opens: (a) the 197 UNATTRIBUTED stops + ~800 kernel-PC stops (0xffff8000_…)
— attribute or bound them; (b) runwatch.sh writes nothing (0-byte log) — fix or retire;
(c) §101's executor-bifurcation opens (freeze-timing, ro.debuggable A/B) unchanged.

## 4. Environment & ops

- QEMU up (same boot as S101; linker base 0xe14e83ea4000 — re-read after any reboot).
  ASLR 0, SELinux Disabled, Android 15 redroid, gdbstub 1234, monitor /tmp/qemu-mon.sock.
- App force-stopped, launch loops killed, runwatch.sh still running (log empty — see open (b)).
- Artifacts: `toss_s102_probeZ.json` / `.txt`, `toss_s102_probeG2k_final4.json` / `.txt`
  (final writer regs + writer/caller code windows + pc histogram + 35 four-writes).
- adb quoting: use the python `adb_sh` builder; never raw CLI awk-through-su chains.
