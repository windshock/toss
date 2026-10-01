package im.toss.ads_sdk.playable;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsPlayableAdActivity$$ExternalSyntheticLambda41 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ NativeAdsPlayableAdActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = NativeAdsPlayableAdActivity.onNavigationEvent(this.f$0, (SetDetectableSize) obj);
        int i4 = IAuthTabCallback + 7;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 18 / 0;
        }
        return unitOnNavigationEvent;
    }
}
