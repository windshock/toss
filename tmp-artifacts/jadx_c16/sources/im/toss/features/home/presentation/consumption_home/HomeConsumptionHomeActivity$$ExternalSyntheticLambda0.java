package im.toss.features.home.presentation.consumption_home;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeConsumptionHomeActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = HomeConsumptionHomeActivity.onExtraCallbackWithResult((SetDetectableSize) obj);
        int i4 = onWarmupCompleted + 43;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 27 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }
}
