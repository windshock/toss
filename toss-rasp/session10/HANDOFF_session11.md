# 토스(viva.republica.toss) 원본 로컬 위장 — 인계 프롬프트 (11차 세션용)

## 최종 목표 (불변)

Android Emulator(camo33, arm64, API 33, GKI 5.15, **호스트=Apple M1 Mac**)에서 벤더 서명
원본 토스 `viva.republica.toss`가 프리다 없이 다음을 만족하게 한다.

- 제한 다이얼로그 없이 메인 UI 진입
- 5분 이상 생존
- 3점 검증 통과: ① `topResumedActivity` 포그라운드 ② 스크린샷 정상 UI ③ 탭 반응

환경 위장은 대부분 끝났고, 남은 핵심은 네이티브 가드(libea56)의 **최종 판정 채널 특정**이다.

## 경계(권한) — 반드시 유지

로컬/정적 RASP 메커니즘 RE + 에뮬 탐지 로컬 무력화(OWASP MASTG-TECH-0144) = **인바운즈**.
토스 **서버측** 안티프로드를 위조해 실제 거래/등록하는 것 = **게이트(승인 필요)**. 이번 작업은
전자(로컬 자폭 메커니즘 규명)에 한정. 서버 채널 건드리지 말 것.

## 필독 자료 (순서대로)

1. `~/Downloads/AppSuit/avd-camouflage/STATUS.md` 상단 `⚡ 현재 전선`(11차 진입 시점 갱신본)
2. `~/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/FINDINGS.md` **§14 (§14-1~14-8)**
3. `~/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/session10/REPORT.md` — 특히 §D-1~D-6,
   "동적 결과 2"
4. 스킬 `~/.agents/skills/avd-rasp-camouflage/SKILL.md` + `references/pitfalls.md`,
   `references/detection-channels.md`
5. 메모리 `appsuit-toss-rasp.md`(정정·소거 이력 압축본)

외부 바이너리 분석 시 provenance/증거 남기고, 추정과 실측 구분할 것.

## 10차 세션 핵심 결론

### 1. 자폭 메커니즘 확정 (정적 + 툼스톤 + 트레이스 교차검증)

자폭은 memmove 음수 길이나 "ctx+0x1c8 누적기"(7차 모델, **폐기**)가 아니라 **저장 return
address 슬롯을 노린 표적 store**다.

- handler `0x95224` 프레임: `x19 = orig_sp-0xac0`, 저장 LR = `[x19+0xab8] = [x29+8]`.
- **poison 블록 `0xacca4–0xaccc0`**:
  - `0xaccb0  str x10,[x8]` — `x10=0xc`, `x8=&saved_LR` → 저장 LR = `0xc`
  - `0xaccb8  str x8,[x29]` — `x8=0x24` → 저장 FP = `0x24`
  - `0xaccbc  ldr x8,[0x1755b8]`(reloc `R_AARCH64_RELATIVE`→`0x965e8`) → `br x8`
- 공유 epilogue `0x965e8`: 스택 카나리(`x19+0xa50`, LR보다 낮음) **정상 통과** →
  `ldp x29,x30,[sp,#0x50]`로 오염값 복원 → `0x96618 ret` → `pc=x30=0xc`.
- 카나리 무손상 = 일반 스택 스매시 아니라 **LR 슬롯만 노린 표적 store**(구조적 확정).
- 툼스톤: `x29=0x24, lr=0xc, pc=0xc` (예측과 정확 일치).
- 자폭 진입 배선(전부 직접분기/트램폴린): `…ae0c8 →br[0x1767d0]→ a9644 →b→ af394 →(af3a0)→b→ acca4`.

### 2. 치명 체크 = **afed8 dispatch id 4** (결정론적, 부트 불변)

- handler `0x95224`는 dispatcher `afed8(param)`가 **런당 48회** 호출.
- toss9 probe `afed8 arg=%x0`로 실측: 두 death trace(장기·재부팅) **모두 47× id 0 + 마지막
  1× id 4 → 직후 poison**. 9차 "마지막 arg=4"를 양 부트에서 재확인.
- `afed8` jump-table 정적 디코드는 OLLVM 난독(neg/magic-const/`madd #0x960` 2D 테이블)으로
  단순식(`table[param]*4+base`)이 안 맞음(계산 타깃 파일끝 초과 = 무효). id-4 타깃은 수동
  OLLVM 디코드 또는 동적 관측 필요.

