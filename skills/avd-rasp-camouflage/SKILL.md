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
`~/Downloads/toss/` 하위에 있다. STATUS.md가 단일 진실 소스다.

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
  요구해 "no ES 3 support" 시스템 크래시 루프(5차 실측 + S144 6차: 호스트 rename과 게스트
  즉치 파서 동시 패치해도 동일 크래시 — ES3 게이트는 별도 입력 존재). ★S144 신지식:
  (a) 게스트 파서 = libOpenglSystemCommon .text의 mov/movk **즉치빌드 접두사 검색**
  (데이터 문자열 패치 불가, 레지스터 무관 최소 5클러스터), (b) 부트 가시 /vendor = dm-4←
  **vda2(system.img)** — vendor.img(vdc)는 dm-33 전용, 이미지 패치는 system.img로,
  (c) 호스트 송출 문자열 중립화 자체는 검증됨(QCOM_ADREN0_ 송출 실측). **S146 완료: 게스트 GLESv2
  반환경로 필터 실전 배치** — s_glGetStringi 리다이렉트(idx0=정적/idx≥1=NULL)+VENDOR/RENDERER
  "Adreno (TM) 740" 정적 패치. 렌더링 정상. 단 판정 불변.
- **ELF dynstr 심볼 무분별 rename 금지** — .gnu.hash와 불일치 → "load_driver: unknown" SF 크래시(S146 실측).
  문자열 세척은 .rodata 한정(섹션 파싱 후). 잔여 구조 잠김 텔 = dynstr 심볼 + "emugl*" 와이어 서비스명.

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
- 토스 libea56 RE 워크플로(누적기 판정 구조): 워크스페이스 `toss-rasp/FINDINGS.md` §12-13
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
| `scripts/toss_fault_resolve.sh` | faultdump 등장 감시→컬렉션 창(~12s) 내 /proc/pid/maps 즉시 캡처→SFI11/SFO·fault 주소를 모듈로 resolve (22차). OAT는 vaddr→파일 offset 변환 포함 |
| `scripts/sigchain_dump.sh` | fault 창에 libsigchain rw(SignalChain 배열) 덤프→실행매핑 포인터 분류 — SIGSEGV 체인의 실제 핸들러(libsigchain+0x208c→libbugsnag-ndk+0x5ba60) 식별 (23차) |
| `scripts/stack_dump2.sh` | fault 창 스택 덤프(sp±16KB) — 크래프트 복귀 pc의 스택 유래 여부 판별. dd는 반드시 페이지 단위 seek(toybox 큰 skip 실패) |
| `scripts/exit_trap.js` | **원본 앱 종료 차단 정밀 개입(25차)** — frida attach(기동~3.5s, spawn은 무력화됨)로 System.exit/Runtime.exit 오버라이드 차단 + UEH 감시 + Java 스택. 토스에서 Runtime.exit(0) 차단 시 프로세스 7분+ 생존 실측. pid 탐색은 uid 기반(cmdline 위장 대비) |
| `scripts/patch_bind_egl_literals.py` | .vl64 egl `_adreno` 사본 3종의 `emulation` 리터럴 제거(19차) — hide_kmod emulation deny와 공존하기 위한 필수 패치. 멱등, .bak_* 보존 |

~~eglflip.sh~~ / ~~egl_alias.sh~~ — **폐기**(실측: egl 런타임 위장은 다른 앱 GL 초기화를 깬다).

스크립트는 `~/.zcode` 캐시가 아니라 이 스킬 디렉토리에 있으므로, 디바이스로 push할 때
절대경로로 접근한다. LKM .ko 는 워크스페이스 `avd-camouflage/lkm/hide_kmod.built.ko`
에서 push한다 (커널 버전이 다른 AVD면 `build-in-docker.sh` 로 재빌드).
| `scripts/build_indirect_edges.py` | Hikari IndirectBranch 타깃 복구(29차) — RELATIVE 7,314 text-target + adrp/add/ldr/br 정적 매칭으로 edge 생성(412/5,329). Ghidra xref 주입 입력. ADRP는 PC-상대 |


