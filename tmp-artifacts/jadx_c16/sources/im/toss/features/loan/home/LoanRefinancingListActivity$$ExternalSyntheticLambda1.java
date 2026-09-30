package im.toss.features.loan.home;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanRefinancingListActivity$$ExternalSyntheticLambda1 implements Function2 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ LoanRefinancingListActivity f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ LoanRefinancingListActivity$$ExternalSyntheticLambda1(LoanRefinancingListActivity loanRefinancingListActivity, int i) {
        this.f$0 = loanRefinancingListActivity;
        this.f$1 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = LoanRefinancingListActivity.onExtraCallback(this.f$0, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = onExtraCallback + 111;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }
}
