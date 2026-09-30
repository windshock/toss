package im.toss.ads_sdk.playable;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsPlayableAdActivity$$ExternalSyntheticLambda16 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ int f$0;
    public final /* synthetic */ NativeAdsPlayableAdActivity f$1;

    public /* synthetic */ NativeAdsPlayableAdActivity$$ExternalSyntheticLambda16(int i, NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity) {
        this.f$0 = i;
        this.f$1 = nativeAdsPlayableAdActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = NativeAdsPlayableAdActivity.onExtraCallback(this.f$0, this.f$1, (SetDetectableSize) obj);
        int i4 = onWarmupCompleted + 107;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }
}
