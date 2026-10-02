# 확정된 탐지 채널과 대응 (2026-09-19 실측)

전부 ftrace kprobe(openat/faccessat 전수), AVC 로그, crash log, abort 메시지로
실측으로 확정된 것들. "탐지 근거 제거" 원칙으로 각각 대응했다.

## 파일/디렉터리 채널 (LKM v3.3이 담당)

| 채널 | 발견 방법 | 대응 |
|---|---|---|
| `/dev/__properties__/u:object_r:*qemu*` 컨텍스트 파일 | 클린런 openat 전수 | LKM deny (프롭 "값"이 아니라 컨텍스트 파일명이 시그니처 — resetprop으로 못 숨김) |
| `/proc/misc`의 `goldfish_pipe/sync/address_space` 3행 | §2.20 vboxguest 힌트 | LKM redirect → /dev/.mi (goldfish/vbox 라인 필터본) |
| **`/proc/modules`의 `goldfish_sync`·`virtio_*` 내용** (§185: 디코드 바늘 경로+태그 goldfish) | final_vocabulary 정적 복호 | LKM redirect → /dev/.fakemod (camow3 v4.6 포괄 텔테일 필터 fake — hide_kmod 자기라인도 제거). **v4.22 redirect는 fake 생성기 누락으로 ENOENT 반쪽구현이었음 → 생성기 필수** |
| **`/proc/filesystems`(virtiofs)·`/proc/ioports`(virtio-pci) 내용** (§185) | final_vocabulary 정적 복호 | LKM redirect → /dev/.fakefs·/dev/.fakeio (camow3 v4.6 virtio/9p 필터 fake) |
| `/dev` 디렉터리 readdir로 goldfish 노드 직접 탐색 | AVC 로그(`open /dev` denied) | LKM filldir64 훅 — 열거 자체에서 항목 제거 |
| `/dev/goldfish*` access/stat 존재체크 | §3 엔진 체크 순서 | LKM do_faccessat/vfs_statx/vfs_fstatat만 -ENOENT 위조. **open은 통과(GL 보호)** |
| `/proc/self/maps`의 frida agent 흔적 | crash/logcat | LKM redirect → /dev/.m (frida/gum 라인 필터본) |
| `/proc/self/mounts`(Magisk 마운트), `net/unix`, `net/tcp`, `cpuinfo`, `version` | §2.20 트리거 | LKM redirect 각각 /dev/.{k,u,t,c,v} |
| `/sys/kernel/tracing/trace` | **엔진이 커널 추적 파일을 직접 열어 안티디버깅 판정(실측)** | LKM deny (/Z) |
| su/magisk/sugote/proca 경로 20여 곳 | §2.20 문자열 덤프 | LKM deny |

## 프로퍼티 채널 (resetprop이 담당 — raw property area 판독자까지 커버)

| 채널 | 실측 값(에뮬) | 위장 값 |
|---|---|---|
| `ro.serialno` / `ro.boot.serialno` | `EMULATOR36X5X1X0` | `RZ8T30A1B2C` |
| `ro.hardware.egl` | `emulation` | 시차 위장: 기동 6초간 emulation(EGL 로더용) → 이후 `adreno` (엔진용) |
| `ro.hardware.vulkan` | `ranchu` | 동일 시차 위장 |
| `init.svc.goldfish-logcat`, `ranchu-net`, `ranchu-setup`, `qemu-*`, `qemu-props` | running/stopped | **삭제** (실기기엔 존재하지 않는 프롭). `init.svc_debug_pid.*` 도 함께 |
| `ro.debuggable` | `1` (adb root 환경) | `0` — 사망 직전 마지막 오픈이 userdebug_or_eng_prop 컨텍스트 파일이었음(실측) |
| `ro.product.*` / `ro.build.*` / fingerprint | sdk_gphone64_arm64 | 삼성 SM-S916N(dm2q) 세트 |
| `ro.kernel.qemu` / `ro.boot.qemu` | 1 | 삭제 |
| `dalvik.vm.isa.arm64.variant` | generic | cortex-a76 |

