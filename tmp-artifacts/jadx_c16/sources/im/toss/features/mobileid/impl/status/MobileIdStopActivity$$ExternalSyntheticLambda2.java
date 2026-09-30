package im.toss.features.mobileid.impl.status;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdStopActivity$$ExternalSyntheticLambda2 implements Function2 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ long f$0;
    public final /* synthetic */ MobileIdStopActivity f$1;

    public /* synthetic */ MobileIdStopActivity$$ExternalSyntheticLambda2(long j, MobileIdStopActivity mobileIdStopActivity) {
        this.f$0 = j;
        this.f$1 = mobileIdStopActivity;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return MobileIdStopActivity.onNavigationEvent(this.f$0, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        Unit unitOnNavigationEvent = MobileIdStopActivity.onNavigationEvent(this.f$0, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i3 = 26 / 0;
        return unitOnNavigationEvent;
    }
}
