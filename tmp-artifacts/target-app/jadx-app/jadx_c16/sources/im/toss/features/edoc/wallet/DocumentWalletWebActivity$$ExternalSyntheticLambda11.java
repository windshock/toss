package im.toss.features.edoc.wallet;

import o.deserializeDecimalCollection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletWebActivity$$ExternalSyntheticLambda11 implements deserializeDecimalCollection {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ DocumentWalletWebActivity f$0;

    public final void run() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        DocumentWalletWebActivity.IAuthTabCallbackDefault(this.f$0);
        if (i3 != 0) {
            throw null;
        }
    }
}
