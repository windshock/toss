package o;

import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.fromKilometersPerHour;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFf1lSDK5 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static final void onWarmupCompleted(@NotNull setOrientationDegrees setorientationdegrees, @Nullable Double d, @NotNull CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6, @Nullable SurfaceProcessorNodeOut surfaceProcessorNodeOut, @NotNull Pair<Double, Double> pair, @NotNull DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, long j, long j2) throws Throwable {
        Throwable th;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        Intrinsics.checkNotNullParameter(cameraPresenceProviderExternalSyntheticLambda6, "");
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        if (d == null || Intrinsics.areEqual(d, 0.0d)) {
            th = null;
            i = 2;
        } else {
            int i3 = onWarmupCompleted + 1;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            double dDoubleValue = pair.getFirst().doubleValue();
            double dDoubleValue2 = pair.getSecond().doubleValue();
            float fOnExtraCallback = setorientationdegrees.onExtraCallback(y1ExternalSyntheticLambda8.onExtraCallbackWithResult(deviceQuirksExternalSyntheticLambda0));
            double d2 = (r3 - fOnExtraCallback) / (dDoubleValue2 - dDoubleValue);
            float fIntBitsToFloat = (float) ((Float.intBitsToFloat((int) setorientationdegrees.onTransact()) - setorientationdegrees.onExtraCallback(y1ExternalSyntheticLambda8.onWarmupCompleted(deviceQuirksExternalSyntheticLambda0))) - ((d.doubleValue() - dDoubleValue) * d2));
            if (((Boolean) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).booleanValue() && surfaceProcessorNodeOut != null) {
                int i5 = onNavigationEvent + 103;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                long jAsBinder = surfaceProcessorNodeOut.asBinder();
                float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (setorientationdegrees.onTransact() >> 32)) - ((int) (jAsBinder >> 32))) - setorientationdegrees.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f));
                long jIAuthTabCallback = setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L));
                long jIAuthTabCallback2 = setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(fIntBitsToFloat2) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L));
                fromKilometersPerHour.onExtraCallbackWithResult onextracallbackwithresult = fromKilometersPerHour.Companion;
                setOrientationDegrees.onExtraCallback(setorientationdegrees, j2, jIAuthTabCallback, jIAuthTabCallback2, 1.0f, 0, fromKilometersPerHour.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, new float[]{setorientationdegrees.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(3.0f)), setorientationdegrees.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f))}, 0.0f, 2, (Object) null), 0.0f, (seek) null, 0, 464, (Object) null);
                float f = fIntBitsToFloat - (((int) jAsBinder) / 2);
                setOrientationDegrees.onWarmupCompleted(setorientationdegrees, j, setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(fIntBitsToFloat2) << 32) | (Float.floatToRawIntBits(f) & 4294967295L)), ExtensionsManager2.onExtraCallback(jAsBinder), 0.0f, (hasMoreElements) null, (seek) null, 0, 120, (Object) null);
                getProcessor.onExtraCallbackWithResult(setorientationdegrees, surfaceProcessorNodeOut, 0L, setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(fIntBitsToFloat2) << 32) | (Float.floatToRawIntBits(f) & 4294967295L)), 0.0f, (ExifSpeedConverter) null, (bindChildren) null, (hasMoreElements) null, 0, 250, (Object) null);
                setOrientationDegrees.onExtraCallback(setorientationdegrees, j2, setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(Float.intBitsToFloat((int) (setorientationdegrees.onTransact() >> 32)) - setorientationdegrees.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f))) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L)), setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(Float.intBitsToFloat((int) (setorientationdegrees.onTransact() >> 32))) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L)), 1.0f, 0, fromKilometersPerHour.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, new float[]{setorientationdegrees.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(3.0f)), setorientationdegrees.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f))}, 0.0f, 2, (Object) null), 0.0f, (seek) null, 0, 464, (Object) null);
                return;
            }
            i = 2;
            th = null;
            setOrientationDegrees.onExtraCallback(setorientationdegrees, j2, setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L)), setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(Float.intBitsToFloat((int) (setorientationdegrees.onTransact() >> 32))) << 32) | (Float.floatToRawIntBits((float) (r3 - ((d.doubleValue() - dDoubleValue) * d2))) & 4294967295L)), 1.0f, 0, fromKilometersPerHour.onExtraCallbackWithResult.onExtraCallbackWithResult(fromKilometersPerHour.Companion, new float[]{setorientationdegrees.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(3.0f)), setorientationdegrees.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f))}, 0.0f, 2, (Object) null), 0.0f, (seek) null, 0, 464, (Object) null);
        }
        int i7 = onNavigationEvent + 51;
        onWarmupCompleted = i7 % 128;
        if (i7 % i != 0) {
            return;
        }
        th.hashCode();
        throw th;
    }

    public static final void IAuthTabCallback(@NotNull setOrientationDegrees setorientationdegrees, @NotNull Pair<Double, Double> pair, @NotNull DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, double d, @NotNull SurfaceProcessorNodeOut surfaceProcessorNodeOut, long j, long j2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(surfaceProcessorNodeOut, "");
        double dDoubleValue = pair.getFirst().doubleValue();
        double dDoubleValue2 = pair.getSecond().doubleValue();
        float fOnExtraCallback = setorientationdegrees.onExtraCallback(y1ExternalSyntheticLambda8.onExtraCallbackWithResult(deviceQuirksExternalSyntheticLambda0));
        float fIntBitsToFloat = (float) ((Float.intBitsToFloat((int) setorientationdegrees.onTransact()) - setorientationdegrees.onExtraCallback(y1ExternalSyntheticLambda8.onWarmupCompleted(deviceQuirksExternalSyntheticLambda0))) - ((d - dDoubleValue) * ((r6 - fOnExtraCallback) / (dDoubleValue2 - dDoubleValue))));
        int iAsBinder = (int) surfaceProcessorNodeOut.asBinder();
        float f = iAsBinder;
        int iOnExtraCallbackWithResult = setorientationdegrees.onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f));
        int iOnExtraCallbackWithResult2 = setorientationdegrees.onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f));
        float fOnExtraCallbackWithResult = setorientationdegrees.onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f));
        float f2 = iAsBinder + (iOnExtraCallbackWithResult2 << 1);
        long jOnWarmupCompleted = setUseCaseDetached.onWarmupCompleted((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(((int) (r0 >> 32)) + (iOnExtraCallbackWithResult << 1)) << 32));
        setOrientationDegrees.onExtraCallback(setorientationdegrees, j2, setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L)), setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(Float.intBitsToFloat((int) (setorientationdegrees.onTransact() >> 32))) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L)), fOnExtraCallbackWithResult, 0, (fromKilometersPerHour) null, 0.0f, (seek) null, 0, 496, (Object) null);
        long jOnExtraCallback = getAttachedUseCaseConfigs.onExtraCallback((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
        int i2 = (int) jOnWarmupCompleted;
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2) / 2.0f;
        setOrientationDegrees.onWarmupCompleted(setorientationdegrees, j, setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat - fIntBitsToFloat2) & 4294967295L)), jOnWarmupCompleted, jOnExtraCallback, (hasMoreElements) null, 0.0f, (seek) null, 0, 240, (Object) null);
        long jOnExtraCallback2 = getAttachedUseCaseConfigs.onExtraCallback((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
        ExifOutputStream exifOutputStream = new ExifOutputStream(fOnExtraCallbackWithResult, 0.0f, 0, 0, (fromKilometersPerHour) null, 30, (DefaultConstructorMarker) null);
        float fIntBitsToFloat3 = Float.intBitsToFloat(i2) / 2.0f;
        setOrientationDegrees.onWarmupCompleted(setorientationdegrees, j2, setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat - fIntBitsToFloat3) & 4294967295L)), jOnWarmupCompleted, jOnExtraCallback2, exifOutputStream, 0.0f, (seek) null, 0, BERTags.FLAGS, (Object) null);
        getProcessor.onExtraCallbackWithResult(setorientationdegrees, surfaceProcessorNodeOut, 0L, setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(iOnExtraCallbackWithResult) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat - (f / 2.0f)) & 4294967295L)), 0.0f, (ExifSpeedConverter) null, (bindChildren) null, (hasMoreElements) null, 0, 250, (Object) null);
        int i3 = onWarmupCompleted + 75;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }
}
