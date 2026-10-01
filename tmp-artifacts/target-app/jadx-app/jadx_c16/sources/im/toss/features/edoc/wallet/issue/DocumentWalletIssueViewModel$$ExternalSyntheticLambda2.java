package im.toss.features.edoc.wallet.issue;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.FileBridgeExtension3;
import o.openDebugger;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletIssueViewModel$$ExternalSyntheticLambda2 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ FileBridgeExtension3 f$0;

    public final Object invoke(Object obj) {
        Unit unitOnExtraCallback;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnExtraCallback = FileBridgeExtension3.onExtraCallback(this.f$0, (openDebugger) obj);
            int i3 = 63 / 0;
        } else {
            unitOnExtraCallback = FileBridgeExtension3.onExtraCallback(this.f$0, (openDebugger) obj);
        }
        int i4 = onExtraCallbackWithResult + 119;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 17 / 0;
        }
        return unitOnExtraCallback;
    }
}
