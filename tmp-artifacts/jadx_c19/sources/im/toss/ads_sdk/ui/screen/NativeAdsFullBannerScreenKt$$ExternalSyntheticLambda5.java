package im.toss.ads_sdk.ui.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.WindowAreaControllerImplRearDisplayPresentationSessionConsumerExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullBannerScreenKt$$ExternalSyntheticLambda5 implements Function0 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ Function2 f$0;

    public final Object invoke() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 49;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            WindowAreaControllerImplRearDisplayPresentationSessionConsumerExternalSyntheticLambda0.onExtraCallback(this.f$0);
            throw null;
        }
        Unit unitOnExtraCallback = WindowAreaControllerImplRearDisplayPresentationSessionConsumerExternalSyntheticLambda0.onExtraCallback(this.f$0);
        int i4 = onNavigationEvent + 23;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }
}