### 3. reboot A/B 결과 — uptime 가설 기각

- 장기 부트(5h38m)와 재부팅 직후 부트의 death trace가 **동일 경로/툼스톤**(부트 불변).
- 재부팅 직후 **14/14 사망**(pm clear 포함). "재부팅 직후 생존" 가설 **기각**.
- 현 스택은 6/7차 생존 구성과 사실상 동일(bind 정상작동 확인)한데도 생존 미재현.

### 4. env 채널 소거 (bind-mount spoof — 앱 네임스페이스 전파 실측 확인)

**방법론**: adb shell의 bind-mount가 토스 zygote 네임스페이스로 **전파됨**
(`/proc/<tosspid>/root/...`로 앱이 fake 값을 봄 실측) → bind spoof 테스트 유효.

| 후보 | 결론 |
|---|---|
| qemu 프롭 컨텍스트(`/dev/__properties__/*qemu*`) | uid10175에서 이미 **ENOENT**(LKM deny 작동). getname은 rewrite 전 open 시도를 로깅한 것뿐. **채널 아님** |
| uname vs `/proc/sys/kernel/osrelease` 불일치 | 불일치 존재하나 가드가 osrelease/`/proc/version`을 **안 읽음**(uname(2) 285회만). **무관** |
| 프로세스 목록 goldfish 데몬(qemu-props/libgoldfish-rild/gnss-ranchu/irq46-goldfish) | `su 10175` 322프로세스 = **su readproc(gid3009) 아티팩트**. 실앱은 readproc 없음+`hidepid=invisible` → 자기것만 봄. **차단됨** |
| SELinux permissive(`enforce=0`) | 가드가 `/sys/fs/selinux/enforce` 읽음. enforce=1 bind spoof → **여전히 사망**. 단독 아님 |
| **MIDR_EL1 = Apple `0x610f0000`** (impl 0x61=M1 호스트/part0) | 가짜 cpuinfo는 ARM(0x41) Snapdragon(d4e/d4d/d46) 주장 → **미위장 불일치(실재 gap)**. ARM bind spoof → **여전히 사망**. 단독 아님 |

- **MIDR + enforce 동시 spoof도 사망** → **단일 surface-value가 트리거가 아님**.

### 5. 유력 가설 (다음 세션 최우선 검증 대상)

id-4 판정은 다음 중 하나로 추정:
- **(A) redirect-tamper (가장 유력)**: 가드가 LKM이 redirect한 파일(예: `/proc/cpuinfo`→`/dev/.zc7h4u`,
  `/proc/version`→`/dev/.kb913x`)의 fd를 **fstat/statx**해 `st_dev`/`st_ino`가 procfs가 아님을
  보고 **tamper 판정**. → /dev-clone redirect 설계 자체가 근본 탐지원. **7차 survive → 8차+
  항상 death 회귀**(스택이 redirect를 늘림)와 spoof 내성이 이 가설과 정합.
- **(B) 누적**: 여러 미위장 surface(MIDR, enforce, 기타)가 동시에 맞아야 통과.
- **(C) 비-값 채널**: behavioral/timing/in-process GL(glGetString 등 syscall 밖) — getname으로
  안 잡힘.

## 다음 세션 첫 작업 (우선순위)

### A. redirect-tamper 가설 검증 (최우선)
- kprobe `__arm64_sys_newfstatat`(또는 `statx`/`vfs_getattr`)로 가드가 redirect 대상
  (`/proc/cpuinfo`,`/proc/version`,cpuinfo/version fd)에 fstat/statx 하는지 관측.
- 관측되면: fd→경로 매핑 + `st_dev`/`st_ino` 비교로 교차검증 여부 확정.
- 확정 시 대응: redirect 방식을 **inode/dev 보존형**으로 재설계(overlayfs, 또는 동일 procfs
  상에서 seq_file 내용만 치환하는 방식 — mounthide식). /dev-clone 폐기 검토.
- **검증 실험**: cpuinfo redirect를 잠시 끄고(가드가 진짜 cpuinfo=에뮬 내용을 보게) death
  양상이 바뀌는지 vs 켠 상태 비교 → redirect 유무가 death에 미치는 영향 분리.