## §149 성과 요약 (2026-09-30)
- **TAMPER_CERT = 원격 인증서 고정**: Crosscert ToolkitManager가 서버에서 받은
  인증서 목록과 설치 APK 인증서 비교 → 불일치 시 글로벌 kill flag → System.exit(0)
- **EMULATOR 체크는 Java 코드상 전부 클린** (ro.product.* 값 매칭 + native 파일 체크)
- 5개 DetectFactor 중 HOOK/VIRTUAL_ENVIRONMENT/DEBUGGER는 하드코딩 null (릴리스 비활성)
- 결론: 15s 사멸의 근원은 환경 채널이 아니라 인증서/서버 통신 채널일 가능성 최유력
- 방법론: dexguard-reVERSE 스킬 §7d-7f 참조

## §151 성과 요약 (2026-09-30)
- **사멸 최종 경로 확정(4련 A/B)**: exitPlan=EXIT/caller=RASP는 서버·크래시와 무관한
  **순수 로컬 네이티브 판정**(T+11s System.exit). 서버 403은 별도 채널(Build 텔레메트리
  누출 — zygote 재시작으로 Build 갱신 시 미재현).
- **webview_zygote 만성 아브로트 고침**: §139의 trace_marker chmod 600이 forkApp
  ReopenOrDetach를 EACCES로 죽임 → chmod **666**(앱 write는 LKM path_blocked가 차단,
  부작위 없음). 크래시 3건→0건, 샌드박스 폴백(in-app fork → binder-after-fork 가드 자폭) 소멸.
- **goldfish 힙 유출 근절**: 앱 힙의 RRO binder 파셀에 goldfish 오버레이 패키지명+경로
  유출(pm hide·getdents로 못 막음) → system.img 수술: dirent 비(非).apk 확장자로 PMS
  스포캔 제외 → 패키지 소멸·힙 0건. 백업 system.img.pre_s151_backup.
- **boot_recover**: [8b] 666 교정·[11] zygote 리프레시 신설. **adb 다중 디바이스 시
  ANDROID_SERIAL=emulator-5554 필수**(미지정 시 4.5분 헝).
- **잔여 텔(차기 과제)**: 매핑된 enc 랜덤사본의 .dynstr 심볼(goldfish_*)·와이어 서비스명
  (emugl*) — 포스트링크 런타임 스크럽(마지막 .so의 init_array에서 mprotect→동일길이
  치환→mprotect)이 다음 수. 판정은 아직 불변(15s).
- DEBUGGER 인자 해독 완료: isDebuggerConnected/waitingForDebugger + ftrace 파일 3종
  (current_tracer=="nop"/ftrace_enabled=="1"/tracing_on=="1") — camo33 전부 클린.
  §149 "VIRTUAL_ENVIRONMENT 정적조건"은 오독(실체=classes27 Thread, native 복호화).

## §154 성과 요약 (2026-10-01) + 신규 금지
- **토스 가드 자기검사 시퀀스(3런 재현)**: T+2-3s process_vm_readv로 ART 메타데이터 포인터 체인
  (boot-framework.art→boot.art→LinearAlloc→자바힙, rlen=4×6) 검사 → 직후 자기 .text 316페이지 1바이트
  무결성 스캔(rlen=1×632) → 정확히 9.7s 후 fork 자식 정리+getuid/writev×2+exit_group(0).
- **★금지: 타깃 uid의 process_vm_readv 차단/위장 금지** — hide_kmod `pvm_block=1`(EFAULT 위장)로 시험 결과
  **2-3s 즉시 판정 발화(fail-closed)** 3런 재현. 검사 실패 자체가 변조 신호 — 우회 수단이 될 수 없음.
- **ftrace 관측면 소진**: T+3~10s(판정 계산 구간)에 syscall/파일/프롭 흔적 없음 = 입력은 프로세스 내 메모리
  직접 검사. 다음 관측기 = hwbp watchpoint(hide_kmod hwbp_pid/hwbp_addr) 또는 ART 구조 오프셋 의미 분석.
- 도구: 워크스페이스 `tmp-artifacts/tools/guard_capture.sh`(pvm 원격주소 kprobe 캡처),
  `guard_probe_dump.sh`(프로빙 주소 페이지 덤프), `launch_stats_bash3.sh`.

