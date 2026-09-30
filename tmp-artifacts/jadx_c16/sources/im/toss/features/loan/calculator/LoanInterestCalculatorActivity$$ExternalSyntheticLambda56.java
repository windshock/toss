package im.toss.features.loan.calculator;

import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.Camera2CameraMetadataExternalSyntheticLambda1;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.adaptAppModel;
import o.getMaxSupportedFrameRate;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanInterestCalculatorActivity$$ExternalSyntheticLambda56 implements Function2 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ LoanInterestCalculatorActivity f$0;
    public final /* synthetic */ Locale f$1;
    public final /* synthetic */ adaptAppModel f$2;
    public final /* synthetic */ getMaxSupportedFrameRate f$3;
    public final /* synthetic */ getMaxSupportedFrameRate f$4;
    public final /* synthetic */ getMaxSupportedFrameRate f$5;
    public final /* synthetic */ Camera2CameraMetadataExternalSyntheticLambda1 f$6;
    public final /* synthetic */ int f$7;
    public final /* synthetic */ int f$8;

    public /* synthetic */ LoanInterestCalculatorActivity$$ExternalSyntheticLambda56(LoanInterestCalculatorActivity loanInterestCalculatorActivity, Locale locale, adaptAppModel adaptappmodel, getMaxSupportedFrameRate getmaxsupportedframerate, getMaxSupportedFrameRate getmaxsupportedframerate2, getMaxSupportedFrameRate getmaxsupportedframerate3, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, int i, int i2) {
        this.f$0 = loanInterestCalculatorActivity;
        this.f$1 = locale;
        this.f$2 = adaptappmodel;
        this.f$3 = getmaxsupportedframerate;
        this.f$4 = getmaxsupportedframerate2;
        this.f$5 = getmaxsupportedframerate3;
        this.f$6 = camera2CameraMetadataExternalSyntheticLambda1;
        this.f$7 = i;
        this.f$8 = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = LoanInterestCalculatorActivity.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = onExtraCallbackWithResult + 7;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 58 / 0;
        }
        return unitOnNavigationEvent;
    }
}
