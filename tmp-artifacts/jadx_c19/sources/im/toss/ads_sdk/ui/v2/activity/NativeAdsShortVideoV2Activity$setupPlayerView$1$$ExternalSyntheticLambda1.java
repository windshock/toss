package im.toss.ads_sdk.ui.v2.activity;

import im.toss.ads_sdk.model.NativeAdsEventLogType;
import im.toss.ads_sdk.ui.v2.activity.NativeAdsShortVideoV2Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsShortVideoV2Activity$setupPlayerView$1$$ExternalSyntheticLambda1 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ NativeAdsShortVideoV2Activity f$0;

    public final Object invoke(Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 13;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = NativeAdsShortVideoV2Activity.extraCallbackWithResult.onNavigationEvent(this.f$0, (NativeAdsEventLogType) obj);
        int i5 = IAuthTabCallback + 119;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }
}
