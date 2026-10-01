# TOSS RASP 기술 아키텍처 — 확정 모델 · 증거 원장 · 검증 지도

> **최상위 탐색 출입구이자 "현재 이해"의 유일한 완결판.** FINDINGS.md는 증거 아카이브(§1~§154)이고,
> **읽기 쉬운 현재 구조는 항상 이 문서에 반영된다** — 새 실험/해독이 나오면 이 문서를 먼저 갱신한다(§5).
> 최종 갱신: 2026-10-01 §154 종료 시점.
> 증거수준 태그: **[C]** CONFIRMED · **[S]** SUPPORTED · **[O]** OPEN · **[R]** REFUTED

---

## 0. 다이어그램 (확정 모델 — §154 반영)

```text
┌────────────────────────────────────────────────────┐
│                    Toss App                         │
│   Activities / Application / Business Logic        │
└───────────────────────┬────────────────────────────┘
                        │ lifecycle (onResume/onStart)
                        ▼
┌────────────────────────────────────────────────────┐
│      Hidden DexGuard DEX — ART 직접 실행 [C]        │
│      = Guard Orchestration / Policy Layer          │
│  · GuardLevel(LOW/HIGH/MAX) → DetectFactor 선택    │
│  · 60s 스로틀 · safeCheck 호출 · Set 수집           │
│  · action 우선순위 · postDelayed 지연 · 텔레메트리  │
└───────────────┬─────────────────────┬──────────────┘
                │ detector calls      │ scheduled/watchdog jobs
                ▼                     │
┌────────────────────────────────────────────────────┐
│ libea56 Native Detector Engine [C]                 │
│ · 3중 편평화 2D 디스패처 · 핸들러 1,969             │
│   (COMPUTE 1,401 / GOT-CALL 557 / raw SVC 22)      │
│ · 파일·프롭(복호화 어휘 100% 복호 완료)            │
│ · dl*/stat*/dlsym/dlopen · JNI Java API 콜백       │
│ · 자기 .text 무결성: raw syscall로 316페이지 1B    │
│   스캔 (§154 [C] — syscall 관측됨)                 │
│ · 그 외 입력 = 프로세스 내 메모리 직접 검사        │
│   (syscall 흔적 없음 — §154 확정)                  │
└──────────────┬───────────────────┬─────────────────┘
               │ ① 검사·판정       │ ② 부수 시스템
               ▼                   ▼
┌──────────────────────────┐  ┌────────────────────────────────────┐
│ [집행 A] DetectFactor Set │  │ ★런타임 자기검사/복구 체인 [C:§154] │
│ → action priority        │  │ T+2-3s 가드 스레드 널 DA(far=0)     │
│ → postDelayed(5/10s)     │  │ → SIGSEGV 핸들러(sigaltstack)       │
│ → EXIT →                 │  │ → art::SafeCopy(순정 ART export)로  │
│   Java enforcement →     │  │   boot.art→LinearAlloc→힙 포인터    │
│   System.exit(0)         │  │   체인 안전 읽기 → 크래프트 복귀    │
│ (logstore: exitPlan=EXIT,│  │ (rt_sigreturn, x0 보존 — §23 패턴)  │
│  caller=RASP 실측)       │  │ ※ pvm 차단 시 복구 실패 → 2-3s 즉사 │
└──────────────────────────┘  │   → **pvm_block=0 유지 필수**       │
                              └────────────────────────────────────┘
┌────────────────────────────────────────────────────┐
│ [관측된 사망 타임라인 — 3런 완전 재현 §154]          │
│ T+0 시작 → T+2-3 자기검사/복구 → T+3~10 syscall     │
│ 무흔적(판정 계산 구간) → T+10.5 fork 자식 정리      │
│ (madvise/munmap/exit) → T+11 getuid→writev×2 →     │
│ exit_group(0)  · pvm 종료→exit 간격 = 정확히 9.7s   │
└────────────────────────────────────────────────────┘

┌────────────────────────────────────────────────────┐
│ [서버 평면 — 로컬 킬과 별개 채널] [C:분리]           │
│ Telemetry(auth·logstore → lc.toss.im 200)          │
│ device identity(Widevine id=이미지 상수+L3, TNK)   │
│ → Toss backend/FDS → 403(api-gateway.toss.im)      │
└────────────────────────────────────────────────────┘
```

