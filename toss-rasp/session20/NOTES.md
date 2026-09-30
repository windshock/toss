# session20 (20차) 산출물

- run1.trace — 조용한 exit 런 1 (SIGSEGV(main MAPERR)+ACCERR×2 → exit(0), trace-all 노이즈 포함)
- run2.trace — syscall 필터 캡처 (wait4/ptrace/vm_readv/socket/kill): Thread-58 apk 스캔→
  wait4→connect 보고→exit, Thread-41→14600 kill(self,9)[spoof로 생존]→14600 컬렉터 체인,
  RxCachedThreadS-14451 vm_readv 632회(SIGSEGV ACCERR)
- run3_offline.trace — **무효** (pid 미설정, entries 0 — 오프라인 A/B로 인용 금지)
- run4_ab.trace — 타은행앱/테스트앱 제거 후 온라인 런 (여전히 exit → apk 무관 소거)
- trace_on1.txt + maps_on1.txt — v4.9 첫 런: signal_deliver sa_handler=libsigchain+0x8c,
  main exit_group lr=libandroid_runtime+0xcf44 (Java System.exit 확정)
- trace_pf.txt + maps_pf.txt — do_mem_abort 프로브(수요페이지 노이즈 다수, 유의 이벤트는
  시간상관 필요 — 21차 과제). far=0x12e20000·far=0x0 등 이형 fault 소량.
