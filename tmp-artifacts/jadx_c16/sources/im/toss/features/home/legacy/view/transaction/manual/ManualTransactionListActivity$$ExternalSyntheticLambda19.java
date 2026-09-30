package im.toss.features.home.legacy.view.transaction.manual;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ManualTransactionListActivity$$ExternalSyntheticLambda19 implements SwipeRefreshLayout.IAuthTabCallback {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ ManualTransactionListActivity f$0;

    public final void onRefresh() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        ManualTransactionListActivity.onExtraCallback(this.f$0);
        if (i3 == 0) {
            throw null;
        }
    }
}
