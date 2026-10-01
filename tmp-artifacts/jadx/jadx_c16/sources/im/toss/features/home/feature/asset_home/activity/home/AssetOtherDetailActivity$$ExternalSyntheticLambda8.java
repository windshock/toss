package im.toss.features.home.feature.asset_home.activity.home;

import kotlin.jvm.functions.Function0;
import o.CollectionUtils;
import o.getSupportedHighSpeedResolutionsFor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetOtherDetailActivity$$ExternalSyntheticLambda8 implements Function0 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ CollectionUtils.onWarmupCompleted f$0;
    public final /* synthetic */ AssetOtherDetailActivity f$1;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$2;

    public /* synthetic */ AssetOtherDetailActivity$$ExternalSyntheticLambda8(CollectionUtils.onWarmupCompleted onwarmupcompleted, AssetOtherDetailActivity assetOtherDetailActivity, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        this.f$0 = onwarmupcompleted;
        this.f$1 = assetOtherDetailActivity;
        this.f$2 = getsupportedhighspeedresolutionsfor;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        CollectionUtils.onWarmupCompleted onwarmupcompleted = this.f$0;
        if (i3 == 0) {
            return AssetOtherDetailActivity.onExtraCallback(onwarmupcompleted, this.f$1, this.f$2);
        }
        int i4 = 54 / 0;
        return AssetOtherDetailActivity.onExtraCallback(onwarmupcompleted, this.f$1, this.f$2);
    }
}
