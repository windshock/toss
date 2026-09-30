# 48차 세션 핸드오프 (요약 FINDINGS §52)

## 확정 — syscall 전사 (101만 엔트리, 14s 스캔 창)
- **타이밍 벤치마크 부정**: clock_gettime 1,394 / gettimeofday 0 / nanosleep 30.
- **process_vm_readv 6회** — 구 '632 vm_readv' 판명 갱신: 자기스캔은
  read/pread64 기반.
- **★ 자기스캔 정체 = ELF64 헤더 검증**: pread64(fd=3..0x10…, buf, 0x40, 0)
  연쇄 — 열린 fd 전부의 ELF 신원 확인 + fd40/41 content 무결성 읽기.
- read 291k(fd3/4/5 집중), mmap 122k, prctl 50k(PR_SET_VMA), 
  sched_setaffinity 10k, readlinkat 19k.
- C17: ftrace set_event 무시됨 — events/<evt>/enable 직접 기입 +
  set_event_pid 스레드 tid 주기 갱신 필수.

## 49차
1. getname kprobe + openat fd + read 카운트 상관 → '검증 대상 파일 목록' →
   미위장 항목 특정 (read 29만의 파일 귀속).
2. sched_setaffinity 1만회 검토(코어별 벤치마크 가능성).
3. 계류: maps 정합성 / 191 RE.
4. 9/25 claude 리셋 통합 검토.

## 산출: sysc48c.sh(전사 스크립트) · 히스토그램 FINDINGS §52-2 표
