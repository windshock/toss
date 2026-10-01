package im.toss.feature.credit.ui.main.home.raise_edge_case;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.isColdStartup;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditScoreRaiseCoolTimeActivity$$ExternalSyntheticLambda4 implements Function0 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ CreditScoreRaiseCoolTimeActivity f$0;
    public final /* synthetic */ isColdStartup f$1;

    public /* synthetic */ CreditScoreRaiseCoolTimeActivity$$ExternalSyntheticLambda4(CreditScoreRaiseCoolTimeActivity creditScoreRaiseCoolTimeActivity, isColdStartup iscoldstartup) {
        this.f$0 = creditScoreRaiseCoolTimeActivity;
        this.f$1 = iscoldstartup;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            CreditScoreRaiseCoolTimeActivity.IAuthTabCallback(this.f$0, this.f$1);
            throw null;
        }
        Unit unitIAuthTabCallback = CreditScoreRaiseCoolTimeActivity.IAuthTabCallback(this.f$0, this.f$1);
        int i3 = onNavigationEvent + 25;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }
}
