# 토스 libea56 RASP — 10차 세션 보고서 (2026-09-22)

## 요약 (핵심 결과)

9차 인계의 최우선 목표였던 **"`[x19+0xab8]` 저장 LR이 정상값에서 `0xc`로 처음 덮이는
basic block"** 을 특정하고, **툼스톤 레지스터 실측 + run6 실행 트레이스**로 교차 확정했다.

- **자폭(poison) 블록: `0xacca4–0xaccc0`**
- **저장 LR 오염 명령: `0xaccb0  str x10, [x8]`** (x10=`0xc`, x8=`&saved_LR`=`x29+8`=`x19+0xab8`)
- **동반 오염: `0xaccb8  str x8, [x29]`** (x8=`0x24` → 저장 FP 슬롯)
- 이후 공유 epilogue `0x965e8`가 스택 카나리를 정상 통과한 뒤
  `ldp x29,x30,[sp,#0x50]`로 오염된 값을 복원 → `0x96618: ret` → `pc=0xc`.

9차에서 dynamic uprobe로 찾으려던 경계를, **정적 분석 + 기존 툼스톤만으로 결정론적으로
확정**했다(타깃을 건드리지 않음). 9차의 dynamic Task A는 이로써 의도가 충족됐고, Task B
(정적 disasm)도 완료했다.

## 도구 블로커 해소 (9차 실패 지점)

9차에서 `zsh: command not found: llvm-objdump`로 정적 disasm이 막혔다. 실제 위치:

- `/opt/homebrew/opt/llvm/bin/llvm-objdump` (Homebrew LLVM 23.1.1) — **사용**
- `/opt/homebrew/opt/llvm/bin/llvm-readelf` (relocation 조회)
- `xcrun --find llvm-objdump` → `/Library/Developer/CommandLineTools/usr/bin/llvm-objdump` (대체 가능)

ELF는 `elf64-littleaarch64`로 정상 파싱. **`.text`는 VA==파일오프셋**임을 실측 확인
(`insn@0x95224 == a9ba6ffc`, `insn@0xaccb0 == f900010a`(`str x10,[x8]`)).

libea56 SHA-256 = `c454eb404cf30a85c55e8182099230ad434285b6688e055bc75b5769f6203b89`
(9차와 동일 — 파일 불변).

## 확정된 자폭 메커니즘 (측정)

### 1. 핸들러 프레임 (0x95224) — 저장 LR 위치 재유도
```
95224 stp x28,x27,[sp,#-0x60]!   ; sp -= 0x60
...   저장 x26..x21
95238 stp x29,x30,[sp,#0x50]     ; 저장 x29/x30 = [orig_sp-0x10]/[orig_sp-0x8]
9523c add x29, sp, #0x50          ; x29 = orig_sp-0x10
95240 sub sp, sp, #0xa60          ; local frame
95244 mov x19, sp                 ; x19 = orig_sp-0xac0
9526c..95274  카나리: mrs TPIDR_EL0; ldr [x8,#0x28]; stur [x29,#-0x60]
```
- `x19 = orig_sp-0xac0`, 저장 LR = `[orig_sp-0x8]` → **저장 LR = `x19+0xab8` = `x29+8`**.
- 카나리 = `[x29-0x60]` = `x19+0xa50` (저장 LR보다 **낮은** 주소).

### 2. 자폭(poison) 블록 (canonical)
```
acca4 adrp x9, 0x175000
acca8 add  x9, x9, #0x310         ; x9 = 0x175310
accac mov  x10, #0xc              ; 12
accb0 str  x10, [x8]             ; *(&saved_LR) = 0xc      ← LR 오염
accb4 mov  x8,  #0x24             ; 36
accb8 str  x8,  [x29]            ; *(&saved_FP) = 0x24     ← FP 오염
accbc ldr  x8,  [x9, #0x2a8]     ; x8 = [0x1755b8] = 0x965e8  (reloc 확정)
accc0 br   x8                    ; → 공유 epilogue
```
- `[0x1755b8]`은 파일에서 0이며 **`R_AARCH64_RELATIVE` addend=`0x965e8`** (load 시 주입).
- x8은 이 블록에서 세팅되지 않고 **선행 블록에서 이미 `&saved_LR`(=x29+8)로 계산되어 상속**.
  런타임에 x8이 `&saved_LR`였음은 **툼스톤이 직접 증명**한다(아래).

