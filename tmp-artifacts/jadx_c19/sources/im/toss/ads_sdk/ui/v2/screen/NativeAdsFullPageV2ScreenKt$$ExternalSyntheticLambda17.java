package im.toss.ads_sdk.ui.v2.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getWindowAreaStatus;
import o.useAndConfigureProgramWithTexture;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullPageV2ScreenKt$$ExternalSyntheticLambda17 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    public final Object invoke(Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 109;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = getWindowAreaStatus.onExtraCallbackWithResult((useAndConfigureProgramWithTexture) obj);
        if (i4 != 0) {
            int i5 = 6 / 0;
        }
        int i6 = onExtraCallbackWithResult + 37;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
