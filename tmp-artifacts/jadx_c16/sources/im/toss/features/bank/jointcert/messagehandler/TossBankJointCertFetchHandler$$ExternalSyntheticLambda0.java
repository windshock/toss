package im.toss.features.bank.jointcert.messagehandler;

import kotlin.jvm.functions.Function2;
import o.access2202;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossBankJointCertFetchHandler$$ExternalSyntheticLambda0 implements Function2 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        onNavigationEvent = i2 % 128;
        String str = (String) obj;
        String str2 = (String) obj2;
        if (i2 % 2 == 0) {
            return Boolean.valueOf(access2202.IAuthTabCallback(str, str2));
        }
        Boolean.valueOf(access2202.IAuthTabCallback(str, str2));
        throw null;
    }
}
