package im.toss.features.home.ui.view.transaction.account;

import kotlin.jvm.functions.Function0;
import o.setCanUseFallback;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AccountTransactionListTooltip$$ExternalSyntheticLambda1 implements Function0 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return setCanUseFallback.onExtraCallback();
        }
        setCanUseFallback.onExtraCallback();
        throw null;
    }
}
