package im.toss.features.home.presentation.legacy_transaction_list;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import o.deserializeIntNullableCollection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LegacyTransactionListActivity$$ExternalSyntheticLambda16 implements deserializeIntNullableCollection {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Function1 f$0;

    public final Object apply(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            LegacyTransactionListActivity.asInterface(this.f$0, obj);
            throw null;
        }
        Pair pairAsInterface = LegacyTransactionListActivity.asInterface(this.f$0, obj);
        int i3 = onWarmupCompleted + 37;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return pairAsInterface;
    }
}
