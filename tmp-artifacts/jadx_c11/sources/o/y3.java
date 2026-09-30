package o;

import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.y3;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class y3 {
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private static int onExtraCallback;
    public static final y3 onNavigationEvent = new y3();
    private static getBacktraceNote<Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted = ForwardingCameraControl.onExtraCallbackWithResult(-1964207830, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.theme.ComposableSingletons$LegacyThemeKt$$ExternalSyntheticLambda0
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 91;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnNavigationEvent = y3.onNavigationEvent((Function2) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = onWarmupCompleted + 69;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unitOnNavigationEvent;
        }
    });
    private static getBacktraceNote<Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback = ForwardingCameraControl.onExtraCallbackWithResult(-1090850642, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.theme.ComposableSingletons$LegacyThemeKt$$ExternalSyntheticLambda1
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            Unit unitOnExtraCallbackWithResult;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 85;
            onWarmupCompleted = i2 % 128;
            Function2 function2 = (Function2) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            if (i2 % 2 == 0) {
                unitOnExtraCallbackWithResult = y3.onExtraCallbackWithResult(function2, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                int i3 = 28 / 0;
            } else {
                unitOnExtraCallbackWithResult = y3.onExtraCallbackWithResult(function2, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            }
            int i4 = onWarmupCompleted + 111;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return unitOnExtraCallbackWithResult;
        }
    });
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(985964775, false, new Function2() { // from class: im.toss.tds.compose.component.theme.ComposableSingletons$LegacyThemeKt$$ExternalSyntheticLambda2
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 79;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallback = y3.onExtraCallback((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            int i4 = onExtraCallbackWithResult + 115;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return unitOnExtraCallback;
            }
            throw null;
        }
    });

    public static /* synthetic */ Unit onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = asInterface + 93;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 117;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 91;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return onWarmupCompleted(function2, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onWarmupCompleted(function2, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 71;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(function2, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = asInterface + 41;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public final getBacktraceNote<Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 75;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 73;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = onExtraCallbackWithResult;
        if (i3 != 0) {
            int i4 = 90 / 0;
        }
        return function2;
    }

    static {
        int i = IAuthTabCallbackStub + 7;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(function2, "");
        if ((i & 6) == 0) {
            int i4 = onExtraCallback + 119;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 49 / 0;
                if (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(function2)) {
                    int i6 = onExtraCallback + 97;
                    asInterface = i6 % 128;
                    int i7 = i6 % 2;
                    i2 = 4;
                }
                i |= i2;
            } else {
                if (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(function2)) {
                }
                i |= i2;
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1964207830, i, -1, "im.toss.tds.compose.component.theme.ComposableSingletons$LegacyThemeKt.lambda$-1964207830.<anonymous> (LegacyTheme.kt:223)");
            }
            y4.onNavigationEvent(null, null, null, null, function2, cameraCaptureResultEmptyCameraCaptureResult, (i << 12) & 57344, 15);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(function2, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(function2)) {
                int i4 = asInterface + 99;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                i2 = 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onExtraCallback + 45;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1090850642, i, -1, "im.toss.tds.compose.component.theme.ComposableSingletons$LegacyThemeKt.lambda$-1090850642.<anonymous> (LegacyTheme.kt:242)");
            }
            y4.onNavigationEvent(null, null, null, null, function2, cameraCaptureResultEmptyCameraCaptureResult, (i << 12) & 57344, 15);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i8 = onExtraCallback + 5;
                asInterface = i8 % 128;
                int i9 = i8 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = asInterface + 11;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = onExtraCallback + 31;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 80 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i7 = asInterface + 89;
                    onExtraCallback = i7 % 128;
                    if (i7 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(985964775, i, -1, "im.toss.tds.compose.component.theme.ComposableSingletons$LegacyThemeKt.lambda$985964775.<anonymous> (LegacyTheme.kt:329)");
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(985964775, i, -1, "im.toss.tds.compose.component.theme.ComposableSingletons$LegacyThemeKt.lambda$985964775.<anonymous> (LegacyTheme.kt:329)");
                }
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"Preview", null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"Preview", null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }
}
