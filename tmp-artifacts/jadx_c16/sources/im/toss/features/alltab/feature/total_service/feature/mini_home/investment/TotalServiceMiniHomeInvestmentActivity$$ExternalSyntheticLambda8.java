package im.toss.features.alltab.feature.total_service.feature.mini_home.investment;

import im.toss.tds.compose.foundation.anim.rally.Rally;
import kotlin.jvm.functions.Function1;
import o.AppLovinSdkSettings;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TotalServiceMiniHomeInvestmentActivity$$ExternalSyntheticLambda8 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallback = TotalServiceMiniHomeInvestmentActivity.IAuthTabCallback((Rally) obj);
        int i4 = onExtraCallbackWithResult + 87;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return appLovinSdkSettingsIAuthTabCallback;
        }
        throw null;
    }
}
