package im.toss.features.loan.comparison.common.details;

import android.view.View;
import kotlin.jvm.functions.Function1;
import viva.republica.toss.network.model.loan.LoanComparisonDetailResponse;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonProductDetailActivity$$ExternalSyntheticLambda7 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ LoanComparisonProductDetailActivity f$0;
    public final /* synthetic */ LoanComparisonDetailResponse f$1;

    public /* synthetic */ LoanComparisonProductDetailActivity$$ExternalSyntheticLambda7(LoanComparisonProductDetailActivity loanComparisonProductDetailActivity, LoanComparisonDetailResponse loanComparisonDetailResponse) {
        this.f$0 = loanComparisonProductDetailActivity;
        this.f$1 = loanComparisonDetailResponse;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        LoanComparisonProductDetailActivity loanComparisonProductDetailActivity = this.f$0;
        if (i3 != 0) {
            return LoanComparisonProductDetailActivity.onExtraCallback(loanComparisonProductDetailActivity, this.f$1, (View) obj);
        }
        LoanComparisonProductDetailActivity.onExtraCallback(loanComparisonProductDetailActivity, this.f$1, (View) obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
