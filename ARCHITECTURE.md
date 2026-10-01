# TOSS RASP 기술 아키텍처 — 확정 모델 · 증거 원장 · 검증 지도

> **최상위 탐색 출입구.** 2026-10-01 §153 리뷰(사용자 검토)로 확정된 모델.
> 이전까지의 그림에서 3가지 제외(Custom VM·Packed/SIMD 계층·중앙 Verdict Engine), 2가지 분리(집행 워크플로우 A/B, 서버 평면).
> 증거수준 태그: **[C]** CONFIRMED · **[S]** SUPPORTED · **[O]** OPEN · **[R]** REFUTED

---

## 0. 다이어그램 (확정 모델)

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
┌──────────────────────────────┐      │
│ libea56 Native Detector      │      │
│ Engine [C]                   │      │
│ · 3중 편평화 2D 디스패처     │      │
│ · 핸들러 1,969               │      │
│   (COMPUTE 1,401/GOT 557/    │      │
│    raw SVC 22)               │      │
│ · 파일·프롭(복호화 어휘)     │      │
│ · dl*/stat*/raw syscall      │      │
│ · JNI Java API 콜백          │      │
│ · process_vm_readv 프로빙    │      │
│ · 로드 라이브러리 메모리     │      │
└──────────────┬───────────────┘      │
               │ detector result      │
               ▼                      ▼
     ┌──────────────────┐      ┌──────────────────┐
     │ [집행 A]          │      │ [집행 B]          │
     │ DetectFactor Set  │      │ Scheduled worker  │
     │ → action priority │      │ → R() (id=4 고정) │
     │ → postDelayed     │      │ → afed8(4)        │
     │   (5/10s)         │      │ → state4          │
     │ → EXIT →          │      │ → 0x95224         │
     │   System.exit(0)  │      │ → native poison   │
     └──────────────────┘      └──────────────────┘
     (레거시 관측 변형: §12 누적기 ctx+0x1c8 memmove poison — 현재 경로 미실행 [C:과거형])

