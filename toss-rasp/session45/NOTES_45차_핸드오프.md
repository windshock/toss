# 45차 세션 핸드오프 (요약 FINDINGS §49)

## 확정
- **virtio 저장소 채널 3종 차단**(/sys/block vda~vde, /proc/partitions·diskstats
  vd* 라인) — 함정: adb CR로 $ 앵커 실패 + 파티션 접미사(vda1) → 패턴
  `vd[abcde][0-9]*` 무앵커. 차단 후에도 EXIT(T+11.9s).
- **C12 dword 재판명**: 스캔은 매 런 라이브(postRaspResult×11/런, emulator
  detected×11) — dwordStore는 시크릿/유효기간 저장일 뿐. 체인: prepareSecret→
  postRaspResult(emulator)→acquireNewSecretSuccess→getDwordResult
  (message_present)→setUnauthorized→다이얼로그+exit.
- 계측 안정화: combo_probe.js(ARG 4000자 + logstore 200ms 폴링) — 1런 328
  JSON/78 ARG 캡처. raspEmulatorCallback(debugInfo 비트마스크)는 발현 조건
  미상(42차 run1에서만 관측됨).

## 46차
1. 'emulator detected' 원천: 계측 반복(비트마스크 재포착) 또는 libea56 정적 RE
   직행(emulator 체크 함수 비교 상수 직독).
2. 마스크→mask-diff→0x00→클린 5분+ 3점.
3. 9/25 claude 리셋 통합 검토.

## 산출: combo_probe.js ★ / attach_combo.py / run1~3 / apply_45_fixes.sh /
partitions·diskstats·sysblock 위장본
