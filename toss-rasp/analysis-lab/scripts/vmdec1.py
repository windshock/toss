#!/usr/bin/env python3
"""vmdec1 - DexGuard VM stream decoder, milestone 1 (structural).

Track A of the S108 program (full VM deobfuscation). Everything here is
grounded in captured runtime values (S103/S105/S106 artifacts):

  VALIDATED CORE (regression, must pass):
    x17 = 0x84247500451c8000 (captured stream window)
    field = (x17 >> 16) & 0xffffffff = 0x7500451c          [bit extraction]
    nibble unpack shifts [4,8,12,16], mask 0xf -> [1,5,4,0] [SIMD ushl+and]
    lane2 = 4 = R's dispatch id (afed8 arg)

  SAMPLE: the interpreter's x2 argument window (S106 args_x2_win, 0x40B) -
  a stream fragment captured at interpreter entry.

  OUTPUT: (a) regression check, (b) nibble/bit-level census of the sample,
  (c) HYPOTHESIS walker (4-bit-field model) for human inspection.
Hypotheses are labelled as such - nothing here claims opcode semantics yet."""
import json

ART = "/Users/1004276/Downloads/toss/toss-rasp/analysis-lab/artifacts/android/vmdec1_census.json"
out = {"tool": "vmdec1", "milestone": 1}

# ---------- (a) validated core regression ----------
x17 = 0x84247500451c8000
field = (x17 >> 16) & 0xFFFFFFFF
lanes = [(field >> s) & 0xF for s in (4, 8, 12, 16)]
core_ok = (field == 0x7500451C and lanes == [1, 5, 4, 0])
out["regression"] = {"field": hex(field), "lanes": [hex(x) for x in lanes],
                     "pass": core_ok}
print("regression:", "PASS" if core_ok else "FAIL",
      "- field=%#x lanes=%s" % (field, [hex(x) for x in lanes]))

# ---------- (b) sample census ----------
s106 = json.load(open("/Users/1004276/Downloads/toss/toss-rasp/analysis-lab/artifacts/android/toss_s106_x27.json"))
bw4 = [w for w in s106["bank_writes"] if w.get("bank_after") == "0x4"][0]
hexstr = s106["final4_writer"]["caller_ctx"]["args_x2_win"] if False else None
# args window lives on the S106 bank4 caller_ctx
ctx = bw4.get("caller_ctx") or {}
hx = ctx.get("args_x2_win")
if not hx:
    # fallback: try top-level keys
    hx = (s106.get("args_x2_win") or "")
sample = bytes.fromhex(hx) if hx else b""
words = [int.from_bytes(sample[i:i + 8], "little") for i in range(0, len(sample), 8)]
out["sample_words"] = [hex(w) for w in words]
print("\nsample words (LE u64 view):")
for i, w in enumerate(words):
    print("  [%d] %#018x  bin=%s" % (i, w, format(w, "064b")))

# nibble census across the sample (which nibble values dominate)
from collections import Counter
nib = Counter()
for b in sample:
    nib[b >> 4] += 1
    nib[b & 0xF] += 1
out["nibble_histogram"] = {hex(k): v for k, v in sorted(nib.items())}
print("\nnibble histogram:", dict(sorted(nib.items())))

# trailing/leading zero runs per word (delimiter hints)
runs = []
for i, w in enumerate(words):
    tz = (w & -w).bit_length() - 1 if w else 64
    lz = 64 - w.bit_length() if w else 64
    runs.append({"i": i, "trailing_zeros": tz, "leading_zeros": lz})
out["zero_runs"] = runs
print("zero runs (trailing/leading):", [(r["trailing_zeros"], r["leading_zeros"]) for r in runs])

# ---------- (c) HYPOTHESIS walker: 4-bit fields ----------
print("\nHYPOTHESIS walk (sequential 4-bit fields from bit 0 of the LE bitstream):")
fields = []
bitpos = 0
for wi, w in enumerate(words):
    for nb in range(16):
        v = (w >> (nb * 4)) & 0xF
        fields.append({"word": wi, "nib": nb, "bit": wi * 64 + nb * 4, "val": v})
out["hyp_fields_head"] = fields[:96]
line = []
for f in fields[:96]:
    line.append("%x" % f["val"])
    if len(line) == 16:
        print("  w%-2d: %s" % (f["word"], " ".join(line)))
        line = []

json.dump(out, open(ART, "w"), indent=2)
print("\nartifact:", ART)
