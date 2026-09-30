package im.toss.features.home.legacy.view.transaction.manual;

import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ManualTransactionAddActivity$$ExternalSyntheticLambda17 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ ManualTransactionAddActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ManualTransactionAddActivity manualTransactionAddActivity = this.f$0;
        Throwable th = (Throwable) obj;
        if (i3 != 0) {
            return ManualTransactionAddActivity.IAuthTabCallback(manualTransactionAddActivity, th);
        }
        ManualTransactionAddActivity.IAuthTabCallback(manualTransactionAddActivity, th);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
