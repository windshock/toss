package im.toss.features.home.feature.cashflow;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.CommonAppExitExtension;
import o.RVLogger;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CashflowViewModel$$ExternalSyntheticLambda19 implements Function1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ CashflowViewModel f$0;
    public final /* synthetic */ CommonAppExitExtension f$1;
    public final /* synthetic */ RVLogger.onWarmupCompleted f$2;

    public /* synthetic */ CashflowViewModel$$ExternalSyntheticLambda19(CashflowViewModel cashflowViewModel, CommonAppExitExtension commonAppExitExtension, RVLogger.onWarmupCompleted onwarmupcompleted) {
        this.f$0 = cashflowViewModel;
        this.f$1 = commonAppExitExtension;
        this.f$2 = onwarmupcompleted;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = CashflowViewModel.onWarmupCompleted(this.f$0, this.f$1, this.f$2, (SetDetectableSize) obj);
        int i4 = onNavigationEvent + 109;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }
}
