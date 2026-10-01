package im.toss.features.credit.ui.plus.gift.send;

import kotlin.jvm.functions.Function1;
import o.deserializeIntNullableCollection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusGiftEditCardActivity$$ExternalSyntheticLambda1 implements deserializeIntNullableCollection {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ Function1 f$0;

    public final Object apply(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        onNavigationEvent = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            CreditPlusGiftEditCardActivity.onWarmupCompleted(this.f$0, obj);
            obj2.hashCode();
            throw null;
        }
        Integer numOnWarmupCompleted = CreditPlusGiftEditCardActivity.onWarmupCompleted(this.f$0, obj);
        int i3 = onExtraCallbackWithResult + 97;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return numOnWarmupCompleted;
        }
        obj2.hashCode();
        throw null;
    }
}
