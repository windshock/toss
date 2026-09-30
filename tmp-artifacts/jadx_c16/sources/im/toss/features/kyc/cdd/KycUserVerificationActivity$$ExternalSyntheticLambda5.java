package im.toss.features.kyc.cdd;

import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class KycUserVerificationActivity$$ExternalSyntheticLambda5 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ KycUserVerificationActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(KycUserVerificationActivity.onExtraCallbackWithResult(this.f$0));
        int i4 = IAuthTabCallback + 27;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }
}
