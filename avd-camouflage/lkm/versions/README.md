# LKM 버전 아카이브

| 버전 | 파일 | 상태 |
|---|---|---|
| v3.5 | hide_kmod_v35.c | filldir64 방식. "생존 120초+"는 착시 — 탐지 스레드가 readdir 루프에 갇혀 앱 멈춤(참고용) |
| v3.6.2 | hide_kmod_v362.c / .built.ko | getdents64 버퍼 수술. 멈춤 해소했으나 판정 재발 — 미해결(당시) |
| v3.6.4 | hide_kmod_v364_getdents_fix.c | **getdents64 버퍼 버그 수정** — `__arm64_sys_getdents64`는 syscall 래퍼라 dirent 버퍼가 inner pt_regs(`regs[0]`→pt_regs→`regs[1]`)에 있음(기존엔 래퍼 `regs[1]`=쓰레기 읽어 gd_filtered=0). 필터가 처음 작동 |
| v3.6.5 | hide_kmod_v365_driverlib_fix.c | path_blocked/is_goldfish_path에서 드라이버 .so 제외(is_driver_lib) |
| **v3.6.6** | **hide_kmod_v366_so_exclude.c (현행)** | **✅ 원본 모니모 5분+ responsive 생존.** dirent_hidden에서 `.so` 제외(ranchu 매퍼가 열거에서 사라져 "gralloc-mapper is missing" 되던 회귀 해결) + gd_filtered 카운터 버그 수정. egl_alias/egl=adreno 회귀는 스킬 스크립트에서 폐기(SELinux tmpfs 라벨로 GL 전역 파괴) |

빌드: `bash ../build-in-docker.sh` (소스를 hide_kmod.c로 복사 후 실행)
배포: `adb root && adb push <ko> /data/local/tmp/hide_kmod.ko && adb shell "insmod /data/local/tmp/hide_kmod.ko target_uids=<uid 목록>"`
