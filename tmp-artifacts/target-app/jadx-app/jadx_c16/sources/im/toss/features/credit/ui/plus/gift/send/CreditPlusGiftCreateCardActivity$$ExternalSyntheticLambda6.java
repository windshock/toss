package im.toss.features.credit.ui.plus.gift.send;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.initSDK;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusGiftCreateCardActivity$$ExternalSyntheticLambda6 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ CreditPlusGiftCreateCardActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = CreditPlusGiftCreateCardActivity.onExtraCallback(this.f$0, (initSDK.onNavigationEvent) obj);
        int i4 = onExtraCallback + 109;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 48 / 0;
        }
        return unitOnExtraCallback;
    }
}
