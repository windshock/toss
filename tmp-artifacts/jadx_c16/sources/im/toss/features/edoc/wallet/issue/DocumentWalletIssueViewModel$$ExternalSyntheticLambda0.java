package im.toss.features.edoc.wallet.issue;

import com.google.zxing.datamatrix.encoder.C40Encoder;
import kotlin.jvm.functions.Function1;
import o.FileBridgeExtension3;
import o.openDebugger;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletIssueViewModel$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        openDebugger opendebugger = (openDebugger) FileBridgeExtension3.onExtraCallbackWithResult(-1810630052, C40Encoder.onExtraCallback(), iOnExtraCallback, C40Encoder.onExtraCallback(), iOnExtraCallback2, new Object[]{(openDebugger) obj}, 1810630087);
        int i4 = onWarmupCompleted + 111;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
        return opendebugger;
    }
}
