package im.toss.ads_sdk.ui.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda0;
import o.useAndConfigureProgramWithTexture;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullPageScreenKt$$ExternalSyntheticLambda6 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    public final Object invoke(Object obj) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 1;
        IAuthTabCallback = i3 % 128;
        Object obj2 = null;
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) obj;
        if (i3 % 2 == 0) {
            WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda0.IAuthTabCallbackDefault(useandconfigureprogramwithtexture);
            throw null;
        }
        Unit unitIAuthTabCallbackDefault = WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda0.IAuthTabCallbackDefault(useandconfigureprogramwithtexture);
        int i4 = onNavigationEvent + 111;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallbackDefault;
        }
        obj2.hashCode();
        throw null;
    }
}