주의: `init.svc.*` 는 init이 서비스 상태 변화 시 재생성할 수 있다. 재부팅 후
`scripts/props-apply.sh` 재실행.

## 무파일/기타 채널

| 채널 | 대응 | 남은 한계 |
|---|---|---|
| dl_iterate_phdr (링커 soinfo 열거 — frida-agent 노출) | frida 스크립트에서 콜백 래핑해 스킵 (invisify_lite.js) | — |
| Build.* 정적 필드 (zygote가 에뮬 값으로 미초기화) | Java 필드 스푸핑 (invisify_lite.js) | — |
| Telephony (IMEI/IMSI/ICCID/운영사), NetworkInterface(eth0/MAC), DhcpInfo(10.0.2.x) | Java 훅 + LKM SIM ICC 패치 | — |
| 127.0.0.1 능동 WebSocket 핸드셰이크 (GET /ws, User-Agent: Frida) | frida-server를 비표준 포트(47777)로, 이름 /dev/.rs9 | 포트 리스트를 훑으면 뚫릴 수 있음 |
| **mem_scanner — 프로세스 메모리 내 frida 에이전트 문자열 스캔** | **없음** | 프리다 주입 시 즉사의 원인. 에이전트 커스텀 빌드(문자열 리네임) 또는 neutered 빌드 사용 |
| 매니페스트 debuggable 파싱 (XmlResourceParser) | 원본은 원래 release라 무관 / neutered는 debuggable 패치됨 → 이 채널로 탐지됨 | neutered 빌드 분석 시 이 채널은 이미 뚫린 상태로 운용 |

## ★ GPU/GL 신원 — 파일 트레이싱으로 못 잡는 최종 채널 (2026-09-20 확정)

```
GL_VENDOR:   "Google (Apple)"
GL_RENDERER: "Google (Apple), Android Emulator OpenGL ES Translator (Apple M1 Pro),
              OpenGL ES 3.0 (4.1 Metal - 88.1)"
GL_EXTENSIONS: ANDROID_EMU_* 30종 + GL_APPLE_texture_format_BGRA8888 ...
```

- 앱이 `glGetString(GL_VENDOR/RENDERER/EXTENSIONS)` 한 번 호출하면 즉시 노출.
- **호스트 하드웨어/OS까지 누출** ("Apple", "Apple M1 Pro", "Metal" — goldfish GL이
  호스트 드라이버 정보를 그대로 전달).
- **ftrace(openat/prop)로 절대 캡처 안 됨** — GL 쿼리는 syscall이 아님. 경로 기반
  위장을 전부 해도 이 채널 하나로 판정 가능 (하나원큐 실측: 전 채널 커버 상태에서도
  SIGBUS 0x41022 자폭 → 렌더러 문자열만 고쳐서 해소).
- LKM으로 막을 수 없음 (syscall 없음). 유일한 수정점 = **호스트 dylib**.

### ✅ 1단계 (레거시): 렌더러 문자열만 동일 길이 교체
"Android Emulator OpenGL ES Translator" → "Android Mali-G78 OpenGL ES Translator"
→ 하나원큐 10분+ 생존. 단 **SoC 불일치 문제**: dm2q(SM8550)인데 Mali-G78 = 실기기
대비 어긋난 신원. ANDROID_EMU_* 확장은 그대로 남는다.

### ✅ 2단계 (최종): GL 신원 완전 정합화 — 코드 패치
`GLEScontext::buildStrings`(dylib @0x28d014)이 "정적 prefix + 호스트 동적값 + )"를
조립한다 → **동적 append 6곳 NOP + 정적 문자열 동일 길이 교체**:

