package im.toss.ads_sdk.ui.v2.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getWindowAreaStatus;
import o.useAndConfigureProgramWithTexture;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullPageV2ScreenKt$$ExternalSyntheticLambda4 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public final Object invoke(Object obj) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 75;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAsInterface = getWindowAreaStatus.asInterface((useAndConfigureProgramWithTexture) obj);
        int i5 = onNavigationEvent + 89;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 98 / 0;
        }
        return unitAsInterface;
    }
}
