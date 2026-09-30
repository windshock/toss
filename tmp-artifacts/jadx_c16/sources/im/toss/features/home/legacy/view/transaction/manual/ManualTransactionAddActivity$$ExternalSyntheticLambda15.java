package im.toss.features.home.legacy.view.transaction.manual;

import kotlin.jvm.functions.Function1;
import o.getCanonicalLocales;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ManualTransactionAddActivity$$ExternalSyntheticLambda15 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ ManualTransactionAddActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ManualTransactionAddActivity manualTransactionAddActivity = this.f$0;
        getCanonicalLocales getcanonicallocales = (getCanonicalLocales) obj;
        if (i3 == 0) {
            return ManualTransactionAddActivity.onWarmupCompleted(manualTransactionAddActivity, getcanonicallocales);
        }
        ManualTransactionAddActivity.onWarmupCompleted(manualTransactionAddActivity, getcanonicallocales);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
