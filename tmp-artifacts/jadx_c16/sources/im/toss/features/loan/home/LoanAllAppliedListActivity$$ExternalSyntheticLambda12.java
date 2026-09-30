package im.toss.features.loan.home;

import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.areAllItemsEnabled;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanAllAppliedListActivity$$ExternalSyntheticLambda12 implements getBacktraceNote {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ LoanAllAppliedListActivity$IAuthTabCallbackDefault f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        LoanAllAppliedListActivity$IAuthTabCallbackDefault loanAllAppliedListActivity$IAuthTabCallbackDefault = this.f$0;
        areAllItemsEnabled areallitemsenabled = (areAllItemsEnabled) obj;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if (i3 != 0) {
            return LoanAllAppliedListActivity.IAuthTabCallback(loanAllAppliedListActivity$IAuthTabCallbackDefault, areallitemsenabled, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        LoanAllAppliedListActivity.IAuthTabCallback(loanAllAppliedListActivity$IAuthTabCallbackDefault, areallitemsenabled, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        Object obj4 = null;
        obj4.hashCode();
        throw null;
    }
}
