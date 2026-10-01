package im.toss.features.edoc.wallet.issue;

import o.FileBridgeExtension3;
import o.deserializeDecimalCollection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletIssueViewModel$$ExternalSyntheticLambda34 implements deserializeDecimalCollection {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ FileBridgeExtension3 f$0;

    public final void run() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        FileBridgeExtension3.IAuthTabCallbackDefault(this.f$0);
        if (i3 != 0) {
            throw null;
        }
    }
}
