package im.toss.features.bank.web;

import kotlin.jvm.functions.Function2;
import o.isTrigger;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossBankTransactionMemoHandler$$ExternalSyntheticLambda0 implements Function2 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onExtraCallback = i2 % 128;
        String str = (String) obj;
        String str2 = (String) obj2;
        if (i2 % 2 == 0) {
            return Boolean.valueOf(isTrigger.onWarmupCompleted(str, str2));
        }
        Boolean.valueOf(isTrigger.onWarmupCompleted(str, str2));
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
