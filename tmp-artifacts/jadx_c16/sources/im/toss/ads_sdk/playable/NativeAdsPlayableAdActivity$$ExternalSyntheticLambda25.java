package im.toss.ads_sdk.playable;

import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsPlayableAdActivity$$ExternalSyntheticLambda25 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ NativeAdsPlayableAdActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(NativeAdsPlayableAdActivity.IAuthTabCallback(this.f$0, (String) obj));
        int i4 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return boolValueOf;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
