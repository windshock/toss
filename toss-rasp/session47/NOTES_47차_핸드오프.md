# 47차 세션 핸드오프 (요약 FINDINGS §51)

## 확정
- **파일/프롭 계층 소진 선언** — ftrace 실측(channel_trace 18s): 가드의 실제
  프로브 56경로+10프롭 전수가 중립화 상태.
- **cpufreq 대형 채널 수정**: cpuinfo_max_freq=2(kHz 쓰레기) → 8코어 SM8550
  클러스터 정합(3360000/2803200/2050000) bind mount, 앱 uid 검증 ✓.
- bss 덤프: 추가 어휘 0 — **라이브 어휘 174개로 완결**.
- 환경 사고 복구: adbd 뱅걸림 → 하드 킬 → 재부팅 → 전 체인 재적용 완료.
  C16: ps uid 표시 포맷 불일치(숫자/이름) — `-o UID,PID,NAME` 고정.

## 잔여 가설 (48차)
1. 비-파일 syscall: 타이밍 벤치마크(clock_gettime/sched) — ftrace 전사.
2. maps 위장 정합성(camow fake maps 미세 불일치).
3. 셀프스캔(vm_readv 632) 비교 대상 / 191 코드 RE.

## 산출 (session47/)
dump47.sh(.data+.bss 원샷) · dumps/{data,bss}.bin · ct47.log + probed.txt
(프로브 전수) ★ · apply_47_fixes.sh(cpufreq)
