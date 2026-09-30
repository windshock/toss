package im.toss.features.home.presentation.legacy_transaction_list;

import android.view.View;
import o.regexpCheck;
import viva.republica.toss.network.model.home.CardRecommendBanner;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TransactionListAdapter$$ExternalSyntheticLambda2 implements View.OnClickListener {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ regexpCheck.asInterface f$0;
    public final /* synthetic */ CardRecommendBanner f$1;

    public /* synthetic */ TransactionListAdapter$$ExternalSyntheticLambda2(regexpCheck.asInterface asinterface, CardRecommendBanner cardRecommendBanner) {
        this.f$0 = asinterface;
        this.f$1 = cardRecommendBanner;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        regexpCheck.asInterface asinterface = this.f$0;
        if (i3 != 0) {
            regexpCheck.onWarmupCompleted(asinterface, this.f$1, view);
            return;
        }
        regexpCheck.onWarmupCompleted(asinterface, this.f$1, view);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
