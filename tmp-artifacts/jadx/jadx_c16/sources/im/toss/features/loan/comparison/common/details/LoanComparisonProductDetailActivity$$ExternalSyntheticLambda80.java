package im.toss.features.loan.comparison.common.details;

import kotlin.jvm.functions.Function0;
import viva.republica.toss.network.model.loan.LoanComparisonDetailResponse;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonProductDetailActivity$$ExternalSyntheticLambda80 implements Function0 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ LoanComparisonDetailResponse.EventContent f$0;
    public final /* synthetic */ LoanComparisonProductDetailActivity f$1;

    public /* synthetic */ LoanComparisonProductDetailActivity$$ExternalSyntheticLambda80(LoanComparisonDetailResponse.EventContent eventContent, LoanComparisonProductDetailActivity loanComparisonProductDetailActivity) {
        this.f$0 = eventContent;
        this.f$1 = loanComparisonProductDetailActivity;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        LoanComparisonDetailResponse.EventContent eventContent = this.f$0;
        if (i3 == 0) {
            return LoanComparisonProductDetailActivity.onExtraCallback(eventContent, this.f$1);
        }
        int i4 = 25 / 0;
        return LoanComparisonProductDetailActivity.onExtraCallback(eventContent, this.f$1);
    }
}
