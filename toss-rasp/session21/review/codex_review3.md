Reading additional input from stdin...
OpenAI Codex v0.155.1
--------
workdir: /Users/1004276/Downloads/AppSuit
model: gpt-5.6-sol
provider: openai
approval: never
sandbox: read-only
reasoning effort: xhigh
reasoning summaries: none
session id: 01a0c6c8-9eec-73a0-b0ca-268481738f52
--------
user
avd-camouflage/analysis/toss-rasp/session21/review/REVIEW_BRIEF3.md 브리프를 읽고 지시대로 검토하라. 토큰 절약 필수 — 파일 읽기 없이 브리프 증거만으로 답할 것. 답변은 브리프 형식(한국어, 번호별 답변 + 수정 권고 Top3).
deprecated: `[features].codex_hooks` is deprecated. Use `[features].hooks` instead.
Enable it with `--enable hooks` or `[features].hooks` in config.toml. See https://developers.openai.com/codex/config-basic#feature-flags for details.
codex
`avd-rasp-camouflage` 스킬을 적용하겠습니다. 스킬 지침과 지정된 브리프만 읽고, 다른 코드·로그·파일은 열지 않은 채 브리프에 제시된 증거만으로 번호별 검토와 수정 권고 Top 3을 작성하겠습니다.
exec
/bin/zsh -lc "sed -n '1,240p' /Users/1004276/.agents/skills/avd-rasp-camouflage/SKILL.md" in /Users/1004276/Downloads/AppSuit
 succeeded in 0ms:
---
name: avd-rasp-camouflage
description: Android Emulator(AVD)에서 RASP/안티루팅·안티에뮬레이션이 탑재된 금융 앱을 은신시키고 동적 분석하는 워크플로. 커널 모듈(LKM) 배포, resetprop 신원 위장, 위장 파일 유지, 호스트 dylib GL 신원 패치, frida spawn 분석, ftrace 커널 추적 진단, SMS 가로채기 브릿지를 다룬다. 사용자가 에뮬레이터에서 금융/보안 앱이 죽는다, 루팅 탐지 우회, 에뮬레이터 탐지 우회, frida attach 안 됨, SMS 테스트, 모니모/하나원큐/토스/신한솔 같은 앱 분석을 언급하면 이 스킬을 쓴다.
---

# AVD RASP Camouflage 워크플로

QEMU AVD(arm64, API 33, GKI 5.15)에서 AppSuit류 RASP가 탑재된 앱을 실행·분석하는
검증된 절차. 핵심 교훈: **유저랜드 frida 훅만으로는 부족하고, 커널 모듈(LKM) 경로
위장이 정답**이다. libc 인라인 훅은 그 자체로 탐지되고, raw svc syscall은 못 잡는다.

> ⚠️ **가장 중요한 워크플로 교훈 (2026-09-20)**: 앱이 왜 죽는지/멈추는지 원인을 오래
> 파기 전에, **먼저 neutered 리빌드로 실행부터 확인하라.** neuter(`libAppSuit.so` 탐지
> 스레드 무력화)-후-실행 한 수가 며칠치 동적분석 삽질을 대체한다. 실제로 하나원큐를
> "MAPClient가 벽/하드웨어 TEE가 벽"이라 며칠 오판했으나, neuter+재서명 한 번에 스플래시·
> WebActivity 전부 통과했다(스크린샷 검증). **분석 목적이면 neutered가 정공법**
> (§ neutered 리빌드, `references/neuter-rebuild.md`). 원본을 에뮬에서 살리는 건 별개
> (LKM 위장, 그리고 서버 FDS는 재서명 앱 거부 = 경계 밖).

## 대상/환경 판별

먼저 다음을 확인한다. 다르면 이 스킬의 수치는 참고만 하고 재측정이 필요하다.

```bash
adb shell getprop ro.build.version.release      # 13 (API 33)
adb shell uname -r                              # 5.15.x-android13-8-...
adb shell "ls /sys/kernel/tracing/kprobe_events" # kprobe 사용 가능
adb shell getenforce                            # Permissive
adb shell "cat /sys/devices/system/cpu/online"  # 0-7 — 0-1이면 코어수 채널 노출(아래)
```

앱 자산(원본 APK, neutered 빌드, LKM 소스·빌드 산출물)은 워크스페이스
`~/Downloads/AppSuit/` 하위에 있다. STATUS.md가 단일 진실 소스다.

**AVD 사전 조건 (한 번)**: `~/.android/avd/<avd>.avd/config.ini`에
`hw.cpu.ncore = 8` — 코어수는 /sys 열거·sched_getaffinity·sysconf로 전부
관측되어 경로 위장(LKM)으로 못 막는다. 실코어를 늘리는 것이 유일한 대응.
`hw.ramSize = 8192`도 권장 — sysinfo(총 메모리) 채널(토스 런타임 337회 관측).
**MIDR_EL1 화이트리스트도 사전 조건**: 호스트 Apple CPU(0x61)가 /sys/.../midr_el1로
그대로 노출됨(가드가 전 코어 읽음 확인) — hide_kmod v4.5+의 MIDR/enforce redirect +
camow3 fake로 위장(13차: 이 조합이 토스를 2초 자폭 → 5.5분 생존으로 전환).
**화면 프로필도 사칭 기기와 일치 필수**: `hw.lcd.width/height/density` —
에뮬 기본(1080x1920@213/480)은 Java DisplayMetrics로만 관측되는 에뮬 텔레텔
(파일·프롭·커널 위장 전부 우회). SM-S916N=1080x2340@450. 런타임 즉시 시험은
`wm size 1080x2340; wm density 450`. (6차: 이 수정 하나로 토스가 자폭 대신
"해킹 위험성" UI 제한 모드로 전환되는 것을 관측)
호스트 GL 신원 패치도 1회 선행(`scripts/patch_dylib_gl_identity.py`, 아래).

## 표준 절차 (부팅 후 복구 → 앱 실행)

