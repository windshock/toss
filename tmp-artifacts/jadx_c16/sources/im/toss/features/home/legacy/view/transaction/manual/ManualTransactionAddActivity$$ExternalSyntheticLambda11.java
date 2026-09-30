package im.toss.features.home.legacy.view.transaction.manual;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ManualTransactionAddActivity$$ExternalSyntheticLambda11 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ ManualTransactionAddActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ManualTransactionAddActivity manualTransactionAddActivity = this.f$0;
        Throwable th = (Throwable) obj;
        if (i3 == 0) {
            return ManualTransactionAddActivity.onWarmupCompleted(manualTransactionAddActivity, th);
        }
        Unit unitOnWarmupCompleted = ManualTransactionAddActivity.onWarmupCompleted(manualTransactionAddActivity, th);
        int i4 = 51 / 0;
        return unitOnWarmupCompleted;
    }
}
