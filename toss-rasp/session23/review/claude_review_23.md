# 23차 세션 외부검토 (claude) — NPE 위장 종료 + Timer-0 커널 패닉

검토자: claude (opus 4.8, 1M) · 2026-09-22
검증 원본: /tmp/emu_kernel.log(패닉 콘솔 전문), FINDINGS.md §24~28, session22/nrun1.log,
session23/NOTES. 아래 인용은 전부 원본 라인 실측.

---

## 0. 헤드라인 판정 (가장 중요) ★★★

**결론 B("재부팅 = 가드 Timer-0의 안티 포렌식 커널 패닉")는 뒤집어야 한다.**
같은 부트의 커널 콘솔이 **재부팅의 대다수가 우리 자신의 LKM(hide_kmod) kprobe가 낸
커널 패닉**임을 직접 증명한다. /tmp/emu_kernel.log의 배너(재부팅) 7개 직전을 전수 확인한 결과:

| 배너 라인 | 직전 사건 | 정체 |
|---|---|---|
| 2205 (t=306) | `Kernel panic: BRK handler: Fatal exception`, 트레이스 `rsig_pre+0x120 [hide_kmod]` | **hide_kmod kprobe 패닉** |
| 4403 (t=254) | `Kernel panic: BRK handler: Fatal exception` | **hide_kmod kprobe 패닉(동일)** |
| 6425 (t=287) | `Kernel panic: BRK handler: Fatal exception` | **hide_kmod kprobe 패닉(동일)** |
| 9824 | `reboot: Restarting system with command 'shell'` | adb/shell 정상 재부팅 |
| 17732 | `reboot ISSUED(non-target) ... arg0=0xfee1dead ...` → 'shell' | reboot() syscall 정상(init) |
| 20830 | 동일 'shell' 정상 재부팅 | 정상 |
| 24196 | `Kernel panic: Oops: Fatal exception` (Timer-0 IABT) | **본건(§28)** |

즉 관측된 재부팅 중 **3건이 hide_kmod 확정 패닉, 3건이 우리가 발행한 정상 재부팅**,
그리고 나머지 1건이 §28의 Timer-0 IABT다. §28은 "가드가 재부팅으로 증거를 파기한다"는
서사를 세웠지만, 콘솔은 오히려 **재부팅 불안정의 지배적 원인이 우리 계측 자신**임을
보여준다. 첫 3건의 BRK 패닉 트레이스(라인 2178~2199)를 그대로 옮기면:

```
Call trace:
 rsig_pre+0x120/0x1c4 [hide_kmod]        ← 우리 LKM의 rt_sigreturn kprobe 프리핸들러
 kprobe_breakpoint_handler+0x130/0x1f4
 brk_handler+0xac/0x1b0
 do_debug_exception+0xb8/0x1bc
 el1_dbg+0x5c/0x78
 el1h_64_sync_handler+0x44/0xa0
 el1h_64_sync+0x7c/0x80
 __arm64_sys_rt_sigreturn+0x0/0x184      ← 프로브 지점: 시그널 복귀 경로
 el0_svc_common ... el0t_64_sync
Code: b94ad288 51000508 b90ad288 b5fffa00 (d4200020)   ← 폴트 명령 d4200020 = BRK #1
```

