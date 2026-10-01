package im.toss.features.kyc.eedd;

import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class KycEeddActivity$$ExternalSyntheticLambda3 implements Function2 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ KycEeddActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KycEeddActivity kycEeddActivity = this.f$0;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (i3 == 0) {
            return KycEeddActivity.onNavigationEvent(kycEeddActivity, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        KycEeddActivity.onNavigationEvent(kycEeddActivity, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
