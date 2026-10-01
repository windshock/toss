package im.toss.features.edoc.wallet;

import kotlin.jvm.functions.Function1;
import o.deserializeUriNullableCollection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletWebActivity$$ExternalSyntheticLambda9 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ DocumentWalletWebActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        DocumentWalletWebActivity documentWalletWebActivity = this.f$0;
        deserializeUriNullableCollection deserializeurinullablecollection = (deserializeUriNullableCollection) obj;
        if (i3 != 0) {
            return DocumentWalletWebActivity.IAuthTabCallback(documentWalletWebActivity, deserializeurinullablecollection);
        }
        DocumentWalletWebActivity.IAuthTabCallback(documentWalletWebActivity, deserializeurinullablecollection);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
