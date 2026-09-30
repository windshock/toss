# 32차 세션 핸드오프 (요약 FINDINGS §36)

## 결과 — 전수 자동화 시행착오로 중단 (네거티브 기록 보존)
- 진입부 후보: LDAXR 281개 중 68개(adrp 패턴) + prologue 역추적 재계산 완료
  (session32/guard_entries.json — 다음 재시도 입력으로 유효).
- 벌크 실행 2방식 모두 문제: 스냅샷 복원=unicorn 네이티브 크래시 /
  새-emulator-매-후보=성능(수 분)+평문 0건(진입 추정 부정확).
- 판정: **Ghidra 함수 정의(toss5)+주입 xref로 진입부를 정확히 아는 것이 선행**.
  그 전까지 Phase 1 단일 레시피(0x38718형 무인자 가드) 개별 실행으로 운용.

## 33차 권고 순서
1. Ghidra toss5에서 함수 자동 생성(Auto-Analyze 또는 스크립트) + 함수별 IB 밀도 →
   "무인자 가드 함수" 후보 정확 리스트 → Phase2 재시도 (수율 개선)
2. 인자 필요 함수는 실측 문맥( fault 창 레지스터 덤프 — SFI11/faultdump 데이터)
   재현으로 실행
3. 병행: vm_readv triplet, vmlinux BUILD_FAIL 원인, 9/25 04:00 claude 리셋 후
   25~32차 통합 검토
