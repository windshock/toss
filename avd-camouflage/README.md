# AVD Camouflage — Android 13 (SDK 33) AVD → 실기기 위장 키트

대상: `sdk_gphone64_arm64` (ranchu / emu64a, userdebug) — IPInside + AhnLab 엔진의
관측된 탐지 발화점(`/system/xbin/su` access, `ro.boot.qemu.*` prop 조회)과
정상 단말 수집 항목(Build / ANDROID_ID / IP / 통신사)을 기준으로 설계.

## 구성

| 파일 | 레이어 | 적용 방식 | 지속성 |
|---|---|---|---|
| `camouflage.sh` | 시스템 | build.prop 편집(또는 resetprop), su 바이너리 이동, ANDROID_ID 교체 | 영구 (재부팅 필요) |
| `guard.js` | 프로세스 | Frida spawn 훅 — cmdline 프롭, 파일 프로브, 네트워크, telephony | 앱 실행 시마다 |

## 두 층으로 나눈 이유

- `ro.product.*`, `ro.build.*` → build.prop 편집으로 영구 해결 가능.
- `ro.boot.qemu.*`, `ro.kernel.qemu`, `ro.hardware` → **커널 cmdline 유래**라
  build.prop 편집으로 못 고함. Magisk `resetprop` 있으면 영구 정화, 없으면 guard.js 훅이 담당.
- `eth0` / `10.0.2.x` / QEMU MAC(`52:54:00..`) → AVD user-mode NAT 구조상 시스템 차원
  변경이 어려워 훅으로 위장. (진짜 네트워크 레벨 현실화가 필요하면 Linux 호스트 VM +
  tap 브리지가 유일한 대안 — macOS 호스트에선 비추천.)

## 적용 순서

```bash
# 1) 시스템 레이어
adb root && adb remount
adb push camouflage.sh /data/local/tmp/
adb shell sh /data/local/tmp/camouflage.sh

# 2) 재부팅 (스냅샷 복원을 피하기 위해 콜드부팅)
emulator -no-snapshot @<avd명>     # 또는 adb reboot

# 3) 앱 실행 (spawn 모드 — Build.* 초기화 전에 prop 훅 적용)
frida -U -f <패키지명> -l guard.js

# 4) 감사
adb shell getprop | grep -iE 'qemu|ranchu|goldfish|emu|generic|test-keys'
adb shell getenforce                # Enforcing 이어야 함
adb shell 'ls /system/xbin/su'      # 없어야 함 (su.subak 으로 이동됨)
```

Magisk 가 올려진 이미지면 `camouflage.sh`가 자동으로 resetprop 경로를 타서
`ro.boot.qemu.*`까지 정화되고, `guard.js`의 프롭 훅은 백업 커버로만 동작.

## 모델 일관성 — 중요

정상 단말 예시의 **SM-S936N(S24+)은 Android 14 출시 기종**이라 SDK 33(13) AVD와
펑거프린트 버전이 어긋나고, 서버는 fingerprint 내 OS 버전과 `Build.VERSION.SDK_INT`를
교차검증할 수 있음. 그래서 기본값을 **SM-S916N(S23+, Android 13 출시)** 으로 통일함:

- S936N을 유지하고 싶으면 → AVD를 API 34(Android 14) 이미지로 교체하는 게 맞음.
- 더 정밀하게 하려면 → 실기기에서 `getprop` 덤프를 받아 `camouflage.sh` 상단 블록과
  `guard.js`의 `CFG`를 그 값으로 교체 (모델/브랜드/펑거프린트/incremental/tags 한 세트).

## 잔여 리스크 (리포트 명시 권장)

- **서버 보고는 계속 감**: 로컬 차단 회피 ≠ 서버 미보고. DetectFraudData → saveSendFdsEi,
  fdsDta 전송 경로는 그대로.
- **센서/배터리 등 하드웨어 텔레메트리**: 에뮬은 센서 개수가 적음 — 별도 훅 필요.
- **natIp**: 호스트 egress IP. 그 자체로는 일반 가정/사무실 IP와 구별 안 되므로 자연스러움.
- **ro.debuggable / ro.secure**: `adb root` 유지를 위해 그대로 둠. 0으로 바꾸면 복구에
  AVD 재생성이 필요해질 수 있음.
