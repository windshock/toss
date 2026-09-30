package im.toss.ads_sdk.ui.v2.screen;

import im.toss.features.usshome.UssHomeItemAdapter$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.addRearDisplayStatusListener;
import o.useAndConfigureProgramWithTexture;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullBannerV2ScreenKt$$ExternalSyntheticLambda3 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    public final Object invoke(Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 57;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int iOnWarmupCompleted = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        int iOnWarmupCompleted2 = UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted();
        Unit unit = (Unit) addRearDisplayStatusListener.onNavigationEvent(UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted, UssHomeItemAdapter$.ExternalSyntheticLambda6.onWarmupCompleted(), iOnWarmupCompleted2, -214743366, new Object[]{(useAndConfigureProgramWithTexture) obj}, 214743369);
        int i5 = onExtraCallback + 47;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }
}