┌────────────────────────────────────────────────────┐
│ [서버 평면 — 로컬 킬과 별개 채널] [C:분리]           │
│ Telemetry(auth 스토어·logstore → lc.toss.im)       │
│ device identity(Widevine id=이미지 상수+L3, TNK도) │
│ → Toss backend/FDS → 200/403(api-gateway.toss.im)  │
└────────────────────────────────────────────────────┘
```

---

## 1. 컴포넌트별 검증 지도 (박스 → 열어볼 파일)

### 1-1. Hidden DexGuard DEX — Guard Orchestration/Policy Layer **[C]**

| 항목 | 내용 |
|---|---|
| 역할 | lifecycle 트리거 수신 → GuardLevel 정책 → DetectFactor 선택(LOW={DEBUGGER,EMULATOR} / HIGH=+HOOK / MAX=+TAMPER_CERT,ROOT) → 60s 스로틀 → safeCheck → Set 수집 → 비었으면 정상 리턴, 아니면 action 우선순위 → postDelayed(5/10s) → 우선순위 상향 시에만 집행 |
| 실행 형태 | **정상 DEX, ART 직접 실행** (Custom VM 아님 [R]) — 리플렉션으로 부모 ClassLoader의 findLibrary("ea56") → System.load("libea56") |
| 15s 타이밍 | 기동 5-8s + 검사 2-5s + postDelayed 5s = 12-18s — 관측치와 수학적 정합 [C] |
| **코드 원문** | `tmp-artifacts/guard-orchestrator/jadx-hidden/sources/o/` — `s3.java`(체인 전체+네이티브 복호 프리미티브 u()), `getBooleanFromFullResponse.java`(GuardLevel 게이트), `createFromParcel.java`(postDelayed 킬), `DataSourceBitmapLoaderExternalSyntheticLambda1.java`(safeCheck enum 분기), `UST_CRYPT_VerifySignatureValue_NoAlgorithmInfo.java`(TAMPER_CERT=Crosscert ToolkitManager) |
| 근거 절 | FINDINGS §148(01_FINDINGS_발췌/S148), §149-6/7(5체크 해독: EMULATOR=ro.product 값 매칭·ROOT=RootBeer·HOOK=null 고정·VIRTUAL_ENV=비활성·DEBUGGER=릴리스 게이트 null·TAMPER_CERT=서버 인증서 목록 비교) |

### 1-2. libea56 — Native Detector Engine **[C]**

| 항목 | 내용 |
|---|---|
| 구조 | 2D reloc 테이블 1980개 완전 해석 → 핸들러 1,969 = COMPUTE 1,401 + GOT-CALL 557 + raw SVC 22 · 3중 중첩 편평화 · 8.7KB 블롭 = JNI 메서드 시그니처 테이블(네이티브→Java API 콜백 가능) |
| 입력면 | ① 파일/프롭(탐지 어휘 100% 정적 복호화 완료 — QEMU/Mumu/BlueStacks/MEmu/Genymotion/Windows형 경로+빌드태그) ② dl*/stat*/raw syscall ③ JNI 경유 Java API ④ process_vm_readv 페이지 프로빙(382회 실측) ⑤ 로드 라이브러리 메모리 직접 스캔 |
| **바이너리/지도** | `tmp-artifacts/native-engine/` — `libea56_live.so`(라이브 덤프), `gproj/`(Ghidra toss5: `analyzeHeadless gproj toss5 …`), `dispatch_resolved.json`(핸들러 분류), `final_vocabulary.json`(확정 어휘), `c13_dump.txt`(원시 44MB) |
| 근거 절 | FINDINGS §149-1~5, §139(페이지 프로빙), §145(GL API dlsym 3종 실측), §150 P2(입력면 정의) |
| **[O] 핵심 미해결** | 현재 11s 판정을 true로 만드는 **정확한 핸들러/입력** — §150 P3-1 처방: ftrace로 판정 cmp 직전 최종 GOT-CALL 캡처 |

### 1-3. 집행 워크플로우 — 병렬 2개+(중앙 selector 아님) **[C:존재 / O:현재 경로의 마지막 edge]**

| 경로 | 체인 | 증거 |
|---|---|---|
| **A. DetectFactor/lifecycle** | Set → EXIT action → postDelayed → System.exit(0) | 현재 11s baseline의 logstore `exitPlan=EXIT, caller=RASP` + `System.exit status:0` 관측과 정합 [C] |
| **B. Scheduled watchdog/native** | worker → R() → 고정 id=4 → afed8(4) → state4 → 0x95224 → poison | §14x계 트레이싱으로 별도 경로로 확정 [C] — R()은 verdict 계산기가 아니라 action-specific native thunk |
| 레거시 변형 | §12 누적기(ctx+0x1c8) STR 4곳 → memmove 음수 길이 poison | uprobe로 **현재 경로 미실행** 확인 [C:과거형] |
| ★ S150 강등 | ~~"네이티브 독립 체크가 JNI로 직접 System.exit"~~ — 이 edge는 미확증. 안전한 그림: **Native detector state → RASP verdict/DetectFactor state → Java enforcement → System.exit** | §153 리뷰에서 증거수준 재판정 — 확보된 증거는 logstore EXIT/RASP + System.exit(0)까지 |

**증거 파일**: `tmp-artifacts/run-logs/logstore_*.txt`(fds_detected_debug 원문 캡처 모음), `logstore_live_s153_최신판정.txt`(**현재 판정 [EMULATOR] 실측**), `tools/tombstone_09.txt`(native poison 계열 툼스톤)

### 1-4. 서버 평면 — Telemetry/FDS (별도 채널) **[C:분리 확정]**

| 항목 | 내용 |
|---|---|
| 상행 | auth 텔레메트리(`USER/installerPackage/manufacturer=…`, TossApplication:10000) · logstore 업로드(lc.toss.im eventList/send → 200) · Widevine deviceUniqueId(이미지 수준 상수 — 5레버 불변) + securityLevel=**L3**(TNK 광고SDK도 송출) |
| 하행 | api-gateway.toss.im 403("비정상적인 시도…") — guest/session/init, version/check 등 |
| **[R] 폐기** | "서버가 로컬 킬을 명령" 모델 — §148 P3: 사멸 체인에 네트워크 I/O 없음, §151 4련 A/B: 서버 무관 |
| **[O]** | 403이 device_id 키드인지 등 서버 지문 성분 — RASP 해결 후 §152 도구(MediaDrm 스왑, `tools/hook_did.js`+`attach_run.py`)로 재측정 |

---

## 2. 우리 대응 스택 (카운터미터 평면) — 채널 ↔ 대응 매핑

| 대응 | 닫는 채널 | 위치 |
|---|---|---|
| LKM hide_kmod (현재 bisectB) | 파일경로 리다이렉트/차단(v4.22 probe·v4.24 net/unix는 off), fd readlink 세탁(v4.6b dmap), dirent 텔레텔 은닉(v4.2), kill/segv 개입 | `avd-camouflage/lkm/`(소스 3세대: 현재본+pre_bisectA/B) |
| boot_recover/camow3/props | 프롭 신원(SM-S916N 세트), 위장 파일 writer, 패키지 hide, qemu 잔탁 스크럽 | `~/.agents/skills/avd-rasp-camouflage/scripts/` |
| 호스트 dylib GL 패치 | Vendor/Renderer/Version/토큰 문자열(Adreno 740) | `avd-camouflage/host-patch/`, `host-patch-root/` |
| §142 랜덤명 체인·§146 GL 반환필터 | 라이브러리명/phdr·GL 문자열 반환 | 게스트 dm-33 상태(롤백 레시피: §153 P1) |
| **잔여 미봉쇄** | ① /proc/self/fd **readdir** 도트파일명(.wq517h 등) ② 매핑 라이브러리 .dynstr goldfish_*/emugl* 심볼(§151 P3 런타임 스크럽 설계) ③ Widevine L3/device_id ④ dmap 미등록 4채널 | — |

**현재 세계 상태**: §152 기준선 롤백 완료(판정 [EMULATOR] T+11s, 증거 `run-logs/logstore_live_s153_최신판정.txt`). installer=com.android.vending 유지(§153 추기3 — 로컬 킬 무관 확인).

---

## 3. 증거 수준 원장 (§153 리뷰 확정)

**CONFIRMED**
- Hidden DEX = 정상 DEX, ART 실행 / Java Guard orchestration 존재
- GuardLevel → DetectFactor → action mapping 존재 (§148 코드)
- libea56에 거대 native detection machinery 존재 (§149-3/4)
- 로컬 EXIT 판정 + 실제 System.exit(0) 관측 (logstore)
- R → id=4 → afed8(4) → native poison 별도 경로 존재
- 서버 403/FDS와 로컬 RASP 킬은 별개 채널 (§148 P3·§151·§153 추기3)
- 현재 판정 라벨 = **[EMULATOR]** (DEBUGGER 음성, 9일 불변, §153 추기2 실측)
- 사이드로드/Play Store 부재·설치자 = 로컬 킬 무관 (§153 추기3: 숨은 DEX 0참조 + vending A/B 11s 불변)

**SUPPORTED**
- Java+native detector들이 하나의 DetectFactor/action 프레임워크에 협업
- 복수 guard workflow 병렬 동작 모델

**OPEN (다음 검증 루트)**
1. 현재 11s 사멸에서 **정확히 어떤 native 핸들러/입력이 최종 detector를 true로** 만드는가 → §150 P3-1 ftrace(판정 cmp 직전 최종 GOT-CALL)
2. 16k 엔진 결과가 어느 Java state/DetectFactor로 전달되는지의 **마지막 edge**
3. 현재 System.exit의 정확한 caller chain(Java action 직접 vs JNI 상태 세팅 선행)
4. 서버 403 지문 성분(device_id/L3/installer) — 로컬 판정 통과 후

**REFUTED / 제거**
- DexGuard Custom VM 중간 계층 / anonymous executable runtime을 별도 VM으로 보는 모델
- Packed/SIMD를 보안 아키텍처 계층으로 보는 모델
- 하나의 중앙 Verdict Engine이 모든 enforcement를 선택하는 단순 모델
- 서버가 현재 local kill을 명령하는 모델
- §150 "네이티브가 JNI로 직접 System.exit" edge (SUPPORTED로 강등됨)
- 사이드로드/설치자/Play-Core 실패가 로컬 킬을 유발한다는 모델 (§153 추기3)

---

## 4. 저장소 ↔ 아키텍처 매핑

| 저장소 경로 | 아키텍처 위치 |
|---|---|
| `tmp-artifacts/target-app/` (apk·dex·jadx-app 트리 8종) | [입력] 분석 대상 원본 |
| `tmp-artifacts/guard-orchestrator/jadx-hidden/` | **박스 1: Hidden DEX 오케스트레이터** — 코드 원문 |
| `tmp-artifacts/native-engine/` | **박스 2: libea56 엔진** — 바이너리·Ghidra·지도 |
| `tmp-artifacts/run-logs/` | **집행 A/B + 서버 평면** 증거(logstore/tombstone/403) |
| `tmp-artifacts/countermeasures/` | 대응 스택 실험 자산(순정 GL 세트, 게스트 오버레이) |
| `tmp-artifacts/tools/` | 검증 도구(디코더·frida 훅·측정 러너) |
| `avd-camouflage/` | 대응 스택 본체(lkm·host-patch·스크립트) |
| `toss-rasp/FINDINGS.md` | 전체 근거 기록(§1-§153) — `toss-rasp/INDEX.md`로 탐색 |
| `originals/`(xapk·extracted), `evidence/`(§97-108 패키지·REVIEW zip), `ack-kernel/`·`host-patch-root/`(빌드·패치 의존) | 인프라 |
| `toss-rasp/sessionN·heap·dump·apk_backup` | 세션별 원증거 (FINDINGS "산출" 문단 참조) |
| `HANDOFF_S153_*.md`(루트, 최신 1건) + `toss-rasp/handoffs/`(아카이브 7건) | 세션 인계 |
| `evidence/REVIEW_S148_S153_2026-10-01.zip` | §153 시점 검토 스냅샷(봉인 — 본 문서의 S150 강등은 미반영) |

> `evidence/` REVIEW zip의 `00_REVIEW_SUMMARY.md`는 본 문서 이전 판본 — S150 표현이 구버전(강등 전)이다. 충돌 시 **본 문서가 우선**.

## 5. 갱신 규칙

- 새 실험/해독으로 박스·증거수준이 바뀌면: FINDINGS 해당 § 기록 → 본 문서 해당 행 갱신 → 커밋.
- 특히 [O] 1번(native 최종 입력)이 닫히면 §1-2/§1-3의 그림이 확정 판으로 교체된다.
