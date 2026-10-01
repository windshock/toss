package im.toss.features.edoc.wallet.issue;

import kotlin.jvm.functions.Function1;
import o.FileBridgeExtension3;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletIssueViewModel$$ExternalSyntheticLambda73 implements deserializeFloat {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            FileBridgeExtension3.onNavigationEvent(this.f$0, obj);
            throw null;
        }
        FileBridgeExtension3.onNavigationEvent(this.f$0, obj);
        int i3 = onExtraCallbackWithResult + 65;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }
}
