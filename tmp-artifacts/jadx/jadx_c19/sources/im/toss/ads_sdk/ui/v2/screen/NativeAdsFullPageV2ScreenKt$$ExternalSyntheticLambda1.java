package im.toss.ads_sdk.ui.v2.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getWindowAreaStatus;
import o.useAndConfigureProgramWithTexture;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullPageV2ScreenKt$$ExternalSyntheticLambda1 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    public final Object invoke(Object obj) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 91;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = getWindowAreaStatus.onWarmupCompleted((useAndConfigureProgramWithTexture) obj);
        if (i4 == 0) {
            int i5 = 29 / 0;
        }
        int i6 = IAuthTabCallback + 75;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unitOnWarmupCompleted;
    }
}
