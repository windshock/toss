package im.toss.features.loan.comparison.result.view;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.isTinyAppOnlineUrlWithNoPageParam;
import viva.republica.toss.network.model.loan.LoanComparisonFilter;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonResultBottomSheetKt$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ LoanComparisonFilter f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = isTinyAppOnlineUrlWithNoPageParam.onNavigationEvent(this.f$0, (SetDetectableSize) obj);
        int i4 = IAuthTabCallback + 99;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }
}
