package im.toss.ads_sdk.ui.v2.screen;

import android.content.res.Resources;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.addRearDisplayStatusListener;
import o.useAndConfigureProgramWithTexture;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullBannerV2ScreenKt$$ExternalSyntheticLambda6 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ Resources f$0;

    public final Object invoke(Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 87;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            addRearDisplayStatusListener.IAuthTabCallback(this.f$0, (useAndConfigureProgramWithTexture) obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = addRearDisplayStatusListener.IAuthTabCallback(this.f$0, (useAndConfigureProgramWithTexture) obj);
        int i4 = onWarmupCompleted + 83;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
