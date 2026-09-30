package im.toss.ads_sdk.ui.v2.activity;

import im.toss.ads_sdk.model.NativeAdsEventLogType;
import im.toss.ads_sdk.ui.v2.activity.NativeAdsShortVideoV2Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsShortVideoV2Activity$setupPlayerView$1$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ NativeAdsShortVideoV2Activity f$0;

    public final Object invoke(Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 75;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = NativeAdsShortVideoV2Activity.extraCallbackWithResult.onExtraCallback(this.f$0, (NativeAdsEventLogType) obj);
        int i5 = onExtraCallback + 107;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
