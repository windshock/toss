package im.toss.features.credit.ui.plus.insurance;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusInsuranceActivity$$ExternalSyntheticLambda4 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ CreditPlusInsuranceActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        CreditPlusInsuranceActivity creditPlusInsuranceActivity = this.f$0;
        View view = (View) obj;
        if (i3 != 0) {
            return CreditPlusInsuranceActivity.onExtraCallback(creditPlusInsuranceActivity, view);
        }
        CreditPlusInsuranceActivity.onExtraCallback(creditPlusInsuranceActivity, view);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
