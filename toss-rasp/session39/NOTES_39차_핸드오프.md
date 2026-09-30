# 39차 세션 핸드오프 (요약 FINDINGS §43)

## 확정 — ★★★ DetectType 직독 관통
- **판정 = `[EMULATOR]`** (fds_detected event, from=SplashActivity).
  postRaspResult: `detected:"emulator"`, detectorSet="debugger, emulator, root,
  hook, cert, virtual_environment", guardLevel="LOW", 원시코드 result="191".
- **나머지 전부 음성**(root/hook/debugger/cert/virtual) — frida attach+전메서드
  후킹 중에도. 37~38차 차단 유효, 잔여 = 'emulator' 검사 1개.
- **서버 FDS 게이트 실측**: toss api-gateway 403 "비정상적인 시도…"(device_id 기반).
  재설치로 device_id는 갱신됨.
- 주 가드 클래스(DexguardRasp/DetectType)는 **fork 자식에서 로드**(부모 부재 실측).
- C9(재발 금지): FileOutputStream.write 훅의 this.write(b) 재진입 = 재귀 사망.
  logstore 캡처는 $init 감지 + 디렉터리 폴링 후 파일 읽기로.

## 상태 변경
- 앱 재설치됨(uid **10176**, LKM target_uids 갱신 완료, 데이터 리셋 후 런1로 2.9MB 재생성)
- frida-server 구동 중(127.0.0.1:27042) — 클린 런 시 정지 권장
- run4 종료 시 앱 사망(exit 트랩 0회 = 최종 킬은 Java exit 우회)

## 40차 권고 순서
1. **frida child gating으로 자식 계측**: fork 훅 → 자식 attach → DexguardRasp/
   DetectType 직접 후킹 = 'emulator' 검사의 구체 체크 목록 직독 → 그 체크만 차단.
2. result=191 비트마스크 해독(detectorSet 순서 대조).
3. 후보 입력 격리 테스트: IMEI(358240… AVD TAC) / 센서 값 패턴 / battery 고정값 /
   /proc/interrupts / vm_readv 셀프스캔.
4. 차단 후 원본 무수정 5분+ 3점 검증(topResumed+스크린샷+탭 반응) — frida 없이.
5. 9/25 04:00 claude 리셋 후 25~39차 통합 검토.

## 도구 (session39/)
attach_bridge.py(uid attach 러너) · full_trap.js(exit 트랩+FDS 로거+logstore
폴링 캡처) · live_probe.js(생프로세스 클래스 열거) · run1~4 로그 · ../apk_backup
