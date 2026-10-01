package im.toss.features.edoc.wallet.issue;

import kotlin.jvm.functions.Function1;
import o.FileBridgeExtension3;
import o.onFastRefresh;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletIssueViewModel$$ExternalSyntheticLambda26 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ FileBridgeExtension3 f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        FileBridgeExtension3 fileBridgeExtension3 = this.f$0;
        onFastRefresh onfastrefresh = (onFastRefresh) obj;
        if (i3 == 0) {
            return FileBridgeExtension3.onNavigationEvent(fileBridgeExtension3, onfastrefresh);
        }
        FileBridgeExtension3.onNavigationEvent(fileBridgeExtension3, onfastrefresh);
        throw null;
    }
}
