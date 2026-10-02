# tmp-artifacts 인덱스 — 아키텍처 정렬판 (2026-10-02 §179)

> **최상위 지도는 저장소 루트 `ARCHITECTURE.md`** — 이곳은 그 박스별 실물 자산 배치.
> 같은 날 2차 재구성(유형별→아키텍처별). 대응: `jadx/`→`target-app/jadx-app/`·`guard-orchestrator/`,
> `native/`→`native-engine/`, `gl/`·`guest/`→`countermeasures/`.

| 경로 | 아키텍처 위치 | 내용 |
|---|---|---|
| `target-app/apk/toss_base.apk` | [입력] | 원본 base APK (188MB) |
| `target-app/dex/toss_alldex·toss_dex27` | [입력] | 전체 30 dex · classes27 추출 |
| `target-app/jadx-app/jadx_c4·c11·c13·c16·c19·c30·dbg·ve` | [입력] | 통합 APK 부분 디컴파일 트리 (installer 소비처 c13·텔레메트리 c4 포함) |
| `guard-orchestrator/jadx-hidden/` | **박스 1: Hidden DEX 오케스트레이터** | 숨은 DEX 역컴파일 391파일 — s3/getBooleanFromFullResponse/createFromParcel/UST_CRYPT… (§148 체인 원문) |
| `native-engine/libea56_live.so` | **박스 2: libea56 엔진** | 라이브 덤프 바이너리 (Ghidra 재임포트용) |
| `native-engine/gproj/` | 〃 | Ghidra 프로젝트 toss5 |
| `native-engine/dispatch_resolved.json` | 〃 | 1980 reloc 해석·핸들러 1,969 분류 |
| `native-engine/final_vocabulary.json` | 〃 | 확정 탐지 어휘 |
| `native-engine/c13_dump.txt` (44MB) | 〃 | 디스패처 원시 덤프 |
| `run-logs/logstore_live_s153_최신판정.txt` | **집행 A + 서버 평면** | 현재 판정 [EMULATOR] 실측 원문 + 403 3건 |
| `run-logs/logstore_run5~9·toss_run2/3·toss_cert_run` | 집행 A/B 증거 | §151 4련 logstore/logcat |
| `tools/tombstone_09.txt` | 집행 B 증거 | native poison 계열 툼스톤 |
| `tools/decode_dbg_gate1~3·hook_did·hook_fdleak·attach_run` | 검증 도구 | 디코더·frida(커스텀포트)·측정 |
| `tools/launch_stats_bash3.sh` | 검증 도구 | N런 사망 분류 러너 (macOS bash3 호환) |
| `countermeasures/gl/pristine_egl_s153/lib64/` | 대응 스택 | 순정 GL 11종(vendor.img 직출, md5: FINDINGS §153 P1) — 17차 GL 세계 재현 레시피 재료 |
| `countermeasures/guest/` | 대응 스택 | §151 system.img 수술 관련 게스트 오버레이 |
| `native-engine/decode_static2.py` | 〃 | ★§178 확정 레코드 정적 디코더 (14패스, 바이트 100% 검증) |
| `native-engine/emu_jol_decrypt.py` | 〃 | ★§178 JNI blob 재현기 (SKIP_AFED8=1, 5,552B 100%) |
| `native-engine/emu_run_fn.py` | 〃 | 임의 함수 Unicorn 실행기+rw 검증 (once-함수 0x441a4 검증용) |
| `native-engine/emu_decrypt·decode_static(구)·emu_afed8.py` | 〃 | §172-176 역사 도구 (afed8 스캔기·재생 하네스) |
| `tools/dynstr_surgery.py` | 대응 스택 | ★§179 GL dynstr 개명 수술 (버킷보존+gnu_hash 재계산 — 법칙 스킬 §179) |
| `tools/pw_blob2.sh·blobpoll2.sh·pw_blob.sh` | 검증 도구 | §179 blob 트리프와이어(rw-p tail -1 함정 수정)·고주소 폴링 |
| `tools/guard_capture·guard_probe_dump·gdt_*·child_forensics·hwbp_*` | 검증 도구 | §154-166 관측 도구군 |
| `tools/hook_*.js` (vdso/clock/rw_diff/afed8_peek/dynstr_scrub 등) | 검증 도구 | §157-172 frida 관찰 스크립트군 |
