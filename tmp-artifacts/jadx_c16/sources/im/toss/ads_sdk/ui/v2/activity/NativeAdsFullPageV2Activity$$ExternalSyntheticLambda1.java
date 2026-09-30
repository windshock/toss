package im.toss.ads_sdk.ui.v2.activity;

import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullPageV2Activity$$ExternalSyntheticLambda1 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ NativeAdsDto f$0;
    public final /* synthetic */ NativeAdsFullPageV2Activity f$1;

    public /* synthetic */ NativeAdsFullPageV2Activity$$ExternalSyntheticLambda1(NativeAdsDto nativeAdsDto, NativeAdsFullPageV2Activity nativeAdsFullPageV2Activity) {
        this.f$0 = nativeAdsDto;
        this.f$1 = nativeAdsFullPageV2Activity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = NativeAdsFullPageV2Activity.IAuthTabCallback(this.f$0, this.f$1, (String) obj);
        int i4 = IAuthTabCallback + 111;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
