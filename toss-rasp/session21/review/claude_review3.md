# 3차 검토 답변 — 불변 fault 시그니처의 컨트롤 전이

먼저 결론부터: **이 시그니처는 "메모리 손상 사고"가 아니라 "결정론적으로 설계된(crafted) 컨텍스트 복원"으로 읽어야 정합적**이다. 바이트 단위 3런 일치가 그 핵심 증거이며, 특히 `lr=entry-4`가 진단의 열쇠다.

---

## 1. x16=0 + pc=entry+4 + lr=entry-4 + sp정상 을 설명하는 컨트롤 전이 (순위)

먼저 증거로 좁혀지는 범위를 확정한다.
- **(b) "sub 실행 + sp≈0x2000" 완전 배제 확정.** sub와 ldr 사이 4바이트에 sp 변경 명령이 없으므로 sub-time sp = fault-time pt_regs.sp. pt_regs.sp=0x7fdd25a730이면 x16=sp-0x2000=0x7fdd258730이어야 하고 far도 그 값이어야 한다. far=0이 아님 → **sub는 실행되지 않았다.**
- **EC=0x24, DFSC=0b000110(translation, L2), FnV=0 → FAR=0은 신뢰 가능.** 즉 x16은 진짜 0이었고 ldr이 주소 0을 읽어 폴트. 데이터어보트(명령 fetch 성공)이므로 **pc=entry+4는 실제로 fetch/실행됐다** (br xN에 xN=0 같은 "0으로 분기"면 instruction abort EC=0x20/21이 나옴 — 아님).

따라서 "entry+0을 건너뛰고 정확히 entry+4에 착지 + x16은 stale 0" 이 강제된다. entry≤entry+0으로 진입하는 모든 폴스루는 sub를 지나 x16≠0이 되므로 **폴스루 계열은 원천 배제**. entry+4로 "직접 도착"시키는 전이만 후보다.

**순위:**

**1위 — 크래프트된 컨텍스트 복원(sigreturn/corrupted sigframe, 또는 setcontext/longjmp류).** pc·lr·x16·sp·x29가 모두 sigframe의 독립 필드에서 복원된다고 보면 네 이상값이 한 번에 설명된다. 특히 `lr=entry-4`는 이 시나리오에서만 자연스럽다(저장된 GPR 하나일 뿐, pc와 독립). 3런 바이트 일치 = 상수 템플릿에서 복원. 가드가 **이미 시그널 핸들러를 갖고 있다**는 알려진 사실과도 정합(핸들러가 uc_mcontext 조작 후 sigreturn).
 - 검증: (a) 폴트 직전 syscall이 `rt_sigreturn`(arm64 nr 139)인지 — 맞으면 사실상 확정. (b) `setup_rt_frame`/`restore_sigframe` kprobe로 저장 pc/lr/x16 캡처 → entry+4/entry-4/0이면 확정. (c) 같은 TID에 선행 SIGSEGV가 있는지(nested/2차 폴트) `force_sig_fault` 카운트.

**2위 — 오프-바이-4 손상 quick 엔트리포인트 (blr code+4).** `entry_point_from_quick_compiled_code_`가 entry+0 대신 entry+4로 오염 → blr로 진입 → pc=entry+4(일치), sub 스킵 → x16=stale 0(일치). **단 lr=caller_return이 되어 lr=entry-4를 설명 못 함**(정확히 반쪽 정합). lr=entry-4가 우연이라는 추가 가정이 필요.
 - 검증: 런타임 ArtMethod(isRestricted)의 엔트리포인트 필드를 LKM로 읽어 entry+0 vs entry+4 비교.

**3위 — 손상 vtable/IMT 슬롯(=code+4) 경유 간접 분기(br/blr), lr stale.** 2위의 변형. br(무링크)면 lr 비변경이라 우연히 entry-4일 수 있으나, 슬롯값이 하필 code+4 + lr이 하필 header인 동시 우연이 필요 → 저확률.
 - 검증: 콜사이트가 br(tail)인지 blr인지, 대상 x0=ArtMethod* 유효성(→ Q3 필요).

**4위 — 헤더 폴스루** (vtable가 entry-4/-8 지시): entry+0 통과로 sub 실행 → x16≠0, 또는 헤더바이트(code_size 등) 실행 시 SIGILL 선행. 배제에 가까움. 선행 SIGILL 부재(`do_undefinstr` kprobe 무반응)로 반증.

