package im.toss.features.home.legacy.view.transaction.detail;

import im.toss.features.home.legacy.view.transaction.detail.TransactionDetailActivity;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TransactionDetailActivity$$ExternalSyntheticLambda58 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ TransactionDetailActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ArrayList arrayListOnNavigationEvent = TransactionDetailActivity.onNavigationEvent(this.f$0, (TransactionDetailActivity.IAuthTabCallback) obj);
        int i4 = onExtraCallbackWithResult + 21;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return arrayListOnNavigationEvent;
    }
}
