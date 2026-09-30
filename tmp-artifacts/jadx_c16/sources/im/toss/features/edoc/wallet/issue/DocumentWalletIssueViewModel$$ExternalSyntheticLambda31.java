package im.toss.features.edoc.wallet.issue;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.FileBridgeExtension3;
import o.fromUTF8ByteArray;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletIssueViewModel$$ExternalSyntheticLambda31 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ fromUTF8ByteArray f$0;
    public final /* synthetic */ Integer f$1;
    public final /* synthetic */ FileBridgeExtension3 f$2;

    public /* synthetic */ DocumentWalletIssueViewModel$$ExternalSyntheticLambda31(fromUTF8ByteArray fromutf8bytearray, Integer num, FileBridgeExtension3 fileBridgeExtension3) {
        this.f$0 = fromutf8bytearray;
        this.f$1 = num;
        this.f$2 = fileBridgeExtension3;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = FileBridgeExtension3.IAuthTabCallback(this.f$0, this.f$1, this.f$2, (List) obj);
        int i4 = onExtraCallback + 13;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
