package im.toss.ads_sdk.ui.v2.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getWindowAreaStatus;
import o.useAndConfigureProgramWithTexture;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullPageV2ScreenKt$$ExternalSyntheticLambda15 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    public final Object invoke(Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 109;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = getWindowAreaStatus.onNavigationEvent((useAndConfigureProgramWithTexture) obj);
        if (i4 != 0) {
            int i5 = 23 / 0;
        }
        int i6 = onWarmupCompleted + 75;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }
}
