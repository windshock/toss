package im.toss.features.home.presentation.legacy_transaction_list;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LegacyTransactionListActivity$$ExternalSyntheticLambda62 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ LegacyTransactionListActivity f$0;
    public final /* synthetic */ ArrayList f$1;

    public /* synthetic */ LegacyTransactionListActivity$$ExternalSyntheticLambda62(LegacyTransactionListActivity legacyTransactionListActivity, ArrayList arrayList) {
        this.f$0 = legacyTransactionListActivity;
        this.f$1 = arrayList;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = LegacyTransactionListActivity.IAuthTabCallback(this.f$0, this.f$1, ((Integer) obj).intValue());
        int i4 = onExtraCallback + 67;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
