package im.toss.features.bank.jointcert.messagehandler;

import kotlin.jvm.functions.Function2;
import o.access2008;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossBankJointCertCheckValidityHandler$$ExternalSyntheticLambda0 implements Function2 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = access2008.IAuthTabCallback((String) obj, (String) obj2);
        if (i3 != 0) {
            Boolean.valueOf(zIAuthTabCallback);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        Boolean boolValueOf = Boolean.valueOf(zIAuthTabCallback);
        int i4 = onNavigationEvent + 123;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }
}
