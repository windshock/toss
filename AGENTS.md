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
6. 세션 시작 시 **avd-rasp-camouflage 스킬 로드** (금지 목록 선독 — 1시간 낭비 전례 다수)

## 2. 현재 상태 스냅샷 (2026-10-01 §153 종료 시점)

- **판정**: [EMULATOR] 1건 발화, T+11s 로컬 사멸 (logstore 실측, DEBUGGER 음성 — 9일 불변)
- camo33(emulator-5554) 가동 중: LKM=bisectB(v4.22/4.24/4.7 off), target_uids=10179,
  egl=adreno, model=SM-S916N, toss uid=10179(installer=com.android.vending 유지), frida-server 꺼짐
- 비섹션 완료(전부 네거티브): bisectA/B, GL축 전체 순정화(→2s 악화 후 롤백), 런타임 파라미터 3종, 사이드로드/설치자
- **범인은 libea56 네이티브 엔진의 메모리 거주 입력** (ARCHITECTURE [O]-1)

## 3. 다음 작업 (우선순위 — 자율 진행 시 이 순서)

1. **[O]-1**: 판정 cmp 직전 최종 GOT-CALL 핸들러 ftrace 캡처 → 발화 입력 특정 (§150 P3-1 절차)
   - 도구: 스킬 `scripts/channel_trace.sh` 변형 + chan19 인스턴스(boot_recover가 재구성)
2. [O]-2/3: native→Java 전달 edge, System.exit caller chain (exit_trap.js 변형)
3. 입력 특정 후 §151 P3 dynstr 런타임 스크럽 정타 / dmap 미등록 4채널 등록(10분 수정)
4. [O]-4 서버 403 지문: 로컬 판정 통과 후에만 (도구: `tmp-artifacts/tools/hook_did.js`+`attach_run.py`)

## 4. 운영 법칙 (위반 시 실측 피해 목록 — 전부 전례 있음)

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

## 5. 기록 의무 (모든 실험 후 — 사용자가 안 물어도)

1. FINDINGS.md 해당 § 추기 (양식: [P0 결론/P1 증거/P2 절차/P3 교훈])
2. ARCHITECTURE.md 해당 행/증거수준 갱신 ([O]→[C] 등)
3. 세션 종료 시: 루트에 새 `HANDOFF_S<n+1>_<날짜>.md` 작성, 구 핸드오프는 `toss-rasp/handoffs/`로
4. git 커밋 — 정책: **텍스트(md/sh/py/js/java/c/h/json)만 추적**, 바이너리(apk/dex/so/dump/img/zip)는 .gitignore로 로컬 보존

## 6. 저장소 지도

```
ARCHITECTURE.md            ← 최상위: 확정 모델·증거 원장·검증 지도
HANDOFF_S153_*.md          ← 최신 인계 (아카이브: toss-rasp/handoffs/)
toss-rasp/                 ← FINDINGS.md(전체 기록) + 세션 원증거(11GB) + INDEX.md
tmp-artifacts/             ← 현재 분석 자산, 아키텍처 박스별 (INDEX.md)
  target-app/ guard-orchestrator/ native-engine/ countermeasures/ tools/ run-logs/
avd-camouflage/            ← 카모 인프라 (lkm/, host-patch/, 스크립트)
ack-kernel/                ← LKM 빌드 의존 ACK 클론 (1.6GB, 자체 .git)
host-patch-root/           ← 호스트 dylib GL 패치 v2/v3
originals/                 ← 원본 xapk + extracted/
evidence/                  ← 증거 패키지 (TOSS_DEXGUARD §97-108, REVIEW zip)
```
