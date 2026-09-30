package im.toss.features.home.legacy.view.transaction.detail;

import android.content.DialogInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TransactionDetailActivity$$ExternalSyntheticLambda6 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ TransactionDetailActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TransactionDetailActivity transactionDetailActivity = this.f$0;
        DialogInterface dialogInterface = (DialogInterface) obj;
        if (i3 != 0) {
            return TransactionDetailActivity.IAuthTabCallback(transactionDetailActivity, dialogInterface);
        }
        Unit unitIAuthTabCallback = TransactionDetailActivity.IAuthTabCallback(transactionDetailActivity, dialogInterface);
        int i4 = 83 / 0;
        return unitIAuthTabCallback;
    }
}
