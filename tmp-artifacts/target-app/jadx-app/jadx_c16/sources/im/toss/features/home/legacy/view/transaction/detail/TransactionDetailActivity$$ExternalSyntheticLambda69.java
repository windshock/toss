package im.toss.features.home.legacy.view.transaction.detail;

import kotlin.jvm.functions.Function1;
import viva.republica.toss.network.model.home.RelatedTransactions;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TransactionDetailActivity$$ExternalSyntheticLambda69 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ TransactionDetailActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        TransactionDetailActivity transactionDetailActivity = this.f$0;
        RelatedTransactions relatedTransactions = (RelatedTransactions) obj;
        if (i3 == 0) {
            return TransactionDetailActivity.onWarmupCompleted(transactionDetailActivity, relatedTransactions);
        }
        TransactionDetailActivity.onWarmupCompleted(transactionDetailActivity, relatedTransactions);
        throw null;
    }
}
