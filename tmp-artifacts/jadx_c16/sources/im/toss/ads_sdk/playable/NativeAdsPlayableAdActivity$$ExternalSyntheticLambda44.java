package im.toss.ads_sdk.playable;

import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsPlayableAdActivity$$ExternalSyntheticLambda44 implements Function0 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ NativeAdsPlayableAdActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = NativeAdsPlayableAdActivity.onNavigationEvent(this.f$0);
        if (i3 == 0) {
            return Boolean.valueOf(zOnNavigationEvent);
        }
        Boolean.valueOf(zOnNavigationEvent);
        throw null;
    }
}
