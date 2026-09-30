# 검토 요청 — 토스 원본 로컬 위장 연구 19~20차 세션 (ftrace 기반 RASP 탐지 채널 분석)

## 배경 (경계)
Apple M1 Mac의 Android Emulator(camo33, arm64, API 33, GKI 5.15 커널)에서 벤더 서명
원본 금융앱(토스)의 로컬 RASP/안티에뮬레이션을 ftrace + 커널 모듈(LKM) 위장으로 무력화하는
연구다(OWASP MASTG-TECH-0144 로컬/정적 RE 범위). 서버 측 위조/실거래는 경계 밖으로
금지되어 있다. 프리다는 mem_scanner 즉사 때문에 금지. 목표: 스플래시 넘어 메인 UI 진입 +
5분+ 생존 + 3점 검증(topResumed/스크린샷/탭).

## 이번 세션(19~20차)에서 한 일과 결론

### 19차: EGL 즉사 레지레션 2종 픽스 + 무한 프로브 재발 픽스
1. 앱이 3~8s 내 RenderThread SIGABRT(EGL_NOT_INITIALIZED). 원인: 우리 LKM(hide_kmod
   v4.6)이 target uid의 'emulation' 포함 경로를 deny/열거은닉하는데, vendor bind 사본
   libEGL_adreno.so 내부 dlopen 키가 libGLES*_emulation 그대로 → 사본 3종의 모든
   "emulation" 리터럴(8곳: dlopen키·DT_SONAME·로그태그)을 "adreno\0\0\0"로 치환.
   SONAME이 같이 바뀌어 bionic soname dedup으로 로드됨을 실측 확인.
2. ro.hardware.egl이 부트마다 "emulation"으로 리셋 + Android 13 EGL 로더는 readdir 없이
   고정명(emulation/kalama/generic)만 시도(ftrace getname 실측) → 부팅마다
   `resetprop ro.hardware.egl adreno` 필요.
3. 6분 ANR의 원인: v4.5 MIDR wildcard redirect(cpu<임의수>/regs/identification/midr_el1
   전부 매치)가 가드의 코어수 프로브(cpuN++…ENOENT 대기)의 ENOENT를 봉쇄 → 메인 스레드
   무한 스핀(82만 distinct cpuN 경로 실측). v4.7에서 cpu0-7로 한정, cpu8+는 실경로 ENOENT.
4. 결과: 스플래시 렌더 + topResumed 유지 + 메인 idle + 8분+ 생존 복원.

### 20차: "조용한 exit"의 해부 (외부 검토 지적을 수용해 재분석)
증상: 메인이 29~78s(변동)에 신호 없이 소멸. 우리가 초기에 "서버 판정 종료"로 추정했으나
외부 검토가 트레이스 재대조를 요구했고, 확인 결과:
1. 메인 스레드 SIGSEGV MAPERR(code=1) — 직전 메인 자신의 process_vm_readv 셀프스캔 3회
2. RxCachedThreadS SIGSEGV ACCERR(code=2) ×2 — 632회 vm_readv(런맨 결정론적 632)를 돈
   스캐너 스레드 본인
3. 세 fault 전부 동일 핸들러로 전달: signal_deliver tracepoint에서 sa_handler =
   libsigchain.so+0x8c (ART 시그널 체인 → 앱 등록 컬렉터 NPTH/Bugsnag류)
