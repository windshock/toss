package im.toss.ads_sdk.ui.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda0;
import o.useAndConfigureProgramWithTexture;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullPageScreenKt$$ExternalSyntheticLambda17 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    public final Object invoke(Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 21;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda0.onNavigationEvent((useAndConfigureProgramWithTexture) obj);
        if (i4 == 0) {
            int i5 = 47 / 0;
        }
        return unitOnNavigationEvent;
    }
}
