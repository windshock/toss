package im.toss.features.loan.calculator;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.CameraPresenceProviderExternalSyntheticLambda6;
import o.getArea;
import o.getMaxSupportedFrameRate;
import o.getRelatedFixedSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanInterestCalculatorActivity$$ExternalSyntheticLambda23 implements Function0 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ getMaxSupportedFrameRate f$0;
    public final /* synthetic */ getMaxSupportedFrameRate f$1;
    public final /* synthetic */ getMaxSupportedFrameRate f$2;
    public final /* synthetic */ getRelatedFixedSize f$3;
    public final /* synthetic */ getArea f$4;
    public final /* synthetic */ LoanInterestCalculatorActivity f$5;
    public final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6 f$6;

    public /* synthetic */ LoanInterestCalculatorActivity$$ExternalSyntheticLambda23(getMaxSupportedFrameRate getmaxsupportedframerate, getMaxSupportedFrameRate getmaxsupportedframerate2, getMaxSupportedFrameRate getmaxsupportedframerate3, getRelatedFixedSize getrelatedfixedsize, getArea getarea, LoanInterestCalculatorActivity loanInterestCalculatorActivity, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        this.f$0 = getmaxsupportedframerate;
        this.f$1 = getmaxsupportedframerate2;
        this.f$2 = getmaxsupportedframerate3;
        this.f$3 = getrelatedfixedsize;
        this.f$4 = getarea;
        this.f$5 = loanInterestCalculatorActivity;
        this.f$6 = cameraPresenceProviderExternalSyntheticLambda6;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = LoanInterestCalculatorActivity.onWarmupCompleted(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6);
        int i4 = onWarmupCompleted + 57;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
