I have verified the key claims against the raw traces and maps. I have enough to write the review. Let me compose the final answer.

---

# 토스 로컬 위장 19~20차 세션 검토 (ftrace RASP 탐지 채널)

브리프의 6개 질문을 트레이스·maps·LKM 소스로 직접 재검증한 결과다. 인용한 주소 산술은 `session20/trace_on1.txt`, `maps_on1.txt`, `trace_pf.txt`, `run2.trace`로 실측 확인했다.

## 1. t20_exit 프로브 해석 검증

**pt_regs 오프셋은 정확하다.** arm64 `struct pt_regs`는 `u64 regs[31]`(x0..x30, 0~240) → `u64 sp`(248) → `u64 pc`(256) → `pstate`(264) 순서이므로,
- `status=+0(%x0)` = 내부 pt_regs `regs[0]` = exit_group 인자 = 종료코드 ✓
- `lr=+240(%x0)` = `regs[30]` = x30 ✓
- `sp=+248(%x0)` = 248 ✓, `pc=+256(%x0)` = 256 ✓

`%x0`이 저장된 pt_regs 포인터라는 것도 LKM의 uname/getdents 래퍼 처리(`hide_kmod.c:271-274`, `601-607`)와 동일 패턴이라 일관된다. **읽는 방식 자체는 옳다.**

**단, "System.exit 확정"은 두 단계로 나눠 봐야 한다.**

(1) *세만틱*: 이 프로브에서 `pc`는 ELR(=svc 다음 명령, libc exit_group 스텁 복귀지점)이고 `lr`는 svc 시점의 x30(=스텁을 호출한 직전 프레임의 복귀주소)이다. bionic의 exit_group 스텁이 leaf(BL 없이 `svc`)라 x30이 보존되므로 lr→호출 모듈 해석은 타당하다. 실측 뒷받침: `trace_on1.txt:10040`의 토스(7256) 종료만 `lr=0x7861c12f44`(libandroid_runtime)인 반면, 같은 트레이스의 pm/cmd/셸 도구 종료(`8640/8629/8166`)는 **전부 pc·lr이 자기 libc 영역**이다. 즉 토스만 프레임워크가 직접 exit 스텁을 부른 형상 → **프레임워크(Java) 발단 종료라는 결론은 강하다.** 셧다운 훅(Thread-0/1 exit(93)) 관측까지 합치면 `System.exit→Runtime.exit→Shutdown→halt` 전 경로와 정합한다.

(2) *정확한 함수 특정*: **여기 오프셋 표기가 틀렸다.** `lr=0x7861c12f44 − 0x7861b4b000(라이브러리 로드 베이스) = 0xC7F44`이다. 브리프의 "+0xcf44"는 **r-x 세그먼트 시작(0x7861c06000) 기준 오프셋**이고(`0x...c12f44 − 0x...c06000 = 0xcf44`), r-x의 `p_offset=0xbb000`을 더해야 파일/vaddr 오프셋 **0xC7F44**가 나온다. pc도 마찬가지로 libc "+0x663f8"은 세그먼트 상대값이고 실제 파일 오프셋은 **0xA33F8**이다. 심볼 해석은 vaddr 기준 심볼테이블로 하므로, **0xcf44로 조회하면 0xbb000만큼 낮은 엉뚱한 함수에 착지한다.**

→ **정확한 함수 특정법**: 기기에서 `/system/lib64/libandroid_runtime.so`를 pull → `nm -D --defined-only`/`readelf -sW`에서 **0xC7F44를 포함하는 심볼**을 찾거나 `addr2line -f -e libandroid_runtime.so 0xc7f44`(정확히는 0xC7F44). 이 경로가 직접 exit_group 스텁을 부른 점(libc `exit()` atexit 경유가 아님)으로 보아 **`AndroidRuntime::exit` 혹은 `Runtime.nativeExit/halt0` 계열**일 가능성이 높다 — 라벨 "System.exit"는 *발단*으로는 맞되 *호출점 함수*로는 미해석 상태다.

