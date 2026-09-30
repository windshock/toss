# 토스(viva.republica.toss) 원본 — RASP 분석 결과 (2026-09-20 세션)

> 결론: **5분 생존 미달성**. 로컬(커널/프롭/파일) 위장으로 제거 가능한 채널은 전부
> 제거했으나 가드(libea56)가 4~10초 내 memmove 자폭(SEGV_ACCERR)으로 사망.
> 잔여 채널은 goldfish GL 스택 자체에 귀속되는 것들(프로토콜 토큰·시스템 라이브러리명·
> HAL 경유 fd)로, 로컬 패치 불가 영역(§ 잔여 채널).

## 1. 가드 구조 (실측 + 정적)

- 자체 가드: `im.toss.core.guard.AbsAppGuard` (Java) + **libea56.so**(1.6MB, 문자열 전량
  암호화) + **libtg.so**(2.1MB, 순네이티브 워치독 스레드 "Thread-35").
- libea56 임포트: `__system_property_foreach/find_nth/read*`(프롭 전수 스캔),
  `dlopen/dlsym`(GL 동적 해석), `dl_iterate_phdr`, `opendir/readdir`, `sysconf`,
  `fork/pipe2/poll/waitpid/execv/killpg`(fork 검증기 워치독), `mprotect`.
- 소켓 계열 임포트 없음 → 이 lib 자체는 네트워크 판정 안 함.
- fork한 단명(~10ms) 자식이 링커 초기화를 거치고 /system/bin·lib 디렉터리 열거,
  /proc/N/cmdline 전수 스윕 등을 수행하고 파이프로 보고 (SUarez 패턴).
- 자폭 시그니처: RxCachedThreadS 스레드에서 JNI→libea56→**memmove에 부정 길이**
  (x2≈0xffffffffffeff190) → SIGSEGV SEGV_ACCERR. AppSuit의 SIGBUS 0x41022와 동계열.

## 2. 판정 시퀀스 (ftrace getname_flags 실측 — 사망 직전 순서)

1. /system·apex 라이브러리 디렉터리 스캔
2. /proc/self/maps ×11~12, /proc/self/fd
3. **/sys/fs/selinux/load** (SELinux 상태 프로브)
4. /proc/<tgid>/status (TracerPid)
5. NOX/BlueStacks 마커 (/system/bin/nox*, libnoxspeedup, exportApk, intel_powerclamp)
6. /proc/self/task/*/comm 전수 (스레드명 — 안티프리다)
7. /proc/self/cmdline + cache/libviva-*.so (자기 언팩 lib)
8. **fd 전수 resolve: /proc/self/fd/N ×208 + /proc/self/task/*/fd/N ×163**
9. /proc/self/smaps
10. 자기 앱 lib 파일들 디스크에서 ×2 (libtoss-jni/libea56/libtg/libbugsnag-root-detection…)
    ※ /proc/self/maps 리다이렉트가 타앱(monimo) 내용을 서비스할 때는 그 앱의 lib 경로를
    읽음 → **maps 내용과 자기 프로세스의 불일치 자체가 판정 소재로 추정**
11. memmove 자폭 (검사 병렬 진행, 판정은 누적/워치독 추정 — 실행마다 마지막 체크가 다름)

## 3. 이번 세션에서 제거/수정한 채널 (전부 실측 근거)

| 채널 | 발견 | 대응 | 결과 |
|---|---|---|---|
| `ro.boot.qemu.*` 12키, `qemu.hw.mainkeys`, `qemu.sf.lcd_density` | getprop 전수 | resetprop --delete (goldfish-opengl은 gltransport.name 미존재 시 default "pipe" 폴백 확인) | props 잔여 0 |
| `ro.boottime.{qemu,goldfish,ranchu}-*` 8키 | 〃 | delete | 〃 |
| `vendor.qemu.*` 5키, `vendor.rild.libpath=libgoldfish-ril.so` | 〃 | delete / libsec-ril.so 대체 | 〃 |
| `ro.{bootimage,odm,product,system,system_dlkm,system_ext,vendor,vendor_dlkm}.build.fingerprint` = emu64a | 〃 | 삼성 dm2q fp 통일 ×8 | 〃 |
| `ro.product.{파티션}.{device,model,name}` = sdk_gphone64_arm64/emu64a (~21키) | 〃 | dm2q/SM-S916N/dm2qksx | 〃 |
| `ro.build.description/display.id` = sdk_gphone64-userdebug | 〃 | 삼성값 | 〃 |
| `ro.bionic.cpu_variant/2nd`=generic, `ro.hardware.audio.primary`=goldfish, `ro.hardware.power`=ranchu | 〃 | cortex-a76 / kalama / kalama | 〃 |
| 에뮬 브랜드 패키지 5종 재노출 (emulator.multidisplay/radio.config, goldfish.overlay, tethering.emulator, talkbackoverlay) | pm list | `pm uninstall --user 0` | 제거 (userdata 유지) |
| 코어수 2 (sched_getaffinity/sysconf//sys 열거) | /sys/devices/system/cpu 10회 열거 | config.ini `hw.cpu.ncore = 8` 실코어 8개 | 0-7 |
| /proc/cpuinfo 가짜가 1코어 (processor 블록 1개) | /dev/.c 검증 | camow3 8블록 생성 (SM8550: 0xd4e×1+0xd4d×4+0xd46×3, Features는 HWCAP 정합 유지) | 8코어 표시 |
| maps/smaps 내용에 goldfish/emulation/ranchu 라인 (libEGL_emulation.so, /dev/goldfish_address_space 등) | 툼스톤 메모리맵 + 토스가 maps×11·smaps×1 판독 | camow3 필터 확장 | 제거 |
| smaps를 읽는데 maps 형식이 서비스됨 | 토스 smaps 직접 판독 실측 | LKM v4.0: smaps 별도 파일(/dev/.pk832d, smaps 형식) | 형식 일치 |
| fd readlink에 /dev/goldfish_pipe 등 노출 (파이프 fd 371개 resolve 실측) | 토스 fd 스윕 | LKM v3.8: goldfish 디바이스 open→클론 노드(/dev/.wq517h 등) 리다이렉트 | 자기 open분 세탁 (HAL 경유분 잔여 §5) |
| 타 프로세스 cmdline이 전부 빈 문자열 (.e 리다이렉트) | 가드 자식의 /proc/N/cmdline 전수 스윕 실측 | LKM v4.0: 리다이렉트 제거(실제값 노출 — 시스템에 노출 프로세스 없음 확인) | 실제값 |
| 은닉 파일명 브루트포스 가능성 (가설) | 297.811 10파일 burst → 후에 camow3 chmod로 판명 (오탐) | 그래도 v3.9: 위장 파일명 전부 난수화(.q7zm4h 등 14종) + dirent 은닉 | 무해·강화 |
| GL 렌더러 Apple/Metal | dumpsys SurfaceFlinger | `-gpu swiftshader_indirect` 실험 | §4 — 사망 지속 |

## 4. 실험 매트릭스 (모두 원본 벤더서명 토스, 프리다 없음)

| # | 구성 | 생존 |
|---|---|---|
| 1 | GL 패치(Mali-G78) + v3.6 LKM + 2코어 + 프롭 잔여 다수 | 5~8초 |
| 2 | + 프롭 67키 청소 + 패키지 5종 제거 | 8초 |
| 3 | + 실코어 8 + cpuinfo 8블록 | 4~6초 |
| 4 | + v3.8 fd 클론 세탁 | 4초 |
| 5 | + v3.9 난수 파일명 + maps/smaps 필터 | 4초 (타앱 maps 불일치 노출 상태) |
| 6 | + v4.0 cmdline 실값 + smaps 형식 일치 (단일 앱 구동) | 6초 (자기 lib 검사 지점) |
| 7 | + GPU 백엔드 SwiftShader (Apple/Metal 제거) | 10초 |

## 5. 잔여 채널 (로컬 패치 불가 — 다음 세션 후보)

1. **ANDROID_EMU_* GL 확장 30종** — 호스트↔게스트 프로토콜 협상 토큰. rename 시 호스트
   초기화 붕괴(2026-09-20 재확인 실측). SwiftShader 부팅에도 동일 존재 → 3개 GPU 구성
   모두에서 공통. 가장 유력한 잔여 판정자.
2. **in-process `*_emulation.so`/`*ranchu*.so` 라이브러리명** — dl_iterate_phdr(임포트
   확인) 및 maps에 노출. 시스템 이미지 전체에 산재해 부분 개칭 불가(§8 실측).
3. **HAL 경유 goldfish fd** — gralloc allocator HAL이 열어 binder로 넘긴
   /dev/goldfish_pipe·goldfish_address_space fd 8개. open은 앱이 아니라 HAL이 하므로
   LKM getname 리다이렉트 밖. (proc fd 링크는 procfs가 생성 — 커널 훅 불가 영역)
   · 세탁 설계: vendor lib(mapper@3.0-impl-ranchu 등)의 디바이스 경로 문자열을
   adb remount로 클론 노드명(/dev/.wq517h 등)으로 바꾸면 HAL fd 링크도 세탁된다.
   단 클론 노드가 HAL 기동(부팅 초반)보다 먼저 존재해야 하므로 **init.rc/ramdisk
   수정이 선행 조건** (camow3는 부팅 후 기동이라 불가) — 미착수.
4. ~~GL_VENDOR "Google (...)"~~ → **해결 (§5-1)**: 호스트 dylib buildStrings 코드
   패치로 GL_VENDOR/GL_RENDERER를 완전 정합 신원으로 교체.
5. GL_VERSION "OpenGL ES 3.0 (4.1 Metal - 88.1)" — **"Metal" 잔여 수용**. 제거 시도:
   buildStrings version 조립부(0x28d1e4~) NOP+redirect → gfxstream 초기화 크래시
   (adrp 오류 배제 후 재현 — 선형 분석과 다른 분기 구조, 2회 실측). Ghidra급 RE
   아니면 손대지 말 것.

## 5-1. ✅ GL 신원 완전 정합화 (2026-09-20 심야 — 호스트 dylib 코드 패치 성공)

`GLEScontext::buildStrings`(libgfxstream_backend.dylib @0x28d014)는 호스트
glGetString(GL_VENDOR/GL_RENDERER/GL_VERSION) 결과에 정적 prefix("Google (",
"...Translator (") + 동적 suffix(호스트 플랫폼/GPU명) + ")"를 붙여 앱에 전달한다.
**동적 append 6곳(x25/x23/x21 각 ctor-append+dynamic+")")을 NOP하고 정적 문자열을
동일 길이 교체**:

| 항목 | 패치 전 | 패치 후 |
|---|---|---|
| GL_VENDOR | "Google (Apple)" | **"Qualcomm"** |
| GL_RENDERER | "...Mali-G78...Translator (Apple M1 Pro)" | **"Adreno (TM) 740"** |
| GL_VERSION | "OpenGL ES 3.0 (4.1 Metal - 88.1)" | (유지 — 5번) |

- 사칭 기기 SM-S916N(dm2q=SM8550)의 실제 GL 신원과 **완전 일치** — 이전 "Mali-G78"
  (SoC 불일치)보다 강한 개선. SurfaceFlinger 실측 확인.
- 패치본: `host-patch/libgfxstream_backend.dylib.adreno740.patched`
  (재구성 스크립트는 본문 참고: backup/mali-g78-preserved + NOP 0x28d0f8×3,
  0x28d118×4, 0x28d128×5, 0x28d168×3, 0x28d188×4, 0x28d198×5 + 문자열 교체,
  ad-hoc 재서명). 부팅 정상, 모니모 회귀 없음(120초+).
- **토스 결과: 4초 사망 지속** → vendor/renderer는 단독 판정자가 아님. ANDROID_EMU_*
  확장·phdr·HAL fds 등 공통 잔여가 누적 판정 중일 가능성.
- ⚠️ **운영 함정**: dylib 비정상 크래시 1회 후 에뮬이 crash-report 다이얼로그를 띄워
  **이후 부팅이 adb 불가 상태로 보인다**(부팅 로그에 "Showing crashdialog"). 해소:
  `/tmp/android-1004276/emu-crash-36.5.1.db` 삭제 + qemu/crashpad 프로세스 정리 +
  AVD *.lock 삭제 후 재기동. dylib 불량과 다이얼로그 블로킹 혼동 금지(2회 오판).

## 6. 운영 변경사항 (재부팅 절차에 반영됨)

- config.ini: `hw.cpu.ncore = 8` (신규 — 실코어 8).
- 위장 파일명 전부 난수화: camow3.sh v4.0 + hide_kmod v4.0 동기 (이름표는 camow3 상단).
- camow3 실행 경로: `/data/local/tmp/.system_profile` (cmdline 노출 완화).
- props-apply.sh: 토스 대응 프롭 청소 통합 + 잔여 grep 검증 내장.
- deploy.sh: `.camow3.sh` → `.system_profile` 권장. LKM 타깃 uid에 토스(10175) 포함.
- 모니모 회귀 없음 확인 (v4.0 + 8코어에서 120초+ 생존, 가드 쌍 정상).

## 7. 마감 세션 추가 (2026-09-21 새벽)

- **서버 판정 가설 소멸**: 비행기 모드(네트워크 차단)에서도 4초 만에 동일 memmove 자폭
  → 판정은 순수 로컬 계산. 단 ftrace connect 프로브로 가드 스레드("ss.im:11099/...")
  가 103.42.60.101/83:11099로 반복 connect하는 것을 관찰 (판정 입력은 아니나 가드
  채널 존재. 커스텀 포트 — 서버 텔레메트리/라이선스 추정).
- **ANDROID_EMU_* 확장 감축**: `~/.android/advancedFeatures.ini`(전역만 유효 — AVD별
  위치 무시됨, 부팅 로그 "Feature 'X' is overridden to 'disabled'"로 확인).
  전부 OFF → 게스트 CPU hang. 비핵심 11개 off 절충안 → **토큰 30→16**, 부팅 정상,
  모니모 회귀 없음. native_sync v2/3/4·checksum_helper·dma_v1·direct_mem 등은
  게스트가 무조건 추가해 호스트 기능 off로 못 지움. **토스 여전히 6초 사망.**
- 9+ 구성 최종 결론: 토스 원본은 현 에뮬 로컬 위장으로 생존 불가 확정. 남은 후보
  (확장 16토큰·Metal·phdr·HAL fds·uname)은 전부 goldfish 스택 구조 산물.

## 8. 3차 세션 (2026-09-21 오후) — 잔여 5표적 전수 시험 + 신규 채널 3종 발견

> 결과: **5분 생존 미달**. 인계 프롬프트의 잔여 표적 ①~⑤를 전부 구현·시험했고
> 생존 밴드는 4.0s(베이스라인) → 최장 18.4s로 상향됐으나 가드(libea56)는 여전히
> 2~18s 밴드에서 memmove 자폭한다. 모니모 회귀 없음(전 구성 120s+). 미지 판정
> 입력이 최소 1개 남아 있다 — 다음 세션은 libea56 RE(§6)가 유일하게 남은 경로.

### 8-1. 표적별 결과

| 표적 | 구현 | 결과 |
|---|---|---|
| ⑤ /proc/version ↔ uname 불일치 | camow3 v4.1: 가짜 version 문자열을 실 uname(`5.15.119-android13-8-00034-gd34029c8258b-ab10871489`)과 완전 일치. 구 가짜의 `gXXXXXX-ab12345678` 플레이스홀더 자체가 신호였음 | 적용. 단독 효과 없음(7.0s 사망) |
| ① phdr `*_emulation.so`/`*ranchu*.so` | **이름 조립 규칙 확정**(AOSP 소스 실측): HIDL passthrough = `findFiles(dir, "<pkg@ver>-impl", ".so")` **디렉터리 스캔** → 파일명 중간부 자유. EGL = `ro.hardware.egl` 정확일치. → /vendor/lib64 통째 bind-mount 사본(`/data/local/tmp/.vl64`)에서 mapper→`-impl-qti.so`, `libGoldfishProfiler.so`→`libGfxPerfCollector.so`(libEGL DT_NEEDED 동일길이 패치), vulkan→`vulkan.qcom.so`, EGL 트리오는 **이중 이름 세트**(emulation+adreno 병존) + `resetprop ro.hardware.egl adreno` | 적용. phdr에서 ranchu/emulation 제거 확인. 토스 생존에 단독 효과 없음 |
| ② HAL 경유 goldfish fd | **readlink 경로 실측**: `/proc/PID/fd/N` readlink → `proc_pid_readlink → d_path`(kretprobe로 확인). **LKM v4.1**: d_path kretprobe 추가 — 표적 uid의 readlink 결과에서 `/dev/goldfish*`→클론 노드명 제자리 교체(`dp_hits` 카운터, 모니모 36회/토스 +16회 발화) | 적용. 셸에서도 goldfish fd 링크 소실 확인. 그럼에도 사망 |
| ③ GL_VERSION "Metal - 88.1" | **1차 시도 크래시 원인 규명**: buildStrings(0x28d014) version 블록의 reserve 계산부(0x28d1e4, add x8,x22,x23/add x1,x8,#3/bl reserve)를 NOP하면 string 용량 산정 붕괴 → 힙 붕괴가 2회 크래시의 정체. **v2 설계**: reserve는 그대로 두고 " (" append 블록(28d204)의 대상을 `0x8b4c54(" (")` → `0x8b4c59("NVIDIA (Vendor 0x10de)" — macOS 호스트 미참조)`로 돌려 ` (4.1 V@0615.47`(15B)을 출력, arg("4.1 Metal - 88.1") append 4슬롯 NOP. 총 append 29 ≤ reserve 32 | **성공**: `OpenGL ES 3.0 (4.1 V@0615.47)` — 부팅 정상, gfxstream 크래시 0. 스크립트 `scripts/patch_dylib_gl_version.py` |
| ④ ANDROID_EMU_* 확장 | **rcGetGLString(0x3e370)이 확장 리스트를 인라인 조립**함을 확정. 토큰 문자열은 **호스트 dylib에만 존재**(게스트 lib/qemu 바이너리 0건 실측) → 게스트는 이름 파싱 안 함. 예외(게스트가 리터럴 파싱): `CHECKSUM_HELPER_v1/_v`(libOpenglCodecCommon), `dma_v2`(libGLESv2_enc), `gles_max_version_3_0`(libEGL_emulation) → 이 4개는 bind 사본에서 **양측 동일 리네임**, 나머지 39개는 호스트 단독 `ANDROID_EMU_`→`QCOM_ADRENO_`(동일 길이) | **성공**: 확장 리스트에서 ANDROID_EMU 16→1(gles_max_3_0만 잔존 — 호스트가 gles_max 토큰까지 리네임하면 부팅 hang(실측, v3b 롤백)). 스크립트 `scripts/patch_dylib_gl_tokens.py` |

### 8-2. 신규 발견 채널/구조 (다음 세션 필독)

1. **zygote fork 상속**: zygote가 부팅 중 로드한 lib 매핑(ranchu mapper 등)이 **모든 앱에
   fork로 상속**된다 — 파일을 바꿔도 open 이벤트 0건인데 maps/phdr에 구 이름이
   나타나는 현상의 원인(ftrace로 확인). **파일명을 바꾼 뒤에는 반드시 `stop; start`로
   프레임워크를 재시작**해 새 zygote가 bind 사본에서 로드하게 한다.
2. **가드의 GL dlopen 루프**: 토스 가드는 `dlopen("libEGL.so")` → 드라이버 로드 →
   glGetString 쿼리 → dlclose를 **수백 회 반복**한다(ftrace 806회 반복 스캔 실측).
   death 시점 maps에 EGL lib이 없는 이유 = dlclosed. GL 문자열 채널은 이 루프로 읽힌다.
3. **readdir 열거 채널(.so 예외의 역설)**: 가드가 /vendor/lib64를 opendir하면
   `libqemupipe.ranchu.so`·`hwcomposer.ranchu.so` 등이 보인다. 구 LKM은 2026-09-19
   mapper 자해 회귀 방지로 **.so를 열거 은닉에서 제외**했는데, 이제 매퍼는 bind 사본에서
   `-impl-qti.so`로 바뀌었으므로 예외가 불필요. **LKM v4.2**: 표적 uid 열거에서 텔레텔
   (goldfish/ranchu/qemu) .so도 숨김. 비표적(HAL 서비스)은 필터 밖이라 무영향.
4. **ro.hardware.egl 불안정성**: `resetprop ro.hardware.egl adreno`는 init이 프레임워크
   재시작 중 ro. prop을 재로드하며 되돌아간다(실측). 파일 리네임+prop 교체 조합은
   **되돌림 창에서 FATAL 크래시**(런처 "couldn't find an OpenGL ES implementation"
   크래시 루프 실측) → 이중 이름 세트(emulation+adreno 병존)로 우아한 열화 구성.
   goldfish-opengl은 ro.hardware.egl 값으로 전송을 고르므로 **adreno 단독 영구화는
   부팅 시절부터 파일이 바뀌어 있어야 가능**(-writable-system 또는 init.rc 선행 필요).
5. **운영**: stop;start마다 ① adbd root 해제 ② ro. 런타임 prop 리셋 ③ init.svc.*
   (qemu/goldfish/ranchu 53종) 재생성 — restart 후 props-apply + vulkan/egl/부트완료
   prop 재삭제 필요. adb "device offline"의 상당수는 **게스트 재부팅**(손상된 .ko
   insmod → 패닉)이므로 push 직후 offline이면 insmod 전에 파일 크기부터 검증할 것.

### 8-3. 실험 매트릭스 (이번 세션)

| # | 구성 (누적) | 생존 |
|---|---|---|
| 8 | ⑤ version 정합화 | 7.0s |
| 9 | ① mapper bind 리네임(zygote 미재시작 — 무효였음) | 2.2~6.0s |
| 10 | ① + zygote 재시작(상속 정화) | 8.9s |
| 11 | ② LKM v4.1 d_path fd 세탁 | 3.6s |
| 12 | + camow3 갱신 0.2s(stale maps 경합 제거) | 12.9s |
| 13 | ③ GL_VERSION 패치(Metal 제거) | 18.4s |
| 14 | ④ 토큰 41 리네임 + Profiler/codec/gles2enc + vulkan qcom | 3.8~14.1s |
| 15 | + EGL 이중 이름 세트 + ro.hardware.egl=adreno | 3.1s |
| 16 | 최종 안정 구성(위 전부, gles_max_3_0만 잔존) | 14.1s, 모니모 회귀 없음 |

### 8-4. 남은 것

- **libea56 RE(§6)만 남음**: 모든 식별 채널 폐쇄 후에도 2~18s 자폭 → 미지 입력 존재.
  memmove 호출부(+0xa00c0) 역추적, Ghidra 권장. 후보: EGL_EXTENSIONS 문자열(gles_max
  이외의 EGL 확장 — 미점검), GL 문자열 형식 비교(실제 Adreno 포맷과의 차이), 가드 자체
  타이머/서버 핑거프린팅(103.42.60.101:11099), 기타.
- EGL 트리오의 `emulation` 이름 영구 제거를 원하면: `-writable-system`(단, 게스트 CPU
  hang 1회 실측 — 재시도 필요) 또는 init.rc의 mount bind로 부팅 초반부터 bind 상태를
  만든 뒤 build.prop의 ro.hardware.egl을 소스 레벨에서 교체해야 한다.

## 9. 4차 세션 (2026-09-21 오후~저녁) — smaps 구조 결함 발견·수정, GL 리터럴/듀얼로드 실험, uname/sysinfo 실측. 5분 미달 (최장 89s)

> 결과: **5분 생존 미달**. 생존 밴드 4~89s (최장 89s, 13:3x 구성). 다만 신규 채널 1개
> (smaps 고아 블록) 발견·봉쇄, uname/sysinfo 채널 실측 확정, libea56 라이브 메모리 덤프
> 획득 기법 확립, 자폭 변형 2종의 공통 호출부(+0xb02c4) 특정. 다음 세션의 패치 설계 입력까지 확보.

### 9-1. 신규 채널: 가짜 smaps의 고아 속성 블록 (발견→봉쇄 완료)
- **증거**: 크래시 직전 스택 버퍼에 smaps 텍스트 파싱 중인 내용("Size:/KernelPageSize:"·
  "---p" 블록·linker64 라인)이 있었음 (툼스톤 memory-near 섹션). 가드는 smaps를
  라인 루프로 누적 파싱한다.
- **결함**: camow3 v4.0의 smaps 위장이 `grep -v` **라인 필터**라 VMA 헤더만 지워지고
  Size:/VmFlags: 속성 줄은 고아로 남음. 실측: 실제 3510 블록 vs 가짜 헤더 3502
  (orphan_Size_after_VmFlags=8). 걸러진 8개 = libGLESv1/2_CM_emulation.so 세그먼트.
- **수정 (camow3 v4.2)**: smaps만 블록 단위 awk 필터(헤더 매치 시 헤더+속성 전체 스킵).
  검증: 토스 생존 중 가짜 4469/4469 orphan=0 완전 정형. maps는 라인 필터 유지.
- **부수 발견**: 모든 GL 앱은 `/dev/goldfish_address_space` mmap ~36개를 가진다.
  타깃 uid는 d_path 세탁으로 클론명(/dev/.tr482w)으로 보여 필터 불필요. 비타깃(런처)은
  블록 필터로 정형 처리됨. `/dev/__properties__/u:object_r:qemu_sf_lcd_density_prop`
  매핑 1개도 블록 필터로 처리.

### 9-2. GL 리터럴 패치 실험 (시도→철회, 기록 가치 높음)
- goldfish libEGL은 내부에서 `dlopen("libGLESv1_CM_emulation")`(확장자 없음)로 GLES
  백엔드를 적재한다. 듀얼 이름 세트(+adreno 파일명)가 동작하는 원리 = **프레임워크가
  로드한 libGLESv1_CM_adreno.so의 DT_SONAME이 "libGLESv1_CM_emulation.so"(원본 유지)라서
  드라이버의 dlopen이 soname 매칭으로 해석됨**.
- 리터럴을 파일명과 일치시켜 "단일 사본"으로 만들면 (a) 프레임워크 로드분과 드라이버
  dlopen분의 **이중 사본**(같은 코드·상태 2벌)이 생기면 Chromium InProcGpu가 NULL deref
  (libmonochrome SIGSEGV, 토스 15s 사망 — 판정 아닌 환경 크래시), (b) soname≠요청명이면
  dlopen 실패로 SF가 "no suitable EGLConfig"/"couldn't find an OpenGL ES implementation"
  **크래시 루프** (부팅 불능).
- 결론: **eGL 트리오 리터럴/soname 패치는 철회**, 3차 세션 원본(듀얼 이름+원본 리터럴+
  원본 soname)로 복원. emulation 이름의 phdr 노출은 camow3 블록 필터로 maps/smaps 처리.
- 운영 대사고 1건: 재생성한 libandroidemu.so가 emu kill 직전 cp라 userdata 반영 전 소실
  → SF 크래시 루프 지속("couldn't find an OpenGL ES implementation"의 원인은 egl 프롭이
  아니라 NEEDED 라이브러리 부재 — logcat의 vndksupport 라인으로 즉별 가능).
- **egl=adreno 프롭은 반드시 `vendor_bind props` 절차로만** (pristine 파일+adreno 조합은
  3차 세션 대로 유효. libandroidemu.so 존재가 전제).

### 9-3. dylib GL_VERSION v3 (부분 성공)
- `scripts/patch_dylib_gl_version32.py`: "OpenGL ES 3.0 (4.1 V@0615.47)" →
  **"OpenGL ES 3.0 V@0615.47"** (paren 포맷은 실기기형, "(4.1" 제거). 적용·부팅 정상.
- "3.2" 승격은 미적용: arg4는 버전 테이블(0xa2b31e)의 정적 문자열이 아니라 csel로
  선택되는 동적 구성값(호스트 최대 ES버전=3.0 반영). 테이블 바이트 패치로는 안 바뀜.
  gles_max_version_3_0 토큰과의 정합성도 고려 시 "3.0 유지"가 무난.

### 9-4. syscall 채널 실측 (ftrace 프로브 신설: newuname/sysinfo)
- **uname(2) 403~463회/런** — LKM getname 훅 밖. /proc/version은 위장돼 있지만
  uname(2) 반환값은 GKI 그대로("5.15.119-android13-8-..."). 삼성 지문과 교차검증 여지.
- **sysinfo 337회/런** — MemTotal 2GB(에뮬 기본) vs 실기기 8-12GB. → **RAM 8192로 확장**
  (config.ini hw.ramSize, 재기동 필요) 완료.
- uname 위장 시도(모듈에서 init_uts_ns 치환)는 **"no symbol version for module_layout"
  상태의 .ko에서 수행 시 게스트 재부팅(메모리 손상 추정) — 철회(v4.2b로 롤백)**.
  재도전 시: 빌드 환경 심볼버전 정합 선행 + 안전성 검증(모니모 포함) 후.

### 9-5. libea56 라이브 메모리 덤프 (기법 확립)
- `/proc/PID/mem` dd(페이지 정렬 skip/count)로 libea56 4세그먼트 덤프 성공. 첫 시도의
  EIO는 일시 현상(재시도 가능). **트레이서 없음**(ptrace 미사용, TracerPid 불변, 자폭 유발 없음).
- 덤프 분석: 로 세그먼트에는 판정 어휘(goldfish/qemu/ANDROID_EMU/GL문자열류) **없음**
  (4704줄 중 텔레메트리 키워드 0) — 비교 문자열은 **힙/스택 상주형**(사용 시 복호화).
  다음 경로: ① 스레드 스택 덤프([stack:tid] 후미 페이지) ② anon rw 힙 대상 grep -a
  ③ Ghidra로 복호화 루틴 역산 후 정적 복호.

### 9-6. 자폭 변형 2종과 공통 호출부 (다음 세션 Ghidra 앵커)
| 변형 | 프레임 체인 | 비고 |
|---|---|---|
| memmove형 | memmove ← **+0xa00c0** ← +0xb02c4 | 부정 길이(x2≈-0x10E60), 3차까지 관측 |
| 직접 SEGV형 | **+0x146370** ← +0x9789c ← **+0xb02c4** | 4차 신규 관측(15:39 툼스톤_01) |
- 공통 복귀 프레임 **+0xb02c4** = 판정 누적→자폭 분기의 호출부. Ghidra에서 이 주소의
  함수를 시작으로 역추적할 것.
- fork 자식은 getprop를 exec하는 것도 관측(dmesg AVC, comm=getprop, untrusted_app:c175)
  — 프롭 스윕이 자식 프로세스로 수행됨 재확인.

### 9-7. 실험 매트릭스 (4차)
| # | 구성 (누적) | 생존 |
|---|---|---|
| 17 | 3차 최종 + bind 재적용 (베이스라인) | 89s |
| 18 | + smaps 블록 필터(v4.2) + GL 리터럴 패치 + RAM 8G + dylib v3 | 13s (Chromium NULL — 환경 크래시, 판정 아님) |
| 19 | + 리터럴 정합화 재시도들 (SF 크래시 루프 기간) | — |
| 20 | pristine egl 복원 + egl=emulation | 4s (kill형, 툼스톤 없음) |
| 21 | pristine egl + egl=adreno (3차 최종 동일 + 9-3/9-4 개선) | 13s (자폭 +0x146370형) |
| — | 모니모 회귀 체크 (최종 구성) | **120s+ 생존 ✓** |

### 9-8. 다음 세션 우선순위
1. **ANDROID_EMU_gles_max_version_3_0** — 앱 가시 확장 리스트에 남은 마지막
   ANDROID_EMU 문자열. 호스트 rcGetGLString(0x3e370) emit에서 이 토큰만 스킵하는
   코드 패치(게스트 파싱 깨짐 여지 — 데드락 시 게스트 폴백 ES2 동작 확인 필요).
2. **Ghidra RE**: +0xb02c4(공통 호출부) 역추적 → 판정 누적 구조·비교 입력 특정.
   덤프(dump4_p10221)는 세그먼트만 있으므로, 스택/힙 덤프 스크립트와 병행.
3. **스택/힙 덤프**: [stack:tid] 후미 128KB × 전체 스레드 + anon rw 중 소형 영역에
   grep -a 키워드(가드가 비교 중인 문자열이 스택에 상주).
4. uname(2) 위장 재도전(모듈 심볼버전 정합 후) — 403회/런 채널.
5. GL "3.2" 승격은 arg4 동적 구성원 규명 후에만.

## 10. 5차 세션 (2026-09-21 밤) — 가드 어휘 복원(dex 힙), uname(2) 위장 성공, uid sysstats 위장. 5분 미달 (4~40s)

> **결론**: 판정 최종 관문은 여전히 미확정(4~40s 자폭/킬 혼재). 그러나 **가드의 체크
> 어휘 전체를 라이브 힙에서 복원**했고, 그중 3채널을 새로 봉쇄했다(uname 위장·uid
> sysstats 존재 위장·Emulator overlay deny). gles_max 토큰 제거는 게스트 ES3 요구로
> 실패 확정(원리 규명). 다음 세션은 Ghidra(+0xb02c4)만 남음 — 프로젝트 저장 완료.

### 10-1. 가드 체크 어휘 복원 (브레이크스루)
- 라이브 토스의 anon rw 힙(8MB 영역 1개 = 앱 dex 문자열 풀)에서 가드의 체크 상수 전체 확보:
  - `/vendor/overlay/*` 7종 — 정상 RRO 5종 + **에뮬 전용 2종**:
    `goldfish_overlay_connectivity_google.apk`(LKM goldfish 패턴으로 기존 차단),
    `EmulatorTalkBackOverlay/EmulatorTalkBackOverlay.apk`(**패턴 무커버 → v4.4 deny 추가**)
  - `/proc/uid_cputime/show_uid_stat`(에뮬 존재), **`/proc/uid_time_in_state`,
    `/proc/uid_concurrent_policy_time`, `/proc/uid_concurrent_active_time`(에뮬 결여 —
    실기기 삼성 커널엔 존재)** → v4.4 redirect로 존재 위장
  - `qemu.sf.lcd_density`(삭제 완료), `ro.build.fingerprint`, `ro.soc.model/manufacturer`,
    `persist.sys.virtual_disk`, `persist.sys.emulate_fbe`(미설정=무영향), `x86_64`,
    `com.google.android.connectivity.resources.goldfish.overlay`(미설치 확인)
  - **커널 릴리스 문자열(5.15.119-android13-8-...)이 가드 힙에 휘류** — uname 채널 실증
- dex 어휘 존재 ≠ 실제 접근: 과거 ftrace 런에서 overlay/uid-proc 경로 open은 미관측 —
  **체크 파이프라인 후반부**(우리가 못 도달하는 구간)로 추정. 전부 봉쇄해두면 후반 통과에 유리.

### 10-2. uname(2) 위장 성공 (LKM v4.4)
- kretprobe on `__arm64_sys_newuname`: entry에서 inner pt_regs(`((pt_regs*)regs->regs[0])->regs[0]`)
  로 유저 버퍼 획득(래퍼 x0은 pt_regs 포인터 — getdents64 버그 동일 패턴), ret에서
  release@130/version@195 제자리 치환(new_utsname: sysname65/nodename65/release65/...).
  **초기 패치는 release를 65(nodename)에 썼다 — 필드 오프셋 버그였고 실측으로 발견.**
- 결과(타깃 uid): release=`5.15.94-android13-8-30358670-abS916NKSU1AWC2`(지문 빌드태그와
  정합), version=`#1 SMP PREEMPT Thu Jun 8 18:11:35 KST 2023`, nodename=localhost 무영향.
  비타깃(셸/시스템)=GKI 원본 유지. /proc/version 가짜(camow3 v4.4)와 완전 정합.
- 검증 방법: `/system/xbin/su 10175 sh -c "uname -r"` — 타깃 uid 컨텍스트 시험 루틴.

### 10-3. gles_max 토큰 제거 — 실패 확정 (원리 규명)
- emit-skip(rcGetGLString 0x3ea50..0x3ea8f 16슬롯 NOP) → 게스트 libEGL 파싱 실패 →
  **"no ES 3 support" → SF RenderEngine "EGLContext creation failed" 크래시 루프**.
  호스트+게스트 문자열 동시 rename(ANDROID_EMU_→QCOM_ADRENO_, 32B)도 동일 크래시.
  → 3차 v3b의 "부팅 hang"의 실체 = 이 크래시 루프. gles_max는 단순 emit 데이터가 아니며
  게스트가 ES3 요구(시스템 구성요소 포함). **제거 불가 확정 — 철회.**
- 잔여 노력치: 호스트 dylib 패치 스크립트들(patch_dylib_glesmax_skip.py,
  host-patch/libgfxstream_backend.dylib.noglesmax), /tmp/idem_test.dylib(프리스킵 상태 백업).
- 대안(미시행): 게스트 libGLESv2_emulation(bind 사본)의 GL_EXTENSIONS 반환 경로에서
  토큰을 떼는 코드 패치 — 게스트 RE 필요.

### 10-4. 신규 운영 함정 (전부 재현 실측)
1. **push 직후 emu kill → userdata 라이트백 유실**: push→md5(페이지캐시 새값)→emu kill→
   부팅 후 파일=구버전. 4차 libandroidemu 소실 사고의 근원. **push 후 `adb shell sync` 필수.**
2. **활성 kretprobe 모듈의 rmmod → 간헐 게스트 패닉**: rmmod 금지. 교체는 재부팅 후 insmod.
3. insmod는 반드시 `adb root; setenforce 0` 이후 (부팅 시 Enforcing 복귀).
4. 타깃 uid 컨텍스트 검증: `/system/xbin/su 10175 sh -c "..."`.

### 10-5. 사망 양상 (이번 세션)
- 4s(kill형, 툼스톤 없음), 13s(libea56 +0x146370 직접 SEGV), 20~40s
  (**Chrome_InProcGp strstr/이상 포인터 0x0077_006f_0064_0060 — 힙 손상형, 가드 변형 추정**),
  베스트 89s(4차). 자폭 변형 누적 4종 — 공통 호출부 +0xb02c4.
- 모니모 회귀 없음(v4.4 풀 스택, 120s+ LoginActivity 진행).

### 10-6. 다음 세션
- **Ghidra 본격 RE**: 프로젝트 `/tmp/gproj toss5`에 libea56 분석 완료 저장. 함수
  +0xb02c4(공통 호출부) 디컴파일 → 판정 누적 구조 역추적. pyghidra로 스크립팅 가능.
- 힙 덤프 확장: 덤프 시점을 +2s 이전으로 앞당겨(가드 초기 복호화 윈도우) 스냅샷 간 diff.
- toss 재시험은 v4.4b 커널모듈 + 현재 dylib 구성에서 시작.

## 11. 6차 세션 (2026-09-21 심야) — 디스플레이 프로필 채널 발견, 제한모드 다이얼로그 도달

> **핵심 발견**: 에뮬 기본 화면이 **1080x1920 @213dpi**(config hw.lcd=480/1920/1080) —
> 사칭 기기 SM-S916N 실제 프로필(1080x2340 @450dpi)과 정반대. 이 값은 **Java
> DisplayMetrics/WindowManager로만 관측 가능**(파일·프롭·커널 위장 전부 우회)하며
> 가드 dex 어휘의 `ro.sf.lcd_density`/`qemu.sf.lcd_density` 쌍과 연동된 기기 프로필
> 검증으로 추정. `wm size 1080x2340; wm density 450` 적용 런에서 **토스가 자폭하지
> 않고 5.5분 생존 + 가드 "해킹 위험성이 탐지됨(앱 위변조) 서비스 제한" UI 다이얼로그
> (확인 버튼 포함, 프로세스 생존)** 에 도달 — kill 경로가 무력화되고 report 경로로
> 전환되는 것을 최초 관측. config.ini에 영구 반영(hw.lcd=1080/2340/450) 완료.
>
> 단, 다이얼로그 상태는 재현 불안정(A/B·pm clear 재시험 30s 내 사망) — 가드 판정에
> 레이스/타이밍 요인. 잔여 판정 입력은 최소 1개 남았고 Ghidra(+0xb02c4)가 다음 과제.

### 11-1. 신규 채널: 디스플레이 프로필 (기기 프로필 검증)
- 에뮬 config(hw.lcd.*)만 바꾸면 되는 **저비용 고효과 채널**. 런타임 즉시 적용은
  `wm size 1080x2340; wm density 450`(override) — 재부팅 없이 시험 가능.
- AVD 사전 조건에 추가 완료(SKILL.md).
- 검증된 조합: 사칭 기기와 width/height/density 전부 정합(1080x2340@450).

### 11-2. 제한모드 다이얼로그 (신규 관측)
- 기존: 판정 → memmove/kill/SEGV 즉사. 신규: 판정 → **UI 다이얼로그("해킹 위험성이
  탐지됨 / 앱 위변조 위험성 / 서비스 이용 제한") + 프로세스 생존(5.5분, 16.7% CPU)**.
- uname 위장·uid sysstats·overlay deny(v4.4b)가 kill 경로 후보를 깎았을 가능성.
- 다이얼로그 상태 재현 불안정 → 판정 병렬·레이스 구조 재확인. pm clear로 데이터
  초기화해도 동일(판정 캐시 아님).

### 11-3. 기타
- 힘 스탬프 DIFF(7s vs 29s)에서 가드가 신규 문자열을 복호화하지 않음 — 판정은
  기보유 어휘와의 "값 비교"(디스플레이 프로필이 그 예).
- ro.sf.lcd_density 프롭: 실기기에 존재(450) — resetprop으로 추가해두었음(현재 450).
- Ghidra: /tmp/gproj toss5(분석 저장) + /tmp/gscripts/DecompileAt.java(오프셋→함수
  디컴파일 postScript). 0xb02c4는 미식별 핸들러 구간 — before 함수 0xafed8은
  점프테이블 디스패처("Could not recover jumptable"). 호출부는 blr x8/x22 간접호출 +
  비트연산 상수(0x56e407c0-x) — OLLVM 가중.

### 11-4. 마지막 관찰 (세션 종료 시점)
- 디스플레이 오버라이드 적용 후 기동된 인스턴스들: **수 분 생존이 반복 관측**되며,
  스플래시 로고가 **정상 GL 렌더링**됨(스크린샷). 일부 인스턴스는 제한 다이얼로그,
  일부는 30s 내 사망 — 판정 레이스. 완전 기능 생존(메인 UI 진입)은 미달.
- config.ini 재작성 버그 주의: hw.lcd 키 치환 스크립트가 값을 키 없이 써서 키 유실 —
  재작성 후 반드시 `grep hw.lcd`로 검증.
- 종료 시 환경: v4.4b 모듈, uname/proc/overlay 위장 활성, hw.lcd=1080x2340@450
  (config 영구 + wm 오버라이드), egl=adreno, 모니모 동시 생존(LoginActivity).

## 12. 7차 세션 (2026-09-21 심야) — **자폭 메커니즘 해독(누적기)**, 300s+ 생존 반복 달성

> **핵심**: 자폭의 정체가 해독됐다 — **패널티 누적기**(ctx+0x1c8)에 각 체크의 차이값이
> 합산되고, 누적값이 memmove 길이로 사용되어 음수 시 의도 크래시(변형 A 공식:
> len = acc + (ctx->0x2a0 - x20 + 1)). 누적기 쓰기는 4곳(0x9750c/0xa00bc/0x12c7bc/
> 0x151114), 읽기 45곳. 변형 B는 문자열 비교 루프 내 불법 포인터 역참조.
> 화면 프로필 수정 상태에서 **launch 반복 시 300s+ 생존 달성**(제한 다이얼로그 표시,
> 프로세스 정상) — kill 경로는 사실상 무력화. 잔여: 다이얼로그를 유발하는 마지막
> 판정 1개(누적기에 양의 패널티를 남기는 체크) — 4 store 사이트의 델타 소스 디코딩.

### 12-1. 누적기 구조 (변형 A 해독, 0xa00bc)
```
x8  = ~(-x20) = x20-1
x22 = ctx->0x2a0
x8  = (x22 - x20 + 1)
x26 = acc (ctx->0x1c8)
x2  = (x8|)+(x8&x26) = x8 + acc      ← OLLVM 항등식 (a|b)+(a&b)=a+b
ctx->0x1c8 = x2
memmove(dst=ctx->0x2a0, src=x20, len=x2)   ← bl 0x16f0e0
```
- acc가 음수로 누적되면 len<0 → SEGV_ACCERR (기존 관측 "부정 길이"의 정체).
- ctx(x19)는 가드 컨텍스트 구조체. 0x2a0/0x1c8/0x1b0/0x228/0x238/0x138/0x128/0xdc 필드 확인.
- 변형 B(0x146370 `ldrb w8,[x26]`): u16 문자열 비교 루프(0x14637c cmp w16,w17) 내
  불법 포인터 — 같은 누적 판정의 다른 자폭 표현.

### 12-2. 누적기 접근 지도
- STR 4곳: 0x9750c(컨텍스트 세이브 블록), **0xa00bc(자폭)**, **0x12c7bc(델타 계산 —
  u16 2개 로드 후 madd(곱셈) 기반 비교 패널티)**, 0x151114.
- LDR 45곳 — 누적기 소비/검사 위치. 0x12c7bc의 madd x11,x11,x8,x12(두 u16의 곱)는
  곱셈 기반 문자열 동등 검사로 추정 — **가드가 자체 문자열 비교기를 구현**.
- 델타 소스는 x14 기준 난독화 포인터(0x42c7e286cc88cf80 마법상수 곱셈 역전) —
  복호화된 체크 문자열과의 비교. 전체 디코딩은 다음 세션.

### 12-3. 화면 프로필 A/B + 생존 통계
- lcd_density 프롭 유무는 결정적이지 않음(둘 다 사망 런 존재).
- 현재 구성(v4.4b + 화면 프로필)에서 런당 결과: DEAD@30-60s ↔ ALIVE300+(제한 다이얼로그)
  **약 반반** — 레이스성 판정. 다이얼로그 상태는 프로세스·GL·UI 모두 정상(15197B 화면,
  확인 버튼 반응).
- pm clear 여부는 결정적이지 않음.

### 12-4. 다음 세션 (확정 로드맵)
1. **델타 소스 디코딩**: 0x12c7bc/0x151114/0x9750c 주변에서 x14(복호화 문자열 베이스)의
   실체와 ldrh 비교 대상 특정 → 어느 채널이 양의 패널티를 남기는지.
2. 런타임 누적기 덤프: ctx(x19) 탐색 패턴 — acc 필드 주변 시그니처로 힙 덤프에서 ctx
   위치 특정 → 런 중 acc 변화 추적(어느 시점에 패널티가 더해지는지).
3. 액티비티 관점: 제한 다이얼로그의 확인 탭 후 동작 확인(재검사 루프인지 영구 제한인지).

## 13. 8차 세션 (2026-09-22) — 가설 정리(A/B 완결), 측정 프로토콜 교정, 도구 보존

> 결과: 잔여 판정 미특정. 현재 포그라운드 결과는 **dead ≤60s로 수렴**(이 부트에서
> 11/11). 다이얼로그/생존 런은 간헐(레이스). 본 세션은 가설 정리와 측정 교정이 본체.

### 13-1. A/B 완결 (전부 기각)
- **monimo 동시 구동(maps 단일파일 오염) 가설 기각**: monimo force-stop 후 단일 타깃
  시험 3/3 dead≤60s — 오염이 현재 사망의 원인 아님(단, 여전히 금지 규칙 유지).
- **ro.sf.lcd_density 프롭 존재 가설 기각**: 450 설정 3/3 dead≤60s. 프롭 값 자체는
  무관(디스플레이 프로필 오버라이드와는 별개 — 오버라이드는 유지).
- 다이얼로그 확인 탭: 다이얼로그 런을 포착하지 못해 미시행(출현율 낮음).

### 13-2. 누적기 값 데이터 포인트
- memmove 변형 크래시 스레드(RxCachedThreadS)의 x2 = **-1,052,256 (≈ -1MiB - 3,680)**.
  런 간 ±16 변동(3차 기록 -69,216과는 다른 프레임/다른 값 — 주의: 세션별 값 이력 혼재).
- 파싱 교훈: 툼스톤 레지스터는 전 스레드가 한 줄씩 — **signal~backtrace 사이 블록만**
  파싱할 것(첫 x2 매치는 대기 스레드 것).

### 13-3. 측정 프로토콜 교정 (중요)
- **백그라운드 "생존"은 프리저 아티팩트일 수 있다** — 캐시 앱은 스레드가 얼어 가드가
  아예 안 돈다. 생존 판정은 반드시 ①topResumedActivity 확인 ②스크린샷 ③탭 반응까지.
- 스크린샷 크기 휴리스틱: 제한 다이얼로그 화면 ≈15.2KB(균일 화면), 스플래시 로고 ≈78KB,
  런처/일반 UI ≈1MB — 자동 분류 가능.
- 이 부트(가동 수시간)에서 포그라운드 사망 11/11로 수렴 — 초기 부팅 직후 구간(6차의
  다이얼로그 런)과 가동 시간/메모리 상태에 따른 판정 변화 가능성.

### 13-4. 다음 세션
1. **0x12c7bc 델타 디코딩**: u16×u16 madd 비교의 x14(맹글링 베이스)는 정적 해독 불가
   — 런타임 값 필요. 접근: (a)acc 필드 시그니처로 ctx 구조체를 힙 덤프에서 특정 후
   스냅샷 diff (b)delta 값이 크게 기여하는 체크를 특정해 해당 채널 후보 재시험.
2. memmove len ≈ -1MiB 상수의 의미(구조체 크기? 버퍼 크기 차?) 추적 — len에서
   acc를 역산해 단일 체크 대량 패널티인지 누적인지 구분.
3. 재부팅 직후 윈도우(6차 다이얼로그 런 조건) 재시험 — 부팅 직후 N분 내 런과
   장기 가동 후 런의 결과 비교.

## 14. 10차 세션 (2026-09-22) — **자폭 = 저장 LR 표적 poison store 확정**, 정적+툼스톤 교차검증

> **핵심**: 9차 최우선 목표(`[x19+0xab8]` 저장 LR이 `0xc`로 처음 덮이는 블록)를 **정적
> 분석 + 기존 툼스톤 레지스터 실측**만으로 결정론적으로 특정·확정했다(타깃 무변경).
> 자폭은 memmove 음수 길이나 누적기가 아니라 **저장 return address 슬롯을 노린 표적
> store**다. 자폭을 선택하게 만든 상류 환경 판정 채널은 OLLVM flattening으로 확산되어
> 미확정 — dynamic 차분(death vs survive)이 다음 과제. 상세: `session10/REPORT.md`.

### 14-1. 자폭 블록·명령 (확정)
- **poison 블록 `0xacca4–0xaccc0`**, 오염 명령 **`0xaccb0  str x10,[x8]`** (x10=`0xc`,
  x8=`&saved_LR`=`x29+8`=`x19+0xab8`). 동반 **`0xaccb8  str x8,[x29]`** (x8=`0x24`→저장 FP).
- `accbc ldr x8,[x9,#0x2a8]`(x9=0x175310)=`[0x1755b8]` → **reloc `R_AARCH64_RELATIVE`
  addend=`0x965e8`**(공유 epilogue) → `accc0 br x8`.
- epilogue `0x965e8`: **카나리(`x19+0xa50`, 저장 LR보다 낮음) 정상 통과** 후
  `ldp x29,x30,[sp,#0x50]`로 오염값 복원 → `0x96618 ret` → `pc=x30=0xc`.
  카나리 무손상 = **일반 스택 스매시가 아니라 LR 슬롯만 노린 표적 store**(구조적 확정).

### 14-2. 교차검증 (측정)
- **툼스톤**(run1_latest_tombstone.txt): `x29=0x24`, `lr=0xc`, `pc=0xc`. 두 store가 각
  슬롯에 적중했음을 레지스터가 직접 증명 → **x8==&saved_LR 확정**.
- **run6 실행 트레이스**(load base 0x7b0fe40000): 자폭 직전 실제 경로
  `…a0488⇄a021c(수천회)→a4038 →96744→97a2c →97cf4→9e728 →a7448→ac43c
  →ae0c8→a9644 →accc0→965e8 →96618→0xc`.

### 14-3. 자폭 진입 배선 (직접분기·트램폴린, 확정)
```
0xae0c8 br [0x1767d0](reloc→a9644) → 0xa9644 b 0xaf394 → 0xaf3a0 b 0xacca4(POISON)
```
- poison 블록은 **점프테이블 대상 아님**(addend에 acca4 없음) → `0xaf3a0` 직접 `b`로만 진입.
- `0xa9644` 도달 순간 자폭 무조건 확정(이후 전부 무조건 분기). 실제 판정은 상류 상태변수.

### 14-4. 환경 판정 채널 (미확정)
- 핸들러 `0x95224`는 **환경 체크 배터리**: 디스패치 루프 `0xa021c..0xa0488`
  (2단 테이블 `#0x960`/`#0x8` → `blr x8` 서브체크 → `cmp w0,#0`), 체크 노드 링크드리스트
  `0xa4038`(`blr x9; str w0,[x20,#0x38]; ldr x20,[x20,#0x28]`), 경로상 바이트 문자열
  복호 루프(`97a2c/9e728/a7448/ac43c`). 구체 비교 예 `ac470 cmp w10,#0x2`.
- 최종 판정은 이 배터리 결과가 flattening 상태변수로 확산 → **정적 단독 특정 비현실적**.
- **정정**: §7의 "ctx+0x1c8 누적기→memmove 음수길이" 모델은 이번 부트 자폭을 설명 못함
  (현재 자폭=LR poison store). memmove(+0xa00c0)·직접SEGV(+0x146370)는 과거 부트의 별개
  crash primitive 변형으로 추정(공통점: 판정 결과가 자폭 분기로 라우팅).

### 14-5. 도구·다음 과제
- 9차 tool 블로커 해소: `llvm-objdump`/`llvm-readelf` = `/opt/homebrew/opt/llvm/bin/`
  (Homebrew LLVM 23.1.1). `.text` VA==파일오프셋 확인. 데이터 점프테이블은 파일에서 0,
  `R_AARCH64_RELATIVE` addend가 실제 타깃(load 시 주입).
- 다음: ① death vs survive 차분으로 서브체크 fn ptr+w0 캡처(좁은 probe `a01fc`/`a0200`)
  ② `ae0c8` 상류 트램폴린 역추적 ③ 재부팅 직후 A/B(9차 미시행, 현재 uptime 5h38m 장기부트).

### 14-6. 동적 결과 (10차 라이브 — reboot A/B + dispatch-id 실측)
- **자폭 경로 부트 불변**: 장기부트(5h38m)·재부팅 직후 양쪽 death trace(각 ~22.6k줄, toss9
  709 broad probe)가 동일 경로 `ae0c8→a9644→accc0→965e8→96618→0xc`, tombstone
  `x29=0x24/lr=pc=0xc`. **"재부팅 직후 생존" uptime 가설 기각** — 재부팅 직후 14런 전부 사망
  (2~4s, pm clear 포함). 생존 미재현.
- **생존 미재현 원인 추정**: /vendor/lib64 bind 사본(phdr 채널)이 이번 부트에 깨끗이 안 얹힘
  (`BIND_OK`지만 /proc/mounts는 dm-33 원본만; 앱 네임스페이스 동일). 6/7차 생존 구성과의 차이.
- **치명 체크 = dispatch id 4 (결정론적, 부트 불변)**: handler 0x95224는 `afed8(param)`가
  런당 48회 호출(9차 재확인). 두 death 모두 **47× id 0 + 마지막 1× id 4 → poison**
  (probe `afed8 arg=%x0`; b02c4 handler=0x95224, a1=a2=0). 9차 "마지막 arg=4" 양 부트 재확인.
  **→ 현재 자폭의 최종 환경 판정 채널 식별자 = afed8 dispatch id 4.**
- **id-4 정적 디코드 caveat**: Ghidra 단순식 `UNK_1b019c + DAT_12c9c6[param]*4`로 계산한
  타깃(0x1ee33c/0x1e5a98)은 파일끝(0x1866B0) 초과 → 무효. afed8 디스패치는 neg/magic-const/
  `madd #0x960` 2D 테이블로 난독 → id-4 타깃은 수동 OLLVM 디코드 또는 동적 관측 필요.
- **차분 상태**: death 반은 config-clean 확보(death1/fbdeath1.trace). survive 반은 미확보
  (생존 미재현) → death↔survive 차분 **미완**. 재개 조건 = bind 사본 복원으로 생존 재현.
- 산출물: `session10/REPORT.md`(상세), `death1.trace`/`fbdeath1.trace`,
  `toss9_uprobe_events.saved`(709 probe replay용).

### 14-7. 환경 read 캡처 (getname/prop/uname/sysinfo) — 신규 채널 후보
death 런의 가드 환경 접근을 syscall 경계에서 캡처(fork-aware, uid10175 필터; `chan` 그룹
append, toss9·전역 kprobe_events 무-clear). `session10/chan1.trace`.
- **재확인(위장 정상)**: uname(2)=`5.15.94-…-abS916NKSU1AWC2`(285회 전부 위장값);
  goldfish_pipe/address_space는 RenderThread/HAL(pid361)의 GL·gralloc(앱 필수, 가드 아님);
  /proc/cpuinfo(camow3 8블록).
- **bind 사본 정정**: `.vl64`는 **정상 작동**(앱/uid10175가 `mapper@3.0-impl-qti.so` 봄).
  10차 초반 "bind 미작동"은 /proc/mounts dm-33 2줄 오독. 그런데도 생존 미재현 → bind는 생존
  게이트 아님.
- **신규 관측: qemu_* 프로퍼티 컨텍스트 잔존**. getprop 값 누수=0인데 `/dev/__properties__`에
  `u:object_r:{qemu_hw_prop,qemu_sf_lcd_density_prop,vendor_qemu_adb_prop,vendor_qemu_prop}:s0`
  4개 존재. resetprop은 **값**만 삭제, SELinux 컨텍스트 영역은 부팅 시 property_contexts에서
  생성돼 잔존. 메인 toss 스레드가 이를 읽음.
- **caveat(미확정)**: 메인 스레드는 컨텍스트 파일을 **274개(전체)** 열었다 →
  `__system_property_foreach` 전수 열거(libea56 임포트). qemu 컨텍스트는 전수 열거에 딸려
  읽힌 것 → "qemu 컨텍스트=id-4 트리거"는 **후보이되 미확정**.
- **다음**: ① qemu 컨텍스트 가설 검증(LKM에 4경로 ENOENT+`/dev/__properties__` getdents 필터
  추가 후 death→survive 전환 여부; 리빌드 필요) ② 2-instance 타이밍 상관(마커 toss9 무필터 +
  getname 별도 instance pid필터, 같은 clock) ③ 생존 재현 ④ afed8(4) 수동 OLLVM 디코드.

### 14-8. env 채널 소거 + MIDR(Apple) 발견 + bind 전파 방법론 (10차 후반)
결정론적 id-4 사망의 판정 입력을 표적 spoof(bind)로 소거. `session10/REPORT.md §동적 결과 2`.
- **qemu 컨텍스트**: 14-7의 "신규 후보"는 **오판** — uid10175에서 4개 전부 ENOENT(**LKM deny
  이미 작동**). getname이 rewrite 전 open 시도를 로깅해 읽는 것처럼 보였을 뿐. 채널 아님.
- **osrelease 불일치**: uname(2)=abS916N(위장) vs `/proc/sys/kernel/osrelease`=real GKI(미위장)
  **불일치 존재**하나, 가드는 osrelease/`/proc/version`을 **안 읽음**(uname(2) 285회만) → 무관.
- **프로세스 목록 goldfish 데몬**: `su 10175`이 322프로세스 봄은 **su의 readproc(gid3009)
  아티팩트**. 실앱은 readproc 없음+`/proc hidepid=invisible` → 자기것만 봄 → **노출 안 됨**.
- **SELinux permissive(enforce=0)**: 가드가 `/sys/fs/selinux/enforce` 읽음(값0). enforce=1 bind
  spoof → **여전히 사망**. 단독 아님.
- **MIDR_EL1=Apple(0x61)**: 가드가 `/sys/.../cpuN/regs/identification/midr_el1` 전코어 읽음.
  실제 0x610f0000=**impl 0x61(Apple M1 호스트)/part0** vs 가짜 cpuinfo **ARM(0x41)
  Snapdragon(d4e/d4d/d46)** → **미위장 불일치(실재 gap)**. ARM bind spoof → **여전히 사망**.
- **방법론**: adb shell bind-mount가 **토스 zygote 네임스페이스로 전파** 확인
  (`/proc/<pid>/root`로 앱이 fake midr/qti mapper 봄) → bind spoof 유효. MIDR+enforce 동시
  spoof도 사망.
- **결론**: **단일 surface-value 트리거 아님** → 누적 또는 비-값 채널(behavioral/timing/
  in-process GL, 또는 **LKM redirect fstat 탐지** catch-22 — 7차→8차 survive→death 회귀와 정합).
- **다음**: ① redirect-tamper 검증(가드가 redirect 대상 fstat/statx로 st_dev/st_ino 교차검증?)
  ② MIDR/enforce LKM redirect 정식화(누적 후보) ③ 누적 surface 감사 ④ survive 재현/in-process GL.

## 15. 11차 세션 (2026-09-22) — redirect-tamper 가설 기각(stat 프로브 음성), gles_max 재지향 실패 재확정, 가드 read 지도 완성

> **핵심 결과**: ① **가설 A(redirect-tamper) 기각** — vfs_statx/newfstatat 전수 프로브로
> 토스 사망 런 관측 결과, 가드 프로세스 트리의 stat은 **전부 앱 데이터 파일**
> (shared_prefs/idmap/logstore)이며 /proc/cpuinfo·version·redirect 대상에 대한
> stat/fstat은 **0회**. 가드는 open+read만 한다 → st_dev/ino tamper 채널 없음.
> ② gles_max 토큰 emit 재지향(v5, 포인터 방식)도 시스템 크래시 — **토큰 문자열은
> 어떤 변형으로도 건드릴 수 없는 load-bearing 문자열로 확정**. ③ 가드 read 지도
> 완성(아래 신규 surface). 분석 축은 비-값 채널/동적 관측으로 이동.

### 15-1. 가설 A 검증 (Phase 1 — stat 프로브, 음성)
- 프로브: `vfs_statx fname=+0(%x1):ustring` + `__arm64_sys_newfstatat`(wrapper inner
  regs `+0x8(%x0)`) + `__arm64_sys_statx` — kprobe_events **append**만 사용(toss9 보존).
- 토스 1런(2s 내 사망) 캡처 36k 이벤트: 토스 트리(27948±80)의 stat = 58회 전부 앱 데이터.
  `/proc/cpuinfo` stat 0회, `/proc/version` stat 1회(시스템 데몬, 가드 아님 — 
  /data/system/last-header.txt 접근과 동반).
- 결론: **fstat/statx 기반 tamper 체크 없음**. id-4는 값 채널(누적) 또는 syscall 밖
  (in-process GL/behavioral). /dev-clone redirect 방식 자체는 유지 가능.

### 15-2. gles_max 토큰 — emit 재지향(v5)도 실패, 게스트 파서 해독
- 게스트 libEGL_emulation 0x10afc(hasES3 게터) 해독: strstr 3연타 —
  needle1=`QCOM_ADRENO_gles_max_version_3_0`(6차 rename이 남은 것),
  needle2=`ANDROID_EMU_gles_max_version_3_1`, needle3=`…_3_2` — **하나라도 있으면 ES3=true**.
- v5(emit 포인터를 0x8a32fb→심은 QCOM 문자열로 재지향, 기능키 무손상) 적용 →
  **여전히 "EGLContext creation failed" 크래시 루프**. → needle1 일치에도 크래시 =
  ES3 게이트가 이 함수 하나가 아니거나(호스트 측 자기검증 등) 다른 깨진 요소와 결합.
- 원복(idem) 후 시스템 정상 복구 확인. **결론: gles_max 문자열은 rename/skip/retarget
  모두 크래시 — 사실상 봉인된 문자열. ANDROID_EMU 1토큰 잔존 수용 확정.**
- 교훈: 6차 "restore"가 sync 버그로 유실돼 게스트 리터럴이 QCOM인 채 운용되고 있었음
  — 그 상태에서 시스템·토스 런이 동작한 이력까지 포함해 재해석 필요.

### 15-3. 가드 read 지도 (chan1.trace 재분석 — 신규 surface)
가드(`<>` comm, fork 자식 포함)가 읽은 경로 전수 분류:
- **기존 커버**: /proc/cpuinfo·version(FAKE), /sys/.../online(FAKE), maps/status/mounts(FAKE),
  midr_el1 cpu0-8(cpu8=ENOENT 프로브 — 코어수 검증), goldfish 디바이스(클론 세탁),
  /dev/__properties__(LKM deny), qemu 프롭 컨텍스트(deny).
- **신규 미위장 surface (후보)**:
  - `/proc/self/stat` ×2 [REAL] — vsize/starttime 등 프로세스 메타
  - `/proc/sys/kernel/random/boot_id` ×1 [REAL] — 부팅 식별자(리부팅 빈도 추적 가능)
  - `/proc/thread-self/attr/current` ×9 [REAL] — 스레드 SELinux 컨텍스트
  - `/sys/kernel/tracing/trace_marker` ×1 — **LKM deny(→ENOENT) 중. 실기기 user 빌드는
    EACCES 예상 — errno 프로파일 불일치 가능성** (deny 방식의 errno 재검토 과제)
  - `/proc/uid_procstat/set` ×1 [REAL]
  - `/proc/13921/` 집중 관찰(cmdline 17회+comm+stat+status+oom_score_adj+task) —
    가드가 특정 pid를 표적 조사(자식 검증/anti-debug). 13921의 정체 확인 과제.
- /proc/N/cmdline 브루트포스 스캔(1~370+ 고정 pid): hidepid=invisible로 실패 확인(3회
  반복 = 재시도 패턴).

### 15-4. 12차 로드맵
1. **동적 needle 관측**: toss9 broad trace의 indirect-branch target으로 0x136a0(strstr)
   호출 시 인자(x1=needle) 캡처 uprobe 추가 → 가드가 실제로 어떤 문자열을 비교하는지
   런타임 열람 (OLLVM 정적 디코드 불요).
2. **/proc/13921 정체**: 가드의 표적 조사 대상이 누구인지(자식 검증? 타 프로세스?).
3. trace_marker errno 프로파일 실험: LKM deny를 ENOENT→EACCES 위조로 바꿔 death 변화 확인.
4. MIDR/enforce LKM 정식 redirect: 값 단독 spoof는 이미 실패 — **최종 구성 단계용 보류**.
5. boot_id/attr/current/stat surface의 실기기 값 확보(실기기 비교 데이터가 있으면) 후 위장.

## 16. 12차 세션 (2026-09-22) — **판정 상태 머신 변수 레벨 해독** (dispatcher→poison 체인)

> uprobe 캡처로 7차 모델(0x1c8 누적기 4 STR 사이트)이 **현재 사망 경로에서 미실행**임을
> 실측(0 히트 — 10차 폐기 재확인). 대신 dispatcher(0xafed8)의 정확한 디스패치 공식을
> 복구하고, id를 결정하는 **상태 전역변수 → 판정 플래그 → 카운터 → 체크 영역**의
> 전체 체인을 변수 레벨까지 해독. 다음 세션은 카운터 영역 uprobe로 마무리 수렴 가능.

### 16-1. dispatcher 공식 복구 (10차 "2D 테이블 무효" 재검증)
- `afed8(id)`: x10 = **0xb019c + *(u16*)(0x12c9c6 + id*2)*4** → br x10 (코드 직접 점프).
  id0→0xee33c(정상 블록), **id4→0xe5a98(`br x7` — poison 진입 체인)**.
  10차의 "2D madd #0x960"은 afed8이 아니라 **afed8의 호출부(0xf8a98, 2D 함수포인터
  테이블 [row*0x960+col*8])**의 호출이었음 — 혼동 정정.
- 툼스톤 재해석: b02xx 사이트는 toss9 미프로브(709 중 미포함) — death1.trace에 부재 확인.

### 16-2. id 결정식 → 상태 변수
- 호출부 0xf8a98: `id = 0xa5a67d4c + 글로벌[0x1821a0]` (부호 32bit 가산).
  관측: id0 런 = 글로벌 0x5a5982b4, **id4 런 = 0x5a5982b8 (+4)** → 글로벌 +4 = 판정 flip.
- 글로벌 0x1821a0 참조 10곳(0x935xx 1곳 + 0xf85xx~0xf8b2x 9곳 — dispatcher-caller 함수 내).

### 16-3. 상태 전환 게이트 (0x93574 블록)
- **판정 플래그 [0x19e5e8] = 0x2d39c15b - 카운터[0x185758]** (低32bit) 가 여기서 기록.
- 플래그==1 & 바이트플래그([x23]&1) 조건 → 함수포인터 테이블을 0x1821a0에서
  **0x179c18(대체 테이블 = poison 경로)으로 csel 전환**.
- [0x185758] == 0x2d39c15a 이면 플래그=1 (즉 카운터가 특정 값에 도달하면 판정 확정).

### 16-4. 카운터 유지 영역 (다음 세션 표적)
- 카운터 [0x185758] 참조 클러스터 = **0x90800~0x91100 함수 영역** (체크 루프 본체).
- 0x90ffc: `cmp w9, 0x2d39c15b + 카운터` — **체크 결과 vs 카운터 파생 상수 비교**.
- 0x91050: [0x19e39c] 오브에서 w11 비트 조합 → [0x19e39c] 갱신 (별도 플래그).
- 다음 세션: ① 카운터 STR 사이트 스캔(0x90800~0x91100 내) + uprobe로 카운터 궤적 캡처
  ② 0x9102c cmp의 w9(체크 결과) 런타임 캡처 → 어떤 값이 카운터 파생 상수와 어긋나는지
  ③ w9의 소스 디코딩(어느 env read에서 왔는지) → 최종 채널 특정.

### 16-5. 방법론
- uprobe 0히트 = "해당 코드가 실행 안 됨"의 확실한 증거(7차 모델 폐기 근거).
- adrp+add 전수 스캔(레지스터별 adrp_last 추적)으로 구조체 필드 지도 작성 —
  `scripts/scan_struct_offset.py`는 imm12 기반이니 adrp+add 쌍 스캔은 인라인 파이썬 사용.

## 17. 13차 세션 (2026-09-22) — **5.5분 포그라운드 생존 달성 (2연속 재현)** — MIDR/enforce 위장이 판정 전환

> **핵심**: v4.5에서 MIDR_EL1(호스트 Apple 0x61 → ARM SM8550)과 selinux enforce(0 → 1)
> 을 LKM redirect로 위장하자, 토스가 **2초 결정론적 자폭에서 5.5분 포그라운드 생존으로
> 전환**(2연속 재현, 제한 다이얼로그 없음, 스플래시 정상 GL 렌더링). 10차의 bind spoof
> 테스트(MIDR+enforce, 여전히 사망)와 결과가 다른 이유: LKM redirect는 getname 계층이라
> **가드 fork 자식의 모든 접근 경로를 커버**하는 반면 bind spoof는 전파 공백 가능.
>
> **잔여 gap (정직한 평가)**: 스플래시에서 메인 UI로 진입하지 않음(104% CPU 지속 =
> 가드 루프 추정), 탭/백그라운드 전환 시 사망(툼스톤 없는 kill형). 완전 기능 생존까지는
> 상호작용 연계 or 지연 체크 1개 남음.

### 17-1. redirect-tamper 가설 기각 (11차 → 12차 확정)
- vfs_statx/newfstatat 전수 프로브로 사망 런 관측: 가드 트리의 stat은 전부 앱 데이터
  파일. /proc/cpuinfo·version·redirect 대상 stat/fstat 0회. **가드는 open+read만** —
  st_dev/ino tamper 체크 없음 → /dev-clone redirect 설계 유지 확정.

### 17-2. v4.5 구현 내용
- LKM: `dis_cpuinfo` 모듈 파라미터(A/B 토글용), MIDR_EL1 redirect(cpu별, camow3 fake
  `0x00000000411fd4e0` 등), selinux enforce redirect(→"1").
- camow3 v4.5: /dev/.m8c4kd(MIDR), /dev/.k3v9te(enforce) 생성.
- 검증: `su 10175 sh -c "cat .../midr_el1"` = 0x00000000411fd4e0, enforce = 1 ✓.

### 17-3. A/B 실험 결과
| 조건 | 결과 |
|---|---|
| cpuinfo redirect ON + MIDR/enforce 위장 | **3/3 ALIVE 90s+ → 5.5분 생존 2연속** |
| (이전 부트) 위장 없음 | 사망 ≤60s 수렴(8차 11/11) |
| cpuinfo redirect OFF 테스트 | 미실시(ON에서 이미 생존 → 무의미) |

### 17-4. 잔여 현상
- 스플래시 정체: 5.5분간 SplashActivity 유지, 104% CPU — 가드가 체크 루프를 계속
  도는 것으로 추정(12차 해독: dispatcher는 런당 48회였으나 생존 시에는 계속 반복?).
- 탭/백그라운드 전환 시 사망(툼스톤 없는 kill형 — RxCachedThreadS kill 경로 잔여).
- 다음: ① 104% CPU 활동의 정체(ftrace 재캡처 — 생존 상태에서의 체크 루프 관측)
  ② 탭 사망의 트리거(입력 이벤트 연계 체크?) ③ 스플래시 → 메인 UI 진입 조건.

### 17-5. 최종 구성 스냅샷 (생존 구성)
- LKM v4.5(모든 redirect + uname 위장 + MIDR/enforce 위장 + Emulator overlay deny)
- dylib: identity + version(v2/v32) + tokens(39개) — gles_max 1토큰 잔존
- hw.lcd 1080x2340@450, hw.ramSize 8192, hw.cpu.ncore 8
- bind .vl64, camow3 v4.5, egl=adreno, SELinux Permissive

## 18. 14차 세션 (2026-09-22) — 루프 정체 확정(연속 모니터링 스톰), **탭 사망 = 서버 게이트로 귀속**, 로컬 목표 달성

> **최종 구도**: ① 가드의 100% CPU 루프 = **연속 재검사 스톰**(40s 동안 203만 getname,
> 초당 ~5만 회 — lib 디렉터리 열거 ×3885, /proc/self/fd/3 readlink 31k, distinct 경로
> 178만) — 가드의 정상 상시 모니터링이며 poison dispatcher 호출 **0회**. ② **탭 사망은
> 네트워크 의존**: 비행기 모드에서 탭해도 생존(60s+ 확인), 온라인에서만 탭 시 사망 →
> **서버 게이트(기기 지문 거부)** 귀속 = 확립된 권한 경계 밖. **로컬 자폭 무력화 목표
> 달성 확정.**

### 18-1. 생존 상태 루프의 실체
- 생존 인스턴스(13min+)에서 40초 캡처: 203만 g2 이벤트 전부 토스 프로세스.
- 구성: lib 디렉터리(/system/lib64, /apex/*/lib64, /vendor/lib64/egl·hw 등) opendir
  스캔 ×3885, /proc/self/fd/3 readlink ×31k, /proc/N/cmdline 브루트포스, /dev/urandom.
- dispatcher(afed8) 호출 0회 → 루프는 poison과 무관한 **정상 상시 모니터링**.
  (사망 런에서는 이 루프가 1회 돌고 id4로 즉사했음 — 위장 전.)

### 18-2. 탭 사망의 귀속 (비행기 모드 A/B)
| 조건 | 탭 결과 |
|---|---|
| 온라인 (13min 생존 인스턴스) | **3s 내 사망** (런처 전환, 툼스톤 없음 = kill/exit형) |
| **오프라인 (비행기 모드)** | **생존** (60s+ 탭 후에도 pid 유지) |
- 탭 → 앱이 본 flow 진행 → 서버 핸드셰이크 → 기기 지문 거부 → 조용한 종료.
- = **서버측 안티프로드 게이트**(STATUS 경계: 승인 필요). 로컬 위장 영역 밖 확정.

### 18-3. 스플래시 정체의 재해석
- 스플래시 머무름 = 서버 세션 확립 실패(오프라인 시 무한 대기, 온라인 시 서버 거부로
  추정) — 가드 루프와 별개. 로컬 위장으로 해결 불가 영역 명확화.

### 18-4. 최종 성능 지표 (14차 종료)
- 오프라인: 기동 → 포그라운드 스플래시 → **탭 포함 생존** (사망 0)
- 온라인: 기동 → 포그라운드 스플래시 → **비상호작용 3분+ 생존** (탭 시 서버 게이트로 사망)
- 최장 생존 관측: **13분+** (98% CPU 루프 지속, 다이얼로그/크래시 없음)
- 모니모 동시 생존 유지. 로컬 자폭 메커니즘: **완전 무력화.**

### 18-5. 15차 잔여 (선택)
- 스플래시가 서버 핸드셰이크를 시도하는지 네트워크 캡처로 확인(경계 확인용 관측만).
- 탭 사망 시 시그니처(툼스톤 없음 → exit() 경로) 추적 — 서버 거부 응답 처리부 RE(경계 확인 후).
- 카운터 영역(0x90800~0x93900) 세부 디코딩은 학술 가치만 남음(로컬 자폭은 이미 무력화).

## 19. 15차 세션 (2026-09-22) — "탭 사망" 정체 규명 = **ANR 다이얼로그 해제 아티팩트**, 본체는 메인 스레드 Chromium 스톰

> **핵심 정정**: "탭하면 사망"은 가드의 상호작용 체크가 아니었다. AMS 로그
> `am_kill: [0,25784,viva.republica.toss,0,user request after error]` — **앱이 먼저
> ANR/에러 상태였고, 탭이 시스템 다이얼로그(닫기)를 눌러 "사용자 요청 kill"이 된 것**.
> 가드/서버의 상호작용 연계 체크 가설 기각. 진짜 잔여 문제 = **스플래시 메인 스레드가
> Chromium(TrichromeLibrary)+libc 디렉터리 순회 스톰에서 스핀(ANR)**.

### 19-1. 탭 사망 해부 (시그널/AMS 실측)
- signal_generate: sig=9 code=0 (kill 스타일), 이후 sched_process_exit (main + binder +
  RxCachedThreadS 전체). 툼스톤 없음.
- AMS events: `am_kill [0,25784,...,0,user request after error]` + `am_proc_died`.
- **프로토콜 교정**: 생존 판정 시 "탭 테스트"는 ANR 다이얼로그가 떠 있는 상태에서 하면
  안 된다(다이얼로그 닫기 = kill로 기록됨). 탭 테스트는 기동 직후(ANR 전)에 하거나
  `am_kill` 이벤트로 사유 확인을 병행할 것.

### 19-2. 메인 스레드 스톰의 실체 (ANR 덤프 /data/anr/)
- 토스 main(sysTid=25784): **state=R(스핀), utm=18.4s / stm=68.0s** — 시스템 시간
  우세 = syscall 스톰(open/readdir류) 확정.
- native 스택: libc(opendir/readdir류) ← **TrichromeLibrary(Chromium) 프레임 다수** ←
  libart(JNI). = **Chromium 코드가 메인 스레드에서 디렉터리 순회 스톰**.
- s14 루프 캡처(203만 getname)의 lib 디렉터리 열거 ×3885 등이 이 스톰의 실체로
  재귀속 — libea56이 아니라 **Chromium 경유 파일 스캔**이었다(11차 stat 프로브가
  libea56 누적기 미실행을 잡은 것과 합쳐 귀속 정리 완료).
- 가설: LKM redirect가 Chromium이 읽는 /proc 파일(예: cpuinfo/version 내용)을 바꿔
  Chromium/WebView 초기화가 재시도 루프에 빠졌을 가능성. **검증: dis_cpuinfo=1(13차에
  추가한 토글)로 리다이렉트를 끄고 스톰 소멸 여부 확인** — 16차 첫 실험.

### 19-3. 프로토콜/문서
- "제한 다이얼로그"(6차 관측)와 "ANR 다이얼로그"(15차)는 다른 것 — 전자는 가드 UI,
  후자는 시스템 ANR. 스크린샷 크기만으로 구분 불가 → 반드시 화면 내용 확인.
- am_kill/am_proc_died 이벤트 로그(logcat -b events)가 사망 사유의 1차 증거.

### 19-4. 16차 로드맵
1. **dis_cpuinfo=1 토글** → Chromium 스톰 소멸 여부(redirect 콘텐츠가 Chromium을 깨는지
   분리). 소멸 시: redirect 대상 중 Chromium이 읽는 파일을 inode/dev 보존형으로 전환.
2. 스톰 소멸 안 되면: strace 불가 환경이므로 getname 캡처에서 **Chromium 프레임 시점의
   경로 패턴**만 추려 주기성/대상 특정 후 재설계.
3. 스톰 해소 시 스플래시 → 메인 UI 진입 여부 → 5분 3점 검증 최종 확정.

### 19-5. (16차 선행 실험) _emulation 파일명 rename — **load-bearing 확인, 클린 리네임 설계 확정**
- /vendor/lib64/egl의 lib*GLES*_emulation.so 3종을 _legacy로 rename → 즉시 GL 파괴
  (토스 사망, 시스템 블립). 원인: **현재 libEGL_adreno.so(프리스틴 사본)의 내부 dlopen
  리터럴이 원본 이름(libGLESv2_emulation) 그대로** — _emulation 파일이 실제 로드 본체.
- 즉 본체 파일명을 바꾸려면 **파일명 + 내부 dlopen 리터럴 + DT_SONAME 3종을 일관되게**
  함께 바꾸는 클린 리네임이 필요(6차의 실패는 soname 오타·이중 사본·리터럴 미정합의
  복합 — 클린 버전은 미시행).
- 클린 리네임 절차(16차): ① .vl64 egl 6파일(libEGL 2 + GLESv1 2 + GLESv2 2)의
  파일명·dlopen키·soname을 동일 중립명(예: libGLESv2_adreno201.so 계열 — 단
  "adreno201" 문자열은 가드 어휘와 무관)으로 일괄 치환 ② hw/·root의 enc/lib 들은
  무관 ③ stop;start ④ Chromium 스톰 소멸 여부 → 스플래시 진행 여부.
- 주의: soname 치환 시 NUL 패딩(짧아지는 방향)만. 6차의 202/201 오타 재발 금지 —
  치환 후 반드시 readelf DT_SONAME + dlopen 키 검증.

## 20. 16차 (2026-09-22) — 클린 리네임 시험(결과 불확정), 레이스 판정 특성 확정, 원복 완료

> egl 트리오 클린 리네임(파일명+dlopen키+soname 3종 일관, NUL패딩)을 적용했으나
> 결과 불확정(1런 사망 후 원복). 프리스틱 복원 후 2/3 ALIVE90s+ — **판정이 런당
> 레이스**(동일 구성에서 생존/사망 혼재). 로컬 자폭 무력화는 유지(13차 달성분).

### 20-1. 클린 리네임 시험 기록
- 패치: 6파일의 soname/dlopen키를 emulation→adreno(NUL패딩) 일괄 치환 —
  바이트 검증 완료(emulation 잔여 0).
- dlopen키가 프레임워크 로드 파일명과 일치하도록 설계("libGLESv2_adreno.so" 형태) →
  단일 사본 보장 의도.
- 결과: 첫 런 사망(≤60s) — 단, 직후 프리스틱 복원 런에서도 1/3 사망 → **사망은
  리네임과 무관한 레이스 판정 가능성이 우세**하나 단정엔 런 수 부족.
- 리스크 관리: 15차의 GL 파괴와 달리 시스템 전체 크래시는 없었음(개선).

### 20-2. 레이스 판정 특성 (13~16차 누적)
- 동일 구성에서 ALIVE90s+와 dead<60s가 혼재(13차 3/3 alive → 14차 tap-death(온라인) →
  16차 2/3 alive + 1/3 dead). alive 런은 300s+까지 지속.
- 레이스의 축 후보: 가드 체크 스레드 스케줄링 순서, 서버 응답 타이밍(온라인),
  체크 대상 파일의 I/O 타이밍.
- **오프라인에서의 생존은 확정**(14차) — 온라인 상호작용 시 사망만이 잔여.

### 20-3. 운영 스냅샷 (16차 종료)
- egl 6파일 프리스틱 복원 완료(3차 구성). bind/camow3/LKM v4.5 정상.
- 프리스틱 egl 보존본: /tmp/egl_patch(휘발성 — 세션 보존 요망:
  analysis/toss-rasp/session11에 복제 권장).
- 16차 클린 리네임 패치본: 로컬 /tmp/egl_audit(휘발성) — 재시도 시 재생성.

### 20-4. 17차 이후
1. 런 수를 늘린 통계(각 10런)로 레이스 판정의 조건부 확률 정리 — alive 조건 특정.
2. 서버 게이트 경계 확인 관측(14차 §18-5) — 탭 시도 시 가드 서버(103.42.60.101:11099)
   접속 여부만 기록(우회 시도 금지).
3. 카운터 영역(0x90800~0x93900) 디코딩은 학술 과제로 강등.

### 19-6. 종료 직전 관찰 (추가)
- 사망 유형 확정: **신호 없는 자발적 exit** — kill/tgkill 시스템콜 0회, am_kill 없음,
  툼스톤 없음, 프로세스가 조용히 소멸(2~4분 시점). = 가드의 exit() 경로(조용한 종료).
- 카운터 [0x185758] 값 = 0x2d39c15a로 **런 내내 정적**(폴링 관측) — 패널티가 이 카운터에
  누적되지 않음. 판정 입력은 다른 경로(메모리 내 별도 구조)로 관리.
- 스톰의 주체 재귀속: **메인 스레드.comm(.republica.toss)의 getname 스톰** = Java 계층
  (java.io.File) 또는 Chromium — libea56 네이티브 체크 아님(toss9 uprobe 0히트).
- "100% CPU = 가드 체크 루프"가 **메인 스레드를 점유** → 스플래시 진행 불가 + ANR —
  가드의 quarantine 동작으로 추정(체크가 실패하는 한 메인이 풀리지 않는 구조).

### 19-7. 16차(다음) 로드맵
1. **메인 스레드 스톰의 소스 코드 위치**: ANR 덤프의 Chromium 프레임 오프셋 역해석 +
   getname 스톰의 호출 패턴(경로 집합)으로 어느 컴포넌트의 스캔인지 특정 —
   Chromium이 아닌 가드 Java 경로면 후킹 지점 확보.
2. exit() 호출 지점: exit_group 시스템콜 프로브로 사망 순간의 호출 스택 컨텍스트 확보.
3. 카운터 외 판정 구조 탐색: [0x185758]이 정적이므로 **다른 판정 변수** 존재 —
   0x19e39c/0x19e3c8/0x19e808 파생 플래그들의 변화 추적(t12_watch 확장).

## 21. 17차 세션 (2026-09-22) — **탬터 누출 경로 차단 성공 → 7분+ 포그라운드 생존 (최장 기록)**

> **핵심**: 16차에 발견한 "가드 자식이 가짜 파일명 11개를 수집"의 **누출 경로를 차단**하는
> d_path 역매핑(v4.6b)을 구현 → 토스가 **7분+ 포그라운드 생존**(topResumed 유지, 다이얼로그
> 없음, 크래시 없음). 13차의 5.5분 + 17차의 7분 — 프로젝트 최장 기록 갱신.

### 21-1. 누출 경로의 실체 (16차 수집 데이터의 해석 완성)
- 가드 자식(23657)이 읽은 11개의 난수 파일명 = **우리 가짜 파일 11개와 정확히 일치**.
- 수집 경로: 가드가 /proc/cpuinfo 등을 열면 LKM getname redirect가 fd를 /dev/.fake에
  연결 → 가드가 **readlink(/proc/self/fd/N)** 하면 d_path가 "/dev/.zc7h4u"를 그대로
  반환 → **가짜 파일명이 그대로 누출** → 가드가 /dev에서 열어 존재 확인 → tamper 확정.
- 11개 이름 = redirect 테이블과 1:1 대응 → 우연 일치 불가능한 결정적 증거.

### 21-2. 해결: d_path 훅의 역매핑 (v4.6b)
- dpath_ret에 12개 (fake → real) 매핑 테이블(dmap[]) 추가 + 접두부 매칭(ncmp) →
  readlink 결과를 원본 /proc 경로로 되돌림. d_path 버퍼는 페이지 단위라 소폭 성장 안전.
- 검증: `su 10175 ls -la /proc/<toss>/fd/` → **"/proc/self/maps" 반환** (이전: "/dev/.q7zm4h").
- 12개 매핑: cpuinfo, version, maps, smaps, status, mounts, unix, tcp, misc,
  uid_time_in_state, selinux/enforce, midr_el1(cpu0 대표 — per-cpu 분기는 미지원).

### 21-3. 생존 지표
- v4.6b 적용 부트에서 토스 기동 → **7분+ 포그라운드 생존** (topResumedActivity = 토스,
  다이얼로그 없음, 로그캣 에러 없음). 스플래시 로고 정상 렌더.
- 100% CPU 루프 = 가드의 연속 재검사 스톰(정상 동작, poison 무관 — 14차 확정).

### 21-4. 18차 로드맵 (남은 것)
1. 스플래시 → 메인 UI 진입 조건 규명 (서버 세션 필요성 — 경계 확인 후 관측만).
2. MIDR per-cpu 매핑(cpu0-7 각각 다른 값) — 현재 전 코어가 cpu0 값으로 위장.
3. 0x935xx 상태머신의 flip 조건 디코딩(12차 §16-3 연장) — 학술.
4. v4.6의 kill	sig=9→0 위장(kprobe)은 **미검증 상태로 소스에 포함** — 다음 부팅에서
   Thread-N의 kill(getpid,9) 발화 여부 관측 후 효과 판단.

## 22. 18차 (2026-09-22 밤) — **normalize 무한루프 버그 수정** (cpu147M 프로브의 정체), 생존 안정화

> **핵심 수정**: 17차에 발견한 "cpu147662542 무한 프로브"의 근원 = **v3.7의
> normalize_cpu_path**. 가드가 코어수 프로브(cpuN을 N++하며 ENOENT 대기)를 돌리면
> normalize가 모든 N을 cpu0으로 되돌려 ENOENT가 영원히 안 남 → **무한 루프 → 100%
> CPU → 스플래시 정체**. 8코어 실확장(ncore=8)으로 normalize는 불필요해졌으므로
> 호출부 제거(v4.6). 90s+ 시험에서 루프 볼륨은 감소(스톰은 잔존 — 모니터링 본질).

### 22-1. 18차 시험 결과
- normalize 제거 빌드로 토스 기동: **420s(7분) 생존, 사망 0** — 첫 런(14512)은
  백그라운드 전환(런처 top), 재기동(17379) 후 420s+ 포그라운드 유지.
- 스플래시 → 메인 UI 진입: 여전히 미진행 — 스톰(모니터링)과 별개의 원인
  (서버 세션 or WebView 스타업 블록)으로 확정. camow3 중단 가설 기각
  (churn 없이도 정체 지속).

### 22-2. 스킬/문서 반영
- toss_launch_stats.sh(런 분류 자동화), toss_state_watch.sh(상태 폴링),
  scan_adrp_add.py(adrp+add 스캔) 스킬 scripts 보존.
- build-in-docker.sh: make 출력 tail 마스킹 제거(컴파일 에러 가시화) —
  16차의 "빌드 성공인데 옛날 .ko" 문제의 근원 일부 해소.

### 22-3. 19차 로드맵
1. WebView 스타업 스톨의 fopen 타깃 특정 (do_filp_open 프로브 재등록 — 부팅마다 필요).
2. 스플래시 진행 조건: 서버 세션 여부 관측(tcpdump 없이 /proc/net/tcp 폴링으로 충분).
3. 100% CPU 루프의 주체(가드 vs 앱 자체) — CPU 프로파일러 부재 환경에서는
   /proc/<pid>/task/*/stat의 utime/stime 증분으로 스레드별 산정 가능.

### 22-5. 🏆 **최종 달성 상태 (검증 완료)**
- 토스 원본(pid 23864): **6분 21초+ 포그라운드 생존** — topResumed 유지,
  메인 스레드 **idle(0% CPU)** — 100% CPU 루프 완전 소멸, ANR 없음, 다이얼로그 없음.
- 3점 검증: ① topResumed ✓ ② 스플래시 렌더 ✓ ③ 탭 반응(사망 없음, ANR 없음) ✓.
- 스플래시 이후 진행 = 서버 세션 필요(경계 밖) — 로컬 영역의 자폭/ANR/루프 전부 해소.
- 원인 계통 요약: ① d_path 가짜명 누출(→ 자식이 11개 수집, 16차) → 역매핑 차단
  ② normalize 무한루프(cpu147M, 17차) → 호출부 제거 ③ 자가 kill(9)(15차 Thread-44)
  → kprobe 인자 위장 — 세 수정이 합쳐져 현재의 안정 idling 상태.

## 23. 19차 세션 (2026-09-22 오전~오후) — **EGL 레지레션 2종 근본 픽스 → 8분+ 육안 생존 복원**, 잔여 = 조용한 exit 1개

> **핵심 요약**: 부팅 직후 재현된 3~8초 즉사(EGL_NOT_INITIALIZED)와 6분 시점 ANR(무한
> 프로브 부활)의 근본 원인을 각각 특정·수정했다. 결과: **스플래시 렌더 + topResumed 유지 +
> 메인 스레드 idle + 8분+ 생존**(프레임워크 외붕괴로 중단될 때까지). 잔여 판정은
> "메인이 ~1~4분에 신호 없이 exit(0)" 하는 조용한 exit 1개.

### 23-1. EGL 즉사 레지레션 — 원인과 이중 픽스 (★ 이번 세션 최대 수확)
- 증상: RenderThread SIGABRT `'Failed to create context, error = EGL_NOT_INITIALIZED'`
  (3~8s). 뒤이어 다른 부트에서는 `'couldn't find an OpenGL ES implementation'` (로더 fatal).
- **원인 ①**: v4.6(634b)의 신규 "emulation" 경로 deny + dirent 은닉(line 116/590)이
  target uid(토스)의 GL 드라이버 사슬을 끊음. 앱 EGL 로더는 bind 사본의
  `libEGL_adreno.so`를 열어도 그 내부 dlopen 키가 `libGLESv1_CM_emulation` /
  `libGLESv2_emulation` 그대로(§19-5의 프리스틱 사본) → deny → 컨텍스트 생성 실패.
- **픽스 ①(리터럴 패치)**: `_adreno` 사본 3종 내부의 모든 `emulation`(8곳 — dlopen 키
  2, DT_SONAME 3, 로그태그 3)을 `adreno\0\0\0`로 치환. SONAME까지 같이 바뀌므로
  로더가 로드한 lib와 내부 dlopen이 soname dedup으로 동일 soinfo로 수렴(검색경로 불필요).
  → 스크립트화: `scripts/patch_bind_egl_literals.py` (멱등, 원본 .bak_* 보존).
  산출물 백업: session19/egl_patch/.
- **원인 ②(의외의 발견)**: `ro.hardware.egl`은 **부트마다 스톡값 `emulation`으로 리셋**.
  Android 13 EGL 로더는 **readdir 없이 고정 이름만 시도**(emulation → platform(kalama) →
  generic; 5차 트레이스로 실측)하므로 egl=emulation이면 deny 때문에 **드라이버를 못 찾아
  fatal**. 17~18차 부트가 "egl=adreno"였던 것(핸드오프 요약의 상태)은 resetprop 산물 —
  재부팅 후 재적용 필수 항목이었다.
- **픽스 ②(부팅 절차)**: `resetprop ro.hardware.egl adreno` (+ `ro.hardware.vulkan default`).
- **정합 상태**: egl=adreno(로더가 _adreno 선택) + 리터럴 패치(내부가 adreno 세트) +
  v4.7 deny(앱에는 emulation 경로 ENOENT) → 앱 GL 완전 동작. SF/HAL(비타깃 uid)은
  기존대로 _emulation 사용 — 상호 호환(동일 wire protocol).

### 23-2. 무한 프로브 부활 — v4.5 MIDR wildcard redirect가 17차 버그와 동일 클래스
- 증상: 메인 스레드가 `/sys/devices/system/cpu/cpu38747677/regs/identification/midr_el1`
  류를 82만 distinct 시도(20k/s) → utime/stime 급등 → 6m21s에 SystemJobService ANR.
- 원인: v4.5의 midr redirect가 `cpu<임의수>/regs/identification/midr_el1`을 전부 매치 →
  가드의 코어수 프로브(cpuN을 N++하며 ENOENT 대기)의 ENOENT가 영원히 안 남. 17차
  normalize_cpu_path 무한루프와 **동일 클래스의 재발**(normalize 제거만으로는 불충분).
- 픽스: **LKM v4.7** — midr redirect를 cpu0-7로 한정(코어수 파싱 후 범위 검사), cpu8+는
  실경로 통과 → ENOENT → 프로브 정상 종료. 빌드: build-in-docker.sh, 339,704B.
  검증(uid 10175 뷰): cpu3=0x411fd4e0(위장), cpu8=ENOENT(종료) / cpuinfo 8코어 유지.
- 부수 관측: 18차 §22-5의 "메인 idle"도 이 픽스 후 재현 확인(utime/stime 정적, state=S).

### 23-3. 관측 인프라 (chan19 instance)
- kprobe: p19_gn(getname_flags path=:ustring), p19_fo/r19_for(do_filp_open 입출력 쌍),
  p19_eg(exit_group) + tracepoint(sched_process_fork/exit, signal_generate). 전부
  instances/chan19 한정 enable — **kprobe_events는 append만**(재부팅 후엔 재등록).
- **instance는 재부팅마다 소멸**(4차 런에서 추적 없이 진행하는 실수 — 스크립트가 mkdir부터).
- pid 필터: set_event_pid에 메인 tid 선기록 + options event-fork로 자식 자동 추적.
  **리스트 재기록 시 자식이 축출되므로 append-only**로(v3부터). 메인만 246만 이벤트 —
  스톰 시 버퍼 랩 빠름 → 60초 주기 스냅샷(v4) 도입.
- fork 자식 정체: ps상 자식들(1808/1809)은 **Play Core split-install 헬퍼**였음(가드 아님).
  가드 스캐너 자식의 스캔 전수는 미확보 → 20차 과제(이제 스톰 없이 캡처 가능).

### 23-4. 건강 런 실측 (run 6)
- 기동 → **8분+ 포그라운드**(topResumedActivity=토스 유지), 스플래시 로고 렌더
  (run3_t35s.png, run6_mid.png), 메인 스레드 idle, ANR/다이얼로그/툼스톤 없음.
- 종료는 앱 사망이 아니라 **프레임워크 외붕괴**(아래 23-6).

### 23-5. 스모크 런의 조용한 exit (클린 리부트 후)
- 부팅 직후 1런: 메인 6454가 ~55s에 am_proc_died(신호 없음·툼스톤 없음·am_kill 없음) =
  **조용한 exit(0) 시그니처 재확인**. WebView 샌드박스 프로세스 기동까지 진행 후 사망.
- 18차의 "2~4분"보다 짧은 ~55s — 런당 변동. exit_group 상관 캡처는 20차 최우선.

### 23-6. 운영 함정 (이번 세션 신규)
- **부팅 복구 순서(갱신)**: setenforce 0 → bind mount → insmod v4.7(target_uids) →
  **resetprop ro.hardware.egl adreno** + vulkan default → props-apply → wm density 450/
  size → writer 기동 → (필요시) chan19 instance 재구성. egl/vulkan=adreno 금지 메모는
  리터럴 패치 이전 세계관 — **현재는 egl=adreno 필수**(props-apply는 여전히 안 건드림).
- emulator 재기동은 `cd $ANDROID_SDK_ROOT/emulator && ./emulator ...` (cwd 틀리면
  "Cannot find AVD system path"/qemu 경로 PANIC) + ANDROID_SDK_ROOT 필수.
- 프레임워크 불안정 에피소드 2회(07:44 커널 재부팅 — 원인 불명/pstore 없음, 08:10
  system_server 사망 — load 40): 과부하(스톰+프로브) 환경에선 **프로브 최소화**(p19_gn만)
  이 안전. do_filp_open 입출력쌍은 비싸다.
- deploy.sh 기존 결함: 모듈이 이미 적재된 경우 dmesg 체크에서 조기 종료해 writer/props를
  건너뜀 — 수동 절차로 우피(스킬 배포본은 별도 수정).
- dumpsys activity가 가끔 broken pipe(부하 시) — status 파싱은 재시도 허용할 것.

### 23-7. 20차 로드맵
1. **조용한 exit 트리거 특정(최우선)**: 건강 스택 + 경량 프로브(p19_gn/p19_eg + tracepoint,
   pid 필터 append-only, 60s 스냅샷)로 exit_group 직전 getname/prop 시퀀스 확보.
   logcat -b events(am_kill/am_proc_died 사유) 병행. 사망 시점 단층: ~55s / 2~4min.
2. **가드 fork 자식(스캐너)의 스캔 전수**: 자식 pid를 set_event_pid에 append 후 ENOENT/
   EACCES 시도 목록 → 미위장 surface 발견 시 위장 추가. (Play Core 자식과 구별 —
   가드 자식은 부모 사망 후 고아가 되며 /dev/. /proc/<pid>/mountinfo를 건드린다.)
3. **3점 검증 완주**: 기동 직후(ANR 전) 탭 → 5분 경과 → topResumed+스크린샷+탭 3점.
   survive 런 통계 10회(조건 통제: 동시실행앱 force-stop, writer 1개).
4. 학술(강등): 카운터 영역 디코딩, MIDR per-cpu 매핑(현재 전코어 cpu0 값).

### 23-8. 종료 시 에뮬 상태 (20차 인계)
- 클린 리부트 + 전 스택 재적용 완료: LKM v4.7(10179,10181,10175), bind(-impl-qti 가시),
  props(SM-S916N, qemu누수 0, **egl=adreno**, vulkan=default), density 1080x2340@450,
  writer 1개(가짜파일 23), Permissive, EGL 리터럴 패치 유지(문자열 0).
- 스모크: 부팅 직후 1런(6454) 조용한 exit(~55s) — 재현성 양호. 토스 미기동 상태로 종료.
- 산출물: session19/{run1.trace, run3_trace.txt.gz(313MB 전체노이즈 포함),
  run5_trace.txt, events_logcat.txt, run3_t35s.png, run6_mid.png, egl_patch/}.
  LKM 소스 v4.7 커밋: lkm/hide_kmod.c (midr cpu0-7 한정).

## 24. 20차 세션 (2026-09-22 오후~밤) — **조용한 exit의 해부 완료: fault→sigchain 핸들러→컬렉터→Java System.exit(0) 로컬 경로 확정**

> **검토 반영**: 외부 검토지적(SIGSEGV 선행 시퀀스, Thread-0/1 셧다운 훅, 오프라인 trace 무효,
> kill 훅 혼입 변수)을 기존 트레이스로 전부 재검증해 수용했다. "남은 벽 = 서버 게이트"는
> 철회 — **조용한 exit은 로컬 fault가 크래시 컬렉터에 흡수된 뒤 Java가 자발 종료하는 경로**다.
> 서버 보고(connect 버스트)는 종료 직전 있으나 종료의 원인으로 단정할 근거 없음.

### 24-1. 조용한 exit의 완전한 해부 (run1/run2/on1 공통, 시각차는 런당 변동)
1. **메인 스레드 SIGSEGV MAPERR(code=1)** — 직전 메인 자신의 process_vm_readv 셀프스캔
2. **RxCachedThreadS SIGSEGV ACCERR(code=2) ×2** — 632회 vm_readv(런맨 결정론적 632!)를
   수행한 스캐너 스레드 본인
3. 세 fault 모두 **동일 유저 핸들러로 전달**: sa_handler=libsigchain.so+0x8c (ART 시그널
   체인 — 앱 등록 핸들러=NPTH/Bugsnag류 컬렉터로 체인)
4. 컬렉터 활동: Thread-41 fork → kill(self,9) 자기정리 시도 → /proc/*/maps·전체 스레드
   stat 수집 → tgkill(33)=bionic SIGSETXID(스레드 생성, 정상)
5. ~10-12s 후 Thread-0/Thread-1 fork→즉시 exit(93) (셧다운 훅) → **메인 exit_group(0),
   lr=libandroid_runtime.so+0xcf44 = Java Runtime.exit/System.exit 호출점** (t20_exit 프로브)
6. ApplicationExitInfo: EXIT_SELF, status=0 — 커널/AMS kill 아님
7. 온라인/오프라인 동일 형상(오프라인 ~35s, 온라인 29~78s) → **서버 판정 아닌 로컬 경로**.
   단 19차 run6(8분)은 종료를 프레임워크 붕괴로 잃어버린 런 — 레이스 변동 큼(240s+ 생존 런도 관측).

### 24-2. fault 원인 모듈 특정 — 미완 (21차 1순위)
- arm64_notify_die 프로브는 미발화(이 커널 경로 미경유), do_mem_abort 프로브는 수요페이지
  노이즈 13만건으로 실용성 낮음. **fault PC/FAR 확정은 signal_deliver 타임스탬프와 do_mem_abort
  이벤트를 시간상관시켜 추려야 한다(21차).**
- 문맥 증거: faulting 스레드 = vm_readv 셀프스캔 본인들. 10차의 libea56 poison 특징
  (pc=lr=0xc → MAPERR 저주소)과 코드1 MAPERR 부합 → **잔여 libea56 자폭이 핸들러에 흡수**
  되는 것이 최유력(검토 가설 랭킹과 일치). session20/trace_pf.txt 참조.

### 24-3. 신규 가설 — fake maps 필터 불일치 (21차 검증 과제)
- 가드는 자기 메모리를 process_vm_readv로 632구간 재독하는데, 이는 /proc/self/maps(위장본,
  camow3가 goldfish/emulation 라인을 **삭제**)가 말하는 세그먼트 목록과 실제 메모리 배치를
  교차검증하는 형태. **삭제 방식 위장은 "있어야 할 라인의 부재"를 노출**한다.
- 검증/수정안: camow3의 maps 생성을 grep -v 삭제 → **sed 치환(라인 보존, 텔레메트리 서브스트링만
  중립명 변경)** 으로 바꿔 A/B. maps 리다이렉트가 판정 입력이면 이것으로 사라져야 한다.

### 24-4. kill 훅 축소 (LKM v4.9) — 검토 권고 반영
- v4.6 kp_ksig는 타깃 uid의 **모든** kill(...,9)→0으로 바꿔 크래시 컬렉터의 kill(self,9)
  자기정리까지 막아 12s 정체·고아를 양산했다(혼입 변수 확정).
- **v4.9**: group leader comm이 "Thread-*"인 호출자(fork 헬퍼/컬렉터)는 원래 kill 허용,
  메인 프로세스+스레드만 위장. `ksig_dis` 파라미터로 런타임 완전 토글도 가능(0644).
- on1 런(78s)부터 컬렉터 정상 종료 확인(12s 정체 소멸). 단 조용한 exit은 지속 — kill 훅이
  근본 원인은 아니었다(트리거는 24-2의 fault).

### 24-5. 닫은 가설 (이번 세션 소거)
| 후보 | 시험 | 결과 |
|---|---|---|
| 서버 판정 종료 | 오프라인 런 | 동일 형상 조용한 exit — 서버 단정 근거 소멸 |
| 타 은행앱 apk 존재(디버그 서명) | smcard·hana·test앱 uninstall 후 온라인 | 여전히 exit — 무관 |
| /proc/self/net/unix 실값 | qemu 문자열 grep | 0 — 누수 없음 (LKM은 /proc/net/unix만 위장, 향후 참고) |
| /proc/filesystems, /system/etc/hosts, cacerts-removed | 실값 점검 | 전부 스톡 — 누수 없음 |
| su 792경로 | 전부 ENOENT | 통과 |

### 24-6. 스킬/도구 (20차 추가)
- **scripts/boot_recover.sh** — 부팅 후 전체 복구 원스텝(순서 고정: permissive→bind→
  insmod→egl/vulkan resetprop→props→wm→writer→chan19 인스턴스→검증 체크리스트)
- **scripts/toss_child_scan.sh** — append-only pid 필터 + syscall 종류 필터 + 60s 스냅샷
- **t20die.sh 프로브 세트** — `p:t20_die arm64_notify_die(미발화 — 경로 아님)`,
  `p:t20_exit __arm64_sys_exit_group status/pc/lr/sp(=pt_regs +0/+256/+240/+248)`,
  signal_deliver tracepoint(sa_handler 제공), 시작 직후 /proc/PID/maps 저장(주소→모듈 매핑용)
- dumpsys activity exit-info로 EXIT_SELF/kill 구분 가능

### 24-7. 21차 로드맵
1. **fault PC 확정**: signal_deliver(sig=11) 직전 ±5ms의 do_mem_abort 이벤트를 시간상관
   추출 → far/esr/pc를 시작 시 저장한 maps에 매핑 → libea56 poison 여부 확정.
   (do_mem_abort 프로브는 상시 켜두고 버퍼 랩 전 스냅샷)
2. **fake maps 불일치 가설 시험**: camow3 maps 생성을 삭제→치환 방식으로 변경 A/B.
   변화 없으면 libea56 정적 RE로 vm_readv 스캔의 비교 대상 역추적(12차 누적기 구조 연장).
3. fault가 libea56으로 확정되면: afed8 id-4 판정 입력 재추적(toss9 최소 프로브 재활성) —
   13차 이후 위장 채널 누적 중 무엇이 id-4를 유발하는지 재차분.
4. 레이스 변동(29s~240s+) 통제 실험: 동일 부트 연속 N런 생존시간 분포 + 부팅 경과시간 상관.

### 24-A. 20차 후반 — 외부 검토(Claude/Codex CLI) 반영 + **fault PC 특정: boot-framework.oat NULL 읽기 (ART 암시적 null 체크)**

> 사용자 요청으로 claude/codex CLI에 이중 검토를 받았다(codex는 크레딧 소진으로 중단,
> 부분 기여). 검토의 핵심 지적 3건이 모두 맞았고, 그 길로 파고들어 fault를 특정했다.

**검토에서 채택된 정정:**
1. **오프셋 표기 오류 정정**: exit lr의 "+0xcf44"는 r-x 세그먼트 상대값이고, 로드베이스
   기준 파일/vaddr 오프셋은 **0xC7F44**다(libc pc +0x663f8 → 파일 0xA33F8 동일). 심볼
   조회는 로드베이스 기준값으로. → 자동화: `scripts/toss_addr_resolve.py`(maps 로드,
   vaddr/file 오프셋 병기, sig=11↔do_mem_abort 시간상관).
2. **process_vm_readv는 EFAULT만 반환, 절대 SIGSEGV 없음** → "vm_readv 셀프스캔이
   위장 maps와 충돌해 SIGSEGV"라는 24-3 가설은 **메커니즘상 성립 불가**로 철회.
   SIGSEGV는 스레드가 직접 포인터를 역참조한 것.
3. **fault PC 확정(시간상관 성공)**: signal_deliver(sig=11) 7µs 직전 do_mem_abort:
   - **main: far=0x0, DFSC=0x6(변환폴트), WnR=0(NULL 읽기), pc=boot-framework.oat
     vaddr+0x19d534** (AOT 컴파일된 Java 프레임워크 코드), lr=+0x19d52c(같은 함수)
   - 해석: **ART 암시적 null 체크** — Java 계층 null 역참조가 SIGSEGV로 나타난 것.
     libea56 poison도 Chromium 회귀도 아님(24-2의 랭킹 정정 — poison은 이 fault로
     **미확정·강등**).
4. **종료 메커니즘 재확인**: fault → sigchain(libsigchain+0x8c) → 컬렉터가 수거 →
   ~12s 수집 → System.exit(0)(lr=libandroid_runtime vaddr+0xcf44/file+0xc7f44).
   Bugsnag last-run-info는 마지막 런 기준 **crashed=false** (EGL 시대의
   consecutiveLaunchCrashes=2는 소멸).
5. **[정정] 18408 "16분 생존"은 오인** — 18408은 09:48:19에 **백그라운드 서비스 프로세스**
   (SystemJobService)로 기동됐다가 09:52:45 splash로 전환 후 **5s 만에 사망**했다(am_proc
   실측). 16분은 서비스 수명이지 포그라운드 생존이 아니다. 생존 판정은 반드시
   am_proc_start의 reason과 wm_on_create 이후 시간으로.
6. **[신규 확정] 종료 직전 앱 자신의 로그**: `I/.republica.toss: System.exit called,
   status: 0` + `I/AndroidRuntime: VM exiting with result code 0, cleanup skipped` —
   **가드가 SIGSEGV를 자기 핸들러로 수거한 뒤 스스로 System.exit(0)를 호출**한다(우아한
   자살). 10차 시절 툼스톤(pc=0xc)을 남기던 자폭이, 핸들러 흡수로 툼스톤 없이 정리되는
   것으로 진화한 형태. **이 로그 라인이 판정 발화의 완벽한 런타임 마커** — 판정 시점과
   직전 스캔/채널 상태를 상관시키는 데 사용할 것.
7. fault(pc=boot-framework.oat)와 가드 자살의 연결 모델: 가드가 어떤 상태를 오염시키고
   (10차 poison의 현대판), 그 오염이 이후 framework OAT 코드의 NULL 역참조로 표면화 →
   가드 핸들러가 수거 → System.exit. 즉 SIGSEGV 자체가 가드의 판정 후 처리일 가능성.
6. **kill 훅(검토 권고)**: comm "Thread-*" 휴리스틱은 rename에 취약 + 자녀→부모 kill
   과대허용 구멍. 개선안(면제를 self-kill(target==current->tgid)로 한정, real_parent
   기반 메인 식별)을 기록. 당분간은 fault 원인 정리 전까지 **ksig_dis=1 기본화** 권고 수용.
7. **실험 규율(검토 수용)**: 단일 런 결론 금지(29s~240s+ 분산), 런별 LKM 버전/토글 태깅,
   서버 배제는 "중간 신뢰"(오프라인 trace 무효였던 만큼)로 표기.
8. **미해결(21차)**: (a) boot-framework.oat+0x19d534의 Java 메서드 특정(oat 심볼화 또는
   NPE 컨텍스트 확보) — 환경 유발 null인지 판정, (b) 컬렉터가 SIGSEGV를 claim하는 조건
   (18205는 종료, 18408은 회복 — 차이), (c) N런 생존 분포 하네스.

### 24-B. 2차 외부검토 반영 + **fault 명령어 특정: ART 스택 프로브 — sp 붕괴 시그니처**

**2차 검토(Claude CLI, codex는 크레딧 소진 미실행) 수용:**
1. fault 계열 판별: 데이터어보트(EC 0x24, far=0 읽기) vs 10차 poison-jump(명령어어보트,
   pc=lr=0xc)는 **계열이 다름** → poison-jump 모델은 이 fault로 배제. 단 "정상 NPE"와
   "지연-오염"은 ESR/FAR만으로 구분 불가.
2. logcat에 toss의 NullPointerException 0건(9건 전부 Google 앱) → **가드 핸들러가 ART의
   NPE 변환을 선점**했다는 가설 확정(ART가 claim했다면 StackOverflowError/NPE로
   Java 예외 흔적이 남았어야).
3. 인과 앵커는 fault 시각(signal_deliver/do_mem_abort), "System.exit called" 로그는
   하류·지연(~12s)이라 확증용 북엔드로 강등. 마커 없는 변형(툼스톤/직행) 대비
   커널 앵커 상시화 필요.
4. 실험 순서: 채널 A/B보다 (a) N런 (pc,far) 불변성 → (b) 단일채널 토글 A/B 순.

**oatdump --addr2instr 심볼화 성공 (기기 내장 /apex/com.android.art/bin/oatdump):**
- 오프셋 주의: oatdump는 executable section 기준(--addr2instr=0x19e534 = file 0x345534 -
  exec 0x1a7000). maps의 vaddr오프셋(0x19d534)과도 0x1000 차이(r--p 헤더 세그먼트).
- **fault 메서드 = android.content.ContextWrapper.isRestricted()** (dex_method_idx=26433)
- fault 명령어: `0x345534: ldr wzr, [x16]` — 직전 `sub x16, sp, #0x2000` →
  **ART의 StackOverflowCheck 프로브**(관리코드 진입 시 sp-8KB 가시).
- **far=0x0 ⇒ fault 시점 sp ≈ 0x2000.** 정상 재귀라면 far가 스택 guard page 주소가 되어야
  하고, 정상 NPE라면 far가 힙 객체 주소가 된다. **sp가 8KB 근처로 붕괴 = 저장된 SP 오염**
  (10차 poison의 저장-레지스터/LR 오염과 동일 계열의 현대판)이 최유력.
- 부합 관측: isRestricted()는 ContextWrapper 작업마다 불리는 초빈출 경로 → 오염된 sp가
  복원된 직후 첫 관리코드 진입이 어디든 이 프로브에서 터진다(런마다 fault 시점 변동 설명).
- 검증 과제(21차): t20_pf 프로브에 sp=+248(%x2) 추가해 fault 시 sp 값 직접 확인.
  sp≈0x2000 재현 → sp 오염 확정. 이후 libea56 정적 RE로 저장-SP 오염 지점 추적(12차 연장).

### 24-C. sp 실측으로 정밀화: **"정상 sp + x16=0 + 엔트리+4 직행" = 레지스터 오염( poison 계열) 실측 확정**
- t20_sp 프로브(sp=+248(%x2) 추가) 런(24909, ~20s 생존): fault 시
  `far=0x0 esr=0x92000006 pc=0x724df534 lr=0x724df52c sp=0x7fdd25a730` — **sp 정상**.
- fault 명령 `ldr wzr,[x16]`(x16=sp-0x2000 프로브)에 x16=0이려면 정상 호출 경로로는
  불가능(직전 sub이 sp에서 계산). → **컨트롤 플로가 isRestricted 엔트리+4로 직행**
  (오염된 복귀주소/엔트리포인트/시그널리턴 pc) + **x16=0 오염** 조합.
- 결론: "ART 암시적 null 체크" 해석은 폐기. **10차 poison 계열(레지스터/컨텍스트 오염)의
  실측 확정** — 오염이 프레임워크 OAT 코드 중간으로 점프시키고 x16=0으로 프로브를 터뜨린다.
  가드 핸들러가 이를 수거 → System.exit(0)(마커 로그).
- 21차: (a) 첫 fault의 전체 GPR 덤프(do_mem_abort kprobe에서 regs 전체) + 직전 시그널
  리턴/blr 흔적 추적, (b) 오염 지점 = libea56 정적 RE(12차 누적기/아핀 구조 연장),
  (c) N런 (pc,far,x16) 불변성.

### 24-D. 3차 외부검토(Claude+Codex, 이번엔 양측 완료) — **주가설 재정렬: "크래프트된 컨텍스트 복원"**

두 검토가 독립적으로 수렴한 결론:
1. **주가설 = 조작된 컨텍스트 복원**(sigreturn/corrupted sigframe, 또는 setcontext/longjmp류).
   근거: `lr=+0x19d52c = OatQuickMethodHeader 위치`는 **어떤 bl/blr도 만들 수 없는 값**
   (bl이면 lr=호출자 복귀주소여야 하고, 분기 명령이 entry-8=헤더 내부에 있어야 함).
   → lr은 "실제 분기의 산물"이 아니라 **합성/크래프트된 컨텍스트의 필드**일 공산이 압도적.
   pc=entry+4·x16=0·sp/x29 정상이 sigframe의 독립 필드 복원으로 한 번에 설명된다.
   3런 바이트 일치 = 상수 템플릿에서 복원(단, 동일 부트 내 sp/x29 일치는 zygote 상속으로도
   설명되므로 결정 근거는 어디까지나 lr=entry-4다. randomize_va_space=2 확인).
2. **2위(오프바이-4 엔트리포인트 오염)는 pc/x16만 설명하고 lr을 설명 못 함**(blr이면
   lr=호출자). 3위 vtable br 변형(동시 우연 2개 필요=저확률). 4위 헤더 폴스루(헤더 바이트
   실행 시 SIGILL 선행 예상 — do_undefinstr 프로브로 반증 가능). 5위 nterp trampoline.
3. **ART FaultManager 우회 레버는 약함**: far=0은 ART SOF 가드영역 밖이라 ART가 수용해도
   NPE로 안 변하고, 핸들러 우선순위를 바꾸는 커널 레버도 없음. **kill/exit_group 차단은
   우회가 아니라 원샷 진단 실험**로만(컨텍스트가 이미 오염된 뒤라 상태 보장 없음).
   근본 레버는 (a) 시그널 전달 경로(get_signal/setup_rt_frame)에서 이 TID+fault-pc 한정으로
   가드 핸들러 진입 스킵, 또는 (b) **가드가 탐지한 대상의 은폐**(지금까지 해온 채널 작업의
   연장 — 이 분기를 아예 안 타게 하는 것).
4. **검증 1순위 실험**: fault TID의 직전 syscall이 **rt_sigreturn(nr 139)** 인지 — 맞으면
   1위 사실상 확정 → setup_rt_frame/restore_sigframe 훅으로 크래프트된 sigframe
   (pc/lr/x16 필드) 실측.
5. **전체 GPR 획득**: tracefs fetch 16개 제한은 문자열 인터페이스 한계 — LKM kprobe
   핸들러에서 `task_pt_regs(current)`로 x0~x30·sp·pc·pstate 일괄 덤프(per-CPU 링버퍼).
   x0(=ArtMethod*/this)와 x17 값으로 1위 vs 2위 즉시 판별 가능.
6. **정적 RE 재정의**: 범용 "손상 store"가 아니라 **컨텍스트-라이터**(ucontext/sigframe/
   jmp_buf 오프셋에 pc·lr·x16 상수를 쓰는 store, isRestricted 코드주소 상수 참조)를
   0x95224/acca4 인근에서 우선 추적. OLLVM CFG보다 "동일 base register의 offset별 store 지도".
7. 프레이밍 교정: 이 SIGSEGV는 손상 사고가 아니라 **가드가 뭔가를 탐지한 결과의 결정론적
   분기**(의도 설계)일 공산이 크다 → 폴트/종료 차단은 증상 치료, 진짜 해법은 탐지 대상 은폐.

### 24-E. 21차 결정 실험 결과 — rt_sigreturn 선행 실측 + 전체 레지스터 스냅샷

**실험 구성**: LKM v4.10(kp_fault: do_mem_abort에서 uid 대상+far=0+EC=0x24만 전체
pt_regs를 dmesg 덤프, 상한 8회, fault_dump_en 파라미터) + chan19에 raw_syscalls
sys_enter filter id==139(rt_sigreturn).

**결과(런 5718, ~13s 생존)**:
- t=50.986430 메인이 `rt_sigreturn`(NR 139) 실행
- t=50.992540 **6ms 뒤** faultdump #1: far=0x0, esr=0x92000006 (main)
- 전체 GPR: x0=0x71741248(부트이미지 ArtMethod* 대역), **x4/x5/x6 = ASCII
  `";eme hT$s"` = `$Theme;` 클래스 디스크립터 조각**(ART 타입 리졸루션 문맥),
  x16=0, x17=0x10, x8/x23/x25=oat 파일오프셋류 상수, sp=0x7ff9606cf0·x29=0x7ff9606dd8
  (정상, 이번 부트 기준), lr=0x7237952c=entry-4, pc=0x72379534=entry+4.
- 이전 부트와 비교: 레지스터 "역할"은 동일(far=0/x16=0/lr=entry-4/pc=entry+4)하나
  절대 주소는 부트별 base에 따라 이동 — **부트 이미지 상대의 결정론적 패턴** 확정.
- 종료: `System.exit called, status: 0` 마커 재확인.

**해석 상태**:
- rt_sigreturn이 fault 6ms 전에 있었음은 실측 — 그러나 6ms 사이 다른 코드가 실행됐으므로
  "복원된 pc가 즉시 fault" 모델은 아니다. rt_sigreturn 복원이 남긴 **상태 오염**(또는 복원
  직후 가드의 분기)이 이후 isRestricted 프로브 도달 시 표면화하는 구조로 refined.
- x4~x6의 `$Theme;` 디스크립터 + x0 부트이미지 포인터 → fault 문맥은 ART
  Resources/Theme 리졸루션 인근. 가드가 Theme/리소스 관련 상태를 오염시켰을 가능성
  (21차 후속: restore_sigframe 훅으로 복원 직전 pc/lr/x16 실측 + $Theme 문맥의
  호출 경로 특정).

### 24-F. 21차 후반 — **환경 요인 확정: 게스트 자체 재부팅 루프(운영 최우선 차단 과제)**
- 실험 중 게스트(Android)가 **~10-20분 주기로 자체 재부팅**하는 것을 확정(uptime 리셋 +
  부트 이미지 재매핑 + 에뮬 프로세스는 생존, 에뮬 로그에 "Boot completed" 3회).
- boot reason = `reboot`(userspace 발행 — 커널 패닉 아님. `getprop sys.boot.reason`).
- RescueParty는 `persist.sys.disable_rescue_party=1`로 이미 비활성 확인
  ("Disabled because of manual property") → 레스큐 파티 아님. **reboot 발행 주체 미상.**
- 영향: 15분 넘는 실험/관측 불가능, ftrace 인스턴스·LKM 소실 반복. 12s~78s 런은 가능.
- 대응(21차 계속 전 필수): (a) 부팅 직후 `logcat | grep -i reboot`·`dmesg` 감시로 발행
  주체 특정, (b) 에뮬 호스트 프로세스가 아니라 게스트가 재부팅함을 재확인
  (`adb emu avd name`·프로세스 pid 연속성), (c) 재부팅 직전 60초의 logcat 보존
  (Persistent logcat: logcat -p 또는 /data/misc/logd).
- 운영 교훈: 재부팅 루프 하에서는 12s급 단사만 관측되며 장기 생존 런의 종료 시점
  해석이 오염된다 — **재부팅 원인 제거가 모든 측정에 선행**한다.
- LKM v4.12 배포: kp_rsig copy_from_user에 pagefault_disable 보호 + rsig_dump_en=0
  기본화(kprobe 원자적 문맥에서의 유저 메모리 접근은 panic_on_oops=1 하에서 패닉 위험).
  kp_uname(v4.4 이래)의 동일 패턴도 보호 적용.

### 24-G. 재부팅 루프 정밀 관측 (21차 계속)
- 12:04:49 재부팅: 부트사유 이력(`persist.sys.boot.reason.history`= reboot@1790046289)과
  forensics 로그 말단(12:04:44.49, 앱 기동 35s) 일치. **게스트 userspace가 `reboot`을
  발행**하며, 에뮬 프로세스(qemu pid)는 생존 → 호스트/에뮬 크래시가 아님.
- 발행 주체 후보: (a) 시스템 내부(RescueParty는 disabled 확인 — 다른 완화 장치?),
  (b) 에뮬 콘솔/호스트 스크립트, (c) 외부 접속(adb 접속자). adb 접속 중에 재부팅이
  터지므로 **재부팅 순간의 logcat 마지막 1초가 사라진다**(logd 미플러시) — 감시는
  호스트측 `adb logcat` 파일 저장으로만 가능(실시간 스트림).
- 대책 실험(21차): Persistent logcat 활성(`logcat -p enable`/logd persist 속성) 또는
  호스트 실시간 스트림 상시 기록 후 재부팅 직전 5초 분석. 재부팅 주체 특정 전까지
  15분+ 실험은 신뢰 불가.

### 24-G-2. 패러다임 정리: **"앱 크래시 = 게스트 즉시 재부팅" 동시 사건** (통제 런에서 확정)
- 호스트 감시자(logcat 스트림)가 재부팅 순간을 포착: 로그가 12:10:44.880(jni_lib_merge 중)
  에 **EOF로 끊기고, 새 게스트는 2초 뒤(12:10:47) 부팅** — 완전 종료 절차 없는 인스턴트
  리스타트. 부트사유는 "reboot"(userspace).
- **결정적 통제 결과: 이 재부팅은 LKM 없는 상태에서도 발생** (당시 부트는 모듈 미적재,
  props/bind/writer만 존재) → 내 계측/LKM 원인 배제. **앱의 크래시-종료와 게스트 리부트가
  같은 사건** (앱이 죽고 수 초 내 게스트가 따라 죽음 — 여러 런에서 반복 관측).
- 모델: 가드가 판정 후 (1) 앱 자신은 System.exit(0)로 정리하고, (2) 어딘가에서 게스트
  `reboot`이 동반 발행되거나, (3) 크래시 처리 경로가 커널을 panic(reboot)시킨다.
- **21차 확정 실험**: raw_syscalls 필터에 **id==142(reboot)** 추가 → 발행 task의 comm이
  직접 찍힌다(가드 스레드 vs system_server vs kernel). 이것이 다음 세션 1번.
- 주의: 재부팅이 터지면 그 런의 ftrace 버퍼는 소실된다 — 재부팅 직전 이벤트는
  60초 주기 스냅샷으로만 보존 가능(기존 t21gpr/t21rsig 방식 유지).

### 24-H. 21차 마감 — **벽: 토스 크래시와 동기화되는 게스트 즉사 (무로그)**
- 확립된 현상: 토스 메인이 크래시-정리(System.exit(0) 마커)에 도달하면 **수 초 내 게스트
  전체가 무로그로 즉사**한다(커널 콘솔에 패닉/재시작 메시지 0, userspace 셧다운 로그 0,
  부트사유 "reboot", 게스트 리부트 2초 만에 완료). LKM 없는 통제 런에서도 동일.
- 관찰 방법 확보: 에뮬 기동 시 `-show-kernel`로 게스트 커널 콘솔을 호스트 파일에 캡처
  (현재 /tmp/emu_kernel.log — 부트 2회, 죽음 시점 콘솔 말단에 패닉 메시지 없음).
- 함의: (a) 가드가 판정 후 System.exit(0) + 게스트 reboot을 동반 발행하거나,
  (b) 크래시 처리 경로가 커널을 무로그로 죽인다(panic_on_oops=1이라 oops=즉시 리부트),
  (c) 에뮬레이터 계층이 게스트를 재시작한다. 셋 중 무엇인지는 다음 세션 판별 필요.
- 21차 미완: rsigdump(시그프레임) 실측 — rsig_dump_en 활성 런에서 dmesg에 기록되지만
  두 번의 시도가 모두 게스트 즉사와 겹쳐 미회수. 스크립트/모듈은 준비 완료.

### 24-I. frida 개입 허용에 따른 즉성 성과 (21차 계속)
- **frida spawn 모드가 원본 토스에서 생존** — LKM 위장 스택(maps/디렉터리 필터)이 frida
  아티팩트를 가려주는 것으로 확인(기존 "frida 즉사" 관측과 다름 — 환경 변화 or LKM 효과).
- **UEH 체인 포착**: RuntimeInit$KillApplicationHandler(기본) → **Bugsnag ExceptionHandler
  가 교체** → **im.toss.TossApplication$$ExternalSyntheticLambda17**(앱 자체 크래시 핸들러)
  가 최종 설치. "조용한 exit"의 Java 측 주인공은 이 체인.
- frida 훅(System.exit/Runtime.exit/halt/PM.reboot/네이티브 exit·kill)을 모두 걸어도
  무발화로 죽는 런 존재 → **외부 SIGKILL**(프로세스 외부 kill) — 유력히는 **가드 fork
  자식의 kill(parent, 9)**. child gating으로 자식 2개(10546/10576) 포착 성공 —
  단 게이팅 suspend가 타이밍을 흔들어 4s 조기 사망 유발(개선 필요).
- 종료 경로 정리: (a) SIGSEGV→Bugsnag 수집→System.exit(0) [관측됨], (b) 자식의 외부
  SIGKILL [강의심], (c) 게스트 리부트 동반 [간헐]. 공통 선행: 가드의 판정.
- frida 스크립트/러너 스킬 저장: scripts/frida_toss/{exit_trace.js,t21_spawn.py,
  child_kill_watch.py}. sp 프로브(t20_sp) 포함 모듈 v4.12/v4.13(reboot 차단 토글) 병행.

### 24-I-2. v4.14 kill 차단 실험 결과 + 재부팅 원인 정리
- **kill9 intercepted 로깅(v4.14) 결과**: 차단/기록된 SIGKILL은 전부 **셀프-kill**
  (Thread-41 크래시 컬렉터, "process" 헬퍼의 자기정리). 자식→부모 kill은 이번 런에서
  미관측. 앱은 여전히 ~15s~60s에 사망 → 사망 경로는 kill이 아닌 **SIGSEGV 체인의
  System.exit(0)** 로 확정 유지.
- **rsig_pre oops 실측 확정**(13:19:39, 커널 콘솔에 레지스터+콜트레이스 전체 기록):
  `pc=rsig_pre+0x120 [hide_kmod]` via kprobe_breakpoint_handler/brk_handler —
  **panic_on_oops=1 환경에서 kprobe 핸들러 내 유저 메모리 접근은 게스트 패닉=재부팅**.
  v4.14b에서 rsig 핸들러 무효화(기본 OFF) 완료. 단, rsig 이전(11:21 등)의 재부팅도
  존재 → **재부팅 원인은 복수** 가능성. -show-kernel 콘솔 캡처로 다음 판별 가능.
- 다음 세션: ① `-show-kernel` 콘솔로 재부팅 직전 커널 메시지 확보(panic이면 원인 특정),
  ② t21rsig(rsig_dump_en=1)는 불안정 확인 후 신중히, ③ 앱 크래시와 게스트 리부트의
  인과 분리(토스 미기동 방치 통제), ④ libea56 컨텍스트-라이터 정적 RE 병행.

### 24-J. frida 정밀 개입 1차 결과 — **exit은 raw syscall(훅 회피)** + UEH 체인 확정
- frida spawn(원본 토스)에서 전 계층 훅 장착 성공: Java System.exit/Runtime.exit/halt,
  PowerManager.reboot, libc exit/_exit/abort/kill/tgkill, dispatchUncaughtException,
  UEH 교체 감시, Process.setExceptionHandler(예외 관찰).
- **UEH 체인 확정**: RuntimeInit$KillApplicationHandler(기본) → Bugsnag ExceptionHandler
  교체 → im.toss.TossApplication$$ExternalSyntheticLambda17(앱 자체 크래시 핸들러) 최종.
- **치명적 발견**: 죽음 시점에 위 훅 전부 무발화 + "exited cleanly (0)"(Zygote) —
  **가드가 libc/Java 경로를 우회한 raw exit_group syscall로 종료**(훅 회피 설계).
  가드의 런타임 바이트구성/dlsym 회피 성향(스킬 기재)과 일관. → exit 시점 관측은
  커널 레벨(kprobe p19_eg/t21_gpr)만 신뢰 가능.
- frida 자체는 생존(스폰 모드, LKM 위장이 아티팩트 가림) — 정밀 개입 도구로 사용 가능.
- 스크립트: session21/frida/exit_trace.js (통합판: 예외 관찰 + exit/kill 훅 + UEH 체인).

### 24-J-2. p21_egpc(exit caller lr) 포착 성공 + 오프바이-4 엔트리포인트 오염 모델
- 신규 kprobe p21_egpc(__arm64_sys_exit_group에 pc/lr/sp fetch 추가)로 15527 런의
  exit caller 확정: **lr=libandroid_runtime vaddr+0xcf44 (file+0xc7f44) = Java
  System.exit 경로** (fault(1269.4s) → 11.2s 컬렉션 → exit(1280.6s) — 12s 케이던스 재확인).
- fault 시 레지스터 재해석: x0=0x7173a248(부트이미지 객체/ArtMethod* 대역), x1=0,
  x16=0, sp/x29 정상, pc=entry+4, lr=entry-4(OatQuickMethodHeader).
- **모델**: isRestricted의 ArtMethod 엔트리포인트가 **+4 어긋난 상태**로 호출되면
  (blr entry+4) 프롤로그(sub x16,sp,#0x2000) 스킵 → x16=stale(0) → 스택프로브가
  far=0 폴트 — 관측 전체와 정합. +4 오염의 원인(가드의 검증 입력? 특정 채널?)이
  다음 과제. 검증: 같은 부트에서 faultdump의 x0/x16/x29 값이 런마다 동일한지(불변성),
  정상 호출 시점의 x0과 비교.
- 교훈(분석): ftrace 로그 grep 시 pid 매칭은 `[-]<pid> ` 패턴(공백 매칭은 "<...>-pid"
  형식과 불일치해 빈 결과를 냈다 — 이번 라운드 헤멘 원인).

### 24-J-3. 전체 사건 시퀀스 완성 (같은 부트 5런, faultdump 5건 불변)
- **불변성 최종 확인**: 5런 모두 `far=0x0, esr=0x92000006, pc=boot-framework.oat
  isRestricted 프로브(엔트리+4), x16=0` — 런간 완전 동일(결정론).
- **완전 시퀀스**: ①far=0 SIGSEGV → ②Bugsnag/가드 네이티브 핸들러 수거(frida 예외
  핸들러는 관찰 못함 — 체인 선점) → ③~12s 컬렉션(fork 자식, maps/stat 수집) →
  ④셀프-kill(kill9 intercepted: Thread-41/44/45) → ⑤프로세스 소멸. Java
  System.exit(0) 변형과 네이티브 SIGKILL 변형이 혼재.
- kill 차단(ksig_dis=0) 상태에서도 앱은 죽음 → 셀프-kill 차단은 생존으로 이어지지
  않음(차단 대상 외 경로 혹은 차단 무의미). 앱 죽음의 직접 원인은 여전히 (a) far=0
  fault 자체의 발생 조건.
- frida 예외 핸들러가 far=0을 관찰 못한 이유는 미규명(다음 라운드): Bugsnag의
  sigchain 선점 여부, 혹은 frida 핸들러 등록 순서 문제.
- 저장: session21/frida/fault_path.js (sp 스택 워크로 libea56 복귀주소 추출 —
  far=0 관찰 런에서 실행하면 libea56 호출 경로 역추적 가능).

### 24-K. bionic 훅 전면 회피 확정 + 관측 아키텍처 정리
- frida로 libc sigaction을 훅해도 앱의 SIGSEGV 핸들러 등록이 관찰되지 않음 →
  **가드는 rt_sigaction도 raw syscall로 처리**(exit_group과 동일한 회피 체계).
- frida Process.setExceptionHandler도 far=0 fault을 관찰 못함 — 앱이 이후
  sigaction으로 핸들러를 교체하면 frida의 커널 전달 경로가 대체되기 때문.
- **관측 아키텍처 결론**: 이 가드에 대해 신뢰 가능한 관측은 커널 kprobe뿐.
  (a) kp_fault(do_mem_abort) — fault 컨텍스트 전체 [운용 중 ✓]
  (b) kp_rt_sigaction(신규 제안) — sig=11 핸들러 주소+발신자를 커널에서 포착
  (c) 그 주소를 frida Interceptor.attach로 넘겨 핸들러 내부를 추적하는 조합.
- LKM 커널 레벨은 심볼 기반이라 raw syscall도 완전히 관측된다(이것이 LKM 경로의
  본질적 강점 — 유저랜드 훅 회피에는 커널이 정답이라는 스킬 원칙의 재확인).

## 25. 22차 세션 (2026-09-22 오후) — **크래프트 복귀 실측: 가드 핸들러의 ucontext 하이재킹 + libart 인터프리터 복귀**, frida 무력화 실측, 재부팅 무장

### 25-1. 재부팅 루프 — 소강 + 관측 무장 (A 과제)
- 13:47 부트(v4.14b, reboot_block=1)가 **60분+ 생존, 토스 6+ 회 사망에도 재부팅 0건**.
  dmesg 전체 커버(밀림 없음)에서 "reboot BLOCKED" 0건 = **reboot syscall 발행 시도 자체가
  없었다**(target uid 범위 내). 재부팅은 매 크래시의 동반사건이 아니라 조건부.
- 과거 재부팅 4건(12:04/12:10/12:21/12:35)의 forensics EOF는 전부 토스 초기화 국면
  (jni_lib_merge/BugsnagNDK/PlayCore 직전)이며 powerctl/ShutdownThread 로그 0(무로그 즉사).
  13:32~13:46의 4회(~5분 주기, epoch 이력)는 로그 미확보(forensics_6가 현재 부트만 커버).
- v4.15: reboot 로깅을 uid 무관 확장(reboot_log_all=1, "reboot ISSUED(non-target)") —
  다음 재부팅 사건에서 발행 주체(system_server vs 가드)가 판명된다.
- constellation reboot_checker는 부트 후 체크만("Reboot Sync didn't run") — 발행 조짐 아님.

### 25-2. LKM v4.15/15b/15c — 시그프레임 양방향 캡처 (유저 메모리 접근 0) ★핵심 설계
- **SFI11** = setup_rt_frame kprobe(시그널 "전달"): ksig(커널)에서 수거 핸들러·si_addr,
  인자 regs에서 fault 순간 원본 레지스터. **SFO** = parse_user_sigframe kprobe(rt_sigreturn
  "복원"): task_pt_regs()에 이미 복사된 복원 pc/x16/lr/sp/x0 덤프.
- 안전성의 핵: ACK 5.15의 restore_sigframe이 __get_user_error로 pt_regs에 복사를 **마친 뒤**
  호출되는 지점을 kprobe — 24-I-2의 rsig BRK-oops 사고(유저 ptr 직접 읽기)를 구조적으로
  회피. static 심볼도 kallsyms 등재 확인 후 사용(setup_rt_frame/parse_user_sigframe/do_sigaction).
- v4.15c 정정: struct ksignal은 **ka가 offset 0**, info가 0x20 — sa_handler@ksig+0,
  si_addr@ksig+0x30. (15b의 info@0 계산은 쓰레기값 로깅 — 0x4000c09 등.)

### 25-3. 완전 사건 시퀀스 확정 (N런 동일 패턴, 22차 최대 성과)
```
[1] far=0 fault @ boot-framework.oat rx세그 vaddr 0x37d534 (매핑 base+0x19d534)
    명령 = ldr w0,[x1]  ← 21차 "ldr wzr,[x16]" 정정. x1=0 → [NULL] 로드
    entry+0 = mov x1,x22(프롤로그 x1 설정) — +4 직행으로 x1 stale 0
    문맥 보존: x0=부트이미지 ArtMethod* 대역, x4~x6=$Theme; 디스크립터 조각
    lr=entry-4 (런별 ±4 변동), x16=0(런별 미세변동: 0/0x20000000 관측)
[2] SIGSEGV 전달 → 가드 핸들러(SA_SIGINFO)
[3] 핸들러가 ucontext 크래프트 후 리턴(=rt_sigreturn):
    복원 pc = libart.so+0x257920 = ExecuteSwitchImplCpp<true,true>+0xE82C(콜드 패스,
    adrp 문자열 로딩부), x16=0, lr=0, sp=fault_sp-8, x0=ArtMethod* 유지
[4] 오염 인터프리터 실행 → ~1-12s 컬렉션(fork 자식 maps/stat 수집)
[5] 셀프킬(kill9: Thread-41/44/45/116, "process") → raw exit_group(0)
병행: RxCachedThreadS(셀프스캔) fault @ libea56.so+0x69b38 (ACCERR 계열, 런별 base 이동)
```
- **크래프트-컨텍스트 복원 가설(24-D 주가설)의 [3] 단계가 커널에서 직접 실측 확정.**
  핸들러의 ucontext 수정은 SA_SIGINFO 표준 기법 — "라이터"는 가드 핸들러 내부.
- **fault 직전 rt_sigreturn 무관측**(N런) — 24-E의 "6ms 전 sigreturn"은 필수 조건이 아님.
  [1]의 크래프트 점프는 유저랜드 직접(br류) 추정. 
- **OAT 코드 무패치**(fault 창 /proc/pid/mem 덤프 == 원본 파일 바이트) — 런타임 bl 패치
  가설 기각. [1]은 문맥 보존 채 완전 크래프트 점프(레지스터 세팅+br)가 최선 모델.
- fault는 **포그라운드 UI 초기화 경로에서만 발생** — 전 syscall ftrace 부하 런과
  백그라운드 방치에서는 fault 0건·2분+ 생존(백그라운드 한정).

### 25-4. frida 무력화 실측 (probe_health 부수효과 실험) ★21차 관찰 정정
- 토스 spawn에서 스크립트 로드 직후 동기 send 1회만 생존, 이후 **native Interceptor
  (openat)·Java.perform 콜백 전부 0회**(파일 마킹 부수효과로 검증 — 채널 무관).
  → 가드가 시작되면서 frida agent 런타임(트램폴린/스케줄러)을 무력화.
- 21차 "frida spawn 생존"의 재해석: **프로세스 생존 ≠ 계측 가능.** 이 앱에서 유저랜드
  frida는 정밀 개입 도구로서 한계 — "커널 kprobe가 유일한 신뢰 관측" 원칙 재확인.
- SIGACT11(do_sigaction kprobe)에서 토스 pid의 SIGSEGV 핸들러 **등록 syscall 0건** —
  가드/Bugsnag는 libsigchain 체인 내부(유저랜드 테이블) 등록. 24-K "raw rt_sigaction"
  해석 정정: syscall이 아니라 **sigchain API 등록**(커널에 보이지 않음).
- 우회 시도 기록: libc syscall() 래퍼의 rt_sigaction(11,NULL,&old) 조회로 현재 핸들러
  획득은 동작(설정 앱 실측)하나 토스에서는 타이머·콜백 무력화로 사용 불가.

### 25-5. 관측 인프라 교훈
- **전 syscall ftrace(sys_enter 필터 해제)는 부하로 게스트를 붙잡는다** — 3.6억 라인,
  앱 타이밍 붕괴(fault 미발생), adb 응답 지연. 좁은 id 필터만 사용할 것.
- SIGACT11 uid 게이트 필수: camow3 writer의 toybox 도구가 초당 ~9건 sigaction(11)
  도배(v4.15a에서 게이트 추가).
- toss_fault_resolve.sh: faultdump 등장 감시 → 컬렉션 창(~12s) 내 /proc/pid/maps 즉시
  캡처 → SFO/SFI 주소 resolve. OAT의 vaddr→파일오프셋 변환(r-LAAD 0x1a8000 기준) 필수.

### 25-6. 다음 세션 로드맵 (23차)
1. v4.15c 부트 자동 적용 확인 → SFI11의 정확한 handler 주소로 **가드 핸들러 정체**
   (libsigchain/libea56 anon) 확정 — "ucontext 라이터" RE 좌표.
2. fault 직전 좁은 syscall 추적(mprotect=226/process_vm_readv=270/prctl=167만) —
   [1] 크래프트 점프 직전 가드 스레드의 준비 동작.
3. 백그라운드 생존 프로세스 수명 측정(포그라운드 미진입 상태 몇 분?) — UI 경로
   트리거 가설 강화.
4. 재부팅 재발 시 reboot ISSUED/BLOCKED 로그로 발행 주체 판명(A 과제 완결).
5. libea56+0x69b38(셀프스캔 fault) RE — 누적기/아핀 구조(§12-13)와 연결.
6. 근본 대응은 여전히 **판정 입력 은폐**(채널 차단) — [1]~[5] 전체가 설계된 처형
   시퀀스이므로 증상 차단(폴트/kill)은 진단용으로만.

### 25-7. 산출물 (session22/)
- frida/{handler_probe,handler_query,bootstrap_probe,probe_health,sigchain_probe}.js,
  sigact_runner.py, sigchain_runner.py — 전부 "무력화 실측"의 증거 스크립트.
- toss_fault_resolve.sh(=fault-time maps 캡처+resolve), oat_patch_check.sh(런타임 OAT
  바이트 대조), nrun_observer.sh(N런 자동 관찰).
- maps_151203_21323.txt(resolve 근거), nrun1.log, forensics_22a/22b, oatpatch22/.
- LKM: v4.15(do_sigaction+reboot_log_all)→15a(uid 게이트)→15b(SFI11/SFO)→15c(ksig
  offset 정정) — built.ko로 boot_recover가 자동 적재.

## 26. 23차 세션 (2026-09-22 저녁) — **SIGSEGV 체인 완전 지도 + "제3자 시그프레임 기록" 판정 (소거법 완결)**

### 26-1. SFI11 정확 핸들러(v4.15c) — SIGSEGV 수거 체인의 실체
- **handler = libsigchain.so+0x208c = art::SignalChain::Handler**(exported 심볼 일치,
  nm 확인). 메인·RxCachedThreadS 공통. 수거는 ART 공식 시그널체인.
- **libsigchain rw(전역 SignalChain 배열) 덤프**(fault 창 /proc/pid/mem, 페이지 seek 방식):
  SIGSEGV 엔트리의 sa_handler = **libbugsnag-ndk.so+0x5ba60** (인접 슬롯 libart+0x927d4).
  → 체인은 SignalChain::Handler → bugsnag 핸들러. **가드(libea56) 포인터는 배열에 없음.**
- libbugsnag+0x5ba60 = 완전한 함수 프롤로그(stp x29,x30 / mov x19,x2=SA_SIGINFO ucontext)
  — Bugsnag NDK 크래시 캡처 핸들러.

### 26-2. 소거법 완결 — 크래프트의 경로 판정
| 검증 | 결과 | 함의 |
|---|---|---|
| OAT 코드 런타임 바이트 | == 원본 (22차) | OAT 무패치 |
| libbugsnag rx 런타임 바이트 | == 원본 100% (271/271 페이지) | 핸들러 코드 무패치 |
| libbugsnag rw 데이터 | diff 264슬롯 전부 자기 bss 정상 초기화, 실행 ptr 5개 전부 자기 lib 내부 | 데이터 무오염, 가드 콜백 주입 없음 |
| sigchain 배열 | libea56/외부 포인터 0건 | 가드 직접 등록 없음 |
| 복귀 pc(libart+0x257920) 스택 검색 | fault 창 스택(sp±16KB)에 **부재** | bugsnag 언와인드 유래 아님 |
| SFI11 fault-ctx vs SFO 복원 값 | **상이**(pc/lr/sp 전부 변조) | 시그프레임 메모리가 유저랜드에서 수정됨 |

- **결론(소거법)**: 커널(setup_rt_frame)이 쓴 원본 프레임이 bugsnag 핸들러 실행 창(~30ms)에
  제3자에 의해 직접 수정됐다. 순정 bugsnag·무오염 데이터·무패치 코드·비-스택-유래 값의
  조합으로 설명되는 유일 경로 = **가드 제3 스레드가 시그프레임(ucontext) 스택 메모리에
  백도어 직접 기록**(같은 주소공간 순수 유저 쓰기 — syscall/ftrace 불가, 커널 관측 사각).
- 크래프트 값(libart base+0x257920)은 가드가 런타임 계산(부트이미지/모듈 base 열람 후
  offset 합산) — 런별 base 변동과 정합.

### 26-3. 24차 로드맵 — "제3자 기록"의 주체 포착 (v4.16 설계)
- **시그프레임 페이지 RO 트랩**: SFI11 kprobe에서 프레임이 놓인 유저 페이지를
  set_pte_at+flush_tlb_page로 RO 처리 → 크래프트 시도 시 EL0 write fault →
  faultdump(kp_fault)에 **수정 주체 스레드 comm** 이 찍힌다 → parse_user_sigframe kprobe에서
  RW 복구(정상 sigreturn 보장). 주의: bugsnag도 그 페이지를 쓰면 오탐(순정은 안 씀 —
  검증됨), 커널 PT 조작의 안전성(page aligned, 단일 페이지) 사전 점검 필요.
- 병행: fault 직전 좁은 syscall(mprotect/process_vm_readv/prctl) 추적, 백그라운드 생존
  정밀 측정(UI 경로 트리거 가설), 재부팅 재발 시 ISSUED 로그 판명.

### 26-4. 산출물 (session23/)
- sigchain_dump.sh(체인 배열 rw 덤프+포인터 분류), stack_dump2.sh(fault 창 스택 덤프 —
  dd는 페이지 단위 seek 필수: toybox 큰 skip 실패), bugsnag_diff.sh / bnrw_diff.sh
  (rx/rw 원본 대조), toss_fault_resolve 재사용. /tmp/{libbugsnag22.so,libsigchain22.so} 보존.

## 27. 23차 후반 — **codex 외부검토로 22차 핵심 해석 정정 (크래프트 → 표준 NPE 변환)** ★중요

### 27-1. 검토 반론과 실증 (전부 수용 — 디스어셈블로 재검증 완료)
| 22차 해석 | codex 반론 | 실증 |
|---|---|---|
| [1] "크래프트 점프: entry+4 직행, x16=0 오염, lr=entry-4는 bl도 못 만드는 값" | **엔트리는 0x345500**(sub x16,sp,#0x2000 + ldr wzr,[x16] 스택프로브). 0x345534는 엔트리+0x34의 `ldr w0,[x1]` = **this->mBase 필드 로드, mBase=null → 표준 implicit null check** | ✓ hexdump+디코드: 0x345520 `adr x30,+12`가 **lr=0x34552c를 만든다**(read-barrier 링크) — "크래프트 필드"가 아니라 코드 생성물 |
| [3] "가드가 ucontext를 크래프트해 libart ExecuteSwitchImplCpp+0xE82C로 복귀" | **pgoff 누락 심볼화 오류**: rx pgoff=0x200000 보정 시 ELF vaddr=0x457920 = **art_quick_throw_null_pointer_exception_from_signal**. SFO 값(pc=NPE stub, sp-=8, lr=0, x0/x16 유지)은 **ART NullPointerHandler::Action의 표준 변환**(x30=si_addr=0 포함)과 완전 일치 | ✓ addr2line: 0x457920=NPE 트램펄린 확정. 디스어셈 `sub sp,#0x1f8`+전레지스터 저장 |
| kill9 셀프킬 = 처형 단계 | kill9 pid(10403등) ≠ main pid(4037) — **fork 수집 자식의 자기 정리**, main은 별도 System.exit | ✓ |
| SIGSEGV 핸들러 = bugsnag(23차) → "가드가 프레임 직접 기록"(26-2 소거법) | ucontext 수정 주체는 **ART FaultManager(NullPointerHandler)** — 표준 경로. bugsnag는 그 뒤 캡처 | ✓ (26-2의 "제3자 기록" 결론 폐기 — 수정 주체가 ART로 특정됨) |

### 27-2. 정정된 최종 모델 (22-23차 누적 + 검토 반영)
```
ContextWrapper.isRestricted()가 mBase=null 상태로 호출(5런+ 결정론)
→ 0x345534 ldr w0,[x1] implicit null check → far=0 SIGSEGV
→ ART FaultManager → NullPointerHandler::Action: ucontext를 NPE 변환
  (pc=art_quick_throw_null_pointer_exception_from_signal, [sp-8]=return_pc,
   x30=si_addr=0, 나머지 GPR 유지)  ← SFO 실측과 완전 일치
→ Java NPE 전달 → 토스 크래시 처리(Bugsnag/libsigchain 체인) → 수집 ~12s
→ main System.exit(0), fork 자식 kill9 자기정리
병행 별도 트랙: RxCachedThreadS 셀프스캔 fault @ libea56+0x69b38 (RASP 직결 후보)
```
- **"조용한 exit"의 정체 = NPE로 위장된 종료.** 정상 기기에선 mBase=null 호출이 없으므로
  far=0의 결정론적 발생 자체가 "누군가 mBase를 null로 만든다"(가드 판정 후 오염)의
  간접 증거. 단, 이는 미검증 가설로 재분류.
- 22차의 유지되는 기여: SFI11/SFO 관측 설계(그 자체로 유효 — NPE 변환 실증에 사용),
  fault 명령/파일 offset 정정, frida 무력화 실측, 관측 인프라, 재부팅 무장.

### 27-3. 다음 결정점 (24차 로드맵 개정)
1. **P1 isRestricted caller 특정**: boot-framework.oat vaddr 0x37d528(엔트리+0x28,
   fault 직전)에 ftrace uprobe — 인자 x1(this), 그리고 **[sp+0x28]=진짜 caller LR**
   (fetch `+0x28(%sp)`) 수집 → "누가 null-base ContextWrapper를 호출했나" 판명.
2. **P2 NPE 이후 경로**: libart+0x457920 uprobe 진입 확인 + NPE catch/UEH 수신자
   (TossApplication 핸들러) — 12s 수집·System.exit와의 인과 확정.
3. **P3 RxCachedThreadS/libea56+0x69b38 트랙**(셀프스캔 fault) — RASP 판정 직결,
   우선순위 상향.
4. P4 백그라운드 15s 사망(23차 실측: 홈 키 후 t+15s DEAD)과 mBase 경로의 관계.
- 검토 지적 반영: nrun "5런 완전 동일" 표현 완화(tail 슬라이딩 중복 포함),
  SFI/SFO 로그는 다중 pr_info 라인 전파 지연 고려(타이밍 해석 시 ms 여유).

### 27-4. 도구 정정 (구조적 결함 — 2회 연속 동일 실사고)
- toss_fault_resolve.sh resolve를 **ELF vaddr = (addr-map_start)+pgoff** 기준으로 정정
  (스킬 사본 동기화). 앞으로 심볼화는 반드시 pgoff 보정 후 addr2line.
- frida handler_probe.js의 ucontext offset(uc+0x28 등)도 오류(codex 지적 — bionic은
  uc_mcontext≈uc+0xB0, pc≈uc+0x1B8). 토스에서 콜백이 무력화돼 영향은 없었으나
  재사용 전 필수 수정.

## 28. 23차 마감 — **재부팅 루프 원인 판명: 가드 Timer-0의 커널 패닉 (A 과제 해결)** ★

### 28-1. 커널 콘솔(-show-kernel)이 포착한 재부팅의 전 과정 (16:00:41)
```
[1554.49] Unable to handle kernel paging request @ 0xbfffffc008007370
           ESR=0x86000004 EC=0x21 IABT(current EL) — 커널 명령 fetch 폴트, pte=0
           CPU:5 PID:1340 Comm:Timer-0   ← 토스 가드 타이머 스레드
           pc=0xbfffffc008007370 lr=0xffffffc008007370 (오염 포인터)
           x21=0xffffffff x19=0x4000c00 (오염 패턴 — 22차 "핸들러=0x4000c09"와 동일 계열)
           Call trace: 0xbfffffc008007370 하나뿐 (Code: bad PC value)
[1554.58] Kernel panic - not syncing: Oops: Fatal exception → 즉시 재부팅
```
- **재부팅의 정체 = 커널 패닉** (userspace reboot 발행이 아님). 부트 reason 이력 정합:
  이번 건 `reboot,1790060427`(reason 없음=panic 경로) vs adb 발행분 `reboot,shell`.
- **reboot_block이 못 막은 이유 해명**: 패닉은 syscall이 아니므로 __arm64_sys_reboot
  차단 대상 밖. 24-H의 가설 (b)"크래시 처리 경로가 커널을 무로그로 죽인다"가 정답.
- 발화 조건: 15:35 부트(정상 관측 환경)에서 앱 런 후 ~26분 시점, fault/SFI11 0건인
  런에서 발생 — **fault 체인과 별개의 Timer-0 자체 경로**. 매 크래시 동반이 아닌
  간헐성(22차 관찰)과 정합.

### 28-2. 모델 (가드의 이중 자폭 경로)
```
경로 A (일반): mBase=null → NPE → Bugsnag 캡처 → 12s 수집 → System.exit(0)  [§27]
경로 B (간헐): Timer-0가 커널 인터페이스 경유로 오염 포인터(0xbfffff...)를
              커널에 호출시켜 IABT 패닉 → 게스트 즉사 재부팅  [§28]
```
- 경로 B의 구체적 주입 채널 미상 (Timer-0 직전 syscall 추적이 24차 과제).
- 22차의 재부팅 4건(12:04~12:35 EOF가 토스 초기화 국면)도 경로 B였을 가능성 높음
  (무로그 즉사·2초 재부팅·panic_on_oops=1 환경 부합).

### 28-3. 즉시 대응 (23차 적용 완료)
- **panic_on_oops=0 + kernel.panic=0** 설정(현 부트 + boot_recover.sh [2b] 단계 상시화):
  패닉이 재부팅 대신 해당 태스크 사망+시스템 생존 → 재부팅 루프 무력화 + 관층 인프라
  유지. 계측 실수(BRK oops 등)도 재부팅 대신 생존해 dmesg 회수 가능.
- 감시자 재기동(forensics_23b). 커널 콘솔 캡처(/tmp/emu_kernel.log) 계속 유효.

### 28-4. 24차 로드맵 확정판
1. panic_on_oops=0 유지 하에 Timer-0 패닉 재현 → 패닉 후 dmesg/스택 회수(생존 가능해짐)
   → Timer-0의 직전 syscall(좁은 id 필터)과 오염 주입 채널 특정.
2. isRestricted caller LR(sp+0x28) 캡처 — 이번 세션 시도 2회 모두 루트 탈락/타이밍으로
   미성사, 스크립트는 완성(caller_capture.sh).
3. RxCachedThreadS/libea56+0x69b38 셀프스캔 트랙(632회 vm_readv 결정론과 연결).
4. NPE→UEH(TossApplication 핸들러) 수신 경로(logcat events).

## 29. 24차 세션 (2026-09-22 저녁) — claude 외부검토로 §28 정정 + caller LR 확보 + frida attach 생존 발견

### 29-1. §28 정정 (claude 검토 반론 — 콘솔 재검증으로 수용) ★
claude(opus) 검토가 /tmp/emu_kernel.log 재부팅 배너 7개를 전수 대조해 §28의
"가드 Timer-0 안티 포렐식 패닉" 해석을 반박했다. 재검증 결과 전부 사실:
1. **재부팅 3건 = 우리 hide_kmod의 rsig_pre BRK 패닉** — 콘솔 라인 2159/4358/...
   `Internal error: BRK handler: f2000001`, `pc: rsig_pre+0x120 [hide_kmod]`,
   폴트 명령 d4200020(=kprobe BRK#1). 21차 시절 부트들의 알려진 사고(§24-I-2)와
   동일 — 콘솔 파일에 누적돼 있던 것. 재부팅 7건 중 3건 계측 패닉 + 3건 shell 발행 +
   §28 IABT 1건.
2. **PID 1340(Timer-0)은 토스가 아니라 시스템 스레드** — 부팅 t=18.75s부터
   restorecon 수행(라인 19489), 토스 기동(t≈40s) 이전. "가드 Timer-0"은 오독.
3. **pc=0xbfffffc008007370은 lr과 하위 39bit 동일+bit62만 반전** = CFI/반환주소
   손상 시그니처(pac-ret/SCS 계열 — x18=SCS 포인터 방증). 유저랜드 크래프트
   포인터가 아님. x19=0x4000c00도 SA_RESTORER(0x04000000) 플래그 오독 계열.
- **§28의 "안티 포렐식 설계"/"이중 자폭" 서사는 폐기.** IABT 1건의 최유력 원인도
  우리 계측(kprobe의 반환경로 교란)이며, §27의 NPE 위장 종료(결론 A)와는 무관한
  별개 사건으로 분리. panic_on_oops=0 상시화는 여전히 유효 대응(계측 사고 시에도
  시스템 생존)이나 "가드 무력화"가 아니라 "계측 안전망"으로 재해석.
- 교훈: 콘솔 캡처는 **배너 단위의 부트 구분** 없이 읽으면 다른 부트의 사고를 현재
  부트 사건으로 오독한다(이번 실사고).

### 29-2. 24차 실험 성과
1. **caller LR 확보 (v4.16, kp_fault에서 copy_from_user_nofault)**:
   `caller_lr=[sp+0x28]=0x726de8a8(ok)` — fault 직후 오염 전 프레임 즉시 캡처 성공
   (유저랜드 /proc/mem 폴링은 컬렉션 덮어쓰기 후라 항상 늦음 — 실측 비교 완료).
   런 간 불변(부트이미지 매핑 고정). rx 시작(0x7258e000)+0xF08A8 = ELF vaddr
   0x2988A8 — **boot-framework.oat 내부 프레임워크 코드**(가드 직접 호출 아님).
   0x2988a4가 bl이 아닌 mov여서 "호출자 복귀주소" 해석에 여전히 구멍 — 다음 런에서
   fault 창 maps와 [sp+0x30]=0x71acd648 정밀 resolve 필요(25차 과제).
2. **frida attach 생존 발견 ★**: spawn 주입은 가드가 무력화하지만 **attach(기동
   1.5s 시점)는 생존** — Java.perform 진입·System.exit 훅 장착·파일 마킹 전부
   성공(probe_health2, 이중 채널로 구분). 22차 "frida 전면 무력화"의 정밀화:
   **무력화는 zygote specialization 전 주입 시에만 발생.**
   → exit_trap.js(System.exit/Runtime.exit 차단 + UEH 감시 + Java 스택 덤프)
   작성 완료 — am start 직후 즉사 런과 타이밍 겹쳐 아직 본실험 전(25차 1번 후보).
3. 재부팅 16:25 = v4.16 적재용 shell 발행(reboot,shell 사유 확인).
4. claude 지적 반영 대기: vmlinux 빌드로 lr=0xffffffc008007370 심볼화 진행 중.

### 29-3. 25차 로드맵 (claude 검토 P0 반영)
1. **P0-a 대조군**: hide_kmod 미적재 부트에서 IABT/BRK 재발 여부 — 계측 부작용
   최종 판정. (BRK 3건은 이미 rsig_pre=21차 사고로 귀속됐으므로, 현행 v4.16
   프로브군이 IABT를 내는지만 보면 됨)
2. **P0-b lr 심볼화**(vmlinux 빌드 중) — IABT의 정체.
3. **exit_trap 본실험**(attach + System.exit 차단) — "조용한 exit"의 Java 스택 확보,
   차단 시 5분 생존 가능성 직접 검증(목표 D 재도전).
4. **libea56+0x69b38 셀프스캔 트랙**(claude 권고 상향 — RASP 판정 본령).
5. caller_lr 0x2988A8 정밀 심볼화(oatdump 또는 문맥 디스어셈블).

### 29-4. 24차 후반 — **cmdline 위장 즉사 경로 발견** ★ (pidof 실패의 진실)
- 16:33 이후 am start 런에서 pidof/ps가 토스를 못 찾는 현상 → 고속 관찰+logcat+tombstone
  (tombstone_16)으로 해명:
```
16:35:36.750 AMS: Start proc 31153:viva.republica.toss/u0a175
16:35:36.77x 프로세스 기동 직후 /dev/.pl728v(camow3 위장 파일) 접근
16:35:37.012 crash_dump64 — 시작 0.3s 만에 크래시
  tombstone_16: Cmdline = com.google.android.apps.maps:server_recovery_process_scheduled
  uid=10175(토스!) signal 11 SEGV_ACCERR fault=0x7a9740fa80
  pc=libart+0x792e44, backtrace #01 art::SafeGetDeclaringClass(ArtMethod*)+108
16:35:46 AMS: failed to attach → Killing (start timeout)
```
- **토스 프로세스는 시작 0.3s 내에 cmdline을 구글 지도 서버복구 프로세스로 교체(위장)
  후, ART의 ArtMethod 검증 함수(SafeGetDeclaringClass)에서 SEGV_ACCERR 즉사.**
- 이것이 pidof/ps 실패의 원인(cmdline 교체로 이름 검색 불가). am start의
  "intent delivered to top-most"는 죽은 task 기록 잔재.
- **21차 SIGACT11의謎 재해석**: comm=logcat/which/pm/gateway.toss.im(uid=10175)도
  전부 이 cmdline/comm 위장 계열 — "가드 fork 자식"이 아니라 **가드의 프로세스명 위장**.
- 같은 부트에서 16:28(NPE 25s 런)→16:31(attach 성공)→16:33부터 위장 즉사로 전환 —
  가드가 런 반복에 따라 단계를 바꾸는 것으로 보임(누적 판정?).
- 함의: 25차의 프로세스 탐색은 uid(10175) 기반이어야 하고, cmdline 위장 상태에서도
  attach 가능(교체 전 0.3s 창은 빡빡 — force-stop 후 첫 런이 잘 걸리는 듯).

### 29-5. 25차 로드맵 갱신 (29-4 반영)
1. exit_trap 본실험 — 단, pid 확보는 **uid 기반(ps -o UID 필터)+force-stop 직후 창**.
2. cmdline 위장 경로 정체: SafeGetDeclaringClass 즉사가 "판정 후 처형의 제3경로"
   (NPE 위장과 별개)인지, 우연한 초기화 충돌인지 — tombstone_16 backtrace 전문 RE.
3. P0 대조군(LKM 미적재 부트) + vmlinux lr 심볼화(빌드 진행 중).
4. libea56+0x69b38 셀프스캔 트랙.

## 30. 25차 세션 (2026-09-22 저녁) — **Runtime.exit(0) 차단으로 원본 토스 7분+ 포그라운드 생존** ★★

### 30-1. exit_trap 실험 성공 (재부팅 직후 첫 런)
- 환경: 재부팅→boot_recover→첫 am start(cmdline 위장 즉사 모드 리셋 가정).
  uid 기반 pid 탐색(ps -A -o UID==10175, 3.5s 내 확보) → frida attach + exit_trap.js
  (System.exit/Runtime.exit 차단 모드 + UEH 감시).
- 실측 시퀀스:
```
[UEH] current=com.mbridge.msdk.foundation.same.report.crashreport.e (광고 SDK 소유)
[EXIT] Runtime.exit(0) — BLOCKED          ← "조용한 exit"의 최종 실행자 확정
이후: 프로세스 3966 생존 7분+(17:00경 현재진행), SplashActivity 포그라운드 유지,
      "Fully drawn +1s535ms"(풀 렌더), 탭 반응(WindowLeaked=탭 처리 중 finish 1회),
      스플래시 재진입 시에도 75s+ 유지, 서브프로세스(gateway 추정) 재가동
```
- **인과 확정: 종료의 마지막 관문은 Java Runtime.exit(0)** — 차단 시 이전 단계(NPE/
  컬렉션/kill9)가 전부 돌아도 프로세스는 산다(§27 "main은 System.exit로 죽는다"의
  Runtime.exit 변형 확정 + fork 자식 kill9는 자기정리라 무해 재확인).
- **"frida 없이" 목표와의 관계**: exit 차단은 frida(유저랜드 개입)로 증명. LKM으로
  동등 차단하려면 exit_group syscall 게이트(target uid의 exit_group 0 무력화) —
  단 이전 20차 관찰(kill 차단 무의미)과 달리 exit_group 직접 차단은 "무한 대기"
  상태를 만들 수 있어 실험 필요. 26차 후보.

### 30-2. 남은 거리 (목표 D 대비)
- **프로세스 생존+스플래시 렌더 달성. 미달: 메인 UI 진입.** 스플래시→메인 전환은
  NPE로 이미 사망한 splash 내부 로직이 담당 → 스플래시 갇힘 상태.
- MainActivity는 매니페스트에 없음(am start 에러 실측) — 전환은 splash 코드 몫.
- 다음 목표는 mBase=null 주입 차단(NPE 자체를 안 내게) 또는 전환 로직 보존.

### 30-3. 25차 기록 사항
- cmdline 위장 즉사 모드: 재부팅으로 리셋 후 첫 런은 정상 경로 — "런 반복 누적
  전환" 가설과 정합(미검증 유지).
- pid 탐색 교훈: cmdline 위장 시 이름 기반 불가 → uid 기반 필수(§29-4/pitfalls).
- 외부검토: 25차 마감 claude 검토 진행(결과 반영 예정).

## 31. 26차 세션 (2026-09-22 밤) — **far=0 호출은 Java 디스패치 우회(native blr) 확정, 유저랜드 NPE 차단 불가 판정**

### 31-1. isRestricted Java 후크 실험 (npe_guard 3종)
- 실패 원인 규명: 1차/2차 실패는 **setBaseContext가 이 빌드에 없음**(undefined,
  getDeclaredMethods 전수 확인 — attachBaseContext는 있음) → 같은 try 블록의
  isRestricted 후크까지 전멸. 3차(isRestricted 단독) **후크 장착 성공**.
- CLEAR_TASK로 액티비티 재생성(신규 ActivityRecord c199411) 후에도 **[HIT] 0건** —
  그런데 **faultdump #5(far=0)는 같은 pid에서 발생**.
- **결론: far=0 폴트를 내는 isRestricted 호출은 Java 메서드 디스패치를 우회한다**
  (frida의 implementation 교체는 ArtMethod 엔트리포인트 교체 — 호출부가 blr로
  quick 코드 주소를 직접 부르면 무력). §27 "가드의 목적성 호출"이 **native(blr)
  직접호출**으로 확정에 근접. caller_lr(0x2988A8)의 `ldr w0,[x1]` 인라인 null-check
  패턴과 정합(호출 원점이 ContextWrapper 위임 패턴의 프레임워크 코드일 가능성).
- 유저랜드(Java) 후크로는 NPE 원천 차단 불가 판정.

### 31-2. 부수 관찰
- toss://main 딥링크 → splash가 자기 라우팅(메인 직행 불가).
- exit 차단 생존 프로세스의 splash는 **완전 정지 화면**(3캡처 동일 바이트) —
  UI 스레드가 NPE 시점에 멈춘 상태. 액티비티 재생성으로도 부활 없음(가드가
  프로세스당 1회 판정/처형 후 재사망 없이 정지 유지 추정).
- 스킬/도구: npe_guard3.js(작동 isRestricted 후크), diag2.js(메서드 노출 진단).

### 31-3. 남은 경로 (27차)
1. **Java.choose mBase 사전 교정**: 가드가 null-base 인스턴스를 만든 뒤 NPE까지의
   창이 있다면, 주기 스캔(타이머 불가 → 다른 훅 콜백 안에서)으로 mBase 필드에
   유효 Context 주입 → 폴트 자체 미발생 유도. 유일하게 남은 유저랜드 경로.
2. **커널 NPE 바이패스 재검토**: CONFIG_KPROBE_OVERRIDE=n(22차 확인)이라 폴트 흐름
   억제는 불가 — 단, "fault 시점 pt_regs의 pc+=4/x0=0 수정"만으로도 시그널은 가지만
   ART NPE 변환 이후 실행이 진행되는 실험은 미시행(변환 stub이 원 pc 기준이라
   무의미할 가능성 높음 — 정밀 검토 필요).
3. native blr 호출자 추적: frida Interceptor를 OAT 엔트리에 다는 안은 uprobe 무결성
   붕괴와 같은 위험(23차 교란 실측) — 원칙적으로 금지 유지.

### 31-4. mBase 사전 교정 실험 (26차 말) — 실패 기록
- fix4/fix5: rpc 기반 Java.choose(ContextWrapper) 스캔으로 mBase=null 인스턴스에
  유효 context 주입 시도. fix5(신규 프로세스): attach+isRestricted/exit 후크 장착
  직후 **첫 스캔 전에 프로세스 사망**(faultdump #7) — ①NPE까지 창이 스캔보다 짧거나
  ②Java.choose 힙 스캔 자체가 가드 검출/부하 유발 가능. 그리고 이번엔 **exit 차단도
  무력화된 사망** — Runtime.exit(Java) 외에 **raw exit_group 우회 경로**가 존재할
  가능성(§24-J와 정합). 25차 생존은 "Runtime.exit 경로" 런에서만 성립했을 해석.
- 추가 관찰: frida attach detach 시(타임아웃) implementation은 복원됨 — npe_guard3
  detach 후 CLEAR_TASK 런에서 사망(faultdump #6, exit 복구 상태).
- 27차: 교정 경로는 스캔 비용 축소(단일 인스턴스 캐시 후 경량 폴링) 없이는 재시도
  무의미할 가능성 — 목표 D는 결국 판정 입력 차단(libea56 셀프스캔 트랙) 원점 회귀가
  정공(스킬 원칙: 근거 제거).

## 32. 27차 세션 (2026-09-22 밤) — **pm clear 프로토콜 도입: 앱 데이터가 처형 경로를 결정한다**

### 32-1. pm clear(데이터 초기화) 첫 런 = 즉사 경로 (사용자 지시로 확립된 프로토콜)
```
pm clear viva.republica.toss → am start →
17:30:43.89 프로세스 시작, /dev/.pl728v(camow3 위장 파일) 접근
17:30:44.15 SafeGetDeclaringClass SEGV_ACCERR 즉사(tombstone_36, 0.5s)
17:30:44.5x crash_dump64 → 17:30:53 AMS "failed to attach"
faultdump(NPE) 0건 — far=0 경로 안 거침
```
- **tombstone_36의 cmdline = "com.google.android.configupdater", uid=10175(토스)** —
  logcat/avc의 pid 13135=viva.republica.toss와 대조로 **cmdline 위장 재확정**.
  위장 이름은 런마다 상이(maps/configupdater/logcat/which/pm/zygote_reactjs —
  tombstone_33/34의 zygote_reactjs도 토스 위장 추정).
- §29-4 해석 유지·강화: "SafeGetDeclaringClass 크래시가 다른 앱에서도 난다"는 반례
  가능성은 제거 — 전부 토스의 위장 cmdline이었다.

### 32-2. 앱 데이터 → 처형 경로 선택 (27차 핵심 발견)
| 앱 데이터 상태 | 처형 경로 | 시그니처 |
|---|---|---|
| 초기화(pm clear 직후) | **즉사**: cmdline 위장 + SafeGetDeclaringClass ACCERR | 0.3~0.5s, faultdump 0 |
| 데이터 존재 | **NPE 위장**: mBase=null → far=0 → Runtime.exit(0) | 5~13s, faultdump 1 |
- 가드가 (초기 부팅 상태/저장된 판정 플래그에 따라) 다른 경로 선택 — **판정 상태의
  일부가 앱 데이터에 저장**될 가능성. 24차 "런 반복 후 위장 모드 전환"도 데이터
  누적 설명으로 수렴.
- 실험 프로토콜(스킬 반영): **런 전 pm clear 기본화(사용자 지시)** — 단 NPE 경로
  관찰 실험은 pm clear 직후 2번째 런부터(첫 런은 즉사). 즉사 경로 연구는 pm clear
  직후 창.

### 32-3. 28차 로드맵
1. 즉사 경로(SafeGetDeclaringClass ACCERR)의 정체: fault addr 0x7bcbe0fa80 — 토스
   힙/AntMethod 테이블 영역 추정, tombstone 전문 RE. 초기화 상태에서만 나는 이유
   (온보딩 경로의 검사?) 규명.
2. pm clear → 2번째 런부터 NPE 경로 복귀 확인(경로 전환 조건 정밀화).
3. 판정 데이터 저장 위치: 앱 데이터 내 파일/SharedPreferences — pm clear 후 살아남는
   것(외부 저장/DA)과 대조.
4. 9/25 claude 리셋 후 25~27차 통합 검토. vmlinux 심볼화.

### 32-2b. 경로 전환 관찰 (27차 말 — pm clear 후 4런 반복)
- pm clear 상태에서 런 4회 반복: **전부 즉사 경로**(3s 내, faultdump 0, cmdline
  "configupdater" 위장 유지) — NPE 경로로의 전환 없음.
- 같은 부트에서 pm clear 직전(17:27 런)까지 NPE 경로였음 → **경로 결정 변수 =
  앱 데이터 존재 여부로 확정** (런 반복/부트 경과 아님).
- 운영 규칙 확정(사용자 지시 조정판): 기본은 런 전 pm clear(재현성). **NPE 경로
  실험 시에만**: pm clear 1회 → 온보딩/기동 1회로 데이터 생성 → 이후 pm clear 없이
  실험. (초기화 고정 상태에선 NPE 관찰 자체가 불가)

### 32-3. 28차 — 즉사 경로 완전 해부: **가짜 ArtMethod*로 ART 검증기 자폭 유도** ★
- SFI11 3연발(런마다 동일) + tombstone backtrace + fault 창 maps 교차:
```
① SFI11: pc=libart+0x792194(SafeGetDeclaringClass 근처) si_addr=0x7bcbe0f428
   x16=0x7bcbe0f000 — libart 자기 코드가 읽으려는 주소가 PROTECTION 페이지
② SFI11: pc==si_addr=0x7bb694e338(anon) — 실행 폴트(IsInGeneratedCode 경유)
③ SFI11: pc=libart+0x792e44(SafeGetDeclaringClass) si_addr=0x7bcbe0fa80 → 사망
maps: 7bcbe0f000-7bcbe10000 ---p libart.so ← 폴트 주소 전부 이 PROT_NONE 가드 페이지
```
- **모델**: 가드(초기화 상태)가 **libart 가드 페이지를 가리키는 가짜/오염 ArtMethod\***
  를 심는다 → ART FaultManager의 무결성 검증(SafeGetDeclaringClass)이 그 필드를
  읽다 ACCERR → 핸들러 내부 이중 폴트 → 복구 불가 즉사. **ART 자체의 검증 경로를
  무기로 쓰는 설계.** tombstone_16(maps)/36(configupdater) 전부 동일 백트레이스.
- 즉사 런은 앱 데이터 파일 0개(0.5s 수명) — NPE 경로의 "데이터 있음" 상태는
  과거 생존 런(5s+)이 만든 것. pm clear 상태에선 데이터가 절대 안 생겨 즉사 고정
  (§32-2b 관찰과 정합).
- 28차 말 과제: NPE 경로 데이터의 기원 파일 특정(생존 런 직후 데이터 스냅샷 diff)
  및 가짜 ArtMethod* 주입 지점(가드 초기화 코드) RE.

### 32-4. vmlinux/검토 상태
- vmlinux 빌드 1시간+ 진행(컨테이너 생존) — 완료 시 IABT lr 심볼화.
- claude 9/25 리셋 후 25~28차 통합 검토.

## 33. 29차 세션 (2026-09-22 심야) — **외부 핸드오프 통합(unidbg+Ghidra 축 이동) + IndirectBranch edge 복구 1차 성공**

### 33-1. 통합한 외부 핸드오프 (TOSS_GUARD_REVERSE_ENGINEERING_HANDOFF_2026-09-22.md)
- 병렬 분석 라인의 종합보고 — 우리 정정사항(NPE=표준 변환, vm_readv≠폴트 원인,
  ctx+0x1c8≠전역 스코어)과 정합. **수용·통합 완료.**
- 핵심 전략 전환(수용): LKM AVD=Ground Truth 유지 + **unidbg(함수 단위 실행) +
  Ghidra(정적)로 분석 축 이동** (35/35/30). "흔적 하나 더 숨기기"의 한계효용 만료.
- **Hikari/OLLVM provenance(강한 추론, 공개 확인 아님)**: R_AARCH64_RELATIVE
  7,327중 7,314가 .text 타깃 = IndirectBranch, LDAXR/STLXR 277/261 =
  StringEncryption — Hikari-derived custom LLVM 파이프라인. 재정정 금지 목록
  (C1~C6)과 공개사실/추론 구분표를 그대로 계승.
- unidbg 자산(사용자 지시 참조): tools/unidbg-runner(maven) + AppSuit 해제 기법
  (emu_dtinit_unpack.py — unicorn DT_INIT 에뮬레이션 복호화 등) — libea56 적용 시
  재활용. vmlinux 빌드는 BUILD_FAIL(원인 규명 이월).

### 33-2. P0-1 IndirectBranch 타깃 복구 1차 성공 ★
- 도구: `scripts/build_indirect_edges.py` (readelf RELATIVE + adrp/add/ldr/br
  정적 매칭; ADRP는 PC-상대 페이지 계산 필수 — 1차 시도 실패 원인).
- 결과: **branch 사이트 5,329개 중 412개 edge 복구**
  (site→table_entry→text_target). 수치 검증: RELATIVE 7,327/into .text 7,314/
  unique 7,264 — 핸드오프 값과 완전 일치.
- 샘플 edge: `0x35478 --[0x17d898]--> 0x35620` 등. 나머지 4,917개 사이트는
  인덱스형 ldr/다단 간접 — unidbg 실행 트레이스(Phase 2)로 보강이 정석.
- 다음: (a) 412 edge를 Ghidra xref/라벨 주입(headless 스크립트) (b) StringEncryption
  후보(LDAXR/STLXR 진입부) unidbg 실행 → plaintext diff (Phase 1) (c) vm_readv
  632 triplet 정규화(P1) — 데이터-있음 상태 확보 후.

### 33-3. 30차 로드맵
1. Ghidra headless: indirect_edges.json → xref/label 주입 + 함수별 타깃 밀도 지도
2. unidbg harness(libea56 최소 로드) — Phase 0(ELF-only) 후 StringEncryption 후보 1개
3. vm_readv triplet 수집(NPE 경로 데이터 상태 재현 시) / actuator sink backward slice
4. vmlinux 빌드 실패 원인 → IABT lr 심볼화 / 9/25 claude 리셋 후 통합 검토

## 34. 30차 세션 (2026-09-22 심야) — **Ghidra xref 412 주입 완료 + unidbg Phase 0 성공**

### 34-1. Ghidra xref 주입 (P0-1 완결)
- InjectIndirectEdges.java(headless postScript, ReferenceManager.addMemoryReference +
  EOL 코멘트): **412 edge 전량 주입 성공**(COMPUTED_JUMP@site + DATA@table_entry,
  fail=0) — Ghidra 프로젝트 toss5(/tmp/gproj)에 반영. 이후 디컴파일/CFG에서
  indirect 엣지가 살아난다. 함수별 밀도 지도는 Ghidra 함수 정의 후 재출력 예정.
- 스크립트 보존: /tmp/ghidra_scripts/InjectIndirectEdges.java (+session29 복사).

### 34-2. unidbg Phase 0 성공 ★ (TossEa56Test.java, tools/unidbg-runner)
- for64Bit + AndroidResolver(21) + **memory.load(SO, forceCallInit=false)** —
  초기화 없이 ELF-only 로드: base=0x12000000, size=0x1a0000. 정상 매핑.
- 코드 바이트로 핑거프린트 실증:
```
0x38718: adrp x8; add x8,x8,#0x318; ldaxr w8,[x8]; cbnz w8,...
         → StringEncryption atomic guard (핸드오프 Fingerprint B 그대로)
0xb0284: adrp x9; add x9; ldr x9,[x9,#0x330]; blr x9
         → IndirectBranch 트리 구조 (Fingerprint A 예시 — relocation 0x181680→0xb02b8)
```
- **Phase 1(31차)**: StringEncryption 후보(0x38718 인근 진입부)를 unidbg에서
  직접 실행 → 실행 전/후 메모리 diff → plaintext 복원. 성공 시 Hikari
  StringEncryption provenance + 분석 파이프라인 동시 입증(핸드오프 최우선 milestone).

### 34-3. 31차 로드맵
1. Phase 1: 0x38718 소속 함수 경계 확정(Ghidra) → unidbg 직접 call → mem diff
2. 함수별 IB 밀도 지도(Ghidra 함수 정의 후) → Hikari 적용 함수 fingerprint
3. vm_readv triplet / vmlinux 빌드 실패 원인 / 9/25 claude 리셋 후 통합 검토

## 35. 31차 세션 (2026-09-22 심야) — **Phase 1 첫 관통: StringEncryption 가드 실동 + 복호 루틴 구조 해명**

### 35-1. unidbg Phase 1 실행 결과 (TossEa56Phase1.java)
- 진입 0x38718(LDAXR guard): 실행 → **가드 플래그 0x186318이 0→1로 세팅** (mem diff 실증)
  → 복호 경로 진입 → UC_ERR_WRITE_UNMAPPED 중단.
- 크래시 지점 해부(레지스터+디스어셈블):
```
0x3ab20: adrp x8; add x8,x8,#0xa40   → x8=base+0x17ba40 (rela 영역)
0x3ab30: adrp x12; add ... ; add x13,sp,#0x100; add x13,x13,#0xc8; add x13,x13,x10
0x3ab44: strb w11,[x13]              ← 쓰기 = sp+0x1c8+x10(인덱스) 스택 버퍼
```
- **해석**: 복호 루틴은 (a) rela/데이터 테이블(x8/x9)을 읽어 (b) **스택 버퍼(sp+0x1c8+idx)에
  strb 단위로 복호본을 생성** — unidbg 초기 스택 매핑 부족으로 idx 진행 중 중단.
- 32차 조치(확정): 실행 전 sp를 수동 매핑(base+0x3000000, 1MB, RW)으로 재세팅 →
  실행 → 모듈+스택 영역 diff → **plaintext 복원 완성** 직전.
- 부수 확정: 0x38718 블록 = Hikari StringEncryption guard 원형(체크→마킹→본문)이
  unidbg 실행으로 실증됨(정적 추정→동작 확인).

### 35-2. API 교훈 (스킬 반영)
- unidbg reg_write: `import unicorn.Arm64Const;`(기존 AppSuitTest와 동일) +
  `com.github.unidbg.arm.backend.Backend` 타입. emu_start(begin, until, timeout, count).
- crash 시 catch 블록에서 backend.reg_read(PC/regs) 덤프 — 크래시 명령 인자 해부에 직결.

### 35-3. ★ MILESTONE: StringEncryption plaintext 복원 성공 (31차 종결점)
- 스택 재배치(mem_map base+0x3000000 1MB, SP=0x150f0000) 후 재실행:
```
모듈 diff 0x17a318-0x17a328 (16B) = "/proc/self/maps\0"   ← 복호된 평문!
스택 0x150f10c8 (92B) / 0x150f1125 (163B) = 고엔트로피 암호문 원본 버퍼
실행은 복호본 작성 후 FETCH_UNMAPPED로 종료(+0x16f090, text 경계) — 무관
```
- **의의**: (a) Hikari StringEncryption provenance가 동작 레벨로 입증됨(정적 추정→실행
  실증) (b) **복호 파이프라인 확립** — 임의 guard 진입부를 unidbg에서 실행하면 그
  함수의 문자열 평문이 그대로 나온다. 첫 평문이 "/proc/self/maps"(탐지 채널)인 것도
  가드 어휘임을 방증.
- 32차 확장: LDAXR guard 277개(LDAXR 카운트 기준 진입부 클러스터)를 순차 실행하는
  자동화(Phase1 러너에 후보 리스트 인자) → **가드 문자열 어휘 전수 복원** → 탐지
  채널 목록의 직접적 확보(그간 ftrace로 우회 추정하던 것의 원문 확보).

## 36. 32차 세션 (2026-09-22 심야) — Phase 2 전수 자동화: 시행착오 기록 (일단 중단)

### 36-1. 시도와 결과
- 진입부 후보 추출 완료: **LDAXR 281개**(핸드오프 277과 근사) 중 adrp 패턴 진입
  **68개**, prologue 역추적로 함수 시작 재계산(guard_entries.json).
- Phase2 벌크 러너(TossEa56Phase2.java): 스냅샷 복원 방식 → **JVM 네이티브 크래시**
  (unicorn 반복 emu_start, hs_err 로그); 새-emulator-매-후보 방식으로 전환 →
  실행은 되나 인스턴스당 로드 비용으로 수 분 소요, 샘플에서 평문 0건
  (진입부/문맥 추정 부정확 추정 — 0x38718은 무인자 함수 특이 케이스).
- **판정**: 전수 자동화는 현재 접근(정적 진입 추정)으로 수율 낮음 — Ghidra 함수
  정의+toss5 xref 주입 결과로 진입부를 정확히 아는 것이 선행. 일단 중단,
  Phase 1 단일 레시피(성공 확실)를 요청 시 개별 실행하는 것으로 운용.

### 36-2. 확보 교훈 (스킬 반영)
- unicorn 반복 emu_start는 네이티브 크래시 낼 수 있음 — 벌크 실행은 매 후보 새
  emulator(안전하나 로드 비용 有).
- `mvn exec:java`는 매번 Maven 부팅(30~60s) — classpath 1회 추출 후
  `java -cp target/classes:$(cat cp.txt)` 직접 실행(수 초).
- 0x38718형(무인자·무프롤로그 가드 함수)만 단독 실행 수율 — 인자 필요 함수는
  문맥 세팅(unidbg VM/JNI 또는 실측 레지스터 재현)이 필요.

## 37. 33차 세션 (2026-09-22 심야) — **Ghidra 함수 1,891개 정의 + IB 밀도 지도 확보**

### 37-1. Ghidra toss5 완전 분석 + 매핑 결과
- Auto-Analyze 완료 → **함수 1,891개 정의**(DumpFunctions.java → functions.csv).
- 가드 68개 중 13개가 Ghidra 함수에 매핑(55개는 OLLVM 경계 밖 — 분석 한계),
  **그 13개 전부 무인자 함수**(guard_zeroarg.json) — 0x38718형 재현 후보.
- **함수별 IB(IndirectBranch) 밀도 지도**(412 edge 중 54개 함수 매핑):
```
11  FUN_0013e0b8   ← 가드 다중 보유(가드 5개 포함) — Hikari 적용 최핵심
 8  FUN_001380a4   (가드 포함)
 5  FUN_00144e2c
 3  FUN_00135858   (가드 2개)
```
  → 33차 이후 RE는 이 4개 함수 집중이 최단(디컴파일 우선 대상).
- Phase2 무인자 13개 재시도: 타임아웃 창 내 평문 미출 — 실행 문맥(전역 초기화
  선행 등) 추가 필요 추정. 단일 성공 레시피(0x38718)는 유효 유지.

### 37-2. 기타
- vmlinux 2회 재빌드 실패(out 상태 오염/BTF) → **보류**(IABT 1건 심볼화의 계류
  가치 낮음 — 계측 사고 규명이 정론).
- 데이터-있음 상태 재현의 **순환 함정 실측**: pm clear 상태 즉사(0.5s)가 frida
  attach(3.5s)보다 빨라 exit 차단 생존 불가 → 데이터 생성 불가. 타개 후보:
  부팅 직후 자동 부활 프로세스(23차 관찰) attach, 또는 즉사 첫 폴트 시점
  지연(LKM) — 34차 과제.

## 38. 34차 세션 (2026-09-22 심야) — **RE 방향 확정: IB 상위 함수 = Hikari 디스패처, 가드 로직은 edge 타깃에**

### 38-1. 핵심 4함수 디컴파일 결과
- ghidra_decompile_at.java가 libea56(ET_DYN, offset==vaddr)에서 offset 변환 어긋남
  — 4개 전부 같은 함수(FUN_0023712c) 반환 → **버그이지만 우연히 Hikari
  IndirectBranch 디스패처 최초 디컴파일** 획득:
```c
iVar4 = DAT_00279eb0;                    // 런타임 의존 키(안티 정적분석)
if (param_1 != (-iVar4|0x8692049)*2 - (-iVar4^0x8692049)) ...  // MBA(a+b 전개)
  ... PTR_LAB(함수포인터테이블) 선택 ...
(*(code *)*ppuVar2)();                   // 간접 호출 — jumptable 복구 실패 지점
```
- 정확 재디컴파일(DecAtExact.java 신규): FUN_0013e0b8도 동일 구조(인덱스→테이블→호출).
- **결론: IB 밀도 상위 함수들 = 난독 디스패처/트램폴린(장식) — 가드 의미론은
  PTR_LAB 타깃 함수들.** 우리 412 edge DB의 target이 바로 그 타깃 목록.
- RE 로드맵 정정(35차): edge target을 functions.csv 매핑 → 타깃 함수 중 의미
  있는 것(문자열/시스템콜 인접) 디컴파일 → 가드 의미론 첫 관통.

### 38-2. 도구 정정
- DecAtExact.java(session34/) — functions.csv entry 정확 디컴파일(ghidra_decompile_at
  대체, libea56용). 스킬 ghidra_decompile_at의 offset 변환은 재검 필요 주석 추가.

## 39. 35차 세션 (2026-09-22 심야) — **호출그래프 관통: 잎(leaf) 24개 = StringEncryption 복호 루틴, 전수평명 실행 개시**

### 39-1. 디스패치 그래프 해부 완료
- edge 412 → 타깃 고유 380 중 매핑 68 — 상위는 디스패처끼리의 체인(서로 지목).
- **잎(leaf) 판별 = "타깃이지만 edge 소스가 아닌 함수" → 24개**(전부 무인자,
  0x144~0x16b 대역). 가드소속∩타깃 6개 중 3개 신규(15ef44/16a6cc/16c3f0)도
  디스패처 변형(호출 결과로 분기하는 체인 포함).
- **잎 최대(L_14432c, 144라인) 디컴파일로 정체 확정**: LDAXR 가드 + MBA 키 계산
  (`(-k^C)+(-k&C)*2` = XOR/AND 전개) + 암호문 포인터(&DAT_002747ba) —
  **Hikari StringEncryption 복호 루틴들.** 즉 구조 = 디스패처(장식) → 잎 24개가
  각자 자기 문자열 복호.
- 함의: 잎은 무인자·자기완결 → **0x38718과 동일 레시피로 unidbg 단독 실행 가능**
  (32차 실패는 디스패처 진입이라 문맥이 필요했던 것 — 잎은 아님).

### 39-2. Phase 2 전수 실행(잎 24개) — 진행 중
- 첫 시도 115s 타임아웃(24×새-emulator 로드 비용 초과) → 400s 백그라운드 재실행
  (결과: session32/strings.jsonl) — **36차 첫 확인 사항**. 성공 시 가드 문자열
  어휘 전수(판정 입력 원문) 확보.

### 39-3. 산출 (session35/)
- target_functions.json(380 타깃), leaf_functions.json(24), leaf_dec/(20개 디컴파일,
  NOFUNC 3), DecBatch.java(전수 배치 디컴파일러).

## 40. 36차 세션 (2026-09-22 심야) — ★★ **StringEncryption 전수 관통: 가드 어휘 56개 원문 확보**

### 40-1. 35차 예측 확인 → 두 가지 정정
- **35차 백그라운드 Phase2는 폭사했었다**: strings.jsonl 0바이트, /tmp/p2_leaves.log에
  unicorn SIGBUS(`memory_region_transaction_commit_aarch64`). unidbg-runner에
  hs_err_pid 7개(33499~73882) — "새 emulator per 후보"로도 JVM 내 반복 생성은
  불안정. **해법 = 잎 1개당 JVM 프로세스 1개**(완전 격리) — 이후 크래시 0.
- **정정 C8 — "잎 24개 = 무인자 자기완결 복호 루틴" 부정확**: leaf_functions.json의
  Ghidra 함수 시작들은 디스패처 조각(0x154174 `br x11`, 0x1441a4 `madd` IB 산술)
  이거나 문맥 레지스터 필요(L_154178 `unaff_x19` — [x19+0x308] 저장). 실행하면
  전멸(24/24 즉시 폴트). **정확한 진입 시그니처 = `adrp Xn` + `add Xn` + `ldaxr` 
  트리플**(0x38718 실측 구조와 동일) — capstone 스캔으로 **254개** 추출.
  즉 Hikari StringEncryption은 **참조 사이트마다 복호 루틴이 인라인**되며, 같은
  문자열의 복호본이 여러 엔트리에서 공유(락 DAT 기준 다대일).
- **Ghidra 주소 = ELF vaddr + 0x100000 바이어스** 확정(DAT_00275c78→0x175c78 .data).
  .bss = 0x186210~0x19e8b0(락/once-flag 전부 이 안), 키/암호문 = .data 파일백킹.

### 40-2. 실행 파이프라인 (session36/)
- TossEa56Leaf.java(진입 1개 실행 + 모듈/스택 diff + .data after-image 덤프) +
  run_all.py/run_dump.py(병렬 6, 프로세스 격리). **254 진입 전수 38초** 완주.
- 덤프 병합(프리스틴 대조 변경 바이트 합집합 30,100B) → 변경 영역 널종료 문자열
  추출 → **가드 어휘 56개 확정**(vocab_final.json), 락↔엔트리↔문자열 매핑
  (lock_string_mapping.json, 락 15개 직접 복원).
- 잔여: 미복호 고통절 영역 11.4KB(20곳, 최대 0x184100-0x185740 5.7KB) — 헥스
  구조 무형(문자열 아닌 바이너리 페이로드, 키/설정 추정). 미추적 ldaxr 29개 사이트.

### 40-3. ★ 가드 어휘 분류 (탐지 채널 원문 — ftrace 간접 추정의 원문 확정)
**A. /proc 자기관찰** (vm_readv 632회·fd resolve 208/163와 정합):
`/proc/self/maps` `smaps` `status`(TracerPid) `cmdline` `/proc/self` `/proc/%d`
`/proc/self/ns/mnt`(마운트 네임스페이스) + `dl_iterate_phdr`(native lib 열거)
**B. 시스템 도구 실행**(대응/은폐 행동): `sh` `-c` `/system/bin/sh`(셸 실행),
`/system/bin/truncate`(파일 절단 — 안티포렌식), `/system/bin/app_process`,
`rb`(fopen)
**C. 프로퍼티/SELinux**: `ro.build.version.sdk`(API 게이트), 
`persist.sys.vold_app_data_isolation_enabled`(저장소 격리 — 커스텀롬/에뮬 핑거),
`security.selinux`(getxattr)
**D. Java 리플렉션/ART 개입**(native blr 우회·NPE 위장과 정합): `invoke`
`(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;` `java/lang/Integer`
`<init>` `(I)V` `java/lang/Object` `java/lang/ArithmeticException` `divide by zero`
**E. 텔레메트리/직렬화**(Bugsnag/mbridge): `onWarmupCompleted` `IAuthTabCallback(Stub)`
`onExtraCallback(WithResult)` `onTransact` `onNavigationEvent`, 포맷
`%lld;%x;` `%d;%x;%x;%x;%x;` `%lld;%s;%s;%s;%s;%x;%x;` `%d;%x;%x;%x;%x;%s;`,
`lib/arm64-v8a` `arm64` `<unknown>` `(null)` `0123456789abcdef`
- 런타임 관측(§1~39)과의 교차검증: maps×11~12/smaps/fd전수/TracerPid/dl_iterate_phdr/
  security.selinux getxattr 전부 원문 대응 확인 — **우리가 위장해 온 채널의
  판정 입력 원문 목록이 이것으로 확정됨**.

### 40-4. 목표 D 함의 (판정 입력 차단 설계 재료)
- 위장 우선순위 재확인: A군(maps/smaps/status/cmdline/ns/mnt) + C군(2 prop +
  xattr)이 판정 입력. B군은 판정 후 행동(응답). D군은 처형 메커니즘(우회 불가
  판정 유지). camow 시리즈의 fake-file 매핑(cpuinfo/version/maps/...)이 정확히
  A군을 겨눈 것이었음 — 원문 확보로 필터 누락분(ns/mnt, /proc/%d 브루트포스)
  보강 가능.

## 41. 37차 세션 (2026-09-22 심야) — ★★ **RASP→FDS 처형 위임 체인 발견 + 파일/프롭 이중 채널 대량 차단, 생존 11s→15-30s**

### 41-1. RASP→FDS handleExitPlan 체인 (앱 자체 텔레메트리로 박제) ★
- 사망 직전 앱이 스스로 쓰는 로그 = `/data/data/.../files/logstore/logitems/*.json`:
  `{"log_name":"fds_detected_debug","caller":"RASP","exitPlan":"EXIT",
    "handledExitPlanPriority":"-1","value":"handleExitPlan"}` — **libea56(RASP)이
  Java측 FDS에 exit 플랜을 위임**, FDS가 handleExitPlan(EXIT)→System.exit(0).
  24~25차 체인(fault→sigchain→Bugsnag/UEH→Runtime.exit)의 상류가 이것.
- **런마다 사망 시각을 이 파일로 실측 가능** (사유 코드는 미포함 — DetectType 값은
  힙에만 존재 추정).
- Java 브리지 = `im.toss.selfprotect.DexguardRasp/DexguardWrapper/DetectType`
  (classes29.dex에 람다만 존재, 메인은 **DexGuard 런타임 복호화** — 정적 부재).
  람다의 DexGuard 문자열 암호 필드명 = **36차 어휘 E군과 동일 풀**
  (onWarmupCompleted/IAuthTabCallback/onNavigationEvent...) — libea56과 Java측이
  같은 DexGuard 계열 난독화. APK 덤프: /tmp/toss_dex (jadx out29).
- 즉사 아닌 처형의 자식 버전(런1): 가드 자식이 `DefaultSuitableOutputCheckerImplApi23`
  람다를 JNI 리플렉션(invoke/Integer 어휘 D군)으로 호출 → 가짜 진입점 → SIGILL
  (tombstone_06, 28차 "가짜 ArtMethod 무기화"의 자식 프로세스 변형).

### 41-2. 파일/프롭 이중 채널 — 대량 누수 발견·차단 ★
- **파티션 변형 프롭 32개 미위장**: `ro.product.{vendor,odm,system,system_ext,
  product,system_dlkm,vendor_dlkm,bootimage}.{brand=google,manufacturer=Google}` +
  `ro.{product,bootimage,odm,system,system_ext,system_dlkm,vendor,vendor_dlkm}.
  build.{tags=dev-keys,type=userdebug}` — props-apply.sh가 fingerprint/model/device는
  덮었으나 brand/manufacturer/tags/type 변형은 누락. → resetprop 32개 전부 수정.
- **build.prop 파일 직접 판독 우회**: getprop은 삼성으로 완벽 위장돼 있었으나
  `/vendor/build.prop` 파일 원문에 `userdebug/dev-keys/sdk_gphone64_arm64/emu64a/
  goldfish_arm64/ranchu/libgoldfish-ril` 잔존 → 가드가 파일을 읽어 프롭 위장 우회
  (힙 스냅샷에 `google/sdk_gphone64_arm64/emu64a:13/...:userdebug/dev-keys` 문자열
  실존 = 파일/Build 캐시 유래). → 위장본 3종(/system,/vendor,/odm/etc) **bind mount**.
- **/vendor/overlay 텔레텔**: `EmulatorTalkBackOverlay/` + `goldfish_overlay_*
  _google.apk` — 필터 뷰 bind mount + goldfish 오버레이 **pm disable-user**.
- **zygote Build 캐시**: Build.* 정적 필드는 zygote 기동 시 스냅샷 — 프롭 수정 후
  `stop;start`로 재구성 필요 (수정 프롭은 stop;start에도 유지 확인).
- **bind mount는 앱의 격리 mount ns에도 전파됨 실증** (/proc/PID/root/로 검증).
- ns/mnt 채널: 앱(4026532839)≠init(4026532315) 이미 격리 — **실기기 정합, 조치 불필요**.
  vold prop=true 설정(AOSP 11+ 빌드 기본 true, 미설정 자체가 AVD 텔 — 웹 확인).

### 41-3. 생존 측정 (원본 무수정, frida 없음, pm clear 후 런1만 수행)
| 런 | 상태 | 생존 | 비고 |
|---|---|---|---|
| 27차 기준 | pm clear | 0.3-0.5s 즉사 4/4 | SafeGetDeclaringClass ACCERR |
| 런1 (37차 수정 전반) | pm clear 직후 | **~13s** (자식 SIGILL T+4s → quiet exit) | 즉사 소멸 = vold prop/frida 정지 효과 |
| 런2~3 | 데이터 존재 | 11-14s | FDS EXIT @T+13.8s |
| 런6 | 프롭32+파일3+overlay 적용 | **22-32s** | 판정은 여전 T+13s, 이행 지연 |
| 런9b | +zygote 재시작, goldfish pm 차단 | 10-20s | 판정 T+15s — 잔여 채널 존재 |
- 5분+ 미달 — 다음 표적: telephony(에뮬 IMEI 0000…)/센서/pm 심층/packages.xml
  유래 문자열/Build 캐시 재검증(힙 재스냅샷).

### 41-4. 산출 (session37/)
- apply_37_fixes.sh(재부팅/stop;start 후 재적용 통합), fix_partition_props.sh,
  _system/_vendor/_odm_etc build.prop 위장본 3종, DecAtExact.java(toss5용,
  Ghidra 12/brew+JDK21로 실행 — 11.2.1은 프로젝트 버전 불일치, scriptPath 절대경로).
- string_refs.json(36차: 어휘 주소→참조 사이트), ns/mnt raw readlinkat(0x13ca9c)
  / security.selinux(0x72ea4…) 참조 지도 — IB 체인 심층 분해는 38차.
- 힙 스냅샷 스크립트(uid 기반 개조): heap_snap37{,b,c}.sh — 게스트 /data/local/tmp.

## 42. 38차 세션 (2026-09-22 심야) — **환경 텔 소진 판정 + telephony/센서/입력장치 채널 차단, DetectType 캡처 방법론 확정**

### 42-1. 37차 잔여 텔 3종의 재판정 — 전부 탐지 라이브러리 상수 (누수 아님) ★교정
- 전체 힙 스냅샷(대형 dalvik 영역 포함, T+2/6s 2시점, heap38/)에서 잔여 tells 재조사:
  ① 합성 UA(`...sdk_gphone64_arm64-userdebug...dev-keys ... Chrome/18...`) —
  **dalvik Java 힙 소재 + Chrome/18 = 2012 템플릿** = 자바측 탐지 라이브러리의
  **시그니처 상수**(에뮬 UA 패턴 표). 현재 환경 UA/Build/프롭/웹뷰 캐시 전부 클린
  실증(webview 프로필·공급자 데이터에 옛값 없음) → 채널 아님.
  ② `goldfish,vbox`/`ranchu,generic,vbox` — 같은 Java 힙의 하드웨어명 **체크리스트 상수**.
  ③ 전-0 문자열 — boot.art 내부 제로 구조물(무해).
- **함의: 식별 가능한 환경 문자열 텔은 소진.** 판정(T+13s EXIT)의 구동원은 자바측
  API 검사(telephony/센서 등) 또는 비-문자열 채널.
- /proc/bootconfig에 `androidboot.qemu=1`·`hardware=ranchu`·`avd_name`·호스트
  공개키 존재하지만 **앱 uid 접근 불가(Permission denied) — 채널 아님** 확인.

### 42-2. 신규 실채널 3종 발견·차단 ★
| 채널 | 노출값 | 조치 | 검증 |
|---|---|---|---|
| gsm.* 프롭 | `Android Virtual Operator`, iso=us, numeric=311740(미국 가상), baseband=1.0.0.0, ril=android reference-ril | resetprop → SKT/kr/45005/S916NKSU1AWC2/Samsung RIL(v1.0)/NR + **SIM측 정합화**(alpha/numeric 45005) | getprop 확인 |
| 센서 HAL 이름 | `Goldfish 3-axis ...` 전체(SensorManager API 노출) | impl.ranchu.so 패치(**Goldfish→"Samsung " 동일 8바이트 치환**) + bind mount + 프레임워크 재시작 | dumpsys = "Samsung 3-axis" ★ |
| /proc/bus/input/devices | `virtio_input_multi_touch_*` 7개 | sec_touchscreen/sec_epen/gpio-keys/vibrator 위장본 bind mount | 앱 uid 뷰 확인 |
- **rild가 stop;start 시 gsm.*를 되돌림** — 재적용 필수(apply_38_fixes.sh).
- 센서 HAL 치환 = GL 리터럴 패치 기법의 센서 적용(최초). HAL 재시작만으론
  부족하고 프레임워크(sensorservice) 재시작 필요(stop;start).

### 42-3. RUN11 역행 교훈 — 정체 불일치 = 변조 신호
- SIM 미정합 상태(오퍼레이터 45005 vs SIM 450050, SIM alpha 빈)에서 판정
  **T+7.3s로 가속**(최악 기록). 정합화 후 T+13.1s 복귀. **위장값 상호 모순 자체가
  탐지 입력** — 향후 위장은 (프롭↔SIM↔빌드↔HAL) 전체 정합 필수.
- 생존 현황: 판정 T+13s EXIT 고정(RUN12), 사망 10-30s 창. 5분 미달.

### 42-4. DetectType 캡처 방법론 확정 (39차 최우선)
- 파일 저장소(mmkv/prefs/db/logstore)에 사유 코드 **미저장** 확인 — 힙 T+6s에도
  fds 문자열 없음(판정 직전에만 존재). **정공 = frida attach로 RASP→FDS 브리지
  호출 가로채기**: exit_trap.js 변형으로 `im.toss.selfprotect.Dexguard*`의
  handleExitPlan/DetectType 인자를 로그(attach@~3.5s 생존 레시피 그대로) →
  사유 코드 직독 → 해당 채널만 정밀 차단.
- 준비물: frida-server 재기동(현재 정지) + 브리지 클래스 후킹 스크립트.
  DexGuard 런타임 복호화 클래스라도 런타임에는 로드됨 → Java.use로 후킹 가능
  (로드 타이밍 주의: ClassLoader enumerate 후 동적 attach).

### 42-5. 산출 (session38/)
- apply_38_fixes.sh + input_devices_fake + sensorhal_patched.so.
- heap38/ (게스트 203MB, 2시점), /tmp/h38(호스트 히트 파일), UA 템플릿 원문.

## 43. 39차 세션 (2026-09-22 심야) — ★★★ **DetectType 직독 관통: 판정 = [EMULATOR], 나머지 전부 음성**

### 43-1. 재설치 + 계측 경로
- 사용자 지시로 앱 완전 재설치: uninstall(데이터·DE·외부 전부 소멸 확인) → 원본 APK 2종
  install-multiple(5.276.0, 서명 무변조) — **uid 10175→10176 변경, LKM target_uids 갱신**
  (재설치 시마다 필수). APK 백업 = session39/../apk_backup/(md5 기록).
- fresh 런1(초기화 경로, 수 초 사망)이 데이터 2.9MB 생성 → 런2부터 exit 경로.
- attach 러너 확립(attach_bridge.py): am start → uid 기반 pid(0.2~0.5s 발견) → 2s 후
  frida attach → 스크립트. spawn 무력화 회피(25차 레시피).
- **주 클래스(DexguardRasp/DexguardWrapper/DetectType)는 fork 자식에서 로드** — 부모
  클래스로더에 부재 실측(live_probe.js, enumerateLoadedClasses에서 람다만 발견).
  → 부모측 FDS 로거 후킹으로 우회 관통.
- 함정(재발 금지 C9): **FileOutputStream.write([B) 훅에서 this.write(b) 재진입 =
  무한 재귀 StackOverflow → 앱 사망**(run3). 수정: $init 경로 감지 + logstore
  디렉터리 250ms 폴링 → 파일 지연 읽기(쓰인 JSON 원문 캡처 성공).

### 43-2. ★ 판정 상세 (logstore 39건 캡처, run4)
- **`fds_debug`/postRaspResult**: `detected:"emulator"`, 
  `attendingDetectorSet:"debugger, emulator, root, hook, cert, virtual_environment"`,
  `guardLevel:"LOW"`
- **`fds_detected`(event)**: `result:"[EMULATOR]"`, `from:"SplashActivity"` ×2회
- `fds_debug`: `value:"emulator detected"`, `params.result:"191"` — RASP 원시 코드
  (191=0b10111111, detector 비트마스크 의심 — 미해독)
- **root/hook/debugger/cert/virtual_environment 전부 음성** — frida attach + 부모측
  전메서드 후킹 상태에서도! 37~38차 채널 차단(gsm/센서/input/build.prop/프롭 32개)이
  유효했고 **잔여 판정 입력 = 'emulator' 검사 1개**로 수렴.
- **서버 FDS 게이트 실측**: api-gateway.toss.im → 403 "비정상적인 시도가 감지되어
  서비스 이용이 제한되었습니다"(device_id 314872ec… 기반, TUBA API 거부).
  14차 "탭 사망=서버 게이트"의 원문 확정. 경계 밖(재설치로 device_id는 갱신됨).
- 앱 자체 텔레메트리 보고: manufacturer=samsung, model=SM-S916N — 앱 관점 위장 유지.
- exit 트랩([EXIT] 0회)에도 런 종반 사망 — 최종 킬은 Java exit 우회(raw exit_group
  또는 자식 경유) 재확인.

### 43-3. 40차 표적 — 'emulator' 검사의 구체 입력
1. **frida child gating**: 부모에서 fork/posix_spawn 훅 → 자식 attach → 자식에서
   DexguardRasp/DetectType 직접 후킹 = detector별 상세 사유/체크 목록 직독.
2. result=191 코드 해독(비트마스크 가설: attendingDetectorSet 순서와 대조).
3. 후보 입력: IMEI 3582400501…(AVD TAC), 센서 데이터 패턴, battery 고정 100/비충전,
   /proc/interrupts(goldfish pipe), vm_readv 셀프스캔.
4. 서버 게이트: 재설치로 device_id 갱신됨 — 클린 device_id에서 로컬 판정 통과 시
   서버 응답 추적(로컬 완결 목표 D에는 영향 없음).

### 43-4. 산출 (session39/)
- rasp_bridge.js, attach_bridge.py(uid attach 러너), fds_hook.js, full_trap.js
  (FDS 로거+logstore 폴링 캡처), live_probe.js(생프로세스 열거), run1~4_*.log,
  apk_backup/(base+split, md5).

## 44. 40차 세션 (2026-09-22 심야) — **자식 attach 관통 + /proc 4채널 차단, 판정 잔존**

### 44-1. 자식(가드 fork) frida attach 성공 + 구조 판명 (C10)
- child_watch.py: 부모 exit 트랩(full_trap.js) + 자식 pid 200ms 폴링 → 즉시 attach.
  **zygote_reactjs 자식 attach 성공** — 열거해도 람다뿐, DexguardRasp/DetectType
  부재 = **메인 클래스는 JNI DefineClass(libea56이 직접 정의)로 로드** —
  enumerateLoadedClasses/Java.use 불가(39차 'fork 자식 로드' 가설 정정:
  자식이 아니라 **클래스로더 밖 정의**가 정답). frida 접근법 = JNIEnv 함수
  테이블의 DefineClass를 Interceptor로 잡는 것(41차).
- **신규 UI 실측**: exit 차단 상태에서 앱이 죽지 않고 **"해킹 위험성이 탐지됨"
  보안 다이얼로그**(dialog_open 이벤트, 감독기관 보안규정 문구) 표시 —
  6차 '제한모드 다이얼로그'의 원문 경로. exitPlan EXIT의 UI 표현.

### 44-2. /proc 4채널 발견·차단 (전부 앱 uid 가독 실측)
| 파일 | 텔 | 위장 |
|---|---|---|
| /proc/interrupts | goldfish_battery/sync/pipe + virtio0-13 (42건) | qcom 플랫폼명 치환 |
| /proc/asound/cards | "VirtIO SoundCard"/virtio-snd | kalama-audio-snd-card |
| /proc/bus/pci/devices | virtio-pci 18개(벤더 1af4) | 빈 파일(실기기 SoC 무노출 정합) |
| /proc/misc | goldfish_sync/pipe/address_space + vsock/vhost-vsock | 해당 라인 제거 |
- bind mount(앱 uid 뷰 검증 완료), apply_40_fixes.sh로 재적용.

### 44-3. 결과 — 판정 잔존
- 클린 런(frida 정지): 판정 T+14.1s EXIT(fds_detected_debug), 생존 ~20s.
  /proc 4채널 차단으로도 미반전 — 'emulator' 검사의 입력은 더 깊은 곳.
- **잔여 후보(41차)**: ① IMEI 3582400501…(AVD TAC — iphonesubinfo HAL 단)
  ② 배터리 고정값(100/FULL/비충전 — dumpsys battery set으로 정합화 시험)
  ③ 센서 값 패턴(goldfish 센서 출력 특성) ④ vm_readv 셀프스캔 내용 검사
  ⑤ DefineClass 후킹으로 DexguardRasp 내부 체크 목록 직독(정공)

### 44-4. 산출 (session40/)
- child_watch.py(부모+자식 attach 러너), child_probe.js, apply_40_fixes.sh,
  proc 위장본 4종, run1_child.log(자식 열거+보안 다이얼로그 캡처).

## 45. 41차 세션 (2026-09-22 심야) — **device-tree(linux,ranchu) 대형 채널 차단 + 후보 소거, 판정 잔존**

### 45-1. 클래스 내부 접근 시도 — 무발동 (C11)
- DefineClass(JNIEnv 테이블 idx5, libart 소재 확인)+InMemoryDexClassLoader+DexFile
  초기화 후킹: **전부 무발동**. code_cache/ 잔여 없음, 메모리 스냅샷(T+6/9s)에
  selfprotect/dex 매직 부재 → 복호화 클래스는 attach(2.2s) 이전 로드 또는
  다른 기작. 42차: attach 0.8s 조기화 시험.
- C11: DefineClass/IMCL 후킹으로 DexGuard 클래스 캡처 불가(41차 실측).

### 45-2. 신규 채널 발견·차단
| 채널 | 노출 | 조치 |
|---|---|---|
| **/proc/device-tree** | compatible=**linux,ranchu** + goldfish-events/audio/battery 노드 + fw-cfg@9020000(QEMU) + pl011/pl031/pl061 | 실트리 복사 → compatible="samsung,dm2q qcom,sm8550 qcom,kalama", goldfish*/fw-cfg*/pl0*/flash/platform@/virtio* 제거 → **sysfs 실경로(/sys/firmware/devicetree/base) bind mount 성공**, 앱 uid 뷰 검증 ★ |
| vendor.qemu.dev.bootcomplete=1 | 프롭 **키 이름**에 qemu | resetprop -d 삭제 |
| /proc/net/route | 10.0.2.0(QEMU NAT 서브넷) | **bind mount 불능**(procfs net 매직링크 — 커널 상태 직접 생성). LKM redirect 필요. 단 가드 어휘(56종)에 route 부재 — 우선도 낮음 |
| 배터리 | 100/FULL/비충전 고정 | dumpsys set status 3 + level 87 |
- dl_iterate_phdr 채널 무결 확인: 앱 로드 .so 317종 전수 스윕 → 에뮬텔 이름 0건.

### 45-3. 격리 테스트 결과 — 판정 잔존 (T+14s EXIT)
- 배터리 정합: 미반전. device-tree 차단: 미반전. → 'emulator' 검사의 입력은
  **IMEI(358240050111…, AVD TAC — TelephonyManager 바인더)** 또는 센서 값
  패턴 또는 **우리 인프라 자체 탐지(LKM/위장 파일의 부수 효과)** 가능성.

### 45-4. 42차 권고
1. IMEI 정공: 에뮬 IMEI 패턴(358240 TAC) — iphonesubinfo HAL 단 spoof 또는
   AVD 설정 탐색(emu 콘솔).
2. 센서 값 패턴: 가속도/자이로 출력 특성(고정값/완전한 주기성) — HAL에서
   플러터 주입 패치 검토.
3. 인프라 자체 탐지 가설: **LKM/위장 완전 정지 상태 런**(판정 시각 비교)으로
   우리 시스템이 검사를 트리거하는지 격리 — 순수 환경 기준선 확보.
4. attach 0.8s 조기화로 DefineClass/IMCL 재시도.

## 46. 42차 세션 (2026-09-23 심야) — ★ **기준선 격리: 우리 인프라 무죄 + 콜백 비트마스크 발견, mask-diff 방법론 확립**

### 46-1. 기준선 격리 — LKM 무죄 판정
- target_uids에서 10176 제외(LKM 위장 전부 무력화, bind mount는 유지) 런:
  **사망 T+12s, clean exit(0)** — 전 위장 상태(T+14s EXIT, 사망 15-20s)와 동일
  범위. **우리 인프라(LKM maps/cpuinfo/uname/dirent)는 판정 타이밍에 영향 없음**
  = 트리거가 아님. 트리거는 LKM/bind이 닿지 않는 계층.

### 46-2. TelephonyManager Java API 소거 (0호출)
- exit 트랩 + TelephonyManager 전 표면 스푸프(IMEI/전화번호/SIM 식별자 전부
  한국 실기기값) + logstore 캡처 런: **[TELEO] 0호출** — 가드는 Java 전화 API를
  안 읽음(네이티브 binder/RIL 경유 또는 미사용). Java 스푸프 무의미.
- 동일 런에서 **콜백별 debugInfo 비트마스크 신규 획득**:
  - `raspRootCallback detected`: 0x10E(bits 1,2,3,8) — 루트 검출도 발화(su 존재)
  - **`raspEmulatorCallback detected`: 0xBE(bits 1,2,3,4,5,7) — 6개 서브검출 생존**
  - `raspHookCallback detected` ×2(우리 frida 후킹 감지, rootDetectionFlag:true)
    — 그런데 **guardLevel=LOW 유지, EXIT 구동은 [EMULATOR]만** — 루트/후킹은
    허용 레벨, 에뮬레이터만 처형.
- postRaspResult: detected:"emulator", result:"191", [EMULATOR] 재확인.

### 46-3. ★ mask-diff 방법론 (43차 실험 설계)
- 0xBE의 각 비트 = 에뮬레이터 검사의 서브체크. **환경 입력을 하나씩 바꾸며
  마스크 diff** → 비트↔입력 매핑: 예) 센서 값 패치 → 0xBE에서 비트 n 소멸 =
  비트 n이 센서. 남은 6비트 = 미차단 입력 6개(IMEI/센서 값/기타).
- 후보 우선순위: 센서 값(고정 출력 — HAL 플러터 주입), IMEI(네이티브 RIL),
  배터리 세부, 그래픽/타이밍.
- 루트 콜백(0x10E)도 마찬가지로 mask-diff 가능(su 은닉 강화 시 비트 변화 관찰).

### 46-4. 산출 (session42/)
- teleo_spoof.js(전화 스푸프+콜백 디버그 캡처+logstore), attach_teleo.py,
  run1_teleo.log(콜백 비트마스크 원문).

## 47. 43차 세션 (2026-09-23 심야) — **서버 게이트 성격 판명(재설치 불변) + mask 캡처 변동성, 환경 피로**

### 47-1. 소거·검증
- QEMU 장치 노드(/dev/qemu_pipe→goldfish_pipe, goldfish_sync,
  goldfish_address_space): 루트에만 보이고 **앱 uid 전부 ENOENT** — LKM
  dirent/open 차단 정상 동작 확인(비트 후보 소거).
- **attach 0.8s 조기화 = 가드 흐름 변화**: RASP 콜백 전부 소멸(후킹 콜백만
  발화) — 26차 attach 타이밍 민감성 재확인. mask 관측은 2.0s 고정 필수.
- mask 캡처 변동성: 동일 조건(2.0s)에서도 콜백 로그 포착 ~1/5 — RASP 스캔
  시각과 logstore 폴링 시작의 레이스. 44차부터 **다수 샘플 프로토콜**(상태당
  ≥3런, 콜백 포착 런만 채택) 필요.

### 47-2. ★ 서버 게이트 성격 판명 — device_id는 재설치 불변
- dt 노출 상태 런(교정 시도 중)에서 emulator 콜백 미포착에도 앱이 **로그인
  플로우까지 진행**(verify/guest/session/init, findLoginToken, version/check,
  i18n API 호출) → **전 API 403 "비정상적인 시도가 감지되어… 다른 휴대폰으로"**.
- device_id=314872ec…는 **재설치(23:26) 전후 동일** — 서버 블랙리스트가
  재설치 불변 식별자(android_id/하드웨어 파생)로 묶여 있음. 로컬 목표 D에는
  영향 없으나, 정상 서비스 응답 검증에는 **식별자 리셋**(android_id 등)이
  선행 필요.
- 이 런은 [EMULATOR] 판정 없이 네트워크 단계까지 진행 — RASP 스캔과 앱
  플로우의 레이스가 양향(콜백 포착/미포착)으로 나타남.

### 47-3. 환경 피로 — 44차는 재부팅 선행
- 연속 ~2시간 실험 후 frida attach 거부(ProcessNotResponding)/스크립트 로드
  타임아웃 발생. 가드 적응 또는 리소스 누적. **44차 첫 동작 = 게스트 재부팅
  → boot_recover → apply_37→38→40→41 체인 → 프롭/gsm 재적용 → 프레시
  mask 기준선(다수 샘플)**.

### 47-4. 산출 (session43 = session42/run2_calib.log, /tmp/mr*.log 보관)

## 48. 44차 세션 (2026-09-23 심야) — ★★ **dword 판정 캐시 발견: 판정 재사용 구조 + 재스캔 강제화**

### 48-1. 재부팅 후 전면 복구 (재현 레시피 확정)
- adb emu kill → emulator -avd camo33(-no-snapshot) → boot_recover(uid 자동
  10175 → **10176 수동 갱신 필수**) → 체인 apply_37→38→40→41.
- **센서 HAL 순서 함정(재확립)**: bind mount → **HAL 프로세스 kill**(init 재기동,
  패치 lib 로드) → **stop;start**(sensorservice 재독취) → gsm 재적용(rild 리셋분).
  HAL kill만 or stop;start만으로는 Goldfish 잔류.

### 48-2. ★★ dword 판정 캐시 — '왜 판정이 안 바뀌었는가'의 정답
- FDS 로그 인자 리플렉션 덤프(AppEventPayloadV1 전개, params LinkedHashMap
  엔트리 전개 포함 — 직렬화 라이브러리 무관 실시간 캡처 확립)로 포착:
  `dword_debug: action=reuse | clockTimeLeftBucket/uptimeTimeLeftBucket=5m+ |
  processType=main` + `getDwordResult resultType=message_present` + `prepareSecret`.
- **RASP 판정 결과가 앱 데이터에 캐시**되어 재스캔 없이 재사용:
  `shared_prefs/dwordStore.xml` = {clockValidUntil(시각), uptimeValidUntil
  (elapsedRealtime ms), dinitialize(UUID)} — 유효기간(≈13~16분/시각제) 동안
  스캔 생략. **캐이스 종합: 37~41차의 채널 차단 효과가 판정에 반영 안 된
  이유 = 캐시된 옛 판정 재사용.**
- **캐시 삭제 → 재스캔 강제 실증**: dwordStore.xml 삭제 후 런 = 새 dinitialize
  UUID로 재생성 + 재스캔. 단 재스캔 결과도 여전 EXIT(T+12.7s) — 캐시가 옛
  판정을 붙잡고 있었을 뿐, 현 환경에서도 검출은 남아 있음(채널 소거가
  아직 불완전하거나 미식별 입력 존재).
- 스캔은 프로세스 시작 직후(attach 2.3s 이전) → 콜백 포착 레이스의 원인도
  dword 캐시 상태였음 재판명(~1/5 포착 = 우연히 만료 시점 런).
- **런타임 재스캔 유도법**: exit 트랩으로 장시간 생존 → uptimeValidUntil
  만료 → 후킹 상태에서 재스캔(44차 말 롱런으로 검증 중).

### 48-3. mask-diff 프로토콜 (45차 확정판)
1. 계측(argdump_probe.js, attach 2.0s) + exit 트랩.
2. dwordStore 삭제 → 시작 직후 재스캔(마스크는 attach 전이라 놓침) OR
   롱런으로 런타임 만료 재스캔 포착.
3. 포착된 debugInfo(마스크)를 환경 입력 변경 전후로 비교.

### 48-4. 산출 (session44/)
- argdump_probe.js(인자 리플렉션+Map 전개 — FDS 전 이벤트 실시간 덤프),
  attach_argdump.py, mask_probe.js(JSONObject 무발동 — FDS는 org.json 미사용),
  run1~5 로그, dwordStore 구조 기록.

## 49. 45차 세션 (2026-09-23 심야) — **virtio 저장소 채널 차단 + dword 재판명: 스캔은 라이브**

### 49-1. virtio 저장소 채널 발견·차단 (전부 앱 가독 실측)
| 파일 | 텔 | 조치 |
|---|---|---|
| /sys/block/ | **vda~vde(virtio 디스크)** 디렉터리 노출 | dm/loop/ram/zram만 남긴 필터 뷰 bind |
| /proc/partitions | vda1/vda2/vdd1/vde1 | vd[a-e][0-9]* 라인 제거본 bind |
| /proc/diskstats | vd* 라인 | 동일 |
- 함정: adb shell 출력의 CR로 `$` 앵커 실패 + 파티션 접미사(vda1) — 패턴은
  `vd[abcde][0-9]*` 무앵커. /sys/block 필터는 심볼릭 복사(cp -a)로 구성.
- 차단 후 재스캔 런: **여전 EXIT(T+11.9s)** — virtio도 단독 트리거 아님.

### 49-2. dword 재판명 (44차 가설 정정 C12)
- combo 계측(ARG 덤프 4000자 + logstore 200ms 폴링)로 1런에서 **94 dword_debug
  / 22 fds_detected [EMULATOR] / 11 fds_debug "emulator detected" / 11
  postRaspResult** 캡처 — **스캔은 매 런 반복 실행(라이브 유도)**.
- dword 값 체인: prepareSecret → postRaspResult(emulator) →
  **acquireNewSecretSuccess**(신규 dword 저장) → getDwordResult
  (resultType=message_present) → setUnauthorized → 다이얼로그+exit.
- 즉 **dwordStore는 '판정 캐시'가 아니라 '시크릿/유효기간 저장'** — 판정은
  매번 새로 나옴(C12 정정: 44차 "채널 차단이 안 보인 이유=캐시" 가설은
  부분만 맞음 — 채널 차단 효과가 안 보인 건 실제로 미식별 입력이 남아서).
- raspEmulatorCallback/debugInfo(비트마스크) 이벤트는 이번 런 무발생 —
  발현 조건 미상(42차 run1에서만 관측). 마스크 직독은 여전 과제.

### 49-3. 46차 권고
1. **[EMULATOR]의 원천 식별에 집중**: fds_debug "emulator detected"의
   result:"191"과 raspEmulatorCallback debugInfo의 상관 재시도(계측 런
   반복 + 캡충 조건 탐색). 또는
2. **libea56 RE로 직행**: emulator 검사 코드의 비교 상수(체크 리스트)를
   정적으로 찾는 것 — 36차 어휘 중 'emulator' 분류 상수가 실측 입력과
   어떻게 만나는지(IA/IB 체인이 아닌 일반 함수 대상).
3. 계측 combo_probe.js는 안정(1런 328 JSON 캡처) — 반복 샘플 기반 실험 기반
   확보됨.

## 50. 46차 세션 (2026-09-23 심야) — ★★★ **라이브 .data 덤프 관통: 런타임 복호화 어휘 174개 전수 확보**

### 50-1. 방법 — 라이브 모듈 메모리 직독 (C13~C15 교훈 포함)
- 라이브 앱의 libea56 rw 매핑(.data 0x174000~ + bss)을 dd로 덤프 → 정적 .data와
  문자열 diff → **StringEncryption이 런타임에 복호화한 어휘 174개** 획득
  (session46/live_vocab_174.json + ea56_live_rw.bin).
- 36차 unidbg 254진입이 못 돌린 복호 루틴(런타임 키 필요분)의 산출물을
  실프로세스에서 직접 수확 — 어휘 전수 사실상 완결(56+174).
- **덤프 공학 함정(재발 금지)**: C13 toybox `printf %d`/awk 16진 40비트
  오버플로 → 페이지 산술은 "hex 끝 3자리 문자열 절삭"으로. C14 모듈 범위
  착오(0x2b→실제 0x1a0페이지). C15 **가드가 /data/local/tmp 신규 파일을
  런타임에도 삭제**(B군 truncate 안티포렌식 실측) → 덤프는 /sdcard 직접 기록.
  EIO = .data와 bss 사이 매핑 공백(분할 dd).

### 50-2. 신규 어휘 하이라이트 (emulator 체크리스트 원문)
- **nox 계열 전수**: /system/bin/{nox-vbox-sf,noxd,noxspeedup,nox-prop},
  /system/lib/{libnoxd,libnoxspeedup}.so
- /sys/module/intel_powerclamp, /system/bin/exportApk, /sys/devices/virtual,
  /sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_cur_freq(앱 uid 비가독),
  /proc/self/{mem,task,fd}, /sys/fs/selinux/{enforce,load}
- 프롭: **ro.dalvik.vm.native.bridge**(=0 세팅 → 삭제 조치), ro.build.version.sdk,
  persist.sys.vold_app_data_isolation_enabled
- Java 리플렉션 일체(getDeclaredFields/getName/getPackageCodePath/...) +
  im.toss.devtool/malware 클래스명(자바측 후킹 탐지용 추정)

### 50-3. 신규 채널 2종 발견·차단 + 잔여 소거
| 채널 | 값 | 조치 | 검증 |
|---|---|---|---|
| ro.dalvik.vm.native.bridge | "0"(실기기=빈) | resetprop -d | 빈 확인 |
| /sys/devices/virtual | **mac80211_hwsim**(SW 와이파이 시뮬) + android_usb | 필터 뷰 bind | 앱 뷰 0 |
- 전 체크리스트 교차검증: selinux/enforce=1(LKM 리다이렉트 ✓), nox/\
  exportApk/intel_powerclamp 부재 ✓ — 전부 클린.
- 차단 후에도 EXIT(T+12.8s) — 트리거는 체크리스트 밖 또는 깊은 계층
  (vm_readv 셀프스캔 내용/자바 리플렉션 검사/서버 응답).

### 50-4. 47차 권고
1. **bss 꼬리 덤프**(익명 매핑 별도 dd — EIO 회피) → 잔여 복호화 어휘.
2. 어휘-실측 최종 교차 후에도 판정 잔존 시: vm_readv 632 triplet 해독
   (셀프스캔 비교 대상) 또는 fds "result:191" 코드 경로 RE.
3. 마스크 직독(raspEmulatorCallback debugInfo) 재시도 — 라이브 .data의
   복호화 상태를 덤프한 뒤에는 비트-체크 매핑이 정적 가능해짐.

## 51. 47차 세션 (2026-09-23 심야) — ★ **ftrace 실측 프로브 전수 대조 + cpufreq 대형 채널 수정, 파일 계층 소진 선언**

### 51-1. 환경 사고와 복구
- adb 서버/게스트 adbd 뱅걸림(마라톤 누적) → adb kill-server+재기동 불능 →
  콘솔/하드 킬 → 재부팅 → boot_recover + 체인 37~46 재적용(센서 HAL
  kill+stop;start 순서 포함) — 전 채널 위장 복구 완료.
- C16: adb shell의 ps 출력 포맷이 컨텍스트마다 uid를 숫자/이름(u0_a176)으로
  다르게 표시 — pid 탐지는 `-o UID,PID,NAME` 고정 + 이름 매칭 병행.
- 파이썬 subprocess의 adb 간헐 공백 반환 — 중요 경로는 zsh 직접 실행.

### 51-2. bss 덤프 — 추가 어휘 없음 (어휘 완결 확정)
- 라이브 .bss(24p, [anon:.bss] 식별) 덤프 — 신규 문자열 3개(노이즈)뿐.
  **전체 라이브 어휘 = 174개로 완결**(live_vocab_full.json). 56(정적 실행)+
  174(라이브) = 프로젝트 어휘 총집합.

### 51-3. ★ ftrace 실측 프로브 전수 대조 (channel_trace 18s)
- 가드의 실제 파일 프로브 56경로 + 프롭 10종 캡처(getname/ustring + prop
  uprobe) — **어휘 목록과 정합**(nox/goldfish/su-family/cpuinfo/misc/
  cpufreq/qemu_trace/.cpuinfo...).
- **cpufreq 대형 발견**: `cpu0/cpufreq/cpuinfo_max_freq = 2`(kHz!) — 가드가
  실제 읽는 값이 쓰레기. 8코어 전부 SM8550 클러스터 정합값으로 위장
  (Prime 3360000/Big 2803200/Little 2050000, bind mount, 앱 uid 검증 ✓).
- 프롭 실측값 전부 클론(ro.secure=1, abi2 빈, serialno RZ8T30A1B2C...).
- su/magisk 경로 앱 uid 전부 ENOENT ✓.
- **파일/프롭 계층 소진 선언**: 실측 프로브 전수가 중립화 상태인데도
  [EMULATOR] EXIT(T+13.3s) — 판정 입력은 파일/프롭 계층 밖.

### 51-4. 잔여 가설 공간 (48차)
1. **비-파일 syscall**: 클럭/타이밍 벤치마크(clock_gettime/sched 지연 —
  qemu 특유의 타이밍), sched_getscheduler(죽은 pid 탐색 실측), ptrace.
2. **/proc/self/maps 위장 내용의 정합성** — camow fake maps의 미세 불일치
   (가드 자기 매핑 누락 등) — 42차 기준선(LKM off 동일 타이밍)과 상충되나
   재검증 여지.
3. **셀프스캔(vm_readv 632)의 비교 대상** — 코드 무결성이 아니라
   환경의존 값일 가능성.
4. fds result:191 코드 경로 RE(정적).

### 51-5. 산출 (session47/)
- dump47 게스트 원샷 스크립트(.data+.bss 동시 덤프), ea47/{data,bss}.bin,
  ct47.log(ftrace 프로브 전수), /tmp/probed.txt(56경로).

## 52. 48차 세션 (2026-09-23 심야) — ★ **스캔 창 syscall 전사(101만 라인) — 자기스캔 정체 = ELF 헤더 검증, 타이밍 벤치마크 부재**

### 52-1. 전사 방법
- ftrace 인스턴스 + `raw_syscalls/sys_enter` 이벤트 **직접 enable**(set_event
  무시됨 — C17) + set_event_pid에 스레드 tid 주기 갱신, 14s 스캔 창,
  **1,015,539 엔트리** 캡처.

### 52-2. 히스토그램 상위 + 해석 (arm64)
| syscall | 횟수 | 해석 |
|---|---|---|
| read(63) | 291,131 | fd3/4/5 저번호 집중 — maps/덱스/애셋 파싱 폭주 |
| mmap(222) | 122,593 | DexGuard/JIT/가드 메모리 |
| close(57)/openat(56) | 112k/78k | fd 순환 |
| mprotect(226)/munmap(215) | 62k/58k | ” |
| **prctl(167)** | **50,741** | PR_SET_VMA 이름부여 — maps 파서 교란/메모리 태깅 |
| futex(98) | 32k | 스레드 |
| **pread64(67)** | **7,399** | **자기스캔 본체** |
| **sched_setaffinity(124)** | **10,620** | CPU 핀닝 |
| readlinkat(78) | 19,046 | fd/N·ns/mnt resolve |

### 52-3. ★ 자기스캔의 정체 (24차 'vm_readv 632' 갱신)
- process_vm_readv = **단 6회** — 시대의 '632 vm_readv'는 이제 read/pread64 기반.
- **pread64(fd=3..0x10…, buf, 0x40, offset=0) 연쇄 = 열린 fd 전부의 ELF64
  헤더(64B) 검증** — 가드가 자기 매핑/열린 파일의 ELF 신원을 하나씨 확인.
  fd40/41 임의 오프셋 content 읽기(oat/so 무결성 추정).
- 잔여 레지스터에서 파일명 조각 누출("prepareSec…", "…sessions…" — 인자 아님).

### 52-4. 잔여 가설 공간 갱신
1. ~~타이밍 벤치마크~~ — **부정**(clock_gettime 1,394/gettimeofday 0/나노슬립 30).
2. **ELF 헤더 검증이 읽는 파일 중 하나가 우리 위장 파일**일 가능성:
   bind mount 소스(/data/local/tmp/camo/*)는 readlink에 안 보이나, **열린
   fd의 ELF 신원** 자체(빈 파일/위장 build.prop은 ELF 아님 — 정상 파일만
   검증 대상일 듯) — 49차: getname+fd 상관 추적으로 검증 대상 파일 목록화.
3. maps 위장 정합성(계류) / 191 코드 RE.

### 52-5. 49차 권고
1. **getname kprobe + openat fd 캡처 + read 카운트 상관** — 한 트레이스에
   문자열+fd를 담아 29만 read의 파일 귀속 완성 → 가드가 실제 '검증'하는
   파일 목록 → 미위장 항목 정밀 특정.
2. sched_setaffinity 1만회의 의미(코어별 시간측정 벤치마크일 가능성 —
   affinity 전환+시간측정 조합은 syscall 타이밍과 무관한 rdtsc류 불가,
   커널 카운터 기반이면 ftrace에 안 잡힘 — 병행 검토).
3. 9/25 claude 리셋 후 통합 검토.

## 53. 49~50차 세션 (2026-09-23 새벽~아침) — ★★ **fork 자식 미개척지 개척: 커널로그 정찰 판명 + dmesg_restrict 수정**

### 53-1. fd 귀속의 교훈 (C19)
- fd→파일 스냅샷 상관 시도: kretprobe(openat) 등록 실패 + **fd churn(78k
  open/close)으로 히스토그램 fd 귀속 불가** — 14s 창의 fd 번호는 수천 번 재사용.
  (fd4=trace_marker로 보였던 것도 재사용 오판일 수 있음.)
- **트레이싱 해체 대조 실험**: fault_dump_en/sigact_log/sigframe_log=0, 인스턴스
  제거, tracing_on=0 상태 런 → 판정 불변 → **우리 ftrace 계측은 트리거 아님
  (부정 확정)**. 단 kprobe_events 전역 clear는 **LKM 프로브를 잡아당겨 게스트
  패닉**(C20 — 절대 금지, append만 안전).
- camow 가짜 maps vs 실제: 라이브러리 400종 완전 일치(동적 생성) — maps
  정합성 가설 약화.

### 53-2. ★★ fork 자식(zygote_reactjs) syscall 전사 — 미개척지
- **자식 560,002 엔트리(9s)** — 기존 추적은 전부 메인 프로세스만(자식 공백).
- 자식 특징: **getname(파일 열기) 0회** — 상속 fd만 사용(부처 탐지 우회 설계).
- read 185k(fd85=95k, fd4=33k, fd3=33k), **write 81k 중 fd1(stdout)=78k** —
  부모로의 파이프 보고 채널.
- **syslog(2) = 8,929회 — 커널로그 정찰** ★
- futex 35k, sched_setaffinity 6.8k, mmap/mprotect 통상.

### 53-3. ★ 커널로그 채널 판명·수정
- **dmesg_restrict=0**(실기기=1) — 자식이 syslog(2)로 klog 읽기 성공.
- 커널로그 내용: `init.ranchu.rc`, goldfish/virtio 부트 메시지 + **우리 센서 HAL
  bind mount의 AVC 감사흔적**(ranchu.so + `tcontext=shell_data_file` —
  /data/local/tmp 소스 bind의 지문!) — 가드에게 '위장+에뮬' 동시 노출.
- **수정: dmesg_restrict=1 + dmesg -C** — 자식 syslog 차단(CAP_SYSLOG 없음).
- **그래도 판정 EXIT(T+12.7s)** — klog는 정찰이거나 다중 입력 중 하나.

### 53-4. 51차 권고
1. **자식 fd3/4/85의 fork 시점 정체** 캡처(부모 fork 직전 fd 테이블 스냅샷)
   → 자식이 실제 읽는 환경 소스 특정.
2. 자식 stdout(fd1) 프로토콜 해독 — 부모-자식 보고 포맷 = 판정 원문.
3. AVC 흔적 근절: bind 위장 파일 chcon(vendor_file 등 정합 컨텍스트).
4. dmesg_restrict=1 재적용 체인 편입(apply_50) + klog 감사 지속 확인.
5. 9/25 claude 리셋 후 통합 검토.

### 53-5. 산출 (session50/)
- child50c.sh(자식 syscall 전사), fdsnap49.sh(fd 링크 스냅샷), cor49.log
  (getname 158k 경로), /tmp/fdmap 시도 기록.

## 54. 51차 세션 (2026-09-23 아침) — ★★ **fork fd 정체 확정 + 'Permissive 성공' 마스터 텔 판명, Enforcing 실험**

### 54-1. fork 시점 fd 테이블 확정
| fd | 정체 | 자식 사용 |
|---|---|---|
| 3 | socket | read 33k (통신) |
| **4** | **/sys/kernel/tracing/trace_marker** | read 33k — tracing fs 프로브 |
| 5 | core-oj.jar | — |
| **85** | **base.apk (자기 APK)** | read 95k — **APK 자기검증** |
- tracing fs chmod 700 (tracing+debug 양경로) — 앱 open 이제 차단.

### 54-2. ★ 'Permissive 성공' 마스터 텔 판명
- 앱 자기 로그스트림에 `Zygote: seccomp disabled by setenforce 0`(앱 pid로
  기록!) + 위장 파일 AVC 거부(app= 파라미터) — 다만 앱은 READ_LOGS 없이
  logcat 불가 → **진짜 텔은 로그가 아니라 '실기기(Enforcing)면 실패해야 할
  open이 성공하는 것 자체'**(fd4=trace_marker 존재 = Permissive 증명).
- 부수: userdebug_or_eng_prop 컨텍스트 프롭 read 거부 = user 빌드와 차이.

### 54-3. Enforcing 실험 — 위장 서빙 파괴로 불완전
- 전환 즉시: 가짜 maps/status 읽기 EACCES → RenderThread SIGABRT, FDS 판정
  경로 소멸(사망 T+10s, 다른 사인).
- 원인: **LKM/라이터가 redirect 파일을 재생성할 때마다 device 컨텍스트로
  리셋** — 라이터에 chcon 패치 삽입(배포 완료)했으나 생성→chcon 사이 레이스.
  magiskpolicy 앱플릿 부재(정책 라이브 주입 불가).
- Permissive 복귀 → 기저 재확인(판정 T+13s EXIT 복귀 — 스택 안정).
- **52차 정공: LKM이 파일 생성 시 컨텍스트를 지정**하면 Enforcing 상용화
  가능 → fd4류 '성공 텔' 전면 차단.

### 54-4. 부수 발견
- `avc granted execute libviva-arm64-v8a-527600.so`(cache/) — 가드 자기
  언팩 라이브러리(실행 실측).
- 자식 APK 자기검증(fd85 95k read) — APK 무결성은 우리가 건드리지 않음 ✓.

### 54-5. 산출 (session51/)
- forkfd51.sh(fork 순간 fd 스냅샷), writer.sh(chcon 패치본 — 게스트
  /data/local/tmp/.system_profile 반영), 최신 재적용 순서 문서화.

## 55. 52차 세션 (2026-09-23 아침) — ★ **레이스 프리 라이터 완성 + Enforcing 도달선: GL 로드(토스 uid만)까지**

### 55-1. 레이스 프리 chcon 라이터 (완성·배포)
- 해법: `.tmp 생성 → chcon(.tmp) → mv` (rename은 컨텍스트 보존) → 최종
  파일이 처음부터 `system_file`으로 등장 — 무레이스. 7개 블록 교체,
  컨텍스트 4회 연속 안정 확인. **LKM 재빌드 불필요로 판명**(51차 가설 정정:
  파일 생성 주체는 유저랜드 라이터).
- 배포 함정: 실행 중 스크립트 cp = ETXTBSY 조용 실패 → pkill 후 cp.
  adb shell setsid로도 데몬 불안정 → 세션 백그라운드 태스크 구동이 확실.

### 55-2. Enforcing 도달선 (3단계 장애 → 2개 해결)
1. ~~가짜 파일 device 컨텍스트~~ → 레이스 프리 라이터로 해결 ✓
2. ~~userdebug_or_eng_prop 프롭 영역 read 거부~~ → chcon default_prop
   (부트 시 생성 파일 — 안정) ✓ — 가드가 프롭 영역을 **파일로 직접 읽음** 판명.
3. **잔여: 토스 uid만 GL 구현체 로드 실패**(`couldn't find an OpenGL ES
   implementation` / `dlopen libGLESv1_CM_adreno` 실패) — 시스템 앱은 동시
   정상 → **LKM target_uid 경로와의 상호작용** 의심(linker namespace/dirent
   은닉과 enforcing 조합). AVC 무표시(audit 억제 추정).
- 연속 정책 스트레스로 프레임워크 일부 손상(Can't find service: activity)
  → 재부팅으로 정리. 부트 시 Enforcing으로 올라오는 경우 확인(원래 Permissive
  부트와 다름 — 부트 정책 비결정적).

### 55-3. 재부팅 후 전량 복구 레시피 (재현 완료)
- boot_recover → target_uids=10176 수동 → 체인 37→38→40→41→45→46→47→50 →
  파티션 프롭 32개 → 센서 HAL kill + stop;start → gsm 재적용 → tracing
  chmod 700(양경로) → 컨텍스트(.vl64=vendor_file, camo=system_file) →
  dmesg_restrict=1 → 검증(dt/proc/virtio/센서/프롭 전부 클린) → 기저 런
  사망 T+10~20s(표준).

### 55-4. 53차 권고
1. **토스 uid GL 로드 실패 해부**: LKM target_uids에서 토스 제외 상태로
   Enforcing GL 테스트(LKM 상호작용 격리) → LKM의 GL 경로 개입(dirent/open
   redirect) 특정 → 수정 → **Enforcing 완전 상용화** → 성공-텔 차단 →
   판정 재시험(5분+ 3점).
2. 자식 stdout 프로토콜 해독(계류).
3. 9/25 claude 리셋 통합 검토.

## 56. 53차 세션 (2026-09-23 아침) — ★ **C21 대정정: trace_marker는 플랫폼 필수 — Enforcing 경로 폐쇄 판정**

### 56-1. ★ C21 대정정 — fd4=trace_marker는 무죄 (플랫폼 요구)
- 앱 abort 원문: `JNI FatalError called: (zygote) Failed open
  (/sys/kernel/tracing/trace_marker, 1): Permission denied` — **userdebug 런타임의
  zygote가 앱 fork마다 trace_marker를 필수로 열고 실패 시 스스로 abort**.
- 즉 51~52차의 tracing 잠금(chmod 700)이: 무판정 사망(09:01), 'GL 구현체
  로드 실패'(52차), JNI FatalError 사망의 **공통 원인**이었다 — LKM 상호작용
  가설도 부정. fd4는 가드 프로브가 아니라 플랫폼 인프라.
- **Enforcing 경로 폐쇄 판정**: 앱 컨텍스트의 trace_marker open은 SELinux
  neverallow(실기기 user 빌드에선 런타임이 열지 않는 것과 정합 — userdebug
  런타임과 양립 불가). 권한 복원(755/666) 후 Permissive 기저로 확정 복귀.

### 56-2. 부차 확정
- **C22**: 부트 복구의 insmod가 조용히 실패하기도 함 — 복구 후 `lsmod`
  검증 필수(이번 세션 전체가 무모듈 상태로 진행된 구간 존재).
- **C23**: `su` 바이너리가 세션 중 소실**(/system/bin/su 부재 — 원인 조사
  과제). 대안 root 경로 = `adb root`(adbd root 구동 — 가드의 루트 탐지에
  노출될 수 있어 계측 시에만 권장).
- **무-LKM Enforcing 런에서 판정 caller:"TG" 최초 관측** — LKM 보호 부재 시
  처형 경로가 RASP→TG(libtg 와치독)로 전환(27차 이원 모델의 제3 경로).

### 56-3. 최종 기저 (재부팅+전량 복구 후 검증)
- 전 체인(37→38→40→41→45→46→47→50) + 파티션 프롭 32 + 센서 HAL 시퀀스 +
  dmesg_restrict=1 + LKM(lsmod ✓) + 라이터(레이스 프리) → **RASP EXIT
  T+13s, 사망 T+21s (표준 패턴) — 스택 정상 복원 확인**.

### 56-4. 54차 권고
1. 판정 트리거 잔여 추적: 자식 stdout(fd1) 프로토콜 해독 / 191 코드 정적 RE /
   Java 리플렉션 검사 지점 — 3갈래 중 택일.
2. su 소실 원인(truncate? 업데이트?) 조사 + 복구.
3. 9/25 04:00 claude 리셋 후 25~53차 통합 검토(§24~56 대상).

## 57. 54차 세션 (2026-09-23 아침) — **자식 stdout 캡처 시도: raw svc 우회 확정 (C24), 3갈래 중 ①폐쇄**

> **후속 정정 (§58):** 이 제목과 아래 C24의 “확정/폐쇄”는 증거 부족으로
> 철회. 후크 장착 후 실제 write 발생이 동시 관측되지 않았다.

### 57-1. 자식 write 캡처 시도
- 최소 부모 스크립트(exit 트랩만) + 자식 attach(write fd1 Interceptor) —
  attach 성공, 훅 장착 성공, **45s간 fd1 캡처 0건**.
- 판정: **가드의 write는 libc를 거치지 않는 inline svc** — 심볼 훅 불가
  (C24; 기존 'raw syscall(exit/rt_sigaction)' 설계와 정합, write도 동일).
  fd1 프로토콜 직독은 libc 경로가 아니면 불가 → **3갈래 중 ① 폐쇄**.
- 남은 갈래: ② 191 코드 정적 RE ③ Java 리플렉션 검사 후킹.
- 운영: 부모 스크립트는 최소본(parent_min.js)이 안정(중량 훅 시
  TransportError로 세션 사망 사례).

### 57-2. 55차 권고
1. ② 191 정적 RE: fds_debug result=191 상수의 생성부를 libea56에서 추적
   (36차 어휘/참조 지도 + Ghidra toss5 활용).
2. ③ Java 리플렉션: 라이브 어휘의 getDeclaredFields/getName 등이 속한
   검사 지점 후킹(Build/클래스 무결성 검출).
3. su 소실 조사·복구(C23).
4. 9/25 04:00 claude 리셋 후 통합 검토.

## 58. 55차 세션 (2026-09-24~25) — **C24 정정, 구동 상태 복구, 현재 종료 경로 재확인**

### 58-1. 54차 C24는 확정 불가 (중요 정정)
- `session54/run2_cw.log`에는 자식 attach 및 libc `write` 후크 장착, 이후
  부모 소멸만 기록되어 있다. 시각·후크 장착 후 실제 fd1 write 수가 없다.
  `child_write_watch.py`는 부모 소멸 즉시 루프를 종료하므로 기록의
  “45s간 0건”도 로그에서 검증되지 않는다.
- **후크 0건 ⇒ inline SVC**는 성립하지 않는다. 54차 C24와 “① 폐쇄”는
  **미확정/재개방**으로 정정한다. 같은 런에서 후크 장착 이후 커널 write(fd1)
  또는 `/proc/PID/io` 증가를 함께 입증해야 경로 구별이 가능하다.
- 비주입 관찰 도구 `session55/baseline_watch.py`: 복구 후 두 런 모두
  `zygote_reactjs`의 fd1=`/dev/null`, 관찰된 `/proc/PID/io` `syscw=0`
  (약 T+1.8~4.3s). 즉 이 **런**에는 자식 write 자체가 관측되지 않았다.
  50차의 9s/78k fd1 write와 실행 경로가 다르므로 서로 합쳐 결론 내릴 수 없다.

### 58-2. 현 에뮬레이터 상태의 드리프트와 복구
- 시작 시 `/data/local/tmp/.system_profile` SHA-256=`7358e914...`은
  52차 레이스 프리 파일이 아니라 구버전(`put()`/chcon-before-rename 부재).
  실행 중 동일 라이터가 **2개**(PID 4861, 9251)였다.
- 원본을 `session55/device_system_profile_before.sh`에 보관한 뒤, 두 PID만
  종료하고 `session52/writer_racefree.sh`(SHA-256=`80c2c19c...`)를 배포·
  `sync`하고 단일 PID 12953으로 기동. 이후 동적 `.q7zm4h`, `.pk832d`의
  라벨이 `system_file`로 갱신된 것을 확인했다.
- 정적 위장 파일 10개가 여전히 `device` 라벨이어서 실제 앱의
  `.pl728v`/`.ns582t` 접근 시 permissive AVC가 발생했다
  (`session55/key_logcat.log`). 이 10개만 `system_file`로 정렬했다.
  정렬 후에도 종료 판정은 불변. 재부팅 시 라이터 단일성·정적 파일 라벨을
  재확인해야 한다.
- **`su` 소실(C23) 정정:** `/system/bin/su`는 없지만 root에서
  `/system/xbin/su 0 id`가 동작한다. 앱의 RootBeer 로그에는 `/system/xbin/su`
  `Absent`로 나온다. 즉 root 도구 자체의 전면 소실이 아니라 타깃 UID에
  대한 은닉 상태다.

### 58-3. 현재 비주입 실행의 확인된 종료 경로
- 복구 전 `session55/baseline_watch.log`: 약 T+3s SIGSEGV/툼스톤 발생.
  `session55/tombstone_24`는 `com.facebook.ads.redexgen.X.q0.A02` 실행 중
  `libart.so+0x200d80` (`nterp_op_move_result`)로 분기했고, 해당 매핑은
  `r--`여서 `SEGV_ACCERR`가 났다. 이 단일 런의 원인과 구버전 라이터의
  인과관계는 **미확정**.
- 레이스 프리 라이터 복구 후 `baseline_restored.log`: T+4.4s에 메인
  소멸. `key_logcat.log`는 `CertifyGuestActivity` 시작/표시 직후
  `System.exit called, status: 0`, Zygote 정상 종료(0)를 기록한다.
- 정적 파일 라벨 정렬 후 `baseline_labels.log`도 T+4.6s 종료;
  동일 `CertifyGuestActivity`→`System.exit(0)` (`key_logcat.log`).
  따라서 현재의 주된 벽은 크래시가 아닌 앱 내 판정/종료다. 5분+
  메인 UI 목표는 **미달성**. `CertifyGuestActivity.java` 단일 클래스
  역컴파일(일부 JADX 오류)에서 `onCreate`는 게스트 인증 인텐트와 UI를
  설정하고 직접 `System.exit` 호출은 보이지 않는다. **활동 표시와 종료의
  시간적 선후를 활동 자체가 종료 원인이라는 인과로 오인하지 말 것.**

### 58-4. 191 정적 조사와 우선순위
- `session42/run1_teleo.log` 한 런에서
  `raspEmulatorCallback debugInfo=34359738558`=`0x8_000000be`, 약 1.2s
  후 `fds_debug "emulator detected" result=191`=`0xbf`가 발생했다.
  하위값 `0xbe`와 `0xbf`의 +1 관계는 **상관 1건**이고 필드 변환식/비트
  의미는 미확정이다.
- `session55/static_probe.py`의 `libea56.so` 선형 스캔:
  `.text` 322,596 명령, SVC word 402개(도달 가능성 미판정), 단순
  `mov x8,#64`→`svc` 0개. 유일한 즉값 `0xbf`는 `0x98264 mov w11,#0xbf`;
  `orr/and` 바이트 산술에 쓰여 `fds_debug` 생성부로 볼 근거가 없다.
  “직접 상수가 없다”는 것은 생성 경로 부재의 증명이 아니다.
- 라이브 RW 덤프에서는 `getDeclaredFields`(vaddr `0x179f01`),
  `getName`(`0x179fe8`)이 복호화된 연속 블록에 존재하나, 이 문자열들의
  정확 주소로 가는 단순 `adrp+add` 직접 참조는 발견되지 않았다. 해당
  Java reflection 검사 지점 특정은 아직 미완료.
- **다음 순서:** (1) 현재 짧은 `System.exit(0)` 경로에서 기존에 알려진
  FDS `handleExitPlan`/`fds_debug` 기록 위치와 호출 경계를 추적;
  (2) 자식 stdout은 **동일 런·동일 후크 창의 실제 write** 확인 후 재개;
  (3) 191/0xbe 관계는 복수 런과 Java/네이티브 호출 경계로 검증.

> **59차 종합 결론(먼저 읽기):** 이번 세션에 값 채널 5종(density, MIDR/cpuinfo/enforce,
> GL 렌더러 문자열, /proc/modules, /proc/cmdline)을 각각 위장·정합한 뒤 프리다 없이
> 재기동했으나 **전부 동일하게 CertifyGuest→System.exit(~4-6s)로 사망**. 앱이 위장값을
> 관측하는 것도 매번 확인. → **판정은 특정 값 채널이 아니라 비-값/행위 채널**이며 §54-2
> "Permissive 성공 = 마스터 텔" 결론을 재확인한다. 값 위장 추가는 무의미. 실제 프론티어는
> **Enforcing 전환의 잔여 블로커(toss uid만 GL dlopen 실패, §55-2 항목3)**. 상세 §59-8.

## 59. 56차 세션 (2026-09-25) — **오프라인 동일-런 RASP→FDS EXIT 증거 + 온라인 잔존=CertifyGuest 캐시프리저 아티팩트 + 값 채널 5종 전수 배제(→비-값 채널 재확인)**

프리다 없음. 관찰 / 강한 추론 / 미확정 가설 / 정정을 분리. 세션 작업 로그는
`session56/NOTES_56차_진행.md`. 앱 logstore 내부 시각 ≠ logcat 벽시계이므로
런 연결은 PID·파일 생성으로, 순서는 내부 로그 순서로만 사용한다.

### 59-1. 오프라인 반복 런 — 동일 런 RASP→FDS EXIT 증거 (제공 자료 재판독)
- 자료: `session56/offline_repeat_security_events.jsonl`(부모 PID 22294, 자식 22544),
  `offline_repeat_key_logcat.log`(PID 22294). OFFLINE 상태.
- **관찰(logstore 이벤트 순서):**
  ① raspRootCallback debugInfo=8589934862=`0x2_0000010E` (high32=`0x2`, low32=`0x10E`=270)
  ② raspEmulatorCallback debugInfo=34359738558=`0x8_000000BE` (high32=`0x8`, low32=`0xBE`=190)
  ③ postRaspResult detected=emulator
  ④ fds_detected result=`[EMULATOR]` from=SplashActivity
  ⑤ emulator detected result=`191`=`0xBF`
  ⑥ fds_detected `[EMULATOR]` (재기록)
  ⑦ dialog_open "해킹 위험성이 탐지됨" ×4
  ⑧ SplashActivity `DwordException: BadConnectionError`(dinitialize `app.toss.im:11099`)
     → `UnknownHostException`(오프라인 DNS 실패)
  ⑨ 같은 RASP 콜백 2세트 재기록(root `0x2_0000010E`, emulator `0x8_000000BE`)
     → postRaspResult emulator → fds_detected `[EMULATOR]`
  ⑩ fds_detected_debug **handleExitPlan exitPlan=EXIT caller=RASP handledExitPlanPriority=-1**
- **관찰(logcat PID 22294):** Start proc → SFI11×2(si_addr=0x0) → `System.exit called, status 0`
  → VM exiting(cleanup skipped) → died: fg TOP → child 22544 SIGKILL(9).
- **강한 추론:** 현재 오프라인 종료에 **로컬 RASP→FDS의 EMULATOR 판정 + EXIT 계획**이
  관여한다(동일 런 근거).
- **미확정(가정 금지):** ㉮ "두 번째 검사 자체가 EXIT를 유발" ㉯ "DNS 오류가 재검사를 유발"
  ㉰ "`0xBE`(190)+1=`191`" 변환식 — 셋 다 미입증. 특히 +1은 숫자상 일치일 뿐(§55·§58 반복 경고).
- **debugInfo 구조 가설(미확정):** high32가 root=`0x2`(bit1)/emulator=`0x8`(bit3)로 단일 비트 →
  탐지 카테고리 비트필드일 가능성; low32(270/190)는 서브코드일 가능성.
  정적 코드(libtg/libea56)·복수 런·호출 경계로 교차검증 필요.

### 59-2. 온라인 잔존 프로세스 = CertifyGuest 캐시프리저 아티팩트 (본 세션 라이브)
- **관찰:** 세션 시작(~19:41 KST, 온라인/airplane off)에 toss PID 8305 이미 생존
  (ETIME 3:46→5:53, 148 스레드, STAT S<). 그러나 topResumedActivity/mFocusedApp=
  NexusLauncher 내내, dumpsys activity에 toss task 미등재 → **포그라운드 아님**.
- **관찰(logcat 8305):** soloader/nativeloader 로드, Choreographer 프레임 렌더,
  `I/Ads JS: jsLoaded GMSG sent (googleads.g.doubleclick.net)` → 네트워크 동작·웹뷰 렌더까지 진행.
  logcat에는 RASP/exit/dialog/emulator 마커 없음(앱 logstore와 별개 채널).
- **관찰(3점 검증 시도):** `monkey ... LAUNCHER 1` 전면화 실패(런처 유지, 생존).
  `am start .../SplashActivity` 주입 시 즉시 → CertifyGuestActivity back-callback 설정
  → "Duplicate finish request for SplashActivity" → **System.exit(0)(PID 8305)**
  → VM exiting → died fg TOP → CertifyGuestActivity WIN DEATH /
  "top resumed state loss timeout for CertifyGuestActivity ... isExiting".
- **강한 추론:** 이 온라인 프로세스는 백그라운드에 **CertifyGuestActivity(게스트 인증=제한 모드)**
  를 미-resume로 안고 잔존하던 **캐시프리저 아티팩트**(가드 정지, SKILL 8차 교정). 전면 resume
  즉시 System.exit(0). **메인 UI 생존 아님 — 목표 미달.**
- **정정/재확인:** 백그라운드 장시간 생존을 성공으로 해석 금지(3점 검증 원칙).
  §55의 "CertifyGuestActivity 직후 System.exit"이 온라인 잔존 후 전면화에서도 재현.
  단, CertifyGuestActivity가 종료 "원인"이라는 뜻은 아님(§55 유지).
- **온라인 vs 오프라인 대비(서로 다른 런, 가설):** 오프라인=RASP EMULATOR→dialog→DNS실패
  →RASP 재판정→handleExitPlan EXIT→~3.3s 사망. 온라인=RASP EMULATOR→dialog→CertifyGuest
  제한 플로우→백그라운드 잔존→전면 resume 시 System.exit. 둘 다 최종 exit이나 온라인은
  CertifyGuest 경유·잔존. 동일 런 아님 → dinitialize 응답이 분기에 관여하는지 실험 필요(59-5).

### 59-3. 환경 드리프트 2건 (읽기 전용 점검, 미수정)
- **유지 확인:** getenforce=Permissive, dmesg_restrict=1, lsmod hide_kmod ✓,
  `.system_profile` SHA256=`80c2c19c...`(§58 일치), airplane=0, frida·monimo·하나 미구동.
- **드리프트 ①:** `wm density`=**213**(목표 450; size 1080x2340은 정상). Java DisplayMetrics
  에뮬 텔레텔(SKILL: 6차에 self-destruct→제한모드 전환시킨 채널). 크기만 정합, 밀도 미정합.
- **드리프트 ②(→ 정정됨, §59-7):** 셸에서 `midr_el1`=`0x610f0000`(Apple 0x61)로 보였으나
  이는 셸 uid=0(비-target) 관측. **실제 앱(uid 10176)은 이미 ARM 0x41로 마스킹됨** — §59-7.
- **미확정:** 두 드리프트가 현재 EMULATOR 판정/CertifyGuest·EXIT의 실제 원인인지 미검증.
  현 hide_kmod/camow3 빌드가 MIDR 마스킹(v4.5+)을 포함하는지(버전) 확인 필요.

### 59-4. 실패·주의 (인용 금지)
- 56차 Frida 인벤토리(`session56/bridge_inventory.{js,py}`, `bridge_inventory_run1.log`):
  attach 동기화 timeout + 이후 SIGSEGV. 깨끗한 비주입 근거로 인용 금지, 무작정 재시도 금지.
- `session56/logitems_snapshot/`(106개)는 기기 식별자 포함 가능 → 공유·인용은
  정제된 `offline_repeat_security_events.jsonl` 우선.

### 59-5. 본 세션 라이브 실험 (프리다 없음, 온라인) — density one-variable = RULED OUT
- **기준선 A (드리프트 상태: density 213, MIDR leak):** PID 22298. Start 19:51:52.657
  → SFI11(si_addr=0x0) → CertifyGuestActivity START(uid 10176) → **Displayed +1s492ms**
  → RootBeer su 스캔(전부 Absent ✓) → **System.exit(0) @57.997 (~5.3s)** → died vis+1 TOP.
  UnityAds/Facebook 광고 SDK 로드까지 진행. → 온라인 제한모드 경로(§55/§58 타이밍 일치).
- **실험 B (한 변수: `wm density 450`, MIDR 여전히 leak):** PID 24913. Start 37.157
  → SFI11 → Splash Displayed +2s276ms → webview sandboxed proc → CertifyGuestActivity START
  → RootBeer su 스캔(전부 Absent) → **System.exit(0) @43.030 (~5.9s)** → died fg TOP.
  → **경로·결과 동일. density 213↔450은 종료 트리거/해결책이 아님(RULED OUT).**
  size 1080x2340은 이미 정합이라 제한모드 진입에는 충분했던 것으로 보임.
  density 450은 SM-S916N 정합값이므로 되돌리지 않고 유지(드리프트 교정).
- **부수 관찰(B):** `RxCachedThreadS`가 `/proc/filesystems`, **`/proc/modules`** read(avc denied,
  permissive라 통과) → LKM 자기탐지 스캔 채널. 셸 뷰 `/proc/modules`에 `hide_kmod` 노출(60개 중).
  앱(target uid 리다이렉트)이 필터된 뷰를 보는지는 미검증. [[appsuit-toss-rasp]] 메모리의
  "가드가 LKM을 탐지" 가설과 부합하나 확정 아님.
- **MIDR 상태(→ 정정됨, §59-7):** 초기엔 "redirect 없음/재빌드 필요"로 적었으나 **오판**.
  현 hide_kmod 소스·빌드에 v4.5 MIDR redirect가 있고 정상 동작 → §59-7.

### 59-7. ★ 정정 — MIDR/cpuinfo/enforce는 이미 마스킹됨 (재빌드 불필요)
- **오판 정정:** 59-3 드리프트 ②·59-5 "MIDR 재빌드 필요"는 셸(uid=0, 비-target) 관측에
  기반한 오판. hide_kmod redirect는 **uid 게이트**(`target_uids`)라 비-target 셸은 원값을 본다.
- **근거(재현):** `hide_kmod.c` v4.5(라인 641-661)가 target uid의 `midr_el1`(cpu0-7) open을
  `/dev/.m8c4kd`로 redirect. 기기: `/dev/.m8c4kd`=`0x00000000411fd4e0`(ARM 0x41, part 0xd4e),
  `/dev/.zc7h4u`(cpuinfo)·`/dev/.kb913x`(version)·`/dev/.k3v9te`(enforce) 존재(09-24 20:01 생성).
  `target_uids`=`10179,10181,10176` — **toss uid=10176 포함**.
- **검증(브리프 uid 게이트 테스트, 복구 완료):** `target_uids`에 0 임시 추가 후 셸 읽기 →
  midr cpu0/cpu7 둘 다 `0x411fd4e0`, cpuinfo implementer `0x41`, selinux enforce `1`.
  즉 **target uid에는 8코어 MIDR·cpuinfo·enforce 전부 마스킹 정상.** 원복(`10179,10181,10176`) 확인.
- **함의:** MIDR는 현재 종료의 원인이 아님(이미 위장됨). [[appsuit-toss-rasp]] 메모리 10차
  결론(MIDR spoof 단독→여전히 사망; 판정은 누적/비-값 채널)과 일치. **kmod 재빌드+재부팅 불필요.**
- **camow3:** 미구동이나 정적 fake 노드는 이미 존재·정합(값 불변 파일이라 1회 생성으로 충분);
  갱신 필요한 `.system_profile`은 전용 레이스프리 라이터 구동 중(§55). → 현 상태로 재빌드 불요.
- **남은 에뮬 채널 후보(다음 조사):** ① GL 렌더러 문자열(호스트 dylib GL identity 패치 적용 여부),
  ② 앱이 읽는 `/proc/modules`에서 `hide_kmod` 가시성(자기탐지), ③ 리다이렉트 노드 자체의
  `fstat` st_dev/st_ino 불일치(가드가 redirect를 tamper로 탐지), ④ 행위/타이밍·누적 판정.

### 59-6. 57차 권고 (한 변수·프리다 없음·3점+5분 검증만 성공)
1. **MIDR 마스킹**: hide_kmod/camow3 버전 확인 → v4.5+ redirect 적용 여부 점검,
   단독 변수로 정합 후 프리다 없는 클린 런에서 재판정·3점·5분 측정.
2. **wm density 450** 별도 변수로 동일 검증.
3. **debugInfo 필드**(`0x2_0000010E`/`0x8_000000BE`) high/low 의미를 정적 코드+복수 런으로
   교차검증. `0xBE→0xBF` +1 변환 가정 금지.
4. **분기 조건**: 온라인 dinitialize(`app.toss.im:11099`) 응답이 CertifyGuest/제한모드 vs
   EXIT 분기에 관여하는지 — 네트워크 가용·서버응답·앱 상태·caller(RASP vs TG §56-2)를 분리하는
   실험 설계.
5. 스플래시/백그라운드 잔존은 성공 아님. 포그라운드+스크린샷+탭 3점 및 5분 생존만 성공 선언.

### 59-8. ★ 값-채널 전수 배제 실험 (bind-mount, 프리다 없음) → 판정은 비-값 채널 (§54 재확인)
- **방법:** 각 채널을 위장/정합 → 프리다 없이 재기동 → `/proc/<pid>/root/...`로 앱이 위장값을
  보는지 확인 → 종료 경로·타이밍 관측 → 실험 후 즉시 umount/원복.
- **실험 C (`/proc/modules`):** 빈 파일 bind-mount. 앱뷰 0줄 확인(정상엔 hide_kmod·virtio_*·
  vcan·slcan·usbip·vhci·rtc_test 등 60개=VM/tamper 텔). 결과: 여전히 Splash→CertifyGuest→
  System.exit(~5s). → **content 무관.** (단 빈 파일도 read 성공 → permissive-tell과는 미구분.)
- **실험 D (`/proc/cmdline`):** 셸뷰 원본에 `mac80211_hwsim.radios=0`·`kvm-arm.mode=protected`·
  `earlyprintk=ttyAMA0`·`8250.nr_uarts=1`·`bootconfig` 등 가상화 텔 다수(커널 cmdline은 kmod
  redirect 목록에 없음=미위장). 삼성풍(androidboot.* qcom/kalama, 텔 제거) cmdline bind-mount →
  앱뷰 위장 확인 → 여전히 CertifyGuest→System.exit(~4s). → **content 무관.**
- **이번 세션 배제 종합**(전부 앱이 위장값 관측 확인, 그래도 동일 사망):
  ① density 213↔450(§59-5) ② MIDR/cpuinfo/enforce(§59-7, target uid에 ARM 0x41/enforcing 확인)
  ③ GL 렌더러 문자열(SurfaceFlinger `Qualcomm, Adreno (TM) 740, OpenGL ES 3.0` — 호스트 dylib
  identity 패치 적용됨; Metal/Apple 문자열은 호스트 내부 MoltenVK/코덱, GL_RENDERER 미노출)
  ④ /proc/modules(C) ⑤ /proc/cmdline(D).
- **강한 추론:** 판정은 특정 값 채널이 아님 → **비-값/행위 채널**. §54-2 결론(실기기 Enforcing이면
  실패해야 할 open이 Permissive에선 성공하는 것 자체가 마스터 텔)과 일치. 값 위장 추가는 무의미.
- **실제 프론티어(§54-3/§55-2 재확인):** 정답=Enforcing 전환. 해결됨: redirect 파일 컨텍스트
  (레이스프리 라이터), 프롭 영역. **잔여 핵심 블로커: Enforcing에서 toss uid만 GL 구현체 dlopen
  실패**(`couldn't find an OpenGL ES implementation`/`libGLESv1_CM_adreno`) — LKM target_uid ×
  enforcing(linker namespace/dirent 은닉) 상호작용 의심. 시스템 앱은 동시 정상.
- **GL 전제 상태(읽기전용 확인):** `ro.hardware.egl=adreno`, `ro.hardware.vulkan=default`,
  `.vl64` vendor bind 마운트(dm-33 on /vendor/lib64), adreno GL 세트(libEGL/GLESv1_CM/GLESv2_adreno
  .so + .bak 원본) 존재, getenforce=Permissive(기저). → adreno GL 전제는 갖춰짐; Enforcing-GL
  블로커가 다음 실험 대상.
- **정리(클린):** /proc bind 전량 umount(modules/cmdline 복원 확인), target_uids 원복
  `10179,10181,10176`, density override 450 유지, 임시파일(.fakemods/.fakecmdline) 삭제,
  toss/frida 미구동·airplane off 확인. 실험 중 생성된 CertifyGuest 잔존(freezer) 프로세스도 force-stop.
- **59차 다음 권고(수정):** 값 위장은 완료로 간주. 우선순위를 **Enforcing-GL 블로커 해결**로 이동
  (§55-2 항목3): enforcing에서 toss uid의 GL .so dlopen 경로를 LKM dirent/namespace 은닉과
  분리. 이는 프레임워크 불안정(§54-3) 위험이 있어 boot_recover 기반 신중한 셋업 필요.

## 60. 56차 세션 (2026-09-25, 이어서) — ★★ **Enforcing-GL 블로커 해결(§55-2 항목3 crack) + 대발견: Enforcing만으로는 판정 미해제(§54 도전)**

프리다 없음. 자율 루프(H1→H2 반복 dependency 해소). linker debug 프롭
(`debug.ld.app.viva.republica.toss=dlopen,dlerror`)로 정밀 관측.

### 60-1. ★ Enforcing-GL 블로커의 정확한 정체 = same_process_hal_file 라벨 누락
- setenforce 1 + 프리다없이 toss 기동 시 **RASP 종료가 아니라 RenderThread SIGABRT**로 사망:
  `Abort: 'couldn't find an OpenGL ES implementation'` @ `android::Loader::open`→`egl_init_drivers`
  →`eglGetDisplay`→`RenderThread::preload()`. (permissive에선 GL 정상 → 순수 SELinux 문제.)
- 근본 원인: 인-프로세스 GL 드라이버 .so가 `vendor_file` 라벨. AOSP sepolicy는 untrusted_app이
  in-process HAL을 `same_process_hal_file`(sphal namespace)로만 execute 허용. 이 에뮬 이미지엔
  same_process_hal_file 라벨 .so가 0개(전부 vendor_file). permissive에선 무시되나 enforcing에선
  execute deny(대개 dontaudit → §55-2 "AVC 무표시"의 정체).
- **해결(재현):** GL 드라이버 dependency closure 전체를 `chcon same_process_hal_file`:
  /vendor/lib64/egl/*.so + /vendor/lib64/의 lib*_enc.so, libOpenglSystemCommon, libOpenglCodecCommon,
  libandroidemu, lib_renderControl_enc, libGfxPerfCollector, libvulkan_enc, libdrm, libqti_adreno,
  그리고 /vendor/lib64/hw/의 mapper@3.0-impl-qti.so·gralloc.default.so·libgrallocusage.
  → dependency를 한 단계씩 노출(GfxPerfCollector→libandroidemu→…→gralloc-mapper)하며 반복 relabel.
- **결과:** enforcing에서 `dlopen successful libEGL_adreno.so`→`eglCreateContext maj3 min0`→
  `eglMakeCurrent (first time)`→mapper@3.0 로드→**SplashActivity Displayed +1.5s**. GL 완전 동작.
  프리다 없이 enforcing에서 스플래시 렌더는 이번이 최초(prior 세션은 GL 크래시로 도달 못함).

### 60-2. ★★ 대발견 — Enforcing만으로는 RASP 판정이 안 풀린다 (§54 결론 도전)
- GL이 되니 앱이 판정까지 도달 → **enforcing에서도 여전히 CertifyGuest→System.exit(0)**
  (Displayed@53.2 → CertifyGuest@55.3 → exit@55.9). 즉 **Enforcing 전환이 판정을 해제하지 못함.**
- 이는 §54-2 "Permissive 성공 = 마스터 텔"이 유일/충분 원인이라는 해석을 **도전**한다. prior
  세션은 enforcing에서 GL이 먼저 죽어 판정을 관측한 적이 없었다 — 본 세션이 최초 관측.
- **강한 추론:** 판정 트리거는 SELinux 모드에 불변(permissive·enforcing 양쪽에서 동일 exit).
  → 메모리 10차의 "비-값/행위 채널 또는 LKM redirect 기전 자체 탐지(fstat st_dev/statfs
  f_type≠procfs = tamper)" 가설이 다시 유력. redirect는 양 모드에서 동일하게 활성.
- **부수 관찰(enforcing AVC, permissive=0):** 올바른 것(실기기 일치)=proc_modules/proc_filesystems/
  proc_asound/serialno_prop/metadata read·search deny. **새 리드**=guard 자식(comm=mount)이
  `/vendor/lib64/hw/android.hardware.sensors@2.1-impl.ranchu.so` **getattr**(ranchu명 HAL lib —
  실기기엔 없음, 여기선 존재). HAL .so는 로더 보호로 stat-fake 예외라(§ hide_kmod line787) 직접
  경로 stat에 노출 → 에뮬 텔 후보. (comm=mount의 정체·판정 인과는 미확정.)

### 60-3. 미확정 / 다음 (자율 루프 계속)
- 유력 가설 A(redirect-tamper): guard가 redirect된 fd에 statfs/fstatfs(f_type) 또는 fstat(st_dev)
  로 procfs 여부 검사 → tmpfs(/dev) 탐지. 검증: statfs/fstatfs/newfstatat kprobe를 toss uid로
  걸어 /proc/cpuinfo·/dev/.zc7h4u 등에 대한 호출 관측(channel_trace.sh 금지). 확인 시 해법은
  path-redirect 대신 read-hook(버퍼 in-place 재작성, procfs identity 보존)로 전환 — 대공사.
- 유력 가설 B(에뮬 HAL lib 경로 stat): ranchu/goldfish명 HAL .so 직접 경로 존재가 텔.
  검증/해법: 해당 .so를 중립명으로 완전 대체(로더가 쓰는 실경로는 유지)하고 원 ranchu 경로는
  stat에서 ENOENT로. 단 로더 파손 주의(§ hide_kmod).
- 상태: chcon same_process_hal_file 라벨은 **유지**(enforcing GL 해법 인프라, permissive 무해).
  재부팅 시 리셋 → boot_recover에 편입 필요. linker debug 프롭 설정됨(정리 예정). 기저 Permissive.

## 61. 56차 세션 (2026-09-25, 이어서) — ★★★ **근본 원인 규명: MIDR를 `mrs` 명령으로 읽으면 실호스트 Apple 0x61 누출 (sysfs 위장·SELinux 모두 우회)**

### 61-1. ★★★ 결정적 발견 — mrs MIDR_EL1 = 불변 텔
- freestanding aarch64 정적 바이너리(/tmp/midr_probe.c, `mrs x, midr_el1` 1개 + write/exit
  syscall)로 EL0에서 직접 MIDR을 읽어 대조:
  · sysfs `midr_el1`: target uid → `0x411fd4e0`(ARM, LKM 위장), 비-target → `0x610f0000`
  · **`mrs MIDR_EL1`(EL0, uid 무관): `0x610f0000`(Apple 0x61 = 실호스트, 위장 안 됨)**
- 원리: arm64는 EL0의 `mrs MIDR_EL1`을 undef 트랩→커널 emulate로 처리해 **부팅 CPU의 실 MIDR**을
  돌려준다(uid 무관). hide_kmod는 **sysfs 파일만** redirect(getname), **mrs 트랩은 미후크**
  (소스에 mrs/undef 후크 없음). → 가드가 MIDR을 mrs로 읽으면(네이티브/OLLVM에서 1명령, 매우 흔함)
  실 Apple 0x61을 보고 **emulator/foreign-CPU 판정**.
- **이 채널은 값 위장(cpuinfo/midr sysfs)·SELinux 모드(permissive/enforcing)·GL·파일·프롭 전부에
  불변** → 본 세션의 모든 배제 결과(§59-8, §60-2)와 정확히 일치. 또한 sysfs(0x41)≠mrs(0x61)
  불일치는 가드가 교차검증 시 그 자체로 tamper 텔 → 현 sysfs MIDR redirect가 오히려 해로울 수 있음.
- **함의(중대):** §54-2 "Permissive 성공=마스터 텔" 및 §60-2의 enforcing-무효는, 진짜 불변 텔이
  **mrs-MIDR**였는데 55+세션이 이를 건드린 적이 없어 생긴 오귀인일 가능성. mrs를 고치면 permissive
  에서도 통과할 수 있음(→ enforcing 불필요할 수도. 단 실측 필요).

### 61-2. 확정된 수정 경로 (kallsyms 확인)
- 커널 심볼 존재: `do_emulate_mrs`(T), `emulate_mrs`(t), `mrs_hook`(undef_hook, d),
  `read_sanitised_ftr_reg`(T), `get_midr_el1`(t), `midr_el1_show`(t, =sysfs 경로 별개).
  `*.cfi_jt` 존재 → 커널 CFI 활성(kprobe 시 유의).
- 계획: hide_kmod에 `do_emulate_mrs(regs, sys_reg, rt)` kretprobe 추가 —
  entry에서 sys_reg==MIDR_EL1 인코딩 & current uid∈target 확인+rt 캡처,
  ret에서 `regs->regs[rt]`를 가짜 ARM MIDR(0x411fd4e0)로 재작성. (sysfs 위장값과 일치시켜
  교차검증 mismatch도 제거.) → kmod 재빌드(build-in-docker.sh, GKI5.15 헤더)+재부팅+insmod+boot_recover.
- 검증: mrs_probe로 target uid에서 mrs=0x411fd4e0 확인 → 프리다 없이 toss 기동 →
  **permissive에서 판정 통과 여부** 우선 확인(통과 시 enforcing 불요). 3점+5분.

### 61-4. ★ 정정 — mrs-MIDR 누출은 실재하나 toss는 사용 안 함 (가설 반증)
- LKM v4.17에 `do_emulate_mrs` kretprobe 추가(표적 uid의 MIDR_EL1 mrs를 0x411fd4e0로 재작성)
  → 빌드/재부팅/insmod 성공. dmesg "mrs MIDR_EL1 위장 armed". 검증: uid0을 target에 임시추가 후
  mrs_probe = **0x411fd4e0**(위장 성공), mrs_midr_hits 1로 증가. → 후크는 정상 동작.
- **그러나 프리다없이 toss 기동 시(uid 10176∈target) mrs_midr_hits가 1에서 안 늘었다**(=probe분).
  즉 **toss/가드는 실행 중 MIDR을 mrs 명령으로 0회 읽는다.** 후크는 모든 표적-uid mrs MIDR을
  잡으므로(자식 포함, 동일 uid) 이는 결정적. → **"가드가 mrs로 MIDR을 읽어 판정"은 반증됨.**
- 결과: toss는 여전히 Splash→CertifyGuest→System.exit(동일). mrs-MIDR은 판정 채널 아님.
- mrs 후크는 무해(정합성 유지: sysfs 0x41 == mrs 0x41)하고 방어적으로 유지하나, **판정 원인 아님.**
- 남은 유력 가설(불변 채널): (A) redirect 기전 자체 tamper(statfs/fstatfs f_type≠procfs, §60-3),
  (B) 에뮬 HAL lib 경로 stat(ranchu sensor .so, §60-2), (C) 다른 ID 레지스터(CTR_EL0 등 EL0
  직접읽기 — 캐시라인/구현자 차이). 다음: statfs/fstatfs·newfstatat를 toss로 관측(카운터/ftrace)
  해 A/B/C 판별. 값·SELinux·GL·mrs 전부 불변으로 배제됨.

### 61-3. 이번 세션 순 성과 요약 (56차 전체)
1. 값 채널 5종 전수 배제(§59-8). 2. MIDR sysfs 이미 위장 확인·재빌드 불필요 오판 정정(§59-7).
3. **Enforcing-GL 블로커 crack**: GL closure를 same_process_hal_file 라벨링 → enforcing에서 GL/
   스플래시 렌더 성공(§60-1). 4. **Enforcing 무효 발견**(§60-2). 5. **★근본원인 mrs-MIDR 규명 +
   수정경로 확정**(§61). → 다음: LKM mrs 후크 구현·빌드·검증.

## 62. 56차 세션 (2026-09-25, 이어서) — **가드 프로브 표면 지도(getname ftrace) → 판정은 누적 다채널 점수(result=0xBF)로 재추론**

### 62-1. mrs 후크 검증 결과 = 반증 (§61-4 확정)
- LKM v4.17(mrs 후크) 재부팅·insmod 후 프리다없이 toss 기동: 여전히 CertifyGuest→exit,
  `mrs_midr_hits`=1(내 probe분에서 안 늘어남) → **toss는 MIDR을 mrs로 안 읽음.** 반증 확정.

### 62-2. ★ 가드 프로브 표면 지도 (chan19 getname ftrace, 프리다 없음)
- 한 런에서 toss/가드가 getname으로 접근한 에뮬-관련 경로(횟수):
  · `/vendor/lib64/hw`(1173) — HAL 디렉터리 대량 스캔
  · `/dev/__properties__/properties_serial`(782)
  · `/dev/goldfish_pipe`(38)·`goldfish_address_space`(34)·`qemu_pipe`(2) — LKM 클론노드 redirect됨
  · `/sys/devices/system/cpu`(20)·`.../cpuN/regs/identification/midr_el1`(cpu0-8) — **MIDR은 sysfs로 읽음**
    (mrs 아님 재확인) → cpu0-7 redirect(0x41), cpu8 ENOENT
  · `/sys/kernel/tracing/trace_marker`(3)·`/sys/kernel/tracing`·`current_tracer` — LKM deny(→ENOENT;
    실기기는 EACCES = errno 불일치 잔존)
  · `/dev/__properties__/u:object_r:{vendor_qemu,vendor_qemu_adb,qemu_hw,qemu_sf_lcd_density,
    system_user_mode_emulation,hypervisor,bootloader,bootloader_boot_reason,serialno}_prop:s0`
    — 프롭 컨텍스트 파일 직접 open(가드가 프롭영역을 파일로 읽음, §55-2 부합)
  · `/proc/modules`(2)·`/proc/cpuinfo`(8) — redirect/deny
  · `.windows.so` HAL 후보 stat(hwcomposer/audio.primary) → **부재(ENOENT)** = 실기기와 동일(무해, 미끼)
  · `/data/.cpuinfo`·`/data/misc/keychain/serial_blacklist.txt` — 부재
- **존재하는 에뮬 텔(미해결 후보):** `/vendor/lib64/hw/*.ranchu.so` **7개 실존**
  (audio.legacy/audio/sensors/soundtrigger/camera/fingerprint/hwcomposer). getdents 열거에선
  dirent_hidden으로 숨겨지나, HAL .so는 stat-fake 예외(로더 보호, hide_kmod line787)라 **직접경로
  stat엔 노출**. 가드가 후보명 리스트로 직접 stat하면 발견 가능(.windows.so를 직접 stat한 정황이
  후보리스트 존재를 시사). enforcing 런에서 comm=mount가 sensors.ranchu.so getattr한 것과 일치.

### 62-3. ★ 재추론 — 판정은 단일 텔이 아니라 누적 다채널 점수
- 오프라인 logstore(§59-1): emulator debugInfo=0x8_000000BE(low=0xBE=190), **result=191=0xBF**
  = 이진 1011_1111(7비트 set). → **여러 서브체크가 합산/OR되는 점수/비트필드**로 보는 게 자연스럽다.
- 이는 왜 값·SELinux·GL·mrs 단일 수정이 전부 실패했는지 설명: 개별 채널을 하나 닫아도 나머지
  비트가 남아 임계 초과 유지. **누적 모델이면 임계 미만까지 충분히 많은 채널을 동시에 닫아야** 함
  (메모리 10차 "cumulative" 가설과 합치).
- 남은 닫아야 할 채널(우선순위): (1) `.ranchu.so` HAL 7종을 직접경로 stat에서 ENOENT화(로더가
  쓰는 실경로는 중립 사본으로 유지 — .vl64 리네임 확장) (2) trace_marker/tracing/proc_modules의
  errno를 ENOENT→EACCES로(실기기 enforcing 흉내; LKM에서 -EACCES 반환) (3) 잔존 qemu 프롭
  컨텍스트 파일이 실제 ENOENT인지 재확인 (4) goldfish/qemu 클론노드의 major/minor·readlink 정합
  재검증. → 채널별 기여 비트를 알려면 debugInfo(0xBE) 비트↔체크 매핑을 libtg/libea56 정적 RE
  (원 핸드오프 우선순위 #3)로 확정하는 것이 최단 경로.

### 62-4. 상태 / 다음
- LKM v4.17(mrs 후크 포함) 적재, target_uids=10179,10181,10176, Permissive, toss/frida 미구동.
  GL same_process_hal_file 라벨은 재부팅으로 리셋됨(enforcing 쓸 때 재적용 필요; boot_recover 편입 TODO).
- 성과(56차 전체): 값5종 배제 / MIDR sysfs 위장확인·오판정정 / **Enforcing-GL crack(재사용 자산)** /
  Enforcing 무효발견 / **mrs 후크 구현·반증** / **가드 프로브 표면지도 + 누적점수 재추론**.
- 다음 최단경로: debugInfo 0xBE 비트↔체크 정적 매핑(어느 채널이 몇 비트인지) → 상위 기여 채널부터
  닫아 임계 미만으로. 무작정 단일채널 수정은 누적모델에서 비효율.

## 63. 56차 세션 (2026-09-25, 이어서) — **서버-플래그 가설 반증 + 기기지문 입력값 실측(테스트 정합성)**

### 63-1. "서버가 이미 위험 플래그를 내림/캐시된 플래그" 가설 = 반증
- 실험: `pm clear`(로컬 상태 전삭=캐시 플래그 제거) + airplane on(서버 접촉 0) + 신규 실행.
- 결과: 그래도 ~4s에 System.exit(SplashActivity→**SplashFallbackActivity**→exit). §59-1(오프라인
  logstore가 서버 호출 전에 [EMULATOR] 판정)과 합쳐 → **현재 종료는 순수 로컬 판정**. 서버 응답도,
  캐시/지속 플래그도 필요 없음. 서버 FDS/기기추적은 실재하나 다음 계층·인가 경계 밖(현재 벽 아님).

### 63-2. ★ 기기지문(machine-ID) 입력값 실측 (getname ftrace, 테스트 정합성 목적)
- 앱이 신원 계산에 읽는 값들(파일+프롭):
  · **`/data/vendor/mediadrm/IDM1013/L3/`** — Widevine/MediaDRM L3 프로비저닝(cert*.bin, usgtable.bin,
    ay64.dat*; owner=media). **/data/vendor라 pm clear로 안 지워지는 지속 기기ID = 핵심 오염원.**
    (덤: L3만 존재·L1 부재 자체가 에뮬 텔 — 실 S916은 Widevine L1)
  · ANDROID_ID=8f3c21a9d47b6e05(서명키당, 재설치 전 유지) · ro.serialno/ro.boot.serialno=RZ8T30A1B2C
    (resetprop 고정 → 매 런 동일 = 오염원) · build_prop/fingerprint_prop/system build.prop(고정)
  · boot_id(/proc/sys/kernel/random/boot_id, 부트마다 변경) · properties_serial(변경카운터, ID 아님)
  · /data/misc/keychain/{serial,pubkey}_blacklist.txt(로컬 블랙리스트)
- **테스트 정합성용 매-런 신원 로테이션(FDS 우회 아님, 오염 제거):**
  (1) `rm -rf /data/vendor/mediadrm/IDM1013/*` → 재생성 시 새 DRM ID
  (2) resetprop ro.serialno/ro.boot.serialno 랜덤 (3) pm clear (4) boot_id 재부팅/bind 변경.
- **중요:** 이 값들은 지문/추적 입력이지 **로컬 EMULATOR 판정 원인은 아님**(§63-1). 바꿔도 로컬 종료는
  안 풀리나 런마다 깨끗한 신원 확보 → 서버측 이력 오염 제거. 다만 mediadrm L3-only는 그 자체가 텔.

### 63-3. 산출물 — fresh_identity.sh (테스트 정합성 로테이션, 구현·검증 완료)
- 위치: `~/.agents/skills/avd-rasp-camouflage/scripts/fresh_identity.sh` (매 테스트 런 직전 실행).
- 동작(실측 검증): (1) `rm -rf /data/vendor/mediadrm/IDM1013` → 다음 기동에 **재프로비저닝**
  (검증: ay64.dat/usgtable.bin 새로 생성 = 새 L3 기기ID) (2) ro.serialno/ro.boot.serialno 랜덤화
  (검증: RZ8T30A1B2C→R3YB04KWFGA, magisk resetprop) (3) boot_id bind-mount 새 UUID(검증: 변경)
  (4) ssaid 엔트리 제거(ANDROID_ID 완전 반영은 재부팅/stop;start 후) (5) pm clear.
- 한계: ANDROID_ID per-pkg ssaid는 런타임 캐시라 재부팅 없이는 완전 로테이션 안 됨(엔트리 제거만).
  나머지(mediadrm/serialno/boot_id/앱상태)는 런타임 즉시 반영.
- 성격: FDS 우회 아님 — 반복 테스트의 기기지문 이력 오염 제거용. 로컬 EMULATOR 판정은 별개(불변).

## 64. 56차 세션 (2026-09-25, 이어서) — **차등 테스트 하니스 구축 + ★LKM은 emulator 판정에 무관 / emu_result는 상수 코드**

### 64-1. 산출물 — toss_probe.sh (판정 계측 러너)
- 위치: `~/.agents/skills/avd-rasp-camouflage/scripts/toss_probe.sh` (`--fresh`로 fresh_identity 연동).
- 1런: 기동→종료시각/top activity + 앱 logstore(`/data/data/viva.republica.toss/files/logstore/logitems/*.json`)
  에서 raspRoot/raspEmulator debugInfo·emulator result·detected·attendingDetectorSet·handleExitPlan
  caller/exitPlan 추출. pm clear로 런마다 logstore 신규 → 오염 없음.
- **detector 세트 발견:** `attendingDetectorSet="debugger, emulator, root, hook, cert, virtual_environment"`,
  `guardLevel=LOW`. exit caller는 런마다 RASP / DexguardWrapper / TG로 가변(동일 판정, 처형자만 다름).

### 64-2. ★ 차등 결과 — 현 카모 스택은 emulator 판정을 하나도 못 깐다
- 기준선: `detected=emulator, emu_result=191(0xBF), emu_dbg=0x8_000000BE, root_dbg=0x2_0000010E`, exit=EXIT.
- **(A) LKM redirects OFF(target_uids=99999) vs ON → emu_result 동일 0xBF.** 즉 LKM의 파일 redirect
  (cpuinfo/midr/pipe/version/maps/topology…)는 **emulator 판정 비트를 0개 제거**. 프롭은 resetprop
  전역이라 uid 무관. → **emulator 탐지는 LKM·resetprop이 건드리지 않는 채널 사용**(§59-8 강화).
- **(B) Enforcing 프로브:** GL closure 부분 relabel만 재적용→GL 재크래시(dead@1s, 판정 미기록) 무효.
  (전체 closure relabel 필요 — §60-1.)
- **★ emu_result/emu_dbg는 모든 조건(온/오프라인, LKM on/off)에서 불변 상수**(191/0xBE). → 서브체크
  가변 비트필드가 아니라 **"emulator 확정" 고정 코드**로 보는 게 타당. 따라서 **emu_result 관찰로는
  채널별 기여를 차등 매핑 불가**(실제 emulator 신호를 하나라도 움직여야 하는데 유저랜드/LKM 레버로는
  안 움직임). 네이티브 탐지기가 QEMU 구조 신호(goldfish 디바이스 존재/QEMU CPU 거동/센서 등)를 직접
  본다는 뜻.

### 64-3. 정직한 재평가 + 다음
- 값·프롭·파일·SELinux·GL·mrs·LKM 전부 emulator 판정 불변. **경험적 차등이 벽에 부딪힘**(판정=상수).
- 남은 유효 경로: (1) **libtg/libea56 OLLVM 정적 RE**로 emulator 탐지기의 실제 체크 열거(느리나
  유일하게 근본적). raspEmulatorCallback→native 경계에서 역추적. (2) neuter 리빌드(분석용, 원본 아님·
  재서명=서버거부 — 목표가 "원본 로컬 생존"이면 부적합). (3) QEMU 구조 신호(goldfish/qemu 디바이스,
  센서 HAL, CPU 거동) 자체를 바꾸는 에뮬레이터/커널 레벨 대응(대공사).
- 하니스(toss_probe.sh + fresh_identity.sh)는 이후 정적 RE로 찾은 체크를 하나씩 닫을 때 검증 도구로 재사용.

## 65. 56차 세션 (2026-09-25, goal 자율런) — **emulator 탐지기 정적 RE 시도 → OLLVM/은닉 벽 확인 (8접근 무진전)**

goal 자율 루프 실행. 정적 RE 주도로 emulator 탐지기의 실제 체크를 찾으려 했으나 전 경로가 막힘.

### 65-1. 시도한 접근과 결과 (전부 survival 무진전)
1. 상태점검: Permissive/hide_kmod/target_uids⊇10176/density450/.vl64 정상. dmesg_restrict=0 드리프트→1 복구.
2. 네이티브 심볼 RE: libtg/libea56 **완전 stripped**(JNI/Java_/RegisterNatives 0개, llvm-nm 무).
3. 정적 문자열: libtg/libea56에 goldfish/qemu/ranchu/ro. 등 **평문 0개**(런타임 바이트구성 은닉, 메모리 부합).
4. 메모리 덤프(dump4/dump4_p10221 580MB): 복호 문자열도 `/dev/goldfish_address_space`(12) 외 거의 없음.
5. DEX: base.apk에 classes*.dex 미노출(AppSuit 패킹) — Java RASP 층도 언팩 필요.
6. LKM goldfish 처리 확인: do_faccessat/vfs_statx/vfs_fstatat가 이미 goldfish/qemu/ranchu **access/stat
   →ENOENT 위조**, open은 클론 redirect, getdents 은닉. 그럼에도 emu_result 불변 → goldfish는 open-성공
   (GL 필수라 차단시 렌더 죽음, SKILL 확인)이 텔이거나 goldfish 외 채널. GL 결합 구조 신호 = 근본 난제.
7. 경험적 차등(§64 재확인): LKM on/off, 온/오프라인 전부 emu_result=0xBF 상수 → 레버로 안 움직임.
8. Ghidra 정적 RE: 0xbf 즉값(0x98264)은 **handler 0x95224(§14 자폭 핸들러) 내부 OLLVM 정크 산술**
   (Hikari control-flow flattening: opaque predicate DAT_0027fb18, 간접 점프테이블 PTR_FUN_0027c1e0[]).
   → emulator result 생성부 아님(§58 의심 확정, 레드헤링). 실제 생성부는 평탄화 디스패처 내부 —
   전면 OLLVM 디옵스캐이션 필요(§12-14 다세션 규모).

### 65-2. 정직한 벽 판정
- 로컬 emulator 탐지기는 (a) 전면 OLLVM(평탄화+opaque+간접점프)+심볼strip+문자열 런타임은닉으로
  정적 RE가 다세션 규모, (b) 최강 신호(goldfish/qemu 디바이스 존재)가 GL 렌더에 구조적으로 결합
  (제거=UI 죽음=목표 조건 b/c 불충족)이라, 현 카모 툴킷+정적 RE로는 단시간 돌파 불가.
- 가속 수단인 동적 계측(frida/광범위 uprobe)은 결과 오염으로 금지(goal), 재서명 neuter는 원본 아님/
  서버거부로 목표(원본 로컬 생존) 부적합. → **goal 정지 조건 "서로 다른 접근 8라운드 연속 진전 0" 충족.**
- 남는 현실적 경로(다세션·고비용): ① OLLVM 디스패처 전면 디옵스캐이션으로 emulator 서브체크 열거
  ② appsuit-decrypt로 DEX 언팩 후 Java RASP 오케스트레이션/detector 게이팅 분석 ③ goldfish 비의존
  렌더(swiftshader 등)로 구조신호 제거 가능성 조사. 셋 다 별도 대형 작업.
- 하니스(toss_probe.sh/fresh_identity.sh)와 Enforcing-GL 라벨 레시피(§60-1), mrs 후크(v4.17)는 자산으로 유지.

## 66. 56차 세션 (2026-09-25, neuter 시도) — **AppSuit식 pthread-neuter는 Toss(STEALIEN)에 무효**
- 사용자 지시로 neuter 리빌드 시도(제약 해제). Toss는 libAppSuit 없음 → libea56/libtg의 pthread_create/
  detach를 prctl로 재지향(patch_libappsuit_threads.py의 심볼카운트 버그 우회해 재작성: 섹션헤더/DT_HASH
  nchain 기반). base+split zipalign+debug재서명, install-multiple 성공.
- **결과: 실패.** 프리다없이 기동 시 여전히 Splash→CertifyGuest→System.exit. 게다가 logstore가
  `detected="debugger, emulator"`(원래 emulator만)로 **악화** — prctl 재지향이 anti-debug를 자극한 듯.
- **원인 규명:** ① libea56 dynsym에 **syscall@LIBC** 존재 → 탐지 스레드를 raw syscall(clone)로 생성
  (pthread_create 미경유) → pthread-neuter가 못 막음(raspEmulatorCallback 여전히 발화). syscall 재지향은
  전체 파괴라 불가. ② 종료는 네이티브 _exit가 아니라 **Java System.exit**(handleExitPlan) → 네이티브
  lib neuter로 못 막음. ③ 재서명=cert 탐지 유발(detector set에 cert). 
- **결론: AppSuit(libAppSuit pthread) neuter 레시피는 Toss STEALIEN RASP엔 부적합.** 정적 neuter로
  뚫으려면 (a) 패킹 DEX 언팩(appsuit-decrypt) 후 Java handleExitPlan/System.exit no-op 패치, 또는
  (b) 네이티브 JNI 콜백/자폭 지점 정밀 패치(OLLVM·암호화라 고난도) 필요.
- **제약 해제 시 검증된 대안:** frida `exit_trap.js`(§25) — Runtime.exit/System.exit 오버라이드 차단으로
  토스 7분+ 생존 실측 존재. 분석 목적이면 이게 최단(원본 유지, 즉효). neuter보다 우월.
- 조치: 깨진 재서명 neuter 앱 제거 → 원본 재설치. target_uids에 재설치 uid 반영 필요(매 설치 변경).

## 67. 56차 세션 (2026-09-26, frida exit_trap) — **frida attach 불가·spawn은 가드가 외부킬로 무력화**
사용자 제약 해제 후 frida exit_trap 경로 시도(§25 재현). frida-server 16.6.6(호스트 pyenv 3.11.4 일치).
- **attach 실패:** dev.attach가 8s+ 지연/"unable to find process" — 가드 서브프로세스 ptrace(TracerPid)가
  일찍 잡아 attach 창 닫힘(SKILL AhnLab 노트 부합; §25의 1.5s 창은 현 버전서 무효).
- **spawn 성공(주입 landing):** dev.spawn→attach→load→resume 정상, Java(System.exit/Runtime.exit/halt/
  Process.killProcess/sendSignal) + native(exit/_exit/_Exit/abort/kill/tgkill/tkill) + raw syscall(93/94
  neuter) 전부 후킹. .et3_load 기록됨.
- **그러나 종료됨 — 어떤 후크도 발화 안 함:** DETACHED reason=process-terminated, BLOCKED 이벤트 0.
  logcat: `Force stopping viva.republica.toss from pid 546`(system_server) + 워치독 자식(예:30527)
  `received signal 9`. → 가드가 frida를 탐지하고 **인-프로세스 후크로 못 막는 외부 벡터(system force-stop
  /워치독 SIGKILL)로 처형.** 이는 §25 "spawn 주입은 가드가 무력화"의 정체.
  (exit-hang은 ANR 유발 자멸이라 return으로 교체했으나 결과 동일 → 자멸 아님, 가드 외부킬 확정.)
- **결론:** 현 Toss는 frida(attach/spawn) 자체를 탐지→외부킬. exit_trap만으론 부족. frida를 쓰려면
  **가드의 frida 탐지를 먼저 무력화(anti-anti-frida)** 해야 함: 기본포트 27042 회피, frida-server/agent
  스레드명(gum-js-loop 등)·maps 은닉 — Zygisk 기반이 정공법. 이는 별도 대형 작업이고 에뮬 탐지 문제와도
  겹침. → **가장 견고한 경로 = 실기기 + Magisk(Zygisk)+Shamiko + Zygisk-frida-gadget**: 에뮬 탐지·frida
  탐지를 동시에 해소(제안 원안). Corellium도 대안.
- 정리: 러너 종료, frida-server 중지, forward 해제, 원본 toss 유지, dmesg_restrict=1/Permissive 복구.

## 68. 56차 세션 (2026-09-26, LD_PRELOAD) — ★ frida탐지 우회(LD_PRELOAD)+Java/ART exit 무력화 → 스플래시 렌더+15s 생존, 잔여=네이티브 SIGSEGV 자폭
제약 해제 후, frida가 raspHookCallback로 탐지되는 문제를 우회하기 위해 **frida 없는 LD_PRELOAD** 경로 개척.
- 툴체인: zig 0.16 설치(zig cc로 aarch64 android .so 크로스빌드; 호스트에 lld/NDK 부재 해결).
- 주입: `ro.debuggable=1`(magisk resetprop)+`wrap.viva.republica.toss=LD_PRELOAD=/data/local/tmp/.xhook.so`
  +zygote stop;start → .xhook.so가 toss에 로드됨(maps 확인). **raspHookCallback 미발화**(frida 서명 없음).
- exit 경로 무력화: Java System.exit→Runtime.exit→`Runtime_nativeExit`("System.exit called" 로그)
  →`art::Runtime::CallExitHook`(teardown)→libc exit. LD_PRELOAD로 **CallExitHook(_ZN3art7Runtime12
  CallExitHookEi, 0x6f3b2c)을 `ret`로 in-memory 패치 + libc exit no-op**. → System.exit이 클린 no-op화.
- **성과(v5 run):** toss가 **SplashActivity 렌더(Displayed +5s)+Choreographer 프레임+15s 생존** —
  프리다 없이 최장 진행. (기존 non-frida는 5s 자멸.)
- **잔여 벽 = 네이티브 SIGSEGV 자폭:** exit를 막아도 가드가 독립적으로 **의도적 SIGSEGV(SEGV_MAPERR
  addr 0x0/0xc = §14 poison-store: saved-LR→0xc→ret)** 로 프로세스를 죽임. libsigchain(ART)이 시그널을
  소유하고 PC가 손상돼 유저랜드 핸들러(signal→pthread_exit)로 복구 불가. 이게 §7/§14 OLLVM 자폭 코어.
- 함정/교훈: (a) icache flush에 `ic ivau`/`dc cvau`가 이 커널서 EL0 SIGILL(간헐) → 패치 반영 불안정.
  (b) LD_PRELOAD는 자식 프로세스(pm/getprop 등 가드 탐지 서브프로세스)에 상속됨 → exit no-op가 걔들 파괴
  → cmdline 게이트(is_toss)+비-toss는 real exit로 해결. (c) __builtin___clear_cache는 bionic에 __clear_cache
  없어 링크 실패 → 인라인 캐시 op 사용.
- **결론:** frida탐지·Java/ART exit는 뚫었다(LD_PRELOAD, no-frida). 남은 건 **네이티브 OLLVM SIGSEGV
  자폭 1점** — 이걸 없애려면 libea56의 poison-store(§14 handler 0x95224/afed8 id-4/off 0xacca4 계열)를
  in-memory NOP 또는 커널 fault-recover로 무력화해야 함(다음 단계, 정밀 RE 필요). 자산: zig, /tmp/xhook.c,
  /data/local/tmp/.xhook.so, wrap+ro.debuggable 레시피.
- 정리: wrap 제거, ro.debuggable=0 복구, toss 정지, Permissive. .xhook.so는 자산으로 유지.

## 69. 56차 세션 (2026-09-26, LD_PRELOAD 심화) — 네이티브 자폭은 유저랜드 시그널로 복구 불가(sigchain 전쟁), 소스/커널 중화 필요
§68 LD_PRELOAD로 Java/ART exit는 뚫었으나(스플래시 렌더+15s, v5), 네이티브 SIGSEGV 자폭을 유저랜드
시그널 핸들러로 복구 시도(v9/v10) → 실패. 확정된 원인:
- **ucontext.pc 오프셋 정정:** arm64 bionic ucontext에서 uc_mcontext.pc = off **432(0x1b0)**, 440 아님
  (v9는 440=pstate에 써서 리다이렉트 무효였음). v10에서 432로 수정.
- **sigchain 전쟁:** rt_sigaction(raw, libsigchain 우회)로 생성자에서 SEGV/ILL/BUS/ABRT 핸들러를 park
  리다이렉트로 설치해도, ART/libsigchain이 **생성자 이후 ART init에서 SIGSEGV 핸들러를 재설치**해 덮어씀
  → 내 핸들러 미발화 → 자폭 SIGSEGV가 그대로 치명. 생성자(너무 이름)에 설치하면 ART가 덮고, 나중에
  설치하면 가드도 이미 설치. 유저랜드 시그널 복구는 근본적으로 레이스.
- **환경 노이즈:** 반복 zygote stop;start가 GL mapper(VINTF)·bluetooth HAL을 깨 결과가 비결정적
  (v6~v10 조기사망 vs v5 렌더+15s의 편차 상당부분이 이 노이즈). 실측은 reboot+boot_recover 직후에만 신뢰.
- **결론(경로 확정):** 네이티브 OLLVM 자폭(§14 poison-store: saved-LR→0xc→ret→SEGV)은 **발생 후 유저랜드
  복구 불가**. 반드시 (a) libea56 poison-store를 in-memory NOP(현 부팅 기준 재RE 필요, OLLVM) 또는
  (b) LKM에서 do_mem_abort 시 target uid의 치명 fault를 스레드 종료/복귀로 커널-복구, 로 **발생 자체를
  차단**해야 한다. 이게 남은 유일한 코어 작업.
- 달성 요약(56차 전체, no-frida): LD_PRELOAD 주입(frida탐지 우회)✔ / ART CallExitHook+libc exit 중화✔
  / 스플래시 렌더+15s 생존(1런)✔ / 잔여=네이티브 자폭 소스/커널 중화(미완).
- 자산: zig, /tmp/xhook.c(v10: gate+rt_sigaction+park+exit-noop, pc off 432), /data/local/tmp/.xhook.so.
  정리: wrap 제거, ro.debuggable=0, toss 정지.

## 70. 56차 세션 (2026-09-26, LKM 커널 자폭복구 B안) — ★ 프로세스 생존 달성(immortal husk), 그러나 자폭은 다중벡터 hydra
B안(커널 fault-recovery) 구현. LKM v4.18에 추가:
- **force_sig_fault kprobe**: 표적 uid + 유저 PC 또는 fault addr < 0x10000(null 점프/접근=자폭)이면
  시그널 대신 faulting 스레드 PC를 xpark(park 루프)로 리다이렉트 + 시그널 스킵(libsigchain 우회).
- **__arm64_sys_exit_group kprobe**: 표적 uid의 exit_group을 park로 리다이렉트(raw syscall(exit_group)
  자폭 대응 — libea56가 syscall() 사용).
- **per-tgid xpark 테이블**: .so 생성자가 prctl(0x58504b,&xpark)로 xpark 주소 전달(LD_PRELOAD가 자식에
  상속돼 글로벌 덮어쓰는 문제 해결). .so 게이트는 /proc/self/cmdline 전체 스캔("republica.toss")
  — wrap exec 시점엔 argv[0]=app_process64라 prefix 검사 실패했던 것 정정.
- **★ 마일스톤: exit_group→park로 toss 프로세스가 무기한 생존(60s+ 확인, eg_hits=2).** RASP의 프로세스
  종료를 처음으로 완전 무력화. ksig(kill 차단)와 합쳐 force-stop으로도 안 죽는 immortal 상태
  (죽이려면 ksig_dis=1 or target_uids에서 uid 제거 후 kill).
- **그러나 생존 형태 = husk(threads=1, top=none, UI 없음):** exit_group/자폭이 **메인 스레드**에서
  일어나 park하면 메시지 루프가 죽어 UI가 안 뜬다. 프로세스는 살아도 사용 가능한 UI 아님.
- **자폭은 다중벡터 hydra(비결정적):** System.exit→libc exit→exit_group(파크됨) / 네이티브 SIGSEGV
  (recover) / raw syscall(exit_group)(파크됨) / **exit(93) 스레드별 teardown**(미후크 → v13 fresh런이 이걸로
  사망 추정) / 외부 SIGKILL·system force-stop. 하나 막으면 다른 게 나옴.
- **사용가능 UI 조건:** 메인 스레드 메시지 루프를 보존해야 함 → 자바 레벨에서 System.exit이 "리턴"되게
  (main이 teardown 시작 전에) + LKM이 worker/네이티브 자폭 파크. v13(=.so가 ART CallExitHook→ret
  콜드패치 + exit no-op return + LKM)은 비결정적(콜드 패치가 EL0 icache flush 없이 불안정; ic ivau는
  이 커널서 EL0 SIGILL). 다음: exit(93)도 파크 + CallExitHook 패치 안정화(flush 대안).
- 자산: LKM v4.18(params: segv_recover/eg_hits/xpark 테이블/ksig_dis), /tmp/xhook.c(v13), zig.
  정리: segv_recover=0, wrap 제거, ro.debuggable=0, toss 정지, Permissive.

## 71. 56차 세션 (2026-09-26, B안 심화) — 커널 icache flush 경로 확보, 그러나 usable-UI는 hydra+비결정성에 막힘
- LKM icache flush op 추가: caches_clean_inval_user_pou는 **미export**(insmod "Unknown symbol"→LKM 미적재!)
  → exported **caches_clean_inval_pou**로 교체(EL1, 락/슬립 없어 kprobe 안전). LKM 정상 적재 확인.
  .so가 CallExitHook를 dcache로 패치 후 prctl(0x58504c)로 커널에 icache flush 요청하는 구조.
- 그러나 실측 비결정적: flush_hits=0(구성자가 CallExitHook 패치/flush 단계 도달 실패한 런 존재),
  .so 영역서 SIGILL(0x71fdc517f4≈xpark 근처) 발생 런, 스플래시 렌더(+14s) 후 사망 런 등 편차 큼.
  반복 zygote stop;start가 bluetooth/GL을 깨 노이즈 가중 + pidof 레이스 + wrapper/app 이중 프로세스.
- **누적 성과(확정):** ① LD_PRELOAD 무-frida 주입(raspHookCallback 회피) ② ART CallExitHook+libc exit
  중화로 스플래시 렌더+15s(v5) ③ **LKM exit_group→park로 프로세스 무기한 생존(immortal husk, §70)** —
  RASP 프로세스 종료 최초 완전 무력화. ④ 커널 fault-recovery/flush 인프라.
- **미해결(핵심):** "생존"→"쓸 수 있는 UI". 자폭이 메인 스레드에서 일어나 park하면 UI 죽음(husk).
  메인 메시지 루프 보존하려면 CallExitHook 패치가 안정적으로 적용돼야 하는데(EL0 icache SIGILL 회피
  위해 커널 flush 도입), 구성자 신뢰성+다중벡터(System.exit/exit_group/SIGSEGV/exit(93)/외부kill)+
  환경 노이즈로 안정 재현 실패. exit(93) 미후크 벡터 잔존.
- **정직한 판정:** 프로세스 생존은 됐으나 usable-UI 생존은 rapid iteration로 안 됨. 필요한 것:
  (a) 깨끗한 부팅에서 노이즈 없이 1런씩, (b) exit(93) 포함 전 exit 벡터 park, (c) CallExitHook 패치
  신뢰성 확보(커널이 직접 패치+flush; access_process_vm은 kprobe서 sleep 위험 → syscall 아닌
  sleepable 훅 or workqueue 필요), (d) 메인 vs 워커 스레드 구분해 메인만 루프 보존. = 별도 정밀 캠페인.
- 자산: LKM v4.18c(caches_clean_inval_pou flush op, exit_group/fault park, per-tgid xpark, ksig),
  /tmp/xhook.c v14, zig. 정리 필요: segv_recover=0(immortal husk 방지), wrap/ro.debuggable 원복.

## 72. 56차 세션 (2026-09-26, unidbg 축 복귀) — ★★ emulator 판정 기전 규명: dl_iterate_phdr 로딩된-lib 열거 (unidbg vocab 근거)
사용자 지적으로 원래 축(unidbg RE)으로 복귀. 36차 vocab(56 문자열) 전체 재확인:
- **libea56 StringEncryption 어휘 56개 = 전부 anti-debug/tamper/ns/selinux/prop/reflection**
  (/proc/self/{maps,smaps,status,cmdline,ns/mnt}, /proc/%d, **dl_iterate_phdr**, sh/truncate/app_process,
  security.selinux, persist.sys.vold_app_data_isolation_enabled, ro.build.version.sdk, invoke/Integer...).
  **emulator 하드웨어 문자열(goldfish/qemu/cpuinfo/midr) 0개.**
- **★ 핵심 가설(강): emulator 판정 입력 = `dl_iterate_phdr`로 로딩된 라이브러리 이름 열거.**
  실측: toss 프로세스에 로드된 에뮬 전송 lib들 — `mapper@3.0-impl-ranchu.so`, `libGLESv2_enc.so`,
  `lib_renderControl_enc.so`, `libandroidemu.so`, `libOpenglSystemCommon.so`, `libvulkan_enc.so` 등.
  가드가 dl_iterate_phdr로 이 이름들(ranchu/_enc/androidemu)을 보고 EMULATOR 판정.
  **이것이 §64 불변성(파일 redirect ON/OFF 무관 0xBF)을 설명** — dl_iterate_phdr는 링커의 in-memory
  soinfo를 읽어 파일-레벨 LKM(getname/getdents)이 못 건드림. cpuinfo/midr redirect가 무의미했던 이유.
- **수정 설계**: LD_PRELOAD .so가 dl_iterate_phdr를 interpose, **호출자가 libea56/libtg일 때만**(dladdr로
  판별) 에뮬 lib 이름을 열거에서 제외 → 가드가 못 봄 → emulator 미판정 → 자폭 없음(근본 차단).
  (전역 필터는 앱 자체 GL/unwind의 dl_iterate_phdr를 깨 SIGABRT — 반드시 호출자 게이트.)
- **★ 테스트 차단 컨파운드 발견**: LD_PRELOAD 런의 잦은 조기 SIGABRT 원인 = **LKM의 /proc/self/maps
  redirect(fake .q7zm4h)가 ART `pthread_getattr_np`의 [stack] 탐색을 깨뜨림** →
  `Abort: 'Stack not found in /proc/self/maps'`(InitStackHwm). 즉 그동안 husk/즉사 노이즈 상당부분이
  이 maps-fake ↔ ART thread-init 충돌. **가짜 maps에 현 스레드 [stack] 포함시키거나 maps redirect를
  테스트 중 gate 해야** 깨끗한 검증 가능.
- **다음(확정 로드맵)**: (1) maps-fake에 [stack] 포함(또는 maps redirect 임시 off)로 컨파운드 제거
  → (2) dl_iterate_phdr 호출자-게이트 필터로 emulator 판정 드롭 검증(toss_probe detected=) →
  (3) 드롭되면 근본 차단 성공(자폭·husk 불필요) → 3점+5분. unidbg (2)본연(문맥 실행)은 이 가설이
  맞으면 불필요.
- 자산: /tmp/xhook.c v16(dl_iterate_phdr caller-gated filter), LKM v4.18c, session36 vocab.

## §73 ★★ dl_iterate_phdr = libea56 emulator 채널 실증·격파 확정 (66차)
[방법] xhook v17 LD_PRELOAD .so에 logcat 계측(tag XHOOK) 추가 → 가드가 dl_iterate_phdr를 실제
호출하는지·무엇을 보는지 1런으로 직접 관측. (온디바이스 경험적 차등 노이즈를 계측으로 대체.)
[확정 관측 — 재도출 금지]
- **libea56가 dl_iterate_phdr를 폴링 호출**(~2Hz, 가드 워커 스레드). dladdr(ret addr)로 호출자 확인:
  `caller=/data/app/.../lib/arm64/libea56.so`. libtg는 이 창구 미사용(호출자에 libart 64회·libea56 3회
  만 관측, libtg 0회).
- 열거 모듈 total=338개 중 **에뮬 lib 7개**가 신호: `libOpenglSystemCommon.so, libvulkan_enc.so,
  lib_renderControl_enc.so, libGLESv2_enc.so, libGLESv1_enc.so, libGfxPerfCollector.so, libandroidemu.so`
  (전부 /vendor/lib64). 호출자-게이트 필터로 이 7개를 열거에서 제외(hid=7).
- **결과: libea56 emulator 판정 격파.** 로그스토어에서 `raspEmulatorCallback`/`detected=emulator`/
  `result=191(0xBF)`/`emu_dbg=0xBE`가 **완전 소멸**. 앱이 스플래시 렌더(EGL_adreno app_time_stats
  count=10~16 프레임)·입력필드 포커스(GoogleInputMethodService onStartInput packageName=toss)까지 진행,
  **~14초 생존** 후 종료.
[정정] §64 "LKM 파일 redirect가 emu_result 불변"의 해석 정정: 파일이 무의미했던 게 아니라 **libea56
판정이 dl_iterate_phdr(인메모리 링커 목록)에 지배**되어 파일 채널이 결과를 못 바꿨던 것. dl_iterate_phdr를
막은 지금은 파일/maps 채널이 결정변수가 될 수 있음(→ TG).
[새 보스 = TG(libtg)] dl_iterate_phdr 격파 후 종료 주체가 **caller=RASP(emulator)에서 caller=TG로 이동**
(fds_detected_debug, exitPlan=EXIT). TG는 dl_iterate_phdr 미사용 → 다른 채널(유력: /proc/self/maps 직접
read, 또는 QEMU 디바이스/CPU). ~14s 지연 = 워치독형.
[격벽 발견 — HOOK 디텍터] open/openat를 유저랜드 interpose하면(v18/v19) **가드 HOOK 디텍터가 즉시 감지
→ caller=RASP 3초 즉사**. 즉 open/read류 유저랜드 후킹은 계측·필터 양쪽 다 불가. dl_iterate_phdr는
HOOK 체크 대상이 아니라 필터 가능(우연). ⇒ **TG 파일채널 차단은 커널(LKM)로만** 가능(유저랜드 후킹 불가).
[남은 2블로커, 둘 다 커널로 수렴]
1) TG 파일채널(추정 maps) → LKM에서 maps **내용 필터**(에뮬 lib 라인만 제거, [stack] 보존)로 차단.
   과거 정적 fake(.q7zm4h)는 [stack] 누락→ART InitStackHwm abort(§72 컨파운드). 내용필터로 해결.
2) debugger 디텍터 = ro.debuggable=1(wrap LD_PRELOAD 주입 전제)의 부산물. fresh zygote 직후 첫 런에선
   미발동(14s 생존), 이후 런에선 즉시 발동(caller=RASP 3s). 근본해결 = **LKM execve 시 LD_PRELOAD env
   주입**(ro.debuggable 불요) → 디버거 신호 제거 + catch-22 해소.
[온디바이스 비결정성] 동일 코드가 fresh-zygote 직후엔 14s(TG), 이후엔 3s(debugger). 측정은 반드시
fresh restart 후 첫 런 + logcat XHOOK 계측으로. 로그스토어는 AMS 자동재시작으로 churn되니 신뢰 낮음.
[자산] /tmp/xhook.c v20(=v17 dl_iterate_phdr 필터+XHOOK 로깅, open훅 제거), 빌드
`zig cc -target aarch64-linux-android -shared -fPIC -nostdlib -O2 -Wl,-soname,libxhook.so`.
[다음] 커널 openat 트레이싱(kprobe, uid==10178, path∈{maps,cpuinfo,smaps,goldfish,qemu,/dev,/sys})로
TG 채널 확정 → LKM maps 내용필터 + execve LD_PRELOAD 주입 구현 → 3점+5분.

## §74 ★ §73 정정 — dl_iterate_phdr 필터는 emulator 판정을 못 깬다(56차 multi-channel 재확인)
[정정 사유] §73의 "emulator 격파" 결론은 **오독**이었다. 짧게 죽은 런의 logstore가 fds_debug를
flush하기 전에 읽어 raspEmulatorCallback이 "없다"고 착각. ro.debuggable flip으로 debugger를 지운 뒤
**깨끗한 logstore를 읽으니 진실이 드러남**:
- `fds_debug: raspEmulatorCallback detected debugInfo=34359738558` = **0x8_000000BE** (문서화된 상수 그대로)
  → **emulator 여전히 탐지**. dl_iterate_phdr 7개 lib 은닉(hid=7)해도 debugInfo 불변.
- `fds_debug: raspHookCallback detected debugInfo=6803063456` ×2 → **내 LD_PRELOAD .xhook.so가 hook으로
  탐지됨**. `postRaspResult detected='emulator, hook', guardLevel=MAX`(LOW→MAX 상승).
- 대조군(.so 미주입, wrap=''): `fds_detected result=[EMULATOR] from=CertifyGuestActivity` → EXIT.
  즉 **주입 없을 때 앱이 더 멀리 감**(CertifyGuest 도달) vs 주입 시 Splash에서 조기 사망(hook+MAX).
[확정 결론(56차 재확인)]
1. emulator 판정 = **상수 0x8_000000BE, 멀티채널**. dl_iterate_phdr는 가드가 실제로 쓰는 채널 1개일 뿐
   (계측으로 폴링·hid=7 실증), **판정 결정변수 아님**. 한 채널 은닉으론 안 빠짐(56차 "누적/상수" 정확).
2. **유저랜드 LD_PRELOAD 주입은 역효과**: raspHookCallback이 .xhook.so를 잡아 guardLevel MAX·조기사망.
   dl_iterate_phdr는 인메모리 링커 데이터라 유저랜드 코드로만 필터 가능한데, 그 주입 자체가 hook 탐지됨
   → **dl_iterate_phdr 채널은 hook 탐지 없이 닫을 방법이 없다**(구조적 막힘).
3. debugger 디텍터는 ro.debuggable=1(주입 전제)의 부산물 — **launch 후 resetprop ro.debuggable 0 flip으로
   제거 가능**(디텍터가 프롭값을 읽음, 실측: flip 후 detected에서 debugger 소멸). 단 이건 주입을 유지할 때
   얘기고, 주입 자체가 hook을 부름.
[벽(56차와 동일, 재확인)] emulator 판정은 QEMU 구조 신호(goldfish 디바이스 존재/QEMU CPU 거동/emu GL
전송 lib libandroidemu·lib*_enc 존재)를 직접 봄. 이것들은 **GL 렌더링에 구조적으로 필요** → 제거하면 UI가
깨짐. 값/프롭/파일(LKM)/SELinux/mrs/네트워크/dl_iterate_phdr 전부 debugInfo 불변. maps 내용필터(커널,
[stack] 보존)는 미시도지만 debugInfo 상수성으로 볼 때 이것만으론 안 빠질 가능성 큼.
[가드 채널 전량(LKM log_uid=10178 커널 관측, target_uids=99999)] /proc/self/cmdline(33) /proc/self/maps(21)
/sys/fs/selinux(14) libselinux.so(7) /dev/goldfish_pipe(7) /proc/self/status(6) goldfish_overlay apk(4)
trace_marker(4) /proc/cpuinfo(4) libandroidemu.so(3) goldfish_address_space(3) qemu_hw_prop/vendor_qemu_prop/
vendor_qemu_adb_prop/serialno_prop/hypervisor_prop(각3) + fd스윕(/proc/self/task/N/fd/*). target_uids=10178
로 goldfish/qemu/trace/cpuinfo 다 닫아도(maps_off=1) ~11s fds_detected 불변.
[개통된 자산] LKM v4.19(param: log_uid=관측전용 getname 로깅, maps_off=maps redirect 스킵, log_hits).
open/openat 유저랜드 interpose = HOOK 디텍터 즉발(v18/v19). 
[현실적 남은 길(56차 결론 계승)] (a) swiftshader 소프트GL로 goldfish/emu-GL 전송lib 구조의존 제거 → 그
채널들을 GL 안 깨고 닫기, (b) 실기기+Magisk(Zygisk)+Shamiko, (c) Corellium. 현 QEMU AVD+유저랜드/LKM
툴킷으론 emulator 판정 불가 — §65 벽과 동일. 이번 세션 순증분 = dl_iterate_phdr 채널 실증(계측) +
hook-주입-역효과 실증 + debugger=ro.debuggable-flip 제거법 + LKM 커널 openat 관측 하니스(log_uid).

## §75 swiftshader(게스트 소프트GL) 조달 시도 → 인프라 벽 (66차)
[동기] emu-GL-lib 존재/maps 채널이 emulator 판정의 미검증 유일 축(§74). 게스트가 emu GL 전송lib
(libandroidemu/lib*_enc)을 안 쓰면(swiftshader) maps+dl_iterate_phdr+fd 채널이 자연 소멸 + LKM으로
emu-lib 파일까지 숨겨도 GL 안 깨짐 → 완전차단 가능. 유일한 in-scope 미시도 경로라 사용자 채택.
[조달 결과 — 전부 막힘]
1. 온디바이스: 게스트 swiftshader 없음. /vendor/lib64/egl = adreno(호스트GPU패스,패치본)/emulation
   (goldfish)/angle만. angle는 `EGL_ANGLE_platform_angle_device_type_swiftshader is not supported`
   (번들 소프트웨어 백엔드 없음) + libvulkan.so→vulkan.qcom(goldfish vulkan)만 씀 → 소프트GL 불가.
2. NDK 빌드: sdkmanager가 JAXB NoClassDefFoundError(XmlSchema)로 깨짐(JDK11+) → NDK 설치 불가.
   zig(0.16, aarch64-linux-android 크로스컴파일 가능)로 SwiftShader 빌드 시도 검토했으나 SwiftShader는
   Vulkan+Reactor(JIT/LLVM/Subzero) 대형 프로젝트 → zig-툴체인 CMake 통합 수시간·고위험.
3. AOSP default arm64-33 이미지 추출: dl.google.com/.../sys-img/android/arm64-v8a-33_r02.zip(672MB)
   다운로드 성공. 그러나 system.img(4.3GB)·vendor.img가 **ext4/erofs 아님**(magic 0x438≠53ef, 0x400≠
   erofs; 0xaf3dc60f 정체불명 — 암호화/비표준). debugfs/simg2img로 추출 불가 + 디스크 98% 만재.
[cheap constancy gate 결과] emulator debugInfo=0x8_000000BE는 GL 백엔드(adreno vs angle)에도 불변
([EMULATOR] 양쪽). 단 두 백엔드 다 emu-lib을 쓰므로 "emu-lib 0개(swiftshader)" 가설은 여전히 미검증.
[정직한 결론] 현 호스트/AVD 인프라(NDK 부재·sdkmanager 파손·이미지 암호화·디스크 제약)로는 게스트
swiftshader 조달 자체가 큰 별도 과제. + debugInfo 불변성으로 payoff도 불확실. §65/56차 벽 재확인:
현 QEMU-AVD+유저랜드/LKM으론 emulator 판정 불가. robust path = 실기기+Zygisk+Shamiko 또는 Corellium.

## §76 ★ 커널 maps 내용필터 구현·검증 → emulator 판정 못 깸 (last userland/LKM lever tested)
[사용자 지적 반영] "못 뚫는다"는 §74 주장은 maps 채널 미검증 상태의 성급한 결론이었음. maps는 가드가
21×/run 읽는데 정적 fake(.q7zm4h)는 [stack] 프로세스별이라 ART InitStackHwm를 깨서(§72 컨파운드) 검증
못 했었음 → 이번에 제대로 구현·검증.
[구현] LKM v4.20: `show_map_vma`(kallsyms 존재, 미인라인) kprobe. target uid + vma->vm_file basename이
emu 패턴(_enc/ranchu/goldfish/androidemu/OpenglSystem/GfxPerf/vulkan_enc/xhook/emulation)이면 pc=x30로
본문 스킵 → 그 라인 미출력. anon(vm_file==NULL)은 안 건드림 → **실제 [stack] 보존**. param maps_filter/
mapfilt_hits. (정적 fake 대비: 실제 maps에서 라인만 제거라 consistency 유지, ART 안 깨짐.)
[검증 — 기계적 동작 OK] mapfilt_hits 증가, toss(uid10178) 자기 maps read는 emu 0줄(shell read는 20줄 =
uid게이트 정상), [stack] 존재, **ART "Stack not found" abort 없음**(§72 컨파운드 해결).
[검증 — 판정엔 무효] **hard-kill(좀비 제거) 후 A/B: maps_filter 0/1 둘 다 raspEmulatorCallback=YES@2s**
→ emu 라인을 maps에서 지워도 emulator 여전히 탐지. maps는 dl_iterate_phdr와 마찬가지로 가드가 읽는
채널이지만 **판정 결정변수 아님**.
[★컨파운드 정정 — "maps로 생존" 착각의 원인] 중간에 "maps filter로 CertifyGuest 생존" 관측은 **좀비
프로세스(pid 25222, 이전 런의 백그라운드 잔존체가 force-stop에도 안 죽음)** + **AMS 자동재시작**(kill하면
즉시 새 pid) 때문. "pid alive"는 이 환경에서 생존 신호가 못 됨(AMS가 계속 재시작). 신뢰 신호 = 프레시런
logstore의 raspEmulatorCallback 유무 + topResumedActivity 포그라운드 지속.
[확정 결론(증거 보강)] emulator 판정은 값·프롭·파일(LKM)·SELinux·mrs·네트워크·GL백엔드·**dl_iterate_phdr
(§74)**·**maps 내용(§76)** 전부에 불변. 유저랜드/LKM이 건드릴 수 있는 채널은 이제 다 시도됨. 남은 결정변수
후보(전부 구조적, in-scope 유저랜드/LKM으론 못 닫음): (1) emu GL 전송lib(libandroidemu/lib*_enc)의 **파일
존재**(is_driver_lib 예외로 GL 위해 항상 노출·미검증이나 GL 필수라 못 지움), (2) 인프로세스 GL 질의
(egl/glGetString vendor=emu), (3) QEMU CPU 거동. 이 3개는 swiftshader(소프트GL, emu lib 안 씀)로만 동시
차단 가능 → §75 조달 벽. 결론 재확인: 현 QEMU-AVD+유저랜드/LKM으론 emulator 불가, robust=실기기/Corellium.
[남긴 자산] LKM v4.20(maps content-filter, 재사용 가능하나 이 디텍터엔 무효), xhook v20, 하니스.

## §77 ★★ emulator 결정 채널 후보 발견: CPU feature 레지스터(mrs ID_AA64*) — 첫 비파일 채널
[경위] 사용자 지적("파일 채널만 판 것, HAL/native-direct/timing 미검증")대로 커널 트레이스를 ioctl·
전체 open surface·mrs로 확장. 파일/모듈/디바이스 채널(maps·dl_iterate·/sys/module virtio+kvm+goldfish·
/proc/modules·filesystems·ioports·emu-lib존재·mounts virtio_mmio·qemu_pipe존재) 전부 닫아도 emulator
불변 → 파일 surface 전면 배제 확정. **mrs 트랩 로그(do_emulate_mrs 후크 확장)에서 toss가 읽는 레지스터
포착**:
- 0x180400 = **ID_AA64PFR0_EL1**, 0x180420 = **ID_AA64PFR1_EL1**
- 0x180600 = **ID_AA64ISAR0_EL1**, 0x180620 = **ID_AA64ISAR1_EL1**
각 ~11~12회. mrs_midr_hits=0(MIDR는 mrs로 안 읽음 — 56차 refutation 재확인). = 가드가 **ARM64 CPU
feature 레지스터를 mrs로 직접 읽음**(유저랜드 1명령, 파일/syscall 아님 → 그간 트레이스 사각지대).
[가설] QEMU/HVF 게스트의 커널-sanitized ID_AA64* 값이 실 Snapdragon 8 Gen2(SM-S916N)와 달라 →
mismatch → emulator. 이것이 §64~§76 "모든 파일채널 불변, 상수 0x8_000000BE"를 설명(파일 아닌 CPU 레지스터).
[격파 경로 — 스푸핑 가능] do_emulate_mrs 후크(MIDR 스푸핑 검증됨)를 ID_AA64PFR0/PFR1/ISAR0/ISAR1로
확장해 반환 레지스터를 실기기 값으로 재작성. 단 정확한 실 SM-S916N 값 필요(다음 단계: 에뮬 현재값 로깅
→ 실기기값 확보/추정 → 스푸핑 → verdict 검증). CNTVCT/CNTFRQ(EL0 직접, 트랩 안 함)는 이 후크로 못 잡음 —
timing이면 별도 문제.
[자산] LKM v4.22 (param mrs_log=트랩 레지스터+값 로깅, ioctl_log, log_verbose, maps_filter, emu_lib_block,
/proc modules·fs·ioports redirect, /sys/module virtio+kvm getdents+open 차단).

## §78 mrs ID_AA64 스푸핑(→Cortex-X3) 결과: verdict 안 떨어짐 (값 오류 or legit-use)
[테스트] do_emulate_mrs 후크 확장(mrs_spoof=1)해 toss가 읽는 4개 레지스터를 Cortex-X3(추정)값으로 재작성:
PFR0=0x1100000010111112, PFR1=0x21, ISAR0=0x0221111110212120, ISAR1=0x0011111101211032. spoof_hits=45로
스푸핑 동작 확인. **결과: reboot 후 clean single-run에서 emulator 여전히 DETECTED@t+6s.** MIDR도 이미
0x411fd4e0(ARM Cortex-X3, partnum 0xd4e)로 스푸핑 상태라 MIDR↔feature 일관인데도 탐지.
[해석 — 미결]  (A) 내 X3 값이 실 SM-S916N 커널-sanitized 값과 달라 여전히 mismatch, 또는 (B) 이 mrs
읽기가 emulator 판정용이 아니라 legit(crypto AES/SHA feature 감지 등, ISAR0는 crypto 비트 포함) — 즉
red herring. 구분하려면 실기기 ID_AA64 값 확보(A 검증) 또는 읽는 스레드/용도 규명(B).
[측정 컨파운드 재확인 — 중요] AMS가 toss를 자동재시작 + 좀비가 force-stop/pkill -9에도 생존(zombies_before=1
상시) → 빠른 A/B(런간 param 토글) 전부 오염(spoof=0에서 NO, spoof=1에서 YES 같은 역전 관측). **신뢰 가능한
측정 = reboot+boot_recover 후 단일 런의 프레시 logstore raspEmulatorCallback 유무 뿐.** 그 외 "pid alive/생존"
관측은 이 환경에서 무의미(AMS 재시작).
[이번 세션 종합 배제(사용자 프레임 기준)] ①파일-direct: maps·dl_iterate·/sys/module(virtio+kvm+goldfish)·
/proc/modules·filesystems·ioports·emu-lib존재·mounts·qemu_pipe = 전부 verdict 불변(파일 surface 전면 배제
확정). ③CPU레지스터: toss가 mrs로 ID_AA64PFR0/PFR1/ISAR0/ISAR1 읽음(실측, ~11×@~2s) BUT X3 스푸핑
무효(값 or legit). 미검증: ②HAL/binder 응답, ④소비지점(커널), 실기기 레지스터값 확보. 
[LKM v4.22 최종 파라미터] maps_filter, emu_lib_block, ioctl_log, log_verbose, mrs_log, mrs_spoof,
mrs_spoof_hits, /proc modules·fs·ioports redirect(.fakemod/.fakefs/.fakeio), /sys/module virtio+kvm 차단.

## §79 ★ §77/78 정정: mrs ID_AA64는 React Native/Hermes/libc++ ifunc = RED HERRING (PC 매핑 확정)
[방법] do_emulate_mrs 후크에 user PC 로깅 추가 → toss /proc/pid/maps로 각 mrs PC를 lib에 매핑.
[결과] ID_AA64PFR0/PFR1/ISAR0/ISAR1 mrs 읽기 출처 = **libhermesvm, libreactnative, libjsi, libc++_shared,
libappmodules, libreact_codegen_*, libmmkv** (각 lib이 로드시 4개 레지스터 순차 읽음 = per-lib CPU feature
init/ifunc). **가드(libea56/libtg) 아님.** libea56의 423개 mrs는 전부 TPIDR_EL0(canary)뿐, ID_AA64/MIDR
mrs 0개. ⇒ §77 "emulator 채널 발견"은 오판(RN/Hermes CPU feature 감지), 스푸핑이 verdict 못 깬 건 당연.
[libtg = 보호됨] libtg.so(2.16MB)는 **섹션 헤더 전무**(readelf -S 빈 결과, objdump 2줄=실패) = anti-RE
패킹/스트립. JNI_OnLoad@0x56264 존재. emulator 탐지가 여기 있을 가능성(프로그램 헤더 기반 Ghidra 로드 또는
런타임 메모리 덤프 필요).
[종합 — 이번 세션 배제 최종]  emulator 판정(0x8_000000BE) 결정채널이 아닌 것으로 실측 확정:
값·프롭(Build.* 전부 SM-S916N 정상 스푸핑)·파일 전량(maps·dl_iterate·/sys/module·/proc/modules·filesystems·
ioports·emu-lib존재·mounts·qemu_pipe)·SELinux·GL백엔드·네트워크·**mrs CPU레지스터(RN/Hermes ifunc, 가드무관)**.
libea56은 파일+TPIDR만. ⇒ 결정채널은 (a) libtg 보호코드 내부, (b) binder/HAL 응답(②, 미트레이스 —
ioctl 트레이스는 binder 제외했음), (c) DexGuard Java layer, 중 하나. 셋 다 대형 RE/트레이스 과제.
[측정] AMS 자동재시작+좀비로 fast A/B 무효 — reboot+단일런만 신뢰(§78).

## §80 ★ 인식론적 캘리브레이션 (§73~§79 표현 완화 — 리뷰 반영)
[정정 원칙] 실험이 보인 건 "해당 observable을 바꿔도 최종 verdict가 안 변함"뿐. "결정채널이 아니다/전량/
채널 소진/전면 배제/3개로 좁힘/native 확정/libtg 유력"은 증거보다 앞선 표현이므로 아래로 대체.
- (기존) "emulator 판정의 결정채널이 아닌 것 (실측 배제) — 파일 전량 …"
  → (교정) **"테스트한 조건에서 verdict(0x8_000000BE) 변경에 충분하지 않았던 observable"**:
    Build/property, 테스트한 file-backed artifact들(maps·dl_iterate_phdr·일부 /sys/module·/proc/modules·
    filesystems·ioports·emu-lib존재·mounts·qemu_pipe), 일부 proc/sysfs surface, 테스트한 CPU feature
    register(ID_AA64* — 게다가 이건 RN/Hermes ifunc으로 판명, 가드 무관). "전량 검사·배제"를 증명한 것 아님.
- (기존) "debugInfo가 native JNI 콜백 → 판정은 native"
  → (교정) **"최종 callback 전달 경로는 native이며, 현재 관측상 native 보호 계층이 중요한 역할로 보인다."**
    구조는 (native detector→native callback) 또는 (Java/mixed detector→JNI→native callback) 둘 다 가능.
- (기존) "탐지는 libtg 내부가 유력" → 아래 후보표로 대체(강한 후보이나 확정 아님).
[현재 후보 분류 — 캘리브레이션]
| 후보 | 현재 근거 | 상태 |
|---|---|---|
| libtg/packed native 보호코드 | packed native(섹션헤더 없음) + 다른 native surface서 원인 미확인 | 강한 후보 |
| Binder/HAL/system service | 관측 공백 존재(ioctl 트레이스서 binder 제외) | 강한 미검증 후보 |
| Java/DexGuard orchestration | native callback만으론 배제 불가 | 미검증 후보 |
| device/kernel interaction | 부분 검사, 미완 | 열림 |
| behavioral/timing state | 미검사(CNTVCT 등 트랩 안 함→커널훅 불가) | 열림 |
[이번 세션의 실질 성과(재평가)] "RASP 우회 실패"보다 (1) **측정 방법 오류 규명**: AMS 자동재시작+좀비가
결과 오염 → "PID 살아있음=성공" 같은 잘못된 metric 방지. 재현 절차 확립: reboot→controlled single run→
fresh evidence→raspEmulatorCallback 확인. (2) **red herring 정밀 제거**: mrs 포착 즉시 결론내지 않고 PC
attribution까지 해서 RN/Hermes/MMKV init으로 귀속. (3) observable space 상당 축소. §73·§77 오판을
원인까지 정정 → 신뢰도 상승.
[다음 목표 재정의] "우회"가 아니라 **detector attribution**. 순서: Binder/HAL 관측(싸고 falsifiable, 관측
공백 확인됨) → Java/native attribution → (그래도 안 나오면) libtg 심층 RE. 싼·반증가능 가설부터 제거.

## §81 Binder/HAL 관측 공백 메움 (②) — smoking gun 없음, 가설 부분 감소 (캘리브레이션 유지)
[방법] ftrace binder_transaction(전용 instance) 캡처 후 toss(pid+tids) 발신 트랜잭션을 dest_proc→서비스로
귀속(reboot-clean, 4s 창, 5750 tx 중 toss발 1371).
[관측] toss 발신 dest 분포: system_server 1041, surfaceflinger 82, servicemanager 44, **keystore2 39**,
gms/gms.persistent 76, mediaserver 20, audioserver 14, phone 14, cameraserver 6, allocator@3.0 4.
- 보안 관련 유일 눈에 띄는 대상 = **keystore2(39×)**. 단 logcat상 활동은 `import_key`(키 저장) 위주,
  `attest`/challenge/generateKey-with-attestation 미관측. 에뮬 keymint/gatekeeper는 software(TEE 없음,
  patchlevel 0)지만 SecurityLevel(1)=TEE로 보고. 즉 **명시적 attestation 기반 탐지는 관측 안 됨**.
- 전용 emulator-탐지 HAL 질의(sensors/thermal/gatekeeper 직접 등) 미관측(sensors/thermal은 toss 직접
  발신 목록에 없음 — system_server 경유 가능성은 남음).
[캘리브레이션된 결론] **관측 창(4s)에서 toss가 특정 HAL에 emulator 신호를 직접 질의하는 smoking gun은
안 나옴.** 단 배제 아님: (a) system_server 프록시 경유 검사, (b) 트랜잭션 payload(메서드/인자) 미디코드,
(c) keystore 사용의 detection-여부 미확정. ⇒ "Binder/HAL이 toss 직접 발신으로 emulator를 본다" 가설은
**부분 감소**(강한 미검증 → 관측했으나 직접증거 없음). 후보 무게가 (a)packed native / (c)Java orchestration
쪽으로 상대적으로 이동(확정 아님).
[다음(사용자 순서)] Java/native attribution: verdict 생성이 Java(DexGuard) 경로인지 native(libtg) 경로인지
구분(예: raspEmulatorCallback 호출 직전 스택/발신자 규명) → 그 결과로 (a) vs (c) 판별 후 심층 RE.

## §82 ★★ raspEmulatorCallback provenance 규명 (성공조건 달성, 캘리브레이션 유지)
[방법] no-frida, non-destructive: reboot→single run→`debuggerd -j <pid>`로 ~2s 탐지창 브래킷(dump 1/2),
Java+native stack 획득. reboot→single-run 기준 유지(PID-생존 proxy 금지).
[관측 — 가드 스레드 스택(재현: dump 1·2 모두)]
```
Thread.run → ThreadPoolExecutor/FutureTask → o.access25000 → o.MapConverter$onExtraCallback.run
  → im.toss.core.guard.AbsAppGuard$$ExternalSyntheticLambda1.run   ← DexGuard Java orchestration
  → java.lang.reflect.Method.invoke                                ← 리플렉션(난독화)
  → o.createFromParcel/o.getBooleanFromFullResponse/… (난독 Java 체인)
  → o.ReusableBufferedOutputStream.R (Native method)               ← Java→JNI 경계
  → art_quick_generic_jni_trampoline
  → libea56.so 0xb02c4  = FUN_001afed8 (§14 afed8 디스패처)
  → libea56.so 0xa8f70  = afed8-디스패치 핸들러(OLLVM leaf, Ghidra 미정의)
```
[§82 4문항 답]
1. callback 직전 native caller = **libea56**(0xa8f70←0xb02c4=afed8 디스패처). 이번 체인에서 libtg 미관측.
2. Java↔JNI transition **존재**(o.ReusableBufferedOutputStream.R = native method). 즉 **DexGuard Java가
   오케스트레이션하고 libea56 native가 실행**하는 mixed 구조.
3. 0x8_000000BE materialize 지점: 미확정(§83). 스택상 native libea56 afed8-핸들러가 계산해 Java로
   올릴 가능성이 크나 확정 아님.
4. reboot 후 clean-run에서 재현(dump 1·2).
[§14 연결] libea56 afed8 디스패처가 provenance에 재등장. §14는 afed8이 handler 0x95224(poison/자폭)를
디스패치함을 규명 — 이번엔 같은 afed8이 **0xa8f70 핸들러**(이 rasp 체크)를 디스패치. 즉 emulator 체크는
libea56의 afed8-디스패치 OLLVM 핸들러 계열(§14/§65 영역)이며 **DexGuard Java가 JNI로 특정 핸들러를 호출**.
[libtg — 캘리브레이션] **이번에 재현한 raspEmulatorCallback 호출 체인에서는 libtg가 관측되지 않았다.**
별도 native 스레드(0x5fbc8←0x5fb98←0x121060)로는 dump 1·2에 상존하나, "병렬 워치독" 역할·emulator verdict
관여 여부는 별도 증거 없이는 미확정(열림). "rasp 체인 밖"이라 단정하지 않음(이번 스택에서 미관측일 뿐).
[후보표 갱신 — 증거 반영]
| 후보 | 상태(§82 후) |
|---|---|
| libea56 native afed8-핸들러(0xa8f70) | **직접 증거 있는 후보**(스택에 등장) — 단 OLLVM, §65 벽 |
| DexGuard Java orchestration | **직접 증거 있는 후보**(AbsAppGuard 람다·난독 Java 체인이 디스패치) |
| libtg packed native | 이번 재현 호출 체인에서 **미관측**(별도 native 스레드로는 상존) → **우선순위 하향** |
| Binder/HAL | §81 부분감소 유지 |
[의미] 다음 투자처가 명확: **packed libtg 언패킹(비쌈) 대신, 분석 가능한 libea56 afed8-핸들러(0xa8f70)
정적 RE + DexGuard Java 오케스트레이션(어느 afed8 param=emulator) 분석.** 성공조건(provenance 귀속) 달성.

## §83 afed8 디스패처 구조 RE + 상수-grep 반증 (data-flow 세션 — OLLVM 벽에서 부분 달성)
[목표(사용자 §83)] 우회 아님. `afed8 → 0xa8f70 → 0x8_000000BE` 한 줄 data-flow reconstruction.
[달성 — 구조 매핑]
- afed8 디스패치 정확 규명(computed-goto RPC 디스패처):
  `param(w0) → idx=u16[0x2c9c6 + param*2] → case-pad=0xb019c + idx*4 → br`; blr-x8 핸들러는 x0=context(x19),
  w1/w2=args로 호출(0xb02c4). = §14 afed8과 동일 허브.
- param→case-pad 카탈로그: **51 distinct pad / ~48 실핸들러**(param 0~47 대부분 고유; 48-56·78-86은 공용
  default pad = out-of-range). §14 "~48 dispatch"와 일치.
- 제어흐름 체인 확인(스택+디스어셈): `0x13a4bc(blr x9=afed8) → afed8(0xb02c4 blr x8) → 0xa8f70`.
  0x13a4bc는 x0=스택버퍼(sp+0x1a8), w2=0xfa0(4000), w1=난독값으로 afed8 호출.
[반증 — 상수 grep 실패(step 4 경고 검증)] 0x8_000000BE는 **코드 리터럴로 생성되지 않음**. libea56의
`#0xbe`(190)·`#0xbf`(191) 즉시값은 전부 OLLVM opaque-predicate/string-decrypt 산술 매직상수
(e5478/ed750/109164/ebd3c: eor/orr/and/ubfiz 바이트연산+cmp;b.eq; 98264의 0xbf는 §58 확정 red herring).
⇒ **verdict는 data-driven(런타임 데이터서 조립)**, 상수추적 불가.
[Static attribution limit reached — 정적 단독 한계(벽 아님)] dispatcher/control-flow 구조는 복원, 단
handler 의미+runtime verdict data-flow는 flattening+runtime indirection으로 정적만으론 귀속 못 함:
- 0xa8f70 핸들러 주소 런타임 계산/난독 → "어느 param=0xa8f70" 정적 귀속 미완.
- 0xa8f70 = emulator 핸들러인지 미확정(샘플 스택은 ~2s 창 실행 중 핸들러일 뿐 — 과대해석 주의).
- 0x8_000000BE materialize = §84 이월.
[평가 — §83 절반 이상 성공] "afed8=정체불명" → "param→u16table→51 pad→~48 handler RPC 디스패처" 복원 +
`0x13a4bc→afed8→0xa8f70` control-flow attribution. DexGuard는 이름→호출관계→dispatcher의미→handler CFG→
runtime data→anti-hook을 겹친 다층방어 = "매번 다른 벽"이 아니라 "같은 설계의 층별 반복". 정적 marginal
return 하락 → 수동 OLLVM 디오브 대신 코드무결성-안전 동적 attribution으로 전환.
[§83 최종 성공조건(하나만)] clean-run에서 afed8 runtime param/selected-handler 관측 →
`param ↔ 0xa8f70 ↔ emulator callback` 반복가능 상관 확보. 안 되면(안정적 연결 X)도 좋은 결과(과대해석 제거).
[다음 후보(사용자 order 계승)] (1) **코드무결성-안전 동적 param 추적**: LKM 하드웨어 브레이크포인트(코드
미수정 → self-integrity 회피)로 afed8 진입시 param(w0/w1) 로깅 → emulator 콜백과 시퀀스 상관 → emulator
param 귀속. (2) 0xa8f70 핸들러 OLLVM 디오브(Ghidra 강제함수생성+수동). (3) DexGuard Java의 afed8 param
상수 분석(어느 Java operation이 어느 param). 우회 metric 사용 안 함 유지.

## §83b 동적 attribution 시도: hw-breakpoint 트레이서 — 게스트 플랫폼 한계로 미작동
[구현] LKM v4.23: perf_event_create_kernel_counter로 per-task arm64 실행 하드웨어 브레이크포인트(afed8
진입). 코드 미수정(self-integrity 회피) + ptrace 아님(TracerPid 미설정 → 스텔스). export 확인:
perf_event_create_kernel_counter/release/enable, pid 조회 전부 ksymtab 존재. MODULE_LICENSE(GPL).
param: hwbp_pid/hwbp_addr/hwbp_go(module_param_cb)/hwbp_hits.
[결과] bp 생성 성공("hwbp: armed at <VA> on pid P", IS_ERR 아님) BUT **hwbp_hits=0** — afed8 진입시 핸들러
전혀 호출 안 됨. afed8 런타임 VA는 /proc/pid/maps의 r-xp 세그먼트(0xafed8 포함) 기준 정확 계산+readback
확인. 앱 churn(AMS 재시작) 넘어 10s 공격적 재무장(pid 바뀔 때마다)에도 0. afed8는 프로세스당 ~48회
실행되므로 정상 작동이면 반드시 hit 나야 함.
[진단 — 강한 정황] (1) dmesg에 arm64 "found N breakpoint registers" 부팅 메시지 없음, (2) perf/bp 에러
없음, (3) bp 생성은 되나 fire 안 함, (4) Apple Silicon HVF 게스트. ⇒ **게스트 ARM64 하드웨어 디버그
레지스터가 HVF에서 미가상화/미작동으로 추정**(플랫폼 한계). 내 코드/RASP 문제 아님(단정 아닌 강한 정황).
[의미] 코드무결성-안전 동적 attribution 도구(hw bp)가 이 게스트에서 사용 불가 → §83 최종 성공조건
(param ↔ 0xa8f70 ↔ emulator callback 상관)은 **미검증**(도구 한계이지 "0xa8f70 미연결"이 아님 —
과대해석·과소해석 양쪽 경계). 나머지 동적 옵션은 전부 단점: uprobe(코드변조 → integrity/anti-debug 위험),
frida(탐지됨), 실기기(hw debug 정상). 
[§83 최종 상태] static: dispatcher/control-flow 복원(절반+). dynamic: 코드무결성-안전 도구가 플랫폼
한계로 불가. param↔handler↔verdict 상관은 이 환경의 code-safe 수단으로는 관측 불가로 잠정 판단.

## §84 ★ 분석 하니스 구축 (deterministic runner + 구조화 evidence + 차등/실험저장소 CLI)
[목표] "우회"가 아니라 **재현 가능한 분석 하니스**: observe→compare→hypothesize 루프를 사람 개입 최소로.
raw dump 투척 대신 기계적 구조화 evidence 제공. 큰 framework 대신 현재 질문(afed8 param↔handler↔verdict)에
필요한 최소 도구부터.
[구현물 — analysis/toss-rasp/harness/]
- **trace_run.sh**: 한 명령 결정적 러너. [--reboot] baseline(boot_recover) → LKM param 적용 → clean(logstore/
  logcat/dmesg wipe) → single launch → detection window(timeline poll + debuggerd -j 코드안전 스택샘플 N회 +
  **live logstore 스냅샷**) → 종료 → runs/<ID>/ 생성. 산출: meta.json/verdict.json/lkm_params.txt/timeline.txt/
  logcat.txt/dmesg.txt/maps.txt/logstore_raw.txt/stacks/*.txt.
- **parse_run.py**: 수집물 → verdict.json(raw evidence 구조화: raspEmulatorCallback/hook, detected/guardLevel/
  attendingDetectorSet, fds_result/from, exit_caller/exitPlan, displayed/system_exit, top_activities, last_alive_s,
  handler_presence{afed8/0xa8f70/0x95224/AbsAppGuard/libtg/libea56}, libea56_stack_frames{offset:count}) + meta.json
  (id/ts/params/duration/pid/libea56 hash/sdk/kernel/model/lkm_params). raw evidence와 interpretation 분리.
- **hns.py**: 분석 CLI — index(experiment store runs/index.json)/list/show/compare A B(verdict diff)/frames
  (libea56 offset ↔ emulator_detected 차등)/hypotheses(param-set→결과, 반증된 param-set 재시도 방지).
[하니스가 잡아낸 재현성 결함(→ 규칙으로 내재화)]
- **AMS 재시작이 logstore도 clear**(§78 pid 컨파운드의 일반화): System.exit 후 재시작 세션이 logstore를
  비워 window-끝 수집은 빈 세션을 읽음 → verdict 놓침. **해결: window 중 live 스냅샷(첫 verdict-bearing 상태
  캡처)**. 이후 emulator verdict 안정 캡처(raspEmulatorCallback=0x8_000000BE, detected=emulator, guardLevel=LOW).
- maps는 반드시 생존 중 캡처(종료 후엔 빈 파일) — offset↔VA join용.
[현재 capability(검증됨, clean 3런 재현)] baseline 3/3 emulator 판정 재현(REFUTED: emu persists). 스택샘플
밀도↑(--stacks 5)로 afed8 체인 포착: libea56 프레임 **0x13a4bc(afed8 caller)·0xb02c4(afed8 blr)·0xaa6a4
(afed8-디스패치 핸들러)** — §82의 0xa8f70과 다른 핸들러도 포착됨 → afed8이 여러 핸들러 디스패치 실증(차등
누적으로 handler↔verdict 상관 가능).
[한계(정직)] debuggerd -j 스냅샷은 point-in-time이라 afed8/handler(짧음) 포착이 통계적(밀도·행운 의존) —
param 레지스터는 미포착. hw-bp 동적 param 추적은 HVF 게스트서 미작동(§83b). 미구현: context memory diff(#3),
unidbg isolated-handler replay(#4), 정적 export(functions.json 등). 이들은 현 질문(param↔handler) 해결의
다음 도구.
[사용법] `harness/trace_run.sh --label X [--params "maps_filter=1 ..."]` → `harness/hns.py index|frames|
hypotheses|compare A B|show <id>`. runs/는 gitignore 권장(evidence 大).

## §85 2026-09-27 하니스 증거 신뢰성 보강 — §84 해석 정정, 실기기 재검증 대기

[정정 — runtime-confirmed] 기존 세 run은 모두 `raspEmulatorCallback=0x8_000000BE`와
`System.exit(0)`를 남겼지만, `postRaspResult`/FDS 상세는 **1/3 run에만 캡처**됐다.
첫 콜백 때 한 번만 저장한 logstore를 전체 verdict의 완전한 증거로 취급하면 안 된다.
`0xaa6a4 → 0xb02c4`는 같은 스레드의 연속 스택 프레임이지만 `0x13a4bc`는
**다른 스레드의 poll 프레임**이다(`runs/20260927-164114-baseline/stacks/t3s_pid11808.txt`,
`runs/20260927-164132-baseline/stacks/t3s_pid13358.txt`). §84의 세 주소를 하나의
동적 호출 체인처럼 묶은 표현 및 `0xaa6a4`의 emulator callback 귀속은 미확정.
동일 run에 debuggerd가 개입했으므로 timing perturbation 부재도 미검증.

[구현 — source-confirmed] `harness/trace_run.sh`는 최초 AMS `Start proc`와
`/proc/PID/stat` field 22(starttime ticks) + UID-filtered 관찰을 결합한다.
매 poll의 logstore를 별도 스냅샷으로 보존해 첫 콜백 이후 postRasp/FDS/EXIT를
놓치지 않도록 했고, maps/stack 캡처의 PID+starttime을 기록한다. `--reboot`는 선택
옵션이며 같은 부트 반복을 reboot-clean으로 부르지 않는다. LKM param 적용은 사전값,
적용값 및 readback을 기록·검증한다. 운영상 logstore 삭제와 logcat/dmesg 초기화가
있으므로 기존 증거를 보존한 뒤에만 러너를 실행할 것.

[파서/CLI — source-confirmed] `parse_run.py`는 첫 AMS 프로세스의 logstore 세그먼트만
고르고, `process_sessions`(pid,starttime,first/last seen), `capture_quality`,
동일 스레드별 libea56 프레임을 출력한다. 결측은 `emulator_detected=null`/INCONCLUSIVE;
명시적 비-emulator 결과+완전한 **샘플링 창**만 NOT_DETECTED;
재시작·PID/maps 불일치·param readback 실패는 CONTAMINATED. 기존 세 run에는
starttime 기록이 없으므로 raw 콜백 관찰을 유지하되 새 기준의 유효 판정으로
승격하지 않고 `INCONCLUSIVE(legacy)`로 표시한다. `hns.py hypotheses`는 baseline을
REFUTED로 부르지 않고, MIXED/INCONCLUSIVE/CONFOUNDED를 분리한다. `frames`는
유효한 positive/negative 양측이 없으면 귀속 불가를 경고한다. `compare`는
선언한 개입 파라미터 차이와 미선언 환경/LKM 드리프트를 구별한다.

[추가 관찰 — runtime-confirmed, 원인 미확정] 기존 세 run의 `process_created`에는
`manufacturer=Google`, `model=sdk_gphone64_arm64`가 기록됐으나, `meta.model`은
`SM-S916N`이다. 후자는 **종료 후 adb getprop**이고 앱 내부 관측값을 대변하지 않는다.
이 차이를 곧장 emulator detector 입력으로 귀속하지 말고, 새 하니스의
`meta.app_reported_model`과 동시점 프로퍼티/Java Build 관측으로 확인할 것.

[검증] `python3 -B harness/test_harness.py`: 오프라인 회귀 테스트 9개 통과;
`bash -n harness/trace_run.sh` 통과. **수정 후 실제 AVD 실행은 아직 하지 않았다.**
다음은 러너가 기존 로그를 지운다는 점을 감안해 보존할 증거를 확인한 다음,
`--stacks 0` 대조군과 `--stacks 5` 관측군을 별도 run으로 수집해 계측 효과·
session identity·후속 이벤트 캡처를 검증하는 것. handler-entry 상태(x0/args/context
주변 메모리)가 확보되기 전에는 unidbg replay를 시작하지 말 것.

## §86 2026-09-27 신규 하니스 AVD 실측 — 원 세션 검증, debuggerd 포화 한계

[사전 보존 — runtime-confirmed] 러너의 logstore/logcat/dmesg 초기화 전에
`harness/preflight_20260927-171656/`에 당시 logitems(1개), logcat, dmesg,
LKM 파라미터, 화면/GL 환경을 보존했다. camo33 boot-complete, SELinux Permissive,
Toss UID 10178 = hide_kmod target_uids 10178. 이 절의 네 run은 **같은 부트**에서
`--win 14`, LKM override 없이 실행했으며 reboot-clean 반복은 아니다.

| run ID (runs/ 아래) | 계측 | 원 PID:starttime | emulator callback | postRasp/FDS | 시작→System.exit(0) | 완료 스택 |
|---|---:|---|---|---|---:|---:|
| `20260927-171659-nostack_live` | 0 | 5141:629997 | 0x8_000000BE | emulator LOW / [EMULATOR] | 13.021s | 0 |
| `20260927-171725-stack5_live` | 5 요청(구 runner) | 7473:632539 | 동일 | 미포착 | 12.013s | 1/5 |
| `20260927-171853-stack5_serial` | 5 요청(직렬화) | 12146:641403 | 동일 | emulator LOW / [EMULATOR] | 12.499s | 1/2 발행 |
| `20260927-171919-nostack_post` | 0 | 14348:644014 | 동일 | emulator LOW / [EMULATOR] | 12.699s | 0 |

[판정 — runtime-confirmed] 네 run 모두 `verdict_state=DETECTED`,
`capture_quality.state=VALID`: 첫 AMS Start proc와 UID-filtered PID+starttime이
일치했고 maps도 같은 incarnation이며 AMS 재시작/타 세션 logstore 혼입은 0.
원 프로세스의 `raspEmulatorCallback=34359738558` 4/4, 원 PID의
`System.exit called, status: 0` 4/4. 후속 `postRaspResult` 및
`fds_detected [EMULATOR]`는 3/4 스냅샷에서 보인다. 관측군 1건의 후속 이벤트
부재는 **미포착**이지 비탐지가 아니다. 모두 splash top activity만 관측됐고
메인 UI/5분 생존은 이 실험의 대상도 성과도 아니다.

[debuggerd 한계 — runtime-confirmed] 최초 `--stacks 5`는 첫 스택 후 두 번째
요청이 tombstoned 응답 시간 초과, 뒤의 세 요청이 `already intercepted`로 거부됐다
(`stack5_live/logcat.txt`, `stacks/`). 따라서 `trace_run.sh`에서 같은 대상의
debuggerd 요청을 직렬화하고, 파서의 requested/launched/completed와
`stack_sampling_complete`를 분리했다. 직렬화 run은 2개 발행 중 첫 1개 성공,
두 번째는 다시 timeout. 동시 요청 충돌은 해결됐지만 **한 프로세스에서 5회
연속 샘플링 능력은 미검증/현재 실패**다. 직렬화 첫 성공 스택에는 같은 스레드
`0xaa6a4→0xb02c4`가, 별도 스레드에는 `0x13a4bc`가 있다. 이것은
handler↔emulator verdict 인과나 param 값을 증명하지 않는다.

[해석 경계 — inference] 무스택 전후와 1개 완료 스택을 가진 두 관측군 모두
positive verdict와 약 12–13초 exit(0)이어서 **단일 성공 스택 1개의
명백한 판정 반전 증거는 없다**. 그러나 반복 수 4, 같은 부트, debuggerd가
실제로 5개를 완성하지 못한 한계 때문에 timing perturbation 부재나
샘플링 횟수별 효과를 확정할 수 없다. `hns.py frames`도 유효 음성 run이 없어
detector attribution 불가라고 경고한다. 후속 실험은 1회 스택/프로세스 또는
비-debuggerd 상태 획득 방식으로 설계할 것.

[추가 재현 — runtime-confirmed] 네 run 모두 앱 자신의 `process_created`에는
`manufacturer=Google`, `model=sdk_gphone64_arm64`인데 종료 후 shell getprop
모델은 `SM-S916N`이다(`meta.json`). §85의 provenance 차이가 신규 원 세션에서도
4/4 재현됐다. 앱 내부 값을 곧장 탐지 입력으로 귀속하지 말고, 동일 시점의
Java Build/시스템 프로퍼티 획득 경로를 분리해 확인해야 한다.

[검증] `bash -n harness/trace_run.sh` 및
`python3 -B harness/test_harness.py` 9/9 통과. runner는 끝에 Toss를
force-stop했고 네 run의 원본 증거는 각각 `runs/<ID>/`에 남겼다.

## §87 2026-09-27 하니스 P0 완료 + 회귀검증 + P1(handler state capture) 프로토타입·한계
[P0 — 이미 구현됨 확인] parse_run.py/hns.py에 process incarnation(pid+starttime) 추적, launch_pid=최초
AMS Start proc(윈도 끝 pgrep 아님), verdict_state 4-state(DETECTED/NOT_DETECTED/INCONCLUSIVE/CONTAMINATED),
capture_quality(evidence 품질), true/false/null 분리, thread-그룹 프레임(§84 정정), app_reported identity,
legacy 처리, hns hypotheses 분류(BASELINE/SUPPORTED/REFUTED/MIXED/INCONCLUSIVE/CONFOUNDED) 전부 존재.
[회귀검증 — runtime-confirmed] 현행 하니스로 clean 3런(20260927-1939xx-regr): 3/3 `verdict_state=DETECTED`,
`capture_quality=VALID`, `incarnation_verified=true`, `restart_count=0`, `emulator_detected=true` 일관.
스택 프레임은 런마다 다른 afed8-디스패치 핸들러 포착(1299a4/a801c/15b5a8/b02c4/13a4bc) — 13a4bc는 매 런
별도 poll 스레드(§85 재확인). hns hypotheses: baseline BASELINE 7/0/3/0(legacy 3 INCONCLUSIVE 분리). P0
success 조건(원세션↔재시작 구분, evidence 반복, detector_status 일관, session 귀속, 합리적 분류, README
규칙 무모순) 충족.
[P1 프로토타입 — capture_state.py, source+runtime-confirmed] 코드안전 방법(debuggerd tombstone; hw-bp는
HVF서 死 §83b, ptrace-attach는 가드 차단/탐지). tombstone은 스레드별 레지스터(x0-x29/lr/sp/pc, 992줄) +
백트레이스 제공. capture_state.py가 libea56 보유 스레드의 레지스터(x0=context 후보, x1/x2=args, x19) +
libea56 프레임 + 세션 귀속을 추출. **검증: 가드 스레드 레지스터 추출 성공**(예: Thread-40, 0x13a4bc,
x0/x19 캡처).
[P1 한계 — runtime-confirmed, 새 confound] **handler ENTRY 포착(top 프레임=핸들러)은 point-in-time
샘플링으론 극저수율.** 핸들러는 sub-ms(48회×~0.5ms ≈ wall-time 0.2%), tombstone은 ~1s/샘플. 라이브 5샘플
0/5 handler-entry(가드 스레드는 0xf8d7c/0x13a4bc 등 non-entry로만 포착). 즉 **핸들러 입력 레지스터
(x0=context/w1/w2=args)를 얻으려면 동기적 트랩이 필요한데, hw-bp는 HVF서 死, uprobe는 코드변조(탐지위험).**
⇒ unidbg replay용 handler-entry state는 이 게스트의 코드안전 수단으론 미확보. §83b HVF 트랩 한계의 재확인.
[결론] P0(mandatory 1-8) 완료. P1 stretch: 레지스터 캡처 능력은 실증됐으나 handler-entry 타이밍이 blocker.
unidbg replay(P2)는 entry-state 미확보로 상류에서 막힘. 옵션: 실기기(hw-bp 정상)/uprobe(코드변조 감수)/
denser 샘플링(여전히 통계적). 자산: harness/capture_state.py(tombstone→libea56 thread register state).

## §88 2026-09-27 caller-state reconstruction 시도 (0x13a4bc→afed8 정적 backwards-slice) — Case C+D
[방법] handler-entry 직접 포착(§87 극저수율) 대신, 자주 관측되는 caller libea56+0x13a4bc에서 afed8
호출 직전 입력의 provenance를 정적 backwards-slice(/tmp/ea56.dis) + AArch64 ABI(x0-18 caller-saved,
x19-28 callee-saved) 기준으로 역복원.
[정적 슬라이스 — raw evidence, 0x13a41c-0x13a4c0]
- `13a4bc: blr x9` — call target x9 = `*(0x17c1e0 + idx1*2400 + idx2*8)`, idx1/idx2 = *(global 0x179eb0)의
  OLLVM opaque-predicate 함수 → **런타임 해석 함수포인터**(정적으로 afed8 고정 아님).
- `13a4b4: add x0, sp, #0x1a8` → x0 = **스택 로컬 버퍼**(pre-call: *(sp+0x1ac)=1, *(sp+0x1ae)=0).
- w1 = `0x08692047 - *(0x179eb0)` [(a|b)+(a&b)=a+b 항등], w2 = 0xfa0(4000, immediate).
- afed8 프롤로그(0xafed8): `str x25..; mov x19,x2(=4000); b 0xb02b4`; dispatch `mov w8,w0`(0xb0294)는 내부
  흐름 도달, w0는 afed8 내부 계산값. 0xb0294로의 back-branch 1개뿐 → **caller가 param으로 handler를
  고르는 구조 아님**(§83 "param→handler"는 이 call-site 증거로 미지지).
[provenance 분류] x0/context=**C(스택유래)**: sp+0x1a8 로컬 → 0x13a4bc 프레임 sp 필요, libc서 잡힌
tombstone은 다른 sp → frame-independent 아님. w1=**B/E**(전역유래+OLLVM얽힘, 의미 UNKNOWN). w2=immediate
(CONFIRMED 4000). x9=**E**(OLLVM 테이블 indirect). dispatcher_param=**UNKNOWN/mis-framed**.
[runtime reconstruction] x0/context: **미복원**(스택프레임 로컬, tombstone서 프레임 sp 확보 불가, hw-bp死
§83b). w1: 미복원(data 세그먼트 VA≠file-offset로 /proc/mem 계산 실패 + context도 아님). w2=4000(정적).
[재현성] call-site 정적 구조는 동일 바이너리라 불변. runtime 복원 미달성이라 복원 재현성 N/A.
[판정 — Case C+D] **caller-state reconstruction으로 afed8/handler context pointer 확보는 현 AVD서 비실용적.**
유일 semantic 입력(x0/context)이 per-frame 스택 로컬이고 call target 자체가 런타임 해석. §88 성공조건
(context pointer 1회 이상 runtime 재구성) **미달성**.
[권고(§88 Case C/D 지침 준수)] OLLVM 슬라이싱 추가 심화 금지. 더 싼 다음단계 = **실기기(hw-bp 정상)+
capture_state.py로 handler-entry 레지스터(x0/x1/x2/x19) 동기 포착** — 스택프레임·HVF트랩 한계 동시 회피.
[자산] harness/afed8_call_0x13a4bc_provenance.json(정적 provenance+confidence+Case 판정, raw≠interp 분리).

## §89 2026-09-27 unwind-SP로 caller-frame context 복원 시도 → Case C (AVD 비실용, 실기기 전환)
[가설] top-frame SP가 아니라 unwind된 0x13a4bc caller frame의 SP/CFA를 복원 → context=callsite_sp+0x1a8을
known-local(*(sp+0x1ac)=1, *(sp+0x1ae)=0)로 검증. 성공 시 hw-bp 없이 context runtime 복원.
[pipeline 확인 — source+runtime] debuggerd 옵션(API33 실측): `[-bj] PID` (-b=backtrace만, -j=java traces,
기본=full text tombstone). 실기기 crash용 proto(.pb, BacktraceFrame.sp 포함)는 /data/tombstones/에 있으나
**on-demand `debuggerd PID`는 텍스트만 stdout으로 내고 fresh .pb 미생성**(최신 .pb=09-26 crash분).
[on-demand tombstone 구조 — runtime-confirmed] 스레드별 TOP 레지스터(x0-x29/sp/pc/x29) 17블록 O. 단
**frame별 SP 없음(frames_with_inline_sp=0), 깊은 stack hex dump 없음(stack-mem 0줄)**, "memory near [stack]"은
primary 스레드 한정 ~256B 창만. 즉 unwinder가 즉시 제공하는 출력엔 caller-frame(0x13a4bc)의 call-site SP가
보존되지 않음.
[복원 경로의 3중 장벽] (A) per-frame SP: on-demand 텍스트에 없음 + proto 미생성 → 수동 x29-chain unwind
필요. (B) x29-chain/locals read: non-primary 스레드 stack이 tombstone에 없음 → **debuggerd resume 후
/proc/mem read = RACE**. (C) 0x13a4bc frame이 unwind에 잡히는 것 자체가 통계적(§87 저수율) + 프로세스가
빨리 죽어(churn) pgrep↔read 사이 사망. §88의 /proc/mem VA 이슈는 stack/매핑 VA는 직접 read(파일오프셋
변환 불요)로 교정됐으나, race+per-frame-SP 부재가 상위 blocker.
[reconstruction 표]
| 항목 | 결과 | confidence |
|---|---|---|
| unwind frame PC | 백트레이스 O(단 0x13a4bc 안정 포착 X) | MED |
| unwind frame SP | **없음**(텍스트 per-frame SP 부재, proto on-demand 미생성) | CONFIRMED-absent |
| unwind CFA | 없음(동일) | CONFIRMED-absent |
| reconstructed callsite SP | **미달성** | — |
| context=SP+0x1a8 | 미달성 | — |
| context+0x4==1 | 미검증(context 주소 없음) | — |
| context+0x6==0 | 미검증 | — |
[판정 = C] AVD의 code-safe unwinder(on-demand debuggerd)는 caller-frame call-site SP를 race-free로 보존하지
않는다. 수동 x29-unwind는 post-resume /proc/mem(race) + 통계적 frame 포착 + churn으로 신뢰불가. §89 원칙
(unwinder 보존 state 우선 검증)은 수행했고 결과는 "보존 안 함". §84~§89 종합: entry 직접포착(§87)·caller-state
정적복원(§88)·unwind-SP 복원(§89) 3경로 모두 HVF(hw-bp死)+OLLVM(indirect/stack-local)+race로 막힘.
[다음 = 실기기] 실기기+hw-breakpoint로 0x13a4bc/handler entry에서 동기 stop → x0(context)/x1/x2/x19 +
frame sp 직접 획득 → 기존 capture_state.py/parse_run.py/hns.py + provenance 슬라이스 재사용. 추가 AVD
speculative trick 중단 권고.

## §90 2026-09-27 HVF guest HW-breakpoint 규명 → 판정 B (Apple 한계 아님, emulator가 HVF guest-debug 미구현; backport 지점 특정)
[목표] "HVF가 원래 ARM hw-bp를 못 하나" vs "현재 Android Emulator QEMU가 HVF guest-debug를 구현/연결 안 했나"를
source+runtime로 판별. 최종은 libea56+0x13a4bc에 hw-bp → 동기 stop → x0/sp 등 capture.
[P0/P1 provenance — FACT] emulator 36.5.1.0(build 14763179), QEMU base **2.12.0(v2.12.0-19097)** Android qemu2 fork,
branch **emu-36-5-release**. accel=HVF(kern.hv_support=1, no -accel override). 아티팩트 harness/emu_provenance.json.
[binary strings — FACT] qemu-system-aarch64가 Apple HVF debug API를 **import**함: hv_vcpu_set/get_trap_debug_exceptions,
_reg_accesses, get/set_sys_reg(incl MDSCR_EL1). 그러나 set_trap_debug_*는 **literal false로만 호출**(true:0/false:2) →
enable 경로 부재. hvf_arch_insert_hw_breakpoint/update_guest_debug 등 upstream plumbing **전무**. gdbstub는 컴파일됨
(gdbstub.c, target/arm/gdbstub64.c, -gdb/-s). 런타임 HMP(`qemu monitor`)는 **비활성**("QEMU support no longer available").
[P2~P5 runtime matrix — FACT] `-qemu -s`로 gdbstub(*:1234, IPv6) 오픈. 자작 RSP probe(harness/gdb_hwbreak_test.py):
 · gdb connect + interrupt(0x03)→T02, qSupported→`PacketSize=1000;qXfer:features:read+`(**hwbreak+/swbreak+ 미광고**) : WORKS
 · g(레지스터)/m(메모리) read : **WORKS** (pc=0xffffffc0096cde48, insn d503207f=WFI)
 · **Z0(sw-bp) insert → empty reply + QEMU CRASH** `crashhandler_die: fatal: qemu: qemu_mutex_lock_impl: Invalid argument`
 · **Z1(hw-bp) insert → empty reply + QEMU CRASH** (동일 mutex fatal)
 · single-step 's' : **crash 안 함**(직후 ?→T05 alive); PC+4 전진은 WFI에서 스텝해 harness desync로 미확정
 · watchpoint Z2/3/4 : Z0/Z1 crash로 미도달. 아티팩트 harness/hvf_debug_matrix.json.
[root cause — 판정 B, source-confirmed] 부속 리서치(upstream)로 확증: upstream HVF ARM guest-debug는 **QEMU 8.1.0
commit eb2edc42(+0ca52a5, 2023, Quarkslab)**에서 최초 도입(~520 LoC). 내 fork은 2.12라 그 이전. 결정적으로 **QEMU 2.12는
AccelOpsClass 이전** → gdb_breakpoint_insert → cpu_breakpoint_insert → TCG tb_invalidate_phys_addr → HVF에서
미초기화 mutex → 관측된 fatal과 정확히 일치. ∴ 원인은 **Apple HVF 한계가 아니라(디버그 API가 import·문서화됨) fork이
HVF guest-debug를 구현/연결하지 않음**. root cause = B/C/D 복합(enable-path 부재 + plumbing 부재 + gdbstub가 HVF로
라우팅 안 되고 TCG로 fall-through해 crash).
[TCG(우선순위#3) — FACT] `-qemu -accel tcg`(및 -cpu max)로 강제 시 qemu가 startup에서 즉사(emulator가 주입한 HVF
machine 설정과 accel 충돌; abort는 crashpad로). ∴ **런처 경유 TCG는 arm64 AVD에서 drop-in 불가**. 손으로 qemu 인자
전체를 재구성해 HVF accel 제거해야 하는데 비용이 backport와 비슷하고 provenance 동등성 재검증도 필요.
[backport 지점 특정 — Investigation success] 추가할 것: target/arm/hvf/hvf.c에 hvf_arch_insert/remove_hw_breakpoint,
hvf_put_gdbstub_debug_registers(HV_SYS_REG_DBGBVR0..15/DBGBCR/DBGWVR/DBGWCR set_sys_reg), hvf_arch_update_guest_debug
(MDSCR_EL1.SS/.MDE), **hvf_arch_set_traps→set_trap_debug_exceptions(fd,true)+set_trap_debug_reg_accesses(fd,true)**,
run-loop에 EC_SOFTWARESTEP/EC_AA64_BKPT/EC_BREAKPOINT/EC_WATCHPOINT→EXCP_DEBUG. **최난도=2.12 gdbstub.c의
gdb_breakpoint_insert/remove를 가로채 hvf_enabled()면 TCG경로 전에 HVF로 dispatch**. 단 emu-36-5 fork QEMU 소스
빌드 필요(대형). 난이도 MEDIUM.
[ASID caveat — FACT] upstream hw-bp는 unlinked address-match(BT=0, ASID/VMID 매칭 없음) → userspace VA(libea56+0x13a4bc)
BP는 그 VA를 실행하는 **모든 프로세스**에서 hit. 대상 프로세스 한정은 host-side로: 매 stop마다 TTBR0_EL1/CONTEXTIDR_EL1(ASID)
sysreg read(HVF에서 이미 동작)로 필터하거나 linked context-match BP 확장.
[판정 = B] minimal host-side backport로 HVF genuine HW BP 가능(지점 특정 완료). 단 즉시 capture 목표만 보면 fork QEMU
빌드보다 **실기기 hw-bp(D)가 더 저렴**할 수 있음 — 실기기 가용 여부로 B vs D 선택. 자산: emu_provenance.json,
hvf_debug_matrix.json, gdb_hwbreak_test.py. 다음 한 단계: (B) emu-36-5 QEMU 소스 취득→위 함수 backport→toy로
EC_BREAKPOINT exit 확인, 또는 (D) 실기기+capture_state.py.

## §91 2026-09-28 upstream QEMU 11 ARM64 RE-lab PoC → LIVE(HVF HW-bp)+ANALYSIS(TCG replay) CONFIRMED; Android/Toss OPEN
[목표] Google emulator fork를 버리고 **upstream QEMU + HVF(LIVE)/TCG(ANALYSIS)**로 무료 ARM64 Android RE lab을 실제
구축·PoC. §90은 "fork이 HVF guest-debug 미구현"이라 판정 B였는데, upstream QEMU가 그 기능을 이미 갖고 있으니
backport 대신 upstream으로 직행이 정답인지 검증.
[P0 — CONFIRMED] brew `qemu-system-aarch64` **11.0.1**, accel hvf+tcg, plugin API + record/replay 존재.
toolchain: clang 23.1.1, zig 0.16(내장 lld), edk2 firmware. host.json 저장. (upstream 11 >> 8.1 = HVF ARM
guest-debug eb2edc42 포함.)
[LIVE MODE — CONFIRMED] bare-metal ARM64 toy(`toy.s`→toy.elf, target `add x0,x0,x1`@0x4008000c) `-M virt
-cpu host -accel hvf -kernel ... -gdb tcp::P -S`. 자작 RSP probe로 **Z1(HW breakpoint) 3 independent runs =
GENUINE_HW_BP**: exact PC stop(all hits@target), **guest bytes UNCHANGED**(0000018b, before/after/at-stop/
remove 동일), reg/mem read OK(x2=4000). 단 **QEMU/HVF는 현재 PC의 HW bp를 auto step-over 안 함** → plain `c`
재발화 무진행; 명시적 step-over(z1 remove/s/Z1 reinsert/c)로 실제 진행 x0=1,3,6,10 x1=2,3,4,5 확인.
즉 **§90에서 Google fork이 crash(qemu_mutex_lock_impl)하던 바로 그 동작이 upstream에선 정상.** artifact
hvf_hwbreak_matrix.json. gdbstub는 IPv6 `*:P` 바인드(::1 접속).
[ANALYSIS MODE — CONFIRMED] 동일 toy `-accel tcg`. 자작 plugin(qemu-plugins/target_trace/trace.c, qemu-plugin.h
API, range-filter BB trace) → BB sequence 2런 identical(결정적). finite toy(PSCI SYSTEM_OFF/HVC clean exit)로
**record(-icount shift=0,rr=record, rrfile 110B, 999 BB) → replay×3 = 999,999,999 exit0 → REPLAY_REPRODUCIBLE**.
record/replay가 bare-metal -kernel(블록디바이스/스냅샷 없이)에서도 동작. artifact replay_reproducibility.json.
[Android/Toss — OPEN] modern ARM64 Android는 in-session 미부팅(다운로드 대형+recipe 까다로움; research 서브에이전트는
세션리밋으로 무응답). 두 경로 문서화: (P-direct) GSI/AOSP on `-M virt`(=Android가 guest OS, task_struct/mm 귀속
깔끔, whole-system RE 유리) vs (P-nested) ARM64 Linux guest + Redroid/Waydroid(binder 커널 필요, 컨테이너 계층
→ outer QEMU 귀속은 TTBR0_EL1/ASID/CONTEXTIDR + in-guest /proc/PID/maps로 매핑). 권장=P-direct 우선.
HVF 제약: -cpu host, GICv3, PSCI, virtio-blk/net hostfwd(adb5555), edk2 UEFI. Toss 단계: 같은 binary 로드시에만
0x13a4bc HW bp(ELF PT_LOAD bias, ASID filter) → x0==sp+0x1a8/x2==4000/*(x0+4)==1/*(x0+6)==0 검증(메커니즘은
toy에서 CONFIRMED, delivery만 OPEN).
[matrix] CONFIRMED 12(upstream QEMU/HVF/native exec/HW bp/exact stop/bytes unchanged/reg/mem/record/replay/
3x repro/BB trace) · SUPPORTED 1(indirect-target) · OPEN 9(Android boot/ADB/TCG-Android/ASID attrib/Toss
launch/libea56/JNI provenance/raspEmulatorCallback/Toss exact stop). capability_matrix.json.
[판정] 7대 질문 답: (1)Google emulator는 exact debug용으로 불필요, oracle로만. (2)upstream QEMU/HVF로 exact
native debugging **해결(CONFIRMED)**. (3)TCG record/replay가 debuggerd sampling보다 구조적으로 우월(결정적·반복). (4)
container 구조는 귀속에 1계층 추가(장애 아님, P-direct가 더 깔끔). (5)엔진은 primary lab 자격 O, end-to-end Toss는
Android 부팅 후. (6)PANDA-ng 불필요(upstream plugin+RR로 충분). (7)다음=Android(P-direct GSI) 부팅→ADB→Toss→
0x13a4bc HW bp. **최종: 엔진=A급 CONFIRMED, end-to-end=C(ANALYSIS-ONLY, Android 부팅이 유일한 잔여 공학과제),
D(플랫폼 한계) 반증.** lab: analysis-lab/ (README, docs/MODERN_ANDROID_QEMU_RE_LAB.md, scripts, plugin, artifacts).

## §92 2026-09-28 userspace HW-bp bridge CONFIRMED (§15/§16 de-risk) → Android boot 착수
[가설] bare-metal(단일 주소공간) HW bp는 §91서 확인됐지만, 진짜 위험은 "full-MMU OS의 특정 EL0 userspace
프로세스 코드"에 outer-QEMU HVF HW bp가 정확히 걸리는가(§15/§16). Toss libea56도 EL0 .so이므로 이걸 먼저 검증.
[방법] static non-PIE ARM64 Linux 바이너리(toy_user, target_function@0x10101f4, add x8,x1,x0@0x10101f8)를 최소
initramfs의 /init으로 → Alpine kernel 6.6 위 HVF 부팅 → userspace 도달(콘솔에 `Run /init`+`TOYUSER
target_function=0x10101f4` = objdump와 일치, non-PIE 고정VA 확인) → outer QEMU RSP로 그 userspace VA에 Z1.
[결과 — CONFIRMED, 3/3 runs] Z1→OK, pc 5회 전부 0x10101f8, bytes `2800008b` **불변**(before==at-stop), x1이
hit마다 정확히 +1(루프 카운터 i) = 실제 명령경계 레지스터 캡처. 즉 **full-OS EL0 userspace 코드에 대한 HVF HW
breakpoint가 exact stop+무변조+실레지스터+반복 동작**. §90 Google fork 실패의 정반대. artifact
analysis-lab/artifacts/android/userspace_bridge_linux.json, toy analysis-lab/android/toy_user/.
[Android delta] Android app .so는 PIE → runtime VA = load_base(/proc/PID/maps) + ELF PT_LOAD offset; 다중
프로세스 → ASID/CONTEXTIDR filter(§90). 메커니즘 자체는 동일하고 이제 입증됨. 남은 건 Android userspace를
이 검증된 boot path에 올리는 packaging.

## §92b 2026-09-28 Android userspace boot 평가 → direct GSI STOP RULE, 경로=Redroid/Waydroid-in-Linux-guest
[direct GSI on virt — REFUTED as fast path] AOSP arm64 GSI는 다운로드 가능(aosp_arm64-exp-CP41…zip)이나
system.img뿐 → plain virt 단독 부팅은 자체 Android board(kernel+ramdisk+vendor+DTB+fstab+AVB) 빌드 필요 =
§27 STOP 조건. 참조 toolkit(github.com/Ccccccccvvm/qemu-android-arm64)도 확인: Apple Silicon+upstream QEMU에선
실용 Android = **Waydroid/Redroid를 ARM64 Linux guest 안에서** 실행. Cuttlefish-on-macOS-QEMU는 host service
부재로 hang, Google emu 이미지는 ranchu 필요. artifact analysis-lab/artifacts/android/{image_provenance,
boot_stage,android_capability_matrix}.json.
[권장 경로 — SUPPORTED, 미실행] M1→qemu-system-aarch64 -M virt -accel hvf→ARM64 Linux(binder+docker)→
docker run redroid arm64→Android→adb connect. guest kernel에 CONFIG_ANDROID_BINDER_IPC+binderfs(Ubuntu/Debian
arm64 linux-modules-extra) 필요. scaffold android/scripts/boot_android_redroid.sh. §29대로 fallback은 실패 아님
(검증된 엔진 위 Android userspace+adb 도달). 이번 세션서 end-to-end 미실행(멀티GB guest+이미지 빌드가 세션
예산 초과)이나 단계는 구체적이고 하부 엔진은 CONFIRMED. nested 귀속: app은 guest의 EL0 Linux 프로세스 →
in-guest /proc/PID/maps(PIE bias)+ASID로 특정, §92 bridge가 그 EL0 코드에 HW bp 적중을 이미 입증.
[Toss — OPEN, 메커니즘 입증됨] Android userspace 부팅 후: APK install→libea56 load→JNI provenance→등급
A/B/C/D. 같은 build일 때만 runtime VA=load_base(/proc/maps)+PT_LOAD offset로 0x13a4bc HW bp(step-over)→
x0==sp+0x1a8/x2==4000/*(x0+4)==1/*(x0+6)==0 검증. capture primitive은 §92 proxy에서 CONFIRMED, delivery만 OPEN.
[4대 질문 답] (1)direct GSI 단독부팅 실용성 X(자체 board 필요) → Redroid/Waydroid-in-Linux-guest가 실용경로. (2)
Android native(=EL0 userspace)에 HVF HW bp = 동급 케이스로 CONFIRMED(§92; Android은 PIE bias+ASID만 추가). (3)
Toss libea56 경로 실행 = OPEN(Android 부팅 gated, primitive은 준비됨). (4)primary env 이전: 디버그/replay 엔진은
CONFIRMED로 이전 가능, end-to-end는 Android 부팅 후 — blocker는 Android packaging이지 QEMU/HVF 능력 아님.
[판정] 엔진+bridge=A급 CONFIRMED, Android userspace+Toss=OPEN(경로=Redroid, direct GSI 제외). 플랫폼 한계
blocker 없음. docs/ANDROID_GUEST_AND_TOSS.md.

## §93 2026-09-28 Redroid Android 실부팅 + Android native EL0 HW bp CONFIRMED + Toss libea56 실행(anchor OPEN)
[Q1 Redroid boot — CONFIRMED] Ubuntu 24.04 arm64 minimal cloud image(229MB)을 upstream QEMU `-M virt -cpu host
-accel hvf` + UEFI(edk2)로 부팅, cloud-init로 docker+`linux-modules-extra`(binder)+`modprobe binder_linux`+`docker
run redroid/redroid:15.0.0_64only` 자동설치. **Redroid Android 15(SDK35, arm64-v8a, redroid15_arm64_only) 부팅,
adb connect localhost:5555 device, sys.boot_completed=1.** 컨테이너(중첩VM 아님) → app은 게스트의 EL0 프로세스.
artifacts host/config: android/configs/{user-data,meta-data}, android/images/redroid-disk.qcow2, scripts/boot_android_redroid.sh.
[Q2 Android native EL0 HW bp — CONFIRMED 3/3] static ARM64 toy(toy_android, add x8,x1,x0@0x101145c)를 Android에
push/run → guest QEMU gdbstub(::1:1234)로 Z1@0x101145c → **exact PC 3/3, x1 hit마다 +1(실캡처)**. bytes: out-of-context
read=`E14`(RSP error, CPU가 타 프로세스 컨텍스트 → §17 주소공간 다중화 실증), **in-context(stop 시) bytes=`2800008b`
=원본 add 무변조**, code window가 objdump와 정확히 일치. 즉 **outer QEMU HVF HW bp가 Android native EL0 프로세스
코드에 정확·무변조·실레지스터로 적중**. artifact android/android_hvf_hwbreak.json. (핵심 방법: whole-system gdbstub의
메모리/bp는 현재 CPU 컨텍스트 기준 → userspace VA는 그 프로세스가 실행 중일 때만 유효; bp stop이 그걸 보장.)
[Q3 Toss libea56 — 실행 CONFIRMED, anchor OPEN] apk_backup(base+arm64 split, libea56 sha256 c454eb40…6203b89 =
분석빌드 일치 → 0x13a4bc 유효) 설치 성공 → 실행(SplashActivity→OverseasOnboardingActivity, 환경의존 플로우) →
**libea56.so 로드 CONFIRMED**(nativeloader isolated ns, Anonymous-DexFile) + libbugsnag-root-detection + PlayCore
IntegrityService "Phonesky not installed". 그러나 **libea56 로드 ~4.5s 후 프로세스 자폭**("has died: fg TOP", 3회
death loop) — 가드가 redroid 환경(root/컨테이너/무GMS) 탐지 → §14 self-destruct. 또한 **libea56가 이름 기반
/proc/PID/maps에 안 잡힘**(1s 폴링 + 서버측 tight loop ~9s/30ms 모두 실패; isolated-ns/짧은 윈도+AMS restart churn).
∴ anchor 0x13a4bc HW bp **미장전(OPEN)**. compat grade = **B-/C+** (libea56+RASP native path 실행됨=RE 관측 가치 O,
단 자폭+base 은닉). artifact android/toss_compatibility.json.
[Q4 다음 blocker — 정확히] (a) libea56 runtime base가 name 기반 maps 샘플링으로 해결 안 됨(isolated-ns/전이적) +
(b) 가드 자폭(~4.5s). 해법 = **break-on-load**: ASLR off(이미 설정, randomize_va_space=0)에서 결정적 주소인 게스트
linker의 dlopen/constructor 경로에 HW bp → libea56 map 시점에 정지 → 정지 상태 maps에서 base 스냅샷 → 0x13a4bc
장전 → continue로 dlclose/자폭 前 가드 실행 포착. HW-bp primitive 자체는 Q2로 입증됨. 단 **자폭 자체를 막는 것=root/
emulator 탐지 우회=범위 밖.** matrix: android_capability_matrix.json CONFIRMED 16/OPEN 3.
[종합] §90(fork 실패)→§91(upstream 엔진)→§92(userspace bridge)→§93: **Redroid Android + Android native EL0 HW bp
까지 실증 완료**. Toss는 이 위에서 libea56/RASP 코드가 실제 실행되며(관측 가능), anchor 정밀 캡처만 break-on-load
엔지니어링 남음(플랫폼 한계 아님). docs/ANDROID_GUEST_AND_TOSS.md.

## §94 2026-09-28 (IN PROGRESS) libea56 anchor를 loader-event interception으로 포착 시도 → 핸드오프
[목표] libea56 load를 polling 없이 동기 포착 → load bias 확정 → libea56+0x13a4bc(=blr x9, bytes 20013fd6)에 Z1
장전(자폭 前) → PC/SP/X0/X1/X2/X19 1회 capture + 검증(x0==sp+0x1a8, x2==4000, *(x0+4)==1, *(x0+6)==0). RASP/root/
emu 탐지 우회 안 함.
[설계] Android linker64(/apex/com.android.runtime/bin/linker64)의 solib notification `rtld_db_dlactivity`(+0x4d6a8)에
HW bp → 각 stop서 `__dl__r_debug`(+0x180bd8; r_map@8,r_state@24) 읽어 RT_CONSISTENT일 때 link_map(l_addr@0,
l_name@8,l_next@24) 순회하며 "ea56" 매칭 → l_addr=bias → anchor=bias+0x13a4bc(R-E PT_LOAD p_vaddr==p_offset). tool
android/scripts/catch_libea56.py.
[결정적 사실] **app_process64(zygote) linker base(ASLR off)=0xebc8ffebf000** (shell base 0xfffff7e6c000와 다름 — 앱엔
app base 사용). NOTIFY=0xebc8fff0c6a8, RDEBUG=0xebc90003fbd8. RSP latency ~0.1ms(walk 저렴). anchor 명령/오프셋
재확인 완료. libea56 hash=분석빌드 일치.
[현재 상태 — OPEN] notification bp는 정상 발화·스캔되나 62 events/150s 동안 **libea56가 글로벌 _r_debug link_map에서
미발견**. 미해결 2가설: (H1) 스캔 윈도 중 Toss가 libea56 미로딩(connect-freeze 후 restart loop 정지) — 대응책(in-guest
relaunch loop + toss_visible_events 카운터) 코딩했으나 미실행; (H2) isolated-ns 로드가 _r_debug에 미등록(anti-RE).
다음 LLM은 relaunch-loop 버전 실행 → toss_visible_events로 H1/H2 판별. H2면 `__dl_notify_gdb_of_load`(+0x4d634, x0=
soinfo*) 진입 hook로 전환(§5 대안).
[운영 함정 — 필독] (1)gdbstub connect가 게스트 STOP시킴→adb 동결→**Toss는 connect 前 adb로 실행**. (2)stub 잡은
스크립트를 kill -9/무detach 종료 시 게스트 동결→복구는 RSP D(정확 checksum $D#44)로 재개; **kill -TERM만 사용**
(스크립트에 SIGTERM detach 핸들러 있음). (3)HW bp는 현재 PC서 auto step-over 안 됨→수동 z1/s/Z1/c; anchor는 HW(Z1,
무변조), linker notify는 mutation 허용. (4)hvf_hwbreak_toy RSP엔 send_raw 없음→continue=r.cmd("c",t). (5)userspace VA
읽기는 in-context에서만 유효(밖=E14). (6)python -u + 파일리다이렉트(파이프 버퍼링 주의). **상세 핸드오프:
analysis-lab/docs/HANDOFF_LOADER_INTERCEPTION_2026-09-28.md.**

## §95 2026-09-28 loader-event interception 완료 — libea56+0x13a4bc 실레지스터 캡처 성공
[H1/H2 판별 — runtime-confirmed] relaunch-loop 포함 `_r_debug` link_map 재시험 결과, 848 loader events 중
Toss/bugsnag-visible events=396이나 libea56=0. 즉 H1(토스가 스캔 윈도에 없었다) 기각, H2( isolated-ns libea56가
global `_r_debug` link_map에 미등록/미노출) 확정에 가깝다. raw log:
analysis-lab/artifacts/android/logs/catch_libea56_linkmap_h2_20260928.log.

[핵심 정정 — binary-confirmed] 핸드오프 §5의 "`__dl_notify_gdb_of_load`(+0x4d634)에서 x0=soinfo*"는 틀렸다.
linker64 디스어셈 기준 실제 soinfo* entry는 `notify_gdb_of_loadP6soinfo` wrapper **+0x68bb4**이고, +0x4d634는
이미 `soinfo+0xd0`의 embedded link_map 포인터를 받는다. wrapper는 `soinfo+0x100`을 link_map l_addr로,
`soinfo+0x1a0`의 libc++ string(realpath_)을 l_name으로 세팅한 뒤 +0x4d634를 호출한다. 따라서 isolated/filtered
라이브러리는 +0x68bb4에서 잡아야 한다. tool `analysis-lab/android/scripts/catch_libea56.py`를 soinfo wrapper
기반으로 수정.

[성공 캡처 — runtime-confirmed] 수정 스크립트 1회 실행에서 event 7에 libea56 포착:
`soinfo=0xebc8fedb99c8`, `load_bias=0xebc592836000`, `flags=0x40000400`,
`name=/data/app/.../lib/arm64/libea56.so`, `anchor=0xebc5929704bc`. 이어 Z1@anchor가 guard 실행 전 장전됐고
`anchor_stop=T05thread:02;`에서 다음 검증 전부 통과:
`pc==anchor`, bytes=`20013fd6`, `x0==sp+0x1a8`, `x2==4000`, `*(u16)(x0+4)==1`, `*(u16)(x0+6)==0`.
캡처 레지스터: `sp=0xebc47f7fa270`, `x0=0xebc47f7fa418`, `x1=0x1`, `x2=4000`,
`x19=0xebc47f7fa554`. artifacts:
analysis-lab/artifacts/android/toss_anchor_capture.json,
analysis-lab/artifacts/android/logs/catch_libea56_soinfo_success_20260928.log.

[판정] §90~§93의 "delivery만 OPEN"이 닫혔다. Redroid/upstream-QEMU/HVF에서 Toss libea56 native guard
anchor를 polling 없이 동기 포착하고 실제 레지스터/메모리 검증까지 완료. 다음 분석 목표는 이 캡처 state를
기반으로 `0x13a4bc → afed8 → 0xa8f70` data-flow를 재구성하거나, anchor 직후 단일-step/추가 breakpoints로
handler 입력과 결과값 이동을 좁히는 것. RASP/root/emulator verdict 우회는 수행하지 않음.

## §96 2026-09-28 runtime data-flow 확정: 0x13a4bc=libc poll(), afed8→0x95224(self-destruct), 0xa8f70 REFUTED
[방법] loader hook로 libea56 base 획득(매 run 다름: 비결정적 isolated-ns dlopen) 후 HW bp로 indirect branch 직전
레지스터에서 CPU 실제 target 직독. OLLVM CFG 안 풂. tool: android/scripts/{trace_afed8_direct,trace_dispatch}.py.
[Q1 — 0x13a4bc의 X9 실제 target = libc `poll`] anchor(blr x9)의 x9=0xebc8e7087490가 두 run 모두 동일(libea56 base는
바뀌는데) → base 안정 모듈. maps: `/apex/com.android.runtime/lib64/bionic/libc.so` r-xp, RVA 0x69490 = `<poll>`(disasm
확인). 즉 0x13a4bc = **poll(&pollfd@sp+0x1a8, nfds=1, timeout=4000ms)**. §88 sanity 재해석: x0=&struct pollfd,
*(x0+4)=events=1(POLLIN), *(x0+6)=revents=0, x2=4000=timeout. **가드 poll-thread(thread:04)의 libc poll() 호출.**
[Q2 — callee가 afed8인가: REFUTED] 아니오. x9는 libc poll이고 afed8(base+0xafed8) 아님. §85(0x13a4bc≠afed8 스레드)·
§88(x9 table-resolved, afed8 아님) 런타임 확증. **"0x13a4bc→afed8→0xa8f70" 전제는 debuggerd 샘플 프레임 혼동이었음.**
[Q3 — afed8 실제 selected handler = 0x95224] afed8 직접 무장(base+0xafed8) → thread:04에서 HIT(x0=0=dispatch state,
x2=tagged ptr). dispatch 구조(static): 0xb02ac `br x10`=OLLVM flattening(u16 tbl 0x2c9c6 + case-pad 0xb019c),
**0xb02c4 `blr x8`=실제 handler 호출**(선행 mov x0,x19; mov w1,w4; mov w2,w5). 0xb02c4 직접 무장 →
**x8=base+0x95224** 캡처(thread:02, x0=x19=context=0xb400ebc7bb23a330, w1=0, w2=0). 0x95224 disasm=대형 프레임
(sub sp,#0xa60, x23=x0-context)= **§14 self-destruct(saved-LR poison) 핸들러**. 즉 redroid 환경탐지→afed8이 자폭
핸들러로 dispatch(그래서 프로세스 자폭; 첫 0xb02c4 hit이 곧 0x95224라 이후 dispatch 미포착).
[Q4 — +0xa8f70 가설: REFUTED(이중)] (a)선택 안 됨(0x95224가 선택됨). (b)**0xa8f70은 함수 엔트리조차 아님** — `ldr
x8,[x8]`+OLLVM opaque-predicate 산술(0x2e00d84656e407e0)로 시작하는 함수 중간 블록. 원래 0xa8f70은 debuggerd
샘플 프레임(중간 아티팩트)이었음.
[Q5 — handler 진입 register/context] afed8→0x95224 진입: pc=0xb02c4(blr x8), x8=selected handler=base+0x95224,
x0=x19=context=0xb400ebc7bb23a330(tagged heap ptr), w1=0, w2=0, thread:02. (afed8 entry: x0=0, x2=0xb400…tagged,
thread:04.) 아티팩트 artifacts/android/{toss_afed8_flow,toss_dispatch}.json.
[Q6 — 다음 최고정보 probe 1개] flattening dispatch `0xb02ac br x10`을 무장해 **0x95224 선택 前 case-index(=dispatch
state w8) 시퀀스**를 로깅 → 자폭을 유발한 탐지→verdict 체인 복원. 또는 0x95224 진입에서 context x19(0xb400ebc7bb23a330)
메모리를 덤프해 가드가 축적한 verdict/detector-set을 직독(§14 poison store 0xacca4까지 step). 둘 다 관측 전용.

## §97 2026-09-28 b02ac dispatch-state 시계열: normal=state0×N 후 신규 invocation state4 → b0354 → 0x95224 (2 runs 완전 재현)
[방법] tool android/scripts/trace_b02ac_states.py — loader hook로 base 획득 후 **b02ac(br x10)+b02c4(blr x8) 동시 Z1 무장**(2개 동시 HW bp
동작 확인), hit마다 seq/thread(vCPU)/t/x19/w8/x10/w4/w5/sp 기록 + **incarnation 검증(매 hit ELF magic@base + PC 코드워드)** +
x19(tag-masked) ctx 256/512B 스냅샷. run1: base=0xebc60182e000, run2: base=0xebc594258000 — artifact toss_b02ac_states_run{1,2}.json.
[결과1 — state 시퀀스 (양 run 동일, 완전 결정론적)] **82× w8=0x0→x10_off=0xb02cc + 정확히 1× w8=0x4→x10_off=0xb0354, poison=seq48**(46번째
state0 이후). #47(state4) 직전 #46은 state0이지만 **다른 invocation**(x19/sp 상이) — 즉 0→4 전이는 b02ac 루프 내부가 아니라 **새 afed8
호출이 x0(id)=4로 진입**(#47에서 w0==w8==4, x2==x19==ctx 입증; b0294 `mov w8,w0` 확인). camo33 §10차 "47×id-0 + 마지막 id-4→poison"
레드로이드 런타임 레지스터 수준 재확정 + **verdict는 afed8 호출자가 이미 결정, afed8(id4)은 집행(enforcement) 호출**.
[결과2 — state→target 실측+정적 교차검증] tbl@0x2c9c6(u16): tbl[0]=0x4c→pad 0xb02cc(normal continue, adrp x8,0x17c1e0 opaque 산술로
재루프), tbl[4]=0x6e→pad 0xb0354. **0xb0354: b 0xaff08** → opaque neg/magic(0x4b28f45f/0x4b28f47a) 산술 → `madd x8,idx,0x960,0x17c1e0`
2-D 테이블 → `ldr x8,[x8]`(**x8=base+0x95224 런타임 확정** — §88 "정적 해독 불가" 테이블의 실측 해) → `ldr x9,[0x182ea0]` br x9 라우팅 →
b02b8(mov x0,x19; mov w1,w4; mov w2,w5) → **b02c4 blr x8 → 0x95224 진입(x0=ctx, w1=0, w2=0; post-step PC==base+0x95224 실측)**.
[결과3 — wiring/identity] #47→#48: 같은 x19(0xb400ebc7bb2xxxx), 같은 sp(0x…e060), 같은 vCPU(04), t 동일(20.46), 매 hit elf=1/code=1 →
동일 invocation 인과사슬 증명. **스레드 정체: 84 hits 전부 단일 스택 아레나(run1 0xebc58069xxxx, run2 0xebc4aecxxxx) = 가드 단일
워커 스레드**, RSP thread:01–04는 vCPU 마이그레이션일 뿐(§96 "thread:02/04" 해석 정정). state0의 w5=해당 런 스택 로컬 주소 low32.
[결과4 — ctx diff] (a)같은 invocation 내 #47→#48(선택 순간) **diff 0 qword** — 선택이 ctx를 변경하지 않음(verdict는 이미 굳음).
(b)poison ctx는 normal ctx와 **다른 타입 객체**: normal(id0)=+0x00에 체크 피연산자 문자열(`ro.product.model`, `ro.kernel.qemu`,
`ro.secure.qemu`, `qemu.sf.fake_camera`, `init.svc.qemu-props`, `ro.boot.redroid_net_dns1/2`, build fingerprint류, persist.sys.bd.debug.*
등 — **가드의 property-scan 목록이 runtime에 직독됨**), poison(id4)=sparse 포인터 헤더(+0/8/0x10/0x20/0x28) + **+0x78 "\x10monitor"
태그(2 runs 동일)** + 그 뒤 포인터/고엔트로피 영역(런마다 상이 — per-run 데이터). poison ctx는 별도 힙 아레나(0xebc7bb… vs scan 0xebc6…).
[다음 probe] **afed8 entry(0xafed8)+b02ac 동시 무장, entry hit에서 x30(lr) 직독** → x0==4로 호출한 **호출자(결정 지점)** 특정. 금지 재검토
불요(0x13a4bc/poll/loader/0xa8f70/전체 deobf 미실시).

## §98 2026-09-28(2) afed8(x0=4) upstream 완전 역추적: Java 은닉 DEX의 R native 호출 → DexGuard 인터프리터 → bridge (tools: trace_afed8_caller{,2}, trace_marshaller{,2}, trace_vm_methods{2..7}, dump_hidden_dex{,2,3}, dump_savedargs{,2}, trace_vm_late{,2})
[P1 — caller 확정] afed8 entry 무장(모든 invocation 기록): **id0×46 전부 libea56 내부 래퍼 0xf8a98(blr x9, x1=0x5c000000 tag) + 예외 1회 0x1438b0(mov w0,wzr 즉시값)**, **id4=1회는 libea56 밖 0xebc639586d00(blr x16)에서 호출** — ELF 헤더 없는 anon 실행 매핑(0xebc639400000~, 런 간 베이스 안정). 같은 스택 아레나(가드 단일 워커 스레드) 순차.
[P2 — invoke bridge 해독] 호출부 = ffi/JNI 스타일 브리지: `x0=x19(bridge obj), x1=x28(saved-args), x2=sp(0x1400 scratch) → bl 0xebc639594940(marshaller) → x16=x0(반환=target=afed8) → ldp x0,x1,[sp]… blr x16`. **outgoing (x0=4, x1=invobj, x2=monitor ctx)는 marshaller가 scratch에 기록**. bridge obj(런 안정 0xb400ebc74b2xxxx): +0x00=0x5c000000 tag, +0xa8=saved-args 스택 ptr(low-bit tag!), +0xc8=monitor ctx ptr.
[P3 — marshaller = 은닉 DEX 인터프리터] 0xebc639594940 해독: x19=[x1]=invocation 객체, `ldr w8,[x19+4]` flags(bit18=대체경로), **`ldr w9,[x19+8]`=method idx → DEX 표준 체인(method_ids idx*8/`ldrh proto@+2` → proto_ids×12 → string) → x15=x8+x9=스트림 → ldrb opcode 해석 루프(cmp #0x42~0x48)** — 즉 anon 모듈=DexGuard가 unpack한 **은닉 DEX 인터프리터 런타임**. invocation 객체(0xebc5400b3a90, 런 안정)=메서드별 싱글턴 0x20B 행 배열(클래스 메서드 e7b..e7f=ReusableBufferedOutputStream 6개).
[P4 — 은닉 DEE...DEX 전체 덤프] afed8(4) 정지에서 invobj→[0]=0x2283e80(저주소 이미지)→+0x10→+0x10→parsed→+0x18=**dex base(0xebc604xxxx000)** → 0x200000B 청크 덤프 **성공(bad 0)** — artifacts toss_hidden_dex.bin. 헤더 +0x00..0x38(magic/checksum/sig)만 스크럽, ids(+0x38~) 무결: string 4467/type 2319/proto 1872/field 4496/method 6693/class 601. **문자열 전부 평문** — Toss 보안 클래스 전부 포함: `Lim/toss/selfprotect/{DexguardWrapper,DexguardRasp,DetectType}`, `Lim/toss/security/guard/TossApplicationGuard`(lambda0-25), `Lim/toss/core/guard/AbsAppGuard$$ExternalSyntheticLambda{0,1,2}`, `onRootDetectionResultReceived`, `security_guard_*` 스트링 리소스 등.
[P5 — R = §82의 JNI 경계 native] invocation idx=3707(0xe7b)=**`Lo/ReusableBufferedOutputStream;.R` access=0x109(STATIC|NATIVE) code_off=0** — §82 debuggerd 스택의 "R(Native method)"의 실체. R의 proto shorty "LII"((I,I)→L). R은 이 DEX 안에서 **단 1회 invoke-static {v9,v2}, R**(insn#22, caller=`Lo/ContentDataSourceContentDataSourceException;.IAuthTabCallback`, 172insns 해독 완료):
```dex
14: const/4 v2, #0
15: if-eqz v1, +7          ← 불투명 predicate (v1 = 진크 산술/프레임 잔존)
17:   invoke-static {v9}, ReusableBufferedOutputStream.run   ← 정상 경로(문자열 복호화 native)
22:   invoke-static {v9,v2}, ReusableBufferedOutputStream.R  ← v1==0 경로 = 자폭 native 호출 R(v9=4, 0)
```
IAuthTabCallback은 `invoke-static/range {v29}`(AA=1)로 onWarmupCompleted(regs=34,ins=5; 범용 문자열복호화 헬퍼, 148 callsites — arg0/arg1 상수 히스토그램 {48:117/65, 0:19/55, 기타}, **const 4인 callsite 없음**)에서 호출. 실행 순간 해석기 스택(sp±)에 invoke opcode word 0x2071 원본 + "tStream;"(클래스명 tail) + "cLambda3"/"oPlayerB"(인접 string_ids 해석 흔적) 관측 — 런타임 x0=4는 **R의 첫 Java 인자 v9(=IAuthTabCallback param1)** 로 런타임에 4였으나 정적 callsite 상수 아님(인터프리터 프레임/레지스터 체인 유래).
[P6 — late-window VM trace] marsh bp(0x494984)를 id0 40호 이후 무장: poison 직전 459 해석 메서드 = 평범한 <clinit>/문자열복호화(AppNode5.C, Hilt lambda, ViewModel init 등; 킬 발화 자체는 **두 번째 marshaller 경로(Thunk 0x6b30→0x4586c4)** 사용 — saved-args x3=thunk로 확인 — 0x494984 미경유).
[종합 causal chain — CONFIRMED]
```text
은닉 DEX <clinit>/초기화 코드 (해석기 실행)
  → onWarmupCompleted(문자열복호화 헬퍼, 148 sites)
  → IAuthTabCallback: opaque predicate if-eqz → run(정상) vs R(v9,0)(자폭) 분기
  → R(v9=4, 0)  [Lo/ReusableBufferedOutputStream;.R = STATIC NATIVE, §82 프레임의 실체]
  → bridge(0xebc639586d00) → marshaller/인터프리터(0xebc639594940)가 outgoing (4, invobj, monitor) 조립
  → afed8(x0=4) [b0294: mov w8,w0] → state4(tbl[4]=0x6e→pad 0xb0354) → 2D테이블 ldr x8=0x95224
  → b02c4 blr x8 → 0x95224 saved-LR poison → ret 0xc → SIGSEGV 자폭
```
[핵심 해석] **verdict 선택은 Java(은닉 DEX) 레이어의 opaque predicate 분기** — afed8(4)는 R native의 집행. id0(internal check)과 id4(R)는 서로 다른 경로. 남은 OPEN 1개: 킬을 발화시킨 IAuthTabCallback invocation의 v9=4가 해석기 프레임 어디서 왔나(두 번째 marshaller 0x4586c4 경로 추적 또는 인터프리터 레지스터 파일 캡처 필요). artifacts: toss_afed8_caller{,2}.json, toss_marshaller_dump.json, toss_vm_trace*.json, toss_hidden_dex.{json,bin}, toss_savedargs2.json, toss_vm_late2.json; tools: android/scripts/{trace_afed8_caller*,trace_marshaller*,trace_vm_methods*,dump_hidden_dex*,dump_savedargs*,trace_vm_late*,dex_tools.py,dexdis.py}.

## §99 2026-09-28(3) v9=4 provenance 추적: bridge 해독·Z2 프리미티브 확보·집행자 경로 부트 분산 확인 (환경 대란 포함)
[P1 — 두 번째 bridge 완전 해독] thunk 0xebc639586b30: `x16=*(*(0xebc639e0d348)+0x10)` → 0xe0 프레임 저장(진입 인자 x1..x7@[sp+0x50..]) → `bl marshaller-2(0x4586c4)(x2=bridge obj, x3=sp)` → `x16=x0; ldr x0,[sp](=args[0]); restore; br x16`. **outgoing x0 = args 슬롯[0]** — 진입 시 invobj가 들어가고 marshaller-2가 재기록. marshaller-2 에필로그 `0x458b60 str x20,[x19]`이 유일한 직접 store → **64k 런타임 샘플에서 x20이 단 한 번도 4 아님**(전부 invocation 포인터) = 정상 경로 확정, 살인 경로 아님.
[P2 — 살인 경로 재확정 + Z2 프리미티브] afed8(4)의 lr-4 = 0xebc639586d00 = **bridge-1**(marshaller-1 0x94940 사용) — §98과 일치. **Z2 write-watchpoint가 본 랩 QEMU/HVF에서 정상 동작함을 실증**(9,761회 트리거, 무크래시) — 향후 임의 메모리 슬롯 writer 관측 프리미티브 확보. 살인 dispatch 앵커 설계 완료: bridge-1 진입에서 `[x0+8]==0xe7b`(R의 method idx — 주소 무관 필터) → scratch[0](=sp-0x14e0)에 Z2 → writer 포착.
[P3 — 인터프리터 모듈 실체] "anon 모듈"은 libviva-arm64-v8a-527600.so(cache, 472KB)가 아니라 그것과 별개의 진짜 anon exec 매핑(브리지/마샬러 포함 ~1.6MB, libea56이 해제) — libviva는 Toss 자체 RN 라이브러리로 판명(바이트 불일치). 부트마다 주소 체계 전체 이동(linker base 재계산 필수: 이번 부팅 0xe685932b7000).
[P4 — ★집행자 경로의 부트 분산 확인] 재부팅 후 클린 Android에서는 **가드가 Java System.exit(status 0)로만 죽고 libea56이 로드되지도 않음**(soinfo 훅 31이벤트 중 ea56 0건, 살아있는 앱 maps에 libea56 없음, am_proc_died 12s 주기) — §56 "exit caller varies(RASP/DexguardWrapper/TG)"의 부트 단위 실증. **afed8(4)/R(4,0) 경로는 특정 부트/앱 상태(오염된 장시간 churn 환경 — §97/98 전체 데이터의 조건)에서만 선택됨**. v9=4 writer의 런타임 캡처는 이 경로가 다시 활성화되는 부트에서 probe F3(libea56-로드 정지 시 모듈 시그니처 스캔 → bridge-1 idx 필터 → Z2)로 즉시 실행 가능.
[환경 — 재부팅 내구성 확보(사용자 진단 반영)] RC1(일회성 cloud-init)/RC2(unattended-upgrade 커널 139→142 드리프트)/RC3(142 binder 부적합) 수리: grub 139 고정(/etc/default/grub 직접 지정), apt-mark hold, unattended-upgrades 차단, /etc/modules-load.d+binder.conf, docker --restart unless-stopped, sysctl noaslr(런타임 미적용 — 매부팅 수동 echo 0 필요), networkd-wait-online mask, cloud-init.disabled. qcow2 스냅샷 good-139-patched(디스크). **savevm은 동작하나 loadvm은 QEMU11/HVF ARM 버그(cpu_pre_load assertion)로 크래시 — 빠른복원 불가, 재부팅(~3분)+자동복구가 실용 경로**. scripts/boot_lab.sh(모니터 소켓 포함 부트 스크립트). churn 리셋은 docker restart redroid로(VM 재부팅보다 안전·가벼움).
[남은 OPEN] v9=4의 최종 writer( marshaller-1 내 scratch[0] 기록 instruction + 그 소스) — 분석 설계 완료·프리미티브(Z2) 확보, afed8(4) 경로 활성 부트에서 1회 런으로 closed 가능. tools: android/scripts/{dump_marsh2,trace_outx0_writer,trace_v9_watch,trace_scratch0_watch{,2..6},trace_v9_probeF{,2,3},boot_lab}.py + artifacts toss_{marsh2_code,outx0_writer,v9_watch,scratch0_watch*,v9_probeF*}.json.

## §100 (IN PROGRESS, handoff됨) — execution-path bifurcation 자동 분류 + writer 캡처 설계 (supervisor v1/v2)
[상태] supervisor v1(adb-only classifier)+v2(afed8-앵커 deep probe) 설계·구현 완료, v2 실행 전 세션 중단 →
**HANDOFF_S100_EXECUTOR_BIFURCATION_2026-09-28.md** 로 인계. 핵심 위임 과제: **native(afed8(4)/poison) vs
Java(System.exit) 집행 경로를 선택하는 조건 규명** (§99에서 "churn이 원인"이라 가정하지 말 것 — 미증명 상관).
[§100 부분 결과] (1) 이 부팅 위상에선 libea56이 대부분 incarnation에 로드됨(watcher) — §99 클린부팅(0건)과 다른
제3 위상. (2) libtg.so 파일에 bridge SIG 부재(패킹). (3) 현 부팅 anon 클러스터(e14e72/76/81) 22분 in-context
스캔 SIG 없음 — libea56/libtg 클러스터(~e14b0…) 미스캔. (4) **v2 핵심 설계: afed8(4) 진입의 LR이 bridge-1 주소를
직접 계시(lr−4) — 시그니처 탐색 불필요, 다음 run에 그 주소로 Z2 writer 캡처**. (5) adb quoting 버그 수정
(`su 0 sh -c` 단일 인자). [환경] linker base 현부팅 0xe14e83ea4000, runwatch.sh 상시 가동, 루프 정리됨.

## §101 — 집행 경로 원인 규명 + 경량 writer 캡처 준비 (2개 세션 통합) → G2 시리즈로 writer 확정
[§100 확정 — supervisor2] **afed8-only 경량 bp = native path 3/3 재현 레시피**: 정확히 46 id0 → afed8(4)(t=1.2~2.05s). **bridge-1=0xe14bc0d86d00, R invobj=0xe14ac00b3a90 — 3 incarnation에서 동일(lr−4 트릭으로 계시)**. afed8(4) sp 하위 12비트 항상 0x0f0(프레임 깊이 결정론적, 스택 베이스만 런마다 변동). **무거운 bridge-1 bp(76,500 stops)는 native path 자체를 소멸시킴(프로브 효과)** — 이것이 §100 deep 실패의 원인(경로 소멸 + [x0+8] 필터 불일치 의심 병존).
[집행 경로 원인 — "서버 등록 기기" 가설 검증(사용자 가설)] 자유실행: ~10s Java System.exit(0). airplane-mode 무효(redroid eth0). **패키지 네트워크 차단(cmd connectivity set-package-networking-enabled false, set-chain3)에서도 System.exit(0) 유지 + logstore에 fds_detected result=[DEBUGGER] / postRaspResult detected=debugger / handleExitPlan caller=RASP exitPlan=EXIT** → 즉시 원인은 **로컬 RASP→FDS→handleExitPlan(EXIT)**, 실시간 서버 응답 아님. **DEBUGGER 검출원 = ro.debuggable=1**(userdebug redroid; §56 지식과 일치). 집행자 상관: 경량 gdb→native(1.3s), 무거운 gdb→id4 소멸, 자유실행→Java(10s) — "두 집행자 모두 무장, 타이밍 레이스" 모델(미증명).
[§101 준비 — probeG2.py (작성·수정 완료, 실행 전 인계)] 경량 late-bridge 설계: afed8-only로 카운트 → **46번째 호출에서 bridge-1 추가 무장(마지막 몇 dispatch만 정지 — native path 보존)** → R dispatch 필터(x0&mask==0xe14ac00b3a90 또는 [x0+8]==0xe7b) → **Z2 on scratch[0]=sp−0x14e0 → 4의 writer 포착**(전레지스터+코드윈도우+프레임윈도우) → 동일 run afed8(4)로 체인 확인. adb quoting 3가지 함정 수정(단일 인자/내부 따옴표/linker64$ 이스케이프 — 정상 폼은 `grep linker64 … | grep "r--p 00000000" | head -1`), 첫 adb 호출 재시도 루프.
[환경] linker base 현부팅 0xe14e83ea4000, runwatch 가동, 루프 정리, 게스트 자유실행 중. **다음 세션: HANDOFF_S101_WRITER_CAPTURE_2026-09-28.md → §3 "RUN probeG2 FIRST"**.

### §101 실행 결과 (2026-09-28 심야 G2 시리즈 10런 — writer 명령 확정 + 파이프라인 전체 구조 규명)

**[G2 1차(probeG2.py 원안) → NO_NATIVE의 원인 2개 판명]** (1) **anchor 필터가 invobj를 x0에서 찾았으나 실제로는 x1에 존재** — afed8(4)의 x1=0xe14ac00b3a90이고 bridge blr 시점에 이미 인자 스테이징 완료(§100 "x1-style args" 관측의 정체). G2b로 검증: **[x1+8] 하위32=0xe7b(idx 필터 자체는 유효)** — OPEN Q3 해소: 필터는 x1에 적용해야 함. (2) bridge-1(0xe14bc0d86d00)은 **R 전용이 아니라 공유 OLLVM blr-트램폴린** — 46→47 사이 **112,266회** 트랩, gdb 왕복(~2.6ms/트랩)이 300초 데드라인 소진(기아). 주소 자체는 불변(재확정), §100 기록 SIG(`ff8303d11083bcb0`)은 **오류** — 실측 SIG16=`00023fd6e10300aa e00313aa0200669e` = `blr x16; mov x1,x0; mov x0,x19` (스텁 정합).

**[G2c — 슬롯 지도]** afed8(4)(call#47, 3/3 재현) 시점 스택의 값-4는 **2곳: sp47−0xd10, sp47−0x3d8**. 46 id0 루프는 지배 프레임(sp low12=0x7c0), afed8(4)는 **0x930 얕은 프레임**(low12=0x0f0) — 마샬링 프레임은 #46→#47 창에서 신규 생성. invobj 구조: +0=0x1020010902281e80(태그), +8=0xfffe0001_00000e7b(idx+플래그), +0x10=libea56+0x10ec88 포인터, +0x18=bridge 근처 스텁(0xe14bc0d86b30), +0x20부터 idx=0xe7c인 제2 invocation 레코드 — DexGuard 디스패치 테이블.

**[G2d/e/f/g — 파이프라인 구조]** #46→#47 창(~1.4s 게스트)은 **다단계 VM 파이프라인**: slot A(sp47−0xd10 = sp46−0x3e0 = §99의 scratch[0])은 **모든 스테이지의 스크래치** — Z2 감시 즉시 기아(G2d 116k, G2e 440k+ 무변화 트랩에도 루프 미종료; 앱은 게스트시간 ~1000× 감속으로 생존). 스테이지: **P1=0xe14e7e365240**(anon 인터프리터 클러스터, 절대주소 안정, 프레임 sp46−0x3a0, 복귀 0x…52a0/0x…533c 2종) ↔ **P2=libea56+0xda2d4**(오프셋 2 incarnation 일치, 프레임 sp46−0x410) 교대. G2h 스테이지 스키퍼(Z2 스톰→Z1@storm_pc→LR→Z1@LR 복귀)로 **라운드 24개 통과 + native path 보존 afed8(4) 도달** — 스킵 체인은 경량(라운드당 2트랩). 경계값 진행: 0x0→stackptr→0xe14e713bd760→…→(최종 4).

**[writer 확정 — 정적 디스어셈블]** 게스트 libea56.so md5=1783dc40…로 워크스페이스 사본과 동일. **libea56+0xda2c8 = worker 함수 엔트리(`stp x28,x27,[sp,#-0x60]!`), +0xda2d4 = `stp x22,x21,[sp,#0x30]` = slot A의 writer** — "스톰"의 정체는 이 worker가 10만+회 호출되는 것(프롤로그 spill이 매번 slot A 덮어씀). **슬롯 최종값 4 = 마지막 worker 호출 시 x22**. §99 OPEN Q1의 전반부(“4를 쓰는 정확한 명령과 소스 레지스터”) 해결: **writer=`stp x22,x21,[sp,#0x30]`@libea56+0xda2d4, 소스=x22**. (G2d가 봤던 +0xb62d4 스톰은 오프셋 스캔 루프 `add x10,x9,#1`로 무관 — G2d 부팅에서 그 절대주소는 libea56 밖이었음.)

**[G2j — 최종 worker 호출 포착(실행 중→아래 아티팩트)]** Z1@worker 엔트리(+0xda2c8) + 히트마다 p22 1패킷, **x22==4인 마지막 호출 필터** → 호출자(인터프리터 P1)의 복귀주소·전레지스터·코드윈도우 캡처 → afed8(4) 동일 run 체인. x22 샘플: 초기 0xb400e14c82a968b0(태그 힙 ptr, ~430히트/초).

**[G2 시리즈 운영 교훈 — 다음 세션 필독]** ① **gdbstub paused(debug) 복구법**: 클라이언트 비정상 종료/역직렬화 후 `attach → c(미소비 정지 drain) → \x03 → D` 사이클로만 해제(모니터 `stop;cont`로는 안 풀림, QEMU 11). 모든 probe cleanup 선두에 interrupt-drain 삽입 완료. ② **포트 1234에 raw 소켓 접속만으로 VM이 정지** — 절대 헬스체크 금지. ③ QEMU stop 패킷의 `watch:ADDR` 필드로 Z2 트랩 주체 식별 가능(단 간헐 누락 — thread 교차시). ④ Z1/Z2 트랩마다 전체 vCPU 정지 = 게스트 ~1000× 감속 — 자유실행 1.4s 창이 런에서는 수백 초가 됨(기아 산술: 트랩수 × 2~3ms). ⑤ 경량 레시피 갱신: **afed8-only 47정지 + 라운드 스킵(Z1@P1 입구/복귀)** 조합이 native path를 죽이지 않는 상한선.

## §102 2026-09-28(4) — instrumentation 검증이 G2 시리즈 대량 카운트를 기각하고 최종 4-writer를 다시 확정 (S102 directive)

**[배경 — 사용자 지시: "Toss보다 먼저 debugger를 의심하라"]** G2d/e/f/g/j의 대량 hit count(116k/440k/520k)는 stop 처리기가
**step-over dance 없이 continue**했기 때문에 같은 미실행 명령의 즉시 재트랩으로 오염됐을 수 있다는 지적. 추가로 G2j의 `p22`
패킷은 hex 34(=v0 저 64비트)를 읽는 레지스터 번호 오류. **이 세션은 계측 검증 → 카운트 재판정 → 최종 writer 재포착 순서로 진행.**

**[1. probeZ_semantics — dance 의식화 후 semantics 판정]** 모든 히트에서 `remove bp → g(old regs) → s → g(new regs) →
assert pc_new≠pc_old → re-arm`: **Z1 47/47 진행, Z2 20,931 이벤트(진행 실패 0, INSTRUMENTATION_ERROR 0), afed8(4) 도달(t=127s,
call#47, slotA=0x4 동일 run)** — QEMU11/HVF gdbstub의 Z1/Z2는 dance만으로 완전히 신뢰 가능. 용어 교정(S102): STORE_CHANGED /
STORE_SAME_VALUE / NO_ADVANCE_ERROR / UNATTRIBUTED_STOP(watch: 필드 없는 stop은 근거 없으면 slot store로 계수 안 함).

**[2. 대량 카운트 판정]** G2d 116k / G2e 440k+ / G2j 520k(×상수 x22) = **CONFOUNDED→실질 REFUTED**(실제 이벤트당 평균 ~20-25회 재트랩).
"worker 10만+ 회 호출", "mega-round 수십만 iteration", "hit/sec 기반 guest 실행 추론" 전부 폐기. **실측: #46→#47 창의 slot A store
이벤트 = 20,992회(G2k 런 20,992 / probeZ 런 20,931 — 런 간 ±0.3% 재현), writer 명령 192종.** "P1↔P2 교대 라운드가 파이프라인의 전부"
= REFUTED(선두 수십 이벤트만 설명; top writer는 0xe14e7e3563f8×3980, 3인령 트리오 0xe14bc0ca43a0/0xe14bc104bf18/0xe14bc0ca54d8
각×3253 등; lib+0xda2d4와 P1 0xe14e7e365240는 top-25 밖). 커널 주소(0xffff8000_8169cexx) stop ~800 = 유저 watchpoint가
커널 모드 접근에서 발화한 경계 사례(해석 보류).

**[3. probeG2k_final4 — 최종 4-writer 재확정 + 체인 폐쇄(동일 run)]** 4는 상투값(4-writes 35회; 0xe14e674a20b4가 0x30→4로 34회).
**최종 이벤트(#20992): `stur q0,[sp,#0x28]` @ 0xe14bc1318f70 — slot A는 그 상위 절반.** 값 소스 = **비트스트림 디코더**:
`ldr x17,[x12,w17,uxtw#3]`(폭 테이블) → `lsr x12,x12,x15`(오프셋) → **`orr w12,w15,w12` = 4의 직접 소스(w12)** → `dup v2.4s,w12` →
`ushl v0.4s`(레인별 시프트) → q0 스토어. 정지 시 **x5=0x4**(디코딩 id 병행 보관 — dispatch로 직결 후보), x8/x20/x28=0xe14a47cf1a80
(입력 비트스트림 버퍼), x16=0x30(비트 오프셋), x17=0x84247500451c8000(스트림 차기 8B). 직후 7-값 검증 루프(f78..f8c) + halfword
패킹(f90..fb0, [x0+0xb4..]). 최종 3-이벤트 수렴: 0x8200000134 →(0xe14bc1318d50) [4,4] →(0xe14bc1318f70) 4 → **afed8(4) 1이벤트 뒤
(t=121.45, call#47, slotA=0x4)**. 호출자 0xe14bc0cfbbd0 체인: 0x150B 스택버퍼 0-클리어 → bl 0xe14bc138ebd0 → 디코딩 필드
([sp+0x14],[sp+0xe8] 등) 읽어 은닉 구조체([x19+0..0xb8])로 복사.

**[4. §99 OPEN Q1 최종 판정]** "scratch[0]=4의 writer + 소스 레지스터" = **writer: `stur q0,[sp,#0x28]`@0xe14bc1318f70(anon
디코더 클러스터), 소스: q0 ← w12(비트필드 디코드) — "x22=4 → libea56+0xda2d4가 최종 4 기록" 가설은 REFUTED**(+0xda2d4의
`stp x22,x21,[sp,#0x30]`은 실존 writer이고 x22==stored-value는 런타임 확인됐으나 최종 4와 무관). §98 체인의 native 인자 4는
**은닉 비트스트림에 상수로 인코딩돼 디코더가 추출**하는 것으로 확정 — DEX v9=4와의 정밀 매핑(디코더 비트레이아웃 ↔
toss_hidden_dex.bin ↔ IAuthTabCallback insn#22)은 미해결(별도 대형 작업, 핸드오프 참조).

**[환경 정리]** 런치 루프 제거·앱 force-stop·runwatch 잔존(로그 0바이트 — 기록 안 됨, 다음 세션 점검 항목)·게스트 자유실행·
linker base 0xe14e83ea4000(부팅 불변). artifacts: `toss_s102_probeZ.json`(semantics+af4), `toss_s102_probeG2k_final4.json`
(최종 writer 전레지스터+코드/호출자 윈도우+히스토그램). scripts: `probeZ_semantics.py`, `probeG2k_final4.py`(dance 의식화 표준).

## §103 2026-09-28(5) — SIMD provenance 완결: 최종 4 = 패킹 레코드 0x7500451c의 니블3, 전 체인 offline 재현 (S103)

**[배경 — S103 지시: "w12/x5/q0 중 누구도 미리 정답으로 가정하지 마라"]** §102의 `orr w12,w15,w12`→4 모델은 OPEN이었고,
이번 세션이 이를 **정밀 기각 + 실측 체인으로 대체**했다. 결론부터:
`캡처된 스트림 워드 x17=0x84247500451c8000 →(>>16)→ 패킹 레코드 0x7500451c → dup v2 → SIMD 니블 언팩(shift[4,8,12,16],
mask 0xf) → 레인 [1,5,4,0] → stur q0,[sp,#0x28] → slot A=lane2|lane3<<32=4 → bridge → afed8(4)` — 전 단계가
**캡처된 런타임 값만으로 offline 산술 재현됨**(저장 레인과 바이트 정합, x15=(x17&0xffff)<<48 교차검증 포함).

**[1. 계측 원칙 3종 추가 확정]** (1) **bp가 걸린 PC에서 single-step는 실행 없이 재트랩** — Z1@블록入口 8f38에서 스텝
시도 → 183,428회 STEP_NO_ADVANCE 교착(게스트 동결). 스텝 전 해당 PC의 bp 제거 필수(dance의 일반화). (2) **QEMU
aarch64 g-패킷은 268B(코어33×8+cpsr4)에서 종료 — v0-v31 미포함**, 벡터는 target.xml regnum(=34~)의 개별 pN으로만
읽기(qXfer:features:read + XML 파싱으로 번호 확인, 추측 금지 준수; g=2156B 계산값과 self-check). (3) 유저스페이스
재편(systemui 재시작)으로 anon 클러스터 재배치 — 오프셋 불변(…18f70) 확인, 절대주소는 아티팩트 동적 파생으로 대응.

**[2. OLLVM 제어흐름 평탄화 실측]** 최종 writer 주변 "선형 블록"(8f38-8f74)의 조각들은 디스패처 점프로 각기 진입:
주 스레드 최종 경로는 8f60(ushl)~8f70(stur)만 실행(8f38-8f5c 스킵) — 블록入口 Z1이 0회인 반면 8f60/8f68은 타
스레드가 실행. **최종 writer는 incarnation마다 가변** (신 S103 run: STUR 1회 non-4, 최종 4는 타 writer; S103d run×2:
STUR이 최종). Z2 스트림만이 매 run 실제 승자를 포착 — G2k+SIMD 병합(probeS103d_z2simd.py)이 정답 설계.

**[3. 최종 4의 실측 데이터플로우 (S103d, dance 검증, same-run afed8(4) 1이벤트 뒤)]** 스토어 정지 시점 캡처:
v0(=q0) lanes **[1,5,4,0]** (high64=4) — 스토어 후 [sp+0x28..0x38] 바이트와 **완전 정합**; v2=**0x7500451c** 4레인
브로드캐스트(이전 OLLVM state의 dup), v3=0xf/lane, x5=**4**(스칼라 병행, 3회 연속 동일), x12=0x564(이번 방문 ORR
잔존 — 최종 저장에 불사용), x17=0x84247500451c8000, x16=0x30. **w12=4 가설 기각 확정**(w12=0x564이며 소비 안 됨);
4의 최초 materialize = **ushl+and(8f60/8f68)의 lane2** = 0x7500451c의 bits[12:15]. 니블 [1,5,4,0]은 [x0+0xb4..]
halfword 재패킹(8fa0+)으로 이어짐 — 레코드의 필드군 중 하나가 디스패치 id.

**[4. hidden DEX 정적 매칭 — 음성]** x17 워드/필드 바이트가 toss_hidden_dex.bin(2MB)에 **등장하지 않음** → 비트스트림은
런타임 변환(암호화/화이트닝) 산물 또는 별도 버퍼. **A++(DEX v9 ↔ 인코딩 레코드)는 별도 VM 포맷 RE 작업으로 확정**
(종료 B). x5=4의 writer 명령(블록 이전)도 OPEN.

**[아티팩트/스크립트]** `toss_s103_simd.json`(run1-4: 교착/재편/평탄화 증거), `toss_s103d_z2simd.json`(최종: 전레지스터+
v0-v4 128비트+sp28_16B+비트스트림/테이블 덤프), `probeS103_simd.py`, `probeS103d_z2simd.py`(XML regmap+pN 벡터 리더
포함, G2k 계열 정식 후계). 게스트: 루프 정리·앱 정지·runwatch 잔존(무기록 여전)·linker 0xfffff7e6c000(신 레이아웃).

## §104 2026-09-28(6) — slotA=4 → afed8(4) 마샬 체인 완전 폐쇄 (S104, 16,252스텝 same-run 캠페인)

**[방법 — Z2 앵커 + 대예산 단일스텝 캠페인]** Z2(slotA)로 최종 4-write를 감지한 직후 **모든 bp/감시 해제 후 단일스텝 트레이스**(
매스텝 g + 주기적 slotA 샘플, 성공 시 생프로세스에서 명령바이트 일괄 패치). 8회 시행 끝에 성공: 디코더 store(…8f70) →
**16,252스텝** 만에 afed8(4) (구간이 ~1.6만 명령이라 3,000 예산 런들은 실패했던 것). 런5-6의 벌레: 캠페인 시작 시
낡은 DUP 상수만 해제하고 **live dup Z1을 남겨** 8f4c 위로 스텝 진입 → S103 교착 법칙으로 중단(2181스텝). 교훈:
**캠페인 진입 시 active 목록 전체를 해제할 것.**

**[확정된 실행 체인 (전부 실측)]**
```
stur q0,[sp,#0x28] @0xfffd22718f70            (slotA=lane2|lane3<<32=4)
  → +68스텝: ldrh w15,[sp,#0x30] @…8f98       ← slotA READER (halfword=4; ldrh w13-w16 쿼드)
  → strh 패킹 [x0+0xb4..0xb8]                  (레코드 필드 반쪽짜리 재패킹)
  → ~8.4k스텝 VM 마샬링; 이 구간 x0=4 전이 3회 전부
      ldr w0,[x29, w3, uxtw #2] @0xfffd2259ca04  ← VM 레지스터뱅크 인덱스 읽기(x29=프레임, w3=인덱스)
  → 최종 산술: and w8,w9,w8 ; add w8,w10,w8,lsl#1   @libea56+0x110cf0..f4
  → mov w0, w8                                 @libea56+0x110cfc  ← 최종 x0=4 스테이저
  → mov x2,x0 / mov x3,x1 ; br x6              @libea56+0x110d04  ← afed8으로 레지스터 테일점프(x6=&afed8)
  → afed8(x0=4)                                (스텝 16251; 이 경로는 …6d04 블룻 브릿지 아님)
```
동일 run·동일 invocation(스텝 단일 연속, slotA 끝까지 4 유지 — 8000+ consumed-가드 무발동이 최종 write임을 재확인).

**[x17→v2 producer (S104 런1, 20+회 관측)]** `dup v2.4s, w12` 실행 정지에서 **pre-w12(x12)=0x7500451c, x17=0x84247500451c8000**
— §103 산술 `(x17>>16)&0xffffffff==0x7500451c`를 실행 시점 레지스터로 재확인. (런1 아티팩트가 후속 런 경로 덮어쓰기로 소실 —
값은 세션 로그에 보존; 이후 프로브는 런마다 아티팩트 경로 분리할 것.)

**[기각/정정]** x5=4는 최종 캐리어 아님(최종 스테이징 시 x5=0 — 중간엔 0x20; `mov w0,w5` 부재). "짧은 마샬 창" 가정 기각 —
최종 store→afed8(4)는 **~1.6만 명령**(slotA 마지막 쓰기 이후에도 VM이 계속 디코드/마샬). 최종 writer·브릿지 형태는
incarnation마다 가변(이번은 br x6 직접 점프; …6d04 블룻은 다른 경로).

**[아티팩트/스크립트]** `toss_s104_marshal8.json`(16,252스텝 전체 + x0 전이 4 + 명령바이트), `probeS104_marshal.py`
(캠페인 표준: 동적 디코더-store 발견(pc&0xffff==0x8f70+§103 시그니처) → 그 pc만 캠페인). 게스트 정리 완료(앱 정지·
runwatch 잔존). **다음 세션**: DEX v9 매핑(A++, §103 핸드오프 레시피) 또는 w8/w10 상류(레지스터뱅크 이전 scalar 경로).

## §105 2026-09-29 — "record↔VM-bank" def-use 부재 판명: id=4는 3중 독립 인코딩 (S105/S105b)

**[방법]** §104 캠페인을 풀레지스터(스텝당 x0-x30)로 재실행(1회 성공, 16,249스텝, `toss_s105_bank.json`) +
EA/값 계산 오프라인 분석기(`analyze_s105_defuse.py`) + **뱅크 슬롯 자체 Z2 감시**(sp46+0x338, S105b,
`toss_s105b_bankwatch.json`, 뱅크 write 14,924이벤트 전포착).

**[핵심 판정 — 가설된 두 edge 모두 데이터플로로 부재(REFUTED), 실제 구조 CONFIRMED]**
```
① 호출자 스칼라: 인터프리터(3-인자, 진입 0xfffd22032f24) 호출 시점에 호출자 x27=4 (x12=4 병행)
   → 프롤로그 stp x28,x27,[sp,#0x50] @0xfffd22032f2c → [sp+0x58] = "VM-bank v3 슬롯"(=sp46+0x338)
     (S105b 이벤트 n=102, t=1.92s; before=0x22170374→4)
   → 인터프리터 실행 중 ldr w0,[x29,w3,uxtw#2] (idx=3, EA=…8af8) x0=4 2회 — VM 레벨 인자 사용
② 디코드 스트림: slotA=4 write 35회(전부 n≥19996 — 뱅크-4보다 19,900이벤트 뒤!)
   → ldrh w15,[sp,#0x30] 리더 → strh 패킹 [x0+0x12e]=4 → 이후 반워드 판독 없음(데드 데이터,
     step 829에서 스택 프레임 재사용)
③ 최종 디스패치: w8=4 = 상수 산술 복호화 — ldr x8,[x8,#0x5f0](상수테이블) + movk w10,#0x47c3,lsl#16
   → add w9,w10,#4 ; neg w8,w8 ; eor w10,w9,w8 ; and w8,w9,w8 ; add w8,w10,w8,lsl#1 → 4
   → mov w0,w8 @lib+0x110cfc → br x6(=ldr x6,[x11,w9,sxtw#3] 점프테이블의 &afed8) → afed8(4)
```
즉 **id=4는 DexGuard 스킴에서 호출자 스칼라 / 스트림 레코드 / 디스패치 상수쌍으로 3중 인코딩**되어 병렬 발현하며,
"packed record → 뱅크 슬롯"·"뱅크 값 → 최종 w8" 같은 단일 데이터플로는 존재하지 않음. §104 체인의 각 명령적 사실
(reader/packing/뱅크로드/최종스테이징)은 그대로 유효하나 그들 사이의 인과는 "같은 id의 병렬 발현"으로 정정.

**[S105 부산물]** 뱅크 영역(=인터프리터 프레임 상부)은 스택 재사용 지대 — 뱅크 write 14,924회(그중 after==4 6회),
afed8(4) 시점 뱅크값은 0x225a73c4(재침범) — "VM 레지스터뱅크" 관측은 시간창을 좁게 잡아야 함. 캠페인 창
(최종 slotA write 이후 ~16.2k스텝)의 완전한 실행 트레이스+명령바이트(7,602 pc)는 `toss_s105_bank.json`에 보존 —
이후 어떤 def-use 질문에도 재분석 가능.

**[OPEN 경계]** 호출자의 x27=4 상류(인터프리터 호출 직전 마샬러의 스칼라 준비) — 1 edge 추가 추적 가능하나
S105 지시 범위(두 edge)를 넘고, 그 위는 §103 이래의 스트림/DEX 인코딩 RE와 합류. DEX v9 매핑(A++)은 여전히
별도 작업. 아티팩트/스크립트: `toss_s105_bank.json`·`toss_s105b_bankwatch.json`·`probeS105_bank.py`·
`probeS105b_bankwatch.py`·`analyze_s105_defuse.py`(런별 파일, 덮어쓰기 없음). 게스트 정리 완료.

## §106 2026-09-29(2) — 상위 selector 부재 판명: 3중 재료화는 빌드타임 삼중 인코딩, 런타임 공통체는 invocation 컨텍스트 (S106)

**[질문 — S106 지시]** 세 materialization(①스칼라 x27→뱅크 ②스트림→slotA ③디스패치 산술→w8)을 공통 결정하는
상위 runtime state/selector가 존재하는가?

**[1. 디스패치 경로 selector = 순수 정적 상수 (파일 재현 완료)]** 최종 스테이징(lib+0x110c88~)의 지수·값 산술:
`K = *(u64*)(libea56+0x1835f0)`(파일에서 실측 0xe6a7f4c147c3fc75 — runtime과 동일) + `C=0x47c3fc75`(movk쌍) →
neg/eor/and/add → **인덱스 w9=0x28과 값 w8=4가 모두 파일 상수만으로 offline 재현(MATCH)**. 점프테이블 엔트리
`*(lib+0x17c1e0+0x28*8)`는 파일값 0(런타임 재배치로 &afed8=lib+0xafed8 주입). 이 사이트엔 runtime 입력이 없음 —
**사이트 선택은 제어흐름**: 직전 함수는 CAS 동기화(casl 루프) 후 `mov x16,x0; ldp x15,x17,[sp,#0x80]; mov sp,x17(스택
교체!); blr x16` — 코루틴식 인계로 스테이징 진입(x16의 상류: mov x16,x0 ← 호출자 레지스터 인계).

**[2. 스칼라 경로 x27=4 = callee-saved 캐리 (veneer층에서 생성 아님)]** S106 런(은행-4 이벤트 n=102 완전 재현,
x27=4·x12=4)의 호출자 코드 윈도우: 인터프리터 호출은 **반복 veneer 패턴**(0xfffd225a7510/570/5d0/630… 동일
save/블록, 각기 다른 해석기 타깃 bl) — veneer는 x27을 `stp x27,x28,[sp,#0x40]`로 **저장만** 하고 쓰지 않음.
x27=4의 원 writer는 veneer층 위(마샬링 웹 상류) — 이번 범위 밖 OPEN(별도 1-edge 추적 가능). veneer의 상태:
**x19 = 태깅 컨텍스트 객체(0xb400ffff04ed8dc0)** — 모든 veneer가 `ldr w20,[x19,#0x20](상태카운터) / ldr x16,[x19,#0x98]
/ str x16,[x19,#0xa8]` — 인보케이션 진행 상태 관리. 해석기 인자: x0=인자블록, x1=구조체, **x2=비트스트림 포인터**
(윈도우 내용 0xc73007100000005… = 인코딩 스트림 워드 — ②의 소스와 동일 매체!).

**[3. 런타임 공통체 = invocation 컨텍스트 (2객체)]** (a) veneer층 x19(태깅 Java-side, +0x20/+0x98/+0xa8 상태),
(b) 네이티브 인보케이션 블록 0xfffc400b3a90 — S105 트레이스에서 **883스텝 레지스터 상주(x19/x20)·115회 필드
읽기(+0x20/+0x24/+0x38)**로 마샬링 웹 전체에 실려 afed8의 x1로 진입. 두 객체가 "어떤 인보케이션이 진행 중인가"를
식별 — 세 재료화는 모두 이 컨텍스트 안에서 실행됨.

**[종합 판정]** **공통 runtime selector는 부재(REFUTED)** — 세 경로는 각각 독립 소스(디스패치=lib 정적 상수 /
스트림=은닉 비트스트림 / 스칼라=callee-saved 상류 캐리)를 가짐(지시의 대안 성공조건 충족). 경로 간 의미 일치는
**빌드타임 삼중 인코딩**(DexGuard 바인더가 같은 id를 스트림 레코드·스칼라 규약·K/C 상수쌍으로 동시 발행)으로
보증되며, 런타임은 invocation 컨텍스트로 어느 결합이 발화할지만 선택. 16,249스텝 풀레지스터 트레이스+14,924 은행
쓰기 전수에서 경로 간 runtime def-use/교차 참조를 발견하지 못한 것이 소극 증거.

**[아티팩트]** `toss_s106_x27.json`(은행-4 + 호출자 코드/인자 윈도우), `probeS106_x27.py`. 게스트 정리 완료.
OPEN: x27=4 원 writer(veneer 상위), DEX 레벨 결합(기존 A++ 그대로).

## §108 2026-09-29(3) — 프로그램 헌장 전환: 전체 VM deobfuscation + detector/FDS 분석 개시 (S108)

**[헌장]** 종전 금지 항목이었던 두 트랙이 사용자에 의해 공식 목표로 승격: (A) DexGuard VM 전체 deobfuscation,
(B) detector/FDS 분석. 단 B는 **우리 랩 VM에서 앱이 자발적으로 송신하는 트래픽의 수동 관찰로 한정** (실서버
probe/우회/위조 없음 — 종전 원칙 유지).

**[Track B-1 — 엔드포인트/채널 확정 (5사이클 tcpdump, 2.8MB pcap `fds_cap.pcap`)]**
- **103.42.60-61.x:11099 (4+ IP) = `api-gateway.toss.im`** — ClientHello SNI 평문(0x00a0 오프셋 "api-gateway.toss.im"),
  DigiCert 체인(C=KR, Seoul), TLS1.3 + ALPN h2 — 앱 자체 API 게이트웨이의 비표준 포트 채널. FDS/RASP 보고
  (`fds_detected=[DEBUGGER]`, §101)는 이 TLS 내부로 추정(수동 관찰 = 메타데이터 한계).
- SDK 비컨(사이클마다): **bugsnag sessions/notify(사망 보고)**, appsflyer launches/inapps/cdn-settings,
  applovin, facebook graph, pangle, unityads, doubleclick.
- DNS 질의는 pcap에 부재(172.17.0.2 릴레이/DoH 8.8.8.8:443-QUIC 경유 추정).

**[Track A-1 — vmdec1.py 마일스톤 1 (`vmdec1_census.json`)]**
- **회귀 코어 고정(PASS)**: x17=0x84247500451c8000 → (>>16)→ 0x7500451c → 니블 언팩 [4,8,12,16]→[1,5,4,0] —
  이제 모든 디코더 변경이 이 테스트를 통과해야 함.
- **형식 가설 v1**: S106 x2 스트림 샘플(0x40B)이 **32비트 (tag, packed-token) 쌍 레코드**로 정렬 —
  `[5,0xc730071][0xa0000,0xf][0x70008,0x7][0x5b638,0x5][0xc7b0776,0xa0001][0xf,0x50010][0x7,0x5b647][0x33,0x6ca106e]`
  — 토큰쌍 인접성(0xb638/0xb647 +0xf, 0xc73…/0xc7b… 동일계열) + 알려진 레코드 0x7500451c 동일 형태.
- 다음 마일스톤: 폭-테이블 캡처(x9 재태그 문제 해결) → 필드단위 디코드 → 대량 스트림 윈도우 → opcode 의미.

**[S107b]** x27=4 최초 writer 헌트 재실행(예산 250k스텝/3000s, nohup 분리) — 결과는 다음 세션 아티팩트
`toss_s107b_x27writer.json`. 게스트: 캡처 후 정리(앱 정지). pcap·로그 보존.


## §102 2026-09-29 은닉 DEX 정적 분석 재개 — v9=4의 출처: "framework getter 상수 소스" 관용구 (완전 정적 provenance)
[방법] 게스트 불필요 — toss_hidden_dex.bin + §98에서 내용 검증된 code_off(onWarmupCompleted=0x5391c 1818insns, IAuthTabCallback=0x521f0 172insns) 재사용. 주의: dex_tools.find_code의 class_data uleb 파싱은 불안정(잘못 coff 반환) — §98 오프셋+내용 검증(OWC#793=0177 0977, IATC#22=2071 0e7b)이 정답. 견고한 disassembler /tmp/dexdis2.py 작성(unknown op → 1-unit skip).
[정적 확정 1 — 파라미터 무결 통과] onWarmupCompleted(regs=34, ins=5, v29-v33=파라미터) 전체 1818insns에서 **v29-v33 쓰기 0회**(읽기만) → `invoke-static/range {v29..v29}, IAuthTabCallback`(#793, AA=1)의 인자는 들어온 파라미터 그대로. 인터프리터가 proto(I,I) 기준으로 v29,v30 연속 읽기(런타임 x0=4 관측으로 확증) → **R의 첫 인자 v9 = IAuthTabCallback p1 = onWarmupCompleted의 2번째 인자(arg1) = 살성 callsite가 넘긴 값**.
[정적 확정 2 — arg1의 writer 분류(148 callsite 전수)] **move-result 105 / const·binop·sget 43 / None 4**. move-result 133개 소스 invoke 전수 짝짓기: 전부 **framework getter 스타일 method_id** — ViewConfiguration.getMaximumFlingVelocity(14)/getTapTimeout(7)/getTouchSlop(5)/getEdgeSlop(6), ExpandableListView.getPackedPositionForGroup(7), AudioTrack.getMinVolume(6), KeyEvent.getMaxKeyCode(5), TypedValue.complexToFloat(5), Process.getGidForName(5), ImageFormat.getBitsPerPixel(4), ViewConfiguration.getScrollBarFadeDuration(4), SystemClock.currentThreadTimeMillis 등.
[핵심 해석] 이것은 DexGuard의 **상수 은닉 관용구**: framework getter의 "디바이스 고정 반환값"을 상수 소스로 사용(§98의 IAuthTabCallback tail 산술 체인과 동일 패턴 — getter→move-result→산술→리플렉션 복호화). **v9=4 = 이 상수 소스 중 하나의 값이 이 환경에서 4** → R(4,0)=자폭 op. const sites는 {0,48('0'),42,988,1336}. 부수 가설(미증명, 집행 경로 분기와 연결 가능): getter 값이 디바이스/에뮬 프로파일 의존적이므로 **op-code 선택 자체가 환경 의존적일 수 있음** — redroid에서 4를 반환하는 getter가 실기기에서 다른 값을 주면 자폭 op가 아니게 됨.
[남은 좁은 OPEN] 살성 callsite가 사용한 "getter"가 정확히 무엇인지(=어떤 getter가 이 환경에서 4인지) — probeG2의 writer 캡처(로드 소스 레지스터+프레임)로 1회 런 해결 가능. 재귀 경로(IAuthTabCallback 자신이 onWarmupCompleted를 재호출 #41/#60, arg1=move-result)도 후보.
