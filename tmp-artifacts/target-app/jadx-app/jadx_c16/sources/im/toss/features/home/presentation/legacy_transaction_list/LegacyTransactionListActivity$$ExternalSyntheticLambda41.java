package im.toss.features.home.presentation.legacy_transaction_list;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.LocalPermissionDialog;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LegacyTransactionListActivity$$ExternalSyntheticLambda41 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ LegacyTransactionListActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            LegacyTransactionListActivity.IAuthTabCallback(this.f$0, (LocalPermissionDialog) obj);
            throw null;
        }
        Unit unitIAuthTabCallback = LegacyTransactionListActivity.IAuthTabCallback(this.f$0, (LocalPermissionDialog) obj);
        int i3 = onNavigationEvent + 117;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 93 / 0;
        }
        return unitIAuthTabCallback;
    }
}
