#!/system/bin/sh
# .camow.sh — LKM v3 위장 파일(/dev/.*) 내용 유지 루프 (adb shell로 nohup 실행)
# 셸(uid 2000)은 LKM uid 게이트 밖이라 실제 /proc을 읽는다.
PKG=net.ib.android.smcard

while true; do
  PID=$(pidof $PKG | cut -d' ' -f1)
  if [ -n "$PID" ]; then
    grep -vE 'frida|gum|\.rs9|linjector' /proc/$PID/maps > /dev/.m 2>/dev/null
    sed 's/TracerPid:.*/TracerPid:\t0/' /proc/$PID/status > /dev/.s 2>/dev/null
    grep -vE 'frida|\.rs9|gum' /proc/net/unix > /dev/.u 2>/dev/null
    grep -vE 'frida|\.rs9|gum|:69A2|:BAA1' /proc/net/tcp > /dev/.t 2>/dev/null
    grep -vE 'magisk|/data/adb' /proc/$PID/mounts > /dev/.k 2>/dev/null
  else
    : > /dev/.m; : > /dev/.s; : > /dev/.k
  fi
  printf 'Processor\t: AArch64 Processor rev 1 (aarch64)\nprocessor\t: 0\nBogoMIPS\t: 38.40\nFeatures\t: fp asimd evtstrm aes pmull sha1 sha2 crc32\nCPU implementer\t: 0x51\nCPU architecture: 8\nCPU variant\t: 0xd\nCPU part\t: 0x001\nHardware\t: Qualcomm Technologies, Inc SM8550\n' > /dev/.c
  echo 'Linux version 5.15.104-android13-4-00001-gXXXXXX-ab12345678 (build@buildhost) (clang version 17.0.0) #1 SMP PREEMPT Thu Jun 15 09:12:34 UTC 2023' > /dev/.v
  echo '.android.smcard' > /dev/.n
  : > /dev/.e
  chmod 644 /dev/.m /dev/.s /dev/.u /dev/.t /dev/.k /dev/.c /dev/.v /dev/.n /dev/.e 2>/dev/null
  sleep 2
done
