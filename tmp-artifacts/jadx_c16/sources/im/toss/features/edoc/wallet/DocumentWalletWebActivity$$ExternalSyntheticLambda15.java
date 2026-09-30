package im.toss.features.edoc.wallet;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletWebActivity$$ExternalSyntheticLambda15 implements Function1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ DocumentWalletWebActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            DocumentWalletWebActivity.IAuthTabCallback(this.f$0, (Throwable) obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = DocumentWalletWebActivity.IAuthTabCallback(this.f$0, (Throwable) obj);
        int i3 = onWarmupCompleted + 33;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }
}
