package im.toss.features.credit.ui.plus.gift.send;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusGiftEditCardActivity$$ExternalSyntheticLambda5 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ CreditPlusGiftEditCardActivity f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ CreditPlusGiftEditCardActivity$$ExternalSyntheticLambda5(CreditPlusGiftEditCardActivity creditPlusGiftEditCardActivity, String str) {
        this.f$0 = creditPlusGiftEditCardActivity;
        this.f$1 = str;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            CreditPlusGiftEditCardActivity.onNavigationEvent(this.f$0, this.f$1, (View) obj);
            throw null;
        }
        Unit unitOnNavigationEvent = CreditPlusGiftEditCardActivity.onNavigationEvent(this.f$0, this.f$1, (View) obj);
        int i3 = onNavigationEvent + 117;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }
}
