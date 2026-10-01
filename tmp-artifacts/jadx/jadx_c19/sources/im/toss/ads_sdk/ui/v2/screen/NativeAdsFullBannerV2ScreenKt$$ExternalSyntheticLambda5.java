package im.toss.ads_sdk.ui.v2.screen;

import android.content.res.Resources;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.addRearDisplayStatusListener;
import o.useAndConfigureProgramWithTexture;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullBannerV2ScreenKt$$ExternalSyntheticLambda5 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Resources f$1;

    public /* synthetic */ NativeAdsFullBannerV2ScreenKt$$ExternalSyntheticLambda5(String str, Resources resources) {
        this.f$0 = str;
        this.f$1 = resources;
    }

    public final Object invoke(Object obj) {
        Unit unitOnExtraCallbackWithResult;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 105;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            unitOnExtraCallbackWithResult = addRearDisplayStatusListener.onExtraCallbackWithResult(this.f$0, this.f$1, (useAndConfigureProgramWithTexture) obj);
            int i4 = 41 / 0;
        } else {
            unitOnExtraCallbackWithResult = addRearDisplayStatusListener.onExtraCallbackWithResult(this.f$0, this.f$1, (useAndConfigureProgramWithTexture) obj);
        }
        int i5 = IAuthTabCallback + 101;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
