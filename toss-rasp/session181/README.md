# session181 산출물 (2026-10-02 심야2)
- props_raw_pre_patch.tar — 수술 전 /dev/__properties__ 통덤프(컨텍스트 5종+트라이 qemu 원증거)
- props_now.tar — 수술 후 통덤프(컨텍스트 0·트라이 토큰 0 — AOSP공통 조각 3만)
- 측정 계열: 무라벨 12s×2(최초 라벨 소실) → resetprop 후 라벨 부활 → 5런 1/5 → 가짜마운트 3/5 →
  rodata 스크럽 2/5 (핫/콜드 간헐 잔존)
- 이미지 수술: system.img plat 3라인 + 내장 vendor 8라인 동일길이 '#' 치환(백업 *.pre_s181_backup)
