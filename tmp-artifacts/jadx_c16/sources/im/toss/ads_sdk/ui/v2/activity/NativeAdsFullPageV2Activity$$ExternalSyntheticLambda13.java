package im.toss.ads_sdk.ui.v2.activity;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.useAndConfigureProgramWithTexture;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullPageV2Activity$$ExternalSyntheticLambda13 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ String f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = NativeAdsFullPageV2Activity.onExtraCallbackWithResult(this.f$0, (useAndConfigureProgramWithTexture) obj);
        if (i3 == 0) {
            int i4 = 62 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }
}
