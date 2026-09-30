package im.toss.features.edoc.wallet.issue;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.FileBridgeExtension3;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletIssueViewModel$$ExternalSyntheticLambda65 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ FileBridgeExtension3 f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = FileBridgeExtension3.IAuthTabCallback(this.f$0, (Throwable) obj);
        int i4 = IAuthTabCallback + 65;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
