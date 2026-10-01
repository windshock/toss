package im.toss.ads_sdk.playable;

import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsPlayableAdActivity$$ExternalSyntheticLambda31 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ NativeAdsPlayableAdActivity f$0;
    public final /* synthetic */ NativeAdsDto f$1;

    public /* synthetic */ NativeAdsPlayableAdActivity$$ExternalSyntheticLambda31(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, NativeAdsDto nativeAdsDto) {
        this.f$0 = nativeAdsPlayableAdActivity;
        this.f$1 = nativeAdsDto;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity = this.f$0;
        if (i3 == 0) {
            return NativeAdsPlayableAdActivity.onExtraCallback(nativeAdsPlayableAdActivity, this.f$1, ((Boolean) obj).booleanValue());
        }
        NativeAdsPlayableAdActivity.onExtraCallback(nativeAdsPlayableAdActivity, this.f$1, ((Boolean) obj).booleanValue());
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
