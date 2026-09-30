package im.toss.features.edoc.wallet.issue;

import kotlin.jvm.functions.Function1;
import o.FileBridgeExtension3;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletIssueViewModel$$ExternalSyntheticLambda83 implements deserializeFloat {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            FileBridgeExtension3.onActivityResized(this.f$0, obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        FileBridgeExtension3.onActivityResized(this.f$0, obj);
        int i3 = IAuthTabCallback + 81;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
    }
}
