# 24차 세션 핸드오프 (2026-09-22 밤) — 25차용

## 이번 세션 요약 (상세 FINDINGS §29)

### 대정정 (claude 외부검토, 콘솔 재검증으로 수용)
- **§28 "가드 Timer-0 안티 포렐식 패닉" 폐기**: 재부팅 7건 중 3건 = 21차 hide_kmod
  rsig_pre BRK 패닉(다른 부트 누적 로그 오독), 3건 = shell 발행, IABT 1건 = 계측
  부작용 최유력(CFI/반환주소 손상 시그니처, PID 1340은 부팅 t=18.75s 시스템 스레드).
- **유지: §27 "조용한 exit" = mBase=null NPE 위장 종료** (A/B 분리 원칙).
- panic_on_oops=0 상시화는 "가드 무력화"가 아니라 **계측 안전망**으로 재해석(유효).

### 신규 성과
1. **caller LR 커널 즉시 캡처 (v4.16)**: kp_fault에서 copy_from_user_nofault로
   [sp+0x28] 읽기 — fault 직후 오염 전 프레임 확보(유저 폴링은 컬렉션이 덮어쓴 뒤).
   값: 0x726de8a8 = boot-framework rx+0xF08A8(ELF vaddr 0x2988A8), 런 간 불변.
   0x2988a4가 bl이 아닌 mov — "호출자 복귀주소" 해석에 구멍, 정밀 심볼화 이월.
2. **frida attach 생존 ★**: spawn 주입만 가드가 무력화, attach(기동 1.5s)는 생존
   (Java.perform/System.exit 훅/파일 마킹 전부 동작 — probe_health2 이중 채널).
   exit_trap.js(System.exit·Runtime.exit 차단 + UEH 감시 + Java 스택) 완성,
   본실험 전(am start 즉사 런과 타이밍 겹침으로 아직 미실행).
3. codex 23차 검토 = 크레딧 소진 실패, claude CLI(/Users/1004276/.local/bin/claude)로
   대체 성공 — 이후 검토는 claude 사용(-p --dangerously-skip-permissions).

## 25차 첫 동작 순서
1. boot_recover.sh (v4.16 자동 — caller_lr 포함)
2. **exit_trap 본실험**: am start → 1.5s 내 attach(pid 확보 재시도 루프 필수 —
   am start 직후 즉사 런 존재) → System.exit 콜백에서 Java 스택 덤프 + 차단 →
   5분 생존/3점 검증 재도전 (목표 D 정면 돌파의 최단 경로)
3. vmlinux lr 심볼화 결과 확인(빌드 백그라운드) — IABT 정체
4. 대조군: LKM 미적재 부트에서 IABT 재발 여부(원하면 adb reboot 후 insmod 생략)
5. libea56+0x69b38 셀프스캔 트랙(claude 권고 — RASP 판정 본령)

## 함정 (24차 신규)
- **커널 콘솔(/tmp/emu_kernel.log)은 부트 배너 단위 구분 없이 읽으면 안 됨** — 다른
  부트의 사고를 현재 사건으로 오독(이번 실사고, §28→§29 정정).
- adb root가 주기적으로 풀림 — 관측 루프마다 ensure_root 필수(caller_capture3.sh).
- 토스 am start 직후 pid 확보가 안 되는 런 존재 — 재시도 루프 + topResumed 확인.
- frida: spawn=무력화 / attach(1.5s)=생존. nohup은 adb 밖에서 </dev/null로 완전 분리.

## [추가] 24차 후반 발견 — cmdline 위장 즉사 (§29-4)
- 16:33 이후 am start 런: 시작 0.3s 내 cmdline을
  "com.google.android.apps.maps:server_recovery_process_scheduled"(uid 10175)로
  교체 위장 → libart art::SafeGetDeclaringClass에서 SEGV_ACCERR 즉사(tombstone_16).
- **pidof/ps 실패의 원인 = cmdline 교체.** 25차 pid 탐색은 uid 기반 필수.
- 21차 SIGACT11謎(comm=logcat/which/pm uid=10175) = 같은 위장 계열로 재해석.
- exit_trap 본실험은 위장 즉사 때문에 이번 부트 미실행 — 25차 1번(위 참조).
