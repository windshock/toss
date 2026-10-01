package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.r8lambdavl4lWv0DuRD8f1MRakReCpKDq5E;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdavl4lWv0DuRD8f1MRakReCpKDq5E {
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public static final r8lambdavl4lWv0DuRD8f1MRakReCpKDq5E onNavigationEvent = new r8lambdavl4lWv0DuRD8f1MRakReCpKDq5E();
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback = ForwardingCameraControl.onExtraCallbackWithResult(1233095423, false, new Function2() { // from class: im.toss.tds.compose.component.compound.bottomsheet.ComposableSingletons$TdsBottomSheetV2Kt$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 23;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallbackWithResult = r8lambdavl4lWv0DuRD8f1MRakReCpKDq5E.onExtraCallbackWithResult((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            int i4 = onNavigationEvent + 49;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return unitOnExtraCallbackWithResult;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
    });
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback = ForwardingCameraControl.onExtraCallbackWithResult(-1556719459, false, new Function2() { // from class: im.toss.tds.compose.component.compound.bottomsheet.ComposableSingletons$TdsBottomSheetV2Kt$$ExternalSyntheticLambda1
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 61;
            onExtraCallbackWithResult = i2 % 128;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
            Integer num = (Integer) obj2;
            if (i2 % 2 != 0) {
                return r8lambdavl4lWv0DuRD8f1MRakReCpKDq5E.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, num.intValue());
            }
            r8lambdavl4lWv0DuRD8f1MRakReCpKDq5E.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, num.intValue());
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
    });

    public static /* synthetic */ Unit onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 107;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 99 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 107;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 6 / 0;
        }
        return unitIAuthTabCallback;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 33;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = IAuthTabCallback;
        int i5 = i2 + 29;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return function2;
        }
        throw null;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 23;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = onExtraCallback;
        int i5 = i2 + 29;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return function2;
    }

    static {
        int i = asInterface + 63;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    private static final Unit onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            z = true;
        } else {
            int i3 = onExtraCallbackWithResult + 13;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onWarmupCompleted + 81;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1233095423, i, -1, "im.toss.tds.compose.component.compound.bottomsheet.ComposableSingletons$TdsBottomSheetV2Kt.lambda$1233095423.<anonymous> (TdsBottomSheetV2.kt:61)");
                    int i6 = 99 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1233095423, i, -1, "im.toss.tds.compose.component.compound.bottomsheet.ComposableSingletons$TdsBottomSheetV2Kt.lambda$1233095423.<anonymous> (TdsBottomSheetV2.kt:61)");
                }
            }
            u7.IAuthTabCallback.onWarmupCompleted(null, 0.0f, 0.0f, null, 0L, cameraCaptureResultEmptyCameraCaptureResult, 196608, 31);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onExtraCallbackWithResult + 41;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i8 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onExtraCallbackWithResult + 79;
            onWarmupCompleted = i3 % 128;
            z = i3 % 2 == 0;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1))) {
            int i4 = onExtraCallbackWithResult + 21;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 24 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1556719459, i, -1, "im.toss.tds.compose.component.compound.bottomsheet.ComposableSingletons$TdsBottomSheetV2Kt.lambda$-1556719459.<anonymous> (TdsBottomSheetV2.kt:194)");
                }
                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f)), cameraCaptureResultEmptyCameraCaptureResult, 6);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f)), cameraCaptureResultEmptyCameraCaptureResult, 6);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i6 = onWarmupCompleted + 25;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        throw null;
    }
}
