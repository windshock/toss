package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.x4ExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class x4ExternalSyntheticLambda1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static int onTransact = 1;
    public static final x4ExternalSyntheticLambda1 onWarmupCompleted = new x4ExternalSyntheticLambda1();
    private static getBacktraceNote<Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(-293151522, false, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.tab.v1.ComposableSingletons$ItemPresetKt$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 97;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Function2 function2 = (Function2) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            if (i3 != 0) {
                x4ExternalSyntheticLambda1.IAuthTabCallback(function2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                throw null;
            }
            Unit unitIAuthTabCallback = x4ExternalSyntheticLambda1.IAuthTabCallback(function2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            int i4 = IAuthTabCallback + 5;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return unitIAuthTabCallback;
            }
            throw null;
        }
    });

    public static /* synthetic */ Unit IAuthTabCallback(Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 107;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function2, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 93 / 0;
        }
        int i6 = IAuthTabCallback + 97;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public final getBacktraceNote<Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        getBacktraceNote<Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onExtraCallbackWithResult;
        int i5 = i3 + 105;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    static {
        int i = onExtraCallback + 11;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(function2, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(function2)) {
                int i3 = onNavigationEvent + 93;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2 != 0 ? 2 : 4;
                i |= i4;
            }
        }
        if ((i & 19) != 18) {
            int i5 = IAuthTabCallback + 23;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i7 = IAuthTabCallback + 93;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-293151522, i, -1, "im.toss.tds.compose.component.compound.tab.v1.ComposableSingletons$ItemPresetKt.lambda$-293151522.<anonymous> (ItemPreset.kt:83)");
            }
            function2.invoke(cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i & 14));
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i9 = onNavigationEvent + 81;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }
}
