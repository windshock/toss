# 28차 세션 핸드오프 (요약 FINDINGS §32-3)

## 즉사 경로 해부 완료 (28차 핵심)
- 가드(초기화 상태)가 **libart PROT_NONE 가드 페이지를 가리키는 가짜 ArtMethod\***
  심음 → ART FaultManager의 SafeGetDeclaringClass 검증이 ACCERR 이중 폴트 즉사.
- 판별법: SFI11 3연발(검증폴트→anon실행폴트→최종ACCERR) + fault addr이 libart ---p
  세그먼트(7bcbe0f000) 소속.
- 즉사 런 앱 데이터 0건 — NPE 경로 "데이터 있음"은 과거 생존 런(5s+)의 산물.

## 처형 경로 이원 지도 (최종)
| 상태 | 경로 | 무기 |
|---|---|---|
| 초기화(pm clear) | 0.5s 즉사 | 가짜 ArtMethod* → ART 검증기 자폭 |
| 데이터 있음 | 5~13s NPE 위장 | mBase=null → Runtime.exit(0) |

## 29차 순서
1. **생존 런 직후 데이터 스냅샷 diff** — NPE 경로 전환을 유발하는 "데이터 있음"의
   실체 파일 특정 (exit 차단 런으로 7분 생존 → 데이터 풍부 생성 → 파일 목록/내용)
2. 판정 입력 차단 정공: libea56 셀프스캔(632회 vm_readv) 추적 — chan19 sys_enter
   id==270 필터로 스캔 대상 주소 캡처 → 무엇을 보고 판정하나
3. vmlinux(빌드 중) 완료 시 IABT lr 심볼화
4. 9/25 04:00 claude 리셋 → 25~28차 통합 검토 (REVIEW_BRIEF_25 + §31/§32 보강분)
