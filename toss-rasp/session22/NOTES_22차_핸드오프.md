# 22차 세션 핸드오프 (2026-09-22 오후 종료) — 23차용

## 이번 세션 확정 (상세는 FINDINGS §25)

1. **완전 사건 시퀀스 실측 확정** (v4.15b SFI11/SFO — 유저 메모리 접근 0의 시그프레임
   양방향 kprobe, ACK 소스 restore_sigframe 해부에서 도출한 안전 지점):
   ```
   far=0 fault(boot-framework.oat rx vaddr 0x37d534, ldr w0,[x1], x1=0)
   → 가드 SIGSEGV 핸들러(SA_SIGINFO) 수거
   → 핸들러가 ucontext 크래프트 후 리턴: 복원 pc=libart ExecuteSwitchImplCpp<true,true>
     +0xE82C(=libart+0x257920, 콜드패스 adrp부), x16=0, lr=0, sp-=8, x0(ArtMethod*) 유지
   → 오염 인터프리터 실행 → 컬렉션(fork 자식) → 셀프킬(kill9 Thread-*) → exit_group(0)
   병행: RxCachedThreadS 셀프스캔 fault @ libea56+0x69b38
   ```
2. **21차 해석 2건 정정**: fault 명령은 `ldr wzr,[x16]`이 아니라 **`ldr w0,[x1]`(x1=0)**
   (vaddr→파일 offset 변환 실수였음 — rx LOAD 0x1a8000 기준). "raw rt_sigaction 회피"가
   아니라 **sigchain 체인 내부 등록**(등록 syscall 자체가 없음, SIGACT11 실측).
3. **OAT 무패치**(fault 창 /proc/pid/mem == 원본 파일). fault 직전 rt_sigreturn도 무관측
   → [1]의 크래프트 점프는 유저랜드 직접(문맥 보존 br) 추정. bl 패치 가설 기각.
4. **frida 전면 무력화 실측**: 토스에서 native/Java 훅 콜백 0(파일 부수효과로 검증).
   21차 "frida spawn 생존" = 프로세스 생존≠계측. 커널 kprobe만 신뢰 관측.
5. **재부팅 소강**: 14:53 부트 60분+ 재부팅 0건(발행 시도 자체 없음). v4.15의 전-uid
   reboot 로깅(reboot_log_all)으로 재발 시 주체 판명 준비 완료.
6. **fault는 포그라운드 UI 경로에서만 발생**(백그라운드 2분+ 생존 관찰, 전 syscall
   ftrace 부하 런에서도 fault 0 — 단 이건 부하 때문일 수 있음).

## 23차 첫 동작 순서

1. boot_recover.sh (v4.15c 자동 적재 — SFI11 handler 값이 이제 정확: ksig+0)
2. 토스 1런(am start SplashActivity) → dmesg에서 **SFI11 handler=0x...** 값 확인
   → 가드 핸들러 정체(libsigchain vs libea56 anon) → "ucontext 라이터" RE 좌표 확보
3. 백그라운드 생존 시간 측정: am start 후 홈 버튼(back)으로 밀고 pidof 관찰
4. fault 직전 좁은 syscall 추적: chan19 sys_enter filter = `(id==226)||(id==270)||(id==167)`
   (mprotect/process_vm_readv/prctl) — 절대 전체 오픈 금지(부하로 게스트 붕괴, 22차 실측)
5. 재부팅 발생 시: forensics 로그 마지막 5초 + `dmesg | grep "reboot "` (ISSUED/BLOCKED)

## 도구 (session22/)
- toss_fault_resolve.sh — fault 감지→컬렉션 창 내 maps 캡처→SFO/SFI resolve
- oat_patch_check.sh — fault 창 런타임 OAT 바이트 vs 원본 대조
- nrun_observer.sh — N런 자동 관찰
- frida/* — 무력화 실험 스크립트 일체(증거용; 정밀 개입엔 못 씀)
- /tmp/boot-framework22.oat, /tmp/libart22.so — resolve용 원본(호스트)

## 절대 금지 (22차 추가)
- **raw_syscalls sys_enter 필터 해제(전 syscall)** — 부하로 게스트 타이밍 붕괴+adb 지연.
- 토스에서 frida 타이머/콜백 의존 스크립트 — 무력화됨(부수효과 마킹으로만 검증 가능).
- 기존 금지 유지: kp_rsig 본체 재활성, 구동 중 rmmod, ANDROID_EMU 토큰 제거 등.
