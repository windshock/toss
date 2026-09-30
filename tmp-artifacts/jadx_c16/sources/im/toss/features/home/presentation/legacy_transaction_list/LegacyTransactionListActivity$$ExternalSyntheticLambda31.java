package im.toss.features.home.presentation.legacy_transaction_list;

import kotlin.jvm.functions.Function1;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LegacyTransactionListActivity$$ExternalSyntheticLambda31 implements deserializeFloat {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        LegacyTransactionListActivity.writeTypedObject(this.f$0, obj);
        if (i3 != 0) {
            int i4 = 6 / 0;
        }
    }
}
