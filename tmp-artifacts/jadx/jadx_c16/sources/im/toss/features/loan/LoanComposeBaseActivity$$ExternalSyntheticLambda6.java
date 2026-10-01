package im.toss.features.loan;

import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.MaxRewardedInterstitialAdapterListener;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComposeBaseActivity$$ExternalSyntheticLambda6 implements getBacktraceNote {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ LoanComposeBaseActivity f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        LoanComposeBaseActivity loanComposeBaseActivity = this.f$0;
        MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener = (MaxRewardedInterstitialAdapterListener) obj;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if (i3 == 0) {
            return LoanComposeBaseActivity.IAuthTabCallback(loanComposeBaseActivity, maxRewardedInterstitialAdapterListener, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        LoanComposeBaseActivity.IAuthTabCallback(loanComposeBaseActivity, maxRewardedInterstitialAdapterListener, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        Object obj4 = null;
        obj4.hashCode();
        throw null;
    }
}
