package im.toss.features.mobileid.impl.status;

import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.enableLoopMonitor;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdRenewAddressActivity$$ExternalSyntheticLambda7 implements getBacktraceNote {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ MobileIdRenewAddressActivity f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        MobileIdRenewAddressActivity mobileIdRenewAddressActivity = this.f$0;
        enableLoopMonitor enableloopmonitor = (enableLoopMonitor) obj;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if (i3 != 0) {
            return MobileIdRenewAddressActivity.IAuthTabCallback(mobileIdRenewAddressActivity, enableloopmonitor, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        MobileIdRenewAddressActivity.IAuthTabCallback(mobileIdRenewAddressActivity, enableloopmonitor, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        Object obj4 = null;
        obj4.hashCode();
        throw null;
    }
}
