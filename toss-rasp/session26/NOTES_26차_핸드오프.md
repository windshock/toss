# 26차 세션 핸드오프 — 27차용 (요약은 FINDINGS §31)

## 핵심 판정
- **far=0 isRestricted 호출 = native blr 직접호출(Java 디스패치 우회)** — isRestricted
  frida 후크 장착 성공 + faultdump #5 같은 pid 발생 + [HIT] 0의 조합으로 확정.
- setBaseContext 부재(이 빌드) — ContextWrapper 후크 시 isRestricted만 사용할 것.
- exit 차단 생존 프로세스의 splash = 정지 화면(재생성 불부활).

## 27차 순서
1. Java.choose mBase 사전 교정 실험(유일 유저랜드 경로) — npe_guard4:
   openat 등 앱스레드 콜백에서 주기 Java.choose(ContextWrapper) 스캔 →
   mBase=null 인스턴스 발견 시 유효 context 주입(앱 자기 context 재사용) + 로그.
   NPE 시점(런 시작 수 초) 전 교정되면 폴트 미발생 → 전환 로직 생존 → 메인 진입 검증.
2. 교정 실패(시간 창 없음) 시: 목표 D 재판정 필요 — "메인 UI 진입"은 mBase=null의
   근본 원인(가드 판정 입력) 차단으로만 가능 = 은폐 채널 원점 회귀(스킬 원칙).
   유력 후보: RxCachedThreadS 셀프스캔(libea56+0x69b38, 632회 vm_readv 결정론)의
   판정 입력 차단.
3. 9/25 04:00 claude 한도 리셋 — REVIEW_BRIEF_25(작성 완료)로 25~26차 통합 검토.
4. vmlinux 빌드(장기 진행) 완료 시 IABT lr 심볼화.

## 보존 산출물 (session26/frida/)
- npe_guard3.js(작동 isRestricted 후크+exit 차단), diag2.js(메서드 노출 진단),
  run_*.txt(실험 기록).

## [추가] 26차 말 — mBase 사전 교정 실패 (§31-4)
- fix5(신규 프로세스+rpc 스캔): 첫 스캔 전 사망(faultdump #7). exit 차단도 뚫린
  사망 — **raw exit_group 우회 경로 존재 가능성**(Runtime.exit만이 아니라).
- frida detach 시 implementation 복원됨(장기 후크 불가 — 러너 세션 유지 필요).
- 결론: 유저랜드 우회(NPE 차단/교정/exit 차단)는 각각 우회 경로가 있음.
  27차 정공 = 판정 입력 차단(libea56 셀프스캔 632회 vm_readv 결정론 추적).
