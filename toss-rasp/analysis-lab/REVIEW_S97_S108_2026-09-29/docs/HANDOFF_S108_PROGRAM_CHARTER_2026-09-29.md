# HANDOFF — §108 (2026-09-29): program charter change — full VM deobfuscation + detector/FDS analysis BEGUN

Supersedes `HANDOFF_S106_COMMON_SELECTOR_2026-09-29.md`. The standing prohibitions
on "전체 VM deobfuscation" and "server/FDS 분석" are LIFTED by explicit user request
(S108 charter). The observation-only and passive-traffic boundaries REMAIN: no RASP
bypass/patch, no server probing, no report forging — analysis only.

## 0. What exists after S108 session 1

Track B (detector/FDS) — milestone 1 DONE:
- `/tmp/fds_cap.pcap` (+ guest copy /data/local/tmp/fds_cap.pcap), 5 launch→death
  cycles, 2.8 MB. Findings:
  - The app's own API channel: **103.42.60-61.x :11099 = api-gateway.toss.im**
    (ClientHello SNI plaintext; DigiCert chain C=KR/Seoul; TLS1.3 + h2). The
    FDS/RASP reports (§101: fds_detected=[DEBUGGER]) most plausibly ride inside
    this TLS channel — passive observation yields metadata only.
  - Per-cycle SDK beacons: bugsnag sessions+notify (death/crash reporting!),
    appsflyer launches/inapps, applovin, facebook, pangle, unityads, doubleclick.
  - No plaintext DNS in capture (relay/DoH via 8.8.8.8:443-QUIC suspected).
- Next milestones (B): correlate gateway flow timing with logstore fds entries
  per cycle; logcat-side FDS tag census; classify which SDK beacons fire on
  RASP-death vs normal startup (A/B with the neutered build).

Track A (VM deobfuscation) — milestone 1 DONE:
- `scripts/vmdec1.py` + `artifacts/android/vmdec1_census.json`:
  - Regression core locked (PASS): x17 0x84247500451c8000 → field 0x7500451c →
    nibble-unpack [1,5,4,0]. Every future decoder change must pass this.
  - Format hypothesis v1: the stream is 32-bit (tag, packed-token) PAIRS —
    sample from the interpreter's x2 (S106): [5,0xc730071][0xa0000,0xf]
    [0x70008,0x7][0x5b638,0x5][0xc7b0776,0xa0001]... adjacent-token patterns
    (0xb638/0xb647; 0xc73../0xc7b.. families) suggest paired-record encoding.
- Next milestones (A): ② capture the decoder's WIDTH TABLE (x9 was PAC-tagged —
  retag or read via the table-base x12 before tagging) → field-level decode;
  ③ capture a LARGE stream window (Z2 on the x2 buffer) → census; ④ opcode
  semantics via correlation with executed native paths (S105 trace as oracle);
  ⑤ method-binding table (R idx 0xe7b ↔ stream records).

S107b (x27=4 first writer — the semantic-binding point) re-launched detached
(nohup pid in /tmp/s107b.log; budget 250k steps / 3000s; artifact will be
`toss_s107b_x27writer.json`). CHECK THIS FIRST next session; x27 at call#46 is
deterministically 0x30a, so the writer lies within the post-call#46 marshalling.

## 1. Environment

Guest: clean (app force-stopped after capture; launch loops ended; runwatch
running-silent; VM running). Linker 0xfffff7e6c000 (layout stable since S103).
tcpdump available at /system/bin/tcpdump (root). Note: while S107b holds the
gdbstub, adb can stall — recover with attach→c→\x03→D (the S103 law).

## 2. Reusable assets (cumulative)

- `toss_s105_bank.json` — full-register 16,249-step execution trace (offline
  oracle for the final window; def-use analyzer `analyze_s105_defuse.py`).
- `probeS103d_z2simd.py` / `probeS104_marshal.py` / `probeS105b_bankwatch.py` /
  `probeS106_x27.py` / `probeS107_x27writer.py` — the dance-verified probe
  family (Z2 anchoring, campaigns, watches).
- `toss_hidden_dex.bin` + `dex_tools.py`/`dexdis.py` (R = method idx 0xe7b).
- `/tmp/fds_cap.pcap` — the FDS/endpoint capture.
