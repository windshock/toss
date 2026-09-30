package im.toss.features.edoc.wallet.issue;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.FileBridgeExtension3;
import o.sendOverSocket;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletIssueViewModel$$ExternalSyntheticLambda47 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ FileBridgeExtension3 f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = FileBridgeExtension3.onExtraCallback(this.f$0, (sendOverSocket) obj);
        int i4 = onExtraCallback + 7;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }
}
