package im.toss.features.credit.ui.plus.gift.send;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusGiftCreateCardActivity$$ExternalSyntheticLambda3 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ CreditPlusGiftCreateCardActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        CreditPlusGiftCreateCardActivity creditPlusGiftCreateCardActivity = this.f$0;
        View view = (View) obj;
        if (i3 == 0) {
            return CreditPlusGiftCreateCardActivity.onWarmupCompleted(creditPlusGiftCreateCardActivity, view);
        }
        CreditPlusGiftCreateCardActivity.onWarmupCompleted(creditPlusGiftCreateCardActivity, view);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
