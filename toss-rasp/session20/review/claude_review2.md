토스 RASP 20차 후반 결론(C1~C4)에 대한 2차 검토다. 인라인 증거(ESR/FAR 디코드, maps 매핑, 종료 로그)와 FINDINGS §24/§24-A, SKILL/toss_addr_resolve.py를 대조해 답한다.

---

## 1. C1 해석의 견고성 — "ART 암시적 null 체크"

**견고한 부분(수용):**
- ESR 내부정합 완전. `esr=0x92000006` → EC=0x24(**하위 EL=EL0 발생** 데이터어보트, 즉 유저스페이스가 진짜 원인), ISV=0, DFSC=0x06(변환폴트 L2), WnR=0(읽기), far=0x0. "null 객체의 offset 0 필드 로드"의 교과서적 형상이다.
- pc가 `.oat`의 **r-x**(AOT Java) — 네이티브 가드코드도 JIT anon도 아님.
- **가장 강한 판별점: 이건 데이터어보트다.** 10차 libea56 poison은 `pc=lr=0xc`로 **점프**한 *명령어* 어보트(EC 0x20/0x21)였다. far=0 데이터어보트(EC 0x24)는 poison-점프와 **폴트 계열 자체가 다르므로** poison-jump 모델은 이 폴트로 배제된다.

**반례 검토:**
- *가드가 zero-page 언맵 후 접근* — 성립성 낮음. addr 0은 `mmap_min_addr`로 **항상** 언맵이라 null 역참조는 언맵 행위 없이도 무조건 폴트한다. "가드가 만든 far=0"과 "자연 null"을 매핑만으로 구분 불가지만, 동시에 언맵 행위의 증거도 없다.
- *PAC 실패* — **배제**. PAC auth 실패는 상위비트 오염된 비정규 주소(또는 FPAC 전용 폴트)를 낳지 far=0/DFSC=0x6이 아니다.
- *MTE 태그폴트* — **배제**. 태그체크는 DFSC=0x11(동기 태그폴트)이지 0x06 아님. 이 GKI 5.15 에뮬은 MTE 미활성이 거의 확실.
- *컴파일러 assume/UB* — 런타임 far=0 로드를 만들지 않음, 무관.

**핵심 한계(반드시 명시):** 폴트 시그니처는 "AOT 프레임워크 코드가 null 참조를 역참조했다"만 증명하고 **왜 null이었는지는 말하지 않는다.** "정상 Java NPE 경로"와 "가드가 상태를 오염시켜 이후 framework OAT에서 null로 표면화(지연-오염)"는 ESR/FAR 층에서 **완전히 구분 불가**다. C1이 지연-오염을 열어둔 건 옳으나, "poison 강등/미확정"이 "poison 배제"로 굳지 않게 해야 한다.

**구분에 필요한 추가 관측:**
- (a) OAT pc 명령어 역어셈블(oatdump/llvm-objdump) → 로드가 `[Xn,#0]`인지 확인하고 **do_mem_abort kprobe로 pt_regs GPR 덤프** → Xn==0(진짜 null 베이스) vs 계산결과 0(오염)인지 확정.
- (b) **N런 (pc,far) 불변성**: 매 런 동일 pc+far=0 → 고정 코드경로의 구조적 null(특정 framework API가 null 반환 = 환경 의심). pc 변동 → 오염/poison.
- (c) ART FaultManager가 이 폴트를 먼저 잡는지(→NPE 변환) 확인(→Q3). logcat에 `java.lang.NullPointerException`이 없으면 가드 핸들러가 선점한 것.

---

## 2. C2 마커 전략 평가 — "System.exit called" 로그

**약점:**
- **마커가 하류·지연이다.** fault→sigchain→컬렉터 ~12s 수집→셧다운훅 뒤에야 로그가 뜬다. 이 시각에 "직전 스캔 이벤트"를 상관하면 **판정 입력이 아니라 컬렉터 자신의 maps/stat 수거**를 가리킨다. 인과적으로 중요한 건 ~12s 앞의 `signal_deliver(sig=11)`/`do_mem_abort`와 그 판정을 낳은 스캔이다.
- **마커는 graceful-Java 변형에만 존재.** 10차식 툼스톤(pc=0xc 자폭)이나 시그널/poison 직행 변형은 System.exit 로그가 없어 **그 사망이 통째로 안 보이거나 오분류**된다. C4의 12s~240s+ 변동은 다중 종료경로 존재를 시사.
- logcat은 링버퍼 드롭(컬렉터 폭주 로깅 시)에 취약, "9회 관측"이 상시 방출·상시 포착을 보장 못함. status=0은 정상종료·가드자살 양쪽이 남기므로 마커 단독으로 가드 판정을 증명 못함(C3 18408 오귀속이 그 위험을 보여줌).

