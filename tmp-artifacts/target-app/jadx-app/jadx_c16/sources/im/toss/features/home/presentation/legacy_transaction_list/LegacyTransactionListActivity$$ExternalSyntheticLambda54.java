package im.toss.features.home.presentation.legacy_transaction_list;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LegacyTransactionListActivity$$ExternalSyntheticLambda54 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ LegacyTransactionListActivity f$0;

    public final Object invoke(Object obj) {
        Unit unitOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnExtraCallbackWithResult = LegacyTransactionListActivity.onExtraCallbackWithResult(this.f$0, (Pair) obj);
            int i3 = 29 / 0;
        } else {
            unitOnExtraCallbackWithResult = LegacyTransactionListActivity.onExtraCallbackWithResult(this.f$0, (Pair) obj);
        }
        int i4 = onNavigationEvent + 1;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
