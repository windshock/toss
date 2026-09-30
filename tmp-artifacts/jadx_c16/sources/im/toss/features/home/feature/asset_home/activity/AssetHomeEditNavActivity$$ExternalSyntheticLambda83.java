package im.toss.features.home.feature.asset_home.activity;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.GlobalInfoRecorderUtils;
import o.getPBRpcProxy;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda83 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ GlobalInfoRecorderUtils f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            AssetHomeEditNavActivity.IAuthTabCallback(this.f$0, (getPBRpcProxy.onNavigationEvent) obj);
            throw null;
        }
        Unit unitIAuthTabCallback = AssetHomeEditNavActivity.IAuthTabCallback(this.f$0, (getPBRpcProxy.onNavigationEvent) obj);
        int i3 = onWarmupCompleted + 55;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 40 / 0;
        }
        return unitIAuthTabCallback;
    }
}
