package im.toss.features.fx;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FxApplyDetailActivity$$ExternalSyntheticLambda17 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ FxApplyDetailActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = FxApplyDetailActivity.onExtraCallbackWithResult(this.f$0, (SetDetectableSize) obj);
        if (i3 != 0) {
            int i4 = 34 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }
}
