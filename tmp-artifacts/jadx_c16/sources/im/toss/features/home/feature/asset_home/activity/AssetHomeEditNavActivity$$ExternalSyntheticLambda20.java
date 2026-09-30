package im.toss.features.home.feature.asset_home.activity;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda20 implements Function0 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = AssetHomeEditNavActivity.onNavigationEvent();
        int i4 = onExtraCallback + 17;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
        return unitOnNavigationEvent;
    }
}
