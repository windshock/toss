# 23차 세션 핸드오프 (2026-09-22 저녁 종료) — 24차용

## 이번 세션의 대사건: codex 외부검토로 22차 핵심 해석 대정정 ★

**"크래프트 처형 시퀀스" 해석 폐기 → "NPE 위장 종료"로 확정.** 반론 전부 디스어셈블
재검증으로 실증(FINDINGS §27):
1. far=0 fault = ContextWrapper.isRestricted()의 **mBase=null implicit null check**.
   엔트리는 0x345500(sub x16,sp,#0x2000+ldr wzr,[x16] 스택프로브) — 0x345534는
   엔트리+0x34의 `ldr w0,[x1]`. **lr=0x34552c는 0x345520 `adr x30,+12`의 코드 생성물**
   (read-barrier 링크) — "크래프트 필드"가 아니었다.
2. SFO 복원값 = **ART NullPointerHandler::Action의 표준 NPE 변환**.
   libart rx pgoff=0x200000 보정 시 ELF vaddr 0x457920 =
   art_quick_throw_null_pointer_exception_from_signal(기존 ExecuteSwitchImplCpp 해석은
   pgoff 누락 오판 — OAT 정정하면서 libart에서 같은 실수 반복).
   x30=si_addr(=0), sp-=8, [sp]=return_pc — 실측과 완전 일치.
3. kill9 = fork 수집 자식 자기정리(main과 pid 상이). main은 System.exit(0).
4. 23차 초반의 "제3자 시그프레임 기록" 소거법 결론(§26-2)도 폐기 — 수정 주체가
   ART NullPointerHandler로 특정됨.

**수정된 모델**: mBase=null 호출(5런+ 결정론) → NPE → Bugsnag 캡처 → 12s 수집 →
System.exit(0). "조용한 exit" = **NPE로 위장된 종료**. 정상 기기에선 없는 호출이
위장 환경에서 결정론적으로 발생 = "누가 mBase=null을 만드는가"가 진짜 미해결.

## 23차 실험 기록
- **백그라운드 생존**: 홈 키로 밀면 **t+15s DEAD**(23차 실측) — 22차의 "2분+ 생존"은
  ftrace 부하 상태 특수 케이스로 재분류. cgroup freezer 여부 미확인.
- **isRestricted caller uprobe(0x345528) 실험**: 이벤트 0건 + **흐름 교란** — fault가
  0x345538(다음 명령) si_addr=heap(0x1b512ee) 변형으로 이동, far=0 시그니처 소실.
  → **uprobe(코드 무결성 붕괴)는 이 앱에서 부적합.** 제거 완료.
- sigchain 체인 지도(23차 초반, 유효): SIGSEGV → art::SignalChain::Handler
  (libsigchain+0x208c) → bugsnag 핸들러(libbugsnag-ndk+0x5ba60). ART FaultManager가
  그 앞단에서 NPE 변환. libea56/libsigchain 배열/bugsnag 코드·데이터 모두 무오염.
- 재부팅: 이번 세션 중 발생 0건(v4.15c 부트, 전-uid 로깅 무장 상태).

## 24차 로드맵 (codex P1~P3 반영)
1. **caller 특정(대체 수단)**: uprobe 불가 → (a) LKM kprobe는 유저 주소 불가,
   (b) **커널 do_mem_abort(kp_fault)에서 스택 덤프 확장** — fault 시점 sp+0x28
   (caller LR)을 faultdump에 추가하면 uprobe 없이 caller 확보!! (fault-ctx에 이미
   sp가 있으니 유저스택 읽기만 하면 됨 — 이것도 유저 메모리 읽기라 kprobe 위험...
   대신 fault 창 /proc/mem 폴링(기존 스크립트)으로 sp+0x28 8바이트 읽기가 안전)
   → toss_fault_resolve.sh에 "fault 시 sp+0x28 덤프" 추가하여 caller LR 확보 후
   maps resolve. **이게 24차 1번.**
2. **RxCachedThreadS/libea56+0x69b38 트랙**(셀프스캔 fault) — RASP 판정 직결,
   codex도 우선순위 상향 권고. 632회 vm_readv 결정론(20차)과 연결.
3. NPE 이후 경로: catch/UEH(TossApplication$$ExternalSyntheticLambda17) 수신 여부 —
   logcat(events)로 exception 처리 확인.
4. mBase 오염 시점: fault 직전 좁은 syscall(mprotect/process_vm_readv/prctl) 추적.
5. frida handler_probe.js 재사용 시 ucontext offset 필수 수정(uc_mcontext≈uc+0xB0,
   pc≈uc+0x1B8 — codex 지적, 현재 잘못됨).

## 도구/문서 상태
- toss_fault_resolve.sh resolve **pgoff 보정 완료**(ELF vaddr 기준, 스킬 동기화).
- FINDINGS §25(22차 원래 기록)/§26(23차 초반)/§27(정정) — §27이 최신 결론.
- STATUS 전선 정정 완료.
- 세션 기록 규칙: 중요 변경/동일반복/벽 시 codex 검토(claude CLI는 부재 — npm
  global codex만 설치됨: /Users/1004276/.npm-global/bin/codex, --skip-git-repo-check 필수).

## 절대 금지 추가 (23차)
- **토스/OAT 코드 영역 uprobe·브레이크포인트** — 코드 무결성 붕괴로 흐름 교란 실측.
- resolver의 매핑 상대 offset을 심볼 offset으로 직용(pgoff 반드시 보정).
