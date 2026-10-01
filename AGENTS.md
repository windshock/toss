# AGENTS.md — 이 저장소에서 일하는 AI 에이전트 운영 지침

> **이 파일을 읽었다면 사용자에게 뭘 물을 필요 없이 아래 규칙대로 자율 진행한다.**
> 목적: 승인된 보안 연구(사내 정보보호담당, KISA 취약점 신고포상제 제보용) — AVD 에뮬레이터에서
> 토스(금융앱) RASP의 에뮬레이터 탐지 회귀 분석. 공격 대상 없음, 로컬 에뮬레이터+역분석만.

## 1. 진입 순서 (매 세션 공통)

1. **`ARCHITECTURE.md`** — 기술 구조 확정 모델 + 증거 원장([C]/[S]/[O]/[R]) + 박스→파일 검증 지도
2. **`HANDOFF_S153_*.md`(루트)** — 최신 세션 인계 (구 핸드오프는 `toss-rasp/handoffs/`)
3. 작업 결정: ARCHITECTURE **[O] 항목 순서** = 다음 할 일 목록
4. 근거 필요 시 `toss-rasp/FINDINGS.md`(§1~§153) — `grep -n "^## §N"`으로 절 찾기
5. 실물 자산: `tmp-artifacts/INDEX.md`(박스별 배치), `toss-rasp/INDEX.md`(세션 아카이브)
6. 세션 시작 시 **스킬 로드 — 아래 §2 규칙 필수**

## 2. 스킬 사용 규칙 (세션 자동화의 핵심 도구)

### 로드할 스킬 2종 (ZCode Skill 도구로 호출)
1. **avd-rasp-camouflage** — 에뮬/카모/LKM/frida 운영 전반
2. **dexguard-reVERSE** — DexGuard 문자열 복호·숨은 DEX 분석
   (가드 어휘 재검증·앱 버전 갱신 재분석. §149 방법론 = 이 스킬 §7d-7f)

### 스킬 위치 — 저장소 내부 (다른 LLM도 클론 즉시 사용 가능)
- **진실 소스 = 이 저장소** `skills/avd-rasp-camouflage/`, `skills/dexguard-reVERSE/` (git 추적, 전부 텍스트)
- `~/.agents/skills/<동일명>`은 **ZCode 스킬 발견용 심볼릭 링크** → 저장소 경로. 다른 도구/LLM은 저장소 경로를 직접 읽는다.
- 스킬 스크립트 호출(절대경로): `~/Downloads/toss/skills/avd-rasp-camouflage/scripts/boot_recover.sh`(부팅 후 원스텝 복구),
  `deploy.sh` `camow3.sh` `vendor_bind_setup.sh` `props-apply.sh` `channel_trace.sh`(탐지채널 ftrace)
  `toss_heap_snapshots.sh`(가드 복호화 어휘) `toss_child_scan.sh` `exit_trap.js` `frida_spawn.py` `ghidra_decompile_at.java` 등
- 스킬 `references/`: pitfalls.md(증상→원인), detection-channels.md(채널 전수), neuter-rebuild.md, frida-analysis.md
- **SKILL.md "하면 안 되는 것" 절대금지 목록을 어떤 실험 전에도 선독** (위반 전례: GL 토큰 제거→부트 크래시 루프, goldfish ENOENT 은닉→화면 사망 — 1시간 낭비 다수)

### ★ 스킬은 살아있는 문서 — 실험하며 계속 갱신 (의무)
새 법칙·함정·레시피가 확정되는 즉시 **스킬에 반영하고 커밋**한다(전례: §144/§149 성과가 SKILL.md 성과 요약·references에 적재됨):
- `SKILL.md` — 새 "법칙/금지/워크플로"를 1~3줄 요약 추가 (상세 이력은 FINDINGS가 담당, 스킬은 현재 운영 지식만 유지)
- `references/*.md` — 증상→원인·탐지 채널·트러블슈팅 해당 절 갱신
- `scripts/` — 스크립트 수정·신설 (2026-10-01 boot_recover [6c] 인용버그 수정이 모범 사례)
- 반대 방향도 유효: 스킬의 경고를 실험으로 반박하면 스킬을 고친다

