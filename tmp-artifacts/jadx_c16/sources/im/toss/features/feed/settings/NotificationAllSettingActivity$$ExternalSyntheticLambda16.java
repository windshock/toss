package im.toss.features.feed.settings;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NotificationAllSettingActivity$$ExternalSyntheticLambda16 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ NotificationAllSettingActivity f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ NotificationAllSettingActivity$$ExternalSyntheticLambda16(NotificationAllSettingActivity notificationAllSettingActivity, boolean z) {
        this.f$0 = notificationAllSettingActivity;
        this.f$1 = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        NotificationAllSettingActivity notificationAllSettingActivity = this.f$0;
        boolean z = this.f$1;
        int iIntValue = ((Integer) obj2).intValue();
        Unit unit = (Unit) NotificationAllSettingActivity.onExtraCallback(1807657899, setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{notificationAllSettingActivity, Boolean.valueOf(z), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)}, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), -1807657897, setApTextSize.onNavigationEvent.4.onNavigationEvent());
        int i4 = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
