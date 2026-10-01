package im.toss.ads_sdk.ui.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.WindowAreaControllerImplRearDisplayPresentationSessionConsumerExternalSyntheticLambda0;
import o.useAndConfigureProgramWithTexture;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullBannerScreenKt$$ExternalSyntheticLambda1 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    public final Object invoke(Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 99;
        onNavigationEvent = i3 % 128;
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) obj;
        if (i3 % 2 == 0) {
            WindowAreaControllerImplRearDisplayPresentationSessionConsumerExternalSyntheticLambda0.onWarmupCompleted(useandconfigureprogramwithtexture);
            throw null;
        }
        Unit unitOnWarmupCompleted = WindowAreaControllerImplRearDisplayPresentationSessionConsumerExternalSyntheticLambda0.onWarmupCompleted(useandconfigureprogramwithtexture);
        int i4 = onNavigationEvent + 31;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 89 / 0;
        }
        return unitOnWarmupCompleted;
    }
}
