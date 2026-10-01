package im.toss.features.home.presentation.legacy_transaction_list;

import kotlin.jvm.functions.Function1;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LegacyTransactionListActivity$$ExternalSyntheticLambda13 implements deserializeFloat {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            LegacyTransactionListActivity.extraCallback(this.f$0, obj);
            throw null;
        }
        LegacyTransactionListActivity.extraCallback(this.f$0, obj);
        int i3 = onNavigationEvent + 79;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 44 / 0;
        }
    }
}
