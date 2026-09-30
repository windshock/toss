package im.toss.ads_sdk.ui.v2.screen;

import kotlin.jvm.functions.Function1;
import o.getWindowAreaStatus;
import o.useAndConfigureProgramWithTexture;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullPageV2ScreenKt$$ExternalSyntheticLambda6 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public final Object invoke(Object obj) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 19;
        onExtraCallbackWithResult = i3 % 128;
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) obj;
        if (i3 % 2 != 0) {
            return getWindowAreaStatus.IAuthTabCallbackDefault(useandconfigureprogramwithtexture);
        }
        getWindowAreaStatus.IAuthTabCallbackDefault(useandconfigureprogramwithtexture);
        throw null;
    }
}
