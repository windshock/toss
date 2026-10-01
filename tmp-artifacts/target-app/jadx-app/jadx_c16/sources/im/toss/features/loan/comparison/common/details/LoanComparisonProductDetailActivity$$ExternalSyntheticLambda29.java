package im.toss.features.loan.comparison.common.details;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.onAdViewAdDisplayFailed;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonProductDetailActivity$$ExternalSyntheticLambda29 implements Function1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ LoanComparisonProductDetailActivity f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ LoanComparisonProductDetailActivity$$ExternalSyntheticLambda29(String str, LoanComparisonProductDetailActivity loanComparisonProductDetailActivity, String str2) {
        this.f$0 = str;
        this.f$1 = loanComparisonProductDetailActivity;
        this.f$2 = str2;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        onNavigationEvent = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        Unit unit = (Unit) LoanComparisonProductDetailActivity.onNavigationEvent(new Object[]{this.f$0, this.f$1, this.f$2, (CommonModule_setLeftEdgeTouchEnabled) obj}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -557692797, 557692815, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult());
        int i3 = onNavigationEvent + 31;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        obj2.hashCode();
        throw null;
    }
}
