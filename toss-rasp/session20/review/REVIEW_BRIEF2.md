# 2차 검토 요청 — 토스 RASP 연구 20차 후반 결론 (fault PC 특정 이후)

전제: Apple M1의 Android Emulator(arm64, API 33, GKI 5.15)에서 벤더 서명 금융앱(토스)의
로컬 RASP 우회 연구(OWASP MASTG 범위, 서버 조작은 경계 밖). ftrace kprobe + LKM 위장 사용,
frida 금지(가드 mem_scanner 즉사). 1차 검토에서 오프셋 산술 오류(세그먼트상대 vs 파일오프셋),
process_vm_readv는 EFAULT만 반환(SIGSEGV 무관), kill 훅 혼입 변수 등을 지적받아 모두 수용했다.

## 이번 라운드의 새 결론 (검증 대상)

### C1. fault PC 특정 — 시간상관 성공
signal_deliver(sig=11) 7µs 직전의 do_mem_abort 이벤트:
```
.republica.toss-18205 t=323.436622 t20_pf: far=0x0 esr=0x92000006 pc=0x724df534 lr=0x724df52c
.republica.toss-18205 t=323.436627 signal_generate: sig=11 code=1 (MAPERR)
.republica.toss-18205 t=323.436629 signal_deliver: sig=11 sa_handler=0x786bfcc08c(libsigchain+0x8c)
```
maps 매핑: pc=boot-framework.oat vaddr+0x19d534 (file+0x345534), lr=+0x19d52c —
**AOT 컴파일된 Java 프레임워크 코드**. esr 0x92000006: EC=0x24(데이터어보트), DFSC=0x06
(변환폴트 L2), WnR=0 → **NULL 주소 읽기**.
해석: ART 암시적 null 체크에 의한 SIGSEGV(정상 Java NPE 경로) — libea56 poison도
Chromium 회귀도 아님. 다만 "가드가 상태를 오염시키고 그 오염이 framework OAT의 NULL
역참조로 표면화"하는 지연-오염 모델도 열어두었다.

### C2. 종료 체인 확정 — 가드의 우아한 자살
fault → libsigchain 핸들러(가드 컬렉터) 수거 → ~12s 수집(Thread-41 fork, maps/스레드 stat,
kill(self,9) 자기정리, tgkill(33)=bionic SIGSETXID) → 종료 직전 앱 자신의 로그:
```
I/.republica.toss(18205): System.exit called, status: 0
I/AndroidRuntime(18205): VM exiting with result code 0, cleanup skipped.
```
→ exit_group(0), lr=libandroid_runtime vaddr+0xcf44(file+0xc7f44).
ApplicationExitInfo EXIT_SELF status=0. 이 "System.exit called" 로그는 logcat에서 9회
관측 — **판정 발화의 런타임 마커**로 사용하기로 했다.

### C3. 정정 사항
- 이전 보고의 "18408 16분 생존"은 오인. am_proc_start 기록상 18408은 09:48:19 백그라운드
  서비스(SystemJobService)로 기동, 09:52:45 splash 전환 후 09:52:50 사망(5s).
  16분은 서비스 수명. 생존 판정은 am_proc_start reason + wm_on_create 이후 시간으로만.

### C4. 런타임 변동
전체 체인은 동일하나 생존시간이 12s~78s~240s+(드물게 그 이상)로 크게 변동.
Fault가 "환경 유발 null"(위장 채널이 프레임워크 API에 null 반환)인지 "앱 자체/불가항력"인지
미특정이며, 이것이 다음 세션의 핵심 질문이다.

## 검토 요청 (한국어, 번호별 답변 + 수정 권고 Top3)

1. **C1 해석의 견고성**: "far=0x0 + pc가 OAT r-x + DFSC 변환폴트 + WnR=0"를 ART 암시적
   null 체크로 보는 것의 반례 가능성은? (예: 가드가 의도적으로 zero-page 매핑 해제 후 접근,
   PAC/MTE 변수, 컴파일러assume 등) 구분하려면 어떤 추가 관측이 필요한가?
2. **C2 마커 전략 평가**: "System.exit called" 로그를 판정 발화 시각으로 삼아 직전 스캔
   이벤트를 상관하는 계획의 약점은? 마커 없이 죽는 변형(시그널/poison 직행)이 재출현할
   가능성과 대비책은?
3. **컬렉터 claim 조건**: libsigchain 기반 컬렉터(NPTH/Bugsnag류)가 ART 암시적 null 체크
   fault를 "네이티브 크래시로 claim"하는 조건과, claim을 안전하게 회피해 ART가 NPE로
   변환하게 만드는(→ Java 스택 확보) 사용자랜드 방법이 있는가? (앱 패치 불가, LKM/ftrace만 가능)
4. **boot-framework.oat+0x19d534 심볼화**: 호스트(macOS)에서 이 OAT 오프셋의 Java 메서드를
   역추적하는 실용적 절차는? (기기에서 boot-framework.oat/.vdex pull 후 파싱? oatdump 대체?
   dexpc 매핑?) 가능한 구체적 도구/명령을 제시.
5. **실험 설계**: "환경 유발 null 여부"를 판정하기 위한 최소 실험 세트를 제안. 특히
   (a) 동일 부트 N런 분포, (b) LKM 구성 태깅, (c) 종료 직전 30s의 채널 이벤트 델타 분석
   중 무엇부터? 통제해야 할 교란 변수 순위는?
6. **스킬 개선**: 현재 워크플로(boot_recover 원스텝 → 런 → ftrace 캡처 → toss_addr_resolve
   매핑 → 문서화)에서 추가 자동화/검증 2가지 이내.

참고(필요시에만): workspace/avd-camouflage/analysis/toss-rasp/FINDINGS.md §24, §24-A,
session20/{trace_pf.txt, maps_pf.txt, trace_on1.txt, NOTES.md},
~/.agents/skills/avd-rasp-camouflage/{SKILL.md, scripts/toss_addr_resolve.py}
