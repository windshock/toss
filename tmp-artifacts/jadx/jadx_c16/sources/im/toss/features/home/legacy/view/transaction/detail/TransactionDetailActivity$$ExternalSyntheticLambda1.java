package im.toss.features.home.legacy.view.transaction.detail;

import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TransactionDetailActivity$$ExternalSyntheticLambda1 implements deserializeFloat {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ TransactionDetailActivity f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        TransactionDetailActivity.IAuthTabCallback(this.f$0, obj);
        int i4 = IAuthTabCallback + 89;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }
}
