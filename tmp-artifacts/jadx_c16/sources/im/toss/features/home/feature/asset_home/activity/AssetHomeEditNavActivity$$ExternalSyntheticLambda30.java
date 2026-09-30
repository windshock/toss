package im.toss.features.home.feature.asset_home.activity;

import kotlin.jvm.functions.Function1;
import o.onMenuItemClick;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda30 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ AssetHomeEditNavActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        AssetHomeEditNavActivity assetHomeEditNavActivity = this.f$0;
        onMenuItemClick onmenuitemclick = (onMenuItemClick) obj;
        if (i3 == 0) {
            return AssetHomeEditNavActivity.onWarmupCompleted(assetHomeEditNavActivity, onmenuitemclick);
        }
        AssetHomeEditNavActivity.onWarmupCompleted(assetHomeEditNavActivity, onmenuitemclick);
        throw null;
    }
}
