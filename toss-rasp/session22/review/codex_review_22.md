## 총평

22차의 핵심 관측값은 유효하지만, 해석은 크게 수정해야 합니다.

- `[1] 완전 크래프트 점프` 가설은 현재 바이트열과 레지스터만으로 자연스럽게 반증됩니다.
- `[3] libart 인터프리터 콜드패스 복귀`는 RX 매핑의 `pgoff=0x200000`을 누락한 심볼화 오류입니다.
- 실제 시퀀스는 높은 확률로 다음입니다.

```text
ContextWrapper.isRestricted()의 mBase 필드가 null
→ 컴파일 코드의 정상적인 implicit null check에서 SIGSEGV
→ ART NullPointerHandler가 ucontext를 표준 NPE 트램펄린으로 변경
→ Java NullPointerException 전달/처리
→ 이후 앱/보안 로직의 수집 및 System.exit(0)
```

따라서 “SIGSEGV가 의도적인 가드 트리거인지”는 아직 열려 있지만, 크래프트 점프·오염 인터프리터 실행은 기각하는 편이 맞습니다.

## 1. `[1]` 단계: 자연스러운 ART 경로가 정확히 존재함

매핑은 다음과 같습니다.

```text
runtime PC       = 0x715ba534
RX start         = 0x7141d000
RX map pgoff     = 0x001a8000

file/VMA offset  = 0x715ba534 - 0x7141d000 + 0x1a8000
                 = 0x345534
```

근거는 [maps_151203_21323.txt:42](/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/session22/maps_151203_21323.txt:42)입니다.

`0x345530`은 메서드 엔트리가 아닙니다. 실제 메서드 시작은 `0x345500`이며 실행열은 다음과 같습니다.

```asm
345500  sub x16, sp, #0x2000
345504  ldr wzr, [x16]              ; stack overflow probe
345508  str x0, [sp, #-0x30]!
34550c  str x22, [sp, #0x18]
345510  stp x23, x30, [sp, #0x20]  ; 실제 caller LR 저장
...
345520  adr x30, 0x34552c
345524  cbnz x20, 0x2cca50          ; read-barrier thunk
345528  ldr w22, [x1, #8]           ; this->mBase
34552c  mov x23, x1                 ; 원래 this 보존
345530  mov x1, x22                 ; x1 = mBase
345534  ldr w0, [x1]                ; mBase==null이면 far=0
```

즉 관측값은 모두 정상 코드 생성으로 설명됩니다.

- `x1=0`: `ldr w22,[x1,#8]`에서 읽은 `mBase`가 0이고, 이어지는 `mov x1,x22` 결과입니다.
- `x22=0`: 실제 전체 GPR에도 그대로 나타납니다.
- `x23!=0`: 원래 `ContextWrapper this`입니다. [forensics_boot1506_full.log:30849](/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/session22/forensics_boot1506_full.log:30849)
- `x0=ArtMethod*`: ART quick ABI의 메서드 포인터이며, 프롤로그가 `[sp]`에 저장합니다.
- `x4~x6="$Theme;"`: 이 짧은 메서드가 건드리지 않은 caller-saved 잔존값입니다. “가드가 문맥을 의도적으로 보존했다”는 증거가 아닙니다.
- `lr=pc-8`: `adr x30,0x34552c` 때문입니다. 진짜 caller LR은 이미 `[sp+0x28]`에 저장되어 있어, ART 컴파일 코드가 x30을 read-barrier 링크 레지스터로 재사용합니다.

