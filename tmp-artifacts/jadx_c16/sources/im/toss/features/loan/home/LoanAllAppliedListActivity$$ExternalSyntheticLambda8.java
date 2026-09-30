package im.toss.features.loan.home;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import viva.republica.toss.network.model.loan.AppliedLoan;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanAllAppliedListActivity$$ExternalSyntheticLambda8 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ LoanAllAppliedListActivity f$0;
    public final /* synthetic */ AppliedLoan f$1;

    public /* synthetic */ LoanAllAppliedListActivity$$ExternalSyntheticLambda8(LoanAllAppliedListActivity loanAllAppliedListActivity, AppliedLoan appliedLoan) {
        this.f$0 = loanAllAppliedListActivity;
        this.f$1 = appliedLoan;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = LoanAllAppliedListActivity.onWarmupCompleted(this.f$0, this.f$1);
        int i4 = onExtraCallback + 81;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
