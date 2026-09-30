package im.toss.features.edoc.wallet.issue;

import im.toss.features.edoc.wallet.issue.DocumentWalletContinuousBottomSheet;
import java.util.List;
import kotlin.jvm.functions.Function2;
import o.FileBridgeExtension3;
import o.fromUTF8ByteArray;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletIssueViewModel$$ExternalSyntheticLambda30 implements Function2 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ FileBridgeExtension3 f$0;
    public final /* synthetic */ fromUTF8ByteArray f$1;
    public final /* synthetic */ Integer f$2;

    public /* synthetic */ DocumentWalletIssueViewModel$$ExternalSyntheticLambda30(FileBridgeExtension3 fileBridgeExtension3, fromUTF8ByteArray fromutf8bytearray, Integer num) {
        this.f$0 = fileBridgeExtension3;
        this.f$1 = fromutf8bytearray;
        this.f$2 = num;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            FileBridgeExtension3.IAuthTabCallback(this.f$0, this.f$1, this.f$2, ((Integer) obj).intValue(), (List) obj2);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        DocumentWalletContinuousBottomSheet.onExtraCallback onextracallbackIAuthTabCallback = FileBridgeExtension3.IAuthTabCallback(this.f$0, this.f$1, this.f$2, ((Integer) obj).intValue(), (List) obj2);
        int i3 = onNavigationEvent + 35;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return onextracallbackIAuthTabCallback;
    }
}
