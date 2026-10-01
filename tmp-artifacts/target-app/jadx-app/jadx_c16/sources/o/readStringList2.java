package o;

import im.toss.features.home.core.ui.compose.dst.ComposableSingletons$HomeAssetActivationBannerKt$;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import o.Guard;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class readStringList2 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onTransact = 1;
    private static int onWarmupCompleted = 1;
    public static final readStringList2 IAuthTabCallback = new readStringList2();
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent = ForwardingCameraControl.onExtraCallbackWithResult(-174345634, false, new ComposableSingletons$HomeAssetActivationBannerKt$.ExternalSyntheticLambda0());

    public static /* synthetic */ Unit onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 115;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onExtraCallbackWithResult + 19;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent;
        }
        throw null;
    }

    static {
        int i = onTransact + 57;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private static final Unit onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onWarmupCompleted + 87;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            int i5 = onExtraCallbackWithResult + 75;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i7 = onExtraCallbackWithResult + 123;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-174345634, i, -1, "im.toss.features.home.core.ui.compose.dst.ComposableSingletons$HomeAssetActivationBannerKt.lambda$-174345634.<anonymous> (HomeAssetActivationBanner.kt:448)");
                int i8 = onExtraCallbackWithResult + 77;
                onWarmupCompleted = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 3 % 4;
                }
            }
            ActionCallback2.onExtraCallback(new Guard("preview", (getThis) null, CollectionsKt.emptyList(), (ExecutorHelper) null, Guard.onExtraCallbackWithResult.DEPOSIT, (setHasWhiteScreen) null, (getGroupId) null, (getGroupId) null, (getGroupId) null, (AppLogConfigProxy) null, (fillData) null), createInvocationHandler.onExtraCallbackWithResult, cameraCaptureResultEmptyCameraCaptureResult, 48);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }
}