### 작업 ↔ 도구 매핑
| 작업 | 쓸 것 |
|---|---|
| 부팅 후 전체 복구 | 스킬 `scripts/boot_recover.sh 10179` (ANDROID_SERIAL 필수) |
| 탐지 채널 실측(ftrace) | 스킬 `scripts/channel_trace.sh` + chan19 인스턴스(boot_recover가 구성) |
| 가드 힙 어휘 스냅샷/diff | 스킬 `scripts/toss_heap_snapshots.sh` |
| 사망 N런 측정 | **워크스페이스** `tmp-artifacts/tools/launch_stats_bash3.sh` (스킬 판 toss_launch_stats.sh는 macOS bash3에서 `declare -A` 불가) |
| 종료 차단·caller 관찰 | 스킬 `scripts/exit_trap.js` (attach@~3.5s 레시피, spawn은 무력화됨) |
| LKM 빌드·비섹션 | **워크스페이스** `avd-camouflage/lkm/build-in-docker.sh` (소스 3세대: 현재본/pre_bisectA/B) |
| 판정 라벨 캡처 | logstore 런 중 폴링(§5 측정 표준) — 패턴 원문 `tmp-artifacts/run-logs/logstore_live_s153_최신판정.txt` |
| 가드 문자열/DEX 재분석 | dexguard-reVERSE + 워크스페이스 디코더 `tmp-artifacts/tools/decode_dbg_gate{,2,3}.py` |
| Ghidra 네이티브 분석 | `analyzeHeadless tmp-artifacts/native-engine/gproj toss5 …` + 스킬 `scripts/ghidra_decompile_at.java` |

## 3. 현재 상태 스냅샷 (2026-10-01 §153 종료 시점)

- **판정**: [EMULATOR] 1건 발화, T+11s 로컬 사멸 (logstore 실측, DEBUGGER 음성 — 9일 불변)
- camo33(emulator-5554) 가동 중: LKM=bisectB(v4.22/4.24/4.7 off), target_uids=10179,
  egl=adreno, model=SM-S916N, toss uid=10179(installer=com.android.vending 유지), frida-server 꺼짐
- 비섹션 완료(전부 네거티브): bisectA/B, GL축 전체 순정화(→2s 악화 후 롤백), 런타임 파라미터 3종, 사이드로드/설치자
- **범인은 libea56 네이티브 엔진의 메모리 거주 입력** (ARCHITECTURE [O]-1)

## 4. 다음 작업 (우선순위 — 자율 진행 시 이 순서)

1. **[O]-1**: 판정 cmp 직전 최종 GOT-CALL 핸들러 ftrace 캡처 → 발화 입력 특정 (§150 P3-1 절차)
   - 도구: 스킬 `scripts/channel_trace.sh` 변형 + chan19 인스턴스(boot_recover가 재구성)
2. [O]-2/3: native→Java 전달 edge, System.exit caller chain (exit_trap.js 변형)
3. 입력 특정 후 §151 P3 dynstr 런타임 스크럽 정타 / dmap 미등록 4채널 등록(10분 수정)
4. [O]-4 서버 403 지문: 로컬 판정 통과 후에만 (도구: `tmp-artifacts/tools/hook_did.js`+`attach_run.py`)

## 5. 운영 법칙 (위반 시 실측 피해 목록 — 전부 전례 있음)

