package im.toss.ads_sdk.ui.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda0;
import o.useAndConfigureProgramWithTexture;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullPageScreenKt$$ExternalSyntheticLambda1 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public final Object invoke(Object obj) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 89;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda0.onWarmupCompleted((useAndConfigureProgramWithTexture) obj);
        int i5 = onExtraCallback + 73;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }
}
