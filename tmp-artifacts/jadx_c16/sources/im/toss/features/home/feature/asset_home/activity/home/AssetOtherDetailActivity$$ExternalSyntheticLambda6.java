package im.toss.features.home.feature.asset_home.activity.home;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.CollectionUtils;
import o.onAdViewAdDisplayFailed;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetOtherDetailActivity$$ExternalSyntheticLambda6 implements Function0 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ AssetOtherDetailActivity f$0;
    public final /* synthetic */ CollectionUtils.onWarmupCompleted f$1;

    public /* synthetic */ AssetOtherDetailActivity$$ExternalSyntheticLambda6(AssetOtherDetailActivity assetOtherDetailActivity, CollectionUtils.onWarmupCompleted onwarmupcompleted) {
        this.f$0 = assetOtherDetailActivity;
        this.f$1 = onwarmupcompleted;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = {this.f$0, this.f$1};
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object[] objArr2 = {this.f$0, this.f$1};
        Unit unit = (Unit) AssetOtherDetailActivity.onExtraCallbackWithResult(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), -1096280234, onAdViewAdDisplayFailed.onExtraCallbackWithResult(), objArr2, 1096280234);
        int i3 = onWarmupCompleted + 19;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }
}
