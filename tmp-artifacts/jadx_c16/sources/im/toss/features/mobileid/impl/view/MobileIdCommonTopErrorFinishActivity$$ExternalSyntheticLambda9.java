package im.toss.features.mobileid.impl.view;

import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdCommonTopErrorFinishActivity$$ExternalSyntheticLambda9 implements Function2 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ MobileIdCommonTopErrorFinishActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        MobileIdCommonTopErrorFinishActivity mobileIdCommonTopErrorFinishActivity = this.f$0;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (i3 != 0) {
            return MobileIdCommonTopErrorFinishActivity.onExtraCallback(mobileIdCommonTopErrorFinishActivity, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        MobileIdCommonTopErrorFinishActivity.onExtraCallback(mobileIdCommonTopErrorFinishActivity, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        throw null;
    }
}
