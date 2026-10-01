package im.toss.features.home.feature.asset_home.activity;

import im.toss.features.home.feature.asset_home.viewmodel.edit.AssetLoanHomeEditViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.GlobalInfoRecorderUtils;
import o.toJSONObject$onNavigationEvent;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda31 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ AssetHomeEditNavActivity f$0;
    public final /* synthetic */ AssetLoanHomeEditViewModel f$1;
    public final /* synthetic */ GlobalInfoRecorderUtils f$2;

    public /* synthetic */ AssetHomeEditNavActivity$$ExternalSyntheticLambda31(AssetHomeEditNavActivity assetHomeEditNavActivity, AssetLoanHomeEditViewModel assetLoanHomeEditViewModel, GlobalInfoRecorderUtils globalInfoRecorderUtils) {
        this.f$0 = assetHomeEditNavActivity;
        this.f$1 = assetLoanHomeEditViewModel;
        this.f$2 = globalInfoRecorderUtils;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        AssetHomeEditNavActivity assetHomeEditNavActivity = this.f$0;
        if (i3 != 0) {
            return AssetHomeEditNavActivity.onExtraCallback(assetHomeEditNavActivity, this.f$1, this.f$2, (toJSONObject$onNavigationEvent.onWarmupCompleted) obj);
        }
        Unit unitOnExtraCallback = AssetHomeEditNavActivity.onExtraCallback(assetHomeEditNavActivity, this.f$1, this.f$2, (toJSONObject$onNavigationEvent.onWarmupCompleted) obj);
        int i4 = 7 / 0;
        return unitOnExtraCallback;
    }
}
