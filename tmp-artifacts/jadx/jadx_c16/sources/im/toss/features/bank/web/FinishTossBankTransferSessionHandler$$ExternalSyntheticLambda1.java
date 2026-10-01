package im.toss.features.bank.web;

import kotlin.jvm.functions.Function2;
import o.reportNoTrigger;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FinishTossBankTransferSessionHandler$$ExternalSyntheticLambda1 implements Function2 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object obj3 = null;
        boolean zOnExtraCallbackWithResult = reportNoTrigger.onExtraCallbackWithResult((String) obj, (String) obj2);
        if (i3 != 0) {
            Boolean.valueOf(zOnExtraCallbackWithResult);
            obj3.hashCode();
            throw null;
        }
        Boolean boolValueOf = Boolean.valueOf(zOnExtraCallbackWithResult);
        int i4 = onNavigationEvent + 119;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return boolValueOf;
        }
        throw null;
    }
}
