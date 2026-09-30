package im.toss.ads_sdk.ui.v2.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getWindowAreaStatus;
import o.useAndConfigureProgramWithTexture;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullPageV2ScreenKt$$ExternalSyntheticLambda7 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public final Object invoke(Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 19;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackStub = getWindowAreaStatus.IAuthTabCallbackStub((useAndConfigureProgramWithTexture) obj);
        int i5 = onWarmupCompleted + 101;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallbackStub;
    }
}
