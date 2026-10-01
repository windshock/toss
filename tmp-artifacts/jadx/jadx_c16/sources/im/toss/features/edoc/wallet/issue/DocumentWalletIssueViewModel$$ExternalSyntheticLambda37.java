package im.toss.features.edoc.wallet.issue;

import kotlin.jvm.functions.Function1;
import o.FileBridgeExtension3;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletIssueViewModel$$ExternalSyntheticLambda37 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ FileBridgeExtension3 f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        FileBridgeExtension3 fileBridgeExtension3 = this.f$0;
        Throwable th = (Throwable) obj;
        if (i3 == 0) {
            return FileBridgeExtension3.onWarmupCompleted(fileBridgeExtension3, th);
        }
        FileBridgeExtension3.onWarmupCompleted(fileBridgeExtension3, th);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