`d4200020`은 **kprobe가 심는 소프트웨어 브레이크포인트(BRK #1)** 그 자체다. 이 3건은
"우리의 rt_sigreturn kprobe(rsig_pre = SFI11/SFO 시그프레임 캡처 계열)가 BRK 재진입/
핸들러 폴트를 일으켜 커널을 패닉시켰다"로 100% 특정된다. 이건 추정이 아니라 콘솔 실측이다.

이 사실이 §28 전체의 해석 프레임을 바꾼다. 아래 각 질문에 반영한다.

---

## 1. Timer-0 IABT의 기술적 경로 + pc 주소 형태 해석 (Q1)

### 1-1. 주소 형태에서 읽을 수 있는 것 — "쓰레기"가 아니라 CFI poison 시그니처

핵심 관찰(원본 라인 24172~24173):
```
pc : 0xbfffffc008007370
lr : 0xffffffc008007370
```
두 값은 **bit 62 하나만 다르다**(0xf=1111 vs 0xb=1011, 상위 니블의 0x4 비트). 그리고
VA_BITS=39(콘솔 "39-bit VAs")이므로 변환에 쓰이는 하위 39비트는 둘 다 `0x8007370`로
**완전 동일**하다. 이것이 페이지워크가 pgd/pud/pmd까지 정상적으로 걸어 내려가다 pte=0에서
멈춘 이유다(라인 24166). 즉:

- pc는 **무작위 쓰레기 포인터가 아니다.** 유효한 커널 주소(lr=0xffffffc008007370)에서
  **상위 1비트(bit 62)만 XOR된 값**이다.
- "유효 커널 주소 ⊕ 0x4000_0000_0000_0000" 형태는 **ARM64 제어흐름 무결성(CFI)
  메커니즘의 poison 시그니처**다. 구체적으로 pac-ret(포인터 인증 복귀)의 authenticate
  실패 시 오류코드가 상위비트에 XOR되면 정확히 이런 "정상 주소에서 상위 한 비트가 뒤집힌"
  주소가 나오고, 그 값을 fetch하려다 IABT(current EL) → oops가 난다.
- 방증: x18=0xffffffc00d85b000 (라인 24179)은 **커널 Shadow Call Stack 포인터**(Android
  GKI가 x18을 SCS 전용으로 예약). x8==x9==0x549fb39072a98000 (라인 24182~24183)은
  주소가 아닌 고엔트로피 값 2개가 같은 레지스터쌍에 있음 — canary 또는 PAC 서명 포인터
  후보. 즉 **이 커널은 반환주소 무결성 보호(SCS/PAC)가 켜져 있다.**

**따라서 pc 형태가 말하는 것은 명확하다: 이건 "커널 내부 반환주소/함수포인터가
손상되어 CFI가 걸러낸(또는 손상된 채 fetch된) 사건"이다.** 유저랜드 앱이 임의로 만들어
"커널에 호출시킨" 포인터의 모습이 아니다(그런 값이라면 하위 39비트가 lr과 일치할 이유가
없다).

주의(정직한 한계): SCS와 pac-ret는 커널 반환 보호를 보통 택일한다. x18=SCS가 확인되므로
poison의 정확한 발생 기전(pac-ret인지, SCS 손상인지, 단일비트 오류인지)은 **lr을
심볼화하기 전엔 단정 불가**다. 그러나 셋 중 무엇이든 결론은 같다: **커널 내부 CFI/반환주소
손상**이지, 유저 크래프트 포인터가 아니다.

### 1-2. 현실적 발화 경로 — 브리프가 제시한 후보 평가

- **timer_create/SIGEV 콜백 오염**: ✗. `SIGEV_THREAD` 콜백은 **유저랜드(bionic이 만든
  스레드)에서** 실행된다. 커널은 유저 함수포인터를 호출하지 않는다. `SIGEV_SIGNAL`은
  시그널만 전달. 그러므로 timer 콜백이 커널 IABT의 원인이 될 수 없다.
- **syscall 인자의 함수포인터를 커널이 호출**: ✗ (정상 커널에서). 이건 커널 취약점을
  요구한다. 로드된 모듈 목록(라인 24168)은 전부 표준 goldfish/virtio + **우리 hide_kmod(OE)**
  뿐이다. "우리가 못 본 driver 인터페이스"의 유일한 후보 역시 hide_kmod 자신이다.
- **가장 현실적인 경로 = hide_kmod kprobe가 커널 반환경로를 교란**: ✓✓. 위 §0에서 같은
  부트가 rt_sigreturn kprobe로 3번 패닉했음을 증명했다. kprobe(특히 XOL 단일스텝/
  트램펄린)는 pac-ret·SCS 함수의 반환주소 처리와 충돌해 반환 시점에 poison된 pc를
  만들 수 있다. Timer-0 IABT는 트레이스가 비어(`bad PC value`) 직접 귀속은 못 하지만,
  **BRK 패닉 3건이 "hide_kmod가 이 커널을 반환경로에서 패닉시킬 수 있다"를 실증**했고,
  poison 시그니처가 반환주소 손상과 정합한다.

**정리(Q1 답):** Timer-0 IABT의 가장 개연적 경로는 **가드가 아니라 hide_kmod의
kprobe(특히 시그널/시그프레임 계열)가 커널 반환경로를 손상시킨 계측 부작용**이다.
pc의 bit-62-flip은 이 해석(CFI poison/반환주소 손상)을 직접 지지한다.

---

## 2. 의도성 대 우연 — "안티 포렌식 설계"의 반례 (Q2)

### 2-1. 반례 1 (치명적): Timer-0/PID 1340은 토스 스레드라는 근거가 없다

§28은 "Comm:Timer-0 ← 토스 가드 타이머 스레드"라 단정했으나, 같은 로그가 반증한다.
**PID 1340은 부팅 t=18.75s에 이미 존재**하며 SELinux restorecon을 수행 중이었다(라인 19489):
```
[18.753][T1340] selinux: Skipping restorecon on directory(/data/misc_ce/0)
```
`/data/misc_ce/0` restorecon은 user-0 CE 스토리지 언락 단계의 **시스템(uid system) 작업**
(T1336=/data/system_ce/0, T1339=/data/vendor_ce/0과 연속 TID = 시스템 스레드풀)이다.
반면 토스는 **t=39~48s에야 기동**한다(라인 2008 이후 avc denied `viva.republica.toss`,
t=40s libviva 로드). 즉 **PID 1340은 토스 실행 이전부터 살아있던 시스템 프로세스 스레드**
(system_server/vold/installd 계열)로 보이며, "Timer-0"는 `java.util.Timer`의 기본
스레드명(어느 프로세스에나 흔함)이다. TID 재사용 가능성(26분간 getprop/app_process64
대량 스폰으로 pid_max 랩어라운드)을 배제할 수는 없으나, **어느 쪽이든 "가드 Timer-0"는
미검증 단정**이며, 유일한 실측 데이터점(부팅기 시스템 restorecon)은 토스가 아니라
시스템 프로세스를 가리킨다.

### 2-2. 반례 2: 유저랜드 앱은 특정 커널 IABT를 결정론적으로 못 만든다

"안티 포렌식으로 판정 후 커널을 패닉시킨다"는 **가드가 커널 코드실행/메모리손상
프리미티브(권한상승 익스플로잇)를 보유**함을 함의한다. 그 증거는 어디에도 없다.
IABT(current EL)는 커널이 이미 EL1에서 잘못된 곳을 fetch했다는 뜻이고, 유저랜드는
정상 syscall로 이걸 온디맨드로 만들 수 없다. 커널을 손상시킬 능력이 실증된 유일한
주체는 — 다시 — **우리 hide_kmod**다.

### 2-3. 반례 3: "정상 기기 비발동"은 가드가 아니라 우리 LKM으로 설명된다

§28은 "정상 기기에선 비발동(조건부)"을 가드 지능의 증거로 들지만, 정상 기기와 이
환경의 결정적 차이는 **hide_kmod의 유무**다. 같은 로그가 hide_kmod의 kprobe 패닉을
3번 보여준 이상, "정상 기기 비발동"은 **가드 조건부 로직이 아니라 우리 계측 부재**로
더 간명하게 설명된다. 이건 가드 가설을 지지하는 게 아니라 **반증**한다.

### 2-4. x19=0x4000c00과 22차 "handler=0x4000c09"의 정체 — 가드 포인터 아님

session22/nrun1.log 원본을 확인했다:
```
SFI11: handler=0x4000c09 si_addr=0x0 comm=.republica.toss ...  (그리고 handler=0x4000c01)
```
- 이 값들은 **모두 `si_addr=0x0`(=far=0, 바로 그 NPE)** 이벤트의 필드다.
- 0x4000c09 / 0x4000c01은 유효 핸들러 주소가 아니다(§26-1이 v4.15c에서 실제 핸들러는
  libsigchain+0x208c로 정정). 0x0400_0000은 **sigaction의 `SA_RESTORER` 플래그값**이다.
  즉 22차의 "handler=0x4000c0x"는 **가드가 심은 포인터가 아니라, LKM 프로브가
  sigaction 구조체의 플래그/이웃 필드를 핸들러로 잘못 읽은 값**일 가능성이 높다.
- 따라서 패닉의 x19=0x4000c00이 "같은 계열"인 것의 의미는 **가드 C2 포인터의 재등장이
  아니라, 두 사건 모두 우리가 kprobe로 후킹한 시그널(rt_sigaction/rt_sigreturn) 기계와
  얽혀 있다**는 것이다 — §0에서 rsig_pre가 rt_sigreturn 프로브였음과 정확히 정합한다.

**정리(Q2 답):** "안티 포렌식 설계"는 최소 3개의 반례에 부딪힌다. 오컴의 면도날은
반대 방향을 가리킨다 — **가드의 정교함으로 돌린 현상이 사실은 우리 계측의 취약성**이다.
0x4000c0x 계열은 가드 포인터가 아니라 시그널 구조체 필드의 오독일 개연이 크다.

---

## 3. mBase=null 주입 경로 (Q3)

### 3-1. getBaseContext 오버라이드 후보는 기전상 배제된다

AOSP `ContextWrapper.isRestricted()`의 본문은 `return mBase.isRestricted();` 로
**필드 `mBase`를 직접** 역참조한다(`getBaseContext()`를 거치지 않는다). 그러므로
"악성 서브클래스의 getBaseContext 오버라이드"는 **이 폴트를 만들 수 없다.** 원인은
반드시 **mBase 필드 자체가 null**이어야 한다(§27의 `ldr w0,[x1]`, far=0과 정합).

### 3-2. "리플렉션으로 살아있는 필드를 null화하고 대기"보다 "null-base 인스턴스 생성"이 간명

- 후보 A(리플렉션/native로 기존 인스턴스의 mBase를 null화 후 다음 호출 대기): 가능하나,
  이미 attach된 라이브 컨텍스트를 null화하는 것은 부자연스럽고 레이스가 낀다.
- **후보 B(권장): 가드가 base 없는 ContextWrapper(또는 서브클래스)를 만들어
  isRestricted()를 직접 호출.** `new ContextWrapper(null).isRestricted()` 한 줄이면
  mBase=null → 결정론적 NPE. setBase를 부르지 않으면 mBase는 기본 null이다. 5런+
  결정론·깨끗한 far=0(레이스 흔적 없음)은 **레이스로 null화한 라이브 필드가 아니라
  목적성 인스턴스**를 강하게 시사한다.

### 3-3. "위장 환경에서만 발생"과의 정합 — NPE를 종료 수단으로 쓰는 설계

정상 기기엔 이 호출 자체가 없다. 가드가 RASP 판정 후 **의도적으로 null-base
isRestricted()를 호출해 "평범한 NPE 버그처럼 보이는" 종료**를 만드는 것으로 읽으면
"NPE 위장 종료"라는 §27 명명과 잘 맞는다(그럴듯한 부인 가능성 = 안티 분석). 이는 결론 A와
정합하며 견고하다. **단, "누가 mBase=null을 만드는가"는 여전히 직접 증거 없는 가설**이며,
24차의 caller LR 캡처(아래 §5)가 이를 판가름한다.

### 3-4. 경고: 결론 A(NPE)와 결론 B(패닉)를 "이중 자폭"으로 묶지 말 것

§28-2는 경로 A(NPE 종료)와 경로 B(커널 패닉)를 "가드의 이중 자폭"으로 통합했다.
그러나 A는 **유저랜드 Java 종료 경로**(증거 탄탄), B는 **커널 계측 부작용**(위 분석)으로
**서로 무관할 개연이 높다.** 하나의 가드 설계로 과통합하면 관측을 왜곡한다.

---

## 4. panic_on_oops=0의 부작용 + 재현 실험 설계 (Q4)

### 4-1. oops 생존 후 관측 신뢰성 — "번 부트"로 취급하라

panic_on_oops=0은 폴트 태스크만 죽이고 커널을 살리지만, **이후 ftrace/kprobe 데이터는
정량적으로 신뢰 불가**다:
- oops가 **kprobe/BRK 컨텍스트에서** 났다면(§0의 3건이 정확히 그 경우) kprobe 서브시스템이
  깨진 상태로 남는다: `kprobe_running()`/preempt·irq disable 카운트 누수, 해당 CPU의
  락 미해제 → 이후 그 CPU에서 데드락/행/재폭발 위험.
- 태스크가 락(RCU/스핀락)을 쥔 채 죽으면 그 락은 영구 미해제.
- 커널 taint는 이미 `G B W OE`(라인 24169). oops 후 taint가 더해지면 일부 서브시스템
  동작이 바뀐다. 신형 커널의 `oops_limit`(기본 10000) 누적 시 무조건 패닉도 유의.
- **죽는 태스크가 system_server면**(§2-1에서 1340이 시스템일 개연) 그 사망이
  **Android 런타임 재시작(소프트 재부팅)**을 부른다 → panic_on_oops=0이 하드패닉을
  소프트리부트로 바꿀 뿐 "재부팅"은 남을 수 있다. logcat에서 zygote/system_server
  재시작을 반드시 병행 감시.

**권장:** oops가 한 번 나면 그 부트는 정량 데이터용으로 폐기(dmesg/상태 스냅샷만 회수)하고
깨끗이 재부팅한 뒤 다음 측정. oops를 가로질러 장기 실험을 돌리지 말 것.

### 4-2. Timer-0 재현 실험 설계 — 최우선은 "우리 LKM 제거 대조군"

1. **대조 실험(반드시 선행):** 동일 조건에서 **hide_kmod 미적재(또는 프로브 detach)**로
   런. IABT/BRK 패닉이 **사라지면 계측 부작용 확정**(내 예측). 사라지지 않으면 그때 비로소
   가드/커널 경로를 조사. 싸고 결정적이다.
2. **프로브 이분 탐색:** rt_sigreturn 프로브(rsig_pre — BRK 패닉 실증)부터 끄고 나머지
   유지 → 어떤 프로브가 원인인지 좁힌다.
3. **커널 심볼화(필수·즉효):** vmlinux/System.map을 확보해 **lr=0xffffffc008007370을
   addr2line**으로 심볼화. §28 전체가 미심볼 주소 위에 서 있다. "어떤 함수의 반환이
   손상됐나"가 한 줄로 나온다.
4. **die 훅으로 사망 직전 스냅샷:** `arm64_notify_die`/`__do_kernel_fault`/`die()`에
   kprobe를 걸어 **태스크가 죽기 전** 전체 레지스터·유저스택(sp+..)·comm·cmdline을
   덤프(panic_on_oops=0이라 실행 가능). `/proc/1340/cmdline`을 실시간 상관.
5. **BRK 3건의 스레드 정체 상관:** T16176/T7415/T6332가 토스인지 시스템인지 확인(전부
   `__arm64_sys_rt_sigreturn` = NPE 시그널 복귀 경로 → NPE 처리와 우리 프로브의 충돌
   지점). 이게 A(NPE)와 B(패닉)의 실제 연결고리일 수 있다.

---

## 5. 24차 우선순위 재정렬 + 빠뜨린 관찰 (Q5)

브리프 순서 (1)caller LR (2)Timer-0 syscall (3)libea56 셀프스캔 (4)frida attach 에 대해:

**빠진 최우선 관찰 3개(브리프에 없음):**
- **[P0-a] hide_kmod 제거 대조군** — §28 결론의 사활. 이걸 안 하면 (2)Timer-0 syscall
  추적은 **우리 자신의 계측 아티팩트를 쫓는 삽질**이 될 수 있다.
- **[P0-b] 커널 lr 심볼화(vmlinux)** — 트리비얼, 최고 ROI. IABT의 정체를 즉시 규명.
- **[P0-c] PID 1340 = system_server인지 토스인지 판정** — "가드 Timer-0" 전제의 참거짓.
  `/proc/1340/cmdline` 실시간 캡처 또는 sched_process_exec/comm 로깅 kprobe.

**재정렬 권고:**
1. P0-a/b/c (위) — 저비용, B 프레임 자체를 확정/폐기.
2. **libea56+0x69b38 셀프스캔 트랙(브리프 3번)을 2번으로 승격.** 이것이 **실제 RASP
   판정 로직**(632회 vm_readv 결정론, RxCachedThreadS)이며 연구 본령이다. Timer-0가
   우리 아티팩트일 개연이 크므로 상대적으로 올려야 한다.
3. **isRestricted caller LR(브리프 1번)** — RASP 직결이므로 높게 유지하되, sp+0x28
   고정 오프셋 가정에 의존하지 말고 **더 넓은 스택 창을 떠서 maps로 심볼화**하라(프레임
   레이아웃이 다를 때 대비). 23차에 uprobe가 흐름을 교란한 실측(NOTES 27~29줄)을
   감안, 코드영역 브레이크포인트 금지 원칙 유지 — /proc/mem 폴링 방식이 옳다.
4. **Timer-0 직전 syscall 추적(브리프 2번)** — P0-a 결과가 "가드 원인"으로 나올 때만
   의미. 순위 하향.
5. **frida attach(브리프 4번)** — 셀프스캔 트랙 보조로 유용하나 **관찰자 효과 위험**
   (uprobe가 far=0 시그니처를 소실시킨 23차 실측처럼, frida 존재가 가드 거동을 바꿀 수
   있음). 최후순위, 비침습 관측 실패 시에만.

**추가로 빠뜨린 관찰:**
- panic_on_oops=0에서 **하드패닉→system_server 소프트리부트 전환 여부** logcat 감시(§4-1).
- 3건 BRK 패닉의 공통 지점이 **rt_sigreturn=NPE 시그널 복귀**임 → A와 B가 "NPE 처리
  경로에서 우리 프로브가 충돌"이라는 **단일 원인**으로 수렴하는지 검증.

---

## 6. 결론 A(NPE 위장 종료)에 대한 평가 — 대체로 견고

결론 A는 22차 codex 반론을 디스어셈블로 재검증해 정정한 것으로, **증거가 탄탄하다**:
far=0의 mBase implicit null check, SFO 복원값이 `art_quick_throw_null_pointer_exception_
from_signal`의 표준 NPE 변환과 일치(pgoff 보정 후 심볼화), OAT/bugsnag 무패치, sigchain
배열 무오염, fork 수집자식 kill9 vs main System.exit 분리 — 모두 표준 구성요소로
설명되며 과잉해석이 제거됐다. 유지 권고.

미세 지적:
- "5런+ 결정론"은 NOTES 62줄의 자체 지적(tail 슬라이딩 중복)을 반영해 표현 유지.
- **A의 진짜 미해결점("누가 mBase=null을 만드는가")을 B(커널 패닉)와 섞지 말 것.**
  A는 유저랜드에서 자족적으로 완결되는 경로다.

---

## 7. 한 줄 요약

- **B는 재작성 대상:** 재부팅 불안정의 실증된 지배 원인은 **hide_kmod의 kprobe 패닉**
  (BRK 3건, rsig_pre 트레이스, d4200020=BRK#1). Timer-0 IABT의 bit-62-flip은 유저
  크래프트 포인터가 아니라 **커널 반환주소/CFI 손상** 시그니처 — 계측 부작용이 최우선
  가설. "가드 Timer-0 = 토스 스레드"·"안티 포렌식 설계"는 미검증 단정(PID 1340은
  토스 기동 전부터 존재한 시스템 스레드).
- **24차 최우선:** ①hide_kmod 제거 대조군 ②lr 심볼화(vmlinux) ③PID 1340 정체 판정 —
  이 저비용 3종으로 B 프레임을 확정/폐기한 뒤, RASP 본령인 libea56 셀프스캔으로.
- **A는 유지.** 단 A와 B를 "이중 자폭"으로 통합하지 말 것.
