package im.toss.features.home.presentation.consumption_expense_transactions;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.setInterruptor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeConsumptionExpenseTransactionsActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ setInterruptor f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            HomeConsumptionExpenseTransactionsActivity.onWarmupCompleted(this.f$0, (SetDetectableSize) obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = HomeConsumptionExpenseTransactionsActivity.onWarmupCompleted(this.f$0, (SetDetectableSize) obj);
        int i3 = onExtraCallbackWithResult + 101;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 94 / 0;
        }
        return unitOnWarmupCompleted;
    }
}
