package im.toss.features.credit.ui.plus.lab;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.onlyContainsAttributeCerts;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusLabActivity$$ExternalSyntheticLambda1 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ CreditPlusLabActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = CreditPlusLabActivity.onWarmupCompleted(this.f$0, (onlyContainsAttributeCerts) obj);
        int i4 = IAuthTabCallback + 35;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
