package im.toss.features.edoc.wallet.issue;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.FileBridgeExtension3;
import o.NativeClipboardSpec;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletIssueViewModel$$ExternalSyntheticLambda35 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ FileBridgeExtension3 f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        FileBridgeExtension3 fileBridgeExtension3 = this.f$0;
        NativeClipboardSpec nativeClipboardSpec = (NativeClipboardSpec) obj;
        if (i3 == 0) {
            return FileBridgeExtension3.onWarmupCompleted(fileBridgeExtension3, nativeClipboardSpec);
        }
        Unit unitOnWarmupCompleted = FileBridgeExtension3.onWarmupCompleted(fileBridgeExtension3, nativeClipboardSpec);
        int i4 = 59 / 0;
        return unitOnWarmupCompleted;
    }
}
