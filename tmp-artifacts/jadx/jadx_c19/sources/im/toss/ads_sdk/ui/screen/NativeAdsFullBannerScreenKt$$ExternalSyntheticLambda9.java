package im.toss.ads_sdk.ui.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.WindowAreaControllerImplRearDisplayPresentationSessionConsumerExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullBannerScreenKt$$ExternalSyntheticLambda9 implements Function0 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ Function2 f$0;

    public final Object invoke() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 101;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            WindowAreaControllerImplRearDisplayPresentationSessionConsumerExternalSyntheticLambda0.onExtraCallbackWithResult(this.f$0);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = WindowAreaControllerImplRearDisplayPresentationSessionConsumerExternalSyntheticLambda0.onExtraCallbackWithResult(this.f$0);
        int i4 = onExtraCallbackWithResult + 61;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }
}
