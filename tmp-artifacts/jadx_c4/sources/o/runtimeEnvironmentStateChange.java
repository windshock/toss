package o;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.runtimeEnvironmentStateChange;
import o.w3b;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class runtimeEnvironmentStateChange {
    private static int asBinder = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public static final runtimeEnvironmentStateChange IAuthTabCallback = new runtimeEnvironmentStateChange();
    private static getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(286188585, false, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.home.component.ComposableSingletons$CreditHomeLoanNeedsRowKt$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 1;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnNavigationEvent = runtimeEnvironmentStateChange.onNavigationEvent((w3b) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = onNavigationEvent + 89;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return unitOnNavigationEvent;
        }
    });

    public static /* synthetic */ Unit onNavigationEvent(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 95;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            onWarmupCompleted(w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onNavigationEvent + 91;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 75 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public final getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = asBinder + 85;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(w3bVar, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            int i3 = onNavigationEvent + 51;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(286188585, i, -1, "im.toss.feature.credit.ui.main.home.component.ComposableSingletons$CreditHomeLoanNeedsRowKt.lambda$286188585.<anonymous> (CreditHomeLoanNeedsRow.kt:663)");
            }
            addInfoPartTwo.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onWarmupCompleted + 5;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }
}
