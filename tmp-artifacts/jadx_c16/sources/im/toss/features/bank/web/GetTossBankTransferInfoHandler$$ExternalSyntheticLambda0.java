package im.toss.features.bank.web;

import kotlin.jvm.functions.Function2;
import o.report;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class GetTossBankTransferInfoHandler$$ExternalSyntheticLambda0 implements Function2 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = report.onExtraCallbackWithResult((String) obj, (String) obj2);
        if (i3 != 0) {
            return Boolean.valueOf(zOnExtraCallbackWithResult);
        }
        Boolean.valueOf(zOnExtraCallbackWithResult);
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
