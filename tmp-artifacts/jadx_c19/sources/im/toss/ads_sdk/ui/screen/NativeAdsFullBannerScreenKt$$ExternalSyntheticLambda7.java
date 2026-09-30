package im.toss.ads_sdk.ui.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.WindowAreaControllerImplRearDisplayPresentationSessionConsumerExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullBannerScreenKt$$ExternalSyntheticLambda7 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ Function2 f$0;

    public final Object invoke() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 5;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = WindowAreaControllerImplRearDisplayPresentationSessionConsumerExternalSyntheticLambda0.IAuthTabCallback(this.f$0);
        int i5 = IAuthTabCallback + 79;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }
}
