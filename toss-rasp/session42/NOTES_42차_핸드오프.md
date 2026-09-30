# 42차 세션 핸드오프 (요약 FINDINGS §46)

## 확정
- **LKM 무죄**: target_uids 무력화 런(위장 off)도 사망 T+12s — 전 위장과 동일.
  우리 인프라는 'emulator' 판정의 트리거가 아님.
- **Java 전화 API 소거**: TelephonyManager 전 표면 스푸프 → **0호출** — 가드는
  네이티브 경유(또는 미사용).
- **★ 콜백 비트마스크 획득** (teleo_spoof.js 런, logstore):
  - raspRootCallback = 0x10E (bits 1,2,3,8) — 발화하지만 허용(guardLevel LOW)
  - **raspEmulatorCallback = 0xBE (bits 1,2,3,4,5,7) — 6개 서브검출 생존**
  - raspHookCallback — 우리 frida 감지(허용)
  - **EXIT를 미는 것 = emulator 비트뿐**
- postRaspResult: detected:"emulator", result:"191" 재확인.

## 43차 — mask-diff 실험 설계 (확립됨)
입력 1개 변경 → 0xBE 비트 diff → 비트↔입력 매핑:
1. 센서 값: HAL 패치(sensorhal_patched.so)에 랜덤 워크(플러터) 추가 —
   "고정값/완전주기" 검출 회피.
2. IMEI: 네티이브 RIL — /dev RIL 소켓 또는 libbinder 후킹 검토.
3. 배터리/타이밍/그래픽 순.
→ 매핑 완료 후 전 차단 → mask 0x00 → 클린 런 5분+ 3점 검증.

## 산출 (session42/)
teleo_spoof.js · attach_teleo.py · run1_teleo.log(비트마스크 원문)

## 운영
- 재적용: apply_37→38→40→41_fixes.sh. frida-server 구동 중(실험 후 정지 권장).
- Stage A에서 target_uids 잠시 제외했다가 복원 완료(10179,10181,10176).
