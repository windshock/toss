# HANDOFF — §155 최종 (2026-10-01): 판정 입력 실증(타이밍) + dword 정책 해부 + 세션 총결산

**진입: 루트 ARCHITECTURE.md → AGENTS.md → 본 문서. 증거: FINDINGS §154+추기1~16, §155+추기1~16**

---

## 0. 프로젝트 상태 — 최종 구조 (전체 확정)

### 판정 메커니즘 완전 해부
```
[로컬 판정 — 순수 유저랜드 타이밍]           [서버 정책 — dword]
 CNTFRQ_EL0 = 24MHz (실기기 19.2MHz)        sec/dinitialize → 비밀 UUID + 유효창
 분기예측비 = 1.00x (실기기 1.5-2.5x)        신선 = 직접 exit ~11s (오프라인 캐시 집행)
 루프 = 2.32 ns/iter (실기기 0.31)           만료 = "해킹 위험성" 다이얼로그(7s) → exit ~15s
 → [EMULATOR] 판정                           ※ 판정은 로컬, 집행 정책은 서버
 syscall/파일/프롭/fd/xattr/이름 전부 비인과
```

### 해법 공간 (우선순위)
1. **베어메탈 ARM 폰** — 유일한 완전 통과 경로 (CNTFRQ 19.2 + 실제 분기 예측기). 에뮬/redroid 둘 다 HVF 공유로 탈락.
2. **가드 타이밍 루프 무력화** — hwbp로 가드의 측정 핸들러에서 조기 완료 위장. 16k 엔진의 0x960-스트라이드 테이블에서
   타이밍 측정 핸들러 특정 필요. hwbp 인프라(hwbp_type=0 실행 중단점)는 검증 완료.
3. **제한 모드 연구 운용** — dword 만료 + exit_block=1(SIGSTOP) = 다이얼로그(7s~15s) + 동결(~30s) ≈ **~45s/런**.
   힙 덤프·네트워크 관측·UI 상호작용 가능한 연구용 윈도우.

## 1. 오늘 세션(S154~S155) 확정 성과 — 요약

| 발견 | 증거 | 상태 |
|---|---|---|
| 사망 타임라인 3런 재현 | ftrace T+2-3 ART NPE → T+3-10 무흔적 → exit_group(0) | [C] |
| boot.art 읽기 = ART 정상 | SafeCopy 백트레이스(100% libart) | [C] |
| pvm 차단 = ART 파손 | 2-3s 조기 사멸 (fail-closed 아님) | [C] |
| dl_iterate_phdr 채널 | dlsym 3회(링커 콜백 열거) — 이름 수술(plausible)로 해소 | [C] |
| fd 도트파일 세탁 | dmap 7채널 확장 → 0건 실측 | [C] |
| selinux xattr 정합화 | 14파일 chcon same_process_hal_file | [C] |
| 램덤명→plausible 수술 | 6종+hw/3종 재배선, 잔여 0 — **A/B 11s 불변(비인과)** | [C] |
| mrs_spoof 비인과 | PFR0/1·ISAR0/1만 트랩 — cortex값 위조해도 불변 | [C] |
| 장생 모드 v1-v5 사면 | 커널측 불가 확정(freeze→ANR→AM킬) — Java(frida) 전용 | [C] |
| 동결 포렌식 창 | exit_block=1(v5 SIGSTOP) → 판정후 안정 덤프 ~30s | [C] |
| logstore JSON 전문 | device_id·install_id·403 TUBA(logLowMemory)·텔레메트리 스키마 | [C] |
| dword 해부 | dwordStore.xml(비밀+유효창) → 3셀 A/B: 정책=경로·타이밍 | [C] |
| dword 메시지 | resultType:"message_present" — 별도 본문 문자열은 미발견 | [C] |
| **★타이밍 채널 실증** | **CNTFRQ 24MHz + 분기예측 1.00x + 루프 7.5x = 순수 유저랜드 지문** | **[C]** |
| **★redroid도 탈락** | **동일 HVF 공유로 CNTFRQ/분기예측 동일** | **[C]** |
| 관측자 효과 | frida attach 무훅 런 25s+ 생존 — A/B의 교란 변수 | [C] |

## 2. 다음 세션 작업

