package im.toss.features.fx;

import kotlin.jvm.functions.Function1;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FxTransferActivity$$ExternalSyntheticLambda15 implements deserializeFloat {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            FxTransferActivity.asBinder(this.f$0, obj);
            int i3 = 40 / 0;
        } else {
            FxTransferActivity.asBinder(this.f$0, obj);
        }
        int i4 = onWarmupCompleted + 71;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