## §154 추기3 (2026-10-01) — ART 정상 동작 vs 가드 신호 구별법
- **fault/SignalHandler/SafeCopy 관측은 ART 정상 동작일 수 있다**: 인터프리터 암묵적 널체크 트랩
  (boot-framework.oat pc) → libsigchain → art::SafeCopy(boot.art/힙 안전 읽기) → ExecuteSwitchImplCpp 복귀 —
  전부 시스템 소속. **핸들러/pc/lr의 모듈 resolve를 해석 이전 단계로 의무화** (boot 이미지 매핑대 0x70-0x72xxxxxx는
  고정 주소 — "런 간 동일"이 곧 가드 흔적이 아님).
- 부트 이미지 매핑대: boot.oat/boot.art/boot-framework.art·oat는 매 부트 고정 주소(ASLR 없음).
- pvm 차단(pvm_block=1) 재해석: ART NPE 처리 파손 — 어차피 금지.

## §156 성과 요약 (2026-10-01 저녁) + 신규 금지/레시피
- **★금지: exit_block 상시 무장(런 시작부터 =1)** — 가드의 루트프로브 자식(`which`/`cmd`, T+1.2s exit_group)이
  SIGSTOP 동결 → 부모가 무응답을 변조로 해석 → fail-closed 조기 사멸. **동결 포렉식은 T+1.5s 지연 무장**:
  자식 exit 후 무장 → 메인 자연 exit(에스컬레이션 시대 T+2.3-2.6s)만 동결 → **100s+ 안정 창 4/4 재현**
  (`tools/restricted_run.sh v2`). 조기 동결(스플래시 중)은 ANR 트리거가 없어 사실상 무제한.
- **★toybox dd 함정: skip×bs가 32비트 오버플로** — 0x7b28… 고주소 매핑(.so rw 전부) 덤프가 조용히 실패
  (0바이트 또는 0충전). dalvik 힙(<4GB)만 종래 dd로 읽힘. **고주소는 `scripts/memread.c`** (정적 aarch64,
  `docker run --rm -v /tmp:/src gcc:14 cc -static -O2 /src/memread.c -o /src/memread` → push).
  과제: verdict_forensics.sh·gtd 계열의 고주소 리전 덤프는 전부 이 버그에 무효였음.
- **AM 잔존 ProcessRecord 함정**: 동결/ANR 경위 프로세스가 정상 사망 처리 없이 사라지면 그 패키지의
  am start가 전부 취소됨("refused to die" + "top-most instance" 경고, pidof 비어도). **해법: 에뮬 재부팅**.
  동결 프로세스 정리는 반드시 am force-stop(raw kill 금지).
- **부트 리시버 레이스**: 부팅 중 금융앱이 리시버로 자동 시작 중일 수 있음 — am start가 신규 스폰 대신
  기존 인스턴스에 전달되어 pidof 폴링이 NOPID 오판. 런 전 am force-stop(+필요시 -S) 방어.
- **판정 완료 후 메모리는 이미 와이프**: libea56 rw(.data+.bss)가 exit 시점 전체 0 — 사후 포렉식은
  Java측(logstore 버퍼 등)만 유효, 네이티브 상태는 판정 이전 관측(hwbp) 필요.
- **dword 정책 채널(§156 확장)**: 경로(다이얼로그/직접) + **지연(0s~10s)** — 반복 [EMULATOR] 보고 누적 후
  하루 만에 11s→2.3s 즉시킬로 에스컬레이션 실측 [S]. 다이얼로그 재현은 서버 message_present 비트 필수
  (오프라인 dword 조작만으론 불가). "오전 재현이 저녁에 안 되면" 서버 정책 변화를 먼저 의심하라.

## §157 성과 요약 (2026-10-01 심야)
- **토글 A/B 우선 법칙**: 시간 상관 기반 가설("서버 정책이 변했다")은 한 번의 통제 토글(동일 상태에서 차단만
  on/off)으로 기각/확정된다 — §156 [S]가 §157에서 즉시 기각. **상태 의존 가설 → 먼저 토글 실험**.
- **집행 타이밍 = 네트워크 보고 체인**: REJECT 차단(즉시 실패) 1.5-1.9s vs 무차단 ~11.5s (동일 dword 3+3런).
  **연구 창 확보엔 네트워크 ON**; 차단은 사멸을 가속한다. §155 "신선+차단=11-12s"는 DNS웨지식 느린실패와의 혼동.
