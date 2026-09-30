package im.toss.features.loan.home;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanAllAppliedListActivity$$ExternalSyntheticLambda18 implements Function2 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ LoanAllAppliedListActivity f$0;
    public final /* synthetic */ List f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ LoanAllAppliedListActivity$$ExternalSyntheticLambda18(LoanAllAppliedListActivity loanAllAppliedListActivity, List list, int i) {
        this.f$0 = loanAllAppliedListActivity;
        this.f$1 = list;
        this.f$2 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = LoanAllAppliedListActivity.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = IAuthTabCallback + 59;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 2 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }
}
