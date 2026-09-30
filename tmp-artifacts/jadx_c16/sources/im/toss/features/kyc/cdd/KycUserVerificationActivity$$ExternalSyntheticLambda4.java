package im.toss.features.kyc.cdd;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class KycUserVerificationActivity$$ExternalSyntheticLambda4 implements Function0 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ KycUserVerificationActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            KycUserVerificationActivity.onNavigationEvent(this.f$0);
            throw null;
        }
        Unit unitOnNavigationEvent = KycUserVerificationActivity.onNavigationEvent(this.f$0);
        int i3 = onWarmupCompleted + 115;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 40 / 0;
        }
        return unitOnNavigationEvent;
    }
}
