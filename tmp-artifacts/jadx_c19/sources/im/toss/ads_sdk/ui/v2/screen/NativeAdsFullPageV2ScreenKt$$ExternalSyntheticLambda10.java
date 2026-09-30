package im.toss.ads_sdk.ui.v2.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.Futures3;
import o.getSupportedHighSpeedResolutions;
import o.getWindowAreaStatus;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullPageV2ScreenKt$$ExternalSyntheticLambda10 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ getSupportedHighSpeedResolutions f$0;

    public final Object invoke(Object obj) {
        Unit unitIAuthTabCallback;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 31;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            unitIAuthTabCallback = getWindowAreaStatus.IAuthTabCallback(this.f$0, (Futures3) obj);
            int i4 = 18 / 0;
        } else {
            unitIAuthTabCallback = getWindowAreaStatus.IAuthTabCallback(this.f$0, (Futures3) obj);
        }
        int i5 = IAuthTabCallback + 51;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }
}
