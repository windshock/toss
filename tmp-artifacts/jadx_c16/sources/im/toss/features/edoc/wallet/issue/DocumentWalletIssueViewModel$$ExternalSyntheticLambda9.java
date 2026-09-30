package im.toss.features.edoc.wallet.issue;

import kotlin.jvm.functions.Function1;
import o.FileBridgeExtension3;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletIssueViewModel$$ExternalSyntheticLambda9 implements deserializeFloat {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        FileBridgeExtension3.IAuthTabCallback_Parcel(this.f$0, obj);
        int i4 = onExtraCallbackWithResult + 1;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }
}