### 3. 공유 epilogue (0x965e8) — 카나리 통과 + 오염 복원
```
965e8 mrs x8,TPIDR_EL0; ldr x8,[x8,#0x28]; ldur x9,[x29,#-0x60]; cmp; b.ne 0xafd78
965fc sub sp, x29, #0x50
96600 ldp x29,x30,[sp,#0x50]     ; x29←[x29]=0x24, x30←[x29+8]=0xc
...   ldp 나머지
96618 ret                        ; pc = x30 = 0xc
```
- **카나리는 `x19+0xa50`(저장 LR보다 낮음)** 이고 **손상되지 않음** → 이 자폭은
  일반 스택 스매시가 아니라 **저장 LR 슬롯만 노린 표적 store**임이 구조적으로 확정.

### 4. 툼스톤 교차 확정 (측정, run1_latest_tombstone.txt)
```
x29 0000000000000024   ← accb8 str 0x24,[x29] 예측과 일치
lr  000000000000000c   ← accb0 str 0xc,[x8=&saved_LR] 예측과 일치
pc  000000000000000c   sp 0000007ace8b6630
```
`str 0x24,[x29]`가 저장 x29 슬롯에, `str 0xc,[x8]`가 저장 LR 슬롯에 각각 적중했음을
레지스터 값이 그대로 증명한다. **→ x8 == &saved_LR == x19+0xab8 확정.**

### 5. run6 실행 트레이스 교차 확정 (측정, run6_indirect_trace.txt)
load base = `0x7b0fe40000`. 자폭 직전 실제 실행 경로(간접분기 프로브):
```
… ia0488→a021c (수천 회 루프) → ia0488→a4038 (1회 이탈)
i96744→97a2c → i97cf4→9e728 → ia7448→ac43c → iae0c8→a9644
iaccc0→965e8 → i96618→0xc
```

## 자폭 진입 제어흐름 (직접분기·트램폴린으로 확정)

```
0xae0c8  br  [0x1767d0]           ; reloc addend = 0xa9644  (확정)
0xa9644  b   0xaf394              ; 직접분기 (확정)
0xaf394  and/eor/add x29,#8       ; OLLVM opaque junk (죽은 계산)
0xaf3a0  b   0xacca4              ; 직접분기 → POISON (확정)
```
- 자폭 블록 `0xacca4`는 **점프테이블 슬롯 대상이 아님**(reloc addend에 `acca4` 없음) →
  `0xaf3a0`의 **직접 `b`**로만 진입.
- 즉 `0xa9644`에 도달하는 순간 자폭은 **무조건 확정**(이후 전부 무조건 분기).
  실제 판정은 `0xae0c8`보다 **상류**에서 상태변수로 결정되어 flattening으로 확산됨.

## 선행 모델 정정

- **§7(7차) "ctx+0x1c8 패널티 누적기 → memmove 음수 길이 자폭" 모델은 이번 부트의 자폭을
  설명하지 못한다.** 현재 자폭은 memmove가 아니라 **저장 LR 슬롯 표적 store(`0xaccb0`)**
  이며, 결과 시그니처가 `x29=0x24 / lr=pc=0xc`로 결정론적이다.
- 단 memmove 변형(§9-6, `+0xa00c0`)·직접 SEGV 변형(`+0x146370`)은 과거 부트에서 관측된
  **별개의 자폭 표현**일 수 있다. 세 변형 모두 "환경 나쁨" 판정 뒤의 서로 다른
  crash primitive로 보이며, 공통점은 **판정 결과가 자폭 분기로 라우팅**된다는 것.
- 9차의 `0x12c7bc = ELF section header 파싱`, `ctx+0x1c8 = .shstrtab 주소 슬롯` 정정은
  이번 분석과 모순 없음(그 슬롯은 누적기가 아님).

## 환경 판정 채널 (미확정 — 다음 과제)

핸들러 `0x95224`는 대규모 OLLVM-flattened 함수로, **환경 체크 배터리**를 돌린다(측정):

