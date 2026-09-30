package im.toss.features.edoc.wallet.issue;

import com.google.zxing.datamatrix.encoder.C40Encoder;
import o.FileBridgeExtension3;
import o.deserializeDecimalCollection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletIssueViewModel$$ExternalSyntheticLambda81 implements deserializeDecimalCollection {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ FileBridgeExtension3 f$0;

    public final void run() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0};
        FileBridgeExtension3.onExtraCallbackWithResult(-1809541423, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), objArr, 1809541457);
        int i4 = IAuthTabCallback + 39;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
