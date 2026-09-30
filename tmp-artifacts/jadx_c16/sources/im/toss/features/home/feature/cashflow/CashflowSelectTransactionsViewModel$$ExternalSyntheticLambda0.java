package im.toss.features.home.feature.cashflow;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CashflowSelectTransactionsViewModel$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ CashflowSelectTransactionsViewModel f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = CashflowSelectTransactionsViewModel.IAuthTabCallback(this.f$0, (SetDetectableSize) obj);
        int i4 = onExtraCallback + 37;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 89 / 0;
        }
        return unitIAuthTabCallback;
    }
}
