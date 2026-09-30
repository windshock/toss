package im.toss.components.tuba.distribution;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.UtilsKtExternalSyntheticLambda15;
import o.setOnOutOfMemeryErrorCallback;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TubaDistributionMessageHandler$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ setOnOutOfMemeryErrorCallback f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = UtilsKtExternalSyntheticLambda15.onNavigationEvent(this.f$0, (Boolean) obj);
        int i4 = onWarmupCompleted + 63;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }
}
