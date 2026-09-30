package viva.republica.toss.cardrecommend.issuev2.ui;

import viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFinCertSignActivity;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class CardIssueFinCertSignActivity$JsBridge$$ExternalSyntheticLambda5 implements Runnable {
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ CardIssueFinCertSignActivity f$1;

    public /* synthetic */ CardIssueFinCertSignActivity$JsBridge$$ExternalSyntheticLambda5(boolean z, CardIssueFinCertSignActivity cardIssueFinCertSignActivity) {
        this.f$0 = z;
        this.f$1 = cardIssueFinCertSignActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CardIssueFinCertSignActivity.onWarmupCompleted.onExtraCallbackWithResult(this.f$0, this.f$1);
    }
}
