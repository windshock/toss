package im.toss.ads_sdk.ui.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import o.WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullPageScreenKt$$ExternalSyntheticLambda14 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ Function1 f$0;

    public final Object invoke() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda0.onNavigationEvent(this.f$0);
        if (i4 == 0) {
            int i5 = 79 / 0;
        }
        return unitOnNavigationEvent;
    }
}