- **체크-디스패치 루프 `0xa021c..0xa0488`**: 2단 테이블 디스패치
  (`madd …#0x960` 외부 / `#0x8` 내부) → `blr x8`(서브체크 호출) → `cmp w0,#0`/누적,
  루프이탈 조건 `cmp x12,x11 @0xa047c`. run6에서 수천 회 반복 후 1회 이탈(`→a4038`).
- **체크 노드 링크드리스트 `0xa4038`**: `blr x9; str w0,[x20,#0x38]; ldr x20,[x20,#0x28];
  cmp x20,#0` — 노드마다 체크 호출 후 결과 저장하며 순회.
- 경로 블록 `97a2c/9e728/a7448/ac43c`는 **바이트 단위 문자열 복호 루프**
  (`ldrb`/`eor #0xc0|#0xf0`/`and #0xff`/`sxtb`-cmp) — libea56 "문자열 전량 암호화"와 일치.
  즉 비교 문자열을 즉석 복호 후 대조.
- 구체 비교 예: `ac46c ldr w10,[x28,#0x28]; ac470 cmp w10,#0x2; ac474 b.eq` (필드==2).

**결론**: 자폭을 선택하게 만든 최종 환경 판정은 이 체크 배터리 중 하나(또는 누적)이며,
OLLVM flattening으로 상태변수에 확산되어 있어 **정적 단독 특정은 비현실적**. 정적 분석은
"판정→자폭" 배선을 완전히 규명한 지점에서 자연스러운 한계에 도달했다.

## 다음 세션 권고 (env 채널 특정용 dynamic 차분)

1. **death vs survive 차분**: 재부팅 직후(6/7차의 다이얼로그/생존 윈도우)와 장기 부트의
   두 런에서 **서브체크 함수 포인터 시퀀스 + 반환값(w0)** 을 캡처해 차이나는 체크를 특정.
   - 좁은 probe: `0xa01fc`/`0xa04fc`(blr 직전 `x8`=체크 fn ptr) + `0xa0200`(`w0` 반환).
     플러드 방지를 위해 **버퍼 확대 + 짧은 캡처창** 또는 스냅샷 카운팅.
2. **poison 상류 상태변수 역추적**: `0xae0c8` 이전 트램폴린 체인을 좁은 probe로 한 단계씩
   (테이블 `[0x1767d0]` 계열) 역추적 — 어느 조건분기가 poison-테이블을 선택하는지.
3. **재부팅 직후 A/B(9차 미시행)**: 현재 uptime 5h38m(장기 부트, 사망 수렴). `adb emu kill`
   → `emulator -avd camo33 -no-snapshot` → 카모 스택 재적용 → 부팅 직후 N회 vs 장기 N회
   포그라운드(topResumedActivity+스크린샷+탭) 결과 비교로 uptime 의존성 확정.

## 동적 결과 (10차 라이브 — reboot A/B + dispatch-id 실측)

정적 확정 후, 사용자 지시로 **reboot A/B 차분**을 실행했다. 핵심 결과:

### D-1. 자폭 경로는 부트 불변 (reboot A/B)
- 장기 부트(uptime 5h38m)와 **재부팅 직후 부트** 양쪽에서 death trace를 캡처(각 ~22,590줄,
  toss9 709 broad probe). **자폭 경로가 완전히 동일**:
  `…ae0c8→a9644 → accc0→965e8 → 96618→target=0xc`. 재부팅 직후 death의 tombstone도
  `x29=0x24, lr=pc=0xc`.
- **→ "재부팅 직후엔 생존, 장기 부트는 사망"이라는 uptime 가설은 이 구성에서 성립하지 않음.**
  현재 스택에서 재부팅 직후 14회 런(untraced 8 + traced 6, pm clear 2회 포함) **전부 사망**
  (2~4s, 런처 복귀·스크린샷 1.36MB). 생존/제한 다이얼로그 런은 재현 안 됨.
- 생존 미재현의 유력 원인: **/vendor/lib64 bind 사본(phdr 채널)이 이번 부트에서 깨끗이
  복원되지 않음** — `vendor_bind_setup.sh mount`가 `BIND_OK`를 찍지만 `/proc/mounts`상
  `/vendor/lib64`가 여전히 `dm-33`(원본)뿐(사본 .vl64가 아님, 앱 네임스페이스에서도 동일).
  6/7차 생존 구성과의 차이는 이 채널로 추정. FINDINGS §8은 이 채널이 "단독 효과 없음"이라
  했으나 누적 판정에는 기여할 수 있음.

