package im.toss.features.home.legacy.view.transaction.manual;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ManualTransactionListActivity$$ExternalSyntheticLambda7 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ ManualTransactionListActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ManualTransactionListActivity manualTransactionListActivity = this.f$0;
        Integer num = (Integer) obj;
        if (i3 == 0) {
            return ManualTransactionListActivity.onNavigationEvent(manualTransactionListActivity, num.intValue());
        }
        Unit unitOnNavigationEvent = ManualTransactionListActivity.onNavigationEvent(manualTransactionListActivity, num.intValue());
        int i4 = 74 / 0;
        return unitOnNavigationEvent;
    }
}
