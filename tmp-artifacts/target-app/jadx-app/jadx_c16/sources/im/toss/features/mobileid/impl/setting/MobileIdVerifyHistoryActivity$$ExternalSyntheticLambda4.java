package im.toss.features.mobileid.impl.setting;

import java.util.List;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdVerifyHistoryActivity$$ExternalSyntheticLambda4 implements getBacktraceNote {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ List f$0;
    public final /* synthetic */ MobileIdVerifyHistoryActivity f$1;

    public /* synthetic */ MobileIdVerifyHistoryActivity$$ExternalSyntheticLambda4(List list, MobileIdVerifyHistoryActivity mobileIdVerifyHistoryActivity) {
        this.f$0 = list;
        this.f$1 = mobileIdVerifyHistoryActivity;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = MobileIdVerifyHistoryActivity.IAuthTabCallback(this.f$0, this.f$1, (DeviceQuirksExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i4 = onWarmupCompleted + 73;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }
}
