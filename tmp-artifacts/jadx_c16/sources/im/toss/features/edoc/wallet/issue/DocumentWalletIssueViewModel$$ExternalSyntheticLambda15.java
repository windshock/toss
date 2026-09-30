package im.toss.features.edoc.wallet.issue;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.FileBridgeExtension3;
import o.fromUTF8ByteArray;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletIssueViewModel$$ExternalSyntheticLambda15 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ fromUTF8ByteArray f$0;
    public final /* synthetic */ FileBridgeExtension3 f$1;
    public final /* synthetic */ int[] f$2;

    public /* synthetic */ DocumentWalletIssueViewModel$$ExternalSyntheticLambda15(fromUTF8ByteArray fromutf8bytearray, FileBridgeExtension3 fileBridgeExtension3, int[] iArr) {
        this.f$0 = fromutf8bytearray;
        this.f$1 = fileBridgeExtension3;
        this.f$2 = iArr;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            FileBridgeExtension3.onNavigationEvent(this.f$0, this.f$1, this.f$2, (List) obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = FileBridgeExtension3.onNavigationEvent(this.f$0, this.f$1, this.f$2, (List) obj);
        int i3 = onExtraCallbackWithResult + 69;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }
}
