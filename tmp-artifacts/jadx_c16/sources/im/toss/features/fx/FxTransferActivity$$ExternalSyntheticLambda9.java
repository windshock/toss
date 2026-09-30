package im.toss.features.fx;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FxTransferActivity$$ExternalSyntheticLambda9 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ FxTransferActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        onExtraCallback = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            FxTransferActivity.onWarmupCompleted(this.f$0, (SetDetectableSize) obj);
            obj2.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = FxTransferActivity.onWarmupCompleted(this.f$0, (SetDetectableSize) obj);
        int i3 = onExtraCallback + 111;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }
}
