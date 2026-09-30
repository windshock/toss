package im.toss.ads_sdk.ui.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.Futures3;
import o.WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda0;
import o.getSupportedHighSpeedResolutions;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullPageScreenKt$$ExternalSyntheticLambda12 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ getSupportedHighSpeedResolutions f$0;

    public final Object invoke(Object obj) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 85;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda0.IAuthTabCallback(this.f$0, (Futures3) obj);
        int i5 = onNavigationEvent + 53;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }
}
