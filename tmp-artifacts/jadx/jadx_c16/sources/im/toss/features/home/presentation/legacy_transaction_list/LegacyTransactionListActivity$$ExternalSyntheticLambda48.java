package im.toss.features.home.presentation.legacy_transaction_list;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LegacyTransactionListActivity$$ExternalSyntheticLambda48 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ LegacyTransactionListActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        LegacyTransactionListActivity legacyTransactionListActivity = this.f$0;
        List list = (List) obj;
        if (i3 != 0) {
            return LegacyTransactionListActivity.onExtraCallback(legacyTransactionListActivity, list);
        }
        LegacyTransactionListActivity.onExtraCallback(legacyTransactionListActivity, list);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
