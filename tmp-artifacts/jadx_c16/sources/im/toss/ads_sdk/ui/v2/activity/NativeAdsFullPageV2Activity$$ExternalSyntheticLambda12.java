package im.toss.ads_sdk.ui.v2.activity;

import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullPageV2Activity$$ExternalSyntheticLambda12 implements Function0 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ NativeAdsFullPageV2Activity f$0;
    public final /* synthetic */ NativeAdsDto.AdAsset f$1;

    public /* synthetic */ NativeAdsFullPageV2Activity$$ExternalSyntheticLambda12(NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity, NativeAdsDto.AdAsset adAsset) {
        this.f$0 = nativeAdsFullPageV2Activity;
        this.f$1 = adAsset;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = NativeAdsFullPageV2Activity.onExtraCallback(this.f$0, this.f$1);
        int i4 = onNavigationEvent + 105;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }
}
