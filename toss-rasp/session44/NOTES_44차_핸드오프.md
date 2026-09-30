# 44차 세션 핸드오프 (요약 FINDINGS §48)

## 확정 — ★★ dword 판정 캐시 발견 (이 프로젝트의 결정적 구조 발견)
- **RASP 판정이 앱 데이터에 캐시되어 재사용**: `shared_prefs/dwordStore.xml`
  (clockValidUntil/uptimeValidUntil/dinitialize UUID, 유효기간 ≈13-16분).
  FDS 로그 `dword_debug action=reuse` / `getDwordResult resultType=message_present`.
  **37~41차 채널 차단이 판정에 반영 안 된 이유 = 옛 판정 재사용.**
- **삭제 → 재스캔 강제 실증**(새 UUID 재생성). 단 재스캔도 EXIT(T+12.7s) —
  미식별 입력 잔존.
- 계측 확립: **인자 리플렉션 덤프**(AppEventPayloadV1 + params LinkedHashMap
  전개) — 직렬화 무관 실시간 전 이벤트 캡처. JSONObject.put은 무발동(FDS는
  org.json 미사용).
- 스캔은 시작 직후(attach 2.3s 이전) — 콜백 포착 레이스의 원인 = dword 상태.
  **런타임 재스캔 유도법**: exit 트랩 장시간 생존 → uptimeValidUntil 만료 →
  후킹 상태 재스캔(44차 말 롱런 검증).
- 재부팅 복구 레시피 확정: boot_recover(uid 10176 수동 갱신!) → 체인 37→38→
  40→41 → **센서는 HAL kill + stop;start 순서** → gsm 재적용.

## 45차 순서
1. 롱런 결과 확인(런타임 재스캔 마스크) → 기록.
2. mask-diff 개시: 입력 변경(센서 값→IMEI→…)마다 dwordStore 삭제+계측 런 →
   재스캔 마스크 비교. (스캔이 attach 전이면 롱런 만료 방식 사용)
3. 마스크 0x00 달성 → 클린 5분+ 3점 검증.
4. dword 재사용 우회 영구화: 앱 데이터의 dwordStore를 런마다 무효화하는
   감시자(판정 리셋 루프)도 옵션 — 단 재스캔이 EXIT면 무의미(입력 차단 선행).
5. 9/25 claude 리셋 후 통합 검토.

## 산출 (session44/)
argdump_probe.js ★(범용 FDS 엔진) · attach_argdump.py · mask_probe.js ·
run1~5 로그 · dwordStore 구조

## 운영
- 상태: 재부팅 후 전 채널 위장 복구 완료(센서 Samsung, dt/proc/프롭/gsm ✓).
- frida-server 구동 중. uid 10176.
