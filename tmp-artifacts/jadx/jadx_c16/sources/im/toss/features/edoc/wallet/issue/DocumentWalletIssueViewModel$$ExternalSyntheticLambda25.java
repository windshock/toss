package im.toss.features.edoc.wallet.issue;

import o.FileBridgeExtension3;
import o.deserializeDecimalCollection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletIssueViewModel$$ExternalSyntheticLambda25 implements deserializeDecimalCollection {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ FileBridgeExtension3 f$0;

    public final void run() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        FileBridgeExtension3.onWarmupCompleted(this.f$0);
        int i4 = onExtraCallbackWithResult + 123;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 16 / 0;
        }
    }
}
