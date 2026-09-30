package im.toss.features.home.legacy.view.transaction.manual;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ManualTransactionListActivity$$ExternalSyntheticLambda4 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onWarmupCompleted = i2 % 128;
        Throwable th = (Throwable) obj;
        if (i2 % 2 != 0) {
            ManualTransactionListActivity.onExtraCallbackWithResult(th);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = ManualTransactionListActivity.onExtraCallbackWithResult(th);
        int i3 = onWarmupCompleted + 115;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
