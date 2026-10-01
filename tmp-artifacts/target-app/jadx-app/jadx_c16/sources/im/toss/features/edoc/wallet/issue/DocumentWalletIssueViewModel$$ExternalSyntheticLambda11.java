package im.toss.features.edoc.wallet.issue;

import com.google.zxing.datamatrix.encoder.C40Encoder;
import im.toss.features.edoc.wallet.issue.DocumentWalletContinuousBottomSheet;
import java.util.List;
import kotlin.jvm.functions.Function2;
import o.FileBridgeExtension3;
import o.fromUTF8ByteArray;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletIssueViewModel$$ExternalSyntheticLambda11 implements Function2 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ fromUTF8ByteArray f$0;
    public final /* synthetic */ FileBridgeExtension3 f$1;

    public /* synthetic */ DocumentWalletIssueViewModel$$ExternalSyntheticLambda11(fromUTF8ByteArray fromutf8bytearray, FileBridgeExtension3 fileBridgeExtension3) {
        this.f$0 = fromutf8bytearray;
        this.f$1 = fileBridgeExtension3;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 35;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return (DocumentWalletContinuousBottomSheet.onExtraCallback) FileBridgeExtension3.onExtraCallbackWithResult(530870505, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), new Object[]{this.f$0, this.f$1, Integer.valueOf(((Integer) obj).intValue()), (List) obj2}, -530870488);
        }
        fromUTF8ByteArray fromutf8bytearray = this.f$0;
        FileBridgeExtension3 fileBridgeExtension3 = this.f$1;
        Integer numValueOf = Integer.valueOf(((Integer) obj).intValue());
        DocumentWalletContinuousBottomSheet.onExtraCallback onextracallback = (DocumentWalletContinuousBottomSheet.onExtraCallback) FileBridgeExtension3.onExtraCallbackWithResult(530870505, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), new Object[]{fromutf8bytearray, fileBridgeExtension3, numValueOf, (List) obj2}, -530870488);
        int i3 = 77 / 0;
        return onextracallback;
    }
}
