# 36차 세션 핸드오프 (요약 FINDINGS §40)

## 확정 — ★★ StringEncryption 전수 관통
- **가드 어휘 56개 원문 확보** (`vocab_final.json`) — ftrace 간접 추정 채널의
  원문 목록. 분류 A(/proc 자기관찰) B(시스템 도구 실행: sh/-c/truncate/
  app_process) C(프로퍼티/SELinux) D(Java 리플렉션/ART) E(텔레메트리 포맷).
- 런타임 관측과 교차검증 완료: maps/smaps/status/cmdline/fd전수/dl_iterate_phdr/
  security.selinux 전부 대응.

## 정정 (C8 — 재발 금지)
1. **"잎 24개 무인자 자기완결" 부정확** — leaf_functions.json의 Ghidra 함수 시작은
   디스패처 조각(`br x11`, madd IB) 또는 `unaff_x19` 문맥 필요 → 전멸.
   올바른 진입 = **`adrp+add+ldaxr` 트리플** (capstone으로 254개 추출,
   `ldaxr_entries.json`). Hikari StringEncryption은 참조 사이트마다 인라인.
2. **in-JVM emulator 반복 생성 = unicorn SIGBUS 필연** (hs_err 7개) —
   잎 1개당 JVM 프로세스 1개로 해결(이후 크래시 0, 254개 38초 완주).
3. **Ghidra 주소 = ELF vaddr + 0x100000** 바이어스. .bss=0x186210~0x19e8b0.

## 산출 (session36/)
- TossEa56Leaf.java(단일 진입 실행+덤프), run_all.py/run_dump.py(병렬 드라이버),
  dumps/(254 after-image), strings_all.jsonl(43 직접 복원), vocab_final.json(56),
  lock_string_mapping.json(락 15개↔엔트리↔문자열), merged_data.bin(합집합 이미지).
- 잔여: 미복호 고통절 11.4KB(바이너리 페이로드 추정), 미추적 ldaxr 29개.

## 37차 권고 순서
1. **목표 D 정공**: 어휘 A/C군 기반 판정 입력 차단 보강 — camow fake-file에
   `/proc/self/ns/mnt` readlink·`/proc/%d` 브루트포스 대응, vold_app_data_isolation
   prop값 확인, getxattr security.selinux 경로 점검 → 원본 무수정 5분+ 3점 재도전.
2. B군 행동 채널: truncate/app_process가 판정 후 어떤 파일을 노리는지
   (fault 창 포렌식과 연결) 관찰.
3. 미추적 ldaxr 29개 + 잔여 바이너리 영역(선택).
4. 9/25 04:00 claude 리셋 후 25~36차 통합 검토(REVIEW_BRIEF 보강).
