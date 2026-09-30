package o;

import im.toss.features.home.feature.consumption_category_add.ComposableSingletons$ConsumptionCategoryAddActivityKt$;
import im.toss.features.home.feature.consumption_category_add.ConsumptionCategoryAddViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class bindStartToken {
    private static int IAuthTabCallback = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private static int onNavigationEvent;
    public static final bindStartToken onExtraCallback = new bindStartToken();
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(418306881, false, new ComposableSingletons$ConsumptionCategoryAddActivityKt$.ExternalSyntheticLambda0());
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted = ForwardingCameraControl.onExtraCallbackWithResult(-866494999, false, new ComposableSingletons$ConsumptionCategoryAddActivityKt$.ExternalSyntheticLambda1());

    public static /* synthetic */ Unit onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 95;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 33 / 0;
        }
        int i6 = onNavigationEvent + 1;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 103;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback + 111;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = onWarmupCompleted;
        int i5 = i3 + 111;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return function2;
        }
        throw null;
    }

    static {
        int i = asBinder + 25;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onNavigationEvent + 39;
            IAuthTabCallback = i3 % 128;
            z = i3 % 2 != 0;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i4 = IAuthTabCallback + 17;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        } else {
            int i6 = IAuthTabCallback + 55;
            onNavigationEvent = i6 % 128;
            Object obj = null;
            if (i6 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(418306881, i, -1, "im.toss.features.home.feature.consumption_category_add.ComposableSingletons$ConsumptionCategoryAddActivityKt.lambda$418306881.<anonymous> (ConsumptionCategoryAddActivity.kt:40)");
            }
            getSingletonServiceBeanManager.IAuthTabCallback((ConsumptionCategoryAddViewModel) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 1);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onNavigationEvent + 27;
            IAuthTabCallback = i3 % 128;
            z = i3 % 2 != 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onNavigationEvent + 77;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-866494999, i, -1, "im.toss.features.home.feature.consumption_category_add.ComposableSingletons$ConsumptionCategoryAddActivityKt.lambda$-866494999.<anonymous> (ConsumptionCategoryAddActivity.kt:39)");
                    int i5 = 78 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-866494999, i, -1, "im.toss.features.home.feature.consumption_category_add.ComposableSingletons$ConsumptionCategoryAddActivityKt.lambda$-866494999.<anonymous> (ConsumptionCategoryAddActivity.kt:39)");
                }
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback(onExtraCallbackWithResult, cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = IAuthTabCallback + 103;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i8 = IAuthTabCallback + 7;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
        }
        return Unit.INSTANCE;
    }
}