**판정 라벨**: [EMULATOR] 1건 발화(DEBUGGER 등 음성) — logstore 실측, 9일·세계 변화에도 불변.

---

## 1. 컴포넌트별 검증 지도 (박스 → 열어볼 파일)

### 1-1. Hidden DexGuard DEX — Guard Orchestration/Policy Layer **[C]**

| 항목 | 내용 |
|---|---|
| 역할 | lifecycle 트리거 → GuardLevel 정책 → DetectFactor 선택 → 60s 스로틀 → safeCheck → Set 수집 → postDelayed(5/10s) → 집행 |
| 실행 형태 | 정상 DEX, ART 직접 실행(Custom VM 아님 [R]) — findLibrary("ea56") → System.load |
| 5체크 판정 | **전원 무죄 확정 [C]**: EMULATOR=ro.product 값 매칭(클린) / ROOT=RootBeer(클린) / HOOK=null 고정 / VIRTUAL_ENV=비활성 / DEBUGGER=릴리스 게이트 null / TAMPER_CERT=서버 인증서 고정(원본 서명 통과) |
| **코드 원문** | `tmp-artifacts/guard-orchestrator/jadx-hidden/sources/o/` — s3.java(체인+native u()), getBooleanFromFullResponse.java(게이트), createFromParcel.java(킬), UST_CRYPT_*.java(TAMPER_CERT) |
| 근거 | FINDINGS §148(체인), §149-5~7(어휘 100% 복호+5체크 해독) |

### 1-2. libea56 — Native Detector Engine **[C]**

| 항목 | 내용 |
|---|---|
| 구조 | 핸들러 1,969(COMPUTE 1,401/GOT 557/raw SVC 22) · 8.7KB JNI 시그니처 테이블 · dlopen/dlsym/dladdr 임포트 |
| **관측된 동작(§154)** | ① T+2-3s SIGSEGV 복구 체인(하기 1-2b) ② .text 316페이지 raw-svc 무결성 스캔(+자기스택 교대 프로빙) ③ T+3~10s **syscall 무흔적 메모리 검사** — 판정 입력의 실체 |
| 입력면 전수 | 파일/프롭 어휘 100% 복호 완료 — 그러나 **그 체널 전부 클린화에도 판정 불변**(21채널 소거) → 판정 입력은 메모리 거주 채널 |
| **바이너리/지도** | `tmp-artifacts/native-engine/` — libea56_live.so, gproj/(Ghidra toss5), dispatch_resolved.json, final_vocabulary.json |
| 근거 | FINDINGS §149-1~5, §150, §154 |

### 1-2b. 런타임 자기검사/복구 체인 — **§154 신규 [C]**

| 항목 | 내용 |
|---|---|
| 체인 | 가드 스레드 널 DA(far=0, 4B) → SIGSEGV 핸들러(0x764cf6908c)가 **sigaltstack**에서 실행 → **art::SafeCopy**(순정 ART 공개 함수: getpid+process_vm_readv, 페이지분할 iov, 실패시 0)로 boot-framework.art→boot.art→LinearAlloc→자바힙 포인터 체인 안전 읽기 → rt_sigreturn 크래프트 복귀(x0 보존) |
| 의미 | boot.art 읽기는 표적 검사가 아니라 **복구/컨텍스트 검사 경로의 부수 읽기**. ART의 StackDumpSignalHandler류 표준 패턴 위에 가드 복구를 얹은 구조 |
| 차단 시 | process_vm_readv EFAULT 위장(LKM pvm_block=1) → SafeCopy 0 반환 → **복구 실패 → 2-3s 즉사**(3런 재현). 판정 우회가 아니라 복구 파괴 — **pvm_block=0 유지 필수 [C]** |
| 전역성 | 앱 미기동 20s에 SafeCopy-경유 pvm 0건 — 앱이 유발하는 검사 |
| 근거 | FINDINGS §154 본문+추기+추기2, `toss-rasp/session154/`(trace·maps·dmesg·페이지 덤프) |

