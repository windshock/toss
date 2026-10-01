# 증상 → 원인 → 해결 트러블슈팅

실측으로 겪은 것들만 정리. 앱이 죽으면 **먼저 환경 문제인지 판정 자기파괴인지 구분**:
SIGBUS 0x410xx 패밀리 = 판정 자기파괴(detection-channels.md로), 그 외 = 아래 표.

| 증상 | 원인 | 해결 |
|---|---|---|
| **zygote64가 167%+ CPU 스피닝, 앱 탭하면 전부 멈춤, 좀비 누적** | frida spawn 후 러너 비정상 종료 → frida-server가 **zygote를 ptrace한 채 방치** (메인 스레드 ptrace_stop) | frida-server kill(`kill -9 <frida-server pid>`). 트레이서가 죽으면 zygote도 재시작되어 시스템이 깨끗하게 복구됨. LKM·프롭·writer는 유지됨 |
| `Abort message: couldn't find an OpenGL ES implementation` | ro.hardware.egl이 adreno 등으로 바뀌어 EGL 로더가 GL 라이브러리 못 찾음 | egl은 **기본값 emulation 유지**가 정답. §2.20 확정 트리거에 ro.hardware.egl은 없음 — 시차 위장 같은 편법은 다른 앱 GL 초기화를 깨는 레이스만 만든다 |
| 앱 하나 재시작할 때 다른 앱이 갑자기 죽음 | eglflip 류 시차 위장이 뒤집는 동안 다른 앱이 GL 초기화 | 위와 동일 — eglflip 폐기 |
|---|---|---|
| SEGV_ACCERR, libsigchain에서 크래시, 메인 스레드 | 위장 파일(/dev/.m 등)이 0바이트 — mmap 후 접근 | camow3.sh의 keep-last-good + 시드 확인. `wc -c /dev/.m` |
| `Abort message: couldn't find an OpenGL ES implementation` | ro.hardware.egl을 adreno로 바꿔서 EGL 로더가 GL 라이브러리 못 찾음 | ~~eglflip 시차 위장~~ **폐기** (위 행과 동일 결론) — egl은 emulation 유지 |
| 앱이 frida 없이도 수 초 내 SIGBUS 0x410xx | 환경 위장 누수 — detection-channels.md 표 전수 점검 | ftrace로 사망 직전 openat 시퀀스 캡처(아래) |
| frida attach 시 `Failed to attach: process not found` | AhnLab 가드 서브프로세스가 메인을 이미 ptrace (커널 트레이서 1개 한정) | spawn 방식만 가능. 살아있는 프로세스엔 못 붙음 |
| frida 스크립트의 동기 로그만 찍히고 setTimeout/Java.perform 콜백 무시 | CLI REPL이 파이프 stdin에서 메시지 펌프 블록 | python 바인딩 러너(scripts/frida_spawn.py) 사용 |
| frida spawn 직후 `< /dev/null` 세션 종료로 앱만 남음 | EOF로 CLI 즉시 종료 | 동일하게 러너 사용 |
| seccomp 필터가 "설치됐는데" 안 먹음 | seccomp는 **스레드 단위 상속** — 스크립트 스레드에만 깔림 | 메인 스레드(scheduleOnMainThread) + pthread_create 호출자 전부에 설치 |
| libc kill 훅이 발화 안 하는데 프로세스가 SIGKILL로 죽음 | 엔진이 libc 우회 직접 svc syscall 사용 (kprobe로 확인됨) | seccomp BPF(kill/tgkill/pidfd_send_signal sig 9/6/7/15/11 → EPERM). 단 본 워크플로는 방어 대신 근거 제거가 원칙 |
| ftrace kprobe 문자열이 `fname="ȶlq"` 같은 쓰레기 | 중첩 역참조 누락 | `fname=+0(+8(%x0)):string` — `+8(%x0):string`은 포인터 바이트를 문자로 찍음 |
| kprobe 재등록 `Device or resource busy` | 이벤트 enable 상태 | `echo 0 > .../enable` 후 `echo "-:kprobes/<이름>" > kprobe_events` |
| tgid 필터가 죽은 pid를 잡거나 초반 이벤트 누락 | pid 랩어라운드 + 필터 설정 레이스 | `frida_spawn.py <script> <sec> <resume_delay=3>` — spawn~resume 사이에 필터 세팅 |
| ftrace trace에 `sh`/`pidof`/`cat` 행 섞임 | pid 재사용으로 필터가 셸에도 적용 | dump 후 앱 스레드명/tid 범위로 후처리 필터 |
| LKM 빌드 "성공"인데 .ko가 옛날 것 | `make 2>&1 \| tail` 파이프가 종료코드 마스킹 | `set -e` + 종료코드 확인, timestamp 확인 |
| C 주석 안 `goldfish*/qemu*` 표기 | `*/`가 주석 조기 종료 → 연쇄 파싱 에러 | 주석 내 `*/` 시퀀스 금지 |
| resetprop 루프 삭제 실패 | getprop 출력 파싱에 `]`/CR 잔여 | 이름 목록을 명시적으로 나열해 개별 --delete |
| screencap 0바이트 / input tap 무반응 | 화면 꺼짐 | `input keyevent KEYCODE_WAKEUP` 먼저 |
| writable 오버레이 소실(위장 전부 원복) | pkill 등 비정상 에뮬 종료 | `adb emu kill`만 사용 |
| resetprop 값 소실 | 런타임 전용 — 재부팅 시 리셋 | props-apply.sh 재실행 |
| am start "does not exist" | 콜드부팅 직후 캐시 미완 | 60초 대기 후 재시도 |
| **호스트 dylib 교체 후 부팅이 전부 adb 불가** ("Showing crashdialog" in log) | dylib 크래시 1회 후 **crash-report 다이얼로그가 에뮬 메인을 블록** — dylib 불량으로 오행하지 말 것(2회 오판 실측) | `rm -rf /tmp/android-1004276/emu-crash-36.5.1.db` + `pkill -9 -f qemu-system; pkill -9 -f crashpad_handler` + `rm -f ~/.android/avd/<avd>.avd/*.lock` 후 재기동 |
| "Running multiple emulators with the same AVD" FATAL | 이전 실패 부팅의 qemu/러너가 잠금 보유 | `pkill -9 -f qemu-system` 후 lock 삭제 (`hardware-qemu.ini.lock`, `multiinstance.lock`) |
| libgfxstream_backend 교체 직후 부팅 중 gfxstream init 크래시 | 패치 오프셋/인코딩 오류 (예: adrp imm 실수) | `scripts/patch_dylib_gl_identity.py` 사용 — 원본 바이트 검증 후 패치. 수동 패치 시 부팅 로그 "Initializing gfxstream backend" 이후 정지 = 패치 불량 신호 |
| GL_VERSION "Metal - 88.1" 제거 시도 → gfxstream 초기화 크래시 | buildStrings version 조립부는 선형 disasm과 다른 분기 구조 (2회 실측) | **손대지 말 것** — vendor/renderer만 패치(scripts/patch_dylib_gl_identity.py) |
| ftrace kprobe 행의 comm이 전부 `<...>` | kprobe 이벤트는 comm을 기록하지 않음 | 툼스톤의 `tid:` 목록으로 후필터. **fork한 가드 자식은 툼스톤에 없다** — pid 필터 없이 사망 시간창으로 봐야 함 (토스 libea56 실측) |
| ftrace에 /dev 위장 파일 10개가 1ms 내 연속 open — "가드가 브루트포스!" | **camow3의 chmod 일괄 명령** (셸 서브프로세스라 pid가 매번 다름) | `.tmp` 접미 패턴으로 camow3 구별. 오판 사례: 탐지 채널로 착각해 파일명을 전부 난수화했음(해롭진 않으나 추측성 대응이었음) |
| LKM target_uids에 uid 추가 | rmmod/insmod 불필요 — sysfs가 0644 런타임 변경 가능 | `adb shell "echo 10179,10181,10175 > /sys/module/hide_kmod/parameters/target_uids"` |
| 원본 앱이 2코어로 보임(sched_getaffinity/sysconf//sys 열거) | **경로 위장(LKM) 불가 영역** — readdir 결과와 syscall 반환값은 커널 데이터 | AVD config에 `hw.cpu.ncore = 8` (실코어 확장; camow3가 cpuinfo도 8블록 생성) |
| 에뮬 브랜드 패키지가 부활해 있음 | 이전 세션의 `cmd package install-existing` 복원 잔여 | `pm list packages \| grep -iE 'emulator\|goldfish'` 재확인 → `pm uninstall --user 0` |
| **stop;start 후 adb root가 풀리고 props가 리셋됨** | 프레임워크 재시작이 adbd root와 ro. 런타임 prop을 되돌리고 init.svc.*(qemu/goldfish/ranchu 53종)를 재생성 | 재적용: `adb root` → `setenforce 0` → props-apply → `resetprop ro.hardware.vulkan qcom; resetprop ro.hardware.egl adreno` → svc prop 삭제 → camow3 기동 (`scripts/vendor_bind_setup.sh props`가 전부 처리) |
| **SF 크래시 루프 "couldn't find an OpenGL ES implementation"인데 egl 프롭이 정상** | bind 사본 루트의 NEEDED 라이브러리(libandroidemu.so 등) 소실 — 재부팅 직전 cp가 userdata 반영 전에 emu kill되면 사라짐 | logcat의 `vndksupport: Could not load ... library "X" not found` 라인으로 확인 후 파일 재생성+chcon. SF는 5초마다 재시도하므로 파일만 고치면 자동 복구 |
| **writer(nohup)가 adb shell 복귀와 함께 죽음** | bare `nohup sh ... &`는 adb 셸 종료 레이스로 사망 | `adb shell 'sh -c "nohup sh /path >/dev/null 2>&1 &"'` 래퍼로 기동 |
| **insmod EPERM 직후 deploy.sh 중단** | deploy.sh가 insmod를 setenforce 0보다 먼저 실행 (부팅 직후 Enforcing) | `adb root; setenforce 0` 선행 후 deploy.sh 재실행 (또는 deploy.sh 수정) |
| **smaps 가짜에 파서가 죽는 앱 (토스)** | 라인 필터가 VMA 헤더만 지워 Size:/VmFlags: 고아 블록 잔여 — 구조 변형 자체가 판정 입력 | camow3 v4.2 블록 단위 awk 필터 사용 (헤더 매치 시 헤더+속성 전체 스킵). 검증: headers==Size: 개수 |
| **GL lib 리터럴/soname 패치 후 Chromium NULL 크래시 또는 SF "no suitable EGLConfig" 루프** | 듀얼 이름 세트의 해석 원리는 soname 매칭 — 파일명 정합화로 이중 사본(상태 2벌)·soname 불일치가 생기면 시스템 급사 | **GL 트리오 리터럴/soname 패치 금지** — 3차 세션 원본(듀얼 이름+원본 soname) 유지 |
| **토스 생존 중 100% CPU 지속 — "가드가 미쳐 돈다" 오판** | 가드의 **연속 재검사 스톰**(14차 실측: 40s에 203만 getname, 초당 5만 회 lib 디렉터 열거/fd readlink) — 정상 상시 모니터링이며 poison 호출 0회 | 죽이지 말 것. 프로세스는 이 상태로 13분+ 생존. 루프 중단은 목표가 아님 |
| **탭하면 토스가 3s 내 사망 (온라인)** | 탭 → 본 flow 진행 → **서버 핸드셰이크 → 기기 거부**(오프라인에선 탭해도 생존 — 14차 A/B 확정) | 서버 게이트 = 경계 밖. 로컬 위장 영역 아님. 증상만 기록 |
| **push 후 재부팅했더니 파일이 구버전** | push 데이터가 페이지캐시에만 있고 emu kill로 라이트백 유실 (md5는 캐시 히트로 새값 표시 — 신용 금지) | **push 후 `adb shell sync` 필수**, 그리고 md5 재확인 후 재기동 |
| **구동 중 모듈 rmmod가 게스트 패닉** | 활성 kretprobe 인스턴스 잔존 상태의 언로드 | rmmod 금지 — 교체는 재부팅 후 insmod로 |
| **uname 위장이 안 잡히는 래퍼 인자** | __arm64_sys_* 래퍼의 x0 = pt_regs* (inner regs[0]이 실제 인자) | `((pt_regs*)regs->regs[0])->regs[0]` 패턴 사용 (hide_kmod v4.4 uname_probe 참조) |
| **push 직후 "device offline"** | 푸시가 오프라인으로 끊기면 .ko가 잘려있고, 그것의 insmod가 커널 패닉 → **게스트 재부팅**(adb offline의 상당수는 웨지가 아니라 이것) | kill-server/start-server → boot_completed 대기 → **insmod 전에 .ko 크기를 호스트와 대조**(불일치면 재푸시). "Invalid argument" insmod = 잘린 파일 |
| **파일을 rename했는데 maps/phdr에 구 이름이 남음** | **zygote가 부팅 중 로드한 lib 매핑을 fork로 상속**(open 이벤트 0건인데 maps에 존재 — ftrace로 구별) | rename 후 반드시 `adb shell "stop; start"` — 새 zygote가 bind 사본에서 로드 |
| **ro.hardware.egl 스왑 후 앱 FATAL 크래시 루프**("couldn't find an OpenGL ES implementation") | init이 ro. prop을 재로드해 되돌림 → 파일명(_adreno)과 prop(emulation) 불일치 창 발생 | EGL 디렉터리에 **이중 이름 세트**(emulation+adreno 병존) — 어느 값이든 로드되고 불일치 창에도 FATAL 대신 열화만 (`scripts/vendor_bind_setup.sh build`) |
| **EGL 드라이버 사본이 로드 자체를 실패** | libEGL의 DT_NEEDED `libGoldfishProfiler.so`가 bind 사본(이름 변경됨)에 없음 | 사본에서 같이 rename + libEGL 사본의 DT_NEEDED 문자열을 동일 길이 패치 (`vendor_bind_setup.sh build`가 처리) |
| **camow3 writer 생존을 /dev/.q7zm4h mtime으로 확인** | maps 갱신은 **대상 앱이 살아있을 때만** 일어남 — 앱 없으면 mtime 불변이 정상 | `/dev/.ew471v`(misc) mtime으로 확인 — 매 루프 무조건 갱신 |

## 사망 직전 시퀀스 캡처 (누수 채널 특정 표준 절차)

```bash
adb shell '
T=/sys/kernel/tracing
echo 0 > $T/tracing_on; echo > $T/trace
echo 65536 > $T/buffer_size_kb
echo "p:oat __arm64_sys_openat fname=+0(+8(%x0)):string" > $T/kprobe_events
echo "p:fac __arm64_sys_faccessat fname=+0(+8(%x0)):string" >> $T/kprobe_events
am force-stop <pkg>
am start -n <pkg>/<activity> >/dev/null 2>&1
P=""; for i in $(seq 200); do P=$(pidof <pkg> | cut -d" " -f1); [ -n "$P" ] && break; sleep 0.02; done
echo "common_tgid==$P" > $T/events/kprobes/oat/filter
echo "common_tgid==$P" > $T/events/kprobes/fac/filter
echo 1 > $T/events/kprobes/oat/enable; echo 1 > $T/events/kprobes/fac/enable
echo 1 > $T/tracing_on
'
sleep 25
adb shell "echo 0 > /sys/kernel/tracing/tracing_on"
adb shell "cat /sys/kernel/tracing/trace" > /tmp/death_trace.txt
# 앱 스레드 행만 골라 마지막 이벤트 = 판정 직전 읽기 = 누수 채널
```

참고: SIGBUS 자기파괴가 아니라 환경 크래시(SEGV_ACCERR, abort message)면
위장 자체가 앱을 깬 것이므로 pitfalls 표에서 원인 제거 후 재시도.

---

## 19차 신규 함정 (2026-09-22) — EGL 레지레션·무한 프로브 재발

### 증상: RenderThread SIGABRT "Failed to create context, error = EGL_NOT_INITIALIZED" (기동 3~8s)
| 항목 | 내용 |
|---|---|
| 1차 원인 | hide_kmod v4.6+의 `emulation` 경로 deny/dirent 은닉 × bind `_adreno` 사본 **내부 dlopen 키(libGLES*_emulation)** → 앱 전용 즉사(launcher 등 비타깃 uid는 정상) |
| 픽스 | `scripts/patch_bind_egl_literals.py` — 사본 3종의 모든 `emulation` 리터럴(8곳: dlopen키·SONAME·로그태그)을 `adreno\0\0\0` 치환. SONAME이 같이 바뀌어 로더가 로드한 lib와 soname dedup으로 수렴 |
| 2차 원인 | **ro.hardware.egl이 부트마다 `emulation`으로 리셋**. Android 13 EGL 로더는 readdir 없이 고정명(emulation→platform→generic)만 시도(트레이스 실측) → emulation은 deny되어 드라이버 0개 → "couldn't find an OpenGL ES implementation, make sure you set ro.hardware.egl" fatal |
| 픽스 | 부팅마다 `resetprop ro.hardware.egl adreno` (+ `ro.hardware.vulkan default`) |
| 교훈 | "egl=adreno 금지"(2026-09-19 결론)는 리터럴 패치 이전 세계관. 현재는 **egl=adreno + 리터럴 패치 세트**가 정답. 부분 적용(하나만)하면 두 증상 중 하나로 즉사 |

### 증상: 메인 스레드 CPU 100% 스핀 → 수분 후 SystemJobService ANR
| 항목 | 내용 |
|---|---|
| 관측 | `/sys/devices/system/cpu/cpu38747677/regs/identification/midr_el1` 류 82만 distinct (17차 "cpu147M"과 동일 정체) |
| 원인 | v4.5 MIDR redirect의 wildcard 매치(`cpu<임의수>` 전부)가 코어수 프로브(cpuN++…ENOENT 대기)의 ENOENT를 봉쇄 — **normalize_cpu_path(17차)와 동일 클래스의 재발** |
| 픽스 | **hide_kmod v4.7** — midr redirect를 cpu0-7로 한정, cpu8+는 실경로 ENOENT. 검증: uid10175에서 cpu3=위장값, cpu8=ENOENT |
| 교훈 | "위장 redirect는 **종료 조건(ENOENT)을 살려야** 한다" — 열거형 프로브(코어수 등)에 wildcard 위장은 무한루프를 만든다 |

### 운영
- ftrace **instance는 재부팅마다 소멸** (kprobe 정의는 남지만 instance/enable/pid리스트는 날아감) — 캡처 스크립트는 mkdir부터 하도록 (`scripts/toss_child_scan.sh` 헤더 참조).
- set_event_pid를 모니터 루프에서 **재기록하면 fork 자식이 축출**된다 — append-only로.
- 스톰 런에서는 버퍼가 수십 초 만에 랩 — **60초 주기 스냅샷** 덤프로 보존.
- 부하 급증 시(스톰+프로브 중첩) system_server가 워치독 사망할 수 있음 — 생존 판정 런에선
  프로브 최소화(p19_gn만) 권장. do_filp_open 입출력쌍은 비싸다.
- emulator 수동 기동: `cd $ANDROID_SDK_ROOT/emulator && ./emulator -avd camo33 -no-snapshot`
  (cwd가 틀리면 "Cannot find AVD system path"/qemu PANIC. ANDROID_SDK_ROOT 필수).
- 성공한 su 10175 파일 뷰로 LKM 필터 동작 확인 가능: cpu3 midr=위장값 / cpu8=ENOENT /
  cpuinfo=8코어 / egl 목록에 emulation 부재.

## 주소 해석·프로브 교훈 (20차 외부검토 반영)

- ftrace kprobe로 pt_regs를 읽을 때 pc/lr/sp 오프셋은 arm64 표준: regs[0..30]=0..240,
  sp=248, pc=256. `lr=+240(%x0)` 방식은 __arm64_sys_* 래퍼에서 유효.
- **주소→모듈 오프셋은 로드베이스 기준**: maps의 start를 빼는 값이 곧 심볼 조회값(vaddr).
  maps 행의 file offset을 더하면 ELF 파일 오프셋 — 둘을 혼동하면 엉뚱한 심볼에 착지한다
  (실측: libandroid_runtime lr → vaddr+0xcf44 = file+0xc7f44). 자동화:
  `scripts/toss_addr_resolve.py <maps> --trace <trace> [--proc PID]` — sig=11↔do_mem_abort
  시간상관 + pc/lr/far 일괄 매핑.
- **ART 암시적 null 체크**: AOT/JIT Java 코드의 null 역참조는 정상적으로 SIGSEGV를 내고
  ART fault 핸들러가 NPE로 변환한다. 앱이 SIGSEGV 컬렉터(NPTH/Bugsnag류)를 등록해 두면
  이 fault를 네이티브 크래시로 오수집해 종료할 수 있다 — "SIGSEGV=네이티브 크래시" 단정 금지.
  fault pc가 boot-*.oat/[anon:dalvik-*]면 Java 계층이다.
- arm64_notify_die는 유저 페이지폴트 경로에 안 타나는 커널이 있다(실측 0 이벤트).
  유저 fault는 `do_mem_abort far=%x0 esr=%x1 pc=+256(%x2) lr=+240(%x2)`로 잡되 수요페이지
  노이즈가 크다 — signal_deliver와 시간상관(±수백 µs, same tid)으로 추려라.
- process_vm_readv는 잘못된 주소에 EFAULT만 반환한다 — SIGSEGV와 무관. 셀프스캔 스레드의
  SIGSEGV는 vm_readv 자체가 아니라 인접한 직접 역참조다.
- tgkill sig=33(SIGSETXID)/32는 bionic 스레드 생성의 정상 시그널이다.
- dumpsys activity exit-info: EXIT_SELF/CRASH/시그널 구분의 1차 증거. Bugsnag
  cache/bugsnag/last-run-info의 crashed 값은 시점에 따라 달라진다(마지막 런 기준).

- fault 분석은 pc/far만으로 단정 금지 — **sp까지 반드시 찍는다**(`sp=+248(%x2)`).
  실측: far=0x0+pc=OAT코드여도 sp가 정상이면 레지스터 오염+직행 점프다(24-C).
- OAT 심볼화: 기기 내장 `oatdump --oat-file=<path> --addr2instr=<exec-relative offset>`.
  오프셋 변환: maps vaddr오프셋 ≠ oatdump 입력. file_offset = maps세그먼트 p_offset +
  vaddr오프셋; oatdump 입력 = file_offset - (oatdump 헤더의 EXECUTABLE OFFSET).

- fault의 lr가 코드가 아닌 곳(OatQuickMethodHeader 등 메타데이터)을 가리키면 그 값은
  복귀주소가 아니라 **크래프트된 컨텍스트(sigframe/ucontext/jmp_buf)의 필드**다 — bl/blr은
  임의 값을 lr로 만들 수 없다. 이 경우 "엔트리포인트 오염" 단독 가설은 lr을 설명 못 함.
- kprobe fetch 인자 16개 제한은 tracefs 문자열 인터페이스 한계 — 전체 pt_regs는 LKM
  핸들러에서 `task_pt_regs(current)`로 일괄 덤프(per-CPU 링버퍼 권장, kretprobe는 시그널
  상태 반영 후라 fault 원본 수집에 부적합).
- 동일 부트 연속 런의 sp/x29 바이트 일치는 zygote 상속으로도 설명된다 — 컨텍스트 합성
  증거는 lr 이상값으로만 확정할 것(ASLR=2여도 동일 부트 내 스택 레이아웃은 결정론적).

- fault 원인 레지스터 분석이 필요하면 LKM kprobe(dump 기능 v4.10 kp_fault 참조:
  do_mem_abort에서 uid 대상 + far=0 + EC=0x24만 전체 pt_regs를 dmesg에 상한 덤프) +
  raw_syscalls sys_enter filter id==139(rt_sigreturn) 상관이 가장 빠르다.
  fault 전 syscall이 rt_sigreturn이면 시그널 복귀 직후 상태 오염(또는 그로 인한 표면화)이다.

## 22차 신규 함정/교훈 (2026-09-22 오후 — 토스 크래프트 해부)

### 1. OAT 주소 해석: 모듈 offset ≠ 파일 offset
faultdump/SFI의 `boot-framework.oat+0x19d534`는 **매핑 base 대비 vaddr**. 실제 파일
오프셋은 rx LOAD(file offset 0x1a8000) 기준 보정해야: `file_off = 0x1a8000 + 0x19d534`.
이 변환을 빼먹으면 R 세그먼트(데이터)를 읽고 엉뚱한 명령 해석을 한다 — 21차의
"ldr wzr,[x16]" 오판이 정확히 이 원인(실제 명령은 `ldr w0,[x1]`, x1=0).
ELF 프로그램 헤더(`llvm-readelf -l`)로 세그먼트 확인 후 디스어셈블할 것.

### 2. kprobe에서 유저 메모리 절대 직접 읽지 말 것 — "커널에 이미 복사된 지점"을 잡아라
유저 포인터를 kprobe 핸들러에서 읽으면 BRK 문맥 oops → panic_on_oops=1에서 게스트
즉사(24-I-2 실측). ACK 5.15의 `restore_sigframe`은 `__get_user_error`로 pt_regs에
유저 시그프레임을 **복사한 뒤** `parse_user_sigframe`을 호출한다 — 이 지점을 kprobe하면
`task_pt_regs()`를 읽기만으로 복원 pc/x16/lr 전체를 얻는다(22차 SFO, v4.15b).
마찬가지로 `setup_rt_frame`은 ksig(커널 구조체)에서 핸들러/si_addr을 준다(SFI11).
유저 데이터가 필요하면 "커널 내부 복사본이 존재하는 순간"을 소스(ack-kernel)에서 찾을 것.
`struct ksignal`은 **ka가 offset 0**(sa_handler@ksig+0, si_addr@ksig+0x30) — info@0로
계산하면 쓰레기값(0x4000c09류)이 로깅된다(v4.15b→15c 정정).

### 3. raw_syscalls sys_enter 필터 해제 = 게스트 붕괴
전 syscall ftrace는 초당 수십만 이벤트(3.6억 라인 관측)로 게스트 타이밍을 완전히
바꾸고 adb 응답을 수 분 지연시킨다. 좁은 id 필터(reboot=142, rt_sigreturn=139,
mprotect=226, process_vm_readv=270, prctl=167 등)만 허용.

### 4. 원본 토스에서 frida agent는 전면 무력화된다
spawn 모드에서 스크립트 로드 직후 동기 send 1회만 생존, 이후 native
Interceptor(openat)·Java.perform 콜백 전부 0회 — **파일 부수효과 마킹**(.probe_* 파일,
session22/frida/probe_health.js)으로 채널과 무관하게 검증했다. "frida spawn 생존"
관찰은 프로세스 생존일 뿐 계측 가능이 아님. 이 앱의 신뢰 관측은 커널 kprobe뿐.

### 5. 가드의 SIGSEGV 핸들러 등록은 커널에 보이지 않는다
토스 pid의 sigaction(11) syscall이 do_sigaction에 전혀 나타나지 않음(SIGACT11
실측) — libsigchain 체인 내부(유저랜드 테이블) 등록. "raw syscall 회피"가 아니라
"syscall 불필요". 핸들러 주소는 setup_rt_frame kprobe(전달 시점 ksig)에서 얻는다.

### 6. fault-time 포렌식은 컬렉션 창(~12s) 안에
faultdump 등장을 dmesg 폴링으로 감지 → 그 창에서 /proc/<pid>/maps, /proc/<pid>/mem
덤프(비-ptrace). session22/toss_fault_resolve.sh, oat_patch_check.sh 참조.

## 23차 신규 함정/교훈 (2026-09-22 저녁 — codex 검토 반영)

### 7. 매핑 pgoff 누락 = 심볼 오판 (2회 연속 실사고)
resolver가 `addr - map_start`를 심볼 offset으로 쓰면 안 된다. rx 매핑의 pgoff가
0이 아닌 경우(libart rx pgoff=0x200000, OAT rx pgoff=0x1a8000) **ELF vaddr =
(addr - map_start) + pgoff**로 보정해야 addr2line이 맞는 심볼을 낸다. 이 실수로
"ExecuteSwitchImplCpp 복귀" 오판(실제 art_quick_throw_null_pointer_exception_from_
signal)이 발생했다. toss_fault_resolve.sh는 정정 완료(ELFvaddr+ 표기).

### 8. lr이 "크래프트"로 보여도 먼저 코드 생성물을 의심하라
ART quick 코드는 `adr x30, +N`(read-barrier 링크), `stp x23,x30,[sp,#0x20]` 등으로
x30을 스크래치처럼 쓴다. fault 시 lr이 pc±N의 이상한 값이면 OAT 디스어셈블에서
`adr x30`을 먼저 찾아라 — 22차의 "lr=entry-4는 어떤 bl도 못 만든다" 논리는
adr 기반 코드 생성물을 놓쳤던 것.

### 9. OAT/앱 코드 영역에 uprobe 금지 (토스 실측)
isRestricted(0x345528)에 ftrace uprobe를 박자 이벤트 0건 + fault 시그니처 자체가
변형(0x345538, si_addr=heap)으로 이동 — 코드 무결성 붕괴가 가드/런타임 경로를
교란한다. 유저 코드 관찰은 fault 창 /proc/mem 포렌식(비-ptrace)으로.

### 10. "커널이 쓴 값 vs sigreturn이 읽은 값"의 차이는 표준 ART 변환일 수 있다
SFI11(setup_rt_frame, 커널 기록 원본)과 SFO(parse_user_sigframe, 복원값)의 차이를
곧바로 "제3자 크래프트"로 해석하지 말 것 — ART NullPointerHandler::Action가
ucontext를 NPE 트램폴린으로 **표준 변경**한다(pc=NPE stub, x30=si_addr, sp-=8).
far=0이면 lr=0이 되는 것이 지문. 커널 원본과 복원값의 차이 자체는 정상 동작 증거.

## 24차 신규 함정/교훈 (2026-09-22 밤 — claude 검토 반영)

### 11. 커널 콘솔 캡처(/tmp/emu_kernel.log)는 부트 배너 단위로 구분해서 읽을 것
-append 콘솔 파일에는 모든 부트의 로그가 누적된다. "재부팅 원인"을 말단 panic에서
-읽을 때 **그 panic이 어느 부트의 것인지 배너(Linux version) 위치로 확인**하지 않으면
-과거 부트의 계측 사고(예: rsig_pre BRK 패닉)를 현재 사건으로 오독한다 — 23차가 이
-실수로 "가드가 커널을 패닉시킨다"는 오해를 만들고 24차 검토로 정정.

### 12. kprobe에서 유저 메모리가 꼭 필요하면 copy_from_user_nofault
21차 rsig BRK-oops로 "kprobe 내 유저접근 전면 금지"로 일반화했으나,
copy_from_user_nofault는 exception-table로 안전 실패를 보장하는 별도 API다.
kp_fault의 caller LR 캡처([sp+0x28])에 사용해 oops 없이 즉시 캡처 성공(24차 v4.16).
fault 시점 스택은 컬렉션이 덮어쓰기 전의 값을 커널에서 바로 읽는 것이 유일.

### 13. 토스의 frida 무력화는 "주입 시점" 조건부
spawn(zygote specialization 전 주입) → 가드가 agent 무력화(콜백 0, 파일마킹 0).
**attach(기동 ~1.5s) → 생존**(Java.perform/System.exit 훅/파일 마킹 전부 동작).
원본 토스 정밀 개입은 attach 모드로. 다만 am start 직후 즉사하는 런이 간헐 —
pid 확보 재시도 루프 필수.

### 14. "Timer-0"라는 comm으로 소속 판정 금지
java.util.Timer의 기본 스레드명은 시스템 프로세스에도 흔하다. PID가 부팅 초기부터
존재했는지(콘솔/proc 타임라인) 확인 전에 "가드 스레드"로 귀속하지 말 것.
x19=0x4000c00 같은 값도 SA_RESTORER(0x04000000) 플래그 오독 계열일 수 있음.

### 15. 토스는 cmdline을 타 앱으로 위장한다 (24차 실측)
시작 0.3s 내 cmdline을 "com.google.android.apps.maps:server_recovery..."(uid는 그대로
10175)로 교체 후 즉사하는 경로 존재(tombstone: libart art::SafeGetDeclaringClass에서
SEGV_ACCERR). pidof/ps의 이름 검색이 실패하면 **uid 기반(ps -o UID)으로 재탐색**할 것.
comm=logcat/which/pm이 uid=앱 으로 보이는 관찰도 같은 위장 계열. am start가
"delivered to top-most instance"를 내면 죽은 task 잔재 — force-stop 후 재시작.

### 16. "조용한 exit"의 최종 관문은 Java Runtime.exit(0) (25차 실측)
원본 토스: frida attach(기동~3.5s)에서 System.exit/Runtime.exit 오버라이드로 차단하면
NPE/컬렉션/kill9가 전부 돌아도 프로세스가 산다(7분+, 스플래시 포그라운드 렌더 유지).
spawn 주입은 무력화되지만 attach는 생존(§13). 프리다 없이 재현하려면 LKM의
exit_group 게이트 검토(차단 시 무한대기 부작용 실험 필요). UEH 소유자는 광고 SDK
(mbridge) 크래시 리포터 — 앱 자체 핸들러가 아님.

### 17. frida 후크의 한계 지도 (26차 실측)
- far=0 isRestricted 호출은 **Java 디스패치 우회(native blr 직접호출)** — frida
  implementation 후크(장착 성공)를 통과하지 않는다. Java 후크로 NPE 원천 차단 불가.
- **frida detach 시 implementation은 복원**된다 — 장기 차단은 러너 세션 유지 필수.
- 종료 우회 경로 복수: Runtime.exit(Java)와 raw exit_group이 공존 추정 — exit 차단이
  뚫리는 런 관찰(25차 생존은 Runtime.exit 경로 런).
- ContextWrapper의 setBaseContext는 빌드에 없을 수 있음(undefined) — 후크는
  getDeclaredMethods 확인 후. isRestricted는 후크 가능(overloads=1).

### 18. 토스 실험은 런 전 pm clear가 기본 (27차, 사용자 지시로 확립)
- `adb shell pm clear viva.republica.toss` 후 첫 런 = **즉사 경로**(cmdline 위장 +
  libart SafeGetDeclaringClass ACCERR, 0.3~0.5s, faultdump 0건) — 가드 판정 상태가
  앱 데이터에 저장되고 데이터 유무가 처형 경로(즉사 vs NPE 위장 mBase=null)를 결정.
- **NPE 경로(mBase=null/far=0) 관찰이 필요한 실험은 pm clear 후 2번째 런부터.**
  즉사 경로 연구는 pm clear 직후 창.
- cmdline 위장명은 런마다 상이(maps/configupdater/logcat/which/pm/zygote_reactjs) —
  tombstone의 cmdline을 믿지 말고 logcat/avc의 pid·uid로 정체 확인.

### 18b. pm clear 상태에선 즉사 경로 고정 (27차 4런 실측)
pm clear 후 런 반복(4회) 전부 즉사 경로 — NPE 경로(mBase=null)는 **앱 데이터가
존재할 때만** 선택됨(같은 부트 pm clear 전후로 경로 전환 실측). NPE 경로 실험
프로토콜: pm clear 1회 → 기동 1회로 데이터 생성 → 이후 pm clear 없이 런.

### 19. 즉사 경로(SafeGetDeclaringClass ACCERR)의 정체 (28차)
가드가 libart 자기 매핑의 PROT_NONE 가드 페이지(---p, file offset 0x80f000+)를
가리키는 **가짜 ArtMethod\***를 심으면 ART FaultManager의 검증(SafeGetDeclaringClass)
이 이중 폴트로 즉사한다 — fault addr이 libart ---p 세그먼트 안인지 maps로 확인하는
것이 판별법(SFI11 3연발 패턴: 검증 폴트→anon 실행 폴트→최종 ACCERR).
tombstone cmdline은 위장(무신뢰) — logcat/avc pid·uid로 정체 확인.

## 29차 신규 교훈 (2026-09-22 심야 — unidbg/Ghidra 축 이동)

### 20. OAT/ELF 정적 매칭의 두 함정 (libea56 IndirectBranch 복구 실측)
- **ADRP는 PC-상대**: page = (PC & ~0xFFF) + signext21(imm)<<12. PC 항을 빼면
  매칭이 0건으로 나온다(1차 실패 원인).
- **readelf -r RELATIVE addend는 타입 뒤 컬럼**(심볼명 자리) — 파서가 심볼명
  패턴으로만 잡으면 0건. RELACOUNT 7,327과 교차 검증할 것.
- 복구 도구: scripts/build_indirect_edges.py (RELATIVE+adrp/add/ldr/br 매칭,
  libea56에서 412 edge/5,329 site — 나머지는 unidbg 실행 트레이스로).

### 21. unidbg 도입 시 (AppSuit 해제 경험 계승)
- 전체 JNI_OnLoad부터 돌리면 /proc·JNI·thread·fork·GL stub이 동시 요구돼 폭발 —
  **Phase 0(ELF-only 최소 로드)부터, 원하는 offset만 직접 실행**.
- AppSuit에서 검증된 unicorn DT_INIT 복호화(tools/emu_dtinit_unpack.py) 패턴이
  StringEncryption 복호화에도 적용 후보.

### 22. unidbg Module API·Ghidra headless 노트 (30차 실측)
- unidbg Module에 getName() 없음(버전 차이) — 파일명 직접 출력. arm64 로드:
  for64Bit + AndroidResolver(21) + memory.load(file, forceCallInit=false)면
  libea56 초기화 없이 정상 매핑(base 고정 0x12000000).
- Ghidra headless xref: ReferenceManager.addMemoryReference(from,to,RefType,
  SourceType.IMPORTED, operandIndex) — AddReferenceCmd 생성자 버전 타는 것보다 안정.
  toss5 프로젝트(/tmp/gproj)는 호스트 재부팅 시 소실 주의 — 필요시 재임포트.

### 23. Hikari StringEncryption 평문 추출 레시피 (31차 확립)
unidbg(for64Bit+AndroidResolver(21)+load(forceCallInit=false))에서:
1. 진입부(LDAXR guard)에 PC 직접 세팅, x30=MAGIC 반환 트랙, emu_start.
2. **스택 재배치 필수**: mem_map(base+0x3000000, 1MB, PROT_RW) + SP 재세팅 —
   복호 루틴이 sp+0x1c8+idx 버퍼에 strb 생성(초기 스택 매핑 부족 시 WRITE_UNMAPPED).
3. 실행 전후 모듈 메모리 diff → 새로 생긴 printable 문자열 = 평문.
   실증: 0x38718 → "/proc/self/maps\0" @0x17a318.
crash는 catch에서 reg_read(PC/레지스터) 덤프로 즉시 해부.

### 24. unidbg 벌크 실행의 3함정 (32차)
- unicorn 반복 emu_start(스냅샷 복원 방식)은 JVM 네이티브 크래시 유발 — 매 후보
  새 emulator가 안전(대신 인스턴스당 로드 비용).
- `mvn exec:java` 매번 Maven 부팅(30~60s) — `mvn dependency:build-classpath
  -Dmdep.outputFile=cp.txt` 1회 후 `java -cp target/classes:$(cat cp.txt) ...`.
- 정적 추정 진입부(adrp/prologue 역추적)의 단독 실행 수율은 낮음(0x38718형
  무인자 가드만 성공) — 인자 필요 함수는 Ghidra 함수 정의+문맥 재현이 선행.

### 25. Ghidra headless 완전 분석·매핑 노트 (33차)
- toss5에 함수를 만들려면 `-noanalysis` 붙이지 않은 analyzeHeadless 실행(완전
  Auto-Analyze, libea56 1.6MB 기준 수 분) → 함수 1,891개 정의.
- Ghidra Java 스크립트는 컴파일 에러가 "class could not be found"로 뜬다 — import
  누락(Address/FunctionIterator 등) 의심. 최소 스크립트(DumpFunctions)로 함수
  테이블을 csv로 내보내 python에서 매핑하는 편이 견고.
- 커널 out 디렉토리는 .config 중간 수정에 오염돼 vmlinux 타깃이 깨진다 — 재시도는
  깨끗한 out2 생성부터.

### 26. ghidra_decompile_at의 offset 변환 버그 + 디스패처 함정 (34차)
- ghidra_decompile_at.java가 libea56(ET_DYN, file offset==vaddr)에서 주소 변환을
  달리 해 **엉뚱한 함수를 디컴파일**한다(4개 다른 offset→같은 함수 반환) —
  DecAtExact.java(session34 보존)로 entry 정확 지정할 것.
- OLLVM 바이너리에서 "간접분기 많은 함수" Top은 대부분 **Hikari 디스패처**(인덱스→
  함수포인터테이블→간접호출 + MBA/런타임 키) — 의미론은 타깃 쪽(relocation 기반
  edge DB의 target)에서 찾을 것.
