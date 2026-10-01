package im.toss.features.credit.ui.plus.gift.send;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusGiftIntroActivity$$ExternalSyntheticLambda3 implements Function1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ CreditPlusGiftIntroActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            CreditPlusGiftIntroActivity.onNavigationEvent(this.f$0, (View) obj);
            throw null;
        }
        Unit unitOnNavigationEvent = CreditPlusGiftIntroActivity.onNavigationEvent(this.f$0, (View) obj);
        int i3 = onNavigationEvent + 63;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }
}
