package im.toss.features.credit.ui.plus.gift.send;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusGiftIntroActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ CreditPlusGiftIntroActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        CreditPlusGiftIntroActivity creditPlusGiftIntroActivity = this.f$0;
        View view = (View) obj;
        if (i3 == 0) {
            return CreditPlusGiftIntroActivity.onWarmupCompleted(creditPlusGiftIntroActivity, view);
        }
        Unit unitOnWarmupCompleted = CreditPlusGiftIntroActivity.onWarmupCompleted(creditPlusGiftIntroActivity, view);
        int i4 = 84 / 0;
        return unitOnWarmupCompleted;
    }
}
