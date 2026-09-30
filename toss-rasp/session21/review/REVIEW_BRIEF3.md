# 3차 검토 요청 (벽) — 불변 fault 시그니처의 컨트롤 전이 이상

전제: AVD(arm64, API33, GKI 5.15)에서 벤더서명 금융앱 토스의 로컬 RASP 우회 연구.
frida 금지, ftrace kprobe + LKM만 사용. 가드(libea56)가 런 12~78s에 SIGSEGV를 자체
핸들러로 수거한 뒤 System.exit(0)로 종료하는 것이 현재 저항 요소.

## 확정된 불변 시그니처 (동일 부트 3런, 완전 동일 — t21_gpr 프로브)

do_mem_abort kprobe (far/esr + pt_regs의 x16/x29/x30/sp/pc):
```
far = 0x0                    (esr=0x92000006: EC=0x24 EL0 데이터어보트, DFSC=0x06 변환폴트, WnR=0)
pc  = boot-framework.oat +0x19d534  (maps vaddr오프셋; file+0x345534)
lr  = boot-framework.oat +0x19d52c  (file+0x34552c)
x16 = 0x0
x29 = 0x7fdd25a818
sp  = 0x7fdd25a730
```
oatdump --addr2instr(file 0x345530, exec-relative 0x19e534) 심볼화 결과:
- 메서드 = android.content.ContextWrapper.isRestricted()
- file 0x34552c = OatQuickMethodHeader 위치
- file 0x345530 = 코드 시작: `sub x16, sp, #0x2000`
- file 0x345534 = `ldr wzr, [x16]` ← fault 명령 (ART StackOverflowCheck 프로브)

## 해석 시도와 벽

1. 정상 호출이라면 bl→entry(0x345530)에서 `sub x16, sp, #0x2000` 실행 → x16=sp-0x2000=
   0x7fdd258730(유효) → 프로브는 far=0x7fdd258730으로 폴트해야 함. 실측은 far=0x0,
   sp=0x7fdd25a730(정상), x16=0.
2. **모순**: x16=0이려면 (a) sub가 안 실행됐으면서 pc가 entry+4(=엔트리+4 직행, x16은
   이전값 0), 또는 (b) sub는 실행됐으나 sp≈0x2000이었어야 함 — 그러나 pt_regs sp는 정상.
   (a)의 경우 lr이 왜 QuickMethodHeader(엔트리-4)인지 설명이 안 된다. bl 호출이면 lr=
   호출자 코드여야 하고, 폴스루라면 pc가 entry+4에 오기 전 entry-4..entry의 헤더 바이트
   명령들이 실행됐을 텐데(헤더=CodeSize 92 등을 명령으로 실행하면 SIGILL이 먼저 예상).
3. 커널 측 신뢰성: do_mem_abort pt_regs는 동기 어보트의 유저 컨텍스트 (sp=+248, pc=+256).
   같은 부트 3런에서 x29/sp까지 완전 동일 — ASLR 없는 부트이미지 고정 주소와 정합.

## 질문 (한국어, 번호별 + Top3)

1. 위 모순(x16=0 + pc=entry+4 + lr=entry-4=헤더 + sp 정상)을 설명하는 컨트롤 전이
   시나리오 후보를 순위대로. 예: (i) 오염된 엔트리포인트/vtable이 entry-4~entry 영역을
   가리켜 폴스루, (ii) sigreturn 시 오염된 sigframe(pc=entry+4, x16=0 복원), (iii) ART
   Nterp/quick 전환 trampoline 경유, (iv) 기타. 각각 검증 방법도.
2. lr이 OatQuickMethodHeader를 가리키는 것의 의미: ART가 method header를 함수 포인터로
   로드하는 경로(OatMethodOffsets/QuickMethodHeader 구조)에서 오프셋이 하나 어긋나면
   이런 상태가 되는가? 즉 "엔트리포인트 테이블 오염" 가설의 정합성.
3. 이 시점에 x0~x15, x17 전체를 얻는 방법: kprobe fetch 16개 제한 우회(예: kretprobe+
   bpf? ftrace dump 스택?), 또는 memcpy 프로브 등으로 pt_regs 전체를 저비용 덤프하는 실용법.
4. 다음 단계 최단 경로: (i) 이 시그니처를 재현하는 최소 트리거 식별(런 내 타이밍/직전
   syscall), (ii) libea56 정적 RE에서 저장-컨텍스트 오염 store 후보 찾기(12차에서
   acca4 poison 블록, 0x95224 핸들러 확인됨 — 현 버전은 pc=0xc 대신 이런 형태로 진화
  했을 가능성), (iii) 기타. 리소스(ftrace/LKM/rename만, frida 불가) 제약 하에서.
5. 우회 관점: 오염을 근본 차단하기 어렵다면, 이 SIGSEGV를 가드 핸들러가 수거하지 못하게
   (ART FaultManager가 먼저 처리하게) 하는 LKM/ftrace 레버는 여전히 유효한가? 아니면
   종료 자체(kill/exit_group 차단)가 더 현실적인가? (지난 세션 kill 훅이 혼입 변수였던
   교훈 감안)

출력: 번호별 답변 + 수정 권고 Top3.