| 항목 | 패치 전 | 패치 후 |
|---|---|---|
| GL_VENDOR | "Google (Apple)" | **"Qualcomm"** |
| GL_RENDERER | "...Translator (Apple M1 Pro)" | **"Adreno (TM) 740"** |
| GL_VERSION | "...(4.1 Metal - 88.1)" | 유지 (아래 금지) |

사칭 기기 SM-S916N(dm2q=SM8550)의 실제 신원과 완전 일치. 스크립트:
`scripts/patch_dylib_gl_identity.py` (원본 바이트 검증·멱등·자동 codesign).
산출물 예시: 워크스페이스 `host-patch/libgfxstream_backend.dylib.adreno740.patched`.
**검증 실측**: 부팅 정상, 모니모 회귀 없음(120초+). 토스는 그래도 4초 사망 →
vendor/renderer는 단독 판정자가 아니며 아래 "토스 신규 채널"의 누적 판정이 유력.

- ⚠️ ~~GL_VERSION 조립부 제자리 패치 금지~~ → **해결됨 (2026-09-21)**: 1~2차 크래시의
  원인은 version 블록의 **reserve 계산부 NOP**(string 용량 산정 붕괴)이었다. reserve를
  그대로 두고 정적 append만 교체하는 설계면 안전 — `scripts/patch_dylib_gl_version.py`
  (GL_VERSION = "OpenGL ES 3.0 (4.1 V@0615.47)", 부팅 정상 실측).
- ⚠️ ~~ANDROID_EMU_* 토큰 rename 금지~~ → **조건부 해결 (2026-09-21)**: 토큰 문자열은
  **호스트 dylib에만 존재**(게스트 lib·qemu 바이너리 0건 실측)하고 게스트는 이름 매칭을
  하지 않으므로, **호스트 단독 동일 길이 리네임은 기능 무영향** —
  `scripts/patch_dylib_gl_tokens.py` (ANDROID_EMU_→QCOM_ADRENO_, 39개).
  예외 4종은 게스트가 리터럴 파싱하므로 **양측 동일 리네임** 필요:
  `CHECKSUM_HELPER_v1/_v`(libOpenglCodecCommon), `dma_v2`(libGLESv2_enc),
  gles_max_version(libEGL_emulation). 단 **gles_max_version을 호스트에서까지 지우면
  부팅 hang(실측)** — gles_max는 호스트에서 유지할 것.
- ⚠️ 게스트 libEGL_emulation.so 단독 패치 금지 — 호스트와 토큰 불일치로 시스템
  전체 GL 크래시 (실측).
- ⚠️ dylib 교체 후 최초 비정상 크래시 시 crash-report 다이얼로그가 **이후 부팅을
  전부 막는다**(adb 불가처럼 보임 — dylib 불량으로 오행하지 말 것, 2회 오판 실측).
  해소: `rm -rf /tmp/android-1004276/emu-crash-36.5.1.db` + qemu/crashpad 프로세스
  정리 + `~/.android/avd/<avd>.avd/*.lock` 삭제 후 재기동.

## ★ 토스(viva.republica.toss) 신규 채널 — libea56 가드 (2026-09-20 확정)

토스 자체 가드(`im.toss.core.guard.AbsAppGuard` + **libea56.so** 문자열 전량 암호화
+ **libtg.so** 워치독)는 AppSuit류와 다른 채널을 쓴다. fork한 단명 자식 프로세스가
검사를 수행하고, 파이프로 판정을 보고하면 메인이 **memmove에 부정 길이**를 넣어
SIGSEGV 자폭 (RxCachedThreadS에서 관측). 자식은 툼스톤에 안 남으니 ftrace 분석 시
pid 필터 없이 시간창으로 봐야 한다.

