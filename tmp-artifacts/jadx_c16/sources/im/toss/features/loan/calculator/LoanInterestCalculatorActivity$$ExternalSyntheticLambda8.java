package im.toss.features.loan.calculator;

import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getMaxSupportedFrameRate;
import o.selectParentResolutions;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanInterestCalculatorActivity$$ExternalSyntheticLambda8 implements Function2 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ LoanInterestCalculatorActivity f$0;
    public final /* synthetic */ Locale f$1;
    public final /* synthetic */ selectParentResolutions f$2;
    public final /* synthetic */ getMaxSupportedFrameRate f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ LoanInterestCalculatorActivity$$ExternalSyntheticLambda8(LoanInterestCalculatorActivity loanInterestCalculatorActivity, Locale locale, selectParentResolutions selectparentresolutions, getMaxSupportedFrameRate getmaxsupportedframerate, int i) {
        this.f$0 = loanInterestCalculatorActivity;
        this.f$1 = locale;
        this.f$2 = selectparentresolutions;
        this.f$3 = getmaxsupportedframerate;
        this.f$4 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = LoanInterestCalculatorActivity.IAuthTabCallback(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = onExtraCallbackWithResult + 97;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }
}
