package im.toss.features.fx;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FxTransferActivity$$ExternalSyntheticLambda6 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ FxTransferActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = FxTransferActivity.onNavigationEvent(this.f$0, (Long) obj);
        int i4 = IAuthTabCallback + 43;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 25 / 0;
        }
        return unitOnNavigationEvent;
    }
}
