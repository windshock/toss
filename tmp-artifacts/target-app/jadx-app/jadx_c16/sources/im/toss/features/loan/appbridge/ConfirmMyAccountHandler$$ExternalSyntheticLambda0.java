package im.toss.features.loan.appbridge;

import kotlin.jvm.functions.Function2;
import o.getPreParsedPackage;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ConfirmMyAccountHandler$$ExternalSyntheticLambda0 implements Function2 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onNavigationEvent = i2 % 128;
        Object obj3 = null;
        String str = (String) obj;
        String str2 = (String) obj2;
        if (i2 % 2 == 0) {
            Boolean.valueOf(getPreParsedPackage.onNavigationEvent(str, str2));
            throw null;
        }
        Boolean boolValueOf = Boolean.valueOf(getPreParsedPackage.onNavigationEvent(str, str2));
        int i3 = onExtraCallback + 63;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return boolValueOf;
        }
        obj3.hashCode();
        throw null;
    }
}
