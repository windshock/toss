package im.toss.features.loan.comparison.common.details;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import o.onAdViewAdDisplayFailed;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonProductDetailActivity$$ExternalSyntheticLambda66 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ Function0 f$0;
    public final /* synthetic */ LoanComparisonProductDetailActivity f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ LoanComparisonProductDetailActivity$$ExternalSyntheticLambda66(Function0 function0, LoanComparisonProductDetailActivity loanComparisonProductDetailActivity, String str) {
        this.f$0 = function0;
        this.f$1 = loanComparisonProductDetailActivity;
        this.f$2 = str;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) LoanComparisonProductDetailActivity.onNavigationEvent(new Object[]{this.f$0, this.f$1, this.f$2, (View) obj}, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -1389392314, 1389392333, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult());
        int i4 = onNavigationEvent + 13;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }
}
