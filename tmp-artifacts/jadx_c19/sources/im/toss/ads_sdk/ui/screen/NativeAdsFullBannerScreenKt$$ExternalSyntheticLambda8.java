package im.toss.ads_sdk.ui.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.WindowAreaControllerImplRearDisplayPresentationSessionConsumerExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullBannerScreenKt$$ExternalSyntheticLambda8 implements Function0 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Function2 f$0;

    public final Object invoke() {
        Unit unitOnWarmupCompleted;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 81;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            unitOnWarmupCompleted = WindowAreaControllerImplRearDisplayPresentationSessionConsumerExternalSyntheticLambda0.onWarmupCompleted(this.f$0);
            int i4 = 82 / 0;
        } else {
            unitOnWarmupCompleted = WindowAreaControllerImplRearDisplayPresentationSessionConsumerExternalSyntheticLambda0.onWarmupCompleted(this.f$0);
        }
        int i5 = onWarmupCompleted + 117;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
