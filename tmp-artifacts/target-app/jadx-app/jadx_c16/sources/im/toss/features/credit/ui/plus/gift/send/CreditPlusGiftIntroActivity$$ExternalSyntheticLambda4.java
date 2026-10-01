package im.toss.features.credit.ui.plus.gift.send;

import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusGiftIntroActivity$$ExternalSyntheticLambda4 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ CreditPlusGiftIntroActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        CreditPlusGiftIntroActivity creditPlusGiftIntroActivity = this.f$0;
        String str = (String) obj;
        if (i3 != 0) {
            return CreditPlusGiftIntroActivity.onWarmupCompleted(creditPlusGiftIntroActivity, str);
        }
        CreditPlusGiftIntroActivity.onWarmupCompleted(creditPlusGiftIntroActivity, str);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
