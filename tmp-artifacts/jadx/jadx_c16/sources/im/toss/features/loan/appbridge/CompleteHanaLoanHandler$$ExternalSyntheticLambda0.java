package im.toss.features.loan.appbridge;

import kotlin.jvm.functions.Function2;
import o.preParsePackage;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CompleteHanaLoanHandler$$ExternalSyntheticLambda0 implements Function2 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = preParsePackage.IAuthTabCallback((String) obj, (String) obj2);
        if (i3 != 0) {
            Boolean.valueOf(zIAuthTabCallback);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        Boolean boolValueOf = Boolean.valueOf(zIAuthTabCallback);
        int i4 = IAuthTabCallback + 83;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }
}
