package im.toss.features.home.legacy.view.transaction.detail;

import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TransactionDetailActivity$$ExternalSyntheticLambda51 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        onExtraCallback = i2 % 128;
        Throwable th = (Throwable) obj;
        if (i2 % 2 == 0) {
            return TransactionDetailActivity.asInterface(th);
        }
        TransactionDetailActivity.asInterface(th);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
