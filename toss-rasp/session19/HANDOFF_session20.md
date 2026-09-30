# 토스(viva.republica.toss) 원본 로컬 위장 — 인계 프롬프트 (20차 세션용)

## 최종 목표 (불변)

Android Emulator(camo33, arm64, API 33, GKI 5.15, 호스트=Apple M1 Mac)에서 벤더 서명
원본 토스가 프리다 없이 ① 제한 다이얼로그 없이 **메인 UI 진입** ② **5분 이상 생존**
③ 3점 검증(topResumedActivity·스크린샷·탭 반응) 통과.

**19차 현재**: EGL 즉사 레지레션 2종 근본 픽스 + 무한 프로브 재발 수정 완료 →
스플래시 렌더 + topResumed 유지 + 메인 스레드 idle + **8분+ 포그라운드 생존 복원**(run 6).
프로세스 생존은 사실상 달성 — **남은 것은 "메인이 ~55s~4분에 신호 없이 exit(0)"하는
조용한 exit 1개**(부팅 직후 스모크 런에서 재확인: 6454 사망, am_kill/툼스톤/신호 0).

## 경계(권한)

로컬/정적 RASP RE + 에뮬 탐지 로컬 무력화(OWASP MASTG-TECH-0144) = 인바운즈.
토스 서버측 위조/실거래 = 게이트. 이번 작업도 전자에 한정, 서버 채널 금지.

## 필독 자료

1. STATUS.md 상단 ⚡ 현재 전선
2. FINDINGS.md §23 (19차 전체) + §14~22 누적
3. session19/ — run1.trace(EGL 즉사 캡처), run5_trace.txt(EGL 로더 고정명 시도 실측),
   run3_trace.txt.gz(무한 프로브 246만 이벤트), run3_t35s.png·run6_mid.png(스플래시 렌더),
   egl_patch/(사본 원본 백업), events_logcat.txt
4. 스킬 SKILL.md + references/pitfalls.md 19차 섹션
5. 스크립트: scripts/{patch_bind_egl_literals.py, toss_child_scan.sh, deploy.sh(수정됨)}

## 19차 핵심 결론 (누적 상세는 FINDINGS §23)

### EGL 레지레션 2종 (★최대 수확 — 이 조합이 아니면 100% 즉사)
- **리터럴 패치**: .vl64/egl의 `_adreno` 사본 3종 내부 `emulation` 8곳(dlopen키 2·SONAME 3·
  로그태그 3) → `adreno\0\0\0` 치환. v4.6+의 emulation 경로 deny와 공존하는 유일한 방법.
  스크립트화됨(patch_bind_egl_literals.py, 멱등·.bak 보존). **.vl64 재구성 시 재실행 필수.**
- **ro.hardware.egl=adreno**: 부트마다 `emulation`으로 리셋. Android 13 EGL 로더는 readdir
  없이 고정명(emulation/kalama/generic)만 시도하므로 adreno 프로퍼티 없이는 드라이버를
  못 찾음. **부팅마다 `resetprop ro.hardware.egl adreno` + `ro.hardware.vulkan default`.**
- 검증법: `su 10175 ls /vendor/lib64/egl/` → emulation 3종 부재 + adreno 3종 가시.

### 무한 프로브 재발 (LKM v4.7로 수정·배포 완료)
- v4.5 MIDR wildcard redirect(cpu<임의수> 전부 매치)가 코어수 프로브(cpuN++…ENOENT 대기)의
  ENOENT를 봉쇄 → 메인 스핀 → SystemJobService ANR. 17차 normalize와 동일 클래스.
- **v4.7: midr redirect cpu0-7 한정**(코어수 파싱+범위검사), cpu8+ 실경로 ENOENT.
  검증: uid10175 뷰에서 cpu3=0x411fd4e0, cpu8=ENOENT, cpuinfo 8코어.

### fork 자식 정체 교정
- ps에서 보이던 자식들(1808/1809류)은 **Play Core split-install 헬퍼**(가드 아님).
- 가드 스캐너 자식은 16차 관측(/dev/ 난수파일·/proc/<pid>/mountinfo 스캔)과 동일 개체로
  추정하나 **스캔 전수는 아직 미확보** — 20차에서 캡처.

### 조용한 exit
- 부팅 직후 런(6454): ~55s, WebView 샌드박스 기동까지 진행 후 소멸. 신호 0·툼스톤 0·
  am_kill 0 = exit(0) 경로 확정. 18차 보고(2~4분)보다 짧은 케이스 — 런당 변동 큼.

## 20차 우선순위

**A. 조용한 exit 트리거 특정 (최우선)**
- 건강 스택 + `scripts/toss_child_scan.sh`(append-only pid 필터, p19_gn/p19_eg + fork/
  exit/signal tracepoint, 60s 스냅샷)로 런 → exit_group 직전 getname 시퀀스 확보.
