package im.toss.features.loan.comparison.common.details;

import im.toss.network.throwable.TossApiCallException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonProductDetailActivity$$ExternalSyntheticLambda6 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ TossApiCallException.ApiError f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = LoanComparisonProductDetailActivity.onExtraCallback(this.f$0, (SetDetectableSize) obj);
        int i4 = onNavigationEvent + 51;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }
}
