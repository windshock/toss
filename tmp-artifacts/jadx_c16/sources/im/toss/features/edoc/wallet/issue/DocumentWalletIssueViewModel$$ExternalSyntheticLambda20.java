package im.toss.features.edoc.wallet.issue;

import com.google.zxing.datamatrix.encoder.C40Encoder;
import kotlin.jvm.functions.Function1;
import o.FileBridgeExtension3;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletIssueViewModel$$ExternalSyntheticLambda20 implements deserializeFloat {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, obj};
        FileBridgeExtension3.onExtraCallbackWithResult(1943805827, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), objArr, -1943805788);
        int i4 = onWarmupCompleted + 61;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
