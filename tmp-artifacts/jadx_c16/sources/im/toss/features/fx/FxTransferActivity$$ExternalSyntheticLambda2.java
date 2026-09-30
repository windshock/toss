package im.toss.features.fx;

import kotlin.jvm.functions.Function1;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FxTransferActivity$$ExternalSyntheticLambda2 implements deserializeFloat {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            FxTransferActivity.IAuthTabCallbackDefault(this.f$0, obj);
            int i3 = 77 / 0;
        } else {
            FxTransferActivity.IAuthTabCallbackDefault(this.f$0, obj);
        }
        int i4 = onWarmupCompleted + 121;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
    }
}
