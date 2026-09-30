# 55차 세션 핸드오프 (FINDINGS §58)

## 이번 세션 결론

- 54차 C24의 “자식 fd1은 raw SVC, 경로 폐쇄”는 **미확정**으로 정정.
  후크 0건이더라도 후크 장착 후 쓰기 자체가 없었다면 raw syscall 여부를
  말할 수 없다. 실제 55차 비주입 런의 자식은 관찰 창 `syscw=0`.
- 기기에는 52차 레이스 프리 라이터 대신 구버전이 설치되어 있었고
  동일 라이터가 2개 실행 중이었다. 원본 보관 후 52차 파일로 복구,
  단일 실행 확인. 정적 위장 파일 10개의 SELinux 라벨도 정렬했다.
- 복구 후 판정은 `CertifyGuestActivity`→`System.exit(0)`(T+4~5s).
  앱 크래시가 아닌 로컬 종료 경로이며 메인 UI/5분 목표는 여전히 미달.
- `fds_debug result=191`의 원천은 미해독. 42차 한 런의 emulator
  `debugInfo` 하위 32비트 `0xbe`와 숫자상 +1 관계만 확인.

## 근거

- `session54/run2_cw.log`, `child_write_watch.py`: 후킹 후 fd1 활동 검증 없음.
- `baseline_watch.log`, `baseline_restored.log`, `baseline_labels.log`:
  현 기기 세 차례 비주입 관찰.
- `tombstone_24`: 복구 전 ART 실행권한 폴트(원인 미확정).
- `key_logcat.log`: 복구 후 인증 제한 화면과 명시적 `System.exit(0)`.
- `static_probe_result.log`: 191 단순 상수 탐색 결과/한계.
- `device_system_profile_before.sh`: 복구 전 라이터 백업.
- `child_io_audit.py`/`.js`: 같은 런에서 후크와 `/proc/PID/io`를 짝지을
  목적의 시도. 구동 상태 복구 전에는 부모 PID 탐색 전에 즉사하여
  **관측 결과가 없다**. 실행 기록으로 인용하지 말 것.
- `CertifyGuestActivity.java`: JADX 단일 클래스 산출(오류 5건). `onCreate`는
  게스트 인증 UI/인텐트를 설정하며 직접 `System.exit`는 보이지 않는다.
  이 화면이 종료 원인이라고 단정하지 말 것.

## 다음 세션 시작 전 확인

1. `getenforce=Permissive`, `lsmod`의 `hide_kmod`, `dmesg_restrict=1`,
   `/data/local/tmp/.system_profile` SHA-256=`80c2c19c...`, 라이터 **1개**,
   위장 파일 라벨 `system_file` 확인. Frida 서버는 현재 중지 상태.
2. 토스 실행 전 모니모·하나 force-stop. 현 기본 패턴은 약 4~5초 후
   `CertifyGuestActivity`→`System.exit(0)`이다. 무조건 54차 패턴을
   재현할 것으로 가정하지 말 것.
3. ① 자식 fd1을 다시 조사한다면 후크 시작 시각, `/proc/PID/io` 또는
   제한된 커널 write 이벤트, 부모 소멸 시각을 **같은 런**에서 대조.
   ② 먼저 기존 FDS `handleExitPlan`과 `fds_debug` 발생 경계를 찾는 것이
   현재 짧은 종료 경로에는 더 적합하다.
