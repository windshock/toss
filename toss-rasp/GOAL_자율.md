[역할] camo33 AVD(arm64/API33/GKI5.15)에서 원본 토스(viva.republica.toss)를 프리다·앱후킹 없이
로컬 RASP 종료 없이 메인 UI까지 살리는 작업을 자율로 끝까지 수행. 위치 /Users/1004276/Downloads/
AppSuit/avd-camouflage, 스킬 ~/.agents/skills/avd-rasp-camouflage, adb=~/Library/Android/sdk/platform-tools.

[자율 계약] 세션으로 쪼개지 말 것. 핸드오프 쓰고 멈추거나 다음 단계를 묻지 말 것 — [정지 조건]에서만
멈춘다. 컨텍스트 요약은 이어짐이니 루프 계속. 진행은 FINDINGS.md에 증분 기록(정지점 아님). 한 변수만,
프리다 없는 실행, 아래 3점+5분으로만 성공.

[성공(유일 정상 종료) — 한 런에서 4개 동시]
(a) 프리다/후킹 없이 RASP발 System.exit 없이 생존, (b) topResumedActivity가 정상 화면(Splash/
SplashFallback/CertifyGuest = 탐지·제한·종료 경로 아님) + 스크린샷에 메인 UI, (c) 탭에 UI 반응,
(d) 연속 5분+ 유지. 스플래시/CertifyGuest/백그라운드 잔존은 성공 아님.

[확정 지식 — 재도출·재시도 금지 (FINDINGS §54~§64, 메모리 appsuit-toss-rasp)]
- 판정: 로컬 RASP `detected=emulator, emu_result=191(0xBF), emu_dbg=0x8_000000BE, root_dbg=0x2_0000010E`
  → handleExitPlan EXIT(caller RASP/DexguardWrapper/TG 가변) → System.exit. detector=[debugger,emulator,
  root,hook,cert,virtual_environment], guardLevel=LOW.
- emulator 판정은 전부 불변(배제됨): 값(cpuinfo/midr sysfs/modules/cmdline), 프롭(resetprop 전역),
  파일(LKM redirect), SELinux 모드, GL 문자열, mrs-MIDR(LKM v4.17 후크 hit=0=미사용), 네트워크(온/오프
  동일 191), 서버/기기ID(pm clear+airplane에도 죽음; mediadrm/serialno/android_id는 지문일 뿐).
- ★ LKM redirects OFF(target_uids=99999) vs ON → emu_result 동일 0xBF = LKM은 emulator 비트 0개 제거.
- ★ emu_result/emu_dbg는 모든 조건 불변 상수 → 경험적 비트매핑 불가. 네이티브 탐지기가 QEMU 구조 신호
  (goldfish/qemu 디바이스 존재, QEMU CPU 거동, 센서 HAL 등)를 직접 봄.
- Enforcing-GL 해결(§60-1): in-proc GL closure를 same_process_hal_file로 chcon하면 enforcing에서 GL 뜸
  (재부팅시 리셋→재적용). 단 Enforcing만으론 판정 안 풀림(§60-2).
- 하니스: toss_probe.sh(1런→logstore 판정 추출,--fresh), fresh_identity.sh(신원 로테이션).
  logstore=/data/data/viva.republica.toss/files/logstore/logitems/*.json (pm clear로 런마다 신규).

[반복 루프 — 정적 RE 주도(경험적 차등은 막힘)]
1. 상태점검: Permissive, dmesg_restrict=1, hide_kmod, target_uids⊇10176, density450, airplane off+wifi/data
   on, frida 미구동, .vl64 마운트. 드리프트면 boot_recover.sh "10179,10181,10176"(필요시 adb reboot 후).
2. ★주작업 libtg/libea56 emulator 탐지기 정적 RE: Java raspEmulatorCallback/postRaspResult의 JNI
   RegisterNatives에서 네이티브 함수 특정 → Ghidra headless(scripts/ghidra_decompile_at.java, /tmp/gproj
   toss5)+llvm(/opt/homebrew/opt/llvm)+scan_adrp_add.py/scan_struct_offset.py+dump4 덤프로 emulator
   서브체크 열거 → 각 체크 입력 채널(디바이스/prop/syscall/레지스터) 특정.
3. 체크를 하나씩 닫기(LKM 훅 추가→build-in-docker.sh→adb reboot→insmod→boot_recover, 또는 env/파일/
   디바이스 조정). 커널 훅은 v4.17 do_emulate_mrs 후크 방식 참고.
4. 변경마다 toss_probe.sh --fresh로 emu_result/detected 변화 관측. emulator가 detected에서 빠지면 다음
   detector로. 최종 성공 4점 검증.
5. 정리: 임시파일 삭제, /proc bind umount, target_uids 원복, freezer 프로세스 force-stop. enforcing이
   프레임워크 깨면 adb reboot→boot_recover로 자가복구 후 루프 계속.

[정지 조건 — 이때만 멈추고 보고]
- 성공 4점 달성. 또는 인가 경계(서버 FDS/기기지문 우회로 거래·인증 뚫기, 재서명 앱 서버통과 = 즉시 정지).
  또는 재부팅+boot_recover로도 복구 불가. 또는 서로 다른 접근 8라운드 연속 진전 0(동일 실험 반복 금지).

[주의] 토스 전 모니모·하나 force-stop. 구동중 rmmod 금지. push후 adb shell sync. 종료는 adb emu kill만
(재부팅은 adb reboot). 광범위 frida/uprobe 금지, channel_trace.sh 금지(uprobe셋 파괴). logstore 내부시각
≠logcat(런 연결=PID·mtime). 오프라인 실험 후 svc wifi/data enable 복구. 관찰·추론·미확정 분리, 틀린
결론 발견시 정정. 값/프롭/LKM 재토글 금지(전부 불변 확정) — 정적 RE로 실제 emulator 체크를 찾아 닫는 데 집중.

지금 [반복 루프] 1번부터 시작. 성공 4점 재현까지 멈추지 말 것.
