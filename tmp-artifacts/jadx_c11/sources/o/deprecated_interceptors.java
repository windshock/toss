package o;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class deprecated_interceptors {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static final boolean onWarmupCompleted(@NotNull deprecated_followRedirects deprecated_followredirects, @Nullable Context context, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        boolean zOnWarmupCompleted;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(deprecated_followredirects, "");
        if ((i2 & 1) != 0) {
            int i4 = onWarmupCompleted + 67;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            context = (Context) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
        }
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i6 = onNavigationEvent + 105;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(323641652, i, -1, "im.toss.tds.resources.isMonoIcon (TdsImageResourceCompose.kt:14)");
        }
        if (deprecated_followredirects instanceof accessgetDEFAULT_PROTOCOLScp) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1781986466);
            zOnWarmupCompleted = MultipartReaderPartSource.onExtraCallback(OkHttp.onExtraCallback, ((accessgetDEFAULT_PROTOCOLScp) deprecated_followredirects).onNavigationEvent(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        } else if (!(!(deprecated_followredirects instanceof verifyClientState))) {
            int i8 = onNavigationEvent + 55;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1781987970);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                accessgetSslSocketFactoryOrNullp.onWarmupCompleted(OkHttp.onExtraCallback, ((verifyClientState) deprecated_followredirects).onExtraCallback());
                throw null;
            }
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1781987970);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            zOnWarmupCompleted = accessgetSslSocketFactoryOrNullp.onWarmupCompleted(OkHttp.onExtraCallback, ((verifyClientState) deprecated_followredirects).onExtraCallback());
        } else {
            if (!(deprecated_followredirects instanceof deprecated_cookieJar)) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1781985131);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                throw new NoWhenBranchMatchedException();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1781990151);
            zOnWarmupCompleted = onWarmupCompleted(((deprecated_cookieJar) deprecated_followredirects).onExtraCallbackWithResult(context), context, cameraCaptureResultEmptyCameraCaptureResult, i & 112, 0);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return zOnWarmupCompleted;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean onExtraCallback(@NotNull deprecated_followRedirects deprecated_followredirects, @Nullable Context context, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        boolean zOnExtraCallback;
        int i3;
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 105;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            Intrinsics.checkNotNullParameter(deprecated_followredirects, "");
            if ((i2 & 1) != 0) {
                context = (Context) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
            }
        } else {
            Intrinsics.checkNotNullParameter(deprecated_followredirects, "");
            if ((i2 & 1) != 0) {
            }
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(205517440, i, -1, "im.toss.tds.resources.isSystemIcon (TdsImageResourceCompose.kt:23)");
        }
        if (deprecated_followredirects instanceof accessgetDEFAULT_PROTOCOLScp) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-66231504);
            zOnExtraCallback = MultipartReaderPartSource.onWarmupCompleted(OkHttp.onExtraCallback, ((accessgetDEFAULT_PROTOCOLScp) deprecated_followredirects).onNavigationEvent(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            i3 = onWarmupCompleted + 111;
        } else {
            if (!(deprecated_followredirects instanceof verifyClientState)) {
                if (!(deprecated_followredirects instanceof deprecated_cookieJar)) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-66232835);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    throw new NoWhenBranchMatchedException();
                }
                int i6 = onNavigationEvent + 115;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-66227691);
                zOnExtraCallback = onExtraCallback(((deprecated_cookieJar) deprecated_followredirects).onExtraCallbackWithResult(context), context, cameraCaptureResultEmptyCameraCaptureResult, i & 112, 0);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    int i8 = onWarmupCompleted + 91;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                return zOnExtraCallback;
            }
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-66229936);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            zOnExtraCallback = accessgetSslSocketFactoryOrNullp.onExtraCallbackWithResult(OkHttp.onExtraCallback, ((verifyClientState) deprecated_followredirects).onExtraCallback());
            i3 = onWarmupCompleted + 99;
        }
        onNavigationEvent = i3 % 128;
        int i10 = i3 % 2;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
        }
        return zOnExtraCallback;
    }
}
