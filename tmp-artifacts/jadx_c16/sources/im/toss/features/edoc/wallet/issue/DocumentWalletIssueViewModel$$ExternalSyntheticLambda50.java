package im.toss.features.edoc.wallet.issue;

import kotlin.jvm.functions.Function1;
import o.FileBridgeExtension3;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletIssueViewModel$$ExternalSyntheticLambda50 implements deserializeFloat {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        FileBridgeExtension3.onPostMessage(this.f$0, obj);
        int i4 = onWarmupCompleted + 7;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 94 / 0;
        }
    }
}
