# 21차 중간 정리 (이번 라운드)

## 확정
- fault 시그니처 3런 불변: far=0x0, pc=boot-framework.oat+0x19d534
  (ContextWrapper.isRestricted 스택프로브 ldr wzr,[x16], 엔트리+4), x16=0, x29=sp+0xE8 정상
- lr=+0x19d52c = OatQuickMethodHeader 위치 — 어떤 bl/blr도 만들 수 없는 값
  → 크래프트된 컨텍스트 복원 주가설 (3차 외부검토 양측 수렴, review/ 참조)
- rt_sigreturn(139)이 fault 6ms 전 관측(1런) / 다른 런: fault 없이 sigreturn→12s→exit
  → **종료 경로 다수 존재**, sigreturn→약 12s→exit_group(0) 케이던스가 더 근본일 가능성
- System.exit called 마커: 매 조용한 exit에서 관측 (9+ 회)
- LKM v4.11b: kp_fault(전체 pt_regs 덤프) + kp_rsig(rt_sigreturn 시그프레임 덤프) 탑재.
  단 본 런에서 rsigdump 미출력 — dmesg -c가 등록 에러를 지운 이슈. t21rsig.sh 수정 완료
  (클리어 제거 + 등록 검증 선행). **다음 세션 첫 동작: v4.11b로 깨끗한 재실행.**

## 시그프레임 오프셋 (검증됨)
arm64 rt_sigframe: siginfo 0x00(128B) | mcontext 0x80:
fault_address@0x80, regs[i]@0x88+8i, x16@0x108, sp@0x180, pc@0x188

## 다음 세션 우선순위
1. t21rsig.sh 수정본으로 1런 — main의 rt_sigreturn 프레임에서 복원 pc/x16 실측
   → 복원 pc == fault pc(entry+4)면 "핸들러가 크래프트 프레임으로 복귀" 확정
2. 크래프트 프레임을 쓰는 주체 = 가드 핸들러 → libea56 정적 RE(0x95224/acca4 인근,
   컨텍스트-라이터: sigframe/ucontext 오프셋에 상수 store)
3. 판정 입력 역추적: sigreturn↔12s↔exit 케이던스의 의미(그레이스 타이머?) —
   fault 유무와 무관하게 12s가 나오는지 N런 확인

## [추가] 재부팅 루프 격화 (세션 마감 시점)
- 12:04:49 재부팅 후 12:5x 재부팅 — 주기 10분 이내로 격화. 재부팅 직후 부트에선
  모듈/인스턴스 모두 소실(boot_recover 필요). rsig_dump_en도 리셋(재활성 필요).
- 부팅 사유는 여전히 userspace `reboot`(커널 패닉 아님). 발행 주체 미상.
- 세션 마감 시 에뮬: 재부팅 직후 미복구 상태 → **다음 세션 첫 동작 = boot_recover.sh**

## 다음 세션 첫 동작 순서
1. boot_recover.sh (전체 복구 + 체크리스트 확인)
2. 호스트 감시자: `adb logcat -v time > reboot_forensics_계속.log` (백그라운드 상시)
3. 재부팅 발생 시 forensics 로그 마지막 5초 분석 → 발행 주체 특정
4. 주체 해결 후: rsig_dump_en=1 + t21rsig.sh로 시그프레임 실측 (21차 본선)

## [관찰 추가] 조용한 exit의 간헐성 + 게스트 생존 런 (21차)
- 런 5148 (v4.14b, ksig_dis=0 차단 활성): ~25-30s 조용한 exit (am_proc_died, am_kill/신호
  없음). 이번엔 게스트 생존 — "앱 죽음=게스트 리부트" 연계는 **간헐적**으로 재분류.
- kill9 intercepted: Thread-39(5443)/process(5444)의 셀프-kill 2건만 — 부모 살해 없음
  (20차와 동일 패턴 재확인).
- 종료 직전 가드 스캔: /proc/5148/net/unix, /proc/self/mounts (pag_cache_2) — 21차 표준 패턴.
- 결론: 조용한 exit은 (a) far=0 SIGSEGV→컬렉터→System.exit 경로와 (b) SIGSEGV 없는
  조용한 경로가 혼재. 공통 선행은 가드 스캔 라운드. 원인 입력 특정은 다음 라운드 계속.
