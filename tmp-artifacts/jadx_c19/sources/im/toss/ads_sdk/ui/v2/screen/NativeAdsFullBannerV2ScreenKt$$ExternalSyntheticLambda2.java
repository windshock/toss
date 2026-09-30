package im.toss.ads_sdk.ui.v2.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.Futures3;
import o.addRearDisplayStatusListener;
import o.getSupportedHighSpeedResolutionsFor;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullBannerV2ScreenKt$$ExternalSyntheticLambda2 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$0;

    public final Object invoke(Object obj) {
        Unit unitOnExtraCallback;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 39;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            unitOnExtraCallback = addRearDisplayStatusListener.onExtraCallback(this.f$0, (Futures3) obj);
            int i4 = 0 / 0;
        } else {
            unitOnExtraCallback = addRearDisplayStatusListener.onExtraCallback(this.f$0, (Futures3) obj);
        }
        int i5 = onNavigationEvent + 63;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }
}
