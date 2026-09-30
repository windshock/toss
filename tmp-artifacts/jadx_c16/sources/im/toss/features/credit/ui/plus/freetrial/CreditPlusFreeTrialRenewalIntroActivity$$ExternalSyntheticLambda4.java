package im.toss.features.credit.ui.plus.freetrial;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusFreeTrialRenewalIntroActivity$$ExternalSyntheticLambda4 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ CreditPlusFreeTrialRenewalIntroActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            CreditPlusFreeTrialRenewalIntroActivity.onWarmupCompleted(this.f$0, (View) obj);
            throw null;
        }
        Unit unitOnWarmupCompleted = CreditPlusFreeTrialRenewalIntroActivity.onWarmupCompleted(this.f$0, (View) obj);
        int i3 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }
}
