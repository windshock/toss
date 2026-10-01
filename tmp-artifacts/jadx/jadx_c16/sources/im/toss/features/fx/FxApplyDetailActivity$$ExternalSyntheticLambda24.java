package im.toss.features.fx;

import kotlin.jvm.functions.Function1;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FxApplyDetailActivity$$ExternalSyntheticLambda24 implements deserializeFloat {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 105;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        FxApplyDetailActivity.onWarmupCompleted(this.f$0, obj);
        if (i3 != 0) {
            throw null;
        }
    }
}
