package im.toss.features.edoc.wallet.issue;

import com.google.zxing.datamatrix.encoder.C40Encoder;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.FileBridgeExtension3;
import o.fromUTF8ByteArray;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletIssueViewModel$$ExternalSyntheticLambda71 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ fromUTF8ByteArray f$0;
    public final /* synthetic */ FileBridgeExtension3 f$1;

    public /* synthetic */ DocumentWalletIssueViewModel$$ExternalSyntheticLambda71(fromUTF8ByteArray fromutf8bytearray, FileBridgeExtension3 fileBridgeExtension3) {
        this.f$0 = fromutf8bytearray;
        this.f$1 = fileBridgeExtension3;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, this.f$1, (List) obj};
        Unit unit = (Unit) FileBridgeExtension3.onExtraCallbackWithResult(-1896020788, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), objArr, 1896020807);
        int i4 = onExtraCallbackWithResult + 67;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
