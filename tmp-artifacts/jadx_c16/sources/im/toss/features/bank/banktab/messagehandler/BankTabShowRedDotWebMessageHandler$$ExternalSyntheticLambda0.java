package im.toss.features.bank.banktab.messagehandler;

import kotlin.jvm.functions.Function2;
import o.access1700;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BankTabShowRedDotWebMessageHandler$$ExternalSyntheticLambda0 implements Function2 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        onWarmupCompleted = i2 % 128;
        String str = (String) obj;
        String str2 = (String) obj2;
        if (i2 % 2 != 0) {
            return Boolean.valueOf(access1700.onWarmupCompleted(str, str2));
        }
        Boolean.valueOf(access1700.onWarmupCompleted(str, str2));
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
