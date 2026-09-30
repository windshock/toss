package im.toss.feature.credit.ui.main.test;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditTestActivity$$ExternalSyntheticLambda49 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            CreditTestActivity.onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = CreditTestActivity.onNavigationEvent();
        int i3 = onWarmupCompleted + 87;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }
}
