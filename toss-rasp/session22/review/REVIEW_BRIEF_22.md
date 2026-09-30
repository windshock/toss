# 검토 요청 — 토스 원본 로컬 위장 연구 22차 세션 (크래프트 복귀 실측)

## 배경 (경계)
Apple M1 Mac의 Android Emulator(camo33, arm64, API 33, GKI 5.15)에서 벤더 서명 원본
금융앱(토스)의 로컬 RASP/안티에뮬레이션을 커널 모듈(LKM) 위장 + ftrace kprobe로 분석하는
연구다(OWASP MASTG 로컬/정적 RE 범위). 서버 위조/실거래는 경계 밖. 목표: 제한 다이얼로그
없이 메인 UI 진입 + 5분+ 생존 + 3점 검증(topResumed/스크린샷/탭 반응).

## 직전까지의 확립 (21차, FINDINGS §24)
- 원본 토스는 12~13s에 "조용한 exit". 시그니처 5런+ 불변: far=0x0 SIGSEGV,
  esr=0x92000006(EL0 읽기 폴트), pc=boot-framework.oat 매핑base+0x19d534,
  x16=0, sp/x29 정상, lr=pc-8, x0=부트이미지 객체 포인터, x4~x6=ASCII "$Theme;" 조각.
- fault → ~12s 컬렉션 → System.exit(0) or 셀프킬(kill9). 종료는 raw exit_group.
- 주가설: "크래프트된 컨텍스트 복원"(가드가 합성 시그프레임/컨텍스트로 점프).
  2위: ArtMethod 엔트리포인트 +4 오염.

## 이번 세션(22차)에서 한 일과 결론

### 1. LKM v4.15b: 시그프레임 양방향 kprobe (유저 메모리 접근 0)
ACK 5.15 소스 해부: sys_rt_sigreturn → restore_sigframe이 __get_user_error로
**pt_regs(커널)에 유저 시그프레임을 복사한 뒤** parse_user_sigframe을 호출.
- SFO = parse_user_sigframe kprobe: task_pt_regs()를 읽어 "rt_sigreturn이 복원한 값" 덤프
- SFI11 = setup_rt_frame kprobe(usig==11 한정): 시그널 전달 시점. ksig(커널)의
  sa_handler/si_addr + 인자 regs(=fault 순간 원본 레지스터) 덤프
(기존 kp_rsig의 유저 포인터 직접 읽기는 BRK oops→게스트 패닉 사고 이력 — 이 설계로 회피)

### 2. N런 실측 — 완전 시퀀스 (5런 동일 패턴)
```
[1] faultdump: far=0, pc=base+0x19d534, x16=0, lr=pc-8, x0=부트이미지 ptr
[2] SFI11(+27ms): 전달 시점 동일 레지스터(원본 보존 확인)
[3] SFO(+27ms): 핸들러가 리턴하며 rt_sigreturn — 복원 값:
    pc=libart.so+0x257920, x16=0, lr=0, sp=fault_sp-8, x0=부트이미지 ptr(유지)
    (= 핸들러가 SA_SIGINFO ucontext를 수정했다는 뜻)
[4] kill9 셀프킬(Thread-41/44/45/116, "process") ~1s 후
[5] raw exit_group(0)
```
- libart+0x257920 = art::interpreter::ExecuteSwitchImplCpp<true,true>+0xE82C
  (llvm-addr2line 심볼 + nm 확인; disasm은 adrp 문자열 로딩부=콜드 패스)
- 병행: RxCachedThreadS(셀프스캔 스레드) fault pc = libea56.so+0x69b38 (런별 base 이동)

### 3. fault 명령 정정 (21차 해석 오류 수정)
- 매핑: fault pc 0x715ba534 ∈ rx 매핑(7141d000-71b0d000, file offset 0x1a8000 기준).
  매핑내 offset 0x19d534 → **파일 offset 0x345534**(rx LOAD 보정 필요했음).
- 실제 명령: `ldr w0, [x1]` (0xb9400020). x1=0 → far=0. 
  entry+0(0x345530) = `mov x1, x22`(프롤로그 x1 설정) — +4 직행으로 x1이 stale 0.
  (21차의 "ldr wzr,[x16] 스택프로브" 해석은 vaddr→file offset 변환 누락 오판)

### 4. 코드 무패치 확인
fault 직후 컬렉션 창(~12s)에서 /proc/pid/mem으로 0x715ba510~560 덤프 →
**원본 파일 바이트와 완전 동일**. "가드가 OAT 헤더에 bl을 패치" 가설 기각.

