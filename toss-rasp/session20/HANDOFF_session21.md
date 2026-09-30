# 토스(viva.republica.toss) 원본 로컬 위장 — 인계 프롬프트 (21차 세션용)

## 최종 목표 (불변)

원본 토스가 프리다 없이 ① 제한 다이얼로그 없이 메인 UI 진입 ② 5분+ 생존 ③ 3점 검증 통과.
**20차 현재**: 조용한 exit의 구조가 완전 해부됐다 — **로컬 SIGSEGV가 크래시 핸들러에
흡수된 뒤 Java System.exit(0)으로 정리**되는 경로(서버 게이트 아님). 남은 미지는
**fault PC/FAR = 어느 모듈인가** 하나로 수렴.

## 필독 자료

1. FINDINGS.md §24 (20차 — 조용한 exit 해부) + §23 (19차 EGL/무한프로브 픽스)
2. STATUS.md ⚡ 전선
3. session20/{run1.trace, run2.trace, trace_on1.txt, maps_on1.txt, trace_pf.txt, NOTES.md}
4. session20/HANDOFF_session21.md (본 문서)
5. 스킬 SKILL.md + pitfalls.md 19차 섹션 + scripts/{boot_recover.sh, toss_child_scan.sh}

## 20차 확정 사실 (근거 포함)

- SIGSEGV 3회(메인 code=1 MAPERR / RxCachedThreadS code=2 ACCERR ×2) 전부 동일 핸들러
  = **libsigchain.so+0x8c** → 앱 컬렉터(NPTH/Bugsnag류)로 체인 (signal_deliver tracepoint)
- 메인 exit_group(0)의 **lr = libandroid_runtime.so+0xcf44 = Java System.exit 호출점**
  (t20_exit 프로브: pc=libc+0x663f8, status=0x0). ApplicationExitInfo EXIT_SELF status=0.
