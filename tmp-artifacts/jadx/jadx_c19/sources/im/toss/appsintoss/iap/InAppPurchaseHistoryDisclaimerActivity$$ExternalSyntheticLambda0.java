package im.toss.appsintoss.iap;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class InAppPurchaseHistoryDisclaimerActivity$$ExternalSyntheticLambda0 implements Function0 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ InAppPurchaseHistoryDisclaimerActivity f$0;

    public final Object invoke() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 83;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = InAppPurchaseHistoryDisclaimerActivity.IAuthTabCallback(this.f$0);
        int i5 = onExtraCallback + 21;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 35 / 0;
        }
        return unitIAuthTabCallback;
    }
}
