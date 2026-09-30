package im.toss.features.edoc.wallet.issue;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.FileBridgeExtension3;
import o.deserializeUriNullableCollection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletIssueViewModel$$ExternalSyntheticLambda32 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ FileBridgeExtension3 f$0;

    public final Object invoke(Object obj) {
        Unit unitOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnExtraCallbackWithResult = FileBridgeExtension3.onExtraCallbackWithResult(this.f$0, (deserializeUriNullableCollection) obj);
            int i3 = 53 / 0;
        } else {
            unitOnExtraCallbackWithResult = FileBridgeExtension3.onExtraCallbackWithResult(this.f$0, (deserializeUriNullableCollection) obj);
        }
        int i4 = onNavigationEvent + 69;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
