package im.toss.features.home.ui.dst.view.analysis.contents.asset.categorized.deposit;

import im.toss.features.home.core.ui.recyclerview.HomeDstRecyclerView;
import im.toss.features.home.core.ui.recyclerview.HomeRecyclerView;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeDstAnalysisAssetDepositActivity$$ExternalSyntheticLambda5 implements HomeRecyclerView.onWarmupCompleted {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ HomeDstAnalysisAssetDepositActivity f$0;
    public final /* synthetic */ HomeDstRecyclerView f$1;

    public /* synthetic */ HomeDstAnalysisAssetDepositActivity$$ExternalSyntheticLambda5(HomeDstAnalysisAssetDepositActivity homeDstAnalysisAssetDepositActivity, HomeDstRecyclerView homeDstRecyclerView) {
        this.f$0 = homeDstAnalysisAssetDepositActivity;
        this.f$1 = homeDstRecyclerView;
    }

    public final void onFirstLayoutCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            HomeDstAnalysisAssetDepositActivity.IAuthTabCallback(this.f$0, this.f$1, z);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        HomeDstAnalysisAssetDepositActivity.IAuthTabCallback(this.f$0, this.f$1, z);
        int i3 = onExtraCallbackWithResult + 37;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
    }
}