### D-2. 치명 체크 = **디스패치 id 4** (afed8 arg x0) — 결정론적, 부트 불변
- 핸들러 0x95224는 dispatcher `afed8(param)`(toss9 probe `afed8 arg=%x0`)에 의해 **런당
  48회** 호출된다(9차 실측과 동일). 두 death trace(장기·재부팅) **모두**:
  - **47× id 0, 마지막 1× id 4** → 그 직후 poison. (`b02c4` dispatch: handler=0x95224, a1=a2=0)
  - 9차 "마지막 호출 argument=4"를 **양 부트에서 재확인**.
- **→ 자폭을 트리거하는 것은 dispatch id 4의 체크**(47회의 id-0 폴링/루프 뒤 단 1회 실행되는
  구별되는 체크). 이것이 현재 자폭의 **최종 환경 판정 채널의 식별자**.

### D-3. id-4 정적 디코드는 OLLVM으로 불신 (caveat)
- Ghidra 단순화 형태 `(*(&UNK_1b019c + *(u16*)(&DAT_12c9c6+param*2)*4))()`로 계산한 id-0/id-4
  타깃(0x1ee33c / 0x1e5a98)은 **파일 끝(0x1866B0) 초과 → 무효**. 실제 afed8 디스패치는
  `neg`/magic-const(`0x4b28f47a` 계열)/`madd #0x960` 2D 테이블로 난독화되어 단순식이 안 맞음.
  id-4가 어떤 환경값을 보는지는 **수동 OLLVM 디코드 또는 동적 관측**이 필요.

### D-4. 환경 read 캡처 (getname/prop/uname/sysinfo — OLLVM 우회 관측)
death 런에서 가드의 **실제 환경 접근을 syscall 경계에서** 캡처(fork-aware, uid 10175 tid
필터; toss9 uprobe·전역 kprobe_events는 clear하지 않고 별도 `chan` 그룹 append). 결과:
- **가짜로 잘 위장된 채널(재확인)**: uname(2)=`5.15.94-android13-8-…-abS916NKSU1AWC2`
  (삼성 빌드태그, 285회 호출 모두 위장값). goldfish_pipe/address_space는 **RenderThread/
  HAL(pid 361)** 이 GL/gralloc 목적으로 여는 것(가드 아님, 앱 필수 — FINDINGS §5 재확인).
  /proc/cpuinfo(camow3가 8블록 내용 위장).
- **신규 관측 — qemu_* 프로퍼티 컨텍스트 잔존**: getprop 값 누수는 0인데
  `/dev/__properties__/`에 **`u:object_r:qemu_hw_prop:s0`, `qemu_sf_lcd_density_prop`,
  `vendor_qemu_adb_prop`, `vendor_qemu_prop` (4개)** 가 그대로 존재. resetprop은 프로퍼티
  **값**만 지우고 SELinux 라벨 **컨텍스트 영역**은 부팅 시 property_contexts에서 생성돼 남음.
- **단, 판정 확정은 아님(중요 caveat)**: 메인 toss 스레드는 `/dev/__properties__` 컨텍스트
  파일을 **274개(전체, aac_drc_prop~zygote_wrap_prop)** 열었다 → **`__system_property_foreach`
  전수 열거**(libea56가 이 심볼 임포트). qemu 컨텍스트는 "전수 열거에 딸려" 읽힌 것이지
  qemu만 노린 targeted probe가 아니다. 따라서 "qemu 컨텍스트 = id-4 트리거"는 **후보이되
  미확정**(전수 열거 중 qemu 라벨 컨텍스트의 존재가 신호일 수 있으나 getname만으로 단정 불가).
- marker(afed8/i96618) 상관: 이번 런은 set_event_pid가 가드 dispatch 스레드 생성을
  레이스로 놓쳐 marker 미발화 → poison 시점과의 정밀 상관은 미확보(다음 세션: 2-instance
  분리 — 마커는 toss9 무필터, getname은 별도 instance pid필터, 같은 clock로 offline 상관).

