package im.toss.features.fx;

import kotlin.jvm.functions.Function1;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FxTransferActivity$$ExternalSyntheticLambda4 implements deserializeFloat {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            FxTransferActivity.onWarmupCompleted(this.f$0, obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        FxTransferActivity.onWarmupCompleted(this.f$0, obj);
        int i3 = onExtraCallbackWithResult + 107;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
    }
}