| 채널 | 실측 내용 | 대응 |
|---|---|---|
| **프롭 전수 스캔** (`__system_property_foreach` 임포트) | `ro.boot.qemu.*` 12키, `qemu.hw.mainkeys`, `ro.boottime.{qemu,goldfish,ranchu}-*` 8키, `vendor.qemu.*` 5키, 파티션별 fingerprint×8·`ro.product.{파티션}.*` ~21키(emu64a), `ro.build.display.id/description`, `ro.bionic.cpu_variant`, `ro.hardware.audio.primary=goldfish`, `ro.hardware.power=ranchu` | props-apply.sh v2에 전부 통합 (gltransport.name 등은 goldfish-opengl이 default "pipe" 폴백이라 런타임 삭제 무해) |
| **fd 전수 readlink** — `/proc/self/fd/N` ×200+ / `task/*/fd` | fd 링크 타깃에 `/dev/goldfish_pipe` 등 노출 (GL 전송로) | LKM: goldfish 디바이스 open을 클론 노드(/dev/.wq517h 등, mknod 동일 major/minor)로 리다이렉트 → 자기 open분 세탁. **HAL이 열어 binder로 넘긴 8개는 불가**(open 주체가 uid 게이트 밖 + fd 링크는 procfs 생성) |
| **/proc/N/cmdline 전수 스윕** (자식이 수행) | LKM이 타 프로세스 cmdline을 빈 파일로 리다이렉트하면 "전부 빈 cmdline" 자체가 tamper 신호 | 리다이렉트 제거(실제값 노출) — 시스템에 frida/magisk 데몬 등 노출 프로세스 없음을 확인한 상태에서만 |
| **smaps 판독** | LKM이 maps 형식을 서비스하면 형식 불일치 | smaps 전용 위장 파일(smaps 형식 그대로 필터) 서비스 |
| **코어수 3중 채널** — `/sys/devices/system/cpu` 디렉터리 열거(readdir), sched_getaffinity/sysconf, /proc/cpuinfo 블록 수 | 에뮬 실코어 2 + 가짜 cpuinfo가 1블록이면 전부 노출. **경로 위장(LKM)으로 불가 — readdir 결과와 syscall 반환값은 커널 데이터** | 에뮬 config에 `hw.cpu.ncore = 8` (실코어 확장) + cpuinfo 가짜 8블록(Features는 에뮬 실측값 유지 — getauxval(AT_HWCAP) 교차검증 대비) |
| **에뮬 브랜드 패키지** 재노출 | 제거했던 패키지가 복원돼 있을 수 있음 | `pm list packages \| grep -iE 'emulator\|goldfish'` 재확인 후 재제거 |
| **maps/smaps 내 goldfish·emulation·ranchu 라인** (libEGL_emulation.so, /dev/goldfish_address_space 등) | 툼스톤 메모리맵 실측 | camow3 필터에 `goldfish\|emulation\|ranchu\|qemu` 추가 |
| **ANDROID_EMU_* 확장 30종 + phdr의 *_emulation.so** | 3개 GPU 백엔드(Metal/gfxstream, SwiftShader/ANGLE, 렌더러 패치) 모두에서 공통 → GPU 바꿔도 남음 | **로컬 불가** — 토스를 원본으로 살리는 실질 한계. 분석이 목적이면 neutered 빌드 |

토스 원본 시험 결과: 위 전부 + GL 신원 완전 정합화까지 적용해도 **4~10초 내 자폭**.
원본 생존의 로컬 한계 확정 (2026-09-20). 상세는 워크스페이스
`avd-camouflage/analysis/toss-rasp/FINDINGS.md`.

## 최종 확정 채널 (2026-09-20 두 세션 통합 — 하나원큐 기준)

LKM/위장으로 커버된 것에 더해 실측 확정된 추가 채널:
- **su-family × 6 디렉터리** — su 파일뿐 아니라 디렉터리 자체 존재 확인
  (/system/xbin, /sbin, /vendor/xbin 등 6곳). LKM path_blocked가 디렉터리 포함 커버.
