package im.toss.ads_sdk.ui.activity;

import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsShortVideoActivity$$ExternalSyntheticLambda19 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ NativeAdsDto f$0;
    public final /* synthetic */ NativeAdsShortVideoActivity f$1;

    public /* synthetic */ NativeAdsShortVideoActivity$$ExternalSyntheticLambda19(NativeAdsDto nativeAdsDto, NativeAdsShortVideoActivity nativeAdsShortVideoActivity) {
        this.f$0 = nativeAdsDto;
        this.f$1 = nativeAdsShortVideoActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = NativeAdsShortVideoActivity.onNavigationEvent(this.f$0, this.f$1, ((Boolean) obj).booleanValue());
        int i4 = IAuthTabCallback + 75;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }
}
