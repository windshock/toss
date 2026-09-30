package im.toss.ads_sdk.ui.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import o.WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullPageScreenKt$$ExternalSyntheticLambda4 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ Function1 f$0;

    public final Object invoke() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 61;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackStub = WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda0.IAuthTabCallbackStub(this.f$0);
        int i5 = IAuthTabCallback + 113;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 70 / 0;
        }
        return unitIAuthTabCallbackStub;
    }
}
