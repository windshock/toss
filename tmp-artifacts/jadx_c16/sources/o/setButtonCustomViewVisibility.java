package o;

import im.toss.features.alltab.feature.event_curation.ComposableSingletons$EventCurationActivityKt$;
import im.toss.features.teens.henembox.transaction.HenemSavingBoxTransationDetailActivity$;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class setButtonCustomViewVisibility {
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface;
    private static int onWarmupCompleted;
    public static final setButtonCustomViewVisibility onExtraCallback = new setButtonCustomViewVisibility();
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent = ForwardingCameraControl.onExtraCallbackWithResult(1905490634, false, new ComposableSingletons$EventCurationActivityKt$.ExternalSyntheticLambda0());
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(1793003890, false, new ComposableSingletons$EventCurationActivityKt$.ExternalSyntheticLambda1());
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback = ForwardingCameraControl.onExtraCallbackWithResult(1795870072, false, new ComposableSingletons$EventCurationActivityKt$.ExternalSyntheticLambda2());

    public static /* synthetic */ Unit onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 81;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 41;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 101;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onWarmupCompleted + 19;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 11;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallbackDefault + 81;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return unitIAuthTabCallbackDefault;
        }
        throw null;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 7;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = IAuthTabCallback;
        int i4 = i2 + 5;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return function2;
    }

    static {
        int i = asInterface + 61;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static final Unit IAuthTabCallbackDefault(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 11;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = IAuthTabCallbackDefault + 29;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1905490634, i, -1, "im.toss.features.alltab.feature.event_curation.ComposableSingletons$EventCurationActivityKt.lambda$1905490634.<anonymous> (EventCurationActivity.kt:34)");
            }
            int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            setButtonIconOnClickListener.IAuthTabCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1995014994, new Object[]{null, cameraCaptureResultEmptyCameraCaptureResult, 0, 1}, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), 1995014995, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            int i3 = IAuthTabCallbackDefault + 101;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1793003890, i, -1, "im.toss.features.alltab.feature.event_curation.ComposableSingletons$EventCurationActivityKt.lambda$1793003890.<anonymous> (EventCurationActivity.kt:33)");
                int i5 = IAuthTabCallbackDefault + 125;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback(onNavigationEvent, cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallbackDefault + 17;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 85 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            z = true;
        } else {
            int i3 = onWarmupCompleted + 115;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = IAuthTabCallbackDefault + 11;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1795870072, i, -1, "im.toss.features.alltab.feature.event_curation.ComposableSingletons$EventCurationActivityKt.lambda$1795870072.<anonymous> (EventCurationActivity.kt:32)");
            }
            AppLovinBroadcastManager.onExtraCallbackWithResult(new accessgetCameraFactoryp[0], onExtraCallbackWithResult, cameraCaptureResultEmptyCameraCaptureResult, 48);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = IAuthTabCallbackDefault + 29;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i8 = IAuthTabCallbackDefault + 95;
                onWarmupCompleted = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 3 % 5;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i10 = IAuthTabCallbackDefault + 105;
        onWarmupCompleted = i10 % 128;
        if (i10 % 2 == 0) {
            return unit;
        }
        throw null;
    }
}
