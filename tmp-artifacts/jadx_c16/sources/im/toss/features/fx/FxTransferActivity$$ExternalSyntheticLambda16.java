package im.toss.features.fx;

import o.BrickModuleImplExternalSyntheticLambda3;
import o.deserializeDecimalCollection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FxTransferActivity$$ExternalSyntheticLambda16 implements deserializeDecimalCollection {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ BrickModuleImplExternalSyntheticLambda3 f$0;

    public final void run() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            FxTransferActivity.onWarmupCompleted(this.f$0);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        FxTransferActivity.onWarmupCompleted(this.f$0);
        int i3 = onExtraCallback + 87;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }
}
