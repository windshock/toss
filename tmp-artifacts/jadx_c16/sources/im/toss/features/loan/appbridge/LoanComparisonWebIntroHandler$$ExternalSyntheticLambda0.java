package im.toss.features.loan.appbridge;

import kotlin.jvm.functions.Function2;
import o.verifyPackage;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonWebIntroHandler$$ExternalSyntheticLambda0 implements Function2 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(verifyPackage.onNavigationEvent((String) obj, (String) obj2));
        int i4 = onWarmupCompleted + 85;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }
}
