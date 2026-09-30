package im.toss.features.edoc.wallet.issue;

import o.FileBridgeExtension3;
import o.deserializeDecimalCollection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletIssueViewModel$$ExternalSyntheticLambda18 implements deserializeDecimalCollection {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ FileBridgeExtension3 f$0;

    public final void run() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            FileBridgeExtension3.onExtraCallback(this.f$0);
            throw null;
        }
        FileBridgeExtension3.onExtraCallback(this.f$0);
        int i3 = onWarmupCompleted + 103;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
