package im.toss.feature.credit.ui.history.detail.latest;

import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditHistoryLoanDisclaimerActivity$$ExternalSyntheticLambda2 implements Function2 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ CreditHistoryLoanDisclaimerActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        CreditHistoryLoanDisclaimerActivity creditHistoryLoanDisclaimerActivity = this.f$0;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (i3 == 0) {
            return CreditHistoryLoanDisclaimerActivity.onExtraCallbackWithResult(creditHistoryLoanDisclaimerActivity, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        CreditHistoryLoanDisclaimerActivity.onExtraCallbackWithResult(creditHistoryLoanDisclaimerActivity, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        throw null;
    }
}
