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

## §165 성과 요약 (2026-10-02 심야 3차)
- **★hwbp 쓰기감시(type=1)는 arm64에서 exclude_kernel=1 필수** — 없으면 커널+유저 감시 이벤트가 조용히 무장실패
  (selftest로 발견; v4.23 수리·검증). **관측기는 사용 전 known-good 자체검증이 의무**.
- **406만 히트급 워치포인트는 printk 전량 로깅 불가**(링 전멸) — v4.24 패턴: 1/65536 샘플 + 꼬리 512 버퍼(해제시 덤프).
- **0x183660 = 디스패처 상태 글로벌**(afed8 row/col원) — 킬 체인에서 수백만 회 전이. 실행경로 트레이스용.
- 작성 스레드는 런마다 상이(스레드 로또) — 스윕으로 특정 필요. 후보 우선순위: dword/internal/Thread-N/RxCached*.
- hwbp 계열 스크립트의 dmesg 판독에는 su 필수(누락 발견).

## §166 성과 요약 (2026-10-02 심야 4차)
- **핫/콜드 런**: 가드의 심층 스캔(0x183660 상태기계 수백만 전이)은 일부 런에서만 실행(관측 ~1/7) — 포획은
  자동 루프 + delta 판정(hits는 누적 카운터).
- **증거 회수 원칙**: 스크립트 시작부 dmesg -C는 직전 런의 증거를 지운다 — 단일 실행→즉시 su 회수.
- 저격 인프라: snipe660.sh(단기생 스레드 등장 즉시 무장)·sweep660.sh(우선순위 순회) — 디바이스 내부 실행 원칙.

## §167 성과 요약 (2026-10-02 심야 5차)
- **arm64 워치포인트 = 스레드 단위 자원** — CPU-광역(perf cpu-bound) 생성은 거부됨. 전-스레드 관측이 필요하면
  페이지 RO 트리프와이어(폴트 개입)를 쓸 것(v4.26 과제).
- **"핫/콜드" 관측은 스레드 로또** — 무장 스레드가 실행자인지만 반영(조건부 경로 아님). 재해석 교훈: 비결정성의
  원인을 '대상의 조건'과 '관측기의 선택' 양쪽에서 검토하라.
- Ghidra: dispatch_resolved.json 핸들러 구간 탐색으로 임의 주소의 소속 핸들러 특정 가능 — decomp_at_create.java.
  단 핸들러 대부분은 트램폴린 — 직독엔 디플래트닝 필요.

## §169 성과 요약 (2026-10-02 오전)
- **★COW 트리프와이어(v4.27)**: VMA 쓰기유지+PTE만 RO → 쓰기 폴트=do_wp_page(COW 자가복구, 앱 무사)+
  do_wp_page kprobe가 전-스레드 pc 관측. arm64 워치포인트 스레드 제약의 완전 우회. 도구 pw_toss{,0}.sh.
- **이 커널(GKI 5.15 CFI)에서 유저 폴트 신호는 force_sig_fault 무경유** (실증: 보장 SIGSEGV에
  force_sig_fault/arm64_notify_die kprobe 0발화, get_signal/prepare_signal만 발화) — 폴트 훅 설계 필독.
- tracefs 메인 인스턴스 버퍼는 웨지 가능(§139 법칙 재확인) — 컨트롤 프로브 정상성 확인 후 실험.
- do_page_fault/handle_mm_fault/__send_sig_info는 kprobe 블랙리스트(NOKPROBE).

## §170 성과 요약 (2026-10-02 오전 2차)
- **트리프와이어 재현성 검증법**: 런 간 pc 집합이 상수 델타(ASLR 시프트)로 평행이동하면 같은 코드 집합 —
  절대 주소 비교 금지, 쌍별 델타로 검증.
- **hits 카운터는 누적** — 실험 판정은 반드시 델타.
- 작성기 정체: 0x93aa0=복호화 루프(테이블 0x2747ba), 0x157200=128B 복사기, 0x101920/0xd1d30=상태·디스패치.

