package im.toss.features.home.feature.asset_home.activity;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.setParentLayoutDirection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda5 implements Function0 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ setParentLayoutDirection f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = AssetHomeEditNavActivity.onWarmupCompleted(this.f$0);
        int i4 = onWarmupCompleted + 121;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 67 / 0;
        }
        return unitOnWarmupCompleted;
    }
}
