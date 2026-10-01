# TOSS RASP 기술 아키텍처 — 확정 모델 · 증거 원장 · 검증 지도

> **최상위 탐색 출입구이자 "현재 이해"의 유일한 완결판.** FINDINGS.md는 증거 아카이브(§1~§154)이고,
> **읽기 쉬운 현재 구조는 항상 이 문서에 반영된다** — 새 실험/해독이 나오면 이 문서를 먼저 갱신한다(§5).
> 최종 갱신: 2026-10-01 §156 종료 시점.
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
│ · 보호페이지 fault-probing: libea56+0x69b38에서    │
│   익명 ---p 접근 fault 2건(§154 추기3 — 유일한     │
│   가드 고유 fault 신호, 복구됨)                    │
│ · 그 외 입력 = 프로세스 내 메모리 직접 검사        │
│   (syscall 흔적 없음 — §154 확정)                  │
└──────────────┬───────────────────┬─────────────────┘
               │ ① 검사·판정       
               ▼                   
┌──────────────────────────┐  ┌────────────────────────────────────┐
│ [집행 A] DetectFactor Set │  │ ~~런타임 자기검사/복구 체인~~        │
│ → action priority        │  │ **[R로 정정 §154 추기3]** T+2-3s의   │
│ → postDelayed(5/10s)     │  │ fault=ART 인터프리터 암묵적 널체크  │
│ → EXIT →                 │  │ 트랩(boot-framework.oat) → libsig-  │
│   Java enforcement →     │  │ chain → art::SafeCopy → 인터프리터  │
│   System.exit(0)         │  │ 복귀 = **Android 정상 예외 처리**.   │
│ (logstore: exitPlan=EXIT,│  │ 가드 개입 없음. boot.art 읽기도 이  │
│  caller=RASP 실측)       │  │ 경로의 부수 읽기. pvm 차단 시 즉사  │
└──────────────────────────┘  │ = ART 자체 파손(실험 결함).         │
                              └────────────────────────────────────┘
┌────────────────────────────────────────────────────┐
│ [관측된 사망 타임라인 — 3런 완전 재현 §154]          │
│ T+0 시작 → T+2-3 ART NPE 트랩(정상) → T+3~10       │
│ syscall 무흔적(판정 계산 구간) → T+10.5 fork 자식  │
│ 정리(madvise/munmap/exit) → T+11 getuid→writev×2   │
│ → exit_group(0)  · fault→exit 간격 = 정확히 9.7s   │
└────────────────────────────────────────────────────┘