- 사망 단층 2종(~55s / 2~4min)이 동일 트리거인지 확인. `logcat -b events` 사유 병행.
- 힌트: 15차 ANR 덤프에서 메인은 정상이었고, 16차의 fork 자식 보고→부모 exit 구조 가설이
  유력 — 자식의 스캔 완료 시점과 exit 시점 상관이 핵심.

**B. 가드 fork 자식(스캐너)의 스캔 전수 + 미위장 surface**
- 자식 pid를 set_event_pid에 append(스크립트가 자동) → 자식의 open 시도 중 ENOENT/EACCES
  → 미위장 surface → 위장 추가 후 재시험.
- 후보(16차 목록): 타 은행앱 apk(위장 불가), /proc/<pid>/mountinfo, /proc/self/stat,
  boot_id, thread-self attr, trace_marker errno, uid_procstat/set.

**C. 3점 검증 완주 + survive 통계**
- 기동 직후(ANR 전) 탭 → 5분 경과 → topResumed+스크린샷+탭. 10런 통계(조건 통제).
- 탭 테스트는 ANR 다이얼로그 떴을 때 금지(am_kill "user request after error" 오염 — 15차).

**D. 학술(강등)**: 카운터 영역 디코딩, MIDR per-cpu 매핑(전코어가 cpu0 값).

## 도구 / 환경 (19차 종료 시점)

- **에뮬**: 클린 리부트 + 전 스택 재적용 완료 상태. LKM **v4.7**(10179,10181,10175),
  bind(-impl-qti 가시), props(SM-S916N, qemu누수 0, **egl=adreno**, vulkan=default),
  1080x2340@450, writer 1개(가짜파일 23), Permissive, EGL 리터럴 패치 유지.
- **libea56 SHA-256** c454eb40…. uid=10175. 경로는 `pm path viva.republica.toss`로 검증.
- **Ghidra**: /tmp/gproj toss5 (휘발성 — 재분석은 analysis/toss-rasp/libea56.so 재import).
- 정적: /opt/homebrew/opt/llvm/bin/{llvm-objdump,llvm-readelf}. .text VA==offset.
- ftrace chan19: 재부팅마다 소멸 — toss_child_scan.sh 헤더의 재구성 블록 실행.

## 실행 규칙

- 토스 테스트 전: `am force-stop net.ib.android.smcard; am force-stop com.hanabank.oqf`.
- 시작: `am start -n viva.republica.toss/.splash.SplashActivity`.
- 생존 판정 3점 검증 필수(topResumed+스크린샷+탭). pidof/백그라운드 PID만으로 판정 금지.
- pidof 반환값이 Play Core fork 자식일 수 있음 — `ps -A -o PID,PPID,NAME`로 메인(zygote
  자식, activity 보유) 구별.
- 셸마다 `export PATH="$PATH:$HOME/Library/Android/sdk/platform-tools"`.
- 캡처 후 `adb shell sync`. push 직후 emu kill 금지.
- 에뮬 수동 기동: `cd $ANDROID_SDK_ROOT/emulator && ./emulator -avd camo33 -no-snapshot`.

## 절대 반복하지 말 것

- **`su 10175` 프로세스 가시성 판정 금지**(readproc 아티팩트) — 파일 뷰 확인용으로만.
- **kprobe_events/uprobe_events clear 금지** — append만.
- **setenforce 1 금지**(enforce는 값만 spoof — /dev-clone redirect가 깨짐).
- **GL 트리오 파일명·리터럴·soname 단독 패치 금지** — 6파일 3종 일관 아니면 불가.
  단, 19차의 `_adreno 사본 내부 리터럴 치환`(스크립트화됨)은 예외 — 검증 완료.
- **ANDROID_EMU_gles_max_version_3_0 토큰 제거 금지**(크래시 확정).
- **normalize_cpu_path 재도입 금지**, **MIDR wildcard redirect로 되돌리기 금지**(v4.7 유지).
- 프리다 금지(mem_scanner 즉사). ftrace/uprobe만. 구동 중 rmmod 금지.
- dylib 교체 시 에뮬 재시작. push 직후 emu kill 금지.
- 생존 런 중 무거운 프로브(do_filp_open 쌍 등) 금지 — system_server 워치독 유발 실측(19차).

## 20차 종료 전 기록할 것

- 조용한 exit의 exit_group 직전 이벤트 시퀀스(A 결과)
- 가드 자식 스캔 전수 + 미위장 항목 발견 여부(B 결과)
- 3점 검증 증거 + 10런 통계(C 결과)
- 성공 시: 전체 구성 스냅샷(스택 요소별 체크리스트)
- → FINDINGS.md §24 + STATUS 전선 + 스킬 갱신

**분석 축**: "fork 자식이 무엇을 봤나" → "exit(0)을 결정한 입력은 무엇이나".
