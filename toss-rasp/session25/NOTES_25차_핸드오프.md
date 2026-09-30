# 25차 세션 핸드오프 (2026-09-22 밤) — 26차용

## 핵심 성과 (FINDINGS §30)
**"조용한 exit"의 최종 관문 = Java Runtime.exit(0)** — frida attach(기동 3.5s)에서
System.exit/Runtime.exit 오버라이드로 차단했더니:
- 프로세스 7분+ 생존(attach detach 후에도 유지)
- SplashActivity 포그라운드 유지 + "Fully drawn +1s535ms" 풀 렌더 + 탭 반응
- 재진입(am start splash) 시에도 75s+ 유지, 서브프로세스 재가동
- UEH 소유자 = com.mbridge.msdk.foundation.same.report.crashreport.e (광고 SDK)

즉 §27 모델 완결: mBase=null NPE → (mbridge/Bugsnag UEH 크래시 처리) → splash
finish + Runtime.exit(0) → **차단 시 이전 단계 전부 무력(생존)**.

## 미달과 다음 목표
- **메인 UI 진입 미달**: 스플래시 갇힘(NPE로 전환 로직 사망). MainActivity는
  매니페스트에 없음(am start 에러 실측) — 전환은 splash 내부 로직 몫.
- 26차 우선순위 후보:
  1. **mBase=null 주입 원인 차단** — NPE 자체를 막아 정상 전환 유도. 수단:
     attach 상태에서 ContextWrapper.setBase 호출 감시(Java.use 후크) +
     isRestricted 호출자 추적(Java 스택). "누가 null base를 만드나" 정면 포착.
  2. **LKM exit_group 게이트**(프리다 없이 목표 재현): target uid의
     exit_group(status=0)을 무한 대기(pause류)로 바꾸는 kprobe — 차단 시 프로세스
     생존은 frida로 증명됐으니 커널 버전만들면 "프리다 없이 5분+" 달성 가능성.
     주의: 컬렉션 스레드가 exit를 잡으면 대기 상태 부작용 관찰 필요.
  3. cmdline 위장 즉사 RE(tombstone_16 backtrace 전문) — "런 반복 누적 전환" 검증.
  4. 스플래시 전환 우회: 딥링크/알림/다른 exported 액티비티로 메인 직행 탐색.

## 운영 교훈 (25차)
- **uid 기반 pid 탐색 필수**(cmdline 위장 대비): `ps -A -o UID,PID | awk '$1==10175'`.
- 위장 즉사 모드는 재부팅으로 리셋(첫 런 정상 경로) — 실험은 부팅 직후 창에.
- exit_trap.js는 attach 모드 전용(spawn은 무력화). attach 시점 3.5s도 동작.
- am start "delivered to top-most"=죽은 task 잔재 → force-stop 후 재시작.

## 인계 상태
- 현 부트(16:52~, v4.16): 프로세스 3966 생존 중(17:0x), 감시자 forensics_25a,
  frida-server 구동 중, panic_on_oops=0.
- vmlinux 빌드 백그라운드 진행(IABT lr 심볼화용) — 완료 시:
  `llvm-addr2line -e ack-kernel/out/vmlinux 0xffffffc008007370`
- 25차 claude 검토 진행 중(session25/review/) — 결과는 26차 첫 동작으로 반영.
- exit_trap.js/probe_health2.js는 session25/frida/에 보존(스킬 반영 예정).

## [기록] 25차 마감 검토 불가
- codex: 워크스페이스 크레딧 소진(24차).
- claude: 주간 한도 소진 — "resets Sep 25 at 4am (Asia/Seoul)".
- → 25차 검토(REVIEW_BRIEF_25.md 작성 완료)는 **9/25 04:00 이후 claude로 재시도**.
  그 전 26차 세션은 검토 없이 진행(지시 조건: 중요 변경 시 검토 — 시도했으나 도구 불가).
