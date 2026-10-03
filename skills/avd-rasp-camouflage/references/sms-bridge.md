# SMS 양방향 브릿지 (에뮬레이터 ↔ macOS Messages.app)

## 동작 원리 (전 구간 실측 검증)

```
[송신 emu → Mac]
앱 --SmsManager--> 프레임워크 --기록--> content://sms/sent   (라디오 불필요, 실측)
sms_bridge.py 폴링 ──감지──> macOS Messages.app (--send 시 실제 전송)

[수신 Mac → emu]
macOS chat.db (~/Library/Messages/chat.db) 새 수신 메시지 폴링
  → adb emu sms send <발신번호> <본문> 주입
  → 플랫폼 수신 (broadcast + content://sms/raw)
  → 기본 문자 앱이 inbox에 저장 → 앱이 정상 수신
```

## 사용법

```bash
# 양방향 (송신 dry-run + 수신 주입) — 기본값
python3 scripts/sms_bridge.py

# 송신도 실제로 Messages.app에서 보내기
python3 scripts/sms_bridge.py --send

# Mac 수신 중 특정 발신번호만 에뮬레이터로 전달
python3 scripts/sms_bridge.py --direction in --from +8215887882,01012345678
```

- 상태: `~/.cache/avd-sms-bridge/{seen.json, mac_rowid}` — 초기화하면 전체 재처리.
- `--direction both|out|in`

## 전제 조건과 함정

### 수신 (Mac → emu)
- chat.db 읽기에 터미널 **Full Disk Access** 필요 (macOS TCC).
- 최신 macOS는 message.text가 비고 **attributedBody(typedstream blob)**에 텍스트가
  들어간다 — crude 런 추출을 쓰므로 끝에 메타데이터 잔재가 붙을 수 있다.
- inbox 저장은 **기본 문자 앱이 정상일 때만** 된다. Google Messages가 "process is bad"
  상태면 `adb shell pm clear com.google.android.apps.messaging` 후 앱을 한 번 기동.
- 주입 확인: `adb shell content query --uri content://sms/raw --projection _id` 행 증가.

### 송신 (emu → Mac)
- 에뮬레이터에 라디오가 없어도 프레임워크가 sent 박스에 기록한다 (실측).
- `--send`는 실제 메시지를 실제 수신자에게 보낸다. iPhone "문자 전달" 또는 iMessage 필요.
- `adb emu sms send <번호> <내용>`은 **수신 주입** 전용 (방향 반대 주의).
- `content insert --uri content://sms/sent` 직접 삽입은 프로바이더가 거부한다 —
  실제 SmsManager 경로(com.test.sms 테스트 앱 등)로만 기록된다.
- MMS·멀티파트 미구현.

## 실측 기록 (2026-09-19)

- 송신: 테스트 앱(com.test.sms) 2건 발송 → sent 박스에 address+body 완전 기록 →
  브릿지 dry-run 감지 ✅
- 수신: chat.db 감지("모니모 인증번호 [xxxxxx]") → 주입 → raw 2→3행 증가 ✅
  → Messages 앱 기동 후 inbox 저장 확인 ✅

## §191 수정
- **첫 실행 백로그 재생 버그 수리**: 상태파일(mac_rowid) 없으면 0부터 시작해 chat.db **전체
  히스토리가 에뮬로 재주입**되던 동작 → 이제 첫 실행 시 `MAX(ROWID)`부터(신규만). 전체 재생이
  필요하면(테스트) 상태 디렉토리 삭제 후 `--replay-history` 없이… 는 미지원 — 필요 시
  mac_rowid 파일에 0을 직접 기입.
- **typedstream 쓰레기 스킵**: META_WORDS 2개 이상 포함 또는 `X$`/`)a` 시작 본문은 미주입.
