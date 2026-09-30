package im.toss.features.loan.appbridge;

import kotlin.jvm.functions.Function2;
import o.parsePackage;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanBizScrapingHandler$$ExternalSyntheticLambda0 implements Function2 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(parsePackage.onWarmupCompleted((String) obj, (String) obj2));
        int i4 = onExtraCallbackWithResult + 85;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 48 / 0;
        }
        return boolValueOf;
    }
}
