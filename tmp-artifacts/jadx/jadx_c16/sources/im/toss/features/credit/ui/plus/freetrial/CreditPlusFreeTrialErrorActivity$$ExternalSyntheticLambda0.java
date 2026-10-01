package im.toss.features.credit.ui.plus.freetrial;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusFreeTrialErrorActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ CreditPlusFreeTrialErrorActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        CreditPlusFreeTrialErrorActivity creditPlusFreeTrialErrorActivity = this.f$0;
        View view = (View) obj;
        if (i3 == 0) {
            return CreditPlusFreeTrialErrorActivity.onNavigationEvent(creditPlusFreeTrialErrorActivity, view);
        }
        CreditPlusFreeTrialErrorActivity.onNavigationEvent(creditPlusFreeTrialErrorActivity, view);
        throw null;
    }
}
