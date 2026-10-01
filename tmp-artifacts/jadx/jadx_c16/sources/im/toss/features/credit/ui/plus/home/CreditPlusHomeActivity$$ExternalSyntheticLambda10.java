package im.toss.features.credit.ui.plus.home;

import android.view.View;
import im.toss.features.credit.data.response.membership.Feature;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusHomeActivity$$ExternalSyntheticLambda10 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ CreditPlusHomeActivity f$0;
    public final /* synthetic */ Feature f$1;

    public /* synthetic */ CreditPlusHomeActivity$$ExternalSyntheticLambda10(CreditPlusHomeActivity creditPlusHomeActivity, Feature feature) {
        this.f$0 = creditPlusHomeActivity;
        this.f$1 = feature;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = CreditPlusHomeActivity.onWarmupCompleted(this.f$0, this.f$1, (View) obj);
        int i4 = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
