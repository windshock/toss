package im.toss.features.loan.comparison.funnel;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonFunnelActivity$$ExternalSyntheticLambda13 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ LoanComparisonFunnelActivity f$0;

    public final Object invoke(Object obj) {
        Unit unitOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnExtraCallbackWithResult = LoanComparisonFunnelActivity.onExtraCallbackWithResult(this.f$0, (Throwable) obj);
            int i3 = 22 / 0;
        } else {
            unitOnExtraCallbackWithResult = LoanComparisonFunnelActivity.onExtraCallbackWithResult(this.f$0, (Throwable) obj);
        }
        int i4 = IAuthTabCallback + 71;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }
}
