package im.toss.feature.credit.ui.main.report;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditScoreReportActivity$$ExternalSyntheticLambda1 implements Function0 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ CreditScoreReportActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            CreditScoreReportActivity.onNavigationEvent(this.f$0);
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = CreditScoreReportActivity.onNavigationEvent(this.f$0);
        int i3 = onExtraCallbackWithResult + 7;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }
}
