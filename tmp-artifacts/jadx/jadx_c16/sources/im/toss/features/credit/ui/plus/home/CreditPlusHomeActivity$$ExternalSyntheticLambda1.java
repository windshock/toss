package im.toss.features.credit.ui.plus.home;

import android.view.View;
import im.toss.features.credit.data.response.membership.Feature;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusHomeActivity$$ExternalSyntheticLambda1 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ CreditPlusHomeActivity f$0;
    public final /* synthetic */ Feature f$1;

    public /* synthetic */ CreditPlusHomeActivity$$ExternalSyntheticLambda1(CreditPlusHomeActivity creditPlusHomeActivity, Feature feature) {
        this.f$0 = creditPlusHomeActivity;
        this.f$1 = feature;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = CreditPlusHomeActivity.onNavigationEvent(this.f$0, this.f$1, (View) obj);
        int i4 = IAuthTabCallback + 67;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }
}
