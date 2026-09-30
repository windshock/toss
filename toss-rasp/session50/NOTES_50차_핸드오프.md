# 49~50차 세션 핸드오프 (요약 FINDINGS §53)

## 확정
- **fork 자식 미개척지 개척**: 560k syscall — getname 0회(상속 fd만 사용),
  read 185k, write fd1 78k(부모 보고 파이프), **syslog(klog) 8,929회 정찰**.
- **커널로그 채널**: dmesg_restrict=0이었음 → 1로 수정+로그 청소.
  로그에는 ranchu/goldfish + **우리 bind mount AVC 흔적(shell_data_file)**
  노출이 확인됨. 차단 후에도 판정 잔존(정찰이거나 다중 입력).
- 트레이싱 해체 대조: 우리 ftrace 계측은 트리거 아님(부정).
- maps 가짜/실제 라이브러리 400종 완전 일치.
- C19: fd churn으로 히스토그램 귀속 불가(스냅샷+재사용). C20: kprobe_events
  전역 clear = LKM 프로브 제거 → 게스트 패닉(append만 안전).

## 51차
1. fork 직전 부모 fd 테이블 스냅샷 → 자식 fd3/4/85 정체.
2. 자식 stdout 프로토콜 해독(판정 원문).
3. 위장 파일 chcon(AVC 흔적 근절).
4. apply_50(dmesg_restrict) 재적용 체인 편입.
5. 9/25 claude 리셋 통합 검토.

## 산출: child50c.sh · fdsnap49.sh · apply_50_fixes.sh · cor49.log(게스트)
