package im.toss.ads_sdk.playable;

import im.toss.ads_sdk.model.NativeAdsEventLogType;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsPlayableAdActivity$$ExternalSyntheticLambda15 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ NativeAdsPlayableAdActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity = this.f$0;
        NativeAdsEventLogType nativeAdsEventLogType = (NativeAdsEventLogType) obj;
        if (i3 == 0) {
            return NativeAdsPlayableAdActivity.onExtraCallbackWithResult(nativeAdsPlayableAdActivity, nativeAdsEventLogType);
        }
        NativeAdsPlayableAdActivity.onExtraCallbackWithResult(nativeAdsPlayableAdActivity, nativeAdsEventLogType);
        throw null;
    }
}
