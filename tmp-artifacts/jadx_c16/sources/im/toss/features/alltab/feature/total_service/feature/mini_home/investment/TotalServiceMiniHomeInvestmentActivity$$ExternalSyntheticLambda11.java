package im.toss.features.alltab.feature.total_service.feature.mini_home.investment;

import kotlin.jvm.functions.Function1;
import o.AuthenticatorCompanion;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TotalServiceMiniHomeInvestmentActivity$$ExternalSyntheticLambda11 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onExtraCallbackWithResult = i2 % 128;
        AuthenticatorCompanion.onExtraCallbackWithResult onextracallbackwithresult = (AuthenticatorCompanion.onExtraCallbackWithResult) obj;
        if (i2 % 2 != 0) {
            return TotalServiceMiniHomeInvestmentActivity.onWarmupCompleted(onextracallbackwithresult);
        }
        TotalServiceMiniHomeInvestmentActivity.onWarmupCompleted(onextracallbackwithresult);
        throw null;
    }
}
