package im.toss.features.edoc.wallet.issue;

import kotlin.jvm.functions.Function1;
import o.FileBridgeExtension3;
import o.deserializeUriNullableCollection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletIssueViewModel$$ExternalSyntheticLambda72 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ FileBridgeExtension3 f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        FileBridgeExtension3 fileBridgeExtension3 = this.f$0;
        deserializeUriNullableCollection deserializeurinullablecollection = (deserializeUriNullableCollection) obj;
        if (i3 == 0) {
            return FileBridgeExtension3.onExtraCallback(fileBridgeExtension3, deserializeurinullablecollection);
        }
        FileBridgeExtension3.onExtraCallback(fileBridgeExtension3, deserializeurinullablecollection);
        throw null;
    }
}
