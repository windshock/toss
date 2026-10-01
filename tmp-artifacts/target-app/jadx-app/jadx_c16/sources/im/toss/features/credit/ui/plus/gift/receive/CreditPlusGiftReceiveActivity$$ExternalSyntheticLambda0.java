package im.toss.features.credit.ui.plus.gift.receive;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.initMiniApp;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusGiftReceiveActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ CreditPlusGiftReceiveActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = CreditPlusGiftReceiveActivity.onNavigationEvent(this.f$0, (initMiniApp.onWarmupCompleted) obj);
        int i4 = onExtraCallback + 107;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 38 / 0;
        }
        return unitOnNavigationEvent;
    }
}