- **Play Integrity / 하드웨어 증명**: 이 키트 범위 밖. 대상 앱이 사용하는지 별도 확인.
- SDK가 `/proc`·`/sys` 하위(QEMU 디바이스 노드 등)를 직접 읽으면 guard.js의 파일 프로브
  정규식에 패턴 추가하면 됨 (`qemu_pipe`, `goldfish`, `ranchu` 포함되어 있음).

## 복구

```bash
adb shell sh /data/local/tmp/camouflage.sh --revert
adb reboot
```

원본은 `*.camobak` / `*.subak` 으로 남아 있어 되돌리기 가능.

# 2026-09-18 실험 결과 (Magisk 기반 최종)

## 구축된 것
- **Magisk 25.2 on AVD** (rootAVD 스크립트로 ramdisk 패치 — 영구 루트, writable-system 불필요)
- `post-fs-data.d/camouflage.sh` + `service.d/camouflage.sh` — 매 부팅 자동 실행 확인
  (로그: /data/local/tmp/camouflage.log)
- resetprop으로 **커널 cmdline 유래 ro.boot.qemu.* 포함 전 프롭 위장** (SM-S916N/dm2q/release-keys)
- ANDROID_ID 교체, /system/xbin tmpfs 마스킹, Magisk 매니저 앱 언인스톨
- 부팅 후 `adb shell 'stop; start'` 1회 → Zygote가 위장 프롭으로 재캐싱 → **Java Build.*까지 정합**
  (Firebase deviceModel = SM-S916N 실측 확인)

## 확정된 차단 트리거 (원본 모니모 / AppSuit)
| 상태 | 결과 |
|---|---|
| 수전 상태 (프롭 노출) | ~25초 후 무음 자기종료 |
| 프롭 위장 + su 은닉 (Magisk 아티팩트 노출) | ~4초 SIGBUS 자기파괴 |
| 프롭+Build 정합 + su/마운트 정리 | **여전히 SIGBUS** — 아래 커널 레벨 잔여 |

## 남은 커널 레벨 잔여 시그니처 (유저랜드로 못 숨김)
- `/dev/qemu_pipe` → `/dev/goldfish_pipe` (삭제 시 adb/그래픽 두절)
- `eth0` + `10.0.2.15/8` (QEMU user-mode NAT, wlan0 없음)
- goldfish 가상 SIM/RIL (T-Mobile 310260), 에뮬 센서 세트

## 결론
Google AVD에서 **원본(무수정) 앱의 완전 우회는 불가** — QEMU 플랫폼 자체가
커널 레벨로 탐지됨 (AppSuit가 주요 에뮬레이터를 명시 탐지함이 정적 분석으로 확인됨).
동적 분석은 기존 neutered-lib 재패키지 빌드(`clean/monimo-debug.apk`)로,
원본 앱 검증은 실기기로 진행할 것.

## 복구
- Magisk 제거: `rootAVD.sh system-images/.../ramdisk.img restore` (원본 ramdisk 백업 자동 존재)
- 이 스크립트 비활성: `rm /data/adb/post-fs-data.d/camouflage.sh /data/adb/service.d/camouflage.sh`

## 2026-09-18 추가: FAKEBOOTIMG(앱 패치) 경로 재설치 + §2.20 전수 감사

- rootAVD `FAKEBOOTIMG` 옵션으로 **Magisk 앱이 직접 패치한 ramdisk**로 재설치 완료
  (원본 ramdisk.img.backup에서 단일 패치, double-patch 회피)
- §2.20 전수 감사: su 15경로 / magisk 바이너리+libmagisk.so / SuperSU / KernelSU /
  proca / 허니파일 / 에뮬 패키지·프롭 / cpuinfo / frida — **유저랜드 전항목 통과**
- 신규 위장 추가: `ro.build.user=android-build → dpi`, `init.svc.*` qemu/goldfish/
  ranchu 서비스 프롭 삭제 (getprop 스캔 대응)