### B. MIDR/enforce 정식 LKM redirect (누적 후보 해소)
- LKM `hide_kmod.c` `rewrite_ret`의 하드코딩 redirect 리스트에 추가:
  - `/sys/devices/system/cpu/cpu*/regs/identification/midr_el1` → 코어별 ARM MIDR
    (cpu0=`0x00000000411fd4e0`, cpu1-4=`0x…411fd4d0`, cpu5-7=`0x…411fd460`; 포맷 `0x%016x\n`).
  - `/sys/fs/selinux/enforce` → `1`.
- camow3.sh에 해당 fake 파일 생성 추가. **리빌드 필요**(build-in-docker.sh) → 재부팅 → insmod.
- 단독으론 불충분 실측이나 누적 가설상 필요. redirect 방식이면 A의 tamper 위험도 함께 고려.

### C. 누적 surface 감사 계속
- 가드가 읽는 나머지 **미위장 병렬 surface** 전수 점검: `/proc/self/maps` 내용,
  `/sys/fs/cgroup/uid_*`(cgroup v2 구조), `/sys/devices/system/cpu/{online,present,possible}`,
  `/proc/thread-self/attr/current`(SELinux 컨텍스트), 기타.
- getname/prop 캡처(아래 도구)로 death 직전 read 목록 재확보 후 교차.

### D. survive 재현 (gold-standard differential)
- 생존 런 1개만 확보하면 death↔survive 차분으로 id-0/id-4 시퀀스·handler 분기 비교가 결정적.
- 6/7차 생존 조건 재탐색(부팅 초기창·pm clear·추가 채널). 현 스택 14/14 death.

### E. 비-값 채널 (막히면)
- in-process GL(glGetString `ANDROID_EMU_gles_max_version_3_0` 잔존 토큰)·timing은 ftrace 밖
  → 별도 도구(가드 glGetString 호출부 uprobe, 또는 dylib 반환값 관측).

## 도구 / 환경

- 정적: `/opt/homebrew/opt/llvm/bin/llvm-objdump`, `llvm-readelf` (Homebrew LLVM 23.1.1).
  libea56 `.text`는 **VA==파일오프셋**. 데이터 점프테이블 슬롯은 파일에서 0, 실제 타깃은
  `R_AARCH64_RELATIVE` addend(load 시 주입) → `llvm-readelf --relocations`로 조회.
- libea56 SHA-256 `c454eb404cf30a85c55e8182099230ad434285b6688e055bc75b5769f6203b89`.
- 설치 경로(매번 `pm path viva.republica.toss`로 검증):
  `/data/app/~~qnX020rutPP5JISz5QxWSg==/viva.republica.toss-B3Vz3QU5iqSLautZvD9sRw==/lib/arm64/libea56.so`
- 토스 uid = **10175**.
- 에뮬 상태(11차 진입 시점): camo33 가동, **LKM hide_kmod v4.4b armed(uid 10175)**, prop 누수 0,
  model=SM-S916N, egl=adreno, GLES=`Adreno (TM) 740 … V@0615.47`, display 1080x2340@450,
  `.vl64` bind 정상(앱이 `mapper@3.0-impl-qti.so` 봄), camow3 writer 1개, SELinux **Permissive**.
- **toss9 uprobe 그룹 = 709개 broad probe**(indirect branch `target=%xN` + memmove/ELF/dispatch).
  현재 등록됨·`tracing_on=0`. 재부팅 후 소실되므로
  `session10/toss9_uprobe_events.saved`로 replay(그 파일 `while read`로 uprobe_events append +
  `mkdir instances/toss9` + `events/toss9/enable`). 매 shell PATH:
  `export PATH="$PATH:$HOME/Library/Android/sdk/platform-tools"`

## 실행 규칙

- 토스 테스트 전 반드시: `am force-stop net.ib.android.smcard; am force-stop com.hanabank.oqf`.
- 토스 시작: `am start -n viva.republica.toss/.splash.SplashActivity`.
- **백그라운드 PID 존재만으로 생존 판정 금지**(프리저 아티팩트). 반드시 topResumedActivity +
  스크린샷 + 탭 + 5분.
- launch 후 pidof 검사는 **pid 등장 대기 후** 사망 감시(async am start 레이스 주의 —
  `.toss10probe.sh` 패턴 참조: pid 등장 15s 대기 → 사망 조기 break).
