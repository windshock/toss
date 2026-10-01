package im.toss.features.edoc.wallet;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class DocumentWalletResetActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ DocumentWalletResetActivity f$0;

    public final Object invoke(Object obj) {
        Unit unitOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnWarmupCompleted = DocumentWalletResetActivity.onWarmupCompleted(this.f$0, (SetDetectableSize) obj);
            int i3 = 46 / 0;
        } else {
            unitOnWarmupCompleted = DocumentWalletResetActivity.onWarmupCompleted(this.f$0, (SetDetectableSize) obj);
        }
        int i4 = onWarmupCompleted + 89;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