## 2. fault PC 확정 전략

do_mem_abort 노이즈의 정체를 `trace_pf.txt`로 확인했다: `esr=0x92000047` = **EC=0x24(EL0 데이터 어보트), DFSC=0x07(L3 변환폴트), WnR=1(쓰기)**, far가 `0x77067000→0x77082000`으로 0x1000씩 순증, pc=libc(memset류). 즉 **디맨드-제로 페이지 채움**이라 do_mem_abort 진입 시점엔 "핸들될 폴트"와 "시그널될 폴트"를 구분할 수 없다. ESR EC/DFSC 필터만으로는 안 걸러진다(정상 폴트도 변환폴트라서).

**가장 확실한 지점 = `arm64_force_sig_fault`.** 이 함수는 폴트가 **핸들 불가로 확정되어 실제 시그널을 전달할 때만** 호출된다(디맨드 폴트는 여기 도달 안 함 → 노이즈 사실상 0). 시그니처 `void arm64_force_sig_fault(int signo, int code, unsigned long far, ...)` → `signo=%x0 code=%x1 far=%x2`를 그대로 뽑고 `signo==11`로 필터. PC는 인자에 없지만, 이 함수는 do_mem_abort 호출체인 안에서 **동일 CPU·수 µs 내** 호출되므로 **바로 앞의 do_mem_abort 이벤트(pc=+256(%x2) 보유)를 same-CPU 인접·동일 far로 매칭**하면 130k → 소수로 붕괴한다. 이게 signal_deliver ±5ms 시간상관보다 정확하다(signal_deliver는 전달 시점이라 폴트보다 늦음).

보조 필터: **RxCachedThreadS의 ACCERR(code=2)는 권한폴트(DFSC 0x0C–0x0F)** 이므로 do_mem_abort를 `DFSC∈{0xC..0xF}`로 거르면 변환폴트 노이즈와 즉시 분리된다(메인의 MAPERR=code1=변환폴트는 노이즈와 겹쳐 force_sig_fault 상관 필수).

**커널을 안 건드리는 최속 경로**: 컬렉터(NPTH/Bugsnag류)가 남기는 **네이티브 크래시 덤프**(앱 data/파일)와 `/data/tombstones`·`dumpsys dropbox`를 확인하면 컬렉터/디버거드가 이미 기록한 si_addr·PC·백트레이스를 직접 얻는다. EXIT_SELF라 툼스톤이 없을 수 있으나 컬렉터 자체 덤프는 남을 공산이 크다.

## 3. fake maps 불일치 가설 평가

**메커니즘상 결정적 반례가 있다: `process_vm_readv`(NR 270)는 잘못된 원격/로컬 주소에 대해 caller에게 SIGSEGV를 던지지 않는다 — `-EFAULT`를 반환할 뿐이다.** `run2.trace`에서 RxCachedThreadS-14451이 정확히 **632회 NR 270 + socket(198)·connect(203)** 를 도는 것은 확인했으나, 세 번의 SIGSEGV(메인 MAPERR, RxCached ACCERR×2)는 **vm_readv 시스템콜의 폴트가 아니라 스레드가 직접 포인터를 역참조하다 난 것**이다. 즉 "632 vm_readv 셀프스캔 → SIGSEGV"는 **시간적 인접일 뿐 인과가 아니다.** 이 사실은 오히려 **libea56 poison(오염된 포인터로의 직접 store) 가설을 지지**하고, "vm_readv가 위장 maps와 실배치를 교차검증하다 폴트"라는 서사를 약화시킨다.

가설 자체도 두 메커니즘을 혼동하고 있다:
- (a) **"있어야 할 라인의 부재" 탐지** — 가드가 독립적 기대목록(dlopen 핸들·섹션헤더·기대 soname 집합)을 갖고 대조해야 성립. 현재 근거로는 약함.
- (b) **정적 위장 maps의 staleness** — LKM이 maps를 유저랜드 정적 파일 `/dev/.q7zm4h`로 리다이렉트(`hide_kmod.c:344`)하므로, writer 캡처 시점 이후 ASLR/JIT/mmap 변동으로 위장본이 실제와 어긋날 수 있음. 그러나 이조차 vm_readv 경유로는 SIGSEGV를 못 만든다(EFAULT).

