# 토스 원본 RASP 분석 — 다음 LLM 인계 (2026-09-27)

> 이 문서가 **현재 진입점**이다. `STATUS.md` 상단의 35차 전선,
> `HANDOFF_통합_2026-09-22.md`의 55차 본문, `GOAL_자율.md`의 당시 기기 상태는
> 역사 자료다. 최신 판정은 `FINDINGS.md` §82–§86과 이 문서의 근거 파일을 우선한다.
> 범위는 로컬 원본 앱의 탐지 원인 귀속·데이터 흐름 복원이다. 서버 기기수용,
> 인증·거래 우회는 범위 밖이다.

## 새 LLM에게 바로 전달할 작업 지시

```text
작업 디렉터리: /Users/1004276/Downloads/AppSuit/avd-camouflage
대상: 벤더 서명 원본 viva.republica.toss, camo33 AVD (arm64, Android 13/API 33).

먼저 analysis/toss-rasp/HANDOFF_NEXT_LLM_2026-09-27.md 전체를 읽고,
analysis/toss-rasp/FINDINGS.md §82–§86 및 analysis/toss-rasp/harness/README.md를
확인하라. §82/§84의 handler 호출 체인 과대해석은 §85/§86 정정이 우선한다.

현재 최우선 과제는 unidbg나 debuggerd 반복이 아니라, 앱의 process_created 로그가
Google/sdk_gphone64_arm64를 보고하는 반면 shell getprop이 삼성 모델을 보고하는
신원 불일치의 출처를 검증하는 것이다. 이 차이가 탐지 원인이라는 주장은 아직 없다.
먼저 하니스에 PID+starttime과 시각이 결합된 실행 중 selected getprop 스냅샷을
추가하고 오프라인 테스트를 작성하라. 기존 device logstore/logcat/dmesg를 백업한
뒤 --stacks 0 단일 clean run으로 앱 자신의 process_created와 같은 세션·시각의
값을 비교하라. 원 프로세스/세션 결합·증거 품질이 성립하지 않으면 INCONCLUSIVE로
남겨라. 그 다음에야 process_created 필드 생성원과 초기화 순서를 추적하라.

한 변수씩 비교하고 raw evidence를 보존하라. 성공 주장은 메인 UI + foreground +
스크린샷 + 탭 반응 + 5분 이상이라는 원래 기준을 만족할 때만 하라.
```

## 1. 현재 사실과 해석 경계

| 항목 | 현재 상태 | 근거/출처 |
|---|---|---|
| 로컬 에뮬레이터 탐지 | **[runtime-confirmed]** 2026-09-27 신규 원 세션 4/4에서 `raspEmulatorCallback=34359738558` (`0x8_000000BE`), `DETECTED/VALID`; 원 PID가 약 12–13초에 `System.exit(0)` | `FINDINGS.md` §86, 해당 `runs/`의 `meta.json`·`verdict.json`·`logcat.txt` |
| 상세 후속 판정 | **[runtime-confirmed]** 4회 중 3회에서 `postRaspResult: detected=emulator, guardLevel=LOW`와 FDS `[EMULATOR]`; 1회는 미포착이지 비탐지가 아님 | §86 및 각 `logstore_snapshots/` |
| 세션 신뢰성 | **[runtime-confirmed]** 첫 AMS Start proc PID, `/proc/PID/stat` starttime, UID, maps가 원 세션에 맞음. 4회 모두 재시작/타 세션 혼입 0 | `harness/parse_run.py`, §86 |
| 스택 | **[runtime-confirmed]** `--stacks 5`는 실제 5개를 못 얻음. 구 runner 1/5 완료, 직렬화 runner 2개 발행 중 1개 완료; 두 번째 `debuggerd -j`는 tombstoned timeout | §86, 각 `stacks/`, `logcat.txt` |
| handler 관계 | **[runtime-confirmed]** 한 성공 스택에서 `0xaa6a4→0xb02c4`는 같은 스레드, `0x13a4bc`는 다른 스레드. **[not-confirmed]** 이 핸들러가 emulator verdict를 만들었다는 인과·param 값 | §85–§86 |
| 신원 불일치 | **[runtime-confirmed]** 앱 자신의 `process_created` 필드는 4/4 `manufacturer=Google`, `model=sdk_gphone64_arm64`; 사후 `getprop ro.product.model=SM-S916N`. 2026-09-27 읽기 전용 재확인: `ro.product.system.manufacturer`와 `ro.product.vendor.manufacturer`는 `Google` | `runs/*/meta.json`, §85–§86, 현재 `getprop` |
| 불일치 원인 | **[source-confirmed]** `props-apply.sh`는 `ro.product.model/manufacturer`와 파티션별 `model`은 설정하지만 파티션별 `manufacturer`는 설정하지 않음. `vendor_bind_setup.sh all`은 `stop; start` 후 `do_props` 호출. **[not-confirmed]** 앱 필드가 Java `Build.*`인지, zygote의 사전 초기화 값인지, 실제 탐지 입력인지 | 스킬 `scripts/props-apply.sh`, `scripts/vendor_bind_setup.sh`; 원인 추정은 가설 |
| 최종 사용자 목표 | **미달성**: 프리다·앱 후킹 없이 원본의 메인 UI 진입, foreground+스크린샷+탭 반응, 연속 5분+ 생존은 이번 하니스에서 관측되지 않음. 모든 신규 run은 splash에서 종료 | §86; 원래 성공 기준은 `GOAL_자율.md` 참조(상태 정보는 낡음) |

