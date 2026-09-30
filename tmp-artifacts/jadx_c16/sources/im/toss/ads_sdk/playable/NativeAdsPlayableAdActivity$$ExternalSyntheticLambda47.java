package im.toss.ads_sdk.playable;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsPlayableAdActivity$$ExternalSyntheticLambda47 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ NativeAdsPlayableAdActivity f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ NativeAdsPlayableAdActivity$$ExternalSyntheticLambda47(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, String str) {
        this.f$0 = nativeAdsPlayableAdActivity;
        this.f$1 = str;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = NativeAdsPlayableAdActivity.onExtraCallbackWithResult(this.f$0, this.f$1);
        int i4 = IAuthTabCallback + 19;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
