package im.toss.features.home.presentation.legacy_transaction_list;

import kotlin.jvm.functions.Function1;
import o.deserializeIntNullableCollection;
import o.deserializeIp;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LegacyTransactionListActivity$$ExternalSyntheticLambda27 implements deserializeIntNullableCollection {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ Function1 f$0;

    public final Object apply(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        deserializeIp deserializeipAccess100 = LegacyTransactionListActivity.access100(this.f$0, obj);
        int i4 = IAuthTabCallback + 63;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return deserializeipAccess100;
    }
}
