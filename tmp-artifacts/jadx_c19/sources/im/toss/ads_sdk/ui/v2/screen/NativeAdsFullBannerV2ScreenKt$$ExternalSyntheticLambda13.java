package im.toss.ads_sdk.ui.v2.screen;

import kotlin.jvm.functions.Function0;
import o.addRearDisplayStatusListener;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullBannerV2ScreenKt$$ExternalSyntheticLambda13 implements Function0 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Function0 f$0;

    public final Object invoke() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 95;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Function0 function0 = this.f$0;
        if (i4 != 0) {
            return addRearDisplayStatusListener.onExtraCallback(function0);
        }
        addRearDisplayStatusListener.onExtraCallback(function0);
        throw null;
    }
}