**5위 — Nterp/quick trampoline 경유:** nterp는 메서드별 코드가 없는 공유 엔트리(`ExecuteNterpImpl`)라 per-method `sub x16/ldr`가 안 나옴. 이 메서드는 boot.oat의 Optimizing AOT 코드이므로 trampoline 착지 형태로 이 프롤로그에 x16=0으로 도달하기 어려움. 최하위.

---

## 2. lr=OatQuickMethodHeader의 의미 / 엔트리포인트 오염 가설 정합성

헤더는 `{code_info_offset@code-8, code_size@code-4}` 8바이트, `FromCodePointer(code)=code-8`. entry-4는 code_size_ 필드(헤더 내부)다.

- **"오프셋 하나 어긋남"의 실체 구분이 중요하다.** 엔트리포인트가 +4 어긋나면 pc=entry+4·x16=0은 나오지만 `blr`이므로 lr은 **호출자 복귀주소**가 된다. 호출자 코드가 entry-8에 있을 리 없으므로 **lr=entry-4는 이 경로에서 정상적으로 생성되지 않는다.**
- 즉 `lr=entry-4`는 이 콜사이트의 자연스러운 복귀주소가 **아니다.** 어떤 bl/blr도 이 값을 만들려면 분기 명령이 entry-8에 있어야 하는데, 그건 헤더 내부다. → **lr=entry-4는 "실제 분기의 산물"이 아니라 "저장/크래프트된 컨텍스트의 한 필드"일 가능성이 압도적.** 이것이 1위(컨텍스트 복원)를 2·3위보다 우선시키는 결정적 근거다.
- 따라서 "엔트리포인트 테이블 오염" 가설은 **pc/x16에는 정합하나 lr에는 부정합**한, 반쪽짜리다. ART가 method header를 함수 포인터로 오로드하는 경로가 이 상태를 "자연히" 만들지는 않는다(그런 오로드는 보통 ART 내부 assert/abort로 다르게 터짐, entry+4 클린 폴트가 아님).

---

## 3. x0~x15, x17 전체 획득 — 16-fetch 제한 우회

**핵심: 16 제한은 tracefs `kprobe_events`의 `$argN/%regN` 문자열 인터페이스 한계일 뿐, 실제 LKM kprobe에는 없다.** 이미 do_mem_abort kprobe 모듈이 있으므로 핸들러만 확장하면 끝.

- **최우선:** kprobe/ftrace 어느 지점에서든 `struct pt_regs *u = task_pt_regs(current);` → EL0 유저 프레임의 x0~x30·sp·pc·pstate 전체를 한 번에 획득. hook 함수가 do_mem_abort든 do_page_fault든 무관(current의 유저 프레임을 읽으므로). `memcpy(buf, u, sizeof(*u))` 후 x0..x30 덤프.
- arm64 kprobe caveat 대응: do_mem_abort가 blacklist(noinstr)면 EL0 translation fault 디스패치 하위인 `do_translation_fault`/`do_page_fault`에 걸거나, `arm64_force_sig_fault` 계열에 걸고 동일하게 `task_pt_regs(current)`로 읽는다. (el0_da 벡터 자체는 noinstr이라 금지.)
- bpf 대안: `kprobe/do_page_fault`에서 `bpf_probe_read_kernel(&r, sizeof(r), (void*)PT_REGS...)`로 전체 구조체를 맵으로 — 하지만 이미 LKM이 있으니 굳이 불필요.
- **왜 이게 최우선인가:** x0(=ArtMethod*/this)와 x17이 1위 vs 2위를 즉시 판별한다. x0가 isRestricted의 유효 ArtMethod*·x1~x3가 그럴듯한 인자 → 실제 invoke(오프-바이-4). x0가 무관/상수 스냅샷 → 컨텍스트 복원.

---

## 4. 다음 단계 최단 경로

**(i) 최소 트리거 — 직전 syscall 상관(가장 싸고 결정적):** `raw_syscalls:sys_enter/sys_exit`를 폴트 TID로 필터 + do_mem_abort kprobe 핸들러에서 ftrace snapshot 트리거. 폴트 직전 1~2개 syscall 확인.
 - **단일 최고가치 실험: 직전이 `rt_sigreturn`이면 1위(컨텍스트 복원) 확정** → 즉시 `setup_rt_frame`/`restore_sigframe` 후킹으로 크래프트된 sigframe(pc/lr/x16 필드) 실측. 12~78s 창의 타이밍/해당 TID가 가드 스레드인지도 같이 기록.

