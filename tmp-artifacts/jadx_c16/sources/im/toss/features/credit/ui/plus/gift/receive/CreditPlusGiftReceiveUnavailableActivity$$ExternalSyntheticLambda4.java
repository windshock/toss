package im.toss.features.credit.ui.plus.gift.receive;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusGiftReceiveUnavailableActivity$$ExternalSyntheticLambda4 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ CreditPlusGiftReceiveUnavailableActivity f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ CreditPlusGiftReceiveUnavailableActivity$$ExternalSyntheticLambda4(CreditPlusGiftReceiveUnavailableActivity creditPlusGiftReceiveUnavailableActivity, String str) {
        this.f$0 = creditPlusGiftReceiveUnavailableActivity;
        this.f$1 = str;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = CreditPlusGiftReceiveUnavailableActivity.onWarmupCompleted(this.f$0, this.f$1, (View) obj);
        int i4 = onExtraCallback + 25;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }
}
