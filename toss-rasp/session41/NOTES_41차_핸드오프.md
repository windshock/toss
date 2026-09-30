# 41차 세션 핸드오프 (요약 FINDINGS §45)

## 확정
- **★ device-tree 대형 채널 차단**: `/proc/device-tree/compatible` =
  `linux,ranchu` + goldfish-events/audio/battery + fw-cfg@9020000(QEMU) +
  pl011/pl031/pl061 노드가 앱 가독 상태였음 → 삼성 compatible(samsung,dm2q
  qcom,sm8550 qcom,kalama) + 의심 노드 제거본을 **sysfs 실경로에 bind mount
  성공**(앱 uid 뷰 검증 완료).
- 프롭 키 `vendor.qemu.dev.bootcomplete` 삭제. 배터리 정합(status3/87%).
- dl_iterate_phdr 무결 확인(앱 .so 317종 에뮬텔 0건).
- /proc/net/route 10.0.2.0 노출 발견 — 단 procfs net 매직링크라 bind 불능
  (LKM 필요) + 가드 어휘에 route 부재(우선도 낮음).
- **DefineClass/IMCL 후킹 무발동**(C11): 복호화 클래스 attach 이전 로드 추정.
- 판정 잔존: 배터리/device-tree 차단에도 T+14s EXIT — 잔여 후보 =
  **IMEI(AVD TAC 358240, 바인더)** / 센서 값 패턴 / **인프라 자체 탐지 가설**.

## 42차 권고 순서
1. **기준선 격리(강력 권장)**: LKM+위장 전부 정지한 맨상태 런 → 판정 시각과
   비교 = 우리 인프라가 트리거인지 환경인지 분리. (LKM rmmod 금지 — 재부팅
   필요하므로 target_uids를 임시 uid(예: 99999)로 돌려 무력화)
2. IMEI 정공(358240 TAC — HAL/AVD 설정).
3. 센서 값 패턴(고정값 검출 — 플러터 주입).
4. attach 0.8s 조기화로 DefineClass 재시도.

## 운영
- 재적용 체인: apply_37 → 38 → 40 → **41**_fixes.sh (41: dt bind + qemu 프롭
  삭제 + 배터리). dt_fake = 게스트 /data/local/tmp/camo/dt_fake.
- frida-server 정지 상태. uid 10176.
FEOF 관련 산출: session41/{apply_41_fixes.sh, route_fake, dump_classes.js,
attach_dump.py, run1_dump.log, dexdump 스크립트}
