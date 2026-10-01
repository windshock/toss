package viva.republica.toss.cardrecommend.issuev2.ui;

import viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFinCertSignActivity;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class CardIssueFinCertSignActivity$JsBridge$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ CardIssueFinCertSignActivity f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ CardIssueFinCertSignActivity$JsBridge$$ExternalSyntheticLambda0(CardIssueFinCertSignActivity cardIssueFinCertSignActivity, String str) {
        this.f$0 = cardIssueFinCertSignActivity;
        this.f$1 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CardIssueFinCertSignActivity.onWarmupCompleted.onWarmupCompleted(this.f$0, this.f$1);
    }
}
