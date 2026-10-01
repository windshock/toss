# toss — AVD 환경에서의 금융앱 RASP(에뮬레이터 탐지) 연구

승인된 보안 연구 프로젝트(사내 정보보호담당 · KISA 보안 취약점 신고포상제 제보 목적).
Android 에뮬레이터(AVD, arm64 API 33)에서 토스앱의 RASP가 에뮬레이터를 판정해 스스로 종료하는
메커니즘을 역분석하고, 판정 입력을 특정하는 것이 현재 목표. 공격 도구가 아니라 탐지 회귀 분석·증거 수집 저장소.

## 문서 체계 (읽는 순서)

| 문서 | 역할 |
|---|---|
| **AGENTS.md** | AI 에이전트 운영 지침 — 진입 순서·운영 법칙·기록 의무. 세션 자동화의 기준 |
| **ARCHITECTURE.md** | 대상(토스 RASP)의 기술 아키텍처 확정 모델 + 증거 원장(CONFIRMED/OPEN/REFUTED) + 박스→파일 검증 지도 |
| **HANDOFF_S\*.md**(루트 최신 1건) | 세션 인계. 과거분은 `toss-rasp/handoffs/` |
| `toss-rasp/FINDINGS.md` | §1~§153 실험·해독 전체 기록(단일 진실 소스) |
| `toss-rasp/INDEX.md`, `tmp-artifacts/INDEX.md` | 근거 아카이브·분석 자산 탐색 |

## 한 줄 요약 (2026-10-01)

자바측 가드(DetectFactor 5종)는 전부 무죄임이 코드로 확정됐고, 현재 T+11s 사멸의 판정 라벨은
[EMULATOR](logstore 실측). 범인은 libea56 네이티브 엔진(~1,969 핸들러)이 소비하는
메모리 거주 입력(로드 라이브러리 심볼/페이지 프로빙 등)으로 좁혀져 있으며, 다음 관문은
"판정 직전 최종 GOT-CALL이 무엇을 읽었는가"를 ftrace로 잡는 것.

## 구조

```
ARCHITECTURE.md / AGENTS.md / README.md / HANDOFF_S153(최신)
toss-rasp/      FINDINGS + 세션 원증거 아카이브 (INDEX.md)
tmp-artifacts/  현재 분석 자산 — 아키텍처 박스별 정렬 (INDEX.md)
avd-camouflage/ 카모 인프라: LKM(hide_kmod), 호스트 dylib 패치, 운영 스크립트
skills/        프로젝트 내장 스킬 3종(avd-rasp-camouflage·dexguard-reVERSE·security-hypothesis-lab) — 다른 LLM도 클론 즉시 사용. 실험으로 얻은 법칙을 스킬에 계속 반영
ack-kernel/     LKM 빌드 의존 (ACK 클론)
host-patch-root/ 호스트 GL 패치 v2/v3
originals/      원본 xapk, extracted/
evidence/       증거 패키지 (§97-108 DEXGUARD, REVIEW zip)
```

## git 정책

텍스트(md/sh/py/js/java/c/h/json 등)만 추적. 바이너리(apk/dex/so/dump/img/zip)와 40MB+ 텍스트는
.gitignore — 로컬 폴더에 보존되나 git에는 없음. 원본 복원이 필요하면 로컬 경로 사용.

## 면책

본 저장소는 사내 승인 연구·KISA 제보 목적의 방어적 보안 연구 산출물이다. 분석 대상 앱의 무단 조작·유통 목적이 아니며,
재서명 앱의 서버 인증·거래는 원천적으로 거부됨을 전제로 한다(경계 밖).
