package im.toss.features.mobileid.impl.view;

import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdCommonErrorFinishActivity$$ExternalSyntheticLambda7 implements getBacktraceNote {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ MobileIdCommonErrorFinishActivity f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        MobileIdCommonErrorFinishActivity mobileIdCommonErrorFinishActivity = this.f$0;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) obj;
        if (i3 != 0) {
            return MobileIdCommonErrorFinishActivity.IAuthTabCallback(mobileIdCommonErrorFinishActivity, deviceQuirksExternalSyntheticLambda0, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        }
        Unit unitIAuthTabCallback = MobileIdCommonErrorFinishActivity.IAuthTabCallback(mobileIdCommonErrorFinishActivity, deviceQuirksExternalSyntheticLambda0, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i4 = 67 / 0;
        return unitIAuthTabCallback;
    }
}
