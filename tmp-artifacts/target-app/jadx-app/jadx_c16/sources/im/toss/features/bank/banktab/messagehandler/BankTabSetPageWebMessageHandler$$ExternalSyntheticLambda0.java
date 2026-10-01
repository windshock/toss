package im.toss.features.bank.banktab.messagehandler;

import kotlin.jvm.functions.Function2;
import o.access1702;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BankTabSetPageWebMessageHandler$$ExternalSyntheticLambda0 implements Function2 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = access1702.onExtraCallbackWithResult((String) obj, (String) obj2);
        if (i3 != 0) {
            return Boolean.valueOf(zOnExtraCallbackWithResult);
        }
        Boolean.valueOf(zOnExtraCallbackWithResult);
        throw null;
    }
}