- **cpufreq 코어수** — /sys/devices/system/cpu/online|present|possible ("0-1"=2코어는 에뮬텔).
  LKM v3.6.3+ 에서 /dev/.c2("0-7")로 리다이렉트. cpufreq policy 파일 열람도 가능성 있음.
- **AhnLab MSDK ILT 엔진** (하나) — SUarez 워치독(fork/pipe/sigwait/kill)이 판정 후
  kill(9)로 앱 종료. `.su.down` 마커 77회 폴링 관측. LKM 유무 무관하게 발동 →
  커버 불가 채널이 하나 이상 남음.
- **에뮬레이터 브랜드 패키지 13종** — PackageManager 열거로 탐지 가능
  (emulator.multidisplay/radio.config, goldfish_overlay, EmulationPixel* 14종,
  TalkBackOverlay 등). `pm uninstall --user 0` 제거로 채널 폐쇄 완료 (복원:
  `cmd package install-existing <pkg>`).
- **FDS 서버 게이트** — 앱이 IPInside/FDSApi로 기기 지문을 서버에 보내고 서버가
  판정(isBadMph 등). **로컬 위장으로 통과 불가 — 승인 경계.** 메모리 덤프에서
  FDSApi/sendFDSAppInfo/reportRootingPermission + 암호화 텔레메트리 실측.

## 2계층 결론 (프레임)

| 계층 | 원본(벤더서명) | neutered(재서명) |
|---|---|---|
| UI 실행 (에뮬) | fragile하게 가능 — 채널을 다 알아도 goldfish_pipe(open)/cpuinfo 내용/cmdline 유래는 원리적 잔여 | ✅ 안정 |
| 실제 서버 인증/거래 | ❌ 서버 FDS가 에뮬 지문 거부 | ❌ 재서명/서버 거부 |
| 로컬 앱 로직 분석 | 제한적 (UI 관찰) | ✅ frida/트레이싱 |

에뮬에서 할 수 있는 것 = 클라이언트 로직의 로컬 분석까지. 실제 거래 검증은
실기기 + 정식 권한 영역.

## 엔진의 자기파괴 시그니처 (판정 도달 확인용)

- SIGBUS(7) BUS_ADRALN, fault addr `0x41022` / `0x41032` / `0x11012` / `0x13012`
  — 의도적 미정렬 점프. 이 주소 패밀리가 보이면 위장이 하나 새어서 판정까지 갔다는 뜻.
- SIGSEGV(11) MAPERR at `0x000b02020000150c` (libAppSuit 내부) — 같은 자기파괴의 변형.
- 정상 동작 중 죽으면: `references/pitfalls.md` 를 먼저 보고 환경 문제인지 판별.

## ★ 2026-09-21 3차 세션 신규 채널/구조 (토스 libea56 — 전부 실측)

1. **fd readlink 채널의 커널 경로**: `/proc/PID/fd/N` readlink → `proc_pid_readlink →
   d_path`(kretprobe로 실측). HAL이 열어 binder로 넘긴 goldfish fd는 open 주체가
   HAL이라 getname 훅 밖이지만, **표적 uid가 readlink한 결과 문자열은 LKM에서 제자리
   교체 가능** — hide_kmod v4.1의 d_path kretprobe(`dp_hits` 카운터). `/dev/goldfish*`
   → 클론 노드명(/dev/.wq517h 등).
2. **readdir 열거 채널(.so 예외의 역설)**: 가드가 /vendor/lib64를 opendir하면
   libqemupipe.ranchu.so·hwcomposer.ranchu.so 등이 보인다. 구 LKM은 2026-09-19 mapper
   자해 회귀 방지로 .so를 은닉 제외했으나, **앱이 스캔으로 찾는 드라이버 lib를 bind
   사본에서 중립명으로 바꿔놨으면 예외 불필요** — v4.2: 표적 uid 열거에서 텔레텔
   (goldfish/ranchu/qemu) .so도 숨김. 비표적(HAL 서비스)은 필터 밖이라 무영향.
