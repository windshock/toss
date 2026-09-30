package im.toss.features.loan.home;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import viva.republica.toss.network.model.loan.AppliedLoan;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanAllAppliedListActivity$$ExternalSyntheticLambda10 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ AppliedLoan f$0;
    public final /* synthetic */ LoanAllAppliedListActivity f$1;

    public /* synthetic */ LoanAllAppliedListActivity$$ExternalSyntheticLambda10(AppliedLoan appliedLoan, LoanAllAppliedListActivity loanAllAppliedListActivity) {
        this.f$0 = appliedLoan;
        this.f$1 = loanAllAppliedListActivity;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            LoanAllAppliedListActivity.onWarmupCompleted(this.f$0, this.f$1);
            throw null;
        }
        Unit unitOnWarmupCompleted = LoanAllAppliedListActivity.onWarmupCompleted(this.f$0, this.f$1);
        int i3 = IAuthTabCallback + 1;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }
}
