#!/system/bin/sh
# .eglflip.sh — ro.hardware.egl/vulkan 시차 위장
#   프로세스 기동 직후: emulation (EGL/Vulkan 로더가 GL 라이브러리 찾아야 함)
#   +6초 후: adreno (엔진 getprop 판독용 — 로더는 일회성이라 재안 읽지 않음)
#   앱이 재시작되면 pid 변화를 감지해 반복.
M="/data/local/tmp/magisk resetprop"
PKG=net.ib.android.smcard
LASTPID=""
while true; do
  PID=$(pidof $PKG | cut -d' ' -f1)
  if [ -n "$PID" ] && [ "$PID" != "$LASTPID" ]; then
    $M ro.hardware.egl emulation >/dev/null 2>&1
    $M ro.hardware.vulkan emulation >/dev/null 2>&1
    sleep 6
    $M ro.hardware.egl adreno >/dev/null 2>&1
    $M ro.hardware.vulkan adreno >/dev/null 2>&1
    LASTPID=$PID
  elif [ -z "$PID" ]; then
    LASTPID=""
    $M ro.hardware.egl emulation >/dev/null 2>&1
    $M ro.hardware.vulkan emulation >/dev/null 2>&1
  fi
  sleep 1
done
