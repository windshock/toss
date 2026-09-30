package im.toss.features.loan.comparison.common;

import com.horcrux.svg.SvgPackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanProductApplySuccessActivity$$ExternalSyntheticLambda6 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ LoanProductApplySuccessActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = {this.f$0, (Throwable) obj};
            int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
            throw null;
        }
        Object[] objArr2 = {this.f$0, (Throwable) obj};
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        Unit unit = (Unit) LoanProductApplySuccessActivity.IAuthTabCallback(SvgPackage.21.onExtraCallbackWithResult(), -908592794, 908592794, objArr2, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
        int i3 = onExtraCallbackWithResult + 23;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }
}