### D-5. 다음 세션 확정 로드맵 (env 채널 최종 특정)
0. **정정**: bind 사본(.vl64)은 **이미 정상 작동** — 앱/uid10175가 `/vendor/lib64/hw/`에서
   `mapper@3.0-impl-qti.so`(리네임)·`libGfxPerfCollector.so`를 봄(ranchu 아님). /proc/mounts의
   dm-33 2줄은 bind 성공(사본이 remount된 vendor fs 위). 9차 "bind 미작동" 판단은 오독이었음.
   **그럼에도 생존 미재현** → 생존은 bind로 게이팅되지 않음. 원인 미상(추가 채널 누적 추정).
1. **qemu 프로퍼티 컨텍스트 가설 검증(신규 최우선)**: `/dev/__properties__`의 qemu_* 컨텍스트
   4개를 가드 관점에서 **부재/비-qemu화**한 뒤 death→survive 전환 여부 테스트. 실현 경로:
   (a) LKM(hide_kmod)에 이 4개 컨텍스트 경로 access/stat→ENOENT + `/dev/__properties__`
   getdents 필터 추가(리빌드 필요) 또는 (b) property_contexts에서 qemu.* 매핑 제거 재컴파일
   (init 재빌드/부팅 선행). **주의**: 전수 열거에 딸린 read라 targeted 확증은 아님 → 검증으로만 판정.
2. **2-instance 타이밍 상관**: 마커(afed8/i96618)는 toss9(무필터, uprobe=toss전용)에서,
   getname/prop는 별도 instance(pid필터+event-fork)에서 동시 캡처 → 같은 clock로 poison 직전
   가드 read를 offline 상관(전수 열거 종료→poison 사이 gap 여부 확인).
3. **생존 재현**: 6/7차 생존 조건 재탐색(현 스택은 14/14 death). pm clear·부팅 초기창·
   추가 채널(GL EXT·소켓 핑·타이밍) 점검. 생존 확보 시 death↔survive 차분이 gold standard.
4. **afed8(4) 수동 OLLVM 디코드**: aff08~aff7c 난독 디스패치(neg/magic/`madd #0x960`)를 손으로
   풀어 id-4 타깃 블록 확정 → 비교 입력 특정.

## 동적 결과 2 (10차 후반 — env 채널 소거 + MIDR 발견 + 방법론)

id-4 자폭의 실제 판정 입력을 찾기 위해 syscall-경계 관측(getname/prop/uname) + 표적
spoof(bind-mount) 테스트를 수행. **결정론적 사망(id-4, 2s, 부트 불변)** 을 두고 후보를
하나씩 소거:

