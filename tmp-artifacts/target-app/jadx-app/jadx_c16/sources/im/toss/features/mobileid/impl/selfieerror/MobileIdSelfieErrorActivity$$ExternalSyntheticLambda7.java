package im.toss.features.mobileid.impl.selfieerror;

import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.enableLoopMonitor;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdSelfieErrorActivity$$ExternalSyntheticLambda7 implements getBacktraceNote {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ MobileIdSelfieErrorActivity f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Unit unitOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnNavigationEvent = MobileIdSelfieErrorActivity.onNavigationEvent(this.f$0, (enableLoopMonitor) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i3 = 50 / 0;
        } else {
            unitOnNavigationEvent = MobileIdSelfieErrorActivity.onNavigationEvent(this.f$0, (enableLoopMonitor) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        }
        int i4 = onNavigationEvent + 69;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj4 = null;
        obj4.hashCode();
        throw null;
    }
}
