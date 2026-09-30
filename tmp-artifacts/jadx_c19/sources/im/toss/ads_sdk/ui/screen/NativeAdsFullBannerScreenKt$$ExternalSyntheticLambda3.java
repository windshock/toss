package im.toss.ads_sdk.ui.screen;

import android.content.res.Resources;
import kotlin.jvm.functions.Function1;
import o.WindowAreaControllerImplRearDisplayPresentationSessionConsumerExternalSyntheticLambda0;
import o.useAndConfigureProgramWithTexture;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullBannerScreenKt$$ExternalSyntheticLambda3 implements Function1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Resources f$1;

    public /* synthetic */ NativeAdsFullBannerScreenKt$$ExternalSyntheticLambda3(String str, Resources resources) {
        this.f$0 = str;
        this.f$1 = resources;
    }

    public final Object invoke(Object obj) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 7;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f$0;
        if (i4 == 0) {
            return WindowAreaControllerImplRearDisplayPresentationSessionConsumerExternalSyntheticLambda0.IAuthTabCallback(str, this.f$1, (useAndConfigureProgramWithTexture) obj);
        }
        WindowAreaControllerImplRearDisplayPresentationSessionConsumerExternalSyntheticLambda0.IAuthTabCallback(str, this.f$1, (useAndConfigureProgramWithTexture) obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
