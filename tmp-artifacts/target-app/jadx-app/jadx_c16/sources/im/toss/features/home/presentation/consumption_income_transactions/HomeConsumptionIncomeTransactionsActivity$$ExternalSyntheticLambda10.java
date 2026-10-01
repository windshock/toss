package im.toss.features.home.presentation.consumption_income_transactions;

import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.setInterruptor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeConsumptionIncomeTransactionsActivity$$ExternalSyntheticLambda10 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ setInterruptor f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setInterruptor setinterruptor = this.f$0;
        SetDetectableSize setDetectableSize = (SetDetectableSize) obj;
        if (i3 == 0) {
            return HomeConsumptionIncomeTransactionsActivity.onNavigationEvent(setinterruptor, setDetectableSize);
        }
        HomeConsumptionIncomeTransactionsActivity.onNavigationEvent(setinterruptor, setDetectableSize);
        throw null;
    }
}
