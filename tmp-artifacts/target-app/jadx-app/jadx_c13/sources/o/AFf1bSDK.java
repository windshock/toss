package o;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.AFf1jSDK;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class AFf1bSDK<T extends AFf1jSDK> {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public void IAuthTabCallback(@NotNull setOrientationDegrees setorientationdegrees, @Nullable AFf1gSDK<T> aFf1gSDK) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        int i4 = onExtraCallbackWithResult + 103;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public abstract List<AFf1fSDK<T>> onExtraCallback();

    public abstract void onExtraCallback(@NotNull setOrientationDegrees setorientationdegrees, @NotNull List<? extends T> list, @Nullable Double d);

    public void onExtraCallbackWithResult(@NotNull setOrientationDegrees setorientationdegrees, @Nullable AFf1gSDK<T> aFf1gSDK) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        if (i3 != 0) {
            int i4 = 62 / 0;
        }
    }

    public void onExtraCallbackWithResult(@NotNull setOrientationDegrees setorientationdegrees, @Nullable T t, @NotNull Function0<Float> function0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        Intrinsics.checkNotNullParameter(function0, "");
        int i4 = onExtraCallbackWithResult + 27;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 83 / 0;
        }
    }

    public void onExtraCallbackWithResult(@NotNull setOrientationDegrees setorientationdegrees, @NotNull SurfaceProcessorNodeOut surfaceProcessorNodeOut, @Nullable Double d, @NotNull String str, long j, long j2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        Intrinsics.checkNotNullParameter(surfaceProcessorNodeOut, "");
        Intrinsics.checkNotNullParameter(str, "");
        int i4 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGBA_YVYU;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final float onWarmupCompleted(@NotNull setOrientationDegrees setorientationdegrees, float f, @NotNull Map<Float, Float> map) {
        float fOnExtraCallback;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setorientationdegrees, "");
            Intrinsics.checkNotNullParameter(map, "");
            map.get(Float.valueOf(f));
            throw null;
        }
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        Intrinsics.checkNotNullParameter(map, "");
        Float f2 = map.get(Float.valueOf(f));
        if (f2 != null) {
            return f2.floatValue();
        }
        if (f <= setorientationdegrees.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(5.0f))) {
            int i3 = onExtraCallback + 67;
            onExtraCallbackWithResult = i3 % 128;
            fOnExtraCallback = i3 % 2 == 0 ? f % 8.0f : f / 8.0f;
        } else {
            fOnExtraCallback = setorientationdegrees.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f));
        }
        map.put(Float.valueOf(f), Float.valueOf(fOnExtraCallback));
        return fOnExtraCallback;
    }
}
