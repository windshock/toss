package im.toss.ads_sdk.ui.activity;

import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsBaseActivity$$ExternalSyntheticLambda2 implements Function0 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ NativeAdsBaseActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 93;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(NativeAdsBaseActivity.IAuthTabCallback(this.f$0));
        if (i3 == 0) {
            int i4 = 14 / 0;
        }
        return boolValueOf;
    }
}