서버 게이트만으로 현재 현상을 설명하지 말 것. 원 프로세스의 **로컬** emulator
callback은 직접 재현됐다. 동시에 Google 모델 필드만으로 탐지 인과를 주장하지 말 것:
이전 여러 속성 변경 실험에서 emulator 판정이 불변이었던 기록도 있다
(`FINDINGS.md` §58–§80). 이 실험의 가치는 인과 확정 이전의 *관측 경로 정합성*이다.

## 2. 읽기 순서와 산출물 지도

1. `FINDINGS.md` §82–§86: Java→JNI→`libea56` 디스패처 근거,
   hw-breakpoint 실패, 하니스, §84 과대해석 정정, 최신 4회 실측.
   §80은 과거 가설의 인식론적 교정에 유용하다.
2. `harness/README.md`: 판정 상태(`DETECTED/NOT_DETECTED/INCONCLUSIVE/CONTAMINATED`),
   parser·CLI 사용법 및 destructive runner 주의.
3. `harness/{trace_run.sh,parse_run.py,hns.py,test_harness.py}`: 실제 수집·판정 코드.
4. `runs/20260927-171659-nostack_live/` (대조군),
   `runs/20260927-171725-stack5_live/` (직렬화 전 실패),
   `runs/20260927-171853-stack5_serial/` (직렬화 관측군),
   `runs/20260927-171919-nostack_post/` (후행 대조군).
   각 run의 `meta.json`/`verdict.json`부터 보되 원본 증거는 `logcat.txt`,
   `process_observations.tsv`, `snapshot_status.tsv`, `logstore_snapshots/`에 있다.
5. 실행 전 보존본: `harness/preflight_20260927-171656/` (기존 logitems 1개,
   logcat/dmesg/LKM 파라미터/환경). raw JSON에는 설치·기기 식별자가 있을 수 있어
   외부 공유 전 포함된 식별자와 공유 범위를 확인할 것.

`STATUS.md` 상단(35차)과 기존 `HANDOFF_통합_2026-09-22.md`(55차)는 삭제하거나
덮어쓰지 않았다. 현재 사실을 찾는 첫 문서로 사용하면 안 된다.

## 3. 다음 한 번의 실험: 동일 세션·시각의 신원 provenance

**단계 A — 계측만 구현 [제안, 아직 미실행].** `trace_run.sh`의 매 poll에서
`ro.product.model`, `ro.product.manufacturer`, `ro.product.system.model`,
`ro.product.system.manufacturer`, `ro.product.vendor.model`,
`ro.product.vendor.manufacturer`, 필요시 `ro.product.property_source_order`를
시각·PID·starttime과 함께 별도 파일에 저장한다. 실패/빈 값도 남긴다.
`parse_run.py`에는 원 세션의 `process_created`와 이 동시점 스냅샷을 **분리해서**
기록한다. shell 프로퍼티가 Java `Build.*`를 대신한다고 가정하지 않는다.
기존 9개 오프라인 테스트를 유지하고, 같은 PID·다른 starttime 및 snapshot 결측
fixture를 추가한다. parser 결측을 `false`/성공으로 바꾸지 않는다.

**단계 B — clean 무스택 런 [제안, 아직 미실행].** 러너는 Toss/모니모/하나를
force-stop하고 Toss logstore JSON 삭제, device-wide logcat·dmesg clear를 수행한다.
따라서 *실행 전* 현재 로그를 별도 경로에 보존한다. 그 후 `--stacks 0`,
`--win 14`, param override 없음으로 **한 번** 수집하고 원 PID+starttime 및
`capture_quality`를 확인한다. 사후 `getprop`만으로는 동시점 일치를 증명하지 못한다.

