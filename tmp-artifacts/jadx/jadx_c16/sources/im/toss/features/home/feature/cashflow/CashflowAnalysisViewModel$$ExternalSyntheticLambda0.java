package im.toss.features.home.feature.cashflow;

import j$.time.YearMonth;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CashflowAnalysisViewModel$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ CashflowAnalysisViewModel f$0;
    public final /* synthetic */ YearMonth f$1;

    public /* synthetic */ CashflowAnalysisViewModel$$ExternalSyntheticLambda0(CashflowAnalysisViewModel cashflowAnalysisViewModel, YearMonth yearMonth) {
        this.f$0 = cashflowAnalysisViewModel;
        this.f$1 = yearMonth;
    }

    public final Object invoke(Object obj) {
        Unit unitOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnExtraCallbackWithResult = CashflowAnalysisViewModel.onExtraCallbackWithResult(this.f$0, this.f$1, (SetDetectableSize) obj);
            int i3 = 86 / 0;
        } else {
            unitOnExtraCallbackWithResult = CashflowAnalysisViewModel.onExtraCallbackWithResult(this.f$0, this.f$1, (SetDetectableSize) obj);
        }
        int i4 = onWarmupCompleted + 7;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 0 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }
}
