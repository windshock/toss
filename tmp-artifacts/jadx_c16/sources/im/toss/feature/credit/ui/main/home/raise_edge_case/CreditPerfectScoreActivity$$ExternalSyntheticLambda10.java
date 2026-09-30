package im.toss.feature.credit.ui.main.home.raise_edge_case;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPerfectScoreActivity$$ExternalSyntheticLambda10 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ CreditPerfectScoreActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            CreditPerfectScoreActivity.onNavigationEvent(this.f$0, (SetDetectableSize) obj);
            throw null;
        }
        Unit unitOnNavigationEvent = CreditPerfectScoreActivity.onNavigationEvent(this.f$0, (SetDetectableSize) obj);
        int i3 = onWarmupCompleted + 75;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }
}
