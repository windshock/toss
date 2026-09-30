package im.toss.features.home.core.ui.base;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import o.GeckoHubImp;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseHomeActivity$$ExternalSyntheticLambda18 implements SwipeRefreshLayout.IAuthTabCallback {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ BaseHomeActivity f$0;

    public final void onRefresh() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0};
        BaseHomeActivity.IAuthTabCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -1032244236, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), objArr, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 1032244236);
        int i4 = onWarmupCompleted + 119;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