**단계 C — 결정 분기 [가설 검증].**

- 앱 필드 Google, 같은 시각 shell 프로퍼티 Samsung이면: `process_created`
  producer의 APK/DEX xref를 확인해 필드 출처를 특정한다. Java Build 초기화/zygote
  상속 가설은 그 뒤에, 사전 백업·복구 계획이 있는 **단일 변수** 부트 순서 실험으로
  시험한다. 파티션 제조사 잔여와 초기화 순서를 동시에 바꾸지 않는다.
- 앱 필드와 같은 시각 shell 값이 같다면: 사후 `getprop`이 시점 차이를 만들었을
  수 있다. 언제 바뀌는지 시계열을 먼저 확인한다.
- 앱 필드가 Samsung으로 바뀌어도 emulator callback/FDS가 남는다면: 신원 필드는
  결정 입력으로 확정되지 않는다. 그 가설을 낮추고 handler-entry 상태 획득으로
  넘어간다.
- 원 세션 증거가 불완전하거나 앱이 실행 초기에 사라지면:
  `INCONCLUSIVE/CONTAMINATED`로 남기고 동일 데이터셋의 원인부터 해결한다.

**그 다음**에야 afed8 param↔handler↔verdict 귀속을 위한 제한된 상태 캡처를
설계한다. `0xa8f70` 스택 PC만으로 unidbg replay를 시작하지 말 것. 실제 호출
레지스터(`x0/context`, `w1/w2`)와 참조 메모리 페이지가 없고, HVF 게스트의
hw-breakpoint는 armed 후 hit 0(§83b)이다.

## 4. 환경과 운영 함정

- 2026-09-27 마지막 읽기 전용 확인: `emulator-5554` 연결, boot completed=1,
  SELinux Permissive, Toss UID=10178, LKM `target_uids=10178`; 토스 프로세스는
  실행 중이지 않았다. **다음 세션 시작 시 다시 확인**할 것.
- 매 셸에서 `export PATH="$HOME/Library/Android/sdk/platform-tools:$PATH"`.
  에뮬레이터 자체를 재기동할 때는 `ANDROID_SDK_ROOT=$HOME/Library/Android/sdk`
  설정을 먼저 확인. 불필요한 재부팅은 하지 말 것.
- `trace_run.sh`는 로그를 지운다. `--win`은 초가 아닌 poll 수이고,
  `--reboot` 없는 반복은 reboot-clean이 아니다. 원본 logstore snapshot을 우선하고
  `logstore_raw.txt`는 편의 사본으로만 취급한다.
- `debuggerd -j` 5개 요청을 다시 밀지 말 것. 직렬화 패치는 됐으나 두 번째
  요청이 timeout됐고 종료 시각에 영향을 주지 않았다는 통계적 증명도 없다.
- LKM 실시간 `rmmod`, Frida/코드 패치/다수 uprobe, 호스트 GLES 토큰 패치는
  이 검증에서 사용하지 말 것. GL·bind·writer·LKM이 이미 얽힌 환경이다.
- 가드/탐지 결과는 PID 생존만으로 판정하지 않는다. 앱이 자폭하지 않고
  background freezer에 들어간 것을 성공으로 세지 말 것.
- 연구 범위는 로컬 관찰/귀속이다. 서버 승인 경계를 넘는 기기수용·인증·거래
  실험으로 확장하지 말 것.

## 5. 완료 조건과 기록 방식

다음 LLM은 새 run마다 `run ID`, 원 PID+starttime, `verdict_state`,
`capture_quality`, 앱 필드와 동시점 속성값, 변경한 단일 변수, 사망/화면 상태를
`FINDINGS.md` §87 이후에 기록한다. 결론에는
`runtime-confirmed`/`source-confirmed`/`not-confirmed`를 붙여 관측과 가설을
분리한다. 새 원시 로그에는 기기·설치 식별자가 포함될 수 있으므로 외부 공유 시
그 사실을 알리고 공유 범위를 확인한다.

하니스 자체는 `bash -n harness/trace_run.sh`,
`python3 -B harness/test_harness.py` **9/9 통과** 상태다. 이 인계 작성 중에는
새 앱 실행, 속성 변경, 재부팅, LKM 교체를 하지 않았다.
