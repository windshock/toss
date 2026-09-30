package im.toss.ads_sdk.ui.v2.activity;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.useAndConfigureProgramWithTexture;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullPageV2Activity$$ExternalSyntheticLambda14 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = NativeAdsFullPageV2Activity.onExtraCallbackWithResult((useAndConfigureProgramWithTexture) obj);
        int i4 = IAuthTabCallback + 59;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
