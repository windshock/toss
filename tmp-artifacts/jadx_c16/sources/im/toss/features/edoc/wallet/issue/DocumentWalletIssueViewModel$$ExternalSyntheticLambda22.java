package im.toss.features.edoc.wallet.issue;

import kotlin.jvm.functions.Function1;
import o.FileBridgeExtension3;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletIssueViewModel$$ExternalSyntheticLambda22 implements deserializeFloat {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        onWarmupCompleted = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            FileBridgeExtension3.ICustomTabsCallbackDefault(this.f$0, obj);
            obj2.hashCode();
            throw null;
        }
        FileBridgeExtension3.ICustomTabsCallbackDefault(this.f$0, obj);
        int i3 = onExtraCallback + 83;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }
}