## §175 성과 요약 (2026-10-02) — ★"드리프트 시대"의 정체 = 디스크 풀
- **앱 1-3s 조기 사멸("드리프트")의 근원은 RASP가 아니라 ENOSPC**: `posix_fallocate() failed: No space
  left on device`(Realm DB 생성 크래시, 가드 실행 전) — 덤프 파일 누적(hd 1.5GB 等)이 userdata 100%를 채움.
  **청소(3.2G 확보) 즉시 11.8s 정상 복귀** — §158 이래 "드리프트"로 기록된 현상 전부 소명.
- **진단 순서 법칙**: 조기 사멸 시 logcat am_crash에서 ENOSPC/Realm부터 확인 → `df -h /data` →
  `/data/local/tmp` 대형 덤프 정리. "드리프트 재부팅 대기"는 디스크가 원인이 아닐 때만 유효.
- boot_recover [0b]: 부팅 직후 디스크 사용률 점검 스텝(상시화).

## §178 성과 요약 (2026-10-02 오후) + 신규 법칙
- **★libea56 바늘 레코드 난독화 완전 정적 해독**: 14패스 TEA족(시드=−14δ, K2표 상수, K1=인접 암호문
  워드) — 파일만으로 평문 복원, 라이브와 바이트 100% 3중 검증. 상세는 dexguard-reVERSE §12.
- **★법칙: /proc/pid/maps rw-p 라인 선택 함정** — libea56의 RELRO(0x170000) 라인은 로드 중 rw-p였다가
  RELRO 적용 후 r--p로 바뀐다. `grep rw-p | head -1`은 시점에 따라 0x170000/0x174000이 달라져
  무장/덤프 주소가 틀린다 → **반드시 `tail -1`(최대주소 rw 라인)**. 0힛 캡처가 나오면 먼저 이 함정 의심.
- **★법칙: toybox 32비트 절단** — printf '%x'와 $((16진)) 산술이 36비트 주소(0x7xxx_xxxx_xxxx)에서
  상위 절단. 고주소 계산은 `printf '%x%08x' $((A>>32)) $((A&0xffffffff))` 또는 상/하위 분할+awk.
- **법칙: 로드타임(≤2ms) 복호기는 userspace 경쟁으로 못 잡는다** — maps 등장→첫 관측 사이에 완료.
  트리프와이어 정상 무장 후 0힛 = 복호가 무장 이전(로드타임)이라는 뜻. 관측하려면 RELRO-mprotect
  kprobe 시점 자동무장(단, 미폴트인 페이지는 PTE-RO 불가 → VM_WRITE 클리어 희생런+prepare_signal
  회수 설계, FINDINGS §178-6) 또는 에뮬레이터 실경로 진입이 필요.

## §179 성과 요약 (2026-10-02 저녁) + 신규 법칙
- **★판정창 힙 교차검증법**: 런 중 T+4.5s에 dalvik(+라벨 영역!)·anon rw 전역 캡처 → 바늘 213종 부분매칭.
  라벨 없는 anon만 잡는 종래 필터는 [anon:dalvik-*] 누락(§151 오판의 원인) — 라벨 포함 정규식 필수.
- **★법칙: 가드는 자기 GL 스택을 변조감지한다** — /proc/pid/mem 쓰기는 내용 무관(동일바이트 재기입=COW만)
  로 fail-closed 사망. 파일 수술(로드 전 개명)도 2s 무라벨 사망(§156 에스컬레이션과의 구별은 디에스컬
  후 재측정 필수). GL 채널 개입은 이 감지를 먼저 우회해야 함.
