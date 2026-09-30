package im.toss.features.leave.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.PullRefreshIndicatorKtExternalSyntheticLambda5;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LeaveActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = LeaveActivity.IAuthTabCallback((PullRefreshIndicatorKtExternalSyntheticLambda5) obj);
        int i4 = IAuthTabCallback + 125;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 49 / 0;
        }
        return unitIAuthTabCallback;
    }
}
