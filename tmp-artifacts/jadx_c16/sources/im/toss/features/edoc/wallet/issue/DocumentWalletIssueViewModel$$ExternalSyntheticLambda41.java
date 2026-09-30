package im.toss.features.edoc.wallet.issue;

import com.google.zxing.datamatrix.encoder.C40Encoder;
import o.FileBridgeExtension3;
import o.deserializeDecimalCollection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletIssueViewModel$$ExternalSyntheticLambda41 implements deserializeDecimalCollection {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ FileBridgeExtension3 f$0;

    public final void run() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0};
        FileBridgeExtension3.onExtraCallbackWithResult(614751819, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), objArr, -614751795);
        int i4 = onExtraCallback + 63;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }
}
