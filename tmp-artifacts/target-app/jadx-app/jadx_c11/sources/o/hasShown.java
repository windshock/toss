package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.hasShown;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class hasShown {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    public static final hasShown onWarmupCompleted = new hasShown();
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(-21271108, false, new Function2() { // from class: im.toss.standardtermsv2.param.ComposableSingletons$StandardTermsV2CustomContentsKt$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 77;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallbackWithResult = hasShown.onExtraCallbackWithResult((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            int i4 = onExtraCallbackWithResult + 83;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unitOnExtraCallbackWithResult;
        }
    });
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback = ForwardingCameraControl.onExtraCallbackWithResult(562564763, false, new Function2() { // from class: im.toss.standardtermsv2.param.ComposableSingletons$StandardTermsV2CustomContentsKt$$ExternalSyntheticLambda1
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 67;
            onNavigationEvent = i2 % 128;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
            Integer num = (Integer) obj2;
            if (i2 % 2 == 0) {
                return hasShown.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, num.intValue());
            }
            hasShown.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, num.intValue());
            throw null;
        }
    });
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent = ForwardingCameraControl.onExtraCallbackWithResult(-1684799978, false, new Function2() { // from class: im.toss.standardtermsv2.param.ComposableSingletons$StandardTermsV2CustomContentsKt$$ExternalSyntheticLambda2
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke(Object obj, Object obj2) {
            Unit unitOnWarmupCompleted;
            int i = 2 % 2;
            int i2 = onExtraCallback + 125;
            onExtraCallbackWithResult = i2 % 128;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
            Integer num = (Integer) obj2;
            if (i2 % 2 == 0) {
                unitOnWarmupCompleted = hasShown.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, num.intValue());
                int i3 = 68 / 0;
            } else {
                unitOnWarmupCompleted = hasShown.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, num.intValue());
            }
            int i4 = onExtraCallbackWithResult + 67;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return unitOnWarmupCompleted;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
    });

    public static /* synthetic */ Unit onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 11;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallbackDefault + 15;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 51;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallbackDefault + 111;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 86 / 0;
        }
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 115;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 28 / 0;
        }
        return unitOnNavigationEvent;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 47;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = onExtraCallback;
        int i5 = i2 + 41;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 76 / 0;
        }
        return function2;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult() {
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        if (i2 % 2 == 0) {
            function2 = onNavigationEvent;
            int i4 = 99 / 0;
        } else {
            function2 = onNavigationEvent;
        }
        int i5 = i3 + 7;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return function2;
        }
        throw null;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 45;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = onExtraCallbackWithResult;
        int i5 = i3 + 95;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return function2;
    }

    static {
        int i = asInterface + 19;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    private static final Unit IAuthTabCallbackStub(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 3;
        IAuthTabCallback = i3 % 128;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 == 0 ? (i & 3) != 2 : (i & 5) != 5, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i4 = IAuthTabCallbackDefault + 83;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-21271108, i, -1, "im.toss.standardtermsv2.param.ComposableSingletons$StandardTermsV2CustomContentsKt.lambda$-21271108.<anonymous> (StandardTermsV2CustomContents.kt:19)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-21271108, i, -1, "im.toss.standardtermsv2.param.ComposableSingletons$StandardTermsV2CustomContentsKt.lambda$-21271108.<anonymous> (StandardTermsV2CustomContents.kt:19)");
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = IAuthTabCallback + 123;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        boolean z = false;
        if ((i & 3) != 2) {
            int i3 = IAuthTabCallback + 63;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 != 0) {
                z = true;
            }
        } else {
            int i4 = IAuthTabCallbackDefault + 79;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i6 = IAuthTabCallbackDefault + 85;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(562564763, i, -1, "im.toss.standardtermsv2.param.ComposableSingletons$StandardTermsV2CustomContentsKt.lambda$562564763.<anonymous> (StandardTermsV2CustomContents.kt:20)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(562564763, i, -1, "im.toss.standardtermsv2.param.ComposableSingletons$StandardTermsV2CustomContentsKt.lambda$562564763.<anonymous> (StandardTermsV2CustomContents.kt:20)");
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i7 = IAuthTabCallbackDefault + 77;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = IAuthTabCallbackDefault + 51;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = IAuthTabCallbackDefault + 75;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1684799978, i, -1, "im.toss.standardtermsv2.param.ComposableSingletons$StandardTermsV2CustomContentsKt.lambda$-1684799978.<anonymous> (StandardTermsV2CustomContents.kt:21)");
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i6 = IAuthTabCallbackDefault + 79;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 3 / 5;
            }
        }
        return Unit.INSTANCE;
    }
}
