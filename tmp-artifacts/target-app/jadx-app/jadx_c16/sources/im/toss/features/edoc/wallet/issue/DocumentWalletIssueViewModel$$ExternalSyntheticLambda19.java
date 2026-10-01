package im.toss.features.edoc.wallet.issue;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.FileBridgeExtension3;
import o.emitGraniteBrownfieldModule_onVisibilityChanged;
import o.fromUTF8ByteArray;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletIssueViewModel$$ExternalSyntheticLambda19 implements Function1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Context f$0;
    public final /* synthetic */ fromUTF8ByteArray f$1;
    public final /* synthetic */ FileBridgeExtension3 f$2;

    public /* synthetic */ DocumentWalletIssueViewModel$$ExternalSyntheticLambda19(Context context, fromUTF8ByteArray fromutf8bytearray, FileBridgeExtension3 fileBridgeExtension3) {
        this.f$0 = context;
        this.f$1 = fromutf8bytearray;
        this.f$2 = fileBridgeExtension3;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = FileBridgeExtension3.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, (emitGraniteBrownfieldModule_onVisibilityChanged) obj);
        int i4 = onNavigationEvent + 123;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }
}