- 컬렉터 체인: Thread-41 fork → kill(self,9)[v4.9부터 원래 허용] → /proc/*/maps·스레드
  stat 수집 → Thread-0/1 셧다운 훅 → exit(0). 소요 10~12s.
- faulting 스레드 = process_vm_readv 셀프스캔 주인 (632구간, 런맨 결정론적 632)
- 오프라인/온라인 동일 형상, 타은행앱·테스트앱 제거 무관 → **로컬 판정 확정**
- 생존시간 레이스: 29s~78s~240s+ — 변동 큼 (16~20차 공통 관측)
- LKM v4.9 배포: midr cpu0-7 한정(v4.7) + kill(9)→0 위장 Thread-* 면제 + ksig_dis 토글

## 20차 후반 업데이트 (외부검토 반영 — A는 사실상 완료, 남은 것은 Java 메서드 특정)

- **fault PC 특정 완료**: main SIGSEGV = far=0x0(READ), pc=boot-framework.oat
  vaddr+0x19d534 = **AOT Java 프레임워크 코드의 ART 암시적 null 체크**. libea56 poison/
  Chromium 회귀 모두 아님(§24-A). sig=11→libsigchain+0x8c(컬렉터)→~12s 수집→
  System.exit(0)까지 전 체인 확정.
- **18408 런 = 16분 fg TOP 생존 후 clean exit**: 동일 sig=11 2회를 받고 회복 — 컬렉터가
  fault마다 종료하는 게 아니며, 5분+ 생존은 스택상 달성 가능. blocker는 이 crash-exit
  발화 빈도(레이스).
- Bugsnag last-run-info crashed=false(마지막 런). 프로세스 vm_readv는 EFAULT만 반환 —
  maps 불일치 SIGSEGV 가설은 철회됨.
- LKM v4.9 + boot_recover.sh(ksig_dis=1 기본화 포함). 주소 해석은
  `scripts/toss_addr_resolve.py <maps> --trace <trace> --proc <pid>` 사용.

## [21차 직전 추가 확정] "System.exit called" 마커

- 종료 직전 앱 자신의 로그: `I/.republica.toss: System.exit called, status: 0` +
  `I/AndroidRuntime: VM exiting with result code 0, cleanup skipped` (logcat 9회 관측).
- 의미: **가드가 SIGSEGV를 자기 핸들러로 수거한 뒤 스스로 System.exit(0)** — 10차의
  툼스톤 자폭이 핸들러 흡수로 진화한 형태. 이 로그가 **판정 발화의 런타임 마커**다:
  마커 시각 ↔ 직전 스캔/채널 이벤트 상관로 판정 입력 역추적 가능.
- fault 연결 모델: 가드의 오염(poison 현대판)이 framework OAT의 NULL 역참조로 표면화 →
  자기 핸들러 수거 → exit. SIGSEGV 자체가 판정 후 처리일 가능성.
- 정정: 18408 "16분 생존"은 오인(백그라운드 서비스 수명; fg 전환 5s 만에 사망).
  생존 판정은 am_proc_start reason + wm_on_create 이후 시간으로만.

## [최종 확정] fault = 레지스터 오염 + 엔트리+4 직행 (24-C)

- t20_sp 프로브 실측: fault 시 **sp=0x7fdd25a730(정상)**, far=0x0,
  pc=boot-framework.oat+0x19d534 (= ContextWrapper.isRestricted() 스택프로브
  `ldr wzr,[x16]`, 엔트리+4).
- 정상 호출이면 x16=sp-0x2000이라 far=0 불가능 → **오염된 컨트롤플로가 엔트리+4로 직행,
  x16=0** — 10차 poison 계열(레지스터/컨텍스트 오염) 실측 확정.
- 21차: (a) 첫 fault 전체 GPR 덤프 + 직전 시그널리턴/blr 흔적 추적 (b) libea56 정적 RE로
  오염 지점 특정(12차 연장) (c) N런 (pc,far,x16) 불변성. 프로브는 t20_sp(sp 포함) 사용.

## [3차 외부검토 확정] 주가설 = 크래프트된 컨텍스트 복원 (FINDINGS §24-D)

- Claude+Codex 수렴: lr=entry-4(OatQuickMethodHeader)는 어떤 bl/blr도 만들 수 없는 값 →
  **합성/크래프트된 컨텍스트의 필드**. pc=entry+4·x16=0·sp/x29 정상이 한 번에 설명됨.
- 검증 1순위: fault TID 직전 syscall == rt_sigreturn(139)? → setup_rt_frame/
  restore_sigframe 훅으로 sigframe(pc/lr/x16) 실측.
- 전체 GPR: LKM kprobe 핸들러에서 task_pt_regs(current) 일괄 덤프(fetch 16 제한 우회).
- 정적 RE 재정의: "손상 store"가 아니라 **컨텍스트-라이터**(sigframe/ucontext 오프셋에
  pc·lr·x16 상수를 쓰는 store)를 0x95224/acca4 인근에서 추적.
- kill/exit 차단 = 원샷 진단용만. 근본 레버는 시그널경로 우회 또는 탐지 대상 은폐.

## [21차 실행 결과] rt_sigreturn 선행 실측 + 전체 GPR 확보 (FINDINGS §24-E)

- LKM v4.10 배포(kp_fault: far=0 EL0 데이터어보트의 전체 pt_regs dmesg 덤프, 상한 8회,
  fault_dump_en 토글). rt_sigreturn(139) 필터 캡처 병행.
- 실측: 메인 rt_sigreturn 6ms 후 far=0 fault. GPR: x0=부트이미지 포인터, x4~x6=ASCII
  `$Theme;` 디스크립터(ART 리졸루션 문맥), x16=0, sp/x29 정상, lr=entry-4.
- 부트마다 절대주소는 바뀌어도 패턴은 불변(부트이미지 상대 결정론).
- 후속: restore_sigframe 훅으로 복원 직전 프레임 실측 + `$Theme;` 문맥 호출경로 특정.

## [최우선 신규] 게스트 자체 재부팅 루프 (24-F/24-G)

- 게스트가 ~10-20분 주기로 userspace `reboot` 발행(boot reason=reboot, 에뮬 프로세스 생존).
  RescueParty 비활성 확인. 발행 주체 미상 — **모든 15분+ 실험을 무효화하는 운영 차단 요인**.
- 포착법: 호스트 측 `adb logcat -v time > 파일` 실시간 스트림 상시 기록(게스트 logd는
  리부트 시 미플러시로 마지막 1초 분실). 재부팅 직전 5초를 분석해 주체 특정.
- **결정 실험 준비 완료(21차)**: `/data/local/tmp/.t21rsig.sh`의 raw_syscalls 필터에
  id==142(reboot) 추가 — 재부팅 직전 발행 task의 comm이 트레이스에 직격 기록된다.
  런 절차: `rsig_dump_en=1` 활성(재부팅마다 0으로 리셋) → 스크립트 실행 → dmesg의
  rsigdump(크래프트 프레임 여부) + reboot 이벤트 동시 확인.
- 12:10:49 사례: 앱 크래시(jni_lib_merge 중)와 게스트 인스턴트 리부트가 **2초 간격으로
  동시 발생**(LKM 없는 통제 런에서도) — "앱 크래시 = 게스트 리부트" 동시 사건으로
  통합 관찰됨. 재부팅이 앱 크래시에 연동된다면 그 발행 comm이 결정적 증거.
- 참고: 12:04:49 재부팅은 앱 기동 35s 만에 발생(실험 무관 시점) — 실험 행위와 무관한
  주기성/외부 주체 가능성.

## 21차 우선순위

**A. 판정 발화 마커 기반 채널 역추적 (최우선)**
- 런을 돌려 `System.exit called` 마커 발화 시각을 잡고 직전(수십 초)의 스캔 이벤트와
  채널 상태를 상관 → 어떤 입력이 판정을 유발했는지 역추적.
- fault의 Java 메서드 특정(boot-framework.oat+0x19d534) 병행: 환경 유발 null인지 판정.
- boot-framework.oat vaddr+0x19d534가 어느 프레임워크 메서드인지 역추적
  (기기에서 /system/framework/arm64/boot-framework.oat + 관련 .vdex/.art 확보 후
  oat 심볼화, 또는 fault 직전 앱 컨텍스트(getname/바로 앞 Java 활동)로 범위 축소).
- 목적: 이 null이 (i) 환경 유발(위장 채널이 프레임워크 API에 null 반환)인지
  (ii) 앱 자체/불가항력인지 판정. (i)면 채널 수정으로 종료 경로 차단 가능.
- 병행: 컬렉터가 SIGSEGV를 claim하는 조건 파악(18205=종료 vs 18408=회복 차이).

**B. N런 생존 분포 하네스 (검토 권고)**
- 동일 부트 N=10런, 런마다 LKM 버전/ksig_dis/모드(online-offline) 태깅, 생존시간 +
  exit-info 분류 자동 집계. 단일 런 결론 금지.

**C. 확정 이후**
- 환경 유발 null이면 해당 채널 수정 → 재시험(5분+ 3점 검증 완주).
- 앱 자체/서버 수용 게이트로 판명되면: 로컬 RASP 목표=성공, 메인 UI=경계 문서화
  (분석용 대안: neutered 빌드 + 모킹).

**B. fake maps 불일치 가설 (fault가 libea56이면 2순위, 아니면 1순위 승격)**
- 가드의 process_vm_readv 632구간 셀프스캔이 /proc/self/maps(위장본 — camow3가
  goldfish/emulation 라인 **삭제**)와 실제 메모리 배치를 교차검증한다는 가설.
- 시험: camow3의 maps 생성을 삭제(grep -v) → **치환(sed로 서브스트링만 중립명 변경, 라인
  수 보존)** 으로 바꿔 A/B. 또는 LKM maps redirect에 치환 모드 추가(빌드).
- 변화 없으면 libea56 정적 RE: vm_readv 루프가 비교하는 대상 역추적(12차 누적기/§16-3 연장).

**C. 확정 이후**
- libea56 poison 확정 → afed8 id-4 재추적(toss9 최소 프로브, 13차 이후 채널 누적 재차분)
- Chromium/EGL 회귀면 → GL/WebView 스택 재점검(19차 픽스와 충돌 여부)
- 생존시간 레이스 통제: 동일 부트 연속 N런 분포 + 부팅 경과 상관

## 도구 / 환경 (20차 종료 시점)

- **에뮬**: v4.9 모듈 적재 부트로 라이브. bind/props/egl=adreno/writer/density 450 정상,
  qemu누수 0, EGL 리터럴 패치 유지. 타은행앱(smcard/hana)·test앱 **제거된 상태**
  (복구: clean/*.apk install-multiple — 21차 기본 실험에는 불필요).
- 재부팅 후: `sh $SKILL/scripts/boot_recover.sh` 한 번이면 전부 복구(인스턴스 포함).
- ksig_dis 토글: `echo 1 > /sys/module/hide_kmod/parameters/ksig_dis` (1=kill 위장 끔)
- 프로브: p19_gn/p19_eg/t20_die/t20_exit/t20_pf 등록됨(append만! clear 금지), instance=chan19
- ftrace 필터 예: `(id==260)||(id==117)||(id==270)||(id==198)||(id==203)||(id==93)||(id==94)||(id==129)||(id==131)`

## 절대 반복하지 말 것 (누적)

- kprobe_events clear 금지(append만). setenforce 1 금지. 구동 중 rmmod 금지.
- pidof/백그라운드 PID만으로 생존 판정 금지(3점 검증 필수). pid 재사용 주의(.t19.main 오답 사례).
- 오프라인 trace처럼 pid 미설정 캡처를 증거로 인용 금지.
- sched_process_fork를 "프로세스 fork"로 해석 금지(스레드 clone 포함).
- tgkill sig=33(SIGSETXID)은 bionic 정상 동작 — 자폭 신호 아님.
- ANDROID_EMU_gles_max_version_3_0 제거·normalize_cpu_path 재도입·MIDR wildcard 복귀 금지.
- 프리다 금지. push 직후 emu kill 금지. 셸마다 PATH 재설정.

**분석 축**: "어느 모듈이 fault했나" → "그 fault를 만드는 판정 입력은 무엇이나".

## [21차 마감 추가] 게스트 즉사 벽 + 다음 세션 1순위

- 토스 크래시(System.exit(0) 마커)마다 **게스트 전체가 무로그로 즉사**(콘솔/로그 0,
  2초 만에 리부트, 부트사유 "reboot"). LKM 없어도 재현 → 환경/가드-커널 상호작용.
- 다음 세션 1순위:
  1. `-show-kernel`로 에뮬 기동(커널 콘솔 캡처) + boot_recover + rsig_dump_en=1
  2. t21rsig 1런 — dmesg rsigdump(복원 pc/x16) + 재부팅 직전 커널 콘솔 동시 확보
  3. 커널 콘솔이 조용하면: qemu 몬터(`adb emu` 아님, socat로 monitor 포트) 또는
     게스트 없는 통제(토스 미기동 상태로 20분 방치 — 자체 리부트 재현 여부)
- 운영: 에뮬 재시작 시 `-show-kernel` 유지(패닉 가시화), 재부팅 루프 격화 중(10분 이내).

## [frida 개입 허용] (24-I)
- 사용자 승인으로 frida 사용 가능(원본 토스 spawn 모드 생존 확인 — LKM 위장이 가림).
- 스크립트: scripts/frida_toss/{exit_trace.js, t21_spawn.py, child_kill_watch.py}.
- frida-server 기동: `adb shell "nohup /data/local/tmp/frida-server -l 127.0.0.1:27042 &"`
  + `adb forward tcp:27045 tcp:27042`(또는 get_usb_device 직접 사용).
- 다음 실험: ① child gating에서 자식 kill 포착(리슈사 4s 조기사망 — resume 타이밍 개선)
  ② Bugsnag ExceptionHandler의 claim 로직 후킹으로 SIGSEGV 우회 → ART NPE 변환 → Java 스택
  ③ TossApplication 람다 UEH의 uncaughtException 훅 — 어떤 Throwable이 도달하는지.

## [v4.14 실험 결과] kill 차단 + 로깅 (24-I-2)

- 차단/기록된 SIGKILL은 전부 셀프-kill(Thread-41 컬렉터, "process" 헬퍼) — 부모 살해
  미관측. 앱 사망 경로는 SIGSEGV 체인의 System.exit(0)로 확정 유지.
- rsig_pre oops 실측(커널 콘솔에 전체 레지스터+콜트레이스) — panic_on_oops=1 게스트에서
  kprobe 핸들러 내 유저 메모리 접근(copy_from_user)은 패닉=재부팅. v4.14b에서
  rsig 핸들러 무효화(rsig_dump_en 기본 OFF) 완료. 재부팅은 rsig 이전에도 있었으므로
  원인 복수 가능성 — -show-kernel 콘솔로 다음 판별.
- 에뮬 기동 표준: `-show-kernel` 포함(커널 콘솔 호스트 캡처).
- 다음 세션: ①재부팅 직전 커널 콘솔 확보 ②sigframe 실측은 rsig 활성 리스크 감수 후
  신중히 ③토스 미기동 방치 통제(리부트 인과 분리) ④libea56 컨텍스트-라이터 정적 RE.

## [마지막 관측] 재부팅 타이밍 = 앱 System.exit 직후 (규칙성 확인)
- v4.14b+히스토리안 런: 앱 3751이 13:47:32 System.exit(0) → 게스트 리부트(13:48:33
  기준 uptime 1분). **재부팅은 앱의 exit 직후 수 초 내 발행** — 앱 크래시/종료와
  리부트가 인과적으로 연동(우연 아님).
- 발행자는 CAP_SYS_BOOT 보유 주체(system/root) — 앱(uid 10175)은 SELinux와 무관하게
  커널 권한으로 직접 리부트 불가. → 시스템 서비스 경유 또는 에뮬레이터/호스트 계층.
- 참고: 게스트 내 "constellation reboot_checker"/"Reboot Sync" 컴포넌트 존재(로그).
  재부팅이 일정 조건(예: 설정/플래그 변경 후)에 반응하는 스케줄형일 가능성도 검토.
- 다음 세션 1순위 유지: (a) 재부팅 직전 logcat의 powerctl/ShutdownThread 라인 확보
  (호스트 스트림 감시 유지), (b) `dmesg | grep -i reboot` (커널 로그), (c) 토스 미기동
  방치 통제(앱 exit 없이도 리부트되는지 — 인과 분리), (d) 이후 sigframe/libea56 RE.

## [24-J] frida 정밀 개입 결과 — exit은 raw syscall(훅 회피)
- Java System.exit/Runtime.exit/halt + libc exit/_exit/abort/kill/tgkill + UEH 체인 +
  Process.setExceptionHandler 전부 훅 → 죽음 시 전부 무발화 + "exited cleanly (0)".
  → **가드가 raw exit_group svc로 종료(훅 회피)**. 유저랜드 훅으로는 exit 시점 관측 불가.
- exit 원인(판정) 분석은 커널 레벨(kprobe p19_eg/t21_gpr)과 libea56 정적 RE로만 가능.
- UEH 체인 확정: KillApplicationHandler → Bugsnag ExceptionHandler → TossApplication 람다.
- frida는 관찰/개입 도구로 생존(스폰 모드) — scripts/frida_toss/ 참조.

## [24-J-3] 시퀀스 완성 + frida 예외 관찰 갭
- 5런 불변 시그니처 확정. 완전 시퀀스: far=0 SIGSEGV → Bugsnag/가드 핸들러 수거 →
  ~12s 컬렉션 → 셀프-kill → 소멸 (kill 차단해도 죽음 — 셀프-kill 차단 무의미).
- frida Process.setExceptionHandler가 far=0을 관찰 못함(Bugsnag 선점 의심) —
  fault_path.js(sp 스택 워크)로 libea56 경로 역추적이 다음 단계.
- 스크립트 저장: session21/frida/fault_path.js.

## [24-K] bionic 훅 전면 회피 확정 — 관측은 커널로 통일
- 가드는 exit_group/rt_sigaction을 raw syscall로 처리(bionic 심볼 훅 무의미 실측).
- frida Process.setExceptionHandler도 앱이 이후 sigaction으로 핸들러 교체 시 무력화.
- 다음 실험: LKM v4.15에 kp_rt_sigaction(EL0 데이터어보트... 아니면 signum=11 + sa_handler
  캡처) 추가 → 가드의 SIGSEGV 핸들러 주소 확보 → frida Interceptor.attach(주소)로
  핸들러 진입 시 si_addr/복원 pc/레지스터 실측 (LKM+frida 조합).
- 병행: libea56 정적 RE — 0x69b38/0x68bb0(24-J 관측 fault pc/lr)에서의 컨텍스트-라이터
  추적, 0x95224/acca4 연장.
