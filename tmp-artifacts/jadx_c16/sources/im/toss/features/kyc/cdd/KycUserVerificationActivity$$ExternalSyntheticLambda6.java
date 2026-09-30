package im.toss.features.kyc.cdd;

import com.google.android.gms.internal.firebase-auth-api.zzmr;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class KycUserVerificationActivity$$ExternalSyntheticLambda6 implements Function2 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ KycUserVerificationActivity f$0;
    public final /* synthetic */ Lazy f$1;

    public /* synthetic */ KycUserVerificationActivity$$ExternalSyntheticLambda6(KycUserVerificationActivity kycUserVerificationActivity, Lazy lazy) {
        this.f$0 = kycUserVerificationActivity;
        this.f$1 = lazy;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KycUserVerificationActivity kycUserVerificationActivity = this.f$0;
        if (i3 == 0) {
            Object[] objArr = {kycUserVerificationActivity, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
            return (Unit) KycUserVerificationActivity.onNavigationEvent(zzmr.onExtraCallbackWithResult(), -112577035, zzmr.onExtraCallbackWithResult(), objArr, zzmr.onExtraCallbackWithResult(), 112577037, zzmr.onExtraCallbackWithResult());
        }
        Object[] objArr2 = {kycUserVerificationActivity, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