AOSP의 `ContextWrapper.isRestricted()`도 단순히 `return mBase.isRestricted()`입니다. [AOSP ContextWrapper](https://android.googlesource.com/platform/frameworks/base/%2B/77ab6a8/core/java/android/content/ContextWrapper.java)

LR의 ±4 변동 역시 read-barrier thunk로 정확히 설명됩니다.

```asm
2cca50  cbz  w1, 0x2cca5c
2cca54  ldr  w16, [x1,#4]
2cca58  tbnz w16,#28,0x2cca68
2cca5c  sub  x30,x30,#4
2cca60  add  x1,x1,x16,lsr#32
2cca64  br   x30
```

런 #6은 `x20=1, x16=0x20000000, lr=0x...a528`, 나머지 fast path는 `x20=0, lr=0x...a52c`입니다. [nrun1.log:104](/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/session22/nrun1.log:104)

결론적으로 `[1]`은 “PC만 +4로 만든 점프”가 아니라, `ContextWrapper.isRestricted()`를 엔트리부터 정상 실행한 결과입니다. 다만 가드가 상위 로직에서 고의로 `mBase=null`인 wrapper를 만들거나 호출했을 가능성까지는 이 분석으로 배제되지 않습니다.

## 2. `[3]`은 ART의 표준 ucontext 변경이 맞지만, 가드 핸들러가 아님

`libart` 매핑에는 중요한 오프셋이 있습니다.

```text
70c6c00000-70c7195000 r-xp 00200000 ... libart.so
SFO PC = 0x70c6e57920

ELF VMA = 0x70c6e57920 - 0x70c6c00000 + 0x200000
        = 0x457920
```

근거는 [maps_151203_21323.txt:1273](/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/session22/maps_151203_21323.txt:1273)입니다. 기존의 `libart+0x257920`은 단순 매핑 내 상대주소이고, ELF 심볼 주소가 아닙니다.

`0x457920`의 실제 심볼은 다음입니다.

```text
art_quick_throw_null_pointer_exception_from_signal
```

그리고 로컬 `libart.so`의 `art::NullPointerHandler::Action`은 정확히 다음 동작을 합니다.

```text
return_pc = fault_pc + 4
[fault_sp - 8] = return_pc
ucontext.sp = fault_sp - 8
ucontext.x30 = si_addr
ucontext.pc = art_quick_throw_null_pointer_exception_from_signal
```

따라서 `si_addr=0`일 때 SFO가 관측한 값과 완전히 일치합니다.

```text
pc = libart ELF 0x457920
sp = fault_sp - 8
lr = 0
x0, x16 등 나머지 GPR = 원래 값 유지
```

이는 AOSP 구현 그대로입니다. [ART ARM64 NullPointerHandler](https://android.googlesource.com/platform/art/%2B/master/runtime/arch/arm64/fault_handler_arm64.cc), [ARM64 NPE quick entrypoint](https://android.googlesource.com/platform/art/%2B/c79c1912043294f088ec838c12d6d3f2d5b64aa0/runtime/arch/arm64/quick_entrypoints_arm64.S)

따라서:

- “SA_SIGINFO 처리 중 ucontext가 수정됐다”는 추상적 해석은 맞습니다.
- 하지만 수정 주체는 토스 가드나 Bugsnag가 아니라 ART `FaultManager → NullPointerHandler::Action`입니다.
- 커널에 등록된 실제 `sa_handler`는 libsigchain 디스패처일 가능성이 높고, 그 내부 special handler chain에서 ART가 ucontext를 바꿉니다.
- 앱 PID에서 `do_sigaction`이 0건인 것도 모순이 아닙니다. ART/libsigchain 핸들러는 zygote에서 등록되어 fork로 상속될 수 있습니다.

다른 스레드 SFO 가능성은 낮습니다. `current->pid`는 Linux TID이고 main fault의 SFI/SFO TID가 동일합니다. 다른 시그널의 중첩 프레임이라는 이론적 가능성은 남지만, `pc=정확한 NPE stub`, `sp-8`, `lr=si_addr`라는 3중 일치는 ART 코드의 지문입니다. 중첩 SIGSEGV였다면 추가 SFI11도 기대됩니다.

## 3. “인터프리터 콜드패스에서 오염 실행”은 성립하지 않음

`0x457920`의 코드는 인터프리터가 아니라 레지스터를 저장하고 다음 함수를 호출하는 NPE 전용 트램펄린입니다.

```asm
457920  sub sp,sp,#0x1f8
         ... 모든 주요 레지스터 저장 ...
4579b8  mov x0,x30                  ; fault address
4579bc  mov x1,x19                  ; Thread*
4579c0  bl  artThrowNullPointerExceptionFromSignal
4579c4  brk #0                      ; 정상 exception delivery라면 도달하지 않음
```

따라서 이후 추가 native fault 없이 실행이 이어지는 것이 정상입니다. C++ helper가 Java NPE를 생성하고 catch 지점으로 unwind/long-jump하기 때문입니다.

또한 kill9 로그도 main 프로세스의 셀프킬로 읽으면 안 됩니다. 예를 들어 첫 런에서:

```text
main PID        4037
kill9 PID/target 10403→10403, 10405→10405
System.exit(0)  PID 4037
```

즉 kill9는 fork된 수집/helper 자식들의 자기 종료로 보이며, main은 약 12초 뒤 별도로 `System.exit(0)`합니다. [forensics_boot1506_full.log:26359](/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/session22/forensics_boot1506_full.log:26359)

현재 확정 가능한 인과선은 다음 정도입니다.

```text
mBase null → 표준 ART NPE 변환 → 이후 수집/helper 활동 → main System.exit(0)
```

아직 확정되지 않은 것은:

- 누가 `mBase=null` 상태를 만들었는가.
- NPE가 의도적인 RASP 제어 흐름인지, UI 초기화 버그/특수 lifecycle 경로인지.
- NPE가 어디에서 catch되었는지 또는 custom UEH가 받았는지.
- NPE와 12초 뒤 `System.exit(0)` 사이가 직접 인과인지.

`RxCachedThreadS`의 `libea56+0x69b38` fault는 별도 트랙으로 분리해야 합니다. 이쪽이 오히려 셀프스캔/RASP와 직접 연결됐을 가능성이 큽니다.

## 4. SFI/SFO 관측 설계 평가

SFI의 `kregs->regs[3]` 해석은 맞습니다. ARM64 ABI에서 `setup_rt_frame(usig, ksig, set, regs)`의 네 번째 인자가 x3이며, 실제 faultdump와 레지스터가 일치하는 것도 경험적 검증입니다. [hide_kmod.c:467](/Users/1004276/Downloads/AppSuit/avd-camouflage/lkm/hide_kmod.c:467)

다만 다음은 수정할 필요가 있습니다.

- v4.15b의 `handler=0x4000c09`는 `struct ksignal` 오프셋 오류로 생긴 쓰레기값입니다. session22 값으로는 핸들러 resolve를 할 수 없습니다.
- 매직 오프셋 대신 `regs_get_kernel_argument()`와 실제 `struct ksignal` 필드를 사용하는 편이 안전합니다.
- `sa_flags`, `tgid`, `tid`, task start cookie도 같이 기록해야 합니다.

SFO의 `task_pt_regs(current)`도 해당 `rt_sigreturn`을 수행하는 동일 TID의 syscall 레지스터를 봅니다. 다른 스레드의 레지스터가 섞이는 구조는 아닙니다. 커널은 GPR을 `pt_regs`에 복사한 뒤 `parse_user_sigframe()`을 호출합니다. [signal.c:491](/Users/1004276/Downloads/AppSuit/ack-kernel/arch/arm64/kernel/signal.c:491)

단, 현재 SFO는 “복원 후보 GPR이 복사되었다”까지만 증명합니다. 이후 FPSIMD/확장 컨텍스트 파싱이 실패하면 `rt_sigreturn` 전체는 실패할 수 있습니다. 다음 중 하나를 추가하면 완결됩니다.

- `restore_sigframe()` kretprobe로 반환값 기록
- `libart+0x457920` uprobe로 실제 진입 확인
- 모든 `setup_rt_frame`을 짧게 기록하고 per-TID signal-frame stack으로 SFO와 결합

또한 `pr_info`로 전체 GPR을 여러 줄 출력하기 때문에 faultdump→SFI의 수십 ms는 사용자 핸들러 실행시간으로 해석하면 안 됩니다. compact binary/ring-buffer 레코드가 적합합니다. `nrun1.log`도 `tail -20` 슬라이딩 수집으로 이전 런이 중복되어 있으므로 “5런 완전 동일” 표현은 완화해야 합니다.

추가로 주소 resolver 자체가 매핑 `pgoff`를 버립니다. [toss_fault_resolve.sh:41](/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/session22/toss_fault_resolve.sh:41)의 `addr-start`는 표시용 map-relative offset일 뿐 ELF 심볼 주소가 아닙니다. PT_LOAD와 map offset을 반영하도록 고쳐야 합니다.

Frida handler 스크립트에도 독립적인 관측 오류가 있습니다. [handler_probe.js:32](/Users/1004276/Downloads/AppSuit/avd-camouflage/analysis/toss-rasp/session22/frida/handler_probe.js:32)의 `uc_mcontext=uc+0x28`은 ARM64에서 틀립니다. 이 바이너리에서는 ART disassembly가 다음을 확정합니다.

```text
uc_mcontext ≈ uc + 0xb0
LR = uc + 0x1a8
SP = uc + 0x1b0
PC = uc + 0x1b8
x16 = uc + 0x138
```

Bionic 구조에도 sigmask 뒤 128바이트 정렬 패딩이 있습니다. [Bionic ucontext 정의](https://android.googlesource.com/platform/bionic/%2B/492a0bf212973baa1c33d584d57e75395774447f/libc/include/sys/ucontext.h)

현재 Frida 콜백이 실제 발화하지 않았으므로 22차 결론을 오염시키지는 않았지만, attach 실험 전에 반드시 바로잡아야 합니다.

## 5. 다음 실험 우선순위

제시한 `(a)~(d)`보다 먼저 해야 할 관측이 있습니다.

1. **P0: 주소 해석기 수정 및 §25 결론 재분류**

   모든 ELF 주소를 `map pgoff/PT_LOAD` 기준으로 다시 심볼화해야 합니다. 현재 상태에서 `[1] 크래프트 점프`, `[3] 인터프리터 복귀`, `main kill9`는 FINDINGS에서 기각/보류 표시가 필요합니다.

2. **P1: OAT 진입·fault 두 점 uprobe**

   `ContextWrapper.isRestricted()`의 실제 엔트리 `0x345500`에서 `x0/x1/x30`, fault 직전 `0x345534`에서 `x1/x22/x23/x20/x16/x30`을 같은 TID로 수집하십시오. 저장된 진짜 caller LR은 fault SP 기준 `[sp+0x28]`입니다.

   이것이 “누가 null-base ContextWrapper를 호출했는가”를 가장 빨리 좁힙니다.

3. **P2: ART NPE 경로 직접 확인**

   `NullPointerHandler::Action`, `libart+0x457920`, `artThrowNullPointerExceptionFromSignal`에 uprobe를 두십시오. 가능하면 catch 탐색/exception delivery까지 추적해 NPE가 어디에서 처리되는지 확인해야 합니다. “ucontext 라이터 RE 좌표”는 이미 `NullPointerHandler::Action`으로 특정됐습니다.

그 뒤 `(a)~(d)` 순서는 다음을 권합니다.

- **(a) 1회성 sanity check**: v4.15c로 올바른 handler와 `sa_flags`를 확인하십시오. 다만 libsigchain 주소가 나올 가능성이 높아, 이것을 가드 writer 좌표로 해석해서는 안 됩니다.
- **(b) 백그라운드/포그라운드 A/B**: 다음 우선순위입니다. `topResumed` 외에 `/proc/pid/stat` CPU tick 변화, process state, cgroup freezer, `oom_score_adj`, isRestricted uprobe hit 수를 함께 기록해야 합니다. “2분 생존”이 단순 freeze였는지 분리할 수 있습니다.
- **(d) 초기화 후 attach**: 그다음입니다. 생존·비동결 상태에서 attach하고, foreground 전환 전후 마커를 나누십시오. 현 결과는 “토스에서 지연 콜백이 실행되지 않았다”는 것은 강하지만, 가드가 Frida를 적극 무력화했다는 메커니즘까지 확정하지는 못합니다.
- **(c) 좁은 syscall 추적**: main NPE 규명에는 가장 후순위입니다. `mprotect/process_vm_readv/prctl`은 `mBase=null` 필드 로드 자체를 설명하지 못합니다. 대신 `RxCachedThreadS/libea56` 스캐너 트랙에서는 우선순위를 올릴 수 있습니다.

최종적으로 22차가 확정한 것은 “가드의 크래프트 처형 시퀀스”가 아니라, **표준 ART implicit-null-check/NPE 변환 뒤에 토스의 수집 및 명시적 종료가 이어진다**는 사실입니다. 다음 결정점은 SIGSEGV 자체가 아니라 `isRestricted()`의 caller와 NPE catch/UEH 경로입니다.
