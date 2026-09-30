package im.toss.features.home.ui.dst.view.account.component;

import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelAdapter$;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeAccountNavigationItemRefreshView$$ExternalSyntheticLambda3 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback3 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        Unit unit = (Unit) HomeAccountNavigationItemRefreshView.onExtraCallback(iOnExtraCallback2, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[0], 1181769163, iOnExtraCallback3, iOnExtraCallback, -1181769160);
        int i4 = IAuthTabCallback + 97;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
