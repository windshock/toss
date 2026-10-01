package im.toss.ads_sdk.ui.v2.activity;

import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullPageV2Activity$$ExternalSyntheticLambda11 implements Function0 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ NativeAdsDto f$0;
    public final /* synthetic */ NativeAdsFullPageV2Activity f$1;

    public /* synthetic */ NativeAdsFullPageV2Activity$$ExternalSyntheticLambda11(NativeAdsDto nativeAdsDto, NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity) {
        this.f$0 = nativeAdsDto;
        this.f$1 = nativeAdsFullPageV2Activity;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            NativeAdsFullPageV2Activity.onNavigationEvent(this.f$0, this.f$1);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = NativeAdsFullPageV2Activity.onNavigationEvent(this.f$0, this.f$1);
        int i3 = onExtraCallbackWithResult + 1;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 67 / 0;
        }
        return unitOnNavigationEvent;
    }
}
