# 검토 요청 — 토스 원본 로컬 위장 연구 23차 세션 (NPE 위장 종료 + Timer-0 커널 패닉)

## 배경 (경계, 이전과 동일)
Apple M1 Android Emulator(camo33, arm64, API 33, GKI 5.15)에서 벤더 서명 원본 토스의
로컬 RASP 분석. LKM(hide_kmod v4.15c: 경로 위장 + faultdump/SFI11/SFO kprobe) 사용.
서버 조작은 경계 밖. 22차 검토(codex)에서 "크래프트 처형" 해석이 정정된 바 있다.

## 23차 결론 2건 (검토 대상)

### A. "조용한 exit" = NPE 위장 종료 (22차 검토 반론 수용 후 재정리)
```
ContextWrapper.isRestricted()가 mBase=null 상태로 호출(5런+ 결정론, far=0 시그니처)
→ 0x345534 ldr w0,[x1] implicit null check → SIGSEGV(far=0)
→ ART NullPointerHandler::Action이 ucontext를 표준 NPE 변환
  (pc=art_quick_throw_null_pointer_exception_from_signal=libart ELF 0x457920,
   x30=si_addr=0, sp-=8, [sp]=return_pc) — SFO 실측과 완전 일치
→ Java NPE → Bugsnag 캡처(libsigchain 체인: SignalChain::Handler→libbugsnag-ndk+0x5ba60)
→ ~12s 수집(fork 자식) → main System.exit(0), 자식 kill9 자기정리
```
부가 소거: OAT/bugsnag rx 무패치(런타임==원본), bugsnag rw·sigchain 배열 무오염,
복귀 pc 스택 부재. SIGSEGV 수거 체인은 전부 표준 구성요소.

### B. 재부팅 루프 원인 = 가드 Timer-0의 커널 패닉 (커널 콘솔 -show-kernel 포착)
```
[1554.49] Unable to handle kernel paging request @ 0xbfffffc008007370
  ESR=0x86000004 EC=0x21 IABT(current EL), pte=0, level 0 fault
  CPU:5 PID:1340 Comm:Timer-0
  pc=0xbfffffc008007370  lr=0xffffffc008007370
  x21=0xffffffff x19=0x4000c00 x22=0x7cb6159f60(유저 힙 포인터로 보임)
  Call trace: 0xbfffffc008007370 단 하나 (Code: bad PC value)
[1554.58] Kernel panic → 즉시 재부팅 (panic_on_oops=1)
```
- lr=0xffffffc008007370은 정상 커널 가상주소 대역(0xffffffc008...)에서 **상위 32bit가
  0xbfff로 뒤집힌 모양**. pc는 lr과 같은 하위.
- 발화: LKM 정상 적재 부트, 앱 런 후 ~26분, fault/SFI11 없는 런에서 간헐 발생.
- reboot_block(userspace reboot 차단)이 무력했던 이유 = 패닉이라 syscall이 없음.
- 과거 재부팅 4건(12:04~12:35, 전부 토스 초기화 국면 무로그 즉사)도 동일 패닉 추정.
- 우리 해석: 가드의 **안티 포렌식 설계** — 판정 후 증거(dmesg/ftrace/모듈/프로세스 메모리)
  를 재부팅으로 파기. 정상 기기에선 비발동(조건부) 추정.
- 대응: panic_on_oops=0 + kernel.panic=0 상시화(boot_recover [2b]) — 패닉 시 해당
  태스크만 사망, 시스템 생존.

## 검토 요청

1. **Timer-0 패닉의 기술적 경로 평가**: 유저 스레드(Timer-0, 아마 Java Timer/가드
   워치독)가 IABT(current EL) 커널 oops를 일으키는 현실적 경로은? (예: timer_create/
   SIGEV 콜백 오염, syscall 인자로 전달된 함수포인터의 커널 내 호출, 우리가 못 본
   driver 인터페이스). pc=0xbfffffc0... 의 주소 형태(커널 주소의 상위비트 뒤집힘)에서
   읽을 수 있는 것이 있는가?
2. **의도성 대 우연**: "가드의 안티 포렌식 설계" 해석의 반례. 예: 가드가 유저랜드에서
   오염시킨 데이터를 커널이 우연히 함수포인터로 해석(오염의 부수효과)할 가능성은?
   x19=0x4000c00이 22차 쓰레기 "handler=0x4000c09"와 같은 계열인 것의 의미.
3. **mBase=null의 주입 경로 가설**: ContextWrapper.mBase는 final이 아님(setBase 존재).
   "가드가 리플렉션/native로 mBase를 null로 만들고 다음 isRestricted 호출을 기다린다"가
   유력한가? 다른 후보(악성 ContextWrapper 서브클래스의 getBaseContext 오버라이드 등)?
   이 결정론적 NPE가 "위장 환경에서만" 발생하는 것과의 정합성.
4. **panic_on_oops=0의 부작용**: oops 후 커널 생존 상태에서 이후 관측(ftrace/kprobe)의
   신뢰성. Timer-0 패닉 재현 실험 설계상 주의점.
5. **24차 우선순위**: (1) isRestricted caller LR(fault 시 sp+0x28 /proc/mem 캡처)
   (2) Timer-0 직전 syscall 좁은 추적 (3) libea56+0x69b38 셀프스캔 트랙(RxCachedThreadS
   fault, 20차 632회 vm_readv 결정론) (4) frida 초기화 후 attach(에이전트 무력화가
   spawn 초기화 국면인지 확인). 순서와 빠뜨린 관찰?

원본 데이터: FINDINGS.md §24~28, session22/(nrun1.log, maps_*, oatpatch22/),
session23/(NOTES, sigchain/stack/bugsnag 덤프 스크립트와 산출물), /tmp/emu_kernel.log
(패닉 콘솔 전문 — 라인 24196 직전). 한국어로 답하라.
