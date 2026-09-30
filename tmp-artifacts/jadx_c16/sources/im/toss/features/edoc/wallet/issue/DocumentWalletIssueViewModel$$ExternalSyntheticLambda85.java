package im.toss.features.edoc.wallet.issue;

import kotlin.jvm.functions.Function1;
import o.FileBridgeExtension3;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletIssueViewModel$$ExternalSyntheticLambda85 implements deserializeFloat {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        FileBridgeExtension3.onMessageChannelReady(this.f$0, obj);
        int i4 = onWarmupCompleted + 51;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }
}