### 1-3. 집행 워크플로우 — 병렬 2개 **[C:존재]**

| 경로 | 체인 | 증거 |
|---|---|---|
| **A. DetectFactor/lifecycle(현재 발화)** | Set → EXIT → postDelayed → Java enforcement → System.exit(0) | logstore `exitPlan=EXIT, caller=RASP` + exit_group(0) 직전 getuid/writev×2 관측 [C:§154 타임라인] |
| **B. watchdog/native poison** | R() → id=4 → afed8(4) → state4 → 0x95224 → poison | 별도 경로 확정 [C] — 현재 11s 경로와 별개 |
| 레거시 | §12 누적기(ctx+0x1c8) memmove poison | 현재 경로 미실행 [C:과거형] |
| ★ S150 강등 유지 | "native가 JNI로 직접 System.exit" edge는 미확증 — Native state → RASP verdict → **Java enforcement** → exit | §153 리뷰 |

**증거 파일**: `tmp-artifacts/run-logs/logstore_*.txt`, `logstore_live_s153_최신판정.txt`, `tools/tombstone_09.txt`

### 1-4. 서버 평면 — Telemetry/FDS (별개 채널) **[C:분리]**

| 항목 | 내용 |
|---|---|
| 상행 | auth 텔레메트리(USER/installerPackage…) · logstore 업로드(200) · Widevine deviceUniqueId(이미지 상수)+L3(TNK도 송출) |
| 하행 | api-gateway 403 3건 실측(guest/session/init, version/check, internationalization) |
| [R] | "서버가 로컬 킬을 명령" — 폐기(§148 P3·§151 4련) |
| [O] | 403 지문 성분 — 로컬 판정 통과 후 재측정(hook_did.js+attach_run.py) |

---

## 2. 우리 대응 스택 — 채널 ↔ 대응 매핑

| 대응 | 닫는 채널 | 위치 |
|---|---|---|
| LKM hide_kmod(**S154본** — bisectB+pvm_block/sc_log/pvm_log) | 파일경로 위장/차단, fd readlink 세탁, dirent 은닉, kill/segv 개입, **관측기**(pvm 호출자·스택 샘플) | `avd-camouflage/lkm/` |
| boot_recover/camow3/props | 프롭 신원·위장 파일·패키지 hide·qemu 잔존 | `skills/avd-rasp-camouflage/scripts/` |
| 호스트 dylib GL 패치 | GL 문자열(Adreno 740) | `avd-camouflage/host-patch/`, `host-patch-root/` |
| §142 랜덤명 체인·§146 GL 반환필터 | 라이브러리명·GL 반환 | 게스트 dm-33(롤백 레시피 §153 P1) |
| **잔여 미봉쇄** | ① /proc/self/fd readdir 도트파일명 ② .dynstr goldfish_*/emugl*(§151 P3 스크럽 설계) ③ Widevine L3/device_id ④ dmap 미등록 4채널 | — |

**운영 불변식**: `pvm_block=0`(차단=복구 파괴·조기 자폭), `sc_log=0`(관측기 기본 OFF), frida-server 테스트 후 종료.
**현재 세계**: SM-S916N/egl=adreno/LKM=1/uid=10179(installer=vending) — 기준선 **T+11s [EMULATOR]**.

---

## 3. 증거 수준 원장 (§154 종료 기준)

**CONFIRMED**
- 자바 5체크 전원 무죄(코드 해독) / 어휘 100% 복호 / 판정=[EMULATOR] 로컬(서버 무관)
- **사망 타임라인 3런 재현**(§154): 자기검사(T+2-3) → syscall 무흔적 구간 → 자식 정리 → exit_group(0)
- **런타임 복구 체인**: 널 DA → sigaltstack 핸들러 → art::SafeCopy(순정) → 크래프트 복귀
- **.text 무결성 스캔** = libea56 raw svc 316페이지 / SafeCopy-경유 pvm = 앱 유발(전역 0건)
- pvm 차단 = 복구 실패 조기 사멸(우회 아님 — 금지)
- 비섹션 전면 네거티브: bisectA/B·GL축 순정화(2s 악화)·파라미터·사이드로드/설치자

