package im.toss.features.bank.web;

import kotlin.jvm.functions.Function2;
import o.ShakeHelperInterface;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossBankSecureStorageHandler$$ExternalSyntheticLambda0 implements Function2 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(ShakeHelperInterface.onNavigationEvent((String) obj, (String) obj2));
        int i4 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return boolValueOf;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
