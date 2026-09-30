package im.toss.features.mobileid.impl.edge;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobilePinEdgeHandleActivity$$ExternalSyntheticLambda6 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ MobilePinEdgeHandleActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = MobilePinEdgeHandleActivity.onWarmupCompleted(this.f$0);
        int i4 = IAuthTabCallback + 11;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 89 / 0;
        }
        return unitOnWarmupCompleted;
    }
}
