package im.toss.features.home.feature.cashflow;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CashflowAnalysisActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ CashflowAnalysisActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            CashflowAnalysisActivity.onWarmupCompleted(this.f$0, (String) obj);
            throw null;
        }
        Unit unitOnWarmupCompleted = CashflowAnalysisActivity.onWarmupCompleted(this.f$0, (String) obj);
        int i3 = onExtraCallbackWithResult + 75;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 39 / 0;
        }
        return unitOnWarmupCompleted;
    }
}
