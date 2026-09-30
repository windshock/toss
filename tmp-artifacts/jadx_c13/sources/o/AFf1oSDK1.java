package o;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgcodecs.Imgcodecs;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFf1oSDK1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static final Map<Integer, setUseCaseAttached> onNavigationEvent = new LinkedHashMap();
    private static int onWarmupCompleted = 1;

    static {
        int i = IAuthTabCallback + 55;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 48 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0237 A[PHI: r12
      0x0237: PHI (r12v11 boolean) = (r12v9 boolean), (r12v12 boolean) binds: [B:139:0x0235, B:135:0x022b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02cb A[PHI: r5
      0x02cb: PHI (r5v22 float) = (r5v19 float), (r5v26 float), (r5v27 float) binds: [B:180:0x02c9, B:176:0x02c0, B:173:0x02b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> AFf1oSDK5<T> onWarmupCompleted(@NotNull Function1<? super AFf1mSDK<T>, setByteOrder> function1, @Nullable Pair<Double, Double> pair, @Nullable Integer num, float f, int i, @Nullable fromKilometersPerHour fromkilometersperhour, float f2, @Nullable seek seekVar, int i2, boolean z, long j, @Nullable CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6, @Nullable CameraPresenceProviderExternalSyntheticLambda6<SurfaceProcessorNodeOut> cameraPresenceProviderExternalSyntheticLambda62, @Nullable DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, float f3, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3, int i4, int i5) {
        Pair<Double, Double> pairIAuthTabCallback;
        float f4;
        boolean z2;
        boolean z3;
        long jIAuthTabCallback;
        CameraPresenceProviderExternalSyntheticLambda6<SurfaceProcessorNodeOut> cameraPresenceProviderExternalSyntheticLambda63;
        CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6OnWarmupCompleted;
        float f5;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        float f6;
        Object objOnMinimized;
        int i6 = 2 % 2;
        int i7 = onWarmupCompleted + 75;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        if ((i5 & 2) != 0) {
            int i9 = onExtraCallbackWithResult + 41;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            pairIAuthTabCallback = getWrite.IAuthTabCallback(Double.valueOf(0.0d), Double.valueOf(1.0d));
        } else {
            pairIAuthTabCallback = pair;
        }
        Integer num2 = (i5 & 4) != 0 ? null : num;
        float f7 = (i5 & 8) != 0 ? 6.0f : f;
        int iOnExtraCallbackWithResult = (i5 & 16) != 0 ? createByte.Companion.onExtraCallbackWithResult() : i;
        fromKilometersPerHour fromkilometersperhour2 = (i5 & 32) != 0 ? null : fromkilometersperhour;
        if ((i5 & 64) != 0) {
            int i11 = onWarmupCompleted + 105;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
            f4 = 1.0f;
        } else {
            f4 = f2;
        }
        seek seekVar2 = (i5 & 128) != 0 ? null : seekVar;
        int iOnExtraCallbackWithResult2 = (i5 & 256) != 0 ? setOrientationDegrees.Companion.onExtraCallbackWithResult() : i2;
        boolean z13 = false;
        if ((i5 & Imgcodecs.IMWRITE_AVIF_QUALITY) != 0) {
            int i13 = onExtraCallbackWithResult + 125;
            onWarmupCompleted = i13 % 128;
            int i14 = i13 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i5 & 1024) != 0) {
            int i15 = onWarmupCompleted + 77;
            z3 = z2;
            onExtraCallbackWithResult = i15 % 128;
            int i16 = i15 % 2;
            jIAuthTabCallback = setByteOrder.Companion.IAuthTabCallback();
        } else {
            z3 = z2;
            jIAuthTabCallback = j;
        }
        if ((i5 & 2048) != 0) {
            cameraPresenceProviderExternalSyntheticLambda63 = null;
            cameraPresenceProviderExternalSyntheticLambda6OnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        } else {
            cameraPresenceProviderExternalSyntheticLambda63 = null;
            cameraPresenceProviderExternalSyntheticLambda6OnWarmupCompleted = cameraPresenceProviderExternalSyntheticLambda6;
        }
        if ((i5 & 4096) == 0) {
            cameraPresenceProviderExternalSyntheticLambda63 = cameraPresenceProviderExternalSyntheticLambda62;
        }
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnExtraCallback = (i5 & TTHistoryActivity2.SIZE) != 0 ? CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f)) : deviceQuirksExternalSyntheticLambda0;
        float fIAuthTabCallback = (i5 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f) : f3;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            f5 = fIAuthTabCallback;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1905900643, i3, i4, "im.toss.tosssecurities.uikit.chart.line.rememberLineChartDrawer (LineChartDrawer.kt:342)");
        } else {
            f5 = fIAuthTabCallback;
        }
        long jOnNavigationEvent = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).onNavigationEvent();
        boolean z14 = (((i3 & 14) ^ 6) > 4 && cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1)) || (i3 & 6) == 4;
        boolean z15 = (((i3 & 112) ^ 48) > 32 && cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(pairIAuthTabCallback)) || (i3 & 48) == 32;
        Pair<Double, Double> pair2 = pairIAuthTabCallback;
        if (((i3 & 896) ^ 384) > 256) {
            int i17 = onExtraCallbackWithResult + 57;
            onWarmupCompleted = i17 % 128;
            int i18 = i17 % 2;
            if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(num2)) {
                z4 = (i3 & 384) == 256;
            }
        }
        Integer num3 = num2;
        boolean z16 = (((i3 & 7168) ^ 3072) > 2048 && cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(f7)) || (i3 & 3072) == 2048;
        float f8 = f7;
        boolean z17 = (((i3 & 57344) ^ 24576) > 16384 && cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iOnExtraCallbackWithResult)) || (i3 & 24576) == 16384;
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(fromkilometersperhour2);
        fromKilometersPerHour fromkilometersperhour3 = fromkilometersperhour2;
        int i19 = iOnExtraCallbackWithResult;
        if (((i3 & 3670016) ^ 1572864) > 1048576) {
            int i20 = onExtraCallbackWithResult + 43;
            onWarmupCompleted = i20 % 128;
            if (i20 % 2 == 0) {
                int i21 = 91 / 0;
                if (!cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(f4)) {
                    z5 = (i3 & 1572864) == 1048576;
                }
            } else if (!cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(f4)) {
            }
        }
        float f9 = f4;
        boolean z18 = (((29360128 & i3) ^ 12582912) > 8388608 && cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(seekVar2)) || (12582912 & i3) == 8388608;
        seek seekVar3 = seekVar2;
        if (((234881024 & i3) ^ 100663296) > 67108864) {
            int i22 = onExtraCallbackWithResult + 95;
            onWarmupCompleted = i22 % 128;
            int i23 = i22 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(iOnExtraCallbackWithResult2)) {
                z6 = true;
            } else if ((100663296 & i3) != 67108864) {
                z6 = false;
            }
        }
        int i24 = iOnExtraCallbackWithResult2;
        if (((1879048192 & i3) ^ 805306368) > 536870912) {
            z7 = z3;
            if (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(z7)) {
                z8 = true;
            }
            z9 = z8 | z15 | z14 | z4 | z16 | z17 | zOnNavigationEvent | z5 | z18 | z6;
            long j2 = jIAuthTabCallback;
            z10 = (((i4 & 14) ^ 6) <= 4 && cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(j2)) || (i4 & 6) == 4;
            if (((i4 & 896) ^ 384) <= 256) {
                int i25 = onExtraCallbackWithResult + 17;
                onWarmupCompleted = i25 % 128;
                int i26 = i25 % 2;
                if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda63)) {
                    z11 = (i4 & 384) == 256;
                }
            }
            z12 = (((i4 & 7168) ^ 3072) <= 2048 && cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0OnExtraCallback)) || (i4 & 3072) == 2048;
            if (((i4 & 57344) ^ 24576) <= 16384) {
                int i27 = onWarmupCompleted + 59;
                onExtraCallbackWithResult = i27 % 128;
                if (i27 % 2 != 0) {
                    f6 = f5;
                    int i28 = 61 / 0;
                    if (cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(f6)) {
                        z13 = true;
                    }
                } else {
                    f6 = f5;
                    if (!cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(f6)) {
                    }
                }
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if ((z9 | z10 | z11 | z12 | z13) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new AFf1oSDK5(num3, function1, pair2, f8, i19, fromkilometersperhour3, f9, seekVar3, i24, deviceQuirksExternalSyntheticLambda0OnExtraCallback, f6, z7, jOnNavigationEvent, j2, cameraPresenceProviderExternalSyntheticLambda6OnWarmupCompleted, cameraPresenceProviderExternalSyntheticLambda63, null);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                AFf1oSDK5<T> aFf1oSDK5 = (AFf1oSDK5) objOnMinimized;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                return aFf1oSDK5;
            }
            f6 = f5;
            if ((i4 & 24576) == 16384) {
            }
            objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (z9 | z10 | z11 | z12 | z13) {
                objOnMinimized = new AFf1oSDK5(num3, function1, pair2, f8, i19, fromkilometersperhour3, f9, seekVar3, i24, deviceQuirksExternalSyntheticLambda0OnExtraCallback, f6, z7, jOnNavigationEvent, j2, cameraPresenceProviderExternalSyntheticLambda6OnWarmupCompleted, cameraPresenceProviderExternalSyntheticLambda63, null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            AFf1oSDK5<T> aFf1oSDK52 = (AFf1oSDK5) objOnMinimized;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            }
            return aFf1oSDK52;
        }
        z7 = z3;
        if ((i3 & 805306368) != 536870912) {
            z8 = false;
        }
        z9 = z8 | z15 | z14 | z4 | z16 | z17 | zOnNavigationEvent | z5 | z18 | z6;
        long j22 = jIAuthTabCallback;
        if (((i4 & 14) ^ 6) <= 4) {
        }
        if (((i4 & 896) ^ 384) <= 256) {
        }
        if (((i4 & 7168) ^ 3072) <= 2048) {
        }
        if (((i4 & 57344) ^ 24576) <= 16384) {
        }
        if ((i4 & 24576) == 16384) {
        }
        objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (z9 | z10 | z11 | z12 | z13) {
        }
        AFf1oSDK5<T> aFf1oSDK522 = (AFf1oSDK5) objOnMinimized;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
        }
        return aFf1oSDK522;
    }
}
