package im.toss.ads_sdk.ui.activity;

import im.toss.ads_sdk.model.NativeAdsEventLogType;
import im.toss.ads_sdk.ui.activity.NativeAdsShortVideoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsShortVideoActivity$setupPlayerView$1$$ExternalSyntheticLambda2 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ NativeAdsShortVideoActivity f$0;

    public final Object invoke(Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 53;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = NativeAdsShortVideoActivity.access000.onExtraCallbackWithResult(this.f$0, (NativeAdsEventLogType) obj);
        int i5 = onWarmupCompleted + 105;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