- **시간 측정 경로 소거 순서(불가시성 증가순)**: 네이티브 MRS(정적 스캔) → libc PLT(live 후킹+모듈 범위 필터) →
  Java(live 스택샘플+jadx 대조 — `elapsedRealtimeNanos()>0?1:0` 류는 DexGuard 상수폴딩 오브퓨스케이션) →
  **vDSO 직접호출(auxv base+BLR)** → 클럭프리 상대타이밍. frida 모듈 목록엔 [vdso] 없음 — maps에서 base 주입.
- **attach_run.py 함정**: PATH에 adb 없으면 서브프로세스 실패가 조용히 묻힘("no pid" 오탐) — pyenv+platform-tools
  PATH 세팅 후 실행. adb shell 중첩 인용은 list 형식 또는 `su 0 cat …` 직통으로.
- **반복 frida attach 후 am start timeout**(AM 킬) → 부트 경계 회복. 세션당 attach 절제.

## §158 성과 요약 (2026-10-01 심야 2차)
- **톰브스톤/이벤트 크래시 해석 법칙**: 가드는 자신/자식의 cmdline을 위장(bluetooth 등) — 크래시 원인 분석은
  pid+uid+타임스탬프 교차검증. "시스템 앱 부트 노이즈" 오판 주의.
- **하루 보고 런 예산**: 반복 [EMULATOR] 보고 후 사망 경로가 드리프트(Java exit→네이티브 포이즌 즉사) 관찰 —
  통제 실험은 무보고 조합(iptables+clock만료)으로.
- **frida adb forward는 부트마다 소멸** — attach 전 `adb forward tcp:39871 tcp:39871` 재확인.
- E4 도구 완성: `tools/hook_vdso_plus.js`(vDSO+PLT 동시·exit_trap 생존·60s 틱) — 정상화 후 즉시 재사용.

## §159 성과 요약 (2026-10-01 심야 3차)
- **네거티브 유효성 법칙**: 관측기(훅)가 대상(모듈 로드)보다 먼저 arm돼도 **모듈 범위 필터가 null 고정**이면 결과가
  전부 0으로 나온다 — 조기 attach 스크립트는 모듈 지연해석(100ms 폴링) 필수. "0 결과는 먼저 의심".
- **vDSO ELF는 섹션헤더 없음** — 심볼 파싱은 PT_DYNAMIC → DT_SYMTAB/DT_STRTAB 경로가 정석.
- **메인 libea56은 시간 API를 전혀 호출하지 않음 [C]**(3세대×10.7만 회, PLT+vDSO 동시 감시) — 시계 기반 타이밍
  측정 가설의 마지막 관측 가능 경로 소멸. 잔여: fork 자식 / vvar 직접판독 / 클럭프리.
- **재attach 루프 러너**: 사망→재기동→신규 pid 재주입으로 1런 다세대 관찰(hook_vdso_plus.js v3).
- **집행 경로 드리프트는 한시적**(2-3분 자연 회복) — 재발 시 시간 경과 관찰 후 재실험.

## §160 성과 요약 (2026-10-01 심야 4차)
- **관측 순서 정석**: "diff로 변하는 곳 지도 → hwbp로 누가 쓰나" — diff가 무변화를 증명하면 hwbp 타깃 자체가 소멸
  (네거티브도 정보). 이번: rw-diff 상 판정 시점 쓰기 0 → rw 전역 hwbp 불필요 판정.
- **이 시대 판정 타임라인**(frida 관찰): 스캔 T+0.9-1.0s(afed8(0,…) 50+) → afed8(4) 킬진입 T+1.0s → 사망 ~2.3s,
  가드 스레드 단일 tid. 관측 창은 T+0.5-2.3s로.
- frida 관찰 런의 사망은 native 경로(~2.3-4.6s) — Java exit 함정으로 창 연장 불가(§143 관찰자 효과 사망경로 전환).
- rw-diff 유일 활동: T+1.0s 복호화 어휘 기입(selinux/load, reflect/Field 시그니처 등) + T+1.4s 0x174008+ 제로화.

