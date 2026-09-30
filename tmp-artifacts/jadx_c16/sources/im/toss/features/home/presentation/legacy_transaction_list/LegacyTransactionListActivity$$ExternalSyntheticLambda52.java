package im.toss.features.home.presentation.legacy_transaction_list;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LegacyTransactionListActivity$$ExternalSyntheticLambda52 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = LegacyTransactionListActivity.IAuthTabCallbackStub((Throwable) obj);
        int i4 = onExtraCallback + 17;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStub;
    }
}