**대비책:**
- **1차 앵커는 커널측·핸들러 독립 신호**: `signal_deliver(sig=11)`(포그라운드 tid) + `do_mem_abort` + `exit_group(status)`. Java 경로를 타든 직행하든 항상 발화 → 상시 켜둔다.
- **다중마커 AND 분류**: {fault+System.exit}=우아한 자살 / {fault+exit_group, System.exit 無}=직행·네이티브 / {fault, exit 無}=흡수·회복(18408형). 마커 없는 사망 버킷을 명시적으로 둔다.
- ftrace/logcat **동일 시계**(monotonic/nsec)로 ~12s 오프셋을 가정 아닌 실측으로 두고, 스캔 상관은 **로그 시각이 아니라 fault 시각**에 건다.
- 마커리스 사망 재출현 가능성 **높음** → 위 커널 앵커가 유일하게 견고한 대비책.

---

## 3. 컬렉터 claim 조건 & ART로 되돌리는 유저랜드 방법

**claim되는 조건:** ART는 암시적 null 체크용 SIGSEGV 핸들러를 libsigchain으로 설치한다(art::FaultManager). 정상이면 컬렉터(Bugsnag/NPTH류)는 **체인을 존중**해 ART가 먼저 잡게 하고, ART가 pc를 "생성코드 내 암시적 NPE 지점"으로 인식하면 handled→NPE로 언와인드하여 **컬렉터는 폴트를 못 본다.** 컬렉터가 claim하는 경우:
- 컬렉터가 sigchain을 우회한 raw `sigaction`으로 **front-of-chain**을 차지하거나 ART 핸들러를 체인 없이 대체.
- ART `GeneratedCodeContainsPc`가 실패(가드가 검증 입력을 훼손했거나 OAT를 비생성코드로 취급) → ART가 아래로 넘김.

여기선 pc가 boot-framework.oat r-x(생성코드)이므로 **원칙상 ART가 claim해야 한다.** 그런데도 앱이 죽고 NPE 로그가 없다면 → **가드 핸들러가 체인 앞을 선점**했다는 강한 정황.

**LKM/ftrace만으로 ART가 이기게 하는 법(앱 패치 불가):** 정직히 어렵다 — 핸들러 등록 순서는 앱 init 내부에서 결정되고, 동기폴트 핸들러 선택을 커널에서 깔끔히 재라우팅할 수 없다. 실현 가능한 지렛대:
- **`rt_sigaction` kprobe로 가드의 SIGSEGV 등록만 무력화**: 타깃 uid에서 ART가 이미 SIGSEGV를 등록한 뒤 들어오는 두 번째 SIGSEGV sigaction(가드 lib PC 범위 발신)을 드롭/체인 강제 → ART 핸들러가 남아 NPE로 변환 → **Java 스택 확보 + 생존**. 리스크: 가드의 정당한 시그널 처리도 깨질 수 있어 발신 PC로 정밀 타깃 필요(가설급 지렛대).
- **선행 확인(무비용)**: logcat에 `java.lang.NullPointerException`이 실제로 없는지 grep → 없으면 "가드 선점" 가설 확정, 위 훅의 성공기준이 명확해진다.
- neutered 빌드는 Java 스택은 주지만 가드가 꺼져 **판정 자체를 관측 못하는** 긴장이 있음(SKILL 명시) — 이 질문엔 부적합.

---

## 4. boot-framework.oat+0x19d534 심볼화 절차

**가장 실용적: 기기측 oatdump `--addr2instr`** (macOS 호스트엔 prebuilt oatdump가 없다).
1. maps로 **정확한 파일 경로 확인**(maps_pf.txt의 그 라인) 후 런타임과 동일 파일 보장(fingerprint/size 대조 — 부트이미지는 기기·업데이트별 재생성됨).
2. 기기에서:
   ```
   adb shell "oatdump --oat-file=/system/framework/arm64/boot-framework.oat --addr2instr=0x19d534"
   ```
   `--addr2instr`는 OAT 코드 오프셋 → **포함 메서드(클래스·메서드) + 해당 dex PC + 기계명령**을 직접 준다. (오프셋은 maps의 **vaddr 오프셋 0x19d534**를 우선 시도; oatdump가 기대하는 베이스가 oatexec 세그먼트인지 확인 위해 file+0x345534도 교차.)
3. dex PC → 소스라인: oatdump가 vdex의 dex 디스어셈블을 인터리브 출력(`--dump:code`/`--method-filter`). 필요시 boot-framework.vdex도 pull.
4. **명령어만이라도(호스트, 오프라인)**: 이미 `/opt/homebrew`에 있는 llvm-objdump로 OAT .text의 file+0x345534를 역어셈블 → "어느 레지스터가 null인가/필드 로드 종류(iget/aget)" 확인. (메서드명은 안 나옴 — 그건 oatdump 몫.)
5. 기기 oatdump가 없거나 OOM이면: 파일 pull 후 **Linux/AOSP host-tools 컨테이너**에서 oatdump 실행(macOS 네이티브 불가). vdexExtractor+baksmali는 dex는 주지만 OAT→dex-PC 매핑은 못 줘 보조용.