**delete→sed A/B는 (a)만 시험하고 (b)·poison은 통제하지 못한다** → 변화 없어도 "maps 무관"으로 오판할 위험. 

**가장 빠른 확인/부정 실험**:
1. **Q2에서 far를 확보**해 그 주소가 *실제 매핑 안(예: libea56 코드/데이터)* 인지 *위장 maps에만 존재하는 유령 범위*인지 대조한다. far가 실매핑 안이면 poison, 위장 전용 범위면 maps 가설. **Q2 한 방으로 Q3가 판정된다.**
2. 별도 A/B가 필요하면 delete→sed가 아니라 **"maps 리다이렉트 자체 OFF"(단일 변수)**로 돌려라 — exit 소멸 여부로 maps 관여를 먼저 이분한 뒤 delete/stale/substitute를 세분한다.

## 4. kill 훅 축소(group-leader comm "Thread-*" 면제)의 리스크

**깨진다 — 두 방향으로 취약하다.**

- **과소차단(면제 붕괴)**: 가드가 fork 자식의 comm을 rename(prctl `PR_SET_NAME`)하거나 부모명을 복사하면 `group_leader->comm`이 "Thread-*"가 아니게 되어(`hide_kmod.c:250-252`) 자식의 `kill(self,9)` 자기정리가 다시 0으로 위장 → 12s 정체·고아 재발. comm은 16바이트 절단이라 회피 표면도 넓다.
- **과대허용(현 코드의 구멍)**: 현재는 "Thread-* 리더면 **모든** kill을 원복"이다. 자식 target을 검사하지 않으므로 `kill(main_tgid, 9)`(자식이 메인을 죽이는 형태)도 그대로 통과한다 — 자기정리만 허용하려던 의도보다 넓다.

**더 견고한 판별(문자열 비의존)**:
1. **면제를 self-kill로 한정**: `ur->regs[0]`(kill 대상 pid)을 읽어 `== current->tgid`일 때만 원복. 자기정리는 정의상 self-kill이므로 이걸로 (b) 구멍이 닫힌다.
2. **프로세스 신원으로 판별**: 타깃 uid의 **메인 앱 tgid(=zygote가 직접 fork한 프로세스)를 최초 1회 기록**해 두고, *그 tgid의 self-kill만* 위장 대상으로 삼는다. 그 외 동일 uid의 tgid(=앱/헬퍼가 다시 fork한 중첩 자식)는 모두 허용. 구분자는 comm이 아니라 **`current->real_parent`가 zygote(앱) vs 앱/헬퍼(중첩 자식)** 다 — rename에 불변.
3. **근본 재검토**: 24-4가 "kill 훅은 조용한 exit의 근본원인이 아니다"로 결론냈으므로, 휴리스틱을 정교화하기보다 **`ksig_dis=1`(훅 OFF)을 기본값으로** 두는 것이 가장 덜 취약하다. 훅은 fault 통제가 끝난 뒤 필요시 재도입.

## 5. 실험 설계 리스크(오결론 위험이 큰 항목)

