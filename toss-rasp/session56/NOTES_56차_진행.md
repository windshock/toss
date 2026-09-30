# 56차 세션 진행 기록 (2026-09-25 KST)

정본 분석은 FINDINGS.md §59. 이 파일은 세션 작업 로그(원자료·명령·상태)다.
관찰 / 강한 추론 / 미확정 가설 / 정정을 분리한다.

## 0. 세션 시작 환경 점검 (읽기 전용)

- 기기: emulator-5554 online. adb=`~/Library/Android/sdk/platform-tools/adb`,
  `ANDROID_SDK_ROOT=~/Library/Android/sdk` (새 셸마다 PATH 필요).
- airplane_mode_on=0 (§55 복구 상태 유지 ✓), frida-server 미구동 ✓,
  monimo/하나 미구동 ✓ (프로토콜대로 force-stop 재확인).
- getenforce=Permissive, dmesg_restrict=1, lsmod에 hide_kmod ✓,
  `/data/local/tmp/.system_profile` SHA256=`80c2c19c71c778c8ce85018a47cecf8293e2e4a36ca3db60216cf7406f8ab6f7`
  (§58 값 일치 ✓), cpu online 0-7.
- 신원 프롭 정상: ro.product.model=SM-S916N, manufacturer=samsung,
  fingerprint=`samsung/dm2qksx/dm2q:13/TP1A.220624.014/S916NKSU1AWC2:user/release-keys`.

## 1. 56차 오프라인 반복 런 재판독 (제공 자료)

- `offline_repeat_security_events.jsonl`: 부모 PID 22294. OFFLINE.
  RASP root(0x2_0000010E) + emulator(0x8_000000BE) → postRaspResult emulator →
  fds_detected [EMULATOR] → emulator result=191(0xBF) → dialog "해킹 위험성이 탐지됨"×4
  → SplashActivity DwordException/UnknownHost (dinitialize app.toss.im:11099) →
  RASP 콜백 재기록 → **handleExitPlan exitPlan=EXIT caller=RASP prio=-1**.
- `offline_repeat_key_logcat.log`(PID 22294): Start proc → SFI11×2(si_addr=0x0)
  → System.exit(0) → VM exiting(cleanup skipped) → died → child 22544 SIGKILL.
- 상세·한계·정정은 §59-1.

## 2. 본 세션 라이브 관찰 — 온라인 잔존 프로세스 판별 (프리다 없음)

관찰(read-only):
- 세션 시작 시 온라인 상태에서 toss PID 8305가 이미 생존(ETIME 3:46→5:53, 148 스레드, STAT S<).
- 그러나 topResumedActivity=NexusLauncher 내내, dumpsys activity에 toss task 미등재 → 포그라운드 아님.
- logcat(8305): soloader/nativeloader 로드, Choreographer 렌더,
  `I/Ads JS: jsLoaded GMSG sent (googleads.g.doubleclick.net)` = 네트워크·웹뷰까지 진행.
  logcat에 RASP/exit/dialog/emulator 마커 없음(앱 logstore와 별개 채널).

3점 검증 시도:
- `monkey -p viva.republica.toss -c LAUNCHER 1` → 전면화 실패(런처 유지), 프로세스 생존.
- `am start -n viva.republica.toss/.splash.SplashActivity` 주입 → 즉시:
  CertifyGuestActivity back-callback 설정 → "Duplicate finish request for SplashActivity"
  → **System.exit(0) (PID 8305)** → VM exiting → process died fg TOP →
  CertifyGuestActivity WIN DEATH / "top resumed state loss timeout ... isExiting".

강한 추론:
- 이 잔존은 백그라운드에 **CertifyGuestActivity(게스트 인증=제한 모드)** 를 미-resume로
  안고 있던 **캐시프리저 아티팩트**(가드 정지). 전면 resume 시 즉시 System.exit(0).
- **메인 UI 생존 아님. 목표(포그라운드·스크린샷·탭 3점 + 5분) 미달.**

## 3. 환경 드리프트 2건 (미수정, 다음 세션 리드)

- ① `wm density`=213 (목표 450; size 1080x2340은 정상). Java DisplayMetrics 에뮬 텔레텔.
- ② (정정됨 §59-7) `midr_el1`=`0x610f0000`은 **셸(uid0, 비-target) 관측**. 실제 앱(10176)은
  이미 ARM 0x41로 마스킹됨(검증 완료). MIDR 드리프트 아님, 재빌드 불필요.

## 4. 실패·주의

- 56차 Frida 인벤토리(`bridge_inventory.*`, `bridge_inventory_run1.log`): attach 동기화
  timeout + 이후 SIGSEGV. 비주입 근거로 인용 금지, 재시도 금지.
- 앱 logstore 내부 시각 ≠ logcat 벽시계. 런 연결=PID·파일생성, 순서=내부 로그 순서만.
- `logitems_snapshot/`(106개)는 기기 식별자 포함 가능 → 공유는 `offline_repeat_security_events.jsonl` 우선.

## 4b. 본 세션 라이브 실험 (프리다 없음, 온라인) — 상세 §59-5

- 기준선 A(density 213): PID 22298, Splash→CertifyGuest Displayed(+1.5s)→su스캔(Absent)
  →System.exit(0) ~5.3s.
- 실험 B(한 변수 `wm density 450`): PID 24913, 동일 경로 →System.exit(0) ~5.9s.
  → **density는 트리거/해결책 아님(RULED OUT).** 450은 SM-S916N 정합값이라 유지.
- B 부수: 앱 RxCachedThreadS가 `/proc/modules`·`/proc/filesystems` read(LKM 자기탐지 채널).
- **MIDR 정정(§59-7):** hide_kmod v4.5 redirect가 이미 있고 정상 동작. target uid에
  midr(8코어)/cpuinfo/enforce 전부 ARM 0x41/enforcing으로 마스킹 확인. **재빌드 불필요.**
  fake 노드(.m8c4kd 등) 존재·정합. camow3 루프는 이 정적 파일엔 불필요.

## 5. 종료 상태

- 실험 후 toss 미구동(clean), frida 미구동, airplane off 확인.
- density는 450(정합값)으로 유지. MIDR은 이미 마스킹됨(정정 §59-7) — 재빌드 불필요, 환경 무변경.
- 검증 중 target_uids에 0을 임시 추가했다가 `10179,10181,10176`으로 원복 완료.

## 6. 다음(57차) 우선순위 — §59-5 참조

1. MIDR 마스킹 상태/버전 확인 → 단독 변수 정합 후 프리다 없는 클린 런 3점 검증.
2. wm density 450 별도 변수 검증.
3. debugInfo high/low 필드 의미 정적+복수 런 교차검증(+1 변환 가정 금지).
4. 온라인 dinitialize 응답의 CertifyGuest/제한모드 분기 관여 여부 실험 설계.
