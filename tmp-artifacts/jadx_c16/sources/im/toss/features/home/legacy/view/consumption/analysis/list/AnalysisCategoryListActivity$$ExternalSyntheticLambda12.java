package im.toss.features.home.legacy.view.consumption.analysis.list;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AnalysisCategoryListActivity$$ExternalSyntheticLambda12 implements SwipeRefreshLayout.IAuthTabCallback {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ AnalysisCategoryListActivity f$0;

    public final void onRefresh() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        AnalysisCategoryListActivity.onExtraCallbackWithResult(this.f$0);
        if (i3 == 0) {
            throw null;
        }
    }
}
