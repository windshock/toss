package im.toss.feature.credit.ui.main.test;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditTestActivity$$ExternalSyntheticLambda53 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ CreditTestActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess100 = CreditTestActivity.access100(this.f$0);
        int i4 = onWarmupCompleted + 73;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitAccess100;
        }
        throw null;
    }
}
