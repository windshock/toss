package o;

import androidx.compose.foundation.layout.RowScope;
import im.toss.features.loan.ComposableSingletons$LoanBaseActivityKt$;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getAppxProxyHost {
    private static int asInterface = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public static final getAppxProxyHost IAuthTabCallback = new getAppxProxyHost();
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted = ForwardingCameraControl.onExtraCallbackWithResult(1533584155, false, new ComposableSingletons$LoanBaseActivityKt$.ExternalSyntheticLambda0());

    public static /* synthetic */ Unit onWarmupCompleted(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 89;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 25;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public final getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onWarmupCompleted;
        int i5 = i3 + 35;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    static {
        int i = onExtraCallback + 121;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    private static final Unit onExtraCallback(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            z = true;
        } else {
            int i3 = onExtraCallbackWithResult + 115;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i5 = onExtraCallbackWithResult + 115;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onNavigationEvent + 31;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1533584155, i, -1, "im.toss.features.loan.ComposableSingletons$LoanBaseActivityKt.lambda$1533584155.<anonymous> (LoanBaseActivity.kt:256)");
                int i9 = onExtraCallbackWithResult + 37;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }
}
