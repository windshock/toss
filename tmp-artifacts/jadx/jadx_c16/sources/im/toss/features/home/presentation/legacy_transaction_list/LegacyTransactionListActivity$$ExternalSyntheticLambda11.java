package im.toss.features.home.presentation.legacy_transaction_list;

import kotlin.jvm.functions.Function1;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LegacyTransactionListActivity$$ExternalSyntheticLambda11 implements deserializeFloat {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            LegacyTransactionListActivity.IAuthTabCallbackStub(this.f$0, obj);
            throw null;
        }
        LegacyTransactionListActivity.IAuthTabCallbackStub(this.f$0, obj);
        int i3 = onWarmupCompleted + 31;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
    }
}
