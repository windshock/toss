# 38차 세션 핸드오프 (요약 FINDINGS §42)

## 확정
- **37차 잔여 텔 3종 전부 탐지라이브러리 상수로 재판정**(UA 템플릿=Chrome/18 시그니처,
  goldfish/vbox 체크리스트, 제로 구조물) — **환경 문자열 텔 소진**. /proc/bootconfig는
  앱 uid 접근 불가(채널 아님).
- **신규 실채널 3종 차단**: gsm.*(Android Virtual Operator/us/311740/1.0.0.0/
  reference-ril → SKT/kr/45005/S916NKSU1AWC2/Samsung RIL + SIM 정합화),
  센서 HAL(Goldfish→"Samsung " 동일길이 치환 + bind mount + 프레임워크 재시작,
  dumpsys 검증 ★), /proc/bus/input/devices(virtio_input → sec_* 위장본 bind).
- **정체 불일치 = 변조 신호 실증**(RUN11: SIM 비정합 시 판정 T+7.3s 가속 → 정합화로
  T+13.1s 복귀). 위장은 전체 정합 필수.
- 생존: 판정 T+13s EXIT 고정, 사망 10-30s. 5분 미달 — 구동원 = 자바측 API 검사/비문자열.

## 39차 최우선 — DetectType 직독 (방법론 확정됨)
파일/힙에 사유 코드 없음 → **frida attach로 RASP→FDS 브리지 가로채기**:
1. frida-server 재기동(현재 정지) → exit_trap.js 변형 작성: Java.enumerateClassLoaders로
   `im.toss.selfprotect.Dexguard*` 탐지(런타임 로드) → handleExitPlan/DetectType
   인자 로그 + 호출 스택.
2. 사유 코드(EMULATOR/ROOT/...)에 따라 해당 채널만 정밀 차단.
3. 차단 후 5분+ 3점 검증(topResumed+스크린샷+탭 반응).

## 운영 상태
- stop;start #2 시행됨(23:22) — gsm은 rild가 되돌림: **재적용 스크립트
  session38/apply_38_fixes.sh + session37/apply_37_fixes.sh 순서로 실행**(재부팅/
  stop;start 후마다). 센서 HAL 반영은 프레임워크 재시작 필요(이미 적용됨).
- 게스트 덤프: /data/local/tmp/heap38(203MB)·heap37* — 필요시 정리.
- 에뮬은 켜져 있음(재부팅 없음). LKM v4.16 상시.

## 기타 39차 후보
- IMEI 3582400501…(AVD TAC 의심) — iphonesubinfo 서비스 단 spoof 필요(HAL 영역).
- /vendor/lib64/hw의 *.ranchu.so 파일명군(camera/fingerprint/audio/hwcomposer) —
  dirent 채널(LKM 은닉 목록 확인).
- ns/mnt·security.selinux IB 체인 디컴파일(37차 계류).
- 9/25 04:00 claude 리셋 후 통합 검토.
