# 37차 세션 핸드오프 (요약 FINDINGS §41)

## 확정
- **RASP→FDS 처형 위임 체인**: libea56이 Java FDS에 `handleExitPlan(EXIT)` 위임 →
  System.exit(0). 증거 = 앱 자체 텔레메트리 `files/logstore/logitems/*.json`
  (`fds_detected_debug`, caller:RASP). **런마다 판정 시각·플랜을 이 파일로 실측**.
- Java 브리지 = `im.toss.selfprotect.Dexguard*` (메인 클래스는 DexGuard 런타임
  복호화 — 정적 부재, 람다만 classes29.dex). E군 어휘 = DexGuard 문자열 풀.
- **파일/프롭 이중 채널 차단**: 파티션 변형 프롭 32개(google/Google/dev-keys/
  userdebug) resetprop + build.prop 3종(/system,/vendor,/odm/etc) 위장본 bind
  mount + /vendor/overlay 필터 뷰 + goldfish 오버레이 pm disable.
  bind mount는 앱 격리 ns에 전파 실증. **zygote Build 캐시는 stop;start로 재구성**.
- ns/mnt: 앱≠init 이미 격리 = 실기기 정합(조치 불필요). vold prop=true 적용
  (AOSP 11+ 기본 true, 미설정이 AVD 텔).
- 생존: 즉사 소멸, 11s → 최고 22-32s. 5분 미달 — 판정 T+13-15s에 여전히 EXIT.

## 운영 상태 변경 (다음 세션 주의)
- **frida-server 정지됨** (클린 런 목적) — frida 작업 시 `/data/local/tmp/frida-server
  -l 127.0.0.1:27042` 재기동 + 사용 후 정지 권장(/proc/net/tcp 채널).
- **stop;start 1회 시행됨** (22:55) — camow writer 생존 확인, 프롭 수정 유지 확인.
- **재부팅/stop;start 시 session37/apply_37_fixes.sh 재실행 필수** (bind mount는
  휘발). 게스트 위장 자산: /data/local/tmp/camo/{propfix,overlay_view,
  fix_partition_props.sh}.

## 38차 권고 순서
1. 잔여 판정 채널 사냥: 생존 창 힙 스냅샷(heap_snap37c.sh) → tells 재추출.
   표적: telephony(에뮬 IMEI)/센서 목록/packages.xml 유래 경로/Build 캐시 재검증.
   판정 시각 = logstore json의 log_time으로 정밀 상관.
2. DetectType 값 캡처: 힙에서 DexguardRasp/DetectType 문자열 탐색(Java 힙 대형
   영역 >16MB 포함 — bigheap.sh 실패 사유: dump 시작 늦음. T+2s부터 즉시).
3. ns/mnt raw readlinkat(0x13ca9c)·security.selinux(0x72ea4) IB 체인 디컴파일
   (DecAtExact.java + toss5 — 단 주소는 함수 미정의 구역, prologue 역추적 필요).
4. 5분+ 3점 검증 재도전 (채널 추가 차단 후).
5. 9/25 04:00 claude 리셋 후 25~37차 통합 검토.
