package im.toss.ads_sdk.ui.v2.activity;

import im.toss.ads_sdk.model.NativeAdsEventLogType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsShortVideoV2Activity$$ExternalSyntheticLambda1 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ NativeAdsShortVideoV2Activity f$0;

    public final Object invoke(Object obj) {
        Unit unitOnExtraCallback;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnExtraCallback = NativeAdsShortVideoV2Activity.onExtraCallback(this.f$0, (NativeAdsEventLogType) obj);
            int i3 = 77 / 0;
        } else {
            unitOnExtraCallback = NativeAdsShortVideoV2Activity.onExtraCallback(this.f$0, (NativeAdsEventLogType) obj);
        }
        int i4 = onExtraCallback + 53;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }
}
