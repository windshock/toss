package im.toss.features.edoc.wallet;

import kotlin.jvm.functions.Function1;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletWebActivity$$ExternalSyntheticLambda16 implements deserializeFloat {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        DocumentWalletWebActivity.asBinder(this.f$0, obj);
        int i4 = onNavigationEvent + 125;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }
}
