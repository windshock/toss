package im.toss.features.credit.ui.plus.setting;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusUnsubscribeReservationInfoActivity$$ExternalSyntheticLambda2 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ CreditPlusUnsubscribeReservationInfoActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        IAuthTabCallback = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            CreditPlusUnsubscribeReservationInfoActivity.onWarmupCompleted(this.f$0, (View) obj);
            obj2.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = CreditPlusUnsubscribeReservationInfoActivity.onWarmupCompleted(this.f$0, (View) obj);
        int i3 = onExtraCallbackWithResult + 107;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }
}
