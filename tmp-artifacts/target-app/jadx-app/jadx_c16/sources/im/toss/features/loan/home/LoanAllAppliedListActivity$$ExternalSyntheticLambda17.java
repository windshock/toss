package im.toss.features.loan.home;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.AudioRestrictionControllerImplExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanAllAppliedListActivity$$ExternalSyntheticLambda17 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ List f$0;
    public final /* synthetic */ LoanAllAppliedListActivity f$1;

    public /* synthetic */ LoanAllAppliedListActivity$$ExternalSyntheticLambda17(List list, LoanAllAppliedListActivity loanAllAppliedListActivity) {
        this.f$0 = list;
        this.f$1 = loanAllAppliedListActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        List list = this.f$0;
        if (i3 != 0) {
            return LoanAllAppliedListActivity.onWarmupCompleted(list, this.f$1, (AudioRestrictionControllerImplExternalSyntheticLambda0) obj);
        }
        Unit unitOnWarmupCompleted = LoanAllAppliedListActivity.onWarmupCompleted(list, this.f$1, (AudioRestrictionControllerImplExternalSyntheticLambda0) obj);
        int i4 = 26 / 0;
        return unitOnWarmupCompleted;
    }
}
