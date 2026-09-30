package im.toss.features.edoc.wallet.issue;

import com.google.zxing.datamatrix.encoder.C40Encoder;
import kotlin.jvm.functions.Function1;
import o.FileBridgeExtension3;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletIssueViewModel$$ExternalSyntheticLambda33 implements deserializeFloat {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, obj};
        FileBridgeExtension3.onExtraCallbackWithResult(760904449, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), objArr, -760904438);
        int i4 = IAuthTabCallback + 107;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }
}
