package im.toss.features.home.presentation.legacy_transaction_list;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.deserializeUriNullableCollection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LegacyTransactionListActivity$$ExternalSyntheticLambda30 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ LegacyTransactionListActivity f$1;

    public /* synthetic */ LegacyTransactionListActivity$$ExternalSyntheticLambda30(boolean z, LegacyTransactionListActivity legacyTransactionListActivity) {
        this.f$0 = z;
        this.f$1 = legacyTransactionListActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = LegacyTransactionListActivity.onExtraCallbackWithResult(this.f$0, this.f$1, (deserializeUriNullableCollection) obj);
        int i4 = onExtraCallback + 125;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }
}
