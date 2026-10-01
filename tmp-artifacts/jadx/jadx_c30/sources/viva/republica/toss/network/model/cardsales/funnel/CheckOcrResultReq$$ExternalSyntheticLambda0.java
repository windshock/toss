package viva.republica.toss.network.model.cardsales.funnel;

import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class CheckOcrResultReq$$ExternalSyntheticLambda0 implements Function0 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return CheckOcrResultReq.onWarmupCompleted();
        }
        CheckOcrResultReq.onWarmupCompleted();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