**SUPPORTED**
- 판정 입력 = T+3~10s의 **프로세스 내 메모리 직접 검사**(syscall 흔적 0 — 관측면 소진)
- 복수 guard workflow 병렬 모델

**OPEN (다음 검증 루트 — 우선순위)**
1. **fault pc=0x71d6f534 모듈 특정**(차기 런 maps 동시 캡처) — 0x71xxxxxx=boot 이미지 매핑대 겹침 가능 →
   "의도적 fault-probe vs 우연" 판별이 11s 판정의 관문
2. **SafeCopy 호출자(libea56 오프셋)** — pvmstack 프레임 해석 심화 또는 자식 attach
3. **hwbp watchpoint**(hwbp_pid/hwbp_addr 인프라) — T+3~10s 보이지 않는 판정 계산의 상태변수 감시
4. §151 P3 **dynstr 런타임 스크럽** — 메모리 검사 입력의 정타 대응
5. dmap 4채널 등록(10분 픽스) / 서버 403 지문(로컬 통과 후)

**REFUTED / 제거**
- Custom VM 계층 / Packed-SIMD 계층 / 중앙 Verdict Engine 단일 모델 / 서버→로컬 킬 명령
- "native가 JNI로 직접 System.exit"(강등) / 사이드로드·설치자가 로컬 킬 유발
- pvm 차단이 우회 수단(실측: 복구 파괴 — 조기 자폭)

---

## 4. 저장소 ↔ 아키텍처 매핑

| 저장소 경로 | 아키텍처 위치 |
|---|---|
| `tmp-artifacts/target-app/` | [입력] apk·dex·jadx-app 트리 |
| `tmp-artifacts/guard-orchestrator/jadx-hidden/` | **박스 1** 오케스트레이터 코드 원문 |
| `tmp-artifacts/native-engine/` | **박스 2** libea56 바이너리·Ghidra·지도 |
| `tmp-artifacts/run-logs/` | 집행 A/B + 서버 평면 증거 |
| `toss-rasp/session154/` | **§154 원증거**(guard_run1-3 trace+maps, 프로빙 페이지 덤프 — 135MB, git 제외) |
| `tmp-artifacts/countermeasures/` · `tools/` | 대응 스택 자산 · 관측/측정 도구(guard_capture.sh, guard_probe_dump.sh, hook_dlsym_watch.js) |
| `avd-camouflage/lkm/` | 대응 스택 본체 — **S154본**(pvm_block/sc_log/pvm_log 신설) |
| `skills/` (스킬 3종) | 운영 지식 진실 소스(~/.agents는 심볼릭) |
| `toss-rasp/FINDINGS.md` | 증거 아카이브 §1~§154 (구조는 **본 문서**가 완결 담당) |
| `HANDOFF_S154_*.md`(루트 최신) + `toss-rasp/handoffs/`(아카이브) | 세션 인계 |
| `originals/` · `evidence/` · `ack-kernel/` · `host-patch-root/` | 원본·증거 패키지·빌드 의존 |

## 5. 갱신 규칙 (유지보수 계약)

1. **모든 실험/해독 후**: FINDINGS § 증거 기록 → **본 문서에 "현재 이해"로 반영**(다이어그램·원장·OPEN) → 커밋.
   FINDINGS를 다 읽지 않아도 본 문서만으로 전체 구조가 파악되게 유지하는 것이 본 문서의 존재 이유.
2. 충돌 시 우선순위: **본 문서 > 최신 핸드오프 > FINDINGS 해당 절 > REVIEW zip 스냅샷**.
3. [O] 항목이 닫히면: ~~취소선~~ 처리 후 [C]로 원장 이동, 다이어그램도 갱신.
