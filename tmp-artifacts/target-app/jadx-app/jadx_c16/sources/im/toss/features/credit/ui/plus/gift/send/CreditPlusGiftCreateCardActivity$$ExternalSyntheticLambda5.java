package im.toss.features.credit.ui.plus.gift.send;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusGiftCreateCardActivity$$ExternalSyntheticLambda5 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        IAuthTabCallback = i2 % 128;
        View view = (View) obj;
        if (i2 % 2 == 0) {
            CreditPlusGiftCreateCardActivity.IAuthTabCallback(view);
            throw null;
        }
        Unit unitIAuthTabCallback = CreditPlusGiftCreateCardActivity.IAuthTabCallback(view);
        int i3 = onNavigationEvent + 39;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }
}