- 캡처 후 `adb shell sync`. push 직후 emu kill 금지(userdata writeback 유실).

## 절대 반복하지 말 것 (실측 확정)

- **`su 10175`은 readproc(gid3009)를 얹으므로 실앱 권한과 다르다** — 프로세스 가시성 판정에
  쓰지 말 것(`/proc hidepid=invisible`이라 실앱은 자기것만 봄).
- **`channel_trace.sh` 그대로 쓰지 말 것** — `echo > uprobe_events`로 clear해 toss9 709 probe를
  소실시킴. getname/prop 캡처는 **별도 그룹 append + 전용 instance**로(10차 `.toss10chan.sh` 참조).
- getname 캡처 시 set_event_pid가 가드 dispatch 스레드 생성을 레이스로 놓쳐 marker(afed8/i96618)
  미발화 가능 → 마커는 **toss9(무필터, uprobe=toss전용)**, getname은 **별도 instance(pid필터+
  event-fork)**, 같은 clock로 offline 상관.
- **`setenforce 1`은 /dev-clone redirect를 깨뜨림**(untrusted_app→device:s0 AVC deny) → 다른
  사망 유발(교란). enforce 위장은 값만 spoof(bind/LKM redirect)로.
- qemu prop **값** 재노출 금지(resetprop 삭제 유지). qemu **컨텍스트**는 LKM이 이미 처리.
- 이미 확정: 화면 1080x2340@450, uname(2) 위장, `/proc/uid_*` redirect, EmulatorTalkBackOverlay
  차단, GL trio literal/soname 패치 금지(크래시), ANDROID_EMU_gles_max 제거 금지(부팅 크래시),
  프리다 금지, 구동 중 rmmod 금지, dylib 교체 시 에뮬 재시작 필요.

## 운영 함정

- `setenforce 0` 이후 insmod/deploy. 재부팅마다 stack 재적용
  (`deploy.sh 10175` → `vendor_bind_setup.sh all` → `wm`/props 재확인).
- **deploy.sh의 writer nohup 라인이 hang**할 수 있음(adb shell 미복귀) → writer는
  `( nohup sh /data/local/tmp/.system_profile </dev/null >log 2>&1 & ); echo ok` 패턴으로 기동.
- bind mount `/proc/mounts`에서 소스 device로 표시됨(.vl64는 remount된 vendor fs 위 → dm-33
  2줄로 보이나 **정상**). 실제 효과는 `/vendor/lib64/hw/`에서 `-impl-qti` 확인으로 판정.
- 툼스톤 레지스터는 signal~backtrace 블록 안에서만 읽을 것.
- ftrace/uprobe만. ptrace/Frida 금지.

## 10차 산출물 (session10/)

- `REPORT.md`(전체 상세), `HANDOFF_session11.md`(본 문서)
- `disasm_*.txt`(poison/epilogue/dispatch 경로 블록: acca4·965e8·96618·a021c·a0488·a9644·af394·
  ae0c8·a4038 등)
- `death1.trace`(장기부트 death), `fbdeath1.trace`(재부팅 death) — toss9 broad, 22.5k줄
- `chan1.trace`(getname/prop/uname/sysinfo death 캡처 — env read 관측)
- `toss9_uprobe_events.saved`(709 probe replay용)

## 11차 종료 전 기록할 것

- redirect-tamper 검증 결과(가드 fstat/statx 여부, st_dev/ino 교차검증 여부) — **결정적**
- MIDR/enforce LKM redirect 적용 시 death 변화
- 누적 감사에서 추가로 찾은 미위장 surface
- survive 재현 시 death↔survive 차분 결과(id-4 대체 경로)
- 성공 시 전체 구성 스냅샷 + 5분 3점 검증 증거
- FINDINGS.md §15 신규 섹션 + STATUS 전선 갱신 + memory 갱신

**분석 축**: 8~10차의 "어떤 surface 값이 틀렸나"에서 → **"id-4가 값 채널이 아니라 redirect
자체(fstat tamper)를 보는가, 아니면 누적/behavioral인가"** 로 이동. redirect-tamper가 사실이면
지금까지의 /dev-clone 위장 전략 자체를 inode/dev 보존형으로 재설계해야 한다.
