# toss-rasp 인덱스 (2026-10-02 §179 기준)

> **아키텍처 전체 그림은 저장소 루트 `../ARCHITECTURE.md`** (박스→코드→증거 검증 지도). 이곳은 근거 아카이브 탐색용.

프로젝트 본체. 세션 디렉터리 이름은 FINDINGS.md 각 절의 "산출 (sessionN/)" 참조와 맞춰져 있어
**이동하지 않는다**(이력 문서와의 정합 우선).

| 경로 | 내용 |
|---|---|
| `FINDINGS.md` | **단일 진실 소스** — §1~§182 전체 기록 (8,400줄) |
| `handoffs/` (10건) | 세션별 핸드오프 아카이브 (S125~S152, 통합, NEXT_LLM, CAMO33) — 최신은 저장소 루트 |
| `analysis-lab/` (11GB) | 스크립트·프로브·증거 아카이브: `android/`(e1_syscalls, hidden dex/jar, fm_toss_full.bin 등 — .gitignore에 대형 명시), `scripts/`, `probes/`, `docs/`, `guests/`, `qemu-plugins/`, `toy/`, `build/` |
| `session17/` (1.7GB) | 17차 대형 트레이스(7분 생존 레시피 원증거) |
| `session19~session44` (각 10-60MB) | 차수별 산출물 — FINDINGS 해당 절 참조 |
| `session154~session167` | §154-167 산출 (가드 자기검사·hwbp·트리프와이어·스캔 입력면 등) — FINDINGS 해당 절 |
| `session168~session176` | §168-176 산출 (COW 트리프와이어 완성·JNI 블롭·복호 문맥/K2 캡처·파이프라인 정정) |
| `session178/` | ★§178 난독화 완전 해독 — decode_all 검증결과·blob.dat·dec_441a4.c |
| `session179/` | ★§179 판정입력 관측 — GL 수술판 샘플 3종 + 내일 결정실험 배포 레시피(README) |
| `apk_backup/` (211MB) | 원본 base+arm64 split (md5 기록, §39차) |
| `heap5/`, `heap6/`, `dump4*`, `runs/`, `loop_trace_14.gz`, `toss_trace*.txt` | 힙 스냅샷·ftrace 원증거 (§14x계) |

**탐색 요령**: 궁금한 주제 → FINDINGS.md에서 `## §N` 헤더 grep → 해당 절의 "산출" 문단 → 이 표에서 위치 확인.
최신 상태는 저장소 루트 `HANDOFF_S182_2026-10-02.md` (구핸드오프는 `handoffs/`), 작업 자산은 `../tmp-artifacts/INDEX.md`.
