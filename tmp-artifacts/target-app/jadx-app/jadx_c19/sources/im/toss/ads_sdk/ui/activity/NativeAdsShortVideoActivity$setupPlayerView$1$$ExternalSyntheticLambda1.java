package im.toss.ads_sdk.ui.activity;

import im.toss.ads_sdk.model.NativeAdsEventLogType;
import im.toss.ads_sdk.ui.activity.NativeAdsShortVideoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsShortVideoActivity$setupPlayerView$1$$ExternalSyntheticLambda1 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ NativeAdsShortVideoActivity f$0;

    public final Object invoke(Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 63;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            NativeAdsShortVideoActivity.access000.onWarmupCompleted(this.f$0, (NativeAdsEventLogType) obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = NativeAdsShortVideoActivity.access000.onWarmupCompleted(this.f$0, (NativeAdsEventLogType) obj);
        int i4 = onWarmupCompleted + 59;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 11 / 0;
        }
        return unitOnWarmupCompleted;
    }
}
