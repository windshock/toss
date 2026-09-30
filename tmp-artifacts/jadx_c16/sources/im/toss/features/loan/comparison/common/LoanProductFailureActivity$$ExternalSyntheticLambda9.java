package im.toss.features.loan.comparison.common;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanProductFailureActivity$$ExternalSyntheticLambda9 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ LoanProductFailureActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = LoanProductFailureActivity.onExtraCallbackWithResult(this.f$0, (Throwable) obj);
        int i4 = onNavigationEvent + 19;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 7 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }
}
