package im.toss.features.edoc;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class EDocHomeTabActivity$$ExternalSyntheticLambda4 implements SwipeRefreshLayout.IAuthTabCallback {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ EDocHomeTabActivity f$0;

    public final void onRefresh() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            EDocHomeTabActivity.onExtraCallback(this.f$0);
            throw null;
        }
        EDocHomeTabActivity.onExtraCallback(this.f$0);
        int i3 = onNavigationEvent + 49;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }
}
