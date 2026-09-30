package im.toss.features.home.legacy.view.transaction.detail;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TransactionDetailActivity$$ExternalSyntheticLambda55 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = TransactionDetailActivity.onExtraCallbackWithResult((Throwable) obj);
        if (i3 == 0) {
            int i4 = 83 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }
}
