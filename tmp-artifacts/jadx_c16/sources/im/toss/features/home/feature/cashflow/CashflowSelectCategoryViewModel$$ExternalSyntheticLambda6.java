package im.toss.features.home.feature.cashflow;

import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CashflowSelectCategoryViewModel$$ExternalSyntheticLambda6 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ CashflowSelectCategoryViewModel f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        CashflowSelectCategoryViewModel cashflowSelectCategoryViewModel = this.f$0;
        SetDetectableSize setDetectableSize = (SetDetectableSize) obj;
        if (i3 == 0) {
            return CashflowSelectCategoryViewModel.onExtraCallback(cashflowSelectCategoryViewModel, setDetectableSize);
        }
        CashflowSelectCategoryViewModel.onExtraCallback(cashflowSelectCategoryViewModel, setDetectableSize);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
