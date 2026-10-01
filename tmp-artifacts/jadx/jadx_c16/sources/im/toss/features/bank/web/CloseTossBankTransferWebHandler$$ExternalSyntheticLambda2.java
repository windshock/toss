package im.toss.features.bank.web;

import kotlin.jvm.functions.Function2;
import o.reportNoCallback;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CloseTossBankTransferWebHandler$$ExternalSyntheticLambda2 implements Function2 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onExtraCallbackWithResult = i2 % 128;
        String str = (String) obj;
        String str2 = (String) obj2;
        if (i2 % 2 != 0) {
            Boolean.valueOf(reportNoCallback.onNavigationEvent(str, str2));
            throw null;
        }
        Boolean boolValueOf = Boolean.valueOf(reportNoCallback.onNavigationEvent(str, str2));
        int i3 = onNavigationEvent + 61;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return boolValueOf;
        }
        throw null;
    }
}
