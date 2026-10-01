package im.toss.features.edoc.wallet.issue;

import kotlin.jvm.functions.Function1;
import o.FileBridgeExtension3;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletIssueViewModel$$ExternalSyntheticLambda49 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ FileBridgeExtension3 f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        FileBridgeExtension3 fileBridgeExtension3 = this.f$0;
        Throwable th = (Throwable) obj;
        if (i3 != 0) {
            return FileBridgeExtension3.asInterface(fileBridgeExtension3, th);
        }
        FileBridgeExtension3.asInterface(fileBridgeExtension3, th);
        throw null;
    }
}
