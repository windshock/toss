# 27차 세션 핸드오프 (요약 FINDINGS §32)

## 확립 (사용자 지시: 런 전 pm clear)
- pm clear 첫 런 = 즉사 경로: cmdline 위장(이번엔 "configupdater", uid 10175) +
  SafeGetDeclaringClass ACCERR 0.5s. faultdump(NPE) 0건.
- 데이터 있으면 NPE 위장 경로(mBase=null, 5~13s). **앱 데이터가 처형 경로를 결정.**
- cmdline 위장 재확정 — tombstone cmdline 무신뢰, logcat/avc pid·uid로 정체 확인.

## 28차 순서
1. pm clear → 런 반복(2,3,4번째)으로 경로 전환 시점 관찰 (즉사→NPE 전환 조건)
2. 즉사 경로 RE: tombstone_36 fault addr 0x7bcbe0fa80 / backtrace 전문
3. 판정 데이터 저장 위치 추적: pm clear 후 살아남는 저장소(외부/DA) 대조
4. 9/25 claude 리셋 후 25~27차 통합 검토(REVIEW_BRIEF_25 기반 + §31/§32 추가)
5. vmlinux 심볼화(빌드 계속 중)
