package im.toss.ads_sdk.ui.v2.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.addRearDisplayStatusListener;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullBannerV2ScreenKt$$ExternalSyntheticLambda10 implements Function0 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ Function2 f$0;

    public final Object invoke() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 35;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            addRearDisplayStatusListener.onWarmupCompleted(this.f$0);
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = addRearDisplayStatusListener.onWarmupCompleted(this.f$0);
        int i4 = onExtraCallbackWithResult + 77;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }
}
