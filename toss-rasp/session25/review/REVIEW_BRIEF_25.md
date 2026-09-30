# 검토 요청 — 토스 원본 로컬 위장 연구 25차 (Runtime.exit 차단 생존 성공 + 위장 즉사)

## 배경 (경계 동일)
M1 Android Emulator(camo33) 원본 토스 RASP 연구. LKM v4.16(경로 위장+faultdump/
caller_lr 캡처). 확립 모델(§27): mBase=null NPE 위장 종료 — isRestricted()가 mBase=null
으로 호출(결정론) → far=0 SIGSEGV → ART NullPointerHandler 표준 NPE 변환 → Bugsnag 캡처
→ ~12s 수집 → 종료. 24차: cmdline 위장 즉사 경로(시작 0.3s 내 cmdline을 구글 지도로
교체 후 art::SafeGetDeclaringClass에서 SEGV_ACCERR 즉사, tombstone_16) + frida attach
(기동 1.5s)는 무력화 안 됨(spawn만 죽음).

## 25차 결과 (검토 대상)

### A. exit_trap 실험 — 차단 생존 성공 ★
환경: 재부팅 직후 첫 런(위장 즉사 모드 리셋 가정), am start → 3.5s 후 uid 기반 pid
탐색(3966) → frida attach + exit_trap.js:
- System.exit/Runtime.exit 오버라이드(차단 모드), UEH 감시 설치 성공
- UEH 소유자 = com.mbridge.msdk.foundation.same.report.crashreport.e (광고 SDK)
- **[EXIT] Runtime.exit(0) — BLOCKED** 실측 (System.exit이 아닌 Runtime.exit로 호출)
- 이후: 프로세스 3966이 7분+ 생존(17:00 현재진행), SplashActivity 포그라운드 유지,
  "Fully drawn +1s535ms"(풀 렌더), 탭 반응 있음(WindowLeaked — 탭 처리 중 activity finish)
- 스플래시 재진입(am start) 시에도 75s+ 유지, 서브프로세스(gateway 추정) 재가동
- 단, **스플래시→메인 전환은 발생 안 함**: 스플래시에 갇힌 상태. MainActivity는
  매니페스트에 없음(am start 에러), 전환은 splash 내부 로직이 담당했을 것

### B. 세부 관찰
- attach 시점 런: NPE 경유 정상 런(faultdump 관찰 예상)이었는지는 dmesg 미확인(실험
  후 확인 못 함) — exit 차단 시점과 NPE 시점의 선후관계 미실증
- 첫 런 탭 후 홈으로(액티비티 finish) — 두 번째 런은 finish 없이 유지
- cmdline 위장 즉사 모드는 "런 반복 누적 후 전환" 추정(재부팅으로 리셋) — 미검증

## 검토 요청
1. **차단=생존 인과 검증**: Runtime.exit(0) 차단 외에 생존을 설명할 요인? (exit가 차단돼도
   컬렉션 fork/셀프킬이 별도로 돌면 죽어야 하는데 살았다 — 이전 관찬 kill9는 fork 자식
   자기정리였고 main 죽음은 exit였다는 §27 모델과 정합하는지)
2. **"스플래시 갇힘" 해석**: NPE가 전환 로직 사망 → 메인 진입 불가. exit 차단 생존은
   "프로세스 생존"이지 "메인 UI 진입"이 아님 — 목표(제한 다이얼로그 없이 메인 UI+5분)에
   남은 거리 평가.
3. **mbridge UEH 소유자의 의미**: NPE 처리 주체가 광고 SDK 크래시 리포터 — 토스 자체
   (TossApplication)가 아님. 이전 §24-I의 TossApplication$$ExternalSyntheticLambda17 관찰과의
   관계. UEH 체인에서 누가 Runtime.exit를 부르는가.
4. **26차 우선순위**: (a) mBase=null 주입 원인 차단(Java attach로 ContextWrapper.setBase
   호출 감시/필터? isRestricted 호출 문맥 정밀 추적?) (b) exit_trap 상시화 + 스플래시→메인
   전환 우회(다른 진입 액티비티/딥링크) (c) cmdline 위장 즉사 RE(tombstone_16) (d) 기타.
5. 빠뜨린 관찰/오류 가능성.

원본: FINDINGS §24~29, session25/(run_exit_trap_boot1.txt, forensics_25a.log),
session24/NOTES, /data/tombstones/tombstone_16(필요시 게스트에서 재열람).
한국어로 답하라.
