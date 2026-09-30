package im.toss.features.edoc.wallet.issue;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.FileBridgeExtension3;
import viva.republica.toss.network.model.electronicdocument.wallet.DocumentWalletTrxIdResp;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletIssueViewModel$$ExternalSyntheticLambda63 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ FileBridgeExtension3 f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = FileBridgeExtension3.IAuthTabCallback(this.f$0, (DocumentWalletTrxIdResp) obj);
        int i4 = onNavigationEvent + 9;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
