package im.toss.features.kyc.edd.idcard;

import im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraPresenceProviderExternalSyntheticLambda6;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.findResAndMsg;
import o.getBacktraceNote;
import o.getBorderRadius;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class KycIdCardSubmitActivity$$ExternalSyntheticLambda3 implements getBacktraceNote {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ KycIdCardSubmitActivity f$0;
    public final /* synthetic */ findResAndMsg f$1;
    public final /* synthetic */ getBorderRadius f$2;
    public final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6 f$3;

    public /* synthetic */ KycIdCardSubmitActivity$$ExternalSyntheticLambda3(KycIdCardSubmitActivity kycIdCardSubmitActivity, findResAndMsg findresandmsg, getBorderRadius getborderradius, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        this.f$0 = kycIdCardSubmitActivity;
        this.f$1 = findresandmsg;
        this.f$2 = getborderradius;
        this.f$3 = cameraPresenceProviderExternalSyntheticLambda6;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = {this.f$0, this.f$1, this.f$2, this.f$3, (DeviceQuirksExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
            return (Unit) KycIdCardSubmitActivity.onExtraCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -314223289, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 314223291, objArr);
        }
        Object[] objArr2 = {this.f$0, this.f$1, this.f$2, this.f$3, (DeviceQuirksExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
        Object obj4 = null;
        obj4.hashCode();
        throw null;
    }
}
