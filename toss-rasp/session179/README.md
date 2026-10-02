# session179 산출물
- 판정창 힙 교차검증 원본: /tmp/vw/*.bin (dalvik 27영역 캡처본 — 힙 관측법 재현용)
- GL 수술판 샘플 3종(glcommon/vulkanqti/hw-vulkan.qcom — 전체 26종은 /tmp/vl64_new2, 재생성: dynstr_surgery.py /tmp/vl64_all /tmp/out)
- 배포 레시피(내일 결정 실험):
  1. 부트 (수술판 미적용 클린 .vl64) → SKIP_ZR=1 boot_recover 10179 → 기준 확인(11s [EMULATOR] 복귀 여부 = 디에스컬레이션 확인)
  2. 에스컬레이션 해제 확인 후: 9종 push (libEGL_adreno, libEGL_emulation, libGLESv2_angle, libGfxPerfCollector, libOpenglCodecCommon, libglcommon, libglesv2qti, libvulkanqti → .vl64/, vulkan.qcom.so → .vl64/hw/) → 풀리부트 → SKIP_ZR=1 boot_recover → run_measure 3런
  3. 생존/라벨변화 = GL dynstr 채널의 진짜 인과. 2s 무라벨 지속 = 변조감지(b) 확정 → 차기: 가드의 GL 무결성 검사 역분석(hwbp on dynstr 페이지 읽기)
