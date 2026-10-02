# session180 산출물 (2026-10-02 심야)
- logcat_surgery_v2_run1.txt — v1 수술 런 전체 로그(EGL 어보트 캐스케이드 원증거)
- logstore_surgery_v2_run1.json — 동 런 logstore
- tombstones/ — v1 수술 era 것(settings/systemui EGL 어보트)
- chtrace_surgery_run.txt — 수술 런 ftrace(파일접근): /proc/self/maps×34 + vendor 디렉터리 열거
- 실험 매트릭스(결과만):
  | 배포 | 결과 |
  |---|---|
  | 11종 dynstr(이름+해시, v2) | 2s 무라벨 급사 |
  | 11종 이름만(NOREHASH) | 2s 급사, 라벨 [EMULATOR] 관측 |
  | 미매핑 3종(emulation/angle/vulkan.qcom) | 12s 정상 |
  | libEGL_adreno build-id 2B | 13s 정상 |
  | .rodata 스크럽 4종(16토큰) | 11s 정상·판정 불변 |
  | 클린 대조 ×2 | 12/13s [EMULATOR] |
- 도구: ../..//tmp-artifacts/tools/check_gnu_hash.py(bionic bloom 단일워드 검증기),
  dynstr_surgery.py v2(조인트 버킷+게이트+NOREHASH)
- 산출 세트(호스트 /tmp): vl64_new3(v2 수술 전체), vl64_noname(NOREHASH), vl64_ro2(rodata 15종 스크럽 시도본)
- 앱 매핑 vendor lib 목록(T+4s 실측): adreno 트리오 + mapper-impl-qti + GLESv1/2_enc + OpenglSystemCommon
  + GfxPerf + OpenglCodecCommon + glcommon + glesv1/2qti + qti_adreno + vulkan_enc + vulkanqti
  (enc 4종은 zygote 프리마운트 상속 — .vl64 뷰 밖)