### 우선순위 1: 제한 모드 연구 환경 확립 (실용)
dword 만료 + exit_block=1 → ~45s 윈도우에서:
- UI 상호작용(다이얼로그 확인 버튼 탭 → 이후 동작 관찰)
- 네트워크 트래픽 캡처(pcap/TLS 언피닝 — §97-108 장비 재사용)
- 장기 메모리 덤핑(가드의 16k 엔진 상태 추적)

### 우선순위 2: 가드 타이밍 루프 특정 (정공)
- libea56의 16k 디스패처에서 CNTVCT 읽는 핸들러 특정:
  ① Ghidra toss5에서 `mrs x0, cntvct_el0` 패턴 전수 검색 (0x3BF9_0000 인코딩)
  ② 해당 핸들러에 hwbp_type=0(실행 중단점) → 진입 시 x0~x2 로깅
  ③ 측정 파라미터(기대값/임계치)가 저장된 전역 변수 hwbp_type=1(쓰기 감시)

### 우선순위 3: 서버 403 지문 (제한 모드에서)
- hook_did.js + attach_run.py (커스텀포트 법칙) → MediaDrm 스왑 신원으로 403 여부
- login-token 플로우 재현

## 3. 환경 상태

### camo33 (emulator-5554) — 가동 중
- LKM=S154+5본(586,848B): bisectB + pvm_block/sc_log/pvm_log + faultdumpNZ + SFI11 확장 +
  hwbp_type/len + dmap 7채널 + **exit_block(immortal)** — 전부 기본 OFF, sysfs 토글
- **pvm_block=0 필수** · exit_block=0(기본) · mrs_spoof=0 · frida-server 꺼짐
- 이름 수술 세계 유지: libGfxPerfCollector/glcommon/vulkanqti/renderctrl/glesv1·2qti + hw/ 재배선
- vendor 라벨 same_process_hal_file(15파일) · native.bridge=빈 · installer=com.android.vending
- 기준선: **T+11s [EMULATOR]** (타이밍 채널 — 해법 없음, 베어메탈 필요)

### redroid (localhost:5556) — 가동 중, toss 설치됨
- API 35, 호스트 ARM Linux 6.8 — **타이밍 채널 탈락(HVF 공유)**
- 연구 목적으로는 사용 가능하나 판정 통과 불가

### 도구 자산 (전부 tools/)
- guard_capture.sh / guard_probe_dump.sh / hwbp_trigger.sh / hwbp_global.sh
- child_forensics.sh / guest_dump_children.sh / gdt_timed_capture.sh
- verdict_forensics.sh / timing_bench.c / name_surgery.py
- hook_safecopy_watch.js / hook_dlsym_watch.js / hook_rw_diff.js / hook_rw_str.js /
  hook_dynstr_scrub.js / hook_dlip_name.js / hook_did.js / attach_run.py

### 증거 보존
- toss-rasp/session154/ (135MB) — ftrace 3런 + 프로빙 페이지
- toss-rasp/session155/ (532MB+300MB) — 동결 덤프(pre/post) + 살아있는 런 캡처 + timed 11s
- toss-rasp/session155/bak_s155_names/ — 이름 수술 원본 16파일

## 4. 핵심 지식 (이 세션에서 확정된 법칙)
1. **"정책은 서버, 판정은 로컬"** — dword는 집행 경로만 결정, [EMULATOR] 판정은 순수 타이밍
2. **CNTFRQ_EL0 = 24MHz** — HVF 하드코딩, LKM 스푸핑 불가, 에뮬/redroid 공통
3. **분기예측기 부재** — 가상 CPU 아키텍처 문제, 실기기와 근본적으로 다름
4. **el0_svc_common scno 재작성** — 인자2(kregs->regs[1])를 바꿔야 함(ur->syscallno 무시됨)
5. **bionic _exit은 반환하지 않음** — "성공 반환" 전략(syscall→getpid)은 무한 재시도 루프
6. **frida 주입은 부트 상태성** — 성공률이 부트마다 다름(0~1/3), 재부팅으로 회복
7. **DNS 웨지는 부트 경계** — iptables 실험 후 재부팅 필요
8. **adb shell은 stdin을 먹음** — while-read 루프에서 `</dev/null` 필수
9. **/proc/uptime은 2필드** — cut -d. -f1-2는 "88429.66 66592"를 잡음(1번 필드만 사용)