| 후보 | 관측/테스트 | 결론 |
|---|---|---|
| qemu 프롭 컨텍스트(/dev/__properties__/*qemu*) | uid10175에서 4개 전부 **ENOENT**(LKM deny 이미 작동); getname은 rewrite 전 open 시도를 로깅해 "읽는 것처럼" 보였을 뿐 | **이미 차단됨 — 채널 아님** |
| uname vs /proc/sys/kernel/osrelease 불일치 | uname(2)=abS916N(위장), osrelease=real GKI(미위장) **불일치 존재**하나 가드는 osrelease/`/proc/version`을 **안 읽음**(uname(2) 285회만) | **무관** |
| 프로세스 목록 goldfish 데몬(qemu-props/libgoldfish-rild/gnss-ranchu/irq46-goldfish) | `su 10175`은 322개 봄 = **su의 readproc(gid3009) 아티팩트**; 실앱은 readproc 없음(systemui 확인)+`hidepid=invisible` → 자기 프로세스만 봄 | **hidepid로 차단 — 노출 안 됨** |
| SELinux permissive(enforce=0) | 가드가 `/sys/fs/selinux/enforce`(+context, libselinux×11) 읽음, 값=0. enforce=1로 bind spoof(앱ns 전파 확인) → **여전히 사망** | 단독 채널 아님 |
| **MIDR_EL1 = Apple(0x61)** | 가드가 `/sys/.../cpuN/regs/identification/midr_el1` 전 코어 읽음. 실제값 **0x610f0000 = implementer 0x61(Apple M1 호스트), part 0**. camow3 가짜 cpuinfo는 **ARM(0x41) Snapdragon(0xd4e/d4d/d46)** 주장 → **미위장 불일치**(Android 폰에 Apple CPU 없음). ARM으로 bind spoof(앱ns 전파 확인) → **여전히 사망** | **실재 gap(중요)**, 단독 채널 아님 |

- **방법론 확정**: adb shell 네임스페이스의 bind-mount가 **토스 zygote 네임스페이스로 전파됨**
  (`/proc/<tosspid>/root/...`로 앱이 fake midr/qti mapper 봄 실측) → bind spoof 테스트는 유효.
- **MIDR + enforce 동시 spoof** → 여전히 사망. → **단일 surface-value가 트리거가 아님**.
- **결론**: id-4 판정은 **누적(여러 surface 동시 필요)** 이거나 **비-값 채널**
  (behavioral/timing/in-process GL, 또는 **LKM redirect 자체 탐지** — 가드가 redirect된
  /proc/cpuinfo fd를 fstat해 st_dev/st_ino가 procfs가 아님을 보고 tamper 판정하는 catch-22).
  7차(survive)→8차(항상 death) 회귀 + spoof 내성이 redirect-tamper 가설과 정합.

### 다음 세션 로드맵(갱신)
1. **redirect-tamper 가설 검증(최우선)**: 가드가 redirect 대상(cpuinfo/version)에 fstat/statx
   하는지 확인(kprobe on newfstatat + fd→path). st_dev/st_ino 교차검증이면 /dev-clone redirect가
   근본 탐지원 → redirect 방식을 inode/dev 보존형(overlay/동일-fs)으로 재설계 필요.
2. **MIDR/enforce 정식 수정(값 gap 해소)**: LKM getname redirect에 `/sys/.../midr_el1`(→ARM),
   `/sys/fs/selinux/enforce`(→1) 추가(네임스페이스 무관). 단독으론 불충분 실측이나 누적 후보라 필요.
3. **누적 surface 감사 계속**: 가드가 읽는 나머지 미위장 병렬 surface(/proc/self/maps 내용,
   cgroup, cpu online/present 등) 전수 점검.
4. **survive 재현**(gold standard differential) / **in-process GL·timing** 관측(ftrace 밖 도구).

## 산출물 (session10/)

- `disasm_a021c.txt` `disasm_a0488.txt` — 체크-디스패치 루프
- `disasm_96744.txt` `disasm_97a2c.txt` `disasm_97cf4.txt` `disasm_9e728.txt`
  `disasm_a7448.txt` `disasm_ac43c.txt` — 경로상 문자열 복호 블록
- `disasm_ae0c8.txt` `disasm_a9644.txt` `disasm_af394.txt` `disasm_a4038.txt` — 자폭 진입 트램폴린
- `disasm_accc0.txt`(=poison 블록) `disasm_965e8.txt` `disasm_96618.txt`(epilogue/ret)
- `death1.trace`(장기부트 death, 22599줄) `fbdeath1.trace`(재부팅 death, 22580줄) — toss9 broad
- `chan1.trace`(getname/prop/uname/sysinfo death 캡처 — env read 관측, 8882줄)
- `toss9_uprobe_events.saved`(709 probe 정의 — 재부팅 후 replay용)
- 본 `REPORT.md`

## Provenance

- libea56.so SHA-256 `c454eb40…6203b89`, `elf64-littleaarch64`, .text VA==offset.
- 정적: llvm-objdump/llvm-readelf (Homebrew LLVM 23.1.1). reloc는 `R_AARCH64_RELATIVE`.
- 동적 증거: 9차 `run6_indirect_trace.txt`(load base 0x7b0fe40000), `run1_latest_tombstone.txt`.
- 이번 세션 dynamic 미실행(타깃 무변경). 에뮬 상태만 read-only 조회
  (adb root, toss 설치경로 확인, 포그라운드=런처, uptime 5h38m, toss9 그룹 709 probe 등록·비활성).
- 설치 경로는 매회 `pm path viva.republica.toss`로 검증(현재:
  `/data/app/~~qnX020rutPP5JISz5QxWSg==/viva.republica.toss-B3Vz3QU5iqSLautZvD9sRw==/…/lib/arm64/libea56.so`).
