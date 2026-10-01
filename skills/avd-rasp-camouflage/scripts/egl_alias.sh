#!/system/bin/sh
# egl_alias.sh — ro.hardware.egl=adreno를 쓰면서 GL이 죽지 않게 하는 셋업 (루트 필요)
# 원리: /vendor/lib64/egl을 tmpfs로 쉐도잉하고 원본 6개 lib + adreno 별칭(emulation 심볼릭
# 링크)을 채운다. 재부팅하면 사라지므로 재실행 필요. 이후 프레임워크 재시작(stop;start)으로
# 앱들이 새 마운트 네임스페이스를 상속하게 한다.
set -e
EGL=/vendor/lib64/egl
STAGE=/dev/.egl_stage

mkdir -p $STAGE
cp $EGL/*.so $STAGE/
mount -t tmpfs tmpfs $EGL
cp $STAGE/*.so $EGL/
ln -sf libEGL_emulation.so       $EGL/libEGL_adreno.so
ln -sf libGLESv1_CM_emulation.so $EGL/libGLESv1_CM_adreno.so
ln -sf libGLESv2_emulation.so    $EGL/libGLESv2_adreno.so
chmod 644 $EGL/*.so
echo "[egl_alias] mounted + aliased:"
ls $EGL/
