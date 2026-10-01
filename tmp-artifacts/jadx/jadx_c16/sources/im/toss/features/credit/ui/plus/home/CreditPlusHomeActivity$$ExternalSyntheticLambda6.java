package im.toss.features.credit.ui.plus.home;

import android.view.View;
import im.toss.features.credit.data.response.membership.TopSection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusHomeActivity$$ExternalSyntheticLambda6 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ CreditPlusHomeActivity f$0;
    public final /* synthetic */ TopSection f$1;

    public /* synthetic */ CreditPlusHomeActivity$$ExternalSyntheticLambda6(CreditPlusHomeActivity creditPlusHomeActivity, TopSection topSection) {
        this.f$0 = creditPlusHomeActivity;
        this.f$1 = topSection;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        IAuthTabCallback = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            CreditPlusHomeActivity.onExtraCallback(this.f$0, this.f$1, (View) obj);
            obj2.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = CreditPlusHomeActivity.onExtraCallback(this.f$0, this.f$1, (View) obj);
        int i3 = IAuthTabCallback + 85;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallback;
        }
        obj2.hashCode();
        throw null;
    }
}