┌────────────────────────────────────────────────────┐
│ [서버 평면 — 로컬 킬과 별개 채널] [C:분리]           │
│ Telemetry(auth·logstore → lc.toss.im 200)          │
│ device identity(Widevine id=이미지 상수+L3, TNK)   │
│ → Toss backend/FDS → 403(api-gateway.toss.im)      │
└────────────────────────────────────────────────────┘
```

**판정 라벨**: [EMULATOR] 1건 발화(DEBUGGER 등 음성) — logstore 실측, 9일·세계 변화에도 불변.
**집행 타이밍**: 무차단 표준 T+11s(§154~156말 회귀 실측 11.6s) / '차단+특정 dword' 조건 T+2.3-2.6s(§156,
원인=서버 지연정책 변동 vs 차단 상호작용 — 미분리 [S]). 판정 자체·라벨 불변.

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
| **관측된 동작(§154)** | ① .text 316페이지 raw-svc 무결성 스캔(+자기스택 교대 프로빙) ② **libea56 내부 fault-probing**(+0x69b38, 보호페이지 2건 — 1-2b) ③ T+3~10s **syscall 무흔적 메모리 검사** — 판정 입력의 실체 |
| **★dl_iterate_phdr 채널 [C:§154 추기4]** | dlsym("dl_iterate_phdr") 3회로 **링커 콜백 기반 라이브러리 열거** — /proc 위장·dirent 은닉 무관하게 **§142 랜덤명 .so 전부 가시**. dlsym으로 하는 유일한 탐지 행위(4,104건 분석). 대응: dlsym 결과 위장 또는 랜덤명 안전화 [O] |
| 입력면 전수 | 파일/프롭 어휘 100% 복호 완료 — 그러나 **그 체널 전부 클린화에도 판정 불변**(21채널 소거) → 판정 입력은 메모리 거주 채널 |
| **바이너리/지도** | `tmp-artifacts/native-engine/` — libea56_live.so, gproj/(Ghidra toss5), dispatch_resolved.json, final_vocabulary.json |
| 근거 | FINDINGS §149-1~5, §150, §154 |

### 1-2b. ~~런타임 자기검사/복구 체인~~ → **ART 정상 예외 처리로 정정** **[R:§154 추기3]**

| 항목 | 내용 |
|---|---|
| 정정 사유 | fault pc=**boot-framework.oat**(AOT Java 코드), 복귀=**art::interpreter::ExecuteSwitchImplCpp**, 핸들러=**libsigchain**(시스템) — 전부 시스템 소속 resolve로 가드 개입 배제 |
| 실체 | T+2-3s fault = **ART 인터프리터의 암묵적 널체크 트랩**(표준 기법) → libsigchain → ART 핸들러 → art::SafeCopy(순정)로 컨텍스트 안전 읽기 → 인터프리터 복귀. boot.art/힙 읽기는 이 경로의 부수 읽기 |
| pvm 차단 시 즉사 | 가드 복구 실패가 아니라 **ART NPE 처리 파손**(실험 결함) — 결론 유지: pvm_block=0 필수 |
| 교훈 | 주소→모듈 resolve를 해석 이전 단계로 의무화. 부트 이미지 매핑대(0x70-0x72xxxxxx)는 고정 주소 — "런 간 동일=가드 흔적" 오판 위험 |
| ~~가드 고유 fault 신호~~ → **[R 정정 §154 추기5]**: fault pc=vaddr 0x9db38 `ldr x12,[x12,x10]` — 0x18 스트라이드 테이블 워크, si_addr 페이지오프셋 0x96c(**=0x960+0xc**, 호출부 0x960-테이블과 일치) → **엔진 자기 테이블 경계 도달**(복구 전제). 환경 탐지 아님. 부수 성과: 가드 ctx 신규 필드 0x250/0x278, 상태글로벌 0x181758, 0x960-테이블 확인 |

### 1-3. 집행 워크플로우 — 병렬 2개 **[C:존재]**

| 경로 | 체인 | 증거 |
|---|---|---|
| **A. DetectFactor/lifecycle(현재 발화)** | Set → EXIT → postDelayed → Java enforcement → System.exit(0) | logstore `exitPlan=EXIT, caller=RASP` + exit_group(0) 직전 getuid/writev×2 관측 [C:§154 타임라인] |
| **B. watchdog/native poison** | R() → id=4 → afed8(4) → state4 → 0x95224 → poison | 별도 경로 확정 [C] — 현재 11s 경로와 별개 |
| 레거시 | §12 누적기(ctx+0x1c8) memmove poison | 현재 경로 미실행 [C:과거형] |
| ★ S150 강등 유지 | "native가 JNI로 직접 System.exit" edge는 미확증 — Native state → RASP verdict → **Java enforcement** → exit | §153 리뷰 |

**증거 파일**: `tmp-artifacts/run-logs/logstore_*.txt`, `logstore_live_s153_최신판정.txt`, `tools/tombstone_09.txt`

### 1-4. 서버 평면 — Telemetry/FDS + **dword 메시지 채널[§155 추기11]**

| 항목 | 내용 |
|---|---|
| 상행 | auth 텔레메트리 · logstore 업로드(200) · Widevine id(이미지 상수)+L3 |
| 하행 | api-gateway 403 3건 + **TUBA 원격설정(tuba-static variables/v2/default)** + **sec/dinitialize(비밀 발급)** |
| **★dword 채널 [C:§155 추기12+§156]** | dwordStore.xml(비밀 UUID+유효창). 신선+오프라인→캐시 정책으로 집행. **다이얼로그 분기의 입력 = 서버가 마지막 dinitialize에서 발급한 message_present 비트** — 오프라인 dword 조작만으로 재현 불가(§156). validity 파괴 sed = refresh 재시도(~10회)→fail-closed 즉시 EXIT |
| [C] | 서버(dword)는 **집행 정책(경로: 다이얼로그/직접)**을 내린다 — 킬 여부는 로컬 판정. **§157 정정: 집행 '지연'은 dword 정책이 아니라 네트워크 보고 체인 소요** — 통제 A/B(동일 dword, 차단만 토글): 무차단 11.2-11.6s vs REJECT 차단 1.5-1.9s(각 3런 [C]). §156 에스컬레이션 가설 기각. §155 "신선+차단=11-12s"는 DNS웨지식 느린 실패 vs REJECT 즉시실패의 차이. §154 "postDelayed" 해석 약화(침묵 구간=보고 체인 가능) |
| [O] | dword 메시지 본문 회수(TLS 언피닝) · 403 지문(로컬 통과 후) |

---

## 2. 우리 대응 스택 — 채널 ↔ 대응 매핑

| 대응 | 닫는 채널 | 위치 |
|---|---|---|
| LKM hide_kmod(**S154본** — bisectB+pvm_block/sc_log/pvm_log) | 파일경로 위장/차단, fd readlink 세탁, dirent 은닉, kill/segv 개입, **관측기**(pvm 호출자·스택 샘플) | `avd-camouflage/lkm/` |
| boot_recover/camow3/props | 프롭 신원·위장 파일·패키지 hide·qemu 잔존 | `skills/avd-rasp-camouflage/scripts/` |
| 호스트 dylib GL 패치 | GL 문자열(Adreno 740) | `avd-camouflage/host-patch/`, `host-patch-root/` |
| ~~§142 램덤명~~ → **plausible 수술 완료(§155)**: GfxPerfCollector/glcommon/vulkanqti/renderctrl/glesv1·2qti, hw/ 의존자 재배선 · §146 GL 반환필터 | 라이브러리명·GL 반환 | dm-33 · 도구 `tools/name_surgery.py` |
| **잔여 미봉쇄** | ① /proc/self/fd readdir 도트파일명 ② .dynstr goldfish_*/emugl*(§151 P3 스크럽 설계) ③ Widevine L3/device_id ④ dmap 미등록 4채널 | — |

**운영 불변식**: `pvm_block=0`(차단=ART 파손), `sc_log=0`(관측기 기본 OFF), frida-server 테스트 후 종료.
**frida 운영법(§155 추기2)**: 주입 성공률은 **부트별 상태성**(이전 부트 1/3~1/5, 어떤 부트는 0/19) —
  0이면 에뮬 재부팅이 최단 해법. 서버 헬스체크(settings attach) 선행 필수. 도구: hook_safecopy_watch.js,
  hook_rw_diff.js(rw 세그먼트 diff — 판정 상태변수 지도용, 다음 부트에서 실행 대기), hwbp_global.sh.
**현재 세계**: SM-S916N/egl=adreno/LKM=1/uid=10179(installer=vending) — 기준선 **[EMULATOR] EXIT: 무차단 ~11.5s /
REJECT 차단 ~1.5-1.9s**(§157 통제 A/B — 네트워크 보고 체인이 지연 결정). **연구 창을 위해서는 네트워크 ON 유지**.

---

## 3. 증거 수준 원장 (§154 종료 기준)

**CONFIRMED**
- 자바 5체크 전원 무죄(코드 해독) / 어휘 100% 복호 / 판정=[EMULATOR] 로컬(서버 무관)
- **사망 타임라인 3런 재현**(§154): 자기검사(T+2-3) → syscall 무흔적 구간 → 자식 정리 → exit_group(0)
- ~~런타임 복구 체인(가드)~~ → **[R]** ART 정상 NPE 처리로 정정(§154 추기3)
- **.text 무결성 스캔** = libea56 raw svc 316페이지 [C] / SafeCopy-경유 pvm = **ART 자체 동작**[R 정정]
- pvm 차단 = ART 파손(우회 아님 — 금지, 근거 수정)
- 비섹션 전면 네거티브: bisectA/B·GL축 순정화(2s 악화)·파라미터·사이드로드/설치자

**SUPPORTED**
- 판정 입력 = T+3~10s의 **프로세스 내 메모리 직접 검사**(syscall 흔적 0 — 관측면 소진)
- 복수 guard workflow 병렬 모델

**OPEN (다음 검증 루트 — 우선순위, §154 추기6 반영)**
1. **판정 상태 감시 — 접근법 정정(§155 추기)**: hwbp 워치포인트 인프라 완전 작동 검증(12.3M 이벤트)했으나
   **스택-ctx는 트랜지언트**(fault 후 프레임 재사용 — 단일 hot pc 노이즈). 지속 상태 저장소는
   **전역 0x181758/0x960 테이블** → 차기: hwbp_type=1을 libea56 베이스+0x181758(런 중 maps로 베이스 취득)에 세팅,
   또는 frida Stalker로 fault 스레드의 libea56 구간 추적
2. **hwbp watchpoint**(hwbp_pid/hwbp_addr 인프라) — T+3~10s 보이지 않는 판정 계산의 상태변수 감시
3. §151 P3 **dynstr 런타임 스크럽** — 우선권 하향(S153 대조: dynstr 동일한 두 세계가 2s/11s — 파일명이 판별자였고 이름은 §155로 해소)
4. ~~dl_iterate_phdr 채널 대응~~ → **[R:§155 추기6] 이름 수술(plausible)로 해소 + A/B 비인과 확정**
5. ~~타이밍 채널~~ → **★[C:§155 추기15 — 실증 완료]**: CNTFRQ=24MHz vs 실기기 19.2MHz, 분기예측비 1.00x vs 1.5-2.5x,
   루프 7.5x 느림 — **순수 유저랜드 타이밍만으로 에뮬레이터 확정 가능**. CNTFRQ는 하이퍼바이저 직접 제공(비트랩)이라
   LKM 스푸핑 불가. **redroid도 탈락(§155 추기16 — HVF 공유로 동일 지문)**. 대응: 베어메탈 ARM 폰(유일) 또는
   가드 타이밍 루프 무력화(hwbp로 측정 위장) 또는 제한 모드 수용(dword 만료=다이얼로그+15s창)
   **★가드 측 구현 경로 소거(§157 [C])**: ① libea56 .text에 카운터 MRS 0건(전수 디코딩) ② libc PLT 시간 API
   호출 0건(live, cg 103K/3s 중 libea56 발 0) ③ Java 시간 API는 오브퓨스케이션 상수(jadx 대조) —
   **잔여 2경로: (a) vDSO 직접 호출**(auxv base → BLR 간접, 모든 관측면 불가시 — §157 차기, 도구 레시피 완성)
   (b) 클럭프리 상대 타이밍(스레드 레이스). 측정은 서브초(차단 런 1.5s에 판정+집행 완료)
6. **★동결 포렉식 창 — §156 확립 [C]**: **지연 무장 레시피**(exit_block을 T+1.5s에 무장 — 가드 자식 which/cmd는
   T+1.2s에 정상 종료한 뒤) → 메인 자연 exit(차단 시 1.5-1.9s / 무차단 ~11.5s — §157, 런 타임라인에 맞춰 무장)에서 SIGSTOP → **100초+ 안정
   동결(ANR 미발생, 사실상 무제한) 4/4 재현**. 창에서 heap 48MB+LOS 덤프·logstore 버퍼 전문 획득.
   **한계 [C]: libea56 rw(.data+.bss)는 판정 완료 시점에 이미 전체 와이프** → 네이티브 판정 상태는 사후 불가,
   **판정 이전/도중 관측(hwbp)이 정공**. 상시 무장 금지(자식 동결→fail-closed 조기 사멸).
   도구: `tmp-artifacts/tools/restricted_run.sh v2` + `memread`(§156 — toybox dd 고주소 오버플로 회피)
7. 장생(immortal)은 Java 레이어(frida §25차) 전용 확정 — 커널측(v1-v5 전수 실측)은 freeze→ANR→AM 킬로 봉쇄.
   단 §156: 판정 직후 동결은 ANR 트리거 없이 100s+ 유지(조기 동결일 때) — 포렉식 창으로는 무제한
8. **hwbp 관측 강화근거(§156)**: 판정 완료 후 메모리는 와이프되므로, 타이밍 측정 핸들러 특정(§155 우선순위 2)과
   판정 상태 관측 모두 "판정 이전/도중" 하드웨어 관측면이 유일한 남은 경로. **§157 우선순위: vDSO 직접호출
   포착(frida 커스텀 러너 — [vdso] base는 maps에서 주입, 부트 내 고정 7b84674000) → 콜사이트 vaddr 확보 →
   hwbp_type=0로 frida 없이 확정**
6. dmap 4채널 등록 — §155 추기4 완료(7채널 확장) — 잔여 없음 ~~ / 서버 403 지문(로컬 통과 후)
5. ~~fault pc=0x71d6f534 모듈 특정~~ → [R] ART 정상 동작으로 닫힘 / ~~SafeCopy 호출자~~ → ART 내부 경로로 닫힘

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
