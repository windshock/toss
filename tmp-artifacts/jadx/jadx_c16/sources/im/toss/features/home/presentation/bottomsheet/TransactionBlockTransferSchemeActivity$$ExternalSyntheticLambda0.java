package im.toss.features.home.presentation.bottomsheet;

import android.content.DialogInterface;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TransactionBlockTransferSchemeActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ TransactionBlockTransferSchemeActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        TransactionBlockTransferSchemeActivity transactionBlockTransferSchemeActivity = this.f$0;
        DialogInterface dialogInterface = (DialogInterface) obj;
        if (i3 == 0) {
            return TransactionBlockTransferSchemeActivity.IAuthTabCallback(transactionBlockTransferSchemeActivity, dialogInterface);
        }
        TransactionBlockTransferSchemeActivity.IAuthTabCallback(transactionBlockTransferSchemeActivity, dialogInterface);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
