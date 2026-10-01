package im.toss.features.edoc.wallet.issue;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.FileBridgeExtension3;
import o.deserializeUriNullableCollection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletIssueViewModel$$ExternalSyntheticLambda16 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ FileBridgeExtension3 f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = FileBridgeExtension3.IAuthTabCallbackStub(this.f$0, (deserializeUriNullableCollection) obj);
        int i4 = onNavigationEvent + 115;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 65 / 0;
        }
        return unitIAuthTabCallbackStub;
    }
}
