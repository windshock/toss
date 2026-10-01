package im.toss.features.loan.comparison.common.details;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.onAdViewAdDisplayFailed;
import viva.republica.toss.network.model.loan.LoanComparisonDetailResponse;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonProductDetailActivity$$ExternalSyntheticLambda1 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ LoanComparisonProductDetailActivity f$0;
    public final /* synthetic */ LoanComparisonDetailResponse.EventContent f$1;

    public /* synthetic */ LoanComparisonProductDetailActivity$$ExternalSyntheticLambda1(LoanComparisonProductDetailActivity loanComparisonProductDetailActivity, LoanComparisonDetailResponse.EventContent eventContent) {
        this.f$0 = loanComparisonProductDetailActivity;
        this.f$1 = eventContent;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        LoanComparisonProductDetailActivity loanComparisonProductDetailActivity = this.f$0;
        if (i3 != 0) {
            return (Unit) LoanComparisonProductDetailActivity.onNavigationEvent(new Object[]{loanComparisonProductDetailActivity, this.f$1, (SetDetectableSize) obj}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -1881639313, 1881639317, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult());
        }
        throw null;
    }
}