3. **zygote fork 상속**: zygote가 부팅 중 로드한 lib 매핑이 모든 앱에 상속된다 —
   **파일을 바꾼 뒤에는 반드시 stop;start**(안 하면 ftrace open 0건인데 maps/phdr에
   구 이름이 나타남). 새 zygote는 bind 사본에서 로드하므로 상속이 정화된다.
4. **가드의 GL dlopen 루프**: 토스 가드는 `dlopen("libEGL.so")→문자열 쿼리→dlclose`를
   수백 회 반복(ftrace 806회 반복 스캔). death 직전 maps에 EGL lib이 없는 이유 = dlclosed.
   GL 문자열 채널 판정은 이 루프의 누적으로 이뤄진다고 봐야 한다.
5. **이름 조립 규칙 (AOSP 소스 실측 — rename 설계의 기초)**:
   - HIDL passthrough(mapper 등): `findFiles(dir, "<pkg@ver>-impl", ".so")` **디렉터리
     스캔** → 파일명 중간부 자유 (mapper@3.0-impl-qti.so 등으로 리네임 가능).
   - EGL 로더: `ro.hardware.egl`(fallback ro.board.platform)로 `libEGL_<tag>.so` **정확
     일치**. 정확일치가 실패하고 prop이 비어있을 때만 접두사 스캔 — goldfish는 prop 값으로
     전송 방식까지 고르므로 **egl 트리오 rename은 prop 상시 동반 필요**(런타임 스왑은
     init이 되돌림 → 이중 이름 세트로 열화 허용. 영구화는 부팅 초반 bind가 선행).
6. **GL 문자열 패치 포인트 3곳 (libgfxstream_backend.dylib)**: buildStrings(0x28d014,
   vendor/renderer/version), rcGetGLString(0x3e370, 확장 리스트 인라인 조립). 토큰
   문자열 테이블 0x8a3xxx — env설정명(ANDROID_EMU_RENDERER/VK_* 등)은 프로토콜 토큰과
   달라서 리네임 금지.

토스 종합(3차 세션): 위 전부 + 표적⑤(/proc/version 정합화)까지 적용해 생존
4.0s→최장 18.4s, 그러나 여전히 2~18s 내 memmove 자폭 — **미지 판정 입력 잔존**.
모니모 회귀 없음. 다음 경로는 libea56 RE(memmove 호출부 +0xa00c0). 상세 매트릭스:
워크스페이스 `avd-camouflage/analysis/toss-rasp/FINDINGS.md` §8.

## ★ 2026-09-21 4차 세션 신규 (토스 — 전부 실측)

1. **가짜 smaps 고아 블록 채널 (봉쇄 완료)**: smaps 위장을 라인 필터로 만들면 VMA 헤더만
   지워져 Size:/VmFlags: 속성이 고아로 남는다(실측 3510 vs 3502). 토스 가드는 죽기 직전
   스택에서 smaps 텍스트를 파싱 중이었다(툼스톤 memory-near). **smaps는 반드시 블록 단위
   필터**(camow3 v4.2) — 헤더가 필터에 걸리면 헤더+속성 전체를 스킵. 검증법:
   `headers == Size: 개수` && VmFlags 뒤 Size: 없음.
2. **uname(2)/sysinfo 채널**: 토스 런타임에 uname 403~463회, sysinfo 337회 관측(ftrace
   newuname/sysinfo 프로브). 둘 다 getname 훅 밖. uname 위장은 모듈의 init_uts_ns 치환으로
   가능하나 심볼버전 불일치 .ko에서는 게스트 패닉 — 빌드 정합 후 재시도. sysinfo는
   RAM 크기 노출 → hw.ramSize 8192 확장으로 대응 완료.
