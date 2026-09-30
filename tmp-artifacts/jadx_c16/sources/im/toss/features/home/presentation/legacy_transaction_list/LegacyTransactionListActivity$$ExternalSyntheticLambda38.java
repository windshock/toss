package im.toss.features.home.presentation.legacy_transaction_list;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LegacyTransactionListActivity$$ExternalSyntheticLambda38 implements SwipeRefreshLayout.IAuthTabCallback {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ LegacyTransactionListActivity f$0;

    public final void onRefresh() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            LegacyTransactionListActivity.asBinder(this.f$0);
            obj.hashCode();
            throw null;
        }
        LegacyTransactionListActivity.asBinder(this.f$0);
        int i3 = IAuthTabCallback + 35;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
