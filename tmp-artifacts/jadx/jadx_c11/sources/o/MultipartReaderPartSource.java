package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MultipartReaderPartSource {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public static final boolean onExtraCallback(@NotNull OkHttp okHttp, int i, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        String string;
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 105;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i6 = onWarmupCompleted + 43;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(685026982, i2, -1, "im.toss.tds.icon.isMonoIcon (TdsIconsCompose.kt:14)");
        }
        CharSequence charSequence = r8lambdaJRHwJaDT5L9TP0VpMK7LUgzVwog.onExtraCallbackWithResult.onNavigationEvent(i, cameraCaptureResultEmptyCameraCaptureResult, ((i2 >> 3) & 14) | 48).string;
        if (charSequence != null) {
            int i8 = onExtraCallbackWithResult + 103;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            string = charSequence.toString();
        } else {
            int i10 = onExtraCallbackWithResult + 63;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            string = null;
        }
        boolean zIAuthTabCallback = accessgetSslSocketFactoryOrNullp.IAuthTabCallback(okHttp, string);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i12 = onWarmupCompleted + 89;
        onExtraCallbackWithResult = i12 % 128;
        int i13 = i12 % 2;
        return zIAuthTabCallback;
    }

    public static final boolean onWarmupCompleted(@NotNull OkHttp okHttp, int i, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 67;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(okHttp, "");
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i6 = onExtraCallbackWithResult + 85;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-369415270, i2, -1, "im.toss.tds.icon.isSystemIcon (TdsIconsCompose.kt:22)");
            int i8 = onExtraCallbackWithResult + 61;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
        }
        CharSequence charSequence = r8lambdaJRHwJaDT5L9TP0VpMK7LUgzVwog.onExtraCallbackWithResult.onNavigationEvent(i, cameraCaptureResultEmptyCameraCaptureResult, ((i2 >> 3) & 14) | 48).string;
        String string = null;
        if (charSequence != null) {
            int i10 = onWarmupCompleted + 73;
            onExtraCallbackWithResult = i10 % 128;
            if (i10 % 2 == 0) {
                charSequence.toString();
                throw null;
            }
            string = charSequence.toString();
        }
        boolean zOnExtraCallback = accessgetSslSocketFactoryOrNullp.onExtraCallback(okHttp, string);
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return zOnExtraCallback;
    }
}
