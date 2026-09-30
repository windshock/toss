package im.toss.feature.credit.ui.main.home.raise_edge_case;

import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPerfectScoreActivity$$ExternalSyntheticLambda9 implements Function1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ CreditPerfectScoreActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        CreditPerfectScoreActivity creditPerfectScoreActivity = this.f$0;
        SetDetectableSize setDetectableSize = (SetDetectableSize) obj;
        if (i3 == 0) {
            return CreditPerfectScoreActivity.IAuthTabCallback(creditPerfectScoreActivity, setDetectableSize);
        }
        CreditPerfectScoreActivity.IAuthTabCallback(creditPerfectScoreActivity, setDetectableSize);
        throw null;
    }
}