**(ii) libea56 정적 RE — 찾을 것을 재정의:** 범용 "손상 store"가 아니라 **컨텍스트-라이터**를 찾아라 — ucontext/sigframe/jmp_buf 오프셋에 pc·lr·x16(또는 isRestricted 코드주소 상수)를 쓰는 store. 12차의 acca4 poison 블록 / 0x95224 핸들러 인근을 우선 대상으로, "pc=0xc → 저장컨텍스트 오염 형태로 진화" 가설을 핸들러 diff로 검증. sigframe의 mcontext 레이아웃(regs[16], pc, sp 오프셋)에 상수를 심는 시퀀스가 있으면 1위 확정 증거.

**(iii) 기타:** 가드가 설치하는 sigframe를 **수정 없이 로깅만** 해서 3런 비교(상수 템플릿이면 동일). ASLR 상태 확인(`/proc/sys/kernel/randomize_va_space`) — 아래 권고 3 참조.

---

## 5. 우회 레버 — ART FaultManager 우선 vs 종료 차단

- **"ART FaultManager가 먼저 처리" 레버는 이 케이스에선 약하다.** far=0은 ART SOF 가드영역 `[sp-reserved, sp]` 밖이라 ART SOF 핸들러가 거부 → 그대로 크래시. 이 `ldr wzr,[x16]`는 등록된 implicit null-check 사이트도 아니라 NPE 변환도 안 됨. 핸들러 순서를 kernel에서 바꿔 ART로 넘겨도 이득 없음.
- **종료 차단(exit_group/kill/tgkill)은 더 현실적이나 지난 세션 kill 훅 혼입 교훈이 걸린다.** 무차별 차단은 가드가 재폴트/루프하거나 앱이 이미 반쯤 죽은 상태로 남을 수 있음. 쓰려면 **TID·시그니처 한정**으로 격리하고(전역 차단 금지), 차단 전후 상태를 계측해 혼입을 통제.
- **더 근본적 레버(설계된 폴트라는 전제 하):** 이 SIGSEGV는 "손상"이 아니라 가드가 **뭔가를 탐지한 결과의 결정론적 분기**일 공산이 크다. 그렇다면 폴트/종료를 막는 건 증상 치료다. 진짜 지렛대는 (a) 시그널 전달 경로(`get_signal`/`setup_rt_frame`)에서 이 TID+fault-pc에 한해 가드 핸들러 진입을 스킵하고 pc를 lr 또는 +4로 전진시켜 앱을 계속 진행시키거나, (b) 애초에 **가드가 탐지한 대상(ftrace/LKM/에뮬 지문)을 은폐**해 이 분기 자체를 안 타게 하는 것. frida·리패키징 불가 제약상 (b)의 은폐 + (a)의 시그널경로 우회가 exit 차단보다 부작용이 적다.

---

## 수정 권고 Top3

1. **전체 GPR 캡처를 먼저.** tracefs `$argN`(16 한계) 버리고 기존 LKM kprobe 핸들러에서 `task_pt_regs(current)`로 x0~x30·sp·pc·pstate 일괄 덤프. x0(ArtMethod*)·x17 하나로 "컨텍스트 복원" vs "오프-바이-4 엔트리포인트"가 즉시 갈린다. 정보량/노력비 최고.

2. **직전 syscall = rt_sigreturn 가설을 단일 결정 실험으로 돌려라.** `raw_syscalls` TID 필터 + do_mem_abort kprobe snapshot. rt_sigreturn이 선행하면 1위 확정 → `restore_sigframe`/`setup_rt_frame` 후킹으로 크래프트된 sigframe(pc/lr/x16) 실측하고, 정적 RE는 그 sigframe를 쓰는 컨텍스트-라이터(0x95224/acca4 인근)로 곧장 조준.

3. **프레이밍·전제 교정: "손상 사고"가 아니라 "설계된 결정론적 컨텍스트"로 취급하고 sp/x29 불변 해석을 바로잡아라.** 브리프 point 3의 "sp/x29 일치 = ASLR 없는 부트이미지 정합"은 과신 — 스택주소는 부트이미지에 없다. `randomize_va_space` 확인해서 ASLR이 켜져 있는데도 바이트 일치면 그건 **상수에서 복원된 합성 컨텍스트**의 강한 증거(=1위 확정 보강)다. 이 관점 전환이 핵심 진단 `lr=entry-4`(자연 복귀주소 아님)와 맞물려 전체 그림을 닫는다.