- **Zygisk 주입 불가 확정**: settings(zygisk=1)/policies(uid 10181 DENY) 정상인데
  zygote maps에 zygisk 흔적 없음 → **앱의 /proc/self/mounts에 `.magisk` 221개 노출 유지**
  (rootAVD 직접-ramdisk 패치 + v25.2 조합의 한계. FAKEBOOTIMG 앱패치로도 동일)
- 그 결과 원본 모니모는 여전히 ~3-20초 내 무음 종료 (finishAffinity+SIGTERM 경로)
- 노드 실험: /dev/qemu_pipe·goldfish_pipe 삭제 시 **screencap 0바이트**(그래픽 두절) —
  adb는 기존 FD 유지로 생존. 재부팅 시 노드 자동 재생성

## 남은 길 (마운트 221개를 숨기려면)
1. Magisk v26.4/v27/v28로 앱 패치 재시도 (Zygisk 구현 상이 — 미검증)
2. 실기기
3. mounts 스캔이 없는 RASP 앱은 현재 상태로 통과 가능한 수준

## 2026-09-18 최종: tothi 방식(v26.1) 재설치 + Zygisk 검증
- 적용: tothi/magisk_ramdisk_patch_avd.sh 방식 — 2-stage cpio 분할(Python splice),
  PREINITDEVICE=metadata config, magisk64/stub xz overlay, `emulator -ramdisk` 플래그 부팅
- 결과: Magisk 앱 "Zygisk: 예" 표시, DenyList 부분 동작 (앱 mounts 221→105)
- 그러나: /system/bin/su 재노출 + 105개 마운트 잔여 → 원본 모니모 여전히 SIGBUS 자기파괴
- 원인 판단: rootAVD/tothi 방식 모두 magiskinit이 /system/bin을 파일별 리바인드하는 구조라
  v26.1 DenyList의 unmount가 이 early 마운트를 전부 커버하지 못함 (하이브리드 한계)
- 결론 확정: QEMU AVD에서 원본 무수정 앱 완전 은닉은 유저랜드로 불가. 플래튼 우회도
  EROFS로 실패. → neutered 빌드(동적분석) 또는 실기기(원본검증) 사용
- 현재 부팅 방법: `emulator -avd inisafe_fido_poc_api33 -no-snapshot -ramdisk /tmp/m261/ramdisk-patched.img`
- 부팅마다 필요: `dumpsys battery set ac 1; dumpsys battery set status 2; svc power stayon true`

## eBPF/ftrace — 비침투 프로브 관찰 (2026-09-18 추가)

- **AppSuit는 eBPF 미사용 확정**: 복호화 문자열 795줄에 bpf 관련 0건. 앱(비특권)은
  CAP_BPF/CAP_PERFMON이 없어 BPF 로드 자체가 불가능 → 유저랜드 프로브만 사용이 구조적 필연
- **커널(GKI 5.15 android13-8)에는 eBPF/BTF 있음** (bpfloader 맵 확인) + **ftrace kprobe 사용 가능**
- → 루트 권한으로 **ftrace kprobe로 openat 전수 관찰 = 비침투 프로브 캡처**
  (TracerPid 변화 없음, SIGBUS 유발 안 함, frida 불필요)

### 실측 (neutered 빌드, 12초 캡처)
- `/proc/<pid>/comm`·`cmdline`·`status` 순회 = **프로세스/스레드/TracerPid 스윕 런타임 실증**
- AhnLab 엔진 캐시(.aaid/.adex/.acert/.alab2) 접근 패턴 확인
- 도구: `trace-openat.sh [패키지] [초]` — SELinux 임시 permissive 후 복구까지 자동

### 응용
- 원본 앱: 죽기 직전(~4-25초) 프로브 버스트를 전수 기록 → 탐지 스윕 순서 리포트화
- 신규 우회 아이디어 검증: 특정 경로를 숨기는 우회가 실제로 프로브를 통과시키는지 확인

## 2026-09-19 최종: 원본 앱 실행 + 잔여 탐지 소스 확정

