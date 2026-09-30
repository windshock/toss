package im.toss.features.home.feature.asset_home.activity;

import kotlin.jvm.functions.Function1;
import o.onMenuItemClick;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda80 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ AssetHomeEditNavActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        AssetHomeEditNavActivity assetHomeEditNavActivity = this.f$0;
        onMenuItemClick onmenuitemclick = (onMenuItemClick) obj;
        if (i3 != 0) {
            return AssetHomeEditNavActivity.onExtraCallback(assetHomeEditNavActivity, onmenuitemclick);
        }
        AssetHomeEditNavActivity.onExtraCallback(assetHomeEditNavActivity, onmenuitemclick);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
