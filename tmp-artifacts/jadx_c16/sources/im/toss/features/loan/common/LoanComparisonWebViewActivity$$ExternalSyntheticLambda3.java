package im.toss.features.loan.common;

import com.tmoney.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonWebViewActivity$$ExternalSyntheticLambda3 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ LoanComparisonWebViewActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, (Throwable) obj};
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
        Unit unit = (Unit) LoanComparisonWebViewActivity.onNavigationEvent(-1508244259, iOnWarmupCompleted, 1508244259, a.3.onWarmupCompleted(), objArr, a.3.onWarmupCompleted(), iOnWarmupCompleted2);
        int i4 = IAuthTabCallback + 81;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }
}
