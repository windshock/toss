# 29차 세션 핸드오프 (요약 FINDINGS §33)

## 이번 세션
- 외부 핸드오프(TOSS_GUARD_RE...) 통합 수용: 정정사항 일치, Hikari provenance 계승,
  **unidbg+Ghidra 축 이동 전략**(LKM AVD=Ground Truth 유지).
- 사용자 지시로 AppSuit 난독화 해제 자산 확인: tools/unidbg-runner(maven),
  emu_dtinit_unpack.py(unicorn 복호화) — libea56 재활용 대상.
- **P0-1 성공**: build_indirect_edges.py — RELATIVE 7,327/into-text 7,314(핸드오프
  수치와 일치 검증), branch 사이트 5,329 중 **412 edge 복구**(site→ent→target).
  함정: ADRP 페이지 = (PC & ~0xFFF) + imm21<<12 (PC 상대 — 누락 시 0 매칭).
- vmlinux 빌드 BUILD_FAIL(원인 미규명).

## 30차 순서
1. Ghidra headless xref 주입 스크립트(indirect_edges.json → 프로젝트 toss5) +
   함수별 indirect-target 밀도 → Hikari 적용 함수 지도
2. unidbg Phase 0: libea56 ELF-only 로드 harness(tools/unidbg-runner 구조 참조,
   JNI_OnLoad 전체 금지 — stub 요구 폭발)
3. Phase 1: LDAXR/STLXR StringEncryption 후보 1개 실행 → 메모리 diff → plaintext
   (성공 시 provenance+파이프라인 동시 입증)
4. P1: vm_readv 632 triplet(NPE 데이터 상태 필요), actuator sink backward slice
5. vmlinux 실패 원인 / 9/25 04:00 claude 리셋 후 25~29차 통합 검토
