package im.toss.ads_sdk.playable;

import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsPlayableAdActivity$$ExternalSyntheticLambda43 implements Function0 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ NativeAdsPlayableAdActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Boolean.valueOf(NativeAdsPlayableAdActivity.onTransact(this.f$0));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Boolean boolValueOf = Boolean.valueOf(NativeAdsPlayableAdActivity.onTransact(this.f$0));
        int i3 = onExtraCallbackWithResult + 77;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 54 / 0;
        }
        return boolValueOf;
    }
}
