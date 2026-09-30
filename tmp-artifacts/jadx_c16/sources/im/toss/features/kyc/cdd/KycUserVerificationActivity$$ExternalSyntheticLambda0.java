package im.toss.features.kyc.cdd;

import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class KycUserVerificationActivity$$ExternalSyntheticLambda0 implements Function0 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ KycUserVerificationActivity f$0;
    public final /* synthetic */ Lazy f$1;

    public /* synthetic */ KycUserVerificationActivity$$ExternalSyntheticLambda0(KycUserVerificationActivity kycUserVerificationActivity, Lazy lazy) {
        this.f$0 = kycUserVerificationActivity;
        this.f$1 = lazy;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = KycUserVerificationActivity.onWarmupCompleted(this.f$0, this.f$1);
        int i4 = onExtraCallbackWithResult + 123;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
