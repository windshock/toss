# 34차 세션 핸드오프 (요약 FINDINGS §38)

## 확정
- IB 상위 4함수(FUN_13e0b8/1380a4/144e2c/135858) 전부 **Hikari 디스패처**(인덱스→
  PTR_LAB 함수포인터 테이블→간접호출). 우연히 디스패처 본체(FUN_0023712c) 디컴파일
  획득 — MBA 비교식 + 런타임 키 DAT_00279eb0(안티 정적분석).
- **가드 의미론은 edge 타깃 쪽**: 412 edge DB(session29)의 target 리스트가 실체
  함수 목록.

## 35차 순서
1. edge 412의 target을 functions.csv(1,891)에 매핑 → 타깃 함수 리스트 +
   가드 13개 소속 함수와의 교집합 분석
2. 의미 타깃 우선순위: (a) 타깃 함수가 또 다른 가드(LDAXR)를 포함 (b) Phase1에서
   평문 나온 데이터 주소(0x17a318)를 참조하는 함수 → 디컴파일 → 가드 로직 해독
3. 병행: 부활 프로세스 attach(NPE 경로 복귀) → vm_readv triplet
4. 9/25 04:00 claude 리셋 → 25~34차 통합 검토

## 도구
- DecAtExact.java(정확 entry 디컴파일), EXACT_13e0b8.c / FUN_*.c(디스패처 샘플)
