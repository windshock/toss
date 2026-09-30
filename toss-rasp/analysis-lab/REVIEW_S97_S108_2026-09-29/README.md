# Toss Guard RE review package — S97–S108 (2026-09-29)

이 패키지는 §97–§108 구간의 핵심 분석 결과를 다음 리뷰어/LLM에게 전달하기 위한 축약본입니다.
대형 원시 콘솔 로그는 제외했고, 재검증에 필요한 DEX, JSON 아티팩트, probe 스크립트, handoff 문서를 포함했습니다.

## 추천 읽는 순서

1. `docs/FINDINGS.md`의 §97–§108
2. `docs/HANDOFF_AFED8_DATAFLOW_2026-09-28.md`
3. `docs/HANDOFF_S101_WRITER_CAPTURE_2026-09-28.md` → `HANDOFF_S108_PROGRAM_CHARTER_2026-09-29.md`
4. 필요 시 `artifacts/android/*.json`과 `scripts/*`로 교차검증

## 결론 요약

- §97–§98: hidden DEX interpreter → `R(I,I)` native → `afed8(4)` → state4 → `0x95224` poison chain confirmed.
- §101: free-running `System.exit(0)`의 즉시 원인은 실시간 서버 응답이 아니라 로컬 `RASP → FDS → handleExitPlan(EXIT)` telemetry/logic.
- §102: gdbstub 재트랩 오류를 걷어내고 최종 `slotA=4` writer를 dance-verified 방식으로 재확정.
- §103: final `4`는 packed record `0x7500451c`의 nibble에서 SIMD unpack으로 materialize됨.
- §104: `slotA=4`에서 `afed8(4)`까지 16,252-step same-run marshal chain 폐쇄.
- §105: “packed record → VM bank → final dispatch” 단일 def-use는 부재. id=4는 caller scalar / stream record / dispatch constants로 3중 독립 인코딩.
- §106: 공통 runtime selector는 부재. 의미 일치는 DexGuard build-time triple encoding으로 보는 모델이 가장 강함.
- §108: 프로그램 헌장이 VM deobfuscation + passive detector/FDS analysis로 전환됨.

## 포함된 주요 아티팩트

- `artifacts/android/toss_hidden_dex.bin` — scrubbed hidden DEX dump.
- `toss_b02ac_states_run{1,2}.json` — afed8 dispatch-state sequence.
- `toss_afed8_caller{,2}.json`, `toss_marshaller_dump.json`, `toss_savedargs2.json`, `toss_vm_late2.json` — §98 chain evidence.
- `toss_s102_probeG2k_final4.json`, `toss_s103d_z2simd.json`, `toss_s104_marshal8.json`, `toss_s105_bank.json`, `toss_s105b_bankwatch.json`, `toss_s106_x27.json` — §102–§106 core runtime evidence.
- `traffic/fds_cap.pcap` — passive packet capture from §108 Track B milestone 1.

## 주의

- 2026-09-29의 duplicate `§102 은닉 DEX 정적 분석 재개`는 좋은 중간 정적 가설이지만, §103–§106의 runtime-proven triple-encoding 모델이 더 최신입니다.
- `probeS109_width.py`는 이 패키지에 포함하지 않았습니다. FINDINGS에 §109 결과가 아직 없으므로 검증 완료 산출물로 취급하지 않습니다.
- 실험을 재개할 때는 gdbstub breakpoint dance 규칙을 반드시 지키세요: current PC의 bp 제거 → single-step → advance 확인 → re-arm.

