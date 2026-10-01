package im.toss.features.loan.comparison.intro;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonWebIntroFragment$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ LoanComparisonWebIntroFragment f$0;

    public final Object invoke(Object obj) {
        Unit unitOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnExtraCallbackWithResult = LoanComparisonWebIntroFragment.onExtraCallbackWithResult(this.f$0, (SetDetectableSize) obj);
            int i3 = 43 / 0;
        } else {
            unitOnExtraCallbackWithResult = LoanComparisonWebIntroFragment.onExtraCallbackWithResult(this.f$0, (SetDetectableSize) obj);
        }
        int i4 = IAuthTabCallback + 115;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
