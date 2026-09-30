package im.toss.features.kyc.edd.idcard;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.findResAndMsg;
import o.getBorderRadius;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class KycIdCardSubmitActivity$$ExternalSyntheticLambda8 implements Function2 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ KycIdCardSubmitActivity f$0;
    public final /* synthetic */ findResAndMsg f$1;
    public final /* synthetic */ getBorderRadius f$2;

    public /* synthetic */ KycIdCardSubmitActivity$$ExternalSyntheticLambda8(KycIdCardSubmitActivity kycIdCardSubmitActivity, findResAndMsg findresandmsg, getBorderRadius getborderradius) {
        this.f$0 = kycIdCardSubmitActivity;
        this.f$1 = findresandmsg;
        this.f$2 = getborderradius;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = KycIdCardSubmitActivity.IAuthTabCallback(this.f$0, this.f$1, this.f$2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = onExtraCallback + 21;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