3. **비-ptrace 메모리 덤프**: `dd if=/proc/PID/mem bs=4096 skip=가상주소/4096 count=페이지수`로
   타깃 앱의 lib 세그먼트를 TracerPid 변경 없이 덤프 가능(루트+permissive). libea56의
   판정 어휘는 lib 세그먼트에 없고 힙/스택 상주형 — 다음은 [stack:tid]·anon rw 덤프.
4. **토스 자폭 공통 호출부**: memmove형(+0xa00c0)과 직접 SEGV형(+0x146370)이 모두
   **+0xb02c4**에서 호출된다 — 판정 누적→자폭 분기. Ghidra 시작점.
5. **goldfish libEGL 내부 dlopen**: `dlopen("libGLESv1_CM_emulation")`(확장자 없음) —
   듀얼 이름 세트(+adreno 파일명)는 **프레임워크 로드분의 soname(원본 "…_emulation.so")과의
   매칭으로 해석**된다. 리터럴/soname을 파일명에 맞추면 이중 사본(Chromium NULL 크래시) 또는
   dlopen 실패(SF 크래시 루프) — **GL 트리오 패치 금지**.
6. **syscall 프로브 세트 표준**: 채널 추적 시 `p:mo_uname __arm64_sys_newuname` /
   `p:mo_sinfo __arm64_sys_sysinfo` / `p:mo_prl proc_pid_readlink` 추가 권장
   (getname만으로는 syscall 레벨 채널이 안 보인다).

## ★ 2026-09-21 6차 세션 신규: 디스플레이 프로필 채널 (기기 프로필 검증)
- 에뮬 기본 화면 1080x1920@213(일부 480) — 사칭 기기(예: SM-S916N=1080x2340@450)와
  전부 불일치. **Java DisplayMetrics/WindowManager로만 관측 가능** — 파일/프롭/커널
  위장(LKM) 전부 우회되는 채널. 토스 가드 dex 어휘의 ro.sf.lcd_density/qemu.sf.lcd_density
  쌍이 이 검증으로 추정.
- 대응: AVD config.ini `hw.lcd.width=1080 / hw.lcd.height=2340 / hw.lcd.density=450`
  (사칭 기기에 맞춤). 런타임 즉시 시험은 `wm size 1080x2340; wm density 450`(override).
- 효과 실측: 이 수정만으로 토스가 즉사 대신 "해킹 위험성" UI 제한 모드 + 수분 생존으로
  전환(6차 FINDINGS §11). config.ini 재작성 시 hw.lcd 키 유실 없게 검증 필수.

## ★ 2026-09-22 7차: 토스 libea56 자폭 메커니즘 해독
- 판정 = **패널티 누적기**(ctx+0x1c8, x19=컨텍스트): 각 체크의 차이값 합산 → 누적값이
  memmove 길이로 사용(음수 → 의도 SEGV_ACCERR). "부정 길이 자폭"의 실체.
- ctx 접근 지문: 64-bit `str/ldr x?, [x?, #0x1c8]` 스캔으로 전 체크 사이트 열거 가능
  (쓰기 4곳: 0x9750c/0xa00bc/0x12c7bc/0x151114, 읽기 45곳 — libea56 기준 오프셋).
- 제한 모드: 누적 판정이 UI 다이얼로그("해킹 위험성")로 보고되는 경로 — kill/SEGV와
  선택적. 화면 프로필 정합 + 위장 스택에서 300s+ 생존 관측.

## ★ 2026-09-22 11차: 음성 결과(재추적 금지) + 프로브 레시피
- **redirect-tamper 기각**: 가드는 redirect된 파일(/proc/cpuinfo 등)을 stat/fstat하지
  않는다(open+read만 — vfs_statx/newfstatat 전수 프로브로 사망 런 관측, 가드 트리 stat
  = 앱 데이터 파일뿐). st_dev/ino tamper 채널 없음 → /dev-clone redirect 유지 가능.
