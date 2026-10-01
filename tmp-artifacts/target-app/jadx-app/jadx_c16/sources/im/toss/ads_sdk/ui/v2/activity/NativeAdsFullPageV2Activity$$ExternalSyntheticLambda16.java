package im.toss.ads_sdk.ui.v2.activity;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.useAndConfigureProgramWithTexture;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullPageV2Activity$$ExternalSyntheticLambda16 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = NativeAdsFullPageV2Activity.onExtraCallback((useAndConfigureProgramWithTexture) obj);
        if (i3 == 0) {
            int i4 = 54 / 0;
        }
        return unitOnExtraCallback;
    }
}
