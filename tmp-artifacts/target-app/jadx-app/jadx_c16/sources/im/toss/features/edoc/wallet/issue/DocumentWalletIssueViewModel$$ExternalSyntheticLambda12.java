package im.toss.features.edoc.wallet.issue;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.FileBridgeExtension3;
import o.fromUTF8ByteArray;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletIssueViewModel$$ExternalSyntheticLambda12 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ FileBridgeExtension3 f$0;
    public final /* synthetic */ fromUTF8ByteArray f$1;

    public /* synthetic */ DocumentWalletIssueViewModel$$ExternalSyntheticLambda12(FileBridgeExtension3 fileBridgeExtension3, fromUTF8ByteArray fromutf8bytearray) {
        this.f$0 = fileBridgeExtension3;
        this.f$1 = fromutf8bytearray;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            FileBridgeExtension3.onExtraCallbackWithResult(this.f$0, this.f$1, (List) obj);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = FileBridgeExtension3.onExtraCallbackWithResult(this.f$0, this.f$1, (List) obj);
        int i3 = IAuthTabCallback + 93;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
