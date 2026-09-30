package im.toss.features.edoc.wallet;

import kotlin.jvm.functions.Function1;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletWebActivity$$ExternalSyntheticLambda14 implements deserializeFloat {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onNavigationEvent = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            DocumentWalletWebActivity.IAuthTabCallbackStub(this.f$0, obj);
            obj2.hashCode();
            throw null;
        }
        DocumentWalletWebActivity.IAuthTabCallbackStub(this.f$0, obj);
        int i3 = IAuthTabCallback + 79;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }
}
