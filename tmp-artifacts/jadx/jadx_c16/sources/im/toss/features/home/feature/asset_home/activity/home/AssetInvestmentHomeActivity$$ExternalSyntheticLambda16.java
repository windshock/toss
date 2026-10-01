package im.toss.features.home.feature.asset_home.activity.home;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetInvestmentHomeActivity$$ExternalSyntheticLambda16 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i2 % 128;
        Object obj2 = null;
        SetDetectableSize setDetectableSize = (SetDetectableSize) obj;
        if (i2 % 2 == 0) {
            AssetInvestmentHomeActivity.onNavigationEvent(setDetectableSize);
            obj2.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = AssetInvestmentHomeActivity.onNavigationEvent(setDetectableSize);
        int i3 = onWarmupCompleted + 107;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }
}
