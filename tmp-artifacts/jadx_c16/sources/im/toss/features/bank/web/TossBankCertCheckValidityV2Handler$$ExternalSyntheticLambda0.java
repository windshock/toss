package im.toss.features.bank.web;

import kotlin.jvm.functions.Function2;
import o.reportSupport;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossBankCertCheckValidityV2Handler$$ExternalSyntheticLambda0 implements Function2 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = reportSupport.onNavigationEvent((String) obj, (String) obj2);
        if (i3 == 0) {
            return Boolean.valueOf(zOnNavigationEvent);
        }
        Boolean.valueOf(zOnNavigationEvent);
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
