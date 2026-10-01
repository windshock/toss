package im.toss.features.home.presentation.consumption_expense_transactions;

import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.setInterruptor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeConsumptionExpenseTransactionsActivity$$ExternalSyntheticLambda9 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ setInterruptor f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setInterruptor setinterruptor = this.f$0;
        SetDetectableSize setDetectableSize = (SetDetectableSize) obj;
        if (i3 != 0) {
            return HomeConsumptionExpenseTransactionsActivity.IAuthTabCallback(setinterruptor, setDetectableSize);
        }
        HomeConsumptionExpenseTransactionsActivity.IAuthTabCallback(setinterruptor, setDetectableSize);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
