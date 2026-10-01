package im.toss.ads_sdk.playable;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsPlayableAdActivity$$ExternalSyntheticLambda3 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ NativeAdsPlayableAdActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity = this.f$0;
        SetDetectableSize setDetectableSize = (SetDetectableSize) obj;
        if (i3 != 0) {
            return NativeAdsPlayableAdActivity.onExtraCallbackWithResult(nativeAdsPlayableAdActivity, setDetectableSize);
        }
        Unit unitOnExtraCallbackWithResult = NativeAdsPlayableAdActivity.onExtraCallbackWithResult(nativeAdsPlayableAdActivity, setDetectableSize);
        int i4 = 72 / 0;
        return unitOnExtraCallbackWithResult;
    }
}
