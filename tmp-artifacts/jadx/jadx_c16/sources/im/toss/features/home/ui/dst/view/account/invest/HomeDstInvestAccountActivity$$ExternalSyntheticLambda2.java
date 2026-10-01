package im.toss.features.home.ui.dst.view.account.invest;

import im.toss.features.home.core.ui.recyclerview.HomeDstRecyclerView;
import im.toss.features.home.core.ui.recyclerview.HomeRecyclerView;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeDstInvestAccountActivity$$ExternalSyntheticLambda2 implements HomeRecyclerView.onWarmupCompleted {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ HomeDstInvestAccountActivity f$0;
    public final /* synthetic */ HomeDstRecyclerView f$1;

    public /* synthetic */ HomeDstInvestAccountActivity$$ExternalSyntheticLambda2(HomeDstInvestAccountActivity homeDstInvestAccountActivity, HomeDstRecyclerView homeDstRecyclerView) {
        this.f$0 = homeDstInvestAccountActivity;
        this.f$1 = homeDstRecyclerView;
    }

    public final void onFirstLayoutCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        HomeDstInvestAccountActivity.onExtraCallback(this.f$0, this.f$1, z);
        int i4 = onExtraCallbackWithResult + 121;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }
}
