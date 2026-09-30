package o;

import im.toss.features.loan.calculator.ComposableSingletons$LoanInterestInfoActivityKt$;
import im.toss.features.loan.ui.R;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class readTarStreamIntoMemory {
    private static int asBinder = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public static final readTarStreamIntoMemory onExtraCallbackWithResult = new readTarStreamIntoMemory();
    private static getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback = ForwardingCameraControl.onExtraCallbackWithResult(-1055061661, false, new ComposableSingletons$LoanInterestInfoActivityKt$.ExternalSyntheticLambda0());

    public static /* synthetic */ Unit IAuthTabCallback(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 53;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 47;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 61 / 0;
        }
        return unitOnNavigationEvent;
    }

    public final getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = IAuthTabCallback;
        int i4 = i3 + 51;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return getbacktracenote;
    }

    static {
        int i = onExtraCallback + 119;
        asBinder = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1aVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1aVar)) {
                int i5 = onWarmupCompleted + 91;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1055061661, i2, -1, "im.toss.features.loan.calculator.ComposableSingletons$LoanInterestInfoActivityKt.lambda$-1055061661.<anonymous> (LoanInterestInfoActivity.kt:44)");
            }
            y1a.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1254492509, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{y1aVar, DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.loan_interest_guide_title_1, cameraCaptureResultEmptyCameraCaptureResult, 0), null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 15) & 458752) | 24576), 10}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1254492510);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onWarmupCompleted + 35;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }
}
