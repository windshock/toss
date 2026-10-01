package im.toss.features.mobileid.impl.status;

import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.enableLoopMonitor;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdRenewAddressActivity$$ExternalSyntheticLambda5 implements getBacktraceNote {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ MobileIdRenewAddressActivity f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Unit unitOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnNavigationEvent = MobileIdRenewAddressActivity.onNavigationEvent(this.f$0, (enableLoopMonitor) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i3 = 60 / 0;
        } else {
            unitOnNavigationEvent = MobileIdRenewAddressActivity.onNavigationEvent(this.f$0, (enableLoopMonitor) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        }
        int i4 = onExtraCallback + 33;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 34 / 0;
        }
        return unitOnNavigationEvent;
    }
}
