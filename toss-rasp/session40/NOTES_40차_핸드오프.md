# 40차 세션 핸드오프 (요약 FINDINGS §44)

## 확정
- **가드 자식(zygote_reactjs) frida attach 성공** — 열거 결과 람다만 존재:
  DexguardRasp/DetectType은 **JNI DefineClass로 정의**(클래스로더 밖) —
  enumerateLoadedClasses 불가. 접근법 = JNIEnv DefineClass Interceptor(41차).
  (C10: 39차 'fork 자식 로드' 가설 → '클래스로더 밖 정의'로 정정)
- **exit 차단 시 보안 다이얼로그 실측**: "해킹 위험성이 탐지됨 / 감독기관의
  보안규정에 따라 서비스 이용이 제한" (dialog_open) — 제한모드 UI 원문.
- **/proc 4채널 발견·차단**(앱 가독 실측 + bind mount + 앱 uid 뷰 검증):
  interrupts(goldfish_*/virtio 42건→qcom명), asound(VirtIO SoundCard→kalama),
  pci/devices(virtio-pci 18건→빈), misc(goldfish_*/vsock 제거).
- 클린 런: 판정 T+14.1s EXIT 잔존, 생존 ~20s — 5분 미달.

## 41차 권고 순서
1. **DefineClass Interceptor**(정공): 부모에 JNIEnv DefineClass 훅 →
   DexguardRasp 정의 시점 캡처 → 클래스/클래스로더 확보 → 체크 목록 직독.
2. 배터리 정합화 시험: `dumpsys battery set status 3 / set level 8x` 후 판정 변화.
3. IMEI spoof 검토(iphonesubinfo HAL 단, 358240… AVD TAC).
4. 센서 값 패턴(가속도 자이로 출력 특성) — HAL 패치 확장.
5. vm_readv 셀프스캔 내용(632 triplet) — 무엇을 읽어 무엇과 비교하는지.

## 운영
- 재부팅/stop;start 후: apply_37 → 38 → 40_fixes.sh 순 재적용
  (40차는 bind mount 4종. 37/38 내용 포함).
- frida-server 현재 정지. 앱 uid 10176. 게스트 /data/local/tmp/heap3* 정리 후보.
