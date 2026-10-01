package im.toss.features.home.presentation.legacy_transaction_list;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LegacyTransactionListActivity$$ExternalSyntheticLambda35 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ LegacyTransactionListActivity f$0;

    public final Object invoke(Object obj) {
        Unit unitOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnWarmupCompleted = LegacyTransactionListActivity.onWarmupCompleted(this.f$0, (Throwable) obj);
            int i3 = 48 / 0;
        } else {
            unitOnWarmupCompleted = LegacyTransactionListActivity.onWarmupCompleted(this.f$0, (Throwable) obj);
        }
        int i4 = onExtraCallbackWithResult + 45;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }
}
