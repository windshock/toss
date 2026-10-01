package im.toss.features.home.feature.cashflow;

import j$.time.YearMonth;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CashflowViewModel$$ExternalSyntheticLambda14 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ CashflowViewModel f$0;
    public final /* synthetic */ YearMonth f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ CashflowViewModel$$ExternalSyntheticLambda14(CashflowViewModel cashflowViewModel, YearMonth yearMonth, String str) {
        this.f$0 = cashflowViewModel;
        this.f$1 = yearMonth;
        this.f$2 = str;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        onNavigationEvent = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            CashflowViewModel.IAuthTabCallback(this.f$0, this.f$1, this.f$2, (SetDetectableSize) obj);
            throw null;
        }
        Unit unitIAuthTabCallback = CashflowViewModel.IAuthTabCallback(this.f$0, this.f$1, this.f$2, (SetDetectableSize) obj);
        int i3 = onNavigationEvent + 115;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        obj2.hashCode();
        throw null;
    }
}
