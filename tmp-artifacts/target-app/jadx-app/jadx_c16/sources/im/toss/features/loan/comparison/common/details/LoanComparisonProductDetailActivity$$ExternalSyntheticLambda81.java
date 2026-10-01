package im.toss.features.loan.comparison.common.details;

import kotlin.jvm.functions.Function0;
import viva.republica.toss.network.model.loan.LoanComparisonDetailResponse;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonProductDetailActivity$$ExternalSyntheticLambda81 implements Function0 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ LoanComparisonDetailResponse.EventContent f$0;
    public final /* synthetic */ LoanComparisonProductDetailActivity f$1;

    public /* synthetic */ LoanComparisonProductDetailActivity$$ExternalSyntheticLambda81(LoanComparisonDetailResponse.EventContent eventContent, LoanComparisonProductDetailActivity loanComparisonProductDetailActivity) {
        this.f$0 = eventContent;
        this.f$1 = loanComparisonProductDetailActivity;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = LoanComparisonProductDetailActivity.onNavigationEvent(this.f$0, this.f$1);
        int i4 = onNavigationEvent + 13;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return objOnNavigationEvent;
    }
}
