package im.toss.features.kyc.eedd;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class KycEeddActivity$$ExternalSyntheticLambda2 implements Function2 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ KycEeddActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        Unit unitOnExtraCallback;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnExtraCallback = KycEeddActivity.onExtraCallback(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            int i3 = 76 / 0;
        } else {
            unitOnExtraCallback = KycEeddActivity.onExtraCallback(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        int i4 = onExtraCallbackWithResult + 121;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }
}
