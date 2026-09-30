package im.toss.features.home.core.ui.base;

import im.toss.features.home.core.ui.recyclerview.HomeRecyclerView;
import o.GeckoHubImp;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseHomeActivity$$ExternalSyntheticLambda10 implements HomeRecyclerView.onWarmupCompleted {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ BaseHomeActivity f$0;

    public final void onFirstLayoutCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        BaseHomeActivity.IAuthTabCallback(GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -54490785, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), new Object[]{this.f$0, Boolean.valueOf(z)}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), 54490793);
        int i4 = onExtraCallbackWithResult + 89;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