### 환경/도구
- **`ANDROID_SERIAL=emulator-5554` 필수** — redroid(localhost:5556) 병렬, 미지정 시 엉뚱한 디바이스 조작
- adb가 PATH에 없음: `~/Library/Android/sdk/platform-tools/adb`
- 호스트 셸은 **macOS bash 3.2** — `declare -A` 불가. 측정은 `tmp-artifacts/tools/launch_stats_bash3.sh [N] [watch초]`
- LKM 빌드: `avd-camouflage/lkm/build-in-docker.sh` (docker + `ack-kernel/`, 산출 `hide_kmod.built.ko`)
- 에뮬 재기동: `adb emu kill` 후 `~/Library/Android/sdk/emulator/emulator -avd camo33 -no-snapshot -no-boot-anim`
- 부팅 후 복구: 스킬 `scripts/boot_recover.sh 10179` (전체 스택 원스텝, 완주 기대값은 스크립트尾部)

### 절대 금지
- **frida 기본포트 27042** — 0.2s 즉사. 커스텀포트(`-l 0.0.0.0:39871`+forward+add_remote_device)만. **테스트 후 frida-server 종료 필수**
- **`ro.hardware.egl --delete`** — EGL_adreno+GLESv2_angle 혼합 스택 → SF 크래시 루프. 토글은 값 교체(adreno↔emulation)만
- **pkill으로 에뮬 종료**(오버레이 소실), **구동 중 rmmod**(패닉), **push 직후 emu kill**(sync 먼저)
- GL 트리오 리터럴/soname 패치, ANDROID_EMU_gles_max 토큰 제거, dynstr 심볼 무분별 rename — 스킬 "하면 안 되는 것" 섹션 필독
- toss 재설치 시 uid 변함 → boot_recover/LKM 파라미터에 새 uid 지정

### 측정 표준
- 사망 타이밍: 초단위 pidof 폴링(기준선 11s). 판정 라벨: **런 중 logstore 폴링**(사후엔 서버 업로드로 소실) —
  `cat /data/data/viva.republica.toss/files/logstore/logitems/*.json` 300ms 간격, 패턴은 `run-logs/logstore_live_s153_최신판정.txt`
- 생존 판정 3점 검증: topResumedActivity + 스크린샷 + 탭 반응 (백그라운드 생존은 프리저 아티팩트)

## 6. 기록 의무 (모든 실험 후 — 사용자가 안 물어도)

1. FINDINGS.md 해당 § 추기 (양식: [P0 결론/P1 증거/P2 절차/P3 교훈])
2. ARCHITECTURE.md 해당 행/증거수준 갱신 ([O]→[C] 등)
3. **스킬 갱신** — 새 법칙·함정·레시피가 생겼으면 `skills/`에도 반영 (§2 "살아있는 문서" 규칙: SKILL.md·references·scripts)
4. 세션 종료 시: 루트에 새 `HANDOFF_S<n+1>_<날짜>.md` 작성, 구 핸드오프는 `toss-rasp/handoffs/`로
5. git 커밋 — 정책: **텍스트(md/sh/py/js/java/c/h/json)만 추적**, 바이너리(apk/dex/so/dump/img/zip)는 .gitignore로 로컬 보존

## 7. 저장소 지도

```
ARCHITECTURE.md            ← 최상위: 확정 모델·증거 원장·검증 지도
HANDOFF_S153_*.md          ← 최신 인계 (아카이브: toss-rasp/handoffs/)
skills/                    ← 스킬 2종(진실 소스) — ~/.agents/skills는 발견용 심볼릭
toss-rasp/                 ← FINDINGS.md(전체 기록) + 세션 원증거(11GB) + INDEX.md
tmp-artifacts/             ← 현재 분석 자산, 아키텍처 박스별 (INDEX.md)
  target-app/ guard-orchestrator/ native-engine/ countermeasures/ tools/ run-logs/
avd-camouflage/            ← 카모 인프라 (lkm/, host-patch/, 스크립트)
ack-kernel/                ← LKM 빌드 의존 ACK 클론 (1.6GB, 자체 .git)
host-patch-root/           ← 호스트 dylib GL 패치 v2/v3
originals/                 ← 원본 xapk + extracted/
evidence/                  ← 증거 패키지 (TOSS_DEXGUARD §97-108, REVIEW zip)
```
