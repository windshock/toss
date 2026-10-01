package im.toss.features.loan.refinancing.apply;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanRefinancingProductDetailActivity$$ExternalSyntheticLambda27 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ LoanRefinancingProductDetailActivity f$0;

    public final Object invoke(Object obj) {
        Unit unitOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnExtraCallbackWithResult = LoanRefinancingProductDetailActivity.onExtraCallbackWithResult(this.f$0, (Throwable) obj);
            int i3 = 51 / 0;
        } else {
            unitOnExtraCallbackWithResult = LoanRefinancingProductDetailActivity.onExtraCallbackWithResult(this.f$0, (Throwable) obj);
        }
        int i4 = IAuthTabCallback + 87;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 78 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }
}
