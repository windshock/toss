package im.toss.features.home.legacy.view.transaction.manual;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ManualTransactionAddActivity$$ExternalSyntheticLambda25 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ ManualTransactionAddActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = ManualTransactionAddActivity.onWarmupCompleted(this.f$0, (View) obj, ((Integer) obj2).intValue());
        int i4 = onExtraCallbackWithResult + 107;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }
}