4. 컬렉터 체인: Thread-41 fork → kill(self,9) 자기정리 → /proc/*/maps·스레드 stat 수집 →
   Thread-0/Thread-1 fork 후 즉시 exit(93)(셧다운 훅) → 메인 exit_group(0)
5. 메인 exit_group의 caller: 자체 kprobe(p:t20_exit __arm64_sys_exit_group status=+0(%x0)
   pc=+256(%x0) lr=+240(%x0) sp=+248(%x0))로 **lr=libandroid_runtime.so+0xcf44 = Java
   System.exit/Runtime.exit 호출점** 확정. ApplicationExitInfo도 EXIT_SELF status=0.
6. 온라인/오프라인 동일 형상, 타은행앱(smcard/hana 디버그서명 빌드)·테스트앱 uninstall
   해도 동일 → 서버 판정도 apk 존재도 아닌 **로컬 경로**로 결론 수정.
7. kill 훅 혼입 변수: v4.6 kp_ksig가 타깃 uid의 모든 kill(...,9)을 0으로 바꿔 컬렉터의
   kill(self,9) 자기정리까지 막았었다(12s 정체·고아 양산 실측). v4.9에서 group-leader
   comm이 "Thread-*"인 fork 헬퍼는 원래 kill 허용하도록 축소 + ksig_dis 런타임 토글 추가.

### 현재 최유력 가설 (미확정)
- fault의 PC/FAR 미확정. 문맥상 faulting 스레드 = libea56(가드 네이티브)의 셀프스캔 본인 →
  "잔여 libea56 자폭(poison)이 크래시 핸들러에 흡수되는 것"이 최유력.
- 신규 가설: camow3 위장 스크립트가 /proc/self/maps 위장본을 만들 때 goldfish/emulation
  라인을 grep -v로 **삭제**한다 → 가드가 process_vm_readv 632구간 셀프스캔으로 실제
  메모리 배치와 위장 maps를 교차검증하면 "있어야 할 라인의 부재"가 탐지될 수 있다 →
  삭제 방식을 치환(sed, 라인 수 보존)으로 바꾸는 A/B를 다음 세션 과제로 등록.

### 닫은 가설 (소거 근거)
- 서버 판정 종료: 오프라인 동일 형상 (단, 유효 trace는 온라인 것 — 오프라인 캡처는
  pid 미설정으로 무효였고 형상 비교는 logcat/exit-info 기반)
- 타은행앱 apk 존재: uninstall 후 동일
- /proc/self/net/unix 실값(qemu 문자열 0), /proc/filesystems, hosts, cacerts-removed: 청결
- su 792경로: 전부 ENOENT

## 검토 요청 사항 (각 항목 순서대로 답변)

1. **t20_exit 프로브 해석 검증**: __arm64_sys_exit_group 래퍼의 %x0=pt_regs 저장소에서
   lr=+240(%x0), pc=+256(%x0)을 읽는 방식이 arm64 pt_regs 레이아웃(regs[31],sp@248,
   pc@256)에 정확한가? lr=libandroid_runtime+0xcf44를 "Java System.exit 호출점"으로
   해석하는 것의 강도와 한계(이 LR이 정확히 어떤 함수인지 특정하는 방법은?).
2. **fault PC 확정 전략**: arm64_notify_die 프로브가 0 이벤트였고 do_mem_abort는
   수요페이지 노이즈가 많다. signal_deliver(sig=11) 시각 ±수 ms의 do_mem_abort 시간상관
   외에, fault PC를 더 확실하게 잡는 커널 프로브 지점이 있는가? (5.15 android13-8 GKI,
   kallsyms에 do_mem_abort/el0_da(t)/do_translation_fault(t)/arm64_force_sig_fault 존재)
3. **fake maps 불일치 가설 평가**: process_vm_readv 632회 셀프스캔이 위장 maps와 실제
   메모리 배치의 교차검증이라는 가설의 개연성. 이 가설을 확인/부정하는 가장 빠른 실험은?
   (라이브러리는 frida 금지, ftrace/LKM/bind/rename만 사용 가능)
4. **kill 훅 축소(group-leader comm "Thread-*" 면제)의 리스크**: 이 휴리스틱이 가드가
   fork 자식 naming을 바꾸면 깨지는가? 더 견고한 판별 기준(예: current->tgid == 자기
   group_leader인지, /proc 구조, cred, 세션 등)이 있는가?
5. **실험 설계 리스크**: 위 결론 중 반증 가능성이 높거나 통제되지 않은 변수(부팅 경과,
   zygote 상태, 동시 실행 앱, GMS 트래픽 등)로 오결론 위험이 큰 것은 무엇인가?
6. **스킬/워크플로 개선**: 이 연구의 반복 워크플로(부팅복구→런→ftrace 캡처→분류→문서화)
   에서 자동화/검증으로 얻는 개선점 3가지 이내.

## 참고 파일 (읽어도 좋음)
- workspace/avd-camouflage/analysis/toss-rasp/FINDINGS.md (§23=19차, §24=20차)
- workspace/avd-camouflage/analysis/toss-rasp/session20/{NOTES.md,HANDOFF_session21.md}
- workspace/avd-camouflage/analysis/toss-rasp/session20/trace_on1.txt (signal_deliver/
  t20_exit 원본), maps_on1.txt (주소 매핑용), run2.trace (syscall 필터 캡처)
- workspace/avd-camouflage/lkm/hide_kmod.c (v4.9: ksig_dis, Thread-* 면제, midr cpu0-7)
- 스킬: ~/.agents/skills/avd-rasp-camouflage/{SKILL.md,scripts/boot_recover.sh,references/pitfalls.md}

출력은 한국어로, 각 질문 번호에 대해 근거와 함께 답하고, 마지막에 "수정 권고 Top3"를
우선순위로 정리해 주세요.
