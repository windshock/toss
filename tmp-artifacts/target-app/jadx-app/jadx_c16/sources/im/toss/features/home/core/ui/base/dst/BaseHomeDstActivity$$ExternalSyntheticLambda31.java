package im.toss.features.home.core.ui.base.dst;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseHomeDstActivity$$ExternalSyntheticLambda31 implements SwipeRefreshLayout.IAuthTabCallback {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ BaseHomeDstActivity f$0;

    public final void onRefresh() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        BaseHomeDstActivity.onExtraCallback(this.f$0);
        int i4 = onWarmupCompleted + 95;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
