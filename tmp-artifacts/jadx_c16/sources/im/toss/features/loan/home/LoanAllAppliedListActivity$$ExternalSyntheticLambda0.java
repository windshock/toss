package im.toss.features.loan.home;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanAllAppliedListActivity$$ExternalSyntheticLambda0 implements Function2 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ LoanAllAppliedListActivity f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ LoanAllAppliedListActivity$$ExternalSyntheticLambda0(LoanAllAppliedListActivity loanAllAppliedListActivity, int i) {
        this.f$0 = loanAllAppliedListActivity;
        this.f$1 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            LoanAllAppliedListActivity.onNavigationEvent(this.f$0, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = LoanAllAppliedListActivity.onNavigationEvent(this.f$0, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i3 = onNavigationEvent + 67;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 54 / 0;
        }
        return unitOnNavigationEvent;
    }
}
