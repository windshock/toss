#!/usr/bin/env python3
"""name_surgery.py — §142 램덤명 vendor lib → plausible 이름 수술 (S155 확정판)
원본: /tmp/vscan 풀(또는 게스트 pull). 동일길이↓ dynstr 치환(NEEDS+SONAME) + 파일명 변경.
매핑(정체는 크기 매칭으로 확인):
  libcf2rn4pmt62k5jkc.so(2213256=GoldfishProfiler) → libGfxPerfCollector.so
  lib456b9nt2vkw78xzlxx.so(104280=SystemCommon)    → libglcommon.so
  lib7c7c8tkjlj.so(3088288=vulkan_enc)             → libvulkanqti.so
  libq892nk5ptwmbggc8xx.so(65480=renderControl)    → librenderctrl.so
  libwpgwctvx5g.so(537936=GLESv2_enc)              → libglesv2qti.so
  libgxvvbxdgj4.so(216416=GLESv1_enc)              → libglesv1qti.so
  libpc24gwzjqm.so(≡libqti_adreno.so md5)          → 삭제, NEEDS→libqti_adreno.so
참조자(패치 대상): egl/{EGL,GLESv1_CM,GLESv2}_{adreno,emulation} + hw/{mapper@3.0-impl-qti,hwcomposer.ranchu,vulkan.qcom}
  ★ hw/ 포함 전수 스캔 필수 (S155 실측: hw/ 빠뜨리면 SF 다운)
배포 후: chown root:root 644, chcon vendor_file(루트)/same_process_hal_file(egl·hw), sync, stop;start.
A/B 결과(S155): 11s 불변 — 비인과. 그러나 실기기 충실도 향상으로 유지.
"""
RENAME = {
 'libcf2rn4pmt62k5jkc.so': 'libGfxPerfCollector.so',
 'lib456b9nt2vkw78xzlxx.so':'libglcommon.so',
 'lib7c7c8tkjlj.so':        'libvulkanqti.so',
 'libq892nk5ptwmbggc8xx.so':'librenderctrl.so',
 'libwpgwctvx5g.so':        'libglesv2qti.so',
 'libgxvvbxdgj4.so':        'libglesv1qti.so',
 'libpc24gwzjqm.so':        'libqti_adreno.so',
}
# 구현은 S155 세션 로그 참조 (strtab_region + preceding-null 동일길이 치환)
