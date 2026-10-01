# tmp-artifacts 인덱스 (2026-10-01 §153 정리)

§149-153 세션 작업 자산. **2026-10-01 재구성 전 경로**(FINDINGS/핸드오프 옛 문서 참조용):
`toss_base.apk`→`apk/`, `toss_alldex·toss_dex27`→`dex/`, `jadx_*`→`jadx/`,
`libea56_live.so·c13_dump.txt·dispatch_resolved.json·final_vocabulary.json·gproj`→`native/`,
`pristine_egl_s153`→`gl/`, `guest_ovl`→`guest/`, `launch_stats_bash3.sh`→`tools/`.

| 경로 | 내용 | 언제 쓰나 |
|---|---|---|
| `apk/toss_base.apk` | 원본 base APK (188MB) | 재설치/재분석 |
| `dex/toss_alldex/` | 전체 classes dex 추출 (30 dex) | 정적 분석 입력 |
| `dex/toss_dex27/` | classes27(가드 스레드 dex) 관련 | §151 DEBUGGER 게이트 등 |
| `jadx/jadx_hidden/` | **숨은 DEX(가드 자바측) 역컴파일 391파일** — 사멸 체인 코드(s3, getBooleanFromFullResponse, createFromParcel, UST_CRYPT…) | 원인 재검토의 1차 원문 |
| `jadx/jadx_c4,c11,c13,c16,c19,c30/` | 통합 APK 부분 디컴파일 트리 (각 classesN) | 클래스 출처 대조 |
| `jadx/jadx_dbg, jadx_ve/` | DEBUGGER/VIRTUAL_ENV 게이트 분석 트리 | §151 decA/B/C 재검 |
| `native/libea56_live.so` | 가드 네이티브 라이브 덤프본 | Ghidra 재분석 |
| `native/gproj/` | Ghidra 프로젝트 toss5 | `analyzeHeadless native/gproj toss5 …` |
| `native/c13_dump.txt` (44MB) | 16k 루프 디스패처 원시 덤프 | §149-3 재해석 |
| `native/dispatch_resolved.json` | 1980 reloc 해석·핸들러 분류(1,969개) | 네이티브 지도 |
| `native/final_vocabulary.json` | 확정 탐지 어휘 | 체크리스트 대조 |
| `gl/pristine_egl_s153/lib64/` | **순정 GL 11종**(vendor.img 직출, md5 목록 FINDINGS §153 P1) | 17차 GL 세계 재현 (레시피: §153 P1) |
| `guest/` | 게스트 오버레이 관련(§151 system.img 수술) | — |
| `tools/` | decode_dbg_gate 1~3, hook_did/hook_fdleak, attach_run, launch_stats_bash3(측정 러너), tombstone_09 | 실험 재현 |
| `run-logs/` | §151 4련 logstore/logcat + `logstore_live_s153_최신판정.txt`(**현재 판정 [EMULATOR] 실측 원문**) | 판정 증거 |

 REVIEW zip(루트 `REVIEW_S148_S153_2026-10-01.zip`)의 원본 스테이징은 정리 때 삭제(zip이 원본).
