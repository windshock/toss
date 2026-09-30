package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getMaxAdCount {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public static final long onNavigationEvent(long j, float f) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        long jOnExtraCallbackWithResult = setByteOrder.onExtraCallbackWithResult(j, f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        int i4 = onNavigationEvent + 81;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return jOnExtraCallbackWithResult;
    }

    public static final long onExtraCallbackWithResult(long j, float f) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        long jOnExtraCallbackWithResult = setByteOrder.onExtraCallbackWithResult(j, setByteOrder.onWarmupCompleted(j) * f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        int i4 = onExtraCallback + 113;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 79 / 0;
        }
        return jOnExtraCallbackWithResult;
    }

    public static final long IAuthTabCallback(@NotNull MaxAdPlacerExternalSyntheticLambda2 maxAdPlacerExternalSyntheticLambda2, @NotNull String str, long j, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(maxAdPlacerExternalSyntheticLambda2, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = onExtraCallback + 65;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-362238892, i, -1, "im.toss.tds.compose.foundation.color.parseColor (TdsPalettes.kt:31)");
        }
        long jOnExtraCallbackWithResult = onExtraCallbackWithResult(maxAdPlacerExternalSyntheticLambda2, str, j, y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).AudioAttributesCompatParcelizer());
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i5 = onExtraCallback + 1;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }
        return jOnExtraCallbackWithResult;
    }

    public static final long onExtraCallbackWithResult(@NotNull MaxAdPlacerExternalSyntheticLambda2 maxAdPlacerExternalSyntheticLambda2, @NotNull String str, long j, @NotNull getSpecialFeatureOptInStatus getspecialfeatureoptinstatus) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(maxAdPlacerExternalSyntheticLambda2, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(getspecialfeatureoptinstatus, "");
        Integer numOnWarmupCompleted = updateokhttp.onExtraCallback.onWarmupCompleted(str, getspecialfeatureoptinstatus);
        if (numOnWarmupCompleted == null) {
            return j;
        }
        int i2 = onExtraCallback + 61;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        long jOnExtraCallback = ByteOrderedDataOutputStream.onExtraCallback(numOnWarmupCompleted.intValue());
        int i4 = onNavigationEvent + 51;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return jOnExtraCallback;
    }

    public static final long IAuthTabCallback(@NotNull CipherSuiteCompanion cipherSuiteCompanion, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 7;
        onExtraCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(cipherSuiteCompanion, "");
            CameraConfigExternalSyntheticLambda0.asBinder();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(cipherSuiteCompanion, "");
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1377043172, i, -1, "im.toss.tds.compose.foundation.color.<get-value> (TdsPalettes.kt:40)");
        }
        long jOnExtraCallback = ByteOrderedDataOutputStream.onExtraCallback(cipherSuiteCompanion.onNavigationEvent(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).AudioAttributesCompatParcelizer()));
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i4 = onExtraCallback + 91;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i5 != 0) {
                throw null;
            }
        }
        return jOnExtraCallback;
    }
}
