package im.toss.ads_sdk.ui.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda0;
import o.useAndConfigureProgramWithTexture;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullPageScreenKt$$ExternalSyntheticLambda3 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public final Object invoke(Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 77;
        IAuthTabCallback = i3 % 128;
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) obj;
        if (i3 % 2 == 0) {
            WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda0.onExtraCallback(useandconfigureprogramwithtexture);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda0.onExtraCallback(useandconfigureprogramwithtexture);
        int i4 = onWarmupCompleted + 57;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 37 / 0;
        }
        return unitOnExtraCallback;
    }
}