우선순위 순:
1. **"libea56 poison 최유력"을 FAR/PC 확정 전에 랭킹한 것.** 근거로 든 "pc=lr 저주소" 특징은 `trace_pf.txt:37`의 `pc=lr=0x70f83fd0`을 연상시키지만, 그 이벤트는 **`esr=0x92000047`(디맨드 쓰기폴트)** 라 poison이 아니다. poison 우선순위는 **미검증 가정**이며 far로 확정 전까지 "미확정" 유지가 옳다.
2. **생존시간 29s~240s+ 변동.** 이 분산에서 단일 런 A/B는 신뢰 불가 — 모든 결론은 **동일 부트 N런 분포**로 재확인해야 한다.
3. **서버 게이트 배제의 강도 과대평가.** "오프라인 동일 형상"은 오프라인 trace 무효(pid 미설정) 때문에 실제로는 **logcat/exit-info 형상 비교뿐**이다. 종료 직전 connect() 버스트가 여전히 존재하므로, 서버 배제는 **중간 신뢰**이지 확정이 아니다.
4. **런 간 구성 혼합.** run1/run2는 v4.6 kill-spoof(12s 고아 정체) 하에서, on1은 v4.9에서 캡처됐다. "공통 형상"이 **LKM 구성이 다른 런을 섞고** 있다 — 런마다 버전·토글 태깅 필요.
5. **미통제 환경 변수**: 부팅 경과·zygote 웜 상태·GMS 트래픽·동시 실행 앱. 특히 부팅 경과는 생존 레이스와 상관 가능성이 있어 A/B의 교란 요인.

## 6. 스킬/워크플로 개선 (3가지)

1. **fault-주소 자동 해석기**: ftrace(signal_deliver + do_mem_abort/arm64_force_sig_fault) + 런 시작 시 저장한 `/proc/PID/maps`를 입력받아 모든 pc/lr/far를 **올바른 로드베이스 기준 file-offset**으로 모듈 매핑하고 signal_deliver↔fault를 CPU+타임스탬프로 자동 상관시켜 표로 출력. **Q1의 0xcf44/0xc7f44 수동 산술 오류 계열을 원천 제거**한다.
2. **멱등 boot_recover + 사후조건 assertion + 가드레일**: 복구 후 (egl=adreno / qemu누수=0 / 프로브 등록 / 인스턴스 존재)를 자동 검증하고, "절대 반복 금지" 목록(kprobe_events clear, `setenforce 1`, 구동 중 rmmod)을 **스크립트가 거부**하도록 강제.
3. **N런 생존 하네스**: 동일 부트에서 환경 통제(타앱 force-stop, writer 1개, airplane 파라미터화)로 N런을 돌려 **생존시간 분포 + exit-info 분류(EXIT_SELF/CRASH/kill)를 자동 집계**하고 런마다 LKM 버전·토글을 태깅. Q5의 레이스 분산·구성 혼합 문제를 구조적으로 해소.

---

## 수정 권고 Top 3

1. **fault FAR/PC 확정 파이프라인부터 돌려라(최우선, Q2+Q3 동시 해결).** `arm64_force_sig_fault`(signo/code/far) 프로브를 추가하고 동일-CPU 인접 do_mem_abort(pc=+256(%x2))와 매칭. 확보한 far를 *실매핑 vs 위장 전용 범위*에 대조하면 **poison이냐 maps냐가 한 실험으로 판정**된다. `process_vm_readv≠SIGSEGV`이므로 vm_readv 교차검증 가설은 far 확정 전까지 순위를 내리고 poison을 "미확정 최유력"으로만 유지.

2. **kill 훅을 comm 문자열에서 프로세스 신원으로 교체(Q4).** ① 면제를 `target pid == current->tgid`(self-kill)로 한정해 현 과대허용 구멍을 닫고, ② 위장 대상을 "zygote가 직접 fork한 메인 tgid"로 고정(`real_parent` 기반). rename에 불변. 24-4 결론상 당분간 **`ksig_dis=1` 기본화**가 가장 안전.

3. **주소 오프셋 관례와 A/B 설계를 바로잡아라(Q1+Q3+Q5).** 모든 pc/lr/far는 **로드베이스 기준(예: libandroid_runtime +0xC7F44, libc +0xA33F8)** 으로 표기·해석하고 심볼은 그 값으로 조회. maps 가설은 delete→sed가 아니라 **"maps redirect OFF" 단일변수 A/B**로 이분하고, 모든 결론은 **동일 부트 N런 분포**로 재검증(단일 런 인용 금지, 런별 LKM 버전 태깅).
