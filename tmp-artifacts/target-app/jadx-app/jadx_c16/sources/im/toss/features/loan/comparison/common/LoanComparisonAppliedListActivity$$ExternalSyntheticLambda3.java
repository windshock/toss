package im.toss.features.loan.comparison.common;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonAppliedListActivity$$ExternalSyntheticLambda3 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ LoanComparisonAppliedListActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 121;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        LoanComparisonAppliedListActivity loanComparisonAppliedListActivity = this.f$0;
        List list = (List) obj;
        if (i3 != 0) {
            return LoanComparisonAppliedListActivity.onExtraCallbackWithResult(loanComparisonAppliedListActivity, list);
        }
        LoanComparisonAppliedListActivity.onExtraCallbackWithResult(loanComparisonAppliedListActivity, list);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
