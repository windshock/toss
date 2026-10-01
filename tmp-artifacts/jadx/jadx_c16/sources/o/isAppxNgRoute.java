package o;

import im.toss.features.home.ui.view.history.ComposableSingletons$AccountDetailRouteSchemeActivityKt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class isAppxNgRoute {
    private static int IAuthTabCallbackDefault = 0;
    private static int onExtraCallback = 1;
    private static int onTransact = 1;
    private static int onWarmupCompleted;
    public static final isAppxNgRoute onNavigationEvent = new isAppxNgRoute();
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(-1023290005, false, new ComposableSingletons$AccountDetailRouteSchemeActivityKt$.ExternalSyntheticLambda0());
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback = ForwardingCameraControl.onExtraCallbackWithResult(-1518404254, false, new ComposableSingletons$AccountDetailRouteSchemeActivityKt$.ExternalSyntheticLambda1());

    public static /* synthetic */ Unit IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 5;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 91;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 93;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 76 / 0;
        }
        return unitOnNavigationEvent;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = onTransact + 65;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    private static final Unit onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 53;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0 ? (i & 3) == 2 : (i & 3) == 2) {
            int i5 = i3 + 119;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        } else {
            int i7 = i3 + 107;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onExtraCallback + 59;
                onWarmupCompleted = i9 % 128;
                if (i9 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1023290005, i, -1, "im.toss.features.home.ui.view.history.ComposableSingletons$AccountDetailRouteSchemeActivityKt.lambda$-1023290005.<anonymous> (AccountDetailRouteSchemeActivity.kt:38)");
                    int i10 = 60 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1023290005, i, -1, "im.toss.features.home.ui.view.history.ComposableSingletons$AccountDetailRouteSchemeActivityKt.lambda$-1023290005.<anonymous> (AccountDetailRouteSchemeActivity.kt:38)");
                }
            }
            EventListenerFactoryExternalSyntheticLambda0.IAuthTabCallback((QuirksExternalSyntheticBackport0) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 1);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 3;
        onWarmupCompleted = i3 % 128;
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 == 0 ? (i & 3) != 2 : (i & 3) != 5, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1518404254, i, -1, "im.toss.features.home.ui.view.history.ComposableSingletons$AccountDetailRouteSchemeActivityKt.lambda$-1518404254.<anonymous> (AccountDetailRouteSchemeActivity.kt:37)");
            }
            y4.onNavigationEvent((addFixedPosition) null, (MaxRecyclerAdaptera) null, (y2) null, (y6) null, onExtraCallbackWithResult, cameraCaptureResultEmptyCameraCaptureResult, 24576, 15);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onExtraCallback + 75;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }
}
