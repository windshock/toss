package im.toss.features.credit.ui.plus.gift.receive;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusGiftReceiveUnavailableActivity$$ExternalSyntheticLambda5 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ CreditPlusGiftReceiveUnavailableActivity f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ CreditPlusGiftReceiveUnavailableActivity$$ExternalSyntheticLambda5(CreditPlusGiftReceiveUnavailableActivity creditPlusGiftReceiveUnavailableActivity, String str) {
        this.f$0 = creditPlusGiftReceiveUnavailableActivity;
        this.f$1 = str;
    }

    public final Object invoke(Object obj) {
        Unit unitOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnNavigationEvent = CreditPlusGiftReceiveUnavailableActivity.onNavigationEvent(this.f$0, this.f$1, (View) obj);
            int i3 = 13 / 0;
        } else {
            unitOnNavigationEvent = CreditPlusGiftReceiveUnavailableActivity.onNavigationEvent(this.f$0, this.f$1, (View) obj);
        }
        int i4 = onNavigationEvent + 21;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
