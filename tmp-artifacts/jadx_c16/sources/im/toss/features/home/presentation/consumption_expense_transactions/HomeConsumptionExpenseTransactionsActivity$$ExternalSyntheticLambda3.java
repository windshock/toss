package im.toss.features.home.presentation.consumption_expense_transactions;

import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeConsumptionExpenseTransactionsActivity$$ExternalSyntheticLambda3 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ HomeConsumptionExpenseTransactionsActivity f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ HomeConsumptionExpenseTransactionsActivity$$ExternalSyntheticLambda3(HomeConsumptionExpenseTransactionsActivity homeConsumptionExpenseTransactionsActivity, Object obj) {
        this.f$0 = homeConsumptionExpenseTransactionsActivity;
        this.f$1 = obj;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        HomeConsumptionExpenseTransactionsActivity homeConsumptionExpenseTransactionsActivity = this.f$0;
        if (i3 == 0) {
            return HomeConsumptionExpenseTransactionsActivity.onWarmupCompleted(homeConsumptionExpenseTransactionsActivity, this.f$1, (SetDetectableSize) obj);
        }
        HomeConsumptionExpenseTransactionsActivity.onWarmupCompleted(homeConsumptionExpenseTransactionsActivity, this.f$1, (SetDetectableSize) obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
