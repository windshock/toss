package im.toss.features.edoc.wallet.issue;

import kotlin.jvm.functions.Function1;
import o.FileBridgeExtension3;
import o.deserializeIntNullableCollection;
import o.openDebugger;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletIssueViewModel$$ExternalSyntheticLambda1 implements deserializeIntNullableCollection {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Function1 f$0;

    public final Object apply(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            FileBridgeExtension3.readTypedObject(this.f$0, obj);
            throw null;
        }
        openDebugger typedObject = FileBridgeExtension3.readTypedObject(this.f$0, obj);
        int i3 = onWarmupCompleted + 29;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return typedObject;
        }
        throw null;
    }
}
