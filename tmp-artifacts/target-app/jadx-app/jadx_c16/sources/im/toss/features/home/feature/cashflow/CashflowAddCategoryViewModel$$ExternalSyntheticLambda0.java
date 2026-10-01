package im.toss.features.home.feature.cashflow;

import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CashflowAddCategoryViewModel$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ CashflowAddCategoryViewModel f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        CashflowAddCategoryViewModel cashflowAddCategoryViewModel = this.f$0;
        SetDetectableSize setDetectableSize = (SetDetectableSize) obj;
        if (i3 != 0) {
            return CashflowAddCategoryViewModel.onWarmupCompleted(cashflowAddCategoryViewModel, setDetectableSize);
        }
        CashflowAddCategoryViewModel.onWarmupCompleted(cashflowAddCategoryViewModel, setDetectableSize);
        throw null;
    }
}
