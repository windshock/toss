package im.toss.features.edoc.wallet.issue;

import kotlin.jvm.functions.Function1;
import o.FileBridgeExtension3;
import o.createFromParts;
import o.fromUTF8ByteArray;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletIssueViewModel$$ExternalSyntheticLambda13 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ fromUTF8ByteArray f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        createFromParts createfrompartsIAuthTabCallback = FileBridgeExtension3.IAuthTabCallback(this.f$0, (String) obj);
        int i4 = onNavigationEvent + 101;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return createfrompartsIAuthTabCallback;
        }
        throw null;
    }
}
