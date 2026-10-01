package im.toss.features.credit.ui.plus.home;

import android.view.View;
import im.toss.features.credit.data.response.membership.FreeTrialStatusSection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusHomeActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ CreditPlusHomeActivity f$0;
    public final /* synthetic */ FreeTrialStatusSection f$1;

    public /* synthetic */ CreditPlusHomeActivity$$ExternalSyntheticLambda0(CreditPlusHomeActivity creditPlusHomeActivity, FreeTrialStatusSection freeTrialStatusSection) {
        this.f$0 = creditPlusHomeActivity;
        this.f$1 = freeTrialStatusSection;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 71;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = CreditPlusHomeActivity.onWarmupCompleted(this.f$0, this.f$1, (View) obj);
        int i4 = IAuthTabCallback + 31;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }
}
