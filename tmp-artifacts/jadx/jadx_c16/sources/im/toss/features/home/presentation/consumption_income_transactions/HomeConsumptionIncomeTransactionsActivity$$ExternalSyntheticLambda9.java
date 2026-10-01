package im.toss.features.home.presentation.consumption_income_transactions;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeConsumptionIncomeTransactionsActivity$$ExternalSyntheticLambda9 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ HomeConsumptionIncomeTransactionsActivity f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ HomeConsumptionIncomeTransactionsActivity$$ExternalSyntheticLambda9(HomeConsumptionIncomeTransactionsActivity homeConsumptionIncomeTransactionsActivity, Object obj) {
        this.f$0 = homeConsumptionIncomeTransactionsActivity;
        this.f$1 = obj;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = HomeConsumptionIncomeTransactionsActivity.onWarmupCompleted(this.f$0, this.f$1, (SetDetectableSize) obj);
        int i4 = onWarmupCompleted + 53;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }
}
