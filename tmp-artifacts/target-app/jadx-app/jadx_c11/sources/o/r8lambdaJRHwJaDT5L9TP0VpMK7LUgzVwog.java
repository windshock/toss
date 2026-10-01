package o;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaJRHwJaDT5L9TP0VpMK7LUgzVwog {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    public static final r8lambdaJRHwJaDT5L9TP0VpMK7LUgzVwog onExtraCallbackWithResult = new r8lambdaJRHwJaDT5L9TP0VpMK7LUgzVwog();
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onWarmupCompleted + 9;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private r8lambdaJRHwJaDT5L9TP0VpMK7LUgzVwog() {
    }

    public final Context onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Context contextOnWarmupCompleted = getTcfVendorConsentStatus.Companion.onWarmupCompleted();
        if (i3 != 0) {
            int i4 = 66 / 0;
        }
        return contextOnWarmupCompleted;
    }

    public final Resources onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Resources resourcesIAuthTabCallback_Parcel = getTcfVendorConsentStatus.Companion.IAuthTabCallback_Parcel();
        int i4 = onNavigationEvent + 107;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return resourcesIAuthTabCallback_Parcel;
    }

    public final TypedValue onNavigationEvent(int i, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 49;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            CameraConfigExternalSyntheticLambda0.asBinder();
            throw null;
        }
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(851303611, i2, -1, "im.toss.tds.compose.Tds.resolveResourcePath (Tds.kt:37)");
            int i5 = onNavigationEvent + 27;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        TypedValue typedValueOnExtraCallback = r8lambdaXwd13T63EBu9OBtTqaV7FJQdJMw.onNavigationEvent.onExtraCallback(i, cameraCaptureResultEmptyCameraCaptureResult, (i2 & 14) | 48);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i7 = onNavigationEvent + 53;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i9 = onNavigationEvent + 93;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
        }
        return typedValueOnExtraCallback;
    }
}