- **★법칙: ELF dynstr 개명 수술**: dynsym 순서 불변 필수 → 버킷 보존 개명(새 이름이 원 gnu_hash 버킷에
  해시되도록 변형)+chain/bloom만 재계산. DT_NEEDED 소네임(.so 문자열) 토큰치환 금지(로더 파열).
  DT_SYMTAB=태그6(11=DT_DEBUG), gnu_hash 32비트, chain값=자기해시, hw/ 재귀 포함, 웹밖 임포터
  (audioserver/SF) 보유 lib(codec2/RIL/HAL)는 수술 불가. 도구 tmp-artifacts/tools/dynstr_surgery.py.
- **법칙: 2s 무라벨 사망 시대 = §156 보고예산 에스컬레이션** — 월드 롤백과 무관. 측정 실험 전날 25+런을
  돌렸으면 익일 디에스컬레이션 확인 후 실험할 것.
- **법칙**: boot_recover [0b]이 *.tar 백업을 지움(수정됨) · stop;start 재시작 크래시≠첫부팅(검증은 풀리부트) ·
  vendor_bind build는 마운트 없는 부트에서만 · [11]은 SKIP_ZR=1로 스킵 가능.

## §180 성과 요약 (2026-10-02 심야) + 신규 법칙
- **★GL 무결성 핀 = 매핑 lib의 dynstr 영역**: 5종 통제실험 — 심볼명 개명(해시 보존 포함)만으로 2s
  fail-closed 급사, .rodata/build-id/미매핑 파일은 자유. 가드는 /proc/self/maps(34회)+디렉터리 열거로
  자기 GL 스택 심볼명을 기대값 대조(§154 법칙의 GL판 — 검사 실패 자체가 변조 신호). GL 텔 중립화로는
  판정 불변(판정 결정 입력 아님) — GL 채널 우회는 런타임 타이밍(LKM copy_to_user 창)만 남음.
- **★ELF 수술 도구 필수 구조(dynstr_surgery.py v2)**: (1) bionic bloom = 단일 워드 `bloom[(h>>6)%size]`에
  `(h%64)|((h>>shift)%64)` 두 비트 모두(워드를 고해시로 나누면 로더가 존재 심볼 거부 → EGL Loader 어보트
  → 시스템 크래시); (2) 다중정의 심볼은 전 정의 lib 버킷 동시 보존(조인트 탐색) — 이 스택은 qemu_pipe*
  등을 lib별 중복 내장; (3) 수술 후 전 정의심볼 bionic 룩업 시뮬레이션 게이트(1건 실패 시 출력 거부).
  독립 검증기 tmp-artifacts/tools/check_gnu_hash.py. NOREHASH=1 모드(이름만·gnu.hash 원본) 지원.
- **★법칙: "부팅 안정"은 마운트 이후 로드 검증이 아니다** — bind 마운트 이후 최초 EGL 초기화 프로세스가
  진짜 로드 시험(SF는 프리마운트 로드로 결함을 숨김).
- **★법칙: /proc/mounts의 bind는 소스 경로가 아니라 장치명 표시**(dm-33=/data) — bind 판정은 grep이
  아니라 뷰 내용(impl-qti 등 뷰 전용 파일 가시)으로.
- **★법칙: .vl64 수술·복원은 마운트 비활성(클린부트) 경계에서만** — 마운트 활성 상태 build는 자기복사
  0바이트화(디렉터리 bind = 소스·타깃 동일 inode). 3중 가드(vendor_bind build inode 동일성 거부·마운트
  전 센티넬 크기·boot_recover [3] 바이트 검증)로 상시 방지.
- **법칙: 크래시 캐스케이드는 첫 사망 타임라인으로 분리** — 앱 급사 → HAL 재시작 폭풍(gralloc-mapper
  missing 등)의 2차 어보트를 원인으로 오독 금지.

