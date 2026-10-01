package im.toss.features.home.feature.asset_home.activity;

import im.toss.features.home.feature.asset_home.viewmodel.edit.AssetCardHomeEditViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.GlobalInfoRecorderUtils;
import o.toJSONObject$onNavigationEvent;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda59 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ AssetHomeEditNavActivity f$0;
    public final /* synthetic */ AssetCardHomeEditViewModel f$1;
    public final /* synthetic */ GlobalInfoRecorderUtils f$2;

    public /* synthetic */ AssetHomeEditNavActivity$$ExternalSyntheticLambda59(AssetHomeEditNavActivity assetHomeEditNavActivity, AssetCardHomeEditViewModel assetCardHomeEditViewModel, GlobalInfoRecorderUtils globalInfoRecorderUtils) {
        this.f$0 = assetHomeEditNavActivity;
        this.f$1 = assetCardHomeEditViewModel;
        this.f$2 = globalInfoRecorderUtils;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onExtraCallbackWithResult = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            AssetHomeEditNavActivity.onWarmupCompleted(this.f$0, this.f$1, this.f$2, (toJSONObject$onNavigationEvent.onExtraCallbackWithResult) obj);
            throw null;
        }
        Unit unitOnWarmupCompleted = AssetHomeEditNavActivity.onWarmupCompleted(this.f$0, this.f$1, this.f$2, (toJSONObject$onNavigationEvent.onExtraCallbackWithResult) obj);
        int i3 = onExtraCallbackWithResult + 1;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        obj2.hashCode();
        throw null;
    }
}
