package im.toss.features.credit.ui.plus.gift.send;

import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusGiftEditCardActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        IAuthTabCallback = i2 % 128;
        CharSequence charSequence = (CharSequence) obj;
        if (i2 % 2 != 0) {
            CreditPlusGiftEditCardActivity.onWarmupCompleted(charSequence);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Integer numOnWarmupCompleted = CreditPlusGiftEditCardActivity.onWarmupCompleted(charSequence);
        int i3 = IAuthTabCallback + 33;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return numOnWarmupCompleted;
    }
}
