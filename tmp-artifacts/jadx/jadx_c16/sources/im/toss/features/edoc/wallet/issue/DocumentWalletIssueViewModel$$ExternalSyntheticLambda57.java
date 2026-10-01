package im.toss.features.edoc.wallet.issue;

import com.google.zxing.datamatrix.encoder.C40Encoder;
import kotlin.jvm.functions.Function1;
import o.FileBridgeExtension3;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletIssueViewModel$$ExternalSyntheticLambda57 implements deserializeFloat {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, obj};
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        int iOnExtraCallback3 = C40Encoder.onExtraCallback();
        int iOnExtraCallback4 = C40Encoder.onExtraCallback();
        if (i3 == 0) {
            FileBridgeExtension3.onExtraCallbackWithResult(-855268016, iOnExtraCallback3, iOnExtraCallback, iOnExtraCallback4, iOnExtraCallback2, objArr, 855268042);
            return;
        }
        FileBridgeExtension3.onExtraCallbackWithResult(-855268016, iOnExtraCallback3, iOnExtraCallback, iOnExtraCallback4, iOnExtraCallback2, objArr, 855268042);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
