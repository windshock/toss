package im.toss.ads_sdk.ui.activity;

import im.toss.ads_sdk.model.NativeAdsEventLogType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsShortVideoActivity$$ExternalSyntheticLambda17 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ NativeAdsShortVideoActivity f$0;

    public final Object invoke(Object obj) {
        Unit unitOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnWarmupCompleted = NativeAdsShortVideoActivity.onWarmupCompleted(this.f$0, (NativeAdsEventLogType) obj);
            int i3 = 3 / 0;
        } else {
            unitOnWarmupCompleted = NativeAdsShortVideoActivity.onWarmupCompleted(this.f$0, (NativeAdsEventLogType) obj);
        }
        int i4 = IAuthTabCallback + 19;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
