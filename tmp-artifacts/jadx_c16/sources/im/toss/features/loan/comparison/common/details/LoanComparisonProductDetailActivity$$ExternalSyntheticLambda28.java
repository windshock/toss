package im.toss.features.loan.comparison.common.details;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import viva.republica.toss.network.model.loan.LoanComparisonDetailResponse;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonProductDetailActivity$$ExternalSyntheticLambda28 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ LoanComparisonProductDetailActivity f$0;
    public final /* synthetic */ LoanComparisonDetailResponse.EventContent f$1;

    public /* synthetic */ LoanComparisonProductDetailActivity$$ExternalSyntheticLambda28(LoanComparisonProductDetailActivity loanComparisonProductDetailActivity, LoanComparisonDetailResponse.EventContent eventContent) {
        this.f$0 = loanComparisonProductDetailActivity;
        this.f$1 = eventContent;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = LoanComparisonProductDetailActivity.onExtraCallbackWithResult(this.f$0, this.f$1, (SetDetectableSize) obj);
        int i4 = onNavigationEvent + 105;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
