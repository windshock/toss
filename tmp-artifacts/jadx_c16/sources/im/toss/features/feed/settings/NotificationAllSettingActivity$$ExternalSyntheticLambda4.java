package im.toss.features.feed.settings;

import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NotificationAllSettingActivity$$ExternalSyntheticLambda4 implements Function2 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ NotificationAllSettingActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        NotificationAllSettingActivity notificationAllSettingActivity = this.f$0;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (i3 == 0) {
            return NotificationAllSettingActivity.onExtraCallback(notificationAllSettingActivity, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        NotificationAllSettingActivity.onExtraCallback(notificationAllSettingActivity, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        throw null;
    }
}