### 5. fault 직전 rt_sigreturn 무관측
N런에서 fault 직전(수백 ms)에 SFO 이벤트 없음 — 21차의 "fault 6ms 전 sigreturn"은
필수 조건이 아님. 크래프트 점프 [1]은 유저랜드 직접(문맥 보존 br류) 추정.

### 6. frida 무력화 실측 (부수효과 실험)
토스 spawn에서 probe_health.js: 스크립트 로드 직후 동기 send 1회만 생존,
이후 native Interceptor(openat) 콜백·Java.perform 콜백 전부 0회.
검증은 파일 생성 부수효과(.probe_load만 생성, .probe_openat/.probe_java 미생성)로
채널과 무관하게 실시. → 가드가 시작되며 frida agent 런타임을 무력화.
(동일 스크립트를 설정 앱에 attach하면 정상 동작 — 환경 문제 아님)

### 7. 기타
- 토스 pid의 sigaction(SIGSEGV) syscall이 do_sigaction(kprobe)에 0건 — 가드/Bugsnag는
  libsigchain 체인 내부 등록(syscall 불필요). 21차 "raw rt_sigaction" 해석 정정.
- fault는 포그라운드 UI 초기화 경로에서만 발생. 백그라운드 방치 프로세스는 2분+
  생존(faultdump 0건). 전 syscall ftrace 부하 런에서도 fault 0(부하 타이밍 교란 영향 배제 못함).
- 재부팅 루프 소강: 60분+ 부트에서 reboot syscall 발행 시도 0건(dmesg 전체 커버,
  차단 로그 0 = 발행 자체가 없음). v4.15로 전-uid reboot 발행 로깅 무장.

## 현재 모델 (22차 종료 시점)
far=0 fault는 사고가 아니라 가드의 설계된 처형 시퀀스 시작. [1]은 가드가
Resources/Theme 리졸루션 문맥(x0=ArtMethod*, x4~x6=$Theme; 보존)에서
pc만 entry+4로, x1=0으로, lr=entry-4로 만든 "문맥 보존 크래프트 점프".
[3]에서 핸들러가 ucontext를 고쳐 libart 인터프리터로 복귀시켜(오염 실행) 컬렉션·셀프킬로 이어진다.

## 검토 요청 사항

1. **[1] 단계 모델 검증**: x0/x4~x6 보존 + pc=entry+4 + x1=0 + lr=entry-4 조합을
   설명하는 경로 중 "유저랜드 완전 크래프트 점프(레지스터 세팅+br)" 외에 자연스러운
   ART/Android 메커니즘이 있는가? (예: 엔트리포인트+4 오염 시 lr=호출자가 되어야 해서
   기각했음 — lr=entry-4를 만드는 다른 경로가 있는가? 런별 lr ±4 변동 관측 포함)
2. **[3] 해석 검증**: "SA_SIGINFO 핸들러가 ucontext를 고쳐 리턴" 해석의 대안이 있는가?
   (예: 커널이 다른 시그널의 프레임을 깔았다든지, SFO가 다른 스레드의 것이라든지 —
   덤핑된 pid/comm/timing 일관성 재검토)
3. **libart 인터프리터+0xE82C 복귀의 의미**: 왜 크래프트 복귀처가 인터프리터 콜드패스인가?
   오염 실행이 폴트 없이 kill9까지 이어지는 설명으로 타당한가?
4. **관측 설계 오류 가능성**: SFI11(kregs->regs[3]를 pt_regs로 읽음)/
   SFO(task_pt_regs(current))가 보는 것이 진짜 해당 이벤트의 레지스터인가에 대한
   반례 가능성.
5. **다음 실험 우선순위 판정**: (a) v4.15c로 정확해진 SFI11 sa_handler 주소 →
   fault 창 /proc/mem으로 모듈 resolve → "ucontext 라이터" RE 좌표,
   (b) 백그라운드 생존 정밀 측정(UI 경로 트리거 가설 강화),
   (c) fault 직전 좁은 syscall(mprotect/process_vm_readv/prctl) 추적,
   (d) frida attach 모드(초기화 후) 무력화 여부 — spawn과 다른지.
   순서와 빠뜨린 관찰이 있는가?

답변은 구체적 근거와 반론 가능성 위주로. FINDINGS.md §24-25와 session22/ 원본 데이터 참조 가능.
