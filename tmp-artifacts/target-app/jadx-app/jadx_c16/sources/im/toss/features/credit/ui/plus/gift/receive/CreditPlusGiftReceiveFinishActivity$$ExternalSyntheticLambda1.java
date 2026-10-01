package im.toss.features.credit.ui.plus.gift.receive;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusGiftReceiveFinishActivity$$ExternalSyntheticLambda1 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ CreditPlusGiftReceiveFinishActivity f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ CreditPlusGiftReceiveFinishActivity$$ExternalSyntheticLambda1(CreditPlusGiftReceiveFinishActivity creditPlusGiftReceiveFinishActivity, boolean z) {
        this.f$0 = creditPlusGiftReceiveFinishActivity;
        this.f$1 = z;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onExtraCallback = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            CreditPlusGiftReceiveFinishActivity.onWarmupCompleted(this.f$0, this.f$1, (View) obj);
            obj2.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = CreditPlusGiftReceiveFinishActivity.onWarmupCompleted(this.f$0, this.f$1, (View) obj);
        int i3 = onExtraCallback + 35;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        obj2.hashCode();
        throw null;
    }
}
