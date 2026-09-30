package o;

import im.toss.features.alltab.feature.total_service.feature.mini_home.ui.ComposableSingletons$TotalServiceMiniHomeTitleKt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class OnButtonVisibilityChangeListener {
    private static int IAuthTabCallback = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private static int onWarmupCompleted;
    public static final OnButtonVisibilityChangeListener onNavigationEvent = new OnButtonVisibilityChangeListener();
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(308247963, false, new ComposableSingletons$TotalServiceMiniHomeTitleKt$.ExternalSyntheticLambda0());
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback = ForwardingCameraControl.onExtraCallbackWithResult(-579241385, false, new ComposableSingletons$TotalServiceMiniHomeTitleKt$.ExternalSyntheticLambda1());

    public static /* synthetic */ Unit IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 15;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 67;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 71 / 0;
        }
        int i6 = IAuthTabCallback + 119;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = onExtraCallback;
        int i4 = i3 + 31;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return function2;
    }

    static {
        int i = IAuthTabCallbackStub + 3;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 17;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0 ? (i & 3) == 2 : (i & 4) == 3) {
            int i5 = i3 + 55;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        } else {
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i7 = IAuthTabCallback + 45;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 39 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(308247963, i, -1, "im.toss.features.alltab.feature.total_service.feature.mini_home.ui.ComposableSingletons$TotalServiceMiniHomeTitleKt.lambda$308247963.<anonymous> (TotalServiceMiniHomeTitle.kt:38)");
                }
                onButtonVisibilityChange.onExtraCallback(new getBackButtonVisibility("부동산", (String) null, (String) null), (QuirksExternalSyntheticBackport0) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 2);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                onButtonVisibilityChange.onExtraCallback(new getBackButtonVisibility("부동산", (String) null, (String) null), (QuirksExternalSyntheticBackport0) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 2);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 57;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0 ? (i & 3) == 2 : (i & 2) == 2) {
            int i5 = i3 + 97;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        } else {
            z = true;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onWarmupCompleted + 121;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-579241385, i, -1, "im.toss.features.alltab.feature.total_service.feature.mini_home.ui.ComposableSingletons$TotalServiceMiniHomeTitleKt.lambda$-579241385.<anonymous> (TotalServiceMiniHomeTitle.kt:35)");
                int i9 = IAuthTabCallback + 111;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
            }
            r8lambda762dDs35ABxrpJOuvYTWYx6zqRc.onNavigationEvent((QuirksExternalSyntheticBackport0) null, (toMetersPerSecond) null, y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).onNavigationEvent(), 0L, (getCurrentMenuItems) null, 0.0f, onExtraCallbackWithResult, cameraCaptureResultEmptyCameraCaptureResult, 1572864, 59);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }
}
