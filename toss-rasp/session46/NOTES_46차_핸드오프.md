# 46차 세션 핸드오프 (요약 FINDINGS §50)

## 확정 — ★★★ 라이브 .data 덤프 관통
- **런타임 복호화 어휘 174개 전수 확보**(live_vocab_174.json) — 36차 56개와
  합산 = 어휕 사실상 완결. nox 계열/intel_powerclamp/exportApk/cpu freq/
  selinux enforce/java 리플렉션 일체 포함.
- **신규 채널 2종 차단**: ro.dalvik.vm.native.bridge("0"→삭제),
  /sys/devices/virtual(mac80211_hwsim+android_usb → 필터 뷰 bind).
- 전 체크리스트 교차검증 클론(enforce=1 리다이렉트 포함) — **그래도 EXIT
  (T+12.8s)**: 트리거는 파일/프롭 계층 밖.
- 덤프 공학: C13(toybox hex 오버플로→문자열 절삭 페이지 산술), C14(모듈
  범위 0x1a0p), C15(**가드가 /data/local/tmp 런타임 삭제** → /sdcard 직접기록),
  EIO=.data-bss 공백 분할.

## 47차 순서
1. bss 꼬리 덤프(익명 매핑 별도 dd) → 잔여 어휘.
2. 최종 교차 후 잔존 시: vm_readv 632 triplet 해독(셀프스콘 비교 대상) 또는
   result:191 코드 경로 RE.
3. 마스크 직독 재시도(라이브 .data 확보 후 비트-체크 정적 매핑 가능).
4. 9/25 04:00 claude 리셋 후 25~46차 통합 검토.

## 산출 (session46/)
live_vocab_174.json ★ · ea56_live_rw.bin · libdump_guest.sh ·
apply_46_fixes.sh(native.bridge+virtual — 하단 생성) 
