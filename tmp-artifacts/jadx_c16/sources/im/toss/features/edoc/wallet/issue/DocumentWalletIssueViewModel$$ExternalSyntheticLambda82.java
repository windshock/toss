package im.toss.features.edoc.wallet.issue;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.FileBridgeExtension3;
import o.NativeClipboardSpec;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletIssueViewModel$$ExternalSyntheticLambda82 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ FileBridgeExtension3 f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = FileBridgeExtension3.onNavigationEvent(this.f$0, (NativeClipboardSpec) obj);
        if (i3 != 0) {
            int i4 = 88 / 0;
        }
        return unitOnNavigationEvent;
    }
}
