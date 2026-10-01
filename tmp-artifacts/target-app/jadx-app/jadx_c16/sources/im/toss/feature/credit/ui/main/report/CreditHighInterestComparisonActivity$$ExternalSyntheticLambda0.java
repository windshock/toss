package im.toss.feature.credit.ui.main.report;

import android.view.View;
import im.toss.features.credit.data.response.CreditHighInterestComparisonResponse;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditHighInterestComparisonActivity$$ExternalSyntheticLambda0 implements View.OnClickListener {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ CreditHighInterestComparisonActivity f$0;
    public final /* synthetic */ CreditHighInterestComparisonResponse.BottomSheetInfo f$1;

    public /* synthetic */ CreditHighInterestComparisonActivity$$ExternalSyntheticLambda0(CreditHighInterestComparisonActivity creditHighInterestComparisonActivity, CreditHighInterestComparisonResponse.BottomSheetInfo bottomSheetInfo) {
        this.f$0 = creditHighInterestComparisonActivity;
        this.f$1 = bottomSheetInfo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        CreditHighInterestComparisonActivity creditHighInterestComparisonActivity = this.f$0;
        if (i3 == 0) {
            CreditHighInterestComparisonActivity.onWarmupCompleted(creditHighInterestComparisonActivity, this.f$1, view);
        } else {
            CreditHighInterestComparisonActivity.onWarmupCompleted(creditHighInterestComparisonActivity, this.f$1, view);
            int i4 = 57 / 0;
        }
    }
}
