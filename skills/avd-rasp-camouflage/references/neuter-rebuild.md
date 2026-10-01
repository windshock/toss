# neutered 리빌드 — RASP 무력화 앱 재빌드 (분석용)

RASP(AppSuit) 탐지 워커 스레드를 안 뜨게 만든 앱을 원본에서 리빌드·재서명·설치한다.
에뮬에서 바로 실행·frida 분석이 되고, monimo(net.ib.android.smcard)·하나원큐
(com.hanabank.oqf) 두 앱에 일반화됐다.

> **언제 쓰나**: 앱 내부 로직/플로우를 로컬에서 분석하려는데 원본이 에뮬에서 죽거나
> 멈출 때. 원인을 오래 파기 전에 **이걸 먼저** 하라 — 며칠치 동적분석보다 빠르고 결정적.
> (원본 무수정 앱을 에뮬에서 "정상 서비스"로 살리는 것과는 다르다. 그건 LKM 위장 +
> 서버 경계 문제.)

## 원리
`libAppSuit.so`(STEALIEN 패커/RASP)는 JNI attach 스레드(Thread-N)에서 탐지를 돌린다.
dynsym의 `pthread_create`/`pthread_detach` st_name을 **무해한 임포트 심볼**로 재지향하면,
앱이 탐지 워커를 만들려 할 때 그 함수가 대신 불려 **스레드가 안 생기고 → RASP가 안 돈다**.
create만 바꾸면 `pthread_detach`가 invalid handle로 SIGABRT → **둘 다** 재지향해야 한다.

## 레시피 (자동: `scripts/neuter_rebuild.sh <pkg> [redirect]`)
1. 원본 splits pull (`adb pull` 각 `pm path`). **`clean/*.clean2.apk`(폭탄 strip 정적분석
   본)는 런타임 설치 불가 — 반드시 원본 base 사용.**
2. `libAppSuit.so` 든 split 찾기(보통 `split_config.arm64_v8a.apk`) → 그 안의 lib 추출.
3. `patch_libappsuit_threads.py <lib> <lib> <redirect>` — pthread_create/detach 재지향.
4. lib을 split에 다시 넣기(`zip -0 -X`, native lib은 store).
5. **3개 split 전부 동일 debug키로 재서명**: `zipalign -f -p 4` → `apksigner sign
   --ks ~/.android/debug.keystore --ks-pass pass:android`. (split 서명 mixed 불가)
6. `adb uninstall <pkg>`(서명 바뀌어 업데이트 불가) → `adb install-multiple <서명된 splits>`.

## 리다이렉트 심볼 선택 (가장 중요 — 앱마다 다름)
재지향 대상은 **반드시 그 앱 `libAppSuit.so`의 dynsym 임포트(UND)에 존재**해야 한다.
없는 심볼이면 `KeyError`. 조건: **-1/비-제로 반환 + 인자 역참조/쓰기 없음**(pthread_create가
"실패"로 처리돼 스레드 미생성·크래시 없음).

| 앱 | libAppSuit | 임포트 수 | 리다이렉트 | 비고 |
|---|---|---|---|---|
| monimo | 623KB, 평문 문자열 | 85 | **`getpid`** | 구버전 |
| 하나원큐 | 721KB, 문자열 은닉 | 36 | **`prctl`** | getpid 없음(신버전) |

**금지 대상**: `sleep`(포인터를 초로 잠→행), `getenv`/`gettimeofday`/`pthread_mutex_init`
(0=성공 반환→pthread_create가 "성공"으로 착각→미생성 스레드 사용→크래시), `fork`(호출마다
프로세스 폭발), `kill`(랜덤 pid에 시그널).

dynsym 임포트 확인:
```python
# PT_DYNAMIC(DT_SYMTAB/DT_STRSZ/DT_HASH)에서 st_shndx==0(UND) 심볼명 나열
# (섹션헤더 없는 stripped/packed 대응 — objdump -T는 패킹 lib에서 비어보일 수 있음)
```
후보(있으면): getpid/getuid/gettid/getppid/prctl.

## 검증 (성공 시)
스플래시·WebActivity를 통과해 온보딩까지 뜬다. 하나원큐 실측: SplashActivity →
PermissionNoticeActivity(권한안내) → 확인 탭 → WebActivity "본인확인방법 선택"(우리WON/
KB/휴대폰/토스) 완전 렌더·인터랙티브, 크래시/ANR 0, **LKM 없이도 실행**.

## 앱별 AppSuit 편차 (실패양상만 보고 오판 말 것)
**같은 AppSuit/AhnLab 제품이라도 탑재 방식이 달라 실패양상이 다르다:**
- **monimo**: 구버전, 평문 문자열(verdict 포맷 `debugging=..,mem_scanner=..,rooting=..,
  ptrace=..,emulator=..` 가 rodata에 그대로), 85 임포트(ptrace/socket/popen/
  __system_property_get/abort/exit/longjmp 직접) → **native-enforce = SIGBUS 자폭**(포이즌
  점프 0x41022).
- **하나원큐**: 신버전, 문자열 은닉(런타임 바이트구성+dlsym, STL도 평문도 아님), 36
  임포트(dlopen/dlsym으로 ptrace/popen/abort 동적 해석해 임포트 은닉) → app 레이어
  통합(`BaseActivity.appSuitSecureHandler`→`SecurityThreatEvent`) **report-mode = ANR
  또는 SIGKILL**(AhnLab 엔진 kill).

탐지 채널 자체는 거의 동일(su-family×여러 디렉터리, goldfish/qemu, /proc/cpuinfo,
cpufreq 코어수, ro.boot.qemu, /proc/self/maps). 채널은 `scripts/channel_trace.sh`로 실측.

## 경계
재서명 = **로컬 분석 전용**. 실제 서버 인증/거래는 앱 서명·서버 FDS(`isBadMph` 등)로
거부된다 = 라이브 서버 안티프로드 우회는 별도 승인 스코프(경계 밖).