- **gles_max 토큰 변형 3종 전부 크래시**: skip(게스트 파싱 단절)/문자열 rename(호스트
  기능키 파괴)/emit 포인터 retarget(기능키 무손상이어도 크래시) — **봉인 문자열**.
  ANDROID_EMU_gles_max_version_3_0 1토큰 잔존 수용 확정.
- **stat 프로브 레시피**: `p:stx vfs_statx fname=+0(%x1):ustring` +
  `p:nfs __arm64_sys_newfstatat pathname=+0x8(%x0):ustring`(래퍼 x0=pt_regs* —
  inner regs 패턴). kprobe_events는 toss9 uprobe 보존을 위해 **append만**.
- **신규 미위장 surface**(가드 read 지도, 11차): /proc/self/stat, /proc/sys/kernel/
  random/boot_id, /proc/thread-self/attr/current, /sys/kernel/tracing/trace_marker
  (LKM deny=ENOENT — 실기기 EACCES 대비 errno 프로파일 과제), /proc/uid_procstat/set,
  /proc/<pid> 표적 집중 조사(cmdline 다중+status+task).
- **가드 문자열 비교 런타임 관측법**: libea56이 임포트하는 strstr/memcmp/strcmp의
  PLT에 uprobe(`r:grp <path>:<plt> s1=+0(%x0):string s2=+0(%x1):string`) → 런타임에
  가드가 비교하는 문자열 쌍 열람(OLLVM 정적 디코드 불요).

## ★ 2026-09-22 13차: MIDR/enforce 위장 → 토스 5.5분+ 생존 전환
- LKM redirect 방식으로 MIDR_EL1(호스트 Apple 0x61→ARM SM8550)과 selinux enforce(0→1)를
  위장하자 **2초 결정론적 자폭이 5.5분+ 포그라운드 생존으로 전환**(3런 연속, 제한 다이얼로그
  없음, 스플래시 정상 렌더). 10차 bind spoof("여전히 사망")와 결과가 다른 이유: getname
  계층 redirect는 가드 fork 자식 포함 전 경로 커버.
- 잔여 gap: 스플래시→메인 UI 미진입(100% CPU 루프), 탭/백그라운드 kill형 사망.
- 상태 변수(13차 기준): dispatcher state [0x1821a0](id = 0xa5a67d4c - state),
  카운터 [0x185758], 판정 플래그 [0x19e5e8]. 폴링 도구: scripts/toss_state_watch.sh.
- **14차 최종**: 위 구성에서 토스 **오프라인 탭 포함 생존, 온라인 비상호작용 3분+**,
  최장 13분+. 생존 중 100% CPU 루프 = 가드의 연속 재검사 스톰(40s/203만 getname —
  정상 상시 모니터링, poison 0회). **탭 사망은 온라인에서만 발생 = 서버 게이트(경계 밖)**.
  로컬 자폭 메커니즘 완전 무력화 확정.
- **15차 보강**: "탭 사망"의 실체 = **ANR 다이얼로그 해제**(am_kill "user request after
  error") — 스플래시 메인 스레드가 Chromium+libc 디렉터리 순회 스톰으로 스핀(ANR).
  ANR 덤프(/data/anr)의 main 네이티브 스택이 1차 증거. egl dir의 *_emulation.so 파일명은
  내부 dlopen 리터럴과 결합된 load-bearing — 단독 rename 금지(파일명+리터럴+soname
  3종 일관 클린 리네임만 가능, FINDINGS §19-5).
- **최종 지표(14차)**: 오프라인 탭 포함 생존(사망 0) / 온라인 비상호작용 3분+ /
  최장 13분+ (98% CPU 모니터링 스톰 지속). 잔여 사망 = 서버 게이트만.
- **탭 사망 정체 관측법(15차)**: signal_generate/signal_deliver tracepoint +
  sched_process_exit + /proc/net/tcp 폴링(가드 서버 103.42.60.101:11099 = hex
  653C2A67:2AFB) — kill 신호 vs 자발적 exit vs 서버 응답 후 종료를 구분.