### 원본 앱 (벤더 서명 무수정) 실행 결과
- 프롭 위장 + su 부재 + Magisk 0 + SIM 한국화(01063951420/450-05 SKT) + eBPF 경로 숨김(로드·attach 성공)
- 그럼에도 **실행 후 ~3-20초 내 SIGBUS 자기파괴** (fault 0x41022/0x11012 — §2.18 의도적 파괴 패턴)

### eBPF 숨김 (tothi 방식 v26.1 + 자작 로더) — 최종 상태
- BPF 프로그램 890 insn 검증기 통과 + 로드 성공, kprobe 3종 (do_sys_openat2/do_faccessat/do_statx) attach 성공
- uid 10181 필터, 26 접두어 차단 테이블, magisk 부분문자열 스캔
- ioctl 상수: SET_BPF=0x40042410 (nr 16), ENABLE=0x2400 (nr 0) — asm-generic 재계산 검증 완료

### 남은 (경로 숨김으로 못 잡는) 탐지 소스
1. **/proc/misc 내용 스캔** — goldfish_pipe가 misc 디바이스로 등록돼 있어 내용 grep에 걸림 (경로 숨김과 무관)
2. **10.0.2.x wlan0** — QEMU NAT 대역 (일부 RASP가 알려진 에뮬 대역으로 분류)
3. **GKI 커널 문자열** — 5.15.119-android13-8-g... (삼성 자체 커널 문자열과 다름)
4. **에뮬 센서 세트·RIL 동작**
5. **서버 판정** — radar.monimo.com이 APPSUIT_DEVICE_ID 기반으로 누적 기록 (재설치로도 남음)

### 결론
QEMU AVD에서 원본 무수정 앱의 완전 은닉은 **커널/에뮬레이터 수정 없이는 불가능**이
실험적으로 확정됨. 동적 분석은 neutered 빌드, 원본 검증은 실기기.

## 2026-09-19 최종: SIGBUS 트리거 특정 (:ustring 트레이스, 차등 실험)

### 실험 설계 (4단계 차등)
1. v1 LKM (uid=10181 오류) → 무효 실험 (리포트 초안의 데이터포인트 무효화)
2. v2 LKM (uid=10177, getname_flags 커널쪽 재작성, /dev/goldfish 제외) → 생존 2→7초, 그래도 SIGBUS
3. + 빌드프롭 전면 위장 (resetprop: SM-S916N/qemu=0/release-keys) → 여전히 SIGBUS
4. :ustring 트레이스 → **트리거 특정 완료**

### 트리거 시퀀스 (Thread-20, SIGBUS 직전 실측)
```
자기 네이티브 라이브러리 로드 스윕 (~30개, 정상)
→ /proc/cpuinfo ×2                    (내용 판독 — 에뮬 CPU)
→ /dev/qemu_pipe                      (v2 LKM이 /Z로 재작성 → ENOENT → 통과)
→ /dev/goldfish_pipe                  (미숨김 — GL 전송로) → 존재 → 탐지
→ (1초) → SIGTERM(워치독) → SIGBUS 자기파괴
```

### 확정 트리거
1. **/dev/goldfish_pipe 존재** — 앱 자신의 GL 전송로라 숨기면 앱 렌더링 파괴
2. **/proc/cpuinfo 내용** — 에뮬 CPU 정보 (내용 판독이라 경로 차단 무의미)

### 수정된 결론 문구
> 깨끗한 경로 숨김(LKM v2, 정제 blocklist)을 적용해도 원본 앱은
> /dev/goldfish_pipe 존재 확인과 /proc/cpuinfo 내용 판독을 근거로
> SIGBUS 자기파괴를 수행한다. 전자는 앱 자신의 GL 전송로라 숨기면
> 앱의 렌더링이 깨지고, 후자는 내용 판독이라 경로 차단과 무관하다.
> 즉 파일·프롭 계층의 위장 범위를 벗어난 플랫폼 고유 신호이며,
> 이를 제거하려면 goldfish 드라이버가 없는 커스텀 커널/에뮬레이터
> 이미지가 필요하다.

단, 방어되려면: (2) 내용 필터 LKM 추가 후 재실행 → goldfish 잔여 확인 선행 필요.