→ 결론: **on-device `oatdump --addr2instr`**가 정답, macOS에선 명령어 확인용 llvm-objdump로 보완.

---

## 5. "환경 유발 null" 판정 최소 실험 세트 — 우선순위

**(a) → (b) → (c) 순.** 이유: C4의 12s~240s+ 변동 때문에 **레이스 노이즈가 최대 교란**이라, 베이스라인 없이 A/B하면 위양성/위음성이 걸러지지 않는다.

1. **(a) 동일 부트 N런 분포 먼저**(toss_launch_stats.sh, 저비용). 목적은 생존시간 분포보다 **치명 폴트 (pc,far) 불변성**. 불변 → 고정 코드경로의 구조적 null(특정 framework API 반환 null = 환경 의심); 변동 → 오염/지연-poison. 동시에 그 불변 pc를 **Q4로 심볼화** — 메서드가 우리가 위장하는 채널(system property/package/DisplayMetrics 등)을 읽는 것이면 환경 링크 직결. 단일 최대 정보이득.
2. **(b) LKM 구성 태깅 A/B** — 실제 인과 시험. **한 번에 한 채널만**(maps 삭제→치환 24-3, ksig_dis, MIDR redirect, wm size/density, GL 신원) 토글해 치명 pc/far가 이동/소멸하는지 측정. (a)의 불변 신호가 있어야만 유의미.
3. **(c) 종료 직전 30s 채널 델타** — 보강·가설생성용(컬렉터 수거가 마지막 ~12s를 오염시키므로 **death 시각 아닌 fault 시각 기준**, correlational로만 취급).

**교란변수 통제 순위:** ① 레이스/부팅경과 시간(최대 — 동일 부트 연속런, boot-elapsed 기록) ② LKM 버전/파라미터 상태(런마다 전부 태깅, 버전 혼합 금지) ③ 부트간 상태 드리프트(prop/bind — boot_recover 체크리스트 검증 후 런) ④ 포그라운드 vs 서비스 프로세스(C3 교훈 — wm_on_create+am_proc_start reason으로만 카운트) ⑤ 서버/네트워크(오프라인 trace 무효였으니 "중간 신뢰"로만) ⑥ logcat 드롭/시계 스큐.

---

## 6. 스킬 개선 (2건 이내)

1. **toss_addr_resolve.py에 자동 심볼화+ESR 완전디코드 결합.** resolve 결과가 `*.oat` r-x면 즉시 실행 가능한 `oatdump --oat-file=<path> --addr2instr=0x<voff>`(및 file+foff의 llvm-objdump) 명령을 방출하고, 옵션으로 adb 경유 실행해 메서드명을 리포트에 자동 채움 → "OAT+0x19d534→Java 메서드" 루프 폐쇄(Q4 직결). 동시에 ESR을 EC/DFSC/WnR/ISV까지 **기계 라벨링**해 데이터/명령어 어보트(=null vs poison) 혼동을 원천 차단(Q1).
2. **런-태깅 + 상시 커널앵커 하네스.** 각 런에 {hide_kmod 버전, 전 파라미터, boot-elapsed, wm_on_create 기반 포그라운드 pid, online/offline} 스탬프를 찍고 `do_mem_abort`+`signal_deliver(11)`+`exit_group`+"System.exit" 로그를 상시 켠 뒤, 발화 마커 조합으로 런을 {우아한자살/직행/생존} 자동 분류 → Q2 다중마커·Q5(a)(b) 태깅을 동시 충족, 단일런 결론(§24-A #7)과 18408 오귀속(C3)을 구조적으로 예방.

---

## 수정 권고 Top 3

1. **인과 앵커를 fault로 되돌리고 System.exit 로그는 확증용 북엔드로 강등.** 그 로그는 판정을 ~12s 지연시키고 마커리스 변형에선 부재한다 — 스캔/채널 상관은 **fault 시각(signal_deliver 11/do_mem_abort)** 에 걸고, 커널 앵커를 상시 켠다. (Q2)
2. **C1을 "폴트 계열 확정, 근본원인 미해결"로 명시적 재라벨.** 확실한 건 "AOT 프레임워크 코드의 null 읽기 데이터어보트"이며 이는 10차 poison(pc=0xc 명령어어보트)과 **계열이 달라 poison-jump는 배제**된다. 그러나 정상 NPE vs 지연-오염은 ESR/FAR로 구분 불가 — "poison 강등"을 "poison 배제"로 굳히지 말 것. (Q1)
3. **A/B(b)보다 OAT 심볼화 + N런 (pc,far) 불변성(a)을 선행.** on-device `oatdump --addr2instr`로 치명 메서드를 알아내고 폴트 PC 불변 여부를 재는 것이 단일 최대 정보이득이자 "환경 vs 내재" 질문의 게이트다. 12s~240s 변동 신호 위의 채널 A/B는 이 선행 없이는 반증 불가능하다. (Q4·Q5)