## §181 성과 요약 (2026-10-02 심야2) + 신규 법칙
- **★★프로퍼티 메타데이터 = [EMULATOR] 실입력 확정·폐쇄**: 가드는 /dev/__properties__/property_info
  (트라이)+컨텍스트 파일을 이름으로 순회. resetprop은 값만 지움 — **컨텍스트명·트라이 접두어는 이미지
  수술로만 제거**(plat_property_contexts 3라인 + system.img 내장 vendor 8라인, 동일길이 '#' 치환 —
  AVD의 /vendor는 system.img 내장이므로 vendor.img 패치는 무효). 수술 후 라벨 최초 소실(간헐 잔존).
- **★법칙: 판정 입력 A/B는 ≥5런 계열로** — 핫/콜드(§166) 간헐 스캔이 섞인 세계에서 1런 차이는 인과 아님.
- **★법칙: 운용 중 resetprop = 판정 트리거** — 런타임 값 변경/삭제 자체가 탐지(톰스톤/시리얼). 부트
  경계(props-apply+[6b] 스크럽 순)에서만 변경할 것.
- **★법칙: /proc 하위 가짜 bind-mount = 탐지됨** — statfs(파일시스템 지문)·/proc/mounts로 노출.
  procfs 콘텐츠 위조는 LKM read 가로채기 없이 불가.
- **법칙: hw.audioInput/Output=no(에뮬 36.x)는 virtio-snd 장치를 못 지움** — asound 폐쇄는 별도 과제.
- 프로퍼티 계통 스크럽 검증은 getprop이 아니라 /dev/__properties__ 통덤프 스캔으로.

## §182 성과 요약 (2026-10-02 심야3) + 신규 법칙
- **★법칙: 재부팅마다 boot_recover 스킵 금지** — 부트를 수반하는 실험 워크플로에는 복구 단계 필수.
  측정 직전 세계 감사 1줄 의무: `lsmod|grep -c hide_kmod; getprop ro.product.model ro.hardware.egl`
  (이번 오염: LKM=0·model=sdk_gphone·egl=emulation 나이드 세계에서 계열 측정 — §181 rodata 결론 무효화).
- **★법칙: shell-uid am start는 type-3 거짓실패** — ActivityNotFoundException가 나도 su 0 am start는
  정상 동작. 기동 검증/측정 스크립트는 root로.
- **★법칙: 이상 급사 진단 순서** — ①네트워크(§157 가속: DNS 단선이면 1-2s급사 위장) ②에스컬레이션
  (2s 라벨 서명) ③세계 오염(boot_recover 누락) — 그 다음 실험 변수.
- **데이텀: 이미지 수술(프로퍼티 메타데이터)만 있는 나이드 세계에서도 라벨 간헐(2/5)** — 잔여 채널들은
  약한 입력(핫 런에서만 발화).

## §183 성과 요약 (2026-10-02 심야4) + 신규 법칙
- **★법칙: /proc/pid/mem(FOLL_FORCE)은 r-- 파일매핑에도 COW로 쓰기를 한다** — ptrace 브레이크포인트와
  동일 경로. "읽기전용이라 못 쓴다"는 오해 금지 — 커널(LKM) 개입을 결정하기 전 userspace 실측 먼저.
  §180 GL dynstr 핀의 우회 = 순수 userspace 타이밍 스크럭으로 충분: 도구 tmp-artifacts/tools/dynscrub
  (10종 6,343토큰, 281ms, 리드백 검증) + gl_dynstr_scrub.sh 오케스트레이션.
- **★레시피: /proc/asound virtio-snd 텔 제거** — virtio_snd는 로드가능 모듈(사용자 0) → rmmod →
  "no soundcards" + 오디오 HAL 무영향 → /data/adb/service.d/ 부트 영속화. (hw.audio* 플래그는
  에뮬 36.x에서 무효.)
- **법칙: 페이지 단위 adb 왕복은 타이밍 도구가 못 한다** — 시간 제약 조작은 디바이스 내 1프로세스
  바이너리(dynscrub 패턴).
