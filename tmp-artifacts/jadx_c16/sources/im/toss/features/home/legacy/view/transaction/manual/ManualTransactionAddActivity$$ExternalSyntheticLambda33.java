package im.toss.features.home.legacy.view.transaction.manual;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.deserializeUriNullableCollection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ManualTransactionAddActivity$$ExternalSyntheticLambda33 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ ManualTransactionAddActivity f$0;

    public final Object invoke(Object obj) {
        Unit unitOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnWarmupCompleted = ManualTransactionAddActivity.onWarmupCompleted(this.f$0, (deserializeUriNullableCollection) obj);
            int i3 = 12 / 0;
        } else {
            unitOnWarmupCompleted = ManualTransactionAddActivity.onWarmupCompleted(this.f$0, (deserializeUriNullableCollection) obj);
        }
        int i4 = onWarmupCompleted + 73;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
