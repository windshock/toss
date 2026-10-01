package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.setMinProgress;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setMinProgress {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onTransact = 1;
    private static int onWarmupCompleted = 1;
    public static final setMinProgress onExtraCallback = new setMinProgress();
    private static getBacktraceNote<Function1<? super setUseCaseAttached, Unit>, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent = ForwardingCameraControl.onExtraCallbackWithResult(2019106000, false, new getBacktraceNote() { // from class: im.toss.compose.widget.gl.ComposableSingletons$TdsGlBlurKt$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 91;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Function1 function1 = (Function1) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            if (i4 != 0) {
                return setMinProgress.onExtraCallbackWithResult(function1, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            }
            setMinProgress.onExtraCallbackWithResult(function1, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            Object obj4 = null;
            obj4.hashCode();
            throw null;
        }
    });

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 87;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return onExtraCallback(function1, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        onExtraCallback(function1, cameraCaptureResultEmptyCameraCaptureResult, i2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getBacktraceNote<Function1<? super setUseCaseAttached, Unit>, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 115;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getBacktraceNote<Function1<? super setUseCaseAttached, Unit>, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onNavigationEvent;
        int i5 = i3 + 73;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 95 / 0;
        }
        return getbacktracenote;
    }

    static {
        int i2 = onTransact + 99;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 46 / 0;
        }
    }

    private static final Unit onExtraCallback(Function1 function1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        if ((i2 & 17) != 16) {
            int i4 = onWarmupCompleted + 123;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i6 = onExtraCallbackWithResult + 13;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onExtraCallbackWithResult + 17;
                onWarmupCompleted = i8 % 128;
                if (i8 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2019106000, i2, -1, "im.toss.compose.widget.gl.ComposableSingletons$TdsGlBlurKt.lambda$2019106000.<anonymous> (TdsGlBlur.kt:60)");
                    int i9 = 77 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2019106000, i2, -1, "im.toss.compose.widget.gl.ComposableSingletons$TdsGlBlurKt.lambda$2019106000.<anonymous> (TdsGlBlur.kt:60)");
                }
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i10 = onExtraCallbackWithResult + 89;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
        }
        return Unit.INSTANCE;
    }
}