- **법칙: qemu 호스트 스레드 스톨 부트에서 wlan0 디폴트 루트(10.0.2.2)가 유실된다** — 이상 급사 시
  `ip route` 점검 먼저(§157 가속 위장). eth0 DOWN은 이 AVD 정상(wifi 세계).

## §184 성과 요약 (2026-10-02 심야5) + 신규 법칙
- **★법칙: 이 환경의 magisk은 스텁 su — /data/adb/service.d 스크립트는 미실행** — 부트 영속화는
  boot_recover 스텝으로만([6b3]: virtio_snd rmmod + wlan0 디폴트 루트 복구 통합).
- **법칙: 백그라운드 자율 실험에 넣기 전 스크립트 재열람** — 직접 테스트한 경로와 스크립트 경로의
  결함 차이(v1 heredoc-stdin)가 오케스트레이터 입력을 오염시킬 뻔함.

## §185 성과 요약 (2026-10-03) + 신규 법칙 — ★정적 해독 완결 + /proc 내용 채널 폐쇄
- **★정적 어휘는 "반쪽 해독"일 수 있다**: final_vocabulary.json(확정 탐지 어휘)의 경로는 평문이나
  **에뮬 태그 13종은 단일바이트 XOR 미해독**이었음. 키 규칙: **col2≤0xff=XOR키, 아니면 해시(0x50~5f
  브루트)**. 복호: generic/emulator/goldfish/chromium/bluestacks/bignox(Nox)/nease.net(MuMu)/nemu(MEmu)/
  generic·vbox86p·google/sdk 핑거프린트/init.svc.qemu-props. 산출 `native-engine/needles_decoded.json`.
  **"확정 어휘"라는 이름을 믿지 말고 비평문 바이트는 전수 재복호하라.**
- **★redirect 추가 ≠ 채널 폐쇄**: 가드 바늘에 /proc/{modules,filesystems,ioports}(경로)+goldfish(태그)가
  있고 라이브 /proc/modules에 goldfish_sync·virtio_* 노출. LKM v4.22가 이 3종 redirect(/dev/.fakemod/
  .fakefs/.fakeio)를 넣었지만 **fake 생성기 누락→ENOENT(반쪽구현)**. **redirect 추가 시 반드시 (a)
  생성기(camow3) + (b) boot_recover 검증 스텝을 같은 커밋에.** camow3 v4.6에 포괄 텔테일 필터 fake
  생성 추가(hide_kmod 자기라인 제거 필수·디코드바늘 0건 검증·§125 0바이트 회피).
- **★가드 커버리지 검증법(앱 실행 불요)**: `target_uids`에 테스트 uid 임시 추가 → 가드 시점의 redirect
  결과를 직접 read. 에스컬레이션/런 예산 0으로 end-to-end 확인(/proc/modules goldfish 0건 실증).
