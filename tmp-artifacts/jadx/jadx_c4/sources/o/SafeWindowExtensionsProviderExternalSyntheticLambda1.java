package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class SafeWindowExtensionsProviderExternalSyntheticLambda1 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final hasProvider onNavigationEvent(@NotNull String str, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 115;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            CameraConfigExternalSyntheticLambda0.asBinder();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i4 = IAuthTabCallback + 119;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1757661514, i, -1, "im.toss.ads_sdk.ui.compose.bps.rememberBpsHtml (NativeAdsBpsHtmlText.kt:16)");
        }
        boolean z = true;
        if (((i & 14) ^ 6) > 4) {
            int i6 = onWarmupCompleted + 55;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str)) {
                if ((i & 6) != 4) {
                    z = false;
                }
            }
        }
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!z) {
            int i8 = onWarmupCompleted + 3;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = IAuthTabCallback(str);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
        }
        hasProvider hasproviderOnNavigationEvent = AppLovinCmpErrorCode.onNavigationEvent((String) objOnMinimized, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 2);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i10 = IAuthTabCallback + 23;
        onWarmupCompleted = i10 % 128;
        if (i10 % 2 != 0) {
            return hasproviderOnNavigationEvent;
        }
        throw null;
    }

    public static final String IAuthTabCallback(@NotNull String str) {
        String strReplace$default;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            strReplace$default = StringsKt.replace$default(str, "\n", "<br>", false, 4, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            strReplace$default = StringsKt.replace$default(str, "\n", "<br>", false, 4, (Object) null);
        }
        int i3 = onWarmupCompleted + 93;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return strReplace$default;
    }

    public static final hasProvider onExtraCallback(@Nullable String str, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        String str2;
        int i2 = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-770786400, i, -1, "im.toss.ads_sdk.ui.compose.bps.rememberBpsHtmlOrNull (NativeAdsBpsHtmlText.kt:26)");
        }
        if (str == null) {
            int i3 = IAuthTabCallback + 65;
            onWarmupCompleted = i3 % 128;
            str2 = "";
            if (i3 % 2 == 0) {
                int i4 = 85 / 0;
            }
        } else {
            str2 = str;
        }
        hasProvider hasproviderOnNavigationEvent = onNavigationEvent(str2, cameraCaptureResultEmptyCameraCaptureResult, 0);
        if (str == null) {
            int i5 = onWarmupCompleted + 33;
            IAuthTabCallback = i5 % 128;
            hasproviderOnNavigationEvent = null;
            if (i5 % 2 != 0) {
                int i6 = 92 / 0;
            }
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i7 = onWarmupCompleted + 29;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
        }
        return hasproviderOnNavigationEvent;
    }
}
