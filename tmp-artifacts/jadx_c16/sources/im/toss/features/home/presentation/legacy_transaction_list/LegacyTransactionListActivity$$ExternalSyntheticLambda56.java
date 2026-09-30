package im.toss.features.home.presentation.legacy_transaction_list;

import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LegacyTransactionListActivity$$ExternalSyntheticLambda56 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onWarmupCompleted = i2 % 128;
        Throwable th = (Throwable) obj;
        if (i2 % 2 == 0) {
            return LegacyTransactionListActivity.onExtraCallbackWithResult(th);
        }
        LegacyTransactionListActivity.onExtraCallbackWithResult(th);
        throw null;
    }
}