1. **LKM 적재**: `scripts/deploy.sh <uid>` 를 실행한다. rmmod/insmod, 위장 파일
   writer(.system_profile), resetprop 신원 적용을 한 번에 한다.
   1a. **GL 셀렉터(토스류 vendor bind 세계 필수, 19차)**: `resetprop ro.hardware.egl adreno`
   + `ro.hardware.vulkan default` — 부트마다 emulation으로 리셋된다. 사전조건:
   `patch_bind_egl_literals.py`(사본 내부 dlopen 키/SONAME이 adreno 세트). 미적용 시
   앱 RenderThread가 3~8s 내 SIGABRT(EGL_NOT_INITIALIZED 또는 "couldn't find an OpenGL
   ES implementation"). 상세: references/pitfalls.md 19차 섹션.
   - uid는 `adb shell dumpsys package <pkg> | grep userId` 로 확인. 재설치마다 바뀐다.
   - uid만 바뀌는 경우 재적재 불필요 — sysfs로 런타임 변경:
     `adb shell "echo 10179,10181,10175 > /sys/module/hide_kmod/parameters/target_uids"`
2. **앱 실행**: `adb shell am start -n <pkg>/<activity>` — 프리다 없이 먼저 생존 확인.
   60초 이상 `pidof`가 유지되면 환경 위장 성공.
3. **동적 분석(neutered 빌드만)**: `scripts/frida_spawn.py <script.js> [초]` 로
   spawn 방식 frida 세션. attach 방식은 AhnLab 가드 서브프로세스가 ptrace를
   이미 잡고 있어 불가능하다(TracerPid 확인).
4. **진단(죽으면)**: `references/pitfalls.md` 의 증상별 표를 본 뒤, ftrace kprobe로
   사망 직전 시퀀스를 캡처해 누수 채널을 특정한다.
   **생존 판정 3점 검증**: topResumedActivity(포그라운드) + 스크린샷 + 탭 반응 —
   백그라운드 "생존"은 캐시 프리저로 가드가 정지한 아티팩트일 수 있다(8차 교정). `references/detection-channels.md`
   에 2026-09-20 기준 확인된 채널 전부와 대응이 있다 (앱별 차이: AppSuit류 SIGBUS
   자폭 vs 토스 libea56 memmove 자폭 — 후자는 fork 자식이 검사 수행).

## neutered 리빌드 (원본이 안 뜨고 분석 목적이면 — 먼저 시도)

RASP를 무력화한 앱을 리빌드해 설치하면 에뮬에서 바로 실행·frida 분석이 된다.
monimo(삼성카드=net.ib.android.smcard)·하나원큐 두 앱에 일반화됐다. 한 줄 요약:
**`libAppSuit.so`의 pthread_create/detach를 무해한 심볼로 재지향 → 탐지 워커 스레드가
안 생겨 RASP가 안 돈다.**

```bash
scripts/neuter_rebuild.sh <pkg> [redirect_sym]   # 원본 splits pull→neuter→재서명→install
```

핵심 주의(전부 실측):
- **리다이렉트 대상은 타깃 `libAppSuit.so` dynsym 임포트에 있는 걸로 골라야 한다.**
  monimo=`getpid`, 하나=**`prctl`**(하나 dynsym엔 getpid 없음). `-1`/비-제로 반환·인자
  역참조 없는 것(getpid/getuid/prctl). **금지: sleep(포인터를 초로 잠), getenv/
  gettimeofday/pthread_mutex_init(0=성공 반환→가짜 성공), fork(프로세스 폭발).**
- `clean/*.clean2.apk`(폭탄 strip 정적분석본)는 **런타임 설치 불가** — 반드시 **원본
  base**에서 neuter.
- native lib은 arm64 split(`split_config.arm64_v8a.apk`)에 들어있다. 3개 split 전부
  **동일 debug키로 재서명**(mixed 불가) + zipalign(-p 4). 원본 uninstall 후 install-multiple.
- 재서명 = **로컬 분석 전용**. 실제 서버 인증/거래는 서명·FDS로 거부(경계 밖).
- neutered는 AppSuit가 꺼져 있으니 **탐지 채널 관찰엔 원본을 써야 한다**(아래 ftrace).

전체 레시피·앱별 차이(빌드 편차)는 `references/neuter-rebuild.md`.

## 탐지 채널 실측 (native 문자열이 안 읽힐 때)

신버전 AppSuit는 native 탐지 문자열을 **런타임 바이트구성+dlsym으로 은닉**(STL 아님,
평문 아님 — DEX용 STL 복호기 안 통함). 이럴 땐 **ftrace 채널매핑**이 문자열 은닉과
무관하게 답을 준다 — 원본 앱의 파일접근/프롭조회를 그대로 캡처:

```bash
# getname_flags(:ustring 모든 경로) + __system_property_find uprobe, 앱 pid 필터
scripts/channel_trace.sh <pkg> <activity>   # → su-family/goldfish/cpuinfo/ro.boot.qemu 등 실측
```

실측 결과 monimo·하나 채널은 거의 동일(같은 AppSuit/AhnLab 제품): su-family×여러
디렉터리, `/dev/goldfish*`·`qemu_pipe`, `/proc/cpuinfo`, `/sys/.../cpuN/cpufreq`(코어수),
`ro.boot.qemu`, `/proc/self/maps`(frida). 앱별 차이는 **탐지대상이 아니라 빌드/통합**:
AppSuit가 native-enforce(→SIGBUS, monimo) vs report-mode(→ANR/SIGKILL, 하나)로 다르게
탑재됨 — **실패양상만 보고 원인 오판하지 말 것.**

## 하면 안 되는 것

- frida CLI에 `< /dev/null` 이나 파이프 stdin 넣기 — REPL 메시지 펌프가 막혀
  지연 콜백이 전부 무시된다. python 바인딩 러너(scripts/frida_spawn.py)를 쓸 것.
- `/dev/goldfish*` 를 ENOENT로 숨기기 — 앱 GL 전송로라 화면이 죽는다. 안전한 방법은
  세: ① access/stat 존재체크만 위조(open 통과) ② open을 동일 major/minor의 클론
  노드로 리다이렉트(camow3가 노드 생성, LKM v3.8+가 리다이렉트) ③ **HAL이 넘겨준 fd의
  readlink 결과 교체**(v4.1 d_path kretprobe — open 주체가 uid 게이트 밖일 때).
  디렉터리 열거(filldir/getdents)에서의 은닉도 안전(v4.2: 텔레텔 .so 포함 — 단
  앱이 스캔으로 찾는 드라이버 lib는 먼저 중립명으로 바뀌어 있어야 한다).
- 위장 파일을 비워두기 — 0바이트 파일 mmap → SEGV_ACCERR 즉사.
  keep-last-good + 시드 유지(scripts/camow3.sh가 처리).
- kill/tgkill을 막는 "방어"로 접근 — 엔진은 SIGSEGV 의도적 점프·메모리 스캔 등
  우회 경로가 더 있다. 탐지 "근거 제거"가 정답.
- 에뮬레이터를 pkill로 종료 — writable 오버레이 소실. `adb emu kill` 만 사용.
- **push 직후 emu kill** — userdata 라이트백 유실(파일이 구버전으로 되돌아감, md5는
  캐시 히트로 새값 표시되니 신용 금지). push 후 `adb shell sync` 필수.
- **구동 중 모듈 rmmod** — 간헐 게스트 패닉. 모듈 교체는 재부팅 후 insmod.
- **GL 트리오(libEGL/GLESv1_CM/GLESv2 emulation)의 리터럴·soname 패치** — 듀얼 이름
  세트는 soname 매칭으로 해석된다. 파일명 정합화 시도 시 이중 사본(Chromium NULL 크래시)
  또는 dlopen 실패(SF 크래시 루프).
- **ANDROID_EMU_gles_max_version_3_0 토큰 제거(host skip/rename)** — 게스트가 ES3를
  요구해 "no ES 3 support" 시스템 크래시 루프(5차 실측). 대안은 게스트 GLESv2의
  GL_EXTENSIONS 반환 경로 필터링(미시행).

## 호스트 dylib GL 신원 패치 (1회 — 렌더러 문자열 채널)

에뮬레이터가 앱에 보내는 GL 문자열은 파일 트레이싱으로 못 잡는 최종 채널이다
("Google (Apple)", "(Apple M1 Pro)", "Metal" — 호스트 정보 그대로 누출).
3종 패치를 이 순서로 누적 적용한다(각 스크립트가 원본 바이트를 검증해 버전 불일치 시
중단하므로 안전, 멱등):

```bash
python3 scripts/patch_dylib_gl_identity.py <src> <out>   # Vendor→Qualcomm, Renderer→Adreno (TM) 740
python3 scripts/patch_dylib_gl_version.py  <src> <out>   # GL_VERSION "(4.1 Metal - 88.1)"→"(4.1 V@0615.47)" — Metal 제거
python3 scripts/patch_dylib_gl_version32.py <src> <out>  # GL_VERSION →"OpenGL ES 3.0 V@0615.47" — 실기기 paren 포맷 (v3)
python3 scripts/patch_dylib_gl_tokens.py   <src> <out>   # 확장 토큰 ANDROID_EMU_*→QCOM_ADRENO_* (39개, 게스트 파싱 4종 제외)
# 산출물을 ~/Library/Android/sdk/emulator/lib64/libgfxstream_backend.dylib 로 배치 후
# 에뮬 재기동. 검증: adb shell "dumpsys SurfaceFlinger | grep GLES"
```

주의(실측): GL_VERSION 조립부의 **reserve 계산부를 NOP하면** string 용량 붕괴로
gfxstream이 크래시한다(구 2회 실패의 원인) — version 스크립트는 reserve를 우회하는
설계다. dylib 크래시 1회 후엔 crash-report 다이얼로그가 이후 부팅을 막는다
(`rm -rf /tmp/android-1004276/emu-crash-36.5.1.db` + 프로세스/lock 정리). 상세는
`references/detection-channels.md` ★ 섹션.

## 라이브러리명(phdr) 채널 — vendor bind (토스류, 필요 시)

HIDL passthrough는 디렉터리 스캔으로 impl lib을 찾고(파일명 중간부 자유), 게스트가
로드하는 /vendor/lib64를 bind 사본으로 갈아끼우면 mapper/EGL/profiler/vulkan의
에뮬 텔레텔 이름을 중립명으로 바꿀 수 있다. **파일 교체 후에는 반드시 프레임워크
재시작**(`stop; start`) — zygote가 부팅 때 로드한 매핑을 fork로 상속하기 때문.

```bash
scripts/vendor_bind_setup.sh build   # 1회: /data/local/tmp/.vl64 사본+리네임+패치
scripts/vendor_bind_setup.sh all     # 부팅마다: mount → stop;start → prop 정합화
```

전제: hide_kmod v4.2+(readdir의 텔레텔 .so 은닉), dylib 패치 3종. 부작용·함정
(stop;start가 root/props를 되돌리는 것 포함)은 `references/pitfalls.md`.

## 세부 주제 (필요할 때만 읽기)

- **neutered 리빌드 전체 레시피 + 앱별 빌드 편차**: `references/neuter-rebuild.md`
- 확정된 탐지 채널 전수와 대응: `references/detection-channels.md`
- 증상→원인→해결 트러블슈팅: `references/pitfalls.md`
- frida 분석 상세(neutered 빌드, spawn 러너, 스크립트 작성법): `references/frida-analysis.md`
- SMS 가로채기 → macOS 문자 앱 브릿지: `references/sms-bridge.md`
- 토스 libea56 RE 워크플로(누적기 판정 구조): 워크스페이스 `avd-camouflage/analysis/toss-rasp/FINDINGS.md` §12-13
  + `scripts/ghidra_decompile_at.java`(headless 디컴파일) + `scripts/scan_struct_offset.py`(구조체 필드 지도)
  + `scripts/toss_heap_snapshots.sh`(가드 어휘 복원). Ghidra 프로젝트: `analyzeHeadless /tmp/gproj toss5 ...`

## 스크립트

| 스크립트 | 용도 |
|---|---|
| `scripts/boot_recover.sh` | **부팅 후 전체 복구 원스텝(20차)** — 대기/root→permissive→bind→insmod→egl/vulkan resetprop→props→wm→writer→chan19 인스턴스→검증 체크리스트. deploy.sh+bind+ftrace를 정순서로 묶음 |
| `scripts/deploy.sh` | 부팅 후 한 번: setenforce 0 → LKM insmod(다중 uid, 미적재시) + sync + 위장 writer(.system_profile, sh -c nohup 래퍼) + resetprop 적용. hide_kmod v4.4b = uname(2) 위장 + uid sysstats 위장 + Emulator overlay deny 포함 |
| `scripts/camow3.sh` | 위장 파일 유지 루프 v4.4 — **smaps 블록 단위 필터**(라인 필터는 고아 속성 블록 잔여 → 파서 판정 입력, 5차 실측), uid sysstats 3종 존재 위장, /proc/version 삼성 문자열(uname 위장과 정합), 8코어 cpuinfo, 0.2s 갱신 |
| `scripts/patch_dylib_gl_version32.py` | GL_VERSION → "OpenGL ES 3.0 V@0615.47" 실기기 paren 포맷 (v3) |
| `scripts/patch_dylib_glesmax_skip.py` | **폐기·보관용** — gles_max emit 스킵은 게스트 "no ES 3 support" 크래시 루프(5차 실측). 실행 금지 |
| `scripts/props-apply.sh` | resetprop 신원 세트 일괄 적용 — qemu/goldfish/ranchu 서브키·파티션 fingerprint·product.* 전수 포함 (디바이스 실행) |
| `scripts/patch_dylib_gl_identity.py` | 호스트 dylib GL 신원 패치 (Vendor→Qualcomm, Renderer→Adreno (TM) 740; 원본 바이트 검증·멱등) |
| `scripts/patch_dylib_gl_version.py` | GL_VERSION "(4.1 Metal - 88.1)"→"(4.1 V@0615.47)" — reserve 블록 우회 설계 (2026-09-21) |
| `scripts/patch_dylib_gl_tokens.py` | 확장 토큰 ANDROID_EMU_*→QCOM_ADRENO_* 39개 — 게스트 파싱 4종은 제외(양측 리네임은 vendor_bind build가 처리) |
| `scripts/vendor_bind_setup.sh` | /vendor/lib64 bind 사본 구성(build)·적용(mount)·stop;start 후 정합화(props) — phdr/라이브러리명 채널 폐쇄 |
| `scripts/frida_spawn.py` | frida spawn 러너 (pyenv 3.11.4의 frida 16.6.6 사용) |
| `scripts/neuter_rebuild.sh` | 원본 splits pull→libAppSuit 스레드 neuter→debug키 재서명→install (분석용 neutered 빌드) |
| `scripts/patch_libappsuit_threads.py` | libAppSuit pthread_create/detach 재지향(`--redirect <sym>`, 기본 getpid) |
| `scripts/channel_trace.sh` | 원본 앱 탐지채널 실측 (ftrace getname:ustring + prop uprobe, pid 필터) |
| `scripts/sms_bridge.py` | SMS 양방향 브릿지 — 송신(emu발송→Mac 전달, dry-run 기본) + 수신(Mac 수신→emu 주입) |
| `scripts/ghidra_decompile_at.java` | Ghidra headless postScript — lib 오프셋 주소의 함수 디컴파일: `analyzeHeadless <proj_dir> <proj> -process <lib> -noanalysis -scriptPath <dir> -postScript ghidra_decompile_at.java <오프셋hex> <out.c>` (OLLVM lib RE용, 토스 libea56 프로젝트 /tmp/gproj toss5) |
| `scripts/toss_heap_snapshots.sh` | 살아있는 앱의 anon 힙 반복 스냅샷(비-ptrace dd) — 가드 복호화 어휘 추출·시점 diff. 스냅샷 간 strings diff로 "새로 복호화되는 문자열" 추적 |
| `scripts/scan_struct_offset.py` | 네이티브 lib에서 구조체 오프셋 접근 명령 전수 스캔 — 토스 판정 누적기(ctx+0x1c8)처럼 필드 지도 작성 (7차: 쓰기 4/읽기 45 발견) |
| `scripts/scan_adrp_add.py` | adrp+add 쌍으로 계산되는 전역 주소 참조 전수 스캔 — OLLVM lib의 상태변수/플래그 지도 작성 (12차: dispatcher 상태글로벌 0x1821a0 추적) |
| `scripts/toss_state_watch.sh` | 살아있는 프로세스의 지정 오프셋 값 주기 폴링(/proc/pid/mem, 비-ptrace) — 가드 상태변수 궤적 관측. 오프셋·lib 경로 편집 필요 |
| `scripts/toss_launch_stats.sh` | 토스 N런 기동→결과 자동 분류(dead/dialog/ALIVE) — 레이스 판정 통계(17차). 탭 테스트는 ANR 아티팩트로 자동 탭 없음 |
| `scripts/toss_child_scan.sh` | 토스 fork 자식 스캔 전수 + exit_group 상관 캡처 (19차). append-only pid 필터 + 60s 스냅샷. 재부팅마다 chan19 instance 재구성 필요(헤더 주석) |
| `scripts/toss_addr_resolve.py` | ftrace 캡처의 pc/lr/far를 maps 기준 모듈+vaddr/file 오프셋으로 일괄 매핑, sig=11↔do_mem_abort 시간상관 (20차 검토 반영) |
| `scripts/patch_bind_egl_literals.py` | .vl64 egl `_adreno` 사본 3종의 `emulation` 리터럴 제거(19차) — hide_kmod emulation deny와 공존하기 위한 필수 패치. 멱등, .bak_* 보존 |

~~eglflip.sh~~ / ~~egl_alias.sh~~ — **폐기**(실측: egl 런타임 위장은 다른 앱 GL 초기화를 깬다).

스크립트는 `~/.zcode` 캐시가 아니라 이 스킬 디렉토리에 있으므로, 디바이스로 push할 때
절대경로로 접근한다. LKM .ko 는 워크스페이스 `avd-camouflage/lkm/hide_kmod.built.ko`
에서 push한다 (커널 버전이 다른 AVD면 `build-in-docker.sh` 로 재빌드).

exec
/bin/zsh -lc "sed -n '1,260p' avd-camouflage/analysis/toss-rasp/session21/review/REVIEW_BRIEF3.md" in /Users/1004276/Downloads/AppSuit
 succeeded in 0ms:
# 3차 검토 요청 (벽) — 불변 fault 시그니처의 컨트롤 전이 이상

전제: AVD(arm64, API33, GKI 5.15)에서 벤더서명 금융앱 토스의 로컬 RASP 우회 연구.
frida 금지, ftrace kprobe + LKM만 사용. 가드(libea56)가 런 12~78s에 SIGSEGV를 자체
핸들러로 수거한 뒤 System.exit(0)로 종료하는 것이 현재 저항 요소.

## 확정된 불변 시그니처 (동일 부트 3런, 완전 동일 — t21_gpr 프로브)

do_mem_abort kprobe (far/esr + pt_regs의 x16/x29/x30/sp/pc):
```
far = 0x0                    (esr=0x92000006: EC=0x24 EL0 데이터어보트, DFSC=0x06 변환폴트, WnR=0)
pc  = boot-framework.oat +0x19d534  (maps vaddr오프셋; file+0x345534)
lr  = boot-framework.oat +0x19d52c  (file+0x34552c)
x16 = 0x0
x29 = 0x7fdd25a818
sp  = 0x7fdd25a730
```
oatdump --addr2instr(file 0x345530, exec-relative 0x19e534) 심볼화 결과:
- 메서드 = android.content.ContextWrapper.isRestricted()
- file 0x34552c = OatQuickMethodHeader 위치
- file 0x345530 = 코드 시작: `sub x16, sp, #0x2000`
- file 0x345534 = `ldr wzr, [x16]` ← fault 명령 (ART StackOverflowCheck 프로브)

## 해석 시도와 벽

1. 정상 호출이라면 bl→entry(0x345530)에서 `sub x16, sp, #0x2000` 실행 → x16=sp-0x2000=
   0x7fdd258730(유효) → 프로브는 far=0x7fdd258730으로 폴트해야 함. 실측은 far=0x0,
   sp=0x7fdd25a730(정상), x16=0.
2. **모순**: x16=0이려면 (a) sub가 안 실행됐으면서 pc가 entry+4(=엔트리+4 직행, x16은
   이전값 0), 또는 (b) sub는 실행됐으나 sp≈0x2000이었어야 함 — 그러나 pt_regs sp는 정상.
   (a)의 경우 lr이 왜 QuickMethodHeader(엔트리-4)인지 설명이 안 된다. bl 호출이면 lr=
   호출자 코드여야 하고, 폴스루라면 pc가 entry+4에 오기 전 entry-4..entry의 헤더 바이트
   명령들이 실행됐을 텐데(헤더=CodeSize 92 등을 명령으로 실행하면 SIGILL이 먼저 예상).
3. 커널 측 신뢰성: do_mem_abort pt_regs는 동기 어보트의 유저 컨텍스트 (sp=+248, pc=+256).
   같은 부트 3런에서 x29/sp까지 완전 동일 — ASLR 없는 부트이미지 고정 주소와 정합.

## 질문 (한국어, 번호별 + Top3)

1. 위 모순(x16=0 + pc=entry+4 + lr=entry-4=헤더 + sp 정상)을 설명하는 컨트롤 전이
   시나리오 후보를 순위대로. 예: (i) 오염된 엔트리포인트/vtable이 entry-4~entry 영역을
   가리켜 폴스루, (ii) sigreturn 시 오염된 sigframe(pc=entry+4, x16=0 복원), (iii) ART
   Nterp/quick 전환 trampoline 경유, (iv) 기타. 각각 검증 방법도.
2. lr이 OatQuickMethodHeader를 가리키는 것의 의미: ART가 method header를 함수 포인터로
   로드하는 경로(OatMethodOffsets/QuickMethodHeader 구조)에서 오프셋이 하나 어긋나면
   이런 상태가 되는가? 즉 "엔트리포인트 테이블 오염" 가설의 정합성.
3. 이 시점에 x0~x15, x17 전체를 얻는 방법: kprobe fetch 16개 제한 우회(예: kretprobe+
   bpf? ftrace dump 스택?), 또는 memcpy 프로브 등으로 pt_regs 전체를 저비용 덤프하는 실용법.
4. 다음 단계 최단 경로: (i) 이 시그니처를 재현하는 최소 트리거 식별(런 내 타이밍/직전
   syscall), (ii) libea56 정적 RE에서 저장-컨텍스트 오염 store 후보 찾기(12차에서
   acca4 poison 블록, 0x95224 핸들러 확인됨 — 현 버전은 pc=0xc 대신 이런 형태로 진화
  했을 가능성), (iii) 기타. 리소스(ftrace/LKM/rename만, frida 불가) 제약 하에서.
5. 우회 관점: 오염을 근본 차단하기 어렵다면, 이 SIGSEGV를 가드 핸들러가 수거하지 못하게
   (ART FaultManager가 먼저 처리하게) 하는 LKM/ftrace 레버는 여전히 유효한가? 아니면
   종료 자체(kill/exit_group 차단)가 더 현실적인가? (지난 세션 kill 훅이 혼입 변수였던
   교훈 감안)

출력: 번호별 답변 + 수정 권고 Top3.

codex
1. 컨트롤 전이 시나리오 순위

① 조작된 컨텍스트 복원(`rt_sigreturn`/`setcontext` 계열)

가장 정합적이다. 조작된 프레임이 `pc=entry+4`, `x16=0`, `x30=entry-4`, 정상 `sp`를 한꺼번에 복원하면 모든 모순이 사라진다. 이전 명령 `sub`는 애초에 실행되지 않는다. 런마다 동일한 레지스터 조합이라는 점도 단순 메모리 손상보다 의도적 컨텍스트 합성을 지지한다.

검증:

- 동일 TID의 `__arm64_sys_rt_sigreturn` 및 `restore_sigframe` 전후를 추적한다.
- 복원 직후 `task_pt_regs(current)`가 문제의 튜플과 일치하는지 확인한다.
- 단순 syscall-entry 기록만으로는 복원 전 상태만 보일 수 있으므로, LKM에서 복원 완료 후 레지스터를 읽는 편이 확실하다.

② 의도적인 중간 진입 gadget

가드가 `x16=0`, `x30=entry-4`를 설정한 뒤 `br xN` 또는 `ret xN`으로 `entry+4`에 직접 들어간 경우다. `blr`라면 LR이 호출 위치가 되어야 하므로 현재 LR과 맞지 않는다. 따라서 링크 없는 분기여야 한다.

검증:

- 직전 `rt_sigreturn`이 없음을 먼저 확인한다.
- `acca4` poison 경로에서 `x16/x30` 설정과 `br/ret xN` 종결 패턴을 역추적한다.
- `code_start±4`를 계산하는 명령과 간접분기가 같은 데이터 흐름에 있는지 본다.

③ `jmp_buf`나 자체 저장 컨텍스트의 오염

커널 sigframe이 아니라 사용자 공간의 `longjmp` 유사 복원 루틴이 레지스터를 일괄 복구했을 가능성이다. 결과 형태는 ①과 같지만 `rt_sigreturn` 흔적이 없다.

검증:

- 여러 `ldp/ldr`로 x19~x30, SP를 복원한 뒤 간접분기하는 루틴을 찾는다.
- 전체 GPR에서 연속적으로 복원된 흔적과 컨텍스트 버퍼 포인터 후보를 확인한다.

④ ArtMethod 엔트리포인트 오염

`entry+4` 진입 자체는 설명하지만 LR까지 `entry-4`가 되는 것은 설명하지 못한다. 정상 `blr` dispatch라면 LR은 호출자 코드여야 한다. 별도의 LR 오염 또는 비링크 tail branch를 추가로 가정해야 하므로 우선순위가 낮다.

검증:

- 해당 ArtMethod의 quick entrypoint를 반복 스냅샷해 실제 값이 `code_start+4`인지 확인한다.
- 값이 정상 `code_start`라면 이 가설은 즉시 배제한다.

⑤ ART Nterp/quick trampoline 이상

정상 trampoline도 LR을 메타데이터 주소로 남긴 채 메서드 두 번째 명령으로 진입하지는 않는다. 추가 증거가 없는 한 가장 낮은 후보이다.

2. LR이 `OatQuickMethodHeader`를 가리키는 의미

이 값만으로 “ART가 헤더를 함수 포인터로 로드했다”고 해석하면 안 된다. QuickMethodHeader는 코드 포인터나 return-PC에서 메서드 메타데이터를 찾기 위한 인접 구조이지, 정상 호출의 LR 값이 아니다.

엔트리포인트가 한 워드 어긋나 `entry+4`가 되는 오류는 PC만 설명한다. 현재 상태는 동시에 다음 두 현상을 요구한다.

- 호출 대상: `code_start+4`
- 보존된 LR: `code_start-4`

일반적인 `blr` 하나로는 이 조합이 생성되지 않는다. 따라서 “엔트리포인트 테이블 오염”은 단독 가설로 정합하지 않고, 컨텍스트 전체 조작이나 `x30` 설정 후 비링크 분기가 더 자연스럽다. LR은 정상 ART 구조 사용의 흔적보다 의도적인 표식 또는 별도로 오염된 저장 레지스터일 가능성이 높다.

3. x0~x17 전체를 얻는 실용법

가장 빠른 방법은 동일 `do_mem_abort` 위치에 kprobe event를 3개 두는 것이다.

- A: 공통키(`far/esr/pc/sp`) + x0~x7
- B: 공통키(`far/pc`) + x8~x17
- C: 공통키(`far/pc`) + x18~x30 + `pstate`

PID/TID, CPU, 타임스탬프와 반복된 `far/pc`로 같은 예외를 결합한다. 이벤트별 fetch 제한을 피하면서 코드 변경도 최소화한다.

더 확실한 방법은 작은 LKM kprobe pre-handler에서 `do_mem_abort`의 사용자 `pt_regs` 포인터를 얻어 다음을 하나의 고정 길이 레코드로 저장하는 것이다.

- x0~x30, SP, PC, PSTATE
- FAR, ESR
- PID/TID, CPU, timestamp

긴 `trace_printk` 한 줄은 잘림과 인터리빙 위험이 있으므로 per-CPU 링버퍼나 debugfs binary record가 낫다. kretprobe는 이미 signal 상태가 반영될 수 있으므로 원본 fault 컨텍스트 수집에는 부적합하다. ftrace stack dump도 커널 스택일 뿐 사용자 GPR 대체재가 아니다.

4. 다음 단계 최단 경로

① 먼저 `rt_sigreturn` 여부를 한 번에 판별한다.

`do_mem_abort`, `rt_sigreturn/restore_sigframe`, signal 전달, `exit_group`을 동일 TID 기준으로 묶는다. 여기서 컨텍스트 복원이 확인되면 광범위 syscall 분석 없이 저장 프레임 오염 경로로 바로 좁힐 수 있다.

② 전체 GPR과 fault 직전 짧은 syscall suffix를 수집한다.

여러 런에서 T0 이전의 공통 suffix가 반복되는지 본다. 단, 마지막 syscall은 사용자 공간 트리거의 하한선일 뿐 원인으로 단정하면 안 된다. 공통 suffix가 없다면 트리거가 순수 사용자 코드일 가능성이 커진다.

③ 정적 RE는 `acca4`와 `0x95224`에서 구조체 store를 우선 추적한다.

다음 패턴이 핵심이다.

- x16 슬롯에 0을 쓰는 store
- 저장 PC에 `code_ptr+4`를 쓰는 store
- 저장 x30에 `code_ptr-4`를 쓰는 store
- SP/PC/x30 인접 슬롯을 묶어 쓰는 `stp/str`
- 컨텍스트 복원 직전의 `svc`, `br`, `ret xN`

OLLVM CFG보다 동일 base register에 대한 offset별 store 지도를 만드는 편이 빠르다.

5. 우회 관점

ART FaultManager를 “먼저 처리하게” 만드는 방식은 현재 증거로는 유효성이 낮다. 커널에는 SIGSEGV 핸들러 여러 개의 우선순위를 바꾸는 단순 레버가 없고, ftrace는 관찰 수단일 뿐이다. 또한 이 fault는 정상 stack-overflow probe와 달리 FAR가 0이므로 ART가 정상 스택 오버플로로 수용한다는 보장도 없다.

`kill/exit_group` 차단은 구현은 더 쉽지만 영구 우회로는 부적절하다. 이미 컨텍스트가 오염된 뒤라 프로세스가 멈추거나 다른 종료 경로로 갈 수 있다. 정확한 fault 발생 직후 한 번만 차단하는 것은 인과관계 확인용 실험으로는 가능하지만 “생존 성공”으로 판정하면 안 된다.

실제 LKM 레버의 우선순위는 다음과 같다.

1. `rt_sigreturn` 기반이면 정확한 poison frame의 복원을 선택적으로 차단·교정
2. 직접분기라면 해당 컨텍스트 생성 경로를 무력화
3. 최후에만 exact tuple을 식별해 `do_mem_abort`에서 복구

다만 현재는 올바른 복귀 LR을 모르므로 PC만 `entry`로 되돌리거나 fault를 삼키는 것은 위험하다.

수정 권고 Top3

1. 주가설을 “엔트리포인트 테이블 오염”에서 “조작된 컨텍스트 복원 → 비링크 직접분기 → 엔트리포인트 오염” 순으로 변경한다.

2. 다음 런에서는 full `pt_regs`와 `rt_sigreturn/restore_sigframe` 상관관계만 우선 수집한다. 이것이 가장 적은 비용으로 가설군을 양분한다.

3. 전역 `kill/exit_group` 차단은 제거하고, 필요하면 exact fault tuple 이후의 one-shot 진단 실험으로만 제한한다. 실제 우회는 종료가 아니라 컨텍스트 오염 지점에서 수행한다.
tokens used
22,228
1. 컨트롤 전이 시나리오 순위

① 조작된 컨텍스트 복원(`rt_sigreturn`/`setcontext` 계열)

가장 정합적이다. 조작된 프레임이 `pc=entry+4`, `x16=0`, `x30=entry-4`, 정상 `sp`를 한꺼번에 복원하면 모든 모순이 사라진다. 이전 명령 `sub`는 애초에 실행되지 않는다. 런마다 동일한 레지스터 조합이라는 점도 단순 메모리 손상보다 의도적 컨텍스트 합성을 지지한다.

검증:

- 동일 TID의 `__arm64_sys_rt_sigreturn` 및 `restore_sigframe` 전후를 추적한다.
- 복원 직후 `task_pt_regs(current)`가 문제의 튜플과 일치하는지 확인한다.
- 단순 syscall-entry 기록만으로는 복원 전 상태만 보일 수 있으므로, LKM에서 복원 완료 후 레지스터를 읽는 편이 확실하다.

② 의도적인 중간 진입 gadget

가드가 `x16=0`, `x30=entry-4`를 설정한 뒤 `br xN` 또는 `ret xN`으로 `entry+4`에 직접 들어간 경우다. `blr`라면 LR이 호출 위치가 되어야 하므로 현재 LR과 맞지 않는다. 따라서 링크 없는 분기여야 한다.

검증:

- 직전 `rt_sigreturn`이 없음을 먼저 확인한다.
- `acca4` poison 경로에서 `x16/x30` 설정과 `br/ret xN` 종결 패턴을 역추적한다.
- `code_start±4`를 계산하는 명령과 간접분기가 같은 데이터 흐름에 있는지 본다.

③ `jmp_buf`나 자체 저장 컨텍스트의 오염

커널 sigframe이 아니라 사용자 공간의 `longjmp` 유사 복원 루틴이 레지스터를 일괄 복구했을 가능성이다. 결과 형태는 ①과 같지만 `rt_sigreturn` 흔적이 없다.

검증:

- 여러 `ldp/ldr`로 x19~x30, SP를 복원한 뒤 간접분기하는 루틴을 찾는다.
- 전체 GPR에서 연속적으로 복원된 흔적과 컨텍스트 버퍼 포인터 후보를 확인한다.

④ ArtMethod 엔트리포인트 오염

`entry+4` 진입 자체는 설명하지만 LR까지 `entry-4`가 되는 것은 설명하지 못한다. 정상 `blr` dispatch라면 LR은 호출자 코드여야 한다. 별도의 LR 오염 또는 비링크 tail branch를 추가로 가정해야 하므로 우선순위가 낮다.

검증:

- 해당 ArtMethod의 quick entrypoint를 반복 스냅샷해 실제 값이 `code_start+4`인지 확인한다.
- 값이 정상 `code_start`라면 이 가설은 즉시 배제한다.

⑤ ART Nterp/quick trampoline 이상

정상 trampoline도 LR을 메타데이터 주소로 남긴 채 메서드 두 번째 명령으로 진입하지는 않는다. 추가 증거가 없는 한 가장 낮은 후보이다.

2. LR이 `OatQuickMethodHeader`를 가리키는 의미

이 값만으로 “ART가 헤더를 함수 포인터로 로드했다”고 해석하면 안 된다. QuickMethodHeader는 코드 포인터나 return-PC에서 메서드 메타데이터를 찾기 위한 인접 구조이지, 정상 호출의 LR 값이 아니다.

엔트리포인트가 한 워드 어긋나 `entry+4`가 되는 오류는 PC만 설명한다. 현재 상태는 동시에 다음 두 현상을 요구한다.

- 호출 대상: `code_start+4`
- 보존된 LR: `code_start-4`

일반적인 `blr` 하나로는 이 조합이 생성되지 않는다. 따라서 “엔트리포인트 테이블 오염”은 단독 가설로 정합하지 않고, 컨텍스트 전체 조작이나 `x30` 설정 후 비링크 분기가 더 자연스럽다. LR은 정상 ART 구조 사용의 흔적보다 의도적인 표식 또는 별도로 오염된 저장 레지스터일 가능성이 높다.

3. x0~x17 전체를 얻는 실용법

가장 빠른 방법은 동일 `do_mem_abort` 위치에 kprobe event를 3개 두는 것이다.

- A: 공통키(`far/esr/pc/sp`) + x0~x7
- B: 공통키(`far/pc`) + x8~x17
- C: 공통키(`far/pc`) + x18~x30 + `pstate`

PID/TID, CPU, 타임스탬프와 반복된 `far/pc`로 같은 예외를 결합한다. 이벤트별 fetch 제한을 피하면서 코드 변경도 최소화한다.

더 확실한 방법은 작은 LKM kprobe pre-handler에서 `do_mem_abort`의 사용자 `pt_regs` 포인터를 얻어 다음을 하나의 고정 길이 레코드로 저장하는 것이다.

- x0~x30, SP, PC, PSTATE
- FAR, ESR
- PID/TID, CPU, timestamp

긴 `trace_printk` 한 줄은 잘림과 인터리빙 위험이 있으므로 per-CPU 링버퍼나 debugfs binary record가 낫다. kretprobe는 이미 signal 상태가 반영될 수 있으므로 원본 fault 컨텍스트 수집에는 부적합하다. ftrace stack dump도 커널 스택일 뿐 사용자 GPR 대체재가 아니다.

4. 다음 단계 최단 경로

① 먼저 `rt_sigreturn` 여부를 한 번에 판별한다.

`do_mem_abort`, `rt_sigreturn/restore_sigframe`, signal 전달, `exit_group`을 동일 TID 기준으로 묶는다. 여기서 컨텍스트 복원이 확인되면 광범위 syscall 분석 없이 저장 프레임 오염 경로로 바로 좁힐 수 있다.

② 전체 GPR과 fault 직전 짧은 syscall suffix를 수집한다.

여러 런에서 T0 이전의 공통 suffix가 반복되는지 본다. 단, 마지막 syscall은 사용자 공간 트리거의 하한선일 뿐 원인으로 단정하면 안 된다. 공통 suffix가 없다면 트리거가 순수 사용자 코드일 가능성이 커진다.

③ 정적 RE는 `acca4`와 `0x95224`에서 구조체 store를 우선 추적한다.

다음 패턴이 핵심이다.

- x16 슬롯에 0을 쓰는 store
- 저장 PC에 `code_ptr+4`를 쓰는 store
- 저장 x30에 `code_ptr-4`를 쓰는 store
- SP/PC/x30 인접 슬롯을 묶어 쓰는 `stp/str`
- 컨텍스트 복원 직전의 `svc`, `br`, `ret xN`

OLLVM CFG보다 동일 base register에 대한 offset별 store 지도를 만드는 편이 빠르다.

5. 우회 관점

ART FaultManager를 “먼저 처리하게” 만드는 방식은 현재 증거로는 유효성이 낮다. 커널에는 SIGSEGV 핸들러 여러 개의 우선순위를 바꾸는 단순 레버가 없고, ftrace는 관찰 수단일 뿐이다. 또한 이 fault는 정상 stack-overflow probe와 달리 FAR가 0이므로 ART가 정상 스택 오버플로로 수용한다는 보장도 없다.

`kill/exit_group` 차단은 구현은 더 쉽지만 영구 우회로는 부적절하다. 이미 컨텍스트가 오염된 뒤라 프로세스가 멈추거나 다른 종료 경로로 갈 수 있다. 정확한 fault 발생 직후 한 번만 차단하는 것은 인과관계 확인용 실험으로는 가능하지만 “생존 성공”으로 판정하면 안 된다.

실제 LKM 레버의 우선순위는 다음과 같다.

1. `rt_sigreturn` 기반이면 정확한 poison frame의 복원을 선택적으로 차단·교정
2. 직접분기라면 해당 컨텍스트 생성 경로를 무력화
3. 최후에만 exact tuple을 식별해 `do_mem_abort`에서 복구

다만 현재는 올바른 복귀 LR을 모르므로 PC만 `entry`로 되돌리거나 fault를 삼키는 것은 위험하다.

수정 권고 Top3

1. 주가설을 “엔트리포인트 테이블 오염”에서 “조작된 컨텍스트 복원 → 비링크 직접분기 → 엔트리포인트 오염” 순으로 변경한다.

2. 다음 런에서는 full `pt_regs`와 `rt_sigreturn/restore_sigframe` 상관관계만 우선 수집한다. 이것이 가장 적은 비용으로 가설군을 양분한다.

3. 전역 `kill/exit_group` 차단은 제거하고, 필요하면 exact fault tuple 이후의 one-shot 진단 실험으로만 제한한다. 실제 우회는 종료가 아니라 컨텍스트 오염 지점에서 수행한다.
