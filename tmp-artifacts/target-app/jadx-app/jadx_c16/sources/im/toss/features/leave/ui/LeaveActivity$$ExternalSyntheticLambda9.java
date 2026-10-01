package im.toss.features.leave.ui;

import kotlin.jvm.functions.Function1;
import o.PullRefreshIndicatorKtExternalSyntheticLambda5;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LeaveActivity$$ExternalSyntheticLambda9 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        onExtraCallback = i2 % 128;
        PullRefreshIndicatorKtExternalSyntheticLambda5 pullRefreshIndicatorKtExternalSyntheticLambda5 = (PullRefreshIndicatorKtExternalSyntheticLambda5) obj;
        if (i2 % 2 == 0) {
            return LeaveActivity.onNavigationEvent(pullRefreshIndicatorKtExternalSyntheticLambda5);
        }
        LeaveActivity.onNavigationEvent(pullRefreshIndicatorKtExternalSyntheticLambda5);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
