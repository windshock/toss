package im.toss.features.home.legacy.view.transaction.detail;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TransactionDetailActivity$$ExternalSyntheticLambda71 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = TransactionDetailActivity.onTransact((Throwable) obj);
        int i4 = onExtraCallbackWithResult + 63;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnTransact;
        }
        throw null;
    }
}
