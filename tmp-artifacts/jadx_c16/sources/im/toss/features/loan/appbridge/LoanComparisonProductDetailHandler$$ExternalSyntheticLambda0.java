package im.toss.features.loan.appbridge;

import kotlin.jvm.functions.Function2;
import o.getCacheKey;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonProductDetailHandler$$ExternalSyntheticLambda0 implements Function2 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(getCacheKey.onExtraCallbackWithResult((String) obj, (String) obj2));
        int i4 = onNavigationEvent + 109;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }
}
