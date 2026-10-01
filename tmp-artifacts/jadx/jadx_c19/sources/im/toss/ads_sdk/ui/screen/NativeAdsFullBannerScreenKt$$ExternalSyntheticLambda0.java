package im.toss.ads_sdk.ui.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.Futures3;
import o.WindowAreaControllerImplRearDisplayPresentationSessionConsumerExternalSyntheticLambda0;
import o.getSupportedHighSpeedResolutionsFor;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullBannerScreenKt$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$0;

    public final Object invoke(Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 125;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = WindowAreaControllerImplRearDisplayPresentationSessionConsumerExternalSyntheticLambda0.onExtraCallbackWithResult(this.f$0, (Futures3) obj);
        int i5 = IAuthTabCallback + 91;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 2 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }
}
