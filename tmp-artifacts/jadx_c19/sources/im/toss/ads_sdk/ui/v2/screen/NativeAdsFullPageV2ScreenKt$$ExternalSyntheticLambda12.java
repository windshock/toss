package im.toss.ads_sdk.ui.v2.screen;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import o.getWindowAreaStatus;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullPageV2ScreenKt$$ExternalSyntheticLambda12 implements Function0 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ Function1 f$0;

    public final Object invoke() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 47;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Function1 function1 = this.f$0;
        if (i4 != 0) {
            return getWindowAreaStatus.onExtraCallback(function1);
        }
        getWindowAreaStatus.onExtraCallback(function1);
        throw null;
    }
}