- **★호스트 adb TMPDIR 함정**: 샌드박스 기본 $TMPDIR 쓰기불가 → adb 서버 기동 실패("ADB server
  didn't ACK", 로그파일 open 거부). `export TMPDIR=/tmp`. 출력 거짓/공백 증상은 adbd 웨지(§161)와 유사.
- **★호스트 QEMU 스레드 스톨 = 렌더 크래시 캐스케이드**: "detected a hanging thread 'QEMU2 CPUn'.
  No response for 18s"(호스트 부하 기인) → GPU wedge → 전 앱 RenderThread SIGABRT → screencap 35B/멈춤
  → Toss 1s 급사(판정 아님). **측정 전 `screencap|wc -c`>10KB 건강검진 필수**. 스톨 부팅은 kill→재기동.
- boot_recover [11] `SKIP_ZR` 미설정 변수(set -u) 버그 수리: `[ -z "${SKIP_ZR:-}" ]`. [10] 체크리스트에
  `procfake=OK/OK/OK goldfish잔존=0` 감사 추가.

## §186 성과 요약 (2026-10-03) + 신규 법칙 — "렌더 웨지" 정정·수리 + bind-less 카모 금지
- **★법칙: screencap 0/35B "웨지"의 1순위 감별 = bind 뷰 오염**: `logcat | grep 'gralloc-mapper is
  missing'`와 `HIDL_FETCH_IMapper` abort 톰브스톤을 먼저 본다. HIDL passthrough 스캔은 hw/의
  impl-*.so를 **전부 dlopen**하므로 .vl64 사본의 impl 파일 하나만 abort해도 매퍼 부재 → 그래픽
  스택 전체 사망(SF 살아있음·GL 신원 정상이어도). 호스트 스톨은 공존 노이즈일 수 있다.
- **★법칙: .vl64 무결성 검증 = 스톡 md5 대조**: 리네임(impl-ranchu→impl-qti 등) 제외하고 바이트가
  스톡과 동일해야 한다(§180 수술본이 재빌드에 재유입된 실측 — md5 bc2868cc≠58f7c442 사고).
  클린 재빌드는 반드시 **클린부트(마운트 없음)+스톡 소스**에서.
- **★법칙: bind-less 부분카모에서 앱은 EGL 로딩 자체가 사망** — hide_kmod path_blocked("emulation")
  (uid 10179 게이트)가 앱의 libEGL_emulation.so open을 ENOENT. "GL/디스플레이 제외 카모는 렌더
  안전"은 SF screencap까지만 참. 검증 원커맨더:
  `su 10179 cat /vendor/lib64/egl/libEGL_emulation.so` → FAIL이 정상(차단 확인).
- **★법칙: egl=adreno 세계에는 리터럴 패치가 생명** — 클린 재빌드가 patch_bind_egl_literals를
  잃으면 앱의 libEGL_adreno 내부 dlopen 키("emulation")가 LKM deny로 ENOENT → eglInitialize
  SEGV/SIGABRT(부트리시버 자동시작 크래시로 조기 발견 가능). **build에 패치 단계 영구 통합됨
  (§186)** — 재빌드 후 `strings libEGL_adreno.so | grep -c emulation` = 0 확인.
- **법칙 정정: [11] zygote 리프레시는 표준** — "SKIP_ZR=1 권장"(§185)은 오염 bind 시대의 임시
  수칙. 클린 bind에서 [11]은 렌더 무사(실측)이며 S114 Build.* 누수 방지에 필수.
- **법칙: 고엔트로피 rw 데이터 ≠ 암호** — OLLVM 테이블/글로벌 감별 3단: 확정 포맷 전역 스윕 →
  XOR 브루트 → adrp+add 코드 참조 귀속. 도구 `tmp-artifacts/native-engine/audit_static_complete.py`
  (정적 해독 완결성 감사 — 누락 0건 증명용).
- **부수**: 호스트 부하 절감 위해 미사용 redroid qemu를 monitor quit로 정상 종료 가능(198% CPU
  점유가 측정 창을 오염). Toss 부트 리시버 자동시작은 런 전 force-stop으로 방어(run_measure 내장).

## §186 추기 (2026-10-03 오전) + 신규 법칙 — open/stat 위장 분리 + 가짜 파일 속성 지문
- **★법칙: 경로 존재채널은 open과 stat가 정반대** — stat/access는 acc-stat 훅이 ENOENT 위장해도
  open은 클론 redirect로 '성공'한다. 가드가 open 기반 needle 검사를 쓰면 goldfish 디바이스가
  존재로 판정됨(§186 ftrace로 가드 바늘 스캔 시퀀스 포착). **v4.30 수리: openat flags
  (task_pt_regs->regs[2])로 차별화 — O_RDWR(GL 0x802)만 클론, O_RDONLY 프로브는 /Z.**
  검증: `su 10179 cat /dev/goldfish_sync` → ENOENT / `exec 3<>` → OK / gf_probe_hits 카운터.
- **★법칙: 가짜 파일은 속성이 밀고한다** — redirect된 /proc 가짜는 f_type=tmpfs·st_size≠0·
  st_dev=tmpfs로 proc 아님이 즉시 판별(실기기 /proc 파일은 st_size=0). **v4.31 수리: redirect를
  open 계열 syscall(openat=56/openat2=437, NR=regs[8])에만 적용 — stat/statfs/access는 실제
  proc 파일로 통과.** 잔여 [O]: fstat/fstatfs(fd 기반) 속성.
- **★함정: magisk su의 비-앱 uid 거부** — `su 20179`는 "bad uid"로 실패하고 뒤 명령이 root로
  실행될 수 있다 → 게이트 테스트는 반드시 실제 앱 uid(예: su 10179). 게이트 여부는 stat 기대값
  대조(가짜 ENOENT vs 실존)로 확인.
- **★법칙: [11] stop;start = 프로퍼티 재오염 트리거** — init.svc.ranchu-setup 등 4건+property_info
  트라이 "qemu" 노드(부트마다 오프셋 53404 결정적 출현)가 부활 → **boot_recover [12] 신설**([11]
  후 재삭제+스크럽). 부트 복구의 프레임워크 재시작 뒤에는 항상 프로퍼티 재감사.
- **판정 입력 현재 위치**: 위 4종+기존 전체 폐쇄 후에도 [EMULATOR] 5/5(12s) → 입력은 §154의
  프로세스 내 메모리 검사(미지) — ART 구조 오프셋 의미분석/hwbp가 다음 관측면([O]-1).

## §187 (2026-10-03) — ★[EMULATOR] 판정 소멸: 스푸프는 신원 트리 전체에
- **★★법칙: 가드는 본체-파티션 프롭 "일관성"을 검증한다** — ro.product.manufacturer=samsung으로
  스푸프해도 **ro.product.system.manufacturer="Google"**(파티션 변형 14종)이 남으면 위조로 판정.
  수리: props-apply에 bootimage/odm/product/system/system_ext/vendor/vendor_dlkm 7파티션×
  {brand,manufacturer,device,model,name}+ro.build.host 스푸프. 결과: **5/5 런 40s+ 생존·[EMULATOR]
  라벨 0건**(판정 소멸 — §187 전).
- **★afed8 라이브 캡처 = 최종 진단기**: 정적 바늘 어휘(55종)는 부분집합 — 가드는 일반 신원 프롭
  (ro.build.host 8회, ro.product.system.* 등)도 조회. frida attach(hook_afed8_verdict.js:
  entry=needle 문자열, leave=반환 포인터, non-NULL=매치+값 덤프)로 "무엇이 어떤 값을 반환하나"를
  직접 확인. attach 실패(signal 11)는 부트 상태성 → 재부팅이 최단(§155).
- **★매치 판정 코드 함정**: frida NativePointer.isNull()로 판정 — toString() 문자열 비교("0" vs
  "0x0")는 버그. cat 실패 = read 오류일 수 있어 open 성공과 구별 필요(exec 3< 시험).
- 스플래시 잔존(메인 미전환)은 서버 평면(dword/auth) — 로컬 탐지 소멸과 별개 경계.

## §188 (2026-10-03) — ★FDS 서버 차단 해제: 신원 = MD5(per-app SSAID)
- **★★법칙: 토스 FDS의 기기 신원 = MD5(per-app SSAID)** — 파생 코드 체인: 트래커 페이로드
  deviceId ← `o.RealDrawScopeSizeResolver.onTransact`(seed getter, "seed" 키 MMKV 캐시) ←
  `o.EstimateFaceQualityFromBGRImage.onExtraCallbackWithResult`(MD5-of-string 헬퍼) ← 입력 =
  Settings.Secure android_id = **per-app SSAID**(`/data/system/users/0/settings_ssaid.xml`, ABX,
  서명키 귀속). 검증: MD5("7c5559c1d1c86494")=314872ec…(logstore device_id) 바이트 일치.
- **★신원 회전 레시피**: `cp settings_ssaid.xml …bak; rm settings_ssaid.xml; sync` → 재부팅 →
  시스템이 앱별 새 ssaid 발급 → pm clear 후 기동. **`settings put secure android_id`는 무효**
  (전역값 — 앱은 per-app 값을 읽음), **pm clear도 무효**(SSAID는 서명키 귀속으로 재발급 안 함),
  Widevine 재생성도 무효(파생 입력 아님).
- **★법칙: 서버 200 안의 앱레벨 403** — session/init 제한은 HTTP 200에 errorCode 403 본문.
  헤더 `X-Toss-Tsn`=요청별 nonce, `X-Toss-Tsp`=설치 상수 — 오판 금지. 본문은 tss 암호화
  (ApiCipherInterceptor = o.NativeAdBaseImage, classes14.dex).
- **★DexGuard 난독 클래스 실체 특정法**: `Request$Builder.addHeader` 훅 + 호출 스택 → 난독
  클래스명(o.*) → jadx 트리(grep)에서 열기. 헤더명이 암호화돼 있어도 이 경로는 항상 뚫린다.
- **★digest 동적 추적 함정**: digest() 시 입력 누적 없음 = update가 무장 이전(lazy 초기화).
  인스턴스 추적보다 스택의 헬퍼 메서드를 정적으로 읽는 것이 빠르다(동적→정적 하이브리드).
- 블랙리스트형 서버 차단은 로컬 클린과 독립 — 양쪽 다 닫아야 앱이 동작함(§187+188 실증).

## §189 (2026-10-03 저녁) — 원클릭 재현 배포판
- **★fresh AVD 암묵 의존 3종**: ①/data/local/tmp/magisk(resetprop — 미push 시 props-apply **무음 실패**,
  getprop(model=SM-S916N?)로만 탐지) ②시스템 이미지 수술본(**공유 베이스**에 적용 — 신규 AVD 자동
  상속, 백업 *.pre_s181_backup 존재로 확인) ③호스트 dylib 패치. 원클릭 레시피: oneclick.sh
  (~/Downloads/avd-camoflage — AVD 생성→magisk push→.vl64 빌드→설치(-i vending)→uid 탐지→
  boot_recover→검증).
- **에뮬레이터 디스크 헤드룸**: 부팅에 data(6GB)+~1.4GB 자유 필요 — "Not enough space to create
  userdata partition" FATAL 시 docker 빌드캐시/임시 파일 정리부터.
- 신규 AVD = 신규 SSAID = 신규 device_id(§188) → FDS 블록리스트와 무관하게 시작.

## §190 (2026-10-03 밤) — 시스템 이미지 수술의 스크립트화
- **★scripts/system_img_surgery.py**: §151(골드핏 오버레이 소멸 4건)+§181(프로퍼티 컨텍스트
  3+8+8라인) 수술을 치환 사양(전/후 바이트 쌍)으로 내장 — 백업 3세대 diff 역산, **스톡에서
  적용하면 현재 수술본과 바이트 100% 재현 검증**. verify/apply 모두 mmap 스캔+제자리 pwrite.
- **★법칙: 이미지 수술 = 사양 커밋이 의무** (수행만 하면 GB 배포 또는 재현 불능). 8.6GB 이미지
  공유 대신 12KB 스크립트. 새 머신: 스톡 이미지 + cp -c 백업 + apply system/vendor.
- **★법칙: 대용량 패치는 bytearray 전체 재작성 금지** — 디스크 풀(전체 크기만큼 필요). 테스트는
  APFS clone(cp -c, 0공간)으로.
- **★법칙: 패치 사양엔 why를 같이 내장** — 전/후 바이트만 있으면 재현은 되지만 유지보수 불능.
  각 사양 "why" 필드 = 채널 근거+기법 이유+실측 효과. `--why` 플래그로 확인.
