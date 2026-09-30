package im.toss.features.home.presentation.bottomsheet;

import kotlin.jvm.functions.Function1;
import o.deserializeUriNullableCollection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TransactionBlockTransferSchemeActivity$$ExternalSyntheticLambda1 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ TransactionBlockTransferSchemeActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        TransactionBlockTransferSchemeActivity transactionBlockTransferSchemeActivity = this.f$0;
        deserializeUriNullableCollection deserializeurinullablecollection = (deserializeUriNullableCollection) obj;
        if (i3 != 0) {
            return TransactionBlockTransferSchemeActivity.onNavigationEvent(transactionBlockTransferSchemeActivity, deserializeurinullablecollection);
        }
        TransactionBlockTransferSchemeActivity.onNavigationEvent(transactionBlockTransferSchemeActivity, deserializeurinullablecollection);
        throw null;
    }
}
