package im.toss.ads_sdk.ui.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda0;
import o.useAndConfigureProgramWithTexture;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullPageScreenKt$$ExternalSyntheticLambda8 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public final Object invoke(Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackStub = WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda0.IAuthTabCallbackStub((useAndConfigureProgramWithTexture) obj);
        if (i4 == 0) {
            int i5 = 43 / 0;
        }
        return unitIAuthTabCallbackStub;
    }
}