## §161 성과 요약 (2026-10-01 심야 5차)
- **★모듈 init 최소 법칙**: module_init에서 프로브 등록·동적 심볼 해결(kallsyms_lookup_name kprobe 트릭 등) 금지 —
  init 데드락 = 게스트 소프트락 = 재부팅으로만 회복(실측 사고). 주소는 userspace 파라미터 전달, 주기 작업은
  지연워커(v4.22a 패턴). tick 컨텍스트 함수(update_vsyscall)의 kretprobe 등록은 데드락 위험.
- **vdso/vvar 스푸핑 인프라(v4.22a)**: `vdso_page_addr`(/proc/kallsyms, kptr_restrict=0 필요) → vdso_mult/shift/mode
  → vdso_spoof. 검증: `scripts/vdso_check.c`(auxv→vvar mult/shift 판독, docker gcc:14 정적 빌드).
- **vvar mult 판독 가설 기각 [C]**: 24→19.2MHz 인코딩 스푸핑(프로세스 가시 검증 완료)에 판정·타이밍 완전 불변.
- **adb 취소 데드락**: 사용자 입력으로 인한 명령 취소가 in-flight adb를 뭉개 adbd offline화(호스트 리셋 무효,
  에뮬 재시작으로만 회복) — 장기 작업은 진성 백그라운드 태스크 + 로그 파일 폴링. 재부팅 후 구 백그라운드 태스크
  잔존 확인(이중 복구 경합 사고).

## §162 성과 요약 (2026-10-01 심야 6차)
- **관측 도구 진화**: 인자만 보던 훅(§160)에서 **진입 시 버퍼 내용물 덤프**(hook_afed8_peek.js)로 — 관측 대상의
  '실물 데이터'를 보면 지도가 필요없어진다. afed8 스캔 입력 = 프로퍼티 이름/값 힙 사본(가드 조회 리스트 ~40종 노출).
- **판정 스캔 = 프로퍼티 체계 원시 메모리 순회** [C] — §139의 직접 mmap 채널이 판정의 실체였을 가능성 최유력.
  발화 체크는 '값' 아님(API 전건 클론+토큰 잔재 0) → 트라이/톰스톤/미복호화 패턴 후보 [O].
- 0x5C000000(스캔 상한)은 코드 리터럴 아님 — ART 구조 체인에서 획득(§154 pvm 관찰과 정합).

## §163 성과 요상 (2026-10-02 심야)
- **스크럽 유효기간 법칙**: init이 다시 쓰는 프로퍼티(init.svc.*/init.svc_debug_pid.*/ro.boottime.* — 서비스 상태·
  부팅기록)는 부팅 후반 재기입으로 §141 스크럽을 무력화한다 — 카모 체크리스트에 "부트 완료 후 재검증" 필요.
  발견된 부활분: init.svc.ranchu-setup, ro.boottime.ranchu-setup, vendor.qemu.dev.bootcomplete 등 4건.
- **원시 영역 진단 표준**: /dev/__properties__ 통덤프 → 토큰 grep(대소문자 무관, property_info 포함 — 컨텍스트
  등록명 qemu_hw_prop 등도 실기기 불존재 증거).
- **컨텍스트 파일 삭제는 부트 경계에서만** — 운용 중 삭제+토큰 치환은 가드 fail-closed 급사(~1.2s) 유발 관찰.
- **급사 시 라벨 해석 주의**: 후속 라벨(handleExitPlan)이 못 씌므로 마지막 라벨≠발화 체크.

## §164 성과 요약 (2026-10-02 심야 2차)
- **frida 생명주기 원칙(정정)**: "기동 무해"는 기동 직후 짧은 창만 — 수 분 후 스폰 크래시 시대 유발, 종료 즉시
  회복. **per-run: 켜자마자 1실험 → 즉시 kill**.
- **관측 필터 법칙**: 버퍼 덤프 사이즈 상한이 정보를 가린다 — 실물 확인까지 상한을 넓혀 재실험하라.
- libea56 내부 진입점: +0x10953c(/proc/self/status 파서·TracerPid), +0xb6708(/proc/self/maps 파서).
- boot_recover [6b2]: 부활 에뮬 프로퍼티 4건 재삭제 스텝(§163) — 매부팅 자동.
